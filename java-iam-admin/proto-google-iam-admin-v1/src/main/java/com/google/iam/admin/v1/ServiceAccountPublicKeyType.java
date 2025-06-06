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
// source: google/iam/admin/v1/iam.proto

// Protobuf Java Version: 3.25.8
package com.google.iam.admin.v1;

/**
 *
 *
 * <pre>
 * Supported public key output formats.
 * </pre>
 *
 * Protobuf enum {@code google.iam.admin.v1.ServiceAccountPublicKeyType}
 */
public enum ServiceAccountPublicKeyType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Do not return the public key.
   * </pre>
   *
   * <code>TYPE_NONE = 0;</code>
   */
  TYPE_NONE(0),
  /**
   *
   *
   * <pre>
   * X509 PEM format.
   * </pre>
   *
   * <code>TYPE_X509_PEM_FILE = 1;</code>
   */
  TYPE_X509_PEM_FILE(1),
  /**
   *
   *
   * <pre>
   * Raw public key.
   * </pre>
   *
   * <code>TYPE_RAW_PUBLIC_KEY = 2;</code>
   */
  TYPE_RAW_PUBLIC_KEY(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Do not return the public key.
   * </pre>
   *
   * <code>TYPE_NONE = 0;</code>
   */
  public static final int TYPE_NONE_VALUE = 0;

  /**
   *
   *
   * <pre>
   * X509 PEM format.
   * </pre>
   *
   * <code>TYPE_X509_PEM_FILE = 1;</code>
   */
  public static final int TYPE_X509_PEM_FILE_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Raw public key.
   * </pre>
   *
   * <code>TYPE_RAW_PUBLIC_KEY = 2;</code>
   */
  public static final int TYPE_RAW_PUBLIC_KEY_VALUE = 2;

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
  public static ServiceAccountPublicKeyType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ServiceAccountPublicKeyType forNumber(int value) {
    switch (value) {
      case 0:
        return TYPE_NONE;
      case 1:
        return TYPE_X509_PEM_FILE;
      case 2:
        return TYPE_RAW_PUBLIC_KEY;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ServiceAccountPublicKeyType>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ServiceAccountPublicKeyType>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ServiceAccountPublicKeyType>() {
            public ServiceAccountPublicKeyType findValueByNumber(int number) {
              return ServiceAccountPublicKeyType.forNumber(number);
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
    return com.google.iam.admin.v1.Iam.getDescriptor().getEnumTypes().get(2);
  }

  private static final ServiceAccountPublicKeyType[] VALUES = values();

  public static ServiceAccountPublicKeyType valueOf(
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

  private ServiceAccountPublicKeyType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.iam.admin.v1.ServiceAccountPublicKeyType)
}
