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

package com.google.cloud.visionai.v1.samples;

// [START visionai_v1_generated_AppPlatform_GetDraft_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.visionai.v1.AppPlatformClient;
import com.google.cloud.visionai.v1.Draft;
import com.google.cloud.visionai.v1.DraftName;
import com.google.cloud.visionai.v1.GetDraftRequest;

public class AsyncGetDraft {

  public static void main(String[] args) throws Exception {
    asyncGetDraft();
  }

  public static void asyncGetDraft() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AppPlatformClient appPlatformClient = AppPlatformClient.create()) {
      GetDraftRequest request =
          GetDraftRequest.newBuilder()
              .setName(
                  DraftName.of("[PROJECT]", "[LOCATION]", "[APPLICATION]", "[DRAFT]").toString())
              .build();
      ApiFuture<Draft> future = appPlatformClient.getDraftCallable().futureCall(request);
      // Do something.
      Draft response = future.get();
    }
  }
}
// [END visionai_v1_generated_AppPlatform_GetDraft_async]
