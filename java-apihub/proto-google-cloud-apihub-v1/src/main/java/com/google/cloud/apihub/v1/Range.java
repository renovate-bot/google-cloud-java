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
// source: google/cloud/apihub/v1/common_fields.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.apihub.v1;

/**
 *
 *
 * <pre>
 * Object describing where in the file the issue was found.
 * </pre>
 *
 * Protobuf type {@code google.cloud.apihub.v1.Range}
 */
public final class Range extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.apihub.v1.Range)
    RangeOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Range.newBuilder() to construct.
  private Range(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Range() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Range();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.apihub.v1.CommonFieldsProto
        .internal_static_google_cloud_apihub_v1_Range_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apihub.v1.CommonFieldsProto
        .internal_static_google_cloud_apihub_v1_Range_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apihub.v1.Range.class, com.google.cloud.apihub.v1.Range.Builder.class);
  }

  private int bitField0_;
  public static final int START_FIELD_NUMBER = 1;
  private com.google.cloud.apihub.v1.Point start_;

  /**
   *
   *
   * <pre>
   * Required. Start of the issue.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Point start = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the start field is set.
   */
  @java.lang.Override
  public boolean hasStart() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. Start of the issue.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Point start = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The start.
   */
  @java.lang.Override
  public com.google.cloud.apihub.v1.Point getStart() {
    return start_ == null ? com.google.cloud.apihub.v1.Point.getDefaultInstance() : start_;
  }

  /**
   *
   *
   * <pre>
   * Required. Start of the issue.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Point start = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.apihub.v1.PointOrBuilder getStartOrBuilder() {
    return start_ == null ? com.google.cloud.apihub.v1.Point.getDefaultInstance() : start_;
  }

  public static final int END_FIELD_NUMBER = 2;
  private com.google.cloud.apihub.v1.Point end_;

  /**
   *
   *
   * <pre>
   * Required. End of the issue.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Point end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the end field is set.
   */
  @java.lang.Override
  public boolean hasEnd() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. End of the issue.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Point end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The end.
   */
  @java.lang.Override
  public com.google.cloud.apihub.v1.Point getEnd() {
    return end_ == null ? com.google.cloud.apihub.v1.Point.getDefaultInstance() : end_;
  }

  /**
   *
   *
   * <pre>
   * Required. End of the issue.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Point end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.apihub.v1.PointOrBuilder getEndOrBuilder() {
    return end_ == null ? com.google.cloud.apihub.v1.Point.getDefaultInstance() : end_;
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
      output.writeMessage(1, getStart());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getEnd());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getStart());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEnd());
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
    if (!(obj instanceof com.google.cloud.apihub.v1.Range)) {
      return super.equals(obj);
    }
    com.google.cloud.apihub.v1.Range other = (com.google.cloud.apihub.v1.Range) obj;

    if (hasStart() != other.hasStart()) return false;
    if (hasStart()) {
      if (!getStart().equals(other.getStart())) return false;
    }
    if (hasEnd() != other.hasEnd()) return false;
    if (hasEnd()) {
      if (!getEnd().equals(other.getEnd())) return false;
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
    if (hasStart()) {
      hash = (37 * hash) + START_FIELD_NUMBER;
      hash = (53 * hash) + getStart().hashCode();
    }
    if (hasEnd()) {
      hash = (37 * hash) + END_FIELD_NUMBER;
      hash = (53 * hash) + getEnd().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apihub.v1.Range parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apihub.v1.Range parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.Range parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apihub.v1.Range parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.Range parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apihub.v1.Range parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.Range parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apihub.v1.Range parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.Range parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.apihub.v1.Range parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.Range parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apihub.v1.Range parseFrom(
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

  public static Builder newBuilder(com.google.cloud.apihub.v1.Range prototype) {
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
   * Object describing where in the file the issue was found.
   * </pre>
   *
   * Protobuf type {@code google.cloud.apihub.v1.Range}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apihub.v1.Range)
      com.google.cloud.apihub.v1.RangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.apihub.v1.CommonFieldsProto
          .internal_static_google_cloud_apihub_v1_Range_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apihub.v1.CommonFieldsProto
          .internal_static_google_cloud_apihub_v1_Range_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apihub.v1.Range.class,
              com.google.cloud.apihub.v1.Range.Builder.class);
    }

    // Construct using com.google.cloud.apihub.v1.Range.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getStartFieldBuilder();
        getEndFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      start_ = null;
      if (startBuilder_ != null) {
        startBuilder_.dispose();
        startBuilder_ = null;
      }
      end_ = null;
      if (endBuilder_ != null) {
        endBuilder_.dispose();
        endBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.apihub.v1.CommonFieldsProto
          .internal_static_google_cloud_apihub_v1_Range_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apihub.v1.Range getDefaultInstanceForType() {
      return com.google.cloud.apihub.v1.Range.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apihub.v1.Range build() {
      com.google.cloud.apihub.v1.Range result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apihub.v1.Range buildPartial() {
      com.google.cloud.apihub.v1.Range result = new com.google.cloud.apihub.v1.Range(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.apihub.v1.Range result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.start_ = startBuilder_ == null ? start_ : startBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.end_ = endBuilder_ == null ? end_ : endBuilder_.build();
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
      if (other instanceof com.google.cloud.apihub.v1.Range) {
        return mergeFrom((com.google.cloud.apihub.v1.Range) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apihub.v1.Range other) {
      if (other == com.google.cloud.apihub.v1.Range.getDefaultInstance()) return this;
      if (other.hasStart()) {
        mergeStart(other.getStart());
      }
      if (other.hasEnd()) {
        mergeEnd(other.getEnd());
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
                input.readMessage(getStartFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getEndFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.apihub.v1.Point start_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apihub.v1.Point,
            com.google.cloud.apihub.v1.Point.Builder,
            com.google.cloud.apihub.v1.PointOrBuilder>
        startBuilder_;

    /**
     *
     *
     * <pre>
     * Required. Start of the issue.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Point start = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the start field is set.
     */
    public boolean hasStart() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. Start of the issue.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Point start = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The start.
     */
    public com.google.cloud.apihub.v1.Point getStart() {
      if (startBuilder_ == null) {
        return start_ == null ? com.google.cloud.apihub.v1.Point.getDefaultInstance() : start_;
      } else {
        return startBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Start of the issue.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Point start = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setStart(com.google.cloud.apihub.v1.Point value) {
      if (startBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        start_ = value;
      } else {
        startBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Start of the issue.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Point start = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setStart(com.google.cloud.apihub.v1.Point.Builder builderForValue) {
      if (startBuilder_ == null) {
        start_ = builderForValue.build();
      } else {
        startBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Start of the issue.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Point start = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeStart(com.google.cloud.apihub.v1.Point value) {
      if (startBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && start_ != null
            && start_ != com.google.cloud.apihub.v1.Point.getDefaultInstance()) {
          getStartBuilder().mergeFrom(value);
        } else {
          start_ = value;
        }
      } else {
        startBuilder_.mergeFrom(value);
      }
      if (start_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Start of the issue.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Point start = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearStart() {
      bitField0_ = (bitField0_ & ~0x00000001);
      start_ = null;
      if (startBuilder_ != null) {
        startBuilder_.dispose();
        startBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Start of the issue.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Point start = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.apihub.v1.Point.Builder getStartBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStartFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. Start of the issue.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Point start = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.apihub.v1.PointOrBuilder getStartOrBuilder() {
      if (startBuilder_ != null) {
        return startBuilder_.getMessageOrBuilder();
      } else {
        return start_ == null ? com.google.cloud.apihub.v1.Point.getDefaultInstance() : start_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Start of the issue.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Point start = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apihub.v1.Point,
            com.google.cloud.apihub.v1.Point.Builder,
            com.google.cloud.apihub.v1.PointOrBuilder>
        getStartFieldBuilder() {
      if (startBuilder_ == null) {
        startBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.apihub.v1.Point,
                com.google.cloud.apihub.v1.Point.Builder,
                com.google.cloud.apihub.v1.PointOrBuilder>(
                getStart(), getParentForChildren(), isClean());
        start_ = null;
      }
      return startBuilder_;
    }

    private com.google.cloud.apihub.v1.Point end_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apihub.v1.Point,
            com.google.cloud.apihub.v1.Point.Builder,
            com.google.cloud.apihub.v1.PointOrBuilder>
        endBuilder_;

    /**
     *
     *
     * <pre>
     * Required. End of the issue.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Point end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the end field is set.
     */
    public boolean hasEnd() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. End of the issue.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Point end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The end.
     */
    public com.google.cloud.apihub.v1.Point getEnd() {
      if (endBuilder_ == null) {
        return end_ == null ? com.google.cloud.apihub.v1.Point.getDefaultInstance() : end_;
      } else {
        return endBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. End of the issue.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Point end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEnd(com.google.cloud.apihub.v1.Point value) {
      if (endBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        end_ = value;
      } else {
        endBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. End of the issue.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Point end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEnd(com.google.cloud.apihub.v1.Point.Builder builderForValue) {
      if (endBuilder_ == null) {
        end_ = builderForValue.build();
      } else {
        endBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. End of the issue.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Point end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeEnd(com.google.cloud.apihub.v1.Point value) {
      if (endBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && end_ != null
            && end_ != com.google.cloud.apihub.v1.Point.getDefaultInstance()) {
          getEndBuilder().mergeFrom(value);
        } else {
          end_ = value;
        }
      } else {
        endBuilder_.mergeFrom(value);
      }
      if (end_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. End of the issue.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Point end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearEnd() {
      bitField0_ = (bitField0_ & ~0x00000002);
      end_ = null;
      if (endBuilder_ != null) {
        endBuilder_.dispose();
        endBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. End of the issue.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Point end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.apihub.v1.Point.Builder getEndBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEndFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. End of the issue.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Point end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.apihub.v1.PointOrBuilder getEndOrBuilder() {
      if (endBuilder_ != null) {
        return endBuilder_.getMessageOrBuilder();
      } else {
        return end_ == null ? com.google.cloud.apihub.v1.Point.getDefaultInstance() : end_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. End of the issue.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Point end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apihub.v1.Point,
            com.google.cloud.apihub.v1.Point.Builder,
            com.google.cloud.apihub.v1.PointOrBuilder>
        getEndFieldBuilder() {
      if (endBuilder_ == null) {
        endBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.apihub.v1.Point,
                com.google.cloud.apihub.v1.Point.Builder,
                com.google.cloud.apihub.v1.PointOrBuilder>(
                getEnd(), getParentForChildren(), isClean());
        end_ = null;
      }
      return endBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.apihub.v1.Range)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apihub.v1.Range)
  private static final com.google.cloud.apihub.v1.Range DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.apihub.v1.Range();
  }

  public static com.google.cloud.apihub.v1.Range getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Range> PARSER =
      new com.google.protobuf.AbstractParser<Range>() {
        @java.lang.Override
        public Range parsePartialFrom(
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

  public static com.google.protobuf.Parser<Range> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Range> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apihub.v1.Range getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
