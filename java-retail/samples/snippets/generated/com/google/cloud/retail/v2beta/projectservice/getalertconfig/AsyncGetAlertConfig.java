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

package com.google.cloud.retail.v2beta.samples;

// [START retail_v2beta_generated_ProjectService_GetAlertConfig_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.retail.v2beta.AlertConfig;
import com.google.cloud.retail.v2beta.AlertConfigName;
import com.google.cloud.retail.v2beta.GetAlertConfigRequest;
import com.google.cloud.retail.v2beta.ProjectServiceClient;

public class AsyncGetAlertConfig {

  public static void main(String[] args) throws Exception {
    asyncGetAlertConfig();
  }

  public static void asyncGetAlertConfig() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ProjectServiceClient projectServiceClient = ProjectServiceClient.create()) {
      GetAlertConfigRequest request =
          GetAlertConfigRequest.newBuilder()
              .setName(AlertConfigName.of("[PROJECT]").toString())
              .build();
      ApiFuture<AlertConfig> future =
          projectServiceClient.getAlertConfigCallable().futureCall(request);
      // Do something.
      AlertConfig response = future.get();
    }
  }
}
// [END retail_v2beta_generated_ProjectService_GetAlertConfig_async]
