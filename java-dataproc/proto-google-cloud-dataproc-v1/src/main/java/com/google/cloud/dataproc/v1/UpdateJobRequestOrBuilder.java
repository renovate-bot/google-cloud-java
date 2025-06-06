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
// source: google/cloud/dataproc/v1/jobs.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataproc.v1;

public interface UpdateJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.UpdateJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the job
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();

  /**
   *
   *
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the job
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();

  /**
   *
   *
   * <pre>
   * Required. The Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * Required. The job ID.
   * </pre>
   *
   * <code>string job_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The jobId.
   */
  java.lang.String getJobId();

  /**
   *
   *
   * <pre>
   * Required. The job ID.
   * </pre>
   *
   * <code>string job_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString getJobIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The changes to the job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.Job job = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the job field is set.
   */
  boolean hasJob();

  /**
   *
   *
   * <pre>
   * Required. The changes to the job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.Job job = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The job.
   */
  com.google.cloud.dataproc.v1.Job getJob();

  /**
   *
   *
   * <pre>
   * Required. The changes to the job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.Job job = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dataproc.v1.JobOrBuilder getJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Specifies the path, relative to &lt;code&gt;Job&lt;/code&gt;, of
   * the field to update. For example, to update the labels of a Job the
   * &lt;code&gt;update_mask&lt;/code&gt; parameter would be specified as
   * &lt;code&gt;labels&lt;/code&gt;, and the `PATCH` request body would specify the new
   * value. &lt;strong&gt;Note:&lt;/strong&gt; Currently, &lt;code&gt;labels&lt;/code&gt; is the only
   * field that can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * Required. Specifies the path, relative to &lt;code&gt;Job&lt;/code&gt;, of
   * the field to update. For example, to update the labels of a Job the
   * &lt;code&gt;update_mask&lt;/code&gt; parameter would be specified as
   * &lt;code&gt;labels&lt;/code&gt;, and the `PATCH` request body would specify the new
   * value. &lt;strong&gt;Note:&lt;/strong&gt; Currently, &lt;code&gt;labels&lt;/code&gt; is the only
   * field that can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * Required. Specifies the path, relative to &lt;code&gt;Job&lt;/code&gt;, of
   * the field to update. For example, to update the labels of a Job the
   * &lt;code&gt;update_mask&lt;/code&gt; parameter would be specified as
   * &lt;code&gt;labels&lt;/code&gt;, and the `PATCH` request body would specify the new
   * value. &lt;strong&gt;Note:&lt;/strong&gt; Currently, &lt;code&gt;labels&lt;/code&gt; is the only
   * field that can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
