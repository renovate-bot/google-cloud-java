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

package com.google.api.cloudquotas.v1beta.samples;

// [START cloudquotas_v1beta_generated_CloudQuotas_CreateQuotaPreference_StringQuotapreferenceString_sync]
import com.google.api.cloudquotas.v1beta.CloudQuotasClient;
import com.google.api.cloudquotas.v1beta.LocationName;
import com.google.api.cloudquotas.v1beta.QuotaPreference;

public class SyncCreateQuotaPreferenceStringQuotapreferenceString {

  public static void main(String[] args) throws Exception {
    syncCreateQuotaPreferenceStringQuotapreferenceString();
  }

  public static void syncCreateQuotaPreferenceStringQuotapreferenceString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CloudQuotasClient cloudQuotasClient = CloudQuotasClient.create()) {
      String parent = LocationName.ofProjectLocationName("[PROJECT]", "[LOCATION]").toString();
      QuotaPreference quotaPreference = QuotaPreference.newBuilder().build();
      String quotaPreferenceId = "quotaPreferenceId-948332050";
      QuotaPreference response =
          cloudQuotasClient.createQuotaPreference(parent, quotaPreference, quotaPreferenceId);
    }
  }
}
// [END cloudquotas_v1beta_generated_CloudQuotas_CreateQuotaPreference_StringQuotapreferenceString_sync]
