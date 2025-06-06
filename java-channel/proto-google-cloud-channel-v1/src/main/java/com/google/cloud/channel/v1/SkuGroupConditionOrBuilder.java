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
// source: google/cloud/channel/v1/repricing.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.channel.v1;

public interface SkuGroupConditionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.SkuGroupCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies a SKU group (https://cloud.google.com/skus/sku-groups).
   * Resource name of SKU group. Format:
   * accounts/{account}/skuGroups/{sku_group}.
   * Example:
   * "accounts/C01234/skuGroups/3d50fd57-3157-4577-a5a9-a219b8490041".
   * </pre>
   *
   * <code>string sku_group = 1;</code>
   *
   * @return The skuGroup.
   */
  java.lang.String getSkuGroup();

  /**
   *
   *
   * <pre>
   * Specifies a SKU group (https://cloud.google.com/skus/sku-groups).
   * Resource name of SKU group. Format:
   * accounts/{account}/skuGroups/{sku_group}.
   * Example:
   * "accounts/C01234/skuGroups/3d50fd57-3157-4577-a5a9-a219b8490041".
   * </pre>
   *
   * <code>string sku_group = 1;</code>
   *
   * @return The bytes for skuGroup.
   */
  com.google.protobuf.ByteString getSkuGroupBytes();
}
