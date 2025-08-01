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
// source: google/ads/admanager/v1/targeting.proto

// Protobuf Java Version: 3.25.8
package com.google.ads.admanager.v1;

public interface GeoTargetingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.ads.admanager.v1.GeoTargeting)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. A list of geo resource names that should be targeted/included.
   * </pre>
   *
   * <code>
   * repeated string targeted_geos = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the targetedGeos.
   */
  java.util.List<java.lang.String> getTargetedGeosList();

  /**
   *
   *
   * <pre>
   * Optional. A list of geo resource names that should be targeted/included.
   * </pre>
   *
   * <code>
   * repeated string targeted_geos = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of targetedGeos.
   */
  int getTargetedGeosCount();

  /**
   *
   *
   * <pre>
   * Optional. A list of geo resource names that should be targeted/included.
   * </pre>
   *
   * <code>
   * repeated string targeted_geos = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The targetedGeos at the given index.
   */
  java.lang.String getTargetedGeos(int index);

  /**
   *
   *
   * <pre>
   * Optional. A list of geo resource names that should be targeted/included.
   * </pre>
   *
   * <code>
   * repeated string targeted_geos = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the targetedGeos at the given index.
   */
  com.google.protobuf.ByteString getTargetedGeosBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. A list of geo resource names that should be excluded.
   * </pre>
   *
   * <code>
   * repeated string excluded_geos = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the excludedGeos.
   */
  java.util.List<java.lang.String> getExcludedGeosList();

  /**
   *
   *
   * <pre>
   * Optional. A list of geo resource names that should be excluded.
   * </pre>
   *
   * <code>
   * repeated string excluded_geos = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of excludedGeos.
   */
  int getExcludedGeosCount();

  /**
   *
   *
   * <pre>
   * Optional. A list of geo resource names that should be excluded.
   * </pre>
   *
   * <code>
   * repeated string excluded_geos = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The excludedGeos at the given index.
   */
  java.lang.String getExcludedGeos(int index);

  /**
   *
   *
   * <pre>
   * Optional. A list of geo resource names that should be excluded.
   * </pre>
   *
   * <code>
   * repeated string excluded_geos = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the excludedGeos at the given index.
   */
  com.google.protobuf.ByteString getExcludedGeosBytes(int index);
}
