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

package com.google.cloud.recommendationengine.v1beta1.samples;

// [START recommendationengine_v1beta1_generated_UserEventService_ImportUserEvents_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.recommendationengine.v1beta1.EventStoreName;
import com.google.cloud.recommendationengine.v1beta1.ImportErrorsConfig;
import com.google.cloud.recommendationengine.v1beta1.ImportUserEventsRequest;
import com.google.cloud.recommendationengine.v1beta1.InputConfig;
import com.google.cloud.recommendationengine.v1beta1.UserEventServiceClient;
import com.google.longrunning.Operation;

public class AsyncImportUserEvents {

  public static void main(String[] args) throws Exception {
    asyncImportUserEvents();
  }

  public static void asyncImportUserEvents() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (UserEventServiceClient userEventServiceClient = UserEventServiceClient.create()) {
      ImportUserEventsRequest request =
          ImportUserEventsRequest.newBuilder()
              .setParent(
                  EventStoreName.of("[PROJECT]", "[LOCATION]", "[CATALOG]", "[EVENT_STORE]")
                      .toString())
              .setRequestId("requestId693933066")
              .setInputConfig(InputConfig.newBuilder().build())
              .setErrorsConfig(ImportErrorsConfig.newBuilder().build())
              .build();
      ApiFuture<Operation> future =
          userEventServiceClient.importUserEventsCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END recommendationengine_v1beta1_generated_UserEventService_ImportUserEvents_async]
