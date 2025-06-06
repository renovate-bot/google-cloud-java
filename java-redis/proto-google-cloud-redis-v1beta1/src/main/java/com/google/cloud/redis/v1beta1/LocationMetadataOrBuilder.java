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
// source: google/cloud/redis/v1beta1/cloud_redis.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.redis.v1beta1;

public interface LocationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.v1beta1.LocationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The set of available zones in the location. The map is keyed
   * by the lowercase ID of each zone, as defined by GCE. These keys can be
   * specified in `location_id` or `alternative_location_id` fields when
   * creating a Redis instance.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.redis.v1beta1.ZoneMetadata&gt; available_zones = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getAvailableZonesCount();

  /**
   *
   *
   * <pre>
   * Output only. The set of available zones in the location. The map is keyed
   * by the lowercase ID of each zone, as defined by GCE. These keys can be
   * specified in `location_id` or `alternative_location_id` fields when
   * creating a Redis instance.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.redis.v1beta1.ZoneMetadata&gt; available_zones = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsAvailableZones(java.lang.String key);

  /** Use {@link #getAvailableZonesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata> getAvailableZones();

  /**
   *
   *
   * <pre>
   * Output only. The set of available zones in the location. The map is keyed
   * by the lowercase ID of each zone, as defined by GCE. These keys can be
   * specified in `location_id` or `alternative_location_id` fields when
   * creating a Redis instance.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.redis.v1beta1.ZoneMetadata&gt; available_zones = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata>
      getAvailableZonesMap();

  /**
   *
   *
   * <pre>
   * Output only. The set of available zones in the location. The map is keyed
   * by the lowercase ID of each zone, as defined by GCE. These keys can be
   * specified in `location_id` or `alternative_location_id` fields when
   * creating a Redis instance.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.redis.v1beta1.ZoneMetadata&gt; available_zones = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  /* nullable */
  com.google.cloud.redis.v1beta1.ZoneMetadata getAvailableZonesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.redis.v1beta1.ZoneMetadata defaultValue);

  /**
   *
   *
   * <pre>
   * Output only. The set of available zones in the location. The map is keyed
   * by the lowercase ID of each zone, as defined by GCE. These keys can be
   * specified in `location_id` or `alternative_location_id` fields when
   * creating a Redis instance.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.redis.v1beta1.ZoneMetadata&gt; available_zones = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.v1beta1.ZoneMetadata getAvailableZonesOrThrow(java.lang.String key);
}
