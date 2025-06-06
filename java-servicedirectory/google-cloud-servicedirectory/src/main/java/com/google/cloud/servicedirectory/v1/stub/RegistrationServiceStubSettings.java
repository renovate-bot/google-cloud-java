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

package com.google.cloud.servicedirectory.v1.stub;

import static com.google.cloud.servicedirectory.v1.RegistrationServiceClient.ListEndpointsPagedResponse;
import static com.google.cloud.servicedirectory.v1.RegistrationServiceClient.ListLocationsPagedResponse;
import static com.google.cloud.servicedirectory.v1.RegistrationServiceClient.ListNamespacesPagedResponse;
import static com.google.cloud.servicedirectory.v1.RegistrationServiceClient.ListServicesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.core.ObsoleteApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.servicedirectory.v1.CreateEndpointRequest;
import com.google.cloud.servicedirectory.v1.CreateNamespaceRequest;
import com.google.cloud.servicedirectory.v1.CreateServiceRequest;
import com.google.cloud.servicedirectory.v1.DeleteEndpointRequest;
import com.google.cloud.servicedirectory.v1.DeleteNamespaceRequest;
import com.google.cloud.servicedirectory.v1.DeleteServiceRequest;
import com.google.cloud.servicedirectory.v1.Endpoint;
import com.google.cloud.servicedirectory.v1.GetEndpointRequest;
import com.google.cloud.servicedirectory.v1.GetNamespaceRequest;
import com.google.cloud.servicedirectory.v1.GetServiceRequest;
import com.google.cloud.servicedirectory.v1.ListEndpointsRequest;
import com.google.cloud.servicedirectory.v1.ListEndpointsResponse;
import com.google.cloud.servicedirectory.v1.ListNamespacesRequest;
import com.google.cloud.servicedirectory.v1.ListNamespacesResponse;
import com.google.cloud.servicedirectory.v1.ListServicesRequest;
import com.google.cloud.servicedirectory.v1.ListServicesResponse;
import com.google.cloud.servicedirectory.v1.Namespace;
import com.google.cloud.servicedirectory.v1.Service;
import com.google.cloud.servicedirectory.v1.UpdateEndpointRequest;
import com.google.cloud.servicedirectory.v1.UpdateNamespaceRequest;
import com.google.cloud.servicedirectory.v1.UpdateServiceRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link RegistrationServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (servicedirectory.googleapis.com) and default port (443) are
 *       used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of createNamespace:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * RegistrationServiceStubSettings.Builder registrationServiceSettingsBuilder =
 *     RegistrationServiceStubSettings.newBuilder();
 * registrationServiceSettingsBuilder
 *     .createNamespaceSettings()
 *     .setRetrySettings(
 *         registrationServiceSettingsBuilder
 *             .createNamespaceSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofSeconds(1))
 *             .setInitialRpcTimeoutDuration(Duration.ofSeconds(5))
 *             .setMaxAttempts(5)
 *             .setMaxRetryDelayDuration(Duration.ofSeconds(30))
 *             .setMaxRpcTimeoutDuration(Duration.ofSeconds(60))
 *             .setRetryDelayMultiplier(1.3)
 *             .setRpcTimeoutMultiplier(1.5)
 *             .setTotalTimeoutDuration(Duration.ofSeconds(300))
 *             .build());
 * RegistrationServiceStubSettings registrationServiceSettings =
 *     registrationServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@Generated("by gapic-generator-java")
public class RegistrationServiceStubSettings extends StubSettings<RegistrationServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<CreateNamespaceRequest, Namespace> createNamespaceSettings;
  private final PagedCallSettings<
          ListNamespacesRequest, ListNamespacesResponse, ListNamespacesPagedResponse>
      listNamespacesSettings;
  private final UnaryCallSettings<GetNamespaceRequest, Namespace> getNamespaceSettings;
  private final UnaryCallSettings<UpdateNamespaceRequest, Namespace> updateNamespaceSettings;
  private final UnaryCallSettings<DeleteNamespaceRequest, Empty> deleteNamespaceSettings;
  private final UnaryCallSettings<CreateServiceRequest, Service> createServiceSettings;
  private final PagedCallSettings<
          ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>
      listServicesSettings;
  private final UnaryCallSettings<GetServiceRequest, Service> getServiceSettings;
  private final UnaryCallSettings<UpdateServiceRequest, Service> updateServiceSettings;
  private final UnaryCallSettings<DeleteServiceRequest, Empty> deleteServiceSettings;
  private final UnaryCallSettings<CreateEndpointRequest, Endpoint> createEndpointSettings;
  private final PagedCallSettings<
          ListEndpointsRequest, ListEndpointsResponse, ListEndpointsPagedResponse>
      listEndpointsSettings;
  private final UnaryCallSettings<GetEndpointRequest, Endpoint> getEndpointSettings;
  private final UnaryCallSettings<UpdateEndpointRequest, Endpoint> updateEndpointSettings;
  private final UnaryCallSettings<DeleteEndpointRequest, Empty> deleteEndpointSettings;
  private final UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings;
  private final UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings;
  private final UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings;
  private final PagedCallSettings<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings;
  private final UnaryCallSettings<GetLocationRequest, Location> getLocationSettings;

  private static final PagedListDescriptor<ListNamespacesRequest, ListNamespacesResponse, Namespace>
      LIST_NAMESPACES_PAGE_STR_DESC =
          new PagedListDescriptor<ListNamespacesRequest, ListNamespacesResponse, Namespace>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListNamespacesRequest injectToken(ListNamespacesRequest payload, String token) {
              return ListNamespacesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListNamespacesRequest injectPageSize(
                ListNamespacesRequest payload, int pageSize) {
              return ListNamespacesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListNamespacesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListNamespacesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Namespace> extractResources(ListNamespacesResponse payload) {
              return payload.getNamespacesList();
            }
          };

  private static final PagedListDescriptor<ListServicesRequest, ListServicesResponse, Service>
      LIST_SERVICES_PAGE_STR_DESC =
          new PagedListDescriptor<ListServicesRequest, ListServicesResponse, Service>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListServicesRequest injectToken(ListServicesRequest payload, String token) {
              return ListServicesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListServicesRequest injectPageSize(ListServicesRequest payload, int pageSize) {
              return ListServicesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListServicesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListServicesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Service> extractResources(ListServicesResponse payload) {
              return payload.getServicesList();
            }
          };

  private static final PagedListDescriptor<ListEndpointsRequest, ListEndpointsResponse, Endpoint>
      LIST_ENDPOINTS_PAGE_STR_DESC =
          new PagedListDescriptor<ListEndpointsRequest, ListEndpointsResponse, Endpoint>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListEndpointsRequest injectToken(ListEndpointsRequest payload, String token) {
              return ListEndpointsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListEndpointsRequest injectPageSize(ListEndpointsRequest payload, int pageSize) {
              return ListEndpointsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListEndpointsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListEndpointsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Endpoint> extractResources(ListEndpointsResponse payload) {
              return payload.getEndpointsList();
            }
          };

  private static final PagedListDescriptor<ListLocationsRequest, ListLocationsResponse, Location>
      LIST_LOCATIONS_PAGE_STR_DESC =
          new PagedListDescriptor<ListLocationsRequest, ListLocationsResponse, Location>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListLocationsRequest injectToken(ListLocationsRequest payload, String token) {
              return ListLocationsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListLocationsRequest injectPageSize(ListLocationsRequest payload, int pageSize) {
              return ListLocationsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListLocationsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListLocationsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Location> extractResources(ListLocationsResponse payload) {
              return payload.getLocationsList();
            }
          };

  private static final PagedListResponseFactory<
          ListNamespacesRequest, ListNamespacesResponse, ListNamespacesPagedResponse>
      LIST_NAMESPACES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListNamespacesRequest, ListNamespacesResponse, ListNamespacesPagedResponse>() {
            @Override
            public ApiFuture<ListNamespacesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListNamespacesRequest, ListNamespacesResponse> callable,
                ListNamespacesRequest request,
                ApiCallContext context,
                ApiFuture<ListNamespacesResponse> futureResponse) {
              PageContext<ListNamespacesRequest, ListNamespacesResponse, Namespace> pageContext =
                  PageContext.create(callable, LIST_NAMESPACES_PAGE_STR_DESC, request, context);
              return ListNamespacesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>
      LIST_SERVICES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>() {
            @Override
            public ApiFuture<ListServicesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListServicesRequest, ListServicesResponse> callable,
                ListServicesRequest request,
                ApiCallContext context,
                ApiFuture<ListServicesResponse> futureResponse) {
              PageContext<ListServicesRequest, ListServicesResponse, Service> pageContext =
                  PageContext.create(callable, LIST_SERVICES_PAGE_STR_DESC, request, context);
              return ListServicesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListEndpointsRequest, ListEndpointsResponse, ListEndpointsPagedResponse>
      LIST_ENDPOINTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListEndpointsRequest, ListEndpointsResponse, ListEndpointsPagedResponse>() {
            @Override
            public ApiFuture<ListEndpointsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListEndpointsRequest, ListEndpointsResponse> callable,
                ListEndpointsRequest request,
                ApiCallContext context,
                ApiFuture<ListEndpointsResponse> futureResponse) {
              PageContext<ListEndpointsRequest, ListEndpointsResponse, Endpoint> pageContext =
                  PageContext.create(callable, LIST_ENDPOINTS_PAGE_STR_DESC, request, context);
              return ListEndpointsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      LIST_LOCATIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>() {
            @Override
            public ApiFuture<ListLocationsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListLocationsRequest, ListLocationsResponse> callable,
                ListLocationsRequest request,
                ApiCallContext context,
                ApiFuture<ListLocationsResponse> futureResponse) {
              PageContext<ListLocationsRequest, ListLocationsResponse, Location> pageContext =
                  PageContext.create(callable, LIST_LOCATIONS_PAGE_STR_DESC, request, context);
              return ListLocationsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to createNamespace. */
  public UnaryCallSettings<CreateNamespaceRequest, Namespace> createNamespaceSettings() {
    return createNamespaceSettings;
  }

  /** Returns the object with the settings used for calls to listNamespaces. */
  public PagedCallSettings<
          ListNamespacesRequest, ListNamespacesResponse, ListNamespacesPagedResponse>
      listNamespacesSettings() {
    return listNamespacesSettings;
  }

  /** Returns the object with the settings used for calls to getNamespace. */
  public UnaryCallSettings<GetNamespaceRequest, Namespace> getNamespaceSettings() {
    return getNamespaceSettings;
  }

  /** Returns the object with the settings used for calls to updateNamespace. */
  public UnaryCallSettings<UpdateNamespaceRequest, Namespace> updateNamespaceSettings() {
    return updateNamespaceSettings;
  }

  /** Returns the object with the settings used for calls to deleteNamespace. */
  public UnaryCallSettings<DeleteNamespaceRequest, Empty> deleteNamespaceSettings() {
    return deleteNamespaceSettings;
  }

  /** Returns the object with the settings used for calls to createService. */
  public UnaryCallSettings<CreateServiceRequest, Service> createServiceSettings() {
    return createServiceSettings;
  }

  /** Returns the object with the settings used for calls to listServices. */
  public PagedCallSettings<ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>
      listServicesSettings() {
    return listServicesSettings;
  }

  /** Returns the object with the settings used for calls to getService. */
  public UnaryCallSettings<GetServiceRequest, Service> getServiceSettings() {
    return getServiceSettings;
  }

  /** Returns the object with the settings used for calls to updateService. */
  public UnaryCallSettings<UpdateServiceRequest, Service> updateServiceSettings() {
    return updateServiceSettings;
  }

  /** Returns the object with the settings used for calls to deleteService. */
  public UnaryCallSettings<DeleteServiceRequest, Empty> deleteServiceSettings() {
    return deleteServiceSettings;
  }

  /** Returns the object with the settings used for calls to createEndpoint. */
  public UnaryCallSettings<CreateEndpointRequest, Endpoint> createEndpointSettings() {
    return createEndpointSettings;
  }

  /** Returns the object with the settings used for calls to listEndpoints. */
  public PagedCallSettings<ListEndpointsRequest, ListEndpointsResponse, ListEndpointsPagedResponse>
      listEndpointsSettings() {
    return listEndpointsSettings;
  }

  /** Returns the object with the settings used for calls to getEndpoint. */
  public UnaryCallSettings<GetEndpointRequest, Endpoint> getEndpointSettings() {
    return getEndpointSettings;
  }

  /** Returns the object with the settings used for calls to updateEndpoint. */
  public UnaryCallSettings<UpdateEndpointRequest, Endpoint> updateEndpointSettings() {
    return updateEndpointSettings;
  }

  /** Returns the object with the settings used for calls to deleteEndpoint. */
  public UnaryCallSettings<DeleteEndpointRequest, Empty> deleteEndpointSettings() {
    return deleteEndpointSettings;
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return getIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return setIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return testIamPermissionsSettings;
  }

  /** Returns the object with the settings used for calls to listLocations. */
  public PagedCallSettings<ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings() {
    return listLocationsSettings;
  }

  /** Returns the object with the settings used for calls to getLocation. */
  public UnaryCallSettings<GetLocationRequest, Location> getLocationSettings() {
    return getLocationSettings;
  }

  public RegistrationServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcRegistrationServiceStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonRegistrationServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "servicedirectory";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "servicedirectory.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "servicedirectory.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  public static ApiClientHeaderProvider.Builder defaultGrpcApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(RegistrationServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(RegistrationServiceStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return RegistrationServiceStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
  }

  /** Returns a new gRPC builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new REST builder for this class. */
  public static Builder newHttpJsonBuilder() {
    return Builder.createHttpJsonDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected RegistrationServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createNamespaceSettings = settingsBuilder.createNamespaceSettings().build();
    listNamespacesSettings = settingsBuilder.listNamespacesSettings().build();
    getNamespaceSettings = settingsBuilder.getNamespaceSettings().build();
    updateNamespaceSettings = settingsBuilder.updateNamespaceSettings().build();
    deleteNamespaceSettings = settingsBuilder.deleteNamespaceSettings().build();
    createServiceSettings = settingsBuilder.createServiceSettings().build();
    listServicesSettings = settingsBuilder.listServicesSettings().build();
    getServiceSettings = settingsBuilder.getServiceSettings().build();
    updateServiceSettings = settingsBuilder.updateServiceSettings().build();
    deleteServiceSettings = settingsBuilder.deleteServiceSettings().build();
    createEndpointSettings = settingsBuilder.createEndpointSettings().build();
    listEndpointsSettings = settingsBuilder.listEndpointsSettings().build();
    getEndpointSettings = settingsBuilder.getEndpointSettings().build();
    updateEndpointSettings = settingsBuilder.updateEndpointSettings().build();
    deleteEndpointSettings = settingsBuilder.deleteEndpointSettings().build();
    getIamPolicySettings = settingsBuilder.getIamPolicySettings().build();
    setIamPolicySettings = settingsBuilder.setIamPolicySettings().build();
    testIamPermissionsSettings = settingsBuilder.testIamPermissionsSettings().build();
    listLocationsSettings = settingsBuilder.listLocationsSettings().build();
    getLocationSettings = settingsBuilder.getLocationSettings().build();
  }

  /** Builder for RegistrationServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<RegistrationServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateNamespaceRequest, Namespace>
        createNamespaceSettings;
    private final PagedCallSettings.Builder<
            ListNamespacesRequest, ListNamespacesResponse, ListNamespacesPagedResponse>
        listNamespacesSettings;
    private final UnaryCallSettings.Builder<GetNamespaceRequest, Namespace> getNamespaceSettings;
    private final UnaryCallSettings.Builder<UpdateNamespaceRequest, Namespace>
        updateNamespaceSettings;
    private final UnaryCallSettings.Builder<DeleteNamespaceRequest, Empty> deleteNamespaceSettings;
    private final UnaryCallSettings.Builder<CreateServiceRequest, Service> createServiceSettings;
    private final PagedCallSettings.Builder<
            ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>
        listServicesSettings;
    private final UnaryCallSettings.Builder<GetServiceRequest, Service> getServiceSettings;
    private final UnaryCallSettings.Builder<UpdateServiceRequest, Service> updateServiceSettings;
    private final UnaryCallSettings.Builder<DeleteServiceRequest, Empty> deleteServiceSettings;
    private final UnaryCallSettings.Builder<CreateEndpointRequest, Endpoint> createEndpointSettings;
    private final PagedCallSettings.Builder<
            ListEndpointsRequest, ListEndpointsResponse, ListEndpointsPagedResponse>
        listEndpointsSettings;
    private final UnaryCallSettings.Builder<GetEndpointRequest, Endpoint> getEndpointSettings;
    private final UnaryCallSettings.Builder<UpdateEndpointRequest, Endpoint> updateEndpointSettings;
    private final UnaryCallSettings.Builder<DeleteEndpointRequest, Empty> deleteEndpointSettings;
    private final UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings;
    private final UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings;
    private final UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings;
    private final PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings;
    private final UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.UNAVAILABLE, StatusCode.Code.UNKNOWN)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(1000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(60000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(15000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(15000L))
              .setTotalTimeoutDuration(Duration.ofMillis(15000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createNamespaceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listNamespacesSettings = PagedCallSettings.newBuilder(LIST_NAMESPACES_PAGE_STR_FACT);
      getNamespaceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateNamespaceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteNamespaceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listServicesSettings = PagedCallSettings.newBuilder(LIST_SERVICES_PAGE_STR_FACT);
      getServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createEndpointSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listEndpointsSettings = PagedCallSettings.newBuilder(LIST_ENDPOINTS_PAGE_STR_FACT);
      getEndpointSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateEndpointSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteEndpointSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      testIamPermissionsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listLocationsSettings = PagedCallSettings.newBuilder(LIST_LOCATIONS_PAGE_STR_FACT);
      getLocationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createNamespaceSettings,
              listNamespacesSettings,
              getNamespaceSettings,
              updateNamespaceSettings,
              deleteNamespaceSettings,
              createServiceSettings,
              listServicesSettings,
              getServiceSettings,
              updateServiceSettings,
              deleteServiceSettings,
              createEndpointSettings,
              listEndpointsSettings,
              getEndpointSettings,
              updateEndpointSettings,
              deleteEndpointSettings,
              getIamPolicySettings,
              setIamPolicySettings,
              testIamPermissionsSettings,
              listLocationsSettings,
              getLocationSettings);
      initDefaults(this);
    }

    protected Builder(RegistrationServiceStubSettings settings) {
      super(settings);

      createNamespaceSettings = settings.createNamespaceSettings.toBuilder();
      listNamespacesSettings = settings.listNamespacesSettings.toBuilder();
      getNamespaceSettings = settings.getNamespaceSettings.toBuilder();
      updateNamespaceSettings = settings.updateNamespaceSettings.toBuilder();
      deleteNamespaceSettings = settings.deleteNamespaceSettings.toBuilder();
      createServiceSettings = settings.createServiceSettings.toBuilder();
      listServicesSettings = settings.listServicesSettings.toBuilder();
      getServiceSettings = settings.getServiceSettings.toBuilder();
      updateServiceSettings = settings.updateServiceSettings.toBuilder();
      deleteServiceSettings = settings.deleteServiceSettings.toBuilder();
      createEndpointSettings = settings.createEndpointSettings.toBuilder();
      listEndpointsSettings = settings.listEndpointsSettings.toBuilder();
      getEndpointSettings = settings.getEndpointSettings.toBuilder();
      updateEndpointSettings = settings.updateEndpointSettings.toBuilder();
      deleteEndpointSettings = settings.deleteEndpointSettings.toBuilder();
      getIamPolicySettings = settings.getIamPolicySettings.toBuilder();
      setIamPolicySettings = settings.setIamPolicySettings.toBuilder();
      testIamPermissionsSettings = settings.testIamPermissionsSettings.toBuilder();
      listLocationsSettings = settings.listLocationsSettings.toBuilder();
      getLocationSettings = settings.getLocationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createNamespaceSettings,
              listNamespacesSettings,
              getNamespaceSettings,
              updateNamespaceSettings,
              deleteNamespaceSettings,
              createServiceSettings,
              listServicesSettings,
              getServiceSettings,
              updateServiceSettings,
              deleteServiceSettings,
              createEndpointSettings,
              listEndpointsSettings,
              getEndpointSettings,
              updateEndpointSettings,
              deleteEndpointSettings,
              getIamPolicySettings,
              setIamPolicySettings,
              testIamPermissionsSettings,
              listLocationsSettings,
              getLocationSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder createHttpJsonDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultHttpJsonTransportProviderBuilder().build());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultHttpJsonApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .createNamespaceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listNamespacesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getNamespaceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateNamespaceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteNamespaceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listServicesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createEndpointSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listEndpointsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getEndpointSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateEndpointSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteEndpointSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .setIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .testIamPermissionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listLocationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getLocationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to createNamespace. */
    public UnaryCallSettings.Builder<CreateNamespaceRequest, Namespace> createNamespaceSettings() {
      return createNamespaceSettings;
    }

    /** Returns the builder for the settings used for calls to listNamespaces. */
    public PagedCallSettings.Builder<
            ListNamespacesRequest, ListNamespacesResponse, ListNamespacesPagedResponse>
        listNamespacesSettings() {
      return listNamespacesSettings;
    }

    /** Returns the builder for the settings used for calls to getNamespace. */
    public UnaryCallSettings.Builder<GetNamespaceRequest, Namespace> getNamespaceSettings() {
      return getNamespaceSettings;
    }

    /** Returns the builder for the settings used for calls to updateNamespace. */
    public UnaryCallSettings.Builder<UpdateNamespaceRequest, Namespace> updateNamespaceSettings() {
      return updateNamespaceSettings;
    }

    /** Returns the builder for the settings used for calls to deleteNamespace. */
    public UnaryCallSettings.Builder<DeleteNamespaceRequest, Empty> deleteNamespaceSettings() {
      return deleteNamespaceSettings;
    }

    /** Returns the builder for the settings used for calls to createService. */
    public UnaryCallSettings.Builder<CreateServiceRequest, Service> createServiceSettings() {
      return createServiceSettings;
    }

    /** Returns the builder for the settings used for calls to listServices. */
    public PagedCallSettings.Builder<
            ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>
        listServicesSettings() {
      return listServicesSettings;
    }

    /** Returns the builder for the settings used for calls to getService. */
    public UnaryCallSettings.Builder<GetServiceRequest, Service> getServiceSettings() {
      return getServiceSettings;
    }

    /** Returns the builder for the settings used for calls to updateService. */
    public UnaryCallSettings.Builder<UpdateServiceRequest, Service> updateServiceSettings() {
      return updateServiceSettings;
    }

    /** Returns the builder for the settings used for calls to deleteService. */
    public UnaryCallSettings.Builder<DeleteServiceRequest, Empty> deleteServiceSettings() {
      return deleteServiceSettings;
    }

    /** Returns the builder for the settings used for calls to createEndpoint. */
    public UnaryCallSettings.Builder<CreateEndpointRequest, Endpoint> createEndpointSettings() {
      return createEndpointSettings;
    }

    /** Returns the builder for the settings used for calls to listEndpoints. */
    public PagedCallSettings.Builder<
            ListEndpointsRequest, ListEndpointsResponse, ListEndpointsPagedResponse>
        listEndpointsSettings() {
      return listEndpointsSettings;
    }

    /** Returns the builder for the settings used for calls to getEndpoint. */
    public UnaryCallSettings.Builder<GetEndpointRequest, Endpoint> getEndpointSettings() {
      return getEndpointSettings;
    }

    /** Returns the builder for the settings used for calls to updateEndpoint. */
    public UnaryCallSettings.Builder<UpdateEndpointRequest, Endpoint> updateEndpointSettings() {
      return updateEndpointSettings;
    }

    /** Returns the builder for the settings used for calls to deleteEndpoint. */
    public UnaryCallSettings.Builder<DeleteEndpointRequest, Empty> deleteEndpointSettings() {
      return deleteEndpointSettings;
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return setIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return testIamPermissionsSettings;
    }

    /** Returns the builder for the settings used for calls to listLocations. */
    public PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings() {
      return listLocationsSettings;
    }

    /** Returns the builder for the settings used for calls to getLocation. */
    public UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings() {
      return getLocationSettings;
    }

    @Override
    public RegistrationServiceStubSettings build() throws IOException {
      return new RegistrationServiceStubSettings(this);
    }
  }
}
