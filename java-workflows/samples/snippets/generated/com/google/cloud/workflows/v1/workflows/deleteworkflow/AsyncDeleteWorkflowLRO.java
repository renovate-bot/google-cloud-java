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

package com.google.cloud.workflows.v1.samples;

// [START workflows_v1_generated_Workflows_DeleteWorkflow_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.workflows.v1.DeleteWorkflowRequest;
import com.google.cloud.workflows.v1.OperationMetadata;
import com.google.cloud.workflows.v1.WorkflowName;
import com.google.cloud.workflows.v1.WorkflowsClient;
import com.google.protobuf.Empty;

public class AsyncDeleteWorkflowLRO {

  public static void main(String[] args) throws Exception {
    asyncDeleteWorkflowLRO();
  }

  public static void asyncDeleteWorkflowLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (WorkflowsClient workflowsClient = WorkflowsClient.create()) {
      DeleteWorkflowRequest request =
          DeleteWorkflowRequest.newBuilder()
              .setName(WorkflowName.of("[PROJECT]", "[LOCATION]", "[WORKFLOW]").toString())
              .build();
      OperationFuture<Empty, OperationMetadata> future =
          workflowsClient.deleteWorkflowOperationCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END workflows_v1_generated_Workflows_DeleteWorkflow_LRO_async]
