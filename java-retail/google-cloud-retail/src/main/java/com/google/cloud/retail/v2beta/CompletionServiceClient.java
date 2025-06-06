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

package com.google.cloud.retail.v2beta;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.longrunning.OperationsClient;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.retail.v2beta.stub.CompletionServiceStub;
import com.google.cloud.retail.v2beta.stub.CompletionServiceStubSettings;
import com.google.longrunning.Operation;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Autocomplete service for retail.
 *
 * <p>This feature is only available for users who have Retail Search enabled. Enable Retail Search
 * on Cloud Console before using this feature.
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
 * try (CompletionServiceClient completionServiceClient = CompletionServiceClient.create()) {
 *   CompleteQueryRequest request =
 *       CompleteQueryRequest.newBuilder()
 *           .setCatalog(CatalogName.of("[PROJECT]", "[LOCATION]", "[CATALOG]").toString())
 *           .setQuery("query107944136")
 *           .setVisitorId("visitorId1880545833")
 *           .addAllLanguageCodes(new ArrayList<String>())
 *           .setDeviceType("deviceType781190832")
 *           .setDataset("dataset1443214456")
 *           .setMaxSuggestions(618824852)
 *           .setEnableAttributeSuggestions(true)
 *           .setEntity("entity-1298275357")
 *           .build();
 *   CompleteQueryResponse response = completionServiceClient.completeQuery(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CompletionServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> CompleteQuery</td>
 *      <td><p> Completes the specified prefix with keyword suggestions.
 * <p>  This feature is only available for users who have Retail Search enabled. Enable Retail Search on Cloud Console before using this feature.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> completeQuery(CompleteQueryRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> completeQueryCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ImportCompletionData</td>
 *      <td><p> Bulk import of processed completion dataset.
 * <p>  Request processing is asynchronous. Partial updating is not supported.
 * <p>  The operation is successfully finished only after the imported suggestions are indexed successfully and ready for serving. The process takes hours.
 * <p>  This feature is only available for users who have Retail Search enabled. Enable Retail Search on Cloud Console before using this feature.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> importCompletionDataAsync(ImportCompletionDataRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> importCompletionDataOperationCallable()
 *           <li><p> importCompletionDataCallable()
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
 * <p>This class can be customized by passing in a custom instance of CompletionServiceSettings to
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
 * CompletionServiceSettings completionServiceSettings =
 *     CompletionServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CompletionServiceClient completionServiceClient =
 *     CompletionServiceClient.create(completionServiceSettings);
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
 * CompletionServiceSettings completionServiceSettings =
 *     CompletionServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CompletionServiceClient completionServiceClient =
 *     CompletionServiceClient.create(completionServiceSettings);
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
 * CompletionServiceSettings completionServiceSettings =
 *     CompletionServiceSettings.newHttpJsonBuilder().build();
 * CompletionServiceClient completionServiceClient =
 *     CompletionServiceClient.create(completionServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class CompletionServiceClient implements BackgroundResource {
  private final CompletionServiceSettings settings;
  private final CompletionServiceStub stub;
  private final OperationsClient httpJsonOperationsClient;
  private final com.google.longrunning.OperationsClient operationsClient;

  /** Constructs an instance of CompletionServiceClient with default settings. */
  public static final CompletionServiceClient create() throws IOException {
    return create(CompletionServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CompletionServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CompletionServiceClient create(CompletionServiceSettings settings)
      throws IOException {
    return new CompletionServiceClient(settings);
  }

  /**
   * Constructs an instance of CompletionServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(CompletionServiceSettings).
   */
  public static final CompletionServiceClient create(CompletionServiceStub stub) {
    return new CompletionServiceClient(stub);
  }

  /**
   * Constructs an instance of CompletionServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected CompletionServiceClient(CompletionServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CompletionServiceStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  protected CompletionServiceClient(CompletionServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  public final CompletionServiceSettings getSettings() {
    return settings;
  }

  public CompletionServiceStub getStub() {
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
   * Completes the specified prefix with keyword suggestions.
   *
   * <p>This feature is only available for users who have Retail Search enabled. Enable Retail
   * Search on Cloud Console before using this feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CompletionServiceClient completionServiceClient = CompletionServiceClient.create()) {
   *   CompleteQueryRequest request =
   *       CompleteQueryRequest.newBuilder()
   *           .setCatalog(CatalogName.of("[PROJECT]", "[LOCATION]", "[CATALOG]").toString())
   *           .setQuery("query107944136")
   *           .setVisitorId("visitorId1880545833")
   *           .addAllLanguageCodes(new ArrayList<String>())
   *           .setDeviceType("deviceType781190832")
   *           .setDataset("dataset1443214456")
   *           .setMaxSuggestions(618824852)
   *           .setEnableAttributeSuggestions(true)
   *           .setEntity("entity-1298275357")
   *           .build();
   *   CompleteQueryResponse response = completionServiceClient.completeQuery(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CompleteQueryResponse completeQuery(CompleteQueryRequest request) {
    return completeQueryCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Completes the specified prefix with keyword suggestions.
   *
   * <p>This feature is only available for users who have Retail Search enabled. Enable Retail
   * Search on Cloud Console before using this feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CompletionServiceClient completionServiceClient = CompletionServiceClient.create()) {
   *   CompleteQueryRequest request =
   *       CompleteQueryRequest.newBuilder()
   *           .setCatalog(CatalogName.of("[PROJECT]", "[LOCATION]", "[CATALOG]").toString())
   *           .setQuery("query107944136")
   *           .setVisitorId("visitorId1880545833")
   *           .addAllLanguageCodes(new ArrayList<String>())
   *           .setDeviceType("deviceType781190832")
   *           .setDataset("dataset1443214456")
   *           .setMaxSuggestions(618824852)
   *           .setEnableAttributeSuggestions(true)
   *           .setEntity("entity-1298275357")
   *           .build();
   *   ApiFuture<CompleteQueryResponse> future =
   *       completionServiceClient.completeQueryCallable().futureCall(request);
   *   // Do something.
   *   CompleteQueryResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CompleteQueryRequest, CompleteQueryResponse> completeQueryCallable() {
    return stub.completeQueryCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Bulk import of processed completion dataset.
   *
   * <p>Request processing is asynchronous. Partial updating is not supported.
   *
   * <p>The operation is successfully finished only after the imported suggestions are indexed
   * successfully and ready for serving. The process takes hours.
   *
   * <p>This feature is only available for users who have Retail Search enabled. Enable Retail
   * Search on Cloud Console before using this feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CompletionServiceClient completionServiceClient = CompletionServiceClient.create()) {
   *   ImportCompletionDataRequest request =
   *       ImportCompletionDataRequest.newBuilder()
   *           .setParent(CatalogName.of("[PROJECT]", "[LOCATION]", "[CATALOG]").toString())
   *           .setInputConfig(CompletionDataInputConfig.newBuilder().build())
   *           .setNotificationPubsubTopic("notificationPubsubTopic-1361224991")
   *           .build();
   *   ImportCompletionDataResponse response =
   *       completionServiceClient.importCompletionDataAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ImportCompletionDataResponse, ImportMetadata>
      importCompletionDataAsync(ImportCompletionDataRequest request) {
    return importCompletionDataOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Bulk import of processed completion dataset.
   *
   * <p>Request processing is asynchronous. Partial updating is not supported.
   *
   * <p>The operation is successfully finished only after the imported suggestions are indexed
   * successfully and ready for serving. The process takes hours.
   *
   * <p>This feature is only available for users who have Retail Search enabled. Enable Retail
   * Search on Cloud Console before using this feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CompletionServiceClient completionServiceClient = CompletionServiceClient.create()) {
   *   ImportCompletionDataRequest request =
   *       ImportCompletionDataRequest.newBuilder()
   *           .setParent(CatalogName.of("[PROJECT]", "[LOCATION]", "[CATALOG]").toString())
   *           .setInputConfig(CompletionDataInputConfig.newBuilder().build())
   *           .setNotificationPubsubTopic("notificationPubsubTopic-1361224991")
   *           .build();
   *   OperationFuture<ImportCompletionDataResponse, ImportMetadata> future =
   *       completionServiceClient.importCompletionDataOperationCallable().futureCall(request);
   *   // Do something.
   *   ImportCompletionDataResponse response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          ImportCompletionDataRequest, ImportCompletionDataResponse, ImportMetadata>
      importCompletionDataOperationCallable() {
    return stub.importCompletionDataOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Bulk import of processed completion dataset.
   *
   * <p>Request processing is asynchronous. Partial updating is not supported.
   *
   * <p>The operation is successfully finished only after the imported suggestions are indexed
   * successfully and ready for serving. The process takes hours.
   *
   * <p>This feature is only available for users who have Retail Search enabled. Enable Retail
   * Search on Cloud Console before using this feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CompletionServiceClient completionServiceClient = CompletionServiceClient.create()) {
   *   ImportCompletionDataRequest request =
   *       ImportCompletionDataRequest.newBuilder()
   *           .setParent(CatalogName.of("[PROJECT]", "[LOCATION]", "[CATALOG]").toString())
   *           .setInputConfig(CompletionDataInputConfig.newBuilder().build())
   *           .setNotificationPubsubTopic("notificationPubsubTopic-1361224991")
   *           .build();
   *   ApiFuture<Operation> future =
   *       completionServiceClient.importCompletionDataCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ImportCompletionDataRequest, Operation>
      importCompletionDataCallable() {
    return stub.importCompletionDataCallable();
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
}
