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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.8
package com.google.container.v1;

/**
 *
 *
 * <pre>
 * GPUSharingConfig represents the GPU sharing configuration for Hardware
 * Accelerators.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.GPUSharingConfig}
 */
public final class GPUSharingConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.GPUSharingConfig)
    GPUSharingConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use GPUSharingConfig.newBuilder() to construct.
  private GPUSharingConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GPUSharingConfig() {
    gpuSharingStrategy_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GPUSharingConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_GPUSharingConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_GPUSharingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.GPUSharingConfig.class,
            com.google.container.v1.GPUSharingConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The type of GPU sharing strategy currently provided.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1.GPUSharingConfig.GPUSharingStrategy}
   */
  public enum GPUSharingStrategy implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default value.
     * </pre>
     *
     * <code>GPU_SHARING_STRATEGY_UNSPECIFIED = 0;</code>
     */
    GPU_SHARING_STRATEGY_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * GPUs are time-shared between containers.
     * </pre>
     *
     * <code>TIME_SHARING = 1;</code>
     */
    TIME_SHARING(1),
    /**
     *
     *
     * <pre>
     * GPUs are shared between containers with NVIDIA MPS.
     * </pre>
     *
     * <code>MPS = 2;</code>
     */
    MPS(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default value.
     * </pre>
     *
     * <code>GPU_SHARING_STRATEGY_UNSPECIFIED = 0;</code>
     */
    public static final int GPU_SHARING_STRATEGY_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * GPUs are time-shared between containers.
     * </pre>
     *
     * <code>TIME_SHARING = 1;</code>
     */
    public static final int TIME_SHARING_VALUE = 1;

    /**
     *
     *
     * <pre>
     * GPUs are shared between containers with NVIDIA MPS.
     * </pre>
     *
     * <code>MPS = 2;</code>
     */
    public static final int MPS_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GPUSharingStrategy valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GPUSharingStrategy forNumber(int value) {
      switch (value) {
        case 0:
          return GPU_SHARING_STRATEGY_UNSPECIFIED;
        case 1:
          return TIME_SHARING;
        case 2:
          return MPS;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GPUSharingStrategy>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<GPUSharingStrategy>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<GPUSharingStrategy>() {
              public GPUSharingStrategy findValueByNumber(int number) {
                return GPUSharingStrategy.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.container.v1.GPUSharingConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final GPUSharingStrategy[] VALUES = values();

    public static GPUSharingStrategy valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private GPUSharingStrategy(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1.GPUSharingConfig.GPUSharingStrategy)
  }

  private int bitField0_;
  public static final int MAX_SHARED_CLIENTS_PER_GPU_FIELD_NUMBER = 1;
  private long maxSharedClientsPerGpu_ = 0L;

  /**
   *
   *
   * <pre>
   * The max number of containers that can share a physical GPU.
   * </pre>
   *
   * <code>int64 max_shared_clients_per_gpu = 1;</code>
   *
   * @return The maxSharedClientsPerGpu.
   */
  @java.lang.Override
  public long getMaxSharedClientsPerGpu() {
    return maxSharedClientsPerGpu_;
  }

  public static final int GPU_SHARING_STRATEGY_FIELD_NUMBER = 2;
  private int gpuSharingStrategy_ = 0;

  /**
   *
   *
   * <pre>
   * The type of GPU sharing strategy to enable on the GPU node.
   * </pre>
   *
   * <code>
   * optional .google.container.v1.GPUSharingConfig.GPUSharingStrategy gpu_sharing_strategy = 2;
   * </code>
   *
   * @return Whether the gpuSharingStrategy field is set.
   */
  @java.lang.Override
  public boolean hasGpuSharingStrategy() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The type of GPU sharing strategy to enable on the GPU node.
   * </pre>
   *
   * <code>
   * optional .google.container.v1.GPUSharingConfig.GPUSharingStrategy gpu_sharing_strategy = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for gpuSharingStrategy.
   */
  @java.lang.Override
  public int getGpuSharingStrategyValue() {
    return gpuSharingStrategy_;
  }

  /**
   *
   *
   * <pre>
   * The type of GPU sharing strategy to enable on the GPU node.
   * </pre>
   *
   * <code>
   * optional .google.container.v1.GPUSharingConfig.GPUSharingStrategy gpu_sharing_strategy = 2;
   * </code>
   *
   * @return The gpuSharingStrategy.
   */
  @java.lang.Override
  public com.google.container.v1.GPUSharingConfig.GPUSharingStrategy getGpuSharingStrategy() {
    com.google.container.v1.GPUSharingConfig.GPUSharingStrategy result =
        com.google.container.v1.GPUSharingConfig.GPUSharingStrategy.forNumber(gpuSharingStrategy_);
    return result == null
        ? com.google.container.v1.GPUSharingConfig.GPUSharingStrategy.UNRECOGNIZED
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
    if (maxSharedClientsPerGpu_ != 0L) {
      output.writeInt64(1, maxSharedClientsPerGpu_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeEnum(2, gpuSharingStrategy_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxSharedClientsPerGpu_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, maxSharedClientsPerGpu_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, gpuSharingStrategy_);
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
    if (!(obj instanceof com.google.container.v1.GPUSharingConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1.GPUSharingConfig other = (com.google.container.v1.GPUSharingConfig) obj;

    if (getMaxSharedClientsPerGpu() != other.getMaxSharedClientsPerGpu()) return false;
    if (hasGpuSharingStrategy() != other.hasGpuSharingStrategy()) return false;
    if (hasGpuSharingStrategy()) {
      if (gpuSharingStrategy_ != other.gpuSharingStrategy_) return false;
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
    hash = (37 * hash) + MAX_SHARED_CLIENTS_PER_GPU_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getMaxSharedClientsPerGpu());
    if (hasGpuSharingStrategy()) {
      hash = (37 * hash) + GPU_SHARING_STRATEGY_FIELD_NUMBER;
      hash = (53 * hash) + gpuSharingStrategy_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.GPUSharingConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.GPUSharingConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.GPUSharingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.GPUSharingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.GPUSharingConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.GPUSharingConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.GPUSharingConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.GPUSharingConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.GPUSharingConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.GPUSharingConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.GPUSharingConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.GPUSharingConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1.GPUSharingConfig prototype) {
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
   * GPUSharingConfig represents the GPU sharing configuration for Hardware
   * Accelerators.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.GPUSharingConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.GPUSharingConfig)
      com.google.container.v1.GPUSharingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_GPUSharingConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_GPUSharingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.GPUSharingConfig.class,
              com.google.container.v1.GPUSharingConfig.Builder.class);
    }

    // Construct using com.google.container.v1.GPUSharingConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      maxSharedClientsPerGpu_ = 0L;
      gpuSharingStrategy_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_GPUSharingConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.GPUSharingConfig getDefaultInstanceForType() {
      return com.google.container.v1.GPUSharingConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.GPUSharingConfig build() {
      com.google.container.v1.GPUSharingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.GPUSharingConfig buildPartial() {
      com.google.container.v1.GPUSharingConfig result =
          new com.google.container.v1.GPUSharingConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1.GPUSharingConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maxSharedClientsPerGpu_ = maxSharedClientsPerGpu_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.gpuSharingStrategy_ = gpuSharingStrategy_;
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
      if (other instanceof com.google.container.v1.GPUSharingConfig) {
        return mergeFrom((com.google.container.v1.GPUSharingConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.GPUSharingConfig other) {
      if (other == com.google.container.v1.GPUSharingConfig.getDefaultInstance()) return this;
      if (other.getMaxSharedClientsPerGpu() != 0L) {
        setMaxSharedClientsPerGpu(other.getMaxSharedClientsPerGpu());
      }
      if (other.hasGpuSharingStrategy()) {
        setGpuSharingStrategy(other.getGpuSharingStrategy());
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
                maxSharedClientsPerGpu_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                gpuSharingStrategy_ = input.readEnum();
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

    private long maxSharedClientsPerGpu_;

    /**
     *
     *
     * <pre>
     * The max number of containers that can share a physical GPU.
     * </pre>
     *
     * <code>int64 max_shared_clients_per_gpu = 1;</code>
     *
     * @return The maxSharedClientsPerGpu.
     */
    @java.lang.Override
    public long getMaxSharedClientsPerGpu() {
      return maxSharedClientsPerGpu_;
    }

    /**
     *
     *
     * <pre>
     * The max number of containers that can share a physical GPU.
     * </pre>
     *
     * <code>int64 max_shared_clients_per_gpu = 1;</code>
     *
     * @param value The maxSharedClientsPerGpu to set.
     * @return This builder for chaining.
     */
    public Builder setMaxSharedClientsPerGpu(long value) {

      maxSharedClientsPerGpu_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The max number of containers that can share a physical GPU.
     * </pre>
     *
     * <code>int64 max_shared_clients_per_gpu = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxSharedClientsPerGpu() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maxSharedClientsPerGpu_ = 0L;
      onChanged();
      return this;
    }

    private int gpuSharingStrategy_ = 0;

    /**
     *
     *
     * <pre>
     * The type of GPU sharing strategy to enable on the GPU node.
     * </pre>
     *
     * <code>
     * optional .google.container.v1.GPUSharingConfig.GPUSharingStrategy gpu_sharing_strategy = 2;
     * </code>
     *
     * @return Whether the gpuSharingStrategy field is set.
     */
    @java.lang.Override
    public boolean hasGpuSharingStrategy() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * The type of GPU sharing strategy to enable on the GPU node.
     * </pre>
     *
     * <code>
     * optional .google.container.v1.GPUSharingConfig.GPUSharingStrategy gpu_sharing_strategy = 2;
     * </code>
     *
     * @return The enum numeric value on the wire for gpuSharingStrategy.
     */
    @java.lang.Override
    public int getGpuSharingStrategyValue() {
      return gpuSharingStrategy_;
    }

    /**
     *
     *
     * <pre>
     * The type of GPU sharing strategy to enable on the GPU node.
     * </pre>
     *
     * <code>
     * optional .google.container.v1.GPUSharingConfig.GPUSharingStrategy gpu_sharing_strategy = 2;
     * </code>
     *
     * @param value The enum numeric value on the wire for gpuSharingStrategy to set.
     * @return This builder for chaining.
     */
    public Builder setGpuSharingStrategyValue(int value) {
      gpuSharingStrategy_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The type of GPU sharing strategy to enable on the GPU node.
     * </pre>
     *
     * <code>
     * optional .google.container.v1.GPUSharingConfig.GPUSharingStrategy gpu_sharing_strategy = 2;
     * </code>
     *
     * @return The gpuSharingStrategy.
     */
    @java.lang.Override
    public com.google.container.v1.GPUSharingConfig.GPUSharingStrategy getGpuSharingStrategy() {
      com.google.container.v1.GPUSharingConfig.GPUSharingStrategy result =
          com.google.container.v1.GPUSharingConfig.GPUSharingStrategy.forNumber(
              gpuSharingStrategy_);
      return result == null
          ? com.google.container.v1.GPUSharingConfig.GPUSharingStrategy.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * The type of GPU sharing strategy to enable on the GPU node.
     * </pre>
     *
     * <code>
     * optional .google.container.v1.GPUSharingConfig.GPUSharingStrategy gpu_sharing_strategy = 2;
     * </code>
     *
     * @param value The gpuSharingStrategy to set.
     * @return This builder for chaining.
     */
    public Builder setGpuSharingStrategy(
        com.google.container.v1.GPUSharingConfig.GPUSharingStrategy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      gpuSharingStrategy_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The type of GPU sharing strategy to enable on the GPU node.
     * </pre>
     *
     * <code>
     * optional .google.container.v1.GPUSharingConfig.GPUSharingStrategy gpu_sharing_strategy = 2;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGpuSharingStrategy() {
      bitField0_ = (bitField0_ & ~0x00000002);
      gpuSharingStrategy_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.GPUSharingConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.GPUSharingConfig)
  private static final com.google.container.v1.GPUSharingConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.GPUSharingConfig();
  }

  public static com.google.container.v1.GPUSharingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GPUSharingConfig> PARSER =
      new com.google.protobuf.AbstractParser<GPUSharingConfig>() {
        @java.lang.Override
        public GPUSharingConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<GPUSharingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GPUSharingConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.GPUSharingConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
