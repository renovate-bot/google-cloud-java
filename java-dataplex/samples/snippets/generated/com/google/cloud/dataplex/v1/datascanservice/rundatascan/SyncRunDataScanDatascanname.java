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

package com.google.cloud.dataplex.v1.samples;

// [START dataplex_v1_generated_DataScanService_RunDataScan_Datascanname_sync]
import com.google.cloud.dataplex.v1.DataScanName;
import com.google.cloud.dataplex.v1.DataScanServiceClient;
import com.google.cloud.dataplex.v1.RunDataScanResponse;

public class SyncRunDataScanDatascanname {

  public static void main(String[] args) throws Exception {
    syncRunDataScanDatascanname();
  }

  public static void syncRunDataScanDatascanname() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataScanServiceClient dataScanServiceClient = DataScanServiceClient.create()) {
      DataScanName name = DataScanName.of("[PROJECT]", "[LOCATION]", "[DATASCAN]");
      RunDataScanResponse response = dataScanServiceClient.runDataScan(name);
    }
  }
}
// [END dataplex_v1_generated_DataScanService_RunDataScan_Datascanname_sync]
