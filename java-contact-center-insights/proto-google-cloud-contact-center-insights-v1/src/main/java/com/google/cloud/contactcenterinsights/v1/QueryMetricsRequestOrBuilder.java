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
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.contactcenterinsights.v1;

public interface QueryMetricsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.QueryMetricsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The location of the data.
   * "projects/{project}/locations/{location}"
   * </pre>
   *
   * <code>
   * string location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The location.
   */
  java.lang.String getLocation();

  /**
   *
   *
   * <pre>
   * Required. The location of the data.
   * "projects/{project}/locations/{location}"
   * </pre>
   *
   * <code>
   * string location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * Required. Filter to select a subset of conversations to compute the
   * metrics. Must specify a window of the conversation create time to compute
   * the metrics. The returned metrics will be from the range [DATE(starting
   * create time), DATE(ending create time)).
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();

  /**
   *
   *
   * <pre>
   * Required. Filter to select a subset of conversations to compute the
   * metrics. Must specify a window of the conversation create time to compute
   * the metrics. The returned metrics will be from the range [DATE(starting
   * create time), DATE(ending create time)).
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The time granularity of each data point in the time series.
   * Defaults to NONE if this field is unspecified.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.QueryMetricsRequest.TimeGranularity time_granularity = 3;
   * </code>
   *
   * @return The enum numeric value on the wire for timeGranularity.
   */
  int getTimeGranularityValue();

  /**
   *
   *
   * <pre>
   * The time granularity of each data point in the time series.
   * Defaults to NONE if this field is unspecified.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.QueryMetricsRequest.TimeGranularity time_granularity = 3;
   * </code>
   *
   * @return The timeGranularity.
   */
  com.google.cloud.contactcenterinsights.v1.QueryMetricsRequest.TimeGranularity
      getTimeGranularity();

  /**
   *
   *
   * <pre>
   * The dimensions that determine the grouping key for the query. Defaults to
   * no dimension if this field is unspecified. If a dimension is specified,
   * its key must also be specified. Each dimension's key must be unique.
   *
   * If a time granularity is also specified, metric values in the dimension
   * will be bucketed by this granularity.
   *
   * Up to one dimension is supported for now.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.Dimension dimensions = 4;</code>
   */
  java.util.List<com.google.cloud.contactcenterinsights.v1.Dimension> getDimensionsList();

  /**
   *
   *
   * <pre>
   * The dimensions that determine the grouping key for the query. Defaults to
   * no dimension if this field is unspecified. If a dimension is specified,
   * its key must also be specified. Each dimension's key must be unique.
   *
   * If a time granularity is also specified, metric values in the dimension
   * will be bucketed by this granularity.
   *
   * Up to one dimension is supported for now.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.Dimension dimensions = 4;</code>
   */
  com.google.cloud.contactcenterinsights.v1.Dimension getDimensions(int index);

  /**
   *
   *
   * <pre>
   * The dimensions that determine the grouping key for the query. Defaults to
   * no dimension if this field is unspecified. If a dimension is specified,
   * its key must also be specified. Each dimension's key must be unique.
   *
   * If a time granularity is also specified, metric values in the dimension
   * will be bucketed by this granularity.
   *
   * Up to one dimension is supported for now.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.Dimension dimensions = 4;</code>
   */
  int getDimensionsCount();

  /**
   *
   *
   * <pre>
   * The dimensions that determine the grouping key for the query. Defaults to
   * no dimension if this field is unspecified. If a dimension is specified,
   * its key must also be specified. Each dimension's key must be unique.
   *
   * If a time granularity is also specified, metric values in the dimension
   * will be bucketed by this granularity.
   *
   * Up to one dimension is supported for now.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.Dimension dimensions = 4;</code>
   */
  java.util.List<? extends com.google.cloud.contactcenterinsights.v1.DimensionOrBuilder>
      getDimensionsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The dimensions that determine the grouping key for the query. Defaults to
   * no dimension if this field is unspecified. If a dimension is specified,
   * its key must also be specified. Each dimension's key must be unique.
   *
   * If a time granularity is also specified, metric values in the dimension
   * will be bucketed by this granularity.
   *
   * Up to one dimension is supported for now.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.Dimension dimensions = 4;</code>
   */
  com.google.cloud.contactcenterinsights.v1.DimensionOrBuilder getDimensionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Measures to return. Defaults to all measures if this field is unspecified.
   * A valid mask should traverse from the `measure` field from the response.
   * For example, a path from a measure mask to get the conversation count is
   * "conversation_measure.count".
   * </pre>
   *
   * <code>.google.protobuf.FieldMask measure_mask = 5;</code>
   *
   * @return Whether the measureMask field is set.
   */
  boolean hasMeasureMask();

  /**
   *
   *
   * <pre>
   * Measures to return. Defaults to all measures if this field is unspecified.
   * A valid mask should traverse from the `measure` field from the response.
   * For example, a path from a measure mask to get the conversation count is
   * "conversation_measure.count".
   * </pre>
   *
   * <code>.google.protobuf.FieldMask measure_mask = 5;</code>
   *
   * @return The measureMask.
   */
  com.google.protobuf.FieldMask getMeasureMask();

  /**
   *
   *
   * <pre>
   * Measures to return. Defaults to all measures if this field is unspecified.
   * A valid mask should traverse from the `measure` field from the response.
   * For example, a path from a measure mask to get the conversation count is
   * "conversation_measure.count".
   * </pre>
   *
   * <code>.google.protobuf.FieldMask measure_mask = 5;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getMeasureMaskOrBuilder();
}
