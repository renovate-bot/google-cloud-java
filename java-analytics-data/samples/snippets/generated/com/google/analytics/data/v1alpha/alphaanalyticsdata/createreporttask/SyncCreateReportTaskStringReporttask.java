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

package com.google.analytics.data.v1alpha.samples;

// [START analyticsdata_v1alpha_generated_AlphaAnalyticsData_CreateReportTask_StringReporttask_sync]
import com.google.analytics.data.v1alpha.AlphaAnalyticsDataClient;
import com.google.analytics.data.v1alpha.PropertyName;
import com.google.analytics.data.v1alpha.ReportTask;

public class SyncCreateReportTaskStringReporttask {

  public static void main(String[] args) throws Exception {
    syncCreateReportTaskStringReporttask();
  }

  public static void syncCreateReportTaskStringReporttask() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
      String parent = PropertyName.of("[PROPERTY]").toString();
      ReportTask reportTask = ReportTask.newBuilder().build();
      ReportTask response =
          alphaAnalyticsDataClient.createReportTaskAsync(parent, reportTask).get();
    }
  }
}
// [END analyticsdata_v1alpha_generated_AlphaAnalyticsData_CreateReportTask_StringReporttask_sync]
