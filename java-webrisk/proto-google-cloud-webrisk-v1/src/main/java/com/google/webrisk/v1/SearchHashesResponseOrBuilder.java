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
// source: google/cloud/webrisk/v1/webrisk.proto

// Protobuf Java Version: 3.25.8
package com.google.webrisk.v1;

public interface SearchHashesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.webrisk.v1.SearchHashesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The full hashes that matched the requested prefixes.
   * The hash will be populated in the key.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1.SearchHashesResponse.ThreatHash threats = 1;</code>
   */
  java.util.List<com.google.webrisk.v1.SearchHashesResponse.ThreatHash> getThreatsList();

  /**
   *
   *
   * <pre>
   * The full hashes that matched the requested prefixes.
   * The hash will be populated in the key.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1.SearchHashesResponse.ThreatHash threats = 1;</code>
   */
  com.google.webrisk.v1.SearchHashesResponse.ThreatHash getThreats(int index);

  /**
   *
   *
   * <pre>
   * The full hashes that matched the requested prefixes.
   * The hash will be populated in the key.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1.SearchHashesResponse.ThreatHash threats = 1;</code>
   */
  int getThreatsCount();

  /**
   *
   *
   * <pre>
   * The full hashes that matched the requested prefixes.
   * The hash will be populated in the key.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1.SearchHashesResponse.ThreatHash threats = 1;</code>
   */
  java.util.List<? extends com.google.webrisk.v1.SearchHashesResponse.ThreatHashOrBuilder>
      getThreatsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The full hashes that matched the requested prefixes.
   * The hash will be populated in the key.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1.SearchHashesResponse.ThreatHash threats = 1;</code>
   */
  com.google.webrisk.v1.SearchHashesResponse.ThreatHashOrBuilder getThreatsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * For requested entities that did not match the threat list, how long to
   * cache the response until.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp negative_expire_time = 2;</code>
   *
   * @return Whether the negativeExpireTime field is set.
   */
  boolean hasNegativeExpireTime();

  /**
   *
   *
   * <pre>
   * For requested entities that did not match the threat list, how long to
   * cache the response until.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp negative_expire_time = 2;</code>
   *
   * @return The negativeExpireTime.
   */
  com.google.protobuf.Timestamp getNegativeExpireTime();

  /**
   *
   *
   * <pre>
   * For requested entities that did not match the threat list, how long to
   * cache the response until.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp negative_expire_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getNegativeExpireTimeOrBuilder();
}
