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

package com.google.cloud.phishingprotection.v1beta1;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1Stub;
import com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1StubSettings;
import com.google.phishingprotection.v1beta1.ProjectName;
import com.google.phishingprotection.v1beta1.ReportPhishingRequest;
import com.google.phishingprotection.v1beta1.ReportPhishingResponse;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to report phishing URIs.
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
 * try (PhishingProtectionServiceV1Beta1Client phishingProtectionServiceV1Beta1Client =
 *     PhishingProtectionServiceV1Beta1Client.create()) {
 *   ProjectName parent = ProjectName.of("[PROJECT]");
 *   String uri = "uri116076";
 *   ReportPhishingResponse response =
 *       phishingProtectionServiceV1Beta1Client.reportPhishing(parent, uri);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the PhishingProtectionServiceV1Beta1Client object to clean
 * up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> ReportPhishing</td>
 *      <td><p> Reports a URI suspected of containing phishing content to be reviewed. Once the report review is complete, its result can be found in the Cloud Security Command Center findings dashboard for Phishing Protection. If the result verifies the existence of malicious phishing content, the site will be added the to [Google's Social Engineering lists](https://support.google.com/webmasters/answer/6350487/) in order to protect users that could get exposed to this threat in the future.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> reportPhishing(ReportPhishingRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> reportPhishing(ProjectName parent, String uri)
 *           <li><p> reportPhishing(String parent, String uri)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> reportPhishingCallable()
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
 * PhishingProtectionServiceV1Beta1Settings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * PhishingProtectionServiceV1Beta1Settings phishingProtectionServiceV1Beta1Settings =
 *     PhishingProtectionServiceV1Beta1Settings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * PhishingProtectionServiceV1Beta1Client phishingProtectionServiceV1Beta1Client =
 *     PhishingProtectionServiceV1Beta1Client.create(phishingProtectionServiceV1Beta1Settings);
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
 * PhishingProtectionServiceV1Beta1Settings phishingProtectionServiceV1Beta1Settings =
 *     PhishingProtectionServiceV1Beta1Settings.newBuilder().setEndpoint(myEndpoint).build();
 * PhishingProtectionServiceV1Beta1Client phishingProtectionServiceV1Beta1Client =
 *     PhishingProtectionServiceV1Beta1Client.create(phishingProtectionServiceV1Beta1Settings);
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
 * PhishingProtectionServiceV1Beta1Settings phishingProtectionServiceV1Beta1Settings =
 *     PhishingProtectionServiceV1Beta1Settings.newHttpJsonBuilder().build();
 * PhishingProtectionServiceV1Beta1Client phishingProtectionServiceV1Beta1Client =
 *     PhishingProtectionServiceV1Beta1Client.create(phishingProtectionServiceV1Beta1Settings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class PhishingProtectionServiceV1Beta1Client implements BackgroundResource {
  private final PhishingProtectionServiceV1Beta1Settings settings;
  private final PhishingProtectionServiceV1Beta1Stub stub;

  /** Constructs an instance of PhishingProtectionServiceV1Beta1Client with default settings. */
  public static final PhishingProtectionServiceV1Beta1Client create() throws IOException {
    return create(PhishingProtectionServiceV1Beta1Settings.newBuilder().build());
  }

  /**
   * Constructs an instance of PhishingProtectionServiceV1Beta1Client, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final PhishingProtectionServiceV1Beta1Client create(
      PhishingProtectionServiceV1Beta1Settings settings) throws IOException {
    return new PhishingProtectionServiceV1Beta1Client(settings);
  }

  /**
   * Constructs an instance of PhishingProtectionServiceV1Beta1Client, using the given stub for
   * making calls. This is for advanced usage - prefer using
   * create(PhishingProtectionServiceV1Beta1Settings).
   */
  public static final PhishingProtectionServiceV1Beta1Client create(
      PhishingProtectionServiceV1Beta1Stub stub) {
    return new PhishingProtectionServiceV1Beta1Client(stub);
  }

  /**
   * Constructs an instance of PhishingProtectionServiceV1Beta1Client, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected PhishingProtectionServiceV1Beta1Client(
      PhishingProtectionServiceV1Beta1Settings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((PhishingProtectionServiceV1Beta1StubSettings) settings.getStubSettings()).createStub();
  }

  protected PhishingProtectionServiceV1Beta1Client(PhishingProtectionServiceV1Beta1Stub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final PhishingProtectionServiceV1Beta1Settings getSettings() {
    return settings;
  }

  public PhishingProtectionServiceV1Beta1Stub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Reports a URI suspected of containing phishing content to be reviewed. Once the report review
   * is complete, its result can be found in the Cloud Security Command Center findings dashboard
   * for Phishing Protection. If the result verifies the existence of malicious phishing content,
   * the site will be added the to [Google's Social Engineering
   * lists](https://support.google.com/webmasters/answer/6350487/) in order to protect users that
   * could get exposed to this threat in the future.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PhishingProtectionServiceV1Beta1Client phishingProtectionServiceV1Beta1Client =
   *     PhishingProtectionServiceV1Beta1Client.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   String uri = "uri116076";
   *   ReportPhishingResponse response =
   *       phishingProtectionServiceV1Beta1Client.reportPhishing(parent, uri);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the project for which the report will be created, in the
   *     format "projects/{project_number}".
   * @param uri Required. The URI that is being reported for phishing content to be analyzed.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ReportPhishingResponse reportPhishing(ProjectName parent, String uri) {
    ReportPhishingRequest request =
        ReportPhishingRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setUri(uri)
            .build();
    return reportPhishing(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Reports a URI suspected of containing phishing content to be reviewed. Once the report review
   * is complete, its result can be found in the Cloud Security Command Center findings dashboard
   * for Phishing Protection. If the result verifies the existence of malicious phishing content,
   * the site will be added the to [Google's Social Engineering
   * lists](https://support.google.com/webmasters/answer/6350487/) in order to protect users that
   * could get exposed to this threat in the future.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PhishingProtectionServiceV1Beta1Client phishingProtectionServiceV1Beta1Client =
   *     PhishingProtectionServiceV1Beta1Client.create()) {
   *   String parent = ProjectName.of("[PROJECT]").toString();
   *   String uri = "uri116076";
   *   ReportPhishingResponse response =
   *       phishingProtectionServiceV1Beta1Client.reportPhishing(parent, uri);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the project for which the report will be created, in the
   *     format "projects/{project_number}".
   * @param uri Required. The URI that is being reported for phishing content to be analyzed.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ReportPhishingResponse reportPhishing(String parent, String uri) {
    ReportPhishingRequest request =
        ReportPhishingRequest.newBuilder().setParent(parent).setUri(uri).build();
    return reportPhishing(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Reports a URI suspected of containing phishing content to be reviewed. Once the report review
   * is complete, its result can be found in the Cloud Security Command Center findings dashboard
   * for Phishing Protection. If the result verifies the existence of malicious phishing content,
   * the site will be added the to [Google's Social Engineering
   * lists](https://support.google.com/webmasters/answer/6350487/) in order to protect users that
   * could get exposed to this threat in the future.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PhishingProtectionServiceV1Beta1Client phishingProtectionServiceV1Beta1Client =
   *     PhishingProtectionServiceV1Beta1Client.create()) {
   *   ReportPhishingRequest request =
   *       ReportPhishingRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setUri("uri116076")
   *           .build();
   *   ReportPhishingResponse response =
   *       phishingProtectionServiceV1Beta1Client.reportPhishing(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ReportPhishingResponse reportPhishing(ReportPhishingRequest request) {
    return reportPhishingCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Reports a URI suspected of containing phishing content to be reviewed. Once the report review
   * is complete, its result can be found in the Cloud Security Command Center findings dashboard
   * for Phishing Protection. If the result verifies the existence of malicious phishing content,
   * the site will be added the to [Google's Social Engineering
   * lists](https://support.google.com/webmasters/answer/6350487/) in order to protect users that
   * could get exposed to this threat in the future.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PhishingProtectionServiceV1Beta1Client phishingProtectionServiceV1Beta1Client =
   *     PhishingProtectionServiceV1Beta1Client.create()) {
   *   ReportPhishingRequest request =
   *       ReportPhishingRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setUri("uri116076")
   *           .build();
   *   ApiFuture<ReportPhishingResponse> future =
   *       phishingProtectionServiceV1Beta1Client.reportPhishingCallable().futureCall(request);
   *   // Do something.
   *   ReportPhishingResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ReportPhishingRequest, ReportPhishingResponse>
      reportPhishingCallable() {
    return stub.reportPhishingCallable();
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
