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
// source: google/maps/fleetengine/delivery/v1/delivery_api.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.fleetengine.delivery.v1;

public interface ListDeliveryVehiclesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.delivery.v1.ListDeliveryVehiclesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The set of delivery vehicles that meet the requested filtering criteria.
   * When no filter is specified, the request returns all delivery vehicles. A
   * successful response can also be empty. An empty response indicates that no
   * delivery vehicles were found meeting the requested filter criteria.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.DeliveryVehicle delivery_vehicles = 1;</code>
   */
  java.util.List<com.google.maps.fleetengine.delivery.v1.DeliveryVehicle> getDeliveryVehiclesList();

  /**
   *
   *
   * <pre>
   * The set of delivery vehicles that meet the requested filtering criteria.
   * When no filter is specified, the request returns all delivery vehicles. A
   * successful response can also be empty. An empty response indicates that no
   * delivery vehicles were found meeting the requested filter criteria.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.DeliveryVehicle delivery_vehicles = 1;</code>
   */
  com.google.maps.fleetengine.delivery.v1.DeliveryVehicle getDeliveryVehicles(int index);

  /**
   *
   *
   * <pre>
   * The set of delivery vehicles that meet the requested filtering criteria.
   * When no filter is specified, the request returns all delivery vehicles. A
   * successful response can also be empty. An empty response indicates that no
   * delivery vehicles were found meeting the requested filter criteria.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.DeliveryVehicle delivery_vehicles = 1;</code>
   */
  int getDeliveryVehiclesCount();

  /**
   *
   *
   * <pre>
   * The set of delivery vehicles that meet the requested filtering criteria.
   * When no filter is specified, the request returns all delivery vehicles. A
   * successful response can also be empty. An empty response indicates that no
   * delivery vehicles were found meeting the requested filter criteria.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.DeliveryVehicle delivery_vehicles = 1;</code>
   */
  java.util.List<? extends com.google.maps.fleetengine.delivery.v1.DeliveryVehicleOrBuilder>
      getDeliveryVehiclesOrBuilderList();

  /**
   *
   *
   * <pre>
   * The set of delivery vehicles that meet the requested filtering criteria.
   * When no filter is specified, the request returns all delivery vehicles. A
   * successful response can also be empty. An empty response indicates that no
   * delivery vehicles were found meeting the requested filter criteria.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.DeliveryVehicle delivery_vehicles = 1;</code>
   */
  com.google.maps.fleetengine.delivery.v1.DeliveryVehicleOrBuilder getDeliveryVehiclesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * You can pass this token in the `ListDeliveryVehiclesRequest` to continue to
   * list results. When all of the results are returned, this field won't be in
   * the response, or it will be an empty string.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();

  /**
   *
   *
   * <pre>
   * You can pass this token in the `ListDeliveryVehiclesRequest` to continue to
   * list results. When all of the results are returned, this field won't be in
   * the response, or it will be an empty string.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The total number of delivery vehicles that match the request criteria,
   * across all pages.
   * </pre>
   *
   * <code>int64 total_size = 3;</code>
   *
   * @return The totalSize.
   */
  long getTotalSize();
}
