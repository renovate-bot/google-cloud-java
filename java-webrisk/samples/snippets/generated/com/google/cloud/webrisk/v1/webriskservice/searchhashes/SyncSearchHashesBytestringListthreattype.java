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

package com.google.cloud.webrisk.v1.samples;

// [START webrisk_v1_generated_WebRiskService_SearchHashes_BytestringListthreattype_sync]
import com.google.cloud.webrisk.v1.WebRiskServiceClient;
import com.google.protobuf.ByteString;
import com.google.webrisk.v1.SearchHashesResponse;
import com.google.webrisk.v1.ThreatType;
import java.util.ArrayList;
import java.util.List;

public class SyncSearchHashesBytestringListthreattype {

  public static void main(String[] args) throws Exception {
    syncSearchHashesBytestringListthreattype();
  }

  public static void syncSearchHashesBytestringListthreattype() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (WebRiskServiceClient webRiskServiceClient = WebRiskServiceClient.create()) {
      ByteString hashPrefix = ByteString.EMPTY;
      List<ThreatType> threatTypes = new ArrayList<>();
      SearchHashesResponse response = webRiskServiceClient.searchHashes(hashPrefix, threatTypes);
    }
  }
}
// [END webrisk_v1_generated_WebRiskService_SearchHashes_BytestringListthreattype_sync]
