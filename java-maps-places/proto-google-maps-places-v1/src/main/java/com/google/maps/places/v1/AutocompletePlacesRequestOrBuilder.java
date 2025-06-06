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

public interface AutocompletePlacesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.places.v1.AutocompletePlacesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The text string on which to search.
   * </pre>
   *
   * <code>string input = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The input.
   */
  java.lang.String getInput();

  /**
   *
   *
   * <pre>
   * Required. The text string on which to search.
   * </pre>
   *
   * <code>string input = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for input.
   */
  com.google.protobuf.ByteString getInputBytes();

  /**
   *
   *
   * <pre>
   * Optional. Bias results to a specified location.
   *
   * At most one of `location_bias` or `location_restriction` should be set. If
   * neither are set, the results will be biased by IP address, meaning the IP
   * address will be mapped to an imprecise location and used as a biasing
   * signal.
   * </pre>
   *
   * <code>
   * .google.maps.places.v1.AutocompletePlacesRequest.LocationBias location_bias = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the locationBias field is set.
   */
  boolean hasLocationBias();

  /**
   *
   *
   * <pre>
   * Optional. Bias results to a specified location.
   *
   * At most one of `location_bias` or `location_restriction` should be set. If
   * neither are set, the results will be biased by IP address, meaning the IP
   * address will be mapped to an imprecise location and used as a biasing
   * signal.
   * </pre>
   *
   * <code>
   * .google.maps.places.v1.AutocompletePlacesRequest.LocationBias location_bias = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The locationBias.
   */
  com.google.maps.places.v1.AutocompletePlacesRequest.LocationBias getLocationBias();

  /**
   *
   *
   * <pre>
   * Optional. Bias results to a specified location.
   *
   * At most one of `location_bias` or `location_restriction` should be set. If
   * neither are set, the results will be biased by IP address, meaning the IP
   * address will be mapped to an imprecise location and used as a biasing
   * signal.
   * </pre>
   *
   * <code>
   * .google.maps.places.v1.AutocompletePlacesRequest.LocationBias location_bias = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.maps.places.v1.AutocompletePlacesRequest.LocationBiasOrBuilder
      getLocationBiasOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Restrict results to a specified location.
   *
   * At most one of `location_bias` or `location_restriction` should be set. If
   * neither are set, the results will be biased by IP address, meaning the IP
   * address will be mapped to an imprecise location and used as a biasing
   * signal.
   * </pre>
   *
   * <code>
   * .google.maps.places.v1.AutocompletePlacesRequest.LocationRestriction location_restriction = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the locationRestriction field is set.
   */
  boolean hasLocationRestriction();

  /**
   *
   *
   * <pre>
   * Optional. Restrict results to a specified location.
   *
   * At most one of `location_bias` or `location_restriction` should be set. If
   * neither are set, the results will be biased by IP address, meaning the IP
   * address will be mapped to an imprecise location and used as a biasing
   * signal.
   * </pre>
   *
   * <code>
   * .google.maps.places.v1.AutocompletePlacesRequest.LocationRestriction location_restriction = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The locationRestriction.
   */
  com.google.maps.places.v1.AutocompletePlacesRequest.LocationRestriction getLocationRestriction();

  /**
   *
   *
   * <pre>
   * Optional. Restrict results to a specified location.
   *
   * At most one of `location_bias` or `location_restriction` should be set. If
   * neither are set, the results will be biased by IP address, meaning the IP
   * address will be mapped to an imprecise location and used as a biasing
   * signal.
   * </pre>
   *
   * <code>
   * .google.maps.places.v1.AutocompletePlacesRequest.LocationRestriction location_restriction = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.maps.places.v1.AutocompletePlacesRequest.LocationRestrictionOrBuilder
      getLocationRestrictionOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Included primary Place type (for example, "restaurant" or
   * "gas_station") in Place Types
   * (https://developers.google.com/maps/documentation/places/web-service/place-types),
   * or only `(regions)`, or only `(cities)`. A Place is only returned if its
   * primary type is included in this list. Up to 5 values can be specified. If
   * no types are specified, all Place types are returned.
   * </pre>
   *
   * <code>repeated string included_primary_types = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the includedPrimaryTypes.
   */
  java.util.List<java.lang.String> getIncludedPrimaryTypesList();

  /**
   *
   *
   * <pre>
   * Optional. Included primary Place type (for example, "restaurant" or
   * "gas_station") in Place Types
   * (https://developers.google.com/maps/documentation/places/web-service/place-types),
   * or only `(regions)`, or only `(cities)`. A Place is only returned if its
   * primary type is included in this list. Up to 5 values can be specified. If
   * no types are specified, all Place types are returned.
   * </pre>
   *
   * <code>repeated string included_primary_types = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of includedPrimaryTypes.
   */
  int getIncludedPrimaryTypesCount();

  /**
   *
   *
   * <pre>
   * Optional. Included primary Place type (for example, "restaurant" or
   * "gas_station") in Place Types
   * (https://developers.google.com/maps/documentation/places/web-service/place-types),
   * or only `(regions)`, or only `(cities)`. A Place is only returned if its
   * primary type is included in this list. Up to 5 values can be specified. If
   * no types are specified, all Place types are returned.
   * </pre>
   *
   * <code>repeated string included_primary_types = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The includedPrimaryTypes at the given index.
   */
  java.lang.String getIncludedPrimaryTypes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Included primary Place type (for example, "restaurant" or
   * "gas_station") in Place Types
   * (https://developers.google.com/maps/documentation/places/web-service/place-types),
   * or only `(regions)`, or only `(cities)`. A Place is only returned if its
   * primary type is included in this list. Up to 5 values can be specified. If
   * no types are specified, all Place types are returned.
   * </pre>
   *
   * <code>repeated string included_primary_types = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the includedPrimaryTypes at the given index.
   */
  com.google.protobuf.ByteString getIncludedPrimaryTypesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Only include results in the specified regions, specified as up to
   * 15 CLDR two-character region codes. An empty set will not restrict the
   * results. If both `location_restriction` and `included_region_codes` are
   * set, the results will be located in the area of intersection.
   * </pre>
   *
   * <code>repeated string included_region_codes = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the includedRegionCodes.
   */
  java.util.List<java.lang.String> getIncludedRegionCodesList();

  /**
   *
   *
   * <pre>
   * Optional. Only include results in the specified regions, specified as up to
   * 15 CLDR two-character region codes. An empty set will not restrict the
   * results. If both `location_restriction` and `included_region_codes` are
   * set, the results will be located in the area of intersection.
   * </pre>
   *
   * <code>repeated string included_region_codes = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of includedRegionCodes.
   */
  int getIncludedRegionCodesCount();

  /**
   *
   *
   * <pre>
   * Optional. Only include results in the specified regions, specified as up to
   * 15 CLDR two-character region codes. An empty set will not restrict the
   * results. If both `location_restriction` and `included_region_codes` are
   * set, the results will be located in the area of intersection.
   * </pre>
   *
   * <code>repeated string included_region_codes = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The includedRegionCodes at the given index.
   */
  java.lang.String getIncludedRegionCodes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Only include results in the specified regions, specified as up to
   * 15 CLDR two-character region codes. An empty set will not restrict the
   * results. If both `location_restriction` and `included_region_codes` are
   * set, the results will be located in the area of intersection.
   * </pre>
   *
   * <code>repeated string included_region_codes = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the includedRegionCodes at the given index.
   */
  com.google.protobuf.ByteString getIncludedRegionCodesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The language in which to return results. Defaults to en-US. The
   * results may be in mixed languages if the language used in `input` is
   * different from `language_code` or if the returned Place does not have a
   * translation from the local language to `language_code`.
   * </pre>
   *
   * <code>string language_code = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();

  /**
   *
   *
   * <pre>
   * Optional. The language in which to return results. Defaults to en-US. The
   * results may be in mixed languages if the language used in `input` is
   * different from `language_code` or if the returned Place does not have a
   * translation from the local language to `language_code`.
   * </pre>
   *
   * <code>string language_code = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The region code, specified as a CLDR two-character region code.
   * This affects address formatting, result ranking, and may influence what
   * results are returned. This does not restrict results to the specified
   * region. To restrict results to a region, use `region_code_restriction`.
   * </pre>
   *
   * <code>string region_code = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The regionCode.
   */
  java.lang.String getRegionCode();

  /**
   *
   *
   * <pre>
   * Optional. The region code, specified as a CLDR two-character region code.
   * This affects address formatting, result ranking, and may influence what
   * results are returned. This does not restrict results to the specified
   * region. To restrict results to a region, use `region_code_restriction`.
   * </pre>
   *
   * <code>string region_code = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for regionCode.
   */
  com.google.protobuf.ByteString getRegionCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The origin point from which to calculate geodesic distance to the
   * destination (returned as `distance_meters`). If this value is omitted,
   * geodesic distance will not be returned.
   * </pre>
   *
   * <code>.google.type.LatLng origin = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the origin field is set.
   */
  boolean hasOrigin();

  /**
   *
   *
   * <pre>
   * Optional. The origin point from which to calculate geodesic distance to the
   * destination (returned as `distance_meters`). If this value is omitted,
   * geodesic distance will not be returned.
   * </pre>
   *
   * <code>.google.type.LatLng origin = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The origin.
   */
  com.google.type.LatLng getOrigin();

  /**
   *
   *
   * <pre>
   * Optional. The origin point from which to calculate geodesic distance to the
   * destination (returned as `distance_meters`). If this value is omitted,
   * geodesic distance will not be returned.
   * </pre>
   *
   * <code>.google.type.LatLng origin = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.type.LatLngOrBuilder getOriginOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A zero-based Unicode character offset of `input` indicating the
   * cursor position in `input`. The cursor position may influence what
   * predictions are returned.
   *
   * If empty, defaults to the length of `input`.
   * </pre>
   *
   * <code>int32 input_offset = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The inputOffset.
   */
  int getInputOffset();

  /**
   *
   *
   * <pre>
   * Optional. If true, the response will include both Place and query
   * predictions. Otherwise the response will only return Place predictions.
   * </pre>
   *
   * <code>bool include_query_predictions = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The includeQueryPredictions.
   */
  boolean getIncludeQueryPredictions();

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
   * <code>string session_token = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * <code>string session_token = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for sessionToken.
   */
  com.google.protobuf.ByteString getSessionTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. Include pure service area businesses if the field is set to true.
   * Pure service area business is a business that visits or delivers to
   * customers directly but does not serve customers at their business address.
   * For example, businesses like cleaning services or plumbers. Those
   * businesses do not have a physical address or location on Google Maps.
   * Places will not return fields including `location`, `plus_code`, and other
   * location related fields for these businesses.
   * </pre>
   *
   * <code>bool include_pure_service_area_businesses = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The includePureServiceAreaBusinesses.
   */
  boolean getIncludePureServiceAreaBusinesses();
}
