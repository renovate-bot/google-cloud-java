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
// source: google/cloud/gdchardwaremanagement/v1alpha/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gdchardwaremanagement.v1alpha;

public interface SkuOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gdchardwaremanagement.v1alpha.Sku)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. Name of this SKU.
   * Format: `projects/{project}/locations/{location}/skus/{sku}`
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
   * Identifier. Name of this SKU.
   * Format: `projects/{project}/locations/{location}/skus/{sku}`
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
   * Output only. Display name of this SKU.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Output only. Display name of this SKU.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Time when this SKU was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time when this SKU was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time when this SKU was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when this SKU was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time when this SKU was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time when this SKU was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Configuration for this SKU.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.SkuConfig config = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();

  /**
   *
   *
   * <pre>
   * Output only. Configuration for this SKU.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.SkuConfig config = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The config.
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.SkuConfig getConfig();

  /**
   *
   *
   * <pre>
   * Output only. Configuration for this SKU.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.SkuConfig config = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.SkuConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Available instances of this SKU. This field should be used for
   * checking availability of a SKU.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gdchardwaremanagement.v1alpha.SkuInstance instances = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.gdchardwaremanagement.v1alpha.SkuInstance> getInstancesList();

  /**
   *
   *
   * <pre>
   * Output only. Available instances of this SKU. This field should be used for
   * checking availability of a SKU.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gdchardwaremanagement.v1alpha.SkuInstance instances = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.SkuInstance getInstances(int index);

  /**
   *
   *
   * <pre>
   * Output only. Available instances of this SKU. This field should be used for
   * checking availability of a SKU.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gdchardwaremanagement.v1alpha.SkuInstance instances = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getInstancesCount();

  /**
   *
   *
   * <pre>
   * Output only. Available instances of this SKU. This field should be used for
   * checking availability of a SKU.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gdchardwaremanagement.v1alpha.SkuInstance instances = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.gdchardwaremanagement.v1alpha.SkuInstanceOrBuilder>
      getInstancesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. Available instances of this SKU. This field should be used for
   * checking availability of a SKU.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gdchardwaremanagement.v1alpha.SkuInstance instances = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.SkuInstanceOrBuilder getInstancesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. Description of this SKU.
   * </pre>
   *
   * <code>string description = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Output only. Description of this SKU.
   * </pre>
   *
   * <code>string description = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The SKU revision ID.
   * A new revision is created whenever `config` is updated. The format is an
   * 8-character hexadecimal string.
   * </pre>
   *
   * <code>string revision_id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The revisionId.
   */
  java.lang.String getRevisionId();

  /**
   *
   *
   * <pre>
   * Output only. The SKU revision ID.
   * A new revision is created whenever `config` is updated. The format is an
   * 8-character hexadecimal string.
   * </pre>
   *
   * <code>string revision_id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for revisionId.
   */
  com.google.protobuf.ByteString getRevisionIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Flag to indicate whether or not this revision is active. Only
   * an active revision can be used in a new Order.
   * </pre>
   *
   * <code>bool is_active = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The isActive.
   */
  boolean getIsActive();

  /**
   *
   *
   * <pre>
   * Output only. Type of this SKU.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.Sku.Type type = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();

  /**
   *
   *
   * <pre>
   * Output only. Type of this SKU.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.Sku.Type type = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.Sku.Type getType();

  /**
   *
   *
   * <pre>
   * Output only. The vCPU count associated with this SKU.
   * </pre>
   *
   * <code>int32 vcpu_count = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The vcpuCount.
   */
  int getVcpuCount();

  /**
   *
   *
   * <pre>
   * Output only. The inclusive ranges of hardware counts that are allowed in a
   * zone using this SKU.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gdchardwaremanagement.v1alpha.Sku.Range hardware_count_ranges = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.gdchardwaremanagement.v1alpha.Sku.Range>
      getHardwareCountRangesList();

  /**
   *
   *
   * <pre>
   * Output only. The inclusive ranges of hardware counts that are allowed in a
   * zone using this SKU.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gdchardwaremanagement.v1alpha.Sku.Range hardware_count_ranges = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.Sku.Range getHardwareCountRanges(int index);

  /**
   *
   *
   * <pre>
   * Output only. The inclusive ranges of hardware counts that are allowed in a
   * zone using this SKU.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gdchardwaremanagement.v1alpha.Sku.Range hardware_count_ranges = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getHardwareCountRangesCount();

  /**
   *
   *
   * <pre>
   * Output only. The inclusive ranges of hardware counts that are allowed in a
   * zone using this SKU.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gdchardwaremanagement.v1alpha.Sku.Range hardware_count_ranges = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.gdchardwaremanagement.v1alpha.Sku.RangeOrBuilder>
      getHardwareCountRangesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. The inclusive ranges of hardware counts that are allowed in a
   * zone using this SKU.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gdchardwaremanagement.v1alpha.Sku.Range hardware_count_ranges = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.Sku.RangeOrBuilder getHardwareCountRangesOrBuilder(
      int index);
}
