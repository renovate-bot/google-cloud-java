/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.networkconnectivity.v1.stub;

import static com.google.cloud.networkconnectivity.v1.PolicyBasedRoutingServiceClient.ListLocationsPagedResponse;
import static com.google.cloud.networkconnectivity.v1.PolicyBasedRoutingServiceClient.ListPolicyBasedRoutesPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.networkconnectivity.v1.CreatePolicyBasedRouteRequest;
import com.google.cloud.networkconnectivity.v1.DeletePolicyBasedRouteRequest;
import com.google.cloud.networkconnectivity.v1.GetPolicyBasedRouteRequest;
import com.google.cloud.networkconnectivity.v1.ListPolicyBasedRoutesRequest;
import com.google.cloud.networkconnectivity.v1.ListPolicyBasedRoutesResponse;
import com.google.cloud.networkconnectivity.v1.OperationMetadata;
import com.google.cloud.networkconnectivity.v1.PolicyBasedRoute;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the PolicyBasedRoutingService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcPolicyBasedRoutingServiceStub extends PolicyBasedRoutingServiceStub {
  private static final MethodDescriptor<ListPolicyBasedRoutesRequest, ListPolicyBasedRoutesResponse>
      listPolicyBasedRoutesMethodDescriptor =
          MethodDescriptor.<ListPolicyBasedRoutesRequest, ListPolicyBasedRoutesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.networkconnectivity.v1.PolicyBasedRoutingService/ListPolicyBasedRoutes")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListPolicyBasedRoutesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListPolicyBasedRoutesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetPolicyBasedRouteRequest, PolicyBasedRoute>
      getPolicyBasedRouteMethodDescriptor =
          MethodDescriptor.<GetPolicyBasedRouteRequest, PolicyBasedRoute>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.networkconnectivity.v1.PolicyBasedRoutingService/GetPolicyBasedRoute")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetPolicyBasedRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(PolicyBasedRoute.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreatePolicyBasedRouteRequest, Operation>
      createPolicyBasedRouteMethodDescriptor =
          MethodDescriptor.<CreatePolicyBasedRouteRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.networkconnectivity.v1.PolicyBasedRoutingService/CreatePolicyBasedRoute")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreatePolicyBasedRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeletePolicyBasedRouteRequest, Operation>
      deletePolicyBasedRouteMethodDescriptor =
          MethodDescriptor.<DeletePolicyBasedRouteRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.networkconnectivity.v1.PolicyBasedRoutingService/DeletePolicyBasedRoute")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeletePolicyBasedRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListLocationsRequest, ListLocationsResponse>
      listLocationsMethodDescriptor =
          MethodDescriptor.<ListLocationsRequest, ListLocationsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.location.Locations/ListLocations")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListLocationsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetLocationRequest, Location> getLocationMethodDescriptor =
      MethodDescriptor.<GetLocationRequest, Location>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.location.Locations/GetLocation")
          .setRequestMarshaller(ProtoUtils.marshaller(GetLocationRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Location.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<SetIamPolicyRequest, Policy> setIamPolicyMethodDescriptor =
      MethodDescriptor.<SetIamPolicyRequest, Policy>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.iam.v1.IAMPolicy/SetIamPolicy")
          .setRequestMarshaller(ProtoUtils.marshaller(SetIamPolicyRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Policy.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<GetIamPolicyRequest, Policy> getIamPolicyMethodDescriptor =
      MethodDescriptor.<GetIamPolicyRequest, Policy>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.iam.v1.IAMPolicy/GetIamPolicy")
          .setRequestMarshaller(ProtoUtils.marshaller(GetIamPolicyRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Policy.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsMethodDescriptor =
          MethodDescriptor.<TestIamPermissionsRequest, TestIamPermissionsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.iam.v1.IAMPolicy/TestIamPermissions")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(TestIamPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(TestIamPermissionsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<ListPolicyBasedRoutesRequest, ListPolicyBasedRoutesResponse>
      listPolicyBasedRoutesCallable;
  private final UnaryCallable<ListPolicyBasedRoutesRequest, ListPolicyBasedRoutesPagedResponse>
      listPolicyBasedRoutesPagedCallable;
  private final UnaryCallable<GetPolicyBasedRouteRequest, PolicyBasedRoute>
      getPolicyBasedRouteCallable;
  private final UnaryCallable<CreatePolicyBasedRouteRequest, Operation>
      createPolicyBasedRouteCallable;
  private final OperationCallable<
          CreatePolicyBasedRouteRequest, PolicyBasedRoute, OperationMetadata>
      createPolicyBasedRouteOperationCallable;
  private final UnaryCallable<DeletePolicyBasedRouteRequest, Operation>
      deletePolicyBasedRouteCallable;
  private final OperationCallable<DeletePolicyBasedRouteRequest, Empty, OperationMetadata>
      deletePolicyBasedRouteOperationCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable;
  private final UnaryCallable<GetLocationRequest, Location> getLocationCallable;
  private final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable;
  private final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable;
  private final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcPolicyBasedRoutingServiceStub create(
      PolicyBasedRoutingServiceStubSettings settings) throws IOException {
    return new GrpcPolicyBasedRoutingServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcPolicyBasedRoutingServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcPolicyBasedRoutingServiceStub(
        PolicyBasedRoutingServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcPolicyBasedRoutingServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcPolicyBasedRoutingServiceStub(
        PolicyBasedRoutingServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcPolicyBasedRoutingServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcPolicyBasedRoutingServiceStub(
      PolicyBasedRoutingServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcPolicyBasedRoutingServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcPolicyBasedRoutingServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcPolicyBasedRoutingServiceStub(
      PolicyBasedRoutingServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<ListPolicyBasedRoutesRequest, ListPolicyBasedRoutesResponse>
        listPolicyBasedRoutesTransportSettings =
            GrpcCallSettings
                .<ListPolicyBasedRoutesRequest, ListPolicyBasedRoutesResponse>newBuilder()
                .setMethodDescriptor(listPolicyBasedRoutesMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<GetPolicyBasedRouteRequest, PolicyBasedRoute>
        getPolicyBasedRouteTransportSettings =
            GrpcCallSettings.<GetPolicyBasedRouteRequest, PolicyBasedRoute>newBuilder()
                .setMethodDescriptor(getPolicyBasedRouteMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<CreatePolicyBasedRouteRequest, Operation>
        createPolicyBasedRouteTransportSettings =
            GrpcCallSettings.<CreatePolicyBasedRouteRequest, Operation>newBuilder()
                .setMethodDescriptor(createPolicyBasedRouteMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<DeletePolicyBasedRouteRequest, Operation>
        deletePolicyBasedRouteTransportSettings =
            GrpcCallSettings.<DeletePolicyBasedRouteRequest, Operation>newBuilder()
                .setMethodDescriptor(deletePolicyBasedRouteMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<ListLocationsRequest, ListLocationsResponse> listLocationsTransportSettings =
        GrpcCallSettings.<ListLocationsRequest, ListLocationsResponse>newBuilder()
            .setMethodDescriptor(listLocationsMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<GetLocationRequest, Location> getLocationTransportSettings =
        GrpcCallSettings.<GetLocationRequest, Location>newBuilder()
            .setMethodDescriptor(getLocationMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<SetIamPolicyRequest, Policy> setIamPolicyTransportSettings =
        GrpcCallSettings.<SetIamPolicyRequest, Policy>newBuilder()
            .setMethodDescriptor(setIamPolicyMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("resource", String.valueOf(request.getResource()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<GetIamPolicyRequest, Policy> getIamPolicyTransportSettings =
        GrpcCallSettings.<GetIamPolicyRequest, Policy>newBuilder()
            .setMethodDescriptor(getIamPolicyMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("resource", String.valueOf(request.getResource()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsTransportSettings =
            GrpcCallSettings.<TestIamPermissionsRequest, TestIamPermissionsResponse>newBuilder()
                .setMethodDescriptor(testIamPermissionsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("resource", String.valueOf(request.getResource()));
                      return builder.build();
                    })
                .build();

    this.listPolicyBasedRoutesCallable =
        callableFactory.createUnaryCallable(
            listPolicyBasedRoutesTransportSettings,
            settings.listPolicyBasedRoutesSettings(),
            clientContext);
    this.listPolicyBasedRoutesPagedCallable =
        callableFactory.createPagedCallable(
            listPolicyBasedRoutesTransportSettings,
            settings.listPolicyBasedRoutesSettings(),
            clientContext);
    this.getPolicyBasedRouteCallable =
        callableFactory.createUnaryCallable(
            getPolicyBasedRouteTransportSettings,
            settings.getPolicyBasedRouteSettings(),
            clientContext);
    this.createPolicyBasedRouteCallable =
        callableFactory.createUnaryCallable(
            createPolicyBasedRouteTransportSettings,
            settings.createPolicyBasedRouteSettings(),
            clientContext);
    this.createPolicyBasedRouteOperationCallable =
        callableFactory.createOperationCallable(
            createPolicyBasedRouteTransportSettings,
            settings.createPolicyBasedRouteOperationSettings(),
            clientContext,
            operationsStub);
    this.deletePolicyBasedRouteCallable =
        callableFactory.createUnaryCallable(
            deletePolicyBasedRouteTransportSettings,
            settings.deletePolicyBasedRouteSettings(),
            clientContext);
    this.deletePolicyBasedRouteOperationCallable =
        callableFactory.createOperationCallable(
            deletePolicyBasedRouteTransportSettings,
            settings.deletePolicyBasedRouteOperationSettings(),
            clientContext,
            operationsStub);
    this.listLocationsCallable =
        callableFactory.createUnaryCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.listLocationsPagedCallable =
        callableFactory.createPagedCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.getLocationCallable =
        callableFactory.createUnaryCallable(
            getLocationTransportSettings, settings.getLocationSettings(), clientContext);
    this.setIamPolicyCallable =
        callableFactory.createUnaryCallable(
            setIamPolicyTransportSettings, settings.setIamPolicySettings(), clientContext);
    this.getIamPolicyCallable =
        callableFactory.createUnaryCallable(
            getIamPolicyTransportSettings, settings.getIamPolicySettings(), clientContext);
    this.testIamPermissionsCallable =
        callableFactory.createUnaryCallable(
            testIamPermissionsTransportSettings,
            settings.testIamPermissionsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<ListPolicyBasedRoutesRequest, ListPolicyBasedRoutesResponse>
      listPolicyBasedRoutesCallable() {
    return listPolicyBasedRoutesCallable;
  }

  @Override
  public UnaryCallable<ListPolicyBasedRoutesRequest, ListPolicyBasedRoutesPagedResponse>
      listPolicyBasedRoutesPagedCallable() {
    return listPolicyBasedRoutesPagedCallable;
  }

  @Override
  public UnaryCallable<GetPolicyBasedRouteRequest, PolicyBasedRoute> getPolicyBasedRouteCallable() {
    return getPolicyBasedRouteCallable;
  }

  @Override
  public UnaryCallable<CreatePolicyBasedRouteRequest, Operation> createPolicyBasedRouteCallable() {
    return createPolicyBasedRouteCallable;
  }

  @Override
  public OperationCallable<CreatePolicyBasedRouteRequest, PolicyBasedRoute, OperationMetadata>
      createPolicyBasedRouteOperationCallable() {
    return createPolicyBasedRouteOperationCallable;
  }

  @Override
  public UnaryCallable<DeletePolicyBasedRouteRequest, Operation> deletePolicyBasedRouteCallable() {
    return deletePolicyBasedRouteCallable;
  }

  @Override
  public OperationCallable<DeletePolicyBasedRouteRequest, Empty, OperationMetadata>
      deletePolicyBasedRouteOperationCallable() {
    return deletePolicyBasedRouteOperationCallable;
  }

  @Override
  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    return listLocationsCallable;
  }

  @Override
  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    return listLocationsPagedCallable;
  }

  @Override
  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return getLocationCallable;
  }

  @Override
  public UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    return setIamPolicyCallable;
  }

  @Override
  public UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    return getIamPolicyCallable;
  }

  @Override
  public UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return testIamPermissionsCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
