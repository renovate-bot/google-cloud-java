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

package com.google.cloud.talent.v4.samples;

// [START jobs_v4_generated_CompanyService_ListCompanies_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.talent.v4.Company;
import com.google.cloud.talent.v4.CompanyServiceClient;
import com.google.cloud.talent.v4.ListCompaniesRequest;
import com.google.cloud.talent.v4.TenantName;

public class AsyncListCompanies {

  public static void main(String[] args) throws Exception {
    asyncListCompanies();
  }

  public static void asyncListCompanies() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
      ListCompaniesRequest request =
          ListCompaniesRequest.newBuilder()
              .setParent(TenantName.of("[PROJECT]", "[TENANT]").toString())
              .setPageToken("pageToken873572522")
              .setPageSize(883849137)
              .setRequireOpenJobs(true)
              .build();
      ApiFuture<Company> future =
          companyServiceClient.listCompaniesPagedCallable().futureCall(request);
      // Do something.
      for (Company element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END jobs_v4_generated_CompanyService_ListCompanies_async]
