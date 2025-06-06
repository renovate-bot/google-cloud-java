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
// source: google/cloud/discoveryengine/v1/identity_mapping_store_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1;

public interface ListIdentityMappingsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.ListIdentityMappingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Identity Mapping Store to list Identity Mapping
   * Entries in. Format:
   * `projects/{project}/locations/{location}/identityMappingStores/{identityMappingStore}`
   * </pre>
   *
   * <code>
   * string identity_mapping_store = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The identityMappingStore.
   */
  java.lang.String getIdentityMappingStore();

  /**
   *
   *
   * <pre>
   * Required. The name of the Identity Mapping Store to list Identity Mapping
   * Entries in. Format:
   * `projects/{project}/locations/{location}/identityMappingStores/{identityMappingStore}`
   * </pre>
   *
   * <code>
   * string identity_mapping_store = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for identityMappingStore.
   */
  com.google.protobuf.ByteString getIdentityMappingStoreBytes();

  /**
   *
   *
   * <pre>
   * Maximum number of IdentityMappings to return. If unspecified, defaults
   * to 2000. The maximum allowed value is 10000. Values above 10000 will be
   * coerced to 10000.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A page token, received from a previous `ListIdentityMappings` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to
   * `ListIdentityMappings` must match the call that provided the page
   * token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();

  /**
   *
   *
   * <pre>
   * A page token, received from a previous `ListIdentityMappings` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to
   * `ListIdentityMappings` must match the call that provided the page
   * token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
