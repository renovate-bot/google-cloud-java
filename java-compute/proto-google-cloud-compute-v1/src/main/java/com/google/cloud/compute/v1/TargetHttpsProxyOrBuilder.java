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

public interface TargetHttpsProxyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.TargetHttpsProxy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. A URL referring to a networksecurity.AuthorizationPolicy resource that describes how the proxy should authorize inbound traffic. If left blank, access will not be restricted by an authorization policy. Refer to the AuthorizationPolicy resource for additional details. authorizationPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. Note: This field currently has no impact.
   * </pre>
   *
   * <code>optional string authorization_policy = 33945528;</code>
   *
   * @return Whether the authorizationPolicy field is set.
   */
  boolean hasAuthorizationPolicy();

  /**
   *
   *
   * <pre>
   * Optional. A URL referring to a networksecurity.AuthorizationPolicy resource that describes how the proxy should authorize inbound traffic. If left blank, access will not be restricted by an authorization policy. Refer to the AuthorizationPolicy resource for additional details. authorizationPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. Note: This field currently has no impact.
   * </pre>
   *
   * <code>optional string authorization_policy = 33945528;</code>
   *
   * @return The authorizationPolicy.
   */
  java.lang.String getAuthorizationPolicy();

  /**
   *
   *
   * <pre>
   * Optional. A URL referring to a networksecurity.AuthorizationPolicy resource that describes how the proxy should authorize inbound traffic. If left blank, access will not be restricted by an authorization policy. Refer to the AuthorizationPolicy resource for additional details. authorizationPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. Note: This field currently has no impact.
   * </pre>
   *
   * <code>optional string authorization_policy = 33945528;</code>
   *
   * @return The bytes for authorizationPolicy.
   */
  com.google.protobuf.ByteString getAuthorizationPolicyBytes();

  /**
   *
   *
   * <pre>
   * URL of a certificate map that identifies a certificate map associated with the given target proxy. This field can only be set for Global external Application Load Balancer or Classic Application Load Balancer. For other products use Certificate Manager Certificates instead. If set, sslCertificates will be ignored. Accepted format is //certificatemanager.googleapis.com/projects/{project }/locations/{location}/certificateMaps/{resourceName}.
   * </pre>
   *
   * <code>optional string certificate_map = 156463796;</code>
   *
   * @return Whether the certificateMap field is set.
   */
  boolean hasCertificateMap();

  /**
   *
   *
   * <pre>
   * URL of a certificate map that identifies a certificate map associated with the given target proxy. This field can only be set for Global external Application Load Balancer or Classic Application Load Balancer. For other products use Certificate Manager Certificates instead. If set, sslCertificates will be ignored. Accepted format is //certificatemanager.googleapis.com/projects/{project }/locations/{location}/certificateMaps/{resourceName}.
   * </pre>
   *
   * <code>optional string certificate_map = 156463796;</code>
   *
   * @return The certificateMap.
   */
  java.lang.String getCertificateMap();

  /**
   *
   *
   * <pre>
   * URL of a certificate map that identifies a certificate map associated with the given target proxy. This field can only be set for Global external Application Load Balancer or Classic Application Load Balancer. For other products use Certificate Manager Certificates instead. If set, sslCertificates will be ignored. Accepted format is //certificatemanager.googleapis.com/projects/{project }/locations/{location}/certificateMaps/{resourceName}.
   * </pre>
   *
   * <code>optional string certificate_map = 156463796;</code>
   *
   * @return The bytes for certificateMap.
   */
  com.google.protobuf.ByteString getCertificateMapBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a TargetHttpsProxy. An up-to-date fingerprint must be provided in order to patch the TargetHttpsProxy; otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the TargetHttpsProxy.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return Whether the fingerprint field is set.
   */
  boolean hasFingerprint();

  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a TargetHttpsProxy. An up-to-date fingerprint must be provided in order to patch the TargetHttpsProxy; otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the TargetHttpsProxy.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The fingerprint.
   */
  java.lang.String getFingerprint();

  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a TargetHttpsProxy. An up-to-date fingerprint must be provided in order to patch the TargetHttpsProxy; otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the TargetHttpsProxy.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The bytes for fingerprint.
   */
  com.google.protobuf.ByteString getFingerprintBytes();

  /**
   *
   *
   * <pre>
   * Specifies how long to keep a connection open, after completing a response, while there is no matching traffic (in seconds). If an HTTP keep-alive is not specified, a default value (610 seconds) will be used. For global external Application Load Balancers, the minimum allowed value is 5 seconds and the maximum allowed value is 1200 seconds. For classic Application Load Balancers, this option is not supported.
   * </pre>
   *
   * <code>optional int32 http_keep_alive_timeout_sec = 447326046;</code>
   *
   * @return Whether the httpKeepAliveTimeoutSec field is set.
   */
  boolean hasHttpKeepAliveTimeoutSec();

  /**
   *
   *
   * <pre>
   * Specifies how long to keep a connection open, after completing a response, while there is no matching traffic (in seconds). If an HTTP keep-alive is not specified, a default value (610 seconds) will be used. For global external Application Load Balancers, the minimum allowed value is 5 seconds and the maximum allowed value is 1200 seconds. For classic Application Load Balancers, this option is not supported.
   * </pre>
   *
   * <code>optional int32 http_keep_alive_timeout_sec = 447326046;</code>
   *
   * @return The httpKeepAliveTimeoutSec.
   */
  int getHttpKeepAliveTimeoutSec();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return The id.
   */
  long getId();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#targetHttpsProxy for target HTTPS proxies.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#targetHttpsProxy for target HTTPS proxies.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#targetHttpsProxy for target HTTPS proxies.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();

  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * This field only applies when the forwarding rule that references this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED. When this field is set to true, Envoy proxies set up inbound traffic interception and bind to the IP address and port specified in the forwarding rule. This is generally useful when using Traffic Director to configure Envoy as a gateway or middle proxy (in other words, not a sidecar proxy). The Envoy proxy listens for inbound requests and handles requests when it receives them. The default is false.
   * </pre>
   *
   * <code>optional bool proxy_bind = 286025582;</code>
   *
   * @return Whether the proxyBind field is set.
   */
  boolean hasProxyBind();

  /**
   *
   *
   * <pre>
   * This field only applies when the forwarding rule that references this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED. When this field is set to true, Envoy proxies set up inbound traffic interception and bind to the IP address and port specified in the forwarding rule. This is generally useful when using Traffic Director to configure Envoy as a gateway or middle proxy (in other words, not a sidecar proxy). The Envoy proxy listens for inbound requests and handles requests when it receives them. The default is false.
   * </pre>
   *
   * <code>optional bool proxy_bind = 286025582;</code>
   *
   * @return The proxyBind.
   */
  boolean getProxyBind();

  /**
   *
   *
   * <pre>
   * Specifies the QUIC override policy for this TargetHttpsProxy resource. This setting determines whether the load balancer attempts to negotiate QUIC with clients. You can specify NONE, ENABLE, or DISABLE. - When quic-override is set to NONE, Google manages whether QUIC is used. - When quic-override is set to ENABLE, the load balancer uses QUIC when possible. - When quic-override is set to DISABLE, the load balancer doesn't use QUIC. - If the quic-override flag is not specified, NONE is implied.
   * Check the QuicOverride enum for the list of possible values.
   * </pre>
   *
   * <code>optional string quic_override = 456577197;</code>
   *
   * @return Whether the quicOverride field is set.
   */
  boolean hasQuicOverride();

  /**
   *
   *
   * <pre>
   * Specifies the QUIC override policy for this TargetHttpsProxy resource. This setting determines whether the load balancer attempts to negotiate QUIC with clients. You can specify NONE, ENABLE, or DISABLE. - When quic-override is set to NONE, Google manages whether QUIC is used. - When quic-override is set to ENABLE, the load balancer uses QUIC when possible. - When quic-override is set to DISABLE, the load balancer doesn't use QUIC. - If the quic-override flag is not specified, NONE is implied.
   * Check the QuicOverride enum for the list of possible values.
   * </pre>
   *
   * <code>optional string quic_override = 456577197;</code>
   *
   * @return The quicOverride.
   */
  java.lang.String getQuicOverride();

  /**
   *
   *
   * <pre>
   * Specifies the QUIC override policy for this TargetHttpsProxy resource. This setting determines whether the load balancer attempts to negotiate QUIC with clients. You can specify NONE, ENABLE, or DISABLE. - When quic-override is set to NONE, Google manages whether QUIC is used. - When quic-override is set to ENABLE, the load balancer uses QUIC when possible. - When quic-override is set to DISABLE, the load balancer doesn't use QUIC. - If the quic-override flag is not specified, NONE is implied.
   * Check the QuicOverride enum for the list of possible values.
   * </pre>
   *
   * <code>optional string quic_override = 456577197;</code>
   *
   * @return The bytes for quicOverride.
   */
  com.google.protobuf.ByteString getQuicOverrideBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the regional TargetHttpsProxy resides. This field is not applicable to global TargetHttpsProxies.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return Whether the region field is set.
   */
  boolean hasRegion();

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the regional TargetHttpsProxy resides. This field is not applicable to global TargetHttpsProxies.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the regional TargetHttpsProxy resides. This field is not applicable to global TargetHttpsProxies.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * Optional. A URL referring to a networksecurity.ServerTlsPolicy resource that describes how the proxy should authenticate inbound traffic. serverTlsPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED or EXTERNAL or EXTERNAL_MANAGED or INTERNAL_MANAGED. It also applies to a regional TargetHttpsProxy attached to regional forwardingRules with the loadBalancingScheme set to EXTERNAL_MANAGED or INTERNAL_MANAGED. For details which ServerTlsPolicy resources are accepted with INTERNAL_SELF_MANAGED and which with EXTERNAL, INTERNAL_MANAGED, EXTERNAL_MANAGED loadBalancingScheme consult ServerTlsPolicy documentation. If left blank, communications are not encrypted.
   * </pre>
   *
   * <code>optional string server_tls_policy = 295825266;</code>
   *
   * @return Whether the serverTlsPolicy field is set.
   */
  boolean hasServerTlsPolicy();

  /**
   *
   *
   * <pre>
   * Optional. A URL referring to a networksecurity.ServerTlsPolicy resource that describes how the proxy should authenticate inbound traffic. serverTlsPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED or EXTERNAL or EXTERNAL_MANAGED or INTERNAL_MANAGED. It also applies to a regional TargetHttpsProxy attached to regional forwardingRules with the loadBalancingScheme set to EXTERNAL_MANAGED or INTERNAL_MANAGED. For details which ServerTlsPolicy resources are accepted with INTERNAL_SELF_MANAGED and which with EXTERNAL, INTERNAL_MANAGED, EXTERNAL_MANAGED loadBalancingScheme consult ServerTlsPolicy documentation. If left blank, communications are not encrypted.
   * </pre>
   *
   * <code>optional string server_tls_policy = 295825266;</code>
   *
   * @return The serverTlsPolicy.
   */
  java.lang.String getServerTlsPolicy();

  /**
   *
   *
   * <pre>
   * Optional. A URL referring to a networksecurity.ServerTlsPolicy resource that describes how the proxy should authenticate inbound traffic. serverTlsPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED or EXTERNAL or EXTERNAL_MANAGED or INTERNAL_MANAGED. It also applies to a regional TargetHttpsProxy attached to regional forwardingRules with the loadBalancingScheme set to EXTERNAL_MANAGED or INTERNAL_MANAGED. For details which ServerTlsPolicy resources are accepted with INTERNAL_SELF_MANAGED and which with EXTERNAL, INTERNAL_MANAGED, EXTERNAL_MANAGED loadBalancingScheme consult ServerTlsPolicy documentation. If left blank, communications are not encrypted.
   * </pre>
   *
   * <code>optional string server_tls_policy = 295825266;</code>
   *
   * @return The bytes for serverTlsPolicy.
   */
  com.google.protobuf.ByteString getServerTlsPolicyBytes();

  /**
   *
   *
   * <pre>
   * URLs to SslCertificate resources that are used to authenticate connections between users and the load balancer. At least one SSL certificate must be specified. SslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED. The URLs should refer to a SSL Certificate resource or Certificate Manager Certificate resource. Mixing Classic Certificates and Certificate Manager Certificates is not allowed. Certificate Manager Certificates must include the certificatemanager API namespace. Using Certificate Manager Certificates in this field is not supported by Global external Application Load Balancer or Classic Application Load Balancer, use certificate_map instead. Currently, you may specify up to 15 Classic SSL Certificates or up to 100 Certificate Manager Certificates. Certificate Manager Certificates accepted formats are: - //certificatemanager.googleapis.com/projects/{project}/locations/{ location}/certificates/{resourceName}. - https://certificatemanager.googleapis.com/v1alpha1/projects/{project }/locations/{location}/certificates/{resourceName}.
   * </pre>
   *
   * <code>repeated string ssl_certificates = 366006543;</code>
   *
   * @return A list containing the sslCertificates.
   */
  java.util.List<java.lang.String> getSslCertificatesList();

  /**
   *
   *
   * <pre>
   * URLs to SslCertificate resources that are used to authenticate connections between users and the load balancer. At least one SSL certificate must be specified. SslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED. The URLs should refer to a SSL Certificate resource or Certificate Manager Certificate resource. Mixing Classic Certificates and Certificate Manager Certificates is not allowed. Certificate Manager Certificates must include the certificatemanager API namespace. Using Certificate Manager Certificates in this field is not supported by Global external Application Load Balancer or Classic Application Load Balancer, use certificate_map instead. Currently, you may specify up to 15 Classic SSL Certificates or up to 100 Certificate Manager Certificates. Certificate Manager Certificates accepted formats are: - //certificatemanager.googleapis.com/projects/{project}/locations/{ location}/certificates/{resourceName}. - https://certificatemanager.googleapis.com/v1alpha1/projects/{project }/locations/{location}/certificates/{resourceName}.
   * </pre>
   *
   * <code>repeated string ssl_certificates = 366006543;</code>
   *
   * @return The count of sslCertificates.
   */
  int getSslCertificatesCount();

  /**
   *
   *
   * <pre>
   * URLs to SslCertificate resources that are used to authenticate connections between users and the load balancer. At least one SSL certificate must be specified. SslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED. The URLs should refer to a SSL Certificate resource or Certificate Manager Certificate resource. Mixing Classic Certificates and Certificate Manager Certificates is not allowed. Certificate Manager Certificates must include the certificatemanager API namespace. Using Certificate Manager Certificates in this field is not supported by Global external Application Load Balancer or Classic Application Load Balancer, use certificate_map instead. Currently, you may specify up to 15 Classic SSL Certificates or up to 100 Certificate Manager Certificates. Certificate Manager Certificates accepted formats are: - //certificatemanager.googleapis.com/projects/{project}/locations/{ location}/certificates/{resourceName}. - https://certificatemanager.googleapis.com/v1alpha1/projects/{project }/locations/{location}/certificates/{resourceName}.
   * </pre>
   *
   * <code>repeated string ssl_certificates = 366006543;</code>
   *
   * @param index The index of the element to return.
   * @return The sslCertificates at the given index.
   */
  java.lang.String getSslCertificates(int index);

  /**
   *
   *
   * <pre>
   * URLs to SslCertificate resources that are used to authenticate connections between users and the load balancer. At least one SSL certificate must be specified. SslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED. The URLs should refer to a SSL Certificate resource or Certificate Manager Certificate resource. Mixing Classic Certificates and Certificate Manager Certificates is not allowed. Certificate Manager Certificates must include the certificatemanager API namespace. Using Certificate Manager Certificates in this field is not supported by Global external Application Load Balancer or Classic Application Load Balancer, use certificate_map instead. Currently, you may specify up to 15 Classic SSL Certificates or up to 100 Certificate Manager Certificates. Certificate Manager Certificates accepted formats are: - //certificatemanager.googleapis.com/projects/{project}/locations/{ location}/certificates/{resourceName}. - https://certificatemanager.googleapis.com/v1alpha1/projects/{project }/locations/{location}/certificates/{resourceName}.
   * </pre>
   *
   * <code>repeated string ssl_certificates = 366006543;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sslCertificates at the given index.
   */
  com.google.protobuf.ByteString getSslCertificatesBytes(int index);

  /**
   *
   *
   * <pre>
   * URL of SslPolicy resource that will be associated with the TargetHttpsProxy resource. If not set, the TargetHttpsProxy resource has no SSL policy configured.
   * </pre>
   *
   * <code>optional string ssl_policy = 295190213;</code>
   *
   * @return Whether the sslPolicy field is set.
   */
  boolean hasSslPolicy();

  /**
   *
   *
   * <pre>
   * URL of SslPolicy resource that will be associated with the TargetHttpsProxy resource. If not set, the TargetHttpsProxy resource has no SSL policy configured.
   * </pre>
   *
   * <code>optional string ssl_policy = 295190213;</code>
   *
   * @return The sslPolicy.
   */
  java.lang.String getSslPolicy();

  /**
   *
   *
   * <pre>
   * URL of SslPolicy resource that will be associated with the TargetHttpsProxy resource. If not set, the TargetHttpsProxy resource has no SSL policy configured.
   * </pre>
   *
   * <code>optional string ssl_policy = 295190213;</code>
   *
   * @return The bytes for sslPolicy.
   */
  com.google.protobuf.ByteString getSslPolicyBytes();

  /**
   *
   *
   * <pre>
   *  Specifies whether TLS 1.3 0-RTT Data ("Early Data") should be accepted for this service. Early Data allows a TLS resumption handshake to include the initial application payload (a HTTP request) alongside the handshake, reducing the effective round trips to "zero". This applies to TLS 1.3 connections over TCP (HTTP/2) as well as over UDP (QUIC/h3). This can improve application performance, especially on networks where interruptions may be common, such as on mobile. Requests with Early Data will have the "Early-Data" HTTP header set on the request, with a value of "1", to allow the backend to determine whether Early Data was included. Note: TLS Early Data may allow requests to be replayed, as the data is sent to the backend before the handshake has fully completed. Applications that allow idempotent HTTP methods to make non-idempotent changes, such as a GET request updating a database, should not accept Early Data on those requests, and reject requests with the "Early-Data: 1" HTTP header by returning a HTTP 425 (Too Early) status code, in order to remain RFC compliant. The default value is DISABLED.
   * Check the TlsEarlyData enum for the list of possible values.
   * </pre>
   *
   * <code>optional string tls_early_data = 61108426;</code>
   *
   * @return Whether the tlsEarlyData field is set.
   */
  boolean hasTlsEarlyData();

  /**
   *
   *
   * <pre>
   *  Specifies whether TLS 1.3 0-RTT Data ("Early Data") should be accepted for this service. Early Data allows a TLS resumption handshake to include the initial application payload (a HTTP request) alongside the handshake, reducing the effective round trips to "zero". This applies to TLS 1.3 connections over TCP (HTTP/2) as well as over UDP (QUIC/h3). This can improve application performance, especially on networks where interruptions may be common, such as on mobile. Requests with Early Data will have the "Early-Data" HTTP header set on the request, with a value of "1", to allow the backend to determine whether Early Data was included. Note: TLS Early Data may allow requests to be replayed, as the data is sent to the backend before the handshake has fully completed. Applications that allow idempotent HTTP methods to make non-idempotent changes, such as a GET request updating a database, should not accept Early Data on those requests, and reject requests with the "Early-Data: 1" HTTP header by returning a HTTP 425 (Too Early) status code, in order to remain RFC compliant. The default value is DISABLED.
   * Check the TlsEarlyData enum for the list of possible values.
   * </pre>
   *
   * <code>optional string tls_early_data = 61108426;</code>
   *
   * @return The tlsEarlyData.
   */
  java.lang.String getTlsEarlyData();

  /**
   *
   *
   * <pre>
   *  Specifies whether TLS 1.3 0-RTT Data ("Early Data") should be accepted for this service. Early Data allows a TLS resumption handshake to include the initial application payload (a HTTP request) alongside the handshake, reducing the effective round trips to "zero". This applies to TLS 1.3 connections over TCP (HTTP/2) as well as over UDP (QUIC/h3). This can improve application performance, especially on networks where interruptions may be common, such as on mobile. Requests with Early Data will have the "Early-Data" HTTP header set on the request, with a value of "1", to allow the backend to determine whether Early Data was included. Note: TLS Early Data may allow requests to be replayed, as the data is sent to the backend before the handshake has fully completed. Applications that allow idempotent HTTP methods to make non-idempotent changes, such as a GET request updating a database, should not accept Early Data on those requests, and reject requests with the "Early-Data: 1" HTTP header by returning a HTTP 425 (Too Early) status code, in order to remain RFC compliant. The default value is DISABLED.
   * Check the TlsEarlyData enum for the list of possible values.
   * </pre>
   *
   * <code>optional string tls_early_data = 61108426;</code>
   *
   * @return The bytes for tlsEarlyData.
   */
  com.google.protobuf.ByteString getTlsEarlyDataBytes();

  /**
   *
   *
   * <pre>
   * A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from URL to the BackendService. For example, the following are all valid URLs for specifying a URL map: - https://www.googleapis.compute/v1/projects/project/global/urlMaps/ url-map - projects/project/global/urlMaps/url-map - global/urlMaps/url-map
   * </pre>
   *
   * <code>optional string url_map = 367020684;</code>
   *
   * @return Whether the urlMap field is set.
   */
  boolean hasUrlMap();

  /**
   *
   *
   * <pre>
   * A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from URL to the BackendService. For example, the following are all valid URLs for specifying a URL map: - https://www.googleapis.compute/v1/projects/project/global/urlMaps/ url-map - projects/project/global/urlMaps/url-map - global/urlMaps/url-map
   * </pre>
   *
   * <code>optional string url_map = 367020684;</code>
   *
   * @return The urlMap.
   */
  java.lang.String getUrlMap();

  /**
   *
   *
   * <pre>
   * A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from URL to the BackendService. For example, the following are all valid URLs for specifying a URL map: - https://www.googleapis.compute/v1/projects/project/global/urlMaps/ url-map - projects/project/global/urlMaps/url-map - global/urlMaps/url-map
   * </pre>
   *
   * <code>optional string url_map = 367020684;</code>
   *
   * @return The bytes for urlMap.
   */
  com.google.protobuf.ByteString getUrlMapBytes();
}
