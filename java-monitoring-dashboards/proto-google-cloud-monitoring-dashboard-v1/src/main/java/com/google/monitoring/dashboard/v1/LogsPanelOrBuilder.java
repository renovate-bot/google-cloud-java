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
// source: google/monitoring/dashboard/v1/logs_panel.proto

// Protobuf Java Version: 3.25.8
package com.google.monitoring.dashboard.v1;

public interface LogsPanelOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.LogsPanel)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A filter that chooses which log entries to return.  See [Advanced Logs
   * Queries](https://cloud.google.com/logging/docs/view/advanced-queries).
   * Only log entries that match the filter are returned.  An empty filter
   * matches all log entries.
   * </pre>
   *
   * <code>string filter = 1;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();

  /**
   *
   *
   * <pre>
   * A filter that chooses which log entries to return.  See [Advanced Logs
   * Queries](https://cloud.google.com/logging/docs/view/advanced-queries).
   * Only log entries that match the filter are returned.  An empty filter
   * matches all log entries.
   * </pre>
   *
   * <code>string filter = 1;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The names of logging resources to collect logs for. Currently only projects
   * are supported. If empty, the widget will default to the host project.
   * </pre>
   *
   * <code>repeated string resource_names = 2;</code>
   *
   * @return A list containing the resourceNames.
   */
  java.util.List<java.lang.String> getResourceNamesList();

  /**
   *
   *
   * <pre>
   * The names of logging resources to collect logs for. Currently only projects
   * are supported. If empty, the widget will default to the host project.
   * </pre>
   *
   * <code>repeated string resource_names = 2;</code>
   *
   * @return The count of resourceNames.
   */
  int getResourceNamesCount();

  /**
   *
   *
   * <pre>
   * The names of logging resources to collect logs for. Currently only projects
   * are supported. If empty, the widget will default to the host project.
   * </pre>
   *
   * <code>repeated string resource_names = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The resourceNames at the given index.
   */
  java.lang.String getResourceNames(int index);

  /**
   *
   *
   * <pre>
   * The names of logging resources to collect logs for. Currently only projects
   * are supported. If empty, the widget will default to the host project.
   * </pre>
   *
   * <code>repeated string resource_names = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the resourceNames at the given index.
   */
  com.google.protobuf.ByteString getResourceNamesBytes(int index);
}
