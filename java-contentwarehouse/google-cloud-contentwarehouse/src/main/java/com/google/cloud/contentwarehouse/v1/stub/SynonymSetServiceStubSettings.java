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

package com.google.cloud.contentwarehouse.v1.stub;

import static com.google.cloud.contentwarehouse.v1.SynonymSetServiceClient.ListSynonymSetsPagedResponse;

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
import com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest;
import com.google.cloud.contentwarehouse.v1.DeleteSynonymSetRequest;
import com.google.cloud.contentwarehouse.v1.GetSynonymSetRequest;
import com.google.cloud.contentwarehouse.v1.ListSynonymSetsRequest;
import com.google.cloud.contentwarehouse.v1.ListSynonymSetsResponse;
import com.google.cloud.contentwarehouse.v1.SynonymSet;
import com.google.cloud.contentwarehouse.v1.UpdateSynonymSetRequest;
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
 * Settings class to configure an instance of {@link SynonymSetServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (contentwarehouse.googleapis.com) and default port (443) are
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
 * of createSynonymSet:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * SynonymSetServiceStubSettings.Builder synonymSetServiceSettingsBuilder =
 *     SynonymSetServiceStubSettings.newBuilder();
 * synonymSetServiceSettingsBuilder
 *     .createSynonymSetSettings()
 *     .setRetrySettings(
 *         synonymSetServiceSettingsBuilder
 *             .createSynonymSetSettings()
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
 * SynonymSetServiceStubSettings synonymSetServiceSettings =
 *     synonymSetServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@Generated("by gapic-generator-java")
public class SynonymSetServiceStubSettings extends StubSettings<SynonymSetServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<CreateSynonymSetRequest, SynonymSet> createSynonymSetSettings;
  private final UnaryCallSettings<GetSynonymSetRequest, SynonymSet> getSynonymSetSettings;
  private final UnaryCallSettings<UpdateSynonymSetRequest, SynonymSet> updateSynonymSetSettings;
  private final UnaryCallSettings<DeleteSynonymSetRequest, Empty> deleteSynonymSetSettings;
  private final PagedCallSettings<
          ListSynonymSetsRequest, ListSynonymSetsResponse, ListSynonymSetsPagedResponse>
      listSynonymSetsSettings;

  private static final PagedListDescriptor<
          ListSynonymSetsRequest, ListSynonymSetsResponse, SynonymSet>
      LIST_SYNONYM_SETS_PAGE_STR_DESC =
          new PagedListDescriptor<ListSynonymSetsRequest, ListSynonymSetsResponse, SynonymSet>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListSynonymSetsRequest injectToken(
                ListSynonymSetsRequest payload, String token) {
              return ListSynonymSetsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListSynonymSetsRequest injectPageSize(
                ListSynonymSetsRequest payload, int pageSize) {
              return ListSynonymSetsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListSynonymSetsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListSynonymSetsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<SynonymSet> extractResources(ListSynonymSetsResponse payload) {
              return payload.getSynonymSetsList();
            }
          };

  private static final PagedListResponseFactory<
          ListSynonymSetsRequest, ListSynonymSetsResponse, ListSynonymSetsPagedResponse>
      LIST_SYNONYM_SETS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListSynonymSetsRequest, ListSynonymSetsResponse, ListSynonymSetsPagedResponse>() {
            @Override
            public ApiFuture<ListSynonymSetsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListSynonymSetsRequest, ListSynonymSetsResponse> callable,
                ListSynonymSetsRequest request,
                ApiCallContext context,
                ApiFuture<ListSynonymSetsResponse> futureResponse) {
              PageContext<ListSynonymSetsRequest, ListSynonymSetsResponse, SynonymSet> pageContext =
                  PageContext.create(callable, LIST_SYNONYM_SETS_PAGE_STR_DESC, request, context);
              return ListSynonymSetsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to createSynonymSet. */
  public UnaryCallSettings<CreateSynonymSetRequest, SynonymSet> createSynonymSetSettings() {
    return createSynonymSetSettings;
  }

  /** Returns the object with the settings used for calls to getSynonymSet. */
  public UnaryCallSettings<GetSynonymSetRequest, SynonymSet> getSynonymSetSettings() {
    return getSynonymSetSettings;
  }

  /** Returns the object with the settings used for calls to updateSynonymSet. */
  public UnaryCallSettings<UpdateSynonymSetRequest, SynonymSet> updateSynonymSetSettings() {
    return updateSynonymSetSettings;
  }

  /** Returns the object with the settings used for calls to deleteSynonymSet. */
  public UnaryCallSettings<DeleteSynonymSetRequest, Empty> deleteSynonymSetSettings() {
    return deleteSynonymSetSettings;
  }

  /** Returns the object with the settings used for calls to listSynonymSets. */
  public PagedCallSettings<
          ListSynonymSetsRequest, ListSynonymSetsResponse, ListSynonymSetsPagedResponse>
      listSynonymSetsSettings() {
    return listSynonymSetsSettings;
  }

  public SynonymSetServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcSynonymSetServiceStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonSynonymSetServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "contentwarehouse";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "contentwarehouse.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "contentwarehouse.mtls.googleapis.com:443";
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
            "gapic", GaxProperties.getLibraryVersion(SynonymSetServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(SynonymSetServiceStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return SynonymSetServiceStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
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

  protected SynonymSetServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createSynonymSetSettings = settingsBuilder.createSynonymSetSettings().build();
    getSynonymSetSettings = settingsBuilder.getSynonymSetSettings().build();
    updateSynonymSetSettings = settingsBuilder.updateSynonymSetSettings().build();
    deleteSynonymSetSettings = settingsBuilder.deleteSynonymSetSettings().build();
    listSynonymSetsSettings = settingsBuilder.listSynonymSetsSettings().build();
  }

  /** Builder for SynonymSetServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<SynonymSetServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateSynonymSetRequest, SynonymSet>
        createSynonymSetSettings;
    private final UnaryCallSettings.Builder<GetSynonymSetRequest, SynonymSet> getSynonymSetSettings;
    private final UnaryCallSettings.Builder<UpdateSynonymSetRequest, SynonymSet>
        updateSynonymSetSettings;
    private final UnaryCallSettings.Builder<DeleteSynonymSetRequest, Empty>
        deleteSynonymSetSettings;
    private final PagedCallSettings.Builder<
            ListSynonymSetsRequest, ListSynonymSetsResponse, ListSynonymSetsPagedResponse>
        listSynonymSetsSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_1_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
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
              .setInitialRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setTotalTimeoutDuration(Duration.ofMillis(60000L))
              .build();
      definitions.put("no_retry_1_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(1000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(10000L))
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

      createSynonymSetSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getSynonymSetSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateSynonymSetSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteSynonymSetSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listSynonymSetsSettings = PagedCallSettings.newBuilder(LIST_SYNONYM_SETS_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createSynonymSetSettings,
              getSynonymSetSettings,
              updateSynonymSetSettings,
              deleteSynonymSetSettings,
              listSynonymSetsSettings);
      initDefaults(this);
    }

    protected Builder(SynonymSetServiceStubSettings settings) {
      super(settings);

      createSynonymSetSettings = settings.createSynonymSetSettings.toBuilder();
      getSynonymSetSettings = settings.getSynonymSetSettings.toBuilder();
      updateSynonymSetSettings = settings.updateSynonymSetSettings.toBuilder();
      deleteSynonymSetSettings = settings.deleteSynonymSetSettings.toBuilder();
      listSynonymSetsSettings = settings.listSynonymSetsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createSynonymSetSettings,
              getSynonymSetSettings,
              updateSynonymSetSettings,
              deleteSynonymSetSettings,
              listSynonymSetsSettings);
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
          .createSynonymSetSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getSynonymSetSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateSynonymSetSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteSynonymSetSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listSynonymSetsSettings()
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

    /** Returns the builder for the settings used for calls to createSynonymSet. */
    public UnaryCallSettings.Builder<CreateSynonymSetRequest, SynonymSet>
        createSynonymSetSettings() {
      return createSynonymSetSettings;
    }

    /** Returns the builder for the settings used for calls to getSynonymSet. */
    public UnaryCallSettings.Builder<GetSynonymSetRequest, SynonymSet> getSynonymSetSettings() {
      return getSynonymSetSettings;
    }

    /** Returns the builder for the settings used for calls to updateSynonymSet. */
    public UnaryCallSettings.Builder<UpdateSynonymSetRequest, SynonymSet>
        updateSynonymSetSettings() {
      return updateSynonymSetSettings;
    }

    /** Returns the builder for the settings used for calls to deleteSynonymSet. */
    public UnaryCallSettings.Builder<DeleteSynonymSetRequest, Empty> deleteSynonymSetSettings() {
      return deleteSynonymSetSettings;
    }

    /** Returns the builder for the settings used for calls to listSynonymSets. */
    public PagedCallSettings.Builder<
            ListSynonymSetsRequest, ListSynonymSetsResponse, ListSynonymSetsPagedResponse>
        listSynonymSetsSettings() {
      return listSynonymSetsSettings;
    }

    @Override
    public SynonymSetServiceStubSettings build() throws IOException {
      return new SynonymSetServiceStubSettings(this);
    }
  }
}
