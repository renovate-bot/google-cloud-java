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

package com.google.cloud.visionai.v1.samples;

// [START visionai_v1_generated_StreamingService_AcquireLease_sync]
import com.google.cloud.visionai.v1.AcquireLeaseRequest;
import com.google.cloud.visionai.v1.Lease;
import com.google.cloud.visionai.v1.LeaseType;
import com.google.cloud.visionai.v1.StreamingServiceClient;
import com.google.protobuf.Duration;

public class SyncAcquireLease {

  public static void main(String[] args) throws Exception {
    syncAcquireLease();
  }

  public static void syncAcquireLease() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (StreamingServiceClient streamingServiceClient = StreamingServiceClient.create()) {
      AcquireLeaseRequest request =
          AcquireLeaseRequest.newBuilder()
              .setSeries("series-905838985")
              .setOwner("owner106164915")
              .setTerm(Duration.newBuilder().build())
              .setLeaseType(LeaseType.forNumber(0))
              .build();
      Lease response = streamingServiceClient.acquireLease(request);
    }
  }
}
// [END visionai_v1_generated_StreamingService_AcquireLease_sync]
