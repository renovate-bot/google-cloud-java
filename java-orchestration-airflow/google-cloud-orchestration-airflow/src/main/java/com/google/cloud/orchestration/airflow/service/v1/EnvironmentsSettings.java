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

package com.google.cloud.orchestration.airflow.service.v1;

import static com.google.cloud.orchestration.airflow.service.v1.EnvironmentsClient.ListEnvironmentsPagedResponse;
import static com.google.cloud.orchestration.airflow.service.v1.EnvironmentsClient.ListUserWorkloadsConfigMapsPagedResponse;
import static com.google.cloud.orchestration.airflow.service.v1.EnvironmentsClient.ListUserWorkloadsSecretsPagedResponse;
import static com.google.cloud.orchestration.airflow.service.v1.EnvironmentsClient.ListWorkloadsPagedResponse;

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
import com.google.cloud.orchestration.airflow.service.v1.stub.EnvironmentsStubSettings;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
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
 *   <li>The default service address (composer.googleapis.com) and default port (443) are used.
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

  /** Returns the object with the settings used for calls to createEnvironment. */
  public UnaryCallSettings<CreateEnvironmentRequest, Operation> createEnvironmentSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).createEnvironmentSettings();
  }

  /** Returns the object with the settings used for calls to createEnvironment. */
  public OperationCallSettings<CreateEnvironmentRequest, Environment, OperationMetadata>
      createEnvironmentOperationSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).createEnvironmentOperationSettings();
  }

  /** Returns the object with the settings used for calls to getEnvironment. */
  public UnaryCallSettings<GetEnvironmentRequest, Environment> getEnvironmentSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).getEnvironmentSettings();
  }

  /** Returns the object with the settings used for calls to listEnvironments. */
  public PagedCallSettings<
          ListEnvironmentsRequest, ListEnvironmentsResponse, ListEnvironmentsPagedResponse>
      listEnvironmentsSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).listEnvironmentsSettings();
  }

  /** Returns the object with the settings used for calls to updateEnvironment. */
  public UnaryCallSettings<UpdateEnvironmentRequest, Operation> updateEnvironmentSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).updateEnvironmentSettings();
  }

  /** Returns the object with the settings used for calls to updateEnvironment. */
  public OperationCallSettings<UpdateEnvironmentRequest, Environment, OperationMetadata>
      updateEnvironmentOperationSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).updateEnvironmentOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteEnvironment. */
  public UnaryCallSettings<DeleteEnvironmentRequest, Operation> deleteEnvironmentSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).deleteEnvironmentSettings();
  }

  /** Returns the object with the settings used for calls to deleteEnvironment. */
  public OperationCallSettings<DeleteEnvironmentRequest, Empty, OperationMetadata>
      deleteEnvironmentOperationSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).deleteEnvironmentOperationSettings();
  }

  /** Returns the object with the settings used for calls to executeAirflowCommand. */
  public UnaryCallSettings<ExecuteAirflowCommandRequest, ExecuteAirflowCommandResponse>
      executeAirflowCommandSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).executeAirflowCommandSettings();
  }

  /** Returns the object with the settings used for calls to stopAirflowCommand. */
  public UnaryCallSettings<StopAirflowCommandRequest, StopAirflowCommandResponse>
      stopAirflowCommandSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).stopAirflowCommandSettings();
  }

  /** Returns the object with the settings used for calls to pollAirflowCommand. */
  public UnaryCallSettings<PollAirflowCommandRequest, PollAirflowCommandResponse>
      pollAirflowCommandSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).pollAirflowCommandSettings();
  }

  /** Returns the object with the settings used for calls to listWorkloads. */
  public PagedCallSettings<ListWorkloadsRequest, ListWorkloadsResponse, ListWorkloadsPagedResponse>
      listWorkloadsSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).listWorkloadsSettings();
  }

  /** Returns the object with the settings used for calls to checkUpgrade. */
  public UnaryCallSettings<CheckUpgradeRequest, Operation> checkUpgradeSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).checkUpgradeSettings();
  }

  /** Returns the object with the settings used for calls to checkUpgrade. */
  public OperationCallSettings<CheckUpgradeRequest, CheckUpgradeResponse, OperationMetadata>
      checkUpgradeOperationSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).checkUpgradeOperationSettings();
  }

  /** Returns the object with the settings used for calls to createUserWorkloadsSecret. */
  public UnaryCallSettings<CreateUserWorkloadsSecretRequest, UserWorkloadsSecret>
      createUserWorkloadsSecretSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).createUserWorkloadsSecretSettings();
  }

  /** Returns the object with the settings used for calls to getUserWorkloadsSecret. */
  public UnaryCallSettings<GetUserWorkloadsSecretRequest, UserWorkloadsSecret>
      getUserWorkloadsSecretSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).getUserWorkloadsSecretSettings();
  }

  /** Returns the object with the settings used for calls to listUserWorkloadsSecrets. */
  public PagedCallSettings<
          ListUserWorkloadsSecretsRequest,
          ListUserWorkloadsSecretsResponse,
          ListUserWorkloadsSecretsPagedResponse>
      listUserWorkloadsSecretsSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).listUserWorkloadsSecretsSettings();
  }

  /** Returns the object with the settings used for calls to updateUserWorkloadsSecret. */
  public UnaryCallSettings<UpdateUserWorkloadsSecretRequest, UserWorkloadsSecret>
      updateUserWorkloadsSecretSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).updateUserWorkloadsSecretSettings();
  }

  /** Returns the object with the settings used for calls to deleteUserWorkloadsSecret. */
  public UnaryCallSettings<DeleteUserWorkloadsSecretRequest, Empty>
      deleteUserWorkloadsSecretSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).deleteUserWorkloadsSecretSettings();
  }

  /** Returns the object with the settings used for calls to createUserWorkloadsConfigMap. */
  public UnaryCallSettings<CreateUserWorkloadsConfigMapRequest, UserWorkloadsConfigMap>
      createUserWorkloadsConfigMapSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).createUserWorkloadsConfigMapSettings();
  }

  /** Returns the object with the settings used for calls to getUserWorkloadsConfigMap. */
  public UnaryCallSettings<GetUserWorkloadsConfigMapRequest, UserWorkloadsConfigMap>
      getUserWorkloadsConfigMapSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).getUserWorkloadsConfigMapSettings();
  }

  /** Returns the object with the settings used for calls to listUserWorkloadsConfigMaps. */
  public PagedCallSettings<
          ListUserWorkloadsConfigMapsRequest,
          ListUserWorkloadsConfigMapsResponse,
          ListUserWorkloadsConfigMapsPagedResponse>
      listUserWorkloadsConfigMapsSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).listUserWorkloadsConfigMapsSettings();
  }

  /** Returns the object with the settings used for calls to updateUserWorkloadsConfigMap. */
  public UnaryCallSettings<UpdateUserWorkloadsConfigMapRequest, UserWorkloadsConfigMap>
      updateUserWorkloadsConfigMapSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).updateUserWorkloadsConfigMapSettings();
  }

  /** Returns the object with the settings used for calls to deleteUserWorkloadsConfigMap. */
  public UnaryCallSettings<DeleteUserWorkloadsConfigMapRequest, Empty>
      deleteUserWorkloadsConfigMapSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).deleteUserWorkloadsConfigMapSettings();
  }

  /** Returns the object with the settings used for calls to saveSnapshot. */
  public UnaryCallSettings<SaveSnapshotRequest, Operation> saveSnapshotSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).saveSnapshotSettings();
  }

  /** Returns the object with the settings used for calls to saveSnapshot. */
  public OperationCallSettings<SaveSnapshotRequest, SaveSnapshotResponse, OperationMetadata>
      saveSnapshotOperationSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).saveSnapshotOperationSettings();
  }

  /** Returns the object with the settings used for calls to loadSnapshot. */
  public UnaryCallSettings<LoadSnapshotRequest, Operation> loadSnapshotSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).loadSnapshotSettings();
  }

  /** Returns the object with the settings used for calls to loadSnapshot. */
  public OperationCallSettings<LoadSnapshotRequest, LoadSnapshotResponse, OperationMetadata>
      loadSnapshotOperationSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).loadSnapshotOperationSettings();
  }

  /** Returns the object with the settings used for calls to databaseFailover. */
  public UnaryCallSettings<DatabaseFailoverRequest, Operation> databaseFailoverSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).databaseFailoverSettings();
  }

  /** Returns the object with the settings used for calls to databaseFailover. */
  public OperationCallSettings<DatabaseFailoverRequest, DatabaseFailoverResponse, OperationMetadata>
      databaseFailoverOperationSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).databaseFailoverOperationSettings();
  }

  /** Returns the object with the settings used for calls to fetchDatabaseProperties. */
  public UnaryCallSettings<FetchDatabasePropertiesRequest, FetchDatabasePropertiesResponse>
      fetchDatabasePropertiesSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).fetchDatabasePropertiesSettings();
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

    /** Returns the builder for the settings used for calls to createEnvironment. */
    public UnaryCallSettings.Builder<CreateEnvironmentRequest, Operation>
        createEnvironmentSettings() {
      return getStubSettingsBuilder().createEnvironmentSettings();
    }

    /** Returns the builder for the settings used for calls to createEnvironment. */
    public OperationCallSettings.Builder<CreateEnvironmentRequest, Environment, OperationMetadata>
        createEnvironmentOperationSettings() {
      return getStubSettingsBuilder().createEnvironmentOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getEnvironment. */
    public UnaryCallSettings.Builder<GetEnvironmentRequest, Environment> getEnvironmentSettings() {
      return getStubSettingsBuilder().getEnvironmentSettings();
    }

    /** Returns the builder for the settings used for calls to listEnvironments. */
    public PagedCallSettings.Builder<
            ListEnvironmentsRequest, ListEnvironmentsResponse, ListEnvironmentsPagedResponse>
        listEnvironmentsSettings() {
      return getStubSettingsBuilder().listEnvironmentsSettings();
    }

    /** Returns the builder for the settings used for calls to updateEnvironment. */
    public UnaryCallSettings.Builder<UpdateEnvironmentRequest, Operation>
        updateEnvironmentSettings() {
      return getStubSettingsBuilder().updateEnvironmentSettings();
    }

    /** Returns the builder for the settings used for calls to updateEnvironment. */
    public OperationCallSettings.Builder<UpdateEnvironmentRequest, Environment, OperationMetadata>
        updateEnvironmentOperationSettings() {
      return getStubSettingsBuilder().updateEnvironmentOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteEnvironment. */
    public UnaryCallSettings.Builder<DeleteEnvironmentRequest, Operation>
        deleteEnvironmentSettings() {
      return getStubSettingsBuilder().deleteEnvironmentSettings();
    }

    /** Returns the builder for the settings used for calls to deleteEnvironment. */
    public OperationCallSettings.Builder<DeleteEnvironmentRequest, Empty, OperationMetadata>
        deleteEnvironmentOperationSettings() {
      return getStubSettingsBuilder().deleteEnvironmentOperationSettings();
    }

    /** Returns the builder for the settings used for calls to executeAirflowCommand. */
    public UnaryCallSettings.Builder<ExecuteAirflowCommandRequest, ExecuteAirflowCommandResponse>
        executeAirflowCommandSettings() {
      return getStubSettingsBuilder().executeAirflowCommandSettings();
    }

    /** Returns the builder for the settings used for calls to stopAirflowCommand. */
    public UnaryCallSettings.Builder<StopAirflowCommandRequest, StopAirflowCommandResponse>
        stopAirflowCommandSettings() {
      return getStubSettingsBuilder().stopAirflowCommandSettings();
    }

    /** Returns the builder for the settings used for calls to pollAirflowCommand. */
    public UnaryCallSettings.Builder<PollAirflowCommandRequest, PollAirflowCommandResponse>
        pollAirflowCommandSettings() {
      return getStubSettingsBuilder().pollAirflowCommandSettings();
    }

    /** Returns the builder for the settings used for calls to listWorkloads. */
    public PagedCallSettings.Builder<
            ListWorkloadsRequest, ListWorkloadsResponse, ListWorkloadsPagedResponse>
        listWorkloadsSettings() {
      return getStubSettingsBuilder().listWorkloadsSettings();
    }

    /** Returns the builder for the settings used for calls to checkUpgrade. */
    public UnaryCallSettings.Builder<CheckUpgradeRequest, Operation> checkUpgradeSettings() {
      return getStubSettingsBuilder().checkUpgradeSettings();
    }

    /** Returns the builder for the settings used for calls to checkUpgrade. */
    public OperationCallSettings.Builder<
            CheckUpgradeRequest, CheckUpgradeResponse, OperationMetadata>
        checkUpgradeOperationSettings() {
      return getStubSettingsBuilder().checkUpgradeOperationSettings();
    }

    /** Returns the builder for the settings used for calls to createUserWorkloadsSecret. */
    public UnaryCallSettings.Builder<CreateUserWorkloadsSecretRequest, UserWorkloadsSecret>
        createUserWorkloadsSecretSettings() {
      return getStubSettingsBuilder().createUserWorkloadsSecretSettings();
    }

    /** Returns the builder for the settings used for calls to getUserWorkloadsSecret. */
    public UnaryCallSettings.Builder<GetUserWorkloadsSecretRequest, UserWorkloadsSecret>
        getUserWorkloadsSecretSettings() {
      return getStubSettingsBuilder().getUserWorkloadsSecretSettings();
    }

    /** Returns the builder for the settings used for calls to listUserWorkloadsSecrets. */
    public PagedCallSettings.Builder<
            ListUserWorkloadsSecretsRequest,
            ListUserWorkloadsSecretsResponse,
            ListUserWorkloadsSecretsPagedResponse>
        listUserWorkloadsSecretsSettings() {
      return getStubSettingsBuilder().listUserWorkloadsSecretsSettings();
    }

    /** Returns the builder for the settings used for calls to updateUserWorkloadsSecret. */
    public UnaryCallSettings.Builder<UpdateUserWorkloadsSecretRequest, UserWorkloadsSecret>
        updateUserWorkloadsSecretSettings() {
      return getStubSettingsBuilder().updateUserWorkloadsSecretSettings();
    }

    /** Returns the builder for the settings used for calls to deleteUserWorkloadsSecret. */
    public UnaryCallSettings.Builder<DeleteUserWorkloadsSecretRequest, Empty>
        deleteUserWorkloadsSecretSettings() {
      return getStubSettingsBuilder().deleteUserWorkloadsSecretSettings();
    }

    /** Returns the builder for the settings used for calls to createUserWorkloadsConfigMap. */
    public UnaryCallSettings.Builder<CreateUserWorkloadsConfigMapRequest, UserWorkloadsConfigMap>
        createUserWorkloadsConfigMapSettings() {
      return getStubSettingsBuilder().createUserWorkloadsConfigMapSettings();
    }

    /** Returns the builder for the settings used for calls to getUserWorkloadsConfigMap. */
    public UnaryCallSettings.Builder<GetUserWorkloadsConfigMapRequest, UserWorkloadsConfigMap>
        getUserWorkloadsConfigMapSettings() {
      return getStubSettingsBuilder().getUserWorkloadsConfigMapSettings();
    }

    /** Returns the builder for the settings used for calls to listUserWorkloadsConfigMaps. */
    public PagedCallSettings.Builder<
            ListUserWorkloadsConfigMapsRequest,
            ListUserWorkloadsConfigMapsResponse,
            ListUserWorkloadsConfigMapsPagedResponse>
        listUserWorkloadsConfigMapsSettings() {
      return getStubSettingsBuilder().listUserWorkloadsConfigMapsSettings();
    }

    /** Returns the builder for the settings used for calls to updateUserWorkloadsConfigMap. */
    public UnaryCallSettings.Builder<UpdateUserWorkloadsConfigMapRequest, UserWorkloadsConfigMap>
        updateUserWorkloadsConfigMapSettings() {
      return getStubSettingsBuilder().updateUserWorkloadsConfigMapSettings();
    }

    /** Returns the builder for the settings used for calls to deleteUserWorkloadsConfigMap. */
    public UnaryCallSettings.Builder<DeleteUserWorkloadsConfigMapRequest, Empty>
        deleteUserWorkloadsConfigMapSettings() {
      return getStubSettingsBuilder().deleteUserWorkloadsConfigMapSettings();
    }

    /** Returns the builder for the settings used for calls to saveSnapshot. */
    public UnaryCallSettings.Builder<SaveSnapshotRequest, Operation> saveSnapshotSettings() {
      return getStubSettingsBuilder().saveSnapshotSettings();
    }

    /** Returns the builder for the settings used for calls to saveSnapshot. */
    public OperationCallSettings.Builder<
            SaveSnapshotRequest, SaveSnapshotResponse, OperationMetadata>
        saveSnapshotOperationSettings() {
      return getStubSettingsBuilder().saveSnapshotOperationSettings();
    }

    /** Returns the builder for the settings used for calls to loadSnapshot. */
    public UnaryCallSettings.Builder<LoadSnapshotRequest, Operation> loadSnapshotSettings() {
      return getStubSettingsBuilder().loadSnapshotSettings();
    }

    /** Returns the builder for the settings used for calls to loadSnapshot. */
    public OperationCallSettings.Builder<
            LoadSnapshotRequest, LoadSnapshotResponse, OperationMetadata>
        loadSnapshotOperationSettings() {
      return getStubSettingsBuilder().loadSnapshotOperationSettings();
    }

    /** Returns the builder for the settings used for calls to databaseFailover. */
    public UnaryCallSettings.Builder<DatabaseFailoverRequest, Operation>
        databaseFailoverSettings() {
      return getStubSettingsBuilder().databaseFailoverSettings();
    }

    /** Returns the builder for the settings used for calls to databaseFailover. */
    public OperationCallSettings.Builder<
            DatabaseFailoverRequest, DatabaseFailoverResponse, OperationMetadata>
        databaseFailoverOperationSettings() {
      return getStubSettingsBuilder().databaseFailoverOperationSettings();
    }

    /** Returns the builder for the settings used for calls to fetchDatabaseProperties. */
    public UnaryCallSettings.Builder<
            FetchDatabasePropertiesRequest, FetchDatabasePropertiesResponse>
        fetchDatabasePropertiesSettings() {
      return getStubSettingsBuilder().fetchDatabasePropertiesSettings();
    }

    @Override
    public EnvironmentsSettings build() throws IOException {
      return new EnvironmentsSettings(this);
    }
  }
}
