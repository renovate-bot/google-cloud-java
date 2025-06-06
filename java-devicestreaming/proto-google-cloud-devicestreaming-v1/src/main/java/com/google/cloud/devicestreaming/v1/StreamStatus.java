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
 * The result of a stream.
 * </pre>
 *
 * Protobuf type {@code google.cloud.devicestreaming.v1.StreamStatus}
 */
public final class StreamStatus extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.devicestreaming.v1.StreamStatus)
    StreamStatusOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use StreamStatus.newBuilder() to construct.
  private StreamStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StreamStatus() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StreamStatus();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.devicestreaming.v1.AdbServiceProto
        .internal_static_google_cloud_devicestreaming_v1_StreamStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.devicestreaming.v1.AdbServiceProto
        .internal_static_google_cloud_devicestreaming_v1_StreamStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.devicestreaming.v1.StreamStatus.class,
            com.google.cloud.devicestreaming.v1.StreamStatus.Builder.class);
  }

  private int statusCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object status_;

  public enum StatusCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    OKAY(2),
    FAIL(3),
    STATUS_NOT_SET(0);
    private final int value;

    private StatusCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StatusCase valueOf(int value) {
      return forNumber(value);
    }

    public static StatusCase forNumber(int value) {
      switch (value) {
        case 2:
          return OKAY;
        case 3:
          return FAIL;
        case 0:
          return STATUS_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public StatusCase getStatusCase() {
    return StatusCase.forNumber(statusCase_);
  }

  public static final int STREAM_ID_FIELD_NUMBER = 1;
  private int streamId_ = 0;

  /**
   *
   *
   * <pre>
   * The unique ID of this stream, assigned by the client.
   * </pre>
   *
   * <code>int32 stream_id = 1;</code>
   *
   * @return The streamId.
   */
  @java.lang.Override
  public int getStreamId() {
    return streamId_;
  }

  public static final int OKAY_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * Okay for success.
   * </pre>
   *
   * <code>.google.cloud.devicestreaming.v1.Okay okay = 2;</code>
   *
   * @return Whether the okay field is set.
   */
  @java.lang.Override
  public boolean hasOkay() {
    return statusCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * Okay for success.
   * </pre>
   *
   * <code>.google.cloud.devicestreaming.v1.Okay okay = 2;</code>
   *
   * @return The okay.
   */
  @java.lang.Override
  public com.google.cloud.devicestreaming.v1.Okay getOkay() {
    if (statusCase_ == 2) {
      return (com.google.cloud.devicestreaming.v1.Okay) status_;
    }
    return com.google.cloud.devicestreaming.v1.Okay.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * Okay for success.
   * </pre>
   *
   * <code>.google.cloud.devicestreaming.v1.Okay okay = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.devicestreaming.v1.OkayOrBuilder getOkayOrBuilder() {
    if (statusCase_ == 2) {
      return (com.google.cloud.devicestreaming.v1.Okay) status_;
    }
    return com.google.cloud.devicestreaming.v1.Okay.getDefaultInstance();
  }

  public static final int FAIL_FIELD_NUMBER = 3;

  /**
   *
   *
   * <pre>
   * Fail for failure.
   * </pre>
   *
   * <code>.google.cloud.devicestreaming.v1.Fail fail = 3;</code>
   *
   * @return Whether the fail field is set.
   */
  @java.lang.Override
  public boolean hasFail() {
    return statusCase_ == 3;
  }

  /**
   *
   *
   * <pre>
   * Fail for failure.
   * </pre>
   *
   * <code>.google.cloud.devicestreaming.v1.Fail fail = 3;</code>
   *
   * @return The fail.
   */
  @java.lang.Override
  public com.google.cloud.devicestreaming.v1.Fail getFail() {
    if (statusCase_ == 3) {
      return (com.google.cloud.devicestreaming.v1.Fail) status_;
    }
    return com.google.cloud.devicestreaming.v1.Fail.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * Fail for failure.
   * </pre>
   *
   * <code>.google.cloud.devicestreaming.v1.Fail fail = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.devicestreaming.v1.FailOrBuilder getFailOrBuilder() {
    if (statusCase_ == 3) {
      return (com.google.cloud.devicestreaming.v1.Fail) status_;
    }
    return com.google.cloud.devicestreaming.v1.Fail.getDefaultInstance();
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
    if (statusCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.devicestreaming.v1.Okay) status_);
    }
    if (statusCase_ == 3) {
      output.writeMessage(3, (com.google.cloud.devicestreaming.v1.Fail) status_);
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
    if (statusCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.devicestreaming.v1.Okay) status_);
    }
    if (statusCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              3, (com.google.cloud.devicestreaming.v1.Fail) status_);
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
    if (!(obj instanceof com.google.cloud.devicestreaming.v1.StreamStatus)) {
      return super.equals(obj);
    }
    com.google.cloud.devicestreaming.v1.StreamStatus other =
        (com.google.cloud.devicestreaming.v1.StreamStatus) obj;

    if (getStreamId() != other.getStreamId()) return false;
    if (!getStatusCase().equals(other.getStatusCase())) return false;
    switch (statusCase_) {
      case 2:
        if (!getOkay().equals(other.getOkay())) return false;
        break;
      case 3:
        if (!getFail().equals(other.getFail())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + STREAM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStreamId();
    switch (statusCase_) {
      case 2:
        hash = (37 * hash) + OKAY_FIELD_NUMBER;
        hash = (53 * hash) + getOkay().hashCode();
        break;
      case 3:
        hash = (37 * hash) + FAIL_FIELD_NUMBER;
        hash = (53 * hash) + getFail().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.devicestreaming.v1.StreamStatus parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.devicestreaming.v1.StreamStatus parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.devicestreaming.v1.StreamStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.devicestreaming.v1.StreamStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.devicestreaming.v1.StreamStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.devicestreaming.v1.StreamStatus parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.devicestreaming.v1.StreamStatus parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.devicestreaming.v1.StreamStatus parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.devicestreaming.v1.StreamStatus parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.devicestreaming.v1.StreamStatus parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.devicestreaming.v1.StreamStatus parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.devicestreaming.v1.StreamStatus parseFrom(
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

  public static Builder newBuilder(com.google.cloud.devicestreaming.v1.StreamStatus prototype) {
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
   * The result of a stream.
   * </pre>
   *
   * Protobuf type {@code google.cloud.devicestreaming.v1.StreamStatus}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.devicestreaming.v1.StreamStatus)
      com.google.cloud.devicestreaming.v1.StreamStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.devicestreaming.v1.AdbServiceProto
          .internal_static_google_cloud_devicestreaming_v1_StreamStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.devicestreaming.v1.AdbServiceProto
          .internal_static_google_cloud_devicestreaming_v1_StreamStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.devicestreaming.v1.StreamStatus.class,
              com.google.cloud.devicestreaming.v1.StreamStatus.Builder.class);
    }

    // Construct using com.google.cloud.devicestreaming.v1.StreamStatus.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      streamId_ = 0;
      if (okayBuilder_ != null) {
        okayBuilder_.clear();
      }
      if (failBuilder_ != null) {
        failBuilder_.clear();
      }
      statusCase_ = 0;
      status_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.devicestreaming.v1.AdbServiceProto
          .internal_static_google_cloud_devicestreaming_v1_StreamStatus_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.devicestreaming.v1.StreamStatus getDefaultInstanceForType() {
      return com.google.cloud.devicestreaming.v1.StreamStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.devicestreaming.v1.StreamStatus build() {
      com.google.cloud.devicestreaming.v1.StreamStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.devicestreaming.v1.StreamStatus buildPartial() {
      com.google.cloud.devicestreaming.v1.StreamStatus result =
          new com.google.cloud.devicestreaming.v1.StreamStatus(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.devicestreaming.v1.StreamStatus result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.streamId_ = streamId_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.devicestreaming.v1.StreamStatus result) {
      result.statusCase_ = statusCase_;
      result.status_ = this.status_;
      if (statusCase_ == 2 && okayBuilder_ != null) {
        result.status_ = okayBuilder_.build();
      }
      if (statusCase_ == 3 && failBuilder_ != null) {
        result.status_ = failBuilder_.build();
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
      if (other instanceof com.google.cloud.devicestreaming.v1.StreamStatus) {
        return mergeFrom((com.google.cloud.devicestreaming.v1.StreamStatus) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.devicestreaming.v1.StreamStatus other) {
      if (other == com.google.cloud.devicestreaming.v1.StreamStatus.getDefaultInstance())
        return this;
      if (other.getStreamId() != 0) {
        setStreamId(other.getStreamId());
      }
      switch (other.getStatusCase()) {
        case OKAY:
          {
            mergeOkay(other.getOkay());
            break;
          }
        case FAIL:
          {
            mergeFail(other.getFail());
            break;
          }
        case STATUS_NOT_SET:
          {
            break;
          }
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
                input.readMessage(getOkayFieldBuilder().getBuilder(), extensionRegistry);
                statusCase_ = 2;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getFailFieldBuilder().getBuilder(), extensionRegistry);
                statusCase_ = 3;
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

    private int statusCase_ = 0;
    private java.lang.Object status_;

    public StatusCase getStatusCase() {
      return StatusCase.forNumber(statusCase_);
    }

    public Builder clearStatus() {
      statusCase_ = 0;
      status_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private int streamId_;

    /**
     *
     *
     * <pre>
     * The unique ID of this stream, assigned by the client.
     * </pre>
     *
     * <code>int32 stream_id = 1;</code>
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
     * The unique ID of this stream, assigned by the client.
     * </pre>
     *
     * <code>int32 stream_id = 1;</code>
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
     * The unique ID of this stream, assigned by the client.
     * </pre>
     *
     * <code>int32 stream_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStreamId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      streamId_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.devicestreaming.v1.Okay,
            com.google.cloud.devicestreaming.v1.Okay.Builder,
            com.google.cloud.devicestreaming.v1.OkayOrBuilder>
        okayBuilder_;

    /**
     *
     *
     * <pre>
     * Okay for success.
     * </pre>
     *
     * <code>.google.cloud.devicestreaming.v1.Okay okay = 2;</code>
     *
     * @return Whether the okay field is set.
     */
    @java.lang.Override
    public boolean hasOkay() {
      return statusCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * Okay for success.
     * </pre>
     *
     * <code>.google.cloud.devicestreaming.v1.Okay okay = 2;</code>
     *
     * @return The okay.
     */
    @java.lang.Override
    public com.google.cloud.devicestreaming.v1.Okay getOkay() {
      if (okayBuilder_ == null) {
        if (statusCase_ == 2) {
          return (com.google.cloud.devicestreaming.v1.Okay) status_;
        }
        return com.google.cloud.devicestreaming.v1.Okay.getDefaultInstance();
      } else {
        if (statusCase_ == 2) {
          return okayBuilder_.getMessage();
        }
        return com.google.cloud.devicestreaming.v1.Okay.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Okay for success.
     * </pre>
     *
     * <code>.google.cloud.devicestreaming.v1.Okay okay = 2;</code>
     */
    public Builder setOkay(com.google.cloud.devicestreaming.v1.Okay value) {
      if (okayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        okayBuilder_.setMessage(value);
      }
      statusCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Okay for success.
     * </pre>
     *
     * <code>.google.cloud.devicestreaming.v1.Okay okay = 2;</code>
     */
    public Builder setOkay(com.google.cloud.devicestreaming.v1.Okay.Builder builderForValue) {
      if (okayBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        okayBuilder_.setMessage(builderForValue.build());
      }
      statusCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Okay for success.
     * </pre>
     *
     * <code>.google.cloud.devicestreaming.v1.Okay okay = 2;</code>
     */
    public Builder mergeOkay(com.google.cloud.devicestreaming.v1.Okay value) {
      if (okayBuilder_ == null) {
        if (statusCase_ == 2
            && status_ != com.google.cloud.devicestreaming.v1.Okay.getDefaultInstance()) {
          status_ =
              com.google.cloud.devicestreaming.v1.Okay.newBuilder(
                      (com.google.cloud.devicestreaming.v1.Okay) status_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        if (statusCase_ == 2) {
          okayBuilder_.mergeFrom(value);
        } else {
          okayBuilder_.setMessage(value);
        }
      }
      statusCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Okay for success.
     * </pre>
     *
     * <code>.google.cloud.devicestreaming.v1.Okay okay = 2;</code>
     */
    public Builder clearOkay() {
      if (okayBuilder_ == null) {
        if (statusCase_ == 2) {
          statusCase_ = 0;
          status_ = null;
          onChanged();
        }
      } else {
        if (statusCase_ == 2) {
          statusCase_ = 0;
          status_ = null;
        }
        okayBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Okay for success.
     * </pre>
     *
     * <code>.google.cloud.devicestreaming.v1.Okay okay = 2;</code>
     */
    public com.google.cloud.devicestreaming.v1.Okay.Builder getOkayBuilder() {
      return getOkayFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Okay for success.
     * </pre>
     *
     * <code>.google.cloud.devicestreaming.v1.Okay okay = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.devicestreaming.v1.OkayOrBuilder getOkayOrBuilder() {
      if ((statusCase_ == 2) && (okayBuilder_ != null)) {
        return okayBuilder_.getMessageOrBuilder();
      } else {
        if (statusCase_ == 2) {
          return (com.google.cloud.devicestreaming.v1.Okay) status_;
        }
        return com.google.cloud.devicestreaming.v1.Okay.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Okay for success.
     * </pre>
     *
     * <code>.google.cloud.devicestreaming.v1.Okay okay = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.devicestreaming.v1.Okay,
            com.google.cloud.devicestreaming.v1.Okay.Builder,
            com.google.cloud.devicestreaming.v1.OkayOrBuilder>
        getOkayFieldBuilder() {
      if (okayBuilder_ == null) {
        if (!(statusCase_ == 2)) {
          status_ = com.google.cloud.devicestreaming.v1.Okay.getDefaultInstance();
        }
        okayBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.devicestreaming.v1.Okay,
                com.google.cloud.devicestreaming.v1.Okay.Builder,
                com.google.cloud.devicestreaming.v1.OkayOrBuilder>(
                (com.google.cloud.devicestreaming.v1.Okay) status_,
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      statusCase_ = 2;
      onChanged();
      return okayBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.devicestreaming.v1.Fail,
            com.google.cloud.devicestreaming.v1.Fail.Builder,
            com.google.cloud.devicestreaming.v1.FailOrBuilder>
        failBuilder_;

    /**
     *
     *
     * <pre>
     * Fail for failure.
     * </pre>
     *
     * <code>.google.cloud.devicestreaming.v1.Fail fail = 3;</code>
     *
     * @return Whether the fail field is set.
     */
    @java.lang.Override
    public boolean hasFail() {
      return statusCase_ == 3;
    }

    /**
     *
     *
     * <pre>
     * Fail for failure.
     * </pre>
     *
     * <code>.google.cloud.devicestreaming.v1.Fail fail = 3;</code>
     *
     * @return The fail.
     */
    @java.lang.Override
    public com.google.cloud.devicestreaming.v1.Fail getFail() {
      if (failBuilder_ == null) {
        if (statusCase_ == 3) {
          return (com.google.cloud.devicestreaming.v1.Fail) status_;
        }
        return com.google.cloud.devicestreaming.v1.Fail.getDefaultInstance();
      } else {
        if (statusCase_ == 3) {
          return failBuilder_.getMessage();
        }
        return com.google.cloud.devicestreaming.v1.Fail.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Fail for failure.
     * </pre>
     *
     * <code>.google.cloud.devicestreaming.v1.Fail fail = 3;</code>
     */
    public Builder setFail(com.google.cloud.devicestreaming.v1.Fail value) {
      if (failBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        failBuilder_.setMessage(value);
      }
      statusCase_ = 3;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Fail for failure.
     * </pre>
     *
     * <code>.google.cloud.devicestreaming.v1.Fail fail = 3;</code>
     */
    public Builder setFail(com.google.cloud.devicestreaming.v1.Fail.Builder builderForValue) {
      if (failBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        failBuilder_.setMessage(builderForValue.build());
      }
      statusCase_ = 3;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Fail for failure.
     * </pre>
     *
     * <code>.google.cloud.devicestreaming.v1.Fail fail = 3;</code>
     */
    public Builder mergeFail(com.google.cloud.devicestreaming.v1.Fail value) {
      if (failBuilder_ == null) {
        if (statusCase_ == 3
            && status_ != com.google.cloud.devicestreaming.v1.Fail.getDefaultInstance()) {
          status_ =
              com.google.cloud.devicestreaming.v1.Fail.newBuilder(
                      (com.google.cloud.devicestreaming.v1.Fail) status_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        if (statusCase_ == 3) {
          failBuilder_.mergeFrom(value);
        } else {
          failBuilder_.setMessage(value);
        }
      }
      statusCase_ = 3;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Fail for failure.
     * </pre>
     *
     * <code>.google.cloud.devicestreaming.v1.Fail fail = 3;</code>
     */
    public Builder clearFail() {
      if (failBuilder_ == null) {
        if (statusCase_ == 3) {
          statusCase_ = 0;
          status_ = null;
          onChanged();
        }
      } else {
        if (statusCase_ == 3) {
          statusCase_ = 0;
          status_ = null;
        }
        failBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Fail for failure.
     * </pre>
     *
     * <code>.google.cloud.devicestreaming.v1.Fail fail = 3;</code>
     */
    public com.google.cloud.devicestreaming.v1.Fail.Builder getFailBuilder() {
      return getFailFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Fail for failure.
     * </pre>
     *
     * <code>.google.cloud.devicestreaming.v1.Fail fail = 3;</code>
     */
    @java.lang.Override
    public com.google.cloud.devicestreaming.v1.FailOrBuilder getFailOrBuilder() {
      if ((statusCase_ == 3) && (failBuilder_ != null)) {
        return failBuilder_.getMessageOrBuilder();
      } else {
        if (statusCase_ == 3) {
          return (com.google.cloud.devicestreaming.v1.Fail) status_;
        }
        return com.google.cloud.devicestreaming.v1.Fail.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Fail for failure.
     * </pre>
     *
     * <code>.google.cloud.devicestreaming.v1.Fail fail = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.devicestreaming.v1.Fail,
            com.google.cloud.devicestreaming.v1.Fail.Builder,
            com.google.cloud.devicestreaming.v1.FailOrBuilder>
        getFailFieldBuilder() {
      if (failBuilder_ == null) {
        if (!(statusCase_ == 3)) {
          status_ = com.google.cloud.devicestreaming.v1.Fail.getDefaultInstance();
        }
        failBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.devicestreaming.v1.Fail,
                com.google.cloud.devicestreaming.v1.Fail.Builder,
                com.google.cloud.devicestreaming.v1.FailOrBuilder>(
                (com.google.cloud.devicestreaming.v1.Fail) status_,
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      statusCase_ = 3;
      onChanged();
      return failBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.devicestreaming.v1.StreamStatus)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.devicestreaming.v1.StreamStatus)
  private static final com.google.cloud.devicestreaming.v1.StreamStatus DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.devicestreaming.v1.StreamStatus();
  }

  public static com.google.cloud.devicestreaming.v1.StreamStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamStatus> PARSER =
      new com.google.protobuf.AbstractParser<StreamStatus>() {
        @java.lang.Override
        public StreamStatus parsePartialFrom(
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

  public static com.google.protobuf.Parser<StreamStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.devicestreaming.v1.StreamStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
