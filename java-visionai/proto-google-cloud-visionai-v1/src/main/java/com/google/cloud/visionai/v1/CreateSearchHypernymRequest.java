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
 * Request message for creating SearchHypernym.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.CreateSearchHypernymRequest}
 */
public final class CreateSearchHypernymRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.CreateSearchHypernymRequest)
    CreateSearchHypernymRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateSearchHypernymRequest.newBuilder() to construct.
  private CreateSearchHypernymRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateSearchHypernymRequest() {
    parent_ = "";
    searchHypernymId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateSearchHypernymRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_CreateSearchHypernymRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_CreateSearchHypernymRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.CreateSearchHypernymRequest.class,
            com.google.cloud.visionai.v1.CreateSearchHypernymRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The parent resource where this SearchHypernym will be created.
   * Format: `projects/{project_number}/locations/{location}/corpora/{corpus}`
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
   * Required. The parent resource where this SearchHypernym will be created.
   * Format: `projects/{project_number}/locations/{location}/corpora/{corpus}`
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

  public static final int SEARCH_HYPERNYM_FIELD_NUMBER = 2;
  private com.google.cloud.visionai.v1.SearchHypernym searchHypernym_;

  /**
   *
   *
   * <pre>
   * Required. The SearchHypernym to create.
   * </pre>
   *
   * <code>
   * .google.cloud.visionai.v1.SearchHypernym search_hypernym = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the searchHypernym field is set.
   */
  @java.lang.Override
  public boolean hasSearchHypernym() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The SearchHypernym to create.
   * </pre>
   *
   * <code>
   * .google.cloud.visionai.v1.SearchHypernym search_hypernym = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The searchHypernym.
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.SearchHypernym getSearchHypernym() {
    return searchHypernym_ == null
        ? com.google.cloud.visionai.v1.SearchHypernym.getDefaultInstance()
        : searchHypernym_;
  }

  /**
   *
   *
   * <pre>
   * Required. The SearchHypernym to create.
   * </pre>
   *
   * <code>
   * .google.cloud.visionai.v1.SearchHypernym search_hypernym = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.SearchHypernymOrBuilder getSearchHypernymOrBuilder() {
    return searchHypernym_ == null
        ? com.google.cloud.visionai.v1.SearchHypernym.getDefaultInstance()
        : searchHypernym_;
  }

  public static final int SEARCH_HYPERNYM_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object searchHypernymId_ = "";

  /**
   *
   *
   * <pre>
   * Optional. The search hypernym id.
   * If omitted, a random UUID will be generated.
   * </pre>
   *
   * <code>optional string search_hypernym_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the searchHypernymId field is set.
   */
  @java.lang.Override
  public boolean hasSearchHypernymId() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Optional. The search hypernym id.
   * If omitted, a random UUID will be generated.
   * </pre>
   *
   * <code>optional string search_hypernym_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The searchHypernymId.
   */
  @java.lang.Override
  public java.lang.String getSearchHypernymId() {
    java.lang.Object ref = searchHypernymId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      searchHypernymId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. The search hypernym id.
   * If omitted, a random UUID will be generated.
   * </pre>
   *
   * <code>optional string search_hypernym_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for searchHypernymId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSearchHypernymIdBytes() {
    java.lang.Object ref = searchHypernymId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      searchHypernymId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getSearchHypernym());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, searchHypernymId_);
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSearchHypernym());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, searchHypernymId_);
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
    if (!(obj instanceof com.google.cloud.visionai.v1.CreateSearchHypernymRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.CreateSearchHypernymRequest other =
        (com.google.cloud.visionai.v1.CreateSearchHypernymRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasSearchHypernym() != other.hasSearchHypernym()) return false;
    if (hasSearchHypernym()) {
      if (!getSearchHypernym().equals(other.getSearchHypernym())) return false;
    }
    if (hasSearchHypernymId() != other.hasSearchHypernymId()) return false;
    if (hasSearchHypernymId()) {
      if (!getSearchHypernymId().equals(other.getSearchHypernymId())) return false;
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
    if (hasSearchHypernym()) {
      hash = (37 * hash) + SEARCH_HYPERNYM_FIELD_NUMBER;
      hash = (53 * hash) + getSearchHypernym().hashCode();
    }
    if (hasSearchHypernymId()) {
      hash = (37 * hash) + SEARCH_HYPERNYM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSearchHypernymId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.CreateSearchHypernymRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.CreateSearchHypernymRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.CreateSearchHypernymRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.CreateSearchHypernymRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.CreateSearchHypernymRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.CreateSearchHypernymRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.CreateSearchHypernymRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.CreateSearchHypernymRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.CreateSearchHypernymRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.CreateSearchHypernymRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.CreateSearchHypernymRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.CreateSearchHypernymRequest parseFrom(
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
      com.google.cloud.visionai.v1.CreateSearchHypernymRequest prototype) {
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
   * Request message for creating SearchHypernym.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.CreateSearchHypernymRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.CreateSearchHypernymRequest)
      com.google.cloud.visionai.v1.CreateSearchHypernymRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_CreateSearchHypernymRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_CreateSearchHypernymRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.CreateSearchHypernymRequest.class,
              com.google.cloud.visionai.v1.CreateSearchHypernymRequest.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.CreateSearchHypernymRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSearchHypernymFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      searchHypernym_ = null;
      if (searchHypernymBuilder_ != null) {
        searchHypernymBuilder_.dispose();
        searchHypernymBuilder_ = null;
      }
      searchHypernymId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_CreateSearchHypernymRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.CreateSearchHypernymRequest getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.CreateSearchHypernymRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.CreateSearchHypernymRequest build() {
      com.google.cloud.visionai.v1.CreateSearchHypernymRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.CreateSearchHypernymRequest buildPartial() {
      com.google.cloud.visionai.v1.CreateSearchHypernymRequest result =
          new com.google.cloud.visionai.v1.CreateSearchHypernymRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.visionai.v1.CreateSearchHypernymRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.searchHypernym_ =
            searchHypernymBuilder_ == null ? searchHypernym_ : searchHypernymBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.searchHypernymId_ = searchHypernymId_;
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
      if (other instanceof com.google.cloud.visionai.v1.CreateSearchHypernymRequest) {
        return mergeFrom((com.google.cloud.visionai.v1.CreateSearchHypernymRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.CreateSearchHypernymRequest other) {
      if (other == com.google.cloud.visionai.v1.CreateSearchHypernymRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSearchHypernym()) {
        mergeSearchHypernym(other.getSearchHypernym());
      }
      if (other.hasSearchHypernymId()) {
        searchHypernymId_ = other.searchHypernymId_;
        bitField0_ |= 0x00000004;
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getSearchHypernymFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                searchHypernymId_ = input.readStringRequireUtf8();
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

    private java.lang.Object parent_ = "";

    /**
     *
     *
     * <pre>
     * Required. The parent resource where this SearchHypernym will be created.
     * Format: `projects/{project_number}/locations/{location}/corpora/{corpus}`
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
     * Required. The parent resource where this SearchHypernym will be created.
     * Format: `projects/{project_number}/locations/{location}/corpora/{corpus}`
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
     * Required. The parent resource where this SearchHypernym will be created.
     * Format: `projects/{project_number}/locations/{location}/corpora/{corpus}`
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
     * Required. The parent resource where this SearchHypernym will be created.
     * Format: `projects/{project_number}/locations/{location}/corpora/{corpus}`
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
     * Required. The parent resource where this SearchHypernym will be created.
     * Format: `projects/{project_number}/locations/{location}/corpora/{corpus}`
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

    private com.google.cloud.visionai.v1.SearchHypernym searchHypernym_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.SearchHypernym,
            com.google.cloud.visionai.v1.SearchHypernym.Builder,
            com.google.cloud.visionai.v1.SearchHypernymOrBuilder>
        searchHypernymBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The SearchHypernym to create.
     * </pre>
     *
     * <code>
     * .google.cloud.visionai.v1.SearchHypernym search_hypernym = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the searchHypernym field is set.
     */
    public boolean hasSearchHypernym() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The SearchHypernym to create.
     * </pre>
     *
     * <code>
     * .google.cloud.visionai.v1.SearchHypernym search_hypernym = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The searchHypernym.
     */
    public com.google.cloud.visionai.v1.SearchHypernym getSearchHypernym() {
      if (searchHypernymBuilder_ == null) {
        return searchHypernym_ == null
            ? com.google.cloud.visionai.v1.SearchHypernym.getDefaultInstance()
            : searchHypernym_;
      } else {
        return searchHypernymBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The SearchHypernym to create.
     * </pre>
     *
     * <code>
     * .google.cloud.visionai.v1.SearchHypernym search_hypernym = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSearchHypernym(com.google.cloud.visionai.v1.SearchHypernym value) {
      if (searchHypernymBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        searchHypernym_ = value;
      } else {
        searchHypernymBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The SearchHypernym to create.
     * </pre>
     *
     * <code>
     * .google.cloud.visionai.v1.SearchHypernym search_hypernym = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSearchHypernym(
        com.google.cloud.visionai.v1.SearchHypernym.Builder builderForValue) {
      if (searchHypernymBuilder_ == null) {
        searchHypernym_ = builderForValue.build();
      } else {
        searchHypernymBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The SearchHypernym to create.
     * </pre>
     *
     * <code>
     * .google.cloud.visionai.v1.SearchHypernym search_hypernym = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeSearchHypernym(com.google.cloud.visionai.v1.SearchHypernym value) {
      if (searchHypernymBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && searchHypernym_ != null
            && searchHypernym_
                != com.google.cloud.visionai.v1.SearchHypernym.getDefaultInstance()) {
          getSearchHypernymBuilder().mergeFrom(value);
        } else {
          searchHypernym_ = value;
        }
      } else {
        searchHypernymBuilder_.mergeFrom(value);
      }
      if (searchHypernym_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The SearchHypernym to create.
     * </pre>
     *
     * <code>
     * .google.cloud.visionai.v1.SearchHypernym search_hypernym = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearSearchHypernym() {
      bitField0_ = (bitField0_ & ~0x00000002);
      searchHypernym_ = null;
      if (searchHypernymBuilder_ != null) {
        searchHypernymBuilder_.dispose();
        searchHypernymBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The SearchHypernym to create.
     * </pre>
     *
     * <code>
     * .google.cloud.visionai.v1.SearchHypernym search_hypernym = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.visionai.v1.SearchHypernym.Builder getSearchHypernymBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSearchHypernymFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The SearchHypernym to create.
     * </pre>
     *
     * <code>
     * .google.cloud.visionai.v1.SearchHypernym search_hypernym = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.visionai.v1.SearchHypernymOrBuilder getSearchHypernymOrBuilder() {
      if (searchHypernymBuilder_ != null) {
        return searchHypernymBuilder_.getMessageOrBuilder();
      } else {
        return searchHypernym_ == null
            ? com.google.cloud.visionai.v1.SearchHypernym.getDefaultInstance()
            : searchHypernym_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The SearchHypernym to create.
     * </pre>
     *
     * <code>
     * .google.cloud.visionai.v1.SearchHypernym search_hypernym = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.SearchHypernym,
            com.google.cloud.visionai.v1.SearchHypernym.Builder,
            com.google.cloud.visionai.v1.SearchHypernymOrBuilder>
        getSearchHypernymFieldBuilder() {
      if (searchHypernymBuilder_ == null) {
        searchHypernymBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.visionai.v1.SearchHypernym,
                com.google.cloud.visionai.v1.SearchHypernym.Builder,
                com.google.cloud.visionai.v1.SearchHypernymOrBuilder>(
                getSearchHypernym(), getParentForChildren(), isClean());
        searchHypernym_ = null;
      }
      return searchHypernymBuilder_;
    }

    private java.lang.Object searchHypernymId_ = "";

    /**
     *
     *
     * <pre>
     * Optional. The search hypernym id.
     * If omitted, a random UUID will be generated.
     * </pre>
     *
     * <code>optional string search_hypernym_id = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the searchHypernymId field is set.
     */
    public boolean hasSearchHypernymId() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Optional. The search hypernym id.
     * If omitted, a random UUID will be generated.
     * </pre>
     *
     * <code>optional string search_hypernym_id = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The searchHypernymId.
     */
    public java.lang.String getSearchHypernymId() {
      java.lang.Object ref = searchHypernymId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        searchHypernymId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The search hypernym id.
     * If omitted, a random UUID will be generated.
     * </pre>
     *
     * <code>optional string search_hypernym_id = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The bytes for searchHypernymId.
     */
    public com.google.protobuf.ByteString getSearchHypernymIdBytes() {
      java.lang.Object ref = searchHypernymId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        searchHypernymId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The search hypernym id.
     * If omitted, a random UUID will be generated.
     * </pre>
     *
     * <code>optional string search_hypernym_id = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The searchHypernymId to set.
     * @return This builder for chaining.
     */
    public Builder setSearchHypernymId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      searchHypernymId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The search hypernym id.
     * If omitted, a random UUID will be generated.
     * </pre>
     *
     * <code>optional string search_hypernym_id = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSearchHypernymId() {
      searchHypernymId_ = getDefaultInstance().getSearchHypernymId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The search hypernym id.
     * If omitted, a random UUID will be generated.
     * </pre>
     *
     * <code>optional string search_hypernym_id = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The bytes for searchHypernymId to set.
     * @return This builder for chaining.
     */
    public Builder setSearchHypernymIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      searchHypernymId_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.CreateSearchHypernymRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.CreateSearchHypernymRequest)
  private static final com.google.cloud.visionai.v1.CreateSearchHypernymRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.CreateSearchHypernymRequest();
  }

  public static com.google.cloud.visionai.v1.CreateSearchHypernymRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSearchHypernymRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateSearchHypernymRequest>() {
        @java.lang.Override
        public CreateSearchHypernymRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSearchHypernymRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSearchHypernymRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.CreateSearchHypernymRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
