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
// source: google/cloud/gkehub/v1alpha/feature.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkehub.v1alpha;

public interface CommonFeatureStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1alpha.CommonFeatureState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Service Mesh-specific state.
   * </pre>
   *
   * <code>.google.cloud.gkehub.servicemesh.v1alpha.FeatureState servicemesh = 100;</code>
   *
   * @return Whether the servicemesh field is set.
   */
  boolean hasServicemesh();

  /**
   *
   *
   * <pre>
   * Service Mesh-specific state.
   * </pre>
   *
   * <code>.google.cloud.gkehub.servicemesh.v1alpha.FeatureState servicemesh = 100;</code>
   *
   * @return The servicemesh.
   */
  com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState getServicemesh();

  /**
   *
   *
   * <pre>
   * Service Mesh-specific state.
   * </pre>
   *
   * <code>.google.cloud.gkehub.servicemesh.v1alpha.FeatureState servicemesh = 100;</code>
   */
  com.google.cloud.gkehub.servicemesh.v1alpha.FeatureStateOrBuilder getServicemeshOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The "running state" of the Feature in this Hub.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1alpha.FeatureState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the state field is set.
   */
  boolean hasState();

  /**
   *
   *
   * <pre>
   * Output only. The "running state" of the Feature in this Hub.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1alpha.FeatureState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.gkehub.v1alpha.FeatureState getState();

  /**
   *
   *
   * <pre>
   * Output only. The "running state" of the Feature in this Hub.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1alpha.FeatureState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkehub.v1alpha.FeatureStateOrBuilder getStateOrBuilder();

  com.google.cloud.gkehub.v1alpha.CommonFeatureState.FeatureStateCase getFeatureStateCase();
}
