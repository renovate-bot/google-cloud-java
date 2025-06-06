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
// source: google/api/serviceusage/v1beta1/serviceusage.proto

// Protobuf Java Version: 3.25.8
package com.google.api.serviceusage.v1beta1;

public interface EnableServiceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1beta1.EnableServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the consumer and service to enable the service on.
   *
   * The `EnableService` and `DisableService` methods currently only support
   * projects.
   *
   * Enabling a service requires that the service is public or is shared with
   * the user enabling the service.
   *
   * An example name would be:
   * `projects/123/services/serviceusage.googleapis.com`
   * where `123` is the project number (not project ID).
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
   * Name of the consumer and service to enable the service on.
   *
   * The `EnableService` and `DisableService` methods currently only support
   * projects.
   *
   * Enabling a service requires that the service is public or is shared with
   * the user enabling the service.
   *
   * An example name would be:
   * `projects/123/services/serviceusage.googleapis.com`
   * where `123` is the project number (not project ID).
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
