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

package com.google.cloud.binaryauthorization.v1beta1.samples;

// [START binaryauthorization_v1beta1_generated_BinauthzManagementServiceV1Beta1_ListAttestors_sync]
import com.google.cloud.binaryauthorization.v1beta1.Attestor;
import com.google.cloud.binaryauthorization.v1beta1.BinauthzManagementServiceV1Beta1Client;
import com.google.cloud.binaryauthorization.v1beta1.ListAttestorsRequest;
import com.google.cloud.binaryauthorization.v1beta1.ProjectName;

public class SyncListAttestors {

  public static void main(String[] args) throws Exception {
    syncListAttestors();
  }

  public static void syncListAttestors() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (BinauthzManagementServiceV1Beta1Client binauthzManagementServiceV1Beta1Client =
        BinauthzManagementServiceV1Beta1Client.create()) {
      ListAttestorsRequest request =
          ListAttestorsRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      for (Attestor element :
          binauthzManagementServiceV1Beta1Client.listAttestors(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END binaryauthorization_v1beta1_generated_BinauthzManagementServiceV1Beta1_ListAttestors_sync]
