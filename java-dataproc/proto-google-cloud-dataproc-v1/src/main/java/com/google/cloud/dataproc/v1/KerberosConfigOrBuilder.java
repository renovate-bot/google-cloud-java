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
// source: google/cloud/dataproc/v1/clusters.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataproc.v1;

public interface KerberosConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.KerberosConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Flag to indicate whether to Kerberize the cluster (default:
   * false). Set this field to true to enable Kerberos on a cluster.
   * </pre>
   *
   * <code>bool enable_kerberos = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enableKerberos.
   */
  boolean getEnableKerberos();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the root
   * principal password.
   * </pre>
   *
   * <code>string root_principal_password_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The rootPrincipalPasswordUri.
   */
  java.lang.String getRootPrincipalPasswordUri();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the root
   * principal password.
   * </pre>
   *
   * <code>string root_principal_password_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for rootPrincipalPasswordUri.
   */
  com.google.protobuf.ByteString getRootPrincipalPasswordUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The URI of the KMS key used to encrypt sensitive
   * files.
   * </pre>
   *
   * <code>string kms_key_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The kmsKeyUri.
   */
  java.lang.String getKmsKeyUri();

  /**
   *
   *
   * <pre>
   * Optional. The URI of the KMS key used to encrypt sensitive
   * files.
   * </pre>
   *
   * <code>string kms_key_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for kmsKeyUri.
   */
  com.google.protobuf.ByteString getKmsKeyUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of the keystore file used for SSL
   * encryption. If not provided, Dataproc will provide a self-signed
   * certificate.
   * </pre>
   *
   * <code>string keystore_uri = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The keystoreUri.
   */
  java.lang.String getKeystoreUri();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of the keystore file used for SSL
   * encryption. If not provided, Dataproc will provide a self-signed
   * certificate.
   * </pre>
   *
   * <code>string keystore_uri = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for keystoreUri.
   */
  com.google.protobuf.ByteString getKeystoreUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of the truststore file used for SSL
   * encryption. If not provided, Dataproc will provide a self-signed
   * certificate.
   * </pre>
   *
   * <code>string truststore_uri = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The truststoreUri.
   */
  java.lang.String getTruststoreUri();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of the truststore file used for SSL
   * encryption. If not provided, Dataproc will provide a self-signed
   * certificate.
   * </pre>
   *
   * <code>string truststore_uri = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for truststoreUri.
   */
  com.google.protobuf.ByteString getTruststoreUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * password to the user provided keystore. For the self-signed certificate,
   * this password is generated by Dataproc.
   * </pre>
   *
   * <code>string keystore_password_uri = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The keystorePasswordUri.
   */
  java.lang.String getKeystorePasswordUri();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * password to the user provided keystore. For the self-signed certificate,
   * this password is generated by Dataproc.
   * </pre>
   *
   * <code>string keystore_password_uri = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for keystorePasswordUri.
   */
  com.google.protobuf.ByteString getKeystorePasswordUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * password to the user provided key. For the self-signed certificate, this
   * password is generated by Dataproc.
   * </pre>
   *
   * <code>string key_password_uri = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The keyPasswordUri.
   */
  java.lang.String getKeyPasswordUri();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * password to the user provided key. For the self-signed certificate, this
   * password is generated by Dataproc.
   * </pre>
   *
   * <code>string key_password_uri = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for keyPasswordUri.
   */
  com.google.protobuf.ByteString getKeyPasswordUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * password to the user provided truststore. For the self-signed certificate,
   * this password is generated by Dataproc.
   * </pre>
   *
   * <code>string truststore_password_uri = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The truststorePasswordUri.
   */
  java.lang.String getTruststorePasswordUri();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * password to the user provided truststore. For the self-signed certificate,
   * this password is generated by Dataproc.
   * </pre>
   *
   * <code>string truststore_password_uri = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for truststorePasswordUri.
   */
  com.google.protobuf.ByteString getTruststorePasswordUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The remote realm the Dataproc on-cluster KDC will trust, should
   * the user enable cross realm trust.
   * </pre>
   *
   * <code>string cross_realm_trust_realm = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The crossRealmTrustRealm.
   */
  java.lang.String getCrossRealmTrustRealm();

  /**
   *
   *
   * <pre>
   * Optional. The remote realm the Dataproc on-cluster KDC will trust, should
   * the user enable cross realm trust.
   * </pre>
   *
   * <code>string cross_realm_trust_realm = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for crossRealmTrustRealm.
   */
  com.google.protobuf.ByteString getCrossRealmTrustRealmBytes();

  /**
   *
   *
   * <pre>
   * Optional. The KDC (IP or hostname) for the remote trusted realm in a cross
   * realm trust relationship.
   * </pre>
   *
   * <code>string cross_realm_trust_kdc = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The crossRealmTrustKdc.
   */
  java.lang.String getCrossRealmTrustKdc();

  /**
   *
   *
   * <pre>
   * Optional. The KDC (IP or hostname) for the remote trusted realm in a cross
   * realm trust relationship.
   * </pre>
   *
   * <code>string cross_realm_trust_kdc = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for crossRealmTrustKdc.
   */
  com.google.protobuf.ByteString getCrossRealmTrustKdcBytes();

  /**
   *
   *
   * <pre>
   * Optional. The admin server (IP or hostname) for the remote trusted realm in
   * a cross realm trust relationship.
   * </pre>
   *
   * <code>string cross_realm_trust_admin_server = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The crossRealmTrustAdminServer.
   */
  java.lang.String getCrossRealmTrustAdminServer();

  /**
   *
   *
   * <pre>
   * Optional. The admin server (IP or hostname) for the remote trusted realm in
   * a cross realm trust relationship.
   * </pre>
   *
   * <code>string cross_realm_trust_admin_server = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The bytes for crossRealmTrustAdminServer.
   */
  com.google.protobuf.ByteString getCrossRealmTrustAdminServerBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * shared password between the on-cluster Kerberos realm and the remote
   * trusted realm, in a cross realm trust relationship.
   * </pre>
   *
   * <code>
   * string cross_realm_trust_shared_password_uri = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The crossRealmTrustSharedPasswordUri.
   */
  java.lang.String getCrossRealmTrustSharedPasswordUri();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * shared password between the on-cluster Kerberos realm and the remote
   * trusted realm, in a cross realm trust relationship.
   * </pre>
   *
   * <code>
   * string cross_realm_trust_shared_password_uri = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The bytes for crossRealmTrustSharedPasswordUri.
   */
  com.google.protobuf.ByteString getCrossRealmTrustSharedPasswordUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * master key of the KDC database.
   * </pre>
   *
   * <code>string kdc_db_key_uri = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The kdcDbKeyUri.
   */
  java.lang.String getKdcDbKeyUri();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage URI of a KMS encrypted file containing the
   * master key of the KDC database.
   * </pre>
   *
   * <code>string kdc_db_key_uri = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for kdcDbKeyUri.
   */
  com.google.protobuf.ByteString getKdcDbKeyUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The lifetime of the ticket granting ticket, in hours.
   * If not specified, or user specifies 0, then default value 10
   * will be used.
   * </pre>
   *
   * <code>int32 tgt_lifetime_hours = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The tgtLifetimeHours.
   */
  int getTgtLifetimeHours();

  /**
   *
   *
   * <pre>
   * Optional. The name of the on-cluster Kerberos realm.
   * If not specified, the uppercased domain of hostnames will be the realm.
   * </pre>
   *
   * <code>string realm = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The realm.
   */
  java.lang.String getRealm();

  /**
   *
   *
   * <pre>
   * Optional. The name of the on-cluster Kerberos realm.
   * If not specified, the uppercased domain of hostnames will be the realm.
   * </pre>
   *
   * <code>string realm = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for realm.
   */
  com.google.protobuf.ByteString getRealmBytes();
}
