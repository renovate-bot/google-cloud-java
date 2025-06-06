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
// source: google/cloud/gkehub/v1alpha/configmanagement/configmanagement.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkehub.configmanagement.v1alpha;

public interface ConfigSyncDeploymentStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1alpha.ConfigSyncDeploymentState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Deployment state of the importer pod
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState importer = 1;</code>
   *
   * @return The enum numeric value on the wire for importer.
   */
  int getImporterValue();

  /**
   *
   *
   * <pre>
   * Deployment state of the importer pod
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState importer = 1;</code>
   *
   * @return The importer.
   */
  com.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState getImporter();

  /**
   *
   *
   * <pre>
   * Deployment state of the syncer pod
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState syncer = 2;</code>
   *
   * @return The enum numeric value on the wire for syncer.
   */
  int getSyncerValue();

  /**
   *
   *
   * <pre>
   * Deployment state of the syncer pod
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState syncer = 2;</code>
   *
   * @return The syncer.
   */
  com.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState getSyncer();

  /**
   *
   *
   * <pre>
   * Deployment state of the git-sync pod
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState git_sync = 3;</code>
   *
   * @return The enum numeric value on the wire for gitSync.
   */
  int getGitSyncValue();

  /**
   *
   *
   * <pre>
   * Deployment state of the git-sync pod
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState git_sync = 3;</code>
   *
   * @return The gitSync.
   */
  com.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState getGitSync();

  /**
   *
   *
   * <pre>
   * Deployment state of the monitor pod
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState monitor = 4;</code>
   *
   * @return The enum numeric value on the wire for monitor.
   */
  int getMonitorValue();

  /**
   *
   *
   * <pre>
   * Deployment state of the monitor pod
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState monitor = 4;</code>
   *
   * @return The monitor.
   */
  com.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState getMonitor();

  /**
   *
   *
   * <pre>
   * Deployment state of reconciler-manager pod
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState reconciler_manager = 5;
   * </code>
   *
   * @return The enum numeric value on the wire for reconcilerManager.
   */
  int getReconcilerManagerValue();

  /**
   *
   *
   * <pre>
   * Deployment state of reconciler-manager pod
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState reconciler_manager = 5;
   * </code>
   *
   * @return The reconcilerManager.
   */
  com.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState getReconcilerManager();

  /**
   *
   *
   * <pre>
   * Deployment state of root-reconciler
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState root_reconciler = 6;</code>
   *
   * @return The enum numeric value on the wire for rootReconciler.
   */
  int getRootReconcilerValue();

  /**
   *
   *
   * <pre>
   * Deployment state of root-reconciler
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState root_reconciler = 6;</code>
   *
   * @return The rootReconciler.
   */
  com.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState getRootReconciler();
}
