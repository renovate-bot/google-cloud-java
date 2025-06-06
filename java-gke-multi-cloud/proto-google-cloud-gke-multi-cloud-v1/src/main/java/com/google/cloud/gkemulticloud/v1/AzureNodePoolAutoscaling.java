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
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkemulticloud.v1;

/**
 *
 *
 * <pre>
 * Configuration related to Kubernetes cluster autoscaler.
 *
 * The Kubernetes cluster autoscaler will automatically adjust the
 * size of the node pool based on the cluster load.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling}
 */
public final class AzureNodePoolAutoscaling extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling)
    AzureNodePoolAutoscalingOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use AzureNodePoolAutoscaling.newBuilder() to construct.
  private AzureNodePoolAutoscaling(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AzureNodePoolAutoscaling() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AzureNodePoolAutoscaling();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AzureNodePoolAutoscaling_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AzureNodePoolAutoscaling_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling.class,
            com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling.Builder.class);
  }

  public static final int MIN_NODE_COUNT_FIELD_NUMBER = 1;
  private int minNodeCount_ = 0;

  /**
   *
   *
   * <pre>
   * Required. Minimum number of nodes in the node pool. Must be greater than or
   * equal to 1 and less than or equal to max_node_count.
   * </pre>
   *
   * <code>int32 min_node_count = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The minNodeCount.
   */
  @java.lang.Override
  public int getMinNodeCount() {
    return minNodeCount_;
  }

  public static final int MAX_NODE_COUNT_FIELD_NUMBER = 2;
  private int maxNodeCount_ = 0;

  /**
   *
   *
   * <pre>
   * Required. Maximum number of nodes in the node pool. Must be greater than or
   * equal to min_node_count and less than or equal to 50.
   * </pre>
   *
   * <code>int32 max_node_count = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The maxNodeCount.
   */
  @java.lang.Override
  public int getMaxNodeCount() {
    return maxNodeCount_;
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
    if (minNodeCount_ != 0) {
      output.writeInt32(1, minNodeCount_);
    }
    if (maxNodeCount_ != 0) {
      output.writeInt32(2, maxNodeCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minNodeCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, minNodeCount_);
    }
    if (maxNodeCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, maxNodeCount_);
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling other =
        (com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling) obj;

    if (getMinNodeCount() != other.getMinNodeCount()) return false;
    if (getMaxNodeCount() != other.getMaxNodeCount()) return false;
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
    hash = (37 * hash) + MIN_NODE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMinNodeCount();
    hash = (37 * hash) + MAX_NODE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMaxNodeCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling parseFrom(
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
      com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling prototype) {
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
   * Configuration related to Kubernetes cluster autoscaler.
   *
   * The Kubernetes cluster autoscaler will automatically adjust the
   * size of the node pool based on the cluster load.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling)
      com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscalingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AzureNodePoolAutoscaling_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AzureNodePoolAutoscaling_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling.class,
              com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      minNodeCount_ = 0;
      maxNodeCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AzureNodePoolAutoscaling_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling build() {
      com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling buildPartial() {
      com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling result =
          new com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minNodeCount_ = minNodeCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxNodeCount_ = maxNodeCount_;
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling other) {
      if (other == com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling.getDefaultInstance())
        return this;
      if (other.getMinNodeCount() != 0) {
        setMinNodeCount(other.getMinNodeCount());
      }
      if (other.getMaxNodeCount() != 0) {
        setMaxNodeCount(other.getMaxNodeCount());
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
                minNodeCount_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                maxNodeCount_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private int minNodeCount_;

    /**
     *
     *
     * <pre>
     * Required. Minimum number of nodes in the node pool. Must be greater than or
     * equal to 1 and less than or equal to max_node_count.
     * </pre>
     *
     * <code>int32 min_node_count = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The minNodeCount.
     */
    @java.lang.Override
    public int getMinNodeCount() {
      return minNodeCount_;
    }

    /**
     *
     *
     * <pre>
     * Required. Minimum number of nodes in the node pool. Must be greater than or
     * equal to 1 and less than or equal to max_node_count.
     * </pre>
     *
     * <code>int32 min_node_count = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The minNodeCount to set.
     * @return This builder for chaining.
     */
    public Builder setMinNodeCount(int value) {

      minNodeCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Minimum number of nodes in the node pool. Must be greater than or
     * equal to 1 and less than or equal to max_node_count.
     * </pre>
     *
     * <code>int32 min_node_count = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMinNodeCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minNodeCount_ = 0;
      onChanged();
      return this;
    }

    private int maxNodeCount_;

    /**
     *
     *
     * <pre>
     * Required. Maximum number of nodes in the node pool. Must be greater than or
     * equal to min_node_count and less than or equal to 50.
     * </pre>
     *
     * <code>int32 max_node_count = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The maxNodeCount.
     */
    @java.lang.Override
    public int getMaxNodeCount() {
      return maxNodeCount_;
    }

    /**
     *
     *
     * <pre>
     * Required. Maximum number of nodes in the node pool. Must be greater than or
     * equal to min_node_count and less than or equal to 50.
     * </pre>
     *
     * <code>int32 max_node_count = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The maxNodeCount to set.
     * @return This builder for chaining.
     */
    public Builder setMaxNodeCount(int value) {

      maxNodeCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Maximum number of nodes in the node pool. Must be greater than or
     * equal to min_node_count and less than or equal to 50.
     * </pre>
     *
     * <code>int32 max_node_count = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxNodeCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxNodeCount_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling)
  private static final com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling();
  }

  public static com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AzureNodePoolAutoscaling> PARSER =
      new com.google.protobuf.AbstractParser<AzureNodePoolAutoscaling>() {
        @java.lang.Override
        public AzureNodePoolAutoscaling parsePartialFrom(
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

  public static com.google.protobuf.Parser<AzureNodePoolAutoscaling> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AzureNodePoolAutoscaling> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
