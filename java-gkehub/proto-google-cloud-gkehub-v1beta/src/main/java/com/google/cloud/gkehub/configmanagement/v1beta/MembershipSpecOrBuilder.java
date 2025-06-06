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
// source: google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkehub.configmanagement.v1beta;

public interface MembershipSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1beta.MembershipSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Config Sync configuration for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.ConfigSync config_sync = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the configSync field is set.
   */
  boolean hasConfigSync();

  /**
   *
   *
   * <pre>
   * Optional. Config Sync configuration for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.ConfigSync config_sync = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The configSync.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.ConfigSync getConfigSync();

  /**
   *
   *
   * <pre>
   * Optional. Config Sync configuration for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.ConfigSync config_sync = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.ConfigSyncOrBuilder getConfigSyncOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Policy Controller configuration for the cluster.
   * Deprecated: Configuring Policy Controller through the configmanagement
   * feature is no longer recommended. Use the policycontroller feature instead.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.PolicyController policy_controller = 2 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.cloud.gkehub.configmanagement.v1beta.MembershipSpec.policy_controller is
   *     deprecated. See google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto;l=100
   * @return Whether the policyController field is set.
   */
  @java.lang.Deprecated
  boolean hasPolicyController();

  /**
   *
   *
   * <pre>
   * Optional. Policy Controller configuration for the cluster.
   * Deprecated: Configuring Policy Controller through the configmanagement
   * feature is no longer recommended. Use the policycontroller feature instead.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.PolicyController policy_controller = 2 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.cloud.gkehub.configmanagement.v1beta.MembershipSpec.policy_controller is
   *     deprecated. See google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto;l=100
   * @return The policyController.
   */
  @java.lang.Deprecated
  com.google.cloud.gkehub.configmanagement.v1beta.PolicyController getPolicyController();

  /**
   *
   *
   * <pre>
   * Optional. Policy Controller configuration for the cluster.
   * Deprecated: Configuring Policy Controller through the configmanagement
   * feature is no longer recommended. Use the policycontroller feature instead.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.PolicyController policy_controller = 2 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.gkehub.configmanagement.v1beta.PolicyControllerOrBuilder
      getPolicyControllerOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Binauthz conifguration for the cluster. Deprecated: This field
   * will be ignored and should not be set.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.BinauthzConfig binauthz = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.cloud.gkehub.configmanagement.v1beta.MembershipSpec.binauthz is deprecated.
   *     See google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto;l=105
   * @return Whether the binauthz field is set.
   */
  @java.lang.Deprecated
  boolean hasBinauthz();

  /**
   *
   *
   * <pre>
   * Optional. Binauthz conifguration for the cluster. Deprecated: This field
   * will be ignored and should not be set.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.BinauthzConfig binauthz = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.cloud.gkehub.configmanagement.v1beta.MembershipSpec.binauthz is deprecated.
   *     See google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto;l=105
   * @return The binauthz.
   */
  @java.lang.Deprecated
  com.google.cloud.gkehub.configmanagement.v1beta.BinauthzConfig getBinauthz();

  /**
   *
   *
   * <pre>
   * Optional. Binauthz conifguration for the cluster. Deprecated: This field
   * will be ignored and should not be set.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.BinauthzConfig binauthz = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.gkehub.configmanagement.v1beta.BinauthzConfigOrBuilder getBinauthzOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Hierarchy Controller configuration for the cluster.
   * Deprecated: Configuring Hierarchy Controller through the configmanagement
   * feature is no longer recommended. Use
   * https://github.com/kubernetes-sigs/hierarchical-namespaces instead.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig hierarchy_controller = 4 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.cloud.gkehub.configmanagement.v1beta.MembershipSpec.hierarchy_controller is
   *     deprecated. See google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto;l=112
   * @return Whether the hierarchyController field is set.
   */
  @java.lang.Deprecated
  boolean hasHierarchyController();

  /**
   *
   *
   * <pre>
   * Optional. Hierarchy Controller configuration for the cluster.
   * Deprecated: Configuring Hierarchy Controller through the configmanagement
   * feature is no longer recommended. Use
   * https://github.com/kubernetes-sigs/hierarchical-namespaces instead.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig hierarchy_controller = 4 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.cloud.gkehub.configmanagement.v1beta.MembershipSpec.hierarchy_controller is
   *     deprecated. See google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto;l=112
   * @return The hierarchyController.
   */
  @java.lang.Deprecated
  com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig
      getHierarchyController();

  /**
   *
   *
   * <pre>
   * Optional. Hierarchy Controller configuration for the cluster.
   * Deprecated: Configuring Hierarchy Controller through the configmanagement
   * feature is no longer recommended. Use
   * https://github.com/kubernetes-sigs/hierarchical-namespaces instead.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig hierarchy_controller = 4 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfigOrBuilder
      getHierarchyControllerOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Version of ACM installed.
   * </pre>
   *
   * <code>string version = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();

  /**
   *
   *
   * <pre>
   * Optional. Version of ACM installed.
   * </pre>
   *
   * <code>string version = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The user-specified cluster name used by Config Sync
   * cluster-name-selector annotation or ClusterSelector, for applying configs
   * to only a subset of clusters. Omit this field if the cluster's fleet
   * membership name is used by Config Sync cluster-name-selector annotation or
   * ClusterSelector. Set this field if a name different from the cluster's
   * fleet membership name is used by Config Sync cluster-name-selector
   * annotation or ClusterSelector.
   * </pre>
   *
   * <code>string cluster = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The cluster.
   */
  java.lang.String getCluster();

  /**
   *
   *
   * <pre>
   * Optional. The user-specified cluster name used by Config Sync
   * cluster-name-selector annotation or ClusterSelector, for applying configs
   * to only a subset of clusters. Omit this field if the cluster's fleet
   * membership name is used by Config Sync cluster-name-selector annotation or
   * ClusterSelector. Set this field if a name different from the cluster's
   * fleet membership name is used by Config Sync cluster-name-selector
   * annotation or ClusterSelector.
   * </pre>
   *
   * <code>string cluster = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for cluster.
   */
  com.google.protobuf.ByteString getClusterBytes();

  /**
   *
   *
   * <pre>
   * Optional. Enables automatic Feature management.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.MembershipSpec.Management management = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for management.
   */
  int getManagementValue();

  /**
   *
   *
   * <pre>
   * Optional. Enables automatic Feature management.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.MembershipSpec.Management management = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The management.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.MembershipSpec.Management getManagement();
}
