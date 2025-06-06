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
// source: google/cloud/orchestration/airflow/service/v1beta1/environments.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.orchestration.airflow.service.v1beta1;

public interface LoadSnapshotRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.LoadSnapshotRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the target environment in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
   * </pre>
   *
   * <code>string environment = 1;</code>
   *
   * @return The environment.
   */
  java.lang.String getEnvironment();

  /**
   *
   *
   * <pre>
   * The resource name of the target environment in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
   * </pre>
   *
   * <code>string environment = 1;</code>
   *
   * @return The bytes for environment.
   */
  com.google.protobuf.ByteString getEnvironmentBytes();

  /**
   *
   *
   * <pre>
   * A Cloud Storage path to a snapshot to load, e.g.:
   * "gs://my-bucket/snapshots/project_location_environment_timestamp".
   * </pre>
   *
   * <code>string snapshot_path = 2;</code>
   *
   * @return The snapshotPath.
   */
  java.lang.String getSnapshotPath();

  /**
   *
   *
   * <pre>
   * A Cloud Storage path to a snapshot to load, e.g.:
   * "gs://my-bucket/snapshots/project_location_environment_timestamp".
   * </pre>
   *
   * <code>string snapshot_path = 2;</code>
   *
   * @return The bytes for snapshotPath.
   */
  com.google.protobuf.ByteString getSnapshotPathBytes();

  /**
   *
   *
   * <pre>
   * Whether or not to skip installing Pypi packages when loading the
   * environment's state.
   * </pre>
   *
   * <code>bool skip_pypi_packages_installation = 3;</code>
   *
   * @return The skipPypiPackagesInstallation.
   */
  boolean getSkipPypiPackagesInstallation();

  /**
   *
   *
   * <pre>
   * Whether or not to skip setting environment variables when loading the
   * environment's state.
   * </pre>
   *
   * <code>bool skip_environment_variables_setting = 4;</code>
   *
   * @return The skipEnvironmentVariablesSetting.
   */
  boolean getSkipEnvironmentVariablesSetting();

  /**
   *
   *
   * <pre>
   * Whether or not to skip setting Airflow overrides when loading the
   * environment's state.
   * </pre>
   *
   * <code>bool skip_airflow_overrides_setting = 5;</code>
   *
   * @return The skipAirflowOverridesSetting.
   */
  boolean getSkipAirflowOverridesSetting();

  /**
   *
   *
   * <pre>
   * Whether or not to skip copying Cloud Storage data when loading the
   * environment's state.
   * </pre>
   *
   * <code>bool skip_gcs_data_copying = 6;</code>
   *
   * @return The skipGcsDataCopying.
   */
  boolean getSkipGcsDataCopying();
}
