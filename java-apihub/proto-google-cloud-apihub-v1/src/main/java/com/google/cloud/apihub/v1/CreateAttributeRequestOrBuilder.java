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
// source: google/cloud/apihub/v1/apihub_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.apihub.v1;

public interface CreateAttributeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apihub.v1.CreateAttributeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource for Attribute.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The parent resource for Attribute.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The ID to use for the attribute, which will become the final
   * component of the attribute's resource name. This field is optional.
   *
   * * If provided, the same will be used. The service will throw an error if
   * the specified id is already used by another attribute resource in the API
   * hub.
   * * If not provided, a system generated id will be used.
   *
   * This value should be 4-500 characters, and valid characters
   * are /[a-z][A-Z][0-9]-_/.
   * </pre>
   *
   * <code>string attribute_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The attributeId.
   */
  java.lang.String getAttributeId();

  /**
   *
   *
   * <pre>
   * Optional. The ID to use for the attribute, which will become the final
   * component of the attribute's resource name. This field is optional.
   *
   * * If provided, the same will be used. The service will throw an error if
   * the specified id is already used by another attribute resource in the API
   * hub.
   * * If not provided, a system generated id will be used.
   *
   * This value should be 4-500 characters, and valid characters
   * are /[a-z][A-Z][0-9]-_/.
   * </pre>
   *
   * <code>string attribute_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for attributeId.
   */
  com.google.protobuf.ByteString getAttributeIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The attribute to create.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.Attribute attribute = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the attribute field is set.
   */
  boolean hasAttribute();

  /**
   *
   *
   * <pre>
   * Required. The attribute to create.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.Attribute attribute = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The attribute.
   */
  com.google.cloud.apihub.v1.Attribute getAttribute();

  /**
   *
   *
   * <pre>
   * Required. The attribute to create.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.Attribute attribute = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.apihub.v1.AttributeOrBuilder getAttributeOrBuilder();
}
