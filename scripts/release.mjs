#!/usr/bin/env zx
// Create matching release tags for all distributable packages and push them.
//
// Tag format per package (chosen to match each ecosystem's conventions):
//   go/v<version>     - required `v` prefix for Go modules
//   java/v<version>   - Maven version is the bare version (the `v` is stripped by CI)
//   web/<version>     - npm requires bare semver
//
// Usage:
//   mise run release <version>      e.g.  mise run release 0.2.0
//                                          mise run release v0.2.0  (the `v` is stripped)
//
// Env:
//   REMOTE   git remote to push to (default: origin)
//   DRY_RUN  set to "1" to print actions without creating/pushing tags

// Globals ($, argv, chalk, fs, etc.) are auto-injected by the `zx` CLI.
/* global $, argv */

$.verbose = false;

const args = argv._;
if (args.length < 1) {
  console.error("usage: mise run release <version>");
  console.error("  example: mise run release 0.2.0");
  process.exit(1);
}

const raw = String(args[0]);
const version = raw.replace(/^v/, "");

const semverRe = /^[0-9]+\.[0-9]+\.[0-9]+([.+-][A-Za-z0-9.+-]+)?$/;
if (!semverRe.test(version)) {
  console.error(`version must be semver (e.g. 1.2.3 or 1.2.3-rc1), got: '${raw}'`);
  process.exit(1);
}

const dirty = (await $`git status --porcelain`).stdout.trim();
if (dirty) {
  console.error("working tree must be clean before tagging");
  await $`git status --short`.stdio("inherit", "inherit", "inherit");
  process.exit(1);
}

const tags = {
  go: `go/v${version}`,
  java: `java/v${version}`,
  web: `web/${version}`,
};

for (const tag of Object.values(tags)) {
  const exists = await $`git rev-parse -q --verify refs/tags/${tag}`.nothrow();
  if (exists.exitCode === 0) {
    console.error(`tag already exists: ${tag}`);
    process.exit(1);
  }
}

const remote = process.env.REMOTE || "origin";
const sha = (await $`git rev-parse --short HEAD`).stdout.trim();
const branch = (await $`git rev-parse --abbrev-ref HEAD`).stdout.trim();

console.log(`Creating release tags at ${branch}@${sha}:`);
for (const tag of Object.values(tags)) console.log(`  ${tag}`);

if (process.env.DRY_RUN === "1") {
  console.log(`(dry-run) would tag and push to ${remote}`);
  process.exit(0);
}

for (const tag of Object.values(tags)) {
  await $`git tag -a ${tag} -m ${`Release ${tag}`}`;
}

console.log(`Pushing tags to ${remote}...`);
await $`git push ${remote} ${tags.go} ${tags.java} ${tags.web}`;

console.log("Done.");
