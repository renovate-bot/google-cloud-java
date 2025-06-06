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
// source: google/maps/places/v1/places_service.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.places.v1;

public interface GetPlaceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.places.v1.GetPlaceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of a place, in the `places/{place_id}` format.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. The resource name of a place, in the `places/{place_id}` format.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Place details will be displayed with the preferred language if
   * available.
   *
   * Current list of supported languages:
   * https://developers.google.com/maps/faq#languagesupport.
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();

  /**
   *
   *
   * <pre>
   * Optional. Place details will be displayed with the preferred language if
   * available.
   *
   * Current list of supported languages:
   * https://developers.google.com/maps/faq#languagesupport.
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Unicode country/region code (CLDR) of the location where the
   * request is coming from. This parameter is used to display the place
   * details, like region-specific place name, if available. The parameter can
   * affect results based on applicable law.
   * For more information, see
   * https://www.unicode.org/cldr/charts/latest/supplemental/territory_language_information.html.
   *
   *
   * Note that 3-digit region codes are not currently supported.
   * </pre>
   *
   * <code>string region_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The regionCode.
   */
  java.lang.String getRegionCode();

  /**
   *
   *
   * <pre>
   * Optional. The Unicode country/region code (CLDR) of the location where the
   * request is coming from. This parameter is used to display the place
   * details, like region-specific place name, if available. The parameter can
   * affect results based on applicable law.
   * For more information, see
   * https://www.unicode.org/cldr/charts/latest/supplemental/territory_language_information.html.
   *
   *
   * Note that 3-digit region codes are not currently supported.
   * </pre>
   *
   * <code>string region_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for regionCode.
   */
  com.google.protobuf.ByteString getRegionCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. A string which identifies an Autocomplete session for billing
   * purposes. Must be a URL and filename safe base64 string with at most 36
   * ASCII characters in length. Otherwise an INVALID_ARGUMENT error is
   * returned.
   *
   * The session begins when the user starts typing a query, and concludes when
   * they select a place and a call to Place Details or Address Validation is
   * made. Each session can have multiple queries, followed by one Place Details
   * or Address Validation request. The credentials used for each request within
   * a session must belong to the same Google Cloud Console project. Once a
   * session has concluded, the token is no longer valid; your app must generate
   * a fresh token for each session. If the `session_token` parameter is
   * omitted, or if you reuse a session token, the session is charged as if no
   * session token was provided (each request is billed separately).
   *
   * We recommend the following guidelines:
   *
   * * Use session tokens for all Place Autocomplete calls.
   * * Generate a fresh token for each session. Using a version 4 UUID is
   *   recommended.
   * * Ensure that the credentials used for all Place Autocomplete, Place
   *   Details, and Address Validation requests within a session belong to the
   *   same Cloud Console project.
   * * Be sure to pass a unique session token for each new session. Using the
   *   same token for more than one session will result in each request being
   *   billed individually.
   * </pre>
   *
   * <code>string session_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sessionToken.
   */
  java.lang.String getSessionToken();

  /**
   *
   *
   * <pre>
   * Optional. A string which identifies an Autocomplete session for billing
   * purposes. Must be a URL and filename safe base64 string with at most 36
   * ASCII characters in length. Otherwise an INVALID_ARGUMENT error is
   * returned.
   *
   * The session begins when the user starts typing a query, and concludes when
   * they select a place and a call to Place Details or Address Validation is
   * made. Each session can have multiple queries, followed by one Place Details
   * or Address Validation request. The credentials used for each request within
   * a session must belong to the same Google Cloud Console project. Once a
   * session has concluded, the token is no longer valid; your app must generate
   * a fresh token for each session. If the `session_token` parameter is
   * omitted, or if you reuse a session token, the session is charged as if no
   * session token was provided (each request is billed separately).
   *
   * We recommend the following guidelines:
   *
   * * Use session tokens for all Place Autocomplete calls.
   * * Generate a fresh token for each session. Using a version 4 UUID is
   *   recommended.
   * * Ensure that the credentials used for all Place Autocomplete, Place
   *   Details, and Address Validation requests within a session belong to the
   *   same Cloud Console project.
   * * Be sure to pass a unique session token for each new session. Using the
   *   same token for more than one session will result in each request being
   *   billed individually.
   * </pre>
   *
   * <code>string session_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for sessionToken.
   */
  com.google.protobuf.ByteString getSessionTokenBytes();
}
