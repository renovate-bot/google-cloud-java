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

package com.google.cloud.telcoautomation.v1.samples;

// [START telcoautomation_v1_generated_TelcoAutomation_ListBlueprints_String_sync]
import com.google.cloud.telcoautomation.v1.Blueprint;
import com.google.cloud.telcoautomation.v1.OrchestrationClusterName;
import com.google.cloud.telcoautomation.v1.TelcoAutomationClient;

public class SyncListBlueprintsString {

  public static void main(String[] args) throws Exception {
    syncListBlueprintsString();
  }

  public static void syncListBlueprintsString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TelcoAutomationClient telcoAutomationClient = TelcoAutomationClient.create()) {
      String parent =
          OrchestrationClusterName.of("[PROJECT]", "[LOCATION]", "[ORCHESTRATION_CLUSTER]")
              .toString();
      for (Blueprint element : telcoAutomationClient.listBlueprints(parent).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END telcoautomation_v1_generated_TelcoAutomation_ListBlueprints_String_sync]
