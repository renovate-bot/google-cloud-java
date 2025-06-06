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
// source: google/cloud/lifesciences/v2beta/workflows.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.lifesciences.v2beta;

public interface PersistentDiskOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.lifesciences.v2beta.PersistentDisk)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The size, in GB, of the disk to attach. If the size is not
   * specified, a default is chosen to ensure reasonable I/O performance.
   *
   * If the disk type is specified as `local-ssd`, multiple local drives are
   * automatically combined to provide the requested size. Note, however, that
   * each physical SSD is 375GB in size, and no more than 8 drives can be
   * attached to a single instance.
   * </pre>
   *
   * <code>int32 size_gb = 1;</code>
   *
   * @return The sizeGb.
   */
  int getSizeGb();

  /**
   *
   *
   * <pre>
   * The Compute Engine disk type. If unspecified, `pd-standard` is used.
   * </pre>
   *
   * <code>string type = 2;</code>
   *
   * @return The type.
   */
  java.lang.String getType();

  /**
   *
   *
   * <pre>
   * The Compute Engine disk type. If unspecified, `pd-standard` is used.
   * </pre>
   *
   * <code>string type = 2;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * An image to put on the disk before attaching it to the VM.
   * </pre>
   *
   * <code>string source_image = 3;</code>
   *
   * @return The sourceImage.
   */
  java.lang.String getSourceImage();

  /**
   *
   *
   * <pre>
   * An image to put on the disk before attaching it to the VM.
   * </pre>
   *
   * <code>string source_image = 3;</code>
   *
   * @return The bytes for sourceImage.
   */
  com.google.protobuf.ByteString getSourceImageBytes();
}
