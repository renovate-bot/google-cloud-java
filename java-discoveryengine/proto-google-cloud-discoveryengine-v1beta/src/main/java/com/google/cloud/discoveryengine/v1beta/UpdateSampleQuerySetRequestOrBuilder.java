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
// source: google/cloud/discoveryengine/v1beta/sample_query_set_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1beta;

public interface UpdateSampleQuerySetRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.UpdateSampleQuerySetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The sample query set to update.
   *
   * If the caller does not have permission to update the
   * [SampleQuerySet][google.cloud.discoveryengine.v1beta.SampleQuerySet],
   * regardless of whether or not it exists, a `PERMISSION_DENIED` error is
   * returned.
   *
   * If the [SampleQuerySet][google.cloud.discoveryengine.v1beta.SampleQuerySet]
   * to update does not exist a `NOT_FOUND` error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.SampleQuerySet sample_query_set = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the sampleQuerySet field is set.
   */
  boolean hasSampleQuerySet();

  /**
   *
   *
   * <pre>
   * Required. The sample query set to update.
   *
   * If the caller does not have permission to update the
   * [SampleQuerySet][google.cloud.discoveryengine.v1beta.SampleQuerySet],
   * regardless of whether or not it exists, a `PERMISSION_DENIED` error is
   * returned.
   *
   * If the [SampleQuerySet][google.cloud.discoveryengine.v1beta.SampleQuerySet]
   * to update does not exist a `NOT_FOUND` error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.SampleQuerySet sample_query_set = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The sampleQuerySet.
   */
  com.google.cloud.discoveryengine.v1beta.SampleQuerySet getSampleQuerySet();

  /**
   *
   *
   * <pre>
   * Required. The sample query set to update.
   *
   * If the caller does not have permission to update the
   * [SampleQuerySet][google.cloud.discoveryengine.v1beta.SampleQuerySet],
   * regardless of whether or not it exists, a `PERMISSION_DENIED` error is
   * returned.
   *
   * If the [SampleQuerySet][google.cloud.discoveryengine.v1beta.SampleQuerySet]
   * to update does not exist a `NOT_FOUND` error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.SampleQuerySet sample_query_set = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.SampleQuerySetOrBuilder getSampleQuerySetOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided imported 'sample query set' to
   * update. If not set, will by default update all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided imported 'sample query set' to
   * update. If not set, will by default update all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided imported 'sample query set' to
   * update. If not set, will by default update all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
