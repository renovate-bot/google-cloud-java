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
// source: google/cloud/gkebackup/v1/restore.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkebackup.v1;

public interface RestoreConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.v1.RestoreConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Specifies the mechanism to be used to restore volume data.
   * Default: VOLUME_DATA_RESTORE_POLICY_UNSPECIFIED (will be treated as
   * NO_VOLUME_DATA_RESTORATION).
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestoreConfig.VolumeDataRestorePolicy volume_data_restore_policy = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for volumeDataRestorePolicy.
   */
  int getVolumeDataRestorePolicyValue();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the mechanism to be used to restore volume data.
   * Default: VOLUME_DATA_RESTORE_POLICY_UNSPECIFIED (will be treated as
   * NO_VOLUME_DATA_RESTORATION).
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestoreConfig.VolumeDataRestorePolicy volume_data_restore_policy = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The volumeDataRestorePolicy.
   */
  com.google.cloud.gkebackup.v1.RestoreConfig.VolumeDataRestorePolicy getVolumeDataRestorePolicy();

  /**
   *
   *
   * <pre>
   * Optional. Defines the behavior for handling the situation where
   * cluster-scoped resources being restored already exist in the target
   * cluster. This MUST be set to a value other than
   * CLUSTER_RESOURCE_CONFLICT_POLICY_UNSPECIFIED if
   * [cluster_resource_restore_scope][google.cloud.gkebackup.v1.RestoreConfig.cluster_resource_restore_scope]
   * is not empty.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestoreConfig.ClusterResourceConflictPolicy cluster_resource_conflict_policy = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for clusterResourceConflictPolicy.
   */
  int getClusterResourceConflictPolicyValue();

  /**
   *
   *
   * <pre>
   * Optional. Defines the behavior for handling the situation where
   * cluster-scoped resources being restored already exist in the target
   * cluster. This MUST be set to a value other than
   * CLUSTER_RESOURCE_CONFLICT_POLICY_UNSPECIFIED if
   * [cluster_resource_restore_scope][google.cloud.gkebackup.v1.RestoreConfig.cluster_resource_restore_scope]
   * is not empty.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestoreConfig.ClusterResourceConflictPolicy cluster_resource_conflict_policy = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The clusterResourceConflictPolicy.
   */
  com.google.cloud.gkebackup.v1.RestoreConfig.ClusterResourceConflictPolicy
      getClusterResourceConflictPolicy();

  /**
   *
   *
   * <pre>
   * Optional. Defines the behavior for handling the situation where sets of
   * namespaced resources being restored already exist in the target cluster.
   * This MUST be set to a value other than
   * NAMESPACED_RESOURCE_RESTORE_MODE_UNSPECIFIED.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestoreConfig.NamespacedResourceRestoreMode namespaced_resource_restore_mode = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for namespacedResourceRestoreMode.
   */
  int getNamespacedResourceRestoreModeValue();

  /**
   *
   *
   * <pre>
   * Optional. Defines the behavior for handling the situation where sets of
   * namespaced resources being restored already exist in the target cluster.
   * This MUST be set to a value other than
   * NAMESPACED_RESOURCE_RESTORE_MODE_UNSPECIFIED.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestoreConfig.NamespacedResourceRestoreMode namespaced_resource_restore_mode = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The namespacedResourceRestoreMode.
   */
  com.google.cloud.gkebackup.v1.RestoreConfig.NamespacedResourceRestoreMode
      getNamespacedResourceRestoreMode();

  /**
   *
   *
   * <pre>
   * Optional. Identifies the cluster-scoped resources to restore from the
   * Backup. Not specifying it means NO cluster resource will be restored.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestoreConfig.ClusterResourceRestoreScope cluster_resource_restore_scope = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the clusterResourceRestoreScope field is set.
   */
  boolean hasClusterResourceRestoreScope();

  /**
   *
   *
   * <pre>
   * Optional. Identifies the cluster-scoped resources to restore from the
   * Backup. Not specifying it means NO cluster resource will be restored.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestoreConfig.ClusterResourceRestoreScope cluster_resource_restore_scope = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The clusterResourceRestoreScope.
   */
  com.google.cloud.gkebackup.v1.RestoreConfig.ClusterResourceRestoreScope
      getClusterResourceRestoreScope();

  /**
   *
   *
   * <pre>
   * Optional. Identifies the cluster-scoped resources to restore from the
   * Backup. Not specifying it means NO cluster resource will be restored.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestoreConfig.ClusterResourceRestoreScope cluster_resource_restore_scope = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkebackup.v1.RestoreConfig.ClusterResourceRestoreScopeOrBuilder
      getClusterResourceRestoreScopeOrBuilder();

  /**
   *
   *
   * <pre>
   * Restore all namespaced resources in the Backup if set to "True".
   * Specifying this field to "False" is an error.
   * </pre>
   *
   * <code>bool all_namespaces = 5;</code>
   *
   * @return Whether the allNamespaces field is set.
   */
  boolean hasAllNamespaces();

  /**
   *
   *
   * <pre>
   * Restore all namespaced resources in the Backup if set to "True".
   * Specifying this field to "False" is an error.
   * </pre>
   *
   * <code>bool all_namespaces = 5;</code>
   *
   * @return The allNamespaces.
   */
  boolean getAllNamespaces();

  /**
   *
   *
   * <pre>
   * A list of selected Namespaces to restore from the Backup. The listed
   * Namespaces and all resources contained in them will be restored.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.Namespaces selected_namespaces = 6;</code>
   *
   * @return Whether the selectedNamespaces field is set.
   */
  boolean hasSelectedNamespaces();

  /**
   *
   *
   * <pre>
   * A list of selected Namespaces to restore from the Backup. The listed
   * Namespaces and all resources contained in them will be restored.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.Namespaces selected_namespaces = 6;</code>
   *
   * @return The selectedNamespaces.
   */
  com.google.cloud.gkebackup.v1.Namespaces getSelectedNamespaces();

  /**
   *
   *
   * <pre>
   * A list of selected Namespaces to restore from the Backup. The listed
   * Namespaces and all resources contained in them will be restored.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.Namespaces selected_namespaces = 6;</code>
   */
  com.google.cloud.gkebackup.v1.NamespacesOrBuilder getSelectedNamespacesOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of selected ProtectedApplications to restore. The listed
   * ProtectedApplications and all the resources to which they refer will be
   * restored.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.NamespacedNames selected_applications = 7;</code>
   *
   * @return Whether the selectedApplications field is set.
   */
  boolean hasSelectedApplications();

  /**
   *
   *
   * <pre>
   * A list of selected ProtectedApplications to restore. The listed
   * ProtectedApplications and all the resources to which they refer will be
   * restored.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.NamespacedNames selected_applications = 7;</code>
   *
   * @return The selectedApplications.
   */
  com.google.cloud.gkebackup.v1.NamespacedNames getSelectedApplications();

  /**
   *
   *
   * <pre>
   * A list of selected ProtectedApplications to restore. The listed
   * ProtectedApplications and all the resources to which they refer will be
   * restored.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.NamespacedNames selected_applications = 7;</code>
   */
  com.google.cloud.gkebackup.v1.NamespacedNamesOrBuilder getSelectedApplicationsOrBuilder();

  /**
   *
   *
   * <pre>
   * Do not restore any namespaced resources if set to "True".
   * Specifying this field to "False" is not allowed.
   * </pre>
   *
   * <code>bool no_namespaces = 9;</code>
   *
   * @return Whether the noNamespaces field is set.
   */
  boolean hasNoNamespaces();

  /**
   *
   *
   * <pre>
   * Do not restore any namespaced resources if set to "True".
   * Specifying this field to "False" is not allowed.
   * </pre>
   *
   * <code>bool no_namespaces = 9;</code>
   *
   * @return The noNamespaces.
   */
  boolean getNoNamespaces();

  /**
   *
   *
   * <pre>
   * A list of selected namespaces excluded from restoration. All
   * namespaces except those in this list will be restored.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.Namespaces excluded_namespaces = 10;</code>
   *
   * @return Whether the excludedNamespaces field is set.
   */
  boolean hasExcludedNamespaces();

  /**
   *
   *
   * <pre>
   * A list of selected namespaces excluded from restoration. All
   * namespaces except those in this list will be restored.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.Namespaces excluded_namespaces = 10;</code>
   *
   * @return The excludedNamespaces.
   */
  com.google.cloud.gkebackup.v1.Namespaces getExcludedNamespaces();

  /**
   *
   *
   * <pre>
   * A list of selected namespaces excluded from restoration. All
   * namespaces except those in this list will be restored.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.Namespaces excluded_namespaces = 10;</code>
   */
  com.google.cloud.gkebackup.v1.NamespacesOrBuilder getExcludedNamespacesOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A list of transformation rules to be applied against Kubernetes
   * resources as they are selected for restoration from a Backup. Rules are
   * executed in order defined - this order matters, as changes made by a rule
   * may impact the filtering logic of subsequent rules. An empty list means no
   * substitution will occur.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkebackup.v1.RestoreConfig.SubstitutionRule substitution_rules = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.gkebackup.v1.RestoreConfig.SubstitutionRule>
      getSubstitutionRulesList();

  /**
   *
   *
   * <pre>
   * Optional. A list of transformation rules to be applied against Kubernetes
   * resources as they are selected for restoration from a Backup. Rules are
   * executed in order defined - this order matters, as changes made by a rule
   * may impact the filtering logic of subsequent rules. An empty list means no
   * substitution will occur.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkebackup.v1.RestoreConfig.SubstitutionRule substitution_rules = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkebackup.v1.RestoreConfig.SubstitutionRule getSubstitutionRules(int index);

  /**
   *
   *
   * <pre>
   * Optional. A list of transformation rules to be applied against Kubernetes
   * resources as they are selected for restoration from a Backup. Rules are
   * executed in order defined - this order matters, as changes made by a rule
   * may impact the filtering logic of subsequent rules. An empty list means no
   * substitution will occur.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkebackup.v1.RestoreConfig.SubstitutionRule substitution_rules = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getSubstitutionRulesCount();

  /**
   *
   *
   * <pre>
   * Optional. A list of transformation rules to be applied against Kubernetes
   * resources as they are selected for restoration from a Backup. Rules are
   * executed in order defined - this order matters, as changes made by a rule
   * may impact the filtering logic of subsequent rules. An empty list means no
   * substitution will occur.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkebackup.v1.RestoreConfig.SubstitutionRule substitution_rules = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.gkebackup.v1.RestoreConfig.SubstitutionRuleOrBuilder>
      getSubstitutionRulesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. A list of transformation rules to be applied against Kubernetes
   * resources as they are selected for restoration from a Backup. Rules are
   * executed in order defined - this order matters, as changes made by a rule
   * may impact the filtering logic of subsequent rules. An empty list means no
   * substitution will occur.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkebackup.v1.RestoreConfig.SubstitutionRule substitution_rules = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkebackup.v1.RestoreConfig.SubstitutionRuleOrBuilder
      getSubstitutionRulesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. A list of transformation rules to be applied against Kubernetes
   * resources as they are selected for restoration from a Backup. Rules are
   * executed in order defined - this order matters, as changes made by a rule
   * may impact the filtering logic of subsequent rules. An empty list means no
   * transformation will occur.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkebackup.v1.RestoreConfig.TransformationRule transformation_rules = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.gkebackup.v1.RestoreConfig.TransformationRule>
      getTransformationRulesList();

  /**
   *
   *
   * <pre>
   * Optional. A list of transformation rules to be applied against Kubernetes
   * resources as they are selected for restoration from a Backup. Rules are
   * executed in order defined - this order matters, as changes made by a rule
   * may impact the filtering logic of subsequent rules. An empty list means no
   * transformation will occur.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkebackup.v1.RestoreConfig.TransformationRule transformation_rules = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkebackup.v1.RestoreConfig.TransformationRule getTransformationRules(int index);

  /**
   *
   *
   * <pre>
   * Optional. A list of transformation rules to be applied against Kubernetes
   * resources as they are selected for restoration from a Backup. Rules are
   * executed in order defined - this order matters, as changes made by a rule
   * may impact the filtering logic of subsequent rules. An empty list means no
   * transformation will occur.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkebackup.v1.RestoreConfig.TransformationRule transformation_rules = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getTransformationRulesCount();

  /**
   *
   *
   * <pre>
   * Optional. A list of transformation rules to be applied against Kubernetes
   * resources as they are selected for restoration from a Backup. Rules are
   * executed in order defined - this order matters, as changes made by a rule
   * may impact the filtering logic of subsequent rules. An empty list means no
   * transformation will occur.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkebackup.v1.RestoreConfig.TransformationRule transformation_rules = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.gkebackup.v1.RestoreConfig.TransformationRuleOrBuilder>
      getTransformationRulesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. A list of transformation rules to be applied against Kubernetes
   * resources as they are selected for restoration from a Backup. Rules are
   * executed in order defined - this order matters, as changes made by a rule
   * may impact the filtering logic of subsequent rules. An empty list means no
   * transformation will occur.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkebackup.v1.RestoreConfig.TransformationRule transformation_rules = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkebackup.v1.RestoreConfig.TransformationRuleOrBuilder
      getTransformationRulesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. A table that binds volumes by their scope to a restore policy.
   * Bindings must have a unique scope. Any volumes not scoped in the bindings
   * are subject to the policy defined in volume_data_restore_policy.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkebackup.v1.RestoreConfig.VolumeDataRestorePolicyBinding volume_data_restore_policy_bindings = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.gkebackup.v1.RestoreConfig.VolumeDataRestorePolicyBinding>
      getVolumeDataRestorePolicyBindingsList();

  /**
   *
   *
   * <pre>
   * Optional. A table that binds volumes by their scope to a restore policy.
   * Bindings must have a unique scope. Any volumes not scoped in the bindings
   * are subject to the policy defined in volume_data_restore_policy.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkebackup.v1.RestoreConfig.VolumeDataRestorePolicyBinding volume_data_restore_policy_bindings = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkebackup.v1.RestoreConfig.VolumeDataRestorePolicyBinding
      getVolumeDataRestorePolicyBindings(int index);

  /**
   *
   *
   * <pre>
   * Optional. A table that binds volumes by their scope to a restore policy.
   * Bindings must have a unique scope. Any volumes not scoped in the bindings
   * are subject to the policy defined in volume_data_restore_policy.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkebackup.v1.RestoreConfig.VolumeDataRestorePolicyBinding volume_data_restore_policy_bindings = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getVolumeDataRestorePolicyBindingsCount();

  /**
   *
   *
   * <pre>
   * Optional. A table that binds volumes by their scope to a restore policy.
   * Bindings must have a unique scope. Any volumes not scoped in the bindings
   * are subject to the policy defined in volume_data_restore_policy.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkebackup.v1.RestoreConfig.VolumeDataRestorePolicyBinding volume_data_restore_policy_bindings = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.gkebackup.v1.RestoreConfig.VolumeDataRestorePolicyBindingOrBuilder>
      getVolumeDataRestorePolicyBindingsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. A table that binds volumes by their scope to a restore policy.
   * Bindings must have a unique scope. Any volumes not scoped in the bindings
   * are subject to the policy defined in volume_data_restore_policy.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkebackup.v1.RestoreConfig.VolumeDataRestorePolicyBinding volume_data_restore_policy_bindings = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkebackup.v1.RestoreConfig.VolumeDataRestorePolicyBindingOrBuilder
      getVolumeDataRestorePolicyBindingsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. RestoreOrder contains custom ordering to use on a Restore.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestoreConfig.RestoreOrder restore_order = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the restoreOrder field is set.
   */
  boolean hasRestoreOrder();

  /**
   *
   *
   * <pre>
   * Optional. RestoreOrder contains custom ordering to use on a Restore.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestoreConfig.RestoreOrder restore_order = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The restoreOrder.
   */
  com.google.cloud.gkebackup.v1.RestoreConfig.RestoreOrder getRestoreOrder();

  /**
   *
   *
   * <pre>
   * Optional. RestoreOrder contains custom ordering to use on a Restore.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestoreConfig.RestoreOrder restore_order = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkebackup.v1.RestoreConfig.RestoreOrderOrBuilder getRestoreOrderOrBuilder();

  com.google.cloud.gkebackup.v1.RestoreConfig.NamespacedResourceRestoreScopeCase
      getNamespacedResourceRestoreScopeCase();
}
