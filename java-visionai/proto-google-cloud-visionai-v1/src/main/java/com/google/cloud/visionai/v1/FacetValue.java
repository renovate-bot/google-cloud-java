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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * Definition of a single value with generic type.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.FacetValue}
 */
public final class FacetValue extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.FacetValue)
    FacetValueOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use FacetValue.newBuilder() to construct.
  private FacetValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FacetValue() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FacetValue();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_FacetValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_FacetValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.FacetValue.class,
            com.google.cloud.visionai.v1.FacetValue.Builder.class);
  }

  private int valueCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object value_;

  public enum ValueCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    STRING_VALUE(1),
    INTEGER_VALUE(2),
    DATETIME_VALUE(3),
    VALUE_NOT_SET(0);
    private final int value;

    private ValueCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 1:
          return STRING_VALUE;
        case 2:
          return INTEGER_VALUE;
        case 3:
          return DATETIME_VALUE;
        case 0:
          return VALUE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase getValueCase() {
    return ValueCase.forNumber(valueCase_);
  }

  public static final int STRING_VALUE_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * String type value.
   * </pre>
   *
   * <code>string string_value = 1;</code>
   *
   * @return Whether the stringValue field is set.
   */
  public boolean hasStringValue() {
    return valueCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * String type value.
   * </pre>
   *
   * <code>string string_value = 1;</code>
   *
   * @return The stringValue.
   */
  public java.lang.String getStringValue() {
    java.lang.Object ref = "";
    if (valueCase_ == 1) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (valueCase_ == 1) {
        value_ = s;
      }
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * String type value.
   * </pre>
   *
   * <code>string string_value = 1;</code>
   *
   * @return The bytes for stringValue.
   */
  public com.google.protobuf.ByteString getStringValueBytes() {
    java.lang.Object ref = "";
    if (valueCase_ == 1) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (valueCase_ == 1) {
        value_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INTEGER_VALUE_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * Integer type value.
   * </pre>
   *
   * <code>int64 integer_value = 2;</code>
   *
   * @return Whether the integerValue field is set.
   */
  @java.lang.Override
  public boolean hasIntegerValue() {
    return valueCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * Integer type value.
   * </pre>
   *
   * <code>int64 integer_value = 2;</code>
   *
   * @return The integerValue.
   */
  @java.lang.Override
  public long getIntegerValue() {
    if (valueCase_ == 2) {
      return (java.lang.Long) value_;
    }
    return 0L;
  }

  public static final int DATETIME_VALUE_FIELD_NUMBER = 3;

  /**
   *
   *
   * <pre>
   * Datetime type value.
   * </pre>
   *
   * <code>.google.type.DateTime datetime_value = 3;</code>
   *
   * @return Whether the datetimeValue field is set.
   */
  @java.lang.Override
  public boolean hasDatetimeValue() {
    return valueCase_ == 3;
  }

  /**
   *
   *
   * <pre>
   * Datetime type value.
   * </pre>
   *
   * <code>.google.type.DateTime datetime_value = 3;</code>
   *
   * @return The datetimeValue.
   */
  @java.lang.Override
  public com.google.type.DateTime getDatetimeValue() {
    if (valueCase_ == 3) {
      return (com.google.type.DateTime) value_;
    }
    return com.google.type.DateTime.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * Datetime type value.
   * </pre>
   *
   * <code>.google.type.DateTime datetime_value = 3;</code>
   */
  @java.lang.Override
  public com.google.type.DateTimeOrBuilder getDatetimeValueOrBuilder() {
    if (valueCase_ == 3) {
      return (com.google.type.DateTime) value_;
    }
    return com.google.type.DateTime.getDefaultInstance();
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
    if (valueCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, value_);
    }
    if (valueCase_ == 2) {
      output.writeInt64(2, (long) ((java.lang.Long) value_));
    }
    if (valueCase_ == 3) {
      output.writeMessage(3, (com.google.type.DateTime) value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (valueCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, value_);
    }
    if (valueCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeInt64Size(
              2, (long) ((java.lang.Long) value_));
    }
    if (valueCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              3, (com.google.type.DateTime) value_);
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
    if (!(obj instanceof com.google.cloud.visionai.v1.FacetValue)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.FacetValue other = (com.google.cloud.visionai.v1.FacetValue) obj;

    if (!getValueCase().equals(other.getValueCase())) return false;
    switch (valueCase_) {
      case 1:
        if (!getStringValue().equals(other.getStringValue())) return false;
        break;
      case 2:
        if (getIntegerValue() != other.getIntegerValue()) return false;
        break;
      case 3:
        if (!getDatetimeValue().equals(other.getDatetimeValue())) return false;
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
    switch (valueCase_) {
      case 1:
        hash = (37 * hash) + STRING_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getStringValue().hashCode();
        break;
      case 2:
        hash = (37 * hash) + INTEGER_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getIntegerValue());
        break;
      case 3:
        hash = (37 * hash) + DATETIME_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getDatetimeValue().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.FacetValue parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.FacetValue parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.FacetValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.FacetValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.FacetValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.FacetValue parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.FacetValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.FacetValue parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.FacetValue parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.FacetValue parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.FacetValue parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.FacetValue parseFrom(
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

  public static Builder newBuilder(com.google.cloud.visionai.v1.FacetValue prototype) {
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
   * Definition of a single value with generic type.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.FacetValue}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.FacetValue)
      com.google.cloud.visionai.v1.FacetValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_FacetValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_FacetValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.FacetValue.class,
              com.google.cloud.visionai.v1.FacetValue.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.FacetValue.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (datetimeValueBuilder_ != null) {
        datetimeValueBuilder_.clear();
      }
      valueCase_ = 0;
      value_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_FacetValue_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.FacetValue getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.FacetValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.FacetValue build() {
      com.google.cloud.visionai.v1.FacetValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.FacetValue buildPartial() {
      com.google.cloud.visionai.v1.FacetValue result =
          new com.google.cloud.visionai.v1.FacetValue(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.visionai.v1.FacetValue result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.visionai.v1.FacetValue result) {
      result.valueCase_ = valueCase_;
      result.value_ = this.value_;
      if (valueCase_ == 3 && datetimeValueBuilder_ != null) {
        result.value_ = datetimeValueBuilder_.build();
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
      if (other instanceof com.google.cloud.visionai.v1.FacetValue) {
        return mergeFrom((com.google.cloud.visionai.v1.FacetValue) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.FacetValue other) {
      if (other == com.google.cloud.visionai.v1.FacetValue.getDefaultInstance()) return this;
      switch (other.getValueCase()) {
        case STRING_VALUE:
          {
            valueCase_ = 1;
            value_ = other.value_;
            onChanged();
            break;
          }
        case INTEGER_VALUE:
          {
            setIntegerValue(other.getIntegerValue());
            break;
          }
        case DATETIME_VALUE:
          {
            mergeDatetimeValue(other.getDatetimeValue());
            break;
          }
        case VALUE_NOT_SET:
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
                java.lang.String s = input.readStringRequireUtf8();
                valueCase_ = 1;
                value_ = s;
                break;
              } // case 10
            case 16:
              {
                value_ = input.readInt64();
                valueCase_ = 2;
                break;
              } // case 16
            case 26:
              {
                input.readMessage(getDatetimeValueFieldBuilder().getBuilder(), extensionRegistry);
                valueCase_ = 3;
                break;
              } // case 26
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

    private int valueCase_ = 0;
    private java.lang.Object value_;

    public ValueCase getValueCase() {
      return ValueCase.forNumber(valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * String type value.
     * </pre>
     *
     * <code>string string_value = 1;</code>
     *
     * @return Whether the stringValue field is set.
     */
    @java.lang.Override
    public boolean hasStringValue() {
      return valueCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * String type value.
     * </pre>
     *
     * <code>string string_value = 1;</code>
     *
     * @return The stringValue.
     */
    @java.lang.Override
    public java.lang.String getStringValue() {
      java.lang.Object ref = "";
      if (valueCase_ == 1) {
        ref = value_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valueCase_ == 1) {
          value_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * String type value.
     * </pre>
     *
     * <code>string string_value = 1;</code>
     *
     * @return The bytes for stringValue.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getStringValueBytes() {
      java.lang.Object ref = "";
      if (valueCase_ == 1) {
        ref = value_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (valueCase_ == 1) {
          value_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * String type value.
     * </pre>
     *
     * <code>string string_value = 1;</code>
     *
     * @param value The stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValue(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      valueCase_ = 1;
      value_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * String type value.
     * </pre>
     *
     * <code>string string_value = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStringValue() {
      if (valueCase_ == 1) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * String type value.
     * </pre>
     *
     * <code>string string_value = 1;</code>
     *
     * @param value The bytes for stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValueBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      valueCase_ = 1;
      value_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Integer type value.
     * </pre>
     *
     * <code>int64 integer_value = 2;</code>
     *
     * @return Whether the integerValue field is set.
     */
    public boolean hasIntegerValue() {
      return valueCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * Integer type value.
     * </pre>
     *
     * <code>int64 integer_value = 2;</code>
     *
     * @return The integerValue.
     */
    public long getIntegerValue() {
      if (valueCase_ == 2) {
        return (java.lang.Long) value_;
      }
      return 0L;
    }

    /**
     *
     *
     * <pre>
     * Integer type value.
     * </pre>
     *
     * <code>int64 integer_value = 2;</code>
     *
     * @param value The integerValue to set.
     * @return This builder for chaining.
     */
    public Builder setIntegerValue(long value) {

      valueCase_ = 2;
      value_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Integer type value.
     * </pre>
     *
     * <code>int64 integer_value = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIntegerValue() {
      if (valueCase_ == 2) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.DateTime,
            com.google.type.DateTime.Builder,
            com.google.type.DateTimeOrBuilder>
        datetimeValueBuilder_;

    /**
     *
     *
     * <pre>
     * Datetime type value.
     * </pre>
     *
     * <code>.google.type.DateTime datetime_value = 3;</code>
     *
     * @return Whether the datetimeValue field is set.
     */
    @java.lang.Override
    public boolean hasDatetimeValue() {
      return valueCase_ == 3;
    }

    /**
     *
     *
     * <pre>
     * Datetime type value.
     * </pre>
     *
     * <code>.google.type.DateTime datetime_value = 3;</code>
     *
     * @return The datetimeValue.
     */
    @java.lang.Override
    public com.google.type.DateTime getDatetimeValue() {
      if (datetimeValueBuilder_ == null) {
        if (valueCase_ == 3) {
          return (com.google.type.DateTime) value_;
        }
        return com.google.type.DateTime.getDefaultInstance();
      } else {
        if (valueCase_ == 3) {
          return datetimeValueBuilder_.getMessage();
        }
        return com.google.type.DateTime.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Datetime type value.
     * </pre>
     *
     * <code>.google.type.DateTime datetime_value = 3;</code>
     */
    public Builder setDatetimeValue(com.google.type.DateTime value) {
      if (datetimeValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        datetimeValueBuilder_.setMessage(value);
      }
      valueCase_ = 3;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Datetime type value.
     * </pre>
     *
     * <code>.google.type.DateTime datetime_value = 3;</code>
     */
    public Builder setDatetimeValue(com.google.type.DateTime.Builder builderForValue) {
      if (datetimeValueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        datetimeValueBuilder_.setMessage(builderForValue.build());
      }
      valueCase_ = 3;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Datetime type value.
     * </pre>
     *
     * <code>.google.type.DateTime datetime_value = 3;</code>
     */
    public Builder mergeDatetimeValue(com.google.type.DateTime value) {
      if (datetimeValueBuilder_ == null) {
        if (valueCase_ == 3 && value_ != com.google.type.DateTime.getDefaultInstance()) {
          value_ =
              com.google.type.DateTime.newBuilder((com.google.type.DateTime) value_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        if (valueCase_ == 3) {
          datetimeValueBuilder_.mergeFrom(value);
        } else {
          datetimeValueBuilder_.setMessage(value);
        }
      }
      valueCase_ = 3;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Datetime type value.
     * </pre>
     *
     * <code>.google.type.DateTime datetime_value = 3;</code>
     */
    public Builder clearDatetimeValue() {
      if (datetimeValueBuilder_ == null) {
        if (valueCase_ == 3) {
          valueCase_ = 0;
          value_ = null;
          onChanged();
        }
      } else {
        if (valueCase_ == 3) {
          valueCase_ = 0;
          value_ = null;
        }
        datetimeValueBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Datetime type value.
     * </pre>
     *
     * <code>.google.type.DateTime datetime_value = 3;</code>
     */
    public com.google.type.DateTime.Builder getDatetimeValueBuilder() {
      return getDatetimeValueFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Datetime type value.
     * </pre>
     *
     * <code>.google.type.DateTime datetime_value = 3;</code>
     */
    @java.lang.Override
    public com.google.type.DateTimeOrBuilder getDatetimeValueOrBuilder() {
      if ((valueCase_ == 3) && (datetimeValueBuilder_ != null)) {
        return datetimeValueBuilder_.getMessageOrBuilder();
      } else {
        if (valueCase_ == 3) {
          return (com.google.type.DateTime) value_;
        }
        return com.google.type.DateTime.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Datetime type value.
     * </pre>
     *
     * <code>.google.type.DateTime datetime_value = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.DateTime,
            com.google.type.DateTime.Builder,
            com.google.type.DateTimeOrBuilder>
        getDatetimeValueFieldBuilder() {
      if (datetimeValueBuilder_ == null) {
        if (!(valueCase_ == 3)) {
          value_ = com.google.type.DateTime.getDefaultInstance();
        }
        datetimeValueBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.DateTime,
                com.google.type.DateTime.Builder,
                com.google.type.DateTimeOrBuilder>(
                (com.google.type.DateTime) value_, getParentForChildren(), isClean());
        value_ = null;
      }
      valueCase_ = 3;
      onChanged();
      return datetimeValueBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.FacetValue)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.FacetValue)
  private static final com.google.cloud.visionai.v1.FacetValue DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.FacetValue();
  }

  public static com.google.cloud.visionai.v1.FacetValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FacetValue> PARSER =
      new com.google.protobuf.AbstractParser<FacetValue>() {
        @java.lang.Override
        public FacetValue parsePartialFrom(
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

  public static com.google.protobuf.Parser<FacetValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FacetValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.FacetValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
