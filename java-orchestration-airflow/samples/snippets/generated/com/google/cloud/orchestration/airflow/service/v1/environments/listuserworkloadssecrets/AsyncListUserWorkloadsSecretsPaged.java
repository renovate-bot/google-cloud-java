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

package com.google.cloud.orchestration.airflow.service.v1.samples;

// [START composer_v1_generated_Environments_ListUserWorkloadsSecrets_Paged_async]
import com.google.cloud.orchestration.airflow.service.v1.EnvironmentName;
import com.google.cloud.orchestration.airflow.service.v1.EnvironmentsClient;
import com.google.cloud.orchestration.airflow.service.v1.ListUserWorkloadsSecretsRequest;
import com.google.cloud.orchestration.airflow.service.v1.ListUserWorkloadsSecretsResponse;
import com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsSecret;
import com.google.common.base.Strings;

public class AsyncListUserWorkloadsSecretsPaged {

  public static void main(String[] args) throws Exception {
    asyncListUserWorkloadsSecretsPaged();
  }

  public static void asyncListUserWorkloadsSecretsPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
      ListUserWorkloadsSecretsRequest request =
          ListUserWorkloadsSecretsRequest.newBuilder()
              .setParent(EnvironmentName.of("[PROJECT]", "[LOCATION]", "[ENVIRONMENT]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListUserWorkloadsSecretsResponse response =
            environmentsClient.listUserWorkloadsSecretsCallable().call(request);
        for (UserWorkloadsSecret element : response.getUserWorkloadsSecretsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END composer_v1_generated_Environments_ListUserWorkloadsSecrets_Paged_async]
