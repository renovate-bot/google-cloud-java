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
import com.google.cloud.compute.v1.stub.InterconnectsStub;
import com.google.cloud.compute.v1.stub.InterconnectsStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: The Interconnects API.
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
 * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
 *   String project = "project-309310695";
 *   String interconnect = "interconnect-849140594";
 *   Interconnect response = interconnectsClient.get(project, interconnect);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the InterconnectsClient object to clean up resources such
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
 *      <td><p> Delete</td>
 *      <td><p> Deletes the specified Interconnect.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteAsync(DeleteInterconnectRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteAsync(String project, String interconnect)
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
 *      <td><p> Returns the specified Interconnect. Get a list of available Interconnects by making a list() request.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> get(GetInterconnectRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> get(String project, String interconnect)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetDiagnostics</td>
 *      <td><p> Returns the interconnectDiagnostics for the specified Interconnect. In the event of a global outage, do not use this API to make decisions about where to redirect your network traffic. Unlike a VLAN attachment, which is regional, a Cloud Interconnect connection is a global resource. A global outage can prevent this API from functioning properly.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getDiagnostics(GetDiagnosticsInterconnectRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getDiagnostics(String project, String interconnect)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getDiagnosticsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetMacsecConfig</td>
 *      <td><p> Returns the interconnectMacsecConfig for the specified Interconnect.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getMacsecConfig(GetMacsecConfigInterconnectRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getMacsecConfig(String project, String interconnect)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getMacsecConfigCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Insert</td>
 *      <td><p> Creates an Interconnect in the specified project using the data included in the request.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> insertAsync(InsertInterconnectRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> insertAsync(String project, Interconnect interconnectResource)
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
 *      <td><p> Retrieves the list of Interconnects available to the specified project.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> list(ListInterconnectsRequest request)
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
 *      <td><p> Updates the specified Interconnect with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing rules.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> patchAsync(PatchInterconnectRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> patchAsync(String project, String interconnect, Interconnect interconnectResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> patchOperationCallable()
 *           <li><p> patchCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> SetLabels</td>
 *      <td><p> Sets the labels on an Interconnect. To learn more about labels, read the Labeling Resources documentation.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> setLabelsAsync(SetLabelsInterconnectRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> setLabelsAsync(String project, String resource, GlobalSetLabelsRequest globalSetLabelsRequestResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> setLabelsOperationCallable()
 *           <li><p> setLabelsCallable()
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
 * <p>This class can be customized by passing in a custom instance of InterconnectsSettings to
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
 * InterconnectsSettings interconnectsSettings =
 *     InterconnectsSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * InterconnectsClient interconnectsClient = InterconnectsClient.create(interconnectsSettings);
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
 * InterconnectsSettings interconnectsSettings =
 *     InterconnectsSettings.newBuilder().setEndpoint(myEndpoint).build();
 * InterconnectsClient interconnectsClient = InterconnectsClient.create(interconnectsSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class InterconnectsClient implements BackgroundResource {
  private final InterconnectsSettings settings;
  private final InterconnectsStub stub;

  /** Constructs an instance of InterconnectsClient with default settings. */
  public static final InterconnectsClient create() throws IOException {
    return create(InterconnectsSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of InterconnectsClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final InterconnectsClient create(InterconnectsSettings settings)
      throws IOException {
    return new InterconnectsClient(settings);
  }

  /**
   * Constructs an instance of InterconnectsClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(InterconnectsSettings).
   */
  public static final InterconnectsClient create(InterconnectsStub stub) {
    return new InterconnectsClient(stub);
  }

  /**
   * Constructs an instance of InterconnectsClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected InterconnectsClient(InterconnectsSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((InterconnectsStubSettings) settings.getStubSettings()).createStub();
  }

  protected InterconnectsClient(InterconnectsStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final InterconnectsSettings getSettings() {
    return settings;
  }

  public InterconnectsStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified Interconnect.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   String project = "project-309310695";
   *   String interconnect = "interconnect-849140594";
   *   Operation response = interconnectsClient.deleteAsync(project, interconnect).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param interconnect Name of the interconnect to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> deleteAsync(
      String project, String interconnect) {
    DeleteInterconnectRequest request =
        DeleteInterconnectRequest.newBuilder()
            .setProject(project)
            .setInterconnect(interconnect)
            .build();
    return deleteAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified Interconnect.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   DeleteInterconnectRequest request =
   *       DeleteInterconnectRequest.newBuilder()
   *           .setInterconnect("interconnect-849140594")
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = interconnectsClient.deleteAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> deleteAsync(
      DeleteInterconnectRequest request) {
    return deleteOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified Interconnect.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   DeleteInterconnectRequest request =
   *       DeleteInterconnectRequest.newBuilder()
   *           .setInterconnect("interconnect-849140594")
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       interconnectsClient.deleteOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteInterconnectRequest, Operation, Operation>
      deleteOperationCallable() {
    return stub.deleteOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified Interconnect.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   DeleteInterconnectRequest request =
   *       DeleteInterconnectRequest.newBuilder()
   *           .setInterconnect("interconnect-849140594")
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future = interconnectsClient.deleteCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteInterconnectRequest, Operation> deleteCallable() {
    return stub.deleteCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified Interconnect. Get a list of available Interconnects by making a list()
   * request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   String project = "project-309310695";
   *   String interconnect = "interconnect-849140594";
   *   Interconnect response = interconnectsClient.get(project, interconnect);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param interconnect Name of the interconnect to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Interconnect get(String project, String interconnect) {
    GetInterconnectRequest request =
        GetInterconnectRequest.newBuilder()
            .setProject(project)
            .setInterconnect(interconnect)
            .build();
    return get(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified Interconnect. Get a list of available Interconnects by making a list()
   * request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   GetInterconnectRequest request =
   *       GetInterconnectRequest.newBuilder()
   *           .setInterconnect("interconnect-849140594")
   *           .setProject("project-309310695")
   *           .build();
   *   Interconnect response = interconnectsClient.get(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Interconnect get(GetInterconnectRequest request) {
    return getCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified Interconnect. Get a list of available Interconnects by making a list()
   * request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   GetInterconnectRequest request =
   *       GetInterconnectRequest.newBuilder()
   *           .setInterconnect("interconnect-849140594")
   *           .setProject("project-309310695")
   *           .build();
   *   ApiFuture<Interconnect> future = interconnectsClient.getCallable().futureCall(request);
   *   // Do something.
   *   Interconnect response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetInterconnectRequest, Interconnect> getCallable() {
    return stub.getCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the interconnectDiagnostics for the specified Interconnect. In the event of a global
   * outage, do not use this API to make decisions about where to redirect your network traffic.
   * Unlike a VLAN attachment, which is regional, a Cloud Interconnect connection is a global
   * resource. A global outage can prevent this API from functioning properly.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   String project = "project-309310695";
   *   String interconnect = "interconnect-849140594";
   *   InterconnectsGetDiagnosticsResponse response =
   *       interconnectsClient.getDiagnostics(project, interconnect);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param interconnect Name of the interconnect resource to query.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final InterconnectsGetDiagnosticsResponse getDiagnostics(
      String project, String interconnect) {
    GetDiagnosticsInterconnectRequest request =
        GetDiagnosticsInterconnectRequest.newBuilder()
            .setProject(project)
            .setInterconnect(interconnect)
            .build();
    return getDiagnostics(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the interconnectDiagnostics for the specified Interconnect. In the event of a global
   * outage, do not use this API to make decisions about where to redirect your network traffic.
   * Unlike a VLAN attachment, which is regional, a Cloud Interconnect connection is a global
   * resource. A global outage can prevent this API from functioning properly.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   GetDiagnosticsInterconnectRequest request =
   *       GetDiagnosticsInterconnectRequest.newBuilder()
   *           .setInterconnect("interconnect-849140594")
   *           .setProject("project-309310695")
   *           .build();
   *   InterconnectsGetDiagnosticsResponse response = interconnectsClient.getDiagnostics(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final InterconnectsGetDiagnosticsResponse getDiagnostics(
      GetDiagnosticsInterconnectRequest request) {
    return getDiagnosticsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the interconnectDiagnostics for the specified Interconnect. In the event of a global
   * outage, do not use this API to make decisions about where to redirect your network traffic.
   * Unlike a VLAN attachment, which is regional, a Cloud Interconnect connection is a global
   * resource. A global outage can prevent this API from functioning properly.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   GetDiagnosticsInterconnectRequest request =
   *       GetDiagnosticsInterconnectRequest.newBuilder()
   *           .setInterconnect("interconnect-849140594")
   *           .setProject("project-309310695")
   *           .build();
   *   ApiFuture<InterconnectsGetDiagnosticsResponse> future =
   *       interconnectsClient.getDiagnosticsCallable().futureCall(request);
   *   // Do something.
   *   InterconnectsGetDiagnosticsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetDiagnosticsInterconnectRequest, InterconnectsGetDiagnosticsResponse>
      getDiagnosticsCallable() {
    return stub.getDiagnosticsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the interconnectMacsecConfig for the specified Interconnect.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   String project = "project-309310695";
   *   String interconnect = "interconnect-849140594";
   *   InterconnectsGetMacsecConfigResponse response =
   *       interconnectsClient.getMacsecConfig(project, interconnect);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param interconnect Name of the interconnect resource to query.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final InterconnectsGetMacsecConfigResponse getMacsecConfig(
      String project, String interconnect) {
    GetMacsecConfigInterconnectRequest request =
        GetMacsecConfigInterconnectRequest.newBuilder()
            .setProject(project)
            .setInterconnect(interconnect)
            .build();
    return getMacsecConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the interconnectMacsecConfig for the specified Interconnect.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   GetMacsecConfigInterconnectRequest request =
   *       GetMacsecConfigInterconnectRequest.newBuilder()
   *           .setInterconnect("interconnect-849140594")
   *           .setProject("project-309310695")
   *           .build();
   *   InterconnectsGetMacsecConfigResponse response = interconnectsClient.getMacsecConfig(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final InterconnectsGetMacsecConfigResponse getMacsecConfig(
      GetMacsecConfigInterconnectRequest request) {
    return getMacsecConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the interconnectMacsecConfig for the specified Interconnect.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   GetMacsecConfigInterconnectRequest request =
   *       GetMacsecConfigInterconnectRequest.newBuilder()
   *           .setInterconnect("interconnect-849140594")
   *           .setProject("project-309310695")
   *           .build();
   *   ApiFuture<InterconnectsGetMacsecConfigResponse> future =
   *       interconnectsClient.getMacsecConfigCallable().futureCall(request);
   *   // Do something.
   *   InterconnectsGetMacsecConfigResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          GetMacsecConfigInterconnectRequest, InterconnectsGetMacsecConfigResponse>
      getMacsecConfigCallable() {
    return stub.getMacsecConfigCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an Interconnect in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   String project = "project-309310695";
   *   Interconnect interconnectResource = Interconnect.newBuilder().build();
   *   Operation response = interconnectsClient.insertAsync(project, interconnectResource).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param interconnectResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> insertAsync(
      String project, Interconnect interconnectResource) {
    InsertInterconnectRequest request =
        InsertInterconnectRequest.newBuilder()
            .setProject(project)
            .setInterconnectResource(interconnectResource)
            .build();
    return insertAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an Interconnect in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   InsertInterconnectRequest request =
   *       InsertInterconnectRequest.newBuilder()
   *           .setInterconnectResource(Interconnect.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = interconnectsClient.insertAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> insertAsync(
      InsertInterconnectRequest request) {
    return insertOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an Interconnect in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   InsertInterconnectRequest request =
   *       InsertInterconnectRequest.newBuilder()
   *           .setInterconnectResource(Interconnect.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       interconnectsClient.insertOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<InsertInterconnectRequest, Operation, Operation>
      insertOperationCallable() {
    return stub.insertOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an Interconnect in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   InsertInterconnectRequest request =
   *       InsertInterconnectRequest.newBuilder()
   *           .setInterconnectResource(Interconnect.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future = interconnectsClient.insertCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<InsertInterconnectRequest, Operation> insertCallable() {
    return stub.insertCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of Interconnects available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   String project = "project-309310695";
   *   for (Interconnect element : interconnectsClient.list(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(String project) {
    ListInterconnectsRequest request =
        ListInterconnectsRequest.newBuilder().setProject(project).build();
    return list(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of Interconnects available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   ListInterconnectsRequest request =
   *       ListInterconnectsRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   for (Interconnect element : interconnectsClient.list(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(ListInterconnectsRequest request) {
    return listPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of Interconnects available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   ListInterconnectsRequest request =
   *       ListInterconnectsRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   ApiFuture<Interconnect> future = interconnectsClient.listPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Interconnect element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListInterconnectsRequest, ListPagedResponse> listPagedCallable() {
    return stub.listPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of Interconnects available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   ListInterconnectsRequest request =
   *       ListInterconnectsRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   while (true) {
   *     InterconnectList response = interconnectsClient.listCallable().call(request);
   *     for (Interconnect element : response.getItemsList()) {
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
  public final UnaryCallable<ListInterconnectsRequest, InterconnectList> listCallable() {
    return stub.listCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified Interconnect with the data included in the request. This method supports
   * PATCH semantics and uses the JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   String project = "project-309310695";
   *   String interconnect = "interconnect-849140594";
   *   Interconnect interconnectResource = Interconnect.newBuilder().build();
   *   Operation response =
   *       interconnectsClient.patchAsync(project, interconnect, interconnectResource).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param interconnect Name of the interconnect to update.
   * @param interconnectResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> patchAsync(
      String project, String interconnect, Interconnect interconnectResource) {
    PatchInterconnectRequest request =
        PatchInterconnectRequest.newBuilder()
            .setProject(project)
            .setInterconnect(interconnect)
            .setInterconnectResource(interconnectResource)
            .build();
    return patchAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified Interconnect with the data included in the request. This method supports
   * PATCH semantics and uses the JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   PatchInterconnectRequest request =
   *       PatchInterconnectRequest.newBuilder()
   *           .setInterconnect("interconnect-849140594")
   *           .setInterconnectResource(Interconnect.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = interconnectsClient.patchAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> patchAsync(PatchInterconnectRequest request) {
    return patchOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified Interconnect with the data included in the request. This method supports
   * PATCH semantics and uses the JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   PatchInterconnectRequest request =
   *       PatchInterconnectRequest.newBuilder()
   *           .setInterconnect("interconnect-849140594")
   *           .setInterconnectResource(Interconnect.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       interconnectsClient.patchOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<PatchInterconnectRequest, Operation, Operation>
      patchOperationCallable() {
    return stub.patchOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified Interconnect with the data included in the request. This method supports
   * PATCH semantics and uses the JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   PatchInterconnectRequest request =
   *       PatchInterconnectRequest.newBuilder()
   *           .setInterconnect("interconnect-849140594")
   *           .setInterconnectResource(Interconnect.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future = interconnectsClient.patchCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<PatchInterconnectRequest, Operation> patchCallable() {
    return stub.patchCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the labels on an Interconnect. To learn more about labels, read the Labeling Resources
   * documentation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   String project = "project-309310695";
   *   String resource = "resource-341064690";
   *   GlobalSetLabelsRequest globalSetLabelsRequestResource =
   *       GlobalSetLabelsRequest.newBuilder().build();
   *   Operation response =
   *       interconnectsClient
   *           .setLabelsAsync(project, resource, globalSetLabelsRequestResource)
   *           .get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param resource Name or id of the resource for this request.
   * @param globalSetLabelsRequestResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> setLabelsAsync(
      String project, String resource, GlobalSetLabelsRequest globalSetLabelsRequestResource) {
    SetLabelsInterconnectRequest request =
        SetLabelsInterconnectRequest.newBuilder()
            .setProject(project)
            .setResource(resource)
            .setGlobalSetLabelsRequestResource(globalSetLabelsRequestResource)
            .build();
    return setLabelsAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the labels on an Interconnect. To learn more about labels, read the Labeling Resources
   * documentation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   SetLabelsInterconnectRequest request =
   *       SetLabelsInterconnectRequest.newBuilder()
   *           .setGlobalSetLabelsRequestResource(GlobalSetLabelsRequest.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setResource("resource-341064690")
   *           .build();
   *   Operation response = interconnectsClient.setLabelsAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> setLabelsAsync(
      SetLabelsInterconnectRequest request) {
    return setLabelsOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the labels on an Interconnect. To learn more about labels, read the Labeling Resources
   * documentation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   SetLabelsInterconnectRequest request =
   *       SetLabelsInterconnectRequest.newBuilder()
   *           .setGlobalSetLabelsRequestResource(GlobalSetLabelsRequest.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setResource("resource-341064690")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       interconnectsClient.setLabelsOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<SetLabelsInterconnectRequest, Operation, Operation>
      setLabelsOperationCallable() {
    return stub.setLabelsOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the labels on an Interconnect. To learn more about labels, read the Labeling Resources
   * documentation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (InterconnectsClient interconnectsClient = InterconnectsClient.create()) {
   *   SetLabelsInterconnectRequest request =
   *       SetLabelsInterconnectRequest.newBuilder()
   *           .setGlobalSetLabelsRequestResource(GlobalSetLabelsRequest.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setResource("resource-341064690")
   *           .build();
   *   ApiFuture<Operation> future = interconnectsClient.setLabelsCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SetLabelsInterconnectRequest, Operation> setLabelsCallable() {
    return stub.setLabelsCallable();
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
          ListInterconnectsRequest,
          InterconnectList,
          Interconnect,
          ListPage,
          ListFixedSizeCollection> {

    public static ApiFuture<ListPagedResponse> createAsync(
        PageContext<ListInterconnectsRequest, InterconnectList, Interconnect> context,
        ApiFuture<InterconnectList> futureResponse) {
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
      extends AbstractPage<ListInterconnectsRequest, InterconnectList, Interconnect, ListPage> {

    private ListPage(
        PageContext<ListInterconnectsRequest, InterconnectList, Interconnect> context,
        InterconnectList response) {
      super(context, response);
    }

    private static ListPage createEmptyPage() {
      return new ListPage(null, null);
    }

    @Override
    protected ListPage createPage(
        PageContext<ListInterconnectsRequest, InterconnectList, Interconnect> context,
        InterconnectList response) {
      return new ListPage(context, response);
    }

    @Override
    public ApiFuture<ListPage> createPageAsync(
        PageContext<ListInterconnectsRequest, InterconnectList, Interconnect> context,
        ApiFuture<InterconnectList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListInterconnectsRequest,
          InterconnectList,
          Interconnect,
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
