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
 * Annotation provided by users.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.UserSpecifiedAnnotation}
 */
public final class UserSpecifiedAnnotation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.UserSpecifiedAnnotation)
    UserSpecifiedAnnotationOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UserSpecifiedAnnotation.newBuilder() to construct.
  private UserSpecifiedAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UserSpecifiedAnnotation() {
    key_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UserSpecifiedAnnotation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_UserSpecifiedAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_UserSpecifiedAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.UserSpecifiedAnnotation.class,
            com.google.cloud.visionai.v1.UserSpecifiedAnnotation.Builder.class);
  }

  private int bitField0_;
  public static final int KEY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object key_ = "";

  /**
   *
   *
   * <pre>
   * Required. Key of the annotation. The key must be set with type by
   * CreateDataSchema.
   * </pre>
   *
   * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. Key of the annotation. The key must be set with type by
   * CreateDataSchema.
   * </pre>
   *
   * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.google.cloud.visionai.v1.AnnotationValue value_;

  /**
   *
   *
   * <pre>
   * Value of the annotation. The value must be able to convert
   * to the type according to the data schema.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.AnnotationValue value = 2;</code>
   *
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Value of the annotation. The value must be able to convert
   * to the type according to the data schema.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.AnnotationValue value = 2;</code>
   *
   * @return The value.
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.AnnotationValue getValue() {
    return value_ == null
        ? com.google.cloud.visionai.v1.AnnotationValue.getDefaultInstance()
        : value_;
  }

  /**
   *
   *
   * <pre>
   * Value of the annotation. The value must be able to convert
   * to the type according to the data schema.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.AnnotationValue value = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.AnnotationValueOrBuilder getValueOrBuilder() {
    return value_ == null
        ? com.google.cloud.visionai.v1.AnnotationValue.getDefaultInstance()
        : value_;
  }

  public static final int PARTITION_FIELD_NUMBER = 3;
  private com.google.cloud.visionai.v1.Partition partition_;

  /**
   *
   *
   * <pre>
   * Partition information in time and space for the sub-asset level annotation.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.Partition partition = 3;</code>
   *
   * @return Whether the partition field is set.
   */
  @java.lang.Override
  public boolean hasPartition() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Partition information in time and space for the sub-asset level annotation.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.Partition partition = 3;</code>
   *
   * @return The partition.
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.Partition getPartition() {
    return partition_ == null
        ? com.google.cloud.visionai.v1.Partition.getDefaultInstance()
        : partition_;
  }

  /**
   *
   *
   * <pre>
   * Partition information in time and space for the sub-asset level annotation.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.Partition partition = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.PartitionOrBuilder getPartitionOrBuilder() {
    return partition_ == null
        ? com.google.cloud.visionai.v1.Partition.getDefaultInstance()
        : partition_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getValue());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getPartition());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getValue());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getPartition());
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
    if (!(obj instanceof com.google.cloud.visionai.v1.UserSpecifiedAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.UserSpecifiedAnnotation other =
        (com.google.cloud.visionai.v1.UserSpecifiedAnnotation) obj;

    if (!getKey().equals(other.getKey())) return false;
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue().equals(other.getValue())) return false;
    }
    if (hasPartition() != other.hasPartition()) return false;
    if (hasPartition()) {
      if (!getPartition().equals(other.getPartition())) return false;
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    if (hasPartition()) {
      hash = (37 * hash) + PARTITION_FIELD_NUMBER;
      hash = (53 * hash) + getPartition().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.UserSpecifiedAnnotation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.UserSpecifiedAnnotation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UserSpecifiedAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.UserSpecifiedAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UserSpecifiedAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.UserSpecifiedAnnotation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UserSpecifiedAnnotation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.UserSpecifiedAnnotation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UserSpecifiedAnnotation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.UserSpecifiedAnnotation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UserSpecifiedAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.UserSpecifiedAnnotation parseFrom(
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

  public static Builder newBuilder(com.google.cloud.visionai.v1.UserSpecifiedAnnotation prototype) {
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
   * Annotation provided by users.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.UserSpecifiedAnnotation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.UserSpecifiedAnnotation)
      com.google.cloud.visionai.v1.UserSpecifiedAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_UserSpecifiedAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_UserSpecifiedAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.UserSpecifiedAnnotation.class,
              com.google.cloud.visionai.v1.UserSpecifiedAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.UserSpecifiedAnnotation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getValueFieldBuilder();
        getPartitionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      key_ = "";
      value_ = null;
      if (valueBuilder_ != null) {
        valueBuilder_.dispose();
        valueBuilder_ = null;
      }
      partition_ = null;
      if (partitionBuilder_ != null) {
        partitionBuilder_.dispose();
        partitionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_UserSpecifiedAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.UserSpecifiedAnnotation getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.UserSpecifiedAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.UserSpecifiedAnnotation build() {
      com.google.cloud.visionai.v1.UserSpecifiedAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.UserSpecifiedAnnotation buildPartial() {
      com.google.cloud.visionai.v1.UserSpecifiedAnnotation result =
          new com.google.cloud.visionai.v1.UserSpecifiedAnnotation(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.visionai.v1.UserSpecifiedAnnotation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.key_ = key_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.value_ = valueBuilder_ == null ? value_ : valueBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.partition_ = partitionBuilder_ == null ? partition_ : partitionBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.visionai.v1.UserSpecifiedAnnotation) {
        return mergeFrom((com.google.cloud.visionai.v1.UserSpecifiedAnnotation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.UserSpecifiedAnnotation other) {
      if (other == com.google.cloud.visionai.v1.UserSpecifiedAnnotation.getDefaultInstance())
        return this;
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
      }
      if (other.hasPartition()) {
        mergePartition(other.getPartition());
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
                key_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getValueFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getPartitionFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
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

    private int bitField0_;

    private java.lang.Object key_ = "";

    /**
     *
     *
     * <pre>
     * Required. Key of the annotation. The key must be set with type by
     * CreateDataSchema.
     * </pre>
     *
     * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Key of the annotation. The key must be set with type by
     * CreateDataSchema.
     * </pre>
     *
     * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Key of the annotation. The key must be set with type by
     * CreateDataSchema.
     * </pre>
     *
     * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Key of the annotation. The key must be set with type by
     * CreateDataSchema.
     * </pre>
     *
     * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      key_ = getDefaultInstance().getKey();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Key of the annotation. The key must be set with type by
     * CreateDataSchema.
     * </pre>
     *
     * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.visionai.v1.AnnotationValue value_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.AnnotationValue,
            com.google.cloud.visionai.v1.AnnotationValue.Builder,
            com.google.cloud.visionai.v1.AnnotationValueOrBuilder>
        valueBuilder_;

    /**
     *
     *
     * <pre>
     * Value of the annotation. The value must be able to convert
     * to the type according to the data schema.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.AnnotationValue value = 2;</code>
     *
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Value of the annotation. The value must be able to convert
     * to the type according to the data schema.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.AnnotationValue value = 2;</code>
     *
     * @return The value.
     */
    public com.google.cloud.visionai.v1.AnnotationValue getValue() {
      if (valueBuilder_ == null) {
        return value_ == null
            ? com.google.cloud.visionai.v1.AnnotationValue.getDefaultInstance()
            : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Value of the annotation. The value must be able to convert
     * to the type according to the data schema.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.AnnotationValue value = 2;</code>
     */
    public Builder setValue(com.google.cloud.visionai.v1.AnnotationValue value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
      } else {
        valueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Value of the annotation. The value must be able to convert
     * to the type according to the data schema.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.AnnotationValue value = 2;</code>
     */
    public Builder setValue(com.google.cloud.visionai.v1.AnnotationValue.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Value of the annotation. The value must be able to convert
     * to the type according to the data schema.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.AnnotationValue value = 2;</code>
     */
    public Builder mergeValue(com.google.cloud.visionai.v1.AnnotationValue value) {
      if (valueBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && value_ != null
            && value_ != com.google.cloud.visionai.v1.AnnotationValue.getDefaultInstance()) {
          getValueBuilder().mergeFrom(value);
        } else {
          value_ = value;
        }
      } else {
        valueBuilder_.mergeFrom(value);
      }
      if (value_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Value of the annotation. The value must be able to convert
     * to the type according to the data schema.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.AnnotationValue value = 2;</code>
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      value_ = null;
      if (valueBuilder_ != null) {
        valueBuilder_.dispose();
        valueBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Value of the annotation. The value must be able to convert
     * to the type according to the data schema.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.AnnotationValue value = 2;</code>
     */
    public com.google.cloud.visionai.v1.AnnotationValue.Builder getValueBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Value of the annotation. The value must be able to convert
     * to the type according to the data schema.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.AnnotationValue value = 2;</code>
     */
    public com.google.cloud.visionai.v1.AnnotationValueOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null
            ? com.google.cloud.visionai.v1.AnnotationValue.getDefaultInstance()
            : value_;
      }
    }

    /**
     *
     *
     * <pre>
     * Value of the annotation. The value must be able to convert
     * to the type according to the data schema.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.AnnotationValue value = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.AnnotationValue,
            com.google.cloud.visionai.v1.AnnotationValue.Builder,
            com.google.cloud.visionai.v1.AnnotationValueOrBuilder>
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.visionai.v1.AnnotationValue,
                com.google.cloud.visionai.v1.AnnotationValue.Builder,
                com.google.cloud.visionai.v1.AnnotationValueOrBuilder>(
                getValue(), getParentForChildren(), isClean());
        value_ = null;
      }
      return valueBuilder_;
    }

    private com.google.cloud.visionai.v1.Partition partition_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.Partition,
            com.google.cloud.visionai.v1.Partition.Builder,
            com.google.cloud.visionai.v1.PartitionOrBuilder>
        partitionBuilder_;

    /**
     *
     *
     * <pre>
     * Partition information in time and space for the sub-asset level annotation.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Partition partition = 3;</code>
     *
     * @return Whether the partition field is set.
     */
    public boolean hasPartition() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Partition information in time and space for the sub-asset level annotation.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Partition partition = 3;</code>
     *
     * @return The partition.
     */
    public com.google.cloud.visionai.v1.Partition getPartition() {
      if (partitionBuilder_ == null) {
        return partition_ == null
            ? com.google.cloud.visionai.v1.Partition.getDefaultInstance()
            : partition_;
      } else {
        return partitionBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Partition information in time and space for the sub-asset level annotation.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Partition partition = 3;</code>
     */
    public Builder setPartition(com.google.cloud.visionai.v1.Partition value) {
      if (partitionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        partition_ = value;
      } else {
        partitionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Partition information in time and space for the sub-asset level annotation.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Partition partition = 3;</code>
     */
    public Builder setPartition(com.google.cloud.visionai.v1.Partition.Builder builderForValue) {
      if (partitionBuilder_ == null) {
        partition_ = builderForValue.build();
      } else {
        partitionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Partition information in time and space for the sub-asset level annotation.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Partition partition = 3;</code>
     */
    public Builder mergePartition(com.google.cloud.visionai.v1.Partition value) {
      if (partitionBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && partition_ != null
            && partition_ != com.google.cloud.visionai.v1.Partition.getDefaultInstance()) {
          getPartitionBuilder().mergeFrom(value);
        } else {
          partition_ = value;
        }
      } else {
        partitionBuilder_.mergeFrom(value);
      }
      if (partition_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Partition information in time and space for the sub-asset level annotation.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Partition partition = 3;</code>
     */
    public Builder clearPartition() {
      bitField0_ = (bitField0_ & ~0x00000004);
      partition_ = null;
      if (partitionBuilder_ != null) {
        partitionBuilder_.dispose();
        partitionBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Partition information in time and space for the sub-asset level annotation.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Partition partition = 3;</code>
     */
    public com.google.cloud.visionai.v1.Partition.Builder getPartitionBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPartitionFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Partition information in time and space for the sub-asset level annotation.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Partition partition = 3;</code>
     */
    public com.google.cloud.visionai.v1.PartitionOrBuilder getPartitionOrBuilder() {
      if (partitionBuilder_ != null) {
        return partitionBuilder_.getMessageOrBuilder();
      } else {
        return partition_ == null
            ? com.google.cloud.visionai.v1.Partition.getDefaultInstance()
            : partition_;
      }
    }

    /**
     *
     *
     * <pre>
     * Partition information in time and space for the sub-asset level annotation.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Partition partition = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.Partition,
            com.google.cloud.visionai.v1.Partition.Builder,
            com.google.cloud.visionai.v1.PartitionOrBuilder>
        getPartitionFieldBuilder() {
      if (partitionBuilder_ == null) {
        partitionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.visionai.v1.Partition,
                com.google.cloud.visionai.v1.Partition.Builder,
                com.google.cloud.visionai.v1.PartitionOrBuilder>(
                getPartition(), getParentForChildren(), isClean());
        partition_ = null;
      }
      return partitionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.UserSpecifiedAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.UserSpecifiedAnnotation)
  private static final com.google.cloud.visionai.v1.UserSpecifiedAnnotation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.UserSpecifiedAnnotation();
  }

  public static com.google.cloud.visionai.v1.UserSpecifiedAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserSpecifiedAnnotation> PARSER =
      new com.google.protobuf.AbstractParser<UserSpecifiedAnnotation>() {
        @java.lang.Override
        public UserSpecifiedAnnotation parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserSpecifiedAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserSpecifiedAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.UserSpecifiedAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
