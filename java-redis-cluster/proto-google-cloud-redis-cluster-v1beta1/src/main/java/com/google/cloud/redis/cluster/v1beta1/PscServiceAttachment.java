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
// source: google/cloud/redis/cluster/v1beta1/cloud_redis_cluster.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.redis.cluster.v1beta1;

/**
 *
 *
 * <pre>
 * Configuration of a service attachment of the cluster, for creating PSC
 * connections.
 * </pre>
 *
 * Protobuf type {@code google.cloud.redis.cluster.v1beta1.PscServiceAttachment}
 */
public final class PscServiceAttachment extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.redis.cluster.v1beta1.PscServiceAttachment)
    PscServiceAttachmentOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use PscServiceAttachment.newBuilder() to construct.
  private PscServiceAttachment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PscServiceAttachment() {
    serviceAttachment_ = "";
    connectionType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PscServiceAttachment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.redis.cluster.v1beta1.CloudRedisClusterProto
        .internal_static_google_cloud_redis_cluster_v1beta1_PscServiceAttachment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.redis.cluster.v1beta1.CloudRedisClusterProto
        .internal_static_google_cloud_redis_cluster_v1beta1_PscServiceAttachment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment.class,
            com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment.Builder.class);
  }

  public static final int SERVICE_ATTACHMENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object serviceAttachment_ = "";

  /**
   *
   *
   * <pre>
   * Output only. Service attachment URI which your self-created PscConnection
   * should use as target
   * </pre>
   *
   * <code>string service_attachment = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The serviceAttachment.
   */
  @java.lang.Override
  public java.lang.String getServiceAttachment() {
    java.lang.Object ref = serviceAttachment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceAttachment_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Output only. Service attachment URI which your self-created PscConnection
   * should use as target
   * </pre>
   *
   * <code>string service_attachment = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for serviceAttachment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceAttachmentBytes() {
    java.lang.Object ref = serviceAttachment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      serviceAttachment_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONNECTION_TYPE_FIELD_NUMBER = 3;
  private int connectionType_ = 0;

  /**
   *
   *
   * <pre>
   * Output only. Type of a PSC connection targeting this service attachment.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1beta1.ConnectionType connection_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for connectionType.
   */
  @java.lang.Override
  public int getConnectionTypeValue() {
    return connectionType_;
  }

  /**
   *
   *
   * <pre>
   * Output only. Type of a PSC connection targeting this service attachment.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1beta1.ConnectionType connection_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The connectionType.
   */
  @java.lang.Override
  public com.google.cloud.redis.cluster.v1beta1.ConnectionType getConnectionType() {
    com.google.cloud.redis.cluster.v1beta1.ConnectionType result =
        com.google.cloud.redis.cluster.v1beta1.ConnectionType.forNumber(connectionType_);
    return result == null
        ? com.google.cloud.redis.cluster.v1beta1.ConnectionType.UNRECOGNIZED
        : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceAttachment_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceAttachment_);
    }
    if (connectionType_
        != com.google.cloud.redis.cluster.v1beta1.ConnectionType.CONNECTION_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, connectionType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceAttachment_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceAttachment_);
    }
    if (connectionType_
        != com.google.cloud.redis.cluster.v1beta1.ConnectionType.CONNECTION_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, connectionType_);
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
    if (!(obj instanceof com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment)) {
      return super.equals(obj);
    }
    com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment other =
        (com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment) obj;

    if (!getServiceAttachment().equals(other.getServiceAttachment())) return false;
    if (connectionType_ != other.connectionType_) return false;
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
    hash = (37 * hash) + SERVICE_ATTACHMENT_FIELD_NUMBER;
    hash = (53 * hash) + getServiceAttachment().hashCode();
    hash = (37 * hash) + CONNECTION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + connectionType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment parseFrom(
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
      com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment prototype) {
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
   * Configuration of a service attachment of the cluster, for creating PSC
   * connections.
   * </pre>
   *
   * Protobuf type {@code google.cloud.redis.cluster.v1beta1.PscServiceAttachment}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.redis.cluster.v1beta1.PscServiceAttachment)
      com.google.cloud.redis.cluster.v1beta1.PscServiceAttachmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.redis.cluster.v1beta1.CloudRedisClusterProto
          .internal_static_google_cloud_redis_cluster_v1beta1_PscServiceAttachment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.redis.cluster.v1beta1.CloudRedisClusterProto
          .internal_static_google_cloud_redis_cluster_v1beta1_PscServiceAttachment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment.class,
              com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment.Builder.class);
    }

    // Construct using com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      serviceAttachment_ = "";
      connectionType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.redis.cluster.v1beta1.CloudRedisClusterProto
          .internal_static_google_cloud_redis_cluster_v1beta1_PscServiceAttachment_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment getDefaultInstanceForType() {
      return com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment build() {
      com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment buildPartial() {
      com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment result =
          new com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.serviceAttachment_ = serviceAttachment_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.connectionType_ = connectionType_;
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
      if (other instanceof com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment) {
        return mergeFrom((com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment other) {
      if (other == com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment.getDefaultInstance())
        return this;
      if (!other.getServiceAttachment().isEmpty()) {
        serviceAttachment_ = other.serviceAttachment_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.connectionType_ != 0) {
        setConnectionTypeValue(other.getConnectionTypeValue());
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
                serviceAttachment_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 24:
              {
                connectionType_ = input.readEnum();
                bitField0_ |= 0x00000002;
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

    private java.lang.Object serviceAttachment_ = "";

    /**
     *
     *
     * <pre>
     * Output only. Service attachment URI which your self-created PscConnection
     * should use as target
     * </pre>
     *
     * <code>string service_attachment = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The serviceAttachment.
     */
    public java.lang.String getServiceAttachment() {
      java.lang.Object ref = serviceAttachment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceAttachment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Service attachment URI which your self-created PscConnection
     * should use as target
     * </pre>
     *
     * <code>string service_attachment = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for serviceAttachment.
     */
    public com.google.protobuf.ByteString getServiceAttachmentBytes() {
      java.lang.Object ref = serviceAttachment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serviceAttachment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Service attachment URI which your self-created PscConnection
     * should use as target
     * </pre>
     *
     * <code>string service_attachment = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The serviceAttachment to set.
     * @return This builder for chaining.
     */
    public Builder setServiceAttachment(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      serviceAttachment_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Service attachment URI which your self-created PscConnection
     * should use as target
     * </pre>
     *
     * <code>string service_attachment = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServiceAttachment() {
      serviceAttachment_ = getDefaultInstance().getServiceAttachment();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Service attachment URI which your self-created PscConnection
     * should use as target
     * </pre>
     *
     * <code>string service_attachment = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for serviceAttachment to set.
     * @return This builder for chaining.
     */
    public Builder setServiceAttachmentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      serviceAttachment_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int connectionType_ = 0;

    /**
     *
     *
     * <pre>
     * Output only. Type of a PSC connection targeting this service attachment.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.cluster.v1beta1.ConnectionType connection_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The enum numeric value on the wire for connectionType.
     */
    @java.lang.Override
    public int getConnectionTypeValue() {
      return connectionType_;
    }

    /**
     *
     *
     * <pre>
     * Output only. Type of a PSC connection targeting this service attachment.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.cluster.v1beta1.ConnectionType connection_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for connectionType to set.
     * @return This builder for chaining.
     */
    public Builder setConnectionTypeValue(int value) {
      connectionType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Type of a PSC connection targeting this service attachment.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.cluster.v1beta1.ConnectionType connection_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The connectionType.
     */
    @java.lang.Override
    public com.google.cloud.redis.cluster.v1beta1.ConnectionType getConnectionType() {
      com.google.cloud.redis.cluster.v1beta1.ConnectionType result =
          com.google.cloud.redis.cluster.v1beta1.ConnectionType.forNumber(connectionType_);
      return result == null
          ? com.google.cloud.redis.cluster.v1beta1.ConnectionType.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * Output only. Type of a PSC connection targeting this service attachment.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.cluster.v1beta1.ConnectionType connection_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The connectionType to set.
     * @return This builder for chaining.
     */
    public Builder setConnectionType(com.google.cloud.redis.cluster.v1beta1.ConnectionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      connectionType_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Type of a PSC connection targeting this service attachment.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.cluster.v1beta1.ConnectionType connection_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConnectionType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      connectionType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.redis.cluster.v1beta1.PscServiceAttachment)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.redis.cluster.v1beta1.PscServiceAttachment)
  private static final com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment();
  }

  public static com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PscServiceAttachment> PARSER =
      new com.google.protobuf.AbstractParser<PscServiceAttachment>() {
        @java.lang.Override
        public PscServiceAttachment parsePartialFrom(
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

  public static com.google.protobuf.Parser<PscServiceAttachment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PscServiceAttachment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.redis.cluster.v1beta1.PscServiceAttachment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
