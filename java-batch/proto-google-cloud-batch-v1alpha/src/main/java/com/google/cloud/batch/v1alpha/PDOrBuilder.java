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
// source: google/cloud/batch/v1alpha/volume.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.batch.v1alpha;

public interface PDOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.PD)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * PD disk name, e.g. pd-1.
   * </pre>
   *
   * <code>string disk = 1;</code>
   *
   * @return The disk.
   */
  java.lang.String getDisk();

  /**
   *
   *
   * <pre>
   * PD disk name, e.g. pd-1.
   * </pre>
   *
   * <code>string disk = 1;</code>
   *
   * @return The bytes for disk.
   */
  com.google.protobuf.ByteString getDiskBytes();

  /**
   *
   *
   * <pre>
   * PD device name, e.g. persistent-disk-1.
   * </pre>
   *
   * <code>string device = 2;</code>
   *
   * @return The device.
   */
  java.lang.String getDevice();

  /**
   *
   *
   * <pre>
   * PD device name, e.g. persistent-disk-1.
   * </pre>
   *
   * <code>string device = 2;</code>
   *
   * @return The bytes for device.
   */
  com.google.protobuf.ByteString getDeviceBytes();

  /**
   *
   *
   * <pre>
   * Whether this is an existing PD. Default is false. If false, i.e., new
   * PD, we will format it into ext4 and mount to the given path. If true, i.e.,
   * existing PD, it should be in ext4 format and we will mount it to the given
   * path.
   * </pre>
   *
   * <code>bool existing = 3 [deprecated = true];</code>
   *
   * @deprecated google.cloud.batch.v1alpha.PD.existing is deprecated. See
   *     google/cloud/batch/v1alpha/volume.proto;l=89
   * @return The existing.
   */
  @java.lang.Deprecated
  boolean getExisting();
}
