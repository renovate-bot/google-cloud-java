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

package com.google.cloud.language.v2.samples;

// [START language_v2_generated_LanguageService_ModerateText_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.language.v2.Document;
import com.google.cloud.language.v2.LanguageServiceClient;
import com.google.cloud.language.v2.ModerateTextRequest;
import com.google.cloud.language.v2.ModerateTextResponse;

public class AsyncModerateText {

  public static void main(String[] args) throws Exception {
    asyncModerateText();
  }

  public static void asyncModerateText() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (LanguageServiceClient languageServiceClient = LanguageServiceClient.create()) {
      ModerateTextRequest request =
          ModerateTextRequest.newBuilder().setDocument(Document.newBuilder().build()).build();
      ApiFuture<ModerateTextResponse> future =
          languageServiceClient.moderateTextCallable().futureCall(request);
      // Do something.
      ModerateTextResponse response = future.get();
    }
  }
}
// [END language_v2_generated_LanguageService_ModerateText_async]
