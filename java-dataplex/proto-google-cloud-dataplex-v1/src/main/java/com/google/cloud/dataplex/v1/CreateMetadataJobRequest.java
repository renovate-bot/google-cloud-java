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
 * Create metadata job request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.CreateMetadataJobRequest}
 */
public final class CreateMetadataJobRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.CreateMetadataJobRequest)
    CreateMetadataJobRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateMetadataJobRequest.newBuilder() to construct.
  private CreateMetadataJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateMetadataJobRequest() {
    parent_ = "";
    metadataJobId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateMetadataJobRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataplex.v1.CatalogProto
        .internal_static_google_cloud_dataplex_v1_CreateMetadataJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.CatalogProto
        .internal_static_google_cloud_dataplex_v1_CreateMetadataJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.CreateMetadataJobRequest.class,
            com.google.cloud.dataplex.v1.CreateMetadataJobRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The resource name of the parent location, in the format
   * `projects/{project_id_or_number}/locations/{location_id}`
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
   * Required. The resource name of the parent location, in the format
   * `projects/{project_id_or_number}/locations/{location_id}`
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

  public static final int METADATA_JOB_FIELD_NUMBER = 2;
  private com.google.cloud.dataplex.v1.MetadataJob metadataJob_;

  /**
   *
   *
   * <pre>
   * Required. The metadata job resource.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.MetadataJob metadata_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the metadataJob field is set.
   */
  @java.lang.Override
  public boolean hasMetadataJob() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The metadata job resource.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.MetadataJob metadata_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The metadataJob.
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.MetadataJob getMetadataJob() {
    return metadataJob_ == null
        ? com.google.cloud.dataplex.v1.MetadataJob.getDefaultInstance()
        : metadataJob_;
  }

  /**
   *
   *
   * <pre>
   * Required. The metadata job resource.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.MetadataJob metadata_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.MetadataJobOrBuilder getMetadataJobOrBuilder() {
    return metadataJob_ == null
        ? com.google.cloud.dataplex.v1.MetadataJob.getDefaultInstance()
        : metadataJob_;
  }

  public static final int METADATA_JOB_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object metadataJobId_ = "";

  /**
   *
   *
   * <pre>
   * Optional. The metadata job ID. If not provided, a unique ID is generated
   * with the prefix `metadata-job-`.
   * </pre>
   *
   * <code>string metadata_job_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The metadataJobId.
   */
  @java.lang.Override
  public java.lang.String getMetadataJobId() {
    java.lang.Object ref = metadataJobId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metadataJobId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. The metadata job ID. If not provided, a unique ID is generated
   * with the prefix `metadata-job-`.
   * </pre>
   *
   * <code>string metadata_job_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for metadataJobId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMetadataJobIdBytes() {
    java.lang.Object ref = metadataJobId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      metadataJobId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getMetadataJob());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metadataJobId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, metadataJobId_);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getMetadataJob());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metadataJobId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, metadataJobId_);
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.CreateMetadataJobRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.CreateMetadataJobRequest other =
        (com.google.cloud.dataplex.v1.CreateMetadataJobRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasMetadataJob() != other.hasMetadataJob()) return false;
    if (hasMetadataJob()) {
      if (!getMetadataJob().equals(other.getMetadataJob())) return false;
    }
    if (!getMetadataJobId().equals(other.getMetadataJobId())) return false;
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
    if (hasMetadataJob()) {
      hash = (37 * hash) + METADATA_JOB_FIELD_NUMBER;
      hash = (53 * hash) + getMetadataJob().hashCode();
    }
    hash = (37 * hash) + METADATA_JOB_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMetadataJobId().hashCode();
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.CreateMetadataJobRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.CreateMetadataJobRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateMetadataJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.CreateMetadataJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateMetadataJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.CreateMetadataJobRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateMetadataJobRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreateMetadataJobRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateMetadataJobRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreateMetadataJobRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateMetadataJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreateMetadataJobRequest parseFrom(
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
      com.google.cloud.dataplex.v1.CreateMetadataJobRequest prototype) {
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
   * Create metadata job request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.CreateMetadataJobRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.CreateMetadataJobRequest)
      com.google.cloud.dataplex.v1.CreateMetadataJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataplex.v1.CatalogProto
          .internal_static_google_cloud_dataplex_v1_CreateMetadataJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.CatalogProto
          .internal_static_google_cloud_dataplex_v1_CreateMetadataJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.CreateMetadataJobRequest.class,
              com.google.cloud.dataplex.v1.CreateMetadataJobRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.CreateMetadataJobRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMetadataJobFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      metadataJob_ = null;
      if (metadataJobBuilder_ != null) {
        metadataJobBuilder_.dispose();
        metadataJobBuilder_ = null;
      }
      metadataJobId_ = "";
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataplex.v1.CatalogProto
          .internal_static_google_cloud_dataplex_v1_CreateMetadataJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateMetadataJobRequest getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.CreateMetadataJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateMetadataJobRequest build() {
      com.google.cloud.dataplex.v1.CreateMetadataJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateMetadataJobRequest buildPartial() {
      com.google.cloud.dataplex.v1.CreateMetadataJobRequest result =
          new com.google.cloud.dataplex.v1.CreateMetadataJobRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataplex.v1.CreateMetadataJobRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metadataJob_ =
            metadataJobBuilder_ == null ? metadataJob_ : metadataJobBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.metadataJobId_ = metadataJobId_;
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
      if (other instanceof com.google.cloud.dataplex.v1.CreateMetadataJobRequest) {
        return mergeFrom((com.google.cloud.dataplex.v1.CreateMetadataJobRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.CreateMetadataJobRequest other) {
      if (other == com.google.cloud.dataplex.v1.CreateMetadataJobRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasMetadataJob()) {
        mergeMetadataJob(other.getMetadataJob());
      }
      if (!other.getMetadataJobId().isEmpty()) {
        metadataJobId_ = other.metadataJobId_;
        bitField0_ |= 0x00000004;
        onChanged();
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
                input.readMessage(getMetadataJobFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                metadataJobId_ = input.readStringRequireUtf8();
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
     * Required. The resource name of the parent location, in the format
     * `projects/{project_id_or_number}/locations/{location_id}`
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
     * Required. The resource name of the parent location, in the format
     * `projects/{project_id_or_number}/locations/{location_id}`
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
     * Required. The resource name of the parent location, in the format
     * `projects/{project_id_or_number}/locations/{location_id}`
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
     * Required. The resource name of the parent location, in the format
     * `projects/{project_id_or_number}/locations/{location_id}`
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
     * Required. The resource name of the parent location, in the format
     * `projects/{project_id_or_number}/locations/{location_id}`
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

    private com.google.cloud.dataplex.v1.MetadataJob metadataJob_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.MetadataJob,
            com.google.cloud.dataplex.v1.MetadataJob.Builder,
            com.google.cloud.dataplex.v1.MetadataJobOrBuilder>
        metadataJobBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The metadata job resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.MetadataJob metadata_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the metadataJob field is set.
     */
    public boolean hasMetadataJob() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The metadata job resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.MetadataJob metadata_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The metadataJob.
     */
    public com.google.cloud.dataplex.v1.MetadataJob getMetadataJob() {
      if (metadataJobBuilder_ == null) {
        return metadataJob_ == null
            ? com.google.cloud.dataplex.v1.MetadataJob.getDefaultInstance()
            : metadataJob_;
      } else {
        return metadataJobBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The metadata job resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.MetadataJob metadata_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMetadataJob(com.google.cloud.dataplex.v1.MetadataJob value) {
      if (metadataJobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadataJob_ = value;
      } else {
        metadataJobBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The metadata job resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.MetadataJob metadata_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMetadataJob(
        com.google.cloud.dataplex.v1.MetadataJob.Builder builderForValue) {
      if (metadataJobBuilder_ == null) {
        metadataJob_ = builderForValue.build();
      } else {
        metadataJobBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The metadata job resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.MetadataJob metadata_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeMetadataJob(com.google.cloud.dataplex.v1.MetadataJob value) {
      if (metadataJobBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && metadataJob_ != null
            && metadataJob_ != com.google.cloud.dataplex.v1.MetadataJob.getDefaultInstance()) {
          getMetadataJobBuilder().mergeFrom(value);
        } else {
          metadataJob_ = value;
        }
      } else {
        metadataJobBuilder_.mergeFrom(value);
      }
      if (metadataJob_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The metadata job resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.MetadataJob metadata_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearMetadataJob() {
      bitField0_ = (bitField0_ & ~0x00000002);
      metadataJob_ = null;
      if (metadataJobBuilder_ != null) {
        metadataJobBuilder_.dispose();
        metadataJobBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The metadata job resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.MetadataJob metadata_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataplex.v1.MetadataJob.Builder getMetadataJobBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMetadataJobFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The metadata job resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.MetadataJob metadata_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataplex.v1.MetadataJobOrBuilder getMetadataJobOrBuilder() {
      if (metadataJobBuilder_ != null) {
        return metadataJobBuilder_.getMessageOrBuilder();
      } else {
        return metadataJob_ == null
            ? com.google.cloud.dataplex.v1.MetadataJob.getDefaultInstance()
            : metadataJob_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The metadata job resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.MetadataJob metadata_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.MetadataJob,
            com.google.cloud.dataplex.v1.MetadataJob.Builder,
            com.google.cloud.dataplex.v1.MetadataJobOrBuilder>
        getMetadataJobFieldBuilder() {
      if (metadataJobBuilder_ == null) {
        metadataJobBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataplex.v1.MetadataJob,
                com.google.cloud.dataplex.v1.MetadataJob.Builder,
                com.google.cloud.dataplex.v1.MetadataJobOrBuilder>(
                getMetadataJob(), getParentForChildren(), isClean());
        metadataJob_ = null;
      }
      return metadataJobBuilder_;
    }

    private java.lang.Object metadataJobId_ = "";

    /**
     *
     *
     * <pre>
     * Optional. The metadata job ID. If not provided, a unique ID is generated
     * with the prefix `metadata-job-`.
     * </pre>
     *
     * <code>string metadata_job_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The metadataJobId.
     */
    public java.lang.String getMetadataJobId() {
      java.lang.Object ref = metadataJobId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metadataJobId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The metadata job ID. If not provided, a unique ID is generated
     * with the prefix `metadata-job-`.
     * </pre>
     *
     * <code>string metadata_job_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for metadataJobId.
     */
    public com.google.protobuf.ByteString getMetadataJobIdBytes() {
      java.lang.Object ref = metadataJobId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        metadataJobId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The metadata job ID. If not provided, a unique ID is generated
     * with the prefix `metadata-job-`.
     * </pre>
     *
     * <code>string metadata_job_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The metadataJobId to set.
     * @return This builder for chaining.
     */
    public Builder setMetadataJobId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      metadataJobId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The metadata job ID. If not provided, a unique ID is generated
     * with the prefix `metadata-job-`.
     * </pre>
     *
     * <code>string metadata_job_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMetadataJobId() {
      metadataJobId_ = getDefaultInstance().getMetadataJobId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The metadata job ID. If not provided, a unique ID is generated
     * with the prefix `metadata-job-`.
     * </pre>
     *
     * <code>string metadata_job_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for metadataJobId to set.
     * @return This builder for chaining.
     */
    public Builder setMetadataJobIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      metadataJobId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.CreateMetadataJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.CreateMetadataJobRequest)
  private static final com.google.cloud.dataplex.v1.CreateMetadataJobRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.CreateMetadataJobRequest();
  }

  public static com.google.cloud.dataplex.v1.CreateMetadataJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateMetadataJobRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateMetadataJobRequest>() {
        @java.lang.Override
        public CreateMetadataJobRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateMetadataJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateMetadataJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.CreateMetadataJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
