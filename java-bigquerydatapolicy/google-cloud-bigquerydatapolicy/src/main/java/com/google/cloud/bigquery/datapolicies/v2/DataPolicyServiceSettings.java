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

package com.google.cloud.bigquery.datapolicies.v2;

import static com.google.cloud.bigquery.datapolicies.v2.DataPolicyServiceClient.ListDataPoliciesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.bigquery.datapolicies.v2.stub.DataPolicyServiceStubSettings;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link DataPolicyServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (bigquerydatapolicy.googleapis.com) and default port (443) are
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
 * of createDataPolicy:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * DataPolicyServiceSettings.Builder dataPolicyServiceSettingsBuilder =
 *     DataPolicyServiceSettings.newBuilder();
 * dataPolicyServiceSettingsBuilder
 *     .createDataPolicySettings()
 *     .setRetrySettings(
 *         dataPolicyServiceSettingsBuilder
 *             .createDataPolicySettings()
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
 * DataPolicyServiceSettings dataPolicyServiceSettings = dataPolicyServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@Generated("by gapic-generator-java")
public class DataPolicyServiceSettings extends ClientSettings<DataPolicyServiceSettings> {

  /** Returns the object with the settings used for calls to createDataPolicy. */
  public UnaryCallSettings<CreateDataPolicyRequest, DataPolicy> createDataPolicySettings() {
    return ((DataPolicyServiceStubSettings) getStubSettings()).createDataPolicySettings();
  }

  /** Returns the object with the settings used for calls to addGrantees. */
  public UnaryCallSettings<AddGranteesRequest, DataPolicy> addGranteesSettings() {
    return ((DataPolicyServiceStubSettings) getStubSettings()).addGranteesSettings();
  }

  /** Returns the object with the settings used for calls to removeGrantees. */
  public UnaryCallSettings<RemoveGranteesRequest, DataPolicy> removeGranteesSettings() {
    return ((DataPolicyServiceStubSettings) getStubSettings()).removeGranteesSettings();
  }

  /** Returns the object with the settings used for calls to updateDataPolicy. */
  public UnaryCallSettings<UpdateDataPolicyRequest, DataPolicy> updateDataPolicySettings() {
    return ((DataPolicyServiceStubSettings) getStubSettings()).updateDataPolicySettings();
  }

  /** Returns the object with the settings used for calls to deleteDataPolicy. */
  public UnaryCallSettings<DeleteDataPolicyRequest, Empty> deleteDataPolicySettings() {
    return ((DataPolicyServiceStubSettings) getStubSettings()).deleteDataPolicySettings();
  }

  /** Returns the object with the settings used for calls to getDataPolicy. */
  public UnaryCallSettings<GetDataPolicyRequest, DataPolicy> getDataPolicySettings() {
    return ((DataPolicyServiceStubSettings) getStubSettings()).getDataPolicySettings();
  }

  /** Returns the object with the settings used for calls to listDataPolicies. */
  public PagedCallSettings<
          ListDataPoliciesRequest, ListDataPoliciesResponse, ListDataPoliciesPagedResponse>
      listDataPoliciesSettings() {
    return ((DataPolicyServiceStubSettings) getStubSettings()).listDataPoliciesSettings();
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return ((DataPolicyServiceStubSettings) getStubSettings()).getIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return ((DataPolicyServiceStubSettings) getStubSettings()).setIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return ((DataPolicyServiceStubSettings) getStubSettings()).testIamPermissionsSettings();
  }

  public static final DataPolicyServiceSettings create(DataPolicyServiceStubSettings stub)
      throws IOException {
    return new DataPolicyServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return DataPolicyServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return DataPolicyServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DataPolicyServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return DataPolicyServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return DataPolicyServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return DataPolicyServiceStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return DataPolicyServiceStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return DataPolicyServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected DataPolicyServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for DataPolicyServiceSettings. */
  public static class Builder extends ClientSettings.Builder<DataPolicyServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(DataPolicyServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(DataPolicyServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(DataPolicyServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(DataPolicyServiceStubSettings.newBuilder());
    }

    private static Builder createHttpJsonDefault() {
      return new Builder(DataPolicyServiceStubSettings.newHttpJsonBuilder());
    }

    public DataPolicyServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((DataPolicyServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to createDataPolicy. */
    public UnaryCallSettings.Builder<CreateDataPolicyRequest, DataPolicy>
        createDataPolicySettings() {
      return getStubSettingsBuilder().createDataPolicySettings();
    }

    /** Returns the builder for the settings used for calls to addGrantees. */
    public UnaryCallSettings.Builder<AddGranteesRequest, DataPolicy> addGranteesSettings() {
      return getStubSettingsBuilder().addGranteesSettings();
    }

    /** Returns the builder for the settings used for calls to removeGrantees. */
    public UnaryCallSettings.Builder<RemoveGranteesRequest, DataPolicy> removeGranteesSettings() {
      return getStubSettingsBuilder().removeGranteesSettings();
    }

    /** Returns the builder for the settings used for calls to updateDataPolicy. */
    public UnaryCallSettings.Builder<UpdateDataPolicyRequest, DataPolicy>
        updateDataPolicySettings() {
      return getStubSettingsBuilder().updateDataPolicySettings();
    }

    /** Returns the builder for the settings used for calls to deleteDataPolicy. */
    public UnaryCallSettings.Builder<DeleteDataPolicyRequest, Empty> deleteDataPolicySettings() {
      return getStubSettingsBuilder().deleteDataPolicySettings();
    }

    /** Returns the builder for the settings used for calls to getDataPolicy. */
    public UnaryCallSettings.Builder<GetDataPolicyRequest, DataPolicy> getDataPolicySettings() {
      return getStubSettingsBuilder().getDataPolicySettings();
    }

    /** Returns the builder for the settings used for calls to listDataPolicies. */
    public PagedCallSettings.Builder<
            ListDataPoliciesRequest, ListDataPoliciesResponse, ListDataPoliciesPagedResponse>
        listDataPoliciesSettings() {
      return getStubSettingsBuilder().listDataPoliciesSettings();
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getStubSettingsBuilder().getIamPolicySettings();
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return getStubSettingsBuilder().setIamPolicySettings();
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return getStubSettingsBuilder().testIamPermissionsSettings();
    }

    @Override
    public DataPolicyServiceSettings build() throws IOException {
      return new DataPolicyServiceSettings(this);
    }
  }
}
