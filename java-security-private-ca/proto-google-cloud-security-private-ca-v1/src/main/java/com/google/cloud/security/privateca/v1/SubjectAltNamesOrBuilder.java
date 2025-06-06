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
// source: google/cloud/security/privateca/v1/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.security.privateca.v1;

public interface SubjectAltNamesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1.SubjectAltNames)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Contains only valid, fully-qualified host names.
   * </pre>
   *
   * <code>repeated string dns_names = 1;</code>
   *
   * @return A list containing the dnsNames.
   */
  java.util.List<java.lang.String> getDnsNamesList();

  /**
   *
   *
   * <pre>
   * Contains only valid, fully-qualified host names.
   * </pre>
   *
   * <code>repeated string dns_names = 1;</code>
   *
   * @return The count of dnsNames.
   */
  int getDnsNamesCount();

  /**
   *
   *
   * <pre>
   * Contains only valid, fully-qualified host names.
   * </pre>
   *
   * <code>repeated string dns_names = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The dnsNames at the given index.
   */
  java.lang.String getDnsNames(int index);

  /**
   *
   *
   * <pre>
   * Contains only valid, fully-qualified host names.
   * </pre>
   *
   * <code>repeated string dns_names = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the dnsNames at the given index.
   */
  com.google.protobuf.ByteString getDnsNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Contains only valid RFC 3986 URIs.
   * </pre>
   *
   * <code>repeated string uris = 2;</code>
   *
   * @return A list containing the uris.
   */
  java.util.List<java.lang.String> getUrisList();

  /**
   *
   *
   * <pre>
   * Contains only valid RFC 3986 URIs.
   * </pre>
   *
   * <code>repeated string uris = 2;</code>
   *
   * @return The count of uris.
   */
  int getUrisCount();

  /**
   *
   *
   * <pre>
   * Contains only valid RFC 3986 URIs.
   * </pre>
   *
   * <code>repeated string uris = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The uris at the given index.
   */
  java.lang.String getUris(int index);

  /**
   *
   *
   * <pre>
   * Contains only valid RFC 3986 URIs.
   * </pre>
   *
   * <code>repeated string uris = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the uris at the given index.
   */
  com.google.protobuf.ByteString getUrisBytes(int index);

  /**
   *
   *
   * <pre>
   * Contains only valid RFC 2822 E-mail addresses.
   * </pre>
   *
   * <code>repeated string email_addresses = 3;</code>
   *
   * @return A list containing the emailAddresses.
   */
  java.util.List<java.lang.String> getEmailAddressesList();

  /**
   *
   *
   * <pre>
   * Contains only valid RFC 2822 E-mail addresses.
   * </pre>
   *
   * <code>repeated string email_addresses = 3;</code>
   *
   * @return The count of emailAddresses.
   */
  int getEmailAddressesCount();

  /**
   *
   *
   * <pre>
   * Contains only valid RFC 2822 E-mail addresses.
   * </pre>
   *
   * <code>repeated string email_addresses = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The emailAddresses at the given index.
   */
  java.lang.String getEmailAddresses(int index);

  /**
   *
   *
   * <pre>
   * Contains only valid RFC 2822 E-mail addresses.
   * </pre>
   *
   * <code>repeated string email_addresses = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the emailAddresses at the given index.
   */
  com.google.protobuf.ByteString getEmailAddressesBytes(int index);

  /**
   *
   *
   * <pre>
   * Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
   * </pre>
   *
   * <code>repeated string ip_addresses = 4;</code>
   *
   * @return A list containing the ipAddresses.
   */
  java.util.List<java.lang.String> getIpAddressesList();

  /**
   *
   *
   * <pre>
   * Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
   * </pre>
   *
   * <code>repeated string ip_addresses = 4;</code>
   *
   * @return The count of ipAddresses.
   */
  int getIpAddressesCount();

  /**
   *
   *
   * <pre>
   * Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
   * </pre>
   *
   * <code>repeated string ip_addresses = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The ipAddresses at the given index.
   */
  java.lang.String getIpAddresses(int index);

  /**
   *
   *
   * <pre>
   * Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
   * </pre>
   *
   * <code>repeated string ip_addresses = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the ipAddresses at the given index.
   */
  com.google.protobuf.ByteString getIpAddressesBytes(int index);

  /**
   *
   *
   * <pre>
   * Contains additional subject alternative name values.
   * For each custom_san, the `value` field must contain an ASN.1 encoded
   * UTF8String.
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1.X509Extension custom_sans = 5;</code>
   */
  java.util.List<com.google.cloud.security.privateca.v1.X509Extension> getCustomSansList();

  /**
   *
   *
   * <pre>
   * Contains additional subject alternative name values.
   * For each custom_san, the `value` field must contain an ASN.1 encoded
   * UTF8String.
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1.X509Extension custom_sans = 5;</code>
   */
  com.google.cloud.security.privateca.v1.X509Extension getCustomSans(int index);

  /**
   *
   *
   * <pre>
   * Contains additional subject alternative name values.
   * For each custom_san, the `value` field must contain an ASN.1 encoded
   * UTF8String.
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1.X509Extension custom_sans = 5;</code>
   */
  int getCustomSansCount();

  /**
   *
   *
   * <pre>
   * Contains additional subject alternative name values.
   * For each custom_san, the `value` field must contain an ASN.1 encoded
   * UTF8String.
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1.X509Extension custom_sans = 5;</code>
   */
  java.util.List<? extends com.google.cloud.security.privateca.v1.X509ExtensionOrBuilder>
      getCustomSansOrBuilderList();

  /**
   *
   *
   * <pre>
   * Contains additional subject alternative name values.
   * For each custom_san, the `value` field must contain an ASN.1 encoded
   * UTF8String.
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1.X509Extension custom_sans = 5;</code>
   */
  com.google.cloud.security.privateca.v1.X509ExtensionOrBuilder getCustomSansOrBuilder(int index);
}
