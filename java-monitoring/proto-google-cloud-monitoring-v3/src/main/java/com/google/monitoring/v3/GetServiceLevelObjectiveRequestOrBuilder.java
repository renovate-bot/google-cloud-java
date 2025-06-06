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
// source: google/monitoring/v3/service_service.proto

// Protobuf Java Version: 3.25.8
package com.google.monitoring.v3;

public interface GetServiceLevelObjectiveRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.GetServiceLevelObjectiveRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the `ServiceLevelObjective` to get. The format
   * is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. Resource name of the `ServiceLevelObjective` to get. The format
   * is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * View of the `ServiceLevelObjective` to return. If `DEFAULT`, return the
   * `ServiceLevelObjective` as originally defined. If `EXPLICIT` and the
   * `ServiceLevelObjective` is defined in terms of a `BasicSli`, replace the
   * `BasicSli` with a `RequestBasedSli` spelling out how the SLI is computed.
   * </pre>
   *
   * <code>.google.monitoring.v3.ServiceLevelObjective.View view = 2;</code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();

  /**
   *
   *
   * <pre>
   * View of the `ServiceLevelObjective` to return. If `DEFAULT`, return the
   * `ServiceLevelObjective` as originally defined. If `EXPLICIT` and the
   * `ServiceLevelObjective` is defined in terms of a `BasicSli`, replace the
   * `BasicSli` with a `RequestBasedSli` spelling out how the SLI is computed.
   * </pre>
   *
   * <code>.google.monitoring.v3.ServiceLevelObjective.View view = 2;</code>
   *
   * @return The view.
   */
  com.google.monitoring.v3.ServiceLevelObjective.View getView();
}
