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
// source: google/cloud/kms/v1/ekm_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.kms.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [EkmService.CreateEkmConnection][google.cloud.kms.v1.EkmService.CreateEkmConnection].
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.CreateEkmConnectionRequest}
 */
public final class CreateEkmConnectionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.CreateEkmConnectionRequest)
    CreateEkmConnectionRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateEkmConnectionRequest.newBuilder() to construct.
  private CreateEkmConnectionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateEkmConnectionRequest() {
    parent_ = "";
    ekmConnectionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateEkmConnectionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.kms.v1.EkmServiceProto
        .internal_static_google_cloud_kms_v1_CreateEkmConnectionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.EkmServiceProto
        .internal_static_google_cloud_kms_v1_CreateEkmConnectionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.CreateEkmConnectionRequest.class,
            com.google.cloud.kms.v1.CreateEkmConnectionRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The resource name of the location associated with the
   * [EkmConnection][google.cloud.kms.v1.EkmConnection], in the format
   * `projects/&#42;&#47;locations/&#42;`.
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
   * Required. The resource name of the location associated with the
   * [EkmConnection][google.cloud.kms.v1.EkmConnection], in the format
   * `projects/&#42;&#47;locations/&#42;`.
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

  public static final int EKM_CONNECTION_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object ekmConnectionId_ = "";

  /**
   *
   *
   * <pre>
   * Required. It must be unique within a location and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`.
   * </pre>
   *
   * <code>string ekm_connection_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The ekmConnectionId.
   */
  @java.lang.Override
  public java.lang.String getEkmConnectionId() {
    java.lang.Object ref = ekmConnectionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ekmConnectionId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. It must be unique within a location and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`.
   * </pre>
   *
   * <code>string ekm_connection_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for ekmConnectionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEkmConnectionIdBytes() {
    java.lang.Object ref = ekmConnectionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ekmConnectionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EKM_CONNECTION_FIELD_NUMBER = 3;
  private com.google.cloud.kms.v1.EkmConnection ekmConnection_;

  /**
   *
   *
   * <pre>
   * Required. An [EkmConnection][google.cloud.kms.v1.EkmConnection] with
   * initial field values.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.EkmConnection ekm_connection = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the ekmConnection field is set.
   */
  @java.lang.Override
  public boolean hasEkmConnection() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. An [EkmConnection][google.cloud.kms.v1.EkmConnection] with
   * initial field values.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.EkmConnection ekm_connection = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The ekmConnection.
   */
  @java.lang.Override
  public com.google.cloud.kms.v1.EkmConnection getEkmConnection() {
    return ekmConnection_ == null
        ? com.google.cloud.kms.v1.EkmConnection.getDefaultInstance()
        : ekmConnection_;
  }

  /**
   *
   *
   * <pre>
   * Required. An [EkmConnection][google.cloud.kms.v1.EkmConnection] with
   * initial field values.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.EkmConnection ekm_connection = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.kms.v1.EkmConnectionOrBuilder getEkmConnectionOrBuilder() {
    return ekmConnection_ == null
        ? com.google.cloud.kms.v1.EkmConnection.getDefaultInstance()
        : ekmConnection_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ekmConnectionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ekmConnectionId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getEkmConnection());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ekmConnectionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ekmConnectionId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getEkmConnection());
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
    if (!(obj instanceof com.google.cloud.kms.v1.CreateEkmConnectionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.CreateEkmConnectionRequest other =
        (com.google.cloud.kms.v1.CreateEkmConnectionRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getEkmConnectionId().equals(other.getEkmConnectionId())) return false;
    if (hasEkmConnection() != other.hasEkmConnection()) return false;
    if (hasEkmConnection()) {
      if (!getEkmConnection().equals(other.getEkmConnection())) return false;
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
    hash = (37 * hash) + EKM_CONNECTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEkmConnectionId().hashCode();
    if (hasEkmConnection()) {
      hash = (37 * hash) + EKM_CONNECTION_FIELD_NUMBER;
      hash = (53 * hash) + getEkmConnection().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.CreateEkmConnectionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.CreateEkmConnectionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateEkmConnectionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.CreateEkmConnectionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateEkmConnectionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.CreateEkmConnectionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateEkmConnectionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.CreateEkmConnectionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateEkmConnectionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.CreateEkmConnectionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateEkmConnectionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.CreateEkmConnectionRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.kms.v1.CreateEkmConnectionRequest prototype) {
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
   * [EkmService.CreateEkmConnection][google.cloud.kms.v1.EkmService.CreateEkmConnection].
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.CreateEkmConnectionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.CreateEkmConnectionRequest)
      com.google.cloud.kms.v1.CreateEkmConnectionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.kms.v1.EkmServiceProto
          .internal_static_google_cloud_kms_v1_CreateEkmConnectionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.EkmServiceProto
          .internal_static_google_cloud_kms_v1_CreateEkmConnectionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.CreateEkmConnectionRequest.class,
              com.google.cloud.kms.v1.CreateEkmConnectionRequest.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.CreateEkmConnectionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEkmConnectionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      ekmConnectionId_ = "";
      ekmConnection_ = null;
      if (ekmConnectionBuilder_ != null) {
        ekmConnectionBuilder_.dispose();
        ekmConnectionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.kms.v1.EkmServiceProto
          .internal_static_google_cloud_kms_v1_CreateEkmConnectionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.CreateEkmConnectionRequest getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.CreateEkmConnectionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.CreateEkmConnectionRequest build() {
      com.google.cloud.kms.v1.CreateEkmConnectionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.CreateEkmConnectionRequest buildPartial() {
      com.google.cloud.kms.v1.CreateEkmConnectionRequest result =
          new com.google.cloud.kms.v1.CreateEkmConnectionRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.kms.v1.CreateEkmConnectionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ekmConnectionId_ = ekmConnectionId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.ekmConnection_ =
            ekmConnectionBuilder_ == null ? ekmConnection_ : ekmConnectionBuilder_.build();
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
      if (other instanceof com.google.cloud.kms.v1.CreateEkmConnectionRequest) {
        return mergeFrom((com.google.cloud.kms.v1.CreateEkmConnectionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.CreateEkmConnectionRequest other) {
      if (other == com.google.cloud.kms.v1.CreateEkmConnectionRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEkmConnectionId().isEmpty()) {
        ekmConnectionId_ = other.ekmConnectionId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasEkmConnection()) {
        mergeEkmConnection(other.getEkmConnection());
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
                ekmConnectionId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getEkmConnectionFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. The resource name of the location associated with the
     * [EkmConnection][google.cloud.kms.v1.EkmConnection], in the format
     * `projects/&#42;&#47;locations/&#42;`.
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
     * Required. The resource name of the location associated with the
     * [EkmConnection][google.cloud.kms.v1.EkmConnection], in the format
     * `projects/&#42;&#47;locations/&#42;`.
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
     * Required. The resource name of the location associated with the
     * [EkmConnection][google.cloud.kms.v1.EkmConnection], in the format
     * `projects/&#42;&#47;locations/&#42;`.
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
     * Required. The resource name of the location associated with the
     * [EkmConnection][google.cloud.kms.v1.EkmConnection], in the format
     * `projects/&#42;&#47;locations/&#42;`.
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
     * Required. The resource name of the location associated with the
     * [EkmConnection][google.cloud.kms.v1.EkmConnection], in the format
     * `projects/&#42;&#47;locations/&#42;`.
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

    private java.lang.Object ekmConnectionId_ = "";

    /**
     *
     *
     * <pre>
     * Required. It must be unique within a location and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`.
     * </pre>
     *
     * <code>string ekm_connection_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The ekmConnectionId.
     */
    public java.lang.String getEkmConnectionId() {
      java.lang.Object ref = ekmConnectionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ekmConnectionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. It must be unique within a location and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`.
     * </pre>
     *
     * <code>string ekm_connection_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for ekmConnectionId.
     */
    public com.google.protobuf.ByteString getEkmConnectionIdBytes() {
      java.lang.Object ref = ekmConnectionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ekmConnectionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. It must be unique within a location and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`.
     * </pre>
     *
     * <code>string ekm_connection_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The ekmConnectionId to set.
     * @return This builder for chaining.
     */
    public Builder setEkmConnectionId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ekmConnectionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. It must be unique within a location and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`.
     * </pre>
     *
     * <code>string ekm_connection_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEkmConnectionId() {
      ekmConnectionId_ = getDefaultInstance().getEkmConnectionId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. It must be unique within a location and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`.
     * </pre>
     *
     * <code>string ekm_connection_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for ekmConnectionId to set.
     * @return This builder for chaining.
     */
    public Builder setEkmConnectionIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ekmConnectionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.kms.v1.EkmConnection ekmConnection_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.kms.v1.EkmConnection,
            com.google.cloud.kms.v1.EkmConnection.Builder,
            com.google.cloud.kms.v1.EkmConnectionOrBuilder>
        ekmConnectionBuilder_;

    /**
     *
     *
     * <pre>
     * Required. An [EkmConnection][google.cloud.kms.v1.EkmConnection] with
     * initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.EkmConnection ekm_connection = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the ekmConnection field is set.
     */
    public boolean hasEkmConnection() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. An [EkmConnection][google.cloud.kms.v1.EkmConnection] with
     * initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.EkmConnection ekm_connection = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The ekmConnection.
     */
    public com.google.cloud.kms.v1.EkmConnection getEkmConnection() {
      if (ekmConnectionBuilder_ == null) {
        return ekmConnection_ == null
            ? com.google.cloud.kms.v1.EkmConnection.getDefaultInstance()
            : ekmConnection_;
      } else {
        return ekmConnectionBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. An [EkmConnection][google.cloud.kms.v1.EkmConnection] with
     * initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.EkmConnection ekm_connection = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEkmConnection(com.google.cloud.kms.v1.EkmConnection value) {
      if (ekmConnectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ekmConnection_ = value;
      } else {
        ekmConnectionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. An [EkmConnection][google.cloud.kms.v1.EkmConnection] with
     * initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.EkmConnection ekm_connection = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEkmConnection(com.google.cloud.kms.v1.EkmConnection.Builder builderForValue) {
      if (ekmConnectionBuilder_ == null) {
        ekmConnection_ = builderForValue.build();
      } else {
        ekmConnectionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. An [EkmConnection][google.cloud.kms.v1.EkmConnection] with
     * initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.EkmConnection ekm_connection = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeEkmConnection(com.google.cloud.kms.v1.EkmConnection value) {
      if (ekmConnectionBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && ekmConnection_ != null
            && ekmConnection_ != com.google.cloud.kms.v1.EkmConnection.getDefaultInstance()) {
          getEkmConnectionBuilder().mergeFrom(value);
        } else {
          ekmConnection_ = value;
        }
      } else {
        ekmConnectionBuilder_.mergeFrom(value);
      }
      if (ekmConnection_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. An [EkmConnection][google.cloud.kms.v1.EkmConnection] with
     * initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.EkmConnection ekm_connection = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearEkmConnection() {
      bitField0_ = (bitField0_ & ~0x00000004);
      ekmConnection_ = null;
      if (ekmConnectionBuilder_ != null) {
        ekmConnectionBuilder_.dispose();
        ekmConnectionBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. An [EkmConnection][google.cloud.kms.v1.EkmConnection] with
     * initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.EkmConnection ekm_connection = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.kms.v1.EkmConnection.Builder getEkmConnectionBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getEkmConnectionFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. An [EkmConnection][google.cloud.kms.v1.EkmConnection] with
     * initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.EkmConnection ekm_connection = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.kms.v1.EkmConnectionOrBuilder getEkmConnectionOrBuilder() {
      if (ekmConnectionBuilder_ != null) {
        return ekmConnectionBuilder_.getMessageOrBuilder();
      } else {
        return ekmConnection_ == null
            ? com.google.cloud.kms.v1.EkmConnection.getDefaultInstance()
            : ekmConnection_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. An [EkmConnection][google.cloud.kms.v1.EkmConnection] with
     * initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.EkmConnection ekm_connection = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.kms.v1.EkmConnection,
            com.google.cloud.kms.v1.EkmConnection.Builder,
            com.google.cloud.kms.v1.EkmConnectionOrBuilder>
        getEkmConnectionFieldBuilder() {
      if (ekmConnectionBuilder_ == null) {
        ekmConnectionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.kms.v1.EkmConnection,
                com.google.cloud.kms.v1.EkmConnection.Builder,
                com.google.cloud.kms.v1.EkmConnectionOrBuilder>(
                getEkmConnection(), getParentForChildren(), isClean());
        ekmConnection_ = null;
      }
      return ekmConnectionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.CreateEkmConnectionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.CreateEkmConnectionRequest)
  private static final com.google.cloud.kms.v1.CreateEkmConnectionRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.CreateEkmConnectionRequest();
  }

  public static com.google.cloud.kms.v1.CreateEkmConnectionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEkmConnectionRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateEkmConnectionRequest>() {
        @java.lang.Override
        public CreateEkmConnectionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateEkmConnectionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEkmConnectionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.CreateEkmConnectionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
