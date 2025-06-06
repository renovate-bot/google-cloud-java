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
// source: google/dataflow/v1beta3/templates.proto

// Protobuf Java Version: 3.25.8
package com.google.dataflow.v1beta3;

public interface CreateJobFromTemplateRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.CreateJobFromTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The ID of the Cloud Platform project that the job belongs to.
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
   * Required. The ID of the Cloud Platform project that the job belongs to.
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
   * Required. The job name to use for the created job.
   * </pre>
   *
   * <code>string job_name = 4;</code>
   *
   * @return The jobName.
   */
  java.lang.String getJobName();

  /**
   *
   *
   * <pre>
   * Required. The job name to use for the created job.
   * </pre>
   *
   * <code>string job_name = 4;</code>
   *
   * @return The bytes for jobName.
   */
  com.google.protobuf.ByteString getJobNameBytes();

  /**
   *
   *
   * <pre>
   * Required. A Cloud Storage path to the template from which to
   * create the job.
   * Must be a valid Cloud Storage URL, beginning with `gs://`.
   * </pre>
   *
   * <code>string gcs_path = 2;</code>
   *
   * @return Whether the gcsPath field is set.
   */
  boolean hasGcsPath();

  /**
   *
   *
   * <pre>
   * Required. A Cloud Storage path to the template from which to
   * create the job.
   * Must be a valid Cloud Storage URL, beginning with `gs://`.
   * </pre>
   *
   * <code>string gcs_path = 2;</code>
   *
   * @return The gcsPath.
   */
  java.lang.String getGcsPath();

  /**
   *
   *
   * <pre>
   * Required. A Cloud Storage path to the template from which to
   * create the job.
   * Must be a valid Cloud Storage URL, beginning with `gs://`.
   * </pre>
   *
   * <code>string gcs_path = 2;</code>
   *
   * @return The bytes for gcsPath.
   */
  com.google.protobuf.ByteString getGcsPathBytes();

  /**
   *
   *
   * <pre>
   * The runtime parameters to pass to the job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 3;</code>
   */
  int getParametersCount();

  /**
   *
   *
   * <pre>
   * The runtime parameters to pass to the job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 3;</code>
   */
  boolean containsParameters(java.lang.String key);

  /** Use {@link #getParametersMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getParameters();

  /**
   *
   *
   * <pre>
   * The runtime parameters to pass to the job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getParametersMap();

  /**
   *
   *
   * <pre>
   * The runtime parameters to pass to the job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 3;</code>
   */
  /* nullable */
  java.lang.String getParametersOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * The runtime parameters to pass to the job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 3;</code>
   */
  java.lang.String getParametersOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The runtime environment for the job.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.RuntimeEnvironment environment = 5;</code>
   *
   * @return Whether the environment field is set.
   */
  boolean hasEnvironment();

  /**
   *
   *
   * <pre>
   * The runtime environment for the job.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.RuntimeEnvironment environment = 5;</code>
   *
   * @return The environment.
   */
  com.google.dataflow.v1beta3.RuntimeEnvironment getEnvironment();

  /**
   *
   *
   * <pre>
   * The runtime environment for the job.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.RuntimeEnvironment environment = 5;</code>
   */
  com.google.dataflow.v1beta3.RuntimeEnvironmentOrBuilder getEnvironmentOrBuilder();

  /**
   *
   *
   * <pre>
   * The [regional endpoint]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to
   * which to direct the request.
   * </pre>
   *
   * <code>string location = 6;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();

  /**
   *
   *
   * <pre>
   * The [regional endpoint]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to
   * which to direct the request.
   * </pre>
   *
   * <code>string location = 6;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  com.google.dataflow.v1beta3.CreateJobFromTemplateRequest.TemplateCase getTemplateCase();
}
