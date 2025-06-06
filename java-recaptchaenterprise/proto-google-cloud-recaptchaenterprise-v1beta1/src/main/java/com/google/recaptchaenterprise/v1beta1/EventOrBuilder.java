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
// source: google/cloud/recaptchaenterprise/v1beta1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.8
package com.google.recaptchaenterprise.v1beta1;

public interface EventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1beta1.Event)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The user response token provided by the reCAPTCHA client-side
   * integration on your site.
   * </pre>
   *
   * <code>string token = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The token.
   */
  java.lang.String getToken();

  /**
   *
   *
   * <pre>
   * Optional. The user response token provided by the reCAPTCHA client-side
   * integration on your site.
   * </pre>
   *
   * <code>string token = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString getTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. The site key that was used to invoke reCAPTCHA on your site and
   * generate the token.
   * </pre>
   *
   * <code>string site_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The siteKey.
   */
  java.lang.String getSiteKey();

  /**
   *
   *
   * <pre>
   * Optional. The site key that was used to invoke reCAPTCHA on your site and
   * generate the token.
   * </pre>
   *
   * <code>string site_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for siteKey.
   */
  com.google.protobuf.ByteString getSiteKeyBytes();

  /**
   *
   *
   * <pre>
   * Optional. The user agent present in the request from the user's device
   * related to this event.
   * </pre>
   *
   * <code>string user_agent = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The userAgent.
   */
  java.lang.String getUserAgent();

  /**
   *
   *
   * <pre>
   * Optional. The user agent present in the request from the user's device
   * related to this event.
   * </pre>
   *
   * <code>string user_agent = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for userAgent.
   */
  com.google.protobuf.ByteString getUserAgentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The IP address in the request from the user's device related to
   * this event.
   * </pre>
   *
   * <code>string user_ip_address = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The userIpAddress.
   */
  java.lang.String getUserIpAddress();

  /**
   *
   *
   * <pre>
   * Optional. The IP address in the request from the user's device related to
   * this event.
   * </pre>
   *
   * <code>string user_ip_address = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for userIpAddress.
   */
  com.google.protobuf.ByteString getUserIpAddressBytes();

  /**
   *
   *
   * <pre>
   * Optional. The expected action for this type of event. This should be the
   * same action provided at token generation time on client-side platforms
   * already integrated with reCAPTCHA.
   * </pre>
   *
   * <code>string expected_action = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The expectedAction.
   */
  java.lang.String getExpectedAction();

  /**
   *
   *
   * <pre>
   * Optional. The expected action for this type of event. This should be the
   * same action provided at token generation time on client-side platforms
   * already integrated with reCAPTCHA.
   * </pre>
   *
   * <code>string expected_action = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for expectedAction.
   */
  com.google.protobuf.ByteString getExpectedActionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Unique stable hashed user identifier for the request. The
   * identifier must be hashed using hmac-sha256 with stable secret.
   * </pre>
   *
   * <code>bytes hashed_account_id = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The hashedAccountId.
   */
  com.google.protobuf.ByteString getHashedAccountId();

  /**
   *
   *
   * <pre>
   * Optional. Data describing a payment transaction to be assessed. Sending
   * this data enables reCAPTCHA Fraud Prevention and the
   * FraudPreventionAssessment component in the response.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.TransactionData transaction_data = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the transactionData field is set.
   */
  boolean hasTransactionData();

  /**
   *
   *
   * <pre>
   * Optional. Data describing a payment transaction to be assessed. Sending
   * this data enables reCAPTCHA Fraud Prevention and the
   * FraudPreventionAssessment component in the response.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.TransactionData transaction_data = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The transactionData.
   */
  com.google.recaptchaenterprise.v1beta1.TransactionData getTransactionData();

  /**
   *
   *
   * <pre>
   * Optional. Data describing a payment transaction to be assessed. Sending
   * this data enables reCAPTCHA Fraud Prevention and the
   * FraudPreventionAssessment component in the response.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.TransactionData transaction_data = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.recaptchaenterprise.v1beta1.TransactionDataOrBuilder getTransactionDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The Fraud Prevention setting for this Assessment.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.Event.FraudPrevention fraud_prevention = 17 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for fraudPrevention.
   */
  int getFraudPreventionValue();

  /**
   *
   *
   * <pre>
   * Optional. The Fraud Prevention setting for this Assessment.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.Event.FraudPrevention fraud_prevention = 17 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The fraudPrevention.
   */
  com.google.recaptchaenterprise.v1beta1.Event.FraudPrevention getFraudPrevention();
}
