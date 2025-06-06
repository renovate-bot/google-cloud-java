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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.8
package com.google.container.v1;

public interface GetOpenIDConfigResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.GetOpenIDConfigResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * OIDC Issuer.
   * </pre>
   *
   * <code>string issuer = 1;</code>
   *
   * @return The issuer.
   */
  java.lang.String getIssuer();

  /**
   *
   *
   * <pre>
   * OIDC Issuer.
   * </pre>
   *
   * <code>string issuer = 1;</code>
   *
   * @return The bytes for issuer.
   */
  com.google.protobuf.ByteString getIssuerBytes();

  /**
   *
   *
   * <pre>
   * JSON Web Key uri.
   * </pre>
   *
   * <code>string jwks_uri = 2 [json_name = "jwks_uri"];</code>
   *
   * @return The jwksUri.
   */
  java.lang.String getJwksUri();

  /**
   *
   *
   * <pre>
   * JSON Web Key uri.
   * </pre>
   *
   * <code>string jwks_uri = 2 [json_name = "jwks_uri"];</code>
   *
   * @return The bytes for jwksUri.
   */
  com.google.protobuf.ByteString getJwksUriBytes();

  /**
   *
   *
   * <pre>
   * Supported response types.
   * </pre>
   *
   * <code>repeated string response_types_supported = 3 [json_name = "response_types_supported"];
   * </code>
   *
   * @return A list containing the responseTypesSupported.
   */
  java.util.List<java.lang.String> getResponseTypesSupportedList();

  /**
   *
   *
   * <pre>
   * Supported response types.
   * </pre>
   *
   * <code>repeated string response_types_supported = 3 [json_name = "response_types_supported"];
   * </code>
   *
   * @return The count of responseTypesSupported.
   */
  int getResponseTypesSupportedCount();

  /**
   *
   *
   * <pre>
   * Supported response types.
   * </pre>
   *
   * <code>repeated string response_types_supported = 3 [json_name = "response_types_supported"];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The responseTypesSupported at the given index.
   */
  java.lang.String getResponseTypesSupported(int index);

  /**
   *
   *
   * <pre>
   * Supported response types.
   * </pre>
   *
   * <code>repeated string response_types_supported = 3 [json_name = "response_types_supported"];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the responseTypesSupported at the given index.
   */
  com.google.protobuf.ByteString getResponseTypesSupportedBytes(int index);

  /**
   *
   *
   * <pre>
   * Supported subject types.
   * </pre>
   *
   * <code>repeated string subject_types_supported = 4 [json_name = "subject_types_supported"];
   * </code>
   *
   * @return A list containing the subjectTypesSupported.
   */
  java.util.List<java.lang.String> getSubjectTypesSupportedList();

  /**
   *
   *
   * <pre>
   * Supported subject types.
   * </pre>
   *
   * <code>repeated string subject_types_supported = 4 [json_name = "subject_types_supported"];
   * </code>
   *
   * @return The count of subjectTypesSupported.
   */
  int getSubjectTypesSupportedCount();

  /**
   *
   *
   * <pre>
   * Supported subject types.
   * </pre>
   *
   * <code>repeated string subject_types_supported = 4 [json_name = "subject_types_supported"];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The subjectTypesSupported at the given index.
   */
  java.lang.String getSubjectTypesSupported(int index);

  /**
   *
   *
   * <pre>
   * Supported subject types.
   * </pre>
   *
   * <code>repeated string subject_types_supported = 4 [json_name = "subject_types_supported"];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the subjectTypesSupported at the given index.
   */
  com.google.protobuf.ByteString getSubjectTypesSupportedBytes(int index);

  /**
   *
   *
   * <pre>
   * supported ID Token signing Algorithms.
   * </pre>
   *
   * <code>
   * repeated string id_token_signing_alg_values_supported = 5 [json_name = "id_token_signing_alg_values_supported"];
   * </code>
   *
   * @return A list containing the idTokenSigningAlgValuesSupported.
   */
  java.util.List<java.lang.String> getIdTokenSigningAlgValuesSupportedList();

  /**
   *
   *
   * <pre>
   * supported ID Token signing Algorithms.
   * </pre>
   *
   * <code>
   * repeated string id_token_signing_alg_values_supported = 5 [json_name = "id_token_signing_alg_values_supported"];
   * </code>
   *
   * @return The count of idTokenSigningAlgValuesSupported.
   */
  int getIdTokenSigningAlgValuesSupportedCount();

  /**
   *
   *
   * <pre>
   * supported ID Token signing Algorithms.
   * </pre>
   *
   * <code>
   * repeated string id_token_signing_alg_values_supported = 5 [json_name = "id_token_signing_alg_values_supported"];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The idTokenSigningAlgValuesSupported at the given index.
   */
  java.lang.String getIdTokenSigningAlgValuesSupported(int index);

  /**
   *
   *
   * <pre>
   * supported ID Token signing Algorithms.
   * </pre>
   *
   * <code>
   * repeated string id_token_signing_alg_values_supported = 5 [json_name = "id_token_signing_alg_values_supported"];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the idTokenSigningAlgValuesSupported at the given index.
   */
  com.google.protobuf.ByteString getIdTokenSigningAlgValuesSupportedBytes(int index);

  /**
   *
   *
   * <pre>
   * Supported claims.
   * </pre>
   *
   * <code>repeated string claims_supported = 6 [json_name = "claims_supported"];</code>
   *
   * @return A list containing the claimsSupported.
   */
  java.util.List<java.lang.String> getClaimsSupportedList();

  /**
   *
   *
   * <pre>
   * Supported claims.
   * </pre>
   *
   * <code>repeated string claims_supported = 6 [json_name = "claims_supported"];</code>
   *
   * @return The count of claimsSupported.
   */
  int getClaimsSupportedCount();

  /**
   *
   *
   * <pre>
   * Supported claims.
   * </pre>
   *
   * <code>repeated string claims_supported = 6 [json_name = "claims_supported"];</code>
   *
   * @param index The index of the element to return.
   * @return The claimsSupported at the given index.
   */
  java.lang.String getClaimsSupported(int index);

  /**
   *
   *
   * <pre>
   * Supported claims.
   * </pre>
   *
   * <code>repeated string claims_supported = 6 [json_name = "claims_supported"];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the claimsSupported at the given index.
   */
  com.google.protobuf.ByteString getClaimsSupportedBytes(int index);

  /**
   *
   *
   * <pre>
   * Supported grant types.
   * </pre>
   *
   * <code>repeated string grant_types = 7 [json_name = "grant_types"];</code>
   *
   * @return A list containing the grantTypes.
   */
  java.util.List<java.lang.String> getGrantTypesList();

  /**
   *
   *
   * <pre>
   * Supported grant types.
   * </pre>
   *
   * <code>repeated string grant_types = 7 [json_name = "grant_types"];</code>
   *
   * @return The count of grantTypes.
   */
  int getGrantTypesCount();

  /**
   *
   *
   * <pre>
   * Supported grant types.
   * </pre>
   *
   * <code>repeated string grant_types = 7 [json_name = "grant_types"];</code>
   *
   * @param index The index of the element to return.
   * @return The grantTypes at the given index.
   */
  java.lang.String getGrantTypes(int index);

  /**
   *
   *
   * <pre>
   * Supported grant types.
   * </pre>
   *
   * <code>repeated string grant_types = 7 [json_name = "grant_types"];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the grantTypes at the given index.
   */
  com.google.protobuf.ByteString getGrantTypesBytes(int index);
}
