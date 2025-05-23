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

package com.google.cloud.apihub.v1.samples;

// [START apihub_v1_generated_ApiHub_ListSpecs_Paged_async]
import com.google.cloud.apihub.v1.ApiHubClient;
import com.google.cloud.apihub.v1.ListSpecsRequest;
import com.google.cloud.apihub.v1.ListSpecsResponse;
import com.google.cloud.apihub.v1.Spec;
import com.google.cloud.apihub.v1.VersionName;
import com.google.common.base.Strings;

public class AsyncListSpecsPaged {

  public static void main(String[] args) throws Exception {
    asyncListSpecsPaged();
  }

  public static void asyncListSpecsPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ApiHubClient apiHubClient = ApiHubClient.create()) {
      ListSpecsRequest request =
          ListSpecsRequest.newBuilder()
              .setParent(VersionName.of("[PROJECT]", "[LOCATION]", "[API]", "[VERSION]").toString())
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListSpecsResponse response = apiHubClient.listSpecsCallable().call(request);
        for (Spec element : response.getSpecsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END apihub_v1_generated_ApiHub_ListSpecs_Paged_async]
