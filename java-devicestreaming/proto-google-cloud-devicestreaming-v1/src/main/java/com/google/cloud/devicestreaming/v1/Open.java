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
// source: google/cloud/devicestreaming/v1/adb_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.devicestreaming.v1;

/**
 *
 *
 * <pre>
 * Message for opening a new stream.
 * </pre>
 *
 * Protobuf type {@code google.cloud.devicestreaming.v1.Open}
 */
public final class Open extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.devicestreaming.v1.Open)
    OpenOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Open.newBuilder() to construct.
  private Open(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Open() {
    service_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Open();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.devicestreaming.v1.AdbServiceProto
        .internal_static_google_cloud_devicestreaming_v1_Open_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.devicestreaming.v1.AdbServiceProto
        .internal_static_google_cloud_devicestreaming_v1_Open_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.devicestreaming.v1.Open.class,
            com.google.cloud.devicestreaming.v1.Open.Builder.class);
  }

  public static final int STREAM_ID_FIELD_NUMBER = 1;
  private int streamId_ = 0;

  /**
   *
   *
   * <pre>
   * Required. The unique ID that will be used to talk to this stream. This
   * should probably just be a number that increments for each new Open request.
   * </pre>
   *
   * <code>int32 stream_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The streamId.
   */
  @java.lang.Override
  public int getStreamId() {
    return streamId_;
  }

  public static final int SERVICE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object service_ = "";

  /**
   *
   *
   * <pre>
   * Optional. An ADB service to use in the new stream.
   * </pre>
   *
   * <code>string service = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The service.
   */
  @java.lang.Override
  public java.lang.String getService() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      service_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. An ADB service to use in the new stream.
   * </pre>
   *
   * <code>string service = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for service.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceBytes() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      service_ = b;
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
    if (streamId_ != 0) {
      output.writeInt32(1, streamId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, service_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (streamId_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, streamId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, service_);
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
    if (!(obj instanceof com.google.cloud.devicestreaming.v1.Open)) {
      return super.equals(obj);
    }
    com.google.cloud.devicestreaming.v1.Open other = (com.google.cloud.devicestreaming.v1.Open) obj;

    if (getStreamId() != other.getStreamId()) return false;
    if (!getService().equals(other.getService())) return false;
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
    hash = (37 * hash) + STREAM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStreamId();
    hash = (37 * hash) + SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getService().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.devicestreaming.v1.Open parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.devicestreaming.v1.Open parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.devicestreaming.v1.Open parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.devicestreaming.v1.Open parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.devicestreaming.v1.Open parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.devicestreaming.v1.Open parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.devicestreaming.v1.Open parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.devicestreaming.v1.Open parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.devicestreaming.v1.Open parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.devicestreaming.v1.Open parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.devicestreaming.v1.Open parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.devicestreaming.v1.Open parseFrom(
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

  public static Builder newBuilder(com.google.cloud.devicestreaming.v1.Open prototype) {
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
   * Message for opening a new stream.
   * </pre>
   *
   * Protobuf type {@code google.cloud.devicestreaming.v1.Open}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.devicestreaming.v1.Open)
      com.google.cloud.devicestreaming.v1.OpenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.devicestreaming.v1.AdbServiceProto
          .internal_static_google_cloud_devicestreaming_v1_Open_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.devicestreaming.v1.AdbServiceProto
          .internal_static_google_cloud_devicestreaming_v1_Open_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.devicestreaming.v1.Open.class,
              com.google.cloud.devicestreaming.v1.Open.Builder.class);
    }

    // Construct using com.google.cloud.devicestreaming.v1.Open.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      streamId_ = 0;
      service_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.devicestreaming.v1.AdbServiceProto
          .internal_static_google_cloud_devicestreaming_v1_Open_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.devicestreaming.v1.Open getDefaultInstanceForType() {
      return com.google.cloud.devicestreaming.v1.Open.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.devicestreaming.v1.Open build() {
      com.google.cloud.devicestreaming.v1.Open result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.devicestreaming.v1.Open buildPartial() {
      com.google.cloud.devicestreaming.v1.Open result =
          new com.google.cloud.devicestreaming.v1.Open(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.devicestreaming.v1.Open result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.streamId_ = streamId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.service_ = service_;
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
      if (other instanceof com.google.cloud.devicestreaming.v1.Open) {
        return mergeFrom((com.google.cloud.devicestreaming.v1.Open) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.devicestreaming.v1.Open other) {
      if (other == com.google.cloud.devicestreaming.v1.Open.getDefaultInstance()) return this;
      if (other.getStreamId() != 0) {
        setStreamId(other.getStreamId());
      }
      if (!other.getService().isEmpty()) {
        service_ = other.service_;
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
            case 8:
              {
                streamId_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                service_ = input.readStringRequireUtf8();
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

    private int streamId_;

    /**
     *
     *
     * <pre>
     * Required. The unique ID that will be used to talk to this stream. This
     * should probably just be a number that increments for each new Open request.
     * </pre>
     *
     * <code>int32 stream_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The streamId.
     */
    @java.lang.Override
    public int getStreamId() {
      return streamId_;
    }

    /**
     *
     *
     * <pre>
     * Required. The unique ID that will be used to talk to this stream. This
     * should probably just be a number that increments for each new Open request.
     * </pre>
     *
     * <code>int32 stream_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The streamId to set.
     * @return This builder for chaining.
     */
    public Builder setStreamId(int value) {

      streamId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The unique ID that will be used to talk to this stream. This
     * should probably just be a number that increments for each new Open request.
     * </pre>
     *
     * <code>int32 stream_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStreamId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      streamId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object service_ = "";

    /**
     *
     *
     * <pre>
     * Optional. An ADB service to use in the new stream.
     * </pre>
     *
     * <code>string service = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The service.
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        service_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. An ADB service to use in the new stream.
     * </pre>
     *
     * <code>string service = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for service.
     */
    public com.google.protobuf.ByteString getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. An ADB service to use in the new stream.
     * </pre>
     *
     * <code>string service = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The service to set.
     * @return This builder for chaining.
     */
    public Builder setService(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      service_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. An ADB service to use in the new stream.
     * </pre>
     *
     * <code>string service = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearService() {
      service_ = getDefaultInstance().getService();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. An ADB service to use in the new stream.
     * </pre>
     *
     * <code>string service = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for service to set.
     * @return This builder for chaining.
     */
    public Builder setServiceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      service_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.devicestreaming.v1.Open)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.devicestreaming.v1.Open)
  private static final com.google.cloud.devicestreaming.v1.Open DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.devicestreaming.v1.Open();
  }

  public static com.google.cloud.devicestreaming.v1.Open getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Open> PARSER =
      new com.google.protobuf.AbstractParser<Open>() {
        @java.lang.Override
        public Open parsePartialFrom(
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

  public static com.google.protobuf.Parser<Open> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Open> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.devicestreaming.v1.Open getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
