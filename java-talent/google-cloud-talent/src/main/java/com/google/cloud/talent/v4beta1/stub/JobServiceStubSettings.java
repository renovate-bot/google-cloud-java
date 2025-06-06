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

package com.google.cloud.talent.v4beta1.stub;

import static com.google.cloud.talent.v4beta1.JobServiceClient.ListJobsPagedResponse;
import static com.google.cloud.talent.v4beta1.JobServiceClient.SearchJobsForAlertPagedResponse;
import static com.google.cloud.talent.v4beta1.JobServiceClient.SearchJobsPagedResponse;

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
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.talent.v4beta1.BatchCreateJobsRequest;
import com.google.cloud.talent.v4beta1.BatchDeleteJobsRequest;
import com.google.cloud.talent.v4beta1.BatchOperationMetadata;
import com.google.cloud.talent.v4beta1.BatchUpdateJobsRequest;
import com.google.cloud.talent.v4beta1.CreateJobRequest;
import com.google.cloud.talent.v4beta1.DeleteJobRequest;
import com.google.cloud.talent.v4beta1.GetJobRequest;
import com.google.cloud.talent.v4beta1.Job;
import com.google.cloud.talent.v4beta1.JobOperationResult;
import com.google.cloud.talent.v4beta1.ListJobsRequest;
import com.google.cloud.talent.v4beta1.ListJobsResponse;
import com.google.cloud.talent.v4beta1.SearchJobsRequest;
import com.google.cloud.talent.v4beta1.SearchJobsResponse;
import com.google.cloud.talent.v4beta1.UpdateJobRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link JobServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (jobs.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of createJob:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * JobServiceStubSettings.Builder jobServiceSettingsBuilder = JobServiceStubSettings.newBuilder();
 * jobServiceSettingsBuilder
 *     .createJobSettings()
 *     .setRetrySettings(
 *         jobServiceSettingsBuilder
 *             .createJobSettings()
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
 * JobServiceStubSettings jobServiceSettings = jobServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for batchCreateJobs:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * JobServiceStubSettings.Builder jobServiceSettingsBuilder = JobServiceStubSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * jobServiceSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class JobServiceStubSettings extends StubSettings<JobServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/jobs")
          .build();

  private final UnaryCallSettings<CreateJobRequest, Job> createJobSettings;
  private final UnaryCallSettings<BatchCreateJobsRequest, Operation> batchCreateJobsSettings;
  private final OperationCallSettings<
          BatchCreateJobsRequest, JobOperationResult, BatchOperationMetadata>
      batchCreateJobsOperationSettings;
  private final UnaryCallSettings<GetJobRequest, Job> getJobSettings;
  private final UnaryCallSettings<UpdateJobRequest, Job> updateJobSettings;
  private final UnaryCallSettings<BatchUpdateJobsRequest, Operation> batchUpdateJobsSettings;
  private final OperationCallSettings<
          BatchUpdateJobsRequest, JobOperationResult, BatchOperationMetadata>
      batchUpdateJobsOperationSettings;
  private final UnaryCallSettings<DeleteJobRequest, Empty> deleteJobSettings;
  private final UnaryCallSettings<BatchDeleteJobsRequest, Empty> batchDeleteJobsSettings;
  private final PagedCallSettings<ListJobsRequest, ListJobsResponse, ListJobsPagedResponse>
      listJobsSettings;
  private final PagedCallSettings<SearchJobsRequest, SearchJobsResponse, SearchJobsPagedResponse>
      searchJobsSettings;
  private final PagedCallSettings<
          SearchJobsRequest, SearchJobsResponse, SearchJobsForAlertPagedResponse>
      searchJobsForAlertSettings;

  private static final PagedListDescriptor<ListJobsRequest, ListJobsResponse, Job>
      LIST_JOBS_PAGE_STR_DESC =
          new PagedListDescriptor<ListJobsRequest, ListJobsResponse, Job>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListJobsRequest injectToken(ListJobsRequest payload, String token) {
              return ListJobsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListJobsRequest injectPageSize(ListJobsRequest payload, int pageSize) {
              return ListJobsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListJobsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListJobsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Job> extractResources(ListJobsResponse payload) {
              return payload.getJobsList();
            }
          };

  private static final PagedListDescriptor<
          SearchJobsRequest, SearchJobsResponse, SearchJobsResponse.MatchingJob>
      SEARCH_JOBS_PAGE_STR_DESC =
          new PagedListDescriptor<
              SearchJobsRequest, SearchJobsResponse, SearchJobsResponse.MatchingJob>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public SearchJobsRequest injectToken(SearchJobsRequest payload, String token) {
              return SearchJobsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public SearchJobsRequest injectPageSize(SearchJobsRequest payload, int pageSize) {
              return SearchJobsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(SearchJobsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(SearchJobsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<SearchJobsResponse.MatchingJob> extractResources(
                SearchJobsResponse payload) {
              return payload.getMatchingJobsList();
            }
          };

  private static final PagedListDescriptor<
          SearchJobsRequest, SearchJobsResponse, SearchJobsResponse.MatchingJob>
      SEARCH_JOBS_FOR_ALERT_PAGE_STR_DESC =
          new PagedListDescriptor<
              SearchJobsRequest, SearchJobsResponse, SearchJobsResponse.MatchingJob>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public SearchJobsRequest injectToken(SearchJobsRequest payload, String token) {
              return SearchJobsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public SearchJobsRequest injectPageSize(SearchJobsRequest payload, int pageSize) {
              return SearchJobsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(SearchJobsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(SearchJobsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<SearchJobsResponse.MatchingJob> extractResources(
                SearchJobsResponse payload) {
              return payload.getMatchingJobsList();
            }
          };

  private static final PagedListResponseFactory<
          ListJobsRequest, ListJobsResponse, ListJobsPagedResponse>
      LIST_JOBS_PAGE_STR_FACT =
          new PagedListResponseFactory<ListJobsRequest, ListJobsResponse, ListJobsPagedResponse>() {
            @Override
            public ApiFuture<ListJobsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListJobsRequest, ListJobsResponse> callable,
                ListJobsRequest request,
                ApiCallContext context,
                ApiFuture<ListJobsResponse> futureResponse) {
              PageContext<ListJobsRequest, ListJobsResponse, Job> pageContext =
                  PageContext.create(callable, LIST_JOBS_PAGE_STR_DESC, request, context);
              return ListJobsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          SearchJobsRequest, SearchJobsResponse, SearchJobsPagedResponse>
      SEARCH_JOBS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              SearchJobsRequest, SearchJobsResponse, SearchJobsPagedResponse>() {
            @Override
            public ApiFuture<SearchJobsPagedResponse> getFuturePagedResponse(
                UnaryCallable<SearchJobsRequest, SearchJobsResponse> callable,
                SearchJobsRequest request,
                ApiCallContext context,
                ApiFuture<SearchJobsResponse> futureResponse) {
              PageContext<SearchJobsRequest, SearchJobsResponse, SearchJobsResponse.MatchingJob>
                  pageContext =
                      PageContext.create(callable, SEARCH_JOBS_PAGE_STR_DESC, request, context);
              return SearchJobsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          SearchJobsRequest, SearchJobsResponse, SearchJobsForAlertPagedResponse>
      SEARCH_JOBS_FOR_ALERT_PAGE_STR_FACT =
          new PagedListResponseFactory<
              SearchJobsRequest, SearchJobsResponse, SearchJobsForAlertPagedResponse>() {
            @Override
            public ApiFuture<SearchJobsForAlertPagedResponse> getFuturePagedResponse(
                UnaryCallable<SearchJobsRequest, SearchJobsResponse> callable,
                SearchJobsRequest request,
                ApiCallContext context,
                ApiFuture<SearchJobsResponse> futureResponse) {
              PageContext<SearchJobsRequest, SearchJobsResponse, SearchJobsResponse.MatchingJob>
                  pageContext =
                      PageContext.create(
                          callable, SEARCH_JOBS_FOR_ALERT_PAGE_STR_DESC, request, context);
              return SearchJobsForAlertPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to createJob. */
  public UnaryCallSettings<CreateJobRequest, Job> createJobSettings() {
    return createJobSettings;
  }

  /** Returns the object with the settings used for calls to batchCreateJobs. */
  public UnaryCallSettings<BatchCreateJobsRequest, Operation> batchCreateJobsSettings() {
    return batchCreateJobsSettings;
  }

  /** Returns the object with the settings used for calls to batchCreateJobs. */
  public OperationCallSettings<BatchCreateJobsRequest, JobOperationResult, BatchOperationMetadata>
      batchCreateJobsOperationSettings() {
    return batchCreateJobsOperationSettings;
  }

  /** Returns the object with the settings used for calls to getJob. */
  public UnaryCallSettings<GetJobRequest, Job> getJobSettings() {
    return getJobSettings;
  }

  /** Returns the object with the settings used for calls to updateJob. */
  public UnaryCallSettings<UpdateJobRequest, Job> updateJobSettings() {
    return updateJobSettings;
  }

  /** Returns the object with the settings used for calls to batchUpdateJobs. */
  public UnaryCallSettings<BatchUpdateJobsRequest, Operation> batchUpdateJobsSettings() {
    return batchUpdateJobsSettings;
  }

  /** Returns the object with the settings used for calls to batchUpdateJobs. */
  public OperationCallSettings<BatchUpdateJobsRequest, JobOperationResult, BatchOperationMetadata>
      batchUpdateJobsOperationSettings() {
    return batchUpdateJobsOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteJob. */
  public UnaryCallSettings<DeleteJobRequest, Empty> deleteJobSettings() {
    return deleteJobSettings;
  }

  /** Returns the object with the settings used for calls to batchDeleteJobs. */
  public UnaryCallSettings<BatchDeleteJobsRequest, Empty> batchDeleteJobsSettings() {
    return batchDeleteJobsSettings;
  }

  /** Returns the object with the settings used for calls to listJobs. */
  public PagedCallSettings<ListJobsRequest, ListJobsResponse, ListJobsPagedResponse>
      listJobsSettings() {
    return listJobsSettings;
  }

  /** Returns the object with the settings used for calls to searchJobs. */
  public PagedCallSettings<SearchJobsRequest, SearchJobsResponse, SearchJobsPagedResponse>
      searchJobsSettings() {
    return searchJobsSettings;
  }

  /** Returns the object with the settings used for calls to searchJobsForAlert. */
  public PagedCallSettings<SearchJobsRequest, SearchJobsResponse, SearchJobsForAlertPagedResponse>
      searchJobsForAlertSettings() {
    return searchJobsForAlertSettings;
  }

  public JobServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcJobServiceStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonJobServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "jobs";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "jobs.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "jobs.mtls.googleapis.com:443";
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
            "gapic", GaxProperties.getLibraryVersion(JobServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(JobServiceStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return JobServiceStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
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

  protected JobServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createJobSettings = settingsBuilder.createJobSettings().build();
    batchCreateJobsSettings = settingsBuilder.batchCreateJobsSettings().build();
    batchCreateJobsOperationSettings = settingsBuilder.batchCreateJobsOperationSettings().build();
    getJobSettings = settingsBuilder.getJobSettings().build();
    updateJobSettings = settingsBuilder.updateJobSettings().build();
    batchUpdateJobsSettings = settingsBuilder.batchUpdateJobsSettings().build();
    batchUpdateJobsOperationSettings = settingsBuilder.batchUpdateJobsOperationSettings().build();
    deleteJobSettings = settingsBuilder.deleteJobSettings().build();
    batchDeleteJobsSettings = settingsBuilder.batchDeleteJobsSettings().build();
    listJobsSettings = settingsBuilder.listJobsSettings().build();
    searchJobsSettings = settingsBuilder.searchJobsSettings().build();
    searchJobsForAlertSettings = settingsBuilder.searchJobsForAlertSettings().build();
  }

  /** Builder for JobServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<JobServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateJobRequest, Job> createJobSettings;
    private final UnaryCallSettings.Builder<BatchCreateJobsRequest, Operation>
        batchCreateJobsSettings;
    private final OperationCallSettings.Builder<
            BatchCreateJobsRequest, JobOperationResult, BatchOperationMetadata>
        batchCreateJobsOperationSettings;
    private final UnaryCallSettings.Builder<GetJobRequest, Job> getJobSettings;
    private final UnaryCallSettings.Builder<UpdateJobRequest, Job> updateJobSettings;
    private final UnaryCallSettings.Builder<BatchUpdateJobsRequest, Operation>
        batchUpdateJobsSettings;
    private final OperationCallSettings.Builder<
            BatchUpdateJobsRequest, JobOperationResult, BatchOperationMetadata>
        batchUpdateJobsOperationSettings;
    private final UnaryCallSettings.Builder<DeleteJobRequest, Empty> deleteJobSettings;
    private final UnaryCallSettings.Builder<BatchDeleteJobsRequest, Empty> batchDeleteJobsSettings;
    private final PagedCallSettings.Builder<
            ListJobsRequest, ListJobsResponse, ListJobsPagedResponse>
        listJobsSettings;
    private final PagedCallSettings.Builder<
            SearchJobsRequest, SearchJobsResponse, SearchJobsPagedResponse>
        searchJobsSettings;
    private final PagedCallSettings.Builder<
            SearchJobsRequest, SearchJobsResponse, SearchJobsForAlertPagedResponse>
        searchJobsForAlertSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_5_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "retry_policy_3_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeoutDuration(Duration.ofMillis(30000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(30000L))
              .setTotalTimeoutDuration(Duration.ofMillis(30000L))
              .build();
      definitions.put("no_retry_5_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(60000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(30000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(30000L))
              .setTotalTimeoutDuration(Duration.ofMillis(30000L))
              .build();
      definitions.put("retry_policy_3_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      batchCreateJobsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      batchCreateJobsOperationSettings = OperationCallSettings.newBuilder();
      getJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      batchUpdateJobsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      batchUpdateJobsOperationSettings = OperationCallSettings.newBuilder();
      deleteJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      batchDeleteJobsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listJobsSettings = PagedCallSettings.newBuilder(LIST_JOBS_PAGE_STR_FACT);
      searchJobsSettings = PagedCallSettings.newBuilder(SEARCH_JOBS_PAGE_STR_FACT);
      searchJobsForAlertSettings =
          PagedCallSettings.newBuilder(SEARCH_JOBS_FOR_ALERT_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createJobSettings,
              batchCreateJobsSettings,
              getJobSettings,
              updateJobSettings,
              batchUpdateJobsSettings,
              deleteJobSettings,
              batchDeleteJobsSettings,
              listJobsSettings,
              searchJobsSettings,
              searchJobsForAlertSettings);
      initDefaults(this);
    }

    protected Builder(JobServiceStubSettings settings) {
      super(settings);

      createJobSettings = settings.createJobSettings.toBuilder();
      batchCreateJobsSettings = settings.batchCreateJobsSettings.toBuilder();
      batchCreateJobsOperationSettings = settings.batchCreateJobsOperationSettings.toBuilder();
      getJobSettings = settings.getJobSettings.toBuilder();
      updateJobSettings = settings.updateJobSettings.toBuilder();
      batchUpdateJobsSettings = settings.batchUpdateJobsSettings.toBuilder();
      batchUpdateJobsOperationSettings = settings.batchUpdateJobsOperationSettings.toBuilder();
      deleteJobSettings = settings.deleteJobSettings.toBuilder();
      batchDeleteJobsSettings = settings.batchDeleteJobsSettings.toBuilder();
      listJobsSettings = settings.listJobsSettings.toBuilder();
      searchJobsSettings = settings.searchJobsSettings.toBuilder();
      searchJobsForAlertSettings = settings.searchJobsForAlertSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createJobSettings,
              batchCreateJobsSettings,
              getJobSettings,
              updateJobSettings,
              batchUpdateJobsSettings,
              deleteJobSettings,
              batchDeleteJobsSettings,
              listJobsSettings,
              searchJobsSettings,
              searchJobsForAlertSettings);
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
          .createJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_5_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_5_params"));

      builder
          .batchCreateJobsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_5_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_5_params"));

      builder
          .getJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_3_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_3_params"));

      builder
          .updateJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_5_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_5_params"));

      builder
          .batchUpdateJobsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_5_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_5_params"));

      builder
          .deleteJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_3_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_3_params"));

      builder
          .batchDeleteJobsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_5_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_5_params"));

      builder
          .listJobsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_3_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_3_params"));

      builder
          .searchJobsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_5_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_5_params"));

      builder
          .searchJobsForAlertSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_5_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_5_params"));

      builder
          .batchCreateJobsOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<BatchCreateJobsRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_5_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_5_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(JobOperationResult.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(BatchOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .batchUpdateJobsOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<BatchUpdateJobsRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_5_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_5_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(JobOperationResult.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(BatchOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

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

    /** Returns the builder for the settings used for calls to createJob. */
    public UnaryCallSettings.Builder<CreateJobRequest, Job> createJobSettings() {
      return createJobSettings;
    }

    /** Returns the builder for the settings used for calls to batchCreateJobs. */
    public UnaryCallSettings.Builder<BatchCreateJobsRequest, Operation> batchCreateJobsSettings() {
      return batchCreateJobsSettings;
    }

    /** Returns the builder for the settings used for calls to batchCreateJobs. */
    public OperationCallSettings.Builder<
            BatchCreateJobsRequest, JobOperationResult, BatchOperationMetadata>
        batchCreateJobsOperationSettings() {
      return batchCreateJobsOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getJob. */
    public UnaryCallSettings.Builder<GetJobRequest, Job> getJobSettings() {
      return getJobSettings;
    }

    /** Returns the builder for the settings used for calls to updateJob. */
    public UnaryCallSettings.Builder<UpdateJobRequest, Job> updateJobSettings() {
      return updateJobSettings;
    }

    /** Returns the builder for the settings used for calls to batchUpdateJobs. */
    public UnaryCallSettings.Builder<BatchUpdateJobsRequest, Operation> batchUpdateJobsSettings() {
      return batchUpdateJobsSettings;
    }

    /** Returns the builder for the settings used for calls to batchUpdateJobs. */
    public OperationCallSettings.Builder<
            BatchUpdateJobsRequest, JobOperationResult, BatchOperationMetadata>
        batchUpdateJobsOperationSettings() {
      return batchUpdateJobsOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteJob. */
    public UnaryCallSettings.Builder<DeleteJobRequest, Empty> deleteJobSettings() {
      return deleteJobSettings;
    }

    /** Returns the builder for the settings used for calls to batchDeleteJobs. */
    public UnaryCallSettings.Builder<BatchDeleteJobsRequest, Empty> batchDeleteJobsSettings() {
      return batchDeleteJobsSettings;
    }

    /** Returns the builder for the settings used for calls to listJobs. */
    public PagedCallSettings.Builder<ListJobsRequest, ListJobsResponse, ListJobsPagedResponse>
        listJobsSettings() {
      return listJobsSettings;
    }

    /** Returns the builder for the settings used for calls to searchJobs. */
    public PagedCallSettings.Builder<SearchJobsRequest, SearchJobsResponse, SearchJobsPagedResponse>
        searchJobsSettings() {
      return searchJobsSettings;
    }

    /** Returns the builder for the settings used for calls to searchJobsForAlert. */
    public PagedCallSettings.Builder<
            SearchJobsRequest, SearchJobsResponse, SearchJobsForAlertPagedResponse>
        searchJobsForAlertSettings() {
      return searchJobsForAlertSettings;
    }

    @Override
    public JobServiceStubSettings build() throws IOException {
      return new JobServiceStubSettings(this);
    }
  }
}
