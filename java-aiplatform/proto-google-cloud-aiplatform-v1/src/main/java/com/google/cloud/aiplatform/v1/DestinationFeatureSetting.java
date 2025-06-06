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
// source: google/cloud/aiplatform/v1/featurestore_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

/** Protobuf type {@code google.cloud.aiplatform.v1.DestinationFeatureSetting} */
public final class DestinationFeatureSetting extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.DestinationFeatureSetting)
    DestinationFeatureSettingOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use DestinationFeatureSetting.newBuilder() to construct.
  private DestinationFeatureSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DestinationFeatureSetting() {
    featureId_ = "";
    destinationField_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DestinationFeatureSetting();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto
        .internal_static_google_cloud_aiplatform_v1_DestinationFeatureSetting_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto
        .internal_static_google_cloud_aiplatform_v1_DestinationFeatureSetting_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.DestinationFeatureSetting.class,
            com.google.cloud.aiplatform.v1.DestinationFeatureSetting.Builder.class);
  }

  public static final int FEATURE_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object featureId_ = "";

  /**
   *
   *
   * <pre>
   * Required. The ID of the Feature to apply the setting to.
   * </pre>
   *
   * <code>string feature_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The featureId.
   */
  @java.lang.Override
  public java.lang.String getFeatureId() {
    java.lang.Object ref = featureId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      featureId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The ID of the Feature to apply the setting to.
   * </pre>
   *
   * <code>string feature_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for featureId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFeatureIdBytes() {
    java.lang.Object ref = featureId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      featureId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESTINATION_FIELD_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object destinationField_ = "";

  /**
   *
   *
   * <pre>
   * Specify the field name in the export destination. If not specified,
   * Feature ID is used.
   * </pre>
   *
   * <code>string destination_field = 2;</code>
   *
   * @return The destinationField.
   */
  @java.lang.Override
  public java.lang.String getDestinationField() {
    java.lang.Object ref = destinationField_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destinationField_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Specify the field name in the export destination. If not specified,
   * Feature ID is used.
   * </pre>
   *
   * <code>string destination_field = 2;</code>
   *
   * @return The bytes for destinationField.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDestinationFieldBytes() {
    java.lang.Object ref = destinationField_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      destinationField_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(featureId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, featureId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationField_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, destinationField_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(featureId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, featureId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationField_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, destinationField_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.DestinationFeatureSetting)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.DestinationFeatureSetting other =
        (com.google.cloud.aiplatform.v1.DestinationFeatureSetting) obj;

    if (!getFeatureId().equals(other.getFeatureId())) return false;
    if (!getDestinationField().equals(other.getDestinationField())) return false;
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
    hash = (37 * hash) + FEATURE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFeatureId().hashCode();
    hash = (37 * hash) + DESTINATION_FIELD_FIELD_NUMBER;
    hash = (53 * hash) + getDestinationField().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.DestinationFeatureSetting parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.DestinationFeatureSetting parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.DestinationFeatureSetting parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.DestinationFeatureSetting parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.DestinationFeatureSetting parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.DestinationFeatureSetting parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.DestinationFeatureSetting parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.DestinationFeatureSetting parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.DestinationFeatureSetting parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.DestinationFeatureSetting parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.DestinationFeatureSetting parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.DestinationFeatureSetting parseFrom(
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
      com.google.cloud.aiplatform.v1.DestinationFeatureSetting prototype) {
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

  /** Protobuf type {@code google.cloud.aiplatform.v1.DestinationFeatureSetting} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.DestinationFeatureSetting)
      com.google.cloud.aiplatform.v1.DestinationFeatureSettingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1_DestinationFeatureSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1_DestinationFeatureSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.DestinationFeatureSetting.class,
              com.google.cloud.aiplatform.v1.DestinationFeatureSetting.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.DestinationFeatureSetting.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      featureId_ = "";
      destinationField_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1_DestinationFeatureSetting_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.DestinationFeatureSetting getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.DestinationFeatureSetting.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.DestinationFeatureSetting build() {
      com.google.cloud.aiplatform.v1.DestinationFeatureSetting result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.DestinationFeatureSetting buildPartial() {
      com.google.cloud.aiplatform.v1.DestinationFeatureSetting result =
          new com.google.cloud.aiplatform.v1.DestinationFeatureSetting(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.DestinationFeatureSetting result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.featureId_ = featureId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.destinationField_ = destinationField_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.DestinationFeatureSetting) {
        return mergeFrom((com.google.cloud.aiplatform.v1.DestinationFeatureSetting) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.DestinationFeatureSetting other) {
      if (other == com.google.cloud.aiplatform.v1.DestinationFeatureSetting.getDefaultInstance())
        return this;
      if (!other.getFeatureId().isEmpty()) {
        featureId_ = other.featureId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDestinationField().isEmpty()) {
        destinationField_ = other.destinationField_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                featureId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                destinationField_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
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

    private java.lang.Object featureId_ = "";

    /**
     *
     *
     * <pre>
     * Required. The ID of the Feature to apply the setting to.
     * </pre>
     *
     * <code>string feature_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The featureId.
     */
    public java.lang.String getFeatureId() {
      java.lang.Object ref = featureId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        featureId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The ID of the Feature to apply the setting to.
     * </pre>
     *
     * <code>string feature_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for featureId.
     */
    public com.google.protobuf.ByteString getFeatureIdBytes() {
      java.lang.Object ref = featureId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        featureId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The ID of the Feature to apply the setting to.
     * </pre>
     *
     * <code>string feature_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The featureId to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      featureId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The ID of the Feature to apply the setting to.
     * </pre>
     *
     * <code>string feature_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFeatureId() {
      featureId_ = getDefaultInstance().getFeatureId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The ID of the Feature to apply the setting to.
     * </pre>
     *
     * <code>string feature_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for featureId to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      featureId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object destinationField_ = "";

    /**
     *
     *
     * <pre>
     * Specify the field name in the export destination. If not specified,
     * Feature ID is used.
     * </pre>
     *
     * <code>string destination_field = 2;</code>
     *
     * @return The destinationField.
     */
    public java.lang.String getDestinationField() {
      java.lang.Object ref = destinationField_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destinationField_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Specify the field name in the export destination. If not specified,
     * Feature ID is used.
     * </pre>
     *
     * <code>string destination_field = 2;</code>
     *
     * @return The bytes for destinationField.
     */
    public com.google.protobuf.ByteString getDestinationFieldBytes() {
      java.lang.Object ref = destinationField_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        destinationField_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Specify the field name in the export destination. If not specified,
     * Feature ID is used.
     * </pre>
     *
     * <code>string destination_field = 2;</code>
     *
     * @param value The destinationField to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationField(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      destinationField_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Specify the field name in the export destination. If not specified,
     * Feature ID is used.
     * </pre>
     *
     * <code>string destination_field = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDestinationField() {
      destinationField_ = getDefaultInstance().getDestinationField();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Specify the field name in the export destination. If not specified,
     * Feature ID is used.
     * </pre>
     *
     * <code>string destination_field = 2;</code>
     *
     * @param value The bytes for destinationField to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationFieldBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      destinationField_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.DestinationFeatureSetting)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.DestinationFeatureSetting)
  private static final com.google.cloud.aiplatform.v1.DestinationFeatureSetting DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.DestinationFeatureSetting();
  }

  public static com.google.cloud.aiplatform.v1.DestinationFeatureSetting getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DestinationFeatureSetting> PARSER =
      new com.google.protobuf.AbstractParser<DestinationFeatureSetting>() {
        @java.lang.Override
        public DestinationFeatureSetting parsePartialFrom(
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

  public static com.google.protobuf.Parser<DestinationFeatureSetting> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DestinationFeatureSetting> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.DestinationFeatureSetting getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
