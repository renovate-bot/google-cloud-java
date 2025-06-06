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
// source: google/appengine/v1/version.proto

// Protobuf Java Version: 3.25.8
package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * Target scaling by CPU usage.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.CpuUtilization}
 */
public final class CpuUtilization extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.CpuUtilization)
    CpuUtilizationOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CpuUtilization.newBuilder() to construct.
  private CpuUtilization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CpuUtilization() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CpuUtilization();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.appengine.v1.VersionProto
        .internal_static_google_appengine_v1_CpuUtilization_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.VersionProto
        .internal_static_google_appengine_v1_CpuUtilization_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.CpuUtilization.class,
            com.google.appengine.v1.CpuUtilization.Builder.class);
  }

  private int bitField0_;
  public static final int AGGREGATION_WINDOW_LENGTH_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration aggregationWindowLength_;

  /**
   *
   *
   * <pre>
   * Period of time over which CPU utilization is calculated.
   * </pre>
   *
   * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
   *
   * @return Whether the aggregationWindowLength field is set.
   */
  @java.lang.Override
  public boolean hasAggregationWindowLength() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Period of time over which CPU utilization is calculated.
   * </pre>
   *
   * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
   *
   * @return The aggregationWindowLength.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getAggregationWindowLength() {
    return aggregationWindowLength_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : aggregationWindowLength_;
  }

  /**
   *
   *
   * <pre>
   * Period of time over which CPU utilization is calculated.
   * </pre>
   *
   * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getAggregationWindowLengthOrBuilder() {
    return aggregationWindowLength_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : aggregationWindowLength_;
  }

  public static final int TARGET_UTILIZATION_FIELD_NUMBER = 2;
  private double targetUtilization_ = 0D;

  /**
   *
   *
   * <pre>
   * Target CPU utilization ratio to maintain when scaling. Must be between 0
   * and 1.
   * </pre>
   *
   * <code>double target_utilization = 2;</code>
   *
   * @return The targetUtilization.
   */
  @java.lang.Override
  public double getTargetUtilization() {
    return targetUtilization_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getAggregationWindowLength());
    }
    if (java.lang.Double.doubleToRawLongBits(targetUtilization_) != 0) {
      output.writeDouble(2, targetUtilization_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getAggregationWindowLength());
    }
    if (java.lang.Double.doubleToRawLongBits(targetUtilization_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, targetUtilization_);
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
    if (!(obj instanceof com.google.appengine.v1.CpuUtilization)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.CpuUtilization other = (com.google.appengine.v1.CpuUtilization) obj;

    if (hasAggregationWindowLength() != other.hasAggregationWindowLength()) return false;
    if (hasAggregationWindowLength()) {
      if (!getAggregationWindowLength().equals(other.getAggregationWindowLength())) return false;
    }
    if (java.lang.Double.doubleToLongBits(getTargetUtilization())
        != java.lang.Double.doubleToLongBits(other.getTargetUtilization())) return false;
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
    if (hasAggregationWindowLength()) {
      hash = (37 * hash) + AGGREGATION_WINDOW_LENGTH_FIELD_NUMBER;
      hash = (53 * hash) + getAggregationWindowLength().hashCode();
    }
    hash = (37 * hash) + TARGET_UTILIZATION_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getTargetUtilization()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.CpuUtilization parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.CpuUtilization parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.CpuUtilization parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.CpuUtilization parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.CpuUtilization parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.CpuUtilization parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.CpuUtilization parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.CpuUtilization parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.CpuUtilization parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.CpuUtilization parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.CpuUtilization parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.CpuUtilization parseFrom(
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

  public static Builder newBuilder(com.google.appengine.v1.CpuUtilization prototype) {
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
   * Target scaling by CPU usage.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.CpuUtilization}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.CpuUtilization)
      com.google.appengine.v1.CpuUtilizationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.VersionProto
          .internal_static_google_appengine_v1_CpuUtilization_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.VersionProto
          .internal_static_google_appengine_v1_CpuUtilization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.CpuUtilization.class,
              com.google.appengine.v1.CpuUtilization.Builder.class);
    }

    // Construct using com.google.appengine.v1.CpuUtilization.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAggregationWindowLengthFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      aggregationWindowLength_ = null;
      if (aggregationWindowLengthBuilder_ != null) {
        aggregationWindowLengthBuilder_.dispose();
        aggregationWindowLengthBuilder_ = null;
      }
      targetUtilization_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.VersionProto
          .internal_static_google_appengine_v1_CpuUtilization_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.CpuUtilization getDefaultInstanceForType() {
      return com.google.appengine.v1.CpuUtilization.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.CpuUtilization build() {
      com.google.appengine.v1.CpuUtilization result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.CpuUtilization buildPartial() {
      com.google.appengine.v1.CpuUtilization result =
          new com.google.appengine.v1.CpuUtilization(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.appengine.v1.CpuUtilization result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.aggregationWindowLength_ =
            aggregationWindowLengthBuilder_ == null
                ? aggregationWindowLength_
                : aggregationWindowLengthBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.targetUtilization_ = targetUtilization_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.appengine.v1.CpuUtilization) {
        return mergeFrom((com.google.appengine.v1.CpuUtilization) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.CpuUtilization other) {
      if (other == com.google.appengine.v1.CpuUtilization.getDefaultInstance()) return this;
      if (other.hasAggregationWindowLength()) {
        mergeAggregationWindowLength(other.getAggregationWindowLength());
      }
      if (other.getTargetUtilization() != 0D) {
        setTargetUtilization(other.getTargetUtilization());
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
                    getAggregationWindowLengthFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 17:
              {
                targetUtilization_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 17
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

    private com.google.protobuf.Duration aggregationWindowLength_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        aggregationWindowLengthBuilder_;

    /**
     *
     *
     * <pre>
     * Period of time over which CPU utilization is calculated.
     * </pre>
     *
     * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
     *
     * @return Whether the aggregationWindowLength field is set.
     */
    public boolean hasAggregationWindowLength() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Period of time over which CPU utilization is calculated.
     * </pre>
     *
     * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
     *
     * @return The aggregationWindowLength.
     */
    public com.google.protobuf.Duration getAggregationWindowLength() {
      if (aggregationWindowLengthBuilder_ == null) {
        return aggregationWindowLength_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : aggregationWindowLength_;
      } else {
        return aggregationWindowLengthBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Period of time over which CPU utilization is calculated.
     * </pre>
     *
     * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
     */
    public Builder setAggregationWindowLength(com.google.protobuf.Duration value) {
      if (aggregationWindowLengthBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        aggregationWindowLength_ = value;
      } else {
        aggregationWindowLengthBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Period of time over which CPU utilization is calculated.
     * </pre>
     *
     * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
     */
    public Builder setAggregationWindowLength(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (aggregationWindowLengthBuilder_ == null) {
        aggregationWindowLength_ = builderForValue.build();
      } else {
        aggregationWindowLengthBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Period of time over which CPU utilization is calculated.
     * </pre>
     *
     * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
     */
    public Builder mergeAggregationWindowLength(com.google.protobuf.Duration value) {
      if (aggregationWindowLengthBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && aggregationWindowLength_ != null
            && aggregationWindowLength_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getAggregationWindowLengthBuilder().mergeFrom(value);
        } else {
          aggregationWindowLength_ = value;
        }
      } else {
        aggregationWindowLengthBuilder_.mergeFrom(value);
      }
      if (aggregationWindowLength_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Period of time over which CPU utilization is calculated.
     * </pre>
     *
     * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
     */
    public Builder clearAggregationWindowLength() {
      bitField0_ = (bitField0_ & ~0x00000001);
      aggregationWindowLength_ = null;
      if (aggregationWindowLengthBuilder_ != null) {
        aggregationWindowLengthBuilder_.dispose();
        aggregationWindowLengthBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Period of time over which CPU utilization is calculated.
     * </pre>
     *
     * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getAggregationWindowLengthBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAggregationWindowLengthFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Period of time over which CPU utilization is calculated.
     * </pre>
     *
     * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getAggregationWindowLengthOrBuilder() {
      if (aggregationWindowLengthBuilder_ != null) {
        return aggregationWindowLengthBuilder_.getMessageOrBuilder();
      } else {
        return aggregationWindowLength_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : aggregationWindowLength_;
      }
    }

    /**
     *
     *
     * <pre>
     * Period of time over which CPU utilization is calculated.
     * </pre>
     *
     * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getAggregationWindowLengthFieldBuilder() {
      if (aggregationWindowLengthBuilder_ == null) {
        aggregationWindowLengthBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getAggregationWindowLength(), getParentForChildren(), isClean());
        aggregationWindowLength_ = null;
      }
      return aggregationWindowLengthBuilder_;
    }

    private double targetUtilization_;

    /**
     *
     *
     * <pre>
     * Target CPU utilization ratio to maintain when scaling. Must be between 0
     * and 1.
     * </pre>
     *
     * <code>double target_utilization = 2;</code>
     *
     * @return The targetUtilization.
     */
    @java.lang.Override
    public double getTargetUtilization() {
      return targetUtilization_;
    }

    /**
     *
     *
     * <pre>
     * Target CPU utilization ratio to maintain when scaling. Must be between 0
     * and 1.
     * </pre>
     *
     * <code>double target_utilization = 2;</code>
     *
     * @param value The targetUtilization to set.
     * @return This builder for chaining.
     */
    public Builder setTargetUtilization(double value) {

      targetUtilization_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Target CPU utilization ratio to maintain when scaling. Must be between 0
     * and 1.
     * </pre>
     *
     * <code>double target_utilization = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTargetUtilization() {
      bitField0_ = (bitField0_ & ~0x00000002);
      targetUtilization_ = 0D;
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

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.CpuUtilization)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.CpuUtilization)
  private static final com.google.appengine.v1.CpuUtilization DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.CpuUtilization();
  }

  public static com.google.appengine.v1.CpuUtilization getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CpuUtilization> PARSER =
      new com.google.protobuf.AbstractParser<CpuUtilization>() {
        @java.lang.Override
        public CpuUtilization parsePartialFrom(
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

  public static com.google.protobuf.Parser<CpuUtilization> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CpuUtilization> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.CpuUtilization getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
