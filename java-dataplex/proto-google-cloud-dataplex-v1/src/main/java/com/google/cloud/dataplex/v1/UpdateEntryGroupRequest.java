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
 * Update EntryGroup Request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.UpdateEntryGroupRequest}
 */
public final class UpdateEntryGroupRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.UpdateEntryGroupRequest)
    UpdateEntryGroupRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UpdateEntryGroupRequest.newBuilder() to construct.
  private UpdateEntryGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateEntryGroupRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateEntryGroupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataplex.v1.CatalogProto
        .internal_static_google_cloud_dataplex_v1_UpdateEntryGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.CatalogProto
        .internal_static_google_cloud_dataplex_v1_UpdateEntryGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.UpdateEntryGroupRequest.class,
            com.google.cloud.dataplex.v1.UpdateEntryGroupRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ENTRY_GROUP_FIELD_NUMBER = 1;
  private com.google.cloud.dataplex.v1.EntryGroup entryGroup_;

  /**
   *
   *
   * <pre>
   * Required. EntryGroup Resource.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
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
   * .google.cloud.dataplex.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
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
   * .google.cloud.dataplex.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.EntryGroupOrBuilder getEntryGroupOrBuilder() {
    return entryGroup_ == null
        ? com.google.cloud.dataplex.v1.EntryGroup.getDefaultInstance()
        : entryGroup_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;

  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 3;
  private boolean validateOnly_ = false;

  /**
   *
   *
   * <pre>
   * Optional. The service validates the request, without performing any
   * mutations. The default is false.
   * </pre>
   *
   * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getEntryGroup());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      output.writeBool(3, validateOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getEntryGroup());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.UpdateEntryGroupRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.UpdateEntryGroupRequest other =
        (com.google.cloud.dataplex.v1.UpdateEntryGroupRequest) obj;

    if (hasEntryGroup() != other.hasEntryGroup()) return false;
    if (hasEntryGroup()) {
      if (!getEntryGroup().equals(other.getEntryGroup())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasEntryGroup()) {
      hash = (37 * hash) + ENTRY_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getEntryGroup().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.UpdateEntryGroupRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntryGroupRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntryGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntryGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntryGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntryGroupRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntryGroupRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntryGroupRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntryGroupRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntryGroupRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntryGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.UpdateEntryGroupRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataplex.v1.UpdateEntryGroupRequest prototype) {
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
   * Update EntryGroup Request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.UpdateEntryGroupRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.UpdateEntryGroupRequest)
      com.google.cloud.dataplex.v1.UpdateEntryGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataplex.v1.CatalogProto
          .internal_static_google_cloud_dataplex_v1_UpdateEntryGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.CatalogProto
          .internal_static_google_cloud_dataplex_v1_UpdateEntryGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.UpdateEntryGroupRequest.class,
              com.google.cloud.dataplex.v1.UpdateEntryGroupRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.UpdateEntryGroupRequest.newBuilder()
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
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      entryGroup_ = null;
      if (entryGroupBuilder_ != null) {
        entryGroupBuilder_.dispose();
        entryGroupBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataplex.v1.CatalogProto
          .internal_static_google_cloud_dataplex_v1_UpdateEntryGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.UpdateEntryGroupRequest getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.UpdateEntryGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.UpdateEntryGroupRequest build() {
      com.google.cloud.dataplex.v1.UpdateEntryGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.UpdateEntryGroupRequest buildPartial() {
      com.google.cloud.dataplex.v1.UpdateEntryGroupRequest result =
          new com.google.cloud.dataplex.v1.UpdateEntryGroupRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataplex.v1.UpdateEntryGroupRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.entryGroup_ = entryGroupBuilder_ == null ? entryGroup_ : entryGroupBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
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
      if (other instanceof com.google.cloud.dataplex.v1.UpdateEntryGroupRequest) {
        return mergeFrom((com.google.cloud.dataplex.v1.UpdateEntryGroupRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.UpdateEntryGroupRequest other) {
      if (other == com.google.cloud.dataplex.v1.UpdateEntryGroupRequest.getDefaultInstance())
        return this;
      if (other.hasEntryGroup()) {
        mergeEntryGroup(other.getEntryGroup());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getEntryGroupFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                validateOnly_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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
     * .google.cloud.dataplex.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the entryGroup field is set.
     */
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
     * .google.cloud.dataplex.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
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
     * .google.cloud.dataplex.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
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
      bitField0_ |= 0x00000001;
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
     * .google.cloud.dataplex.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntryGroup(com.google.cloud.dataplex.v1.EntryGroup.Builder builderForValue) {
      if (entryGroupBuilder_ == null) {
        entryGroup_ = builderForValue.build();
      } else {
        entryGroupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
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
     * .google.cloud.dataplex.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeEntryGroup(com.google.cloud.dataplex.v1.EntryGroup value) {
      if (entryGroupBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
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
        bitField0_ |= 0x00000001;
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
     * .google.cloud.dataplex.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearEntryGroup() {
      bitField0_ = (bitField0_ & ~0x00000001);
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
     * .google.cloud.dataplex.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataplex.v1.EntryGroup.Builder getEntryGroupBuilder() {
      bitField0_ |= 0x00000001;
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
     * .google.cloud.dataplex.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
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
     * .google.cloud.dataplex.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
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

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;

    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private boolean validateOnly_;

    /**
     *
     *
     * <pre>
     * Optional. The service validates the request, without performing any
     * mutations. The default is false.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The service validates the request, without performing any
     * mutations. The default is false.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The service validates the request, without performing any
     * mutations. The default is false.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000004);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.UpdateEntryGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.UpdateEntryGroupRequest)
  private static final com.google.cloud.dataplex.v1.UpdateEntryGroupRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.UpdateEntryGroupRequest();
  }

  public static com.google.cloud.dataplex.v1.UpdateEntryGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEntryGroupRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateEntryGroupRequest>() {
        @java.lang.Override
        public UpdateEntryGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateEntryGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEntryGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.UpdateEntryGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
