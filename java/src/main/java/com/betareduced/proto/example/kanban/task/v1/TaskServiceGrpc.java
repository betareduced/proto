package com.betareduced.proto.example.kanban.task.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class TaskServiceGrpc {

  private TaskServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "example.kanban.task.v1.TaskService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.betareduced.proto.example.kanban.task.v1.CreateTaskRequest,
      com.betareduced.proto.example.kanban.task.v1.CreateTaskResponse> getCreateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTask",
      requestType = com.betareduced.proto.example.kanban.task.v1.CreateTaskRequest.class,
      responseType = com.betareduced.proto.example.kanban.task.v1.CreateTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.betareduced.proto.example.kanban.task.v1.CreateTaskRequest,
      com.betareduced.proto.example.kanban.task.v1.CreateTaskResponse> getCreateTaskMethod() {
    io.grpc.MethodDescriptor<com.betareduced.proto.example.kanban.task.v1.CreateTaskRequest, com.betareduced.proto.example.kanban.task.v1.CreateTaskResponse> getCreateTaskMethod;
    if ((getCreateTaskMethod = TaskServiceGrpc.getCreateTaskMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getCreateTaskMethod = TaskServiceGrpc.getCreateTaskMethod) == null) {
          TaskServiceGrpc.getCreateTaskMethod = getCreateTaskMethod =
              io.grpc.MethodDescriptor.<com.betareduced.proto.example.kanban.task.v1.CreateTaskRequest, com.betareduced.proto.example.kanban.task.v1.CreateTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betareduced.proto.example.kanban.task.v1.CreateTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betareduced.proto.example.kanban.task.v1.CreateTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("CreateTask"))
              .build();
        }
      }
    }
    return getCreateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.betareduced.proto.example.kanban.task.v1.GetTaskRequest,
      com.betareduced.proto.example.kanban.task.v1.GetTaskResponse> getGetTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTask",
      requestType = com.betareduced.proto.example.kanban.task.v1.GetTaskRequest.class,
      responseType = com.betareduced.proto.example.kanban.task.v1.GetTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.betareduced.proto.example.kanban.task.v1.GetTaskRequest,
      com.betareduced.proto.example.kanban.task.v1.GetTaskResponse> getGetTaskMethod() {
    io.grpc.MethodDescriptor<com.betareduced.proto.example.kanban.task.v1.GetTaskRequest, com.betareduced.proto.example.kanban.task.v1.GetTaskResponse> getGetTaskMethod;
    if ((getGetTaskMethod = TaskServiceGrpc.getGetTaskMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getGetTaskMethod = TaskServiceGrpc.getGetTaskMethod) == null) {
          TaskServiceGrpc.getGetTaskMethod = getGetTaskMethod =
              io.grpc.MethodDescriptor.<com.betareduced.proto.example.kanban.task.v1.GetTaskRequest, com.betareduced.proto.example.kanban.task.v1.GetTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betareduced.proto.example.kanban.task.v1.GetTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betareduced.proto.example.kanban.task.v1.GetTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("GetTask"))
              .build();
        }
      }
    }
    return getGetTaskMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TaskServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskServiceStub>() {
        @java.lang.Override
        public TaskServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskServiceStub(channel, callOptions);
        }
      };
    return TaskServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static TaskServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskServiceBlockingV2Stub>() {
        @java.lang.Override
        public TaskServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return TaskServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TaskServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskServiceBlockingStub>() {
        @java.lang.Override
        public TaskServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskServiceBlockingStub(channel, callOptions);
        }
      };
    return TaskServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TaskServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskServiceFutureStub>() {
        @java.lang.Override
        public TaskServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskServiceFutureStub(channel, callOptions);
        }
      };
    return TaskServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createTask(com.betareduced.proto.example.kanban.task.v1.CreateTaskRequest request,
        io.grpc.stub.StreamObserver<com.betareduced.proto.example.kanban.task.v1.CreateTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTaskMethod(), responseObserver);
    }

    /**
     */
    default void getTask(com.betareduced.proto.example.kanban.task.v1.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.betareduced.proto.example.kanban.task.v1.GetTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTaskMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TaskService.
   */
  public static abstract class TaskServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TaskServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TaskService.
   */
  public static final class TaskServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TaskServiceStub> {
    private TaskServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskServiceStub(channel, callOptions);
    }

    /**
     */
    public void createTask(com.betareduced.proto.example.kanban.task.v1.CreateTaskRequest request,
        io.grpc.stub.StreamObserver<com.betareduced.proto.example.kanban.task.v1.CreateTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTask(com.betareduced.proto.example.kanban.task.v1.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.betareduced.proto.example.kanban.task.v1.GetTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TaskService.
   */
  public static final class TaskServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<TaskServiceBlockingV2Stub> {
    private TaskServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.betareduced.proto.example.kanban.task.v1.CreateTaskResponse createTask(com.betareduced.proto.example.kanban.task.v1.CreateTaskRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.betareduced.proto.example.kanban.task.v1.GetTaskResponse getTask(com.betareduced.proto.example.kanban.task.v1.GetTaskRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetTaskMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service TaskService.
   */
  public static final class TaskServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TaskServiceBlockingStub> {
    private TaskServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.betareduced.proto.example.kanban.task.v1.CreateTaskResponse createTask(com.betareduced.proto.example.kanban.task.v1.CreateTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.betareduced.proto.example.kanban.task.v1.GetTaskResponse getTask(com.betareduced.proto.example.kanban.task.v1.GetTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTaskMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TaskService.
   */
  public static final class TaskServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TaskServiceFutureStub> {
    private TaskServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.betareduced.proto.example.kanban.task.v1.CreateTaskResponse> createTask(
        com.betareduced.proto.example.kanban.task.v1.CreateTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.betareduced.proto.example.kanban.task.v1.GetTaskResponse> getTask(
        com.betareduced.proto.example.kanban.task.v1.GetTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TASK = 0;
  private static final int METHODID_GET_TASK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TASK:
          serviceImpl.createTask((com.betareduced.proto.example.kanban.task.v1.CreateTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.betareduced.proto.example.kanban.task.v1.CreateTaskResponse>) responseObserver);
          break;
        case METHODID_GET_TASK:
          serviceImpl.getTask((com.betareduced.proto.example.kanban.task.v1.GetTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.betareduced.proto.example.kanban.task.v1.GetTaskResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.betareduced.proto.example.kanban.task.v1.CreateTaskRequest,
              com.betareduced.proto.example.kanban.task.v1.CreateTaskResponse>(
                service, METHODID_CREATE_TASK)))
        .addMethod(
          getGetTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.betareduced.proto.example.kanban.task.v1.GetTaskRequest,
              com.betareduced.proto.example.kanban.task.v1.GetTaskResponse>(
                service, METHODID_GET_TASK)))
        .build();
  }

  private static abstract class TaskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TaskServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.betareduced.proto.example.kanban.task.v1.TaskOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TaskService");
    }
  }

  private static final class TaskServiceFileDescriptorSupplier
      extends TaskServiceBaseDescriptorSupplier {
    TaskServiceFileDescriptorSupplier() {}
  }

  private static final class TaskServiceMethodDescriptorSupplier
      extends TaskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TaskServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TaskServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TaskServiceFileDescriptorSupplier())
              .addMethod(getCreateTaskMethod())
              .addMethod(getGetTaskMethod())
              .build();
        }
      }
    }
    return result;
  }
}
