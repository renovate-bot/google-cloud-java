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

public interface WebServerConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.WebServerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Machine type on which Airflow web server is running.
   * It has to be one of: composer-n1-webserver-2, composer-n1-webserver-4 or
   * composer-n1-webserver-8.
   * If not specified, composer-n1-webserver-2 will be used.
   * Value custom is returned only in response, if Airflow web server parameters
   * were manually changed to a non-standard values.
   * </pre>
   *
   * <code>string machine_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The machineType.
   */
  java.lang.String getMachineType();

  /**
   *
   *
   * <pre>
   * Optional. Machine type on which Airflow web server is running.
   * It has to be one of: composer-n1-webserver-2, composer-n1-webserver-4 or
   * composer-n1-webserver-8.
   * If not specified, composer-n1-webserver-2 will be used.
   * Value custom is returned only in response, if Airflow web server parameters
   * were manually changed to a non-standard values.
   * </pre>
   *
   * <code>string machine_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString getMachineTypeBytes();
}
