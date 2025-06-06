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
// source: google/maps/fleetengine/v1/header.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.fleetengine.v1;

public interface RequestHeaderOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.v1.RequestHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The BCP-47 language code, such as en-US or sr-Latn. For more information,
   * see http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. If none
   * is specified, the response may be in any language, with a preference for
   * English if such a name exists. Field value example: `en-US`.
   * </pre>
   *
   * <code>string language_code = 1;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();

  /**
   *
   *
   * <pre>
   * The BCP-47 language code, such as en-US or sr-Latn. For more information,
   * see http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. If none
   * is specified, the response may be in any language, with a preference for
   * English if such a name exists. Field value example: `en-US`.
   * </pre>
   *
   * <code>string language_code = 1;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Required. CLDR region code of the region where the request originates.
   * Field value example: `US`.
   * </pre>
   *
   * <code>string region_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The regionCode.
   */
  java.lang.String getRegionCode();

  /**
   *
   *
   * <pre>
   * Required. CLDR region code of the region where the request originates.
   * Field value example: `US`.
   * </pre>
   *
   * <code>string region_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for regionCode.
   */
  com.google.protobuf.ByteString getRegionCodeBytes();

  /**
   *
   *
   * <pre>
   * Version of the calling SDK, if applicable.
   * The version format is "major.minor.patch", example: `1.1.2`.
   * </pre>
   *
   * <code>string sdk_version = 3;</code>
   *
   * @return The sdkVersion.
   */
  java.lang.String getSdkVersion();

  /**
   *
   *
   * <pre>
   * Version of the calling SDK, if applicable.
   * The version format is "major.minor.patch", example: `1.1.2`.
   * </pre>
   *
   * <code>string sdk_version = 3;</code>
   *
   * @return The bytes for sdkVersion.
   */
  com.google.protobuf.ByteString getSdkVersionBytes();

  /**
   *
   *
   * <pre>
   * Version of the operating system on which the calling SDK is running.
   * Field value examples: `4.4.1`, `12.1`.
   * </pre>
   *
   * <code>string os_version = 4;</code>
   *
   * @return The osVersion.
   */
  java.lang.String getOsVersion();

  /**
   *
   *
   * <pre>
   * Version of the operating system on which the calling SDK is running.
   * Field value examples: `4.4.1`, `12.1`.
   * </pre>
   *
   * <code>string os_version = 4;</code>
   *
   * @return The bytes for osVersion.
   */
  com.google.protobuf.ByteString getOsVersionBytes();

  /**
   *
   *
   * <pre>
   * Model of the device on which the calling SDK is running.
   * Field value examples: `iPhone12,1`, `SM-G920F`.
   * </pre>
   *
   * <code>string device_model = 5;</code>
   *
   * @return The deviceModel.
   */
  java.lang.String getDeviceModel();

  /**
   *
   *
   * <pre>
   * Model of the device on which the calling SDK is running.
   * Field value examples: `iPhone12,1`, `SM-G920F`.
   * </pre>
   *
   * <code>string device_model = 5;</code>
   *
   * @return The bytes for deviceModel.
   */
  com.google.protobuf.ByteString getDeviceModelBytes();

  /**
   *
   *
   * <pre>
   * The type of SDK sending the request.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader.SdkType sdk_type = 6;</code>
   *
   * @return The enum numeric value on the wire for sdkType.
   */
  int getSdkTypeValue();

  /**
   *
   *
   * <pre>
   * The type of SDK sending the request.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader.SdkType sdk_type = 6;</code>
   *
   * @return The sdkType.
   */
  com.google.maps.fleetengine.v1.RequestHeader.SdkType getSdkType();

  /**
   *
   *
   * <pre>
   * Version of the MapSDK which the calling SDK depends on, if applicable.
   * The version format is "major.minor.patch", example: `5.2.1`.
   * </pre>
   *
   * <code>string maps_sdk_version = 7;</code>
   *
   * @return The mapsSdkVersion.
   */
  java.lang.String getMapsSdkVersion();

  /**
   *
   *
   * <pre>
   * Version of the MapSDK which the calling SDK depends on, if applicable.
   * The version format is "major.minor.patch", example: `5.2.1`.
   * </pre>
   *
   * <code>string maps_sdk_version = 7;</code>
   *
   * @return The bytes for mapsSdkVersion.
   */
  com.google.protobuf.ByteString getMapsSdkVersionBytes();

  /**
   *
   *
   * <pre>
   * Version of the NavSDK which the calling SDK depends on, if applicable.
   * The version format is "major.minor.patch", example: `2.1.0`.
   * </pre>
   *
   * <code>string nav_sdk_version = 8;</code>
   *
   * @return The navSdkVersion.
   */
  java.lang.String getNavSdkVersion();

  /**
   *
   *
   * <pre>
   * Version of the NavSDK which the calling SDK depends on, if applicable.
   * The version format is "major.minor.patch", example: `2.1.0`.
   * </pre>
   *
   * <code>string nav_sdk_version = 8;</code>
   *
   * @return The bytes for navSdkVersion.
   */
  com.google.protobuf.ByteString getNavSdkVersionBytes();

  /**
   *
   *
   * <pre>
   * Platform of the calling SDK.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader.Platform platform = 9;</code>
   *
   * @return The enum numeric value on the wire for platform.
   */
  int getPlatformValue();

  /**
   *
   *
   * <pre>
   * Platform of the calling SDK.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader.Platform platform = 9;</code>
   *
   * @return The platform.
   */
  com.google.maps.fleetengine.v1.RequestHeader.Platform getPlatform();

  /**
   *
   *
   * <pre>
   * Manufacturer of the Android device from the calling SDK, only applicable
   * for the Android SDKs.
   * Field value example: `Samsung`.
   * </pre>
   *
   * <code>string manufacturer = 10;</code>
   *
   * @return The manufacturer.
   */
  java.lang.String getManufacturer();

  /**
   *
   *
   * <pre>
   * Manufacturer of the Android device from the calling SDK, only applicable
   * for the Android SDKs.
   * Field value example: `Samsung`.
   * </pre>
   *
   * <code>string manufacturer = 10;</code>
   *
   * @return The bytes for manufacturer.
   */
  com.google.protobuf.ByteString getManufacturerBytes();

  /**
   *
   *
   * <pre>
   * Android API level of the calling SDK, only applicable for the Android SDKs.
   * Field value example: `23`.
   * </pre>
   *
   * <code>int32 android_api_level = 11;</code>
   *
   * @return The androidApiLevel.
   */
  int getAndroidApiLevel();

  /**
   *
   *
   * <pre>
   * Optional ID that can be provided for logging purposes in order to identify
   * the request.
   * </pre>
   *
   * <code>string trace_id = 12;</code>
   *
   * @return The traceId.
   */
  java.lang.String getTraceId();

  /**
   *
   *
   * <pre>
   * Optional ID that can be provided for logging purposes in order to identify
   * the request.
   * </pre>
   *
   * <code>string trace_id = 12;</code>
   *
   * @return The bytes for traceId.
   */
  com.google.protobuf.ByteString getTraceIdBytes();
}
