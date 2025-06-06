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
 * Detailed information of each PSC connection.
 * </pre>
 *
 * Protobuf type {@code google.cloud.redis.cluster.v1beta1.ConnectionDetail}
 */
public final class ConnectionDetail extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.redis.cluster.v1beta1.ConnectionDetail)
    ConnectionDetailOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ConnectionDetail.newBuilder() to construct.
  private ConnectionDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ConnectionDetail() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ConnectionDetail();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.redis.cluster.v1beta1.CloudRedisClusterProto
        .internal_static_google_cloud_redis_cluster_v1beta1_ConnectionDetail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.redis.cluster.v1beta1.CloudRedisClusterProto
        .internal_static_google_cloud_redis_cluster_v1beta1_ConnectionDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.redis.cluster.v1beta1.ConnectionDetail.class,
            com.google.cloud.redis.cluster.v1beta1.ConnectionDetail.Builder.class);
  }

  private int connectionCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object connection_;

  public enum ConnectionCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    PSC_AUTO_CONNECTION(1),
    PSC_CONNECTION(2),
    CONNECTION_NOT_SET(0);
    private final int value;

    private ConnectionCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ConnectionCase valueOf(int value) {
      return forNumber(value);
    }

    public static ConnectionCase forNumber(int value) {
      switch (value) {
        case 1:
          return PSC_AUTO_CONNECTION;
        case 2:
          return PSC_CONNECTION;
        case 0:
          return CONNECTION_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ConnectionCase getConnectionCase() {
    return ConnectionCase.forNumber(connectionCase_);
  }

  public static final int PSC_AUTO_CONNECTION_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * Detailed information of a PSC connection that is created through
   * service connectivity automation.
   * </pre>
   *
   * <code>.google.cloud.redis.cluster.v1beta1.PscAutoConnection psc_auto_connection = 1;</code>
   *
   * @return Whether the pscAutoConnection field is set.
   */
  @java.lang.Override
  public boolean hasPscAutoConnection() {
    return connectionCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * Detailed information of a PSC connection that is created through
   * service connectivity automation.
   * </pre>
   *
   * <code>.google.cloud.redis.cluster.v1beta1.PscAutoConnection psc_auto_connection = 1;</code>
   *
   * @return The pscAutoConnection.
   */
  @java.lang.Override
  public com.google.cloud.redis.cluster.v1beta1.PscAutoConnection getPscAutoConnection() {
    if (connectionCase_ == 1) {
      return (com.google.cloud.redis.cluster.v1beta1.PscAutoConnection) connection_;
    }
    return com.google.cloud.redis.cluster.v1beta1.PscAutoConnection.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * Detailed information of a PSC connection that is created through
   * service connectivity automation.
   * </pre>
   *
   * <code>.google.cloud.redis.cluster.v1beta1.PscAutoConnection psc_auto_connection = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.redis.cluster.v1beta1.PscAutoConnectionOrBuilder
      getPscAutoConnectionOrBuilder() {
    if (connectionCase_ == 1) {
      return (com.google.cloud.redis.cluster.v1beta1.PscAutoConnection) connection_;
    }
    return com.google.cloud.redis.cluster.v1beta1.PscAutoConnection.getDefaultInstance();
  }

  public static final int PSC_CONNECTION_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * Detailed information of a PSC connection that is created by the customer
   * who owns the cluster.
   * </pre>
   *
   * <code>.google.cloud.redis.cluster.v1beta1.PscConnection psc_connection = 2;</code>
   *
   * @return Whether the pscConnection field is set.
   */
  @java.lang.Override
  public boolean hasPscConnection() {
    return connectionCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * Detailed information of a PSC connection that is created by the customer
   * who owns the cluster.
   * </pre>
   *
   * <code>.google.cloud.redis.cluster.v1beta1.PscConnection psc_connection = 2;</code>
   *
   * @return The pscConnection.
   */
  @java.lang.Override
  public com.google.cloud.redis.cluster.v1beta1.PscConnection getPscConnection() {
    if (connectionCase_ == 2) {
      return (com.google.cloud.redis.cluster.v1beta1.PscConnection) connection_;
    }
    return com.google.cloud.redis.cluster.v1beta1.PscConnection.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * Detailed information of a PSC connection that is created by the customer
   * who owns the cluster.
   * </pre>
   *
   * <code>.google.cloud.redis.cluster.v1beta1.PscConnection psc_connection = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.redis.cluster.v1beta1.PscConnectionOrBuilder getPscConnectionOrBuilder() {
    if (connectionCase_ == 2) {
      return (com.google.cloud.redis.cluster.v1beta1.PscConnection) connection_;
    }
    return com.google.cloud.redis.cluster.v1beta1.PscConnection.getDefaultInstance();
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
    if (connectionCase_ == 1) {
      output.writeMessage(
          1, (com.google.cloud.redis.cluster.v1beta1.PscAutoConnection) connection_);
    }
    if (connectionCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.redis.cluster.v1beta1.PscConnection) connection_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (connectionCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.redis.cluster.v1beta1.PscAutoConnection) connection_);
    }
    if (connectionCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.redis.cluster.v1beta1.PscConnection) connection_);
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
    if (!(obj instanceof com.google.cloud.redis.cluster.v1beta1.ConnectionDetail)) {
      return super.equals(obj);
    }
    com.google.cloud.redis.cluster.v1beta1.ConnectionDetail other =
        (com.google.cloud.redis.cluster.v1beta1.ConnectionDetail) obj;

    if (!getConnectionCase().equals(other.getConnectionCase())) return false;
    switch (connectionCase_) {
      case 1:
        if (!getPscAutoConnection().equals(other.getPscAutoConnection())) return false;
        break;
      case 2:
        if (!getPscConnection().equals(other.getPscConnection())) return false;
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
    switch (connectionCase_) {
      case 1:
        hash = (37 * hash) + PSC_AUTO_CONNECTION_FIELD_NUMBER;
        hash = (53 * hash) + getPscAutoConnection().hashCode();
        break;
      case 2:
        hash = (37 * hash) + PSC_CONNECTION_FIELD_NUMBER;
        hash = (53 * hash) + getPscConnection().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.redis.cluster.v1beta1.ConnectionDetail parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.cluster.v1beta1.ConnectionDetail parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.cluster.v1beta1.ConnectionDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.cluster.v1beta1.ConnectionDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.cluster.v1beta1.ConnectionDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.cluster.v1beta1.ConnectionDetail parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.cluster.v1beta1.ConnectionDetail parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.cluster.v1beta1.ConnectionDetail parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.cluster.v1beta1.ConnectionDetail parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.cluster.v1beta1.ConnectionDetail parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.cluster.v1beta1.ConnectionDetail parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.cluster.v1beta1.ConnectionDetail parseFrom(
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
      com.google.cloud.redis.cluster.v1beta1.ConnectionDetail prototype) {
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
   * Detailed information of each PSC connection.
   * </pre>
   *
   * Protobuf type {@code google.cloud.redis.cluster.v1beta1.ConnectionDetail}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.redis.cluster.v1beta1.ConnectionDetail)
      com.google.cloud.redis.cluster.v1beta1.ConnectionDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.redis.cluster.v1beta1.CloudRedisClusterProto
          .internal_static_google_cloud_redis_cluster_v1beta1_ConnectionDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.redis.cluster.v1beta1.CloudRedisClusterProto
          .internal_static_google_cloud_redis_cluster_v1beta1_ConnectionDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.redis.cluster.v1beta1.ConnectionDetail.class,
              com.google.cloud.redis.cluster.v1beta1.ConnectionDetail.Builder.class);
    }

    // Construct using com.google.cloud.redis.cluster.v1beta1.ConnectionDetail.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (pscAutoConnectionBuilder_ != null) {
        pscAutoConnectionBuilder_.clear();
      }
      if (pscConnectionBuilder_ != null) {
        pscConnectionBuilder_.clear();
      }
      connectionCase_ = 0;
      connection_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.redis.cluster.v1beta1.CloudRedisClusterProto
          .internal_static_google_cloud_redis_cluster_v1beta1_ConnectionDetail_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.redis.cluster.v1beta1.ConnectionDetail getDefaultInstanceForType() {
      return com.google.cloud.redis.cluster.v1beta1.ConnectionDetail.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.redis.cluster.v1beta1.ConnectionDetail build() {
      com.google.cloud.redis.cluster.v1beta1.ConnectionDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.redis.cluster.v1beta1.ConnectionDetail buildPartial() {
      com.google.cloud.redis.cluster.v1beta1.ConnectionDetail result =
          new com.google.cloud.redis.cluster.v1beta1.ConnectionDetail(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.redis.cluster.v1beta1.ConnectionDetail result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(
        com.google.cloud.redis.cluster.v1beta1.ConnectionDetail result) {
      result.connectionCase_ = connectionCase_;
      result.connection_ = this.connection_;
      if (connectionCase_ == 1 && pscAutoConnectionBuilder_ != null) {
        result.connection_ = pscAutoConnectionBuilder_.build();
      }
      if (connectionCase_ == 2 && pscConnectionBuilder_ != null) {
        result.connection_ = pscConnectionBuilder_.build();
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
      if (other instanceof com.google.cloud.redis.cluster.v1beta1.ConnectionDetail) {
        return mergeFrom((com.google.cloud.redis.cluster.v1beta1.ConnectionDetail) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.redis.cluster.v1beta1.ConnectionDetail other) {
      if (other == com.google.cloud.redis.cluster.v1beta1.ConnectionDetail.getDefaultInstance())
        return this;
      switch (other.getConnectionCase()) {
        case PSC_AUTO_CONNECTION:
          {
            mergePscAutoConnection(other.getPscAutoConnection());
            break;
          }
        case PSC_CONNECTION:
          {
            mergePscConnection(other.getPscConnection());
            break;
          }
        case CONNECTION_NOT_SET:
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
            case 10:
              {
                input.readMessage(
                    getPscAutoConnectionFieldBuilder().getBuilder(), extensionRegistry);
                connectionCase_ = 1;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getPscConnectionFieldBuilder().getBuilder(), extensionRegistry);
                connectionCase_ = 2;
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

    private int connectionCase_ = 0;
    private java.lang.Object connection_;

    public ConnectionCase getConnectionCase() {
      return ConnectionCase.forNumber(connectionCase_);
    }

    public Builder clearConnection() {
      connectionCase_ = 0;
      connection_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.redis.cluster.v1beta1.PscAutoConnection,
            com.google.cloud.redis.cluster.v1beta1.PscAutoConnection.Builder,
            com.google.cloud.redis.cluster.v1beta1.PscAutoConnectionOrBuilder>
        pscAutoConnectionBuilder_;

    /**
     *
     *
     * <pre>
     * Detailed information of a PSC connection that is created through
     * service connectivity automation.
     * </pre>
     *
     * <code>.google.cloud.redis.cluster.v1beta1.PscAutoConnection psc_auto_connection = 1;</code>
     *
     * @return Whether the pscAutoConnection field is set.
     */
    @java.lang.Override
    public boolean hasPscAutoConnection() {
      return connectionCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * Detailed information of a PSC connection that is created through
     * service connectivity automation.
     * </pre>
     *
     * <code>.google.cloud.redis.cluster.v1beta1.PscAutoConnection psc_auto_connection = 1;</code>
     *
     * @return The pscAutoConnection.
     */
    @java.lang.Override
    public com.google.cloud.redis.cluster.v1beta1.PscAutoConnection getPscAutoConnection() {
      if (pscAutoConnectionBuilder_ == null) {
        if (connectionCase_ == 1) {
          return (com.google.cloud.redis.cluster.v1beta1.PscAutoConnection) connection_;
        }
        return com.google.cloud.redis.cluster.v1beta1.PscAutoConnection.getDefaultInstance();
      } else {
        if (connectionCase_ == 1) {
          return pscAutoConnectionBuilder_.getMessage();
        }
        return com.google.cloud.redis.cluster.v1beta1.PscAutoConnection.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Detailed information of a PSC connection that is created through
     * service connectivity automation.
     * </pre>
     *
     * <code>.google.cloud.redis.cluster.v1beta1.PscAutoConnection psc_auto_connection = 1;</code>
     */
    public Builder setPscAutoConnection(
        com.google.cloud.redis.cluster.v1beta1.PscAutoConnection value) {
      if (pscAutoConnectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        connection_ = value;
        onChanged();
      } else {
        pscAutoConnectionBuilder_.setMessage(value);
      }
      connectionCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Detailed information of a PSC connection that is created through
     * service connectivity automation.
     * </pre>
     *
     * <code>.google.cloud.redis.cluster.v1beta1.PscAutoConnection psc_auto_connection = 1;</code>
     */
    public Builder setPscAutoConnection(
        com.google.cloud.redis.cluster.v1beta1.PscAutoConnection.Builder builderForValue) {
      if (pscAutoConnectionBuilder_ == null) {
        connection_ = builderForValue.build();
        onChanged();
      } else {
        pscAutoConnectionBuilder_.setMessage(builderForValue.build());
      }
      connectionCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Detailed information of a PSC connection that is created through
     * service connectivity automation.
     * </pre>
     *
     * <code>.google.cloud.redis.cluster.v1beta1.PscAutoConnection psc_auto_connection = 1;</code>
     */
    public Builder mergePscAutoConnection(
        com.google.cloud.redis.cluster.v1beta1.PscAutoConnection value) {
      if (pscAutoConnectionBuilder_ == null) {
        if (connectionCase_ == 1
            && connection_
                != com.google.cloud.redis.cluster.v1beta1.PscAutoConnection.getDefaultInstance()) {
          connection_ =
              com.google.cloud.redis.cluster.v1beta1.PscAutoConnection.newBuilder(
                      (com.google.cloud.redis.cluster.v1beta1.PscAutoConnection) connection_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          connection_ = value;
        }
        onChanged();
      } else {
        if (connectionCase_ == 1) {
          pscAutoConnectionBuilder_.mergeFrom(value);
        } else {
          pscAutoConnectionBuilder_.setMessage(value);
        }
      }
      connectionCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Detailed information of a PSC connection that is created through
     * service connectivity automation.
     * </pre>
     *
     * <code>.google.cloud.redis.cluster.v1beta1.PscAutoConnection psc_auto_connection = 1;</code>
     */
    public Builder clearPscAutoConnection() {
      if (pscAutoConnectionBuilder_ == null) {
        if (connectionCase_ == 1) {
          connectionCase_ = 0;
          connection_ = null;
          onChanged();
        }
      } else {
        if (connectionCase_ == 1) {
          connectionCase_ = 0;
          connection_ = null;
        }
        pscAutoConnectionBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Detailed information of a PSC connection that is created through
     * service connectivity automation.
     * </pre>
     *
     * <code>.google.cloud.redis.cluster.v1beta1.PscAutoConnection psc_auto_connection = 1;</code>
     */
    public com.google.cloud.redis.cluster.v1beta1.PscAutoConnection.Builder
        getPscAutoConnectionBuilder() {
      return getPscAutoConnectionFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Detailed information of a PSC connection that is created through
     * service connectivity automation.
     * </pre>
     *
     * <code>.google.cloud.redis.cluster.v1beta1.PscAutoConnection psc_auto_connection = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.redis.cluster.v1beta1.PscAutoConnectionOrBuilder
        getPscAutoConnectionOrBuilder() {
      if ((connectionCase_ == 1) && (pscAutoConnectionBuilder_ != null)) {
        return pscAutoConnectionBuilder_.getMessageOrBuilder();
      } else {
        if (connectionCase_ == 1) {
          return (com.google.cloud.redis.cluster.v1beta1.PscAutoConnection) connection_;
        }
        return com.google.cloud.redis.cluster.v1beta1.PscAutoConnection.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Detailed information of a PSC connection that is created through
     * service connectivity automation.
     * </pre>
     *
     * <code>.google.cloud.redis.cluster.v1beta1.PscAutoConnection psc_auto_connection = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.redis.cluster.v1beta1.PscAutoConnection,
            com.google.cloud.redis.cluster.v1beta1.PscAutoConnection.Builder,
            com.google.cloud.redis.cluster.v1beta1.PscAutoConnectionOrBuilder>
        getPscAutoConnectionFieldBuilder() {
      if (pscAutoConnectionBuilder_ == null) {
        if (!(connectionCase_ == 1)) {
          connection_ =
              com.google.cloud.redis.cluster.v1beta1.PscAutoConnection.getDefaultInstance();
        }
        pscAutoConnectionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.redis.cluster.v1beta1.PscAutoConnection,
                com.google.cloud.redis.cluster.v1beta1.PscAutoConnection.Builder,
                com.google.cloud.redis.cluster.v1beta1.PscAutoConnectionOrBuilder>(
                (com.google.cloud.redis.cluster.v1beta1.PscAutoConnection) connection_,
                getParentForChildren(),
                isClean());
        connection_ = null;
      }
      connectionCase_ = 1;
      onChanged();
      return pscAutoConnectionBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.redis.cluster.v1beta1.PscConnection,
            com.google.cloud.redis.cluster.v1beta1.PscConnection.Builder,
            com.google.cloud.redis.cluster.v1beta1.PscConnectionOrBuilder>
        pscConnectionBuilder_;

    /**
     *
     *
     * <pre>
     * Detailed information of a PSC connection that is created by the customer
     * who owns the cluster.
     * </pre>
     *
     * <code>.google.cloud.redis.cluster.v1beta1.PscConnection psc_connection = 2;</code>
     *
     * @return Whether the pscConnection field is set.
     */
    @java.lang.Override
    public boolean hasPscConnection() {
      return connectionCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * Detailed information of a PSC connection that is created by the customer
     * who owns the cluster.
     * </pre>
     *
     * <code>.google.cloud.redis.cluster.v1beta1.PscConnection psc_connection = 2;</code>
     *
     * @return The pscConnection.
     */
    @java.lang.Override
    public com.google.cloud.redis.cluster.v1beta1.PscConnection getPscConnection() {
      if (pscConnectionBuilder_ == null) {
        if (connectionCase_ == 2) {
          return (com.google.cloud.redis.cluster.v1beta1.PscConnection) connection_;
        }
        return com.google.cloud.redis.cluster.v1beta1.PscConnection.getDefaultInstance();
      } else {
        if (connectionCase_ == 2) {
          return pscConnectionBuilder_.getMessage();
        }
        return com.google.cloud.redis.cluster.v1beta1.PscConnection.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Detailed information of a PSC connection that is created by the customer
     * who owns the cluster.
     * </pre>
     *
     * <code>.google.cloud.redis.cluster.v1beta1.PscConnection psc_connection = 2;</code>
     */
    public Builder setPscConnection(com.google.cloud.redis.cluster.v1beta1.PscConnection value) {
      if (pscConnectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        connection_ = value;
        onChanged();
      } else {
        pscConnectionBuilder_.setMessage(value);
      }
      connectionCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Detailed information of a PSC connection that is created by the customer
     * who owns the cluster.
     * </pre>
     *
     * <code>.google.cloud.redis.cluster.v1beta1.PscConnection psc_connection = 2;</code>
     */
    public Builder setPscConnection(
        com.google.cloud.redis.cluster.v1beta1.PscConnection.Builder builderForValue) {
      if (pscConnectionBuilder_ == null) {
        connection_ = builderForValue.build();
        onChanged();
      } else {
        pscConnectionBuilder_.setMessage(builderForValue.build());
      }
      connectionCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Detailed information of a PSC connection that is created by the customer
     * who owns the cluster.
     * </pre>
     *
     * <code>.google.cloud.redis.cluster.v1beta1.PscConnection psc_connection = 2;</code>
     */
    public Builder mergePscConnection(com.google.cloud.redis.cluster.v1beta1.PscConnection value) {
      if (pscConnectionBuilder_ == null) {
        if (connectionCase_ == 2
            && connection_
                != com.google.cloud.redis.cluster.v1beta1.PscConnection.getDefaultInstance()) {
          connection_ =
              com.google.cloud.redis.cluster.v1beta1.PscConnection.newBuilder(
                      (com.google.cloud.redis.cluster.v1beta1.PscConnection) connection_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          connection_ = value;
        }
        onChanged();
      } else {
        if (connectionCase_ == 2) {
          pscConnectionBuilder_.mergeFrom(value);
        } else {
          pscConnectionBuilder_.setMessage(value);
        }
      }
      connectionCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Detailed information of a PSC connection that is created by the customer
     * who owns the cluster.
     * </pre>
     *
     * <code>.google.cloud.redis.cluster.v1beta1.PscConnection psc_connection = 2;</code>
     */
    public Builder clearPscConnection() {
      if (pscConnectionBuilder_ == null) {
        if (connectionCase_ == 2) {
          connectionCase_ = 0;
          connection_ = null;
          onChanged();
        }
      } else {
        if (connectionCase_ == 2) {
          connectionCase_ = 0;
          connection_ = null;
        }
        pscConnectionBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Detailed information of a PSC connection that is created by the customer
     * who owns the cluster.
     * </pre>
     *
     * <code>.google.cloud.redis.cluster.v1beta1.PscConnection psc_connection = 2;</code>
     */
    public com.google.cloud.redis.cluster.v1beta1.PscConnection.Builder getPscConnectionBuilder() {
      return getPscConnectionFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Detailed information of a PSC connection that is created by the customer
     * who owns the cluster.
     * </pre>
     *
     * <code>.google.cloud.redis.cluster.v1beta1.PscConnection psc_connection = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.redis.cluster.v1beta1.PscConnectionOrBuilder
        getPscConnectionOrBuilder() {
      if ((connectionCase_ == 2) && (pscConnectionBuilder_ != null)) {
        return pscConnectionBuilder_.getMessageOrBuilder();
      } else {
        if (connectionCase_ == 2) {
          return (com.google.cloud.redis.cluster.v1beta1.PscConnection) connection_;
        }
        return com.google.cloud.redis.cluster.v1beta1.PscConnection.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Detailed information of a PSC connection that is created by the customer
     * who owns the cluster.
     * </pre>
     *
     * <code>.google.cloud.redis.cluster.v1beta1.PscConnection psc_connection = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.redis.cluster.v1beta1.PscConnection,
            com.google.cloud.redis.cluster.v1beta1.PscConnection.Builder,
            com.google.cloud.redis.cluster.v1beta1.PscConnectionOrBuilder>
        getPscConnectionFieldBuilder() {
      if (pscConnectionBuilder_ == null) {
        if (!(connectionCase_ == 2)) {
          connection_ = com.google.cloud.redis.cluster.v1beta1.PscConnection.getDefaultInstance();
        }
        pscConnectionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.redis.cluster.v1beta1.PscConnection,
                com.google.cloud.redis.cluster.v1beta1.PscConnection.Builder,
                com.google.cloud.redis.cluster.v1beta1.PscConnectionOrBuilder>(
                (com.google.cloud.redis.cluster.v1beta1.PscConnection) connection_,
                getParentForChildren(),
                isClean());
        connection_ = null;
      }
      connectionCase_ = 2;
      onChanged();
      return pscConnectionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.redis.cluster.v1beta1.ConnectionDetail)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.redis.cluster.v1beta1.ConnectionDetail)
  private static final com.google.cloud.redis.cluster.v1beta1.ConnectionDetail DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.redis.cluster.v1beta1.ConnectionDetail();
  }

  public static com.google.cloud.redis.cluster.v1beta1.ConnectionDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConnectionDetail> PARSER =
      new com.google.protobuf.AbstractParser<ConnectionDetail>() {
        @java.lang.Override
        public ConnectionDetail parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConnectionDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConnectionDetail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.redis.cluster.v1beta1.ConnectionDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
