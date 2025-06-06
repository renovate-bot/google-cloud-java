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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.8
package com.google.recaptchaenterprise.v1;

public interface ListFirewallPoliciesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.ListFirewallPoliciesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Policy details.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policies = 1;
   * </code>
   */
  java.util.List<com.google.recaptchaenterprise.v1.FirewallPolicy> getFirewallPoliciesList();

  /**
   *
   *
   * <pre>
   * Policy details.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policies = 1;
   * </code>
   */
  com.google.recaptchaenterprise.v1.FirewallPolicy getFirewallPolicies(int index);

  /**
   *
   *
   * <pre>
   * Policy details.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policies = 1;
   * </code>
   */
  int getFirewallPoliciesCount();

  /**
   *
   *
   * <pre>
   * Policy details.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policies = 1;
   * </code>
   */
  java.util.List<? extends com.google.recaptchaenterprise.v1.FirewallPolicyOrBuilder>
      getFirewallPoliciesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Policy details.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policies = 1;
   * </code>
   */
  com.google.recaptchaenterprise.v1.FirewallPolicyOrBuilder getFirewallPoliciesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results. It is set to empty if no
   * policies remain in results.
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
   * Token to retrieve the next page of results. It is set to empty if no
   * policies remain in results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
