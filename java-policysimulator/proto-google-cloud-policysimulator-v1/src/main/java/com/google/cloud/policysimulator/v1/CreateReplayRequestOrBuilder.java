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
// source: google/cloud/policysimulator/v1/simulator.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.policysimulator.v1;

public interface CreateReplayRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.policysimulator.v1.CreateReplayRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource where this
   * [Replay][google.cloud.policysimulator.v1.Replay] will be created. This
   * resource must be a project, folder, or organization with a location.
   *
   * Example: `projects/my-example-project/locations/global`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The parent resource where this
   * [Replay][google.cloud.policysimulator.v1.Replay] will be created. This
   * resource must be a project, folder, or organization with a location.
   *
   * Example: `projects/my-example-project/locations/global`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The [Replay][google.cloud.policysimulator.v1.Replay] to create.
   * Set `Replay.ReplayConfig` to configure the replay.
   * </pre>
   *
   * <code>
   * .google.cloud.policysimulator.v1.Replay replay = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the replay field is set.
   */
  boolean hasReplay();

  /**
   *
   *
   * <pre>
   * Required. The [Replay][google.cloud.policysimulator.v1.Replay] to create.
   * Set `Replay.ReplayConfig` to configure the replay.
   * </pre>
   *
   * <code>
   * .google.cloud.policysimulator.v1.Replay replay = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The replay.
   */
  com.google.cloud.policysimulator.v1.Replay getReplay();

  /**
   *
   *
   * <pre>
   * Required. The [Replay][google.cloud.policysimulator.v1.Replay] to create.
   * Set `Replay.ReplayConfig` to configure the replay.
   * </pre>
   *
   * <code>
   * .google.cloud.policysimulator.v1.Replay replay = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.policysimulator.v1.ReplayOrBuilder getReplayOrBuilder();
}
