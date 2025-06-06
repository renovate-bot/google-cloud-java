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
// source: google/appengine/v1/appengine.proto

// Protobuf Java Version: 3.25.8
package com.google.appengine.v1;

public interface ListIngressRulesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.ListIngressRulesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the Firewall collection to retrieve.
   * Example: `apps/myapp/firewall/ingressRules`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Name of the Firewall collection to retrieve.
   * Example: `apps/myapp/firewall/ingressRules`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Maximum results to return per page.
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
   * Continuation token for fetching the next page of results.
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
   * Continuation token for fetching the next page of results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * A valid IP Address. If set, only rules matching this address will be
   * returned. The first returned rule will be the rule that fires on requests
   * from this IP.
   * </pre>
   *
   * <code>string matching_address = 4;</code>
   *
   * @return The matchingAddress.
   */
  java.lang.String getMatchingAddress();

  /**
   *
   *
   * <pre>
   * A valid IP Address. If set, only rules matching this address will be
   * returned. The first returned rule will be the rule that fires on requests
   * from this IP.
   * </pre>
   *
   * <code>string matching_address = 4;</code>
   *
   * @return The bytes for matchingAddress.
   */
  com.google.protobuf.ByteString getMatchingAddressBytes();
}
