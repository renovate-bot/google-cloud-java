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
// source: google/cloud/memorystore/v1/memorystore.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.memorystore.v1;

/**
 *
 *
 * <pre>
 * Request for [BackupInstance].
 * </pre>
 *
 * Protobuf type {@code google.cloud.memorystore.v1.BackupInstanceRequest}
 */
public final class BackupInstanceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.memorystore.v1.BackupInstanceRequest)
    BackupInstanceRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use BackupInstanceRequest.newBuilder() to construct.
  private BackupInstanceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BackupInstanceRequest() {
    name_ = "";
    backupId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BackupInstanceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.memorystore.v1.V1mainProto
        .internal_static_google_cloud_memorystore_v1_BackupInstanceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.memorystore.v1.V1mainProto
        .internal_static_google_cloud_memorystore_v1_BackupInstanceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.memorystore.v1.BackupInstanceRequest.class,
            com.google.cloud.memorystore.v1.BackupInstanceRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * Required. Instance resource name using the form:
   *  `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * where `location_id` refers to a Google Cloud region.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. Instance resource name using the form:
   *  `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * where `location_id` refers to a Google Cloud region.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TTL_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration ttl_;

  /**
   *
   *
   * <pre>
   * Optional. TTL for the backup to expire. Value range is 1 day to 100 years.
   * If not specified, the default value is 100 years.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the ttl field is set.
   */
  @java.lang.Override
  public boolean hasTtl() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Optional. TTL for the backup to expire. Value range is 1 day to 100 years.
   * If not specified, the default value is 100 years.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The ttl.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getTtl() {
    return ttl_ == null ? com.google.protobuf.Duration.getDefaultInstance() : ttl_;
  }

  /**
   *
   *
   * <pre>
   * Optional. TTL for the backup to expire. Value range is 1 day to 100 years.
   * If not specified, the default value is 100 years.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getTtlOrBuilder() {
    return ttl_ == null ? com.google.protobuf.Duration.getDefaultInstance() : ttl_;
  }

  public static final int BACKUP_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object backupId_ = "";

  /**
   *
   *
   * <pre>
   * Optional. The id of the backup to be created. If not specified, the
   * default value ([YYYYMMDDHHMMSS]_[Shortened Instance UID] is used.
   * </pre>
   *
   * <code>optional string backup_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the backupId field is set.
   */
  @java.lang.Override
  public boolean hasBackupId() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Optional. The id of the backup to be created. If not specified, the
   * default value ([YYYYMMDDHHMMSS]_[Shortened Instance UID] is used.
   * </pre>
   *
   * <code>optional string backup_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The backupId.
   */
  @java.lang.Override
  public java.lang.String getBackupId() {
    java.lang.Object ref = backupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      backupId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. The id of the backup to be created. If not specified, the
   * default value ([YYYYMMDDHHMMSS]_[Shortened Instance UID] is used.
   * </pre>
   *
   * <code>optional string backup_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for backupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBackupIdBytes() {
    java.lang.Object ref = backupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      backupId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getTtl());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, backupId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTtl());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, backupId_);
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
    if (!(obj instanceof com.google.cloud.memorystore.v1.BackupInstanceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.memorystore.v1.BackupInstanceRequest other =
        (com.google.cloud.memorystore.v1.BackupInstanceRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasTtl() != other.hasTtl()) return false;
    if (hasTtl()) {
      if (!getTtl().equals(other.getTtl())) return false;
    }
    if (hasBackupId() != other.hasBackupId()) return false;
    if (hasBackupId()) {
      if (!getBackupId().equals(other.getBackupId())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasTtl()) {
      hash = (37 * hash) + TTL_FIELD_NUMBER;
      hash = (53 * hash) + getTtl().hashCode();
    }
    if (hasBackupId()) {
      hash = (37 * hash) + BACKUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBackupId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.memorystore.v1.BackupInstanceRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.memorystore.v1.BackupInstanceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.memorystore.v1.BackupInstanceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.memorystore.v1.BackupInstanceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.memorystore.v1.BackupInstanceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.memorystore.v1.BackupInstanceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.memorystore.v1.BackupInstanceRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.memorystore.v1.BackupInstanceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.memorystore.v1.BackupInstanceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.memorystore.v1.BackupInstanceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.memorystore.v1.BackupInstanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.memorystore.v1.BackupInstanceRequest parseFrom(
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
      com.google.cloud.memorystore.v1.BackupInstanceRequest prototype) {
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
   * Request for [BackupInstance].
   * </pre>
   *
   * Protobuf type {@code google.cloud.memorystore.v1.BackupInstanceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.memorystore.v1.BackupInstanceRequest)
      com.google.cloud.memorystore.v1.BackupInstanceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.memorystore.v1.V1mainProto
          .internal_static_google_cloud_memorystore_v1_BackupInstanceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.memorystore.v1.V1mainProto
          .internal_static_google_cloud_memorystore_v1_BackupInstanceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.memorystore.v1.BackupInstanceRequest.class,
              com.google.cloud.memorystore.v1.BackupInstanceRequest.Builder.class);
    }

    // Construct using com.google.cloud.memorystore.v1.BackupInstanceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getTtlFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      ttl_ = null;
      if (ttlBuilder_ != null) {
        ttlBuilder_.dispose();
        ttlBuilder_ = null;
      }
      backupId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.memorystore.v1.V1mainProto
          .internal_static_google_cloud_memorystore_v1_BackupInstanceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.memorystore.v1.BackupInstanceRequest getDefaultInstanceForType() {
      return com.google.cloud.memorystore.v1.BackupInstanceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.memorystore.v1.BackupInstanceRequest build() {
      com.google.cloud.memorystore.v1.BackupInstanceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.memorystore.v1.BackupInstanceRequest buildPartial() {
      com.google.cloud.memorystore.v1.BackupInstanceRequest result =
          new com.google.cloud.memorystore.v1.BackupInstanceRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.memorystore.v1.BackupInstanceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ttl_ = ttlBuilder_ == null ? ttl_ : ttlBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.backupId_ = backupId_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.memorystore.v1.BackupInstanceRequest) {
        return mergeFrom((com.google.cloud.memorystore.v1.BackupInstanceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.memorystore.v1.BackupInstanceRequest other) {
      if (other == com.google.cloud.memorystore.v1.BackupInstanceRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasTtl()) {
        mergeTtl(other.getTtl());
      }
      if (other.hasBackupId()) {
        backupId_ = other.backupId_;
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
            case 10:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getTtlFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                backupId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object name_ = "";

    /**
     *
     *
     * <pre>
     * Required. Instance resource name using the form:
     *  `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a Google Cloud region.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Instance resource name using the form:
     *  `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a Google Cloud region.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Instance resource name using the form:
     *  `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a Google Cloud region.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Instance resource name using the form:
     *  `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a Google Cloud region.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Instance resource name using the form:
     *  `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a Google Cloud region.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration ttl_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        ttlBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. TTL for the backup to expire. Value range is 1 day to 100 years.
     * If not specified, the default value is 100 years.
     * </pre>
     *
     * <code>.google.protobuf.Duration ttl = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the ttl field is set.
     */
    public boolean hasTtl() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Optional. TTL for the backup to expire. Value range is 1 day to 100 years.
     * If not specified, the default value is 100 years.
     * </pre>
     *
     * <code>.google.protobuf.Duration ttl = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The ttl.
     */
    public com.google.protobuf.Duration getTtl() {
      if (ttlBuilder_ == null) {
        return ttl_ == null ? com.google.protobuf.Duration.getDefaultInstance() : ttl_;
      } else {
        return ttlBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. TTL for the backup to expire. Value range is 1 day to 100 years.
     * If not specified, the default value is 100 years.
     * </pre>
     *
     * <code>.google.protobuf.Duration ttl = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setTtl(com.google.protobuf.Duration value) {
      if (ttlBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ttl_ = value;
      } else {
        ttlBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. TTL for the backup to expire. Value range is 1 day to 100 years.
     * If not specified, the default value is 100 years.
     * </pre>
     *
     * <code>.google.protobuf.Duration ttl = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setTtl(com.google.protobuf.Duration.Builder builderForValue) {
      if (ttlBuilder_ == null) {
        ttl_ = builderForValue.build();
      } else {
        ttlBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. TTL for the backup to expire. Value range is 1 day to 100 years.
     * If not specified, the default value is 100 years.
     * </pre>
     *
     * <code>.google.protobuf.Duration ttl = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeTtl(com.google.protobuf.Duration value) {
      if (ttlBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && ttl_ != null
            && ttl_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getTtlBuilder().mergeFrom(value);
        } else {
          ttl_ = value;
        }
      } else {
        ttlBuilder_.mergeFrom(value);
      }
      if (ttl_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. TTL for the backup to expire. Value range is 1 day to 100 years.
     * If not specified, the default value is 100 years.
     * </pre>
     *
     * <code>.google.protobuf.Duration ttl = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearTtl() {
      bitField0_ = (bitField0_ & ~0x00000002);
      ttl_ = null;
      if (ttlBuilder_ != null) {
        ttlBuilder_.dispose();
        ttlBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. TTL for the backup to expire. Value range is 1 day to 100 years.
     * If not specified, the default value is 100 years.
     * </pre>
     *
     * <code>.google.protobuf.Duration ttl = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.Duration.Builder getTtlBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTtlFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Optional. TTL for the backup to expire. Value range is 1 day to 100 years.
     * If not specified, the default value is 100 years.
     * </pre>
     *
     * <code>.google.protobuf.Duration ttl = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.DurationOrBuilder getTtlOrBuilder() {
      if (ttlBuilder_ != null) {
        return ttlBuilder_.getMessageOrBuilder();
      } else {
        return ttl_ == null ? com.google.protobuf.Duration.getDefaultInstance() : ttl_;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. TTL for the backup to expire. Value range is 1 day to 100 years.
     * If not specified, the default value is 100 years.
     * </pre>
     *
     * <code>.google.protobuf.Duration ttl = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getTtlFieldBuilder() {
      if (ttlBuilder_ == null) {
        ttlBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(getTtl(), getParentForChildren(), isClean());
        ttl_ = null;
      }
      return ttlBuilder_;
    }

    private java.lang.Object backupId_ = "";

    /**
     *
     *
     * <pre>
     * Optional. The id of the backup to be created. If not specified, the
     * default value ([YYYYMMDDHHMMSS]_[Shortened Instance UID] is used.
     * </pre>
     *
     * <code>optional string backup_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the backupId field is set.
     */
    public boolean hasBackupId() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Optional. The id of the backup to be created. If not specified, the
     * default value ([YYYYMMDDHHMMSS]_[Shortened Instance UID] is used.
     * </pre>
     *
     * <code>optional string backup_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The backupId.
     */
    public java.lang.String getBackupId() {
      java.lang.Object ref = backupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        backupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The id of the backup to be created. If not specified, the
     * default value ([YYYYMMDDHHMMSS]_[Shortened Instance UID] is used.
     * </pre>
     *
     * <code>optional string backup_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for backupId.
     */
    public com.google.protobuf.ByteString getBackupIdBytes() {
      java.lang.Object ref = backupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        backupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The id of the backup to be created. If not specified, the
     * default value ([YYYYMMDDHHMMSS]_[Shortened Instance UID] is used.
     * </pre>
     *
     * <code>optional string backup_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The backupId to set.
     * @return This builder for chaining.
     */
    public Builder setBackupId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      backupId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The id of the backup to be created. If not specified, the
     * default value ([YYYYMMDDHHMMSS]_[Shortened Instance UID] is used.
     * </pre>
     *
     * <code>optional string backup_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBackupId() {
      backupId_ = getDefaultInstance().getBackupId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The id of the backup to be created. If not specified, the
     * default value ([YYYYMMDDHHMMSS]_[Shortened Instance UID] is used.
     * </pre>
     *
     * <code>optional string backup_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for backupId to set.
     * @return This builder for chaining.
     */
    public Builder setBackupIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      backupId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.memorystore.v1.BackupInstanceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.memorystore.v1.BackupInstanceRequest)
  private static final com.google.cloud.memorystore.v1.BackupInstanceRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.memorystore.v1.BackupInstanceRequest();
  }

  public static com.google.cloud.memorystore.v1.BackupInstanceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BackupInstanceRequest> PARSER =
      new com.google.protobuf.AbstractParser<BackupInstanceRequest>() {
        @java.lang.Override
        public BackupInstanceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BackupInstanceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BackupInstanceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.memorystore.v1.BackupInstanceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
