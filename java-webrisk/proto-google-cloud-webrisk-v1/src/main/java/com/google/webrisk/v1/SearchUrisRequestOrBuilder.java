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

public interface SearchUrisRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.webrisk.v1.SearchUrisRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The URI to be checked for matches.
   * </pre>
   *
   * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();

  /**
   *
   *
   * <pre>
   * Required. The URI to be checked for matches.
   * </pre>
   *
   * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Required. The ThreatLists to search in. Multiple ThreatLists may be
   * specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the threatTypes.
   */
  java.util.List<com.google.webrisk.v1.ThreatType> getThreatTypesList();

  /**
   *
   *
   * <pre>
   * Required. The ThreatLists to search in. Multiple ThreatLists may be
   * specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The count of threatTypes.
   */
  int getThreatTypesCount();

  /**
   *
   *
   * <pre>
   * Required. The ThreatLists to search in. Multiple ThreatLists may be
   * specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The threatTypes at the given index.
   */
  com.google.webrisk.v1.ThreatType getThreatTypes(int index);

  /**
   *
   *
   * <pre>
   * Required. The ThreatLists to search in. Multiple ThreatLists may be
   * specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for threatTypes.
   */
  java.util.List<java.lang.Integer> getThreatTypesValueList();

  /**
   *
   *
   * <pre>
   * Required. The ThreatLists to search in. Multiple ThreatLists may be
   * specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of threatTypes at the given index.
   */
  int getThreatTypesValue(int index);
}
