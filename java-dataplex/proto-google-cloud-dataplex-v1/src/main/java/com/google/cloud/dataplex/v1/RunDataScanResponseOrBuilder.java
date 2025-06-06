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
// source: google/cloud/dataplex/v1/datascans.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataplex.v1;

public interface RunDataScanResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.RunDataScanResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * DataScanJob created by RunDataScan request.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanJob job = 1;</code>
   *
   * @return Whether the job field is set.
   */
  boolean hasJob();

  /**
   *
   *
   * <pre>
   * DataScanJob created by RunDataScan request.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanJob job = 1;</code>
   *
   * @return The job.
   */
  com.google.cloud.dataplex.v1.DataScanJob getJob();

  /**
   *
   *
   * <pre>
   * DataScanJob created by RunDataScan request.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanJob job = 1;</code>
   */
  com.google.cloud.dataplex.v1.DataScanJobOrBuilder getJobOrBuilder();
}
