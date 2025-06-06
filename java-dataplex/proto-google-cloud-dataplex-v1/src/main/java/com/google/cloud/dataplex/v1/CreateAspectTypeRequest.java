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
// source: google/cloud/dataplex/v1/catalog.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataplex.v1;

/**
 *
 *
 * <pre>
 * Create AspectType Request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.CreateAspectTypeRequest}
 */
public final class CreateAspectTypeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.CreateAspectTypeRequest)
    CreateAspectTypeRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateAspectTypeRequest.newBuilder() to construct.
  private CreateAspectTypeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateAspectTypeRequest() {
    parent_ = "";
    aspectTypeId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateAspectTypeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataplex.v1.CatalogProto
        .internal_static_google_cloud_dataplex_v1_CreateAspectTypeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.CatalogProto
        .internal_static_google_cloud_dataplex_v1_CreateAspectTypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.CreateAspectTypeRequest.class,
            com.google.cloud.dataplex.v1.CreateAspectTypeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The resource name of the AspectType, of the form:
   * projects/{project_number}/locations/{location_id}
   * where `location_id` refers to a Google Cloud region.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The resource name of the AspectType, of the form:
   * projects/{project_number}/locations/{location_id}
   * where `location_id` refers to a Google Cloud region.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASPECT_TYPE_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object aspectTypeId_ = "";

  /**
   *
   *
   * <pre>
   * Required. AspectType identifier.
   * </pre>
   *
   * <code>string aspect_type_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The aspectTypeId.
   */
  @java.lang.Override
  public java.lang.String getAspectTypeId() {
    java.lang.Object ref = aspectTypeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      aspectTypeId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. AspectType identifier.
   * </pre>
   *
   * <code>string aspect_type_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for aspectTypeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAspectTypeIdBytes() {
    java.lang.Object ref = aspectTypeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      aspectTypeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASPECT_TYPE_FIELD_NUMBER = 3;
  private com.google.cloud.dataplex.v1.AspectType aspectType_;

  /**
   *
   *
   * <pre>
   * Required. AspectType Resource.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.AspectType aspect_type = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the aspectType field is set.
   */
  @java.lang.Override
  public boolean hasAspectType() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. AspectType Resource.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.AspectType aspect_type = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The aspectType.
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.AspectType getAspectType() {
    return aspectType_ == null
        ? com.google.cloud.dataplex.v1.AspectType.getDefaultInstance()
        : aspectType_;
  }

  /**
   *
   *
   * <pre>
   * Required. AspectType Resource.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.AspectType aspect_type = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.AspectTypeOrBuilder getAspectTypeOrBuilder() {
    return aspectType_ == null
        ? com.google.cloud.dataplex.v1.AspectType.getDefaultInstance()
        : aspectType_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 4;
  private boolean validateOnly_ = false;

  /**
   *
   *
   * <pre>
   * Optional. The service validates the request without performing any
   * mutations. The default is false.
   * </pre>
   *
   * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(aspectTypeId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, aspectTypeId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getAspectType());
    }
    if (validateOnly_ != false) {
      output.writeBool(4, validateOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(aspectTypeId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, aspectTypeId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getAspectType());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.CreateAspectTypeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.CreateAspectTypeRequest other =
        (com.google.cloud.dataplex.v1.CreateAspectTypeRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getAspectTypeId().equals(other.getAspectTypeId())) return false;
    if (hasAspectType() != other.hasAspectType()) return false;
    if (hasAspectType()) {
      if (!getAspectType().equals(other.getAspectType())) return false;
    }
    if (getValidateOnly() != other.getValidateOnly()) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + ASPECT_TYPE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAspectTypeId().hashCode();
    if (hasAspectType()) {
      hash = (37 * hash) + ASPECT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getAspectType().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.CreateAspectTypeRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.CreateAspectTypeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateAspectTypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.CreateAspectTypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateAspectTypeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.CreateAspectTypeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateAspectTypeRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreateAspectTypeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateAspectTypeRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreateAspectTypeRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateAspectTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreateAspectTypeRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataplex.v1.CreateAspectTypeRequest prototype) {
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
   * Create AspectType Request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.CreateAspectTypeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.CreateAspectTypeRequest)
      com.google.cloud.dataplex.v1.CreateAspectTypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataplex.v1.CatalogProto
          .internal_static_google_cloud_dataplex_v1_CreateAspectTypeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.CatalogProto
          .internal_static_google_cloud_dataplex_v1_CreateAspectTypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.CreateAspectTypeRequest.class,
              com.google.cloud.dataplex.v1.CreateAspectTypeRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.CreateAspectTypeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAspectTypeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      aspectTypeId_ = "";
      aspectType_ = null;
      if (aspectTypeBuilder_ != null) {
        aspectTypeBuilder_.dispose();
        aspectTypeBuilder_ = null;
      }
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataplex.v1.CatalogProto
          .internal_static_google_cloud_dataplex_v1_CreateAspectTypeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateAspectTypeRequest getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.CreateAspectTypeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateAspectTypeRequest build() {
      com.google.cloud.dataplex.v1.CreateAspectTypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateAspectTypeRequest buildPartial() {
      com.google.cloud.dataplex.v1.CreateAspectTypeRequest result =
          new com.google.cloud.dataplex.v1.CreateAspectTypeRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataplex.v1.CreateAspectTypeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.aspectTypeId_ = aspectTypeId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.aspectType_ = aspectTypeBuilder_ == null ? aspectType_ : aspectTypeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.cloud.dataplex.v1.CreateAspectTypeRequest) {
        return mergeFrom((com.google.cloud.dataplex.v1.CreateAspectTypeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.CreateAspectTypeRequest other) {
      if (other == com.google.cloud.dataplex.v1.CreateAspectTypeRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAspectTypeId().isEmpty()) {
        aspectTypeId_ = other.aspectTypeId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasAspectType()) {
        mergeAspectType(other.getAspectType());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                aspectTypeId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getAspectTypeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 32:
              {
                validateOnly_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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

    private java.lang.Object parent_ = "";

    /**
     *
     *
     * <pre>
     * Required. The resource name of the AspectType, of the form:
     * projects/{project_number}/locations/{location_id}
     * where `location_id` refers to a Google Cloud region.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the AspectType, of the form:
     * projects/{project_number}/locations/{location_id}
     * where `location_id` refers to a Google Cloud region.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the AspectType, of the form:
     * projects/{project_number}/locations/{location_id}
     * where `location_id` refers to a Google Cloud region.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the AspectType, of the form:
     * projects/{project_number}/locations/{location_id}
     * where `location_id` refers to a Google Cloud region.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the AspectType, of the form:
     * projects/{project_number}/locations/{location_id}
     * where `location_id` refers to a Google Cloud region.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object aspectTypeId_ = "";

    /**
     *
     *
     * <pre>
     * Required. AspectType identifier.
     * </pre>
     *
     * <code>string aspect_type_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The aspectTypeId.
     */
    public java.lang.String getAspectTypeId() {
      java.lang.Object ref = aspectTypeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        aspectTypeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. AspectType identifier.
     * </pre>
     *
     * <code>string aspect_type_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for aspectTypeId.
     */
    public com.google.protobuf.ByteString getAspectTypeIdBytes() {
      java.lang.Object ref = aspectTypeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        aspectTypeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. AspectType identifier.
     * </pre>
     *
     * <code>string aspect_type_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The aspectTypeId to set.
     * @return This builder for chaining.
     */
    public Builder setAspectTypeId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      aspectTypeId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. AspectType identifier.
     * </pre>
     *
     * <code>string aspect_type_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAspectTypeId() {
      aspectTypeId_ = getDefaultInstance().getAspectTypeId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. AspectType identifier.
     * </pre>
     *
     * <code>string aspect_type_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for aspectTypeId to set.
     * @return This builder for chaining.
     */
    public Builder setAspectTypeIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      aspectTypeId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.dataplex.v1.AspectType aspectType_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.AspectType,
            com.google.cloud.dataplex.v1.AspectType.Builder,
            com.google.cloud.dataplex.v1.AspectTypeOrBuilder>
        aspectTypeBuilder_;

    /**
     *
     *
     * <pre>
     * Required. AspectType Resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.AspectType aspect_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the aspectType field is set.
     */
    public boolean hasAspectType() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. AspectType Resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.AspectType aspect_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The aspectType.
     */
    public com.google.cloud.dataplex.v1.AspectType getAspectType() {
      if (aspectTypeBuilder_ == null) {
        return aspectType_ == null
            ? com.google.cloud.dataplex.v1.AspectType.getDefaultInstance()
            : aspectType_;
      } else {
        return aspectTypeBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. AspectType Resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.AspectType aspect_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAspectType(com.google.cloud.dataplex.v1.AspectType value) {
      if (aspectTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        aspectType_ = value;
      } else {
        aspectTypeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. AspectType Resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.AspectType aspect_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAspectType(com.google.cloud.dataplex.v1.AspectType.Builder builderForValue) {
      if (aspectTypeBuilder_ == null) {
        aspectType_ = builderForValue.build();
      } else {
        aspectTypeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. AspectType Resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.AspectType aspect_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAspectType(com.google.cloud.dataplex.v1.AspectType value) {
      if (aspectTypeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && aspectType_ != null
            && aspectType_ != com.google.cloud.dataplex.v1.AspectType.getDefaultInstance()) {
          getAspectTypeBuilder().mergeFrom(value);
        } else {
          aspectType_ = value;
        }
      } else {
        aspectTypeBuilder_.mergeFrom(value);
      }
      if (aspectType_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. AspectType Resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.AspectType aspect_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAspectType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      aspectType_ = null;
      if (aspectTypeBuilder_ != null) {
        aspectTypeBuilder_.dispose();
        aspectTypeBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. AspectType Resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.AspectType aspect_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataplex.v1.AspectType.Builder getAspectTypeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAspectTypeFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. AspectType Resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.AspectType aspect_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataplex.v1.AspectTypeOrBuilder getAspectTypeOrBuilder() {
      if (aspectTypeBuilder_ != null) {
        return aspectTypeBuilder_.getMessageOrBuilder();
      } else {
        return aspectType_ == null
            ? com.google.cloud.dataplex.v1.AspectType.getDefaultInstance()
            : aspectType_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. AspectType Resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.AspectType aspect_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.AspectType,
            com.google.cloud.dataplex.v1.AspectType.Builder,
            com.google.cloud.dataplex.v1.AspectTypeOrBuilder>
        getAspectTypeFieldBuilder() {
      if (aspectTypeBuilder_ == null) {
        aspectTypeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataplex.v1.AspectType,
                com.google.cloud.dataplex.v1.AspectType.Builder,
                com.google.cloud.dataplex.v1.AspectTypeOrBuilder>(
                getAspectType(), getParentForChildren(), isClean());
        aspectType_ = null;
      }
      return aspectTypeBuilder_;
    }

    private boolean validateOnly_;

    /**
     *
     *
     * <pre>
     * Optional. The service validates the request without performing any
     * mutations. The default is false.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }

    /**
     *
     *
     * <pre>
     * Optional. The service validates the request without performing any
     * mutations. The default is false.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The service validates the request without performing any
     * mutations. The default is false.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000008);
      validateOnly_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.CreateAspectTypeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.CreateAspectTypeRequest)
  private static final com.google.cloud.dataplex.v1.CreateAspectTypeRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.CreateAspectTypeRequest();
  }

  public static com.google.cloud.dataplex.v1.CreateAspectTypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAspectTypeRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateAspectTypeRequest>() {
        @java.lang.Override
        public CreateAspectTypeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAspectTypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAspectTypeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.CreateAspectTypeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
