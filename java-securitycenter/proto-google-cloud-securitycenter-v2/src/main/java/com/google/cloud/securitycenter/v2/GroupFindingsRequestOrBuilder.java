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
// source: google/cloud/securitycenter/v2/securitycenter_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v2;

public interface GroupFindingsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v2.GroupFindingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the source to groupBy. If no location is specified,
   * finding is assumed to be in global.
   *  The following list shows some examples:
   *
   * + `organizations/[organization_id]/sources/[source_id]`
   * +
   * `organizations/[organization_id]/sources/[source_id]/locations/[location_id]`
   * + `folders/[folder_id]/sources/[source_id]`
   * + `folders/[folder_id]/sources/[source_id]/locations/[location_id]`
   * + `projects/[project_id]/sources/[source_id]`
   * + `projects/[project_id]/sources/[source_id]/locations/[location_id]`
   *
   * To groupBy across all sources provide a source_id of `-`. The following
   * list shows some examples:
   *
   * + `organizations/{organization_id}/sources/-`
   * + `organizations/{organization_id}/sources/-/locations/[location_id]`
   * + `folders/{folder_id}/sources/-`
   * + `folders/{folder_id}/sources/-/locations/[location_id]`
   * + `projects/{project_id}/sources/-`
   * + `projects/{project_id}/sources/-/locations/[location_id]`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. Name of the source to groupBy. If no location is specified,
   * finding is assumed to be in global.
   *  The following list shows some examples:
   *
   * + `organizations/[organization_id]/sources/[source_id]`
   * +
   * `organizations/[organization_id]/sources/[source_id]/locations/[location_id]`
   * + `folders/[folder_id]/sources/[source_id]`
   * + `folders/[folder_id]/sources/[source_id]/locations/[location_id]`
   * + `projects/[project_id]/sources/[source_id]`
   * + `projects/[project_id]/sources/[source_id]/locations/[location_id]`
   *
   * To groupBy across all sources provide a source_id of `-`. The following
   * list shows some examples:
   *
   * + `organizations/{organization_id}/sources/-`
   * + `organizations/{organization_id}/sources/-/locations/[location_id]`
   * + `folders/{folder_id}/sources/-`
   * + `folders/{folder_id}/sources/-/locations/[location_id]`
   * + `projects/{project_id}/sources/-`
   * + `projects/{project_id}/sources/-/locations/[location_id]`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Expression that defines the filter to apply across findings.
   * The expression is a list of one or more restrictions combined via logical
   * operators `AND` and `OR`.
   * Parentheses are supported, and `OR` has higher precedence than `AND`.
   *
   * Restrictions have the form `&lt;field&gt; &lt;operator&gt; &lt;value&gt;` and may have a `-`
   * character in front of them to indicate negation. Examples include:
   *
   *  * name
   *  * security_marks.marks.marka
   *
   * The supported operators are:
   *
   * * `=` for all value types.
   * * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values.
   * * `:`, meaning substring matching, for strings.
   *
   * The supported value types are:
   *
   * * string literals in quotes.
   * * integer literals without quotes.
   * * boolean literals `true` and `false` without quotes.
   *
   * The following field and operator combinations are supported:
   *
   * * name: `=`
   * * parent: `=`, `:`
   * * resource_name: `=`, `:`
   * * state: `=`, `:`
   * * category: `=`, `:`
   * * external_uri: `=`, `:`
   * * event_time: `=`, `&gt;`, `&lt;`, `&gt;=`, `&lt;=`
   *
   *   Usage: This should be milliseconds since epoch or an RFC3339 string.
   *   Examples:
   *     `event_time = "2019-06-10T16:07:18-07:00"`
   *     `event_time = 1560208038000`
   *
   * * severity: `=`, `:`
   * * security_marks.marks: `=`, `:`
   * * resource:
   *   * resource.name: `=`, `:`
   *   * resource.parent_name: `=`, `:`
   *   * resource.parent_display_name: `=`, `:`
   *   * resource.project_name: `=`, `:`
   *   * resource.project_display_name: `=`, `:`
   *   * resource.type: `=`, `:`
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();

  /**
   *
   *
   * <pre>
   * Expression that defines the filter to apply across findings.
   * The expression is a list of one or more restrictions combined via logical
   * operators `AND` and `OR`.
   * Parentheses are supported, and `OR` has higher precedence than `AND`.
   *
   * Restrictions have the form `&lt;field&gt; &lt;operator&gt; &lt;value&gt;` and may have a `-`
   * character in front of them to indicate negation. Examples include:
   *
   *  * name
   *  * security_marks.marks.marka
   *
   * The supported operators are:
   *
   * * `=` for all value types.
   * * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values.
   * * `:`, meaning substring matching, for strings.
   *
   * The supported value types are:
   *
   * * string literals in quotes.
   * * integer literals without quotes.
   * * boolean literals `true` and `false` without quotes.
   *
   * The following field and operator combinations are supported:
   *
   * * name: `=`
   * * parent: `=`, `:`
   * * resource_name: `=`, `:`
   * * state: `=`, `:`
   * * category: `=`, `:`
   * * external_uri: `=`, `:`
   * * event_time: `=`, `&gt;`, `&lt;`, `&gt;=`, `&lt;=`
   *
   *   Usage: This should be milliseconds since epoch or an RFC3339 string.
   *   Examples:
   *     `event_time = "2019-06-10T16:07:18-07:00"`
   *     `event_time = 1560208038000`
   *
   * * severity: `=`, `:`
   * * security_marks.marks: `=`, `:`
   * * resource:
   *   * resource.name: `=`, `:`
   *   * resource.parent_name: `=`, `:`
   *   * resource.parent_display_name: `=`, `:`
   *   * resource.project_name: `=`, `:`
   *   * resource.project_display_name: `=`, `:`
   *   * resource.type: `=`, `:`
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Required. Expression that defines what assets fields to use for grouping.
   * The string value should follow SQL syntax: comma separated list of fields.
   * For example: "parent,resource_name".
   * </pre>
   *
   * <code>string group_by = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The groupBy.
   */
  java.lang.String getGroupBy();

  /**
   *
   *
   * <pre>
   * Required. Expression that defines what assets fields to use for grouping.
   * The string value should follow SQL syntax: comma separated list of fields.
   * For example: "parent,resource_name".
   * </pre>
   *
   * <code>string group_by = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for groupBy.
   */
  com.google.protobuf.ByteString getGroupByBytes();

  /**
   *
   *
   * <pre>
   * The value returned by the last `GroupFindingsResponse`; indicates
   * that this is a continuation of a prior `GroupFindings` call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 7;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();

  /**
   *
   *
   * <pre>
   * The value returned by the last `GroupFindingsResponse`; indicates
   * that this is a continuation of a prior `GroupFindings` call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 7;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of results to return in a single response. Default is
   * 10, minimum is 1, maximum is 1000.
   * </pre>
   *
   * <code>int32 page_size = 8;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();
}
