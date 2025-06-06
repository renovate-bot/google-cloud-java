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

package com.google.cloud.dataform.v1.samples;

// [START dataform_v1_generated_Dataform_QueryCompilationResultActions_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dataform.v1.CompilationResultAction;
import com.google.cloud.dataform.v1.CompilationResultName;
import com.google.cloud.dataform.v1.DataformClient;
import com.google.cloud.dataform.v1.QueryCompilationResultActionsRequest;

public class AsyncQueryCompilationResultActions {

  public static void main(String[] args) throws Exception {
    asyncQueryCompilationResultActions();
  }

  public static void asyncQueryCompilationResultActions() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataformClient dataformClient = DataformClient.create()) {
      QueryCompilationResultActionsRequest request =
          QueryCompilationResultActionsRequest.newBuilder()
              .setName(
                  CompilationResultName.of(
                          "[PROJECT]", "[LOCATION]", "[REPOSITORY]", "[COMPILATION_RESULT]")
                      .toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .build();
      ApiFuture<CompilationResultAction> future =
          dataformClient.queryCompilationResultActionsPagedCallable().futureCall(request);
      // Do something.
      for (CompilationResultAction element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END dataform_v1_generated_Dataform_QueryCompilationResultActions_async]
