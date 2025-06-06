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
// source: google/shopping/merchant/accounts/v1beta/customerservice.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.accounts.v1beta;

public interface CustomerServiceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.accounts.v1beta.CustomerService)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The URI where customer service may be found.
   * </pre>
   *
   * <code>optional string uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the uri field is set.
   */
  boolean hasUri();

  /**
   *
   *
   * <pre>
   * Optional. The URI where customer service may be found.
   * </pre>
   *
   * <code>optional string uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();

  /**
   *
   *
   * <pre>
   * Optional. The URI where customer service may be found.
   * </pre>
   *
   * <code>optional string uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The email address where customer service may be reached.
   * </pre>
   *
   * <code>optional string email = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the email field is set.
   */
  boolean hasEmail();

  /**
   *
   *
   * <pre>
   * Optional. The email address where customer service may be reached.
   * </pre>
   *
   * <code>optional string email = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The email.
   */
  java.lang.String getEmail();

  /**
   *
   *
   * <pre>
   * Optional. The email address where customer service may be reached.
   * </pre>
   *
   * <code>optional string email = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString getEmailBytes();

  /**
   *
   *
   * <pre>
   * Optional. The phone number where customer service may be called.
   * </pre>
   *
   * <code>optional .google.type.PhoneNumber phone = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the phone field is set.
   */
  boolean hasPhone();

  /**
   *
   *
   * <pre>
   * Optional. The phone number where customer service may be called.
   * </pre>
   *
   * <code>optional .google.type.PhoneNumber phone = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The phone.
   */
  com.google.type.PhoneNumber getPhone();

  /**
   *
   *
   * <pre>
   * Optional. The phone number where customer service may be called.
   * </pre>
   *
   * <code>optional .google.type.PhoneNumber phone = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.type.PhoneNumberOrBuilder getPhoneOrBuilder();
}
