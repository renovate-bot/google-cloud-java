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

package com.google.cloud.clouddms.v1.samples;

// [START datamigration_v1_generated_DataMigrationService_UpdateMigrationJob_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.clouddms.v1.DataMigrationServiceClient;
import com.google.cloud.clouddms.v1.MigrationJob;
import com.google.cloud.clouddms.v1.UpdateMigrationJobRequest;
import com.google.longrunning.Operation;
import com.google.protobuf.FieldMask;

public class AsyncUpdateMigrationJob {

  public static void main(String[] args) throws Exception {
    asyncUpdateMigrationJob();
  }

  public static void asyncUpdateMigrationJob() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataMigrationServiceClient dataMigrationServiceClient =
        DataMigrationServiceClient.create()) {
      UpdateMigrationJobRequest request =
          UpdateMigrationJobRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setMigrationJob(MigrationJob.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      ApiFuture<Operation> future =
          dataMigrationServiceClient.updateMigrationJobCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END datamigration_v1_generated_DataMigrationService_UpdateMigrationJob_async]
