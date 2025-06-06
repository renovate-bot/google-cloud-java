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
// source: google/cloud/dataplex/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataplex.v1;

/**
 *
 *
 * <pre>
 * Create lake request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.CreateLakeRequest}
 */
public final class CreateLakeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.CreateLakeRequest)
    CreateLakeRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateLakeRequest.newBuilder() to construct.
  private CreateLakeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateLakeRequest() {
    parent_ = "";
    lakeId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateLakeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataplex.v1.ServiceProto
        .internal_static_google_cloud_dataplex_v1_CreateLakeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.ServiceProto
        .internal_static_google_cloud_dataplex_v1_CreateLakeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.CreateLakeRequest.class,
            com.google.cloud.dataplex.v1.CreateLakeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The resource name of the lake location, of the form:
   * projects/{project_number}/locations/{location_id}
   * where `location_id` refers to a GCP region.
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
   * Required. The resource name of the lake location, of the form:
   * projects/{project_number}/locations/{location_id}
   * where `location_id` refers to a GCP region.
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

  public static final int LAKE_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object lakeId_ = "";

  /**
   *
   *
   * <pre>
   * Required. Lake identifier.
   * This ID will be used to generate names such as database and dataset names
   * when publishing metadata to Hive Metastore and BigQuery.
   * * Must contain only lowercase letters, numbers and hyphens.
   * * Must start with a letter.
   * * Must end with a number or a letter.
   * * Must be between 1-63 characters.
   * * Must be unique within the customer project / location.
   * </pre>
   *
   * <code>string lake_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The lakeId.
   */
  @java.lang.Override
  public java.lang.String getLakeId() {
    java.lang.Object ref = lakeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lakeId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. Lake identifier.
   * This ID will be used to generate names such as database and dataset names
   * when publishing metadata to Hive Metastore and BigQuery.
   * * Must contain only lowercase letters, numbers and hyphens.
   * * Must start with a letter.
   * * Must end with a number or a letter.
   * * Must be between 1-63 characters.
   * * Must be unique within the customer project / location.
   * </pre>
   *
   * <code>string lake_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for lakeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLakeIdBytes() {
    java.lang.Object ref = lakeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      lakeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAKE_FIELD_NUMBER = 3;
  private com.google.cloud.dataplex.v1.Lake lake_;

  /**
   *
   *
   * <pre>
   * Required. Lake resource
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Lake lake = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the lake field is set.
   */
  @java.lang.Override
  public boolean hasLake() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. Lake resource
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Lake lake = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The lake.
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.Lake getLake() {
    return lake_ == null ? com.google.cloud.dataplex.v1.Lake.getDefaultInstance() : lake_;
  }

  /**
   *
   *
   * <pre>
   * Required. Lake resource
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Lake lake = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.LakeOrBuilder getLakeOrBuilder() {
    return lake_ == null ? com.google.cloud.dataplex.v1.Lake.getDefaultInstance() : lake_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 4;
  private boolean validateOnly_ = false;

  /**
   *
   *
   * <pre>
   * Optional. Only validate the request, but do not perform mutations.
   * The default is false.
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lakeId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lakeId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getLake());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lakeId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lakeId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getLake());
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.CreateLakeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.CreateLakeRequest other =
        (com.google.cloud.dataplex.v1.CreateLakeRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getLakeId().equals(other.getLakeId())) return false;
    if (hasLake() != other.hasLake()) return false;
    if (hasLake()) {
      if (!getLake().equals(other.getLake())) return false;
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
    hash = (37 * hash) + LAKE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLakeId().hashCode();
    if (hasLake()) {
      hash = (37 * hash) + LAKE_FIELD_NUMBER;
      hash = (53 * hash) + getLake().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.CreateLakeRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.CreateLakeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateLakeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.CreateLakeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateLakeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.CreateLakeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateLakeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreateLakeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateLakeRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreateLakeRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateLakeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreateLakeRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataplex.v1.CreateLakeRequest prototype) {
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
   * Create lake request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.CreateLakeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.CreateLakeRequest)
      com.google.cloud.dataplex.v1.CreateLakeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataplex.v1.ServiceProto
          .internal_static_google_cloud_dataplex_v1_CreateLakeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.ServiceProto
          .internal_static_google_cloud_dataplex_v1_CreateLakeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.CreateLakeRequest.class,
              com.google.cloud.dataplex.v1.CreateLakeRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.CreateLakeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getLakeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      lakeId_ = "";
      lake_ = null;
      if (lakeBuilder_ != null) {
        lakeBuilder_.dispose();
        lakeBuilder_ = null;
      }
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataplex.v1.ServiceProto
          .internal_static_google_cloud_dataplex_v1_CreateLakeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateLakeRequest getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.CreateLakeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateLakeRequest build() {
      com.google.cloud.dataplex.v1.CreateLakeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateLakeRequest buildPartial() {
      com.google.cloud.dataplex.v1.CreateLakeRequest result =
          new com.google.cloud.dataplex.v1.CreateLakeRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataplex.v1.CreateLakeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.lakeId_ = lakeId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.lake_ = lakeBuilder_ == null ? lake_ : lakeBuilder_.build();
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
      if (other instanceof com.google.cloud.dataplex.v1.CreateLakeRequest) {
        return mergeFrom((com.google.cloud.dataplex.v1.CreateLakeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.CreateLakeRequest other) {
      if (other == com.google.cloud.dataplex.v1.CreateLakeRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getLakeId().isEmpty()) {
        lakeId_ = other.lakeId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasLake()) {
        mergeLake(other.getLake());
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
                lakeId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getLakeFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. The resource name of the lake location, of the form:
     * projects/{project_number}/locations/{location_id}
     * where `location_id` refers to a GCP region.
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
     * Required. The resource name of the lake location, of the form:
     * projects/{project_number}/locations/{location_id}
     * where `location_id` refers to a GCP region.
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
     * Required. The resource name of the lake location, of the form:
     * projects/{project_number}/locations/{location_id}
     * where `location_id` refers to a GCP region.
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
     * Required. The resource name of the lake location, of the form:
     * projects/{project_number}/locations/{location_id}
     * where `location_id` refers to a GCP region.
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
     * Required. The resource name of the lake location, of the form:
     * projects/{project_number}/locations/{location_id}
     * where `location_id` refers to a GCP region.
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

    private java.lang.Object lakeId_ = "";

    /**
     *
     *
     * <pre>
     * Required. Lake identifier.
     * This ID will be used to generate names such as database and dataset names
     * when publishing metadata to Hive Metastore and BigQuery.
     * * Must contain only lowercase letters, numbers and hyphens.
     * * Must start with a letter.
     * * Must end with a number or a letter.
     * * Must be between 1-63 characters.
     * * Must be unique within the customer project / location.
     * </pre>
     *
     * <code>string lake_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The lakeId.
     */
    public java.lang.String getLakeId() {
      java.lang.Object ref = lakeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lakeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Lake identifier.
     * This ID will be used to generate names such as database and dataset names
     * when publishing metadata to Hive Metastore and BigQuery.
     * * Must contain only lowercase letters, numbers and hyphens.
     * * Must start with a letter.
     * * Must end with a number or a letter.
     * * Must be between 1-63 characters.
     * * Must be unique within the customer project / location.
     * </pre>
     *
     * <code>string lake_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for lakeId.
     */
    public com.google.protobuf.ByteString getLakeIdBytes() {
      java.lang.Object ref = lakeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        lakeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Lake identifier.
     * This ID will be used to generate names such as database and dataset names
     * when publishing metadata to Hive Metastore and BigQuery.
     * * Must contain only lowercase letters, numbers and hyphens.
     * * Must start with a letter.
     * * Must end with a number or a letter.
     * * Must be between 1-63 characters.
     * * Must be unique within the customer project / location.
     * </pre>
     *
     * <code>string lake_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The lakeId to set.
     * @return This builder for chaining.
     */
    public Builder setLakeId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      lakeId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Lake identifier.
     * This ID will be used to generate names such as database and dataset names
     * when publishing metadata to Hive Metastore and BigQuery.
     * * Must contain only lowercase letters, numbers and hyphens.
     * * Must start with a letter.
     * * Must end with a number or a letter.
     * * Must be between 1-63 characters.
     * * Must be unique within the customer project / location.
     * </pre>
     *
     * <code>string lake_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLakeId() {
      lakeId_ = getDefaultInstance().getLakeId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Lake identifier.
     * This ID will be used to generate names such as database and dataset names
     * when publishing metadata to Hive Metastore and BigQuery.
     * * Must contain only lowercase letters, numbers and hyphens.
     * * Must start with a letter.
     * * Must end with a number or a letter.
     * * Must be between 1-63 characters.
     * * Must be unique within the customer project / location.
     * </pre>
     *
     * <code>string lake_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for lakeId to set.
     * @return This builder for chaining.
     */
    public Builder setLakeIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      lakeId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.dataplex.v1.Lake lake_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.Lake,
            com.google.cloud.dataplex.v1.Lake.Builder,
            com.google.cloud.dataplex.v1.LakeOrBuilder>
        lakeBuilder_;

    /**
     *
     *
     * <pre>
     * Required. Lake resource
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Lake lake = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the lake field is set.
     */
    public boolean hasLake() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. Lake resource
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Lake lake = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The lake.
     */
    public com.google.cloud.dataplex.v1.Lake getLake() {
      if (lakeBuilder_ == null) {
        return lake_ == null ? com.google.cloud.dataplex.v1.Lake.getDefaultInstance() : lake_;
      } else {
        return lakeBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Lake resource
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Lake lake = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setLake(com.google.cloud.dataplex.v1.Lake value) {
      if (lakeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lake_ = value;
      } else {
        lakeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Lake resource
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Lake lake = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setLake(com.google.cloud.dataplex.v1.Lake.Builder builderForValue) {
      if (lakeBuilder_ == null) {
        lake_ = builderForValue.build();
      } else {
        lakeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Lake resource
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Lake lake = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeLake(com.google.cloud.dataplex.v1.Lake value) {
      if (lakeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && lake_ != null
            && lake_ != com.google.cloud.dataplex.v1.Lake.getDefaultInstance()) {
          getLakeBuilder().mergeFrom(value);
        } else {
          lake_ = value;
        }
      } else {
        lakeBuilder_.mergeFrom(value);
      }
      if (lake_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Lake resource
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Lake lake = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearLake() {
      bitField0_ = (bitField0_ & ~0x00000004);
      lake_ = null;
      if (lakeBuilder_ != null) {
        lakeBuilder_.dispose();
        lakeBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Lake resource
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Lake lake = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataplex.v1.Lake.Builder getLakeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getLakeFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. Lake resource
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Lake lake = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataplex.v1.LakeOrBuilder getLakeOrBuilder() {
      if (lakeBuilder_ != null) {
        return lakeBuilder_.getMessageOrBuilder();
      } else {
        return lake_ == null ? com.google.cloud.dataplex.v1.Lake.getDefaultInstance() : lake_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Lake resource
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Lake lake = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.Lake,
            com.google.cloud.dataplex.v1.Lake.Builder,
            com.google.cloud.dataplex.v1.LakeOrBuilder>
        getLakeFieldBuilder() {
      if (lakeBuilder_ == null) {
        lakeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataplex.v1.Lake,
                com.google.cloud.dataplex.v1.Lake.Builder,
                com.google.cloud.dataplex.v1.LakeOrBuilder>(
                getLake(), getParentForChildren(), isClean());
        lake_ = null;
      }
      return lakeBuilder_;
    }

    private boolean validateOnly_;

    /**
     *
     *
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
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
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
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
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.CreateLakeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.CreateLakeRequest)
  private static final com.google.cloud.dataplex.v1.CreateLakeRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.CreateLakeRequest();
  }

  public static com.google.cloud.dataplex.v1.CreateLakeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateLakeRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateLakeRequest>() {
        @java.lang.Override
        public CreateLakeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateLakeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateLakeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.CreateLakeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
