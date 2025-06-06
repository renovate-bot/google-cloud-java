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

package com.google.cloud.resourcemanager.v3.samples;

// [START cloudresourcemanager_v3_generated_TagValues_DeleteTagValue_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.resourcemanager.v3.DeleteTagValueRequest;
import com.google.cloud.resourcemanager.v3.TagValueName;
import com.google.cloud.resourcemanager.v3.TagValuesClient;
import com.google.longrunning.Operation;

public class AsyncDeleteTagValue {

  public static void main(String[] args) throws Exception {
    asyncDeleteTagValue();
  }

  public static void asyncDeleteTagValue() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TagValuesClient tagValuesClient = TagValuesClient.create()) {
      DeleteTagValueRequest request =
          DeleteTagValueRequest.newBuilder()
              .setName(TagValueName.of("[TAG_VALUE]").toString())
              .setValidateOnly(true)
              .setEtag("etag3123477")
              .build();
      ApiFuture<Operation> future = tagValuesClient.deleteTagValueCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END cloudresourcemanager_v3_generated_TagValues_DeleteTagValue_async]
