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
// source: google/cloud/retail/v2beta/common.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2beta;

/**
 *
 *
 * <pre>
 * A floating point interval.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2beta.Interval}
 */
public final class Interval extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2beta.Interval)
    IntervalOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Interval.newBuilder() to construct.
  private Interval(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Interval() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Interval();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2beta.CommonProto
        .internal_static_google_cloud_retail_v2beta_Interval_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2beta.CommonProto
        .internal_static_google_cloud_retail_v2beta_Interval_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2beta.Interval.class,
            com.google.cloud.retail.v2beta.Interval.Builder.class);
  }

  private int minCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object min_;

  public enum MinCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    MINIMUM(1),
    EXCLUSIVE_MINIMUM(2),
    MIN_NOT_SET(0);
    private final int value;

    private MinCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MinCase valueOf(int value) {
      return forNumber(value);
    }

    public static MinCase forNumber(int value) {
      switch (value) {
        case 1:
          return MINIMUM;
        case 2:
          return EXCLUSIVE_MINIMUM;
        case 0:
          return MIN_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public MinCase getMinCase() {
    return MinCase.forNumber(minCase_);
  }

  private int maxCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object max_;

  public enum MaxCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    MAXIMUM(3),
    EXCLUSIVE_MAXIMUM(4),
    MAX_NOT_SET(0);
    private final int value;

    private MaxCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MaxCase valueOf(int value) {
      return forNumber(value);
    }

    public static MaxCase forNumber(int value) {
      switch (value) {
        case 3:
          return MAXIMUM;
        case 4:
          return EXCLUSIVE_MAXIMUM;
        case 0:
          return MAX_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public MaxCase getMaxCase() {
    return MaxCase.forNumber(maxCase_);
  }

  public static final int MINIMUM_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * Inclusive lower bound.
   * </pre>
   *
   * <code>double minimum = 1;</code>
   *
   * @return Whether the minimum field is set.
   */
  @java.lang.Override
  public boolean hasMinimum() {
    return minCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * Inclusive lower bound.
   * </pre>
   *
   * <code>double minimum = 1;</code>
   *
   * @return The minimum.
   */
  @java.lang.Override
  public double getMinimum() {
    if (minCase_ == 1) {
      return (java.lang.Double) min_;
    }
    return 0D;
  }

  public static final int EXCLUSIVE_MINIMUM_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * Exclusive lower bound.
   * </pre>
   *
   * <code>double exclusive_minimum = 2;</code>
   *
   * @return Whether the exclusiveMinimum field is set.
   */
  @java.lang.Override
  public boolean hasExclusiveMinimum() {
    return minCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * Exclusive lower bound.
   * </pre>
   *
   * <code>double exclusive_minimum = 2;</code>
   *
   * @return The exclusiveMinimum.
   */
  @java.lang.Override
  public double getExclusiveMinimum() {
    if (minCase_ == 2) {
      return (java.lang.Double) min_;
    }
    return 0D;
  }

  public static final int MAXIMUM_FIELD_NUMBER = 3;

  /**
   *
   *
   * <pre>
   * Inclusive upper bound.
   * </pre>
   *
   * <code>double maximum = 3;</code>
   *
   * @return Whether the maximum field is set.
   */
  @java.lang.Override
  public boolean hasMaximum() {
    return maxCase_ == 3;
  }

  /**
   *
   *
   * <pre>
   * Inclusive upper bound.
   * </pre>
   *
   * <code>double maximum = 3;</code>
   *
   * @return The maximum.
   */
  @java.lang.Override
  public double getMaximum() {
    if (maxCase_ == 3) {
      return (java.lang.Double) max_;
    }
    return 0D;
  }

  public static final int EXCLUSIVE_MAXIMUM_FIELD_NUMBER = 4;

  /**
   *
   *
   * <pre>
   * Exclusive upper bound.
   * </pre>
   *
   * <code>double exclusive_maximum = 4;</code>
   *
   * @return Whether the exclusiveMaximum field is set.
   */
  @java.lang.Override
  public boolean hasExclusiveMaximum() {
    return maxCase_ == 4;
  }

  /**
   *
   *
   * <pre>
   * Exclusive upper bound.
   * </pre>
   *
   * <code>double exclusive_maximum = 4;</code>
   *
   * @return The exclusiveMaximum.
   */
  @java.lang.Override
  public double getExclusiveMaximum() {
    if (maxCase_ == 4) {
      return (java.lang.Double) max_;
    }
    return 0D;
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
    if (minCase_ == 1) {
      output.writeDouble(1, (double) ((java.lang.Double) min_));
    }
    if (minCase_ == 2) {
      output.writeDouble(2, (double) ((java.lang.Double) min_));
    }
    if (maxCase_ == 3) {
      output.writeDouble(3, (double) ((java.lang.Double) max_));
    }
    if (maxCase_ == 4) {
      output.writeDouble(4, (double) ((java.lang.Double) max_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeDoubleSize(
              1, (double) ((java.lang.Double) min_));
    }
    if (minCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeDoubleSize(
              2, (double) ((java.lang.Double) min_));
    }
    if (maxCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeDoubleSize(
              3, (double) ((java.lang.Double) max_));
    }
    if (maxCase_ == 4) {
      size +=
          com.google.protobuf.CodedOutputStream.computeDoubleSize(
              4, (double) ((java.lang.Double) max_));
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
    if (!(obj instanceof com.google.cloud.retail.v2beta.Interval)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2beta.Interval other = (com.google.cloud.retail.v2beta.Interval) obj;

    if (!getMinCase().equals(other.getMinCase())) return false;
    switch (minCase_) {
      case 1:
        if (java.lang.Double.doubleToLongBits(getMinimum())
            != java.lang.Double.doubleToLongBits(other.getMinimum())) return false;
        break;
      case 2:
        if (java.lang.Double.doubleToLongBits(getExclusiveMinimum())
            != java.lang.Double.doubleToLongBits(other.getExclusiveMinimum())) return false;
        break;
      case 0:
      default:
    }
    if (!getMaxCase().equals(other.getMaxCase())) return false;
    switch (maxCase_) {
      case 3:
        if (java.lang.Double.doubleToLongBits(getMaximum())
            != java.lang.Double.doubleToLongBits(other.getMaximum())) return false;
        break;
      case 4:
        if (java.lang.Double.doubleToLongBits(getExclusiveMaximum())
            != java.lang.Double.doubleToLongBits(other.getExclusiveMaximum())) return false;
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
    switch (minCase_) {
      case 1:
        hash = (37 * hash) + MINIMUM_FIELD_NUMBER;
        hash =
            (53 * hash)
                + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getMinimum()));
        break;
      case 2:
        hash = (37 * hash) + EXCLUSIVE_MINIMUM_FIELD_NUMBER;
        hash =
            (53 * hash)
                + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getExclusiveMinimum()));
        break;
      case 0:
      default:
    }
    switch (maxCase_) {
      case 3:
        hash = (37 * hash) + MAXIMUM_FIELD_NUMBER;
        hash =
            (53 * hash)
                + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getMaximum()));
        break;
      case 4:
        hash = (37 * hash) + EXCLUSIVE_MAXIMUM_FIELD_NUMBER;
        hash =
            (53 * hash)
                + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getExclusiveMaximum()));
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2beta.Interval parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.Interval parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.Interval parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.Interval parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.Interval parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.Interval parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.Interval parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.Interval parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.Interval parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.Interval parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.Interval parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.Interval parseFrom(
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

  public static Builder newBuilder(com.google.cloud.retail.v2beta.Interval prototype) {
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
   * A floating point interval.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2beta.Interval}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2beta.Interval)
      com.google.cloud.retail.v2beta.IntervalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2beta.CommonProto
          .internal_static_google_cloud_retail_v2beta_Interval_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2beta.CommonProto
          .internal_static_google_cloud_retail_v2beta_Interval_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2beta.Interval.class,
              com.google.cloud.retail.v2beta.Interval.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2beta.Interval.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      minCase_ = 0;
      min_ = null;
      maxCase_ = 0;
      max_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2beta.CommonProto
          .internal_static_google_cloud_retail_v2beta_Interval_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.Interval getDefaultInstanceForType() {
      return com.google.cloud.retail.v2beta.Interval.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.Interval build() {
      com.google.cloud.retail.v2beta.Interval result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.Interval buildPartial() {
      com.google.cloud.retail.v2beta.Interval result =
          new com.google.cloud.retail.v2beta.Interval(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.retail.v2beta.Interval result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.retail.v2beta.Interval result) {
      result.minCase_ = minCase_;
      result.min_ = this.min_;
      result.maxCase_ = maxCase_;
      result.max_ = this.max_;
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
      if (other instanceof com.google.cloud.retail.v2beta.Interval) {
        return mergeFrom((com.google.cloud.retail.v2beta.Interval) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2beta.Interval other) {
      if (other == com.google.cloud.retail.v2beta.Interval.getDefaultInstance()) return this;
      switch (other.getMinCase()) {
        case MINIMUM:
          {
            setMinimum(other.getMinimum());
            break;
          }
        case EXCLUSIVE_MINIMUM:
          {
            setExclusiveMinimum(other.getExclusiveMinimum());
            break;
          }
        case MIN_NOT_SET:
          {
            break;
          }
      }
      switch (other.getMaxCase()) {
        case MAXIMUM:
          {
            setMaximum(other.getMaximum());
            break;
          }
        case EXCLUSIVE_MAXIMUM:
          {
            setExclusiveMaximum(other.getExclusiveMaximum());
            break;
          }
        case MAX_NOT_SET:
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
            case 9:
              {
                min_ = input.readDouble();
                minCase_ = 1;
                break;
              } // case 9
            case 17:
              {
                min_ = input.readDouble();
                minCase_ = 2;
                break;
              } // case 17
            case 25:
              {
                max_ = input.readDouble();
                maxCase_ = 3;
                break;
              } // case 25
            case 33:
              {
                max_ = input.readDouble();
                maxCase_ = 4;
                break;
              } // case 33
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

    private int minCase_ = 0;
    private java.lang.Object min_;

    public MinCase getMinCase() {
      return MinCase.forNumber(minCase_);
    }

    public Builder clearMin() {
      minCase_ = 0;
      min_ = null;
      onChanged();
      return this;
    }

    private int maxCase_ = 0;
    private java.lang.Object max_;

    public MaxCase getMaxCase() {
      return MaxCase.forNumber(maxCase_);
    }

    public Builder clearMax() {
      maxCase_ = 0;
      max_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * Inclusive lower bound.
     * </pre>
     *
     * <code>double minimum = 1;</code>
     *
     * @return Whether the minimum field is set.
     */
    public boolean hasMinimum() {
      return minCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * Inclusive lower bound.
     * </pre>
     *
     * <code>double minimum = 1;</code>
     *
     * @return The minimum.
     */
    public double getMinimum() {
      if (minCase_ == 1) {
        return (java.lang.Double) min_;
      }
      return 0D;
    }

    /**
     *
     *
     * <pre>
     * Inclusive lower bound.
     * </pre>
     *
     * <code>double minimum = 1;</code>
     *
     * @param value The minimum to set.
     * @return This builder for chaining.
     */
    public Builder setMinimum(double value) {

      minCase_ = 1;
      min_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Inclusive lower bound.
     * </pre>
     *
     * <code>double minimum = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMinimum() {
      if (minCase_ == 1) {
        minCase_ = 0;
        min_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Exclusive lower bound.
     * </pre>
     *
     * <code>double exclusive_minimum = 2;</code>
     *
     * @return Whether the exclusiveMinimum field is set.
     */
    public boolean hasExclusiveMinimum() {
      return minCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * Exclusive lower bound.
     * </pre>
     *
     * <code>double exclusive_minimum = 2;</code>
     *
     * @return The exclusiveMinimum.
     */
    public double getExclusiveMinimum() {
      if (minCase_ == 2) {
        return (java.lang.Double) min_;
      }
      return 0D;
    }

    /**
     *
     *
     * <pre>
     * Exclusive lower bound.
     * </pre>
     *
     * <code>double exclusive_minimum = 2;</code>
     *
     * @param value The exclusiveMinimum to set.
     * @return This builder for chaining.
     */
    public Builder setExclusiveMinimum(double value) {

      minCase_ = 2;
      min_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Exclusive lower bound.
     * </pre>
     *
     * <code>double exclusive_minimum = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExclusiveMinimum() {
      if (minCase_ == 2) {
        minCase_ = 0;
        min_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Inclusive upper bound.
     * </pre>
     *
     * <code>double maximum = 3;</code>
     *
     * @return Whether the maximum field is set.
     */
    public boolean hasMaximum() {
      return maxCase_ == 3;
    }

    /**
     *
     *
     * <pre>
     * Inclusive upper bound.
     * </pre>
     *
     * <code>double maximum = 3;</code>
     *
     * @return The maximum.
     */
    public double getMaximum() {
      if (maxCase_ == 3) {
        return (java.lang.Double) max_;
      }
      return 0D;
    }

    /**
     *
     *
     * <pre>
     * Inclusive upper bound.
     * </pre>
     *
     * <code>double maximum = 3;</code>
     *
     * @param value The maximum to set.
     * @return This builder for chaining.
     */
    public Builder setMaximum(double value) {

      maxCase_ = 3;
      max_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Inclusive upper bound.
     * </pre>
     *
     * <code>double maximum = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaximum() {
      if (maxCase_ == 3) {
        maxCase_ = 0;
        max_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Exclusive upper bound.
     * </pre>
     *
     * <code>double exclusive_maximum = 4;</code>
     *
     * @return Whether the exclusiveMaximum field is set.
     */
    public boolean hasExclusiveMaximum() {
      return maxCase_ == 4;
    }

    /**
     *
     *
     * <pre>
     * Exclusive upper bound.
     * </pre>
     *
     * <code>double exclusive_maximum = 4;</code>
     *
     * @return The exclusiveMaximum.
     */
    public double getExclusiveMaximum() {
      if (maxCase_ == 4) {
        return (java.lang.Double) max_;
      }
      return 0D;
    }

    /**
     *
     *
     * <pre>
     * Exclusive upper bound.
     * </pre>
     *
     * <code>double exclusive_maximum = 4;</code>
     *
     * @param value The exclusiveMaximum to set.
     * @return This builder for chaining.
     */
    public Builder setExclusiveMaximum(double value) {

      maxCase_ = 4;
      max_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Exclusive upper bound.
     * </pre>
     *
     * <code>double exclusive_maximum = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExclusiveMaximum() {
      if (maxCase_ == 4) {
        maxCase_ = 0;
        max_ = null;
        onChanged();
      }
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2beta.Interval)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.Interval)
  private static final com.google.cloud.retail.v2beta.Interval DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2beta.Interval();
  }

  public static com.google.cloud.retail.v2beta.Interval getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Interval> PARSER =
      new com.google.protobuf.AbstractParser<Interval>() {
        @java.lang.Override
        public Interval parsePartialFrom(
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

  public static com.google.protobuf.Parser<Interval> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Interval> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2beta.Interval getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
