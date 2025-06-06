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

package com.google.cloud.contactcenterinsights.v1.samples;

// [START contactcenterinsights_v1_generated_ContactCenterInsights_DeletePhraseMatcher_sync]
import com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsClient;
import com.google.cloud.contactcenterinsights.v1.DeletePhraseMatcherRequest;
import com.google.cloud.contactcenterinsights.v1.PhraseMatcherName;
import com.google.protobuf.Empty;

public class SyncDeletePhraseMatcher {

  public static void main(String[] args) throws Exception {
    syncDeletePhraseMatcher();
  }

  public static void syncDeletePhraseMatcher() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ContactCenterInsightsClient contactCenterInsightsClient =
        ContactCenterInsightsClient.create()) {
      DeletePhraseMatcherRequest request =
          DeletePhraseMatcherRequest.newBuilder()
              .setName(
                  PhraseMatcherName.of("[PROJECT]", "[LOCATION]", "[PHRASE_MATCHER]").toString())
              .build();
      contactCenterInsightsClient.deletePhraseMatcher(request);
    }
  }
}
// [END contactcenterinsights_v1_generated_ContactCenterInsights_DeletePhraseMatcher_sync]
