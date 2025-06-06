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

public interface GuestInstalledApplicationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.GuestInstalledApplication)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Installed application name.
   * </pre>
   *
   * <code>string application_name = 1;</code>
   *
   * @return The applicationName.
   */
  java.lang.String getApplicationName();

  /**
   *
   *
   * <pre>
   * Installed application name.
   * </pre>
   *
   * <code>string application_name = 1;</code>
   *
   * @return The bytes for applicationName.
   */
  com.google.protobuf.ByteString getApplicationNameBytes();

  /**
   *
   *
   * <pre>
   * Installed application vendor.
   * </pre>
   *
   * <code>string vendor = 2;</code>
   *
   * @return The vendor.
   */
  java.lang.String getVendor();

  /**
   *
   *
   * <pre>
   * Installed application vendor.
   * </pre>
   *
   * <code>string vendor = 2;</code>
   *
   * @return The bytes for vendor.
   */
  com.google.protobuf.ByteString getVendorBytes();

  /**
   *
   *
   * <pre>
   * The time when the application was installed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp install_time = 3;</code>
   *
   * @return Whether the installTime field is set.
   */
  boolean hasInstallTime();

  /**
   *
   *
   * <pre>
   * The time when the application was installed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp install_time = 3;</code>
   *
   * @return The installTime.
   */
  com.google.protobuf.Timestamp getInstallTime();

  /**
   *
   *
   * <pre>
   * The time when the application was installed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp install_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getInstallTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Source path.
   * </pre>
   *
   * <code>string path = 4;</code>
   *
   * @return The path.
   */
  java.lang.String getPath();

  /**
   *
   *
   * <pre>
   * Source path.
   * </pre>
   *
   * <code>string path = 4;</code>
   *
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString getPathBytes();

  /**
   *
   *
   * <pre>
   * Installed application version.
   * </pre>
   *
   * <code>string version = 5;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();

  /**
   *
   *
   * <pre>
   * Installed application version.
   * </pre>
   *
   * <code>string version = 5;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();
}
