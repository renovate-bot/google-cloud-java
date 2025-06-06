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
 * Describes functionality of a given container in its original format.
 * </pre>
 *
 * Protobuf enum {@code google.privacy.dlp.v2.TransformationContainerType}
 */
public enum TransformationContainerType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unused.
   * </pre>
   *
   * <code>TRANSFORM_UNKNOWN_CONTAINER = 0;</code>
   */
  TRANSFORM_UNKNOWN_CONTAINER(0),
  /**
   *
   *
   * <pre>
   * Body of a file.
   * </pre>
   *
   * <code>TRANSFORM_BODY = 1;</code>
   */
  TRANSFORM_BODY(1),
  /**
   *
   *
   * <pre>
   * Metadata for a file.
   * </pre>
   *
   * <code>TRANSFORM_METADATA = 2;</code>
   */
  TRANSFORM_METADATA(2),
  /**
   *
   *
   * <pre>
   * A table.
   * </pre>
   *
   * <code>TRANSFORM_TABLE = 3;</code>
   */
  TRANSFORM_TABLE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unused.
   * </pre>
   *
   * <code>TRANSFORM_UNKNOWN_CONTAINER = 0;</code>
   */
  public static final int TRANSFORM_UNKNOWN_CONTAINER_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Body of a file.
   * </pre>
   *
   * <code>TRANSFORM_BODY = 1;</code>
   */
  public static final int TRANSFORM_BODY_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Metadata for a file.
   * </pre>
   *
   * <code>TRANSFORM_METADATA = 2;</code>
   */
  public static final int TRANSFORM_METADATA_VALUE = 2;

  /**
   *
   *
   * <pre>
   * A table.
   * </pre>
   *
   * <code>TRANSFORM_TABLE = 3;</code>
   */
  public static final int TRANSFORM_TABLE_VALUE = 3;

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
  public static TransformationContainerType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TransformationContainerType forNumber(int value) {
    switch (value) {
      case 0:
        return TRANSFORM_UNKNOWN_CONTAINER;
      case 1:
        return TRANSFORM_BODY;
      case 2:
        return TRANSFORM_METADATA;
      case 3:
        return TRANSFORM_TABLE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TransformationContainerType>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<TransformationContainerType>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TransformationContainerType>() {
            public TransformationContainerType findValueByNumber(int number) {
              return TransformationContainerType.forNumber(number);
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
    return com.google.privacy.dlp.v2.DlpProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final TransformationContainerType[] VALUES = values();

  public static TransformationContainerType valueOf(
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

  private TransformationContainerType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.TransformationContainerType)
}
