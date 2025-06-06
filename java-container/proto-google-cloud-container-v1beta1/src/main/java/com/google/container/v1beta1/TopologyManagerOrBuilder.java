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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.8
package com.google.container.v1beta1;

public interface TopologyManagerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.TopologyManager)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Configures the strategy for resource alignment.
   * Allowed values are:
   *
   * * none: the default policy, and does not perform any topology alignment.
   * * restricted: the topology manager stores the preferred NUMA node affinity
   * for the container, and will reject the pod if the affinity if not
   * preferred.
   * * best-effort: the topology manager stores the preferred NUMA node affinity
   * for the container. If the affinity is not preferred, the topology manager
   * will admit the pod to the node anyway.
   * * single-numa-node: the topology manager determines if the single NUMA node
   * affinity is possible. If it is, Topology Manager will store this and the
   * Hint Providers can then use this information when making the resource
   * allocation decision. If, however, this is not possible then the
   * Topology Manager will reject the pod from the node. This will result in a
   * pod in a Terminated state with a pod admission failure.
   *
   * The default policy value is 'none' if unspecified.
   * Details about each strategy can be found
   * [here](https://kubernetes.io/docs/tasks/administer-cluster/topology-manager/#topology-manager-policies).
   * </pre>
   *
   * <code>string policy = 1;</code>
   *
   * @return The policy.
   */
  java.lang.String getPolicy();

  /**
   *
   *
   * <pre>
   * Configures the strategy for resource alignment.
   * Allowed values are:
   *
   * * none: the default policy, and does not perform any topology alignment.
   * * restricted: the topology manager stores the preferred NUMA node affinity
   * for the container, and will reject the pod if the affinity if not
   * preferred.
   * * best-effort: the topology manager stores the preferred NUMA node affinity
   * for the container. If the affinity is not preferred, the topology manager
   * will admit the pod to the node anyway.
   * * single-numa-node: the topology manager determines if the single NUMA node
   * affinity is possible. If it is, Topology Manager will store this and the
   * Hint Providers can then use this information when making the resource
   * allocation decision. If, however, this is not possible then the
   * Topology Manager will reject the pod from the node. This will result in a
   * pod in a Terminated state with a pod admission failure.
   *
   * The default policy value is 'none' if unspecified.
   * Details about each strategy can be found
   * [here](https://kubernetes.io/docs/tasks/administer-cluster/topology-manager/#topology-manager-policies).
   * </pre>
   *
   * <code>string policy = 1;</code>
   *
   * @return The bytes for policy.
   */
  com.google.protobuf.ByteString getPolicyBytes();

  /**
   *
   *
   * <pre>
   * The Topology Manager aligns resources in following scopes:
   *
   * * container
   * * pod
   *
   * The default scope is 'container' if unspecified.
   * See
   * https://kubernetes.io/docs/tasks/administer-cluster/topology-manager/#topology-manager-scopes
   * </pre>
   *
   * <code>string scope = 2;</code>
   *
   * @return The scope.
   */
  java.lang.String getScope();

  /**
   *
   *
   * <pre>
   * The Topology Manager aligns resources in following scopes:
   *
   * * container
   * * pod
   *
   * The default scope is 'container' if unspecified.
   * See
   * https://kubernetes.io/docs/tasks/administer-cluster/topology-manager/#topology-manager-scopes
   * </pre>
   *
   * <code>string scope = 2;</code>
   *
   * @return The bytes for scope.
   */
  com.google.protobuf.ByteString getScopeBytes();
}
