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
// source: google/dataflow/v1beta3/streaming.proto

// Protobuf Java Version: 3.25.8
package com.google.dataflow.v1beta3;

public interface PubsubLocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.PubsubLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A pubsub topic, in the form of
   * "pubsub.googleapis.com/topics/&lt;project-id&gt;/&lt;topic-name&gt;"
   * </pre>
   *
   * <code>string topic = 1;</code>
   *
   * @return The topic.
   */
  java.lang.String getTopic();

  /**
   *
   *
   * <pre>
   * A pubsub topic, in the form of
   * "pubsub.googleapis.com/topics/&lt;project-id&gt;/&lt;topic-name&gt;"
   * </pre>
   *
   * <code>string topic = 1;</code>
   *
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString getTopicBytes();

  /**
   *
   *
   * <pre>
   * A pubsub subscription, in the form of
   * "pubsub.googleapis.com/subscriptions/&lt;project-id&gt;/&lt;subscription-name&gt;"
   * </pre>
   *
   * <code>string subscription = 2;</code>
   *
   * @return The subscription.
   */
  java.lang.String getSubscription();

  /**
   *
   *
   * <pre>
   * A pubsub subscription, in the form of
   * "pubsub.googleapis.com/subscriptions/&lt;project-id&gt;/&lt;subscription-name&gt;"
   * </pre>
   *
   * <code>string subscription = 2;</code>
   *
   * @return The bytes for subscription.
   */
  com.google.protobuf.ByteString getSubscriptionBytes();

  /**
   *
   *
   * <pre>
   * If set, contains a pubsub label from which to extract record timestamps.
   * If left empty, record timestamps will be generated upon arrival.
   * </pre>
   *
   * <code>string timestamp_label = 3;</code>
   *
   * @return The timestampLabel.
   */
  java.lang.String getTimestampLabel();

  /**
   *
   *
   * <pre>
   * If set, contains a pubsub label from which to extract record timestamps.
   * If left empty, record timestamps will be generated upon arrival.
   * </pre>
   *
   * <code>string timestamp_label = 3;</code>
   *
   * @return The bytes for timestampLabel.
   */
  com.google.protobuf.ByteString getTimestampLabelBytes();

  /**
   *
   *
   * <pre>
   * If set, contains a pubsub label from which to extract record ids.
   * If left empty, record deduplication will be strictly best effort.
   * </pre>
   *
   * <code>string id_label = 4;</code>
   *
   * @return The idLabel.
   */
  java.lang.String getIdLabel();

  /**
   *
   *
   * <pre>
   * If set, contains a pubsub label from which to extract record ids.
   * If left empty, record deduplication will be strictly best effort.
   * </pre>
   *
   * <code>string id_label = 4;</code>
   *
   * @return The bytes for idLabel.
   */
  com.google.protobuf.ByteString getIdLabelBytes();

  /**
   *
   *
   * <pre>
   * Indicates whether the pipeline allows late-arriving data.
   * </pre>
   *
   * <code>bool drop_late_data = 5;</code>
   *
   * @return The dropLateData.
   */
  boolean getDropLateData();

  /**
   *
   *
   * <pre>
   * If set, specifies the pubsub subscription that will be used for tracking
   * custom time timestamps for watermark estimation.
   * </pre>
   *
   * <code>string tracking_subscription = 6;</code>
   *
   * @return The trackingSubscription.
   */
  java.lang.String getTrackingSubscription();

  /**
   *
   *
   * <pre>
   * If set, specifies the pubsub subscription that will be used for tracking
   * custom time timestamps for watermark estimation.
   * </pre>
   *
   * <code>string tracking_subscription = 6;</code>
   *
   * @return The bytes for trackingSubscription.
   */
  com.google.protobuf.ByteString getTrackingSubscriptionBytes();

  /**
   *
   *
   * <pre>
   * If true, then the client has requested to get pubsub attributes.
   * </pre>
   *
   * <code>bool with_attributes = 7;</code>
   *
   * @return The withAttributes.
   */
  boolean getWithAttributes();

  /**
   *
   *
   * <pre>
   * If true, then this location represents dynamic topics.
   * </pre>
   *
   * <code>bool dynamic_destinations = 8;</code>
   *
   * @return The dynamicDestinations.
   */
  boolean getDynamicDestinations();
}
