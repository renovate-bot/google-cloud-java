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
// source: google/cloud/dataplex/v1/data_taxonomy.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataplex.v1;

public interface DeleteDataAttributeBindingRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.DeleteDataAttributeBindingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the DataAttributeBinding:
   * projects/{project_number}/locations/{location_id}/dataAttributeBindings/{data_attribute_binding_id}
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the DataAttributeBinding:
   * projects/{project_number}/locations/{location_id}/dataAttributeBindings/{data_attribute_binding_id}
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. If the client provided etag value does not match the current etag
   * value, the DeleteDataAttributeBindingRequest method returns an ABORTED
   * error response. Etags must be used when calling the
   * DeleteDataAttributeBinding.
   * </pre>
   *
   * <code>string etag = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * Required. If the client provided etag value does not match the current etag
   * value, the DeleteDataAttributeBindingRequest method returns an ABORTED
   * error response. Etags must be used when calling the
   * DeleteDataAttributeBinding.
   * </pre>
   *
   * <code>string etag = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
