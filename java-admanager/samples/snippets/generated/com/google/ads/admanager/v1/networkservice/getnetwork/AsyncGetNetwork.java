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

package com.google.ads.admanager.v1.samples;

// [START admanager_v1_generated_NetworkService_GetNetwork_async]
import com.google.ads.admanager.v1.GetNetworkRequest;
import com.google.ads.admanager.v1.Network;
import com.google.ads.admanager.v1.NetworkName;
import com.google.ads.admanager.v1.NetworkServiceClient;
import com.google.api.core.ApiFuture;

public class AsyncGetNetwork {

  public static void main(String[] args) throws Exception {
    asyncGetNetwork();
  }

  public static void asyncGetNetwork() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (NetworkServiceClient networkServiceClient = NetworkServiceClient.create()) {
      GetNetworkRequest request =
          GetNetworkRequest.newBuilder()
              .setName(NetworkName.of("[NETWORK_CODE]").toString())
              .build();
      ApiFuture<Network> future = networkServiceClient.getNetworkCallable().futureCall(request);
      // Do something.
      Network response = future.get();
    }
  }
}
// [END admanager_v1_generated_NetworkService_GetNetwork_async]
