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
// source: google/cloud/netapp/v1/backup_policy.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.netapp.v1;

public interface BackupPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.BackupPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the backup policy.
   * Format:
   * `projects/{project_id}/locations/{location}/backupPolicies/{backup_policy_id}`.
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
   * Identifier. The resource name of the backup policy.
   * Format:
   * `projects/{project_id}/locations/{location}/backupPolicies/{backup_policy_id}`.
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
   * Number of daily backups to keep. Note that the minimum daily backup limit
   * is 2.
   * </pre>
   *
   * <code>optional int32 daily_backup_limit = 2;</code>
   *
   * @return Whether the dailyBackupLimit field is set.
   */
  boolean hasDailyBackupLimit();

  /**
   *
   *
   * <pre>
   * Number of daily backups to keep. Note that the minimum daily backup limit
   * is 2.
   * </pre>
   *
   * <code>optional int32 daily_backup_limit = 2;</code>
   *
   * @return The dailyBackupLimit.
   */
  int getDailyBackupLimit();

  /**
   *
   *
   * <pre>
   * Number of weekly backups to keep. Note that the sum of daily, weekly and
   * monthly backups should be greater than 1.
   * </pre>
   *
   * <code>optional int32 weekly_backup_limit = 3;</code>
   *
   * @return Whether the weeklyBackupLimit field is set.
   */
  boolean hasWeeklyBackupLimit();

  /**
   *
   *
   * <pre>
   * Number of weekly backups to keep. Note that the sum of daily, weekly and
   * monthly backups should be greater than 1.
   * </pre>
   *
   * <code>optional int32 weekly_backup_limit = 3;</code>
   *
   * @return The weeklyBackupLimit.
   */
  int getWeeklyBackupLimit();

  /**
   *
   *
   * <pre>
   * Number of monthly backups to keep. Note that the sum of daily, weekly and
   * monthly backups should be greater than 1.
   * </pre>
   *
   * <code>optional int32 monthly_backup_limit = 4;</code>
   *
   * @return Whether the monthlyBackupLimit field is set.
   */
  boolean hasMonthlyBackupLimit();

  /**
   *
   *
   * <pre>
   * Number of monthly backups to keep. Note that the sum of daily, weekly and
   * monthly backups should be greater than 1.
   * </pre>
   *
   * <code>optional int32 monthly_backup_limit = 4;</code>
   *
   * @return The monthlyBackupLimit.
   */
  int getMonthlyBackupLimit();

  /**
   *
   *
   * <pre>
   * Description of the backup policy.
   * </pre>
   *
   * <code>optional string description = 5;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();

  /**
   *
   *
   * <pre>
   * Description of the backup policy.
   * </pre>
   *
   * <code>optional string description = 5;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Description of the backup policy.
   * </pre>
   *
   * <code>optional string description = 5;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * If enabled, make backups automatically according to the schedules.
   * This will be applied to all volumes that have this policy attached and
   * enforced on volume level. If not specified, default is true.
   * </pre>
   *
   * <code>optional bool enabled = 6;</code>
   *
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();

  /**
   *
   *
   * <pre>
   * If enabled, make backups automatically according to the schedules.
   * This will be applied to all volumes that have this policy attached and
   * enforced on volume level. If not specified, default is true.
   * </pre>
   *
   * <code>optional bool enabled = 6;</code>
   *
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   *
   *
   * <pre>
   * Output only. The total number of volumes assigned by this backup policy.
   * </pre>
   *
   * <code>optional int32 assigned_volume_count = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the assignedVolumeCount field is set.
   */
  boolean hasAssignedVolumeCount();

  /**
   *
   *
   * <pre>
   * Output only. The total number of volumes assigned by this backup policy.
   * </pre>
   *
   * <code>optional int32 assigned_volume_count = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The assignedVolumeCount.
   */
  int getAssignedVolumeCount();

  /**
   *
   *
   * <pre>
   * Output only. The time when the backup policy was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the backup policy was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the backup policy was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
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
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. The backup policy state.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.BackupPolicy.State state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The backup policy state.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.BackupPolicy.State state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.netapp.v1.BackupPolicy.State getState();
}
