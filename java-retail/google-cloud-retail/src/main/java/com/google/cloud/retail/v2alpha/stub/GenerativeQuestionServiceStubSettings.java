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

package com.google.cloud.retail.v2alpha.stub;

import com.google.api.core.ApiFunction;
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
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.retail.v2alpha.BatchUpdateGenerativeQuestionConfigsRequest;
import com.google.cloud.retail.v2alpha.BatchUpdateGenerativeQuestionConfigsResponse;
import com.google.cloud.retail.v2alpha.GenerativeQuestionConfig;
import com.google.cloud.retail.v2alpha.GenerativeQuestionsFeatureConfig;
import com.google.cloud.retail.v2alpha.GetGenerativeQuestionsFeatureConfigRequest;
import com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsRequest;
import com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse;
import com.google.cloud.retail.v2alpha.UpdateGenerativeQuestionConfigRequest;
import com.google.cloud.retail.v2alpha.UpdateGenerativeQuestionsFeatureConfigRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link GenerativeQuestionServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (retail.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of updateGenerativeQuestionsFeatureConfig:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * GenerativeQuestionServiceStubSettings.Builder generativeQuestionServiceSettingsBuilder =
 *     GenerativeQuestionServiceStubSettings.newBuilder();
 * generativeQuestionServiceSettingsBuilder
 *     .updateGenerativeQuestionsFeatureConfigSettings()
 *     .setRetrySettings(
 *         generativeQuestionServiceSettingsBuilder
 *             .updateGenerativeQuestionsFeatureConfigSettings()
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
 * GenerativeQuestionServiceStubSettings generativeQuestionServiceSettings =
 *     generativeQuestionServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class GenerativeQuestionServiceStubSettings
    extends StubSettings<GenerativeQuestionServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<
          UpdateGenerativeQuestionsFeatureConfigRequest, GenerativeQuestionsFeatureConfig>
      updateGenerativeQuestionsFeatureConfigSettings;
  private final UnaryCallSettings<
          GetGenerativeQuestionsFeatureConfigRequest, GenerativeQuestionsFeatureConfig>
      getGenerativeQuestionsFeatureConfigSettings;
  private final UnaryCallSettings<
          ListGenerativeQuestionConfigsRequest, ListGenerativeQuestionConfigsResponse>
      listGenerativeQuestionConfigsSettings;
  private final UnaryCallSettings<UpdateGenerativeQuestionConfigRequest, GenerativeQuestionConfig>
      updateGenerativeQuestionConfigSettings;
  private final UnaryCallSettings<
          BatchUpdateGenerativeQuestionConfigsRequest, BatchUpdateGenerativeQuestionConfigsResponse>
      batchUpdateGenerativeQuestionConfigsSettings;

  /**
   * Returns the object with the settings used for calls to updateGenerativeQuestionsFeatureConfig.
   */
  public UnaryCallSettings<
          UpdateGenerativeQuestionsFeatureConfigRequest, GenerativeQuestionsFeatureConfig>
      updateGenerativeQuestionsFeatureConfigSettings() {
    return updateGenerativeQuestionsFeatureConfigSettings;
  }

  /** Returns the object with the settings used for calls to getGenerativeQuestionsFeatureConfig. */
  public UnaryCallSettings<
          GetGenerativeQuestionsFeatureConfigRequest, GenerativeQuestionsFeatureConfig>
      getGenerativeQuestionsFeatureConfigSettings() {
    return getGenerativeQuestionsFeatureConfigSettings;
  }

  /** Returns the object with the settings used for calls to listGenerativeQuestionConfigs. */
  public UnaryCallSettings<
          ListGenerativeQuestionConfigsRequest, ListGenerativeQuestionConfigsResponse>
      listGenerativeQuestionConfigsSettings() {
    return listGenerativeQuestionConfigsSettings;
  }

  /** Returns the object with the settings used for calls to updateGenerativeQuestionConfig. */
  public UnaryCallSettings<UpdateGenerativeQuestionConfigRequest, GenerativeQuestionConfig>
      updateGenerativeQuestionConfigSettings() {
    return updateGenerativeQuestionConfigSettings;
  }

  /**
   * Returns the object with the settings used for calls to batchUpdateGenerativeQuestionConfigs.
   */
  public UnaryCallSettings<
          BatchUpdateGenerativeQuestionConfigsRequest, BatchUpdateGenerativeQuestionConfigsResponse>
      batchUpdateGenerativeQuestionConfigsSettings() {
    return batchUpdateGenerativeQuestionConfigsSettings;
  }

  public GenerativeQuestionServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcGenerativeQuestionServiceStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonGenerativeQuestionServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "retail";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "retail.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "retail.mtls.googleapis.com:443";
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
            "gapic", GaxProperties.getLibraryVersion(GenerativeQuestionServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(GenerativeQuestionServiceStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return GenerativeQuestionServiceStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
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

  protected GenerativeQuestionServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    updateGenerativeQuestionsFeatureConfigSettings =
        settingsBuilder.updateGenerativeQuestionsFeatureConfigSettings().build();
    getGenerativeQuestionsFeatureConfigSettings =
        settingsBuilder.getGenerativeQuestionsFeatureConfigSettings().build();
    listGenerativeQuestionConfigsSettings =
        settingsBuilder.listGenerativeQuestionConfigsSettings().build();
    updateGenerativeQuestionConfigSettings =
        settingsBuilder.updateGenerativeQuestionConfigSettings().build();
    batchUpdateGenerativeQuestionConfigsSettings =
        settingsBuilder.batchUpdateGenerativeQuestionConfigsSettings().build();
  }

  /** Builder for GenerativeQuestionServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<GenerativeQuestionServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<
            UpdateGenerativeQuestionsFeatureConfigRequest, GenerativeQuestionsFeatureConfig>
        updateGenerativeQuestionsFeatureConfigSettings;
    private final UnaryCallSettings.Builder<
            GetGenerativeQuestionsFeatureConfigRequest, GenerativeQuestionsFeatureConfig>
        getGenerativeQuestionsFeatureConfigSettings;
    private final UnaryCallSettings.Builder<
            ListGenerativeQuestionConfigsRequest, ListGenerativeQuestionConfigsResponse>
        listGenerativeQuestionConfigsSettings;
    private final UnaryCallSettings.Builder<
            UpdateGenerativeQuestionConfigRequest, GenerativeQuestionConfig>
        updateGenerativeQuestionConfigSettings;
    private final UnaryCallSettings.Builder<
            BatchUpdateGenerativeQuestionConfigsRequest,
            BatchUpdateGenerativeQuestionConfigsResponse>
        batchUpdateGenerativeQuestionConfigsSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put("no_retry_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      updateGenerativeQuestionsFeatureConfigSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();
      getGenerativeQuestionsFeatureConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listGenerativeQuestionConfigsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateGenerativeQuestionConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      batchUpdateGenerativeQuestionConfigsSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              updateGenerativeQuestionsFeatureConfigSettings,
              getGenerativeQuestionsFeatureConfigSettings,
              listGenerativeQuestionConfigsSettings,
              updateGenerativeQuestionConfigSettings,
              batchUpdateGenerativeQuestionConfigsSettings);
      initDefaults(this);
    }

    protected Builder(GenerativeQuestionServiceStubSettings settings) {
      super(settings);

      updateGenerativeQuestionsFeatureConfigSettings =
          settings.updateGenerativeQuestionsFeatureConfigSettings.toBuilder();
      getGenerativeQuestionsFeatureConfigSettings =
          settings.getGenerativeQuestionsFeatureConfigSettings.toBuilder();
      listGenerativeQuestionConfigsSettings =
          settings.listGenerativeQuestionConfigsSettings.toBuilder();
      updateGenerativeQuestionConfigSettings =
          settings.updateGenerativeQuestionConfigSettings.toBuilder();
      batchUpdateGenerativeQuestionConfigsSettings =
          settings.batchUpdateGenerativeQuestionConfigsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              updateGenerativeQuestionsFeatureConfigSettings,
              getGenerativeQuestionsFeatureConfigSettings,
              listGenerativeQuestionConfigsSettings,
              updateGenerativeQuestionConfigSettings,
              batchUpdateGenerativeQuestionConfigsSettings);
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
          .updateGenerativeQuestionsFeatureConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getGenerativeQuestionsFeatureConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listGenerativeQuestionConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .updateGenerativeQuestionConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .batchUpdateGenerativeQuestionConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

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

    /**
     * Returns the builder for the settings used for calls to
     * updateGenerativeQuestionsFeatureConfig.
     */
    public UnaryCallSettings.Builder<
            UpdateGenerativeQuestionsFeatureConfigRequest, GenerativeQuestionsFeatureConfig>
        updateGenerativeQuestionsFeatureConfigSettings() {
      return updateGenerativeQuestionsFeatureConfigSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getGenerativeQuestionsFeatureConfig.
     */
    public UnaryCallSettings.Builder<
            GetGenerativeQuestionsFeatureConfigRequest, GenerativeQuestionsFeatureConfig>
        getGenerativeQuestionsFeatureConfigSettings() {
      return getGenerativeQuestionsFeatureConfigSettings;
    }

    /** Returns the builder for the settings used for calls to listGenerativeQuestionConfigs. */
    public UnaryCallSettings.Builder<
            ListGenerativeQuestionConfigsRequest, ListGenerativeQuestionConfigsResponse>
        listGenerativeQuestionConfigsSettings() {
      return listGenerativeQuestionConfigsSettings;
    }

    /** Returns the builder for the settings used for calls to updateGenerativeQuestionConfig. */
    public UnaryCallSettings.Builder<
            UpdateGenerativeQuestionConfigRequest, GenerativeQuestionConfig>
        updateGenerativeQuestionConfigSettings() {
      return updateGenerativeQuestionConfigSettings;
    }

    /**
     * Returns the builder for the settings used for calls to batchUpdateGenerativeQuestionConfigs.
     */
    public UnaryCallSettings.Builder<
            BatchUpdateGenerativeQuestionConfigsRequest,
            BatchUpdateGenerativeQuestionConfigsResponse>
        batchUpdateGenerativeQuestionConfigsSettings() {
      return batchUpdateGenerativeQuestionConfigsSettings;
    }

    @Override
    public GenerativeQuestionServiceStubSettings build() throws IOException {
      return new GenerativeQuestionServiceStubSettings(this);
    }
  }
}
