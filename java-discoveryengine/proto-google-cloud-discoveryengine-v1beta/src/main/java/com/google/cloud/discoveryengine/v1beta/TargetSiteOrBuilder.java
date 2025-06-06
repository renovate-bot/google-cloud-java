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
// source: google/cloud/discoveryengine/v1beta/site_search_engine.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1beta;

public interface TargetSiteOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.TargetSite)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The fully qualified resource name of the target site.
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/siteSearchEngine/targetSites/{target_site}`
   * The `target_site_id` is system-generated.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. The fully qualified resource name of the target site.
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/siteSearchEngine/targetSites/{target_site}`
   * The `target_site_id` is system-generated.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Input only. The user provided URI pattern from which the
   * `generated_uri_pattern` is generated.
   * </pre>
   *
   * <code>
   * string provided_uri_pattern = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The providedUriPattern.
   */
  java.lang.String getProvidedUriPattern();

  /**
   *
   *
   * <pre>
   * Required. Input only. The user provided URI pattern from which the
   * `generated_uri_pattern` is generated.
   * </pre>
   *
   * <code>
   * string provided_uri_pattern = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The bytes for providedUriPattern.
   */
  com.google.protobuf.ByteString getProvidedUriPatternBytes();

  /**
   *
   *
   * <pre>
   * The type of the target site, e.g., whether the site is to be included or
   * excluded.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.TargetSite.Type type = 3;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();

  /**
   *
   *
   * <pre>
   * The type of the target site, e.g., whether the site is to be included or
   * excluded.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.TargetSite.Type type = 3;</code>
   *
   * @return The type.
   */
  com.google.cloud.discoveryengine.v1beta.TargetSite.Type getType();

  /**
   *
   *
   * <pre>
   * Input only. If set to false, a uri_pattern is generated to include all
   * pages whose address contains the provided_uri_pattern. If set to true, an
   * uri_pattern is generated to try to be an exact match of the
   * provided_uri_pattern or just the specific page if the provided_uri_pattern
   * is a specific one. provided_uri_pattern is always normalized to
   * generate the URI pattern to be used by the search engine.
   * </pre>
   *
   * <code>bool exact_match = 6 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The exactMatch.
   */
  boolean getExactMatch();

  /**
   *
   *
   * <pre>
   * Output only. This is system-generated based on the provided_uri_pattern.
   * </pre>
   *
   * <code>string generated_uri_pattern = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The generatedUriPattern.
   */
  java.lang.String getGeneratedUriPattern();

  /**
   *
   *
   * <pre>
   * Output only. This is system-generated based on the provided_uri_pattern.
   * </pre>
   *
   * <code>string generated_uri_pattern = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for generatedUriPattern.
   */
  com.google.protobuf.ByteString getGeneratedUriPatternBytes();

  /**
   *
   *
   * <pre>
   * Output only. Root domain of the provided_uri_pattern.
   * </pre>
   *
   * <code>string root_domain_uri = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The rootDomainUri.
   */
  java.lang.String getRootDomainUri();

  /**
   *
   *
   * <pre>
   * Output only. Root domain of the provided_uri_pattern.
   * </pre>
   *
   * <code>string root_domain_uri = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for rootDomainUri.
   */
  com.google.protobuf.ByteString getRootDomainUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. Site ownership and validity verification status.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.SiteVerificationInfo site_verification_info = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the siteVerificationInfo field is set.
   */
  boolean hasSiteVerificationInfo();

  /**
   *
   *
   * <pre>
   * Output only. Site ownership and validity verification status.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.SiteVerificationInfo site_verification_info = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The siteVerificationInfo.
   */
  com.google.cloud.discoveryengine.v1beta.SiteVerificationInfo getSiteVerificationInfo();

  /**
   *
   *
   * <pre>
   * Output only. Site ownership and validity verification status.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.SiteVerificationInfo site_verification_info = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.SiteVerificationInfoOrBuilder
      getSiteVerificationInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Indexing status.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.TargetSite.IndexingStatus indexing_status = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for indexingStatus.
   */
  int getIndexingStatusValue();

  /**
   *
   *
   * <pre>
   * Output only. Indexing status.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.TargetSite.IndexingStatus indexing_status = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The indexingStatus.
   */
  com.google.cloud.discoveryengine.v1beta.TargetSite.IndexingStatus getIndexingStatus();

  /**
   *
   *
   * <pre>
   * Output only. The target site's last updated time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The target site's last updated time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The target site's last updated time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Failure reason.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.TargetSite.FailureReason failure_reason = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the failureReason field is set.
   */
  boolean hasFailureReason();

  /**
   *
   *
   * <pre>
   * Output only. Failure reason.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.TargetSite.FailureReason failure_reason = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The failureReason.
   */
  com.google.cloud.discoveryengine.v1beta.TargetSite.FailureReason getFailureReason();

  /**
   *
   *
   * <pre>
   * Output only. Failure reason.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.TargetSite.FailureReason failure_reason = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.TargetSite.FailureReasonOrBuilder
      getFailureReasonOrBuilder();
}
