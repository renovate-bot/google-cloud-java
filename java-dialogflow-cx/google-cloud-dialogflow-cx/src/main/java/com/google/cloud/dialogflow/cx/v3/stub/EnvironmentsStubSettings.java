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

package com.google.cloud.dialogflow.cx.v3.stub;

import static com.google.cloud.dialogflow.cx.v3.EnvironmentsClient.ListContinuousTestResultsPagedResponse;
import static com.google.cloud.dialogflow.cx.v3.EnvironmentsClient.ListEnvironmentsPagedResponse;
import static com.google.cloud.dialogflow.cx.v3.EnvironmentsClient.ListLocationsPagedResponse;
import static com.google.cloud.dialogflow.cx.v3.EnvironmentsClient.LookupEnvironmentHistoryPagedResponse;

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
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.cx.v3.ContinuousTestResult;
import com.google.cloud.dialogflow.cx.v3.CreateEnvironmentRequest;
import com.google.cloud.dialogflow.cx.v3.DeleteEnvironmentRequest;
import com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata;
import com.google.cloud.dialogflow.cx.v3.DeployFlowRequest;
import com.google.cloud.dialogflow.cx.v3.DeployFlowResponse;
import com.google.cloud.dialogflow.cx.v3.Environment;
import com.google.cloud.dialogflow.cx.v3.GetEnvironmentRequest;
import com.google.cloud.dialogflow.cx.v3.ListContinuousTestResultsRequest;
import com.google.cloud.dialogflow.cx.v3.ListContinuousTestResultsResponse;
import com.google.cloud.dialogflow.cx.v3.ListEnvironmentsRequest;
import com.google.cloud.dialogflow.cx.v3.ListEnvironmentsResponse;
import com.google.cloud.dialogflow.cx.v3.LookupEnvironmentHistoryRequest;
import com.google.cloud.dialogflow.cx.v3.LookupEnvironmentHistoryResponse;
import com.google.cloud.dialogflow.cx.v3.RunContinuousTestMetadata;
import com.google.cloud.dialogflow.cx.v3.RunContinuousTestRequest;
import com.google.cloud.dialogflow.cx.v3.RunContinuousTestResponse;
import com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.Struct;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link EnvironmentsStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (dialogflow.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of getEnvironment:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * EnvironmentsStubSettings.Builder environmentsSettingsBuilder =
 *     EnvironmentsStubSettings.newBuilder();
 * environmentsSettingsBuilder
 *     .getEnvironmentSettings()
 *     .setRetrySettings(
 *         environmentsSettingsBuilder
 *             .getEnvironmentSettings()
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
 * EnvironmentsStubSettings environmentsSettings = environmentsSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for createEnvironment:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * EnvironmentsStubSettings.Builder environmentsSettingsBuilder =
 *     EnvironmentsStubSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * environmentsSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class EnvironmentsStubSettings extends StubSettings<EnvironmentsStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/dialogflow")
          .build();

  private final PagedCallSettings<
          ListEnvironmentsRequest, ListEnvironmentsResponse, ListEnvironmentsPagedResponse>
      listEnvironmentsSettings;
  private final UnaryCallSettings<GetEnvironmentRequest, Environment> getEnvironmentSettings;
  private final UnaryCallSettings<CreateEnvironmentRequest, Operation> createEnvironmentSettings;
  private final OperationCallSettings<CreateEnvironmentRequest, Environment, Struct>
      createEnvironmentOperationSettings;
  private final UnaryCallSettings<UpdateEnvironmentRequest, Operation> updateEnvironmentSettings;
  private final OperationCallSettings<UpdateEnvironmentRequest, Environment, Struct>
      updateEnvironmentOperationSettings;
  private final UnaryCallSettings<DeleteEnvironmentRequest, Empty> deleteEnvironmentSettings;
  private final PagedCallSettings<
          LookupEnvironmentHistoryRequest,
          LookupEnvironmentHistoryResponse,
          LookupEnvironmentHistoryPagedResponse>
      lookupEnvironmentHistorySettings;
  private final UnaryCallSettings<RunContinuousTestRequest, Operation> runContinuousTestSettings;
  private final OperationCallSettings<
          RunContinuousTestRequest, RunContinuousTestResponse, RunContinuousTestMetadata>
      runContinuousTestOperationSettings;
  private final PagedCallSettings<
          ListContinuousTestResultsRequest,
          ListContinuousTestResultsResponse,
          ListContinuousTestResultsPagedResponse>
      listContinuousTestResultsSettings;
  private final UnaryCallSettings<DeployFlowRequest, Operation> deployFlowSettings;
  private final OperationCallSettings<DeployFlowRequest, DeployFlowResponse, DeployFlowMetadata>
      deployFlowOperationSettings;
  private final PagedCallSettings<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings;
  private final UnaryCallSettings<GetLocationRequest, Location> getLocationSettings;

  private static final PagedListDescriptor<
          ListEnvironmentsRequest, ListEnvironmentsResponse, Environment>
      LIST_ENVIRONMENTS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListEnvironmentsRequest, ListEnvironmentsResponse, Environment>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListEnvironmentsRequest injectToken(
                ListEnvironmentsRequest payload, String token) {
              return ListEnvironmentsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListEnvironmentsRequest injectPageSize(
                ListEnvironmentsRequest payload, int pageSize) {
              return ListEnvironmentsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListEnvironmentsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListEnvironmentsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Environment> extractResources(ListEnvironmentsResponse payload) {
              return payload.getEnvironmentsList();
            }
          };

  private static final PagedListDescriptor<
          LookupEnvironmentHistoryRequest, LookupEnvironmentHistoryResponse, Environment>
      LOOKUP_ENVIRONMENT_HISTORY_PAGE_STR_DESC =
          new PagedListDescriptor<
              LookupEnvironmentHistoryRequest, LookupEnvironmentHistoryResponse, Environment>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public LookupEnvironmentHistoryRequest injectToken(
                LookupEnvironmentHistoryRequest payload, String token) {
              return LookupEnvironmentHistoryRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public LookupEnvironmentHistoryRequest injectPageSize(
                LookupEnvironmentHistoryRequest payload, int pageSize) {
              return LookupEnvironmentHistoryRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(LookupEnvironmentHistoryRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(LookupEnvironmentHistoryResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Environment> extractResources(
                LookupEnvironmentHistoryResponse payload) {
              return payload.getEnvironmentsList();
            }
          };

  private static final PagedListDescriptor<
          ListContinuousTestResultsRequest, ListContinuousTestResultsResponse, ContinuousTestResult>
      LIST_CONTINUOUS_TEST_RESULTS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListContinuousTestResultsRequest,
              ListContinuousTestResultsResponse,
              ContinuousTestResult>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListContinuousTestResultsRequest injectToken(
                ListContinuousTestResultsRequest payload, String token) {
              return ListContinuousTestResultsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListContinuousTestResultsRequest injectPageSize(
                ListContinuousTestResultsRequest payload, int pageSize) {
              return ListContinuousTestResultsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListContinuousTestResultsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListContinuousTestResultsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ContinuousTestResult> extractResources(
                ListContinuousTestResultsResponse payload) {
              return payload.getContinuousTestResultsList();
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
          ListEnvironmentsRequest, ListEnvironmentsResponse, ListEnvironmentsPagedResponse>
      LIST_ENVIRONMENTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListEnvironmentsRequest, ListEnvironmentsResponse, ListEnvironmentsPagedResponse>() {
            @Override
            public ApiFuture<ListEnvironmentsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListEnvironmentsRequest, ListEnvironmentsResponse> callable,
                ListEnvironmentsRequest request,
                ApiCallContext context,
                ApiFuture<ListEnvironmentsResponse> futureResponse) {
              PageContext<ListEnvironmentsRequest, ListEnvironmentsResponse, Environment>
                  pageContext =
                      PageContext.create(
                          callable, LIST_ENVIRONMENTS_PAGE_STR_DESC, request, context);
              return ListEnvironmentsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          LookupEnvironmentHistoryRequest,
          LookupEnvironmentHistoryResponse,
          LookupEnvironmentHistoryPagedResponse>
      LOOKUP_ENVIRONMENT_HISTORY_PAGE_STR_FACT =
          new PagedListResponseFactory<
              LookupEnvironmentHistoryRequest,
              LookupEnvironmentHistoryResponse,
              LookupEnvironmentHistoryPagedResponse>() {
            @Override
            public ApiFuture<LookupEnvironmentHistoryPagedResponse> getFuturePagedResponse(
                UnaryCallable<LookupEnvironmentHistoryRequest, LookupEnvironmentHistoryResponse>
                    callable,
                LookupEnvironmentHistoryRequest request,
                ApiCallContext context,
                ApiFuture<LookupEnvironmentHistoryResponse> futureResponse) {
              PageContext<
                      LookupEnvironmentHistoryRequest,
                      LookupEnvironmentHistoryResponse,
                      Environment>
                  pageContext =
                      PageContext.create(
                          callable, LOOKUP_ENVIRONMENT_HISTORY_PAGE_STR_DESC, request, context);
              return LookupEnvironmentHistoryPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListContinuousTestResultsRequest,
          ListContinuousTestResultsResponse,
          ListContinuousTestResultsPagedResponse>
      LIST_CONTINUOUS_TEST_RESULTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListContinuousTestResultsRequest,
              ListContinuousTestResultsResponse,
              ListContinuousTestResultsPagedResponse>() {
            @Override
            public ApiFuture<ListContinuousTestResultsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListContinuousTestResultsRequest, ListContinuousTestResultsResponse>
                    callable,
                ListContinuousTestResultsRequest request,
                ApiCallContext context,
                ApiFuture<ListContinuousTestResultsResponse> futureResponse) {
              PageContext<
                      ListContinuousTestResultsRequest,
                      ListContinuousTestResultsResponse,
                      ContinuousTestResult>
                  pageContext =
                      PageContext.create(
                          callable, LIST_CONTINUOUS_TEST_RESULTS_PAGE_STR_DESC, request, context);
              return ListContinuousTestResultsPagedResponse.createAsync(
                  pageContext, futureResponse);
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

  /** Returns the object with the settings used for calls to listEnvironments. */
  public PagedCallSettings<
          ListEnvironmentsRequest, ListEnvironmentsResponse, ListEnvironmentsPagedResponse>
      listEnvironmentsSettings() {
    return listEnvironmentsSettings;
  }

  /** Returns the object with the settings used for calls to getEnvironment. */
  public UnaryCallSettings<GetEnvironmentRequest, Environment> getEnvironmentSettings() {
    return getEnvironmentSettings;
  }

  /** Returns the object with the settings used for calls to createEnvironment. */
  public UnaryCallSettings<CreateEnvironmentRequest, Operation> createEnvironmentSettings() {
    return createEnvironmentSettings;
  }

  /** Returns the object with the settings used for calls to createEnvironment. */
  public OperationCallSettings<CreateEnvironmentRequest, Environment, Struct>
      createEnvironmentOperationSettings() {
    return createEnvironmentOperationSettings;
  }

  /** Returns the object with the settings used for calls to updateEnvironment. */
  public UnaryCallSettings<UpdateEnvironmentRequest, Operation> updateEnvironmentSettings() {
    return updateEnvironmentSettings;
  }

  /** Returns the object with the settings used for calls to updateEnvironment. */
  public OperationCallSettings<UpdateEnvironmentRequest, Environment, Struct>
      updateEnvironmentOperationSettings() {
    return updateEnvironmentOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteEnvironment. */
  public UnaryCallSettings<DeleteEnvironmentRequest, Empty> deleteEnvironmentSettings() {
    return deleteEnvironmentSettings;
  }

  /** Returns the object with the settings used for calls to lookupEnvironmentHistory. */
  public PagedCallSettings<
          LookupEnvironmentHistoryRequest,
          LookupEnvironmentHistoryResponse,
          LookupEnvironmentHistoryPagedResponse>
      lookupEnvironmentHistorySettings() {
    return lookupEnvironmentHistorySettings;
  }

  /** Returns the object with the settings used for calls to runContinuousTest. */
  public UnaryCallSettings<RunContinuousTestRequest, Operation> runContinuousTestSettings() {
    return runContinuousTestSettings;
  }

  /** Returns the object with the settings used for calls to runContinuousTest. */
  public OperationCallSettings<
          RunContinuousTestRequest, RunContinuousTestResponse, RunContinuousTestMetadata>
      runContinuousTestOperationSettings() {
    return runContinuousTestOperationSettings;
  }

  /** Returns the object with the settings used for calls to listContinuousTestResults. */
  public PagedCallSettings<
          ListContinuousTestResultsRequest,
          ListContinuousTestResultsResponse,
          ListContinuousTestResultsPagedResponse>
      listContinuousTestResultsSettings() {
    return listContinuousTestResultsSettings;
  }

  /** Returns the object with the settings used for calls to deployFlow. */
  public UnaryCallSettings<DeployFlowRequest, Operation> deployFlowSettings() {
    return deployFlowSettings;
  }

  /** Returns the object with the settings used for calls to deployFlow. */
  public OperationCallSettings<DeployFlowRequest, DeployFlowResponse, DeployFlowMetadata>
      deployFlowOperationSettings() {
    return deployFlowOperationSettings;
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

  public EnvironmentsStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcEnvironmentsStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonEnvironmentsStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "dialogflow";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "dialogflow.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "dialogflow.mtls.googleapis.com:443";
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
            "gapic", GaxProperties.getLibraryVersion(EnvironmentsStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(EnvironmentsStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return EnvironmentsStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
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

  protected EnvironmentsStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listEnvironmentsSettings = settingsBuilder.listEnvironmentsSettings().build();
    getEnvironmentSettings = settingsBuilder.getEnvironmentSettings().build();
    createEnvironmentSettings = settingsBuilder.createEnvironmentSettings().build();
    createEnvironmentOperationSettings =
        settingsBuilder.createEnvironmentOperationSettings().build();
    updateEnvironmentSettings = settingsBuilder.updateEnvironmentSettings().build();
    updateEnvironmentOperationSettings =
        settingsBuilder.updateEnvironmentOperationSettings().build();
    deleteEnvironmentSettings = settingsBuilder.deleteEnvironmentSettings().build();
    lookupEnvironmentHistorySettings = settingsBuilder.lookupEnvironmentHistorySettings().build();
    runContinuousTestSettings = settingsBuilder.runContinuousTestSettings().build();
    runContinuousTestOperationSettings =
        settingsBuilder.runContinuousTestOperationSettings().build();
    listContinuousTestResultsSettings = settingsBuilder.listContinuousTestResultsSettings().build();
    deployFlowSettings = settingsBuilder.deployFlowSettings().build();
    deployFlowOperationSettings = settingsBuilder.deployFlowOperationSettings().build();
    listLocationsSettings = settingsBuilder.listLocationsSettings().build();
    getLocationSettings = settingsBuilder.getLocationSettings().build();
  }

  /** Builder for EnvironmentsStubSettings. */
  public static class Builder extends StubSettings.Builder<EnvironmentsStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            ListEnvironmentsRequest, ListEnvironmentsResponse, ListEnvironmentsPagedResponse>
        listEnvironmentsSettings;
    private final UnaryCallSettings.Builder<GetEnvironmentRequest, Environment>
        getEnvironmentSettings;
    private final UnaryCallSettings.Builder<CreateEnvironmentRequest, Operation>
        createEnvironmentSettings;
    private final OperationCallSettings.Builder<CreateEnvironmentRequest, Environment, Struct>
        createEnvironmentOperationSettings;
    private final UnaryCallSettings.Builder<UpdateEnvironmentRequest, Operation>
        updateEnvironmentSettings;
    private final OperationCallSettings.Builder<UpdateEnvironmentRequest, Environment, Struct>
        updateEnvironmentOperationSettings;
    private final UnaryCallSettings.Builder<DeleteEnvironmentRequest, Empty>
        deleteEnvironmentSettings;
    private final PagedCallSettings.Builder<
            LookupEnvironmentHistoryRequest,
            LookupEnvironmentHistoryResponse,
            LookupEnvironmentHistoryPagedResponse>
        lookupEnvironmentHistorySettings;
    private final UnaryCallSettings.Builder<RunContinuousTestRequest, Operation>
        runContinuousTestSettings;
    private final OperationCallSettings.Builder<
            RunContinuousTestRequest, RunContinuousTestResponse, RunContinuousTestMetadata>
        runContinuousTestOperationSettings;
    private final PagedCallSettings.Builder<
            ListContinuousTestResultsRequest,
            ListContinuousTestResultsResponse,
            ListContinuousTestResultsPagedResponse>
        listContinuousTestResultsSettings;
    private final UnaryCallSettings.Builder<DeployFlowRequest, Operation> deployFlowSettings;
    private final OperationCallSettings.Builder<
            DeployFlowRequest, DeployFlowResponse, DeployFlowMetadata>
        deployFlowOperationSettings;
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
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(60000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setTotalTimeoutDuration(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      listEnvironmentsSettings = PagedCallSettings.newBuilder(LIST_ENVIRONMENTS_PAGE_STR_FACT);
      getEnvironmentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createEnvironmentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createEnvironmentOperationSettings = OperationCallSettings.newBuilder();
      updateEnvironmentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateEnvironmentOperationSettings = OperationCallSettings.newBuilder();
      deleteEnvironmentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      lookupEnvironmentHistorySettings =
          PagedCallSettings.newBuilder(LOOKUP_ENVIRONMENT_HISTORY_PAGE_STR_FACT);
      runContinuousTestSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      runContinuousTestOperationSettings = OperationCallSettings.newBuilder();
      listContinuousTestResultsSettings =
          PagedCallSettings.newBuilder(LIST_CONTINUOUS_TEST_RESULTS_PAGE_STR_FACT);
      deployFlowSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deployFlowOperationSettings = OperationCallSettings.newBuilder();
      listLocationsSettings = PagedCallSettings.newBuilder(LIST_LOCATIONS_PAGE_STR_FACT);
      getLocationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listEnvironmentsSettings,
              getEnvironmentSettings,
              createEnvironmentSettings,
              updateEnvironmentSettings,
              deleteEnvironmentSettings,
              lookupEnvironmentHistorySettings,
              runContinuousTestSettings,
              listContinuousTestResultsSettings,
              deployFlowSettings,
              listLocationsSettings,
              getLocationSettings);
      initDefaults(this);
    }

    protected Builder(EnvironmentsStubSettings settings) {
      super(settings);

      listEnvironmentsSettings = settings.listEnvironmentsSettings.toBuilder();
      getEnvironmentSettings = settings.getEnvironmentSettings.toBuilder();
      createEnvironmentSettings = settings.createEnvironmentSettings.toBuilder();
      createEnvironmentOperationSettings = settings.createEnvironmentOperationSettings.toBuilder();
      updateEnvironmentSettings = settings.updateEnvironmentSettings.toBuilder();
      updateEnvironmentOperationSettings = settings.updateEnvironmentOperationSettings.toBuilder();
      deleteEnvironmentSettings = settings.deleteEnvironmentSettings.toBuilder();
      lookupEnvironmentHistorySettings = settings.lookupEnvironmentHistorySettings.toBuilder();
      runContinuousTestSettings = settings.runContinuousTestSettings.toBuilder();
      runContinuousTestOperationSettings = settings.runContinuousTestOperationSettings.toBuilder();
      listContinuousTestResultsSettings = settings.listContinuousTestResultsSettings.toBuilder();
      deployFlowSettings = settings.deployFlowSettings.toBuilder();
      deployFlowOperationSettings = settings.deployFlowOperationSettings.toBuilder();
      listLocationsSettings = settings.listLocationsSettings.toBuilder();
      getLocationSettings = settings.getLocationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listEnvironmentsSettings,
              getEnvironmentSettings,
              createEnvironmentSettings,
              updateEnvironmentSettings,
              deleteEnvironmentSettings,
              lookupEnvironmentHistorySettings,
              runContinuousTestSettings,
              listContinuousTestResultsSettings,
              deployFlowSettings,
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
          .listEnvironmentsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getEnvironmentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createEnvironmentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateEnvironmentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteEnvironmentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .lookupEnvironmentHistorySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .runContinuousTestSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listContinuousTestResultsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deployFlowSettings()
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

      builder
          .createEnvironmentOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateEnvironmentRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Environment.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Struct.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .updateEnvironmentOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<UpdateEnvironmentRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Environment.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Struct.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .runContinuousTestOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<RunContinuousTestRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  RunContinuousTestResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  RunContinuousTestMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .deployFlowOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<DeployFlowRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(DeployFlowResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(DeployFlowMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

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

    /** Returns the builder for the settings used for calls to listEnvironments. */
    public PagedCallSettings.Builder<
            ListEnvironmentsRequest, ListEnvironmentsResponse, ListEnvironmentsPagedResponse>
        listEnvironmentsSettings() {
      return listEnvironmentsSettings;
    }

    /** Returns the builder for the settings used for calls to getEnvironment. */
    public UnaryCallSettings.Builder<GetEnvironmentRequest, Environment> getEnvironmentSettings() {
      return getEnvironmentSettings;
    }

    /** Returns the builder for the settings used for calls to createEnvironment. */
    public UnaryCallSettings.Builder<CreateEnvironmentRequest, Operation>
        createEnvironmentSettings() {
      return createEnvironmentSettings;
    }

    /** Returns the builder for the settings used for calls to createEnvironment. */
    public OperationCallSettings.Builder<CreateEnvironmentRequest, Environment, Struct>
        createEnvironmentOperationSettings() {
      return createEnvironmentOperationSettings;
    }

    /** Returns the builder for the settings used for calls to updateEnvironment. */
    public UnaryCallSettings.Builder<UpdateEnvironmentRequest, Operation>
        updateEnvironmentSettings() {
      return updateEnvironmentSettings;
    }

    /** Returns the builder for the settings used for calls to updateEnvironment. */
    public OperationCallSettings.Builder<UpdateEnvironmentRequest, Environment, Struct>
        updateEnvironmentOperationSettings() {
      return updateEnvironmentOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteEnvironment. */
    public UnaryCallSettings.Builder<DeleteEnvironmentRequest, Empty> deleteEnvironmentSettings() {
      return deleteEnvironmentSettings;
    }

    /** Returns the builder for the settings used for calls to lookupEnvironmentHistory. */
    public PagedCallSettings.Builder<
            LookupEnvironmentHistoryRequest,
            LookupEnvironmentHistoryResponse,
            LookupEnvironmentHistoryPagedResponse>
        lookupEnvironmentHistorySettings() {
      return lookupEnvironmentHistorySettings;
    }

    /** Returns the builder for the settings used for calls to runContinuousTest. */
    public UnaryCallSettings.Builder<RunContinuousTestRequest, Operation>
        runContinuousTestSettings() {
      return runContinuousTestSettings;
    }

    /** Returns the builder for the settings used for calls to runContinuousTest. */
    public OperationCallSettings.Builder<
            RunContinuousTestRequest, RunContinuousTestResponse, RunContinuousTestMetadata>
        runContinuousTestOperationSettings() {
      return runContinuousTestOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listContinuousTestResults. */
    public PagedCallSettings.Builder<
            ListContinuousTestResultsRequest,
            ListContinuousTestResultsResponse,
            ListContinuousTestResultsPagedResponse>
        listContinuousTestResultsSettings() {
      return listContinuousTestResultsSettings;
    }

    /** Returns the builder for the settings used for calls to deployFlow. */
    public UnaryCallSettings.Builder<DeployFlowRequest, Operation> deployFlowSettings() {
      return deployFlowSettings;
    }

    /** Returns the builder for the settings used for calls to deployFlow. */
    public OperationCallSettings.Builder<DeployFlowRequest, DeployFlowResponse, DeployFlowMetadata>
        deployFlowOperationSettings() {
      return deployFlowOperationSettings;
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
    public EnvironmentsStubSettings build() throws IOException {
      return new EnvironmentsStubSettings(this);
    }
  }
}
