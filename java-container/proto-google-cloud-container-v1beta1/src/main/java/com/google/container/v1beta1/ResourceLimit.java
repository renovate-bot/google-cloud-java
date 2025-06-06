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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.8
package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * Contains information about amount of some resource in the cluster.
 * For memory, value should be in GB.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.ResourceLimit}
 */
public final class ResourceLimit extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.ResourceLimit)
    ResourceLimitOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ResourceLimit.newBuilder() to construct.
  private ResourceLimit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ResourceLimit() {
    resourceType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ResourceLimit();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_ResourceLimit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_ResourceLimit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.ResourceLimit.class,
            com.google.container.v1beta1.ResourceLimit.Builder.class);
  }

  public static final int RESOURCE_TYPE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceType_ = "";

  /**
   *
   *
   * <pre>
   * Resource name "cpu", "memory" or gpu-specific string.
   * </pre>
   *
   * <code>string resource_type = 1;</code>
   *
   * @return The resourceType.
   */
  @java.lang.Override
  public java.lang.String getResourceType() {
    java.lang.Object ref = resourceType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceType_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Resource name "cpu", "memory" or gpu-specific string.
   * </pre>
   *
   * <code>string resource_type = 1;</code>
   *
   * @return The bytes for resourceType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceTypeBytes() {
    java.lang.Object ref = resourceType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resourceType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MINIMUM_FIELD_NUMBER = 2;
  private long minimum_ = 0L;

  /**
   *
   *
   * <pre>
   * Minimum amount of the resource in the cluster.
   * </pre>
   *
   * <code>int64 minimum = 2;</code>
   *
   * @return The minimum.
   */
  @java.lang.Override
  public long getMinimum() {
    return minimum_;
  }

  public static final int MAXIMUM_FIELD_NUMBER = 3;
  private long maximum_ = 0L;

  /**
   *
   *
   * <pre>
   * Maximum amount of the resource in the cluster.
   * </pre>
   *
   * <code>int64 maximum = 3;</code>
   *
   * @return The maximum.
   */
  @java.lang.Override
  public long getMaximum() {
    return maximum_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceType_);
    }
    if (minimum_ != 0L) {
      output.writeInt64(2, minimum_);
    }
    if (maximum_ != 0L) {
      output.writeInt64(3, maximum_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceType_);
    }
    if (minimum_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, minimum_);
    }
    if (maximum_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(3, maximum_);
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
    if (!(obj instanceof com.google.container.v1beta1.ResourceLimit)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.ResourceLimit other =
        (com.google.container.v1beta1.ResourceLimit) obj;

    if (!getResourceType().equals(other.getResourceType())) return false;
    if (getMinimum() != other.getMinimum()) return false;
    if (getMaximum() != other.getMaximum()) return false;
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
    hash = (37 * hash) + RESOURCE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getResourceType().hashCode();
    hash = (37 * hash) + MINIMUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getMinimum());
    hash = (37 * hash) + MAXIMUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getMaximum());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.ResourceLimit parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.ResourceLimit parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.ResourceLimit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.ResourceLimit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.ResourceLimit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.ResourceLimit parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.ResourceLimit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.ResourceLimit parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.ResourceLimit parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.ResourceLimit parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.ResourceLimit parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.ResourceLimit parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.ResourceLimit prototype) {
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
   * Contains information about amount of some resource in the cluster.
   * For memory, value should be in GB.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.ResourceLimit}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.ResourceLimit)
      com.google.container.v1beta1.ResourceLimitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_ResourceLimit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_ResourceLimit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.ResourceLimit.class,
              com.google.container.v1beta1.ResourceLimit.Builder.class);
    }

    // Construct using com.google.container.v1beta1.ResourceLimit.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resourceType_ = "";
      minimum_ = 0L;
      maximum_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_ResourceLimit_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.ResourceLimit getDefaultInstanceForType() {
      return com.google.container.v1beta1.ResourceLimit.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.ResourceLimit build() {
      com.google.container.v1beta1.ResourceLimit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.ResourceLimit buildPartial() {
      com.google.container.v1beta1.ResourceLimit result =
          new com.google.container.v1beta1.ResourceLimit(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.ResourceLimit result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceType_ = resourceType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.minimum_ = minimum_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.maximum_ = maximum_;
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
      if (other instanceof com.google.container.v1beta1.ResourceLimit) {
        return mergeFrom((com.google.container.v1beta1.ResourceLimit) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.ResourceLimit other) {
      if (other == com.google.container.v1beta1.ResourceLimit.getDefaultInstance()) return this;
      if (!other.getResourceType().isEmpty()) {
        resourceType_ = other.resourceType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getMinimum() != 0L) {
        setMinimum(other.getMinimum());
      }
      if (other.getMaximum() != 0L) {
        setMaximum(other.getMaximum());
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
                resourceType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                minimum_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                maximum_ = input.readInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private java.lang.Object resourceType_ = "";

    /**
     *
     *
     * <pre>
     * Resource name "cpu", "memory" or gpu-specific string.
     * </pre>
     *
     * <code>string resource_type = 1;</code>
     *
     * @return The resourceType.
     */
    public java.lang.String getResourceType() {
      java.lang.Object ref = resourceType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Resource name "cpu", "memory" or gpu-specific string.
     * </pre>
     *
     * <code>string resource_type = 1;</code>
     *
     * @return The bytes for resourceType.
     */
    public com.google.protobuf.ByteString getResourceTypeBytes() {
      java.lang.Object ref = resourceType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resourceType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Resource name "cpu", "memory" or gpu-specific string.
     * </pre>
     *
     * <code>string resource_type = 1;</code>
     *
     * @param value The resourceType to set.
     * @return This builder for chaining.
     */
    public Builder setResourceType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resourceType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Resource name "cpu", "memory" or gpu-specific string.
     * </pre>
     *
     * <code>string resource_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResourceType() {
      resourceType_ = getDefaultInstance().getResourceType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Resource name "cpu", "memory" or gpu-specific string.
     * </pre>
     *
     * <code>string resource_type = 1;</code>
     *
     * @param value The bytes for resourceType to set.
     * @return This builder for chaining.
     */
    public Builder setResourceTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      resourceType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long minimum_;

    /**
     *
     *
     * <pre>
     * Minimum amount of the resource in the cluster.
     * </pre>
     *
     * <code>int64 minimum = 2;</code>
     *
     * @return The minimum.
     */
    @java.lang.Override
    public long getMinimum() {
      return minimum_;
    }

    /**
     *
     *
     * <pre>
     * Minimum amount of the resource in the cluster.
     * </pre>
     *
     * <code>int64 minimum = 2;</code>
     *
     * @param value The minimum to set.
     * @return This builder for chaining.
     */
    public Builder setMinimum(long value) {

      minimum_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Minimum amount of the resource in the cluster.
     * </pre>
     *
     * <code>int64 minimum = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMinimum() {
      bitField0_ = (bitField0_ & ~0x00000002);
      minimum_ = 0L;
      onChanged();
      return this;
    }

    private long maximum_;

    /**
     *
     *
     * <pre>
     * Maximum amount of the resource in the cluster.
     * </pre>
     *
     * <code>int64 maximum = 3;</code>
     *
     * @return The maximum.
     */
    @java.lang.Override
    public long getMaximum() {
      return maximum_;
    }

    /**
     *
     *
     * <pre>
     * Maximum amount of the resource in the cluster.
     * </pre>
     *
     * <code>int64 maximum = 3;</code>
     *
     * @param value The maximum to set.
     * @return This builder for chaining.
     */
    public Builder setMaximum(long value) {

      maximum_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Maximum amount of the resource in the cluster.
     * </pre>
     *
     * <code>int64 maximum = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaximum() {
      bitField0_ = (bitField0_ & ~0x00000004);
      maximum_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.ResourceLimit)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.ResourceLimit)
  private static final com.google.container.v1beta1.ResourceLimit DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.ResourceLimit();
  }

  public static com.google.container.v1beta1.ResourceLimit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceLimit> PARSER =
      new com.google.protobuf.AbstractParser<ResourceLimit>() {
        @java.lang.Override
        public ResourceLimit parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourceLimit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceLimit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.ResourceLimit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
