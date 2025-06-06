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
// source: google/cloud/securitycenter/v1/resource_value_config.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v1;

/**
 *
 *
 * <pre>
 * Value enum to map to a resource
 * </pre>
 *
 * Protobuf enum {@code google.cloud.securitycenter.v1.ResourceValue}
 */
public enum ResourceValue implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecific value
   * </pre>
   *
   * <code>RESOURCE_VALUE_UNSPECIFIED = 0;</code>
   */
  RESOURCE_VALUE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * High resource value
   * </pre>
   *
   * <code>HIGH = 1;</code>
   */
  HIGH(1),
  /**
   *
   *
   * <pre>
   * Medium resource value
   * </pre>
   *
   * <code>MEDIUM = 2;</code>
   */
  MEDIUM(2),
  /**
   *
   *
   * <pre>
   * Low resource value
   * </pre>
   *
   * <code>LOW = 3;</code>
   */
  LOW(3),
  /**
   *
   *
   * <pre>
   * No resource value, e.g. ignore these resources
   * </pre>
   *
   * <code>NONE = 4;</code>
   */
  NONE(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecific value
   * </pre>
   *
   * <code>RESOURCE_VALUE_UNSPECIFIED = 0;</code>
   */
  public static final int RESOURCE_VALUE_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * High resource value
   * </pre>
   *
   * <code>HIGH = 1;</code>
   */
  public static final int HIGH_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Medium resource value
   * </pre>
   *
   * <code>MEDIUM = 2;</code>
   */
  public static final int MEDIUM_VALUE = 2;

  /**
   *
   *
   * <pre>
   * Low resource value
   * </pre>
   *
   * <code>LOW = 3;</code>
   */
  public static final int LOW_VALUE = 3;

  /**
   *
   *
   * <pre>
   * No resource value, e.g. ignore these resources
   * </pre>
   *
   * <code>NONE = 4;</code>
   */
  public static final int NONE_VALUE = 4;

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
  public static ResourceValue valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ResourceValue forNumber(int value) {
    switch (value) {
      case 0:
        return RESOURCE_VALUE_UNSPECIFIED;
      case 1:
        return HIGH;
      case 2:
        return MEDIUM;
      case 3:
        return LOW;
      case 4:
        return NONE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ResourceValue> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ResourceValue> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ResourceValue>() {
        public ResourceValue findValueByNumber(int number) {
          return ResourceValue.forNumber(number);
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
    return com.google.cloud.securitycenter.v1.ResourceValueConfigProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final ResourceValue[] VALUES = values();

  public static ResourceValue valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ResourceValue(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.securitycenter.v1.ResourceValue)
}
