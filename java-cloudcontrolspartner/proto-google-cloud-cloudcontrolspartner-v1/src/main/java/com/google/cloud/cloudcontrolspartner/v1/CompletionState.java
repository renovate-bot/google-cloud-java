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
// source: google/cloud/cloudcontrolspartner/v1/completion_state.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.cloudcontrolspartner.v1;

/**
 *
 *
 * <pre>
 * Enum for possible completion states.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.cloudcontrolspartner.v1.CompletionState}
 */
public enum CompletionState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified completion state.
   * </pre>
   *
   * <code>COMPLETION_STATE_UNSPECIFIED = 0;</code>
   */
  COMPLETION_STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Task started (has start date) but not yet completed.
   * </pre>
   *
   * <code>PENDING = 1;</code>
   */
  PENDING(1),
  /**
   *
   *
   * <pre>
   * Succeeded state.
   * </pre>
   *
   * <code>SUCCEEDED = 2;</code>
   */
  SUCCEEDED(2),
  /**
   *
   *
   * <pre>
   * Failed state.
   * </pre>
   *
   * <code>FAILED = 3;</code>
   */
  FAILED(3),
  /**
   *
   *
   * <pre>
   * Not applicable state.
   * </pre>
   *
   * <code>NOT_APPLICABLE = 4;</code>
   */
  NOT_APPLICABLE(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified completion state.
   * </pre>
   *
   * <code>COMPLETION_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int COMPLETION_STATE_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Task started (has start date) but not yet completed.
   * </pre>
   *
   * <code>PENDING = 1;</code>
   */
  public static final int PENDING_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Succeeded state.
   * </pre>
   *
   * <code>SUCCEEDED = 2;</code>
   */
  public static final int SUCCEEDED_VALUE = 2;

  /**
   *
   *
   * <pre>
   * Failed state.
   * </pre>
   *
   * <code>FAILED = 3;</code>
   */
  public static final int FAILED_VALUE = 3;

  /**
   *
   *
   * <pre>
   * Not applicable state.
   * </pre>
   *
   * <code>NOT_APPLICABLE = 4;</code>
   */
  public static final int NOT_APPLICABLE_VALUE = 4;

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
  public static CompletionState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CompletionState forNumber(int value) {
    switch (value) {
      case 0:
        return COMPLETION_STATE_UNSPECIFIED;
      case 1:
        return PENDING;
      case 2:
        return SUCCEEDED;
      case 3:
        return FAILED;
      case 4:
        return NOT_APPLICABLE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CompletionState> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<CompletionState> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<CompletionState>() {
        public CompletionState findValueByNumber(int number) {
          return CompletionState.forNumber(number);
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
    return com.google.cloud.cloudcontrolspartner.v1.CompletionStateProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final CompletionState[] VALUES = values();

  public static CompletionState valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private CompletionState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.cloudcontrolspartner.v1.CompletionState)
}
