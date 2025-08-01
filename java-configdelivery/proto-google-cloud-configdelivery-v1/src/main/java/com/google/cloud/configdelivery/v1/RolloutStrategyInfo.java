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
// source: google/cloud/configdelivery/v1/config_delivery.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.configdelivery.v1;

/**
 *
 *
 * <pre>
 * RolloutStrategyInfo represents the status of execution of different types of
 * rollout strategies. Only the field corresponding to the rollout strategy
 * specified at the rollout resource will be populated.
 * </pre>
 *
 * Protobuf type {@code google.cloud.configdelivery.v1.RolloutStrategyInfo}
 */
public final class RolloutStrategyInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.configdelivery.v1.RolloutStrategyInfo)
    RolloutStrategyInfoOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use RolloutStrategyInfo.newBuilder() to construct.
  private RolloutStrategyInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RolloutStrategyInfo() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RolloutStrategyInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.configdelivery.v1.ConfigDeliveryProto
        .internal_static_google_cloud_configdelivery_v1_RolloutStrategyInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.configdelivery.v1.ConfigDeliveryProto
        .internal_static_google_cloud_configdelivery_v1_RolloutStrategyInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.configdelivery.v1.RolloutStrategyInfo.class,
            com.google.cloud.configdelivery.v1.RolloutStrategyInfo.Builder.class);
  }

  private int strategyCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object strategy_;

  public enum StrategyCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ALL_AT_ONCE_STRATEGY_INFO(1),
    ROLLING_STRATEGY_INFO(2),
    STRATEGY_NOT_SET(0);
    private final int value;

    private StrategyCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StrategyCase valueOf(int value) {
      return forNumber(value);
    }

    public static StrategyCase forNumber(int value) {
      switch (value) {
        case 1:
          return ALL_AT_ONCE_STRATEGY_INFO;
        case 2:
          return ROLLING_STRATEGY_INFO;
        case 0:
          return STRATEGY_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public StrategyCase getStrategyCase() {
    return StrategyCase.forNumber(strategyCase_);
  }

  public static final int ALL_AT_ONCE_STRATEGY_INFO_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * AllAtOnceStrategyInfo represents the status of AllAtOnce rollout strategy
   * execution.
   * </pre>
   *
   * <code>.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo all_at_once_strategy_info = 1;
   * </code>
   *
   * @return Whether the allAtOnceStrategyInfo field is set.
   */
  @java.lang.Override
  public boolean hasAllAtOnceStrategyInfo() {
    return strategyCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * AllAtOnceStrategyInfo represents the status of AllAtOnce rollout strategy
   * execution.
   * </pre>
   *
   * <code>.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo all_at_once_strategy_info = 1;
   * </code>
   *
   * @return The allAtOnceStrategyInfo.
   */
  @java.lang.Override
  public com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo getAllAtOnceStrategyInfo() {
    if (strategyCase_ == 1) {
      return (com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo) strategy_;
    }
    return com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * AllAtOnceStrategyInfo represents the status of AllAtOnce rollout strategy
   * execution.
   * </pre>
   *
   * <code>.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo all_at_once_strategy_info = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfoOrBuilder
      getAllAtOnceStrategyInfoOrBuilder() {
    if (strategyCase_ == 1) {
      return (com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo) strategy_;
    }
    return com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo.getDefaultInstance();
  }

  public static final int ROLLING_STRATEGY_INFO_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * RollingStrategyInfo represents the status of Rolling rollout strategy
   * execution.
   * </pre>
   *
   * <code>.google.cloud.configdelivery.v1.RollingStrategyInfo rolling_strategy_info = 2;</code>
   *
   * @return Whether the rollingStrategyInfo field is set.
   */
  @java.lang.Override
  public boolean hasRollingStrategyInfo() {
    return strategyCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * RollingStrategyInfo represents the status of Rolling rollout strategy
   * execution.
   * </pre>
   *
   * <code>.google.cloud.configdelivery.v1.RollingStrategyInfo rolling_strategy_info = 2;</code>
   *
   * @return The rollingStrategyInfo.
   */
  @java.lang.Override
  public com.google.cloud.configdelivery.v1.RollingStrategyInfo getRollingStrategyInfo() {
    if (strategyCase_ == 2) {
      return (com.google.cloud.configdelivery.v1.RollingStrategyInfo) strategy_;
    }
    return com.google.cloud.configdelivery.v1.RollingStrategyInfo.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * RollingStrategyInfo represents the status of Rolling rollout strategy
   * execution.
   * </pre>
   *
   * <code>.google.cloud.configdelivery.v1.RollingStrategyInfo rolling_strategy_info = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.configdelivery.v1.RollingStrategyInfoOrBuilder
      getRollingStrategyInfoOrBuilder() {
    if (strategyCase_ == 2) {
      return (com.google.cloud.configdelivery.v1.RollingStrategyInfo) strategy_;
    }
    return com.google.cloud.configdelivery.v1.RollingStrategyInfo.getDefaultInstance();
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
    if (strategyCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo) strategy_);
    }
    if (strategyCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.configdelivery.v1.RollingStrategyInfo) strategy_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (strategyCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo) strategy_);
    }
    if (strategyCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.configdelivery.v1.RollingStrategyInfo) strategy_);
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
    if (!(obj instanceof com.google.cloud.configdelivery.v1.RolloutStrategyInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.configdelivery.v1.RolloutStrategyInfo other =
        (com.google.cloud.configdelivery.v1.RolloutStrategyInfo) obj;

    if (!getStrategyCase().equals(other.getStrategyCase())) return false;
    switch (strategyCase_) {
      case 1:
        if (!getAllAtOnceStrategyInfo().equals(other.getAllAtOnceStrategyInfo())) return false;
        break;
      case 2:
        if (!getRollingStrategyInfo().equals(other.getRollingStrategyInfo())) return false;
        break;
      case 0:
      default:
    }
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
    switch (strategyCase_) {
      case 1:
        hash = (37 * hash) + ALL_AT_ONCE_STRATEGY_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getAllAtOnceStrategyInfo().hashCode();
        break;
      case 2:
        hash = (37 * hash) + ROLLING_STRATEGY_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getRollingStrategyInfo().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.configdelivery.v1.RolloutStrategyInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.configdelivery.v1.RolloutStrategyInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.configdelivery.v1.RolloutStrategyInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.configdelivery.v1.RolloutStrategyInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.configdelivery.v1.RolloutStrategyInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.configdelivery.v1.RolloutStrategyInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.configdelivery.v1.RolloutStrategyInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.configdelivery.v1.RolloutStrategyInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.configdelivery.v1.RolloutStrategyInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.configdelivery.v1.RolloutStrategyInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.configdelivery.v1.RolloutStrategyInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.configdelivery.v1.RolloutStrategyInfo parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.configdelivery.v1.RolloutStrategyInfo prototype) {
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
   * RolloutStrategyInfo represents the status of execution of different types of
   * rollout strategies. Only the field corresponding to the rollout strategy
   * specified at the rollout resource will be populated.
   * </pre>
   *
   * Protobuf type {@code google.cloud.configdelivery.v1.RolloutStrategyInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.configdelivery.v1.RolloutStrategyInfo)
      com.google.cloud.configdelivery.v1.RolloutStrategyInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.configdelivery.v1.ConfigDeliveryProto
          .internal_static_google_cloud_configdelivery_v1_RolloutStrategyInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.configdelivery.v1.ConfigDeliveryProto
          .internal_static_google_cloud_configdelivery_v1_RolloutStrategyInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.configdelivery.v1.RolloutStrategyInfo.class,
              com.google.cloud.configdelivery.v1.RolloutStrategyInfo.Builder.class);
    }

    // Construct using com.google.cloud.configdelivery.v1.RolloutStrategyInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (allAtOnceStrategyInfoBuilder_ != null) {
        allAtOnceStrategyInfoBuilder_.clear();
      }
      if (rollingStrategyInfoBuilder_ != null) {
        rollingStrategyInfoBuilder_.clear();
      }
      strategyCase_ = 0;
      strategy_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.configdelivery.v1.ConfigDeliveryProto
          .internal_static_google_cloud_configdelivery_v1_RolloutStrategyInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.configdelivery.v1.RolloutStrategyInfo getDefaultInstanceForType() {
      return com.google.cloud.configdelivery.v1.RolloutStrategyInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.configdelivery.v1.RolloutStrategyInfo build() {
      com.google.cloud.configdelivery.v1.RolloutStrategyInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.configdelivery.v1.RolloutStrategyInfo buildPartial() {
      com.google.cloud.configdelivery.v1.RolloutStrategyInfo result =
          new com.google.cloud.configdelivery.v1.RolloutStrategyInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.configdelivery.v1.RolloutStrategyInfo result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.configdelivery.v1.RolloutStrategyInfo result) {
      result.strategyCase_ = strategyCase_;
      result.strategy_ = this.strategy_;
      if (strategyCase_ == 1 && allAtOnceStrategyInfoBuilder_ != null) {
        result.strategy_ = allAtOnceStrategyInfoBuilder_.build();
      }
      if (strategyCase_ == 2 && rollingStrategyInfoBuilder_ != null) {
        result.strategy_ = rollingStrategyInfoBuilder_.build();
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
      if (other instanceof com.google.cloud.configdelivery.v1.RolloutStrategyInfo) {
        return mergeFrom((com.google.cloud.configdelivery.v1.RolloutStrategyInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.configdelivery.v1.RolloutStrategyInfo other) {
      if (other == com.google.cloud.configdelivery.v1.RolloutStrategyInfo.getDefaultInstance())
        return this;
      switch (other.getStrategyCase()) {
        case ALL_AT_ONCE_STRATEGY_INFO:
          {
            mergeAllAtOnceStrategyInfo(other.getAllAtOnceStrategyInfo());
            break;
          }
        case ROLLING_STRATEGY_INFO:
          {
            mergeRollingStrategyInfo(other.getRollingStrategyInfo());
            break;
          }
        case STRATEGY_NOT_SET:
          {
            break;
          }
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
                input.readMessage(
                    getAllAtOnceStrategyInfoFieldBuilder().getBuilder(), extensionRegistry);
                strategyCase_ = 1;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getRollingStrategyInfoFieldBuilder().getBuilder(), extensionRegistry);
                strategyCase_ = 2;
                break;
              } // case 18
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

    private int strategyCase_ = 0;
    private java.lang.Object strategy_;

    public StrategyCase getStrategyCase() {
      return StrategyCase.forNumber(strategyCase_);
    }

    public Builder clearStrategy() {
      strategyCase_ = 0;
      strategy_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo,
            com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo.Builder,
            com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfoOrBuilder>
        allAtOnceStrategyInfoBuilder_;

    /**
     *
     *
     * <pre>
     * AllAtOnceStrategyInfo represents the status of AllAtOnce rollout strategy
     * execution.
     * </pre>
     *
     * <code>.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo all_at_once_strategy_info = 1;
     * </code>
     *
     * @return Whether the allAtOnceStrategyInfo field is set.
     */
    @java.lang.Override
    public boolean hasAllAtOnceStrategyInfo() {
      return strategyCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * AllAtOnceStrategyInfo represents the status of AllAtOnce rollout strategy
     * execution.
     * </pre>
     *
     * <code>.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo all_at_once_strategy_info = 1;
     * </code>
     *
     * @return The allAtOnceStrategyInfo.
     */
    @java.lang.Override
    public com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo getAllAtOnceStrategyInfo() {
      if (allAtOnceStrategyInfoBuilder_ == null) {
        if (strategyCase_ == 1) {
          return (com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo) strategy_;
        }
        return com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo.getDefaultInstance();
      } else {
        if (strategyCase_ == 1) {
          return allAtOnceStrategyInfoBuilder_.getMessage();
        }
        return com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * AllAtOnceStrategyInfo represents the status of AllAtOnce rollout strategy
     * execution.
     * </pre>
     *
     * <code>.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo all_at_once_strategy_info = 1;
     * </code>
     */
    public Builder setAllAtOnceStrategyInfo(
        com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo value) {
      if (allAtOnceStrategyInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        strategy_ = value;
        onChanged();
      } else {
        allAtOnceStrategyInfoBuilder_.setMessage(value);
      }
      strategyCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * AllAtOnceStrategyInfo represents the status of AllAtOnce rollout strategy
     * execution.
     * </pre>
     *
     * <code>.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo all_at_once_strategy_info = 1;
     * </code>
     */
    public Builder setAllAtOnceStrategyInfo(
        com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo.Builder builderForValue) {
      if (allAtOnceStrategyInfoBuilder_ == null) {
        strategy_ = builderForValue.build();
        onChanged();
      } else {
        allAtOnceStrategyInfoBuilder_.setMessage(builderForValue.build());
      }
      strategyCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * AllAtOnceStrategyInfo represents the status of AllAtOnce rollout strategy
     * execution.
     * </pre>
     *
     * <code>.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo all_at_once_strategy_info = 1;
     * </code>
     */
    public Builder mergeAllAtOnceStrategyInfo(
        com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo value) {
      if (allAtOnceStrategyInfoBuilder_ == null) {
        if (strategyCase_ == 1
            && strategy_
                != com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo.getDefaultInstance()) {
          strategy_ =
              com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo.newBuilder(
                      (com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo) strategy_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          strategy_ = value;
        }
        onChanged();
      } else {
        if (strategyCase_ == 1) {
          allAtOnceStrategyInfoBuilder_.mergeFrom(value);
        } else {
          allAtOnceStrategyInfoBuilder_.setMessage(value);
        }
      }
      strategyCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * AllAtOnceStrategyInfo represents the status of AllAtOnce rollout strategy
     * execution.
     * </pre>
     *
     * <code>.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo all_at_once_strategy_info = 1;
     * </code>
     */
    public Builder clearAllAtOnceStrategyInfo() {
      if (allAtOnceStrategyInfoBuilder_ == null) {
        if (strategyCase_ == 1) {
          strategyCase_ = 0;
          strategy_ = null;
          onChanged();
        }
      } else {
        if (strategyCase_ == 1) {
          strategyCase_ = 0;
          strategy_ = null;
        }
        allAtOnceStrategyInfoBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * AllAtOnceStrategyInfo represents the status of AllAtOnce rollout strategy
     * execution.
     * </pre>
     *
     * <code>.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo all_at_once_strategy_info = 1;
     * </code>
     */
    public com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo.Builder
        getAllAtOnceStrategyInfoBuilder() {
      return getAllAtOnceStrategyInfoFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * AllAtOnceStrategyInfo represents the status of AllAtOnce rollout strategy
     * execution.
     * </pre>
     *
     * <code>.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo all_at_once_strategy_info = 1;
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfoOrBuilder
        getAllAtOnceStrategyInfoOrBuilder() {
      if ((strategyCase_ == 1) && (allAtOnceStrategyInfoBuilder_ != null)) {
        return allAtOnceStrategyInfoBuilder_.getMessageOrBuilder();
      } else {
        if (strategyCase_ == 1) {
          return (com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo) strategy_;
        }
        return com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * AllAtOnceStrategyInfo represents the status of AllAtOnce rollout strategy
     * execution.
     * </pre>
     *
     * <code>.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo all_at_once_strategy_info = 1;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo,
            com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo.Builder,
            com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfoOrBuilder>
        getAllAtOnceStrategyInfoFieldBuilder() {
      if (allAtOnceStrategyInfoBuilder_ == null) {
        if (!(strategyCase_ == 1)) {
          strategy_ = com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo.getDefaultInstance();
        }
        allAtOnceStrategyInfoBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo,
                com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo.Builder,
                com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfoOrBuilder>(
                (com.google.cloud.configdelivery.v1.AllAtOnceStrategyInfo) strategy_,
                getParentForChildren(),
                isClean());
        strategy_ = null;
      }
      strategyCase_ = 1;
      onChanged();
      return allAtOnceStrategyInfoBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.configdelivery.v1.RollingStrategyInfo,
            com.google.cloud.configdelivery.v1.RollingStrategyInfo.Builder,
            com.google.cloud.configdelivery.v1.RollingStrategyInfoOrBuilder>
        rollingStrategyInfoBuilder_;

    /**
     *
     *
     * <pre>
     * RollingStrategyInfo represents the status of Rolling rollout strategy
     * execution.
     * </pre>
     *
     * <code>.google.cloud.configdelivery.v1.RollingStrategyInfo rolling_strategy_info = 2;</code>
     *
     * @return Whether the rollingStrategyInfo field is set.
     */
    @java.lang.Override
    public boolean hasRollingStrategyInfo() {
      return strategyCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * RollingStrategyInfo represents the status of Rolling rollout strategy
     * execution.
     * </pre>
     *
     * <code>.google.cloud.configdelivery.v1.RollingStrategyInfo rolling_strategy_info = 2;</code>
     *
     * @return The rollingStrategyInfo.
     */
    @java.lang.Override
    public com.google.cloud.configdelivery.v1.RollingStrategyInfo getRollingStrategyInfo() {
      if (rollingStrategyInfoBuilder_ == null) {
        if (strategyCase_ == 2) {
          return (com.google.cloud.configdelivery.v1.RollingStrategyInfo) strategy_;
        }
        return com.google.cloud.configdelivery.v1.RollingStrategyInfo.getDefaultInstance();
      } else {
        if (strategyCase_ == 2) {
          return rollingStrategyInfoBuilder_.getMessage();
        }
        return com.google.cloud.configdelivery.v1.RollingStrategyInfo.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * RollingStrategyInfo represents the status of Rolling rollout strategy
     * execution.
     * </pre>
     *
     * <code>.google.cloud.configdelivery.v1.RollingStrategyInfo rolling_strategy_info = 2;</code>
     */
    public Builder setRollingStrategyInfo(
        com.google.cloud.configdelivery.v1.RollingStrategyInfo value) {
      if (rollingStrategyInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        strategy_ = value;
        onChanged();
      } else {
        rollingStrategyInfoBuilder_.setMessage(value);
      }
      strategyCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * RollingStrategyInfo represents the status of Rolling rollout strategy
     * execution.
     * </pre>
     *
     * <code>.google.cloud.configdelivery.v1.RollingStrategyInfo rolling_strategy_info = 2;</code>
     */
    public Builder setRollingStrategyInfo(
        com.google.cloud.configdelivery.v1.RollingStrategyInfo.Builder builderForValue) {
      if (rollingStrategyInfoBuilder_ == null) {
        strategy_ = builderForValue.build();
        onChanged();
      } else {
        rollingStrategyInfoBuilder_.setMessage(builderForValue.build());
      }
      strategyCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * RollingStrategyInfo represents the status of Rolling rollout strategy
     * execution.
     * </pre>
     *
     * <code>.google.cloud.configdelivery.v1.RollingStrategyInfo rolling_strategy_info = 2;</code>
     */
    public Builder mergeRollingStrategyInfo(
        com.google.cloud.configdelivery.v1.RollingStrategyInfo value) {
      if (rollingStrategyInfoBuilder_ == null) {
        if (strategyCase_ == 2
            && strategy_
                != com.google.cloud.configdelivery.v1.RollingStrategyInfo.getDefaultInstance()) {
          strategy_ =
              com.google.cloud.configdelivery.v1.RollingStrategyInfo.newBuilder(
                      (com.google.cloud.configdelivery.v1.RollingStrategyInfo) strategy_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          strategy_ = value;
        }
        onChanged();
      } else {
        if (strategyCase_ == 2) {
          rollingStrategyInfoBuilder_.mergeFrom(value);
        } else {
          rollingStrategyInfoBuilder_.setMessage(value);
        }
      }
      strategyCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * RollingStrategyInfo represents the status of Rolling rollout strategy
     * execution.
     * </pre>
     *
     * <code>.google.cloud.configdelivery.v1.RollingStrategyInfo rolling_strategy_info = 2;</code>
     */
    public Builder clearRollingStrategyInfo() {
      if (rollingStrategyInfoBuilder_ == null) {
        if (strategyCase_ == 2) {
          strategyCase_ = 0;
          strategy_ = null;
          onChanged();
        }
      } else {
        if (strategyCase_ == 2) {
          strategyCase_ = 0;
          strategy_ = null;
        }
        rollingStrategyInfoBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * RollingStrategyInfo represents the status of Rolling rollout strategy
     * execution.
     * </pre>
     *
     * <code>.google.cloud.configdelivery.v1.RollingStrategyInfo rolling_strategy_info = 2;</code>
     */
    public com.google.cloud.configdelivery.v1.RollingStrategyInfo.Builder
        getRollingStrategyInfoBuilder() {
      return getRollingStrategyInfoFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * RollingStrategyInfo represents the status of Rolling rollout strategy
     * execution.
     * </pre>
     *
     * <code>.google.cloud.configdelivery.v1.RollingStrategyInfo rolling_strategy_info = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.configdelivery.v1.RollingStrategyInfoOrBuilder
        getRollingStrategyInfoOrBuilder() {
      if ((strategyCase_ == 2) && (rollingStrategyInfoBuilder_ != null)) {
        return rollingStrategyInfoBuilder_.getMessageOrBuilder();
      } else {
        if (strategyCase_ == 2) {
          return (com.google.cloud.configdelivery.v1.RollingStrategyInfo) strategy_;
        }
        return com.google.cloud.configdelivery.v1.RollingStrategyInfo.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * RollingStrategyInfo represents the status of Rolling rollout strategy
     * execution.
     * </pre>
     *
     * <code>.google.cloud.configdelivery.v1.RollingStrategyInfo rolling_strategy_info = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.configdelivery.v1.RollingStrategyInfo,
            com.google.cloud.configdelivery.v1.RollingStrategyInfo.Builder,
            com.google.cloud.configdelivery.v1.RollingStrategyInfoOrBuilder>
        getRollingStrategyInfoFieldBuilder() {
      if (rollingStrategyInfoBuilder_ == null) {
        if (!(strategyCase_ == 2)) {
          strategy_ = com.google.cloud.configdelivery.v1.RollingStrategyInfo.getDefaultInstance();
        }
        rollingStrategyInfoBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.configdelivery.v1.RollingStrategyInfo,
                com.google.cloud.configdelivery.v1.RollingStrategyInfo.Builder,
                com.google.cloud.configdelivery.v1.RollingStrategyInfoOrBuilder>(
                (com.google.cloud.configdelivery.v1.RollingStrategyInfo) strategy_,
                getParentForChildren(),
                isClean());
        strategy_ = null;
      }
      strategyCase_ = 2;
      onChanged();
      return rollingStrategyInfoBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.configdelivery.v1.RolloutStrategyInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.configdelivery.v1.RolloutStrategyInfo)
  private static final com.google.cloud.configdelivery.v1.RolloutStrategyInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.configdelivery.v1.RolloutStrategyInfo();
  }

  public static com.google.cloud.configdelivery.v1.RolloutStrategyInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RolloutStrategyInfo> PARSER =
      new com.google.protobuf.AbstractParser<RolloutStrategyInfo>() {
        @java.lang.Override
        public RolloutStrategyInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<RolloutStrategyInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RolloutStrategyInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.configdelivery.v1.RolloutStrategyInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
