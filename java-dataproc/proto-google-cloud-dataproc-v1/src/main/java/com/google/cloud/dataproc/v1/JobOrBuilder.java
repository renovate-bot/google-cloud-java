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

public interface JobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.Job)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The fully qualified reference to the job, which can be used to
   * obtain the equivalent REST path of the job resource. If this property
   * is not specified when a job is created, the server generates a
   * &lt;code&gt;job_id&lt;/code&gt;.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobReference reference = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the reference field is set.
   */
  boolean hasReference();

  /**
   *
   *
   * <pre>
   * Optional. The fully qualified reference to the job, which can be used to
   * obtain the equivalent REST path of the job resource. If this property
   * is not specified when a job is created, the server generates a
   * &lt;code&gt;job_id&lt;/code&gt;.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobReference reference = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The reference.
   */
  com.google.cloud.dataproc.v1.JobReference getReference();

  /**
   *
   *
   * <pre>
   * Optional. The fully qualified reference to the job, which can be used to
   * obtain the equivalent REST path of the job resource. If this property
   * is not specified when a job is created, the server generates a
   * &lt;code&gt;job_id&lt;/code&gt;.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobReference reference = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.JobReferenceOrBuilder getReferenceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Job information, including how, when, and where to
   * run the job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobPlacement placement = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the placement field is set.
   */
  boolean hasPlacement();

  /**
   *
   *
   * <pre>
   * Required. Job information, including how, when, and where to
   * run the job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobPlacement placement = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The placement.
   */
  com.google.cloud.dataproc.v1.JobPlacement getPlacement();

  /**
   *
   *
   * <pre>
   * Required. Job information, including how, when, and where to
   * run the job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobPlacement placement = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataproc.v1.JobPlacementOrBuilder getPlacementOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Hadoop job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.HadoopJob hadoop_job = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the hadoopJob field is set.
   */
  boolean hasHadoopJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Hadoop job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.HadoopJob hadoop_job = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The hadoopJob.
   */
  com.google.cloud.dataproc.v1.HadoopJob getHadoopJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Hadoop job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.HadoopJob hadoop_job = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.HadoopJobOrBuilder getHadoopJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Spark job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkJob spark_job = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sparkJob field is set.
   */
  boolean hasSparkJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Spark job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkJob spark_job = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sparkJob.
   */
  com.google.cloud.dataproc.v1.SparkJob getSparkJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Spark job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkJob spark_job = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.SparkJobOrBuilder getSparkJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Job is a PySpark job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.PySparkJob pyspark_job = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the pysparkJob field is set.
   */
  boolean hasPysparkJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a PySpark job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.PySparkJob pyspark_job = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The pysparkJob.
   */
  com.google.cloud.dataproc.v1.PySparkJob getPysparkJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a PySpark job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.PySparkJob pyspark_job = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.PySparkJobOrBuilder getPysparkJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Hive job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.HiveJob hive_job = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the hiveJob field is set.
   */
  boolean hasHiveJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Hive job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.HiveJob hive_job = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The hiveJob.
   */
  com.google.cloud.dataproc.v1.HiveJob getHiveJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Hive job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.HiveJob hive_job = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.HiveJobOrBuilder getHiveJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Pig job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.PigJob pig_job = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the pigJob field is set.
   */
  boolean hasPigJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Pig job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.PigJob pig_job = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The pigJob.
   */
  com.google.cloud.dataproc.v1.PigJob getPigJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Pig job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.PigJob pig_job = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.PigJobOrBuilder getPigJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Job is a SparkR job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkRJob spark_r_job = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sparkRJob field is set.
   */
  boolean hasSparkRJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a SparkR job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkRJob spark_r_job = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sparkRJob.
   */
  com.google.cloud.dataproc.v1.SparkRJob getSparkRJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a SparkR job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkRJob spark_r_job = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.SparkRJobOrBuilder getSparkRJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Job is a SparkSql job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkSqlJob spark_sql_job = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sparkSqlJob field is set.
   */
  boolean hasSparkSqlJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a SparkSql job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkSqlJob spark_sql_job = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sparkSqlJob.
   */
  com.google.cloud.dataproc.v1.SparkSqlJob getSparkSqlJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a SparkSql job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkSqlJob spark_sql_job = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.SparkSqlJobOrBuilder getSparkSqlJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Presto job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.PrestoJob presto_job = 23 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the prestoJob field is set.
   */
  boolean hasPrestoJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Presto job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.PrestoJob presto_job = 23 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The prestoJob.
   */
  com.google.cloud.dataproc.v1.PrestoJob getPrestoJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Presto job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.PrestoJob presto_job = 23 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.PrestoJobOrBuilder getPrestoJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Trino job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.TrinoJob trino_job = 28 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the trinoJob field is set.
   */
  boolean hasTrinoJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Trino job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.TrinoJob trino_job = 28 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The trinoJob.
   */
  com.google.cloud.dataproc.v1.TrinoJob getTrinoJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Trino job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.TrinoJob trino_job = 28 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.TrinoJobOrBuilder getTrinoJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Flink job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.FlinkJob flink_job = 29 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the flinkJob field is set.
   */
  boolean hasFlinkJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Flink job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.FlinkJob flink_job = 29 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The flinkJob.
   */
  com.google.cloud.dataproc.v1.FlinkJob getFlinkJob();

  /**
   *
   *
   * <pre>
   * Optional. Job is a Flink job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.FlinkJob flink_job = 29 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.FlinkJobOrBuilder getFlinkJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The job status. Additional application-specific
   * status information might be contained in the &lt;code&gt;type_job&lt;/code&gt;
   * and &lt;code&gt;yarn_applications&lt;/code&gt; fields.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobStatus status = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();

  /**
   *
   *
   * <pre>
   * Output only. The job status. Additional application-specific
   * status information might be contained in the &lt;code&gt;type_job&lt;/code&gt;
   * and &lt;code&gt;yarn_applications&lt;/code&gt; fields.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobStatus status = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The status.
   */
  com.google.cloud.dataproc.v1.JobStatus getStatus();

  /**
   *
   *
   * <pre>
   * Output only. The job status. Additional application-specific
   * status information might be contained in the &lt;code&gt;type_job&lt;/code&gt;
   * and &lt;code&gt;yarn_applications&lt;/code&gt; fields.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobStatus status = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.JobStatusOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The previous job status.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.JobStatus status_history = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.dataproc.v1.JobStatus> getStatusHistoryList();

  /**
   *
   *
   * <pre>
   * Output only. The previous job status.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.JobStatus status_history = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.JobStatus getStatusHistory(int index);

  /**
   *
   *
   * <pre>
   * Output only. The previous job status.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.JobStatus status_history = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getStatusHistoryCount();

  /**
   *
   *
   * <pre>
   * Output only. The previous job status.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.JobStatus status_history = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.JobStatusOrBuilder>
      getStatusHistoryOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. The previous job status.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.JobStatus status_history = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.JobStatusOrBuilder getStatusHistoryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The collection of YARN applications spun up by this job.
   *
   * **Beta** Feature: This report is available for testing purposes only. It
   * might be changed before final release.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.YarnApplication yarn_applications = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.dataproc.v1.YarnApplication> getYarnApplicationsList();

  /**
   *
   *
   * <pre>
   * Output only. The collection of YARN applications spun up by this job.
   *
   * **Beta** Feature: This report is available for testing purposes only. It
   * might be changed before final release.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.YarnApplication yarn_applications = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.YarnApplication getYarnApplications(int index);

  /**
   *
   *
   * <pre>
   * Output only. The collection of YARN applications spun up by this job.
   *
   * **Beta** Feature: This report is available for testing purposes only. It
   * might be changed before final release.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.YarnApplication yarn_applications = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getYarnApplicationsCount();

  /**
   *
   *
   * <pre>
   * Output only. The collection of YARN applications spun up by this job.
   *
   * **Beta** Feature: This report is available for testing purposes only. It
   * might be changed before final release.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.YarnApplication yarn_applications = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.YarnApplicationOrBuilder>
      getYarnApplicationsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. The collection of YARN applications spun up by this job.
   *
   * **Beta** Feature: This report is available for testing purposes only. It
   * might be changed before final release.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.YarnApplication yarn_applications = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.YarnApplicationOrBuilder getYarnApplicationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. A URI pointing to the location of the stdout of the job's
   * driver program.
   * </pre>
   *
   * <code>string driver_output_resource_uri = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The driverOutputResourceUri.
   */
  java.lang.String getDriverOutputResourceUri();

  /**
   *
   *
   * <pre>
   * Output only. A URI pointing to the location of the stdout of the job's
   * driver program.
   * </pre>
   *
   * <code>string driver_output_resource_uri = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for driverOutputResourceUri.
   */
  com.google.protobuf.ByteString getDriverOutputResourceUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. If present, the location of miscellaneous control files
   * which can be used as part of job setup and handling. If not present,
   * control files might be placed in the same location as `driver_output_uri`.
   * </pre>
   *
   * <code>string driver_control_files_uri = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The driverControlFilesUri.
   */
  java.lang.String getDriverControlFilesUri();

  /**
   *
   *
   * <pre>
   * Output only. If present, the location of miscellaneous control files
   * which can be used as part of job setup and handling. If not present,
   * control files might be placed in the same location as `driver_output_uri`.
   * </pre>
   *
   * <code>string driver_control_files_uri = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for driverControlFilesUri.
   */
  com.google.protobuf.ByteString getDriverControlFilesUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** can be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** can be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** can be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** can be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** can be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Job scheduling configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobScheduling scheduling = 20 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the scheduling field is set.
   */
  boolean hasScheduling();

  /**
   *
   *
   * <pre>
   * Optional. Job scheduling configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobScheduling scheduling = 20 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The scheduling.
   */
  com.google.cloud.dataproc.v1.JobScheduling getScheduling();

  /**
   *
   *
   * <pre>
   * Optional. Job scheduling configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobScheduling scheduling = 20 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.JobSchedulingOrBuilder getSchedulingOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A UUID that uniquely identifies a job within the project
   * over time. This is in contrast to a user-settable reference.job_id that
   * might be reused over time.
   * </pre>
   *
   * <code>string job_uuid = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The jobUuid.
   */
  java.lang.String getJobUuid();

  /**
   *
   *
   * <pre>
   * Output only. A UUID that uniquely identifies a job within the project
   * over time. This is in contrast to a user-settable reference.job_id that
   * might be reused over time.
   * </pre>
   *
   * <code>string job_uuid = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for jobUuid.
   */
  com.google.protobuf.ByteString getJobUuidBytes();

  /**
   *
   *
   * <pre>
   * Output only. Indicates whether the job is completed. If the value is
   * `false`, the job is still in progress. If `true`, the job is completed, and
   * `status.state` field will indicate if it was successful, failed,
   * or cancelled.
   * </pre>
   *
   * <code>bool done = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The done.
   */
  boolean getDone();

  /**
   *
   *
   * <pre>
   * Optional. Driver scheduling configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.DriverSchedulingConfig driver_scheduling_config = 27 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the driverSchedulingConfig field is set.
   */
  boolean hasDriverSchedulingConfig();

  /**
   *
   *
   * <pre>
   * Optional. Driver scheduling configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.DriverSchedulingConfig driver_scheduling_config = 27 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The driverSchedulingConfig.
   */
  com.google.cloud.dataproc.v1.DriverSchedulingConfig getDriverSchedulingConfig();

  /**
   *
   *
   * <pre>
   * Optional. Driver scheduling configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.DriverSchedulingConfig driver_scheduling_config = 27 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.DriverSchedulingConfigOrBuilder getDriverSchedulingConfigOrBuilder();

  com.google.cloud.dataproc.v1.Job.TypeJobCase getTypeJobCase();
}
