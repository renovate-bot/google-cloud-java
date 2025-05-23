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

package com.google.api.serviceusage.v1.samples;

// [START serviceusage_v1_generated_ServiceUsage_BatchEnableServices_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.serviceusage.v1.BatchEnableServicesRequest;
import com.google.api.serviceusage.v1.BatchEnableServicesResponse;
import com.google.api.serviceusage.v1.OperationMetadata;
import com.google.api.serviceusage.v1.ServiceUsageClient;
import java.util.ArrayList;

public class AsyncBatchEnableServicesLRO {

  public static void main(String[] args) throws Exception {
    asyncBatchEnableServicesLRO();
  }

  public static void asyncBatchEnableServicesLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ServiceUsageClient serviceUsageClient = ServiceUsageClient.create()) {
      BatchEnableServicesRequest request =
          BatchEnableServicesRequest.newBuilder()
              .setParent("parent-995424086")
              .addAllServiceIds(new ArrayList<String>())
              .build();
      OperationFuture<BatchEnableServicesResponse, OperationMetadata> future =
          serviceUsageClient.batchEnableServicesOperationCallable().futureCall(request);
      // Do something.
      BatchEnableServicesResponse response = future.get();
    }
  }
}
// [END serviceusage_v1_generated_ServiceUsage_BatchEnableServices_LRO_async]
