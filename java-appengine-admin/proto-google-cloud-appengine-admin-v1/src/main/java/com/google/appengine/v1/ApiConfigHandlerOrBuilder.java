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
// source: google/appengine/v1/app_yaml.proto

// Protobuf Java Version: 3.25.8
package com.google.appengine.v1;

public interface ApiConfigHandlerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.ApiConfigHandler)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Action to take when users access resources that require
   * authentication. Defaults to `redirect`.
   * </pre>
   *
   * <code>.google.appengine.v1.AuthFailAction auth_fail_action = 1;</code>
   *
   * @return The enum numeric value on the wire for authFailAction.
   */
  int getAuthFailActionValue();

  /**
   *
   *
   * <pre>
   * Action to take when users access resources that require
   * authentication. Defaults to `redirect`.
   * </pre>
   *
   * <code>.google.appengine.v1.AuthFailAction auth_fail_action = 1;</code>
   *
   * @return The authFailAction.
   */
  com.google.appengine.v1.AuthFailAction getAuthFailAction();

  /**
   *
   *
   * <pre>
   * Level of login required to access this resource. Defaults to
   * `optional`.
   * </pre>
   *
   * <code>.google.appengine.v1.LoginRequirement login = 2;</code>
   *
   * @return The enum numeric value on the wire for login.
   */
  int getLoginValue();

  /**
   *
   *
   * <pre>
   * Level of login required to access this resource. Defaults to
   * `optional`.
   * </pre>
   *
   * <code>.google.appengine.v1.LoginRequirement login = 2;</code>
   *
   * @return The login.
   */
  com.google.appengine.v1.LoginRequirement getLogin();

  /**
   *
   *
   * <pre>
   * Path to the script from the application root directory.
   * </pre>
   *
   * <code>string script = 3;</code>
   *
   * @return The script.
   */
  java.lang.String getScript();

  /**
   *
   *
   * <pre>
   * Path to the script from the application root directory.
   * </pre>
   *
   * <code>string script = 3;</code>
   *
   * @return The bytes for script.
   */
  com.google.protobuf.ByteString getScriptBytes();

  /**
   *
   *
   * <pre>
   * Security (HTTPS) enforcement for this URL.
   * </pre>
   *
   * <code>.google.appengine.v1.SecurityLevel security_level = 4;</code>
   *
   * @return The enum numeric value on the wire for securityLevel.
   */
  int getSecurityLevelValue();

  /**
   *
   *
   * <pre>
   * Security (HTTPS) enforcement for this URL.
   * </pre>
   *
   * <code>.google.appengine.v1.SecurityLevel security_level = 4;</code>
   *
   * @return The securityLevel.
   */
  com.google.appengine.v1.SecurityLevel getSecurityLevel();

  /**
   *
   *
   * <pre>
   * URL to serve the endpoint at.
   * </pre>
   *
   * <code>string url = 5;</code>
   *
   * @return The url.
   */
  java.lang.String getUrl();

  /**
   *
   *
   * <pre>
   * URL to serve the endpoint at.
   * </pre>
   *
   * <code>string url = 5;</code>
   *
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString getUrlBytes();
}
