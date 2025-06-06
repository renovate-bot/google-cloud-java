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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * An instance's screenshot.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.Screenshot}
 */
public final class Screenshot extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.Screenshot)
    ScreenshotOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Screenshot.newBuilder() to construct.
  private Screenshot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Screenshot() {
    contents_ = "";
    kind_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Screenshot();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_Screenshot_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_Screenshot_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.Screenshot.class,
            com.google.cloud.compute.v1.Screenshot.Builder.class);
  }

  private int bitField0_;
  public static final int CONTENTS_FIELD_NUMBER = 506419994;

  @SuppressWarnings("serial")
  private volatile java.lang.Object contents_ = "";

  /**
   *
   *
   * <pre>
   * [Output Only] The Base64-encoded screenshot data.
   * </pre>
   *
   * <code>optional string contents = 506419994;</code>
   *
   * @return Whether the contents field is set.
   */
  @java.lang.Override
  public boolean hasContents() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * [Output Only] The Base64-encoded screenshot data.
   * </pre>
   *
   * <code>optional string contents = 506419994;</code>
   *
   * @return The contents.
   */
  @java.lang.Override
  public java.lang.String getContents() {
    java.lang.Object ref = contents_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contents_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * [Output Only] The Base64-encoded screenshot data.
   * </pre>
   *
   * <code>optional string contents = 506419994;</code>
   *
   * @return The bytes for contents.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContentsBytes() {
    java.lang.Object ref = contents_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      contents_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KIND_FIELD_NUMBER = 3292052;

  @SuppressWarnings("serial")
  private volatile java.lang.Object kind_ = "";

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#screenshot for the screenshots.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  @java.lang.Override
  public boolean hasKind() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#screenshot for the screenshots.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  @java.lang.Override
  public java.lang.String getKind() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kind_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#screenshot for the screenshots.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKindBytes() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      kind_ = b;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3292052, kind_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 506419994, contents_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3292052, kind_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(506419994, contents_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.Screenshot)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.Screenshot other = (com.google.cloud.compute.v1.Screenshot) obj;

    if (hasContents() != other.hasContents()) return false;
    if (hasContents()) {
      if (!getContents().equals(other.getContents())) return false;
    }
    if (hasKind() != other.hasKind()) return false;
    if (hasKind()) {
      if (!getKind().equals(other.getKind())) return false;
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
    if (hasContents()) {
      hash = (37 * hash) + CONTENTS_FIELD_NUMBER;
      hash = (53 * hash) + getContents().hashCode();
    }
    if (hasKind()) {
      hash = (37 * hash) + KIND_FIELD_NUMBER;
      hash = (53 * hash) + getKind().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.Screenshot parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.Screenshot parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Screenshot parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.Screenshot parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Screenshot parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.Screenshot parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Screenshot parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Screenshot parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Screenshot parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Screenshot parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Screenshot parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Screenshot parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.Screenshot prototype) {
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
   * An instance's screenshot.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.Screenshot}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.Screenshot)
      com.google.cloud.compute.v1.ScreenshotOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_Screenshot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_Screenshot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.Screenshot.class,
              com.google.cloud.compute.v1.Screenshot.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.Screenshot.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      contents_ = "";
      kind_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_Screenshot_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Screenshot getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.Screenshot.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Screenshot build() {
      com.google.cloud.compute.v1.Screenshot result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Screenshot buildPartial() {
      com.google.cloud.compute.v1.Screenshot result =
          new com.google.cloud.compute.v1.Screenshot(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.Screenshot result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.contents_ = contents_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.kind_ = kind_;
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
      if (other instanceof com.google.cloud.compute.v1.Screenshot) {
        return mergeFrom((com.google.cloud.compute.v1.Screenshot) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.Screenshot other) {
      if (other == com.google.cloud.compute.v1.Screenshot.getDefaultInstance()) return this;
      if (other.hasContents()) {
        contents_ = other.contents_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasKind()) {
        kind_ = other.kind_;
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
            case 26336418:
              {
                kind_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 26336418
            case -243607342:
              {
                contents_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case -243607342
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

    private java.lang.Object contents_ = "";

    /**
     *
     *
     * <pre>
     * [Output Only] The Base64-encoded screenshot data.
     * </pre>
     *
     * <code>optional string contents = 506419994;</code>
     *
     * @return Whether the contents field is set.
     */
    public boolean hasContents() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * [Output Only] The Base64-encoded screenshot data.
     * </pre>
     *
     * <code>optional string contents = 506419994;</code>
     *
     * @return The contents.
     */
    public java.lang.String getContents() {
      java.lang.Object ref = contents_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contents_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * [Output Only] The Base64-encoded screenshot data.
     * </pre>
     *
     * <code>optional string contents = 506419994;</code>
     *
     * @return The bytes for contents.
     */
    public com.google.protobuf.ByteString getContentsBytes() {
      java.lang.Object ref = contents_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        contents_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * [Output Only] The Base64-encoded screenshot data.
     * </pre>
     *
     * <code>optional string contents = 506419994;</code>
     *
     * @param value The contents to set.
     * @return This builder for chaining.
     */
    public Builder setContents(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      contents_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] The Base64-encoded screenshot data.
     * </pre>
     *
     * <code>optional string contents = 506419994;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContents() {
      contents_ = getDefaultInstance().getContents();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] The Base64-encoded screenshot data.
     * </pre>
     *
     * <code>optional string contents = 506419994;</code>
     *
     * @param value The bytes for contents to set.
     * @return This builder for chaining.
     */
    public Builder setContentsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      contents_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object kind_ = "";

    /**
     *
     *
     * <pre>
     * [Output Only] Type of the resource. Always compute#screenshot for the screenshots.
     * </pre>
     *
     * <code>optional string kind = 3292052;</code>
     *
     * @return Whether the kind field is set.
     */
    public boolean hasKind() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * [Output Only] Type of the resource. Always compute#screenshot for the screenshots.
     * </pre>
     *
     * <code>optional string kind = 3292052;</code>
     *
     * @return The kind.
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kind_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * [Output Only] Type of the resource. Always compute#screenshot for the screenshots.
     * </pre>
     *
     * <code>optional string kind = 3292052;</code>
     *
     * @return The bytes for kind.
     */
    public com.google.protobuf.ByteString getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * [Output Only] Type of the resource. Always compute#screenshot for the screenshots.
     * </pre>
     *
     * <code>optional string kind = 3292052;</code>
     *
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      kind_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] Type of the resource. Always compute#screenshot for the screenshots.
     * </pre>
     *
     * <code>optional string kind = 3292052;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      kind_ = getDefaultInstance().getKind();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] Type of the resource. Always compute#screenshot for the screenshots.
     * </pre>
     *
     * <code>optional string kind = 3292052;</code>
     *
     * @param value The bytes for kind to set.
     * @return This builder for chaining.
     */
    public Builder setKindBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      kind_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.Screenshot)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.Screenshot)
  private static final com.google.cloud.compute.v1.Screenshot DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.Screenshot();
  }

  public static com.google.cloud.compute.v1.Screenshot getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Screenshot> PARSER =
      new com.google.protobuf.AbstractParser<Screenshot>() {
        @java.lang.Override
        public Screenshot parsePartialFrom(
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

  public static com.google.protobuf.Parser<Screenshot> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Screenshot> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.Screenshot getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
