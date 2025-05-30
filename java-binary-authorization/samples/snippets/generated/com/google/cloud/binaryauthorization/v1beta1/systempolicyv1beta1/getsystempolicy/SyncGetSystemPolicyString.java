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

package com.google.cloud.binaryauthorization.v1beta1.samples;

// [START binaryauthorization_v1beta1_generated_SystemPolicyV1Beta1_GetSystemPolicy_String_sync]
import com.google.cloud.binaryauthorization.v1beta1.Policy;
import com.google.cloud.binaryauthorization.v1beta1.PolicyName;
import com.google.cloud.binaryauthorization.v1beta1.SystemPolicyV1Beta1Client;

public class SyncGetSystemPolicyString {

  public static void main(String[] args) throws Exception {
    syncGetSystemPolicyString();
  }

  public static void syncGetSystemPolicyString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (SystemPolicyV1Beta1Client systemPolicyV1Beta1Client = SystemPolicyV1Beta1Client.create()) {
      String name = PolicyName.ofProjectName("[PROJECT]").toString();
      Policy response = systemPolicyV1Beta1Client.getSystemPolicy(name);
    }
  }
}
// [END binaryauthorization_v1beta1_generated_SystemPolicyV1Beta1_GetSystemPolicy_String_sync]
