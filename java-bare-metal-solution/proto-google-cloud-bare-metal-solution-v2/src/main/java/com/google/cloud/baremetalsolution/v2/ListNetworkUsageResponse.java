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
// source: google/cloud/baremetalsolution/v2/network.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.baremetalsolution.v2;

/**
 *
 *
 * <pre>
 * Response with Networks with IPs
 * </pre>
 *
 * Protobuf type {@code google.cloud.baremetalsolution.v2.ListNetworkUsageResponse}
 */
public final class ListNetworkUsageResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.baremetalsolution.v2.ListNetworkUsageResponse)
    ListNetworkUsageResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListNetworkUsageResponse.newBuilder() to construct.
  private ListNetworkUsageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListNetworkUsageResponse() {
    networks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListNetworkUsageResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.baremetalsolution.v2.NetworkProto
        .internal_static_google_cloud_baremetalsolution_v2_ListNetworkUsageResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.baremetalsolution.v2.NetworkProto
        .internal_static_google_cloud_baremetalsolution_v2_ListNetworkUsageResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse.class,
            com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse.Builder.class);
  }

  public static final int NETWORKS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.baremetalsolution.v2.NetworkUsage> networks_;

  /**
   *
   *
   * <pre>
   * Networks with IPs.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.baremetalsolution.v2.NetworkUsage> getNetworksList() {
    return networks_;
  }

  /**
   *
   *
   * <pre>
   * Networks with IPs.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.baremetalsolution.v2.NetworkUsageOrBuilder>
      getNetworksOrBuilderList() {
    return networks_;
  }

  /**
   *
   *
   * <pre>
   * Networks with IPs.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
   */
  @java.lang.Override
  public int getNetworksCount() {
    return networks_.size();
  }

  /**
   *
   *
   * <pre>
   * Networks with IPs.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.NetworkUsage getNetworks(int index) {
    return networks_.get(index);
  }

  /**
   *
   *
   * <pre>
   * Networks with IPs.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.NetworkUsageOrBuilder getNetworksOrBuilder(
      int index) {
    return networks_.get(index);
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
    for (int i = 0; i < networks_.size(); i++) {
      output.writeMessage(1, networks_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < networks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, networks_.get(i));
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
    if (!(obj instanceof com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse other =
        (com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse) obj;

    if (!getNetworksList().equals(other.getNetworksList())) return false;
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
    if (getNetworksCount() > 0) {
      hash = (37 * hash) + NETWORKS_FIELD_NUMBER;
      hash = (53 * hash) + getNetworksList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse parseFrom(
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
      com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse prototype) {
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
   * Response with Networks with IPs
   * </pre>
   *
   * Protobuf type {@code google.cloud.baremetalsolution.v2.ListNetworkUsageResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.baremetalsolution.v2.ListNetworkUsageResponse)
      com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.baremetalsolution.v2.NetworkProto
          .internal_static_google_cloud_baremetalsolution_v2_ListNetworkUsageResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.baremetalsolution.v2.NetworkProto
          .internal_static_google_cloud_baremetalsolution_v2_ListNetworkUsageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse.class,
              com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse.Builder.class);
    }

    // Construct using com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (networksBuilder_ == null) {
        networks_ = java.util.Collections.emptyList();
      } else {
        networks_ = null;
        networksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.baremetalsolution.v2.NetworkProto
          .internal_static_google_cloud_baremetalsolution_v2_ListNetworkUsageResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse
        getDefaultInstanceForType() {
      return com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse build() {
      com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse buildPartial() {
      com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse result =
          new com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse result) {
      if (networksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          networks_ = java.util.Collections.unmodifiableList(networks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.networks_ = networks_;
      } else {
        result.networks_ = networksBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse) {
        return mergeFrom((com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse other) {
      if (other
          == com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse.getDefaultInstance())
        return this;
      if (networksBuilder_ == null) {
        if (!other.networks_.isEmpty()) {
          if (networks_.isEmpty()) {
            networks_ = other.networks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNetworksIsMutable();
            networks_.addAll(other.networks_);
          }
          onChanged();
        }
      } else {
        if (!other.networks_.isEmpty()) {
          if (networksBuilder_.isEmpty()) {
            networksBuilder_.dispose();
            networksBuilder_ = null;
            networks_ = other.networks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            networksBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getNetworksFieldBuilder()
                    : null;
          } else {
            networksBuilder_.addAllMessages(other.networks_);
          }
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
            case 10:
              {
                com.google.cloud.baremetalsolution.v2.NetworkUsage m =
                    input.readMessage(
                        com.google.cloud.baremetalsolution.v2.NetworkUsage.parser(),
                        extensionRegistry);
                if (networksBuilder_ == null) {
                  ensureNetworksIsMutable();
                  networks_.add(m);
                } else {
                  networksBuilder_.addMessage(m);
                }
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

    private java.util.List<com.google.cloud.baremetalsolution.v2.NetworkUsage> networks_ =
        java.util.Collections.emptyList();

    private void ensureNetworksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        networks_ =
            new java.util.ArrayList<com.google.cloud.baremetalsolution.v2.NetworkUsage>(networks_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.baremetalsolution.v2.NetworkUsage,
            com.google.cloud.baremetalsolution.v2.NetworkUsage.Builder,
            com.google.cloud.baremetalsolution.v2.NetworkUsageOrBuilder>
        networksBuilder_;

    /**
     *
     *
     * <pre>
     * Networks with IPs.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
     */
    public java.util.List<com.google.cloud.baremetalsolution.v2.NetworkUsage> getNetworksList() {
      if (networksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(networks_);
      } else {
        return networksBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * Networks with IPs.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
     */
    public int getNetworksCount() {
      if (networksBuilder_ == null) {
        return networks_.size();
      } else {
        return networksBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * Networks with IPs.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
     */
    public com.google.cloud.baremetalsolution.v2.NetworkUsage getNetworks(int index) {
      if (networksBuilder_ == null) {
        return networks_.get(index);
      } else {
        return networksBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Networks with IPs.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
     */
    public Builder setNetworks(
        int index, com.google.cloud.baremetalsolution.v2.NetworkUsage value) {
      if (networksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNetworksIsMutable();
        networks_.set(index, value);
        onChanged();
      } else {
        networksBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Networks with IPs.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
     */
    public Builder setNetworks(
        int index, com.google.cloud.baremetalsolution.v2.NetworkUsage.Builder builderForValue) {
      if (networksBuilder_ == null) {
        ensureNetworksIsMutable();
        networks_.set(index, builderForValue.build());
        onChanged();
      } else {
        networksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Networks with IPs.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
     */
    public Builder addNetworks(com.google.cloud.baremetalsolution.v2.NetworkUsage value) {
      if (networksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNetworksIsMutable();
        networks_.add(value);
        onChanged();
      } else {
        networksBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Networks with IPs.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
     */
    public Builder addNetworks(
        int index, com.google.cloud.baremetalsolution.v2.NetworkUsage value) {
      if (networksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNetworksIsMutable();
        networks_.add(index, value);
        onChanged();
      } else {
        networksBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Networks with IPs.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
     */
    public Builder addNetworks(
        com.google.cloud.baremetalsolution.v2.NetworkUsage.Builder builderForValue) {
      if (networksBuilder_ == null) {
        ensureNetworksIsMutable();
        networks_.add(builderForValue.build());
        onChanged();
      } else {
        networksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Networks with IPs.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
     */
    public Builder addNetworks(
        int index, com.google.cloud.baremetalsolution.v2.NetworkUsage.Builder builderForValue) {
      if (networksBuilder_ == null) {
        ensureNetworksIsMutable();
        networks_.add(index, builderForValue.build());
        onChanged();
      } else {
        networksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Networks with IPs.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
     */
    public Builder addAllNetworks(
        java.lang.Iterable<? extends com.google.cloud.baremetalsolution.v2.NetworkUsage> values) {
      if (networksBuilder_ == null) {
        ensureNetworksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, networks_);
        onChanged();
      } else {
        networksBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Networks with IPs.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
     */
    public Builder clearNetworks() {
      if (networksBuilder_ == null) {
        networks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        networksBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Networks with IPs.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
     */
    public Builder removeNetworks(int index) {
      if (networksBuilder_ == null) {
        ensureNetworksIsMutable();
        networks_.remove(index);
        onChanged();
      } else {
        networksBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Networks with IPs.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
     */
    public com.google.cloud.baremetalsolution.v2.NetworkUsage.Builder getNetworksBuilder(
        int index) {
      return getNetworksFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * Networks with IPs.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
     */
    public com.google.cloud.baremetalsolution.v2.NetworkUsageOrBuilder getNetworksOrBuilder(
        int index) {
      if (networksBuilder_ == null) {
        return networks_.get(index);
      } else {
        return networksBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Networks with IPs.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.baremetalsolution.v2.NetworkUsageOrBuilder>
        getNetworksOrBuilderList() {
      if (networksBuilder_ != null) {
        return networksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(networks_);
      }
    }

    /**
     *
     *
     * <pre>
     * Networks with IPs.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
     */
    public com.google.cloud.baremetalsolution.v2.NetworkUsage.Builder addNetworksBuilder() {
      return getNetworksFieldBuilder()
          .addBuilder(com.google.cloud.baremetalsolution.v2.NetworkUsage.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Networks with IPs.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
     */
    public com.google.cloud.baremetalsolution.v2.NetworkUsage.Builder addNetworksBuilder(
        int index) {
      return getNetworksFieldBuilder()
          .addBuilder(
              index, com.google.cloud.baremetalsolution.v2.NetworkUsage.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Networks with IPs.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
     */
    public java.util.List<com.google.cloud.baremetalsolution.v2.NetworkUsage.Builder>
        getNetworksBuilderList() {
      return getNetworksFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.baremetalsolution.v2.NetworkUsage,
            com.google.cloud.baremetalsolution.v2.NetworkUsage.Builder,
            com.google.cloud.baremetalsolution.v2.NetworkUsageOrBuilder>
        getNetworksFieldBuilder() {
      if (networksBuilder_ == null) {
        networksBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.baremetalsolution.v2.NetworkUsage,
                com.google.cloud.baremetalsolution.v2.NetworkUsage.Builder,
                com.google.cloud.baremetalsolution.v2.NetworkUsageOrBuilder>(
                networks_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        networks_ = null;
      }
      return networksBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.baremetalsolution.v2.ListNetworkUsageResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.baremetalsolution.v2.ListNetworkUsageResponse)
  private static final com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse();
  }

  public static com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNetworkUsageResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListNetworkUsageResponse>() {
        @java.lang.Override
        public ListNetworkUsageResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListNetworkUsageResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNetworkUsageResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
