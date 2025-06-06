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
// source: google/cloud/websecurityscanner/v1alpha/finding_addon.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.websecurityscanner.v1alpha;

public interface ViolatingResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1alpha.ViolatingResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The MIME type of this resource.
   * </pre>
   *
   * <code>string content_type = 1;</code>
   *
   * @return The contentType.
   */
  java.lang.String getContentType();

  /**
   *
   *
   * <pre>
   * The MIME type of this resource.
   * </pre>
   *
   * <code>string content_type = 1;</code>
   *
   * @return The bytes for contentType.
   */
  com.google.protobuf.ByteString getContentTypeBytes();

  /**
   *
   *
   * <pre>
   * URL of this violating resource.
   * </pre>
   *
   * <code>string resource_url = 2;</code>
   *
   * @return The resourceUrl.
   */
  java.lang.String getResourceUrl();

  /**
   *
   *
   * <pre>
   * URL of this violating resource.
   * </pre>
   *
   * <code>string resource_url = 2;</code>
   *
   * @return The bytes for resourceUrl.
   */
  com.google.protobuf.ByteString getResourceUrlBytes();
}
