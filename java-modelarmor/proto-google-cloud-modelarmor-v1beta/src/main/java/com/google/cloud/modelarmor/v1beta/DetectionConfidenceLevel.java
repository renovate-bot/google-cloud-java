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
// source: google/cloud/modelarmor/v1beta/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.modelarmor.v1beta;

/**
 *
 *
 * <pre>
 * Confidence levels for detectors.
 * Higher value maps to a greater confidence level. To enforce stricter level a
 * lower value should be used.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.modelarmor.v1beta.DetectionConfidenceLevel}
 */
public enum DetectionConfidenceLevel implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Same as LOW_AND_ABOVE.
   * </pre>
   *
   * <code>DETECTION_CONFIDENCE_LEVEL_UNSPECIFIED = 0;</code>
   */
  DETECTION_CONFIDENCE_LEVEL_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Highest chance of a false positive.
   * </pre>
   *
   * <code>LOW_AND_ABOVE = 1;</code>
   */
  LOW_AND_ABOVE(1),
  /**
   *
   *
   * <pre>
   * Some chance of false positives.
   * </pre>
   *
   * <code>MEDIUM_AND_ABOVE = 2;</code>
   */
  MEDIUM_AND_ABOVE(2),
  /**
   *
   *
   * <pre>
   * Low chance of false positives.
   * </pre>
   *
   * <code>HIGH = 3;</code>
   */
  HIGH(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Same as LOW_AND_ABOVE.
   * </pre>
   *
   * <code>DETECTION_CONFIDENCE_LEVEL_UNSPECIFIED = 0;</code>
   */
  public static final int DETECTION_CONFIDENCE_LEVEL_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Highest chance of a false positive.
   * </pre>
   *
   * <code>LOW_AND_ABOVE = 1;</code>
   */
  public static final int LOW_AND_ABOVE_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Some chance of false positives.
   * </pre>
   *
   * <code>MEDIUM_AND_ABOVE = 2;</code>
   */
  public static final int MEDIUM_AND_ABOVE_VALUE = 2;

  /**
   *
   *
   * <pre>
   * Low chance of false positives.
   * </pre>
   *
   * <code>HIGH = 3;</code>
   */
  public static final int HIGH_VALUE = 3;

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
  public static DetectionConfidenceLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DetectionConfidenceLevel forNumber(int value) {
    switch (value) {
      case 0:
        return DETECTION_CONFIDENCE_LEVEL_UNSPECIFIED;
      case 1:
        return LOW_AND_ABOVE;
      case 2:
        return MEDIUM_AND_ABOVE;
      case 3:
        return HIGH;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DetectionConfidenceLevel>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<DetectionConfidenceLevel>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DetectionConfidenceLevel>() {
            public DetectionConfidenceLevel findValueByNumber(int number) {
              return DetectionConfidenceLevel.forNumber(number);
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
    return com.google.cloud.modelarmor.v1beta.V1mainProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final DetectionConfidenceLevel[] VALUES = values();

  public static DetectionConfidenceLevel valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DetectionConfidenceLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.modelarmor.v1beta.DetectionConfidenceLevel)
}
