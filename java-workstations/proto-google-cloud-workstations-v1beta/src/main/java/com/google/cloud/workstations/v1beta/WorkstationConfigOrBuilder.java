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
// source: google/cloud/workstations/v1beta/workstations.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.workstations.v1beta;

public interface WorkstationConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.workstations.v1beta.WorkstationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Full name of this workstation configuration.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Full name of this workstation configuration.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Human-readable name for this workstation configuration.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Optional. Human-readable name for this workstation configuration.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. A system-assigned unique identifier for this workstation
   * configuration.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();

  /**
   *
   *
   * <pre>
   * Output only. A system-assigned unique identifier for this workstation
   * configuration.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. Indicates whether this workstation configuration is currently
   * being updated to match its intended state.
   * </pre>
   *
   * <code>bool reconciling = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reconciling.
   */
  boolean getReconciling();

  /**
   *
   *
   * <pre>
   * Optional. Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAnnotationsCount();

  /**
   *
   *
   * <pre>
   * Optional. Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsAnnotations(java.lang.String key);

  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();

  /**
   *
   *
   * <pre>
   * Optional. Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();

  /**
   *
   *
   * <pre>
   * Optional. Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional.
   * [Labels](https://cloud.google.com/workstations/docs/label-resources) that
   * are applied to the workstation configuration and that are also propagated
   * to the underlying Compute Engine resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Optional.
   * [Labels](https://cloud.google.com/workstations/docs/label-resources) that
   * are applied to the workstation configuration and that are also propagated
   * to the underlying Compute Engine resources.
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
   * Optional.
   * [Labels](https://cloud.google.com/workstations/docs/label-resources) that
   * are applied to the workstation configuration and that are also propagated
   * to the underlying Compute Engine resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Optional.
   * [Labels](https://cloud.google.com/workstations/docs/label-resources) that
   * are applied to the workstation configuration and that are also propagated
   * to the underlying Compute Engine resources.
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
   * Optional.
   * [Labels](https://cloud.google.com/workstations/docs/label-resources) that
   * are applied to the workstation configuration and that are also propagated
   * to the underlying Compute Engine resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Time when this workstation configuration was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time when this workstation configuration was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time when this workstation configuration was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when this workstation configuration was most recently
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time when this workstation configuration was most recently
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time when this workstation configuration was most recently
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when this workstation configuration was soft-deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();

  /**
   *
   *
   * <pre>
   * Output only. Time when this workstation configuration was soft-deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();

  /**
   *
   *
   * <pre>
   * Output only. Time when this workstation configuration was soft-deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Checksum computed by the server. May be sent on update and delete
   * requests to make sure that the client has an up-to-date value before
   * proceeding.
   * </pre>
   *
   * <code>string etag = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * Optional. Checksum computed by the server. May be sent on update and delete
   * requests to make sure that the client has an up-to-date value before
   * proceeding.
   * </pre>
   *
   * <code>string etag = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Optional. Number of seconds to wait before automatically stopping a
   * workstation after it last received user traffic.
   *
   * A value of `"0s"` indicates that Cloud Workstations VMs created with this
   * configuration should never time out due to idleness.
   * Provide
   * [duration](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#duration)
   * terminated by `s` for seconds—for example, `"7200s"` (2 hours).
   * The default is `"1200s"` (20 minutes).
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_timeout = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the idleTimeout field is set.
   */
  boolean hasIdleTimeout();

  /**
   *
   *
   * <pre>
   * Optional. Number of seconds to wait before automatically stopping a
   * workstation after it last received user traffic.
   *
   * A value of `"0s"` indicates that Cloud Workstations VMs created with this
   * configuration should never time out due to idleness.
   * Provide
   * [duration](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#duration)
   * terminated by `s` for seconds—for example, `"7200s"` (2 hours).
   * The default is `"1200s"` (20 minutes).
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_timeout = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The idleTimeout.
   */
  com.google.protobuf.Duration getIdleTimeout();

  /**
   *
   *
   * <pre>
   * Optional. Number of seconds to wait before automatically stopping a
   * workstation after it last received user traffic.
   *
   * A value of `"0s"` indicates that Cloud Workstations VMs created with this
   * configuration should never time out due to idleness.
   * Provide
   * [duration](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#duration)
   * terminated by `s` for seconds—for example, `"7200s"` (2 hours).
   * The default is `"1200s"` (20 minutes).
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_timeout = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getIdleTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Number of seconds that a workstation can run until it is
   * automatically shut down. We recommend that workstations be shut down daily
   * to reduce costs and so that security updates can be applied upon restart.
   * The
   * [idle_timeout][google.cloud.workstations.v1beta.WorkstationConfig.idle_timeout]
   * and
   * [running_timeout][google.cloud.workstations.v1beta.WorkstationConfig.running_timeout]
   * fields are independent of each other. Note that the
   * [running_timeout][google.cloud.workstations.v1beta.WorkstationConfig.running_timeout]
   * field shuts down VMs after the specified time, regardless of whether or not
   * the VMs are idle.
   *
   * Provide duration terminated by `s` for seconds—for example, `"54000s"`
   * (15 hours). Defaults to `"43200s"` (12 hours). A value of `"0s"` indicates
   * that workstations using this configuration should never time out. If
   * [encryption_key][google.cloud.workstations.v1beta.WorkstationConfig.encryption_key]
   * is set, it must be greater than `"0s"` and less than
   * `"86400s"` (24 hours).
   *
   * Warning: A value of `"0s"` indicates that Cloud Workstations VMs created
   * with this configuration have no maximum running time. This is strongly
   * discouraged because you incur costs and will not pick up security updates.
   * </pre>
   *
   * <code>.google.protobuf.Duration running_timeout = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the runningTimeout field is set.
   */
  boolean hasRunningTimeout();

  /**
   *
   *
   * <pre>
   * Optional. Number of seconds that a workstation can run until it is
   * automatically shut down. We recommend that workstations be shut down daily
   * to reduce costs and so that security updates can be applied upon restart.
   * The
   * [idle_timeout][google.cloud.workstations.v1beta.WorkstationConfig.idle_timeout]
   * and
   * [running_timeout][google.cloud.workstations.v1beta.WorkstationConfig.running_timeout]
   * fields are independent of each other. Note that the
   * [running_timeout][google.cloud.workstations.v1beta.WorkstationConfig.running_timeout]
   * field shuts down VMs after the specified time, regardless of whether or not
   * the VMs are idle.
   *
   * Provide duration terminated by `s` for seconds—for example, `"54000s"`
   * (15 hours). Defaults to `"43200s"` (12 hours). A value of `"0s"` indicates
   * that workstations using this configuration should never time out. If
   * [encryption_key][google.cloud.workstations.v1beta.WorkstationConfig.encryption_key]
   * is set, it must be greater than `"0s"` and less than
   * `"86400s"` (24 hours).
   *
   * Warning: A value of `"0s"` indicates that Cloud Workstations VMs created
   * with this configuration have no maximum running time. This is strongly
   * discouraged because you incur costs and will not pick up security updates.
   * </pre>
   *
   * <code>.google.protobuf.Duration running_timeout = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The runningTimeout.
   */
  com.google.protobuf.Duration getRunningTimeout();

  /**
   *
   *
   * <pre>
   * Optional. Number of seconds that a workstation can run until it is
   * automatically shut down. We recommend that workstations be shut down daily
   * to reduce costs and so that security updates can be applied upon restart.
   * The
   * [idle_timeout][google.cloud.workstations.v1beta.WorkstationConfig.idle_timeout]
   * and
   * [running_timeout][google.cloud.workstations.v1beta.WorkstationConfig.running_timeout]
   * fields are independent of each other. Note that the
   * [running_timeout][google.cloud.workstations.v1beta.WorkstationConfig.running_timeout]
   * field shuts down VMs after the specified time, regardless of whether or not
   * the VMs are idle.
   *
   * Provide duration terminated by `s` for seconds—for example, `"54000s"`
   * (15 hours). Defaults to `"43200s"` (12 hours). A value of `"0s"` indicates
   * that workstations using this configuration should never time out. If
   * [encryption_key][google.cloud.workstations.v1beta.WorkstationConfig.encryption_key]
   * is set, it must be greater than `"0s"` and less than
   * `"86400s"` (24 hours).
   *
   * Warning: A value of `"0s"` indicates that Cloud Workstations VMs created
   * with this configuration have no maximum running time. This is strongly
   * discouraged because you incur costs and will not pick up security updates.
   * </pre>
   *
   * <code>.google.protobuf.Duration running_timeout = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getRunningTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Runtime host for the workstation.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationConfig.Host host = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the host field is set.
   */
  boolean hasHost();

  /**
   *
   *
   * <pre>
   * Optional. Runtime host for the workstation.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationConfig.Host host = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The host.
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.Host getHost();

  /**
   *
   *
   * <pre>
   * Optional. Runtime host for the workstation.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationConfig.Host host = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.HostOrBuilder getHostOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Directories to persist across workstation sessions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.PersistentDirectory persistent_directories = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.workstations.v1beta.WorkstationConfig.PersistentDirectory>
      getPersistentDirectoriesList();

  /**
   *
   *
   * <pre>
   * Optional. Directories to persist across workstation sessions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.PersistentDirectory persistent_directories = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.PersistentDirectory
      getPersistentDirectories(int index);

  /**
   *
   *
   * <pre>
   * Optional. Directories to persist across workstation sessions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.PersistentDirectory persistent_directories = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getPersistentDirectoriesCount();

  /**
   *
   *
   * <pre>
   * Optional. Directories to persist across workstation sessions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.PersistentDirectory persistent_directories = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.workstations.v1beta.WorkstationConfig.PersistentDirectoryOrBuilder>
      getPersistentDirectoriesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. Directories to persist across workstation sessions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.PersistentDirectory persistent_directories = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.PersistentDirectoryOrBuilder
      getPersistentDirectoriesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Ephemeral directories which won't persist across workstation
   * sessions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.EphemeralDirectory ephemeral_directories = 22 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.workstations.v1beta.WorkstationConfig.EphemeralDirectory>
      getEphemeralDirectoriesList();

  /**
   *
   *
   * <pre>
   * Optional. Ephemeral directories which won't persist across workstation
   * sessions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.EphemeralDirectory ephemeral_directories = 22 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.EphemeralDirectory getEphemeralDirectories(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. Ephemeral directories which won't persist across workstation
   * sessions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.EphemeralDirectory ephemeral_directories = 22 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getEphemeralDirectoriesCount();

  /**
   *
   *
   * <pre>
   * Optional. Ephemeral directories which won't persist across workstation
   * sessions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.EphemeralDirectory ephemeral_directories = 22 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.workstations.v1beta.WorkstationConfig.EphemeralDirectoryOrBuilder>
      getEphemeralDirectoriesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. Ephemeral directories which won't persist across workstation
   * sessions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.EphemeralDirectory ephemeral_directories = 22 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.EphemeralDirectoryOrBuilder
      getEphemeralDirectoriesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Container that runs upon startup for each workstation using this
   * workstation configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationConfig.Container container = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the container field is set.
   */
  boolean hasContainer();

  /**
   *
   *
   * <pre>
   * Optional. Container that runs upon startup for each workstation using this
   * workstation configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationConfig.Container container = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The container.
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.Container getContainer();

  /**
   *
   *
   * <pre>
   * Optional. Container that runs upon startup for each workstation using this
   * workstation configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationConfig.Container container = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.ContainerOrBuilder getContainerOrBuilder();

  /**
   *
   *
   * <pre>
   * Immutable. Encrypts resources of this workstation configuration using a
   * customer-managed encryption key (CMEK).
   *
   * If specified, the boot disk of the Compute Engine instance and the
   * persistent disk are encrypted using this encryption key. If
   * this field is not set, the disks are encrypted using a generated
   * key. Customer-managed encryption keys do not protect disk metadata.
   *
   * If the customer-managed encryption key is rotated, when the workstation
   * instance is stopped, the system attempts to recreate the
   * persistent disk with the new version of the key. Be sure to keep
   * older versions of the key until the persistent disk is recreated.
   * Otherwise, data on the persistent disk might be lost.
   *
   * If the encryption key is revoked, the workstation session automatically
   * stops within 7 hours.
   *
   * Immutable after the workstation configuration is created.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationConfig.CustomerEncryptionKey encryption_key = 17 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the encryptionKey field is set.
   */
  boolean hasEncryptionKey();

  /**
   *
   *
   * <pre>
   * Immutable. Encrypts resources of this workstation configuration using a
   * customer-managed encryption key (CMEK).
   *
   * If specified, the boot disk of the Compute Engine instance and the
   * persistent disk are encrypted using this encryption key. If
   * this field is not set, the disks are encrypted using a generated
   * key. Customer-managed encryption keys do not protect disk metadata.
   *
   * If the customer-managed encryption key is rotated, when the workstation
   * instance is stopped, the system attempts to recreate the
   * persistent disk with the new version of the key. Be sure to keep
   * older versions of the key until the persistent disk is recreated.
   * Otherwise, data on the persistent disk might be lost.
   *
   * If the encryption key is revoked, the workstation session automatically
   * stops within 7 hours.
   *
   * Immutable after the workstation configuration is created.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationConfig.CustomerEncryptionKey encryption_key = 17 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The encryptionKey.
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.CustomerEncryptionKey getEncryptionKey();

  /**
   *
   *
   * <pre>
   * Immutable. Encrypts resources of this workstation configuration using a
   * customer-managed encryption key (CMEK).
   *
   * If specified, the boot disk of the Compute Engine instance and the
   * persistent disk are encrypted using this encryption key. If
   * this field is not set, the disks are encrypted using a generated
   * key. Customer-managed encryption keys do not protect disk metadata.
   *
   * If the customer-managed encryption key is rotated, when the workstation
   * instance is stopped, the system attempts to recreate the
   * persistent disk with the new version of the key. Be sure to keep
   * older versions of the key until the persistent disk is recreated.
   * Otherwise, data on the persistent disk might be lost.
   *
   * If the encryption key is revoked, the workstation session automatically
   * stops within 7 hours.
   *
   * Immutable after the workstation configuration is created.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationConfig.CustomerEncryptionKey encryption_key = 17 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.CustomerEncryptionKeyOrBuilder
      getEncryptionKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Readiness checks to perform when starting a workstation using
   * this workstation configuration. Mark a workstation as running only after
   * all specified readiness checks return 200 status codes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.ReadinessCheck readiness_checks = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.workstations.v1beta.WorkstationConfig.ReadinessCheck>
      getReadinessChecksList();

  /**
   *
   *
   * <pre>
   * Optional. Readiness checks to perform when starting a workstation using
   * this workstation configuration. Mark a workstation as running only after
   * all specified readiness checks return 200 status codes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.ReadinessCheck readiness_checks = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.ReadinessCheck getReadinessChecks(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. Readiness checks to perform when starting a workstation using
   * this workstation configuration. Mark a workstation as running only after
   * all specified readiness checks return 200 status codes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.ReadinessCheck readiness_checks = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getReadinessChecksCount();

  /**
   *
   *
   * <pre>
   * Optional. Readiness checks to perform when starting a workstation using
   * this workstation configuration. Mark a workstation as running only after
   * all specified readiness checks return 200 status codes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.ReadinessCheck readiness_checks = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.workstations.v1beta.WorkstationConfig.ReadinessCheckOrBuilder>
      getReadinessChecksOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. Readiness checks to perform when starting a workstation using
   * this workstation configuration. Mark a workstation as running only after
   * all specified readiness checks return 200 status codes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.ReadinessCheck readiness_checks = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.ReadinessCheckOrBuilder
      getReadinessChecksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Immutable. Specifies the zones used to replicate the VM and disk
   * resources within the region. If set, exactly two zones within the
   * workstation cluster's region must be specified—for example,
   * `['us-central1-a', 'us-central1-f']`. If this field is empty, two default
   * zones within the region are used.
   *
   * Immutable after the workstation configuration is created.
   * </pre>
   *
   * <code>
   * repeated string replica_zones = 23 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return A list containing the replicaZones.
   */
  java.util.List<java.lang.String> getReplicaZonesList();

  /**
   *
   *
   * <pre>
   * Optional. Immutable. Specifies the zones used to replicate the VM and disk
   * resources within the region. If set, exactly two zones within the
   * workstation cluster's region must be specified—for example,
   * `['us-central1-a', 'us-central1-f']`. If this field is empty, two default
   * zones within the region are used.
   *
   * Immutable after the workstation configuration is created.
   * </pre>
   *
   * <code>
   * repeated string replica_zones = 23 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The count of replicaZones.
   */
  int getReplicaZonesCount();

  /**
   *
   *
   * <pre>
   * Optional. Immutable. Specifies the zones used to replicate the VM and disk
   * resources within the region. If set, exactly two zones within the
   * workstation cluster's region must be specified—for example,
   * `['us-central1-a', 'us-central1-f']`. If this field is empty, two default
   * zones within the region are used.
   *
   * Immutable after the workstation configuration is created.
   * </pre>
   *
   * <code>
   * repeated string replica_zones = 23 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The replicaZones at the given index.
   */
  java.lang.String getReplicaZones(int index);

  /**
   *
   *
   * <pre>
   * Optional. Immutable. Specifies the zones used to replicate the VM and disk
   * resources within the region. If set, exactly two zones within the
   * workstation cluster's region must be specified—for example,
   * `['us-central1-a', 'us-central1-f']`. If this field is empty, two default
   * zones within the region are used.
   *
   * Immutable after the workstation configuration is created.
   * </pre>
   *
   * <code>
   * repeated string replica_zones = 23 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the replicaZones at the given index.
   */
  com.google.protobuf.ByteString getReplicaZonesBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. Whether this resource is degraded, in which case it may
   * require user action to restore full functionality. See also the
   * [conditions][google.cloud.workstations.v1beta.WorkstationConfig.conditions]
   * field.
   * </pre>
   *
   * <code>bool degraded = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The degraded.
   */
  boolean getDegraded();

  /**
   *
   *
   * <pre>
   * Output only. Status conditions describing the current resource state.
   * </pre>
   *
   * <code>repeated .google.rpc.Status conditions = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.rpc.Status> getConditionsList();

  /**
   *
   *
   * <pre>
   * Output only. Status conditions describing the current resource state.
   * </pre>
   *
   * <code>repeated .google.rpc.Status conditions = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.rpc.Status getConditions(int index);

  /**
   *
   *
   * <pre>
   * Output only. Status conditions describing the current resource state.
   * </pre>
   *
   * <code>repeated .google.rpc.Status conditions = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getConditionsCount();

  /**
   *
   *
   * <pre>
   * Output only. Status conditions describing the current resource state.
   * </pre>
   *
   * <code>repeated .google.rpc.Status conditions = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getConditionsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. Status conditions describing the current resource state.
   * </pre>
   *
   * <code>repeated .google.rpc.Status conditions = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.rpc.StatusOrBuilder getConditionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Whether to enable Linux `auditd` logging on the workstation. When
   * enabled, a service account must also be specified that has
   * `logging.buckets.write` permission on the project. Operating system audit
   * logging is distinct from [Cloud Audit
   * Logs](https://cloud.google.com/workstations/docs/audit-logging).
   * </pre>
   *
   * <code>bool enable_audit_agent = 20 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enableAuditAgent.
   */
  boolean getEnableAuditAgent();
}
