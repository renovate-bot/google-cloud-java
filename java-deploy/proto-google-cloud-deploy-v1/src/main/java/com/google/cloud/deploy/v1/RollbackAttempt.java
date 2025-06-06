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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * RollbackAttempt represents an action of rolling back a Cloud Deploy 'Target'.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.RollbackAttempt}
 */
public final class RollbackAttempt extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.RollbackAttempt)
    RollbackAttemptOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use RollbackAttempt.newBuilder() to construct.
  private RollbackAttempt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RollbackAttempt() {
    destinationPhase_ = "";
    rolloutId_ = "";
    state_ = 0;
    stateDesc_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RollbackAttempt();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_RollbackAttempt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_RollbackAttempt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.RollbackAttempt.class,
            com.google.cloud.deploy.v1.RollbackAttempt.Builder.class);
  }

  public static final int DESTINATION_PHASE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object destinationPhase_ = "";

  /**
   *
   *
   * <pre>
   * Output only. The phase to which the rollout will be rolled back to.
   * </pre>
   *
   * <code>string destination_phase = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The destinationPhase.
   */
  @java.lang.Override
  public java.lang.String getDestinationPhase() {
    java.lang.Object ref = destinationPhase_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destinationPhase_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Output only. The phase to which the rollout will be rolled back to.
   * </pre>
   *
   * <code>string destination_phase = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for destinationPhase.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDestinationPhaseBytes() {
    java.lang.Object ref = destinationPhase_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      destinationPhase_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROLLOUT_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object rolloutId_ = "";

  /**
   *
   *
   * <pre>
   * Output only. ID of the rollback `Rollout` to create.
   * </pre>
   *
   * <code>string rollout_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The rolloutId.
   */
  @java.lang.Override
  public java.lang.String getRolloutId() {
    java.lang.Object ref = rolloutId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rolloutId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Output only. ID of the rollback `Rollout` to create.
   * </pre>
   *
   * <code>string rollout_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for rolloutId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRolloutIdBytes() {
    java.lang.Object ref = rolloutId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      rolloutId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATE_FIELD_NUMBER = 3;
  private int state_ = 0;

  /**
   *
   *
   * <pre>
   * Output only. Valid state of this rollback action.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.RepairState state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override
  public int getStateValue() {
    return state_;
  }

  /**
   *
   *
   * <pre>
   * Output only. Valid state of this rollback action.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.RepairState state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.RepairState getState() {
    com.google.cloud.deploy.v1.RepairState result =
        com.google.cloud.deploy.v1.RepairState.forNumber(state_);
    return result == null ? com.google.cloud.deploy.v1.RepairState.UNRECOGNIZED : result;
  }

  public static final int STATE_DESC_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object stateDesc_ = "";

  /**
   *
   *
   * <pre>
   * Output only. Description of the state of the Rollback.
   * </pre>
   *
   * <code>string state_desc = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The stateDesc.
   */
  @java.lang.Override
  public java.lang.String getStateDesc() {
    java.lang.Object ref = stateDesc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stateDesc_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Output only. Description of the state of the Rollback.
   * </pre>
   *
   * <code>string state_desc = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for stateDesc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getStateDescBytes() {
    java.lang.Object ref = stateDesc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      stateDesc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISABLE_ROLLBACK_IF_ROLLOUT_PENDING_FIELD_NUMBER = 5;
  private boolean disableRollbackIfRolloutPending_ = false;

  /**
   *
   *
   * <pre>
   * Output only. If active rollout exists on the target, abort this rollback.
   * </pre>
   *
   * <code>
   * bool disable_rollback_if_rollout_pending = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The disableRollbackIfRolloutPending.
   */
  @java.lang.Override
  public boolean getDisableRollbackIfRolloutPending() {
    return disableRollbackIfRolloutPending_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationPhase_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, destinationPhase_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rolloutId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, rolloutId_);
    }
    if (state_ != com.google.cloud.deploy.v1.RepairState.REPAIR_STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, state_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stateDesc_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, stateDesc_);
    }
    if (disableRollbackIfRolloutPending_ != false) {
      output.writeBool(5, disableRollbackIfRolloutPending_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationPhase_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, destinationPhase_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rolloutId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, rolloutId_);
    }
    if (state_ != com.google.cloud.deploy.v1.RepairState.REPAIR_STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, state_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stateDesc_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, stateDesc_);
    }
    if (disableRollbackIfRolloutPending_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              5, disableRollbackIfRolloutPending_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.deploy.v1.RollbackAttempt)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.RollbackAttempt other =
        (com.google.cloud.deploy.v1.RollbackAttempt) obj;

    if (!getDestinationPhase().equals(other.getDestinationPhase())) return false;
    if (!getRolloutId().equals(other.getRolloutId())) return false;
    if (state_ != other.state_) return false;
    if (!getStateDesc().equals(other.getStateDesc())) return false;
    if (getDisableRollbackIfRolloutPending() != other.getDisableRollbackIfRolloutPending())
      return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DESTINATION_PHASE_FIELD_NUMBER;
    hash = (53 * hash) + getDestinationPhase().hashCode();
    hash = (37 * hash) + ROLLOUT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRolloutId().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (37 * hash) + STATE_DESC_FIELD_NUMBER;
    hash = (53 * hash) + getStateDesc().hashCode();
    hash = (37 * hash) + DISABLE_ROLLBACK_IF_ROLLOUT_PENDING_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashBoolean(getDisableRollbackIfRolloutPending());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.RollbackAttempt parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.RollbackAttempt parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.RollbackAttempt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.RollbackAttempt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.RollbackAttempt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.RollbackAttempt parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.RollbackAttempt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.RollbackAttempt parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.RollbackAttempt parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.RollbackAttempt parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.RollbackAttempt parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.RollbackAttempt parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.deploy.v1.RollbackAttempt prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   *
   *
   * <pre>
   * RollbackAttempt represents an action of rolling back a Cloud Deploy 'Target'.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.RollbackAttempt}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.RollbackAttempt)
      com.google.cloud.deploy.v1.RollbackAttemptOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_RollbackAttempt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_RollbackAttempt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.RollbackAttempt.class,
              com.google.cloud.deploy.v1.RollbackAttempt.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.RollbackAttempt.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      destinationPhase_ = "";
      rolloutId_ = "";
      state_ = 0;
      stateDesc_ = "";
      disableRollbackIfRolloutPending_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_RollbackAttempt_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.RollbackAttempt getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.RollbackAttempt.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.RollbackAttempt build() {
      com.google.cloud.deploy.v1.RollbackAttempt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.RollbackAttempt buildPartial() {
      com.google.cloud.deploy.v1.RollbackAttempt result =
          new com.google.cloud.deploy.v1.RollbackAttempt(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.deploy.v1.RollbackAttempt result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.destinationPhase_ = destinationPhase_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rolloutId_ = rolloutId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.state_ = state_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.stateDesc_ = stateDesc_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.disableRollbackIfRolloutPending_ = disableRollbackIfRolloutPending_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.deploy.v1.RollbackAttempt) {
        return mergeFrom((com.google.cloud.deploy.v1.RollbackAttempt) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.RollbackAttempt other) {
      if (other == com.google.cloud.deploy.v1.RollbackAttempt.getDefaultInstance()) return this;
      if (!other.getDestinationPhase().isEmpty()) {
        destinationPhase_ = other.destinationPhase_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRolloutId().isEmpty()) {
        rolloutId_ = other.rolloutId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (!other.getStateDesc().isEmpty()) {
        stateDesc_ = other.stateDesc_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getDisableRollbackIfRolloutPending() != false) {
        setDisableRollbackIfRolloutPending(other.getDisableRollbackIfRolloutPending());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                destinationPhase_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                rolloutId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                state_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 34:
              {
                stateDesc_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
            case 40:
              {
                disableRollbackIfRolloutPending_ = input.readBool();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object destinationPhase_ = "";

    /**
     *
     *
     * <pre>
     * Output only. The phase to which the rollout will be rolled back to.
     * </pre>
     *
     * <code>string destination_phase = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The destinationPhase.
     */
    public java.lang.String getDestinationPhase() {
      java.lang.Object ref = destinationPhase_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destinationPhase_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. The phase to which the rollout will be rolled back to.
     * </pre>
     *
     * <code>string destination_phase = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for destinationPhase.
     */
    public com.google.protobuf.ByteString getDestinationPhaseBytes() {
      java.lang.Object ref = destinationPhase_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        destinationPhase_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. The phase to which the rollout will be rolled back to.
     * </pre>
     *
     * <code>string destination_phase = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The destinationPhase to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationPhase(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      destinationPhase_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. The phase to which the rollout will be rolled back to.
     * </pre>
     *
     * <code>string destination_phase = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDestinationPhase() {
      destinationPhase_ = getDefaultInstance().getDestinationPhase();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. The phase to which the rollout will be rolled back to.
     * </pre>
     *
     * <code>string destination_phase = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for destinationPhase to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationPhaseBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      destinationPhase_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object rolloutId_ = "";

    /**
     *
     *
     * <pre>
     * Output only. ID of the rollback `Rollout` to create.
     * </pre>
     *
     * <code>string rollout_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The rolloutId.
     */
    public java.lang.String getRolloutId() {
      java.lang.Object ref = rolloutId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rolloutId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. ID of the rollback `Rollout` to create.
     * </pre>
     *
     * <code>string rollout_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for rolloutId.
     */
    public com.google.protobuf.ByteString getRolloutIdBytes() {
      java.lang.Object ref = rolloutId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        rolloutId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. ID of the rollback `Rollout` to create.
     * </pre>
     *
     * <code>string rollout_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The rolloutId to set.
     * @return This builder for chaining.
     */
    public Builder setRolloutId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      rolloutId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. ID of the rollback `Rollout` to create.
     * </pre>
     *
     * <code>string rollout_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRolloutId() {
      rolloutId_ = getDefaultInstance().getRolloutId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. ID of the rollback `Rollout` to create.
     * </pre>
     *
     * <code>string rollout_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for rolloutId to set.
     * @return This builder for chaining.
     */
    public Builder setRolloutIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      rolloutId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int state_ = 0;

    /**
     *
     *
     * <pre>
     * Output only. Valid state of this rollback action.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.RepairState state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override
    public int getStateValue() {
      return state_;
    }

    /**
     *
     *
     * <pre>
     * Output only. Valid state of this rollback action.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.RepairState state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Valid state of this rollback action.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.RepairState state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The state.
     */
    @java.lang.Override
    public com.google.cloud.deploy.v1.RepairState getState() {
      com.google.cloud.deploy.v1.RepairState result =
          com.google.cloud.deploy.v1.RepairState.forNumber(state_);
      return result == null ? com.google.cloud.deploy.v1.RepairState.UNRECOGNIZED : result;
    }

    /**
     *
     *
     * <pre>
     * Output only. Valid state of this rollback action.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.RepairState state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.cloud.deploy.v1.RepairState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      state_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Valid state of this rollback action.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.RepairState state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000004);
      state_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object stateDesc_ = "";

    /**
     *
     *
     * <pre>
     * Output only. Description of the state of the Rollback.
     * </pre>
     *
     * <code>string state_desc = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The stateDesc.
     */
    public java.lang.String getStateDesc() {
      java.lang.Object ref = stateDesc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stateDesc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Description of the state of the Rollback.
     * </pre>
     *
     * <code>string state_desc = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for stateDesc.
     */
    public com.google.protobuf.ByteString getStateDescBytes() {
      java.lang.Object ref = stateDesc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        stateDesc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Description of the state of the Rollback.
     * </pre>
     *
     * <code>string state_desc = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The stateDesc to set.
     * @return This builder for chaining.
     */
    public Builder setStateDesc(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      stateDesc_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Description of the state of the Rollback.
     * </pre>
     *
     * <code>string state_desc = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStateDesc() {
      stateDesc_ = getDefaultInstance().getStateDesc();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Description of the state of the Rollback.
     * </pre>
     *
     * <code>string state_desc = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for stateDesc to set.
     * @return This builder for chaining.
     */
    public Builder setStateDescBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      stateDesc_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private boolean disableRollbackIfRolloutPending_;

    /**
     *
     *
     * <pre>
     * Output only. If active rollout exists on the target, abort this rollback.
     * </pre>
     *
     * <code>
     * bool disable_rollback_if_rollout_pending = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The disableRollbackIfRolloutPending.
     */
    @java.lang.Override
    public boolean getDisableRollbackIfRolloutPending() {
      return disableRollbackIfRolloutPending_;
    }

    /**
     *
     *
     * <pre>
     * Output only. If active rollout exists on the target, abort this rollback.
     * </pre>
     *
     * <code>
     * bool disable_rollback_if_rollout_pending = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The disableRollbackIfRolloutPending to set.
     * @return This builder for chaining.
     */
    public Builder setDisableRollbackIfRolloutPending(boolean value) {

      disableRollbackIfRolloutPending_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. If active rollout exists on the target, abort this rollback.
     * </pre>
     *
     * <code>
     * bool disable_rollback_if_rollout_pending = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisableRollbackIfRolloutPending() {
      bitField0_ = (bitField0_ & ~0x00000010);
      disableRollbackIfRolloutPending_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.RollbackAttempt)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.RollbackAttempt)
  private static final com.google.cloud.deploy.v1.RollbackAttempt DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.RollbackAttempt();
  }

  public static com.google.cloud.deploy.v1.RollbackAttempt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RollbackAttempt> PARSER =
      new com.google.protobuf.AbstractParser<RollbackAttempt>() {
        @java.lang.Override
        public RollbackAttempt parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<RollbackAttempt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RollbackAttempt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.RollbackAttempt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
