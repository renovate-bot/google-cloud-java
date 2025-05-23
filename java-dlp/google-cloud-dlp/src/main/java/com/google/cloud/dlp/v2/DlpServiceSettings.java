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

package com.google.cloud.dlp.v2;

import static com.google.cloud.dlp.v2.DlpServiceClient.ListColumnDataProfilesPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListConnectionsPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListDeidentifyTemplatesPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListDiscoveryConfigsPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListDlpJobsPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListFileStoreDataProfilesPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListInspectTemplatesPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListJobTriggersPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListProjectDataProfilesPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListStoredInfoTypesPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListTableDataProfilesPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.SearchConnectionsPagedResponse;

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
import com.google.cloud.dlp.v2.stub.DlpServiceStubSettings;
import com.google.privacy.dlp.v2.ActivateJobTriggerRequest;
import com.google.privacy.dlp.v2.CancelDlpJobRequest;
import com.google.privacy.dlp.v2.ColumnDataProfile;
import com.google.privacy.dlp.v2.Connection;
import com.google.privacy.dlp.v2.CreateConnectionRequest;
import com.google.privacy.dlp.v2.CreateDeidentifyTemplateRequest;
import com.google.privacy.dlp.v2.CreateDiscoveryConfigRequest;
import com.google.privacy.dlp.v2.CreateDlpJobRequest;
import com.google.privacy.dlp.v2.CreateInspectTemplateRequest;
import com.google.privacy.dlp.v2.CreateJobTriggerRequest;
import com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest;
import com.google.privacy.dlp.v2.DeidentifyContentRequest;
import com.google.privacy.dlp.v2.DeidentifyContentResponse;
import com.google.privacy.dlp.v2.DeidentifyTemplate;
import com.google.privacy.dlp.v2.DeleteConnectionRequest;
import com.google.privacy.dlp.v2.DeleteDeidentifyTemplateRequest;
import com.google.privacy.dlp.v2.DeleteDiscoveryConfigRequest;
import com.google.privacy.dlp.v2.DeleteDlpJobRequest;
import com.google.privacy.dlp.v2.DeleteFileStoreDataProfileRequest;
import com.google.privacy.dlp.v2.DeleteInspectTemplateRequest;
import com.google.privacy.dlp.v2.DeleteJobTriggerRequest;
import com.google.privacy.dlp.v2.DeleteStoredInfoTypeRequest;
import com.google.privacy.dlp.v2.DeleteTableDataProfileRequest;
import com.google.privacy.dlp.v2.DiscoveryConfig;
import com.google.privacy.dlp.v2.DlpJob;
import com.google.privacy.dlp.v2.FileStoreDataProfile;
import com.google.privacy.dlp.v2.FinishDlpJobRequest;
import com.google.privacy.dlp.v2.GetColumnDataProfileRequest;
import com.google.privacy.dlp.v2.GetConnectionRequest;
import com.google.privacy.dlp.v2.GetDeidentifyTemplateRequest;
import com.google.privacy.dlp.v2.GetDiscoveryConfigRequest;
import com.google.privacy.dlp.v2.GetDlpJobRequest;
import com.google.privacy.dlp.v2.GetFileStoreDataProfileRequest;
import com.google.privacy.dlp.v2.GetInspectTemplateRequest;
import com.google.privacy.dlp.v2.GetJobTriggerRequest;
import com.google.privacy.dlp.v2.GetProjectDataProfileRequest;
import com.google.privacy.dlp.v2.GetStoredInfoTypeRequest;
import com.google.privacy.dlp.v2.GetTableDataProfileRequest;
import com.google.privacy.dlp.v2.HybridInspectDlpJobRequest;
import com.google.privacy.dlp.v2.HybridInspectJobTriggerRequest;
import com.google.privacy.dlp.v2.HybridInspectResponse;
import com.google.privacy.dlp.v2.InspectContentRequest;
import com.google.privacy.dlp.v2.InspectContentResponse;
import com.google.privacy.dlp.v2.InspectTemplate;
import com.google.privacy.dlp.v2.JobTrigger;
import com.google.privacy.dlp.v2.ListColumnDataProfilesRequest;
import com.google.privacy.dlp.v2.ListColumnDataProfilesResponse;
import com.google.privacy.dlp.v2.ListConnectionsRequest;
import com.google.privacy.dlp.v2.ListConnectionsResponse;
import com.google.privacy.dlp.v2.ListDeidentifyTemplatesRequest;
import com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse;
import com.google.privacy.dlp.v2.ListDiscoveryConfigsRequest;
import com.google.privacy.dlp.v2.ListDiscoveryConfigsResponse;
import com.google.privacy.dlp.v2.ListDlpJobsRequest;
import com.google.privacy.dlp.v2.ListDlpJobsResponse;
import com.google.privacy.dlp.v2.ListFileStoreDataProfilesRequest;
import com.google.privacy.dlp.v2.ListFileStoreDataProfilesResponse;
import com.google.privacy.dlp.v2.ListInfoTypesRequest;
import com.google.privacy.dlp.v2.ListInfoTypesResponse;
import com.google.privacy.dlp.v2.ListInspectTemplatesRequest;
import com.google.privacy.dlp.v2.ListInspectTemplatesResponse;
import com.google.privacy.dlp.v2.ListJobTriggersRequest;
import com.google.privacy.dlp.v2.ListJobTriggersResponse;
import com.google.privacy.dlp.v2.ListProjectDataProfilesRequest;
import com.google.privacy.dlp.v2.ListProjectDataProfilesResponse;
import com.google.privacy.dlp.v2.ListStoredInfoTypesRequest;
import com.google.privacy.dlp.v2.ListStoredInfoTypesResponse;
import com.google.privacy.dlp.v2.ListTableDataProfilesRequest;
import com.google.privacy.dlp.v2.ListTableDataProfilesResponse;
import com.google.privacy.dlp.v2.ProjectDataProfile;
import com.google.privacy.dlp.v2.RedactImageRequest;
import com.google.privacy.dlp.v2.RedactImageResponse;
import com.google.privacy.dlp.v2.ReidentifyContentRequest;
import com.google.privacy.dlp.v2.ReidentifyContentResponse;
import com.google.privacy.dlp.v2.SearchConnectionsRequest;
import com.google.privacy.dlp.v2.SearchConnectionsResponse;
import com.google.privacy.dlp.v2.StoredInfoType;
import com.google.privacy.dlp.v2.TableDataProfile;
import com.google.privacy.dlp.v2.UpdateConnectionRequest;
import com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest;
import com.google.privacy.dlp.v2.UpdateDiscoveryConfigRequest;
import com.google.privacy.dlp.v2.UpdateInspectTemplateRequest;
import com.google.privacy.dlp.v2.UpdateJobTriggerRequest;
import com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link DlpServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (dlp.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of inspectContent:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * DlpServiceSettings.Builder dlpServiceSettingsBuilder = DlpServiceSettings.newBuilder();
 * dlpServiceSettingsBuilder
 *     .inspectContentSettings()
 *     .setRetrySettings(
 *         dlpServiceSettingsBuilder
 *             .inspectContentSettings()
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
 * DlpServiceSettings dlpServiceSettings = dlpServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@Generated("by gapic-generator-java")
public class DlpServiceSettings extends ClientSettings<DlpServiceSettings> {

  /** Returns the object with the settings used for calls to inspectContent. */
  public UnaryCallSettings<InspectContentRequest, InspectContentResponse> inspectContentSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).inspectContentSettings();
  }

  /** Returns the object with the settings used for calls to redactImage. */
  public UnaryCallSettings<RedactImageRequest, RedactImageResponse> redactImageSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).redactImageSettings();
  }

  /** Returns the object with the settings used for calls to deidentifyContent. */
  public UnaryCallSettings<DeidentifyContentRequest, DeidentifyContentResponse>
      deidentifyContentSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).deidentifyContentSettings();
  }

  /** Returns the object with the settings used for calls to reidentifyContent. */
  public UnaryCallSettings<ReidentifyContentRequest, ReidentifyContentResponse>
      reidentifyContentSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).reidentifyContentSettings();
  }

  /** Returns the object with the settings used for calls to listInfoTypes. */
  public UnaryCallSettings<ListInfoTypesRequest, ListInfoTypesResponse> listInfoTypesSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).listInfoTypesSettings();
  }

  /** Returns the object with the settings used for calls to createInspectTemplate. */
  public UnaryCallSettings<CreateInspectTemplateRequest, InspectTemplate>
      createInspectTemplateSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).createInspectTemplateSettings();
  }

  /** Returns the object with the settings used for calls to updateInspectTemplate. */
  public UnaryCallSettings<UpdateInspectTemplateRequest, InspectTemplate>
      updateInspectTemplateSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).updateInspectTemplateSettings();
  }

  /** Returns the object with the settings used for calls to getInspectTemplate. */
  public UnaryCallSettings<GetInspectTemplateRequest, InspectTemplate>
      getInspectTemplateSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).getInspectTemplateSettings();
  }

  /** Returns the object with the settings used for calls to listInspectTemplates. */
  public PagedCallSettings<
          ListInspectTemplatesRequest,
          ListInspectTemplatesResponse,
          ListInspectTemplatesPagedResponse>
      listInspectTemplatesSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).listInspectTemplatesSettings();
  }

  /** Returns the object with the settings used for calls to deleteInspectTemplate. */
  public UnaryCallSettings<DeleteInspectTemplateRequest, Empty> deleteInspectTemplateSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).deleteInspectTemplateSettings();
  }

  /** Returns the object with the settings used for calls to createDeidentifyTemplate. */
  public UnaryCallSettings<CreateDeidentifyTemplateRequest, DeidentifyTemplate>
      createDeidentifyTemplateSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).createDeidentifyTemplateSettings();
  }

  /** Returns the object with the settings used for calls to updateDeidentifyTemplate. */
  public UnaryCallSettings<UpdateDeidentifyTemplateRequest, DeidentifyTemplate>
      updateDeidentifyTemplateSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).updateDeidentifyTemplateSettings();
  }

  /** Returns the object with the settings used for calls to getDeidentifyTemplate. */
  public UnaryCallSettings<GetDeidentifyTemplateRequest, DeidentifyTemplate>
      getDeidentifyTemplateSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).getDeidentifyTemplateSettings();
  }

  /** Returns the object with the settings used for calls to listDeidentifyTemplates. */
  public PagedCallSettings<
          ListDeidentifyTemplatesRequest,
          ListDeidentifyTemplatesResponse,
          ListDeidentifyTemplatesPagedResponse>
      listDeidentifyTemplatesSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).listDeidentifyTemplatesSettings();
  }

  /** Returns the object with the settings used for calls to deleteDeidentifyTemplate. */
  public UnaryCallSettings<DeleteDeidentifyTemplateRequest, Empty>
      deleteDeidentifyTemplateSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).deleteDeidentifyTemplateSettings();
  }

  /** Returns the object with the settings used for calls to createJobTrigger. */
  public UnaryCallSettings<CreateJobTriggerRequest, JobTrigger> createJobTriggerSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).createJobTriggerSettings();
  }

  /** Returns the object with the settings used for calls to updateJobTrigger. */
  public UnaryCallSettings<UpdateJobTriggerRequest, JobTrigger> updateJobTriggerSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).updateJobTriggerSettings();
  }

  /** Returns the object with the settings used for calls to hybridInspectJobTrigger. */
  public UnaryCallSettings<HybridInspectJobTriggerRequest, HybridInspectResponse>
      hybridInspectJobTriggerSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).hybridInspectJobTriggerSettings();
  }

  /** Returns the object with the settings used for calls to getJobTrigger. */
  public UnaryCallSettings<GetJobTriggerRequest, JobTrigger> getJobTriggerSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).getJobTriggerSettings();
  }

  /** Returns the object with the settings used for calls to listJobTriggers. */
  public PagedCallSettings<
          ListJobTriggersRequest, ListJobTriggersResponse, ListJobTriggersPagedResponse>
      listJobTriggersSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).listJobTriggersSettings();
  }

  /** Returns the object with the settings used for calls to deleteJobTrigger. */
  public UnaryCallSettings<DeleteJobTriggerRequest, Empty> deleteJobTriggerSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).deleteJobTriggerSettings();
  }

  /** Returns the object with the settings used for calls to activateJobTrigger. */
  public UnaryCallSettings<ActivateJobTriggerRequest, DlpJob> activateJobTriggerSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).activateJobTriggerSettings();
  }

  /** Returns the object with the settings used for calls to createDiscoveryConfig. */
  public UnaryCallSettings<CreateDiscoveryConfigRequest, DiscoveryConfig>
      createDiscoveryConfigSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).createDiscoveryConfigSettings();
  }

  /** Returns the object with the settings used for calls to updateDiscoveryConfig. */
  public UnaryCallSettings<UpdateDiscoveryConfigRequest, DiscoveryConfig>
      updateDiscoveryConfigSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).updateDiscoveryConfigSettings();
  }

  /** Returns the object with the settings used for calls to getDiscoveryConfig. */
  public UnaryCallSettings<GetDiscoveryConfigRequest, DiscoveryConfig>
      getDiscoveryConfigSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).getDiscoveryConfigSettings();
  }

  /** Returns the object with the settings used for calls to listDiscoveryConfigs. */
  public PagedCallSettings<
          ListDiscoveryConfigsRequest,
          ListDiscoveryConfigsResponse,
          ListDiscoveryConfigsPagedResponse>
      listDiscoveryConfigsSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).listDiscoveryConfigsSettings();
  }

  /** Returns the object with the settings used for calls to deleteDiscoveryConfig. */
  public UnaryCallSettings<DeleteDiscoveryConfigRequest, Empty> deleteDiscoveryConfigSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).deleteDiscoveryConfigSettings();
  }

  /** Returns the object with the settings used for calls to createDlpJob. */
  public UnaryCallSettings<CreateDlpJobRequest, DlpJob> createDlpJobSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).createDlpJobSettings();
  }

  /** Returns the object with the settings used for calls to listDlpJobs. */
  public PagedCallSettings<ListDlpJobsRequest, ListDlpJobsResponse, ListDlpJobsPagedResponse>
      listDlpJobsSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).listDlpJobsSettings();
  }

  /** Returns the object with the settings used for calls to getDlpJob. */
  public UnaryCallSettings<GetDlpJobRequest, DlpJob> getDlpJobSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).getDlpJobSettings();
  }

  /** Returns the object with the settings used for calls to deleteDlpJob. */
  public UnaryCallSettings<DeleteDlpJobRequest, Empty> deleteDlpJobSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).deleteDlpJobSettings();
  }

  /** Returns the object with the settings used for calls to cancelDlpJob. */
  public UnaryCallSettings<CancelDlpJobRequest, Empty> cancelDlpJobSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).cancelDlpJobSettings();
  }

  /** Returns the object with the settings used for calls to createStoredInfoType. */
  public UnaryCallSettings<CreateStoredInfoTypeRequest, StoredInfoType>
      createStoredInfoTypeSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).createStoredInfoTypeSettings();
  }

  /** Returns the object with the settings used for calls to updateStoredInfoType. */
  public UnaryCallSettings<UpdateStoredInfoTypeRequest, StoredInfoType>
      updateStoredInfoTypeSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).updateStoredInfoTypeSettings();
  }

  /** Returns the object with the settings used for calls to getStoredInfoType. */
  public UnaryCallSettings<GetStoredInfoTypeRequest, StoredInfoType> getStoredInfoTypeSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).getStoredInfoTypeSettings();
  }

  /** Returns the object with the settings used for calls to listStoredInfoTypes. */
  public PagedCallSettings<
          ListStoredInfoTypesRequest, ListStoredInfoTypesResponse, ListStoredInfoTypesPagedResponse>
      listStoredInfoTypesSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).listStoredInfoTypesSettings();
  }

  /** Returns the object with the settings used for calls to deleteStoredInfoType. */
  public UnaryCallSettings<DeleteStoredInfoTypeRequest, Empty> deleteStoredInfoTypeSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).deleteStoredInfoTypeSettings();
  }

  /** Returns the object with the settings used for calls to listProjectDataProfiles. */
  public PagedCallSettings<
          ListProjectDataProfilesRequest,
          ListProjectDataProfilesResponse,
          ListProjectDataProfilesPagedResponse>
      listProjectDataProfilesSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).listProjectDataProfilesSettings();
  }

  /** Returns the object with the settings used for calls to listTableDataProfiles. */
  public PagedCallSettings<
          ListTableDataProfilesRequest,
          ListTableDataProfilesResponse,
          ListTableDataProfilesPagedResponse>
      listTableDataProfilesSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).listTableDataProfilesSettings();
  }

  /** Returns the object with the settings used for calls to listColumnDataProfiles. */
  public PagedCallSettings<
          ListColumnDataProfilesRequest,
          ListColumnDataProfilesResponse,
          ListColumnDataProfilesPagedResponse>
      listColumnDataProfilesSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).listColumnDataProfilesSettings();
  }

  /** Returns the object with the settings used for calls to getProjectDataProfile. */
  public UnaryCallSettings<GetProjectDataProfileRequest, ProjectDataProfile>
      getProjectDataProfileSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).getProjectDataProfileSettings();
  }

  /** Returns the object with the settings used for calls to listFileStoreDataProfiles. */
  public PagedCallSettings<
          ListFileStoreDataProfilesRequest,
          ListFileStoreDataProfilesResponse,
          ListFileStoreDataProfilesPagedResponse>
      listFileStoreDataProfilesSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).listFileStoreDataProfilesSettings();
  }

  /** Returns the object with the settings used for calls to getFileStoreDataProfile. */
  public UnaryCallSettings<GetFileStoreDataProfileRequest, FileStoreDataProfile>
      getFileStoreDataProfileSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).getFileStoreDataProfileSettings();
  }

  /** Returns the object with the settings used for calls to deleteFileStoreDataProfile. */
  public UnaryCallSettings<DeleteFileStoreDataProfileRequest, Empty>
      deleteFileStoreDataProfileSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).deleteFileStoreDataProfileSettings();
  }

  /** Returns the object with the settings used for calls to getTableDataProfile. */
  public UnaryCallSettings<GetTableDataProfileRequest, TableDataProfile>
      getTableDataProfileSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).getTableDataProfileSettings();
  }

  /** Returns the object with the settings used for calls to getColumnDataProfile. */
  public UnaryCallSettings<GetColumnDataProfileRequest, ColumnDataProfile>
      getColumnDataProfileSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).getColumnDataProfileSettings();
  }

  /** Returns the object with the settings used for calls to deleteTableDataProfile. */
  public UnaryCallSettings<DeleteTableDataProfileRequest, Empty> deleteTableDataProfileSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).deleteTableDataProfileSettings();
  }

  /** Returns the object with the settings used for calls to hybridInspectDlpJob. */
  public UnaryCallSettings<HybridInspectDlpJobRequest, HybridInspectResponse>
      hybridInspectDlpJobSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).hybridInspectDlpJobSettings();
  }

  /** Returns the object with the settings used for calls to finishDlpJob. */
  public UnaryCallSettings<FinishDlpJobRequest, Empty> finishDlpJobSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).finishDlpJobSettings();
  }

  /** Returns the object with the settings used for calls to createConnection. */
  public UnaryCallSettings<CreateConnectionRequest, Connection> createConnectionSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).createConnectionSettings();
  }

  /** Returns the object with the settings used for calls to getConnection. */
  public UnaryCallSettings<GetConnectionRequest, Connection> getConnectionSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).getConnectionSettings();
  }

  /** Returns the object with the settings used for calls to listConnections. */
  public PagedCallSettings<
          ListConnectionsRequest, ListConnectionsResponse, ListConnectionsPagedResponse>
      listConnectionsSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).listConnectionsSettings();
  }

  /** Returns the object with the settings used for calls to searchConnections. */
  public PagedCallSettings<
          SearchConnectionsRequest, SearchConnectionsResponse, SearchConnectionsPagedResponse>
      searchConnectionsSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).searchConnectionsSettings();
  }

  /** Returns the object with the settings used for calls to deleteConnection. */
  public UnaryCallSettings<DeleteConnectionRequest, Empty> deleteConnectionSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).deleteConnectionSettings();
  }

  /** Returns the object with the settings used for calls to updateConnection. */
  public UnaryCallSettings<UpdateConnectionRequest, Connection> updateConnectionSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).updateConnectionSettings();
  }

  public static final DlpServiceSettings create(DlpServiceStubSettings stub) throws IOException {
    return new DlpServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return DlpServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return DlpServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DlpServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return DlpServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return DlpServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return DlpServiceStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return DlpServiceStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return DlpServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected DlpServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for DlpServiceSettings. */
  public static class Builder extends ClientSettings.Builder<DlpServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(DlpServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(DlpServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(DlpServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(DlpServiceStubSettings.newBuilder());
    }

    private static Builder createHttpJsonDefault() {
      return new Builder(DlpServiceStubSettings.newHttpJsonBuilder());
    }

    public DlpServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((DlpServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to inspectContent. */
    public UnaryCallSettings.Builder<InspectContentRequest, InspectContentResponse>
        inspectContentSettings() {
      return getStubSettingsBuilder().inspectContentSettings();
    }

    /** Returns the builder for the settings used for calls to redactImage. */
    public UnaryCallSettings.Builder<RedactImageRequest, RedactImageResponse>
        redactImageSettings() {
      return getStubSettingsBuilder().redactImageSettings();
    }

    /** Returns the builder for the settings used for calls to deidentifyContent. */
    public UnaryCallSettings.Builder<DeidentifyContentRequest, DeidentifyContentResponse>
        deidentifyContentSettings() {
      return getStubSettingsBuilder().deidentifyContentSettings();
    }

    /** Returns the builder for the settings used for calls to reidentifyContent. */
    public UnaryCallSettings.Builder<ReidentifyContentRequest, ReidentifyContentResponse>
        reidentifyContentSettings() {
      return getStubSettingsBuilder().reidentifyContentSettings();
    }

    /** Returns the builder for the settings used for calls to listInfoTypes. */
    public UnaryCallSettings.Builder<ListInfoTypesRequest, ListInfoTypesResponse>
        listInfoTypesSettings() {
      return getStubSettingsBuilder().listInfoTypesSettings();
    }

    /** Returns the builder for the settings used for calls to createInspectTemplate. */
    public UnaryCallSettings.Builder<CreateInspectTemplateRequest, InspectTemplate>
        createInspectTemplateSettings() {
      return getStubSettingsBuilder().createInspectTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to updateInspectTemplate. */
    public UnaryCallSettings.Builder<UpdateInspectTemplateRequest, InspectTemplate>
        updateInspectTemplateSettings() {
      return getStubSettingsBuilder().updateInspectTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to getInspectTemplate. */
    public UnaryCallSettings.Builder<GetInspectTemplateRequest, InspectTemplate>
        getInspectTemplateSettings() {
      return getStubSettingsBuilder().getInspectTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to listInspectTemplates. */
    public PagedCallSettings.Builder<
            ListInspectTemplatesRequest,
            ListInspectTemplatesResponse,
            ListInspectTemplatesPagedResponse>
        listInspectTemplatesSettings() {
      return getStubSettingsBuilder().listInspectTemplatesSettings();
    }

    /** Returns the builder for the settings used for calls to deleteInspectTemplate. */
    public UnaryCallSettings.Builder<DeleteInspectTemplateRequest, Empty>
        deleteInspectTemplateSettings() {
      return getStubSettingsBuilder().deleteInspectTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to createDeidentifyTemplate. */
    public UnaryCallSettings.Builder<CreateDeidentifyTemplateRequest, DeidentifyTemplate>
        createDeidentifyTemplateSettings() {
      return getStubSettingsBuilder().createDeidentifyTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to updateDeidentifyTemplate. */
    public UnaryCallSettings.Builder<UpdateDeidentifyTemplateRequest, DeidentifyTemplate>
        updateDeidentifyTemplateSettings() {
      return getStubSettingsBuilder().updateDeidentifyTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to getDeidentifyTemplate. */
    public UnaryCallSettings.Builder<GetDeidentifyTemplateRequest, DeidentifyTemplate>
        getDeidentifyTemplateSettings() {
      return getStubSettingsBuilder().getDeidentifyTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to listDeidentifyTemplates. */
    public PagedCallSettings.Builder<
            ListDeidentifyTemplatesRequest,
            ListDeidentifyTemplatesResponse,
            ListDeidentifyTemplatesPagedResponse>
        listDeidentifyTemplatesSettings() {
      return getStubSettingsBuilder().listDeidentifyTemplatesSettings();
    }

    /** Returns the builder for the settings used for calls to deleteDeidentifyTemplate. */
    public UnaryCallSettings.Builder<DeleteDeidentifyTemplateRequest, Empty>
        deleteDeidentifyTemplateSettings() {
      return getStubSettingsBuilder().deleteDeidentifyTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to createJobTrigger. */
    public UnaryCallSettings.Builder<CreateJobTriggerRequest, JobTrigger>
        createJobTriggerSettings() {
      return getStubSettingsBuilder().createJobTriggerSettings();
    }

    /** Returns the builder for the settings used for calls to updateJobTrigger. */
    public UnaryCallSettings.Builder<UpdateJobTriggerRequest, JobTrigger>
        updateJobTriggerSettings() {
      return getStubSettingsBuilder().updateJobTriggerSettings();
    }

    /** Returns the builder for the settings used for calls to hybridInspectJobTrigger. */
    public UnaryCallSettings.Builder<HybridInspectJobTriggerRequest, HybridInspectResponse>
        hybridInspectJobTriggerSettings() {
      return getStubSettingsBuilder().hybridInspectJobTriggerSettings();
    }

    /** Returns the builder for the settings used for calls to getJobTrigger. */
    public UnaryCallSettings.Builder<GetJobTriggerRequest, JobTrigger> getJobTriggerSettings() {
      return getStubSettingsBuilder().getJobTriggerSettings();
    }

    /** Returns the builder for the settings used for calls to listJobTriggers. */
    public PagedCallSettings.Builder<
            ListJobTriggersRequest, ListJobTriggersResponse, ListJobTriggersPagedResponse>
        listJobTriggersSettings() {
      return getStubSettingsBuilder().listJobTriggersSettings();
    }

    /** Returns the builder for the settings used for calls to deleteJobTrigger. */
    public UnaryCallSettings.Builder<DeleteJobTriggerRequest, Empty> deleteJobTriggerSettings() {
      return getStubSettingsBuilder().deleteJobTriggerSettings();
    }

    /** Returns the builder for the settings used for calls to activateJobTrigger. */
    public UnaryCallSettings.Builder<ActivateJobTriggerRequest, DlpJob>
        activateJobTriggerSettings() {
      return getStubSettingsBuilder().activateJobTriggerSettings();
    }

    /** Returns the builder for the settings used for calls to createDiscoveryConfig. */
    public UnaryCallSettings.Builder<CreateDiscoveryConfigRequest, DiscoveryConfig>
        createDiscoveryConfigSettings() {
      return getStubSettingsBuilder().createDiscoveryConfigSettings();
    }

    /** Returns the builder for the settings used for calls to updateDiscoveryConfig. */
    public UnaryCallSettings.Builder<UpdateDiscoveryConfigRequest, DiscoveryConfig>
        updateDiscoveryConfigSettings() {
      return getStubSettingsBuilder().updateDiscoveryConfigSettings();
    }

    /** Returns the builder for the settings used for calls to getDiscoveryConfig. */
    public UnaryCallSettings.Builder<GetDiscoveryConfigRequest, DiscoveryConfig>
        getDiscoveryConfigSettings() {
      return getStubSettingsBuilder().getDiscoveryConfigSettings();
    }

    /** Returns the builder for the settings used for calls to listDiscoveryConfigs. */
    public PagedCallSettings.Builder<
            ListDiscoveryConfigsRequest,
            ListDiscoveryConfigsResponse,
            ListDiscoveryConfigsPagedResponse>
        listDiscoveryConfigsSettings() {
      return getStubSettingsBuilder().listDiscoveryConfigsSettings();
    }

    /** Returns the builder for the settings used for calls to deleteDiscoveryConfig. */
    public UnaryCallSettings.Builder<DeleteDiscoveryConfigRequest, Empty>
        deleteDiscoveryConfigSettings() {
      return getStubSettingsBuilder().deleteDiscoveryConfigSettings();
    }

    /** Returns the builder for the settings used for calls to createDlpJob. */
    public UnaryCallSettings.Builder<CreateDlpJobRequest, DlpJob> createDlpJobSettings() {
      return getStubSettingsBuilder().createDlpJobSettings();
    }

    /** Returns the builder for the settings used for calls to listDlpJobs. */
    public PagedCallSettings.Builder<
            ListDlpJobsRequest, ListDlpJobsResponse, ListDlpJobsPagedResponse>
        listDlpJobsSettings() {
      return getStubSettingsBuilder().listDlpJobsSettings();
    }

    /** Returns the builder for the settings used for calls to getDlpJob. */
    public UnaryCallSettings.Builder<GetDlpJobRequest, DlpJob> getDlpJobSettings() {
      return getStubSettingsBuilder().getDlpJobSettings();
    }

    /** Returns the builder for the settings used for calls to deleteDlpJob. */
    public UnaryCallSettings.Builder<DeleteDlpJobRequest, Empty> deleteDlpJobSettings() {
      return getStubSettingsBuilder().deleteDlpJobSettings();
    }

    /** Returns the builder for the settings used for calls to cancelDlpJob. */
    public UnaryCallSettings.Builder<CancelDlpJobRequest, Empty> cancelDlpJobSettings() {
      return getStubSettingsBuilder().cancelDlpJobSettings();
    }

    /** Returns the builder for the settings used for calls to createStoredInfoType. */
    public UnaryCallSettings.Builder<CreateStoredInfoTypeRequest, StoredInfoType>
        createStoredInfoTypeSettings() {
      return getStubSettingsBuilder().createStoredInfoTypeSettings();
    }

    /** Returns the builder for the settings used for calls to updateStoredInfoType. */
    public UnaryCallSettings.Builder<UpdateStoredInfoTypeRequest, StoredInfoType>
        updateStoredInfoTypeSettings() {
      return getStubSettingsBuilder().updateStoredInfoTypeSettings();
    }

    /** Returns the builder for the settings used for calls to getStoredInfoType. */
    public UnaryCallSettings.Builder<GetStoredInfoTypeRequest, StoredInfoType>
        getStoredInfoTypeSettings() {
      return getStubSettingsBuilder().getStoredInfoTypeSettings();
    }

    /** Returns the builder for the settings used for calls to listStoredInfoTypes. */
    public PagedCallSettings.Builder<
            ListStoredInfoTypesRequest,
            ListStoredInfoTypesResponse,
            ListStoredInfoTypesPagedResponse>
        listStoredInfoTypesSettings() {
      return getStubSettingsBuilder().listStoredInfoTypesSettings();
    }

    /** Returns the builder for the settings used for calls to deleteStoredInfoType. */
    public UnaryCallSettings.Builder<DeleteStoredInfoTypeRequest, Empty>
        deleteStoredInfoTypeSettings() {
      return getStubSettingsBuilder().deleteStoredInfoTypeSettings();
    }

    /** Returns the builder for the settings used for calls to listProjectDataProfiles. */
    public PagedCallSettings.Builder<
            ListProjectDataProfilesRequest,
            ListProjectDataProfilesResponse,
            ListProjectDataProfilesPagedResponse>
        listProjectDataProfilesSettings() {
      return getStubSettingsBuilder().listProjectDataProfilesSettings();
    }

    /** Returns the builder for the settings used for calls to listTableDataProfiles. */
    public PagedCallSettings.Builder<
            ListTableDataProfilesRequest,
            ListTableDataProfilesResponse,
            ListTableDataProfilesPagedResponse>
        listTableDataProfilesSettings() {
      return getStubSettingsBuilder().listTableDataProfilesSettings();
    }

    /** Returns the builder for the settings used for calls to listColumnDataProfiles. */
    public PagedCallSettings.Builder<
            ListColumnDataProfilesRequest,
            ListColumnDataProfilesResponse,
            ListColumnDataProfilesPagedResponse>
        listColumnDataProfilesSettings() {
      return getStubSettingsBuilder().listColumnDataProfilesSettings();
    }

    /** Returns the builder for the settings used for calls to getProjectDataProfile. */
    public UnaryCallSettings.Builder<GetProjectDataProfileRequest, ProjectDataProfile>
        getProjectDataProfileSettings() {
      return getStubSettingsBuilder().getProjectDataProfileSettings();
    }

    /** Returns the builder for the settings used for calls to listFileStoreDataProfiles. */
    public PagedCallSettings.Builder<
            ListFileStoreDataProfilesRequest,
            ListFileStoreDataProfilesResponse,
            ListFileStoreDataProfilesPagedResponse>
        listFileStoreDataProfilesSettings() {
      return getStubSettingsBuilder().listFileStoreDataProfilesSettings();
    }

    /** Returns the builder for the settings used for calls to getFileStoreDataProfile. */
    public UnaryCallSettings.Builder<GetFileStoreDataProfileRequest, FileStoreDataProfile>
        getFileStoreDataProfileSettings() {
      return getStubSettingsBuilder().getFileStoreDataProfileSettings();
    }

    /** Returns the builder for the settings used for calls to deleteFileStoreDataProfile. */
    public UnaryCallSettings.Builder<DeleteFileStoreDataProfileRequest, Empty>
        deleteFileStoreDataProfileSettings() {
      return getStubSettingsBuilder().deleteFileStoreDataProfileSettings();
    }

    /** Returns the builder for the settings used for calls to getTableDataProfile. */
    public UnaryCallSettings.Builder<GetTableDataProfileRequest, TableDataProfile>
        getTableDataProfileSettings() {
      return getStubSettingsBuilder().getTableDataProfileSettings();
    }

    /** Returns the builder for the settings used for calls to getColumnDataProfile. */
    public UnaryCallSettings.Builder<GetColumnDataProfileRequest, ColumnDataProfile>
        getColumnDataProfileSettings() {
      return getStubSettingsBuilder().getColumnDataProfileSettings();
    }

    /** Returns the builder for the settings used for calls to deleteTableDataProfile. */
    public UnaryCallSettings.Builder<DeleteTableDataProfileRequest, Empty>
        deleteTableDataProfileSettings() {
      return getStubSettingsBuilder().deleteTableDataProfileSettings();
    }

    /** Returns the builder for the settings used for calls to hybridInspectDlpJob. */
    public UnaryCallSettings.Builder<HybridInspectDlpJobRequest, HybridInspectResponse>
        hybridInspectDlpJobSettings() {
      return getStubSettingsBuilder().hybridInspectDlpJobSettings();
    }

    /** Returns the builder for the settings used for calls to finishDlpJob. */
    public UnaryCallSettings.Builder<FinishDlpJobRequest, Empty> finishDlpJobSettings() {
      return getStubSettingsBuilder().finishDlpJobSettings();
    }

    /** Returns the builder for the settings used for calls to createConnection. */
    public UnaryCallSettings.Builder<CreateConnectionRequest, Connection>
        createConnectionSettings() {
      return getStubSettingsBuilder().createConnectionSettings();
    }

    /** Returns the builder for the settings used for calls to getConnection. */
    public UnaryCallSettings.Builder<GetConnectionRequest, Connection> getConnectionSettings() {
      return getStubSettingsBuilder().getConnectionSettings();
    }

    /** Returns the builder for the settings used for calls to listConnections. */
    public PagedCallSettings.Builder<
            ListConnectionsRequest, ListConnectionsResponse, ListConnectionsPagedResponse>
        listConnectionsSettings() {
      return getStubSettingsBuilder().listConnectionsSettings();
    }

    /** Returns the builder for the settings used for calls to searchConnections. */
    public PagedCallSettings.Builder<
            SearchConnectionsRequest, SearchConnectionsResponse, SearchConnectionsPagedResponse>
        searchConnectionsSettings() {
      return getStubSettingsBuilder().searchConnectionsSettings();
    }

    /** Returns the builder for the settings used for calls to deleteConnection. */
    public UnaryCallSettings.Builder<DeleteConnectionRequest, Empty> deleteConnectionSettings() {
      return getStubSettingsBuilder().deleteConnectionSettings();
    }

    /** Returns the builder for the settings used for calls to updateConnection. */
    public UnaryCallSettings.Builder<UpdateConnectionRequest, Connection>
        updateConnectionSettings() {
      return getStubSettingsBuilder().updateConnectionSettings();
    }

    @Override
    public DlpServiceSettings build() throws IOException {
      return new DlpServiceSettings(this);
    }
  }
}
