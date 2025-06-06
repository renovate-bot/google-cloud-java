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
// source: google/cloud/datacatalog/v1/common.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * This enum describes all the systems that manage
 * Taxonomy and PolicyTag resources in DataCatalog.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.datacatalog.v1.ManagingSystem}
 */
public enum ManagingSystem implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value
   * </pre>
   *
   * <code>MANAGING_SYSTEM_UNSPECIFIED = 0;</code>
   */
  MANAGING_SYSTEM_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Dataplex.
   * </pre>
   *
   * <code>MANAGING_SYSTEM_DATAPLEX = 1;</code>
   */
  MANAGING_SYSTEM_DATAPLEX(1),
  /**
   *
   *
   * <pre>
   * Other
   * </pre>
   *
   * <code>MANAGING_SYSTEM_OTHER = 2;</code>
   */
  MANAGING_SYSTEM_OTHER(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value
   * </pre>
   *
   * <code>MANAGING_SYSTEM_UNSPECIFIED = 0;</code>
   */
  public static final int MANAGING_SYSTEM_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Dataplex.
   * </pre>
   *
   * <code>MANAGING_SYSTEM_DATAPLEX = 1;</code>
   */
  public static final int MANAGING_SYSTEM_DATAPLEX_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Other
   * </pre>
   *
   * <code>MANAGING_SYSTEM_OTHER = 2;</code>
   */
  public static final int MANAGING_SYSTEM_OTHER_VALUE = 2;

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
  public static ManagingSystem valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ManagingSystem forNumber(int value) {
    switch (value) {
      case 0:
        return MANAGING_SYSTEM_UNSPECIFIED;
      case 1:
        return MANAGING_SYSTEM_DATAPLEX;
      case 2:
        return MANAGING_SYSTEM_OTHER;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ManagingSystem> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ManagingSystem> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ManagingSystem>() {
        public ManagingSystem findValueByNumber(int number) {
          return ManagingSystem.forNumber(number);
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
    return com.google.cloud.datacatalog.v1.Common.getDescriptor().getEnumTypes().get(1);
  }

  private static final ManagingSystem[] VALUES = values();

  public static ManagingSystem valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ManagingSystem(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.datacatalog.v1.ManagingSystem)
}
