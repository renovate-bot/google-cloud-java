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

package com.google.cloud.networkconnectivity.v1.samples;

// [START networkconnectivity_v1_generated_CrossNetworkAutomationService_ListServiceConnectionTokens_sync]
import com.google.cloud.networkconnectivity.v1.CrossNetworkAutomationServiceClient;
import com.google.cloud.networkconnectivity.v1.ListServiceConnectionTokensRequest;
import com.google.cloud.networkconnectivity.v1.LocationName;
import com.google.cloud.networkconnectivity.v1.ServiceConnectionToken;

public class SyncListServiceConnectionTokens {

  public static void main(String[] args) throws Exception {
    syncListServiceConnectionTokens();
  }

  public static void syncListServiceConnectionTokens() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CrossNetworkAutomationServiceClient crossNetworkAutomationServiceClient =
        CrossNetworkAutomationServiceClient.create()) {
      ListServiceConnectionTokensRequest request =
          ListServiceConnectionTokensRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      for (ServiceConnectionToken element :
          crossNetworkAutomationServiceClient.listServiceConnectionTokens(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END networkconnectivity_v1_generated_CrossNetworkAutomationService_ListServiceConnectionTokens_sync]
