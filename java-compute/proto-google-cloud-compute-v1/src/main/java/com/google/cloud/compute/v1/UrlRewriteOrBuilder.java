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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

public interface UrlRewriteOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.UrlRewrite)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Before forwarding the request to the selected service, the request's host header is replaced with contents of hostRewrite. The value must be from 1 to 255 characters.
   * </pre>
   *
   * <code>optional string host_rewrite = 159819253;</code>
   *
   * @return Whether the hostRewrite field is set.
   */
  boolean hasHostRewrite();

  /**
   *
   *
   * <pre>
   * Before forwarding the request to the selected service, the request's host header is replaced with contents of hostRewrite. The value must be from 1 to 255 characters.
   * </pre>
   *
   * <code>optional string host_rewrite = 159819253;</code>
   *
   * @return The hostRewrite.
   */
  java.lang.String getHostRewrite();

  /**
   *
   *
   * <pre>
   * Before forwarding the request to the selected service, the request's host header is replaced with contents of hostRewrite. The value must be from 1 to 255 characters.
   * </pre>
   *
   * <code>optional string host_rewrite = 159819253;</code>
   *
   * @return The bytes for hostRewrite.
   */
  com.google.protobuf.ByteString getHostRewriteBytes();

  /**
   *
   *
   * <pre>
   * Before forwarding the request to the selected backend service, the matching portion of the request's path is replaced by pathPrefixRewrite. The value must be from 1 to 1024 characters.
   * </pre>
   *
   * <code>optional string path_prefix_rewrite = 41186361;</code>
   *
   * @return Whether the pathPrefixRewrite field is set.
   */
  boolean hasPathPrefixRewrite();

  /**
   *
   *
   * <pre>
   * Before forwarding the request to the selected backend service, the matching portion of the request's path is replaced by pathPrefixRewrite. The value must be from 1 to 1024 characters.
   * </pre>
   *
   * <code>optional string path_prefix_rewrite = 41186361;</code>
   *
   * @return The pathPrefixRewrite.
   */
  java.lang.String getPathPrefixRewrite();

  /**
   *
   *
   * <pre>
   * Before forwarding the request to the selected backend service, the matching portion of the request's path is replaced by pathPrefixRewrite. The value must be from 1 to 1024 characters.
   * </pre>
   *
   * <code>optional string path_prefix_rewrite = 41186361;</code>
   *
   * @return The bytes for pathPrefixRewrite.
   */
  com.google.protobuf.ByteString getPathPrefixRewriteBytes();

  /**
   *
   *
   * <pre>
   *  If specified, the pattern rewrites the URL path (based on the :path header) using the HTTP template syntax. A corresponding path_template_match must be specified. Any template variables must exist in the path_template_match field. - -At least one variable must be specified in the path_template_match field - You can omit variables from the rewritten URL - The * and ** operators cannot be matched unless they have a corresponding variable name - e.g. {format=*} or {var=**}. For example, a path_template_match of /static/{format=**} could be rewritten as /static/content/{format} to prefix /content to the URL. Variables can also be re-ordered in a rewrite, so that /{country}/{format}/{suffix=**} can be rewritten as /content/{format}/{country}/{suffix}. At least one non-empty routeRules[].matchRules[].path_template_match is required. Only one of path_prefix_rewrite or path_template_rewrite may be specified.
   * </pre>
   *
   * <code>optional string path_template_rewrite = 423409569;</code>
   *
   * @return Whether the pathTemplateRewrite field is set.
   */
  boolean hasPathTemplateRewrite();

  /**
   *
   *
   * <pre>
   *  If specified, the pattern rewrites the URL path (based on the :path header) using the HTTP template syntax. A corresponding path_template_match must be specified. Any template variables must exist in the path_template_match field. - -At least one variable must be specified in the path_template_match field - You can omit variables from the rewritten URL - The * and ** operators cannot be matched unless they have a corresponding variable name - e.g. {format=*} or {var=**}. For example, a path_template_match of /static/{format=**} could be rewritten as /static/content/{format} to prefix /content to the URL. Variables can also be re-ordered in a rewrite, so that /{country}/{format}/{suffix=**} can be rewritten as /content/{format}/{country}/{suffix}. At least one non-empty routeRules[].matchRules[].path_template_match is required. Only one of path_prefix_rewrite or path_template_rewrite may be specified.
   * </pre>
   *
   * <code>optional string path_template_rewrite = 423409569;</code>
   *
   * @return The pathTemplateRewrite.
   */
  java.lang.String getPathTemplateRewrite();

  /**
   *
   *
   * <pre>
   *  If specified, the pattern rewrites the URL path (based on the :path header) using the HTTP template syntax. A corresponding path_template_match must be specified. Any template variables must exist in the path_template_match field. - -At least one variable must be specified in the path_template_match field - You can omit variables from the rewritten URL - The * and ** operators cannot be matched unless they have a corresponding variable name - e.g. {format=*} or {var=**}. For example, a path_template_match of /static/{format=**} could be rewritten as /static/content/{format} to prefix /content to the URL. Variables can also be re-ordered in a rewrite, so that /{country}/{format}/{suffix=**} can be rewritten as /content/{format}/{country}/{suffix}. At least one non-empty routeRules[].matchRules[].path_template_match is required. Only one of path_prefix_rewrite or path_template_rewrite may be specified.
   * </pre>
   *
   * <code>optional string path_template_rewrite = 423409569;</code>
   *
   * @return The bytes for pathTemplateRewrite.
   */
  com.google.protobuf.ByteString getPathTemplateRewriteBytes();
}
