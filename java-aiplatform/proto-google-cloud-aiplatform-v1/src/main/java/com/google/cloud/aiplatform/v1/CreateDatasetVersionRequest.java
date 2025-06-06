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
// source: google/cloud/aiplatform/v1/dataset_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [DatasetService.CreateDatasetVersion][google.cloud.aiplatform.v1.DatasetService.CreateDatasetVersion].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.CreateDatasetVersionRequest}
 */
public final class CreateDatasetVersionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.CreateDatasetVersionRequest)
    CreateDatasetVersionRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateDatasetVersionRequest.newBuilder() to construct.
  private CreateDatasetVersionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateDatasetVersionRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateDatasetVersionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.DatasetServiceProto
        .internal_static_google_cloud_aiplatform_v1_CreateDatasetVersionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.DatasetServiceProto
        .internal_static_google_cloud_aiplatform_v1_CreateDatasetVersionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest.class,
            com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The name of the Dataset resource.
   * Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
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
   * Required. The name of the Dataset resource.
   * Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
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

  public static final int DATASET_VERSION_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1.DatasetVersion datasetVersion_;

  /**
   *
   *
   * <pre>
   * Required. The version to be created. The same CMEK policies with the
   * original Dataset will be applied the dataset version. So here we don't need
   * to specify the EncryptionSpecType here.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.DatasetVersion dataset_version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the datasetVersion field is set.
   */
  @java.lang.Override
  public boolean hasDatasetVersion() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The version to be created. The same CMEK policies with the
   * original Dataset will be applied the dataset version. So here we don't need
   * to specify the EncryptionSpecType here.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.DatasetVersion dataset_version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The datasetVersion.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.DatasetVersion getDatasetVersion() {
    return datasetVersion_ == null
        ? com.google.cloud.aiplatform.v1.DatasetVersion.getDefaultInstance()
        : datasetVersion_;
  }

  /**
   *
   *
   * <pre>
   * Required. The version to be created. The same CMEK policies with the
   * original Dataset will be applied the dataset version. So here we don't need
   * to specify the EncryptionSpecType here.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.DatasetVersion dataset_version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.DatasetVersionOrBuilder getDatasetVersionOrBuilder() {
    return datasetVersion_ == null
        ? com.google.cloud.aiplatform.v1.DatasetVersion.getDefaultInstance()
        : datasetVersion_;
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
      output.writeMessage(2, getDatasetVersion());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDatasetVersion());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest other =
        (com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasDatasetVersion() != other.hasDatasetVersion()) return false;
    if (hasDatasetVersion()) {
      if (!getDatasetVersion().equals(other.getDatasetVersion())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasDatasetVersion()) {
      hash = (37 * hash) + DATASET_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getDatasetVersion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest parseFrom(
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
      com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest prototype) {
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
   * Request message for
   * [DatasetService.CreateDatasetVersion][google.cloud.aiplatform.v1.DatasetService.CreateDatasetVersion].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.CreateDatasetVersionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.CreateDatasetVersionRequest)
      com.google.cloud.aiplatform.v1.CreateDatasetVersionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.DatasetServiceProto
          .internal_static_google_cloud_aiplatform_v1_CreateDatasetVersionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.DatasetServiceProto
          .internal_static_google_cloud_aiplatform_v1_CreateDatasetVersionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest.class,
              com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDatasetVersionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      datasetVersion_ = null;
      if (datasetVersionBuilder_ != null) {
        datasetVersionBuilder_.dispose();
        datasetVersionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.DatasetServiceProto
          .internal_static_google_cloud_aiplatform_v1_CreateDatasetVersionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest build() {
      com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest buildPartial() {
      com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest result =
          new com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.datasetVersion_ =
            datasetVersionBuilder_ == null ? datasetVersion_ : datasetVersionBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest other) {
      if (other == com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDatasetVersion()) {
        mergeDatasetVersion(other.getDatasetVersion());
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
                input.readMessage(getDatasetVersionFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";

    /**
     *
     *
     * <pre>
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
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
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
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
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
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
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
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
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
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

    private com.google.cloud.aiplatform.v1.DatasetVersion datasetVersion_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.DatasetVersion,
            com.google.cloud.aiplatform.v1.DatasetVersion.Builder,
            com.google.cloud.aiplatform.v1.DatasetVersionOrBuilder>
        datasetVersionBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The version to be created. The same CMEK policies with the
     * original Dataset will be applied the dataset version. So here we don't need
     * to specify the EncryptionSpecType here.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.DatasetVersion dataset_version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the datasetVersion field is set.
     */
    public boolean hasDatasetVersion() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The version to be created. The same CMEK policies with the
     * original Dataset will be applied the dataset version. So here we don't need
     * to specify the EncryptionSpecType here.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.DatasetVersion dataset_version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The datasetVersion.
     */
    public com.google.cloud.aiplatform.v1.DatasetVersion getDatasetVersion() {
      if (datasetVersionBuilder_ == null) {
        return datasetVersion_ == null
            ? com.google.cloud.aiplatform.v1.DatasetVersion.getDefaultInstance()
            : datasetVersion_;
      } else {
        return datasetVersionBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The version to be created. The same CMEK policies with the
     * original Dataset will be applied the dataset version. So here we don't need
     * to specify the EncryptionSpecType here.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.DatasetVersion dataset_version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDatasetVersion(com.google.cloud.aiplatform.v1.DatasetVersion value) {
      if (datasetVersionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        datasetVersion_ = value;
      } else {
        datasetVersionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The version to be created. The same CMEK policies with the
     * original Dataset will be applied the dataset version. So here we don't need
     * to specify the EncryptionSpecType here.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.DatasetVersion dataset_version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDatasetVersion(
        com.google.cloud.aiplatform.v1.DatasetVersion.Builder builderForValue) {
      if (datasetVersionBuilder_ == null) {
        datasetVersion_ = builderForValue.build();
      } else {
        datasetVersionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The version to be created. The same CMEK policies with the
     * original Dataset will be applied the dataset version. So here we don't need
     * to specify the EncryptionSpecType here.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.DatasetVersion dataset_version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDatasetVersion(com.google.cloud.aiplatform.v1.DatasetVersion value) {
      if (datasetVersionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && datasetVersion_ != null
            && datasetVersion_
                != com.google.cloud.aiplatform.v1.DatasetVersion.getDefaultInstance()) {
          getDatasetVersionBuilder().mergeFrom(value);
        } else {
          datasetVersion_ = value;
        }
      } else {
        datasetVersionBuilder_.mergeFrom(value);
      }
      if (datasetVersion_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The version to be created. The same CMEK policies with the
     * original Dataset will be applied the dataset version. So here we don't need
     * to specify the EncryptionSpecType here.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.DatasetVersion dataset_version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDatasetVersion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      datasetVersion_ = null;
      if (datasetVersionBuilder_ != null) {
        datasetVersionBuilder_.dispose();
        datasetVersionBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The version to be created. The same CMEK policies with the
     * original Dataset will be applied the dataset version. So here we don't need
     * to specify the EncryptionSpecType here.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.DatasetVersion dataset_version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.DatasetVersion.Builder getDatasetVersionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDatasetVersionFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The version to be created. The same CMEK policies with the
     * original Dataset will be applied the dataset version. So here we don't need
     * to specify the EncryptionSpecType here.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.DatasetVersion dataset_version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.DatasetVersionOrBuilder getDatasetVersionOrBuilder() {
      if (datasetVersionBuilder_ != null) {
        return datasetVersionBuilder_.getMessageOrBuilder();
      } else {
        return datasetVersion_ == null
            ? com.google.cloud.aiplatform.v1.DatasetVersion.getDefaultInstance()
            : datasetVersion_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The version to be created. The same CMEK policies with the
     * original Dataset will be applied the dataset version. So here we don't need
     * to specify the EncryptionSpecType here.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.DatasetVersion dataset_version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.DatasetVersion,
            com.google.cloud.aiplatform.v1.DatasetVersion.Builder,
            com.google.cloud.aiplatform.v1.DatasetVersionOrBuilder>
        getDatasetVersionFieldBuilder() {
      if (datasetVersionBuilder_ == null) {
        datasetVersionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.DatasetVersion,
                com.google.cloud.aiplatform.v1.DatasetVersion.Builder,
                com.google.cloud.aiplatform.v1.DatasetVersionOrBuilder>(
                getDatasetVersion(), getParentForChildren(), isClean());
        datasetVersion_ = null;
      }
      return datasetVersionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.CreateDatasetVersionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.CreateDatasetVersionRequest)
  private static final com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest();
  }

  public static com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDatasetVersionRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateDatasetVersionRequest>() {
        @java.lang.Override
        public CreateDatasetVersionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDatasetVersionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDatasetVersionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CreateDatasetVersionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
