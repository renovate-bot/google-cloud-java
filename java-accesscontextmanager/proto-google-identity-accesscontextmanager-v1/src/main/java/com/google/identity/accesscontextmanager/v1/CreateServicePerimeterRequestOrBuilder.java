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
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

// Protobuf Java Version: 3.25.8
package com.google.identity.accesscontextmanager.v1;

public interface CreateServicePerimeterRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.identity.accesscontextmanager.v1.CreateServicePerimeterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name for the access policy which owns this [Service
   * Perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter].
   *
   * Format: `accessPolicies/{policy_id}`
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
   * Required. Resource name for the access policy which owns this [Service
   * Perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter].
   *
   * Format: `accessPolicies/{policy_id}`
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
   * Required. The [Service Perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] to create.
   * Syntactic correctness of the [Service Perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] is a
   * precondition for creation.
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeter = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the servicePerimeter field is set.
   */
  boolean hasServicePerimeter();

  /**
   *
   *
   * <pre>
   * Required. The [Service Perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] to create.
   * Syntactic correctness of the [Service Perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] is a
   * precondition for creation.
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeter = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The servicePerimeter.
   */
  com.google.identity.accesscontextmanager.v1.ServicePerimeter getServicePerimeter();

  /**
   *
   *
   * <pre>
   * Required. The [Service Perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] to create.
   * Syntactic correctness of the [Service Perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] is a
   * precondition for creation.
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeter = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.identity.accesscontextmanager.v1.ServicePerimeterOrBuilder
      getServicePerimeterOrBuilder();
}
