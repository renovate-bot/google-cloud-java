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

package com.google.cloud.datacatalog.v1;

import static com.google.cloud.datacatalog.v1.PolicyTagManagerClient.ListPolicyTagsPagedResponse;
import static com.google.cloud.datacatalog.v1.PolicyTagManagerClient.ListTaxonomiesPagedResponse;

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
import com.google.cloud.datacatalog.v1.stub.PolicyTagManagerStubSettings;
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
 * Settings class to configure an instance of {@link PolicyTagManagerClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (datacatalog.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of createTaxonomy:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * PolicyTagManagerSettings.Builder policyTagManagerSettingsBuilder =
 *     PolicyTagManagerSettings.newBuilder();
 * policyTagManagerSettingsBuilder
 *     .createTaxonomySettings()
 *     .setRetrySettings(
 *         policyTagManagerSettingsBuilder
 *             .createTaxonomySettings()
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
 * PolicyTagManagerSettings policyTagManagerSettings = policyTagManagerSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@Generated("by gapic-generator-java")
public class PolicyTagManagerSettings extends ClientSettings<PolicyTagManagerSettings> {

  /** Returns the object with the settings used for calls to createTaxonomy. */
  public UnaryCallSettings<CreateTaxonomyRequest, Taxonomy> createTaxonomySettings() {
    return ((PolicyTagManagerStubSettings) getStubSettings()).createTaxonomySettings();
  }

  /** Returns the object with the settings used for calls to deleteTaxonomy. */
  public UnaryCallSettings<DeleteTaxonomyRequest, Empty> deleteTaxonomySettings() {
    return ((PolicyTagManagerStubSettings) getStubSettings()).deleteTaxonomySettings();
  }

  /** Returns the object with the settings used for calls to updateTaxonomy. */
  public UnaryCallSettings<UpdateTaxonomyRequest, Taxonomy> updateTaxonomySettings() {
    return ((PolicyTagManagerStubSettings) getStubSettings()).updateTaxonomySettings();
  }

  /** Returns the object with the settings used for calls to listTaxonomies. */
  public PagedCallSettings<
          ListTaxonomiesRequest, ListTaxonomiesResponse, ListTaxonomiesPagedResponse>
      listTaxonomiesSettings() {
    return ((PolicyTagManagerStubSettings) getStubSettings()).listTaxonomiesSettings();
  }

  /** Returns the object with the settings used for calls to getTaxonomy. */
  public UnaryCallSettings<GetTaxonomyRequest, Taxonomy> getTaxonomySettings() {
    return ((PolicyTagManagerStubSettings) getStubSettings()).getTaxonomySettings();
  }

  /** Returns the object with the settings used for calls to createPolicyTag. */
  public UnaryCallSettings<CreatePolicyTagRequest, PolicyTag> createPolicyTagSettings() {
    return ((PolicyTagManagerStubSettings) getStubSettings()).createPolicyTagSettings();
  }

  /** Returns the object with the settings used for calls to deletePolicyTag. */
  public UnaryCallSettings<DeletePolicyTagRequest, Empty> deletePolicyTagSettings() {
    return ((PolicyTagManagerStubSettings) getStubSettings()).deletePolicyTagSettings();
  }

  /** Returns the object with the settings used for calls to updatePolicyTag. */
  public UnaryCallSettings<UpdatePolicyTagRequest, PolicyTag> updatePolicyTagSettings() {
    return ((PolicyTagManagerStubSettings) getStubSettings()).updatePolicyTagSettings();
  }

  /** Returns the object with the settings used for calls to listPolicyTags. */
  public PagedCallSettings<
          ListPolicyTagsRequest, ListPolicyTagsResponse, ListPolicyTagsPagedResponse>
      listPolicyTagsSettings() {
    return ((PolicyTagManagerStubSettings) getStubSettings()).listPolicyTagsSettings();
  }

  /** Returns the object with the settings used for calls to getPolicyTag. */
  public UnaryCallSettings<GetPolicyTagRequest, PolicyTag> getPolicyTagSettings() {
    return ((PolicyTagManagerStubSettings) getStubSettings()).getPolicyTagSettings();
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return ((PolicyTagManagerStubSettings) getStubSettings()).getIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return ((PolicyTagManagerStubSettings) getStubSettings()).setIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return ((PolicyTagManagerStubSettings) getStubSettings()).testIamPermissionsSettings();
  }

  public static final PolicyTagManagerSettings create(PolicyTagManagerStubSettings stub)
      throws IOException {
    return new PolicyTagManagerSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return PolicyTagManagerStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return PolicyTagManagerStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return PolicyTagManagerStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return PolicyTagManagerStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return PolicyTagManagerStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return PolicyTagManagerStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return PolicyTagManagerStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return PolicyTagManagerStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected PolicyTagManagerSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for PolicyTagManagerSettings. */
  public static class Builder extends ClientSettings.Builder<PolicyTagManagerSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(PolicyTagManagerStubSettings.newBuilder(clientContext));
    }

    protected Builder(PolicyTagManagerSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(PolicyTagManagerStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(PolicyTagManagerStubSettings.newBuilder());
    }

    private static Builder createHttpJsonDefault() {
      return new Builder(PolicyTagManagerStubSettings.newHttpJsonBuilder());
    }

    public PolicyTagManagerStubSettings.Builder getStubSettingsBuilder() {
      return ((PolicyTagManagerStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to createTaxonomy. */
    public UnaryCallSettings.Builder<CreateTaxonomyRequest, Taxonomy> createTaxonomySettings() {
      return getStubSettingsBuilder().createTaxonomySettings();
    }

    /** Returns the builder for the settings used for calls to deleteTaxonomy. */
    public UnaryCallSettings.Builder<DeleteTaxonomyRequest, Empty> deleteTaxonomySettings() {
      return getStubSettingsBuilder().deleteTaxonomySettings();
    }

    /** Returns the builder for the settings used for calls to updateTaxonomy. */
    public UnaryCallSettings.Builder<UpdateTaxonomyRequest, Taxonomy> updateTaxonomySettings() {
      return getStubSettingsBuilder().updateTaxonomySettings();
    }

    /** Returns the builder for the settings used for calls to listTaxonomies. */
    public PagedCallSettings.Builder<
            ListTaxonomiesRequest, ListTaxonomiesResponse, ListTaxonomiesPagedResponse>
        listTaxonomiesSettings() {
      return getStubSettingsBuilder().listTaxonomiesSettings();
    }

    /** Returns the builder for the settings used for calls to getTaxonomy. */
    public UnaryCallSettings.Builder<GetTaxonomyRequest, Taxonomy> getTaxonomySettings() {
      return getStubSettingsBuilder().getTaxonomySettings();
    }

    /** Returns the builder for the settings used for calls to createPolicyTag. */
    public UnaryCallSettings.Builder<CreatePolicyTagRequest, PolicyTag> createPolicyTagSettings() {
      return getStubSettingsBuilder().createPolicyTagSettings();
    }

    /** Returns the builder for the settings used for calls to deletePolicyTag. */
    public UnaryCallSettings.Builder<DeletePolicyTagRequest, Empty> deletePolicyTagSettings() {
      return getStubSettingsBuilder().deletePolicyTagSettings();
    }

    /** Returns the builder for the settings used for calls to updatePolicyTag. */
    public UnaryCallSettings.Builder<UpdatePolicyTagRequest, PolicyTag> updatePolicyTagSettings() {
      return getStubSettingsBuilder().updatePolicyTagSettings();
    }

    /** Returns the builder for the settings used for calls to listPolicyTags. */
    public PagedCallSettings.Builder<
            ListPolicyTagsRequest, ListPolicyTagsResponse, ListPolicyTagsPagedResponse>
        listPolicyTagsSettings() {
      return getStubSettingsBuilder().listPolicyTagsSettings();
    }

    /** Returns the builder for the settings used for calls to getPolicyTag. */
    public UnaryCallSettings.Builder<GetPolicyTagRequest, PolicyTag> getPolicyTagSettings() {
      return getStubSettingsBuilder().getPolicyTagSettings();
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
    public PolicyTagManagerSettings build() throws IOException {
      return new PolicyTagManagerSettings(this);
    }
  }
}
