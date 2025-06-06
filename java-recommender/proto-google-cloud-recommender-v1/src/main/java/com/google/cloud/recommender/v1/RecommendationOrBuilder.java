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
// source: google/cloud/recommender/v1/recommendation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.recommender.v1;

public interface RecommendationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1.Recommendation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of recommendation.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Name of recommendation.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Free-form human readable summary in English. The maximum length is 500
   * characters.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Free-form human readable summary in English. The maximum length is 500
   * characters.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Contains an identifier for a subtype of recommendations produced for the
   * same recommender. Subtype is a function of content and impact, meaning a
   * new subtype might be added when significant changes to `content` or
   * `primary_impact.category` are introduced. See the Recommenders section
   * to see a list of subtypes for a given Recommender.
   *
   * Examples:
   *   For recommender = "google.iam.policy.Recommender",
   *   recommender_subtype can be one of "REMOVE_ROLE"/"REPLACE_ROLE"
   * </pre>
   *
   * <code>string recommender_subtype = 12;</code>
   *
   * @return The recommenderSubtype.
   */
  java.lang.String getRecommenderSubtype();

  /**
   *
   *
   * <pre>
   * Contains an identifier for a subtype of recommendations produced for the
   * same recommender. Subtype is a function of content and impact, meaning a
   * new subtype might be added when significant changes to `content` or
   * `primary_impact.category` are introduced. See the Recommenders section
   * to see a list of subtypes for a given Recommender.
   *
   * Examples:
   *   For recommender = "google.iam.policy.Recommender",
   *   recommender_subtype can be one of "REMOVE_ROLE"/"REPLACE_ROLE"
   * </pre>
   *
   * <code>string recommender_subtype = 12;</code>
   *
   * @return The bytes for recommenderSubtype.
   */
  com.google.protobuf.ByteString getRecommenderSubtypeBytes();

  /**
   *
   *
   * <pre>
   * Last time this recommendation was refreshed by the system that created it
   * in the first place.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_refresh_time = 4;</code>
   *
   * @return Whether the lastRefreshTime field is set.
   */
  boolean hasLastRefreshTime();

  /**
   *
   *
   * <pre>
   * Last time this recommendation was refreshed by the system that created it
   * in the first place.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_refresh_time = 4;</code>
   *
   * @return The lastRefreshTime.
   */
  com.google.protobuf.Timestamp getLastRefreshTime();

  /**
   *
   *
   * <pre>
   * Last time this recommendation was refreshed by the system that created it
   * in the first place.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_refresh_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastRefreshTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The primary impact that this recommendation can have while trying to
   * optimize for one category.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.Impact primary_impact = 5;</code>
   *
   * @return Whether the primaryImpact field is set.
   */
  boolean hasPrimaryImpact();

  /**
   *
   *
   * <pre>
   * The primary impact that this recommendation can have while trying to
   * optimize for one category.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.Impact primary_impact = 5;</code>
   *
   * @return The primaryImpact.
   */
  com.google.cloud.recommender.v1.Impact getPrimaryImpact();

  /**
   *
   *
   * <pre>
   * The primary impact that this recommendation can have while trying to
   * optimize for one category.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.Impact primary_impact = 5;</code>
   */
  com.google.cloud.recommender.v1.ImpactOrBuilder getPrimaryImpactOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional set of additional impact that this recommendation may have when
   * trying to optimize for the primary category. These may be positive
   * or negative.
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1.Impact additional_impact = 6;</code>
   */
  java.util.List<com.google.cloud.recommender.v1.Impact> getAdditionalImpactList();

  /**
   *
   *
   * <pre>
   * Optional set of additional impact that this recommendation may have when
   * trying to optimize for the primary category. These may be positive
   * or negative.
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1.Impact additional_impact = 6;</code>
   */
  com.google.cloud.recommender.v1.Impact getAdditionalImpact(int index);

  /**
   *
   *
   * <pre>
   * Optional set of additional impact that this recommendation may have when
   * trying to optimize for the primary category. These may be positive
   * or negative.
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1.Impact additional_impact = 6;</code>
   */
  int getAdditionalImpactCount();

  /**
   *
   *
   * <pre>
   * Optional set of additional impact that this recommendation may have when
   * trying to optimize for the primary category. These may be positive
   * or negative.
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1.Impact additional_impact = 6;</code>
   */
  java.util.List<? extends com.google.cloud.recommender.v1.ImpactOrBuilder>
      getAdditionalImpactOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional set of additional impact that this recommendation may have when
   * trying to optimize for the primary category. These may be positive
   * or negative.
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1.Impact additional_impact = 6;</code>
   */
  com.google.cloud.recommender.v1.ImpactOrBuilder getAdditionalImpactOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Recommendation's priority.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.Recommendation.Priority priority = 17;</code>
   *
   * @return The enum numeric value on the wire for priority.
   */
  int getPriorityValue();

  /**
   *
   *
   * <pre>
   * Recommendation's priority.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.Recommendation.Priority priority = 17;</code>
   *
   * @return The priority.
   */
  com.google.cloud.recommender.v1.Recommendation.Priority getPriority();

  /**
   *
   *
   * <pre>
   * Content of the recommendation describing recommended changes to resources.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.RecommendationContent content = 7;</code>
   *
   * @return Whether the content field is set.
   */
  boolean hasContent();

  /**
   *
   *
   * <pre>
   * Content of the recommendation describing recommended changes to resources.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.RecommendationContent content = 7;</code>
   *
   * @return The content.
   */
  com.google.cloud.recommender.v1.RecommendationContent getContent();

  /**
   *
   *
   * <pre>
   * Content of the recommendation describing recommended changes to resources.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.RecommendationContent content = 7;</code>
   */
  com.google.cloud.recommender.v1.RecommendationContentOrBuilder getContentOrBuilder();

  /**
   *
   *
   * <pre>
   * Information for state. Contains state and metadata.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.RecommendationStateInfo state_info = 10;</code>
   *
   * @return Whether the stateInfo field is set.
   */
  boolean hasStateInfo();

  /**
   *
   *
   * <pre>
   * Information for state. Contains state and metadata.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.RecommendationStateInfo state_info = 10;</code>
   *
   * @return The stateInfo.
   */
  com.google.cloud.recommender.v1.RecommendationStateInfo getStateInfo();

  /**
   *
   *
   * <pre>
   * Information for state. Contains state and metadata.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.RecommendationStateInfo state_info = 10;</code>
   */
  com.google.cloud.recommender.v1.RecommendationStateInfoOrBuilder getStateInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Fingerprint of the Recommendation. Provides optimistic locking when
   * updating states.
   * </pre>
   *
   * <code>string etag = 11;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * Fingerprint of the Recommendation. Provides optimistic locking when
   * updating states.
   * </pre>
   *
   * <code>string etag = 11;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Insights that led to this recommendation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommender.v1.Recommendation.InsightReference associated_insights = 14;
   * </code>
   */
  java.util.List<com.google.cloud.recommender.v1.Recommendation.InsightReference>
      getAssociatedInsightsList();

  /**
   *
   *
   * <pre>
   * Insights that led to this recommendation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommender.v1.Recommendation.InsightReference associated_insights = 14;
   * </code>
   */
  com.google.cloud.recommender.v1.Recommendation.InsightReference getAssociatedInsights(int index);

  /**
   *
   *
   * <pre>
   * Insights that led to this recommendation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommender.v1.Recommendation.InsightReference associated_insights = 14;
   * </code>
   */
  int getAssociatedInsightsCount();

  /**
   *
   *
   * <pre>
   * Insights that led to this recommendation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommender.v1.Recommendation.InsightReference associated_insights = 14;
   * </code>
   */
  java.util.List<? extends com.google.cloud.recommender.v1.Recommendation.InsightReferenceOrBuilder>
      getAssociatedInsightsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Insights that led to this recommendation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommender.v1.Recommendation.InsightReference associated_insights = 14;
   * </code>
   */
  com.google.cloud.recommender.v1.Recommendation.InsightReferenceOrBuilder
      getAssociatedInsightsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Corresponds to a mutually exclusive group ID within a recommender.
   * A non-empty ID indicates that the recommendation belongs to a mutually
   * exclusive group. This means that only one recommendation within the group
   * is suggested to be applied.
   * </pre>
   *
   * <code>string xor_group_id = 18;</code>
   *
   * @return The xorGroupId.
   */
  java.lang.String getXorGroupId();

  /**
   *
   *
   * <pre>
   * Corresponds to a mutually exclusive group ID within a recommender.
   * A non-empty ID indicates that the recommendation belongs to a mutually
   * exclusive group. This means that only one recommendation within the group
   * is suggested to be applied.
   * </pre>
   *
   * <code>string xor_group_id = 18;</code>
   *
   * @return The bytes for xorGroupId.
   */
  com.google.protobuf.ByteString getXorGroupIdBytes();
}
