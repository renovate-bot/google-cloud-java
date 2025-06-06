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
// source: google/cloud/datacatalog/v1/common.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Entry metadata relevant only to the user and private to them.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.PersonalDetails}
 */
public final class PersonalDetails extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.PersonalDetails)
    PersonalDetailsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use PersonalDetails.newBuilder() to construct.
  private PersonalDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PersonalDetails() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PersonalDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.Common
        .internal_static_google_cloud_datacatalog_v1_PersonalDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Common
        .internal_static_google_cloud_datacatalog_v1_PersonalDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.PersonalDetails.class,
            com.google.cloud.datacatalog.v1.PersonalDetails.Builder.class);
  }

  private int bitField0_;
  public static final int STARRED_FIELD_NUMBER = 1;
  private boolean starred_ = false;

  /**
   *
   *
   * <pre>
   * True if the entry is starred by the user; false otherwise.
   * </pre>
   *
   * <code>bool starred = 1;</code>
   *
   * @return The starred.
   */
  @java.lang.Override
  public boolean getStarred() {
    return starred_;
  }

  public static final int STAR_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp starTime_;

  /**
   *
   *
   * <pre>
   * Set if the entry is starred; unset otherwise.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp star_time = 2;</code>
   *
   * @return Whether the starTime field is set.
   */
  @java.lang.Override
  public boolean hasStarTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Set if the entry is starred; unset otherwise.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp star_time = 2;</code>
   *
   * @return The starTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStarTime() {
    return starTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : starTime_;
  }

  /**
   *
   *
   * <pre>
   * Set if the entry is starred; unset otherwise.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp star_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStarTimeOrBuilder() {
    return starTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : starTime_;
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
    if (starred_ != false) {
      output.writeBool(1, starred_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getStarTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (starred_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, starred_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getStarTime());
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.PersonalDetails)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.PersonalDetails other =
        (com.google.cloud.datacatalog.v1.PersonalDetails) obj;

    if (getStarred() != other.getStarred()) return false;
    if (hasStarTime() != other.hasStarTime()) return false;
    if (hasStarTime()) {
      if (!getStarTime().equals(other.getStarTime())) return false;
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
    hash = (37 * hash) + STARRED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getStarred());
    if (hasStarTime()) {
      hash = (37 * hash) + STAR_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStarTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.PersonalDetails parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.PersonalDetails parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.PersonalDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.PersonalDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.PersonalDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.PersonalDetails parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.PersonalDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.PersonalDetails parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.PersonalDetails parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.PersonalDetails parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.PersonalDetails parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.PersonalDetails parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datacatalog.v1.PersonalDetails prototype) {
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
   * Entry metadata relevant only to the user and private to them.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.PersonalDetails}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.PersonalDetails)
      com.google.cloud.datacatalog.v1.PersonalDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.Common
          .internal_static_google_cloud_datacatalog_v1_PersonalDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Common
          .internal_static_google_cloud_datacatalog_v1_PersonalDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.PersonalDetails.class,
              com.google.cloud.datacatalog.v1.PersonalDetails.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.PersonalDetails.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getStarTimeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      starred_ = false;
      starTime_ = null;
      if (starTimeBuilder_ != null) {
        starTimeBuilder_.dispose();
        starTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.Common
          .internal_static_google_cloud_datacatalog_v1_PersonalDetails_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.PersonalDetails getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.PersonalDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.PersonalDetails build() {
      com.google.cloud.datacatalog.v1.PersonalDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.PersonalDetails buildPartial() {
      com.google.cloud.datacatalog.v1.PersonalDetails result =
          new com.google.cloud.datacatalog.v1.PersonalDetails(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.PersonalDetails result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.starred_ = starred_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.starTime_ = starTimeBuilder_ == null ? starTime_ : starTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.datacatalog.v1.PersonalDetails) {
        return mergeFrom((com.google.cloud.datacatalog.v1.PersonalDetails) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.PersonalDetails other) {
      if (other == com.google.cloud.datacatalog.v1.PersonalDetails.getDefaultInstance())
        return this;
      if (other.getStarred() != false) {
        setStarred(other.getStarred());
      }
      if (other.hasStarTime()) {
        mergeStarTime(other.getStarTime());
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
                starred_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(getStarTimeFieldBuilder().getBuilder(), extensionRegistry);
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

    private boolean starred_;

    /**
     *
     *
     * <pre>
     * True if the entry is starred by the user; false otherwise.
     * </pre>
     *
     * <code>bool starred = 1;</code>
     *
     * @return The starred.
     */
    @java.lang.Override
    public boolean getStarred() {
      return starred_;
    }

    /**
     *
     *
     * <pre>
     * True if the entry is starred by the user; false otherwise.
     * </pre>
     *
     * <code>bool starred = 1;</code>
     *
     * @param value The starred to set.
     * @return This builder for chaining.
     */
    public Builder setStarred(boolean value) {

      starred_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * True if the entry is starred by the user; false otherwise.
     * </pre>
     *
     * <code>bool starred = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStarred() {
      bitField0_ = (bitField0_ & ~0x00000001);
      starred_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp starTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        starTimeBuilder_;

    /**
     *
     *
     * <pre>
     * Set if the entry is starred; unset otherwise.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp star_time = 2;</code>
     *
     * @return Whether the starTime field is set.
     */
    public boolean hasStarTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Set if the entry is starred; unset otherwise.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp star_time = 2;</code>
     *
     * @return The starTime.
     */
    public com.google.protobuf.Timestamp getStarTime() {
      if (starTimeBuilder_ == null) {
        return starTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : starTime_;
      } else {
        return starTimeBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Set if the entry is starred; unset otherwise.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp star_time = 2;</code>
     */
    public Builder setStarTime(com.google.protobuf.Timestamp value) {
      if (starTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        starTime_ = value;
      } else {
        starTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Set if the entry is starred; unset otherwise.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp star_time = 2;</code>
     */
    public Builder setStarTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (starTimeBuilder_ == null) {
        starTime_ = builderForValue.build();
      } else {
        starTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Set if the entry is starred; unset otherwise.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp star_time = 2;</code>
     */
    public Builder mergeStarTime(com.google.protobuf.Timestamp value) {
      if (starTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && starTime_ != null
            && starTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getStarTimeBuilder().mergeFrom(value);
        } else {
          starTime_ = value;
        }
      } else {
        starTimeBuilder_.mergeFrom(value);
      }
      if (starTime_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Set if the entry is starred; unset otherwise.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp star_time = 2;</code>
     */
    public Builder clearStarTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      starTime_ = null;
      if (starTimeBuilder_ != null) {
        starTimeBuilder_.dispose();
        starTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Set if the entry is starred; unset otherwise.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp star_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStarTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStarTimeFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Set if the entry is starred; unset otherwise.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp star_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStarTimeOrBuilder() {
      if (starTimeBuilder_ != null) {
        return starTimeBuilder_.getMessageOrBuilder();
      } else {
        return starTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : starTime_;
      }
    }

    /**
     *
     *
     * <pre>
     * Set if the entry is starred; unset otherwise.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp star_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getStarTimeFieldBuilder() {
      if (starTimeBuilder_ == null) {
        starTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getStarTime(), getParentForChildren(), isClean());
        starTime_ = null;
      }
      return starTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.PersonalDetails)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.PersonalDetails)
  private static final com.google.cloud.datacatalog.v1.PersonalDetails DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.PersonalDetails();
  }

  public static com.google.cloud.datacatalog.v1.PersonalDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersonalDetails> PARSER =
      new com.google.protobuf.AbstractParser<PersonalDetails>() {
        @java.lang.Override
        public PersonalDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<PersonalDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersonalDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.PersonalDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
