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

package com.google.cloud.rapidmigrationassessment.v1.samples;

// [START rapidmigrationassessment_v1_generated_RapidMigrationAssessment_RegisterCollector_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.rapidmigrationassessment.v1.CollectorName;
import com.google.cloud.rapidmigrationassessment.v1.RapidMigrationAssessmentClient;
import com.google.cloud.rapidmigrationassessment.v1.RegisterCollectorRequest;
import com.google.longrunning.Operation;

public class AsyncRegisterCollector {

  public static void main(String[] args) throws Exception {
    asyncRegisterCollector();
  }

  public static void asyncRegisterCollector() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (RapidMigrationAssessmentClient rapidMigrationAssessmentClient =
        RapidMigrationAssessmentClient.create()) {
      RegisterCollectorRequest request =
          RegisterCollectorRequest.newBuilder()
              .setName(CollectorName.of("[PROJECT]", "[LOCATION]", "[COLLECTOR]").toString())
              .setRequestId("requestId693933066")
              .build();
      ApiFuture<Operation> future =
          rapidMigrationAssessmentClient.registerCollectorCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END rapidmigrationassessment_v1_generated_RapidMigrationAssessment_RegisterCollector_async]
