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

package com.google.cloud.commerce.consumer.procurement.v1.samples;

// [START cloudcommerceconsumerprocurement_v1_generated_LicenseManagementService_Unassign_StringListstring_sync]
import com.google.cloud.commerce.consumer.procurement.v1.LicenseManagementServiceClient;
import com.google.cloud.commerce.consumer.procurement.v1.UnassignResponse;
import java.util.ArrayList;
import java.util.List;

public class SyncUnassignStringListstring {

  public static void main(String[] args) throws Exception {
    syncUnassignStringListstring();
  }

  public static void syncUnassignStringListstring() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (LicenseManagementServiceClient licenseManagementServiceClient =
        LicenseManagementServiceClient.create()) {
      String parent = "parent-995424086";
      List<String> usernames = new ArrayList<>();
      UnassignResponse response = licenseManagementServiceClient.unassign(parent, usernames);
    }
  }
}
// [END cloudcommerceconsumerprocurement_v1_generated_LicenseManagementService_Unassign_StringListstring_sync]
