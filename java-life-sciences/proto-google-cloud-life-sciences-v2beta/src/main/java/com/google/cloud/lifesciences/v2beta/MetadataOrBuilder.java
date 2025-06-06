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
// source: google/cloud/lifesciences/v2beta/workflows.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.lifesciences.v2beta;

public interface MetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.lifesciences.v2beta.Metadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The pipeline this operation represents.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.Pipeline pipeline = 1;</code>
   *
   * @return Whether the pipeline field is set.
   */
  boolean hasPipeline();

  /**
   *
   *
   * <pre>
   * The pipeline this operation represents.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.Pipeline pipeline = 1;</code>
   *
   * @return The pipeline.
   */
  com.google.cloud.lifesciences.v2beta.Pipeline getPipeline();

  /**
   *
   *
   * <pre>
   * The pipeline this operation represents.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.Pipeline pipeline = 1;</code>
   */
  com.google.cloud.lifesciences.v2beta.PipelineOrBuilder getPipelineOrBuilder();

  /**
   *
   *
   * <pre>
   * The user-defined labels associated with this operation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * The user-defined labels associated with this operation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * The user-defined labels associated with this operation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * The user-defined labels associated with this operation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * The user-defined labels associated with this operation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The list of events that have happened so far during the execution of this
   * operation.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Event events = 3;</code>
   */
  java.util.List<com.google.cloud.lifesciences.v2beta.Event> getEventsList();

  /**
   *
   *
   * <pre>
   * The list of events that have happened so far during the execution of this
   * operation.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Event events = 3;</code>
   */
  com.google.cloud.lifesciences.v2beta.Event getEvents(int index);

  /**
   *
   *
   * <pre>
   * The list of events that have happened so far during the execution of this
   * operation.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Event events = 3;</code>
   */
  int getEventsCount();

  /**
   *
   *
   * <pre>
   * The list of events that have happened so far during the execution of this
   * operation.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Event events = 3;</code>
   */
  java.util.List<? extends com.google.cloud.lifesciences.v2beta.EventOrBuilder>
      getEventsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The list of events that have happened so far during the execution of this
   * operation.
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Event events = 3;</code>
   */
  com.google.cloud.lifesciences.v2beta.EventOrBuilder getEventsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The time at which the operation was created by the API.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * The time at which the operation was created by the API.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * The time at which the operation was created by the API.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The first time at which resources were allocated to execute the pipeline.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * The first time at which resources were allocated to execute the pipeline.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   *
   *
   * <pre>
   * The first time at which resources were allocated to execute the pipeline.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time at which execution was completed and resources were cleaned up.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * The time at which execution was completed and resources were cleaned up.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   *
   *
   * <pre>
   * The time at which execution was completed and resources were cleaned up.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The name of the Cloud Pub/Sub topic where notifications of operation status
   * changes are sent.
   * </pre>
   *
   * <code>string pub_sub_topic = 7;</code>
   *
   * @return The pubSubTopic.
   */
  java.lang.String getPubSubTopic();

  /**
   *
   *
   * <pre>
   * The name of the Cloud Pub/Sub topic where notifications of operation status
   * changes are sent.
   * </pre>
   *
   * <code>string pub_sub_topic = 7;</code>
   *
   * @return The bytes for pubSubTopic.
   */
  com.google.protobuf.ByteString getPubSubTopicBytes();
}
