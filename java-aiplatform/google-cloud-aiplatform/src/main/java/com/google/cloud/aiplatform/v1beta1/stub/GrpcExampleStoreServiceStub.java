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

package com.google.cloud.aiplatform.v1beta1.stub;

import static com.google.cloud.aiplatform.v1beta1.ExampleStoreServiceClient.FetchExamplesPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.ExampleStoreServiceClient.ListExampleStoresPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.ExampleStoreServiceClient.ListLocationsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.aiplatform.v1beta1.CreateExampleStoreOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.CreateExampleStoreRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteExampleStoreOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.DeleteExampleStoreRequest;
import com.google.cloud.aiplatform.v1beta1.ExampleStore;
import com.google.cloud.aiplatform.v1beta1.FetchExamplesRequest;
import com.google.cloud.aiplatform.v1beta1.FetchExamplesResponse;
import com.google.cloud.aiplatform.v1beta1.GetExampleStoreRequest;
import com.google.cloud.aiplatform.v1beta1.ListExampleStoresRequest;
import com.google.cloud.aiplatform.v1beta1.ListExampleStoresResponse;
import com.google.cloud.aiplatform.v1beta1.RemoveExamplesRequest;
import com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse;
import com.google.cloud.aiplatform.v1beta1.SearchExamplesRequest;
import com.google.cloud.aiplatform.v1beta1.SearchExamplesResponse;
import com.google.cloud.aiplatform.v1beta1.UpdateExampleStoreOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.UpdateExampleStoreRequest;
import com.google.cloud.aiplatform.v1beta1.UpsertExamplesRequest;
import com.google.cloud.aiplatform.v1beta1.UpsertExamplesResponse;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
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
 * gRPC stub implementation for the ExampleStoreService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class GrpcExampleStoreServiceStub extends ExampleStoreServiceStub {
  private static final MethodDescriptor<CreateExampleStoreRequest, Operation>
      createExampleStoreMethodDescriptor =
          MethodDescriptor.<CreateExampleStoreRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.ExampleStoreService/CreateExampleStore")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateExampleStoreRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetExampleStoreRequest, ExampleStore>
      getExampleStoreMethodDescriptor =
          MethodDescriptor.<GetExampleStoreRequest, ExampleStore>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.ExampleStoreService/GetExampleStore")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetExampleStoreRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(ExampleStore.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateExampleStoreRequest, Operation>
      updateExampleStoreMethodDescriptor =
          MethodDescriptor.<UpdateExampleStoreRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.ExampleStoreService/UpdateExampleStore")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateExampleStoreRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteExampleStoreRequest, Operation>
      deleteExampleStoreMethodDescriptor =
          MethodDescriptor.<DeleteExampleStoreRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.ExampleStoreService/DeleteExampleStore")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteExampleStoreRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListExampleStoresRequest, ListExampleStoresResponse>
      listExampleStoresMethodDescriptor =
          MethodDescriptor.<ListExampleStoresRequest, ListExampleStoresResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.ExampleStoreService/ListExampleStores")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListExampleStoresRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListExampleStoresResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpsertExamplesRequest, UpsertExamplesResponse>
      upsertExamplesMethodDescriptor =
          MethodDescriptor.<UpsertExamplesRequest, UpsertExamplesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.ExampleStoreService/UpsertExamples")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpsertExamplesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(UpsertExamplesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<RemoveExamplesRequest, RemoveExamplesResponse>
      removeExamplesMethodDescriptor =
          MethodDescriptor.<RemoveExamplesRequest, RemoveExamplesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.ExampleStoreService/RemoveExamples")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(RemoveExamplesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(RemoveExamplesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<SearchExamplesRequest, SearchExamplesResponse>
      searchExamplesMethodDescriptor =
          MethodDescriptor.<SearchExamplesRequest, SearchExamplesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.ExampleStoreService/SearchExamples")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SearchExamplesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SearchExamplesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<FetchExamplesRequest, FetchExamplesResponse>
      fetchExamplesMethodDescriptor =
          MethodDescriptor.<FetchExamplesRequest, FetchExamplesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.aiplatform.v1beta1.ExampleStoreService/FetchExamples")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(FetchExamplesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(FetchExamplesResponse.getDefaultInstance()))
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

  private final UnaryCallable<CreateExampleStoreRequest, Operation> createExampleStoreCallable;
  private final OperationCallable<
          CreateExampleStoreRequest, ExampleStore, CreateExampleStoreOperationMetadata>
      createExampleStoreOperationCallable;
  private final UnaryCallable<GetExampleStoreRequest, ExampleStore> getExampleStoreCallable;
  private final UnaryCallable<UpdateExampleStoreRequest, Operation> updateExampleStoreCallable;
  private final OperationCallable<
          UpdateExampleStoreRequest, ExampleStore, UpdateExampleStoreOperationMetadata>
      updateExampleStoreOperationCallable;
  private final UnaryCallable<DeleteExampleStoreRequest, Operation> deleteExampleStoreCallable;
  private final OperationCallable<
          DeleteExampleStoreRequest, Empty, DeleteExampleStoreOperationMetadata>
      deleteExampleStoreOperationCallable;
  private final UnaryCallable<ListExampleStoresRequest, ListExampleStoresResponse>
      listExampleStoresCallable;
  private final UnaryCallable<ListExampleStoresRequest, ListExampleStoresPagedResponse>
      listExampleStoresPagedCallable;
  private final UnaryCallable<UpsertExamplesRequest, UpsertExamplesResponse> upsertExamplesCallable;
  private final UnaryCallable<RemoveExamplesRequest, RemoveExamplesResponse> removeExamplesCallable;
  private final UnaryCallable<SearchExamplesRequest, SearchExamplesResponse> searchExamplesCallable;
  private final UnaryCallable<FetchExamplesRequest, FetchExamplesResponse> fetchExamplesCallable;
  private final UnaryCallable<FetchExamplesRequest, FetchExamplesPagedResponse>
      fetchExamplesPagedCallable;
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

  public static final GrpcExampleStoreServiceStub create(ExampleStoreServiceStubSettings settings)
      throws IOException {
    return new GrpcExampleStoreServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcExampleStoreServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcExampleStoreServiceStub(
        ExampleStoreServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcExampleStoreServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcExampleStoreServiceStub(
        ExampleStoreServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcExampleStoreServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcExampleStoreServiceStub(
      ExampleStoreServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcExampleStoreServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcExampleStoreServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcExampleStoreServiceStub(
      ExampleStoreServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<CreateExampleStoreRequest, Operation> createExampleStoreTransportSettings =
        GrpcCallSettings.<CreateExampleStoreRequest, Operation>newBuilder()
            .setMethodDescriptor(createExampleStoreMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<GetExampleStoreRequest, ExampleStore> getExampleStoreTransportSettings =
        GrpcCallSettings.<GetExampleStoreRequest, ExampleStore>newBuilder()
            .setMethodDescriptor(getExampleStoreMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<UpdateExampleStoreRequest, Operation> updateExampleStoreTransportSettings =
        GrpcCallSettings.<UpdateExampleStoreRequest, Operation>newBuilder()
            .setMethodDescriptor(updateExampleStoreMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add(
                      "example_store.name", String.valueOf(request.getExampleStore().getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<DeleteExampleStoreRequest, Operation> deleteExampleStoreTransportSettings =
        GrpcCallSettings.<DeleteExampleStoreRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteExampleStoreMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<ListExampleStoresRequest, ListExampleStoresResponse>
        listExampleStoresTransportSettings =
            GrpcCallSettings.<ListExampleStoresRequest, ListExampleStoresResponse>newBuilder()
                .setMethodDescriptor(listExampleStoresMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<UpsertExamplesRequest, UpsertExamplesResponse>
        upsertExamplesTransportSettings =
            GrpcCallSettings.<UpsertExamplesRequest, UpsertExamplesResponse>newBuilder()
                .setMethodDescriptor(upsertExamplesMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("example_store", String.valueOf(request.getExampleStore()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<RemoveExamplesRequest, RemoveExamplesResponse>
        removeExamplesTransportSettings =
            GrpcCallSettings.<RemoveExamplesRequest, RemoveExamplesResponse>newBuilder()
                .setMethodDescriptor(removeExamplesMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("example_store", String.valueOf(request.getExampleStore()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<SearchExamplesRequest, SearchExamplesResponse>
        searchExamplesTransportSettings =
            GrpcCallSettings.<SearchExamplesRequest, SearchExamplesResponse>newBuilder()
                .setMethodDescriptor(searchExamplesMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("example_store", String.valueOf(request.getExampleStore()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<FetchExamplesRequest, FetchExamplesResponse> fetchExamplesTransportSettings =
        GrpcCallSettings.<FetchExamplesRequest, FetchExamplesResponse>newBuilder()
            .setMethodDescriptor(fetchExamplesMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("example_store", String.valueOf(request.getExampleStore()));
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

    this.createExampleStoreCallable =
        callableFactory.createUnaryCallable(
            createExampleStoreTransportSettings,
            settings.createExampleStoreSettings(),
            clientContext);
    this.createExampleStoreOperationCallable =
        callableFactory.createOperationCallable(
            createExampleStoreTransportSettings,
            settings.createExampleStoreOperationSettings(),
            clientContext,
            operationsStub);
    this.getExampleStoreCallable =
        callableFactory.createUnaryCallable(
            getExampleStoreTransportSettings, settings.getExampleStoreSettings(), clientContext);
    this.updateExampleStoreCallable =
        callableFactory.createUnaryCallable(
            updateExampleStoreTransportSettings,
            settings.updateExampleStoreSettings(),
            clientContext);
    this.updateExampleStoreOperationCallable =
        callableFactory.createOperationCallable(
            updateExampleStoreTransportSettings,
            settings.updateExampleStoreOperationSettings(),
            clientContext,
            operationsStub);
    this.deleteExampleStoreCallable =
        callableFactory.createUnaryCallable(
            deleteExampleStoreTransportSettings,
            settings.deleteExampleStoreSettings(),
            clientContext);
    this.deleteExampleStoreOperationCallable =
        callableFactory.createOperationCallable(
            deleteExampleStoreTransportSettings,
            settings.deleteExampleStoreOperationSettings(),
            clientContext,
            operationsStub);
    this.listExampleStoresCallable =
        callableFactory.createUnaryCallable(
            listExampleStoresTransportSettings,
            settings.listExampleStoresSettings(),
            clientContext);
    this.listExampleStoresPagedCallable =
        callableFactory.createPagedCallable(
            listExampleStoresTransportSettings,
            settings.listExampleStoresSettings(),
            clientContext);
    this.upsertExamplesCallable =
        callableFactory.createUnaryCallable(
            upsertExamplesTransportSettings, settings.upsertExamplesSettings(), clientContext);
    this.removeExamplesCallable =
        callableFactory.createUnaryCallable(
            removeExamplesTransportSettings, settings.removeExamplesSettings(), clientContext);
    this.searchExamplesCallable =
        callableFactory.createUnaryCallable(
            searchExamplesTransportSettings, settings.searchExamplesSettings(), clientContext);
    this.fetchExamplesCallable =
        callableFactory.createUnaryCallable(
            fetchExamplesTransportSettings, settings.fetchExamplesSettings(), clientContext);
    this.fetchExamplesPagedCallable =
        callableFactory.createPagedCallable(
            fetchExamplesTransportSettings, settings.fetchExamplesSettings(), clientContext);
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
  public UnaryCallable<CreateExampleStoreRequest, Operation> createExampleStoreCallable() {
    return createExampleStoreCallable;
  }

  @Override
  public OperationCallable<
          CreateExampleStoreRequest, ExampleStore, CreateExampleStoreOperationMetadata>
      createExampleStoreOperationCallable() {
    return createExampleStoreOperationCallable;
  }

  @Override
  public UnaryCallable<GetExampleStoreRequest, ExampleStore> getExampleStoreCallable() {
    return getExampleStoreCallable;
  }

  @Override
  public UnaryCallable<UpdateExampleStoreRequest, Operation> updateExampleStoreCallable() {
    return updateExampleStoreCallable;
  }

  @Override
  public OperationCallable<
          UpdateExampleStoreRequest, ExampleStore, UpdateExampleStoreOperationMetadata>
      updateExampleStoreOperationCallable() {
    return updateExampleStoreOperationCallable;
  }

  @Override
  public UnaryCallable<DeleteExampleStoreRequest, Operation> deleteExampleStoreCallable() {
    return deleteExampleStoreCallable;
  }

  @Override
  public OperationCallable<DeleteExampleStoreRequest, Empty, DeleteExampleStoreOperationMetadata>
      deleteExampleStoreOperationCallable() {
    return deleteExampleStoreOperationCallable;
  }

  @Override
  public UnaryCallable<ListExampleStoresRequest, ListExampleStoresResponse>
      listExampleStoresCallable() {
    return listExampleStoresCallable;
  }

  @Override
  public UnaryCallable<ListExampleStoresRequest, ListExampleStoresPagedResponse>
      listExampleStoresPagedCallable() {
    return listExampleStoresPagedCallable;
  }

  @Override
  public UnaryCallable<UpsertExamplesRequest, UpsertExamplesResponse> upsertExamplesCallable() {
    return upsertExamplesCallable;
  }

  @Override
  public UnaryCallable<RemoveExamplesRequest, RemoveExamplesResponse> removeExamplesCallable() {
    return removeExamplesCallable;
  }

  @Override
  public UnaryCallable<SearchExamplesRequest, SearchExamplesResponse> searchExamplesCallable() {
    return searchExamplesCallable;
  }

  @Override
  public UnaryCallable<FetchExamplesRequest, FetchExamplesResponse> fetchExamplesCallable() {
    return fetchExamplesCallable;
  }

  @Override
  public UnaryCallable<FetchExamplesRequest, FetchExamplesPagedResponse>
      fetchExamplesPagedCallable() {
    return fetchExamplesPagedCallable;
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
