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
// source: google/cloud/enterpriseknowledgegraph/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.enterpriseknowledgegraph.v1;

public interface SearchResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.enterpriseknowledgegraph.v1.SearchResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The local context applicable for the response. See more details at
   * http://www.w3.org/TR/json-ld/#context-definitions.
   * </pre>
   *
   * <code>.google.protobuf.Value context = 1;</code>
   *
   * @return Whether the context field is set.
   */
  boolean hasContext();

  /**
   *
   *
   * <pre>
   * The local context applicable for the response. See more details at
   * http://www.w3.org/TR/json-ld/#context-definitions.
   * </pre>
   *
   * <code>.google.protobuf.Value context = 1;</code>
   *
   * @return The context.
   */
  com.google.protobuf.Value getContext();

  /**
   *
   *
   * <pre>
   * The local context applicable for the response. See more details at
   * http://www.w3.org/TR/json-ld/#context-definitions.
   * </pre>
   *
   * <code>.google.protobuf.Value context = 1;</code>
   */
  com.google.protobuf.ValueOrBuilder getContextOrBuilder();

  /**
   *
   *
   * <pre>
   * The schema type of top-level JSON-LD object, e.g. ItemList.
   * </pre>
   *
   * <code>.google.protobuf.Value type = 2;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();

  /**
   *
   *
   * <pre>
   * The schema type of top-level JSON-LD object, e.g. ItemList.
   * </pre>
   *
   * <code>.google.protobuf.Value type = 2;</code>
   *
   * @return The type.
   */
  com.google.protobuf.Value getType();

  /**
   *
   *
   * <pre>
   * The schema type of top-level JSON-LD object, e.g. ItemList.
   * </pre>
   *
   * <code>.google.protobuf.Value type = 2;</code>
   */
  com.google.protobuf.ValueOrBuilder getTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * The item list of search results.
   * </pre>
   *
   * <code>.google.protobuf.ListValue item_list_element = 3;</code>
   *
   * @return Whether the itemListElement field is set.
   */
  boolean hasItemListElement();

  /**
   *
   *
   * <pre>
   * The item list of search results.
   * </pre>
   *
   * <code>.google.protobuf.ListValue item_list_element = 3;</code>
   *
   * @return The itemListElement.
   */
  com.google.protobuf.ListValue getItemListElement();

  /**
   *
   *
   * <pre>
   * The item list of search results.
   * </pre>
   *
   * <code>.google.protobuf.ListValue item_list_element = 3;</code>
   */
  com.google.protobuf.ListValueOrBuilder getItemListElementOrBuilder();
}
