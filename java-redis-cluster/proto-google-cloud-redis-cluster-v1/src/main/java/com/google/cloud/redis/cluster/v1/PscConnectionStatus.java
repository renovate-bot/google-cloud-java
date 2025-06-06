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
// source: google/cloud/redis/cluster/v1/cloud_redis_cluster.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.redis.cluster.v1;

/**
 *
 *
 * <pre>
 * Status of the PSC connection.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.redis.cluster.v1.PscConnectionStatus}
 */
public enum PscConnectionStatus implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * PSC connection status is not specified.
   * </pre>
   *
   * <code>PSC_CONNECTION_STATUS_UNSPECIFIED = 0;</code>
   */
  PSC_CONNECTION_STATUS_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The connection is active
   * </pre>
   *
   * <code>PSC_CONNECTION_STATUS_ACTIVE = 1;</code>
   */
  PSC_CONNECTION_STATUS_ACTIVE(1),
  /**
   *
   *
   * <pre>
   * Connection not found
   * </pre>
   *
   * <code>PSC_CONNECTION_STATUS_NOT_FOUND = 2;</code>
   */
  PSC_CONNECTION_STATUS_NOT_FOUND(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * PSC connection status is not specified.
   * </pre>
   *
   * <code>PSC_CONNECTION_STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int PSC_CONNECTION_STATUS_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * The connection is active
   * </pre>
   *
   * <code>PSC_CONNECTION_STATUS_ACTIVE = 1;</code>
   */
  public static final int PSC_CONNECTION_STATUS_ACTIVE_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Connection not found
   * </pre>
   *
   * <code>PSC_CONNECTION_STATUS_NOT_FOUND = 2;</code>
   */
  public static final int PSC_CONNECTION_STATUS_NOT_FOUND_VALUE = 2;

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
  public static PscConnectionStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PscConnectionStatus forNumber(int value) {
    switch (value) {
      case 0:
        return PSC_CONNECTION_STATUS_UNSPECIFIED;
      case 1:
        return PSC_CONNECTION_STATUS_ACTIVE;
      case 2:
        return PSC_CONNECTION_STATUS_NOT_FOUND;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PscConnectionStatus>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<PscConnectionStatus>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PscConnectionStatus>() {
            public PscConnectionStatus findValueByNumber(int number) {
              return PscConnectionStatus.forNumber(number);
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
    return com.google.cloud.redis.cluster.v1.CloudRedisClusterProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final PscConnectionStatus[] VALUES = values();

  public static PscConnectionStatus valueOf(
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

  private PscConnectionStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.redis.cluster.v1.PscConnectionStatus)
}
