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

package com.google.identity.accesscontextmanager.v1.samples;

// [START accesscontextmanager_v1_generated_AccessContextManager_CreateGcpUserAccessBinding_StringGcpuseraccessbinding_sync]
import com.google.identity.accesscontextmanager.v1.AccessContextManagerClient;
import com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding;
import com.google.identity.accesscontextmanager.v1.OrganizationName;

public class SyncCreateGcpUserAccessBindingStringGcpuseraccessbinding {

  public static void main(String[] args) throws Exception {
    syncCreateGcpUserAccessBindingStringGcpuseraccessbinding();
  }

  public static void syncCreateGcpUserAccessBindingStringGcpuseraccessbinding() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AccessContextManagerClient accessContextManagerClient =
        AccessContextManagerClient.create()) {
      String parent = OrganizationName.of("[ORGANIZATION]").toString();
      GcpUserAccessBinding gcpUserAccessBinding = GcpUserAccessBinding.newBuilder().build();
      GcpUserAccessBinding response =
          accessContextManagerClient
              .createGcpUserAccessBindingAsync(parent, gcpUserAccessBinding)
              .get();
    }
  }
}
// [END accesscontextmanager_v1_generated_AccessContextManager_CreateGcpUserAccessBinding_StringGcpuseraccessbinding_sync]
