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
// source: google/cloud/gkebackup/v1/common.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkebackup.v1;

public interface NamespacedNameOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.v1.NamespacedName)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The Namespace of the Kubernetes resource.
   * </pre>
   *
   * <code>string namespace = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The namespace.
   */
  java.lang.String getNamespace();

  /**
   *
   *
   * <pre>
   * Optional. The Namespace of the Kubernetes resource.
   * </pre>
   *
   * <code>string namespace = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString getNamespaceBytes();

  /**
   *
   *
   * <pre>
   * Optional. The name of the Kubernetes resource.
   * </pre>
   *
   * <code>string name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Optional. The name of the Kubernetes resource.
   * </pre>
   *
   * <code>string name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
