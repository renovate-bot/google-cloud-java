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

package com.google.cloud.dialogflow.cx.v3;

import static com.google.cloud.dialogflow.cx.v3.EnvironmentsClient.ListContinuousTestResultsPagedResponse;
import static com.google.cloud.dialogflow.cx.v3.EnvironmentsClient.ListEnvironmentsPagedResponse;
import static com.google.cloud.dialogflow.cx.v3.EnvironmentsClient.ListLocationsPagedResponse;
import static com.google.cloud.dialogflow.cx.v3.EnvironmentsClient.LookupEnvironmentHistoryPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.dialogflow.cx.v3.stub.EnvironmentsStubSettings;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.Struct;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link EnvironmentsClient}.
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
 * EnvironmentsSettings.Builder environmentsSettingsBuilder = EnvironmentsSettings.newBuilder();
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
 * EnvironmentsSettings environmentsSettings = environmentsSettingsBuilder.build();
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
 * EnvironmentsSettings.Builder environmentsSettingsBuilder = EnvironmentsSettings.newBuilder();
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
public class EnvironmentsSettings extends ClientSettings<EnvironmentsSettings> {

  /** Returns the object with the settings used for calls to listEnvironments. */
  public PagedCallSettings<
          ListEnvironmentsRequest, ListEnvironmentsResponse, ListEnvironmentsPagedResponse>
      listEnvironmentsSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).listEnvironmentsSettings();
  }

  /** Returns the object with the settings used for calls to getEnvironment. */
  public UnaryCallSettings<GetEnvironmentRequest, Environment> getEnvironmentSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).getEnvironmentSettings();
  }

  /** Returns the object with the settings used for calls to createEnvironment. */
  public UnaryCallSettings<CreateEnvironmentRequest, Operation> createEnvironmentSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).createEnvironmentSettings();
  }

  /** Returns the object with the settings used for calls to createEnvironment. */
  public OperationCallSettings<CreateEnvironmentRequest, Environment, Struct>
      createEnvironmentOperationSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).createEnvironmentOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateEnvironment. */
  public UnaryCallSettings<UpdateEnvironmentRequest, Operation> updateEnvironmentSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).updateEnvironmentSettings();
  }

  /** Returns the object with the settings used for calls to updateEnvironment. */
  public OperationCallSettings<UpdateEnvironmentRequest, Environment, Struct>
      updateEnvironmentOperationSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).updateEnvironmentOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteEnvironment. */
  public UnaryCallSettings<DeleteEnvironmentRequest, Empty> deleteEnvironmentSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).deleteEnvironmentSettings();
  }

  /** Returns the object with the settings used for calls to lookupEnvironmentHistory. */
  public PagedCallSettings<
          LookupEnvironmentHistoryRequest,
          LookupEnvironmentHistoryResponse,
          LookupEnvironmentHistoryPagedResponse>
      lookupEnvironmentHistorySettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).lookupEnvironmentHistorySettings();
  }

  /** Returns the object with the settings used for calls to runContinuousTest. */
  public UnaryCallSettings<RunContinuousTestRequest, Operation> runContinuousTestSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).runContinuousTestSettings();
  }

  /** Returns the object with the settings used for calls to runContinuousTest. */
  public OperationCallSettings<
          RunContinuousTestRequest, RunContinuousTestResponse, RunContinuousTestMetadata>
      runContinuousTestOperationSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).runContinuousTestOperationSettings();
  }

  /** Returns the object with the settings used for calls to listContinuousTestResults. */
  public PagedCallSettings<
          ListContinuousTestResultsRequest,
          ListContinuousTestResultsResponse,
          ListContinuousTestResultsPagedResponse>
      listContinuousTestResultsSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).listContinuousTestResultsSettings();
  }

  /** Returns the object with the settings used for calls to deployFlow. */
  public UnaryCallSettings<DeployFlowRequest, Operation> deployFlowSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).deployFlowSettings();
  }

  /** Returns the object with the settings used for calls to deployFlow. */
  public OperationCallSettings<DeployFlowRequest, DeployFlowResponse, DeployFlowMetadata>
      deployFlowOperationSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).deployFlowOperationSettings();
  }

  /** Returns the object with the settings used for calls to listLocations. */
  public PagedCallSettings<ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).listLocationsSettings();
  }

  /** Returns the object with the settings used for calls to getLocation. */
  public UnaryCallSettings<GetLocationRequest, Location> getLocationSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).getLocationSettings();
  }

  public static final EnvironmentsSettings create(EnvironmentsStubSettings stub)
      throws IOException {
    return new EnvironmentsSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return EnvironmentsStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return EnvironmentsStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return EnvironmentsStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return EnvironmentsStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return EnvironmentsStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return EnvironmentsStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return EnvironmentsStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return EnvironmentsStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected EnvironmentsSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for EnvironmentsSettings. */
  public static class Builder extends ClientSettings.Builder<EnvironmentsSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(EnvironmentsStubSettings.newBuilder(clientContext));
    }

    protected Builder(EnvironmentsSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(EnvironmentsStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(EnvironmentsStubSettings.newBuilder());
    }

    private static Builder createHttpJsonDefault() {
      return new Builder(EnvironmentsStubSettings.newHttpJsonBuilder());
    }

    public EnvironmentsStubSettings.Builder getStubSettingsBuilder() {
      return ((EnvironmentsStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to listEnvironments. */
    public PagedCallSettings.Builder<
            ListEnvironmentsRequest, ListEnvironmentsResponse, ListEnvironmentsPagedResponse>
        listEnvironmentsSettings() {
      return getStubSettingsBuilder().listEnvironmentsSettings();
    }

    /** Returns the builder for the settings used for calls to getEnvironment. */
    public UnaryCallSettings.Builder<GetEnvironmentRequest, Environment> getEnvironmentSettings() {
      return getStubSettingsBuilder().getEnvironmentSettings();
    }

    /** Returns the builder for the settings used for calls to createEnvironment. */
    public UnaryCallSettings.Builder<CreateEnvironmentRequest, Operation>
        createEnvironmentSettings() {
      return getStubSettingsBuilder().createEnvironmentSettings();
    }

    /** Returns the builder for the settings used for calls to createEnvironment. */
    public OperationCallSettings.Builder<CreateEnvironmentRequest, Environment, Struct>
        createEnvironmentOperationSettings() {
      return getStubSettingsBuilder().createEnvironmentOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateEnvironment. */
    public UnaryCallSettings.Builder<UpdateEnvironmentRequest, Operation>
        updateEnvironmentSettings() {
      return getStubSettingsBuilder().updateEnvironmentSettings();
    }

    /** Returns the builder for the settings used for calls to updateEnvironment. */
    public OperationCallSettings.Builder<UpdateEnvironmentRequest, Environment, Struct>
        updateEnvironmentOperationSettings() {
      return getStubSettingsBuilder().updateEnvironmentOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteEnvironment. */
    public UnaryCallSettings.Builder<DeleteEnvironmentRequest, Empty> deleteEnvironmentSettings() {
      return getStubSettingsBuilder().deleteEnvironmentSettings();
    }

    /** Returns the builder for the settings used for calls to lookupEnvironmentHistory. */
    public PagedCallSettings.Builder<
            LookupEnvironmentHistoryRequest,
            LookupEnvironmentHistoryResponse,
            LookupEnvironmentHistoryPagedResponse>
        lookupEnvironmentHistorySettings() {
      return getStubSettingsBuilder().lookupEnvironmentHistorySettings();
    }

    /** Returns the builder for the settings used for calls to runContinuousTest. */
    public UnaryCallSettings.Builder<RunContinuousTestRequest, Operation>
        runContinuousTestSettings() {
      return getStubSettingsBuilder().runContinuousTestSettings();
    }

    /** Returns the builder for the settings used for calls to runContinuousTest. */
    public OperationCallSettings.Builder<
            RunContinuousTestRequest, RunContinuousTestResponse, RunContinuousTestMetadata>
        runContinuousTestOperationSettings() {
      return getStubSettingsBuilder().runContinuousTestOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listContinuousTestResults. */
    public PagedCallSettings.Builder<
            ListContinuousTestResultsRequest,
            ListContinuousTestResultsResponse,
            ListContinuousTestResultsPagedResponse>
        listContinuousTestResultsSettings() {
      return getStubSettingsBuilder().listContinuousTestResultsSettings();
    }

    /** Returns the builder for the settings used for calls to deployFlow. */
    public UnaryCallSettings.Builder<DeployFlowRequest, Operation> deployFlowSettings() {
      return getStubSettingsBuilder().deployFlowSettings();
    }

    /** Returns the builder for the settings used for calls to deployFlow. */
    public OperationCallSettings.Builder<DeployFlowRequest, DeployFlowResponse, DeployFlowMetadata>
        deployFlowOperationSettings() {
      return getStubSettingsBuilder().deployFlowOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listLocations. */
    public PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings() {
      return getStubSettingsBuilder().listLocationsSettings();
    }

    /** Returns the builder for the settings used for calls to getLocation. */
    public UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings() {
      return getStubSettingsBuilder().getLocationSettings();
    }

    @Override
    public EnvironmentsSettings build() throws IOException {
      return new EnvironmentsSettings(this);
    }
  }
}
