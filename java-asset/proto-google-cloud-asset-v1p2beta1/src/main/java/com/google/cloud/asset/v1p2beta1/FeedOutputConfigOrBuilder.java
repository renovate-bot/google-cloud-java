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
// source: google/cloud/asset/v1p2beta1/asset_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.asset.v1p2beta1;

public interface FeedOutputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p2beta1.FeedOutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Destination on Pub/Sub.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.PubsubDestination pubsub_destination = 1;</code>
   *
   * @return Whether the pubsubDestination field is set.
   */
  boolean hasPubsubDestination();

  /**
   *
   *
   * <pre>
   * Destination on Pub/Sub.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.PubsubDestination pubsub_destination = 1;</code>
   *
   * @return The pubsubDestination.
   */
  com.google.cloud.asset.v1p2beta1.PubsubDestination getPubsubDestination();

  /**
   *
   *
   * <pre>
   * Destination on Pub/Sub.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.PubsubDestination pubsub_destination = 1;</code>
   */
  com.google.cloud.asset.v1p2beta1.PubsubDestinationOrBuilder getPubsubDestinationOrBuilder();

  com.google.cloud.asset.v1p2beta1.FeedOutputConfig.DestinationCase getDestinationCase();
}
