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

package com.google.cloud.compute.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.stub.InterconnectAttachmentGroupsStub;
import com.google.cloud.compute.v1.stub.InterconnectAttachmentGroupsStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: The InterconnectAttachmentGroups API.
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
 * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
 *     InterconnectAttachmentGroupsClient.create()) {
 *   String project = "project-309310695";
 *   String interconnectAttachmentGroup = "interconnectAttachmentGroup-1652813650";
 *   InterconnectAttachmentGroup response =
 *       interconnectAttachmentGroupsClient.get(project, interconnectAttachmentGroup);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the InterconnectAttachmentGroupsClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> Delete</td>
 *      <td><p> Deletes the specified InterconnectAttachmentGroup in the given scope</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteAsync(DeleteInterconnectAttachmentGroupRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteAsync(String project, String interconnectAttachmentGroup)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteOperationCallable()
 *           <li><p> deleteCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Get</td>
 *      <td><p> Returns the specified InterconnectAttachmentGroup resource in the given scope.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> get(GetInterconnectAttachmentGroupRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> get(String project, String interconnectAttachmentGroup)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetIamPolicy</td>
 *      <td><p> Gets the access control policy for a resource. May be empty if no such policy or resource exists.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getIamPolicy(GetIamPolicyInterconnectAttachmentGroupRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getIamPolicy(String project, String resource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getIamPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetOperationalStatus</td>
 *      <td><p> Returns the InterconnectAttachmentStatuses for the specified InterconnectAttachmentGroup resource.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getOperationalStatus(GetOperationalStatusInterconnectAttachmentGroupRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getOperationalStatus(String project, String interconnectAttachmentGroup)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getOperationalStatusCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Insert</td>
 *      <td><p> Creates a InterconnectAttachmentGroup in the specified project in the given scope using the parameters that are included in the request.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> insertAsync(InsertInterconnectAttachmentGroupRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> insertAsync(String project, InterconnectAttachmentGroup interconnectAttachmentGroupResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> insertOperationCallable()
 *           <li><p> insertCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> List</td>
 *      <td><p> Lists the InterconnectAttachmentGroups for a project in the given scope.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> list(ListInterconnectAttachmentGroupsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> list(String project)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listPagedCallable()
 *           <li><p> listCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Patch</td>
 *      <td><p> Patches the specified InterconnectAttachmentGroup resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and processing rules.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> patchAsync(PatchInterconnectAttachmentGroupRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> patchAsync(String project, String interconnectAttachmentGroup, InterconnectAttachmentGroup interconnectAttachmentGroupResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> patchOperationCallable()
 *           <li><p> patchCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> SetIamPolicy</td>
 *      <td><p> Sets the access control policy on the specified resource. Replaces any existing policy.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> setIamPolicy(SetIamPolicyInterconnectAttachmentGroupRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> setIamPolicy(String project, String resource, GlobalSetPolicyRequest globalSetPolicyRequestResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> setIamPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> TestIamPermissions</td>
 *      <td><p> Returns permissions that a caller has on the specified resource.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> testIamPermissions(TestIamPermissionsInterconnectAttachmentGroupRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> testIamPermissions(String project, String resource, TestPermissionsRequest testPermissionsRequestResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> testIamPermissionsCallable()
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
 * <p>This class can be customized by passing in a custom instance of
 * InterconnectAttachmentGroupsSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * InterconnectAttachmentGroupsSettings interconnectAttachmentGroupsSettings =
 *     InterconnectAttachmentGroupsSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
 *     InterconnectAttachmentGroupsClient.create(interconnectAttachmentGroupsSettings);
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
 * InterconnectAttachmentGroupsSettings interconnectAttachmentGroupsSettings =
 *     InterconnectAttachmentGroupsSettings.newBuilder().setEndpoint(myEndpoint).build();
 * InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
 *     InterconnectAttachmentGroupsClient.create(interconnectAttachmentGroupsSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class InterconnectAttachmentGroupsClient implements BackgroundResource {
  private final InterconnectAttachmentGroupsSettings settings;
  private final InterconnectAttachmentGroupsStub stub;

  /** Constructs an instance of InterconnectAttachmentGroupsClient with default settings. */
  public static final InterconnectAttachmentGroupsClient create() throws IOException {
    return create(InterconnectAttachmentGroupsSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of InterconnectAttachmentGroupsClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final InterconnectAttachmentGroupsClient create(
      InterconnectAttachmentGroupsSettings settings) throws IOException {
    return new InterconnectAttachmentGroupsClient(settings);
  }

  /**
   * Constructs an instance of InterconnectAttachmentGroupsClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(InterconnectAttachmentGroupsSettings).
   */
  public static final InterconnectAttachmentGroupsClient create(
      InterconnectAttachmentGroupsStub stub) {
    return new InterconnectAttachmentGroupsClient(stub);
  }

  /**
   * Constructs an instance of InterconnectAttachmentGroupsClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected InterconnectAttachmentGroupsClient(InterconnectAttachmentGroupsSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((InterconnectAttachmentGroupsStubSettings) settings.getStubSettings()).createStub();
  }

  protected InterconnectAttachmentGroupsClient(InterconnectAttachmentGroupsStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final InterconnectAttachmentGroupsSettings getSettings() {
    return settings;
  }

  public InterconnectAttachmentGroupsStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified InterconnectAttachmentGroup in the given scope
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   String project = "project-309310695";
   *   String interconnectAttachmentGroup = "interconnectAttachmentGroup-1652813650";
   *   Operation response =
   *       interconnectAttachmentGroupsClient
   *           .deleteAsync(project, interconnectAttachmentGroup)
   *           .get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param interconnectAttachmentGroup Name of the InterconnectAttachmentGroup resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> deleteAsync(
      String project, String interconnectAttachmentGroup) {
    DeleteInterconnectAttachmentGroupRequest request =
        DeleteInterconnectAttachmentGroupRequest.newBuilder()
            .setProject(project)
            .setInterconnectAttachmentGroup(interconnectAttachmentGroup)
            .build();
    return deleteAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified InterconnectAttachmentGroup in the given scope
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   DeleteInterconnectAttachmentGroupRequest request =
   *       DeleteInterconnectAttachmentGroupRequest.newBuilder()
   *           .setInterconnectAttachmentGroup("interconnectAttachmentGroup-1652813650")
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = interconnectAttachmentGroupsClient.deleteAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> deleteAsync(
      DeleteInterconnectAttachmentGroupRequest request) {
    return deleteOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified InterconnectAttachmentGroup in the given scope
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   DeleteInterconnectAttachmentGroupRequest request =
   *       DeleteInterconnectAttachmentGroupRequest.newBuilder()
   *           .setInterconnectAttachmentGroup("interconnectAttachmentGroup-1652813650")
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       interconnectAttachmentGroupsClient.deleteOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteInterconnectAttachmentGroupRequest, Operation, Operation>
      deleteOperationCallable() {
    return stub.deleteOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified InterconnectAttachmentGroup in the given scope
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   DeleteInterconnectAttachmentGroupRequest request =
   *       DeleteInterconnectAttachmentGroupRequest.newBuilder()
   *           .setInterconnectAttachmentGroup("interconnectAttachmentGroup-1652813650")
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       interconnectAttachmentGroupsClient.deleteCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteInterconnectAttachmentGroupRequest, Operation> deleteCallable() {
    return stub.deleteCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified InterconnectAttachmentGroup resource in the given scope.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   String project = "project-309310695";
   *   String interconnectAttachmentGroup = "interconnectAttachmentGroup-1652813650";
   *   InterconnectAttachmentGroup response =
   *       interconnectAttachmentGroupsClient.get(project, interconnectAttachmentGroup);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param interconnectAttachmentGroup Name of the InterconnectAttachmentGroup resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final InterconnectAttachmentGroup get(String project, String interconnectAttachmentGroup) {
    GetInterconnectAttachmentGroupRequest request =
        GetInterconnectAttachmentGroupRequest.newBuilder()
            .setProject(project)
            .setInterconnectAttachmentGroup(interconnectAttachmentGroup)
            .build();
    return get(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified InterconnectAttachmentGroup resource in the given scope.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   GetInterconnectAttachmentGroupRequest request =
   *       GetInterconnectAttachmentGroupRequest.newBuilder()
   *           .setInterconnectAttachmentGroup("interconnectAttachmentGroup-1652813650")
   *           .setProject("project-309310695")
   *           .build();
   *   InterconnectAttachmentGroup response = interconnectAttachmentGroupsClient.get(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final InterconnectAttachmentGroup get(GetInterconnectAttachmentGroupRequest request) {
    return getCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified InterconnectAttachmentGroup resource in the given scope.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   GetInterconnectAttachmentGroupRequest request =
   *       GetInterconnectAttachmentGroupRequest.newBuilder()
   *           .setInterconnectAttachmentGroup("interconnectAttachmentGroup-1652813650")
   *           .setProject("project-309310695")
   *           .build();
   *   ApiFuture<InterconnectAttachmentGroup> future =
   *       interconnectAttachmentGroupsClient.getCallable().futureCall(request);
   *   // Do something.
   *   InterconnectAttachmentGroup response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetInterconnectAttachmentGroupRequest, InterconnectAttachmentGroup>
      getCallable() {
    return stub.getCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a resource. May be empty if no such policy or resource
   * exists.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   String project = "project-309310695";
   *   String resource = "resource-341064690";
   *   Policy response = interconnectAttachmentGroupsClient.getIamPolicy(project, resource);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param resource Name or id of the resource for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(String project, String resource) {
    GetIamPolicyInterconnectAttachmentGroupRequest request =
        GetIamPolicyInterconnectAttachmentGroupRequest.newBuilder()
            .setProject(project)
            .setResource(resource)
            .build();
    return getIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a resource. May be empty if no such policy or resource
   * exists.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   GetIamPolicyInterconnectAttachmentGroupRequest request =
   *       GetIamPolicyInterconnectAttachmentGroupRequest.newBuilder()
   *           .setOptionsRequestedPolicyVersion(-574521795)
   *           .setProject("project-309310695")
   *           .setResource("resource-341064690")
   *           .build();
   *   Policy response = interconnectAttachmentGroupsClient.getIamPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(GetIamPolicyInterconnectAttachmentGroupRequest request) {
    return getIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a resource. May be empty if no such policy or resource
   * exists.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   GetIamPolicyInterconnectAttachmentGroupRequest request =
   *       GetIamPolicyInterconnectAttachmentGroupRequest.newBuilder()
   *           .setOptionsRequestedPolicyVersion(-574521795)
   *           .setProject("project-309310695")
   *           .setResource("resource-341064690")
   *           .build();
   *   ApiFuture<Policy> future =
   *       interconnectAttachmentGroupsClient.getIamPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetIamPolicyInterconnectAttachmentGroupRequest, Policy>
      getIamPolicyCallable() {
    return stub.getIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the InterconnectAttachmentStatuses for the specified InterconnectAttachmentGroup
   * resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   String project = "project-309310695";
   *   String interconnectAttachmentGroup = "interconnectAttachmentGroup-1652813650";
   *   InterconnectAttachmentGroupsGetOperationalStatusResponse response =
   *       interconnectAttachmentGroupsClient.getOperationalStatus(
   *           project, interconnectAttachmentGroup);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param interconnectAttachmentGroup Name of the interconnectAttachmentGroup resource to query.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final InterconnectAttachmentGroupsGetOperationalStatusResponse getOperationalStatus(
      String project, String interconnectAttachmentGroup) {
    GetOperationalStatusInterconnectAttachmentGroupRequest request =
        GetOperationalStatusInterconnectAttachmentGroupRequest.newBuilder()
            .setProject(project)
            .setInterconnectAttachmentGroup(interconnectAttachmentGroup)
            .build();
    return getOperationalStatus(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the InterconnectAttachmentStatuses for the specified InterconnectAttachmentGroup
   * resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   GetOperationalStatusInterconnectAttachmentGroupRequest request =
   *       GetOperationalStatusInterconnectAttachmentGroupRequest.newBuilder()
   *           .setInterconnectAttachmentGroup("interconnectAttachmentGroup-1652813650")
   *           .setProject("project-309310695")
   *           .build();
   *   InterconnectAttachmentGroupsGetOperationalStatusResponse response =
   *       interconnectAttachmentGroupsClient.getOperationalStatus(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final InterconnectAttachmentGroupsGetOperationalStatusResponse getOperationalStatus(
      GetOperationalStatusInterconnectAttachmentGroupRequest request) {
    return getOperationalStatusCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the InterconnectAttachmentStatuses for the specified InterconnectAttachmentGroup
   * resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   GetOperationalStatusInterconnectAttachmentGroupRequest request =
   *       GetOperationalStatusInterconnectAttachmentGroupRequest.newBuilder()
   *           .setInterconnectAttachmentGroup("interconnectAttachmentGroup-1652813650")
   *           .setProject("project-309310695")
   *           .build();
   *   ApiFuture<InterconnectAttachmentGroupsGetOperationalStatusResponse> future =
   *       interconnectAttachmentGroupsClient.getOperationalStatusCallable().futureCall(request);
   *   // Do something.
   *   InterconnectAttachmentGroupsGetOperationalStatusResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          GetOperationalStatusInterconnectAttachmentGroupRequest,
          InterconnectAttachmentGroupsGetOperationalStatusResponse>
      getOperationalStatusCallable() {
    return stub.getOperationalStatusCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a InterconnectAttachmentGroup in the specified project in the given scope using the
   * parameters that are included in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   String project = "project-309310695";
   *   InterconnectAttachmentGroup interconnectAttachmentGroupResource =
   *       InterconnectAttachmentGroup.newBuilder().build();
   *   Operation response =
   *       interconnectAttachmentGroupsClient
   *           .insertAsync(project, interconnectAttachmentGroupResource)
   *           .get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param interconnectAttachmentGroupResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> insertAsync(
      String project, InterconnectAttachmentGroup interconnectAttachmentGroupResource) {
    InsertInterconnectAttachmentGroupRequest request =
        InsertInterconnectAttachmentGroupRequest.newBuilder()
            .setProject(project)
            .setInterconnectAttachmentGroupResource(interconnectAttachmentGroupResource)
            .build();
    return insertAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a InterconnectAttachmentGroup in the specified project in the given scope using the
   * parameters that are included in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   InsertInterconnectAttachmentGroupRequest request =
   *       InsertInterconnectAttachmentGroupRequest.newBuilder()
   *           .setInterconnectAttachmentGroupResource(
   *               InterconnectAttachmentGroup.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = interconnectAttachmentGroupsClient.insertAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> insertAsync(
      InsertInterconnectAttachmentGroupRequest request) {
    return insertOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a InterconnectAttachmentGroup in the specified project in the given scope using the
   * parameters that are included in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   InsertInterconnectAttachmentGroupRequest request =
   *       InsertInterconnectAttachmentGroupRequest.newBuilder()
   *           .setInterconnectAttachmentGroupResource(
   *               InterconnectAttachmentGroup.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       interconnectAttachmentGroupsClient.insertOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<InsertInterconnectAttachmentGroupRequest, Operation, Operation>
      insertOperationCallable() {
    return stub.insertOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a InterconnectAttachmentGroup in the specified project in the given scope using the
   * parameters that are included in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   InsertInterconnectAttachmentGroupRequest request =
   *       InsertInterconnectAttachmentGroupRequest.newBuilder()
   *           .setInterconnectAttachmentGroupResource(
   *               InterconnectAttachmentGroup.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       interconnectAttachmentGroupsClient.insertCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<InsertInterconnectAttachmentGroupRequest, Operation> insertCallable() {
    return stub.insertCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists the InterconnectAttachmentGroups for a project in the given scope.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   String project = "project-309310695";
   *   for (InterconnectAttachmentGroup element :
   *       interconnectAttachmentGroupsClient.list(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(String project) {
    ListInterconnectAttachmentGroupsRequest request =
        ListInterconnectAttachmentGroupsRequest.newBuilder().setProject(project).build();
    return list(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists the InterconnectAttachmentGroups for a project in the given scope.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   ListInterconnectAttachmentGroupsRequest request =
   *       ListInterconnectAttachmentGroupsRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   for (InterconnectAttachmentGroup element :
   *       interconnectAttachmentGroupsClient.list(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(ListInterconnectAttachmentGroupsRequest request) {
    return listPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists the InterconnectAttachmentGroups for a project in the given scope.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   ListInterconnectAttachmentGroupsRequest request =
   *       ListInterconnectAttachmentGroupsRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   ApiFuture<InterconnectAttachmentGroup> future =
   *       interconnectAttachmentGroupsClient.listPagedCallable().futureCall(request);
   *   // Do something.
   *   for (InterconnectAttachmentGroup element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListInterconnectAttachmentGroupsRequest, ListPagedResponse>
      listPagedCallable() {
    return stub.listPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists the InterconnectAttachmentGroups for a project in the given scope.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   ListInterconnectAttachmentGroupsRequest request =
   *       ListInterconnectAttachmentGroupsRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   while (true) {
   *     InterconnectAttachmentGroupsListResponse response =
   *         interconnectAttachmentGroupsClient.listCallable().call(request);
   *     for (InterconnectAttachmentGroup element : response.getItemsList()) {
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
  public final UnaryCallable<
          ListInterconnectAttachmentGroupsRequest, InterconnectAttachmentGroupsListResponse>
      listCallable() {
    return stub.listCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Patches the specified InterconnectAttachmentGroup resource with the data included in the
   * request. This method supports PATCH semantics and uses JSON merge patch format and processing
   * rules.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   String project = "project-309310695";
   *   String interconnectAttachmentGroup = "interconnectAttachmentGroup-1652813650";
   *   InterconnectAttachmentGroup interconnectAttachmentGroupResource =
   *       InterconnectAttachmentGroup.newBuilder().build();
   *   Operation response =
   *       interconnectAttachmentGroupsClient
   *           .patchAsync(project, interconnectAttachmentGroup, interconnectAttachmentGroupResource)
   *           .get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param interconnectAttachmentGroup Name of the InterconnectAttachmentGroup resource to patch.
   * @param interconnectAttachmentGroupResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> patchAsync(
      String project,
      String interconnectAttachmentGroup,
      InterconnectAttachmentGroup interconnectAttachmentGroupResource) {
    PatchInterconnectAttachmentGroupRequest request =
        PatchInterconnectAttachmentGroupRequest.newBuilder()
            .setProject(project)
            .setInterconnectAttachmentGroup(interconnectAttachmentGroup)
            .setInterconnectAttachmentGroupResource(interconnectAttachmentGroupResource)
            .build();
    return patchAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Patches the specified InterconnectAttachmentGroup resource with the data included in the
   * request. This method supports PATCH semantics and uses JSON merge patch format and processing
   * rules.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   PatchInterconnectAttachmentGroupRequest request =
   *       PatchInterconnectAttachmentGroupRequest.newBuilder()
   *           .setInterconnectAttachmentGroup("interconnectAttachmentGroup-1652813650")
   *           .setInterconnectAttachmentGroupResource(
   *               InterconnectAttachmentGroup.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .setUpdateMask("updateMask-296147115")
   *           .build();
   *   Operation response = interconnectAttachmentGroupsClient.patchAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> patchAsync(
      PatchInterconnectAttachmentGroupRequest request) {
    return patchOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Patches the specified InterconnectAttachmentGroup resource with the data included in the
   * request. This method supports PATCH semantics and uses JSON merge patch format and processing
   * rules.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   PatchInterconnectAttachmentGroupRequest request =
   *       PatchInterconnectAttachmentGroupRequest.newBuilder()
   *           .setInterconnectAttachmentGroup("interconnectAttachmentGroup-1652813650")
   *           .setInterconnectAttachmentGroupResource(
   *               InterconnectAttachmentGroup.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .setUpdateMask("updateMask-296147115")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       interconnectAttachmentGroupsClient.patchOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<PatchInterconnectAttachmentGroupRequest, Operation, Operation>
      patchOperationCallable() {
    return stub.patchOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Patches the specified InterconnectAttachmentGroup resource with the data included in the
   * request. This method supports PATCH semantics and uses JSON merge patch format and processing
   * rules.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   PatchInterconnectAttachmentGroupRequest request =
   *       PatchInterconnectAttachmentGroupRequest.newBuilder()
   *           .setInterconnectAttachmentGroup("interconnectAttachmentGroup-1652813650")
   *           .setInterconnectAttachmentGroupResource(
   *               InterconnectAttachmentGroup.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .setUpdateMask("updateMask-296147115")
   *           .build();
   *   ApiFuture<Operation> future =
   *       interconnectAttachmentGroupsClient.patchCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<PatchInterconnectAttachmentGroupRequest, Operation> patchCallable() {
    return stub.patchCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified resource. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   String project = "project-309310695";
   *   String resource = "resource-341064690";
   *   GlobalSetPolicyRequest globalSetPolicyRequestResource =
   *       GlobalSetPolicyRequest.newBuilder().build();
   *   Policy response =
   *       interconnectAttachmentGroupsClient.setIamPolicy(
   *           project, resource, globalSetPolicyRequestResource);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param resource Name or id of the resource for this request.
   * @param globalSetPolicyRequestResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(
      String project, String resource, GlobalSetPolicyRequest globalSetPolicyRequestResource) {
    SetIamPolicyInterconnectAttachmentGroupRequest request =
        SetIamPolicyInterconnectAttachmentGroupRequest.newBuilder()
            .setProject(project)
            .setResource(resource)
            .setGlobalSetPolicyRequestResource(globalSetPolicyRequestResource)
            .build();
    return setIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified resource. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   SetIamPolicyInterconnectAttachmentGroupRequest request =
   *       SetIamPolicyInterconnectAttachmentGroupRequest.newBuilder()
   *           .setGlobalSetPolicyRequestResource(GlobalSetPolicyRequest.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setResource("resource-341064690")
   *           .build();
   *   Policy response = interconnectAttachmentGroupsClient.setIamPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(SetIamPolicyInterconnectAttachmentGroupRequest request) {
    return setIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified resource. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   SetIamPolicyInterconnectAttachmentGroupRequest request =
   *       SetIamPolicyInterconnectAttachmentGroupRequest.newBuilder()
   *           .setGlobalSetPolicyRequestResource(GlobalSetPolicyRequest.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setResource("resource-341064690")
   *           .build();
   *   ApiFuture<Policy> future =
   *       interconnectAttachmentGroupsClient.setIamPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SetIamPolicyInterconnectAttachmentGroupRequest, Policy>
      setIamPolicyCallable() {
    return stub.setIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that a caller has on the specified resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   String project = "project-309310695";
   *   String resource = "resource-341064690";
   *   TestPermissionsRequest testPermissionsRequestResource =
   *       TestPermissionsRequest.newBuilder().build();
   *   TestPermissionsResponse response =
   *       interconnectAttachmentGroupsClient.testIamPermissions(
   *           project, resource, testPermissionsRequestResource);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param resource Name or id of the resource for this request.
   * @param testPermissionsRequestResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestPermissionsResponse testIamPermissions(
      String project, String resource, TestPermissionsRequest testPermissionsRequestResource) {
    TestIamPermissionsInterconnectAttachmentGroupRequest request =
        TestIamPermissionsInterconnectAttachmentGroupRequest.newBuilder()
            .setProject(project)
            .setResource(resource)
            .setTestPermissionsRequestResource(testPermissionsRequestResource)
            .build();
    return testIamPermissions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that a caller has on the specified resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   TestIamPermissionsInterconnectAttachmentGroupRequest request =
   *       TestIamPermissionsInterconnectAttachmentGroupRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setResource("resource-341064690")
   *           .setTestPermissionsRequestResource(TestPermissionsRequest.newBuilder().build())
   *           .build();
   *   TestPermissionsResponse response =
   *       interconnectAttachmentGroupsClient.testIamPermissions(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestPermissionsResponse testIamPermissions(
      TestIamPermissionsInterconnectAttachmentGroupRequest request) {
    return testIamPermissionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that a caller has on the specified resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectAttachmentGroupsClient interconnectAttachmentGroupsClient =
   *     InterconnectAttachmentGroupsClient.create()) {
   *   TestIamPermissionsInterconnectAttachmentGroupRequest request =
   *       TestIamPermissionsInterconnectAttachmentGroupRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setResource("resource-341064690")
   *           .setTestPermissionsRequestResource(TestPermissionsRequest.newBuilder().build())
   *           .build();
   *   ApiFuture<TestPermissionsResponse> future =
   *       interconnectAttachmentGroupsClient.testIamPermissionsCallable().futureCall(request);
   *   // Do something.
   *   TestPermissionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          TestIamPermissionsInterconnectAttachmentGroupRequest, TestPermissionsResponse>
      testIamPermissionsCallable() {
    return stub.testIamPermissionsCallable();
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

  public static class ListPagedResponse
      extends AbstractPagedListResponse<
          ListInterconnectAttachmentGroupsRequest,
          InterconnectAttachmentGroupsListResponse,
          InterconnectAttachmentGroup,
          ListPage,
          ListFixedSizeCollection> {

    public static ApiFuture<ListPagedResponse> createAsync(
        PageContext<
                ListInterconnectAttachmentGroupsRequest,
                InterconnectAttachmentGroupsListResponse,
                InterconnectAttachmentGroup>
            context,
        ApiFuture<InterconnectAttachmentGroupsListResponse> futureResponse) {
      ApiFuture<ListPage> futurePage =
          ListPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new ListPagedResponse(input), MoreExecutors.directExecutor());
    }

    private ListPagedResponse(ListPage page) {
      super(page, ListFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListPage
      extends AbstractPage<
          ListInterconnectAttachmentGroupsRequest,
          InterconnectAttachmentGroupsListResponse,
          InterconnectAttachmentGroup,
          ListPage> {

    private ListPage(
        PageContext<
                ListInterconnectAttachmentGroupsRequest,
                InterconnectAttachmentGroupsListResponse,
                InterconnectAttachmentGroup>
            context,
        InterconnectAttachmentGroupsListResponse response) {
      super(context, response);
    }

    private static ListPage createEmptyPage() {
      return new ListPage(null, null);
    }

    @Override
    protected ListPage createPage(
        PageContext<
                ListInterconnectAttachmentGroupsRequest,
                InterconnectAttachmentGroupsListResponse,
                InterconnectAttachmentGroup>
            context,
        InterconnectAttachmentGroupsListResponse response) {
      return new ListPage(context, response);
    }

    @Override
    public ApiFuture<ListPage> createPageAsync(
        PageContext<
                ListInterconnectAttachmentGroupsRequest,
                InterconnectAttachmentGroupsListResponse,
                InterconnectAttachmentGroup>
            context,
        ApiFuture<InterconnectAttachmentGroupsListResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListInterconnectAttachmentGroupsRequest,
          InterconnectAttachmentGroupsListResponse,
          InterconnectAttachmentGroup,
          ListPage,
          ListFixedSizeCollection> {

    private ListFixedSizeCollection(List<ListPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFixedSizeCollection createEmptyCollection() {
      return new ListFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFixedSizeCollection createCollection(List<ListPage> pages, int collectionSize) {
      return new ListFixedSizeCollection(pages, collectionSize);
    }
  }
}
