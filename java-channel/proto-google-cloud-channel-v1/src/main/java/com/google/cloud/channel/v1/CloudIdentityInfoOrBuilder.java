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
// source: google/cloud/channel/v1/common.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.channel.v1;

public interface CloudIdentityInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.CloudIdentityInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * CustomerType indicates verification type needed for using services.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CloudIdentityInfo.CustomerType customer_type = 1;</code>
   *
   * @return The enum numeric value on the wire for customerType.
   */
  int getCustomerTypeValue();

  /**
   *
   *
   * <pre>
   * CustomerType indicates verification type needed for using services.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CloudIdentityInfo.CustomerType customer_type = 1;</code>
   *
   * @return The customerType.
   */
  com.google.cloud.channel.v1.CloudIdentityInfo.CustomerType getCustomerType();

  /**
   *
   *
   * <pre>
   * Output only. The primary domain name.
   * </pre>
   *
   * <code>string primary_domain = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The primaryDomain.
   */
  java.lang.String getPrimaryDomain();

  /**
   *
   *
   * <pre>
   * Output only. The primary domain name.
   * </pre>
   *
   * <code>string primary_domain = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for primaryDomain.
   */
  com.google.protobuf.ByteString getPrimaryDomainBytes();

  /**
   *
   *
   * <pre>
   * Output only. Whether the domain is verified.
   * This field is not returned for a Customer's cloud_identity_info resource.
   * Partners can use the domains.get() method of the Workspace SDK's
   * Directory API, or listen to the PRIMARY_DOMAIN_VERIFIED Pub/Sub event in
   * to track domain verification of their resolve Workspace customers.
   * </pre>
   *
   * <code>bool is_domain_verified = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The isDomainVerified.
   */
  boolean getIsDomainVerified();

  /**
   *
   *
   * <pre>
   * The alternate email.
   * </pre>
   *
   * <code>string alternate_email = 6;</code>
   *
   * @return The alternateEmail.
   */
  java.lang.String getAlternateEmail();

  /**
   *
   *
   * <pre>
   * The alternate email.
   * </pre>
   *
   * <code>string alternate_email = 6;</code>
   *
   * @return The bytes for alternateEmail.
   */
  com.google.protobuf.ByteString getAlternateEmailBytes();

  /**
   *
   *
   * <pre>
   * Phone number associated with the Cloud Identity.
   * </pre>
   *
   * <code>string phone_number = 7;</code>
   *
   * @return The phoneNumber.
   */
  java.lang.String getPhoneNumber();

  /**
   *
   *
   * <pre>
   * Phone number associated with the Cloud Identity.
   * </pre>
   *
   * <code>string phone_number = 7;</code>
   *
   * @return The bytes for phoneNumber.
   */
  com.google.protobuf.ByteString getPhoneNumberBytes();

  /**
   *
   *
   * <pre>
   * Language code.
   * </pre>
   *
   * <code>string language_code = 8;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();

  /**
   *
   *
   * <pre>
   * Language code.
   * </pre>
   *
   * <code>string language_code = 8;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Output only. URI of Customer's Admin console dashboard.
   * </pre>
   *
   * <code>string admin_console_uri = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The adminConsoleUri.
   */
  java.lang.String getAdminConsoleUri();

  /**
   *
   *
   * <pre>
   * Output only. URI of Customer's Admin console dashboard.
   * </pre>
   *
   * <code>string admin_console_uri = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for adminConsoleUri.
   */
  com.google.protobuf.ByteString getAdminConsoleUriBytes();

  /**
   *
   *
   * <pre>
   * Edu information about the customer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.EduData edu_data = 22;</code>
   *
   * @return Whether the eduData field is set.
   */
  boolean hasEduData();

  /**
   *
   *
   * <pre>
   * Edu information about the customer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.EduData edu_data = 22;</code>
   *
   * @return The eduData.
   */
  com.google.cloud.channel.v1.EduData getEduData();

  /**
   *
   *
   * <pre>
   * Edu information about the customer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.EduData edu_data = 22;</code>
   */
  com.google.cloud.channel.v1.EduDataOrBuilder getEduDataOrBuilder();
}
