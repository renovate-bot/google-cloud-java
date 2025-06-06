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

package com.google.cloud.batch.v1alpha;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.longrunning.OperationsClient;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.batch.v1alpha.stub.BatchServiceStub;
import com.google.cloud.batch.v1alpha.stub.BatchServiceStubSettings;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Google Batch Service. The service manages user submitted batch jobs and
 * allocates Google Compute Engine VM instances to run the jobs.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
 *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
 *   Job job = Job.newBuilder().build();
 *   String jobId = "jobId101296568";
 *   Job response = batchServiceClient.createJob(parent, job, jobId);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the BatchServiceClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> CreateJob</td>
 *      <td><p> Create a Job.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createJob(CreateJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createJob(LocationName parent, Job job, String jobId)
 *           <li><p> createJob(String parent, Job job, String jobId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetJob</td>
 *      <td><p> Get a Job specified by its resource name.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getJob(GetJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getJob(JobName name)
 *           <li><p> getJob(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteJob</td>
 *      <td><p> Delete a Job.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteJobAsync(DeleteJobRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteJobAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteJobOperationCallable()
 *           <li><p> deleteJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CancelJob</td>
 *      <td><p> Cancel a Job.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> cancelJobAsync(CancelJobRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> cancelJobAsync(JobName name)
 *           <li><p> cancelJobAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> cancelJobOperationCallable()
 *           <li><p> cancelJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateJob</td>
 *      <td><p> Update a Job.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateJob(UpdateJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> updateJob(Job job, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListJobs</td>
 *      <td><p> List all Jobs for a project within a region.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listJobs(ListJobsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listJobs(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listJobsPagedCallable()
 *           <li><p> listJobsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetTask</td>
 *      <td><p> Return a single Task.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getTask(GetTaskRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getTask(TaskName name)
 *           <li><p> getTask(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getTaskCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListTasks</td>
 *      <td><p> List Tasks associated with a job.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listTasks(ListTasksRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listTasks(TaskGroupName parent)
 *           <li><p> listTasks(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listTasksPagedCallable()
 *           <li><p> listTasksCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateResourceAllowance</td>
 *      <td><p> Create a Resource Allowance.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createResourceAllowance(CreateResourceAllowanceRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createResourceAllowance(LocationName parent, ResourceAllowance resourceAllowance, String resourceAllowanceId)
 *           <li><p> createResourceAllowance(String parent, ResourceAllowance resourceAllowance, String resourceAllowanceId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createResourceAllowanceCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetResourceAllowance</td>
 *      <td><p> Get a ResourceAllowance specified by its resource name.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getResourceAllowance(GetResourceAllowanceRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getResourceAllowance(ResourceAllowanceName name)
 *           <li><p> getResourceAllowance(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getResourceAllowanceCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteResourceAllowance</td>
 *      <td><p> Delete a ResourceAllowance.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteResourceAllowanceAsync(DeleteResourceAllowanceRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteResourceAllowanceAsync(ResourceAllowanceName name)
 *           <li><p> deleteResourceAllowanceAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteResourceAllowanceOperationCallable()
 *           <li><p> deleteResourceAllowanceCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListResourceAllowances</td>
 *      <td><p> List all ResourceAllowances for a project within a region.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listResourceAllowances(ListResourceAllowancesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listResourceAllowances(LocationName parent)
 *           <li><p> listResourceAllowances(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listResourceAllowancesPagedCallable()
 *           <li><p> listResourceAllowancesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateResourceAllowance</td>
 *      <td><p> Update a Resource Allowance.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateResourceAllowance(UpdateResourceAllowanceRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> updateResourceAllowance(ResourceAllowance resourceAllowance, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateResourceAllowanceCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListLocations</td>
 *      <td><p> Lists information about the supported locations for this service.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listLocations(ListLocationsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listLocationsPagedCallable()
 *           <li><p> listLocationsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetLocation</td>
 *      <td><p> Gets information about a location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getLocation(GetLocationRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getLocationCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of BatchServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * BatchServiceSettings batchServiceSettings =
 *     BatchServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * BatchServiceClient batchServiceClient = BatchServiceClient.create(batchServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * BatchServiceSettings batchServiceSettings =
 *     BatchServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * BatchServiceClient batchServiceClient = BatchServiceClient.create(batchServiceSettings);
 * }</pre>
 *
 * <p>To use REST (HTTP1.1/JSON) transport (instead of gRPC) for sending and receiving requests over
 * the wire:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * BatchServiceSettings batchServiceSettings = BatchServiceSettings.newHttpJsonBuilder().build();
 * BatchServiceClient batchServiceClient = BatchServiceClient.create(batchServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class BatchServiceClient implements BackgroundResource {
  private final BatchServiceSettings settings;
  private final BatchServiceStub stub;
  private final OperationsClient httpJsonOperationsClient;
  private final com.google.longrunning.OperationsClient operationsClient;

  /** Constructs an instance of BatchServiceClient with default settings. */
  public static final BatchServiceClient create() throws IOException {
    return create(BatchServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of BatchServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final BatchServiceClient create(BatchServiceSettings settings) throws IOException {
    return new BatchServiceClient(settings);
  }

  /**
   * Constructs an instance of BatchServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(BatchServiceSettings).
   */
  public static final BatchServiceClient create(BatchServiceStub stub) {
    return new BatchServiceClient(stub);
  }

  /**
   * Constructs an instance of BatchServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected BatchServiceClient(BatchServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((BatchServiceStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  protected BatchServiceClient(BatchServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  public final BatchServiceSettings getSettings() {
    return settings;
  }

  public BatchServiceStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final com.google.longrunning.OperationsClient getOperationsClient() {
    return operationsClient;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  @BetaApi
  public final OperationsClient getHttpJsonOperationsClient() {
    return httpJsonOperationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Create a Job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   Job job = Job.newBuilder().build();
   *   String jobId = "jobId101296568";
   *   Job response = batchServiceClient.createJob(parent, job, jobId);
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource name where the Job will be created. Pattern:
   *     "projects/{project}/locations/{location}"
   * @param job Required. The Job to create.
   * @param jobId ID used to uniquely identify the Job within its parent scope. This field should
   *     contain at most 63 characters and must start with lowercase characters. Only lowercase
   *     characters, numbers and '-' are accepted. The '-' character cannot be the first or the last
   *     one. A system generated ID will be used if the field is not set.
   *     <p>The job.name field in the request will be ignored and the created resource name of the
   *     Job will be "{parent}/jobs/{job_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Job createJob(LocationName parent, Job job, String jobId) {
    CreateJobRequest request =
        CreateJobRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setJob(job)
            .setJobId(jobId)
            .build();
    return createJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Create a Job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   Job job = Job.newBuilder().build();
   *   String jobId = "jobId101296568";
   *   Job response = batchServiceClient.createJob(parent, job, jobId);
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource name where the Job will be created. Pattern:
   *     "projects/{project}/locations/{location}"
   * @param job Required. The Job to create.
   * @param jobId ID used to uniquely identify the Job within its parent scope. This field should
   *     contain at most 63 characters and must start with lowercase characters. Only lowercase
   *     characters, numbers and '-' are accepted. The '-' character cannot be the first or the last
   *     one. A system generated ID will be used if the field is not set.
   *     <p>The job.name field in the request will be ignored and the created resource name of the
   *     Job will be "{parent}/jobs/{job_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Job createJob(String parent, Job job, String jobId) {
    CreateJobRequest request =
        CreateJobRequest.newBuilder().setParent(parent).setJob(job).setJobId(jobId).build();
    return createJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Create a Job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   CreateJobRequest request =
   *       CreateJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setJobId("jobId101296568")
   *           .setJob(Job.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Job response = batchServiceClient.createJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Job createJob(CreateJobRequest request) {
    return createJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Create a Job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   CreateJobRequest request =
   *       CreateJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setJobId("jobId101296568")
   *           .setJob(Job.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Job> future = batchServiceClient.createJobCallable().futureCall(request);
   *   // Do something.
   *   Job response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateJobRequest, Job> createJobCallable() {
    return stub.createJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get a Job specified by its resource name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   JobName name = JobName.of("[PROJECT]", "[LOCATION]", "[JOB]");
   *   Job response = batchServiceClient.getJob(name);
   * }
   * }</pre>
   *
   * @param name Required. Job name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Job getJob(JobName name) {
    GetJobRequest request =
        GetJobRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get a Job specified by its resource name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   String name = JobName.of("[PROJECT]", "[LOCATION]", "[JOB]").toString();
   *   Job response = batchServiceClient.getJob(name);
   * }
   * }</pre>
   *
   * @param name Required. Job name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Job getJob(String name) {
    GetJobRequest request = GetJobRequest.newBuilder().setName(name).build();
    return getJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get a Job specified by its resource name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   GetJobRequest request =
   *       GetJobRequest.newBuilder()
   *           .setName(JobName.of("[PROJECT]", "[LOCATION]", "[JOB]").toString())
   *           .build();
   *   Job response = batchServiceClient.getJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Job getJob(GetJobRequest request) {
    return getJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get a Job specified by its resource name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   GetJobRequest request =
   *       GetJobRequest.newBuilder()
   *           .setName(JobName.of("[PROJECT]", "[LOCATION]", "[JOB]").toString())
   *           .build();
   *   ApiFuture<Job> future = batchServiceClient.getJobCallable().futureCall(request);
   *   // Do something.
   *   Job response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetJobRequest, Job> getJobCallable() {
    return stub.getJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Delete a Job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   String name = "name3373707";
   *   batchServiceClient.deleteJobAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Job name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteJobAsync(String name) {
    DeleteJobRequest request = DeleteJobRequest.newBuilder().setName(name).build();
    return deleteJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Delete a Job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   DeleteJobRequest request =
   *       DeleteJobRequest.newBuilder()
   *           .setName("name3373707")
   *           .setReason("reason-934964668")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   batchServiceClient.deleteJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteJobAsync(DeleteJobRequest request) {
    return deleteJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Delete a Job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   DeleteJobRequest request =
   *       DeleteJobRequest.newBuilder()
   *           .setName("name3373707")
   *           .setReason("reason-934964668")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Empty, OperationMetadata> future =
   *       batchServiceClient.deleteJobOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteJobRequest, Empty, OperationMetadata>
      deleteJobOperationCallable() {
    return stub.deleteJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Delete a Job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   DeleteJobRequest request =
   *       DeleteJobRequest.newBuilder()
   *           .setName("name3373707")
   *           .setReason("reason-934964668")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future = batchServiceClient.deleteJobCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteJobRequest, Operation> deleteJobCallable() {
    return stub.deleteJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancel a Job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   JobName name = JobName.of("[PROJECT]", "[LOCATION]", "[JOB]");
   *   CancelJobResponse response = batchServiceClient.cancelJobAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. Job name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<CancelJobResponse, OperationMetadata> cancelJobAsync(JobName name) {
    CancelJobRequest request =
        CancelJobRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return cancelJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancel a Job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   String name = JobName.of("[PROJECT]", "[LOCATION]", "[JOB]").toString();
   *   CancelJobResponse response = batchServiceClient.cancelJobAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. Job name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<CancelJobResponse, OperationMetadata> cancelJobAsync(String name) {
    CancelJobRequest request = CancelJobRequest.newBuilder().setName(name).build();
    return cancelJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancel a Job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   CancelJobRequest request =
   *       CancelJobRequest.newBuilder()
   *           .setName(JobName.of("[PROJECT]", "[LOCATION]", "[JOB]").toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   CancelJobResponse response = batchServiceClient.cancelJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<CancelJobResponse, OperationMetadata> cancelJobAsync(
      CancelJobRequest request) {
    return cancelJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancel a Job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   CancelJobRequest request =
   *       CancelJobRequest.newBuilder()
   *           .setName(JobName.of("[PROJECT]", "[LOCATION]", "[JOB]").toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<CancelJobResponse, OperationMetadata> future =
   *       batchServiceClient.cancelJobOperationCallable().futureCall(request);
   *   // Do something.
   *   CancelJobResponse response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<CancelJobRequest, CancelJobResponse, OperationMetadata>
      cancelJobOperationCallable() {
    return stub.cancelJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancel a Job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   CancelJobRequest request =
   *       CancelJobRequest.newBuilder()
   *           .setName(JobName.of("[PROJECT]", "[LOCATION]", "[JOB]").toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future = batchServiceClient.cancelJobCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CancelJobRequest, Operation> cancelJobCallable() {
    return stub.cancelJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update a Job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   Job job = Job.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Job response = batchServiceClient.updateJob(job, updateMask);
   * }
   * }</pre>
   *
   * @param job Required. The Job to update. Only fields specified in `updateMask` are updated.
   * @param updateMask Required. Mask of fields to update.
   *     <p>The `jobs.patch` method can only be used while a job is in the `QUEUED`, `SCHEDULED`, or
   *     `RUNNING` state and currently only supports increasing the value of the first `taskCount`
   *     field in the job's `taskGroups` field. Therefore, you must set the value of `updateMask` to
   *     `taskGroups`. Any other job fields in the update request will be ignored.
   *     <p>For example, to update a job's `taskCount` to `2`, set `updateMask` to `taskGroups` and
   *     use the following request body: ``` { "taskGroups":[{ "taskCount": 2 }] } ```
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Job updateJob(Job job, FieldMask updateMask) {
    UpdateJobRequest request =
        UpdateJobRequest.newBuilder().setJob(job).setUpdateMask(updateMask).build();
    return updateJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update a Job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   UpdateJobRequest request =
   *       UpdateJobRequest.newBuilder()
   *           .setJob(Job.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Job response = batchServiceClient.updateJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Job updateJob(UpdateJobRequest request) {
    return updateJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update a Job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   UpdateJobRequest request =
   *       UpdateJobRequest.newBuilder()
   *           .setJob(Job.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Job> future = batchServiceClient.updateJobCallable().futureCall(request);
   *   // Do something.
   *   Job response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateJobRequest, Job> updateJobCallable() {
    return stub.updateJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List all Jobs for a project within a region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   String parent = "parent-995424086";
   *   for (Job element : batchServiceClient.listJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Parent path.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListJobsPagedResponse listJobs(String parent) {
    ListJobsRequest request = ListJobsRequest.newBuilder().setParent(parent).build();
    return listJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List all Jobs for a project within a region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   ListJobsRequest request =
   *       ListJobsRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Job element : batchServiceClient.listJobs(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListJobsPagedResponse listJobs(ListJobsRequest request) {
    return listJobsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List all Jobs for a project within a region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   ListJobsRequest request =
   *       ListJobsRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Job> future = batchServiceClient.listJobsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Job element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListJobsRequest, ListJobsPagedResponse> listJobsPagedCallable() {
    return stub.listJobsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List all Jobs for a project within a region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   ListJobsRequest request =
   *       ListJobsRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListJobsResponse response = batchServiceClient.listJobsCallable().call(request);
   *     for (Job element : response.getJobsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListJobsRequest, ListJobsResponse> listJobsCallable() {
    return stub.listJobsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Return a single Task.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   TaskName name = TaskName.of("[PROJECT]", "[LOCATION]", "[JOB]", "[TASK_GROUP]", "[TASK]");
   *   Task response = batchServiceClient.getTask(name);
   * }
   * }</pre>
   *
   * @param name Required. Task name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Task getTask(TaskName name) {
    GetTaskRequest request =
        GetTaskRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getTask(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Return a single Task.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   String name =
   *       TaskName.of("[PROJECT]", "[LOCATION]", "[JOB]", "[TASK_GROUP]", "[TASK]").toString();
   *   Task response = batchServiceClient.getTask(name);
   * }
   * }</pre>
   *
   * @param name Required. Task name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Task getTask(String name) {
    GetTaskRequest request = GetTaskRequest.newBuilder().setName(name).build();
    return getTask(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Return a single Task.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   GetTaskRequest request =
   *       GetTaskRequest.newBuilder()
   *           .setName(
   *               TaskName.of("[PROJECT]", "[LOCATION]", "[JOB]", "[TASK_GROUP]", "[TASK]")
   *                   .toString())
   *           .build();
   *   Task response = batchServiceClient.getTask(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Task getTask(GetTaskRequest request) {
    return getTaskCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Return a single Task.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   GetTaskRequest request =
   *       GetTaskRequest.newBuilder()
   *           .setName(
   *               TaskName.of("[PROJECT]", "[LOCATION]", "[JOB]", "[TASK_GROUP]", "[TASK]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Task> future = batchServiceClient.getTaskCallable().futureCall(request);
   *   // Do something.
   *   Task response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetTaskRequest, Task> getTaskCallable() {
    return stub.getTaskCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List Tasks associated with a job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   TaskGroupName parent = TaskGroupName.of("[PROJECT]", "[LOCATION]", "[JOB]", "[TASK_GROUP]");
   *   for (Task element : batchServiceClient.listTasks(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Name of a TaskGroup from which Tasks are being requested. Pattern:
   *     "projects/{project}/locations/{location}/jobs/{job}/taskGroups/{task_group}"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTasksPagedResponse listTasks(TaskGroupName parent) {
    ListTasksRequest request =
        ListTasksRequest.newBuilder().setParent(parent == null ? null : parent.toString()).build();
    return listTasks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List Tasks associated with a job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   String parent =
   *       TaskGroupName.of("[PROJECT]", "[LOCATION]", "[JOB]", "[TASK_GROUP]").toString();
   *   for (Task element : batchServiceClient.listTasks(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Name of a TaskGroup from which Tasks are being requested. Pattern:
   *     "projects/{project}/locations/{location}/jobs/{job}/taskGroups/{task_group}"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTasksPagedResponse listTasks(String parent) {
    ListTasksRequest request = ListTasksRequest.newBuilder().setParent(parent).build();
    return listTasks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List Tasks associated with a job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   ListTasksRequest request =
   *       ListTasksRequest.newBuilder()
   *           .setParent(
   *               TaskGroupName.of("[PROJECT]", "[LOCATION]", "[JOB]", "[TASK_GROUP]").toString())
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Task element : batchServiceClient.listTasks(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTasksPagedResponse listTasks(ListTasksRequest request) {
    return listTasksPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List Tasks associated with a job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   ListTasksRequest request =
   *       ListTasksRequest.newBuilder()
   *           .setParent(
   *               TaskGroupName.of("[PROJECT]", "[LOCATION]", "[JOB]", "[TASK_GROUP]").toString())
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Task> future = batchServiceClient.listTasksPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Task element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListTasksRequest, ListTasksPagedResponse> listTasksPagedCallable() {
    return stub.listTasksPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List Tasks associated with a job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   ListTasksRequest request =
   *       ListTasksRequest.newBuilder()
   *           .setParent(
   *               TaskGroupName.of("[PROJECT]", "[LOCATION]", "[JOB]", "[TASK_GROUP]").toString())
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListTasksResponse response = batchServiceClient.listTasksCallable().call(request);
   *     for (Task element : response.getTasksList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListTasksRequest, ListTasksResponse> listTasksCallable() {
    return stub.listTasksCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Create a Resource Allowance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   ResourceAllowance resourceAllowance = ResourceAllowance.newBuilder().build();
   *   String resourceAllowanceId = "resourceAllowanceId-786470299";
   *   ResourceAllowance response =
   *       batchServiceClient.createResourceAllowance(
   *           parent, resourceAllowance, resourceAllowanceId);
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource name where the ResourceAllowance will be created.
   *     Pattern: "projects/{project}/locations/{location}"
   * @param resourceAllowance Required. The ResourceAllowance to create.
   * @param resourceAllowanceId ID used to uniquely identify the ResourceAllowance within its parent
   *     scope. This field should contain at most 63 characters and must start with lowercase
   *     characters. Only lowercase characters, numbers and '-' are accepted. The '-' character
   *     cannot be the first or the last one. A system generated ID will be used if the field is not
   *     set.
   *     <p>The resource_allowance.name field in the request will be ignored and the created
   *     resource name of the ResourceAllowance will be
   *     "{parent}/resourceAllowances/{resource_allowance_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ResourceAllowance createResourceAllowance(
      LocationName parent, ResourceAllowance resourceAllowance, String resourceAllowanceId) {
    CreateResourceAllowanceRequest request =
        CreateResourceAllowanceRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setResourceAllowance(resourceAllowance)
            .setResourceAllowanceId(resourceAllowanceId)
            .build();
    return createResourceAllowance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Create a Resource Allowance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   ResourceAllowance resourceAllowance = ResourceAllowance.newBuilder().build();
   *   String resourceAllowanceId = "resourceAllowanceId-786470299";
   *   ResourceAllowance response =
   *       batchServiceClient.createResourceAllowance(
   *           parent, resourceAllowance, resourceAllowanceId);
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource name where the ResourceAllowance will be created.
   *     Pattern: "projects/{project}/locations/{location}"
   * @param resourceAllowance Required. The ResourceAllowance to create.
   * @param resourceAllowanceId ID used to uniquely identify the ResourceAllowance within its parent
   *     scope. This field should contain at most 63 characters and must start with lowercase
   *     characters. Only lowercase characters, numbers and '-' are accepted. The '-' character
   *     cannot be the first or the last one. A system generated ID will be used if the field is not
   *     set.
   *     <p>The resource_allowance.name field in the request will be ignored and the created
   *     resource name of the ResourceAllowance will be
   *     "{parent}/resourceAllowances/{resource_allowance_id}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ResourceAllowance createResourceAllowance(
      String parent, ResourceAllowance resourceAllowance, String resourceAllowanceId) {
    CreateResourceAllowanceRequest request =
        CreateResourceAllowanceRequest.newBuilder()
            .setParent(parent)
            .setResourceAllowance(resourceAllowance)
            .setResourceAllowanceId(resourceAllowanceId)
            .build();
    return createResourceAllowance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Create a Resource Allowance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   CreateResourceAllowanceRequest request =
   *       CreateResourceAllowanceRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setResourceAllowanceId("resourceAllowanceId-786470299")
   *           .setResourceAllowance(ResourceAllowance.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ResourceAllowance response = batchServiceClient.createResourceAllowance(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ResourceAllowance createResourceAllowance(CreateResourceAllowanceRequest request) {
    return createResourceAllowanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Create a Resource Allowance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   CreateResourceAllowanceRequest request =
   *       CreateResourceAllowanceRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setResourceAllowanceId("resourceAllowanceId-786470299")
   *           .setResourceAllowance(ResourceAllowance.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<ResourceAllowance> future =
   *       batchServiceClient.createResourceAllowanceCallable().futureCall(request);
   *   // Do something.
   *   ResourceAllowance response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateResourceAllowanceRequest, ResourceAllowance>
      createResourceAllowanceCallable() {
    return stub.createResourceAllowanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get a ResourceAllowance specified by its resource name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   ResourceAllowanceName name =
   *       ResourceAllowanceName.of("[PROJECT]", "[LOCATION]", "[RESOURCE_ALLOWANCE]");
   *   ResourceAllowance response = batchServiceClient.getResourceAllowance(name);
   * }
   * }</pre>
   *
   * @param name Required. ResourceAllowance name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ResourceAllowance getResourceAllowance(ResourceAllowanceName name) {
    GetResourceAllowanceRequest request =
        GetResourceAllowanceRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getResourceAllowance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get a ResourceAllowance specified by its resource name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   String name =
   *       ResourceAllowanceName.of("[PROJECT]", "[LOCATION]", "[RESOURCE_ALLOWANCE]").toString();
   *   ResourceAllowance response = batchServiceClient.getResourceAllowance(name);
   * }
   * }</pre>
   *
   * @param name Required. ResourceAllowance name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ResourceAllowance getResourceAllowance(String name) {
    GetResourceAllowanceRequest request =
        GetResourceAllowanceRequest.newBuilder().setName(name).build();
    return getResourceAllowance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get a ResourceAllowance specified by its resource name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   GetResourceAllowanceRequest request =
   *       GetResourceAllowanceRequest.newBuilder()
   *           .setName(
   *               ResourceAllowanceName.of("[PROJECT]", "[LOCATION]", "[RESOURCE_ALLOWANCE]")
   *                   .toString())
   *           .build();
   *   ResourceAllowance response = batchServiceClient.getResourceAllowance(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ResourceAllowance getResourceAllowance(GetResourceAllowanceRequest request) {
    return getResourceAllowanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get a ResourceAllowance specified by its resource name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   GetResourceAllowanceRequest request =
   *       GetResourceAllowanceRequest.newBuilder()
   *           .setName(
   *               ResourceAllowanceName.of("[PROJECT]", "[LOCATION]", "[RESOURCE_ALLOWANCE]")
   *                   .toString())
   *           .build();
   *   ApiFuture<ResourceAllowance> future =
   *       batchServiceClient.getResourceAllowanceCallable().futureCall(request);
   *   // Do something.
   *   ResourceAllowance response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetResourceAllowanceRequest, ResourceAllowance>
      getResourceAllowanceCallable() {
    return stub.getResourceAllowanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Delete a ResourceAllowance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   ResourceAllowanceName name =
   *       ResourceAllowanceName.of("[PROJECT]", "[LOCATION]", "[RESOURCE_ALLOWANCE]");
   *   batchServiceClient.deleteResourceAllowanceAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. ResourceAllowance name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteResourceAllowanceAsync(
      ResourceAllowanceName name) {
    DeleteResourceAllowanceRequest request =
        DeleteResourceAllowanceRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return deleteResourceAllowanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Delete a ResourceAllowance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   String name =
   *       ResourceAllowanceName.of("[PROJECT]", "[LOCATION]", "[RESOURCE_ALLOWANCE]").toString();
   *   batchServiceClient.deleteResourceAllowanceAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. ResourceAllowance name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteResourceAllowanceAsync(String name) {
    DeleteResourceAllowanceRequest request =
        DeleteResourceAllowanceRequest.newBuilder().setName(name).build();
    return deleteResourceAllowanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Delete a ResourceAllowance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   DeleteResourceAllowanceRequest request =
   *       DeleteResourceAllowanceRequest.newBuilder()
   *           .setName(
   *               ResourceAllowanceName.of("[PROJECT]", "[LOCATION]", "[RESOURCE_ALLOWANCE]")
   *                   .toString())
   *           .setReason("reason-934964668")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   batchServiceClient.deleteResourceAllowanceAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteResourceAllowanceAsync(
      DeleteResourceAllowanceRequest request) {
    return deleteResourceAllowanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Delete a ResourceAllowance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   DeleteResourceAllowanceRequest request =
   *       DeleteResourceAllowanceRequest.newBuilder()
   *           .setName(
   *               ResourceAllowanceName.of("[PROJECT]", "[LOCATION]", "[RESOURCE_ALLOWANCE]")
   *                   .toString())
   *           .setReason("reason-934964668")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Empty, OperationMetadata> future =
   *       batchServiceClient.deleteResourceAllowanceOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteResourceAllowanceRequest, Empty, OperationMetadata>
      deleteResourceAllowanceOperationCallable() {
    return stub.deleteResourceAllowanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Delete a ResourceAllowance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   DeleteResourceAllowanceRequest request =
   *       DeleteResourceAllowanceRequest.newBuilder()
   *           .setName(
   *               ResourceAllowanceName.of("[PROJECT]", "[LOCATION]", "[RESOURCE_ALLOWANCE]")
   *                   .toString())
   *           .setReason("reason-934964668")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       batchServiceClient.deleteResourceAllowanceCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteResourceAllowanceRequest, Operation>
      deleteResourceAllowanceCallable() {
    return stub.deleteResourceAllowanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List all ResourceAllowances for a project within a region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (ResourceAllowance element :
   *       batchServiceClient.listResourceAllowances(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Parent path.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListResourceAllowancesPagedResponse listResourceAllowances(LocationName parent) {
    ListResourceAllowancesRequest request =
        ListResourceAllowancesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listResourceAllowances(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List all ResourceAllowances for a project within a region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (ResourceAllowance element :
   *       batchServiceClient.listResourceAllowances(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Parent path.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListResourceAllowancesPagedResponse listResourceAllowances(String parent) {
    ListResourceAllowancesRequest request =
        ListResourceAllowancesRequest.newBuilder().setParent(parent).build();
    return listResourceAllowances(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List all ResourceAllowances for a project within a region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   ListResourceAllowancesRequest request =
   *       ListResourceAllowancesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (ResourceAllowance element :
   *       batchServiceClient.listResourceAllowances(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListResourceAllowancesPagedResponse listResourceAllowances(
      ListResourceAllowancesRequest request) {
    return listResourceAllowancesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List all ResourceAllowances for a project within a region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   ListResourceAllowancesRequest request =
   *       ListResourceAllowancesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<ResourceAllowance> future =
   *       batchServiceClient.listResourceAllowancesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (ResourceAllowance element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListResourceAllowancesRequest, ListResourceAllowancesPagedResponse>
      listResourceAllowancesPagedCallable() {
    return stub.listResourceAllowancesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List all ResourceAllowances for a project within a region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   ListResourceAllowancesRequest request =
   *       ListResourceAllowancesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListResourceAllowancesResponse response =
   *         batchServiceClient.listResourceAllowancesCallable().call(request);
   *     for (ResourceAllowance element : response.getResourceAllowancesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListResourceAllowancesRequest, ListResourceAllowancesResponse>
      listResourceAllowancesCallable() {
    return stub.listResourceAllowancesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update a Resource Allowance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   ResourceAllowance resourceAllowance = ResourceAllowance.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   ResourceAllowance response =
   *       batchServiceClient.updateResourceAllowance(resourceAllowance, updateMask);
   * }
   * }</pre>
   *
   * @param resourceAllowance Required. The ResourceAllowance to update. Update description. Only
   *     fields specified in `update_mask` are updated.
   * @param updateMask Required. Mask of fields to update.
   *     <p>Field mask is used to specify the fields to be overwritten in the ResourceAllowance
   *     resource by the update. The fields specified in the update_mask are relative to the
   *     resource, not the full request. A field will be overwritten if it is in the mask. If the
   *     user does not provide a mask then all fields will be overwritten.
   *     <p>UpdateResourceAllowance request now only supports update on `limit` field.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ResourceAllowance updateResourceAllowance(
      ResourceAllowance resourceAllowance, FieldMask updateMask) {
    UpdateResourceAllowanceRequest request =
        UpdateResourceAllowanceRequest.newBuilder()
            .setResourceAllowance(resourceAllowance)
            .setUpdateMask(updateMask)
            .build();
    return updateResourceAllowance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update a Resource Allowance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   UpdateResourceAllowanceRequest request =
   *       UpdateResourceAllowanceRequest.newBuilder()
   *           .setResourceAllowance(ResourceAllowance.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ResourceAllowance response = batchServiceClient.updateResourceAllowance(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ResourceAllowance updateResourceAllowance(UpdateResourceAllowanceRequest request) {
    return updateResourceAllowanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update a Resource Allowance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   UpdateResourceAllowanceRequest request =
   *       UpdateResourceAllowanceRequest.newBuilder()
   *           .setResourceAllowance(ResourceAllowance.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<ResourceAllowance> future =
   *       batchServiceClient.updateResourceAllowanceCallable().futureCall(request);
   *   // Do something.
   *   ResourceAllowance response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateResourceAllowanceRequest, ResourceAllowance>
      updateResourceAllowanceCallable() {
    return stub.updateResourceAllowanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Location element : batchServiceClient.listLocations(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListLocationsPagedResponse listLocations(ListLocationsRequest request) {
    return listLocationsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Location> future =
   *       batchServiceClient.listLocationsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Location element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    return stub.listLocationsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListLocationsResponse response = batchServiceClient.listLocationsCallable().call(request);
   *     for (Location element : response.getLocationsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    return stub.listLocationsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information about a location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   Location response = batchServiceClient.getLocation(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Location getLocation(GetLocationRequest request) {
    return getLocationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information about a location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<Location> future = batchServiceClient.getLocationCallable().futureCall(request);
   *   // Do something.
   *   Location response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return stub.getLocationCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListJobsPagedResponse
      extends AbstractPagedListResponse<
          ListJobsRequest, ListJobsResponse, Job, ListJobsPage, ListJobsFixedSizeCollection> {

    public static ApiFuture<ListJobsPagedResponse> createAsync(
        PageContext<ListJobsRequest, ListJobsResponse, Job> context,
        ApiFuture<ListJobsResponse> futureResponse) {
      ApiFuture<ListJobsPage> futurePage =
          ListJobsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new ListJobsPagedResponse(input), MoreExecutors.directExecutor());
    }

    private ListJobsPagedResponse(ListJobsPage page) {
      super(page, ListJobsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListJobsPage
      extends AbstractPage<ListJobsRequest, ListJobsResponse, Job, ListJobsPage> {

    private ListJobsPage(
        PageContext<ListJobsRequest, ListJobsResponse, Job> context, ListJobsResponse response) {
      super(context, response);
    }

    private static ListJobsPage createEmptyPage() {
      return new ListJobsPage(null, null);
    }

    @Override
    protected ListJobsPage createPage(
        PageContext<ListJobsRequest, ListJobsResponse, Job> context, ListJobsResponse response) {
      return new ListJobsPage(context, response);
    }

    @Override
    public ApiFuture<ListJobsPage> createPageAsync(
        PageContext<ListJobsRequest, ListJobsResponse, Job> context,
        ApiFuture<ListJobsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListJobsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListJobsRequest, ListJobsResponse, Job, ListJobsPage, ListJobsFixedSizeCollection> {

    private ListJobsFixedSizeCollection(List<ListJobsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListJobsFixedSizeCollection createEmptyCollection() {
      return new ListJobsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListJobsFixedSizeCollection createCollection(
        List<ListJobsPage> pages, int collectionSize) {
      return new ListJobsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListTasksPagedResponse
      extends AbstractPagedListResponse<
          ListTasksRequest, ListTasksResponse, Task, ListTasksPage, ListTasksFixedSizeCollection> {

    public static ApiFuture<ListTasksPagedResponse> createAsync(
        PageContext<ListTasksRequest, ListTasksResponse, Task> context,
        ApiFuture<ListTasksResponse> futureResponse) {
      ApiFuture<ListTasksPage> futurePage =
          ListTasksPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new ListTasksPagedResponse(input), MoreExecutors.directExecutor());
    }

    private ListTasksPagedResponse(ListTasksPage page) {
      super(page, ListTasksFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListTasksPage
      extends AbstractPage<ListTasksRequest, ListTasksResponse, Task, ListTasksPage> {

    private ListTasksPage(
        PageContext<ListTasksRequest, ListTasksResponse, Task> context,
        ListTasksResponse response) {
      super(context, response);
    }

    private static ListTasksPage createEmptyPage() {
      return new ListTasksPage(null, null);
    }

    @Override
    protected ListTasksPage createPage(
        PageContext<ListTasksRequest, ListTasksResponse, Task> context,
        ListTasksResponse response) {
      return new ListTasksPage(context, response);
    }

    @Override
    public ApiFuture<ListTasksPage> createPageAsync(
        PageContext<ListTasksRequest, ListTasksResponse, Task> context,
        ApiFuture<ListTasksResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListTasksFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListTasksRequest, ListTasksResponse, Task, ListTasksPage, ListTasksFixedSizeCollection> {

    private ListTasksFixedSizeCollection(List<ListTasksPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListTasksFixedSizeCollection createEmptyCollection() {
      return new ListTasksFixedSizeCollection(null, 0);
    }

    @Override
    protected ListTasksFixedSizeCollection createCollection(
        List<ListTasksPage> pages, int collectionSize) {
      return new ListTasksFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListResourceAllowancesPagedResponse
      extends AbstractPagedListResponse<
          ListResourceAllowancesRequest,
          ListResourceAllowancesResponse,
          ResourceAllowance,
          ListResourceAllowancesPage,
          ListResourceAllowancesFixedSizeCollection> {

    public static ApiFuture<ListResourceAllowancesPagedResponse> createAsync(
        PageContext<
                ListResourceAllowancesRequest, ListResourceAllowancesResponse, ResourceAllowance>
            context,
        ApiFuture<ListResourceAllowancesResponse> futureResponse) {
      ApiFuture<ListResourceAllowancesPage> futurePage =
          ListResourceAllowancesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListResourceAllowancesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListResourceAllowancesPagedResponse(ListResourceAllowancesPage page) {
      super(page, ListResourceAllowancesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListResourceAllowancesPage
      extends AbstractPage<
          ListResourceAllowancesRequest,
          ListResourceAllowancesResponse,
          ResourceAllowance,
          ListResourceAllowancesPage> {

    private ListResourceAllowancesPage(
        PageContext<
                ListResourceAllowancesRequest, ListResourceAllowancesResponse, ResourceAllowance>
            context,
        ListResourceAllowancesResponse response) {
      super(context, response);
    }

    private static ListResourceAllowancesPage createEmptyPage() {
      return new ListResourceAllowancesPage(null, null);
    }

    @Override
    protected ListResourceAllowancesPage createPage(
        PageContext<
                ListResourceAllowancesRequest, ListResourceAllowancesResponse, ResourceAllowance>
            context,
        ListResourceAllowancesResponse response) {
      return new ListResourceAllowancesPage(context, response);
    }

    @Override
    public ApiFuture<ListResourceAllowancesPage> createPageAsync(
        PageContext<
                ListResourceAllowancesRequest, ListResourceAllowancesResponse, ResourceAllowance>
            context,
        ApiFuture<ListResourceAllowancesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListResourceAllowancesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListResourceAllowancesRequest,
          ListResourceAllowancesResponse,
          ResourceAllowance,
          ListResourceAllowancesPage,
          ListResourceAllowancesFixedSizeCollection> {

    private ListResourceAllowancesFixedSizeCollection(
        List<ListResourceAllowancesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListResourceAllowancesFixedSizeCollection createEmptyCollection() {
      return new ListResourceAllowancesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListResourceAllowancesFixedSizeCollection createCollection(
        List<ListResourceAllowancesPage> pages, int collectionSize) {
      return new ListResourceAllowancesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListLocationsPagedResponse
      extends AbstractPagedListResponse<
          ListLocationsRequest,
          ListLocationsResponse,
          Location,
          ListLocationsPage,
          ListLocationsFixedSizeCollection> {

    public static ApiFuture<ListLocationsPagedResponse> createAsync(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ApiFuture<ListLocationsResponse> futureResponse) {
      ApiFuture<ListLocationsPage> futurePage =
          ListLocationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListLocationsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListLocationsPagedResponse(ListLocationsPage page) {
      super(page, ListLocationsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListLocationsPage
      extends AbstractPage<
          ListLocationsRequest, ListLocationsResponse, Location, ListLocationsPage> {

    private ListLocationsPage(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ListLocationsResponse response) {
      super(context, response);
    }

    private static ListLocationsPage createEmptyPage() {
      return new ListLocationsPage(null, null);
    }

    @Override
    protected ListLocationsPage createPage(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ListLocationsResponse response) {
      return new ListLocationsPage(context, response);
    }

    @Override
    public ApiFuture<ListLocationsPage> createPageAsync(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ApiFuture<ListLocationsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListLocationsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListLocationsRequest,
          ListLocationsResponse,
          Location,
          ListLocationsPage,
          ListLocationsFixedSizeCollection> {

    private ListLocationsFixedSizeCollection(List<ListLocationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListLocationsFixedSizeCollection createEmptyCollection() {
      return new ListLocationsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListLocationsFixedSizeCollection createCollection(
        List<ListLocationsPage> pages, int collectionSize) {
      return new ListLocationsFixedSizeCollection(pages, collectionSize);
    }
  }
}
