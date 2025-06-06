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

public interface SslCertificateManagedSslCertificateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SslCertificateManagedSslCertificate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output only] Detailed statuses of the domains specified for managed certificate resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; domain_status = 360305613;</code>
   */
  int getDomainStatusCount();

  /**
   *
   *
   * <pre>
   * [Output only] Detailed statuses of the domains specified for managed certificate resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; domain_status = 360305613;</code>
   */
  boolean containsDomainStatus(java.lang.String key);

  /** Use {@link #getDomainStatusMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getDomainStatus();

  /**
   *
   *
   * <pre>
   * [Output only] Detailed statuses of the domains specified for managed certificate resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; domain_status = 360305613;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getDomainStatusMap();

  /**
   *
   *
   * <pre>
   * [Output only] Detailed statuses of the domains specified for managed certificate resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; domain_status = 360305613;</code>
   */
  /* nullable */
  java.lang.String getDomainStatusOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * [Output only] Detailed statuses of the domains specified for managed certificate resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; domain_status = 360305613;</code>
   */
  java.lang.String getDomainStatusOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The domains for which a managed SSL certificate will be generated. Each Google-managed SSL certificate supports up to the [maximum number of domains per Google-managed SSL certificate](/load-balancing/docs/quotas#ssl_certificates).
   * </pre>
   *
   * <code>repeated string domains = 226935855;</code>
   *
   * @return A list containing the domains.
   */
  java.util.List<java.lang.String> getDomainsList();

  /**
   *
   *
   * <pre>
   * The domains for which a managed SSL certificate will be generated. Each Google-managed SSL certificate supports up to the [maximum number of domains per Google-managed SSL certificate](/load-balancing/docs/quotas#ssl_certificates).
   * </pre>
   *
   * <code>repeated string domains = 226935855;</code>
   *
   * @return The count of domains.
   */
  int getDomainsCount();

  /**
   *
   *
   * <pre>
   * The domains for which a managed SSL certificate will be generated. Each Google-managed SSL certificate supports up to the [maximum number of domains per Google-managed SSL certificate](/load-balancing/docs/quotas#ssl_certificates).
   * </pre>
   *
   * <code>repeated string domains = 226935855;</code>
   *
   * @param index The index of the element to return.
   * @return The domains at the given index.
   */
  java.lang.String getDomains(int index);

  /**
   *
   *
   * <pre>
   * The domains for which a managed SSL certificate will be generated. Each Google-managed SSL certificate supports up to the [maximum number of domains per Google-managed SSL certificate](/load-balancing/docs/quotas#ssl_certificates).
   * </pre>
   *
   * <code>repeated string domains = 226935855;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the domains at the given index.
   */
  com.google.protobuf.ByteString getDomainsBytes(int index);

  /**
   *
   *
   * <pre>
   * [Output only] Status of the managed certificate resource.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();

  /**
   *
   *
   * <pre>
   * [Output only] Status of the managed certificate resource.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The status.
   */
  java.lang.String getStatus();

  /**
   *
   *
   * <pre>
   * [Output only] Status of the managed certificate resource.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString getStatusBytes();
}
