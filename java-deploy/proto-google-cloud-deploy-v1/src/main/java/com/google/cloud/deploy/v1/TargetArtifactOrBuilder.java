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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.deploy.v1;

public interface TargetArtifactOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.TargetArtifact)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. URI of a directory containing the artifacts. This contains
   * deployment configuration used by Skaffold during a rollout, and all
   * paths are relative to this location.
   * </pre>
   *
   * <code>string artifact_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the artifactUri field is set.
   */
  boolean hasArtifactUri();

  /**
   *
   *
   * <pre>
   * Output only. URI of a directory containing the artifacts. This contains
   * deployment configuration used by Skaffold during a rollout, and all
   * paths are relative to this location.
   * </pre>
   *
   * <code>string artifact_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The artifactUri.
   */
  java.lang.String getArtifactUri();

  /**
   *
   *
   * <pre>
   * Output only. URI of a directory containing the artifacts. This contains
   * deployment configuration used by Skaffold during a rollout, and all
   * paths are relative to this location.
   * </pre>
   *
   * <code>string artifact_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for artifactUri.
   */
  com.google.protobuf.ByteString getArtifactUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. File path of the resolved Skaffold configuration for the
   * stable phase, relative to the URI.
   * </pre>
   *
   * <code>string skaffold_config_path = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The skaffoldConfigPath.
   */
  java.lang.String getSkaffoldConfigPath();

  /**
   *
   *
   * <pre>
   * Output only. File path of the resolved Skaffold configuration for the
   * stable phase, relative to the URI.
   * </pre>
   *
   * <code>string skaffold_config_path = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for skaffoldConfigPath.
   */
  com.google.protobuf.ByteString getSkaffoldConfigPathBytes();

  /**
   *
   *
   * <pre>
   * Output only. File path of the rendered manifest relative to the URI for the
   * stable phase.
   * </pre>
   *
   * <code>string manifest_path = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The manifestPath.
   */
  java.lang.String getManifestPath();

  /**
   *
   *
   * <pre>
   * Output only. File path of the rendered manifest relative to the URI for the
   * stable phase.
   * </pre>
   *
   * <code>string manifest_path = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for manifestPath.
   */
  com.google.protobuf.ByteString getManifestPathBytes();

  /**
   *
   *
   * <pre>
   * Output only. Map from the phase ID to the phase artifacts for the `Target`.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.deploy.v1.TargetArtifact.PhaseArtifact&gt; phase_artifacts = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getPhaseArtifactsCount();

  /**
   *
   *
   * <pre>
   * Output only. Map from the phase ID to the phase artifacts for the `Target`.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.deploy.v1.TargetArtifact.PhaseArtifact&gt; phase_artifacts = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsPhaseArtifacts(java.lang.String key);

  /** Use {@link #getPhaseArtifactsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.deploy.v1.TargetArtifact.PhaseArtifact>
      getPhaseArtifacts();

  /**
   *
   *
   * <pre>
   * Output only. Map from the phase ID to the phase artifacts for the `Target`.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.deploy.v1.TargetArtifact.PhaseArtifact&gt; phase_artifacts = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.deploy.v1.TargetArtifact.PhaseArtifact>
      getPhaseArtifactsMap();

  /**
   *
   *
   * <pre>
   * Output only. Map from the phase ID to the phase artifacts for the `Target`.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.deploy.v1.TargetArtifact.PhaseArtifact&gt; phase_artifacts = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  /* nullable */
  com.google.cloud.deploy.v1.TargetArtifact.PhaseArtifact getPhaseArtifactsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.deploy.v1.TargetArtifact.PhaseArtifact defaultValue);

  /**
   *
   *
   * <pre>
   * Output only. Map from the phase ID to the phase artifacts for the `Target`.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.deploy.v1.TargetArtifact.PhaseArtifact&gt; phase_artifacts = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.TargetArtifact.PhaseArtifact getPhaseArtifactsOrThrow(
      java.lang.String key);

  com.google.cloud.deploy.v1.TargetArtifact.UriCase getUriCase();
}
