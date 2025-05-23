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

package com.google.cloud.talent.v4beta1;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.talent.v4beta1.stub.CompletionStub;
import com.google.cloud.talent.v4beta1.stub.CompletionStubSettings;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: A service handles auto completion.
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
 * try (CompletionClient completionClient = CompletionClient.create()) {
 *   CompleteQueryRequest request =
 *       CompleteQueryRequest.newBuilder()
 *           .setParent(TenantName.of("[PROJECT]", "[TENANT]").toString())
 *           .setQuery("query107944136")
 *           .addAllLanguageCodes(new ArrayList<String>())
 *           .setPageSize(883849137)
 *           .setCompany(
 *               CompanyName.ofProjectTenantCompanyName("[PROJECT]", "[TENANT]", "[COMPANY]")
 *                   .toString())
 *           .build();
 *   CompleteQueryResponse response = completionClient.completeQuery(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CompletionClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
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
 *      <td><p> Completes the specified prefix with keyword suggestions. Intended for use by a job search auto-complete search box.</td>
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
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of CompletionSettings to
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
 * CompletionSettings completionSettings =
 *     CompletionSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CompletionClient completionClient = CompletionClient.create(completionSettings);
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
 * CompletionSettings completionSettings =
 *     CompletionSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CompletionClient completionClient = CompletionClient.create(completionSettings);
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
 * CompletionSettings completionSettings = CompletionSettings.newHttpJsonBuilder().build();
 * CompletionClient completionClient = CompletionClient.create(completionSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class CompletionClient implements BackgroundResource {
  private final CompletionSettings settings;
  private final CompletionStub stub;

  /** Constructs an instance of CompletionClient with default settings. */
  public static final CompletionClient create() throws IOException {
    return create(CompletionSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CompletionClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CompletionClient create(CompletionSettings settings) throws IOException {
    return new CompletionClient(settings);
  }

  /**
   * Constructs an instance of CompletionClient, using the given stub for making calls. This is for
   * advanced usage - prefer using create(CompletionSettings).
   */
  public static final CompletionClient create(CompletionStub stub) {
    return new CompletionClient(stub);
  }

  /**
   * Constructs an instance of CompletionClient, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected CompletionClient(CompletionSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CompletionStubSettings) settings.getStubSettings()).createStub();
  }

  protected CompletionClient(CompletionStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CompletionSettings getSettings() {
    return settings;
  }

  public CompletionStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Completes the specified prefix with keyword suggestions. Intended for use by a job search
   * auto-complete search box.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CompletionClient completionClient = CompletionClient.create()) {
   *   CompleteQueryRequest request =
   *       CompleteQueryRequest.newBuilder()
   *           .setParent(TenantName.of("[PROJECT]", "[TENANT]").toString())
   *           .setQuery("query107944136")
   *           .addAllLanguageCodes(new ArrayList<String>())
   *           .setPageSize(883849137)
   *           .setCompany(
   *               CompanyName.ofProjectTenantCompanyName("[PROJECT]", "[TENANT]", "[COMPANY]")
   *                   .toString())
   *           .build();
   *   CompleteQueryResponse response = completionClient.completeQuery(request);
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
   * Completes the specified prefix with keyword suggestions. Intended for use by a job search
   * auto-complete search box.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CompletionClient completionClient = CompletionClient.create()) {
   *   CompleteQueryRequest request =
   *       CompleteQueryRequest.newBuilder()
   *           .setParent(TenantName.of("[PROJECT]", "[TENANT]").toString())
   *           .setQuery("query107944136")
   *           .addAllLanguageCodes(new ArrayList<String>())
   *           .setPageSize(883849137)
   *           .setCompany(
   *               CompanyName.ofProjectTenantCompanyName("[PROJECT]", "[TENANT]", "[COMPANY]")
   *                   .toString())
   *           .build();
   *   ApiFuture<CompleteQueryResponse> future =
   *       completionClient.completeQueryCallable().futureCall(request);
   *   // Do something.
   *   CompleteQueryResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CompleteQueryRequest, CompleteQueryResponse> completeQueryCallable() {
    return stub.completeQueryCallable();
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
