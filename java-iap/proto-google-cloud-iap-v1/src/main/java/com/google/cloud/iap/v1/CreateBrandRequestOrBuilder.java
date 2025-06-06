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
// source: google/cloud/iap/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.iap.v1;

public interface CreateBrandRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iap.v1.CreateBrandRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. GCP Project number/id under which the brand is to be created.
   * In the following format: projects/{project_number/id}.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. GCP Project number/id under which the brand is to be created.
   * In the following format: projects/{project_number/id}.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The brand to be created.
   * </pre>
   *
   * <code>.google.cloud.iap.v1.Brand brand = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the brand field is set.
   */
  boolean hasBrand();

  /**
   *
   *
   * <pre>
   * Required. The brand to be created.
   * </pre>
   *
   * <code>.google.cloud.iap.v1.Brand brand = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The brand.
   */
  com.google.cloud.iap.v1.Brand getBrand();

  /**
   *
   *
   * <pre>
   * Required. The brand to be created.
   * </pre>
   *
   * <code>.google.cloud.iap.v1.Brand brand = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.iap.v1.BrandOrBuilder getBrandOrBuilder();
}
