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

package com.google.cloud.dialogflow.v2.samples;

// [START dialogflow_v2_generated_ConversationModels_DeleteConversationModel_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.dialogflow.v2.ConversationModelsClient;
import com.google.cloud.dialogflow.v2.DeleteConversationModelOperationMetadata;
import com.google.cloud.dialogflow.v2.DeleteConversationModelRequest;
import com.google.protobuf.Empty;

public class AsyncDeleteConversationModelLRO {

  public static void main(String[] args) throws Exception {
    asyncDeleteConversationModelLRO();
  }

  public static void asyncDeleteConversationModelLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ConversationModelsClient conversationModelsClient = ConversationModelsClient.create()) {
      DeleteConversationModelRequest request =
          DeleteConversationModelRequest.newBuilder().setName("name3373707").build();
      OperationFuture<Empty, DeleteConversationModelOperationMetadata> future =
          conversationModelsClient.deleteConversationModelOperationCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END dialogflow_v2_generated_ConversationModels_DeleteConversationModel_LRO_async]
