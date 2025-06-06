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
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

// Protobuf Java Version: 3.25.8
package com.google.identity.accesscontextmanager.v1;

public interface ListAccessPoliciesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of the AccessPolicy instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
   * </code>
   */
  java.util.List<com.google.identity.accesscontextmanager.v1.AccessPolicy> getAccessPoliciesList();

  /**
   *
   *
   * <pre>
   * List of the AccessPolicy instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
   * </code>
   */
  com.google.identity.accesscontextmanager.v1.AccessPolicy getAccessPolicies(int index);

  /**
   *
   *
   * <pre>
   * List of the AccessPolicy instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
   * </code>
   */
  int getAccessPoliciesCount();

  /**
   *
   *
   * <pre>
   * List of the AccessPolicy instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
   * </code>
   */
  java.util.List<? extends com.google.identity.accesscontextmanager.v1.AccessPolicyOrBuilder>
      getAccessPoliciesOrBuilderList();

  /**
   *
   *
   * <pre>
   * List of the AccessPolicy instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
   * </code>
   */
  com.google.identity.accesscontextmanager.v1.AccessPolicyOrBuilder getAccessPoliciesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The pagination token to retrieve the next page of results. If the value is
   * empty, no further results remain.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();

  /**
   *
   *
   * <pre>
   * The pagination token to retrieve the next page of results. If the value is
   * empty, no further results remain.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
