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
 * Create EntryGroup Request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.CreateEntryGroupRequest}
 */
public final class CreateEntryGroupRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.CreateEntryGroupRequest)
    CreateEntryGroupRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateEntryGroupRequest.newBuilder() to construct.
  private CreateEntryGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateEntryGroupRequest() {
    parent_ = "";
    entryGroupId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateEntryGroupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataplex.v1.CatalogProto
        .internal_static_google_cloud_dataplex_v1_CreateEntryGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.CatalogProto
        .internal_static_google_cloud_dataplex_v1_CreateEntryGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.CreateEntryGroupRequest.class,
            com.google.cloud.dataplex.v1.CreateEntryGroupRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The resource name of the entryGroup, of the form:
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
   * Required. The resource name of the entryGroup, of the form:
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

  public static final int ENTRY_GROUP_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object entryGroupId_ = "";

  /**
   *
   *
   * <pre>
   * Required. EntryGroup identifier.
   * </pre>
   *
   * <code>string entry_group_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The entryGroupId.
   */
  @java.lang.Override
  public java.lang.String getEntryGroupId() {
    java.lang.Object ref = entryGroupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entryGroupId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. EntryGroup identifier.
   * </pre>
   *
   * <code>string entry_group_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for entryGroupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEntryGroupIdBytes() {
    java.lang.Object ref = entryGroupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      entryGroupId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTRY_GROUP_FIELD_NUMBER = 3;
  private com.google.cloud.dataplex.v1.EntryGroup entryGroup_;

  /**
   *
   *
   * <pre>
   * Required. EntryGroup Resource.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.EntryGroup entry_group = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the entryGroup field is set.
   */
  @java.lang.Override
  public boolean hasEntryGroup() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. EntryGroup Resource.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.EntryGroup entry_group = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The entryGroup.
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.EntryGroup getEntryGroup() {
    return entryGroup_ == null
        ? com.google.cloud.dataplex.v1.EntryGroup.getDefaultInstance()
        : entryGroup_;
  }

  /**
   *
   *
   * <pre>
   * Required. EntryGroup Resource.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.EntryGroup entry_group = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.EntryGroupOrBuilder getEntryGroupOrBuilder() {
    return entryGroup_ == null
        ? com.google.cloud.dataplex.v1.EntryGroup.getDefaultInstance()
        : entryGroup_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entryGroupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, entryGroupId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getEntryGroup());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entryGroupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, entryGroupId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getEntryGroup());
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.CreateEntryGroupRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.CreateEntryGroupRequest other =
        (com.google.cloud.dataplex.v1.CreateEntryGroupRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getEntryGroupId().equals(other.getEntryGroupId())) return false;
    if (hasEntryGroup() != other.hasEntryGroup()) return false;
    if (hasEntryGroup()) {
      if (!getEntryGroup().equals(other.getEntryGroup())) return false;
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
    hash = (37 * hash) + ENTRY_GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEntryGroupId().hashCode();
    if (hasEntryGroup()) {
      hash = (37 * hash) + ENTRY_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getEntryGroup().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.CreateEntryGroupRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.CreateEntryGroupRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateEntryGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.CreateEntryGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateEntryGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.CreateEntryGroupRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateEntryGroupRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreateEntryGroupRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateEntryGroupRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreateEntryGroupRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateEntryGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreateEntryGroupRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataplex.v1.CreateEntryGroupRequest prototype) {
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
   * Create EntryGroup Request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.CreateEntryGroupRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.CreateEntryGroupRequest)
      com.google.cloud.dataplex.v1.CreateEntryGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataplex.v1.CatalogProto
          .internal_static_google_cloud_dataplex_v1_CreateEntryGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.CatalogProto
          .internal_static_google_cloud_dataplex_v1_CreateEntryGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.CreateEntryGroupRequest.class,
              com.google.cloud.dataplex.v1.CreateEntryGroupRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.CreateEntryGroupRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEntryGroupFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      entryGroupId_ = "";
      entryGroup_ = null;
      if (entryGroupBuilder_ != null) {
        entryGroupBuilder_.dispose();
        entryGroupBuilder_ = null;
      }
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataplex.v1.CatalogProto
          .internal_static_google_cloud_dataplex_v1_CreateEntryGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateEntryGroupRequest getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.CreateEntryGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateEntryGroupRequest build() {
      com.google.cloud.dataplex.v1.CreateEntryGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateEntryGroupRequest buildPartial() {
      com.google.cloud.dataplex.v1.CreateEntryGroupRequest result =
          new com.google.cloud.dataplex.v1.CreateEntryGroupRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataplex.v1.CreateEntryGroupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.entryGroupId_ = entryGroupId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.entryGroup_ = entryGroupBuilder_ == null ? entryGroup_ : entryGroupBuilder_.build();
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
      if (other instanceof com.google.cloud.dataplex.v1.CreateEntryGroupRequest) {
        return mergeFrom((com.google.cloud.dataplex.v1.CreateEntryGroupRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.CreateEntryGroupRequest other) {
      if (other == com.google.cloud.dataplex.v1.CreateEntryGroupRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEntryGroupId().isEmpty()) {
        entryGroupId_ = other.entryGroupId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasEntryGroup()) {
        mergeEntryGroup(other.getEntryGroup());
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
                entryGroupId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getEntryGroupFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. The resource name of the entryGroup, of the form:
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
     * Required. The resource name of the entryGroup, of the form:
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
     * Required. The resource name of the entryGroup, of the form:
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
     * Required. The resource name of the entryGroup, of the form:
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
     * Required. The resource name of the entryGroup, of the form:
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

    private java.lang.Object entryGroupId_ = "";

    /**
     *
     *
     * <pre>
     * Required. EntryGroup identifier.
     * </pre>
     *
     * <code>string entry_group_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The entryGroupId.
     */
    public java.lang.String getEntryGroupId() {
      java.lang.Object ref = entryGroupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entryGroupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. EntryGroup identifier.
     * </pre>
     *
     * <code>string entry_group_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for entryGroupId.
     */
    public com.google.protobuf.ByteString getEntryGroupIdBytes() {
      java.lang.Object ref = entryGroupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        entryGroupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. EntryGroup identifier.
     * </pre>
     *
     * <code>string entry_group_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The entryGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setEntryGroupId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      entryGroupId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. EntryGroup identifier.
     * </pre>
     *
     * <code>string entry_group_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEntryGroupId() {
      entryGroupId_ = getDefaultInstance().getEntryGroupId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. EntryGroup identifier.
     * </pre>
     *
     * <code>string entry_group_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for entryGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setEntryGroupIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      entryGroupId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.dataplex.v1.EntryGroup entryGroup_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.EntryGroup,
            com.google.cloud.dataplex.v1.EntryGroup.Builder,
            com.google.cloud.dataplex.v1.EntryGroupOrBuilder>
        entryGroupBuilder_;

    /**
     *
     *
     * <pre>
     * Required. EntryGroup Resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.EntryGroup entry_group = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the entryGroup field is set.
     */
    public boolean hasEntryGroup() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. EntryGroup Resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.EntryGroup entry_group = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The entryGroup.
     */
    public com.google.cloud.dataplex.v1.EntryGroup getEntryGroup() {
      if (entryGroupBuilder_ == null) {
        return entryGroup_ == null
            ? com.google.cloud.dataplex.v1.EntryGroup.getDefaultInstance()
            : entryGroup_;
      } else {
        return entryGroupBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. EntryGroup Resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.EntryGroup entry_group = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntryGroup(com.google.cloud.dataplex.v1.EntryGroup value) {
      if (entryGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entryGroup_ = value;
      } else {
        entryGroupBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. EntryGroup Resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.EntryGroup entry_group = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntryGroup(com.google.cloud.dataplex.v1.EntryGroup.Builder builderForValue) {
      if (entryGroupBuilder_ == null) {
        entryGroup_ = builderForValue.build();
      } else {
        entryGroupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. EntryGroup Resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.EntryGroup entry_group = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeEntryGroup(com.google.cloud.dataplex.v1.EntryGroup value) {
      if (entryGroupBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && entryGroup_ != null
            && entryGroup_ != com.google.cloud.dataplex.v1.EntryGroup.getDefaultInstance()) {
          getEntryGroupBuilder().mergeFrom(value);
        } else {
          entryGroup_ = value;
        }
      } else {
        entryGroupBuilder_.mergeFrom(value);
      }
      if (entryGroup_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. EntryGroup Resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.EntryGroup entry_group = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearEntryGroup() {
      bitField0_ = (bitField0_ & ~0x00000004);
      entryGroup_ = null;
      if (entryGroupBuilder_ != null) {
        entryGroupBuilder_.dispose();
        entryGroupBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. EntryGroup Resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.EntryGroup entry_group = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataplex.v1.EntryGroup.Builder getEntryGroupBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getEntryGroupFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. EntryGroup Resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.EntryGroup entry_group = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataplex.v1.EntryGroupOrBuilder getEntryGroupOrBuilder() {
      if (entryGroupBuilder_ != null) {
        return entryGroupBuilder_.getMessageOrBuilder();
      } else {
        return entryGroup_ == null
            ? com.google.cloud.dataplex.v1.EntryGroup.getDefaultInstance()
            : entryGroup_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. EntryGroup Resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.EntryGroup entry_group = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.EntryGroup,
            com.google.cloud.dataplex.v1.EntryGroup.Builder,
            com.google.cloud.dataplex.v1.EntryGroupOrBuilder>
        getEntryGroupFieldBuilder() {
      if (entryGroupBuilder_ == null) {
        entryGroupBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataplex.v1.EntryGroup,
                com.google.cloud.dataplex.v1.EntryGroup.Builder,
                com.google.cloud.dataplex.v1.EntryGroupOrBuilder>(
                getEntryGroup(), getParentForChildren(), isClean());
        entryGroup_ = null;
      }
      return entryGroupBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.CreateEntryGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.CreateEntryGroupRequest)
  private static final com.google.cloud.dataplex.v1.CreateEntryGroupRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.CreateEntryGroupRequest();
  }

  public static com.google.cloud.dataplex.v1.CreateEntryGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEntryGroupRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateEntryGroupRequest>() {
        @java.lang.Override
        public CreateEntryGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateEntryGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEntryGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.CreateEntryGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
