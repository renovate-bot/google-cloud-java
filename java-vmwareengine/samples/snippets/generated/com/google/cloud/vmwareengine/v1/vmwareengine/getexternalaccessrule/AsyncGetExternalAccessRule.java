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

package com.google.cloud.vmwareengine.v1.samples;

// [START vmwareengine_v1_generated_VmwareEngine_GetExternalAccessRule_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.vmwareengine.v1.ExternalAccessRule;
import com.google.cloud.vmwareengine.v1.ExternalAccessRuleName;
import com.google.cloud.vmwareengine.v1.GetExternalAccessRuleRequest;
import com.google.cloud.vmwareengine.v1.VmwareEngineClient;

public class AsyncGetExternalAccessRule {

  public static void main(String[] args) throws Exception {
    asyncGetExternalAccessRule();
  }

  public static void asyncGetExternalAccessRule() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (VmwareEngineClient vmwareEngineClient = VmwareEngineClient.create()) {
      GetExternalAccessRuleRequest request =
          GetExternalAccessRuleRequest.newBuilder()
              .setName(
                  ExternalAccessRuleName.of(
                          "[PROJECT]", "[LOCATION]", "[NETWORK_POLICY]", "[EXTERNAL_ACCESS_RULE]")
                      .toString())
              .build();
      ApiFuture<ExternalAccessRule> future =
          vmwareEngineClient.getExternalAccessRuleCallable().futureCall(request);
      // Do something.
      ExternalAccessRule response = future.get();
    }
  }
}
// [END vmwareengine_v1_generated_VmwareEngine_GetExternalAccessRule_async]
