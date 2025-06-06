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
// source: google/cloud/aiplatform/v1/feature_online_store_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public interface NearestNeighborQueryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.NearestNeighborQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The entity id whose similar entities should be searched for.
   * If embedding is set, search will use embedding instead of
   * entity_id.
   * </pre>
   *
   * <code>string entity_id = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the entityId field is set.
   */
  boolean hasEntityId();

  /**
   *
   *
   * <pre>
   * Optional. The entity id whose similar entities should be searched for.
   * If embedding is set, search will use embedding instead of
   * entity_id.
   * </pre>
   *
   * <code>string entity_id = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The entityId.
   */
  java.lang.String getEntityId();

  /**
   *
   *
   * <pre>
   * Optional. The entity id whose similar entities should be searched for.
   * If embedding is set, search will use embedding instead of
   * entity_id.
   * </pre>
   *
   * <code>string entity_id = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for entityId.
   */
  com.google.protobuf.ByteString getEntityIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The embedding vector that be used for similar search.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NearestNeighborQuery.Embedding embedding = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the embedding field is set.
   */
  boolean hasEmbedding();

  /**
   *
   *
   * <pre>
   * Optional. The embedding vector that be used for similar search.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NearestNeighborQuery.Embedding embedding = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The embedding.
   */
  com.google.cloud.aiplatform.v1.NearestNeighborQuery.Embedding getEmbedding();

  /**
   *
   *
   * <pre>
   * Optional. The embedding vector that be used for similar search.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NearestNeighborQuery.Embedding embedding = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.NearestNeighborQuery.EmbeddingOrBuilder getEmbeddingOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The number of similar entities to be retrieved from feature view
   * for each query.
   * </pre>
   *
   * <code>int32 neighbor_count = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The neighborCount.
   */
  int getNeighborCount();

  /**
   *
   *
   * <pre>
   * Optional. The list of string filters.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.NearestNeighborQuery.StringFilter string_filters = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.NearestNeighborQuery.StringFilter>
      getStringFiltersList();

  /**
   *
   *
   * <pre>
   * Optional. The list of string filters.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.NearestNeighborQuery.StringFilter string_filters = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.NearestNeighborQuery.StringFilter getStringFilters(int index);

  /**
   *
   *
   * <pre>
   * Optional. The list of string filters.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.NearestNeighborQuery.StringFilter string_filters = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getStringFiltersCount();

  /**
   *
   *
   * <pre>
   * Optional. The list of string filters.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.NearestNeighborQuery.StringFilter string_filters = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.aiplatform.v1.NearestNeighborQuery.StringFilterOrBuilder>
      getStringFiltersOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. The list of string filters.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.NearestNeighborQuery.StringFilter string_filters = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.NearestNeighborQuery.StringFilterOrBuilder
      getStringFiltersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The list of numeric filters.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.NearestNeighborQuery.NumericFilter numeric_filters = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.NearestNeighborQuery.NumericFilter>
      getNumericFiltersList();

  /**
   *
   *
   * <pre>
   * Optional. The list of numeric filters.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.NearestNeighborQuery.NumericFilter numeric_filters = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.NearestNeighborQuery.NumericFilter getNumericFilters(int index);

  /**
   *
   *
   * <pre>
   * Optional. The list of numeric filters.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.NearestNeighborQuery.NumericFilter numeric_filters = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getNumericFiltersCount();

  /**
   *
   *
   * <pre>
   * Optional. The list of numeric filters.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.NearestNeighborQuery.NumericFilter numeric_filters = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.aiplatform.v1.NearestNeighborQuery.NumericFilterOrBuilder>
      getNumericFiltersOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. The list of numeric filters.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.NearestNeighborQuery.NumericFilter numeric_filters = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.NearestNeighborQuery.NumericFilterOrBuilder
      getNumericFiltersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Crowding is a constraint on a neighbor list produced by nearest
   * neighbor search requiring that no more than
   * sper_crowding_attribute_neighbor_count of the k neighbors returned have the
   * same value of crowding_attribute. It's used for improving result diversity.
   * </pre>
   *
   * <code>
   * int32 per_crowding_attribute_neighbor_count = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The perCrowdingAttributeNeighborCount.
   */
  int getPerCrowdingAttributeNeighborCount();

  /**
   *
   *
   * <pre>
   * Optional. Parameters that can be set to tune query on the fly.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NearestNeighborQuery.Parameters parameters = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();

  /**
   *
   *
   * <pre>
   * Optional. Parameters that can be set to tune query on the fly.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NearestNeighborQuery.Parameters parameters = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The parameters.
   */
  com.google.cloud.aiplatform.v1.NearestNeighborQuery.Parameters getParameters();

  /**
   *
   *
   * <pre>
   * Optional. Parameters that can be set to tune query on the fly.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NearestNeighborQuery.Parameters parameters = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.NearestNeighborQuery.ParametersOrBuilder getParametersOrBuilder();

  com.google.cloud.aiplatform.v1.NearestNeighborQuery.InstanceCase getInstanceCase();
}
