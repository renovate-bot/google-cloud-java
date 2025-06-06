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
 * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest}
 */
public final class InstanceGroupManagersSuspendInstancesRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest)
    InstanceGroupManagersSuspendInstancesRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use InstanceGroupManagersSuspendInstancesRequest.newBuilder() to construct.
  private InstanceGroupManagersSuspendInstancesRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceGroupManagersSuspendInstancesRequest() {
    instances_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceGroupManagersSuspendInstancesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagersSuspendInstancesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagersSuspendInstancesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest.class,
            com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest.Builder.class);
  }

  private int bitField0_;
  public static final int FORCE_SUSPEND_FIELD_NUMBER = 27637480;
  private boolean forceSuspend_ = false;

  /**
   *
   *
   * <pre>
   * If this flag is set to true, the Instance Group Manager will proceed to suspend the instances, skipping initialization on them.
   * </pre>
   *
   * <code>optional bool force_suspend = 27637480;</code>
   *
   * @return Whether the forceSuspend field is set.
   */
  @java.lang.Override
  public boolean hasForceSuspend() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * If this flag is set to true, the Instance Group Manager will proceed to suspend the instances, skipping initialization on them.
   * </pre>
   *
   * <code>optional bool force_suspend = 27637480;</code>
   *
   * @return The forceSuspend.
   */
  @java.lang.Override
  public boolean getForceSuspend() {
    return forceSuspend_;
  }

  public static final int INSTANCES_FIELD_NUMBER = 29097598;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList instances_ =
      com.google.protobuf.LazyStringArrayList.emptyList();

  /**
   *
   *
   * <pre>
   * The URLs of one or more instances to suspend. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @return A list containing the instances.
   */
  public com.google.protobuf.ProtocolStringList getInstancesList() {
    return instances_;
  }

  /**
   *
   *
   * <pre>
   * The URLs of one or more instances to suspend. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @return The count of instances.
   */
  public int getInstancesCount() {
    return instances_.size();
  }

  /**
   *
   *
   * <pre>
   * The URLs of one or more instances to suspend. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @param index The index of the element to return.
   * @return The instances at the given index.
   */
  public java.lang.String getInstances(int index) {
    return instances_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The URLs of one or more instances to suspend. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the instances at the given index.
   */
  public com.google.protobuf.ByteString getInstancesBytes(int index) {
    return instances_.getByteString(index);
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
      output.writeBool(27637480, forceSuspend_);
    }
    for (int i = 0; i < instances_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 29097598, instances_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(27637480, forceSuspend_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < instances_.size(); i++) {
        dataSize += computeStringSizeNoTag(instances_.getRaw(i));
      }
      size += dataSize;
      size += 4 * getInstancesList().size();
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
    if (!(obj
        instanceof com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest other =
        (com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest) obj;

    if (hasForceSuspend() != other.hasForceSuspend()) return false;
    if (hasForceSuspend()) {
      if (getForceSuspend() != other.getForceSuspend()) return false;
    }
    if (!getInstancesList().equals(other.getInstancesList())) return false;
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
    if (hasForceSuspend()) {
      hash = (37 * hash) + FORCE_SUSPEND_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getForceSuspend());
    }
    if (getInstancesCount() > 0) {
      hash = (37 * hash) + INSTANCES_FIELD_NUMBER;
      hash = (53 * hash) + getInstancesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest parseFrom(
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
      com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest)
      com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagersSuspendInstancesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagersSuspendInstancesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest.class,
              com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      forceSuspend_ = false;
      instances_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagersSuspendInstancesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest build() {
      com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest buildPartial() {
      com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest result =
          new com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.forceSuspend_ = forceSuspend_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        instances_.makeImmutable();
        result.instances_ = instances_;
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
      if (other
          instanceof com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest) {
        return mergeFrom(
            (com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest other) {
      if (other
          == com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest
              .getDefaultInstance()) return this;
      if (other.hasForceSuspend()) {
        setForceSuspend(other.getForceSuspend());
      }
      if (!other.instances_.isEmpty()) {
        if (instances_.isEmpty()) {
          instances_ = other.instances_;
          bitField0_ |= 0x00000002;
        } else {
          ensureInstancesIsMutable();
          instances_.addAll(other.instances_);
        }
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
            case 221099840:
              {
                forceSuspend_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 221099840
            case 232780786:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureInstancesIsMutable();
                instances_.add(s);
                break;
              } // case 232780786
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

    private boolean forceSuspend_;

    /**
     *
     *
     * <pre>
     * If this flag is set to true, the Instance Group Manager will proceed to suspend the instances, skipping initialization on them.
     * </pre>
     *
     * <code>optional bool force_suspend = 27637480;</code>
     *
     * @return Whether the forceSuspend field is set.
     */
    @java.lang.Override
    public boolean hasForceSuspend() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * If this flag is set to true, the Instance Group Manager will proceed to suspend the instances, skipping initialization on them.
     * </pre>
     *
     * <code>optional bool force_suspend = 27637480;</code>
     *
     * @return The forceSuspend.
     */
    @java.lang.Override
    public boolean getForceSuspend() {
      return forceSuspend_;
    }

    /**
     *
     *
     * <pre>
     * If this flag is set to true, the Instance Group Manager will proceed to suspend the instances, skipping initialization on them.
     * </pre>
     *
     * <code>optional bool force_suspend = 27637480;</code>
     *
     * @param value The forceSuspend to set.
     * @return This builder for chaining.
     */
    public Builder setForceSuspend(boolean value) {

      forceSuspend_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * If this flag is set to true, the Instance Group Manager will proceed to suspend the instances, skipping initialization on them.
     * </pre>
     *
     * <code>optional bool force_suspend = 27637480;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearForceSuspend() {
      bitField0_ = (bitField0_ & ~0x00000001);
      forceSuspend_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList instances_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureInstancesIsMutable() {
      if (!instances_.isModifiable()) {
        instances_ = new com.google.protobuf.LazyStringArrayList(instances_);
      }
      bitField0_ |= 0x00000002;
    }

    /**
     *
     *
     * <pre>
     * The URLs of one or more instances to suspend. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
     * </pre>
     *
     * <code>repeated string instances = 29097598;</code>
     *
     * @return A list containing the instances.
     */
    public com.google.protobuf.ProtocolStringList getInstancesList() {
      instances_.makeImmutable();
      return instances_;
    }

    /**
     *
     *
     * <pre>
     * The URLs of one or more instances to suspend. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
     * </pre>
     *
     * <code>repeated string instances = 29097598;</code>
     *
     * @return The count of instances.
     */
    public int getInstancesCount() {
      return instances_.size();
    }

    /**
     *
     *
     * <pre>
     * The URLs of one or more instances to suspend. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
     * </pre>
     *
     * <code>repeated string instances = 29097598;</code>
     *
     * @param index The index of the element to return.
     * @return The instances at the given index.
     */
    public java.lang.String getInstances(int index) {
      return instances_.get(index);
    }

    /**
     *
     *
     * <pre>
     * The URLs of one or more instances to suspend. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
     * </pre>
     *
     * <code>repeated string instances = 29097598;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the instances at the given index.
     */
    public com.google.protobuf.ByteString getInstancesBytes(int index) {
      return instances_.getByteString(index);
    }

    /**
     *
     *
     * <pre>
     * The URLs of one or more instances to suspend. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
     * </pre>
     *
     * <code>repeated string instances = 29097598;</code>
     *
     * @param index The index to set the value at.
     * @param value The instances to set.
     * @return This builder for chaining.
     */
    public Builder setInstances(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureInstancesIsMutable();
      instances_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The URLs of one or more instances to suspend. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
     * </pre>
     *
     * <code>repeated string instances = 29097598;</code>
     *
     * @param value The instances to add.
     * @return This builder for chaining.
     */
    public Builder addInstances(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureInstancesIsMutable();
      instances_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The URLs of one or more instances to suspend. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
     * </pre>
     *
     * <code>repeated string instances = 29097598;</code>
     *
     * @param values The instances to add.
     * @return This builder for chaining.
     */
    public Builder addAllInstances(java.lang.Iterable<java.lang.String> values) {
      ensureInstancesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, instances_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The URLs of one or more instances to suspend. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
     * </pre>
     *
     * <code>repeated string instances = 29097598;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInstances() {
      instances_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The URLs of one or more instances to suspend. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
     * </pre>
     *
     * <code>repeated string instances = 29097598;</code>
     *
     * @param value The bytes of the instances to add.
     * @return This builder for chaining.
     */
    public Builder addInstancesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureInstancesIsMutable();
      instances_.add(value);
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest)
  private static final com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest();
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceGroupManagersSuspendInstancesRequest>
      PARSER =
          new com.google.protobuf.AbstractParser<InstanceGroupManagersSuspendInstancesRequest>() {
            @java.lang.Override
            public InstanceGroupManagersSuspendInstancesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstanceGroupManagersSuspendInstancesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceGroupManagersSuspendInstancesRequest>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceGroupManagersSuspendInstancesRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
