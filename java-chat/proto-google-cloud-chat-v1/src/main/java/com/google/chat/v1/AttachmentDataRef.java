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
// source: google/chat/v1/attachment.proto

// Protobuf Java Version: 3.25.8
package com.google.chat.v1;

/**
 *
 *
 * <pre>
 * A reference to the attachment data.
 * </pre>
 *
 * Protobuf type {@code google.chat.v1.AttachmentDataRef}
 */
public final class AttachmentDataRef extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.chat.v1.AttachmentDataRef)
    AttachmentDataRefOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use AttachmentDataRef.newBuilder() to construct.
  private AttachmentDataRef(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AttachmentDataRef() {
    resourceName_ = "";
    attachmentUploadToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AttachmentDataRef();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.chat.v1.AttachmentProto
        .internal_static_google_chat_v1_AttachmentDataRef_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.chat.v1.AttachmentProto
        .internal_static_google_chat_v1_AttachmentDataRef_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.chat.v1.AttachmentDataRef.class,
            com.google.chat.v1.AttachmentDataRef.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";

  /**
   *
   *
   * <pre>
   * Optional. The resource name of the attachment data. This field is used with
   * the media API to download the attachment data.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. The resource name of the attachment data. This field is used with
   * the media API to download the attachment data.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTACHMENT_UPLOAD_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object attachmentUploadToken_ = "";

  /**
   *
   *
   * <pre>
   * Optional. Opaque token containing a reference to an uploaded attachment.
   * Treated by clients as an opaque string and used to create or update Chat
   * messages with attachments.
   * </pre>
   *
   * <code>string attachment_upload_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The attachmentUploadToken.
   */
  @java.lang.Override
  public java.lang.String getAttachmentUploadToken() {
    java.lang.Object ref = attachmentUploadToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      attachmentUploadToken_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. Opaque token containing a reference to an uploaded attachment.
   * Treated by clients as an opaque string and used to create or update Chat
   * messages with attachments.
   * </pre>
   *
   * <code>string attachment_upload_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for attachmentUploadToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAttachmentUploadTokenBytes() {
    java.lang.Object ref = attachmentUploadToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      attachmentUploadToken_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attachmentUploadToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, attachmentUploadToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attachmentUploadToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, attachmentUploadToken_);
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
    if (!(obj instanceof com.google.chat.v1.AttachmentDataRef)) {
      return super.equals(obj);
    }
    com.google.chat.v1.AttachmentDataRef other = (com.google.chat.v1.AttachmentDataRef) obj;

    if (!getResourceName().equals(other.getResourceName())) return false;
    if (!getAttachmentUploadToken().equals(other.getAttachmentUploadToken())) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    hash = (37 * hash) + ATTACHMENT_UPLOAD_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getAttachmentUploadToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.chat.v1.AttachmentDataRef parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.AttachmentDataRef parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.AttachmentDataRef parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.AttachmentDataRef parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.AttachmentDataRef parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.AttachmentDataRef parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.AttachmentDataRef parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.AttachmentDataRef parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.AttachmentDataRef parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.AttachmentDataRef parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.AttachmentDataRef parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.AttachmentDataRef parseFrom(
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

  public static Builder newBuilder(com.google.chat.v1.AttachmentDataRef prototype) {
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
   * A reference to the attachment data.
   * </pre>
   *
   * Protobuf type {@code google.chat.v1.AttachmentDataRef}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.chat.v1.AttachmentDataRef)
      com.google.chat.v1.AttachmentDataRefOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.chat.v1.AttachmentProto
          .internal_static_google_chat_v1_AttachmentDataRef_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.chat.v1.AttachmentProto
          .internal_static_google_chat_v1_AttachmentDataRef_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.chat.v1.AttachmentDataRef.class,
              com.google.chat.v1.AttachmentDataRef.Builder.class);
    }

    // Construct using com.google.chat.v1.AttachmentDataRef.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resourceName_ = "";
      attachmentUploadToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.chat.v1.AttachmentProto
          .internal_static_google_chat_v1_AttachmentDataRef_descriptor;
    }

    @java.lang.Override
    public com.google.chat.v1.AttachmentDataRef getDefaultInstanceForType() {
      return com.google.chat.v1.AttachmentDataRef.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.chat.v1.AttachmentDataRef build() {
      com.google.chat.v1.AttachmentDataRef result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.chat.v1.AttachmentDataRef buildPartial() {
      com.google.chat.v1.AttachmentDataRef result = new com.google.chat.v1.AttachmentDataRef(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.chat.v1.AttachmentDataRef result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.attachmentUploadToken_ = attachmentUploadToken_;
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
      if (other instanceof com.google.chat.v1.AttachmentDataRef) {
        return mergeFrom((com.google.chat.v1.AttachmentDataRef) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.chat.v1.AttachmentDataRef other) {
      if (other == com.google.chat.v1.AttachmentDataRef.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAttachmentUploadToken().isEmpty()) {
        attachmentUploadToken_ = other.attachmentUploadToken_;
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
                resourceName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                attachmentUploadToken_ = input.readStringRequireUtf8();
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

    private java.lang.Object resourceName_ = "";

    /**
     *
     *
     * <pre>
     * Optional. The resource name of the attachment data. This field is used with
     * the media API to download the attachment data.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The resource name of the attachment data. This field is used with
     * the media API to download the attachment data.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The resource name of the attachment data. This field is used with
     * the media API to download the attachment data.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The resource name of the attachment data. This field is used with
     * the media API to download the attachment data.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      resourceName_ = getDefaultInstance().getResourceName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The resource name of the attachment data. This field is used with
     * the media API to download the attachment data.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object attachmentUploadToken_ = "";

    /**
     *
     *
     * <pre>
     * Optional. Opaque token containing a reference to an uploaded attachment.
     * Treated by clients as an opaque string and used to create or update Chat
     * messages with attachments.
     * </pre>
     *
     * <code>string attachment_upload_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The attachmentUploadToken.
     */
    public java.lang.String getAttachmentUploadToken() {
      java.lang.Object ref = attachmentUploadToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        attachmentUploadToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Opaque token containing a reference to an uploaded attachment.
     * Treated by clients as an opaque string and used to create or update Chat
     * messages with attachments.
     * </pre>
     *
     * <code>string attachment_upload_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for attachmentUploadToken.
     */
    public com.google.protobuf.ByteString getAttachmentUploadTokenBytes() {
      java.lang.Object ref = attachmentUploadToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        attachmentUploadToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Opaque token containing a reference to an uploaded attachment.
     * Treated by clients as an opaque string and used to create or update Chat
     * messages with attachments.
     * </pre>
     *
     * <code>string attachment_upload_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The attachmentUploadToken to set.
     * @return This builder for chaining.
     */
    public Builder setAttachmentUploadToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      attachmentUploadToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Opaque token containing a reference to an uploaded attachment.
     * Treated by clients as an opaque string and used to create or update Chat
     * messages with attachments.
     * </pre>
     *
     * <code>string attachment_upload_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAttachmentUploadToken() {
      attachmentUploadToken_ = getDefaultInstance().getAttachmentUploadToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Opaque token containing a reference to an uploaded attachment.
     * Treated by clients as an opaque string and used to create or update Chat
     * messages with attachments.
     * </pre>
     *
     * <code>string attachment_upload_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for attachmentUploadToken to set.
     * @return This builder for chaining.
     */
    public Builder setAttachmentUploadTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      attachmentUploadToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.chat.v1.AttachmentDataRef)
  }

  // @@protoc_insertion_point(class_scope:google.chat.v1.AttachmentDataRef)
  private static final com.google.chat.v1.AttachmentDataRef DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.chat.v1.AttachmentDataRef();
  }

  public static com.google.chat.v1.AttachmentDataRef getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AttachmentDataRef> PARSER =
      new com.google.protobuf.AbstractParser<AttachmentDataRef>() {
        @java.lang.Override
        public AttachmentDataRef parsePartialFrom(
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

  public static com.google.protobuf.Parser<AttachmentDataRef> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AttachmentDataRef> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.chat.v1.AttachmentDataRef getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
