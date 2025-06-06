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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility}
 */
public final class NodeTemplateNodeTypeFlexibility extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility)
    NodeTemplateNodeTypeFlexibilityOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use NodeTemplateNodeTypeFlexibility.newBuilder() to construct.
  private NodeTemplateNodeTypeFlexibility(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NodeTemplateNodeTypeFlexibility() {
    cpus_ = "";
    localSsd_ = "";
    memory_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NodeTemplateNodeTypeFlexibility();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_NodeTemplateNodeTypeFlexibility_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_NodeTemplateNodeTypeFlexibility_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility.class,
            com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility.Builder.class);
  }

  private int bitField0_;
  public static final int CPUS_FIELD_NUMBER = 3060683;

  @SuppressWarnings("serial")
  private volatile java.lang.Object cpus_ = "";

  /**
   * <code>optional string cpus = 3060683;</code>
   *
   * @return Whether the cpus field is set.
   */
  @java.lang.Override
  public boolean hasCpus() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   * <code>optional string cpus = 3060683;</code>
   *
   * @return The cpus.
   */
  @java.lang.Override
  public java.lang.String getCpus() {
    java.lang.Object ref = cpus_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cpus_ = s;
      return s;
    }
  }

  /**
   * <code>optional string cpus = 3060683;</code>
   *
   * @return The bytes for cpus.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCpusBytes() {
    java.lang.Object ref = cpus_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      cpus_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCAL_SSD_FIELD_NUMBER = 405741360;

  @SuppressWarnings("serial")
  private volatile java.lang.Object localSsd_ = "";

  /**
   * <code>optional string local_ssd = 405741360;</code>
   *
   * @return Whether the localSsd field is set.
   */
  @java.lang.Override
  public boolean hasLocalSsd() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   * <code>optional string local_ssd = 405741360;</code>
   *
   * @return The localSsd.
   */
  @java.lang.Override
  public java.lang.String getLocalSsd() {
    java.lang.Object ref = localSsd_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      localSsd_ = s;
      return s;
    }
  }

  /**
   * <code>optional string local_ssd = 405741360;</code>
   *
   * @return The bytes for localSsd.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLocalSsdBytes() {
    java.lang.Object ref = localSsd_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      localSsd_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MEMORY_FIELD_NUMBER = 532856065;

  @SuppressWarnings("serial")
  private volatile java.lang.Object memory_ = "";

  /**
   * <code>optional string memory = 532856065;</code>
   *
   * @return Whether the memory field is set.
   */
  @java.lang.Override
  public boolean hasMemory() {
    return ((bitField0_ & 0x00000004) != 0);
  }

  /**
   * <code>optional string memory = 532856065;</code>
   *
   * @return The memory.
   */
  @java.lang.Override
  public java.lang.String getMemory() {
    java.lang.Object ref = memory_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      memory_ = s;
      return s;
    }
  }

  /**
   * <code>optional string memory = 532856065;</code>
   *
   * @return The bytes for memory.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMemoryBytes() {
    java.lang.Object ref = memory_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      memory_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3060683, cpus_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 405741360, localSsd_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 532856065, memory_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3060683, cpus_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(405741360, localSsd_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(532856065, memory_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility other =
        (com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility) obj;

    if (hasCpus() != other.hasCpus()) return false;
    if (hasCpus()) {
      if (!getCpus().equals(other.getCpus())) return false;
    }
    if (hasLocalSsd() != other.hasLocalSsd()) return false;
    if (hasLocalSsd()) {
      if (!getLocalSsd().equals(other.getLocalSsd())) return false;
    }
    if (hasMemory() != other.hasMemory()) return false;
    if (hasMemory()) {
      if (!getMemory().equals(other.getMemory())) return false;
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
    if (hasCpus()) {
      hash = (37 * hash) + CPUS_FIELD_NUMBER;
      hash = (53 * hash) + getCpus().hashCode();
    }
    if (hasLocalSsd()) {
      hash = (37 * hash) + LOCAL_SSD_FIELD_NUMBER;
      hash = (53 * hash) + getLocalSsd().hashCode();
    }
    if (hasMemory()) {
      hash = (37 * hash) + MEMORY_FIELD_NUMBER;
      hash = (53 * hash) + getMemory().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility parseFrom(
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
      com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility)
      com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibilityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NodeTemplateNodeTypeFlexibility_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NodeTemplateNodeTypeFlexibility_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility.class,
              com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      cpus_ = "";
      localSsd_ = "";
      memory_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NodeTemplateNodeTypeFlexibility_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility build() {
      com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility buildPartial() {
      com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility result =
          new com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cpus_ = cpus_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.localSsd_ = localSsd_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.memory_ = memory_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility) {
        return mergeFrom((com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility other) {
      if (other == com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility.getDefaultInstance())
        return this;
      if (other.hasCpus()) {
        cpus_ = other.cpus_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasLocalSsd()) {
        localSsd_ = other.localSsd_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasMemory()) {
        memory_ = other.memory_;
        bitField0_ |= 0x00000004;
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
            case 24485466:
              {
                cpus_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 24485466
            case -1049036414:
              {
                localSsd_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case -1049036414
            case -32118774:
              {
                memory_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case -32118774
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

    private java.lang.Object cpus_ = "";

    /**
     * <code>optional string cpus = 3060683;</code>
     *
     * @return Whether the cpus field is set.
     */
    public boolean hasCpus() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>optional string cpus = 3060683;</code>
     *
     * @return The cpus.
     */
    public java.lang.String getCpus() {
      java.lang.Object ref = cpus_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cpus_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>optional string cpus = 3060683;</code>
     *
     * @return The bytes for cpus.
     */
    public com.google.protobuf.ByteString getCpusBytes() {
      java.lang.Object ref = cpus_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        cpus_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>optional string cpus = 3060683;</code>
     *
     * @param value The cpus to set.
     * @return This builder for chaining.
     */
    public Builder setCpus(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      cpus_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     * <code>optional string cpus = 3060683;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCpus() {
      cpus_ = getDefaultInstance().getCpus();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     * <code>optional string cpus = 3060683;</code>
     *
     * @param value The bytes for cpus to set.
     * @return This builder for chaining.
     */
    public Builder setCpusBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      cpus_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object localSsd_ = "";

    /**
     * <code>optional string local_ssd = 405741360;</code>
     *
     * @return Whether the localSsd field is set.
     */
    public boolean hasLocalSsd() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>optional string local_ssd = 405741360;</code>
     *
     * @return The localSsd.
     */
    public java.lang.String getLocalSsd() {
      java.lang.Object ref = localSsd_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        localSsd_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>optional string local_ssd = 405741360;</code>
     *
     * @return The bytes for localSsd.
     */
    public com.google.protobuf.ByteString getLocalSsdBytes() {
      java.lang.Object ref = localSsd_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        localSsd_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>optional string local_ssd = 405741360;</code>
     *
     * @param value The localSsd to set.
     * @return This builder for chaining.
     */
    public Builder setLocalSsd(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      localSsd_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     * <code>optional string local_ssd = 405741360;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocalSsd() {
      localSsd_ = getDefaultInstance().getLocalSsd();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     * <code>optional string local_ssd = 405741360;</code>
     *
     * @param value The bytes for localSsd to set.
     * @return This builder for chaining.
     */
    public Builder setLocalSsdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      localSsd_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object memory_ = "";

    /**
     * <code>optional string memory = 532856065;</code>
     *
     * @return Whether the memory field is set.
     */
    public boolean hasMemory() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     * <code>optional string memory = 532856065;</code>
     *
     * @return The memory.
     */
    public java.lang.String getMemory() {
      java.lang.Object ref = memory_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        memory_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>optional string memory = 532856065;</code>
     *
     * @return The bytes for memory.
     */
    public com.google.protobuf.ByteString getMemoryBytes() {
      java.lang.Object ref = memory_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        memory_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>optional string memory = 532856065;</code>
     *
     * @param value The memory to set.
     * @return This builder for chaining.
     */
    public Builder setMemory(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      memory_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     * <code>optional string memory = 532856065;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMemory() {
      memory_ = getDefaultInstance().getMemory();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     * <code>optional string memory = 532856065;</code>
     *
     * @param value The bytes for memory to set.
     * @return This builder for chaining.
     */
    public Builder setMemoryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      memory_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility)
  private static final com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility();
  }

  public static com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeTemplateNodeTypeFlexibility> PARSER =
      new com.google.protobuf.AbstractParser<NodeTemplateNodeTypeFlexibility>() {
        @java.lang.Override
        public NodeTemplateNodeTypeFlexibility parsePartialFrom(
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

  public static com.google.protobuf.Parser<NodeTemplateNodeTypeFlexibility> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeTemplateNodeTypeFlexibility> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
