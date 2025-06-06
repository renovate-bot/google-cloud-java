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
// source: google/cloud/confidentialcomputing/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.confidentialcomputing.v1;

/**
 *
 *
 * <pre>
 * Token type enum contains the different types of token responses Confidential
 * Space supports
 * </pre>
 *
 * Protobuf enum {@code google.cloud.confidentialcomputing.v1.TokenType}
 */
public enum TokenType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified token type
   * </pre>
   *
   * <code>TOKEN_TYPE_UNSPECIFIED = 0;</code>
   */
  TOKEN_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * OpenID Connect (OIDC) token type
   * </pre>
   *
   * <code>TOKEN_TYPE_OIDC = 1;</code>
   */
  TOKEN_TYPE_OIDC(1),
  /**
   *
   *
   * <pre>
   * Public Key Infrastructure (PKI) token type
   * </pre>
   *
   * <code>TOKEN_TYPE_PKI = 2;</code>
   */
  TOKEN_TYPE_PKI(2),
  /**
   *
   *
   * <pre>
   * Limited claim token type for AWS integration
   * </pre>
   *
   * <code>TOKEN_TYPE_LIMITED_AWS = 3;</code>
   */
  TOKEN_TYPE_LIMITED_AWS(3),
  /**
   *
   *
   * <pre>
   * Principal-tag-based token for AWS integration
   * </pre>
   *
   * <code>TOKEN_TYPE_AWS_PRINCIPALTAGS = 4;</code>
   */
  TOKEN_TYPE_AWS_PRINCIPALTAGS(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified token type
   * </pre>
   *
   * <code>TOKEN_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int TOKEN_TYPE_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * OpenID Connect (OIDC) token type
   * </pre>
   *
   * <code>TOKEN_TYPE_OIDC = 1;</code>
   */
  public static final int TOKEN_TYPE_OIDC_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Public Key Infrastructure (PKI) token type
   * </pre>
   *
   * <code>TOKEN_TYPE_PKI = 2;</code>
   */
  public static final int TOKEN_TYPE_PKI_VALUE = 2;

  /**
   *
   *
   * <pre>
   * Limited claim token type for AWS integration
   * </pre>
   *
   * <code>TOKEN_TYPE_LIMITED_AWS = 3;</code>
   */
  public static final int TOKEN_TYPE_LIMITED_AWS_VALUE = 3;

  /**
   *
   *
   * <pre>
   * Principal-tag-based token for AWS integration
   * </pre>
   *
   * <code>TOKEN_TYPE_AWS_PRINCIPALTAGS = 4;</code>
   */
  public static final int TOKEN_TYPE_AWS_PRINCIPALTAGS_VALUE = 4;

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
  public static TokenType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TokenType forNumber(int value) {
    switch (value) {
      case 0:
        return TOKEN_TYPE_UNSPECIFIED;
      case 1:
        return TOKEN_TYPE_OIDC;
      case 2:
        return TOKEN_TYPE_PKI;
      case 3:
        return TOKEN_TYPE_LIMITED_AWS;
      case 4:
        return TOKEN_TYPE_AWS_PRINCIPALTAGS;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TokenType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<TokenType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<TokenType>() {
        public TokenType findValueByNumber(int number) {
          return TokenType.forNumber(number);
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
    return com.google.cloud.confidentialcomputing.v1.ServiceProto.getDescriptor()
        .getEnumTypes()
        .get(1);
  }

  private static final TokenType[] VALUES = values();

  public static TokenType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TokenType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.confidentialcomputing.v1.TokenType)
}
