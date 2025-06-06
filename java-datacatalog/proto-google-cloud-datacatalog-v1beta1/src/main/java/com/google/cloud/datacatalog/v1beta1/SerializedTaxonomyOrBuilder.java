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
// source: google/cloud/datacatalog/v1beta1/policytagmanagerserialization.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datacatalog.v1beta1;

public interface SerializedTaxonomyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.SerializedTaxonomy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Display name of the taxonomy. Max 200 bytes when encoded in
   * UTF-8.
   * </pre>
   *
   * <code>string display_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Required. Display name of the taxonomy. Max 200 bytes when encoded in
   * UTF-8.
   * </pre>
   *
   * <code>string display_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Description of the serialized taxonomy. The length of the
   * description is limited to 2000 bytes when encoded in UTF-8. If not set,
   * defaults to an empty description.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Description of the serialized taxonomy. The length of the
   * description is limited to 2000 bytes when encoded in UTF-8. If not set,
   * defaults to an empty description.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Top level policy tags associated with the taxonomy if any.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.SerializedPolicyTag policy_tags = 3;</code>
   */
  java.util.List<com.google.cloud.datacatalog.v1beta1.SerializedPolicyTag> getPolicyTagsList();

  /**
   *
   *
   * <pre>
   * Top level policy tags associated with the taxonomy if any.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.SerializedPolicyTag policy_tags = 3;</code>
   */
  com.google.cloud.datacatalog.v1beta1.SerializedPolicyTag getPolicyTags(int index);

  /**
   *
   *
   * <pre>
   * Top level policy tags associated with the taxonomy if any.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.SerializedPolicyTag policy_tags = 3;</code>
   */
  int getPolicyTagsCount();

  /**
   *
   *
   * <pre>
   * Top level policy tags associated with the taxonomy if any.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.SerializedPolicyTag policy_tags = 3;</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1beta1.SerializedPolicyTagOrBuilder>
      getPolicyTagsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Top level policy tags associated with the taxonomy if any.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.SerializedPolicyTag policy_tags = 3;</code>
   */
  com.google.cloud.datacatalog.v1beta1.SerializedPolicyTagOrBuilder getPolicyTagsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A list of policy types that are activated for a taxonomy.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.Taxonomy.PolicyType activated_policy_types = 4;
   * </code>
   *
   * @return A list containing the activatedPolicyTypes.
   */
  java.util.List<com.google.cloud.datacatalog.v1beta1.Taxonomy.PolicyType>
      getActivatedPolicyTypesList();

  /**
   *
   *
   * <pre>
   * A list of policy types that are activated for a taxonomy.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.Taxonomy.PolicyType activated_policy_types = 4;
   * </code>
   *
   * @return The count of activatedPolicyTypes.
   */
  int getActivatedPolicyTypesCount();

  /**
   *
   *
   * <pre>
   * A list of policy types that are activated for a taxonomy.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.Taxonomy.PolicyType activated_policy_types = 4;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The activatedPolicyTypes at the given index.
   */
  com.google.cloud.datacatalog.v1beta1.Taxonomy.PolicyType getActivatedPolicyTypes(int index);

  /**
   *
   *
   * <pre>
   * A list of policy types that are activated for a taxonomy.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.Taxonomy.PolicyType activated_policy_types = 4;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for activatedPolicyTypes.
   */
  java.util.List<java.lang.Integer> getActivatedPolicyTypesValueList();

  /**
   *
   *
   * <pre>
   * A list of policy types that are activated for a taxonomy.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.Taxonomy.PolicyType activated_policy_types = 4;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of activatedPolicyTypes at the given index.
   */
  int getActivatedPolicyTypesValue(int index);
}
