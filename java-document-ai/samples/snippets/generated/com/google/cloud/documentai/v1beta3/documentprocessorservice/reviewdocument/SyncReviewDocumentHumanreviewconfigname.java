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

package com.google.cloud.documentai.v1beta3.samples;

// [START documentai_v1beta3_generated_DocumentProcessorService_ReviewDocument_Humanreviewconfigname_sync]
import com.google.cloud.documentai.v1beta3.DocumentProcessorServiceClient;
import com.google.cloud.documentai.v1beta3.HumanReviewConfigName;
import com.google.cloud.documentai.v1beta3.ReviewDocumentResponse;

public class SyncReviewDocumentHumanreviewconfigname {

  public static void main(String[] args) throws Exception {
    syncReviewDocumentHumanreviewconfigname();
  }

  public static void syncReviewDocumentHumanreviewconfigname() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DocumentProcessorServiceClient documentProcessorServiceClient =
        DocumentProcessorServiceClient.create()) {
      HumanReviewConfigName humanReviewConfig =
          HumanReviewConfigName.of("[PROJECT]", "[LOCATION]", "[PROCESSOR]");
      ReviewDocumentResponse response =
          documentProcessorServiceClient.reviewDocumentAsync(humanReviewConfig).get();
    }
  }
}
// [END documentai_v1beta3_generated_DocumentProcessorService_ReviewDocument_Humanreviewconfigname_sync]
