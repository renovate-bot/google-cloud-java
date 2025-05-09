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

package com.google.cloud.monitoring.dashboard.v1.samples;

// [START monitoring_v1_generated_DashboardsService_DeleteDashboard_String_sync]
import com.google.cloud.monitoring.dashboard.v1.DashboardsServiceClient;
import com.google.monitoring.dashboard.v1.DashboardName;
import com.google.protobuf.Empty;

public class SyncDeleteDashboardString {

  public static void main(String[] args) throws Exception {
    syncDeleteDashboardString();
  }

  public static void syncDeleteDashboardString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
      String name = DashboardName.of("[PROJECT]", "[DASHBOARD]").toString();
      dashboardsServiceClient.deleteDashboard(name);
    }
  }
}
// [END monitoring_v1_generated_DashboardsService_DeleteDashboard_String_sync]
