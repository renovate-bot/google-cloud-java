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
// source: google/cloud/dialogflow/v2beta1/participant.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.v2beta1;

public interface AssistQueryParametersOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.AssistQueryParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their
   * [Document.metadata][google.cloud.dialogflow.v2beta1.Document.metadata].
   * Multiple values for a metadata key should be concatenated by comma. For
   * example, filters to match all documents that have 'US' or 'CA' in their
   * market metadata values and 'agent' in their user metadata values will be
   * ```
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
   */
  int getDocumentsMetadataFiltersCount();

  /**
   *
   *
   * <pre>
   * Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their
   * [Document.metadata][google.cloud.dialogflow.v2beta1.Document.metadata].
   * Multiple values for a metadata key should be concatenated by comma. For
   * example, filters to match all documents that have 'US' or 'CA' in their
   * market metadata values and 'agent' in their user metadata values will be
   * ```
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
   */
  boolean containsDocumentsMetadataFilters(java.lang.String key);

  /** Use {@link #getDocumentsMetadataFiltersMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getDocumentsMetadataFilters();

  /**
   *
   *
   * <pre>
   * Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their
   * [Document.metadata][google.cloud.dialogflow.v2beta1.Document.metadata].
   * Multiple values for a metadata key should be concatenated by comma. For
   * example, filters to match all documents that have 'US' or 'CA' in their
   * market metadata values and 'agent' in their user metadata values will be
   * ```
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getDocumentsMetadataFiltersMap();

  /**
   *
   *
   * <pre>
   * Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their
   * [Document.metadata][google.cloud.dialogflow.v2beta1.Document.metadata].
   * Multiple values for a metadata key should be concatenated by comma. For
   * example, filters to match all documents that have 'US' or 'CA' in their
   * market metadata values and 'agent' in their user metadata values will be
   * ```
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
   */
  /* nullable */
  java.lang.String getDocumentsMetadataFiltersOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their
   * [Document.metadata][google.cloud.dialogflow.v2beta1.Document.metadata].
   * Multiple values for a metadata key should be concatenated by comma. For
   * example, filters to match all documents that have 'US' or 'CA' in their
   * market metadata values and 'agent' in their user metadata values will be
   * ```
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
   */
  java.lang.String getDocumentsMetadataFiltersOrThrow(java.lang.String key);
}
