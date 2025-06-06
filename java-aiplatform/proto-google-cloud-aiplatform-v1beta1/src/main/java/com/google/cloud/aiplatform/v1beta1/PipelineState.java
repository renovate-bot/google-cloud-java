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
// source: google/cloud/aiplatform/v1beta1/pipeline_state.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Describes the state of a pipeline.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.aiplatform.v1beta1.PipelineState}
 */
public enum PipelineState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The pipeline state is unspecified.
   * </pre>
   *
   * <code>PIPELINE_STATE_UNSPECIFIED = 0;</code>
   */
  PIPELINE_STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The pipeline has been created or resumed, and processing has not yet
   * begun.
   * </pre>
   *
   * <code>PIPELINE_STATE_QUEUED = 1;</code>
   */
  PIPELINE_STATE_QUEUED(1),
  /**
   *
   *
   * <pre>
   * The service is preparing to run the pipeline.
   * </pre>
   *
   * <code>PIPELINE_STATE_PENDING = 2;</code>
   */
  PIPELINE_STATE_PENDING(2),
  /**
   *
   *
   * <pre>
   * The pipeline is in progress.
   * </pre>
   *
   * <code>PIPELINE_STATE_RUNNING = 3;</code>
   */
  PIPELINE_STATE_RUNNING(3),
  /**
   *
   *
   * <pre>
   * The pipeline completed successfully.
   * </pre>
   *
   * <code>PIPELINE_STATE_SUCCEEDED = 4;</code>
   */
  PIPELINE_STATE_SUCCEEDED(4),
  /**
   *
   *
   * <pre>
   * The pipeline failed.
   * </pre>
   *
   * <code>PIPELINE_STATE_FAILED = 5;</code>
   */
  PIPELINE_STATE_FAILED(5),
  /**
   *
   *
   * <pre>
   * The pipeline is being cancelled. From this state, the pipeline may only go
   * to either PIPELINE_STATE_SUCCEEDED, PIPELINE_STATE_FAILED or
   * PIPELINE_STATE_CANCELLED.
   * </pre>
   *
   * <code>PIPELINE_STATE_CANCELLING = 6;</code>
   */
  PIPELINE_STATE_CANCELLING(6),
  /**
   *
   *
   * <pre>
   * The pipeline has been cancelled.
   * </pre>
   *
   * <code>PIPELINE_STATE_CANCELLED = 7;</code>
   */
  PIPELINE_STATE_CANCELLED(7),
  /**
   *
   *
   * <pre>
   * The pipeline has been stopped, and can be resumed.
   * </pre>
   *
   * <code>PIPELINE_STATE_PAUSED = 8;</code>
   */
  PIPELINE_STATE_PAUSED(8),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The pipeline state is unspecified.
   * </pre>
   *
   * <code>PIPELINE_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int PIPELINE_STATE_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * The pipeline has been created or resumed, and processing has not yet
   * begun.
   * </pre>
   *
   * <code>PIPELINE_STATE_QUEUED = 1;</code>
   */
  public static final int PIPELINE_STATE_QUEUED_VALUE = 1;

  /**
   *
   *
   * <pre>
   * The service is preparing to run the pipeline.
   * </pre>
   *
   * <code>PIPELINE_STATE_PENDING = 2;</code>
   */
  public static final int PIPELINE_STATE_PENDING_VALUE = 2;

  /**
   *
   *
   * <pre>
   * The pipeline is in progress.
   * </pre>
   *
   * <code>PIPELINE_STATE_RUNNING = 3;</code>
   */
  public static final int PIPELINE_STATE_RUNNING_VALUE = 3;

  /**
   *
   *
   * <pre>
   * The pipeline completed successfully.
   * </pre>
   *
   * <code>PIPELINE_STATE_SUCCEEDED = 4;</code>
   */
  public static final int PIPELINE_STATE_SUCCEEDED_VALUE = 4;

  /**
   *
   *
   * <pre>
   * The pipeline failed.
   * </pre>
   *
   * <code>PIPELINE_STATE_FAILED = 5;</code>
   */
  public static final int PIPELINE_STATE_FAILED_VALUE = 5;

  /**
   *
   *
   * <pre>
   * The pipeline is being cancelled. From this state, the pipeline may only go
   * to either PIPELINE_STATE_SUCCEEDED, PIPELINE_STATE_FAILED or
   * PIPELINE_STATE_CANCELLED.
   * </pre>
   *
   * <code>PIPELINE_STATE_CANCELLING = 6;</code>
   */
  public static final int PIPELINE_STATE_CANCELLING_VALUE = 6;

  /**
   *
   *
   * <pre>
   * The pipeline has been cancelled.
   * </pre>
   *
   * <code>PIPELINE_STATE_CANCELLED = 7;</code>
   */
  public static final int PIPELINE_STATE_CANCELLED_VALUE = 7;

  /**
   *
   *
   * <pre>
   * The pipeline has been stopped, and can be resumed.
   * </pre>
   *
   * <code>PIPELINE_STATE_PAUSED = 8;</code>
   */
  public static final int PIPELINE_STATE_PAUSED_VALUE = 8;

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
  public static PipelineState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PipelineState forNumber(int value) {
    switch (value) {
      case 0:
        return PIPELINE_STATE_UNSPECIFIED;
      case 1:
        return PIPELINE_STATE_QUEUED;
      case 2:
        return PIPELINE_STATE_PENDING;
      case 3:
        return PIPELINE_STATE_RUNNING;
      case 4:
        return PIPELINE_STATE_SUCCEEDED;
      case 5:
        return PIPELINE_STATE_FAILED;
      case 6:
        return PIPELINE_STATE_CANCELLING;
      case 7:
        return PIPELINE_STATE_CANCELLED;
      case 8:
        return PIPELINE_STATE_PAUSED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PipelineState> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<PipelineState> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<PipelineState>() {
        public PipelineState findValueByNumber(int number) {
          return PipelineState.forNumber(number);
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
    return com.google.cloud.aiplatform.v1beta1.PipelineStateProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final PipelineState[] VALUES = values();

  public static PipelineState valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PipelineState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1beta1.PipelineState)
}
