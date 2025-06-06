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
// source: google/cloud/channel/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [CloudChannelService.UpdateChannelPartnerRepricingConfig][google.cloud.channel.v1.CloudChannelService.UpdateChannelPartnerRepricingConfig].
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest}
 */
public final class UpdateChannelPartnerRepricingConfigRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest)
    UpdateChannelPartnerRepricingConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UpdateChannelPartnerRepricingConfigRequest.newBuilder() to construct.
  private UpdateChannelPartnerRepricingConfigRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateChannelPartnerRepricingConfigRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateChannelPartnerRepricingConfigRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_UpdateChannelPartnerRepricingConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_UpdateChannelPartnerRepricingConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest.class,
            com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest.Builder.class);
  }

  private int bitField0_;
  public static final int CHANNEL_PARTNER_REPRICING_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.channel.v1.ChannelPartnerRepricingConfig channelPartnerRepricingConfig_;

  /**
   *
   *
   * <pre>
   * Required. The ChannelPartnerRepricingConfig object to update.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the channelPartnerRepricingConfig field is set.
   */
  @java.lang.Override
  public boolean hasChannelPartnerRepricingConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The ChannelPartnerRepricingConfig object to update.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The channelPartnerRepricingConfig.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.ChannelPartnerRepricingConfig
      getChannelPartnerRepricingConfig() {
    return channelPartnerRepricingConfig_ == null
        ? com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.getDefaultInstance()
        : channelPartnerRepricingConfig_;
  }

  /**
   *
   *
   * <pre>
   * Required. The ChannelPartnerRepricingConfig object to update.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.ChannelPartnerRepricingConfigOrBuilder
      getChannelPartnerRepricingConfigOrBuilder() {
    return channelPartnerRepricingConfig_ == null
        ? com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.getDefaultInstance()
        : channelPartnerRepricingConfig_;
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
      output.writeMessage(1, getChannelPartnerRepricingConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, getChannelPartnerRepricingConfig());
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
    if (!(obj instanceof com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest other =
        (com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest) obj;

    if (hasChannelPartnerRepricingConfig() != other.hasChannelPartnerRepricingConfig())
      return false;
    if (hasChannelPartnerRepricingConfig()) {
      if (!getChannelPartnerRepricingConfig().equals(other.getChannelPartnerRepricingConfig()))
        return false;
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
    if (hasChannelPartnerRepricingConfig()) {
      hash = (37 * hash) + CHANNEL_PARTNER_REPRICING_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getChannelPartnerRepricingConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest prototype) {
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
   * [CloudChannelService.UpdateChannelPartnerRepricingConfig][google.cloud.channel.v1.CloudChannelService.UpdateChannelPartnerRepricingConfig].
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest)
      com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_UpdateChannelPartnerRepricingConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_UpdateChannelPartnerRepricingConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest.class,
              com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getChannelPartnerRepricingConfigFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      channelPartnerRepricingConfig_ = null;
      if (channelPartnerRepricingConfigBuilder_ != null) {
        channelPartnerRepricingConfigBuilder_.dispose();
        channelPartnerRepricingConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_UpdateChannelPartnerRepricingConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest
        getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest build() {
      com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest buildPartial() {
      com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest result =
          new com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.channelPartnerRepricingConfig_ =
            channelPartnerRepricingConfigBuilder_ == null
                ? channelPartnerRepricingConfig_
                : channelPartnerRepricingConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest) {
        return mergeFrom(
            (com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest other) {
      if (other
          == com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest
              .getDefaultInstance()) return this;
      if (other.hasChannelPartnerRepricingConfig()) {
        mergeChannelPartnerRepricingConfig(other.getChannelPartnerRepricingConfig());
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
                input.readMessage(
                    getChannelPartnerRepricingConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.cloud.channel.v1.ChannelPartnerRepricingConfig
        channelPartnerRepricingConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.ChannelPartnerRepricingConfig,
            com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.Builder,
            com.google.cloud.channel.v1.ChannelPartnerRepricingConfigOrBuilder>
        channelPartnerRepricingConfigBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The ChannelPartnerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the channelPartnerRepricingConfig field is set.
     */
    public boolean hasChannelPartnerRepricingConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The ChannelPartnerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The channelPartnerRepricingConfig.
     */
    public com.google.cloud.channel.v1.ChannelPartnerRepricingConfig
        getChannelPartnerRepricingConfig() {
      if (channelPartnerRepricingConfigBuilder_ == null) {
        return channelPartnerRepricingConfig_ == null
            ? com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.getDefaultInstance()
            : channelPartnerRepricingConfig_;
      } else {
        return channelPartnerRepricingConfigBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The ChannelPartnerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setChannelPartnerRepricingConfig(
        com.google.cloud.channel.v1.ChannelPartnerRepricingConfig value) {
      if (channelPartnerRepricingConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        channelPartnerRepricingConfig_ = value;
      } else {
        channelPartnerRepricingConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The ChannelPartnerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setChannelPartnerRepricingConfig(
        com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.Builder builderForValue) {
      if (channelPartnerRepricingConfigBuilder_ == null) {
        channelPartnerRepricingConfig_ = builderForValue.build();
      } else {
        channelPartnerRepricingConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The ChannelPartnerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeChannelPartnerRepricingConfig(
        com.google.cloud.channel.v1.ChannelPartnerRepricingConfig value) {
      if (channelPartnerRepricingConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && channelPartnerRepricingConfig_ != null
            && channelPartnerRepricingConfig_
                != com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.getDefaultInstance()) {
          getChannelPartnerRepricingConfigBuilder().mergeFrom(value);
        } else {
          channelPartnerRepricingConfig_ = value;
        }
      } else {
        channelPartnerRepricingConfigBuilder_.mergeFrom(value);
      }
      if (channelPartnerRepricingConfig_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The ChannelPartnerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearChannelPartnerRepricingConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      channelPartnerRepricingConfig_ = null;
      if (channelPartnerRepricingConfigBuilder_ != null) {
        channelPartnerRepricingConfigBuilder_.dispose();
        channelPartnerRepricingConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The ChannelPartnerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.Builder
        getChannelPartnerRepricingConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getChannelPartnerRepricingConfigFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The ChannelPartnerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.channel.v1.ChannelPartnerRepricingConfigOrBuilder
        getChannelPartnerRepricingConfigOrBuilder() {
      if (channelPartnerRepricingConfigBuilder_ != null) {
        return channelPartnerRepricingConfigBuilder_.getMessageOrBuilder();
      } else {
        return channelPartnerRepricingConfig_ == null
            ? com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.getDefaultInstance()
            : channelPartnerRepricingConfig_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The ChannelPartnerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.ChannelPartnerRepricingConfig,
            com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.Builder,
            com.google.cloud.channel.v1.ChannelPartnerRepricingConfigOrBuilder>
        getChannelPartnerRepricingConfigFieldBuilder() {
      if (channelPartnerRepricingConfigBuilder_ == null) {
        channelPartnerRepricingConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.channel.v1.ChannelPartnerRepricingConfig,
                com.google.cloud.channel.v1.ChannelPartnerRepricingConfig.Builder,
                com.google.cloud.channel.v1.ChannelPartnerRepricingConfigOrBuilder>(
                getChannelPartnerRepricingConfig(), getParentForChildren(), isClean());
        channelPartnerRepricingConfig_ = null;
      }
      return channelPartnerRepricingConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest)
  private static final com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest();
  }

  public static com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateChannelPartnerRepricingConfigRequest>
      PARSER =
          new com.google.protobuf.AbstractParser<UpdateChannelPartnerRepricingConfigRequest>() {
            @java.lang.Override
            public UpdateChannelPartnerRepricingConfigRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<UpdateChannelPartnerRepricingConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateChannelPartnerRepricingConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
