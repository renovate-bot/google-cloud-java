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
// source: google/maps/fleetengine/v1/vehicles.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.fleetengine.v1;

public interface LicensePlateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.v1.LicensePlate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. CLDR Country/Region Code.  For example, `US` for United States,
   * or `IN` for India.
   * </pre>
   *
   * <code>string country_code = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The countryCode.
   */
  java.lang.String getCountryCode();

  /**
   *
   *
   * <pre>
   * Required. CLDR Country/Region Code.  For example, `US` for United States,
   * or `IN` for India.
   * </pre>
   *
   * <code>string country_code = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString getCountryCodeBytes();

  /**
   *
   *
   * <pre>
   * The last digit of the license plate or "-1" to denote no numeric value
   * is present in the license plate.
   *
   * * "ABC 1234" -&gt; "4"
   * * "AB 123 CD" -&gt; "3"
   * * "ABCDEF" -&gt; "-1"
   * </pre>
   *
   * <code>string last_character = 2;</code>
   *
   * @return The lastCharacter.
   */
  java.lang.String getLastCharacter();

  /**
   *
   *
   * <pre>
   * The last digit of the license plate or "-1" to denote no numeric value
   * is present in the license plate.
   *
   * * "ABC 1234" -&gt; "4"
   * * "AB 123 CD" -&gt; "3"
   * * "ABCDEF" -&gt; "-1"
   * </pre>
   *
   * <code>string last_character = 2;</code>
   *
   * @return The bytes for lastCharacter.
   */
  com.google.protobuf.ByteString getLastCharacterBytes();
}
