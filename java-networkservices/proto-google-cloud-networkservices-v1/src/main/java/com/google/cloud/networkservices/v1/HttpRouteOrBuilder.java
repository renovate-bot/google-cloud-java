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
// source: google/cloud/networkservices/v1/http_route.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.networkservices.v1;

public interface HttpRouteOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkservices.v1.HttpRoute)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. Name of the HttpRoute resource. It matches pattern
   * `projects/&#42;&#47;locations/global/httpRoutes/http_route_name&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. Name of the HttpRoute resource. It matches pattern
   * `projects/&#42;&#47;locations/global/httpRoutes/http_route_name&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Server-defined URL of this resource
   * </pre>
   *
   * <code>string self_link = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();

  /**
   *
   *
   * <pre>
   * Output only. Server-defined URL of this resource
   * </pre>
   *
   * <code>string self_link = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * Optional. A free-text description of the resource. Max length 1024
   * characters.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Optional. A free-text description of the resource. Max length 1024
   * characters.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Hostnames define a set of hosts that should match against the
   * HTTP host header to select a HttpRoute to process the request. Hostname is
   * the fully qualified domain name of a network host, as defined by RFC 1123
   * with the exception that:
   *  - IPs are not allowed.
   *  - A hostname may be prefixed with a wildcard label (`*.`). The wildcard
   *    label must appear by itself as the first label.
   *
   * Hostname can be "precise" which is a domain name without the terminating
   * dot of a network host (e.g. `foo.example.com`) or "wildcard", which is a
   * domain name prefixed with a single wildcard label (e.g. `*.example.com`).
   *
   * Note that as per RFC1035 and RFC1123, a label must consist of lower case
   * alphanumeric characters or '-', and must start and end with an alphanumeric
   * character. No other punctuation is allowed.
   *
   * The routes associated with a Mesh or Gateways  must have unique hostnames.
   * If you attempt to attach multiple routes with conflicting hostnames,
   * the configuration will be rejected.
   *
   * For example, while it is acceptable for routes for the hostnames
   * `*.foo.bar.com` and `*.bar.com` to be associated with the same Mesh (or
   * Gateways under the same scope), it is not possible to associate two routes
   * both with `*.bar.com` or both with `bar.com`.
   * </pre>
   *
   * <code>repeated string hostnames = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the hostnames.
   */
  java.util.List<java.lang.String> getHostnamesList();

  /**
   *
   *
   * <pre>
   * Required. Hostnames define a set of hosts that should match against the
   * HTTP host header to select a HttpRoute to process the request. Hostname is
   * the fully qualified domain name of a network host, as defined by RFC 1123
   * with the exception that:
   *  - IPs are not allowed.
   *  - A hostname may be prefixed with a wildcard label (`*.`). The wildcard
   *    label must appear by itself as the first label.
   *
   * Hostname can be "precise" which is a domain name without the terminating
   * dot of a network host (e.g. `foo.example.com`) or "wildcard", which is a
   * domain name prefixed with a single wildcard label (e.g. `*.example.com`).
   *
   * Note that as per RFC1035 and RFC1123, a label must consist of lower case
   * alphanumeric characters or '-', and must start and end with an alphanumeric
   * character. No other punctuation is allowed.
   *
   * The routes associated with a Mesh or Gateways  must have unique hostnames.
   * If you attempt to attach multiple routes with conflicting hostnames,
   * the configuration will be rejected.
   *
   * For example, while it is acceptable for routes for the hostnames
   * `*.foo.bar.com` and `*.bar.com` to be associated with the same Mesh (or
   * Gateways under the same scope), it is not possible to associate two routes
   * both with `*.bar.com` or both with `bar.com`.
   * </pre>
   *
   * <code>repeated string hostnames = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of hostnames.
   */
  int getHostnamesCount();

  /**
   *
   *
   * <pre>
   * Required. Hostnames define a set of hosts that should match against the
   * HTTP host header to select a HttpRoute to process the request. Hostname is
   * the fully qualified domain name of a network host, as defined by RFC 1123
   * with the exception that:
   *  - IPs are not allowed.
   *  - A hostname may be prefixed with a wildcard label (`*.`). The wildcard
   *    label must appear by itself as the first label.
   *
   * Hostname can be "precise" which is a domain name without the terminating
   * dot of a network host (e.g. `foo.example.com`) or "wildcard", which is a
   * domain name prefixed with a single wildcard label (e.g. `*.example.com`).
   *
   * Note that as per RFC1035 and RFC1123, a label must consist of lower case
   * alphanumeric characters or '-', and must start and end with an alphanumeric
   * character. No other punctuation is allowed.
   *
   * The routes associated with a Mesh or Gateways  must have unique hostnames.
   * If you attempt to attach multiple routes with conflicting hostnames,
   * the configuration will be rejected.
   *
   * For example, while it is acceptable for routes for the hostnames
   * `*.foo.bar.com` and `*.bar.com` to be associated with the same Mesh (or
   * Gateways under the same scope), it is not possible to associate two routes
   * both with `*.bar.com` or both with `bar.com`.
   * </pre>
   *
   * <code>repeated string hostnames = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The hostnames at the given index.
   */
  java.lang.String getHostnames(int index);

  /**
   *
   *
   * <pre>
   * Required. Hostnames define a set of hosts that should match against the
   * HTTP host header to select a HttpRoute to process the request. Hostname is
   * the fully qualified domain name of a network host, as defined by RFC 1123
   * with the exception that:
   *  - IPs are not allowed.
   *  - A hostname may be prefixed with a wildcard label (`*.`). The wildcard
   *    label must appear by itself as the first label.
   *
   * Hostname can be "precise" which is a domain name without the terminating
   * dot of a network host (e.g. `foo.example.com`) or "wildcard", which is a
   * domain name prefixed with a single wildcard label (e.g. `*.example.com`).
   *
   * Note that as per RFC1035 and RFC1123, a label must consist of lower case
   * alphanumeric characters or '-', and must start and end with an alphanumeric
   * character. No other punctuation is allowed.
   *
   * The routes associated with a Mesh or Gateways  must have unique hostnames.
   * If you attempt to attach multiple routes with conflicting hostnames,
   * the configuration will be rejected.
   *
   * For example, while it is acceptable for routes for the hostnames
   * `*.foo.bar.com` and `*.bar.com` to be associated with the same Mesh (or
   * Gateways under the same scope), it is not possible to associate two routes
   * both with `*.bar.com` or both with `bar.com`.
   * </pre>
   *
   * <code>repeated string hostnames = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the hostnames at the given index.
   */
  com.google.protobuf.ByteString getHostnamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Meshes defines a list of meshes this HttpRoute is attached to, as
   * one of the routing rules to route the requests served by the mesh.
   *
   * Each mesh reference should match the pattern:
   * `projects/&#42;&#47;locations/global/meshes/&lt;mesh_name&gt;`
   *
   * The attached Mesh should be of a type SIDECAR
   * </pre>
   *
   * <code>
   * repeated string meshes = 8 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the meshes.
   */
  java.util.List<java.lang.String> getMeshesList();

  /**
   *
   *
   * <pre>
   * Optional. Meshes defines a list of meshes this HttpRoute is attached to, as
   * one of the routing rules to route the requests served by the mesh.
   *
   * Each mesh reference should match the pattern:
   * `projects/&#42;&#47;locations/global/meshes/&lt;mesh_name&gt;`
   *
   * The attached Mesh should be of a type SIDECAR
   * </pre>
   *
   * <code>
   * repeated string meshes = 8 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of meshes.
   */
  int getMeshesCount();

  /**
   *
   *
   * <pre>
   * Optional. Meshes defines a list of meshes this HttpRoute is attached to, as
   * one of the routing rules to route the requests served by the mesh.
   *
   * Each mesh reference should match the pattern:
   * `projects/&#42;&#47;locations/global/meshes/&lt;mesh_name&gt;`
   *
   * The attached Mesh should be of a type SIDECAR
   * </pre>
   *
   * <code>
   * repeated string meshes = 8 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The meshes at the given index.
   */
  java.lang.String getMeshes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Meshes defines a list of meshes this HttpRoute is attached to, as
   * one of the routing rules to route the requests served by the mesh.
   *
   * Each mesh reference should match the pattern:
   * `projects/&#42;&#47;locations/global/meshes/&lt;mesh_name&gt;`
   *
   * The attached Mesh should be of a type SIDECAR
   * </pre>
   *
   * <code>
   * repeated string meshes = 8 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the meshes at the given index.
   */
  com.google.protobuf.ByteString getMeshesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Gateways defines a list of gateways this HttpRoute is attached
   * to, as one of the routing rules to route the requests served by the
   * gateway.
   *
   * Each gateway reference should match the pattern:
   * `projects/&#42;&#47;locations/global/gateways/&lt;gateway_name&gt;`
   * </pre>
   *
   * <code>
   * repeated string gateways = 9 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the gateways.
   */
  java.util.List<java.lang.String> getGatewaysList();

  /**
   *
   *
   * <pre>
   * Optional. Gateways defines a list of gateways this HttpRoute is attached
   * to, as one of the routing rules to route the requests served by the
   * gateway.
   *
   * Each gateway reference should match the pattern:
   * `projects/&#42;&#47;locations/global/gateways/&lt;gateway_name&gt;`
   * </pre>
   *
   * <code>
   * repeated string gateways = 9 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of gateways.
   */
  int getGatewaysCount();

  /**
   *
   *
   * <pre>
   * Optional. Gateways defines a list of gateways this HttpRoute is attached
   * to, as one of the routing rules to route the requests served by the
   * gateway.
   *
   * Each gateway reference should match the pattern:
   * `projects/&#42;&#47;locations/global/gateways/&lt;gateway_name&gt;`
   * </pre>
   *
   * <code>
   * repeated string gateways = 9 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The gateways at the given index.
   */
  java.lang.String getGateways(int index);

  /**
   *
   *
   * <pre>
   * Optional. Gateways defines a list of gateways this HttpRoute is attached
   * to, as one of the routing rules to route the requests served by the
   * gateway.
   *
   * Each gateway reference should match the pattern:
   * `projects/&#42;&#47;locations/global/gateways/&lt;gateway_name&gt;`
   * </pre>
   *
   * <code>
   * repeated string gateways = 9 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the gateways at the given index.
   */
  com.google.protobuf.ByteString getGatewaysBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the HttpRoute resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the HttpRoute resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the HttpRoute resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the HttpRoute resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the HttpRoute resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. Rules that define how traffic is routed and handled.
   * Rules will be matched sequentially based on the RouteMatch specified for
   * the rule.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkservices.v1.HttpRoute.RouteRule rules = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.networkservices.v1.HttpRoute.RouteRule> getRulesList();

  /**
   *
   *
   * <pre>
   * Required. Rules that define how traffic is routed and handled.
   * Rules will be matched sequentially based on the RouteMatch specified for
   * the rule.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkservices.v1.HttpRoute.RouteRule rules = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.networkservices.v1.HttpRoute.RouteRule getRules(int index);

  /**
   *
   *
   * <pre>
   * Required. Rules that define how traffic is routed and handled.
   * Rules will be matched sequentially based on the RouteMatch specified for
   * the rule.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkservices.v1.HttpRoute.RouteRule rules = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getRulesCount();

  /**
   *
   *
   * <pre>
   * Required. Rules that define how traffic is routed and handled.
   * Rules will be matched sequentially based on the RouteMatch specified for
   * the rule.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkservices.v1.HttpRoute.RouteRule rules = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.networkservices.v1.HttpRoute.RouteRuleOrBuilder>
      getRulesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Required. Rules that define how traffic is routed and handled.
   * Rules will be matched sequentially based on the RouteMatch specified for
   * the rule.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkservices.v1.HttpRoute.RouteRule rules = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.networkservices.v1.HttpRoute.RouteRuleOrBuilder getRulesOrBuilder(int index);
}
