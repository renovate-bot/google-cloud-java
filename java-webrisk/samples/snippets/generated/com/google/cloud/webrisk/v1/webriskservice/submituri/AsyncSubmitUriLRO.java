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

package com.google.cloud.webrisk.v1.samples;

// [START webrisk_v1_generated_WebRiskService_SubmitUri_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.webrisk.v1.WebRiskServiceClient;
import com.google.webrisk.v1.ProjectName;
import com.google.webrisk.v1.Submission;
import com.google.webrisk.v1.SubmitUriMetadata;
import com.google.webrisk.v1.SubmitUriRequest;
import com.google.webrisk.v1.ThreatDiscovery;
import com.google.webrisk.v1.ThreatInfo;

public class AsyncSubmitUriLRO {

  public static void main(String[] args) throws Exception {
    asyncSubmitUriLRO();
  }

  public static void asyncSubmitUriLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (WebRiskServiceClient webRiskServiceClient = WebRiskServiceClient.create()) {
      SubmitUriRequest request =
          SubmitUriRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setSubmission(Submission.newBuilder().build())
              .setThreatInfo(ThreatInfo.newBuilder().build())
              .setThreatDiscovery(ThreatDiscovery.newBuilder().build())
              .build();
      OperationFuture<Submission, SubmitUriMetadata> future =
          webRiskServiceClient.submitUriOperationCallable().futureCall(request);
      // Do something.
      Submission response = future.get();
    }
  }
}
// [END webrisk_v1_generated_WebRiskService_SubmitUri_LRO_async]
