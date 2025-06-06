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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.migrationcenter.v1;

public interface AggregationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.Aggregation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the field on which to aggregate.
   * </pre>
   *
   * <code>string field = 1;</code>
   *
   * @return The field.
   */
  java.lang.String getField();

  /**
   *
   *
   * <pre>
   * The name of the field on which to aggregate.
   * </pre>
   *
   * <code>string field = 1;</code>
   *
   * @return The bytes for field.
   */
  com.google.protobuf.ByteString getFieldBytes();

  /**
   *
   *
   * <pre>
   * Count the number of matching objects.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.Aggregation.Count count = 2;</code>
   *
   * @return Whether the count field is set.
   */
  boolean hasCount();

  /**
   *
   *
   * <pre>
   * Count the number of matching objects.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.Aggregation.Count count = 2;</code>
   *
   * @return The count.
   */
  com.google.cloud.migrationcenter.v1.Aggregation.Count getCount();

  /**
   *
   *
   * <pre>
   * Count the number of matching objects.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.Aggregation.Count count = 2;</code>
   */
  com.google.cloud.migrationcenter.v1.Aggregation.CountOrBuilder getCountOrBuilder();

  /**
   *
   *
   * <pre>
   * Sum over a numeric field.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.Aggregation.Sum sum = 3;</code>
   *
   * @return Whether the sum field is set.
   */
  boolean hasSum();

  /**
   *
   *
   * <pre>
   * Sum over a numeric field.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.Aggregation.Sum sum = 3;</code>
   *
   * @return The sum.
   */
  com.google.cloud.migrationcenter.v1.Aggregation.Sum getSum();

  /**
   *
   *
   * <pre>
   * Sum over a numeric field.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.Aggregation.Sum sum = 3;</code>
   */
  com.google.cloud.migrationcenter.v1.Aggregation.SumOrBuilder getSumOrBuilder();

  /**
   *
   *
   * <pre>
   * Creates a bucketed histogram of field values.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.Aggregation.Histogram histogram = 4;</code>
   *
   * @return Whether the histogram field is set.
   */
  boolean hasHistogram();

  /**
   *
   *
   * <pre>
   * Creates a bucketed histogram of field values.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.Aggregation.Histogram histogram = 4;</code>
   *
   * @return The histogram.
   */
  com.google.cloud.migrationcenter.v1.Aggregation.Histogram getHistogram();

  /**
   *
   *
   * <pre>
   * Creates a bucketed histogram of field values.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.Aggregation.Histogram histogram = 4;</code>
   */
  com.google.cloud.migrationcenter.v1.Aggregation.HistogramOrBuilder getHistogramOrBuilder();

  /**
   *
   *
   * <pre>
   * Creates a frequency distribution of all field values.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.Aggregation.Frequency frequency = 5;</code>
   *
   * @return Whether the frequency field is set.
   */
  boolean hasFrequency();

  /**
   *
   *
   * <pre>
   * Creates a frequency distribution of all field values.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.Aggregation.Frequency frequency = 5;</code>
   *
   * @return The frequency.
   */
  com.google.cloud.migrationcenter.v1.Aggregation.Frequency getFrequency();

  /**
   *
   *
   * <pre>
   * Creates a frequency distribution of all field values.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.Aggregation.Frequency frequency = 5;</code>
   */
  com.google.cloud.migrationcenter.v1.Aggregation.FrequencyOrBuilder getFrequencyOrBuilder();

  com.google.cloud.migrationcenter.v1.Aggregation.AggregationFunctionCase
      getAggregationFunctionCase();
}
