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
// source: google/devtools/artifactregistry/v1/tag.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.artifactregistry.v1;

public interface TagOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.Tag)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the tag, for example:
   * "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/tags/tag1".
   * If the package part contains slashes, the slashes are escaped.
   * The tag part can only have characters in [a-zA-Z0-9&#92;-._~:&#64;], anything else
   * must be URL encoded.
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
   * The name of the tag, for example:
   * "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/tags/tag1".
   * If the package part contains slashes, the slashes are escaped.
   * The tag part can only have characters in [a-zA-Z0-9&#92;-._~:&#64;], anything else
   * must be URL encoded.
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
   * The name of the version the tag refers to, for example:
   * `projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/sha256:5243811`
   * If the package or version ID parts contain slashes, the slashes are
   * escaped.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();

  /**
   *
   *
   * <pre>
   * The name of the version the tag refers to, for example:
   * `projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/sha256:5243811`
   * If the package or version ID parts contain slashes, the slashes are
   * escaped.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();
}
