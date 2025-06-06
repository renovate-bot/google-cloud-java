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
// source: google/cloud/run/v2/traffic_target.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.run.v2;

/**
 *
 *
 * <pre>
 * Holds a single traffic routing entry for the Service. Allocations can be done
 * to a specific Revision name, or pointing to the latest Ready Revision.
 * </pre>
 *
 * Protobuf type {@code google.cloud.run.v2.TrafficTarget}
 */
public final class TrafficTarget extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.run.v2.TrafficTarget)
    TrafficTargetOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use TrafficTarget.newBuilder() to construct.
  private TrafficTarget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TrafficTarget() {
    type_ = 0;
    revision_ = "";
    tag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TrafficTarget();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.run.v2.TrafficTargetProto
        .internal_static_google_cloud_run_v2_TrafficTarget_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.run.v2.TrafficTargetProto
        .internal_static_google_cloud_run_v2_TrafficTarget_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.run.v2.TrafficTarget.class,
            com.google.cloud.run.v2.TrafficTarget.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;

  /**
   *
   *
   * <pre>
   * The allocation type for this traffic target.
   * </pre>
   *
   * <code>.google.cloud.run.v2.TrafficTargetAllocationType type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override
  public int getTypeValue() {
    return type_;
  }

  /**
   *
   *
   * <pre>
   * The allocation type for this traffic target.
   * </pre>
   *
   * <code>.google.cloud.run.v2.TrafficTargetAllocationType type = 1;</code>
   *
   * @return The type.
   */
  @java.lang.Override
  public com.google.cloud.run.v2.TrafficTargetAllocationType getType() {
    com.google.cloud.run.v2.TrafficTargetAllocationType result =
        com.google.cloud.run.v2.TrafficTargetAllocationType.forNumber(type_);
    return result == null
        ? com.google.cloud.run.v2.TrafficTargetAllocationType.UNRECOGNIZED
        : result;
  }

  public static final int REVISION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object revision_ = "";

  /**
   *
   *
   * <pre>
   * Revision to which to send this portion of traffic, if traffic allocation is
   * by revision.
   * </pre>
   *
   * <code>string revision = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The revision.
   */
  @java.lang.Override
  public java.lang.String getRevision() {
    java.lang.Object ref = revision_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      revision_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Revision to which to send this portion of traffic, if traffic allocation is
   * by revision.
   * </pre>
   *
   * <code>string revision = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for revision.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRevisionBytes() {
    java.lang.Object ref = revision_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      revision_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PERCENT_FIELD_NUMBER = 3;
  private int percent_ = 0;

  /**
   *
   *
   * <pre>
   * Specifies percent of the traffic to this Revision.
   * This defaults to zero if unspecified.
   * </pre>
   *
   * <code>int32 percent = 3;</code>
   *
   * @return The percent.
   */
  @java.lang.Override
  public int getPercent() {
    return percent_;
  }

  public static final int TAG_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object tag_ = "";

  /**
   *
   *
   * <pre>
   * Indicates a string to be part of the URI to exclusively reference this
   * target.
   * </pre>
   *
   * <code>string tag = 4;</code>
   *
   * @return The tag.
   */
  @java.lang.Override
  public java.lang.String getTag() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tag_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Indicates a string to be part of the URI to exclusively reference this
   * target.
   * </pre>
   *
   * <code>string tag = 4;</code>
   *
   * @return The bytes for tag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTagBytes() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      tag_ = b;
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
    if (type_
        != com.google.cloud.run.v2.TrafficTargetAllocationType
            .TRAFFIC_TARGET_ALLOCATION_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(revision_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, revision_);
    }
    if (percent_ != 0) {
      output.writeInt32(3, percent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tag_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, tag_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_
        != com.google.cloud.run.v2.TrafficTargetAllocationType
            .TRAFFIC_TARGET_ALLOCATION_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(revision_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, revision_);
    }
    if (percent_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, percent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tag_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, tag_);
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
    if (!(obj instanceof com.google.cloud.run.v2.TrafficTarget)) {
      return super.equals(obj);
    }
    com.google.cloud.run.v2.TrafficTarget other = (com.google.cloud.run.v2.TrafficTarget) obj;

    if (type_ != other.type_) return false;
    if (!getRevision().equals(other.getRevision())) return false;
    if (getPercent() != other.getPercent()) return false;
    if (!getTag().equals(other.getTag())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + REVISION_FIELD_NUMBER;
    hash = (53 * hash) + getRevision().hashCode();
    hash = (37 * hash) + PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + getPercent();
    hash = (37 * hash) + TAG_FIELD_NUMBER;
    hash = (53 * hash) + getTag().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.run.v2.TrafficTarget parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.TrafficTarget parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.TrafficTarget parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.TrafficTarget parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.TrafficTarget parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.TrafficTarget parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.TrafficTarget parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.TrafficTarget parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.TrafficTarget parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.TrafficTarget parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.TrafficTarget parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.TrafficTarget parseFrom(
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

  public static Builder newBuilder(com.google.cloud.run.v2.TrafficTarget prototype) {
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
   * Holds a single traffic routing entry for the Service. Allocations can be done
   * to a specific Revision name, or pointing to the latest Ready Revision.
   * </pre>
   *
   * Protobuf type {@code google.cloud.run.v2.TrafficTarget}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.run.v2.TrafficTarget)
      com.google.cloud.run.v2.TrafficTargetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.run.v2.TrafficTargetProto
          .internal_static_google_cloud_run_v2_TrafficTarget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.run.v2.TrafficTargetProto
          .internal_static_google_cloud_run_v2_TrafficTarget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.run.v2.TrafficTarget.class,
              com.google.cloud.run.v2.TrafficTarget.Builder.class);
    }

    // Construct using com.google.cloud.run.v2.TrafficTarget.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = 0;
      revision_ = "";
      percent_ = 0;
      tag_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.run.v2.TrafficTargetProto
          .internal_static_google_cloud_run_v2_TrafficTarget_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.TrafficTarget getDefaultInstanceForType() {
      return com.google.cloud.run.v2.TrafficTarget.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.run.v2.TrafficTarget build() {
      com.google.cloud.run.v2.TrafficTarget result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.TrafficTarget buildPartial() {
      com.google.cloud.run.v2.TrafficTarget result =
          new com.google.cloud.run.v2.TrafficTarget(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.run.v2.TrafficTarget result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.revision_ = revision_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.percent_ = percent_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.tag_ = tag_;
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
      if (other instanceof com.google.cloud.run.v2.TrafficTarget) {
        return mergeFrom((com.google.cloud.run.v2.TrafficTarget) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.run.v2.TrafficTarget other) {
      if (other == com.google.cloud.run.v2.TrafficTarget.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getRevision().isEmpty()) {
        revision_ = other.revision_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getPercent() != 0) {
        setPercent(other.getPercent());
      }
      if (!other.getTag().isEmpty()) {
        tag_ = other.tag_;
        bitField0_ |= 0x00000008;
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
                type_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                revision_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                percent_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 34:
              {
                tag_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

    private int type_ = 0;

    /**
     *
     *
     * <pre>
     * The allocation type for this traffic target.
     * </pre>
     *
     * <code>.google.cloud.run.v2.TrafficTargetAllocationType type = 1;</code>
     *
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override
    public int getTypeValue() {
      return type_;
    }

    /**
     *
     *
     * <pre>
     * The allocation type for this traffic target.
     * </pre>
     *
     * <code>.google.cloud.run.v2.TrafficTargetAllocationType type = 1;</code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The allocation type for this traffic target.
     * </pre>
     *
     * <code>.google.cloud.run.v2.TrafficTargetAllocationType type = 1;</code>
     *
     * @return The type.
     */
    @java.lang.Override
    public com.google.cloud.run.v2.TrafficTargetAllocationType getType() {
      com.google.cloud.run.v2.TrafficTargetAllocationType result =
          com.google.cloud.run.v2.TrafficTargetAllocationType.forNumber(type_);
      return result == null
          ? com.google.cloud.run.v2.TrafficTargetAllocationType.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * The allocation type for this traffic target.
     * </pre>
     *
     * <code>.google.cloud.run.v2.TrafficTargetAllocationType type = 1;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.cloud.run.v2.TrafficTargetAllocationType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The allocation type for this traffic target.
     * </pre>
     *
     * <code>.google.cloud.run.v2.TrafficTargetAllocationType type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object revision_ = "";

    /**
     *
     *
     * <pre>
     * Revision to which to send this portion of traffic, if traffic allocation is
     * by revision.
     * </pre>
     *
     * <code>string revision = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The revision.
     */
    public java.lang.String getRevision() {
      java.lang.Object ref = revision_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        revision_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Revision to which to send this portion of traffic, if traffic allocation is
     * by revision.
     * </pre>
     *
     * <code>string revision = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for revision.
     */
    public com.google.protobuf.ByteString getRevisionBytes() {
      java.lang.Object ref = revision_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        revision_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Revision to which to send this portion of traffic, if traffic allocation is
     * by revision.
     * </pre>
     *
     * <code>string revision = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The revision to set.
     * @return This builder for chaining.
     */
    public Builder setRevision(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      revision_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Revision to which to send this portion of traffic, if traffic allocation is
     * by revision.
     * </pre>
     *
     * <code>string revision = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRevision() {
      revision_ = getDefaultInstance().getRevision();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Revision to which to send this portion of traffic, if traffic allocation is
     * by revision.
     * </pre>
     *
     * <code>string revision = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for revision to set.
     * @return This builder for chaining.
     */
    public Builder setRevisionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      revision_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int percent_;

    /**
     *
     *
     * <pre>
     * Specifies percent of the traffic to this Revision.
     * This defaults to zero if unspecified.
     * </pre>
     *
     * <code>int32 percent = 3;</code>
     *
     * @return The percent.
     */
    @java.lang.Override
    public int getPercent() {
      return percent_;
    }

    /**
     *
     *
     * <pre>
     * Specifies percent of the traffic to this Revision.
     * This defaults to zero if unspecified.
     * </pre>
     *
     * <code>int32 percent = 3;</code>
     *
     * @param value The percent to set.
     * @return This builder for chaining.
     */
    public Builder setPercent(int value) {

      percent_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Specifies percent of the traffic to this Revision.
     * This defaults to zero if unspecified.
     * </pre>
     *
     * <code>int32 percent = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPercent() {
      bitField0_ = (bitField0_ & ~0x00000004);
      percent_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object tag_ = "";

    /**
     *
     *
     * <pre>
     * Indicates a string to be part of the URI to exclusively reference this
     * target.
     * </pre>
     *
     * <code>string tag = 4;</code>
     *
     * @return The tag.
     */
    public java.lang.String getTag() {
      java.lang.Object ref = tag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Indicates a string to be part of the URI to exclusively reference this
     * target.
     * </pre>
     *
     * <code>string tag = 4;</code>
     *
     * @return The bytes for tag.
     */
    public com.google.protobuf.ByteString getTagBytes() {
      java.lang.Object ref = tag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Indicates a string to be part of the URI to exclusively reference this
     * target.
     * </pre>
     *
     * <code>string tag = 4;</code>
     *
     * @param value The tag to set.
     * @return This builder for chaining.
     */
    public Builder setTag(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      tag_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Indicates a string to be part of the URI to exclusively reference this
     * target.
     * </pre>
     *
     * <code>string tag = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTag() {
      tag_ = getDefaultInstance().getTag();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Indicates a string to be part of the URI to exclusively reference this
     * target.
     * </pre>
     *
     * <code>string tag = 4;</code>
     *
     * @param value The bytes for tag to set.
     * @return This builder for chaining.
     */
    public Builder setTagBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      tag_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.run.v2.TrafficTarget)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.run.v2.TrafficTarget)
  private static final com.google.cloud.run.v2.TrafficTarget DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.run.v2.TrafficTarget();
  }

  public static com.google.cloud.run.v2.TrafficTarget getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrafficTarget> PARSER =
      new com.google.protobuf.AbstractParser<TrafficTarget>() {
        @java.lang.Override
        public TrafficTarget parsePartialFrom(
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

  public static com.google.protobuf.Parser<TrafficTarget> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrafficTarget> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.run.v2.TrafficTarget getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
