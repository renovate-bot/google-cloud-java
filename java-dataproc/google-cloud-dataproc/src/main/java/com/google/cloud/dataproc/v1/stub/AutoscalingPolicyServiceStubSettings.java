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

package com.google.cloud.dataproc.v1.stub;

import static com.google.cloud.dataproc.v1.AutoscalingPolicyServiceClient.ListAutoscalingPoliciesPagedResponse;

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
import com.google.cloud.dataproc.v1.AutoscalingPolicy;
import com.google.cloud.dataproc.v1.CreateAutoscalingPolicyRequest;
import com.google.cloud.dataproc.v1.DeleteAutoscalingPolicyRequest;
import com.google.cloud.dataproc.v1.GetAutoscalingPolicyRequest;
import com.google.cloud.dataproc.v1.ListAutoscalingPoliciesRequest;
import com.google.cloud.dataproc.v1.ListAutoscalingPoliciesResponse;
import com.google.cloud.dataproc.v1.UpdateAutoscalingPolicyRequest;
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
 * Settings class to configure an instance of {@link AutoscalingPolicyServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (dataproc.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of createAutoscalingPolicy:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AutoscalingPolicyServiceStubSettings.Builder autoscalingPolicyServiceSettingsBuilder =
 *     AutoscalingPolicyServiceStubSettings.newBuilder();
 * autoscalingPolicyServiceSettingsBuilder
 *     .createAutoscalingPolicySettings()
 *     .setRetrySettings(
 *         autoscalingPolicyServiceSettingsBuilder
 *             .createAutoscalingPolicySettings()
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
 * AutoscalingPolicyServiceStubSettings autoscalingPolicyServiceSettings =
 *     autoscalingPolicyServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@Generated("by gapic-generator-java")
public class AutoscalingPolicyServiceStubSettings
    extends StubSettings<AutoscalingPolicyServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<CreateAutoscalingPolicyRequest, AutoscalingPolicy>
      createAutoscalingPolicySettings;
  private final UnaryCallSettings<UpdateAutoscalingPolicyRequest, AutoscalingPolicy>
      updateAutoscalingPolicySettings;
  private final UnaryCallSettings<GetAutoscalingPolicyRequest, AutoscalingPolicy>
      getAutoscalingPolicySettings;
  private final PagedCallSettings<
          ListAutoscalingPoliciesRequest,
          ListAutoscalingPoliciesResponse,
          ListAutoscalingPoliciesPagedResponse>
      listAutoscalingPoliciesSettings;
  private final UnaryCallSettings<DeleteAutoscalingPolicyRequest, Empty>
      deleteAutoscalingPolicySettings;
  private final UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings;
  private final UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings;
  private final UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings;

  private static final PagedListDescriptor<
          ListAutoscalingPoliciesRequest, ListAutoscalingPoliciesResponse, AutoscalingPolicy>
      LIST_AUTOSCALING_POLICIES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListAutoscalingPoliciesRequest,
              ListAutoscalingPoliciesResponse,
              AutoscalingPolicy>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListAutoscalingPoliciesRequest injectToken(
                ListAutoscalingPoliciesRequest payload, String token) {
              return ListAutoscalingPoliciesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListAutoscalingPoliciesRequest injectPageSize(
                ListAutoscalingPoliciesRequest payload, int pageSize) {
              return ListAutoscalingPoliciesRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListAutoscalingPoliciesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListAutoscalingPoliciesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<AutoscalingPolicy> extractResources(
                ListAutoscalingPoliciesResponse payload) {
              return payload.getPoliciesList();
            }
          };

  private static final PagedListResponseFactory<
          ListAutoscalingPoliciesRequest,
          ListAutoscalingPoliciesResponse,
          ListAutoscalingPoliciesPagedResponse>
      LIST_AUTOSCALING_POLICIES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListAutoscalingPoliciesRequest,
              ListAutoscalingPoliciesResponse,
              ListAutoscalingPoliciesPagedResponse>() {
            @Override
            public ApiFuture<ListAutoscalingPoliciesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListAutoscalingPoliciesRequest, ListAutoscalingPoliciesResponse>
                    callable,
                ListAutoscalingPoliciesRequest request,
                ApiCallContext context,
                ApiFuture<ListAutoscalingPoliciesResponse> futureResponse) {
              PageContext<
                      ListAutoscalingPoliciesRequest,
                      ListAutoscalingPoliciesResponse,
                      AutoscalingPolicy>
                  pageContext =
                      PageContext.create(
                          callable, LIST_AUTOSCALING_POLICIES_PAGE_STR_DESC, request, context);
              return ListAutoscalingPoliciesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to createAutoscalingPolicy. */
  public UnaryCallSettings<CreateAutoscalingPolicyRequest, AutoscalingPolicy>
      createAutoscalingPolicySettings() {
    return createAutoscalingPolicySettings;
  }

  /** Returns the object with the settings used for calls to updateAutoscalingPolicy. */
  public UnaryCallSettings<UpdateAutoscalingPolicyRequest, AutoscalingPolicy>
      updateAutoscalingPolicySettings() {
    return updateAutoscalingPolicySettings;
  }

  /** Returns the object with the settings used for calls to getAutoscalingPolicy. */
  public UnaryCallSettings<GetAutoscalingPolicyRequest, AutoscalingPolicy>
      getAutoscalingPolicySettings() {
    return getAutoscalingPolicySettings;
  }

  /** Returns the object with the settings used for calls to listAutoscalingPolicies. */
  public PagedCallSettings<
          ListAutoscalingPoliciesRequest,
          ListAutoscalingPoliciesResponse,
          ListAutoscalingPoliciesPagedResponse>
      listAutoscalingPoliciesSettings() {
    return listAutoscalingPoliciesSettings;
  }

  /** Returns the object with the settings used for calls to deleteAutoscalingPolicy. */
  public UnaryCallSettings<DeleteAutoscalingPolicyRequest, Empty>
      deleteAutoscalingPolicySettings() {
    return deleteAutoscalingPolicySettings;
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return setIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return getIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return testIamPermissionsSettings;
  }

  public AutoscalingPolicyServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcAutoscalingPolicyServiceStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonAutoscalingPolicyServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "dataproc";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "dataproc.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "dataproc.mtls.googleapis.com:443";
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
            "gapic", GaxProperties.getLibraryVersion(AutoscalingPolicyServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(AutoscalingPolicyServiceStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return AutoscalingPolicyServiceStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
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

  protected AutoscalingPolicyServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createAutoscalingPolicySettings = settingsBuilder.createAutoscalingPolicySettings().build();
    updateAutoscalingPolicySettings = settingsBuilder.updateAutoscalingPolicySettings().build();
    getAutoscalingPolicySettings = settingsBuilder.getAutoscalingPolicySettings().build();
    listAutoscalingPoliciesSettings = settingsBuilder.listAutoscalingPoliciesSettings().build();
    deleteAutoscalingPolicySettings = settingsBuilder.deleteAutoscalingPolicySettings().build();
    setIamPolicySettings = settingsBuilder.setIamPolicySettings().build();
    getIamPolicySettings = settingsBuilder.getIamPolicySettings().build();
    testIamPermissionsSettings = settingsBuilder.testIamPermissionsSettings().build();
  }

  /** Builder for AutoscalingPolicyServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<AutoscalingPolicyServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateAutoscalingPolicyRequest, AutoscalingPolicy>
        createAutoscalingPolicySettings;
    private final UnaryCallSettings.Builder<UpdateAutoscalingPolicyRequest, AutoscalingPolicy>
        updateAutoscalingPolicySettings;
    private final UnaryCallSettings.Builder<GetAutoscalingPolicyRequest, AutoscalingPolicy>
        getAutoscalingPolicySettings;
    private final PagedCallSettings.Builder<
            ListAutoscalingPoliciesRequest,
            ListAutoscalingPoliciesResponse,
            ListAutoscalingPoliciesPagedResponse>
        listAutoscalingPoliciesSettings;
    private final UnaryCallSettings.Builder<DeleteAutoscalingPolicyRequest, Empty>
        deleteAutoscalingPolicySettings;
    private final UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings;
    private final UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings;
    private final UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_0_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "retry_policy_1_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("no_retry_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeoutDuration(Duration.ofMillis(600000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(600000L))
              .setTotalTimeoutDuration(Duration.ofMillis(600000L))
              .build();
      definitions.put("no_retry_0_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(60000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(600000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(600000L))
              .setTotalTimeoutDuration(Duration.ofMillis(600000L))
              .build();
      definitions.put("retry_policy_1_params", settings);
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createAutoscalingPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateAutoscalingPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getAutoscalingPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listAutoscalingPoliciesSettings =
          PagedCallSettings.newBuilder(LIST_AUTOSCALING_POLICIES_PAGE_STR_FACT);
      deleteAutoscalingPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      testIamPermissionsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createAutoscalingPolicySettings,
              updateAutoscalingPolicySettings,
              getAutoscalingPolicySettings,
              listAutoscalingPoliciesSettings,
              deleteAutoscalingPolicySettings,
              setIamPolicySettings,
              getIamPolicySettings,
              testIamPermissionsSettings);
      initDefaults(this);
    }

    protected Builder(AutoscalingPolicyServiceStubSettings settings) {
      super(settings);

      createAutoscalingPolicySettings = settings.createAutoscalingPolicySettings.toBuilder();
      updateAutoscalingPolicySettings = settings.updateAutoscalingPolicySettings.toBuilder();
      getAutoscalingPolicySettings = settings.getAutoscalingPolicySettings.toBuilder();
      listAutoscalingPoliciesSettings = settings.listAutoscalingPoliciesSettings.toBuilder();
      deleteAutoscalingPolicySettings = settings.deleteAutoscalingPolicySettings.toBuilder();
      setIamPolicySettings = settings.setIamPolicySettings.toBuilder();
      getIamPolicySettings = settings.getIamPolicySettings.toBuilder();
      testIamPermissionsSettings = settings.testIamPermissionsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createAutoscalingPolicySettings,
              updateAutoscalingPolicySettings,
              getAutoscalingPolicySettings,
              listAutoscalingPoliciesSettings,
              deleteAutoscalingPolicySettings,
              setIamPolicySettings,
              getIamPolicySettings,
              testIamPermissionsSettings);
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
          .createAutoscalingPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .updateAutoscalingPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .getAutoscalingPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .listAutoscalingPoliciesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .deleteAutoscalingPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .setIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .testIamPermissionsSettings()
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

    /** Returns the builder for the settings used for calls to createAutoscalingPolicy. */
    public UnaryCallSettings.Builder<CreateAutoscalingPolicyRequest, AutoscalingPolicy>
        createAutoscalingPolicySettings() {
      return createAutoscalingPolicySettings;
    }

    /** Returns the builder for the settings used for calls to updateAutoscalingPolicy. */
    public UnaryCallSettings.Builder<UpdateAutoscalingPolicyRequest, AutoscalingPolicy>
        updateAutoscalingPolicySettings() {
      return updateAutoscalingPolicySettings;
    }

    /** Returns the builder for the settings used for calls to getAutoscalingPolicy. */
    public UnaryCallSettings.Builder<GetAutoscalingPolicyRequest, AutoscalingPolicy>
        getAutoscalingPolicySettings() {
      return getAutoscalingPolicySettings;
    }

    /** Returns the builder for the settings used for calls to listAutoscalingPolicies. */
    public PagedCallSettings.Builder<
            ListAutoscalingPoliciesRequest,
            ListAutoscalingPoliciesResponse,
            ListAutoscalingPoliciesPagedResponse>
        listAutoscalingPoliciesSettings() {
      return listAutoscalingPoliciesSettings;
    }

    /** Returns the builder for the settings used for calls to deleteAutoscalingPolicy. */
    public UnaryCallSettings.Builder<DeleteAutoscalingPolicyRequest, Empty>
        deleteAutoscalingPolicySettings() {
      return deleteAutoscalingPolicySettings;
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return setIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return testIamPermissionsSettings;
    }

    @Override
    public AutoscalingPolicyServiceStubSettings build() throws IOException {
      return new AutoscalingPolicyServiceStubSettings(this);
    }
  }
}
