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
// source: google/cloud/dataproc/v1/workflow_templates.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataproc.v1;

public interface WorkflowTemplatePlacementOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.WorkflowTemplatePlacement)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A cluster that is managed by the workflow.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ManagedCluster managed_cluster = 1;</code>
   *
   * @return Whether the managedCluster field is set.
   */
  boolean hasManagedCluster();

  /**
   *
   *
   * <pre>
   * A cluster that is managed by the workflow.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ManagedCluster managed_cluster = 1;</code>
   *
   * @return The managedCluster.
   */
  com.google.cloud.dataproc.v1.ManagedCluster getManagedCluster();

  /**
   *
   *
   * <pre>
   * A cluster that is managed by the workflow.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ManagedCluster managed_cluster = 1;</code>
   */
  com.google.cloud.dataproc.v1.ManagedClusterOrBuilder getManagedClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A selector that chooses target cluster for jobs based
   * on metadata.
   *
   * The selector is evaluated at the time each job is submitted.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ClusterSelector cluster_selector = 2;</code>
   *
   * @return Whether the clusterSelector field is set.
   */
  boolean hasClusterSelector();

  /**
   *
   *
   * <pre>
   * Optional. A selector that chooses target cluster for jobs based
   * on metadata.
   *
   * The selector is evaluated at the time each job is submitted.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ClusterSelector cluster_selector = 2;</code>
   *
   * @return The clusterSelector.
   */
  com.google.cloud.dataproc.v1.ClusterSelector getClusterSelector();

  /**
   *
   *
   * <pre>
   * Optional. A selector that chooses target cluster for jobs based
   * on metadata.
   *
   * The selector is evaluated at the time each job is submitted.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ClusterSelector cluster_selector = 2;</code>
   */
  com.google.cloud.dataproc.v1.ClusterSelectorOrBuilder getClusterSelectorOrBuilder();

  com.google.cloud.dataproc.v1.WorkflowTemplatePlacement.PlacementCase getPlacementCase();
}
