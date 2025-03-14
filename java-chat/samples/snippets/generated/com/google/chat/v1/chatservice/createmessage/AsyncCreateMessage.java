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

package com.google.chat.v1.samples;

// [START chat_v1_generated_ChatService_CreateMessage_async]
import com.google.api.core.ApiFuture;
import com.google.chat.v1.ChatServiceClient;
import com.google.chat.v1.CreateMessageRequest;
import com.google.chat.v1.Message;
import com.google.chat.v1.SpaceName;

public class AsyncCreateMessage {

  public static void main(String[] args) throws Exception {
    asyncCreateMessage();
  }

  public static void asyncCreateMessage() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ChatServiceClient chatServiceClient = ChatServiceClient.create()) {
      CreateMessageRequest request =
          CreateMessageRequest.newBuilder()
              .setParent(SpaceName.of("[SPACE]").toString())
              .setMessage(Message.newBuilder().build())
              .setThreadKey("threadKey-1562254347")
              .setRequestId("requestId693933066")
              .setMessageId("messageId-1440013438")
              .build();
      ApiFuture<Message> future = chatServiceClient.createMessageCallable().futureCall(request);
      // Do something.
      Message response = future.get();
    }
  }
}
// [END chat_v1_generated_ChatService_CreateMessage_async]
