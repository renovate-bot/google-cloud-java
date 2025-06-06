/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/alloydb/v1beta/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.alloydb.v1beta;

public interface PromoteClusterStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1beta.PromoteClusterStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The current state of the promoted secondary's database.
   * Once the operation is complete, the final state of the database in the
   * LRO can be one of:
   *   1. PROMOTE_CLUSTER_AVAILABLE_FOR_READ, indicating that the promote
   *   operation has failed mid-way, the database is still only available for
   *   read.
   *   2. PROMOTE_CLUSTER_COMPLETED, indicating that a promote operation
   *   completed successfully. The database is available for both read and write
   *   requests
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.PromoteClusterStatus.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the promoted secondary's database.
   * Once the operation is complete, the final state of the database in the
   * LRO can be one of:
   *   1. PROMOTE_CLUSTER_AVAILABLE_FOR_READ, indicating that the promote
   *   operation has failed mid-way, the database is still only available for
   *   read.
   *   2. PROMOTE_CLUSTER_COMPLETED, indicating that a promote operation
   *   completed successfully. The database is available for both read and write
   *   requests
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.PromoteClusterStatus.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.alloydb.v1beta.PromoteClusterStatus.State getState();
}
