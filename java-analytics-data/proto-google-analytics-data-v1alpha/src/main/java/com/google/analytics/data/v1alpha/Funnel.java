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
// source: google/analytics/data/v1alpha/data.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.data.v1alpha;

/**
 *
 *
 * <pre>
 * Configures the funnel in a funnel report request. A funnel reports on users
 * as they pass through a sequence of steps.
 *
 * Funnel exploration lets you visualize the steps your users take to complete a
 * task and quickly see how well they are succeeding or failing at each step.
 * For example, how do prospects become shoppers and then become buyers? How do
 * one time buyers become repeat buyers? With this information, you can improve
 * inefficient or abandoned customer journeys.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.Funnel}
 */
public final class Funnel extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.Funnel)
    FunnelOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Funnel.newBuilder() to construct.
  private Funnel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Funnel() {
    steps_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Funnel();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_Funnel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_Funnel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.Funnel.class,
            com.google.analytics.data.v1alpha.Funnel.Builder.class);
  }

  public static final int IS_OPEN_FUNNEL_FIELD_NUMBER = 1;
  private boolean isOpenFunnel_ = false;

  /**
   *
   *
   * <pre>
   * In an open funnel, users can enter the funnel in any step, and in a closed
   * funnel, users must enter the funnel in the first step. Optional. If
   * unspecified, a closed funnel is used.
   * </pre>
   *
   * <code>bool is_open_funnel = 1;</code>
   *
   * @return The isOpenFunnel.
   */
  @java.lang.Override
  public boolean getIsOpenFunnel() {
    return isOpenFunnel_;
  }

  public static final int STEPS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<com.google.analytics.data.v1alpha.FunnelStep> steps_;

  /**
   *
   *
   * <pre>
   * The sequential steps of this funnel.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.FunnelStep> getStepsList() {
    return steps_;
  }

  /**
   *
   *
   * <pre>
   * The sequential steps of this funnel.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.FunnelStepOrBuilder>
      getStepsOrBuilderList() {
    return steps_;
  }

  /**
   *
   *
   * <pre>
   * The sequential steps of this funnel.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
   */
  @java.lang.Override
  public int getStepsCount() {
    return steps_.size();
  }

  /**
   *
   *
   * <pre>
   * The sequential steps of this funnel.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.FunnelStep getSteps(int index) {
    return steps_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The sequential steps of this funnel.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.FunnelStepOrBuilder getStepsOrBuilder(int index) {
    return steps_.get(index);
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
    if (isOpenFunnel_ != false) {
      output.writeBool(1, isOpenFunnel_);
    }
    for (int i = 0; i < steps_.size(); i++) {
      output.writeMessage(2, steps_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isOpenFunnel_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, isOpenFunnel_);
    }
    for (int i = 0; i < steps_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, steps_.get(i));
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.Funnel)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.Funnel other = (com.google.analytics.data.v1alpha.Funnel) obj;

    if (getIsOpenFunnel() != other.getIsOpenFunnel()) return false;
    if (!getStepsList().equals(other.getStepsList())) return false;
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
    hash = (37 * hash) + IS_OPEN_FUNNEL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsOpenFunnel());
    if (getStepsCount() > 0) {
      hash = (37 * hash) + STEPS_FIELD_NUMBER;
      hash = (53 * hash) + getStepsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.Funnel parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Funnel parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Funnel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Funnel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Funnel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Funnel parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Funnel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Funnel parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Funnel parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Funnel parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Funnel parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Funnel parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.Funnel prototype) {
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
   * Configures the funnel in a funnel report request. A funnel reports on users
   * as they pass through a sequence of steps.
   *
   * Funnel exploration lets you visualize the steps your users take to complete a
   * task and quickly see how well they are succeeding or failing at each step.
   * For example, how do prospects become shoppers and then become buyers? How do
   * one time buyers become repeat buyers? With this information, you can improve
   * inefficient or abandoned customer journeys.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.Funnel}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.Funnel)
      com.google.analytics.data.v1alpha.FunnelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Funnel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Funnel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.Funnel.class,
              com.google.analytics.data.v1alpha.Funnel.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.Funnel.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      isOpenFunnel_ = false;
      if (stepsBuilder_ == null) {
        steps_ = java.util.Collections.emptyList();
      } else {
        steps_ = null;
        stepsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Funnel_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Funnel getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.Funnel.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Funnel build() {
      com.google.analytics.data.v1alpha.Funnel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Funnel buildPartial() {
      com.google.analytics.data.v1alpha.Funnel result =
          new com.google.analytics.data.v1alpha.Funnel(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.analytics.data.v1alpha.Funnel result) {
      if (stepsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          steps_ = java.util.Collections.unmodifiableList(steps_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.steps_ = steps_;
      } else {
        result.steps_ = stepsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.analytics.data.v1alpha.Funnel result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isOpenFunnel_ = isOpenFunnel_;
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
      if (other instanceof com.google.analytics.data.v1alpha.Funnel) {
        return mergeFrom((com.google.analytics.data.v1alpha.Funnel) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.Funnel other) {
      if (other == com.google.analytics.data.v1alpha.Funnel.getDefaultInstance()) return this;
      if (other.getIsOpenFunnel() != false) {
        setIsOpenFunnel(other.getIsOpenFunnel());
      }
      if (stepsBuilder_ == null) {
        if (!other.steps_.isEmpty()) {
          if (steps_.isEmpty()) {
            steps_ = other.steps_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureStepsIsMutable();
            steps_.addAll(other.steps_);
          }
          onChanged();
        }
      } else {
        if (!other.steps_.isEmpty()) {
          if (stepsBuilder_.isEmpty()) {
            stepsBuilder_.dispose();
            stepsBuilder_ = null;
            steps_ = other.steps_;
            bitField0_ = (bitField0_ & ~0x00000002);
            stepsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getStepsFieldBuilder()
                    : null;
          } else {
            stepsBuilder_.addAllMessages(other.steps_);
          }
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
            case 8:
              {
                isOpenFunnel_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                com.google.analytics.data.v1alpha.FunnelStep m =
                    input.readMessage(
                        com.google.analytics.data.v1alpha.FunnelStep.parser(), extensionRegistry);
                if (stepsBuilder_ == null) {
                  ensureStepsIsMutable();
                  steps_.add(m);
                } else {
                  stepsBuilder_.addMessage(m);
                }
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

    private int bitField0_;

    private boolean isOpenFunnel_;

    /**
     *
     *
     * <pre>
     * In an open funnel, users can enter the funnel in any step, and in a closed
     * funnel, users must enter the funnel in the first step. Optional. If
     * unspecified, a closed funnel is used.
     * </pre>
     *
     * <code>bool is_open_funnel = 1;</code>
     *
     * @return The isOpenFunnel.
     */
    @java.lang.Override
    public boolean getIsOpenFunnel() {
      return isOpenFunnel_;
    }

    /**
     *
     *
     * <pre>
     * In an open funnel, users can enter the funnel in any step, and in a closed
     * funnel, users must enter the funnel in the first step. Optional. If
     * unspecified, a closed funnel is used.
     * </pre>
     *
     * <code>bool is_open_funnel = 1;</code>
     *
     * @param value The isOpenFunnel to set.
     * @return This builder for chaining.
     */
    public Builder setIsOpenFunnel(boolean value) {

      isOpenFunnel_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * In an open funnel, users can enter the funnel in any step, and in a closed
     * funnel, users must enter the funnel in the first step. Optional. If
     * unspecified, a closed funnel is used.
     * </pre>
     *
     * <code>bool is_open_funnel = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIsOpenFunnel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isOpenFunnel_ = false;
      onChanged();
      return this;
    }

    private java.util.List<com.google.analytics.data.v1alpha.FunnelStep> steps_ =
        java.util.Collections.emptyList();

    private void ensureStepsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        steps_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.FunnelStep>(steps_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.FunnelStep,
            com.google.analytics.data.v1alpha.FunnelStep.Builder,
            com.google.analytics.data.v1alpha.FunnelStepOrBuilder>
        stepsBuilder_;

    /**
     *
     *
     * <pre>
     * The sequential steps of this funnel.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.FunnelStep> getStepsList() {
      if (stepsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(steps_);
      } else {
        return stepsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The sequential steps of this funnel.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
     */
    public int getStepsCount() {
      if (stepsBuilder_ == null) {
        return steps_.size();
      } else {
        return stepsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The sequential steps of this funnel.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
     */
    public com.google.analytics.data.v1alpha.FunnelStep getSteps(int index) {
      if (stepsBuilder_ == null) {
        return steps_.get(index);
      } else {
        return stepsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The sequential steps of this funnel.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
     */
    public Builder setSteps(int index, com.google.analytics.data.v1alpha.FunnelStep value) {
      if (stepsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStepsIsMutable();
        steps_.set(index, value);
        onChanged();
      } else {
        stepsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The sequential steps of this funnel.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
     */
    public Builder setSteps(
        int index, com.google.analytics.data.v1alpha.FunnelStep.Builder builderForValue) {
      if (stepsBuilder_ == null) {
        ensureStepsIsMutable();
        steps_.set(index, builderForValue.build());
        onChanged();
      } else {
        stepsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The sequential steps of this funnel.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
     */
    public Builder addSteps(com.google.analytics.data.v1alpha.FunnelStep value) {
      if (stepsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStepsIsMutable();
        steps_.add(value);
        onChanged();
      } else {
        stepsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The sequential steps of this funnel.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
     */
    public Builder addSteps(int index, com.google.analytics.data.v1alpha.FunnelStep value) {
      if (stepsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStepsIsMutable();
        steps_.add(index, value);
        onChanged();
      } else {
        stepsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The sequential steps of this funnel.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
     */
    public Builder addSteps(com.google.analytics.data.v1alpha.FunnelStep.Builder builderForValue) {
      if (stepsBuilder_ == null) {
        ensureStepsIsMutable();
        steps_.add(builderForValue.build());
        onChanged();
      } else {
        stepsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The sequential steps of this funnel.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
     */
    public Builder addSteps(
        int index, com.google.analytics.data.v1alpha.FunnelStep.Builder builderForValue) {
      if (stepsBuilder_ == null) {
        ensureStepsIsMutable();
        steps_.add(index, builderForValue.build());
        onChanged();
      } else {
        stepsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The sequential steps of this funnel.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
     */
    public Builder addAllSteps(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.FunnelStep> values) {
      if (stepsBuilder_ == null) {
        ensureStepsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, steps_);
        onChanged();
      } else {
        stepsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The sequential steps of this funnel.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
     */
    public Builder clearSteps() {
      if (stepsBuilder_ == null) {
        steps_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        stepsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The sequential steps of this funnel.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
     */
    public Builder removeSteps(int index) {
      if (stepsBuilder_ == null) {
        ensureStepsIsMutable();
        steps_.remove(index);
        onChanged();
      } else {
        stepsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The sequential steps of this funnel.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
     */
    public com.google.analytics.data.v1alpha.FunnelStep.Builder getStepsBuilder(int index) {
      return getStepsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The sequential steps of this funnel.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
     */
    public com.google.analytics.data.v1alpha.FunnelStepOrBuilder getStepsOrBuilder(int index) {
      if (stepsBuilder_ == null) {
        return steps_.get(index);
      } else {
        return stepsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The sequential steps of this funnel.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.FunnelStepOrBuilder>
        getStepsOrBuilderList() {
      if (stepsBuilder_ != null) {
        return stepsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(steps_);
      }
    }

    /**
     *
     *
     * <pre>
     * The sequential steps of this funnel.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
     */
    public com.google.analytics.data.v1alpha.FunnelStep.Builder addStepsBuilder() {
      return getStepsFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.FunnelStep.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The sequential steps of this funnel.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
     */
    public com.google.analytics.data.v1alpha.FunnelStep.Builder addStepsBuilder(int index) {
      return getStepsFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.FunnelStep.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The sequential steps of this funnel.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.FunnelStep.Builder>
        getStepsBuilderList() {
      return getStepsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.FunnelStep,
            com.google.analytics.data.v1alpha.FunnelStep.Builder,
            com.google.analytics.data.v1alpha.FunnelStepOrBuilder>
        getStepsFieldBuilder() {
      if (stepsBuilder_ == null) {
        stepsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.FunnelStep,
                com.google.analytics.data.v1alpha.FunnelStep.Builder,
                com.google.analytics.data.v1alpha.FunnelStepOrBuilder>(
                steps_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        steps_ = null;
      }
      return stepsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.Funnel)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.Funnel)
  private static final com.google.analytics.data.v1alpha.Funnel DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.Funnel();
  }

  public static com.google.analytics.data.v1alpha.Funnel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Funnel> PARSER =
      new com.google.protobuf.AbstractParser<Funnel>() {
        @java.lang.Override
        public Funnel parsePartialFrom(
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

  public static com.google.protobuf.Parser<Funnel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Funnel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.Funnel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
