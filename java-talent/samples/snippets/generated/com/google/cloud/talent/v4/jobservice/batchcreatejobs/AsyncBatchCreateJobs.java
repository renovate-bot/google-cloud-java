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

package com.google.cloud.talent.v4.samples;

// [START jobs_v4_generated_JobService_BatchCreateJobs_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.talent.v4.BatchCreateJobsRequest;
import com.google.cloud.talent.v4.Job;
import com.google.cloud.talent.v4.JobServiceClient;
import com.google.cloud.talent.v4.TenantName;
import com.google.longrunning.Operation;
import java.util.ArrayList;

public class AsyncBatchCreateJobs {

  public static void main(String[] args) throws Exception {
    asyncBatchCreateJobs();
  }

  public static void asyncBatchCreateJobs() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
      BatchCreateJobsRequest request =
          BatchCreateJobsRequest.newBuilder()
              .setParent(TenantName.of("[PROJECT]", "[TENANT]").toString())
              .addAllJobs(new ArrayList<Job>())
              .build();
      ApiFuture<Operation> future = jobServiceClient.batchCreateJobsCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END jobs_v4_generated_JobService_BatchCreateJobs_async]
