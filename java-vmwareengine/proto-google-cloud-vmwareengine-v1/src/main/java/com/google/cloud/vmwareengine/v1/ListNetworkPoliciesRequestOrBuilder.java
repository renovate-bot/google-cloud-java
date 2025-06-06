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
// source: google/cloud/vmwareengine/v1/vmwareengine.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.vmwareengine.v1;

public interface ListNetworkPoliciesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.ListNetworkPoliciesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the location (region) to query for
   * network policies. Resource names are schemeless URIs that follow the
   * conventions in https://cloud.google.com/apis/design/resource_names. For
   * example: `projects/my-project/locations/us-central1`
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
   * Required. The resource name of the location (region) to query for
   * network policies. Resource names are schemeless URIs that follow the
   * conventions in https://cloud.google.com/apis/design/resource_names. For
   * example: `projects/my-project/locations/us-central1`
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
   * The maximum number of network policies to return in one page.
   * The service may return fewer than this value.
   * The maximum value is coerced to 1000.
   * The default value of this field is 500.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A page token, received from a previous `ListNetworkPolicies` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to
   * `ListNetworkPolicies` must match the call that provided the page
   * token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();

  /**
   *
   *
   * <pre>
   * A page token, received from a previous `ListNetworkPolicies` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to
   * `ListNetworkPolicies` must match the call that provided the page
   * token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * A filter expression that matches resources returned in the response.
   * The expression must specify the field name, a comparison
   * operator, and the value that you want to use for filtering. The value
   * must be a string, a number, or a boolean. The comparison operator
   * must be `=`, `!=`, `&gt;`, or `&lt;`.
   *
   * For example, if you are filtering a list of network policies, you can
   * exclude the ones named `example-policy` by specifying
   * `name != "example-policy"`.
   *
   * To filter on multiple expressions, provide each separate expression within
   * parentheses. For example:
   * ```
   * (name = "example-policy")
   * (createTime &gt; "2021-04-12T08:15:10.40Z")
   * ```
   *
   * By default, each expression is an `AND` expression. However, you
   * can include `AND` and `OR` expressions explicitly.
   * For example:
   * ```
   * (name = "example-policy-1") AND
   * (createTime &gt; "2021-04-12T08:15:10.40Z") OR
   * (name = "example-policy-2")
   * ```
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();

  /**
   *
   *
   * <pre>
   * A filter expression that matches resources returned in the response.
   * The expression must specify the field name, a comparison
   * operator, and the value that you want to use for filtering. The value
   * must be a string, a number, or a boolean. The comparison operator
   * must be `=`, `!=`, `&gt;`, or `&lt;`.
   *
   * For example, if you are filtering a list of network policies, you can
   * exclude the ones named `example-policy` by specifying
   * `name != "example-policy"`.
   *
   * To filter on multiple expressions, provide each separate expression within
   * parentheses. For example:
   * ```
   * (name = "example-policy")
   * (createTime &gt; "2021-04-12T08:15:10.40Z")
   * ```
   *
   * By default, each expression is an `AND` expression. However, you
   * can include `AND` and `OR` expressions explicitly.
   * For example:
   * ```
   * (name = "example-policy-1") AND
   * (createTime &gt; "2021-04-12T08:15:10.40Z") OR
   * (name = "example-policy-2")
   * ```
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Sorts list results by a certain order. By default, returned results
   * are ordered by `name` in ascending order.
   * You can also sort results in descending order based on the `name` value
   * using `orderBy="name desc"`.
   * Currently, only ordering by `name` is supported.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();

  /**
   *
   *
   * <pre>
   * Sorts list results by a certain order. By default, returned results
   * are ordered by `name` in ascending order.
   * You can also sort results in descending order based on the `name` value
   * using `orderBy="name desc"`.
   * Currently, only ordering by `name` is supported.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
