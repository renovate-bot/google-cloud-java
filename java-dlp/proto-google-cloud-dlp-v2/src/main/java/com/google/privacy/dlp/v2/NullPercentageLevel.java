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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.8
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Bucketized nullness percentage levels. A higher level means a higher
 * percentage of the column is null.
 * </pre>
 *
 * Protobuf enum {@code google.privacy.dlp.v2.NullPercentageLevel}
 */
public enum NullPercentageLevel implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unused.
   * </pre>
   *
   * <code>NULL_PERCENTAGE_LEVEL_UNSPECIFIED = 0;</code>
   */
  NULL_PERCENTAGE_LEVEL_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Very few null entries.
   * </pre>
   *
   * <code>NULL_PERCENTAGE_VERY_LOW = 1;</code>
   */
  NULL_PERCENTAGE_VERY_LOW(1),
  /**
   *
   *
   * <pre>
   * Some null entries.
   * </pre>
   *
   * <code>NULL_PERCENTAGE_LOW = 2;</code>
   */
  NULL_PERCENTAGE_LOW(2),
  /**
   *
   *
   * <pre>
   * A few null entries.
   * </pre>
   *
   * <code>NULL_PERCENTAGE_MEDIUM = 3;</code>
   */
  NULL_PERCENTAGE_MEDIUM(3),
  /**
   *
   *
   * <pre>
   * A lot of null entries.
   * </pre>
   *
   * <code>NULL_PERCENTAGE_HIGH = 4;</code>
   */
  NULL_PERCENTAGE_HIGH(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unused.
   * </pre>
   *
   * <code>NULL_PERCENTAGE_LEVEL_UNSPECIFIED = 0;</code>
   */
  public static final int NULL_PERCENTAGE_LEVEL_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Very few null entries.
   * </pre>
   *
   * <code>NULL_PERCENTAGE_VERY_LOW = 1;</code>
   */
  public static final int NULL_PERCENTAGE_VERY_LOW_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Some null entries.
   * </pre>
   *
   * <code>NULL_PERCENTAGE_LOW = 2;</code>
   */
  public static final int NULL_PERCENTAGE_LOW_VALUE = 2;

  /**
   *
   *
   * <pre>
   * A few null entries.
   * </pre>
   *
   * <code>NULL_PERCENTAGE_MEDIUM = 3;</code>
   */
  public static final int NULL_PERCENTAGE_MEDIUM_VALUE = 3;

  /**
   *
   *
   * <pre>
   * A lot of null entries.
   * </pre>
   *
   * <code>NULL_PERCENTAGE_HIGH = 4;</code>
   */
  public static final int NULL_PERCENTAGE_HIGH_VALUE = 4;

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
  public static NullPercentageLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NullPercentageLevel forNumber(int value) {
    switch (value) {
      case 0:
        return NULL_PERCENTAGE_LEVEL_UNSPECIFIED;
      case 1:
        return NULL_PERCENTAGE_VERY_LOW;
      case 2:
        return NULL_PERCENTAGE_LOW;
      case 3:
        return NULL_PERCENTAGE_MEDIUM;
      case 4:
        return NULL_PERCENTAGE_HIGH;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NullPercentageLevel>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<NullPercentageLevel>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NullPercentageLevel>() {
            public NullPercentageLevel findValueByNumber(int number) {
              return NullPercentageLevel.forNumber(number);
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
    return com.google.privacy.dlp.v2.DlpProto.getDescriptor().getEnumTypes().get(18);
  }

  private static final NullPercentageLevel[] VALUES = values();

  public static NullPercentageLevel valueOf(
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

  private NullPercentageLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.NullPercentageLevel)
}
