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
// source: google/cloud/managedkafka/v1/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.managedkafka.v1;

public interface ConsumerGroupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.managedkafka.v1.ConsumerGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The name of the consumer group. The `consumer_group` segment is
   * used when connecting directly to the cluster. Structured like:
   * projects/{project}/locations/{location}/clusters/{cluster}/consumerGroups/{consumer_group}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. The name of the consumer group. The `consumer_group` segment is
   * used when connecting directly to the cluster. Structured like:
   * projects/{project}/locations/{location}/clusters/{cluster}/consumerGroups/{consumer_group}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Metadata for this consumer group for all topics it has metadata
   * for. The key of the map is a topic name, structured like:
   * projects/{project}/locations/{location}/clusters/{cluster}/topics/{topic}
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.managedkafka.v1.ConsumerTopicMetadata&gt; topics = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getTopicsCount();

  /**
   *
   *
   * <pre>
   * Optional. Metadata for this consumer group for all topics it has metadata
   * for. The key of the map is a topic name, structured like:
   * projects/{project}/locations/{location}/clusters/{cluster}/topics/{topic}
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.managedkafka.v1.ConsumerTopicMetadata&gt; topics = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsTopics(java.lang.String key);

  /** Use {@link #getTopicsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.managedkafka.v1.ConsumerTopicMetadata>
      getTopics();

  /**
   *
   *
   * <pre>
   * Optional. Metadata for this consumer group for all topics it has metadata
   * for. The key of the map is a topic name, structured like:
   * projects/{project}/locations/{location}/clusters/{cluster}/topics/{topic}
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.managedkafka.v1.ConsumerTopicMetadata&gt; topics = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.managedkafka.v1.ConsumerTopicMetadata>
      getTopicsMap();

  /**
   *
   *
   * <pre>
   * Optional. Metadata for this consumer group for all topics it has metadata
   * for. The key of the map is a topic name, structured like:
   * projects/{project}/locations/{location}/clusters/{cluster}/topics/{topic}
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.managedkafka.v1.ConsumerTopicMetadata&gt; topics = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  com.google.cloud.managedkafka.v1.ConsumerTopicMetadata getTopicsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.managedkafka.v1.ConsumerTopicMetadata defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. Metadata for this consumer group for all topics it has metadata
   * for. The key of the map is a topic name, structured like:
   * projects/{project}/locations/{location}/clusters/{cluster}/topics/{topic}
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.managedkafka.v1.ConsumerTopicMetadata&gt; topics = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.managedkafka.v1.ConsumerTopicMetadata getTopicsOrThrow(java.lang.String key);
}
