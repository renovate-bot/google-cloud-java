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
// source: google/apps/events/subscriptions/v1/subscription_resource.proto

// Protobuf Java Version: 3.25.8
package com.google.apps.events.subscriptions.v1;

public interface NotificationEndpointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.apps.events.subscriptions.v1.NotificationEndpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The Cloud Pub/Sub topic that receives events for the
   * subscription.
   *
   * Format: `projects/{project}/topics/{topic}`
   *
   *
   * You must create the topic in the same Google Cloud project where
   * you create this subscription.
   *
   * When the topic receives events, the events are encoded as Cloud Pub/Sub
   * messages. For details, see the [Google Cloud Pub/Sub Protocol Binding for
   * CloudEvents](https://github.com/googleapis/google-cloudevents/blob/main/docs/spec/pubsub.md).
   * </pre>
   *
   * <code>
   * string pubsub_topic = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return Whether the pubsubTopic field is set.
   */
  boolean hasPubsubTopic();

  /**
   *
   *
   * <pre>
   * Immutable. The Cloud Pub/Sub topic that receives events for the
   * subscription.
   *
   * Format: `projects/{project}/topics/{topic}`
   *
   *
   * You must create the topic in the same Google Cloud project where
   * you create this subscription.
   *
   * When the topic receives events, the events are encoded as Cloud Pub/Sub
   * messages. For details, see the [Google Cloud Pub/Sub Protocol Binding for
   * CloudEvents](https://github.com/googleapis/google-cloudevents/blob/main/docs/spec/pubsub.md).
   * </pre>
   *
   * <code>
   * string pubsub_topic = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The pubsubTopic.
   */
  java.lang.String getPubsubTopic();

  /**
   *
   *
   * <pre>
   * Immutable. The Cloud Pub/Sub topic that receives events for the
   * subscription.
   *
   * Format: `projects/{project}/topics/{topic}`
   *
   *
   * You must create the topic in the same Google Cloud project where
   * you create this subscription.
   *
   * When the topic receives events, the events are encoded as Cloud Pub/Sub
   * messages. For details, see the [Google Cloud Pub/Sub Protocol Binding for
   * CloudEvents](https://github.com/googleapis/google-cloudevents/blob/main/docs/spec/pubsub.md).
   * </pre>
   *
   * <code>
   * string pubsub_topic = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for pubsubTopic.
   */
  com.google.protobuf.ByteString getPubsubTopicBytes();

  com.google.apps.events.subscriptions.v1.NotificationEndpoint.EndpointCase getEndpointCase();
}
