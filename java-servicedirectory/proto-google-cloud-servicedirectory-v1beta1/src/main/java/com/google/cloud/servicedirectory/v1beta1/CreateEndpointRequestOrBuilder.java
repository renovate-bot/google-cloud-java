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
// source: google/cloud/servicedirectory/v1beta1/registration_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.servicedirectory.v1beta1;

public interface CreateEndpointRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.servicedirectory.v1beta1.CreateEndpointRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the service that this endpoint provides.
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
   * Required. The resource name of the service that this endpoint provides.
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
   * Required. The Resource ID must be 1-63 characters long, and comply with
   * &lt;a href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
   * Specifically, the name must be 1-63 characters long and match the regular
   * expression `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which
   * cannot be a dash.
   * </pre>
   *
   * <code>string endpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The endpointId.
   */
  java.lang.String getEndpointId();

  /**
   *
   *
   * <pre>
   * Required. The Resource ID must be 1-63 characters long, and comply with
   * &lt;a href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
   * Specifically, the name must be 1-63 characters long and match the regular
   * expression `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which
   * cannot be a dash.
   * </pre>
   *
   * <code>string endpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for endpointId.
   */
  com.google.protobuf.ByteString getEndpointIdBytes();

  /**
   *
   *
   * <pre>
   * Required. A endpoint with initial fields set.
   * </pre>
   *
   * <code>
   * .google.cloud.servicedirectory.v1beta1.Endpoint endpoint = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the endpoint field is set.
   */
  boolean hasEndpoint();

  /**
   *
   *
   * <pre>
   * Required. A endpoint with initial fields set.
   * </pre>
   *
   * <code>
   * .google.cloud.servicedirectory.v1beta1.Endpoint endpoint = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The endpoint.
   */
  com.google.cloud.servicedirectory.v1beta1.Endpoint getEndpoint();

  /**
   *
   *
   * <pre>
   * Required. A endpoint with initial fields set.
   * </pre>
   *
   * <code>
   * .google.cloud.servicedirectory.v1beta1.Endpoint endpoint = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.servicedirectory.v1beta1.EndpointOrBuilder getEndpointOrBuilder();
}
