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
// source: google/cloud/netapp/v1/common.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.netapp.v1;

/**
 *
 *
 * <pre>
 * Type of directory service
 * </pre>
 *
 * Protobuf enum {@code google.cloud.netapp.v1.DirectoryServiceType}
 */
public enum DirectoryServiceType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Directory service type is not specified.
   * </pre>
   *
   * <code>DIRECTORY_SERVICE_TYPE_UNSPECIFIED = 0;</code>
   */
  DIRECTORY_SERVICE_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Active directory policy attached to the storage pool.
   * </pre>
   *
   * <code>ACTIVE_DIRECTORY = 1;</code>
   */
  ACTIVE_DIRECTORY(1),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Directory service type is not specified.
   * </pre>
   *
   * <code>DIRECTORY_SERVICE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int DIRECTORY_SERVICE_TYPE_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Active directory policy attached to the storage pool.
   * </pre>
   *
   * <code>ACTIVE_DIRECTORY = 1;</code>
   */
  public static final int ACTIVE_DIRECTORY_VALUE = 1;

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
  public static DirectoryServiceType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DirectoryServiceType forNumber(int value) {
    switch (value) {
      case 0:
        return DIRECTORY_SERVICE_TYPE_UNSPECIFIED;
      case 1:
        return ACTIVE_DIRECTORY;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DirectoryServiceType>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<DirectoryServiceType>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DirectoryServiceType>() {
            public DirectoryServiceType findValueByNumber(int number) {
              return DirectoryServiceType.forNumber(number);
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
    return com.google.cloud.netapp.v1.CommonProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final DirectoryServiceType[] VALUES = values();

  public static DirectoryServiceType valueOf(
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

  private DirectoryServiceType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.netapp.v1.DirectoryServiceType)
}
