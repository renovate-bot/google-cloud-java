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
// source: google/cloud/servicehealth/v1/event_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.servicehealth.v1;

public interface EventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.servicehealth.v1.Event)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Identifier. Name of the event. Unique name of the event in
   * this scope including project and location using the form
   * `projects/{project_id}/locations/{location}/events/{event_id}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IDENTIFIER];
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. Identifier. Name of the event. Unique name of the event in
   * this scope including project and location using the form
   * `projects/{project_id}/locations/{location}/events/{event_id}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IDENTIFIER];
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Brief description for the event.
   * </pre>
   *
   * <code>string title = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();

  /**
   *
   *
   * <pre>
   * Output only. Brief description for the event.
   * </pre>
   *
   * <code>string title = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * Output only. Free-form, human-readable description.
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Output only. Free-form, human-readable description.
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The category of the event.
   * </pre>
   *
   * <code>
   * .google.cloud.servicehealth.v1.Event.EventCategory category = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();

  /**
   *
   *
   * <pre>
   * Output only. The category of the event.
   * </pre>
   *
   * <code>
   * .google.cloud.servicehealth.v1.Event.EventCategory category = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The category.
   */
  com.google.cloud.servicehealth.v1.Event.EventCategory getCategory();

  /**
   *
   *
   * <pre>
   * Output only. The detailed category of the event.
   * </pre>
   *
   * <code>
   * .google.cloud.servicehealth.v1.Event.DetailedCategory detailed_category = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for detailedCategory.
   */
  int getDetailedCategoryValue();

  /**
   *
   *
   * <pre>
   * Output only. The detailed category of the event.
   * </pre>
   *
   * <code>
   * .google.cloud.servicehealth.v1.Event.DetailedCategory detailed_category = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The detailedCategory.
   */
  com.google.cloud.servicehealth.v1.Event.DetailedCategory getDetailedCategory();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the event.
   * </pre>
   *
   * <code>
   * .google.cloud.servicehealth.v1.Event.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the event.
   * </pre>
   *
   * <code>
   * .google.cloud.servicehealth.v1.Event.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.servicehealth.v1.Event.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The current detailed state of the incident.
   * </pre>
   *
   * <code>
   * .google.cloud.servicehealth.v1.Event.DetailedState detailed_state = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for detailedState.
   */
  int getDetailedStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The current detailed state of the incident.
   * </pre>
   *
   * <code>
   * .google.cloud.servicehealth.v1.Event.DetailedState detailed_state = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The detailedState.
   */
  com.google.cloud.servicehealth.v1.Event.DetailedState getDetailedState();

  /**
   *
   *
   * <pre>
   * Google Cloud products and locations impacted by the event.
   * </pre>
   *
   * <code>repeated .google.cloud.servicehealth.v1.EventImpact event_impacts = 20;</code>
   */
  java.util.List<com.google.cloud.servicehealth.v1.EventImpact> getEventImpactsList();

  /**
   *
   *
   * <pre>
   * Google Cloud products and locations impacted by the event.
   * </pre>
   *
   * <code>repeated .google.cloud.servicehealth.v1.EventImpact event_impacts = 20;</code>
   */
  com.google.cloud.servicehealth.v1.EventImpact getEventImpacts(int index);

  /**
   *
   *
   * <pre>
   * Google Cloud products and locations impacted by the event.
   * </pre>
   *
   * <code>repeated .google.cloud.servicehealth.v1.EventImpact event_impacts = 20;</code>
   */
  int getEventImpactsCount();

  /**
   *
   *
   * <pre>
   * Google Cloud products and locations impacted by the event.
   * </pre>
   *
   * <code>repeated .google.cloud.servicehealth.v1.EventImpact event_impacts = 20;</code>
   */
  java.util.List<? extends com.google.cloud.servicehealth.v1.EventImpactOrBuilder>
      getEventImpactsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Google Cloud products and locations impacted by the event.
   * </pre>
   *
   * <code>repeated .google.cloud.servicehealth.v1.EventImpact event_impacts = 20;</code>
   */
  com.google.cloud.servicehealth.v1.EventImpactOrBuilder getEventImpactsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Communicates why a given event is deemed relevant in the
   * context of a given project.
   * </pre>
   *
   * <code>
   * .google.cloud.servicehealth.v1.Event.Relevance relevance = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for relevance.
   */
  int getRelevanceValue();

  /**
   *
   *
   * <pre>
   * Output only. Communicates why a given event is deemed relevant in the
   * context of a given project.
   * </pre>
   *
   * <code>
   * .google.cloud.servicehealth.v1.Event.Relevance relevance = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The relevance.
   */
  com.google.cloud.servicehealth.v1.Event.Relevance getRelevance();

  /**
   *
   *
   * <pre>
   * Output only. Event updates are correspondence from Google.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.servicehealth.v1.EventUpdate updates = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.servicehealth.v1.EventUpdate> getUpdatesList();

  /**
   *
   *
   * <pre>
   * Output only. Event updates are correspondence from Google.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.servicehealth.v1.EventUpdate updates = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.servicehealth.v1.EventUpdate getUpdates(int index);

  /**
   *
   *
   * <pre>
   * Output only. Event updates are correspondence from Google.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.servicehealth.v1.EventUpdate updates = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getUpdatesCount();

  /**
   *
   *
   * <pre>
   * Output only. Event updates are correspondence from Google.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.servicehealth.v1.EventUpdate updates = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.servicehealth.v1.EventUpdateOrBuilder>
      getUpdatesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. Event updates are correspondence from Google.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.servicehealth.v1.EventUpdate updates = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.servicehealth.v1.EventUpdateOrBuilder getUpdatesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. When `detailed_state`=`MERGED`, `parent_event` contains the
   * name of the parent event. All further updates will be published to the
   * parent event.
   * </pre>
   *
   * <code>string parent_event = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The parentEvent.
   */
  java.lang.String getParentEvent();

  /**
   *
   *
   * <pre>
   * Output only. When `detailed_state`=`MERGED`, `parent_event` contains the
   * name of the parent event. All further updates will be published to the
   * parent event.
   * </pre>
   *
   * <code>string parent_event = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for parentEvent.
   */
  com.google.protobuf.ByteString getParentEventBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the event was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the event was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the event was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The start time of the event, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * Output only. The start time of the event, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   *
   *
   * <pre>
   * Output only. The start time of the event, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The end time of the event, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * Output only. The end time of the event, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   *
   *
   * <pre>
   * Output only. The end time of the event, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the next update can be expected.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp next_update_time = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the nextUpdateTime field is set.
   */
  boolean hasNextUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the next update can be expected.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp next_update_time = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The nextUpdateTime.
   */
  com.google.protobuf.Timestamp getNextUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the next update can be expected.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp next_update_time = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getNextUpdateTimeOrBuilder();
}
