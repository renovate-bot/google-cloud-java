/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.binaryauthorization.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 *
 * <pre>
 * API for working with the system policy.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/binaryauthorization/v1beta1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SystemPolicyV1Beta1Grpc {

  private SystemPolicyV1Beta1Grpc() {}

  public static final java.lang.String SERVICE_NAME =
      "google.cloud.binaryauthorization.v1beta1.SystemPolicyV1Beta1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.binaryauthorization.v1beta1.GetSystemPolicyRequest,
          com.google.cloud.binaryauthorization.v1beta1.Policy>
      getGetSystemPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSystemPolicy",
      requestType = com.google.cloud.binaryauthorization.v1beta1.GetSystemPolicyRequest.class,
      responseType = com.google.cloud.binaryauthorization.v1beta1.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.binaryauthorization.v1beta1.GetSystemPolicyRequest,
          com.google.cloud.binaryauthorization.v1beta1.Policy>
      getGetSystemPolicyMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.binaryauthorization.v1beta1.GetSystemPolicyRequest,
            com.google.cloud.binaryauthorization.v1beta1.Policy>
        getGetSystemPolicyMethod;
    if ((getGetSystemPolicyMethod = SystemPolicyV1Beta1Grpc.getGetSystemPolicyMethod) == null) {
      synchronized (SystemPolicyV1Beta1Grpc.class) {
        if ((getGetSystemPolicyMethod = SystemPolicyV1Beta1Grpc.getGetSystemPolicyMethod) == null) {
          SystemPolicyV1Beta1Grpc.getGetSystemPolicyMethod =
              getGetSystemPolicyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.binaryauthorization.v1beta1.GetSystemPolicyRequest,
                          com.google.cloud.binaryauthorization.v1beta1.Policy>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSystemPolicy"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.binaryauthorization.v1beta1.GetSystemPolicyRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.binaryauthorization.v1beta1.Policy
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new SystemPolicyV1Beta1MethodDescriptorSupplier("GetSystemPolicy"))
                      .build();
        }
      }
    }
    return getGetSystemPolicyMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static SystemPolicyV1Beta1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SystemPolicyV1Beta1Stub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<SystemPolicyV1Beta1Stub>() {
          @java.lang.Override
          public SystemPolicyV1Beta1Stub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SystemPolicyV1Beta1Stub(channel, callOptions);
          }
        };
    return SystemPolicyV1Beta1Stub.newStub(factory, channel);
  }

  /** Creates a new blocking-style stub that supports all types of calls on the service */
  public static SystemPolicyV1Beta1BlockingV2Stub newBlockingV2Stub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SystemPolicyV1Beta1BlockingV2Stub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<SystemPolicyV1Beta1BlockingV2Stub>() {
          @java.lang.Override
          public SystemPolicyV1Beta1BlockingV2Stub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SystemPolicyV1Beta1BlockingV2Stub(channel, callOptions);
          }
        };
    return SystemPolicyV1Beta1BlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SystemPolicyV1Beta1BlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SystemPolicyV1Beta1BlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<SystemPolicyV1Beta1BlockingStub>() {
          @java.lang.Override
          public SystemPolicyV1Beta1BlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SystemPolicyV1Beta1BlockingStub(channel, callOptions);
          }
        };
    return SystemPolicyV1Beta1BlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static SystemPolicyV1Beta1FutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SystemPolicyV1Beta1FutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<SystemPolicyV1Beta1FutureStub>() {
          @java.lang.Override
          public SystemPolicyV1Beta1FutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SystemPolicyV1Beta1FutureStub(channel, callOptions);
          }
        };
    return SystemPolicyV1Beta1FutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * API for working with the system policy.
   * </pre>
   */
  public interface AsyncService {

    /**
     *
     *
     * <pre>
     * Gets the current system policy in the specified location.
     * </pre>
     */
    default void getSystemPolicy(
        com.google.cloud.binaryauthorization.v1beta1.GetSystemPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.binaryauthorization.v1beta1.Policy>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getGetSystemPolicyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SystemPolicyV1Beta1.
   *
   * <pre>
   * API for working with the system policy.
   * </pre>
   */
  public abstract static class SystemPolicyV1Beta1ImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return SystemPolicyV1Beta1Grpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SystemPolicyV1Beta1.
   *
   * <pre>
   * API for working with the system policy.
   * </pre>
   */
  public static final class SystemPolicyV1Beta1Stub
      extends io.grpc.stub.AbstractAsyncStub<SystemPolicyV1Beta1Stub> {
    private SystemPolicyV1Beta1Stub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemPolicyV1Beta1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SystemPolicyV1Beta1Stub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Gets the current system policy in the specified location.
     * </pre>
     */
    public void getSystemPolicy(
        com.google.cloud.binaryauthorization.v1beta1.GetSystemPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.binaryauthorization.v1beta1.Policy>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSystemPolicyMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SystemPolicyV1Beta1.
   *
   * <pre>
   * API for working with the system policy.
   * </pre>
   */
  public static final class SystemPolicyV1Beta1BlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<SystemPolicyV1Beta1BlockingV2Stub> {
    private SystemPolicyV1Beta1BlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemPolicyV1Beta1BlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SystemPolicyV1Beta1BlockingV2Stub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Gets the current system policy in the specified location.
     * </pre>
     */
    public com.google.cloud.binaryauthorization.v1beta1.Policy getSystemPolicy(
        com.google.cloud.binaryauthorization.v1beta1.GetSystemPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSystemPolicyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service SystemPolicyV1Beta1.
   *
   * <pre>
   * API for working with the system policy.
   * </pre>
   */
  public static final class SystemPolicyV1Beta1BlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SystemPolicyV1Beta1BlockingStub> {
    private SystemPolicyV1Beta1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemPolicyV1Beta1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SystemPolicyV1Beta1BlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Gets the current system policy in the specified location.
     * </pre>
     */
    public com.google.cloud.binaryauthorization.v1beta1.Policy getSystemPolicy(
        com.google.cloud.binaryauthorization.v1beta1.GetSystemPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSystemPolicyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SystemPolicyV1Beta1.
   *
   * <pre>
   * API for working with the system policy.
   * </pre>
   */
  public static final class SystemPolicyV1Beta1FutureStub
      extends io.grpc.stub.AbstractFutureStub<SystemPolicyV1Beta1FutureStub> {
    private SystemPolicyV1Beta1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemPolicyV1Beta1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SystemPolicyV1Beta1FutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Gets the current system policy in the specified location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.binaryauthorization.v1beta1.Policy>
        getSystemPolicy(
            com.google.cloud.binaryauthorization.v1beta1.GetSystemPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSystemPolicyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SYSTEM_POLICY = 0;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
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
        case METHODID_GET_SYSTEM_POLICY:
          serviceImpl.getSystemPolicy(
              (com.google.cloud.binaryauthorization.v1beta1.GetSystemPolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.binaryauthorization.v1beta1.Policy>)
                  responseObserver);
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
            getGetSystemPolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.binaryauthorization.v1beta1.GetSystemPolicyRequest,
                    com.google.cloud.binaryauthorization.v1beta1.Policy>(
                    service, METHODID_GET_SYSTEM_POLICY)))
        .build();
  }

  private abstract static class SystemPolicyV1Beta1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SystemPolicyV1Beta1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.binaryauthorization.v1beta1.BinaryAuthorizationServiceProto
          .getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SystemPolicyV1Beta1");
    }
  }

  private static final class SystemPolicyV1Beta1FileDescriptorSupplier
      extends SystemPolicyV1Beta1BaseDescriptorSupplier {
    SystemPolicyV1Beta1FileDescriptorSupplier() {}
  }

  private static final class SystemPolicyV1Beta1MethodDescriptorSupplier
      extends SystemPolicyV1Beta1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SystemPolicyV1Beta1MethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SystemPolicyV1Beta1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new SystemPolicyV1Beta1FileDescriptorSupplier())
                      .addMethod(getGetSystemPolicyMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
