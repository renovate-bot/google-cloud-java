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

package com.google.cloud.aiplatform.v1.samples;

// [START aiplatform_v1_generated_PipelineService_GetPipelineJob_sync]
import com.google.cloud.aiplatform.v1.GetPipelineJobRequest;
import com.google.cloud.aiplatform.v1.PipelineJob;
import com.google.cloud.aiplatform.v1.PipelineJobName;
import com.google.cloud.aiplatform.v1.PipelineServiceClient;

public class SyncGetPipelineJob {

  public static void main(String[] args) throws Exception {
    syncGetPipelineJob();
  }

  public static void syncGetPipelineJob() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (PipelineServiceClient pipelineServiceClient = PipelineServiceClient.create()) {
      GetPipelineJobRequest request =
          GetPipelineJobRequest.newBuilder()
              .setName(PipelineJobName.of("[PROJECT]", "[LOCATION]", "[PIPELINE_JOB]").toString())
              .build();
      PipelineJob response = pipelineServiceClient.getPipelineJob(request);
    }
  }
}
// [END aiplatform_v1_generated_PipelineService_GetPipelineJob_sync]
