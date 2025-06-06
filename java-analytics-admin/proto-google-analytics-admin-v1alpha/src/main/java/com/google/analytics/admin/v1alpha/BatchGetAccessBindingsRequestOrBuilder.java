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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.admin.v1alpha;

public interface BatchGetAccessBindingsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.BatchGetAccessBindingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The account or property that owns the access bindings. The parent
   * of all provided values for the 'names' field must match this field.
   * Formats:
   * - accounts/{account}
   * - properties/{property}
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
   * Required. The account or property that owns the access bindings. The parent
   * of all provided values for the 'names' field must match this field.
   * Formats:
   * - accounts/{account}
   * - properties/{property}
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
   * Required. The names of the access bindings to retrieve.
   * A maximum of 1000 access bindings can be retrieved in a batch.
   * Formats:
   * - accounts/{account}/accessBindings/{accessBinding}
   * - properties/{property}/accessBindings/{accessBinding}
   * </pre>
   *
   * <code>
   * repeated string names = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the names.
   */
  java.util.List<java.lang.String> getNamesList();

  /**
   *
   *
   * <pre>
   * Required. The names of the access bindings to retrieve.
   * A maximum of 1000 access bindings can be retrieved in a batch.
   * Formats:
   * - accounts/{account}/accessBindings/{accessBinding}
   * - properties/{property}/accessBindings/{accessBinding}
   * </pre>
   *
   * <code>
   * repeated string names = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of names.
   */
  int getNamesCount();

  /**
   *
   *
   * <pre>
   * Required. The names of the access bindings to retrieve.
   * A maximum of 1000 access bindings can be retrieved in a batch.
   * Formats:
   * - accounts/{account}/accessBindings/{accessBinding}
   * - properties/{property}/accessBindings/{accessBinding}
   * </pre>
   *
   * <code>
   * repeated string names = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The names at the given index.
   */
  java.lang.String getNames(int index);

  /**
   *
   *
   * <pre>
   * Required. The names of the access bindings to retrieve.
   * A maximum of 1000 access bindings can be retrieved in a batch.
   * Formats:
   * - accounts/{account}/accessBindings/{accessBinding}
   * - properties/{property}/accessBindings/{accessBinding}
   * </pre>
   *
   * <code>
   * repeated string names = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the names at the given index.
   */
  com.google.protobuf.ByteString getNamesBytes(int index);
}
