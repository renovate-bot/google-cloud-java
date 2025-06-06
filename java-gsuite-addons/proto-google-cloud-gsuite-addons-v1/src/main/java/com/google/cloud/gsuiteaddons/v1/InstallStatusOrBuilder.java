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
// source: google/cloud/gsuiteaddons/v1/gsuiteaddons.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gsuiteaddons.v1;

public interface InstallStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gsuiteaddons.v1.InstallStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The canonical full resource name of the deployment install status.
   *
   * Example:  `projects/123/deployments/my_deployment/installStatus`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * The canonical full resource name of the deployment install status.
   *
   * Example:  `projects/123/deployments/my_deployment/installStatus`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * True if the deployment is installed for the user
   * </pre>
   *
   * <code>.google.protobuf.BoolValue installed = 2;</code>
   *
   * @return Whether the installed field is set.
   */
  boolean hasInstalled();

  /**
   *
   *
   * <pre>
   * True if the deployment is installed for the user
   * </pre>
   *
   * <code>.google.protobuf.BoolValue installed = 2;</code>
   *
   * @return The installed.
   */
  com.google.protobuf.BoolValue getInstalled();

  /**
   *
   *
   * <pre>
   * True if the deployment is installed for the user
   * </pre>
   *
   * <code>.google.protobuf.BoolValue installed = 2;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getInstalledOrBuilder();
}
