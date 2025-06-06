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
// source: google/cloud/memorystore/v1/memorystore.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.memorystore.v1;

public interface CertificateAuthorityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.memorystore.v1.CertificateAuthority)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A managed server certificate authority.
   * </pre>
   *
   * <code>
   * .google.cloud.memorystore.v1.CertificateAuthority.ManagedCertificateAuthority managed_server_ca = 2;
   * </code>
   *
   * @return Whether the managedServerCa field is set.
   */
  boolean hasManagedServerCa();

  /**
   *
   *
   * <pre>
   * A managed server certificate authority.
   * </pre>
   *
   * <code>
   * .google.cloud.memorystore.v1.CertificateAuthority.ManagedCertificateAuthority managed_server_ca = 2;
   * </code>
   *
   * @return The managedServerCa.
   */
  com.google.cloud.memorystore.v1.CertificateAuthority.ManagedCertificateAuthority
      getManagedServerCa();

  /**
   *
   *
   * <pre>
   * A managed server certificate authority.
   * </pre>
   *
   * <code>
   * .google.cloud.memorystore.v1.CertificateAuthority.ManagedCertificateAuthority managed_server_ca = 2;
   * </code>
   */
  com.google.cloud.memorystore.v1.CertificateAuthority.ManagedCertificateAuthorityOrBuilder
      getManagedServerCaOrBuilder();

  /**
   *
   *
   * <pre>
   * Identifier. Unique name of the certificate authority.
   * Format:
   * projects/{project}/locations/{location}/instances/{instance}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. Unique name of the certificate authority.
   * Format:
   * projects/{project}/locations/{location}/instances/{instance}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  com.google.cloud.memorystore.v1.CertificateAuthority.ServerCaCase getServerCaCase();
}
