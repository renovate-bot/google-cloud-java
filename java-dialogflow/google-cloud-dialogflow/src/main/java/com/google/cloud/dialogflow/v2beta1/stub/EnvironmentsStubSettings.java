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

package com.google.cloud.dialogflow.v2beta1.stub;

import static com.google.cloud.dialogflow.v2beta1.EnvironmentsClient.GetEnvironmentHistoryPagedResponse;
import static com.google.cloud.dialogflow.v2beta1.EnvironmentsClient.ListEnvironmentsPagedResponse;
import static com.google.cloud.dialogflow.v2beta1.EnvironmentsClient.ListLocationsPagedResponse;

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
import com.google.cloud.dialogflow.v2beta1.CreateEnvironmentRequest;
import com.google.cloud.dialogflow.v2beta1.DeleteEnvironmentRequest;
import com.google.cloud.dialogflow.v2beta1.Environment;
import com.google.cloud.dialogflow.v2beta1.EnvironmentHistory;
import com.google.cloud.dialogflow.v2beta1.GetEnvironmentHistoryRequest;
import com.google.cloud.dialogflow.v2beta1.GetEnvironmentRequest;
import com.google.cloud.dialogflow.v2beta1.ListEnvironmentsRequest;
import com.google.cloud.dialogflow.v2beta1.ListEnvironmentsResponse;
import com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.protobuf.Empty;
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
 */
@BetaApi
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
  private final UnaryCallSettings<CreateEnvironmentRequest, Environment> createEnvironmentSettings;
  private final UnaryCallSettings<UpdateEnvironmentRequest, Environment> updateEnvironmentSettings;
  private final UnaryCallSettings<DeleteEnvironmentRequest, Empty> deleteEnvironmentSettings;
  private final PagedCallSettings<
          GetEnvironmentHistoryRequest, EnvironmentHistory, GetEnvironmentHistoryPagedResponse>
      getEnvironmentHistorySettings;
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
          GetEnvironmentHistoryRequest, EnvironmentHistory, EnvironmentHistory.Entry>
      GET_ENVIRONMENT_HISTORY_PAGE_STR_DESC =
          new PagedListDescriptor<
              GetEnvironmentHistoryRequest, EnvironmentHistory, EnvironmentHistory.Entry>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public GetEnvironmentHistoryRequest injectToken(
                GetEnvironmentHistoryRequest payload, String token) {
              return GetEnvironmentHistoryRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public GetEnvironmentHistoryRequest injectPageSize(
                GetEnvironmentHistoryRequest payload, int pageSize) {
              return GetEnvironmentHistoryRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(GetEnvironmentHistoryRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(EnvironmentHistory payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<EnvironmentHistory.Entry> extractResources(EnvironmentHistory payload) {
              return payload.getEntriesList();
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
          GetEnvironmentHistoryRequest, EnvironmentHistory, GetEnvironmentHistoryPagedResponse>
      GET_ENVIRONMENT_HISTORY_PAGE_STR_FACT =
          new PagedListResponseFactory<
              GetEnvironmentHistoryRequest,
              EnvironmentHistory,
              GetEnvironmentHistoryPagedResponse>() {
            @Override
            public ApiFuture<GetEnvironmentHistoryPagedResponse> getFuturePagedResponse(
                UnaryCallable<GetEnvironmentHistoryRequest, EnvironmentHistory> callable,
                GetEnvironmentHistoryRequest request,
                ApiCallContext context,
                ApiFuture<EnvironmentHistory> futureResponse) {
              PageContext<
                      GetEnvironmentHistoryRequest, EnvironmentHistory, EnvironmentHistory.Entry>
                  pageContext =
                      PageContext.create(
                          callable, GET_ENVIRONMENT_HISTORY_PAGE_STR_DESC, request, context);
              return GetEnvironmentHistoryPagedResponse.createAsync(pageContext, futureResponse);
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
  public UnaryCallSettings<CreateEnvironmentRequest, Environment> createEnvironmentSettings() {
    return createEnvironmentSettings;
  }

  /** Returns the object with the settings used for calls to updateEnvironment. */
  public UnaryCallSettings<UpdateEnvironmentRequest, Environment> updateEnvironmentSettings() {
    return updateEnvironmentSettings;
  }

  /** Returns the object with the settings used for calls to deleteEnvironment. */
  public UnaryCallSettings<DeleteEnvironmentRequest, Empty> deleteEnvironmentSettings() {
    return deleteEnvironmentSettings;
  }

  /** Returns the object with the settings used for calls to getEnvironmentHistory. */
  public PagedCallSettings<
          GetEnvironmentHistoryRequest, EnvironmentHistory, GetEnvironmentHistoryPagedResponse>
      getEnvironmentHistorySettings() {
    return getEnvironmentHistorySettings;
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
    updateEnvironmentSettings = settingsBuilder.updateEnvironmentSettings().build();
    deleteEnvironmentSettings = settingsBuilder.deleteEnvironmentSettings().build();
    getEnvironmentHistorySettings = settingsBuilder.getEnvironmentHistorySettings().build();
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
    private final UnaryCallSettings.Builder<CreateEnvironmentRequest, Environment>
        createEnvironmentSettings;
    private final UnaryCallSettings.Builder<UpdateEnvironmentRequest, Environment>
        updateEnvironmentSettings;
    private final UnaryCallSettings.Builder<DeleteEnvironmentRequest, Empty>
        deleteEnvironmentSettings;
    private final PagedCallSettings.Builder<
            GetEnvironmentHistoryRequest, EnvironmentHistory, GetEnvironmentHistoryPagedResponse>
        getEnvironmentHistorySettings;
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
      updateEnvironmentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteEnvironmentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getEnvironmentHistorySettings =
          PagedCallSettings.newBuilder(GET_ENVIRONMENT_HISTORY_PAGE_STR_FACT);
      listLocationsSettings = PagedCallSettings.newBuilder(LIST_LOCATIONS_PAGE_STR_FACT);
      getLocationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listEnvironmentsSettings,
              getEnvironmentSettings,
              createEnvironmentSettings,
              updateEnvironmentSettings,
              deleteEnvironmentSettings,
              getEnvironmentHistorySettings,
              listLocationsSettings,
              getLocationSettings);
      initDefaults(this);
    }

    protected Builder(EnvironmentsStubSettings settings) {
      super(settings);

      listEnvironmentsSettings = settings.listEnvironmentsSettings.toBuilder();
      getEnvironmentSettings = settings.getEnvironmentSettings.toBuilder();
      createEnvironmentSettings = settings.createEnvironmentSettings.toBuilder();
      updateEnvironmentSettings = settings.updateEnvironmentSettings.toBuilder();
      deleteEnvironmentSettings = settings.deleteEnvironmentSettings.toBuilder();
      getEnvironmentHistorySettings = settings.getEnvironmentHistorySettings.toBuilder();
      listLocationsSettings = settings.listLocationsSettings.toBuilder();
      getLocationSettings = settings.getLocationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listEnvironmentsSettings,
              getEnvironmentSettings,
              createEnvironmentSettings,
              updateEnvironmentSettings,
              deleteEnvironmentSettings,
              getEnvironmentHistorySettings,
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
          .getEnvironmentHistorySettings()
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
    public UnaryCallSettings.Builder<CreateEnvironmentRequest, Environment>
        createEnvironmentSettings() {
      return createEnvironmentSettings;
    }

    /** Returns the builder for the settings used for calls to updateEnvironment. */
    public UnaryCallSettings.Builder<UpdateEnvironmentRequest, Environment>
        updateEnvironmentSettings() {
      return updateEnvironmentSettings;
    }

    /** Returns the builder for the settings used for calls to deleteEnvironment. */
    public UnaryCallSettings.Builder<DeleteEnvironmentRequest, Empty> deleteEnvironmentSettings() {
      return deleteEnvironmentSettings;
    }

    /** Returns the builder for the settings used for calls to getEnvironmentHistory. */
    public PagedCallSettings.Builder<
            GetEnvironmentHistoryRequest, EnvironmentHistory, GetEnvironmentHistoryPagedResponse>
        getEnvironmentHistorySettings() {
      return getEnvironmentHistorySettings;
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
