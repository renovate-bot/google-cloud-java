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

package com.google.cloud.securitycenter.v1p1beta1.samples;

// [START securitycenter_v1p1beta1_generated_SecurityCenter_ListAssets_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.securitycenter.v1p1beta1.ListAssetsRequest;
import com.google.cloud.securitycenter.v1p1beta1.ListAssetsResponse;
import com.google.cloud.securitycenter.v1p1beta1.OrganizationName;
import com.google.cloud.securitycenter.v1p1beta1.SecurityCenterClient;
import com.google.protobuf.Duration;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;

public class AsyncListAssets {

  public static void main(String[] args) throws Exception {
    asyncListAssets();
  }

  public static void asyncListAssets() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
      ListAssetsRequest request =
          ListAssetsRequest.newBuilder()
              .setParent(OrganizationName.of("[ORGANIZATION]").toString())
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .setReadTime(Timestamp.newBuilder().build())
              .setCompareDuration(Duration.newBuilder().build())
              .setFieldMask(FieldMask.newBuilder().build())
              .setPageToken("pageToken873572522")
              .setPageSize(883849137)
              .build();
      ApiFuture<ListAssetsResponse.ListAssetsResult> future =
          securityCenterClient.listAssetsPagedCallable().futureCall(request);
      // Do something.
      for (ListAssetsResponse.ListAssetsResult element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END securitycenter_v1p1beta1_generated_SecurityCenter_ListAssets_async]
