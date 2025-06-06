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

public interface ExecuteAirflowCommandRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.ExecuteAirflowCommandRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the environment in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}".
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
   * The resource name of the environment in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}".
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
   * Airflow command.
   * </pre>
   *
   * <code>string command = 2;</code>
   *
   * @return The command.
   */
  java.lang.String getCommand();

  /**
   *
   *
   * <pre>
   * Airflow command.
   * </pre>
   *
   * <code>string command = 2;</code>
   *
   * @return The bytes for command.
   */
  com.google.protobuf.ByteString getCommandBytes();

  /**
   *
   *
   * <pre>
   * Airflow subcommand.
   * </pre>
   *
   * <code>string subcommand = 3;</code>
   *
   * @return The subcommand.
   */
  java.lang.String getSubcommand();

  /**
   *
   *
   * <pre>
   * Airflow subcommand.
   * </pre>
   *
   * <code>string subcommand = 3;</code>
   *
   * @return The bytes for subcommand.
   */
  com.google.protobuf.ByteString getSubcommandBytes();

  /**
   *
   *
   * <pre>
   * Parameters for the Airflow command/subcommand as an array of arguments.
   * It may contain positional arguments like `["my-dag-id"]`, key-value
   * parameters like `["--foo=bar"]` or `["--foo","bar"]`,
   * or other flags like `["-f"]`.
   * </pre>
   *
   * <code>repeated string parameters = 4;</code>
   *
   * @return A list containing the parameters.
   */
  java.util.List<java.lang.String> getParametersList();

  /**
   *
   *
   * <pre>
   * Parameters for the Airflow command/subcommand as an array of arguments.
   * It may contain positional arguments like `["my-dag-id"]`, key-value
   * parameters like `["--foo=bar"]` or `["--foo","bar"]`,
   * or other flags like `["-f"]`.
   * </pre>
   *
   * <code>repeated string parameters = 4;</code>
   *
   * @return The count of parameters.
   */
  int getParametersCount();

  /**
   *
   *
   * <pre>
   * Parameters for the Airflow command/subcommand as an array of arguments.
   * It may contain positional arguments like `["my-dag-id"]`, key-value
   * parameters like `["--foo=bar"]` or `["--foo","bar"]`,
   * or other flags like `["-f"]`.
   * </pre>
   *
   * <code>repeated string parameters = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The parameters at the given index.
   */
  java.lang.String getParameters(int index);

  /**
   *
   *
   * <pre>
   * Parameters for the Airflow command/subcommand as an array of arguments.
   * It may contain positional arguments like `["my-dag-id"]`, key-value
   * parameters like `["--foo=bar"]` or `["--foo","bar"]`,
   * or other flags like `["-f"]`.
   * </pre>
   *
   * <code>repeated string parameters = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the parameters at the given index.
   */
  com.google.protobuf.ByteString getParametersBytes(int index);
}
