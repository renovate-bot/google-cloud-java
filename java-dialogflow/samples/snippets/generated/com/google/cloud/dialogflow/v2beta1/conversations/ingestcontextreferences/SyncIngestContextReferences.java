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

package com.google.cloud.dialogflow.v2beta1.samples;

// [START dialogflow_v2beta1_generated_Conversations_IngestContextReferences_sync]
import com.google.cloud.dialogflow.v2beta1.Conversation;
import com.google.cloud.dialogflow.v2beta1.ConversationName;
import com.google.cloud.dialogflow.v2beta1.ConversationsClient;
import com.google.cloud.dialogflow.v2beta1.IngestContextReferencesRequest;
import com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse;
import java.util.HashMap;

public class SyncIngestContextReferences {

  public static void main(String[] args) throws Exception {
    syncIngestContextReferences();
  }

  public static void syncIngestContextReferences() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ConversationsClient conversationsClient = ConversationsClient.create()) {
      IngestContextReferencesRequest request =
          IngestContextReferencesRequest.newBuilder()
              .setConversation(
                  ConversationName.ofProjectLocationConversationName(
                          "[PROJECT]", "[LOCATION]", "[CONVERSATION]")
                      .toString())
              .putAllContextReferences(new HashMap<String, Conversation.ContextReference>())
              .build();
      IngestContextReferencesResponse response =
          conversationsClient.ingestContextReferences(request);
    }
  }
}
// [END dialogflow_v2beta1_generated_Conversations_IngestContextReferences_sync]
