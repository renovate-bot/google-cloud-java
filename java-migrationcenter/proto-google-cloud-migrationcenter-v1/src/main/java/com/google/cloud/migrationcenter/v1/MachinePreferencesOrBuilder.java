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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.migrationcenter.v1;

public interface MachinePreferencesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.MachinePreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Compute Engine machine series to consider for insights and recommendations.
   * If empty, no restriction is applied on the machine series.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.MachineSeries allowed_machine_series = 1;
   * </code>
   */
  java.util.List<com.google.cloud.migrationcenter.v1.MachineSeries> getAllowedMachineSeriesList();

  /**
   *
   *
   * <pre>
   * Compute Engine machine series to consider for insights and recommendations.
   * If empty, no restriction is applied on the machine series.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.MachineSeries allowed_machine_series = 1;
   * </code>
   */
  com.google.cloud.migrationcenter.v1.MachineSeries getAllowedMachineSeries(int index);

  /**
   *
   *
   * <pre>
   * Compute Engine machine series to consider for insights and recommendations.
   * If empty, no restriction is applied on the machine series.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.MachineSeries allowed_machine_series = 1;
   * </code>
   */
  int getAllowedMachineSeriesCount();

  /**
   *
   *
   * <pre>
   * Compute Engine machine series to consider for insights and recommendations.
   * If empty, no restriction is applied on the machine series.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.MachineSeries allowed_machine_series = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.migrationcenter.v1.MachineSeriesOrBuilder>
      getAllowedMachineSeriesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Compute Engine machine series to consider for insights and recommendations.
   * If empty, no restriction is applied on the machine series.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.MachineSeries allowed_machine_series = 1;
   * </code>
   */
  com.google.cloud.migrationcenter.v1.MachineSeriesOrBuilder getAllowedMachineSeriesOrBuilder(
      int index);
}
