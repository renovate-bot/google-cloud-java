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
// source: google/cloud/gsuiteaddons/v1/gsuiteaddons.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gsuiteaddons.v1;

public interface DeploymentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gsuiteaddons.v1.Deployment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The deployment resource name.
   * Example:  projects/123/deployments/my_deployment.
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
   * The deployment resource name.
   * Example:  projects/123/deployments/my_deployment.
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
   * The list of Google OAuth scopes for which to request consent from the end
   * user before executing an add-on endpoint.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 2;</code>
   *
   * @return A list containing the oauthScopes.
   */
  java.util.List<java.lang.String> getOauthScopesList();

  /**
   *
   *
   * <pre>
   * The list of Google OAuth scopes for which to request consent from the end
   * user before executing an add-on endpoint.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 2;</code>
   *
   * @return The count of oauthScopes.
   */
  int getOauthScopesCount();

  /**
   *
   *
   * <pre>
   * The list of Google OAuth scopes for which to request consent from the end
   * user before executing an add-on endpoint.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The oauthScopes at the given index.
   */
  java.lang.String getOauthScopes(int index);

  /**
   *
   *
   * <pre>
   * The list of Google OAuth scopes for which to request consent from the end
   * user before executing an add-on endpoint.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the oauthScopes at the given index.
   */
  com.google.protobuf.ByteString getOauthScopesBytes(int index);

  /**
   *
   *
   * <pre>
   * The Google Workspace add-on configuration.
   * </pre>
   *
   * <code>.google.cloud.gsuiteaddons.v1.AddOns add_ons = 3;</code>
   *
   * @return Whether the addOns field is set.
   */
  boolean hasAddOns();

  /**
   *
   *
   * <pre>
   * The Google Workspace add-on configuration.
   * </pre>
   *
   * <code>.google.cloud.gsuiteaddons.v1.AddOns add_ons = 3;</code>
   *
   * @return The addOns.
   */
  com.google.cloud.gsuiteaddons.v1.AddOns getAddOns();

  /**
   *
   *
   * <pre>
   * The Google Workspace add-on configuration.
   * </pre>
   *
   * <code>.google.cloud.gsuiteaddons.v1.AddOns add_ons = 3;</code>
   */
  com.google.cloud.gsuiteaddons.v1.AddOnsOrBuilder getAddOnsOrBuilder();

  /**
   *
   *
   * <pre>
   * This value is computed by the server based on the version of the
   * deployment in storage, and may be sent on update and delete requests to
   * ensure the client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 5;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * This value is computed by the server based on the version of the
   * deployment in storage, and may be sent on update and delete requests to
   * ensure the client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 5;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
