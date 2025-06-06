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

package com.google.cloud.apigeeregistry.v1.samples;

// [START apigeeregistry_v1_generated_Registry_CreateApiVersion_ApinameApiversionString_sync]
import com.google.cloud.apigeeregistry.v1.ApiName;
import com.google.cloud.apigeeregistry.v1.ApiVersion;
import com.google.cloud.apigeeregistry.v1.RegistryClient;

public class SyncCreateApiVersionApinameApiversionString {

  public static void main(String[] args) throws Exception {
    syncCreateApiVersionApinameApiversionString();
  }

  public static void syncCreateApiVersionApinameApiversionString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (RegistryClient registryClient = RegistryClient.create()) {
      ApiName parent = ApiName.of("[PROJECT]", "[LOCATION]", "[API]");
      ApiVersion apiVersion = ApiVersion.newBuilder().build();
      String apiVersionId = "apiVersionId1678816025";
      ApiVersion response = registryClient.createApiVersion(parent, apiVersion, apiVersionId);
    }
  }
}
// [END apigeeregistry_v1_generated_Registry_CreateApiVersion_ApinameApiversionString_sync]
