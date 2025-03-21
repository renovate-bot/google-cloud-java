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

package com.google.cloud.websecurityscanner.v1;

import static com.google.cloud.websecurityscanner.v1.WebSecurityScannerClient.ListCrawledUrlsPagedResponse;
import static com.google.cloud.websecurityscanner.v1.WebSecurityScannerClient.ListFindingsPagedResponse;
import static com.google.cloud.websecurityscanner.v1.WebSecurityScannerClient.ListScanConfigsPagedResponse;
import static com.google.cloud.websecurityscanner.v1.WebSecurityScannerClient.ListScanRunsPagedResponse;

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
import com.google.cloud.websecurityscanner.v1.stub.WebSecurityScannerStubSettings;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link WebSecurityScannerClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (websecurityscanner.googleapis.com) and default port (443) are
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
 * of createScanConfig:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * WebSecurityScannerSettings.Builder webSecurityScannerSettingsBuilder =
 *     WebSecurityScannerSettings.newBuilder();
 * webSecurityScannerSettingsBuilder
 *     .createScanConfigSettings()
 *     .setRetrySettings(
 *         webSecurityScannerSettingsBuilder
 *             .createScanConfigSettings()
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
 * WebSecurityScannerSettings webSecurityScannerSettings =
 *     webSecurityScannerSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@Generated("by gapic-generator-java")
public class WebSecurityScannerSettings extends ClientSettings<WebSecurityScannerSettings> {

  /** Returns the object with the settings used for calls to createScanConfig. */
  public UnaryCallSettings<CreateScanConfigRequest, ScanConfig> createScanConfigSettings() {
    return ((WebSecurityScannerStubSettings) getStubSettings()).createScanConfigSettings();
  }

  /** Returns the object with the settings used for calls to deleteScanConfig. */
  public UnaryCallSettings<DeleteScanConfigRequest, Empty> deleteScanConfigSettings() {
    return ((WebSecurityScannerStubSettings) getStubSettings()).deleteScanConfigSettings();
  }

  /** Returns the object with the settings used for calls to getScanConfig. */
  public UnaryCallSettings<GetScanConfigRequest, ScanConfig> getScanConfigSettings() {
    return ((WebSecurityScannerStubSettings) getStubSettings()).getScanConfigSettings();
  }

  /** Returns the object with the settings used for calls to listScanConfigs. */
  public PagedCallSettings<
          ListScanConfigsRequest, ListScanConfigsResponse, ListScanConfigsPagedResponse>
      listScanConfigsSettings() {
    return ((WebSecurityScannerStubSettings) getStubSettings()).listScanConfigsSettings();
  }

  /** Returns the object with the settings used for calls to updateScanConfig. */
  public UnaryCallSettings<UpdateScanConfigRequest, ScanConfig> updateScanConfigSettings() {
    return ((WebSecurityScannerStubSettings) getStubSettings()).updateScanConfigSettings();
  }

  /** Returns the object with the settings used for calls to startScanRun. */
  public UnaryCallSettings<StartScanRunRequest, ScanRun> startScanRunSettings() {
    return ((WebSecurityScannerStubSettings) getStubSettings()).startScanRunSettings();
  }

  /** Returns the object with the settings used for calls to getScanRun. */
  public UnaryCallSettings<GetScanRunRequest, ScanRun> getScanRunSettings() {
    return ((WebSecurityScannerStubSettings) getStubSettings()).getScanRunSettings();
  }

  /** Returns the object with the settings used for calls to listScanRuns. */
  public PagedCallSettings<ListScanRunsRequest, ListScanRunsResponse, ListScanRunsPagedResponse>
      listScanRunsSettings() {
    return ((WebSecurityScannerStubSettings) getStubSettings()).listScanRunsSettings();
  }

  /** Returns the object with the settings used for calls to stopScanRun. */
  public UnaryCallSettings<StopScanRunRequest, ScanRun> stopScanRunSettings() {
    return ((WebSecurityScannerStubSettings) getStubSettings()).stopScanRunSettings();
  }

  /** Returns the object with the settings used for calls to listCrawledUrls. */
  public PagedCallSettings<
          ListCrawledUrlsRequest, ListCrawledUrlsResponse, ListCrawledUrlsPagedResponse>
      listCrawledUrlsSettings() {
    return ((WebSecurityScannerStubSettings) getStubSettings()).listCrawledUrlsSettings();
  }

  /** Returns the object with the settings used for calls to getFinding. */
  public UnaryCallSettings<GetFindingRequest, Finding> getFindingSettings() {
    return ((WebSecurityScannerStubSettings) getStubSettings()).getFindingSettings();
  }

  /** Returns the object with the settings used for calls to listFindings. */
  public PagedCallSettings<ListFindingsRequest, ListFindingsResponse, ListFindingsPagedResponse>
      listFindingsSettings() {
    return ((WebSecurityScannerStubSettings) getStubSettings()).listFindingsSettings();
  }

  /** Returns the object with the settings used for calls to listFindingTypeStats. */
  public UnaryCallSettings<ListFindingTypeStatsRequest, ListFindingTypeStatsResponse>
      listFindingTypeStatsSettings() {
    return ((WebSecurityScannerStubSettings) getStubSettings()).listFindingTypeStatsSettings();
  }

  public static final WebSecurityScannerSettings create(WebSecurityScannerStubSettings stub)
      throws IOException {
    return new WebSecurityScannerSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return WebSecurityScannerStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return WebSecurityScannerStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return WebSecurityScannerStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return WebSecurityScannerStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return WebSecurityScannerStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return WebSecurityScannerStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return WebSecurityScannerStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return WebSecurityScannerStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected WebSecurityScannerSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for WebSecurityScannerSettings. */
  public static class Builder extends ClientSettings.Builder<WebSecurityScannerSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(WebSecurityScannerStubSettings.newBuilder(clientContext));
    }

    protected Builder(WebSecurityScannerSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(WebSecurityScannerStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(WebSecurityScannerStubSettings.newBuilder());
    }

    private static Builder createHttpJsonDefault() {
      return new Builder(WebSecurityScannerStubSettings.newHttpJsonBuilder());
    }

    public WebSecurityScannerStubSettings.Builder getStubSettingsBuilder() {
      return ((WebSecurityScannerStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to createScanConfig. */
    public UnaryCallSettings.Builder<CreateScanConfigRequest, ScanConfig>
        createScanConfigSettings() {
      return getStubSettingsBuilder().createScanConfigSettings();
    }

    /** Returns the builder for the settings used for calls to deleteScanConfig. */
    public UnaryCallSettings.Builder<DeleteScanConfigRequest, Empty> deleteScanConfigSettings() {
      return getStubSettingsBuilder().deleteScanConfigSettings();
    }

    /** Returns the builder for the settings used for calls to getScanConfig. */
    public UnaryCallSettings.Builder<GetScanConfigRequest, ScanConfig> getScanConfigSettings() {
      return getStubSettingsBuilder().getScanConfigSettings();
    }

    /** Returns the builder for the settings used for calls to listScanConfigs. */
    public PagedCallSettings.Builder<
            ListScanConfigsRequest, ListScanConfigsResponse, ListScanConfigsPagedResponse>
        listScanConfigsSettings() {
      return getStubSettingsBuilder().listScanConfigsSettings();
    }

    /** Returns the builder for the settings used for calls to updateScanConfig. */
    public UnaryCallSettings.Builder<UpdateScanConfigRequest, ScanConfig>
        updateScanConfigSettings() {
      return getStubSettingsBuilder().updateScanConfigSettings();
    }

    /** Returns the builder for the settings used for calls to startScanRun. */
    public UnaryCallSettings.Builder<StartScanRunRequest, ScanRun> startScanRunSettings() {
      return getStubSettingsBuilder().startScanRunSettings();
    }

    /** Returns the builder for the settings used for calls to getScanRun. */
    public UnaryCallSettings.Builder<GetScanRunRequest, ScanRun> getScanRunSettings() {
      return getStubSettingsBuilder().getScanRunSettings();
    }

    /** Returns the builder for the settings used for calls to listScanRuns. */
    public PagedCallSettings.Builder<
            ListScanRunsRequest, ListScanRunsResponse, ListScanRunsPagedResponse>
        listScanRunsSettings() {
      return getStubSettingsBuilder().listScanRunsSettings();
    }

    /** Returns the builder for the settings used for calls to stopScanRun. */
    public UnaryCallSettings.Builder<StopScanRunRequest, ScanRun> stopScanRunSettings() {
      return getStubSettingsBuilder().stopScanRunSettings();
    }

    /** Returns the builder for the settings used for calls to listCrawledUrls. */
    public PagedCallSettings.Builder<
            ListCrawledUrlsRequest, ListCrawledUrlsResponse, ListCrawledUrlsPagedResponse>
        listCrawledUrlsSettings() {
      return getStubSettingsBuilder().listCrawledUrlsSettings();
    }

    /** Returns the builder for the settings used for calls to getFinding. */
    public UnaryCallSettings.Builder<GetFindingRequest, Finding> getFindingSettings() {
      return getStubSettingsBuilder().getFindingSettings();
    }

    /** Returns the builder for the settings used for calls to listFindings. */
    public PagedCallSettings.Builder<
            ListFindingsRequest, ListFindingsResponse, ListFindingsPagedResponse>
        listFindingsSettings() {
      return getStubSettingsBuilder().listFindingsSettings();
    }

    /** Returns the builder for the settings used for calls to listFindingTypeStats. */
    public UnaryCallSettings.Builder<ListFindingTypeStatsRequest, ListFindingTypeStatsResponse>
        listFindingTypeStatsSettings() {
      return getStubSettingsBuilder().listFindingTypeStatsSettings();
    }

    @Override
    public WebSecurityScannerSettings build() throws IOException {
      return new WebSecurityScannerSettings(this);
    }
  }
}
