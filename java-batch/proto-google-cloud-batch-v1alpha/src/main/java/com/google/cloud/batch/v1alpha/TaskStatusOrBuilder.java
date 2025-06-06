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
// source: google/cloud/batch/v1alpha/task.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.batch.v1alpha;

public interface TaskStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.TaskStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Task state.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.TaskStatus.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Task state.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.TaskStatus.State state = 1;</code>
   *
   * @return The state.
   */
  com.google.cloud.batch.v1alpha.TaskStatus.State getState();

  /**
   *
   *
   * <pre>
   * Detailed info about why the state is reached.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.StatusEvent status_events = 2;</code>
   */
  java.util.List<com.google.cloud.batch.v1alpha.StatusEvent> getStatusEventsList();

  /**
   *
   *
   * <pre>
   * Detailed info about why the state is reached.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.StatusEvent status_events = 2;</code>
   */
  com.google.cloud.batch.v1alpha.StatusEvent getStatusEvents(int index);

  /**
   *
   *
   * <pre>
   * Detailed info about why the state is reached.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.StatusEvent status_events = 2;</code>
   */
  int getStatusEventsCount();

  /**
   *
   *
   * <pre>
   * Detailed info about why the state is reached.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.StatusEvent status_events = 2;</code>
   */
  java.util.List<? extends com.google.cloud.batch.v1alpha.StatusEventOrBuilder>
      getStatusEventsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Detailed info about why the state is reached.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.StatusEvent status_events = 2;</code>
   */
  com.google.cloud.batch.v1alpha.StatusEventOrBuilder getStatusEventsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The resource usage of the task.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.TaskResourceUsage resource_usage = 3;</code>
   *
   * @return Whether the resourceUsage field is set.
   */
  boolean hasResourceUsage();

  /**
   *
   *
   * <pre>
   * The resource usage of the task.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.TaskResourceUsage resource_usage = 3;</code>
   *
   * @return The resourceUsage.
   */
  com.google.cloud.batch.v1alpha.TaskResourceUsage getResourceUsage();

  /**
   *
   *
   * <pre>
   * The resource usage of the task.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.TaskResourceUsage resource_usage = 3;</code>
   */
  com.google.cloud.batch.v1alpha.TaskResourceUsageOrBuilder getResourceUsageOrBuilder();
}
