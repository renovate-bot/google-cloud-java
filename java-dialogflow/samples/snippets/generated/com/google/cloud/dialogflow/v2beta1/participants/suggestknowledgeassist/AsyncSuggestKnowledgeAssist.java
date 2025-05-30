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

// [START dialogflow_v2beta1_generated_Participants_SuggestKnowledgeAssist_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.v2beta1.MessageName;
import com.google.cloud.dialogflow.v2beta1.ParticipantName;
import com.google.cloud.dialogflow.v2beta1.ParticipantsClient;
import com.google.cloud.dialogflow.v2beta1.SuggestKnowledgeAssistRequest;
import com.google.cloud.dialogflow.v2beta1.SuggestKnowledgeAssistResponse;

public class AsyncSuggestKnowledgeAssist {

  public static void main(String[] args) throws Exception {
    asyncSuggestKnowledgeAssist();
  }

  public static void asyncSuggestKnowledgeAssist() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
      SuggestKnowledgeAssistRequest request =
          SuggestKnowledgeAssistRequest.newBuilder()
              .setParent(
                  ParticipantName.ofProjectConversationParticipantName(
                          "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
                      .toString())
              .setLatestMessage(
                  MessageName.ofProjectConversationMessageName(
                          "[PROJECT]", "[CONVERSATION]", "[MESSAGE]")
                      .toString())
              .setContextSize(1116903569)
              .setPreviousSuggestedQuery("previousSuggestedQuery-1914206660")
              .build();
      ApiFuture<SuggestKnowledgeAssistResponse> future =
          participantsClient.suggestKnowledgeAssistCallable().futureCall(request);
      // Do something.
      SuggestKnowledgeAssistResponse response = future.get();
    }
  }
}
// [END dialogflow_v2beta1_generated_Participants_SuggestKnowledgeAssist_async]
