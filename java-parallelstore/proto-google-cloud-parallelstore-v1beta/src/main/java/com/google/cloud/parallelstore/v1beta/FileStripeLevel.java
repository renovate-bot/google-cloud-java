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
// source: google/cloud/parallelstore/v1beta/parallelstore.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.parallelstore.v1beta;

/**
 *
 *
 * <pre>
 * Represents the striping options for files.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.parallelstore.v1beta.FileStripeLevel}
 */
public enum FileStripeLevel implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * If not set, FileStripeLevel will default to FILE_STRIPE_LEVEL_BALANCED
   * </pre>
   *
   * <code>FILE_STRIPE_LEVEL_UNSPECIFIED = 0;</code>
   */
  FILE_STRIPE_LEVEL_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Minimum file striping
   * </pre>
   *
   * <code>FILE_STRIPE_LEVEL_MIN = 1;</code>
   */
  FILE_STRIPE_LEVEL_MIN(1),
  /**
   *
   *
   * <pre>
   * Medium file striping
   * </pre>
   *
   * <code>FILE_STRIPE_LEVEL_BALANCED = 2;</code>
   */
  FILE_STRIPE_LEVEL_BALANCED(2),
  /**
   *
   *
   * <pre>
   * Maximum file striping
   * </pre>
   *
   * <code>FILE_STRIPE_LEVEL_MAX = 3;</code>
   */
  FILE_STRIPE_LEVEL_MAX(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * If not set, FileStripeLevel will default to FILE_STRIPE_LEVEL_BALANCED
   * </pre>
   *
   * <code>FILE_STRIPE_LEVEL_UNSPECIFIED = 0;</code>
   */
  public static final int FILE_STRIPE_LEVEL_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Minimum file striping
   * </pre>
   *
   * <code>FILE_STRIPE_LEVEL_MIN = 1;</code>
   */
  public static final int FILE_STRIPE_LEVEL_MIN_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Medium file striping
   * </pre>
   *
   * <code>FILE_STRIPE_LEVEL_BALANCED = 2;</code>
   */
  public static final int FILE_STRIPE_LEVEL_BALANCED_VALUE = 2;

  /**
   *
   *
   * <pre>
   * Maximum file striping
   * </pre>
   *
   * <code>FILE_STRIPE_LEVEL_MAX = 3;</code>
   */
  public static final int FILE_STRIPE_LEVEL_MAX_VALUE = 3;

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
  public static FileStripeLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FileStripeLevel forNumber(int value) {
    switch (value) {
      case 0:
        return FILE_STRIPE_LEVEL_UNSPECIFIED;
      case 1:
        return FILE_STRIPE_LEVEL_MIN;
      case 2:
        return FILE_STRIPE_LEVEL_BALANCED;
      case 3:
        return FILE_STRIPE_LEVEL_MAX;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FileStripeLevel> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<FileStripeLevel> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<FileStripeLevel>() {
        public FileStripeLevel findValueByNumber(int number) {
          return FileStripeLevel.forNumber(number);
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
    return com.google.cloud.parallelstore.v1beta.ParallelstoreProto.getDescriptor()
        .getEnumTypes()
        .get(1);
  }

  private static final FileStripeLevel[] VALUES = values();

  public static FileStripeLevel valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private FileStripeLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.parallelstore.v1beta.FileStripeLevel)
}
