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

package com.google.cloud.apigateway.v1.samples;

// [START apigateway_v1_generated_ApiGatewayService_ListApiConfigs_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.apigateway.v1.ApiConfig;
import com.google.cloud.apigateway.v1.ApiGatewayServiceClient;
import com.google.cloud.apigateway.v1.ApiName;
import com.google.cloud.apigateway.v1.ListApiConfigsRequest;

public class AsyncListApiConfigs {

  public static void main(String[] args) throws Exception {
    asyncListApiConfigs();
  }

  public static void asyncListApiConfigs() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ApiGatewayServiceClient apiGatewayServiceClient = ApiGatewayServiceClient.create()) {
      ListApiConfigsRequest request =
          ListApiConfigsRequest.newBuilder()
              .setParent(ApiName.of("[PROJECT]", "[API]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      ApiFuture<ApiConfig> future =
          apiGatewayServiceClient.listApiConfigsPagedCallable().futureCall(request);
      // Do something.
      for (ApiConfig element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END apigateway_v1_generated_ApiGatewayService_ListApiConfigs_async]
