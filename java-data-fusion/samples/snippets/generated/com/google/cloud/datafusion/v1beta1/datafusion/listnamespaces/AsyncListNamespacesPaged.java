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

package com.google.cloud.datafusion.v1beta1.samples;

// [START datafusion_v1beta1_generated_DataFusion_ListNamespaces_Paged_async]
import com.google.cloud.datafusion.v1beta1.DataFusionClient;
import com.google.cloud.datafusion.v1beta1.InstanceName;
import com.google.cloud.datafusion.v1beta1.ListNamespacesRequest;
import com.google.cloud.datafusion.v1beta1.ListNamespacesResponse;
import com.google.cloud.datafusion.v1beta1.Namespace;
import com.google.cloud.datafusion.v1beta1.NamespaceView;
import com.google.common.base.Strings;

public class AsyncListNamespacesPaged {

  public static void main(String[] args) throws Exception {
    asyncListNamespacesPaged();
  }

  public static void asyncListNamespacesPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataFusionClient dataFusionClient = DataFusionClient.create()) {
      ListNamespacesRequest request =
          ListNamespacesRequest.newBuilder()
              .setParent(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setView(NamespaceView.forNumber(0))
              .build();
      while (true) {
        ListNamespacesResponse response = dataFusionClient.listNamespacesCallable().call(request);
        for (Namespace element : response.getNamespacesList()) {
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
// [END datafusion_v1beta1_generated_DataFusion_ListNamespaces_Paged_async]
