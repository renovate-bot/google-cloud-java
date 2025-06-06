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
// source: google/dataflow/v1beta3/metrics.proto

// Protobuf Java Version: 3.25.8
package com.google.dataflow.v1beta3;

public interface GetStageExecutionDetailsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.GetStageExecutionDetailsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A project id.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();

  /**
   *
   *
   * <pre>
   * A project id.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * The job to get execution details for.
   * </pre>
   *
   * <code>string job_id = 2;</code>
   *
   * @return The jobId.
   */
  java.lang.String getJobId();

  /**
   *
   *
   * <pre>
   * The job to get execution details for.
   * </pre>
   *
   * <code>string job_id = 2;</code>
   *
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString getJobIdBytes();

  /**
   *
   *
   * <pre>
   * The [regional endpoint]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
   * contains the job specified by job_id.
   * </pre>
   *
   * <code>string location = 3;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();

  /**
   *
   *
   * <pre>
   * The [regional endpoint]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
   * contains the job specified by job_id.
   * </pre>
   *
   * <code>string location = 3;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * The stage for which to fetch information.
   * </pre>
   *
   * <code>string stage_id = 4;</code>
   *
   * @return The stageId.
   */
  java.lang.String getStageId();

  /**
   *
   *
   * <pre>
   * The stage for which to fetch information.
   * </pre>
   *
   * <code>string stage_id = 4;</code>
   *
   * @return The bytes for stageId.
   */
  com.google.protobuf.ByteString getStageIdBytes();

  /**
   *
   *
   * <pre>
   * If specified, determines the maximum number of work items to
   * return.  If unspecified, the service may choose an appropriate
   * default, or may return an arbitrarily large number of results.
   * </pre>
   *
   * <code>int32 page_size = 5;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * If supplied, this should be the value of next_page_token returned
   * by an earlier call. This will cause the next page of results to
   * be returned.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();

  /**
   *
   *
   * <pre>
   * If supplied, this should be the value of next_page_token returned
   * by an earlier call. This will cause the next page of results to
   * be returned.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Lower time bound of work items to include, by start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * Lower time bound of work items to include, by start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   *
   *
   * <pre>
   * Lower time bound of work items to include, by start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Upper time bound of work items to include, by start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * Upper time bound of work items to include, by start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   *
   *
   * <pre>
   * Upper time bound of work items to include, by start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
