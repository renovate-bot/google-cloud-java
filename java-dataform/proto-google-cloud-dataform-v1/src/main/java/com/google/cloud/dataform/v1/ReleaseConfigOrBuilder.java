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
// source: google/cloud/dataform/v1/dataform.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataform.v1;

public interface ReleaseConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1.ReleaseConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The release config's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. The release config's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Git commit/tag/branch name at which the repository should be
   * compiled. Must exist in the remote repository. Examples:
   * - a commit SHA: `12ade345`
   * - a tag: `tag1`
   * - a branch name: `branch1`
   * </pre>
   *
   * <code>string git_commitish = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The gitCommitish.
   */
  java.lang.String getGitCommitish();

  /**
   *
   *
   * <pre>
   * Required. Git commit/tag/branch name at which the repository should be
   * compiled. Must exist in the remote repository. Examples:
   * - a commit SHA: `12ade345`
   * - a tag: `tag1`
   * - a branch name: `branch1`
   * </pre>
   *
   * <code>string git_commitish = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for gitCommitish.
   */
  com.google.protobuf.ByteString getGitCommitishBytes();

  /**
   *
   *
   * <pre>
   * Optional. If set, fields of `code_compilation_config` override the default
   * compilation settings that are specified in dataform.json.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1.CodeCompilationConfig code_compilation_config = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the codeCompilationConfig field is set.
   */
  boolean hasCodeCompilationConfig();

  /**
   *
   *
   * <pre>
   * Optional. If set, fields of `code_compilation_config` override the default
   * compilation settings that are specified in dataform.json.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1.CodeCompilationConfig code_compilation_config = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The codeCompilationConfig.
   */
  com.google.cloud.dataform.v1.CodeCompilationConfig getCodeCompilationConfig();

  /**
   *
   *
   * <pre>
   * Optional. If set, fields of `code_compilation_config` override the default
   * compilation settings that are specified in dataform.json.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1.CodeCompilationConfig code_compilation_config = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataform.v1.CodeCompilationConfigOrBuilder getCodeCompilationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Optional schedule (in cron format) for automatic creation of
   * compilation results.
   * </pre>
   *
   * <code>string cron_schedule = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The cronSchedule.
   */
  java.lang.String getCronSchedule();

  /**
   *
   *
   * <pre>
   * Optional. Optional schedule (in cron format) for automatic creation of
   * compilation results.
   * </pre>
   *
   * <code>string cron_schedule = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for cronSchedule.
   */
  com.google.protobuf.ByteString getCronScheduleBytes();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the time zone to be used when interpreting
   * cron_schedule. Must be a time zone name from the time zone database
   * (https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). If left
   * unspecified, the default is UTC.
   * </pre>
   *
   * <code>string time_zone = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The timeZone.
   */
  java.lang.String getTimeZone();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the time zone to be used when interpreting
   * cron_schedule. Must be a time zone name from the time zone database
   * (https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). If left
   * unspecified, the default is UTC.
   * </pre>
   *
   * <code>string time_zone = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for timeZone.
   */
  com.google.protobuf.ByteString getTimeZoneBytes();

  /**
   *
   *
   * <pre>
   * Output only. Records of the 10 most recent scheduled release attempts,
   * ordered in descending order of `release_time`. Updated whenever automatic
   * creation of a compilation result is triggered by cron_schedule.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1.ReleaseConfig.ScheduledReleaseRecord recent_scheduled_release_records = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.dataform.v1.ReleaseConfig.ScheduledReleaseRecord>
      getRecentScheduledReleaseRecordsList();

  /**
   *
   *
   * <pre>
   * Output only. Records of the 10 most recent scheduled release attempts,
   * ordered in descending order of `release_time`. Updated whenever automatic
   * creation of a compilation result is triggered by cron_schedule.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1.ReleaseConfig.ScheduledReleaseRecord recent_scheduled_release_records = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataform.v1.ReleaseConfig.ScheduledReleaseRecord
      getRecentScheduledReleaseRecords(int index);

  /**
   *
   *
   * <pre>
   * Output only. Records of the 10 most recent scheduled release attempts,
   * ordered in descending order of `release_time`. Updated whenever automatic
   * creation of a compilation result is triggered by cron_schedule.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1.ReleaseConfig.ScheduledReleaseRecord recent_scheduled_release_records = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getRecentScheduledReleaseRecordsCount();

  /**
   *
   *
   * <pre>
   * Output only. Records of the 10 most recent scheduled release attempts,
   * ordered in descending order of `release_time`. Updated whenever automatic
   * creation of a compilation result is triggered by cron_schedule.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1.ReleaseConfig.ScheduledReleaseRecord recent_scheduled_release_records = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.dataform.v1.ReleaseConfig.ScheduledReleaseRecordOrBuilder>
      getRecentScheduledReleaseRecordsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. Records of the 10 most recent scheduled release attempts,
   * ordered in descending order of `release_time`. Updated whenever automatic
   * creation of a compilation result is triggered by cron_schedule.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1.ReleaseConfig.ScheduledReleaseRecord recent_scheduled_release_records = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataform.v1.ReleaseConfig.ScheduledReleaseRecordOrBuilder
      getRecentScheduledReleaseRecordsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The name of the currently released compilation result for this
   * release config. This value is updated when a compilation result is
   * automatically created from this release config (using cron_schedule), or
   * when this resource is updated by API call (perhaps to roll back to an
   * earlier release). The compilation result must have been created using this
   * release config. Must be in the format
   * `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;&#47;compilationResults/&#42;`.
   * </pre>
   *
   * <code>
   * string release_compilation_result = 6 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The releaseCompilationResult.
   */
  java.lang.String getReleaseCompilationResult();

  /**
   *
   *
   * <pre>
   * Optional. The name of the currently released compilation result for this
   * release config. This value is updated when a compilation result is
   * automatically created from this release config (using cron_schedule), or
   * when this resource is updated by API call (perhaps to roll back to an
   * earlier release). The compilation result must have been created using this
   * release config. Must be in the format
   * `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;&#47;compilationResults/&#42;`.
   * </pre>
   *
   * <code>
   * string release_compilation_result = 6 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for releaseCompilationResult.
   */
  com.google.protobuf.ByteString getReleaseCompilationResultBytes();

  /**
   *
   *
   * <pre>
   * Optional. Disables automatic creation of compilation results.
   * </pre>
   *
   * <code>bool disabled = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   *
   *
   * <pre>
   * Output only. All the metadata information that is used internally to serve
   * the resource. For example: timestamps, flags, status fields, etc. The
   * format of this field is a JSON string.
   * </pre>
   *
   * <code>optional string internal_metadata = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the internalMetadata field is set.
   */
  boolean hasInternalMetadata();

  /**
   *
   *
   * <pre>
   * Output only. All the metadata information that is used internally to serve
   * the resource. For example: timestamps, flags, status fields, etc. The
   * format of this field is a JSON string.
   * </pre>
   *
   * <code>optional string internal_metadata = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The internalMetadata.
   */
  java.lang.String getInternalMetadata();

  /**
   *
   *
   * <pre>
   * Output only. All the metadata information that is used internally to serve
   * the resource. For example: timestamps, flags, status fields, etc. The
   * format of this field is a JSON string.
   * </pre>
   *
   * <code>optional string internal_metadata = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for internalMetadata.
   */
  com.google.protobuf.ByteString getInternalMetadataBytes();
}
