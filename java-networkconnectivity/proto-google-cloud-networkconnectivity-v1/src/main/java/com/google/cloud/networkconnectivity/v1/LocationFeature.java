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
// source: google/cloud/networkconnectivity/v1/hub.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.networkconnectivity.v1;

/**
 *
 *
 * <pre>
 * Supported features for a location
 * </pre>
 *
 * Protobuf enum {@code google.cloud.networkconnectivity.v1.LocationFeature}
 */
public enum LocationFeature implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * No publicly supported feature in this location
   * </pre>
   *
   * <code>LOCATION_FEATURE_UNSPECIFIED = 0;</code>
   */
  LOCATION_FEATURE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Site-to-cloud spokes are supported in this location
   * </pre>
   *
   * <code>SITE_TO_CLOUD_SPOKES = 1;</code>
   */
  SITE_TO_CLOUD_SPOKES(1),
  /**
   *
   *
   * <pre>
   * Site-to-site spokes are supported in this location
   * </pre>
   *
   * <code>SITE_TO_SITE_SPOKES = 2;</code>
   */
  SITE_TO_SITE_SPOKES(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * No publicly supported feature in this location
   * </pre>
   *
   * <code>LOCATION_FEATURE_UNSPECIFIED = 0;</code>
   */
  public static final int LOCATION_FEATURE_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Site-to-cloud spokes are supported in this location
   * </pre>
   *
   * <code>SITE_TO_CLOUD_SPOKES = 1;</code>
   */
  public static final int SITE_TO_CLOUD_SPOKES_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Site-to-site spokes are supported in this location
   * </pre>
   *
   * <code>SITE_TO_SITE_SPOKES = 2;</code>
   */
  public static final int SITE_TO_SITE_SPOKES_VALUE = 2;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static LocationFeature valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LocationFeature forNumber(int value) {
    switch (value) {
      case 0:
        return LOCATION_FEATURE_UNSPECIFIED;
      case 1:
        return SITE_TO_CLOUD_SPOKES;
      case 2:
        return SITE_TO_SITE_SPOKES;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LocationFeature> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<LocationFeature> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<LocationFeature>() {
        public LocationFeature findValueByNumber(int number) {
          return LocationFeature.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.networkconnectivity.v1.HubProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final LocationFeature[] VALUES = values();

  public static LocationFeature valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private LocationFeature(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.networkconnectivity.v1.LocationFeature)
}
