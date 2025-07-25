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
// source: google/cloud/backupdr/v1/datasourcereference.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.backupdr.v1;

/**
 *
 *
 * <pre>
 * Information of backup configuration on the DataSource.
 * </pre>
 *
 * Protobuf type {@code google.cloud.backupdr.v1.DataSourceBackupConfigInfo}
 */
public final class DataSourceBackupConfigInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.backupdr.v1.DataSourceBackupConfigInfo)
    DataSourceBackupConfigInfoOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use DataSourceBackupConfigInfo.newBuilder() to construct.
  private DataSourceBackupConfigInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataSourceBackupConfigInfo() {
    lastBackupState_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataSourceBackupConfigInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.backupdr.v1.DataSourceReferenceProto
        .internal_static_google_cloud_backupdr_v1_DataSourceBackupConfigInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.backupdr.v1.DataSourceReferenceProto
        .internal_static_google_cloud_backupdr_v1_DataSourceBackupConfigInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo.class,
            com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo.Builder.class);
  }

  private int bitField0_;
  public static final int LAST_BACKUP_STATE_FIELD_NUMBER = 1;
  private int lastBackupState_ = 0;

  /**
   *
   *
   * <pre>
   * Output only. The status of the last backup in this DataSource
   * </pre>
   *
   * <code>
   * .google.cloud.backupdr.v1.BackupConfigInfo.LastBackupState last_backup_state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for lastBackupState.
   */
  @java.lang.Override
  public int getLastBackupStateValue() {
    return lastBackupState_;
  }

  /**
   *
   *
   * <pre>
   * Output only. The status of the last backup in this DataSource
   * </pre>
   *
   * <code>
   * .google.cloud.backupdr.v1.BackupConfigInfo.LastBackupState last_backup_state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastBackupState.
   */
  @java.lang.Override
  public com.google.cloud.backupdr.v1.BackupConfigInfo.LastBackupState getLastBackupState() {
    com.google.cloud.backupdr.v1.BackupConfigInfo.LastBackupState result =
        com.google.cloud.backupdr.v1.BackupConfigInfo.LastBackupState.forNumber(lastBackupState_);
    return result == null
        ? com.google.cloud.backupdr.v1.BackupConfigInfo.LastBackupState.UNRECOGNIZED
        : result;
  }

  public static final int LAST_SUCCESSFUL_BACKUP_CONSISTENCY_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp lastSuccessfulBackupConsistencyTime_;

  /**
   *
   *
   * <pre>
   * Output only. Timestamp of the last successful backup to this DataSource.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_successful_backup_consistency_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the lastSuccessfulBackupConsistencyTime field is set.
   */
  @java.lang.Override
  public boolean hasLastSuccessfulBackupConsistencyTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Output only. Timestamp of the last successful backup to this DataSource.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_successful_backup_consistency_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastSuccessfulBackupConsistencyTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getLastSuccessfulBackupConsistencyTime() {
    return lastSuccessfulBackupConsistencyTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : lastSuccessfulBackupConsistencyTime_;
  }

  /**
   *
   *
   * <pre>
   * Output only. Timestamp of the last successful backup to this DataSource.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_successful_backup_consistency_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getLastSuccessfulBackupConsistencyTimeOrBuilder() {
    return lastSuccessfulBackupConsistencyTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : lastSuccessfulBackupConsistencyTime_;
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
    if (lastBackupState_
        != com.google.cloud.backupdr.v1.BackupConfigInfo.LastBackupState
            .LAST_BACKUP_STATE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, lastBackupState_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getLastSuccessfulBackupConsistencyTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lastBackupState_
        != com.google.cloud.backupdr.v1.BackupConfigInfo.LastBackupState
            .LAST_BACKUP_STATE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, lastBackupState_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, getLastSuccessfulBackupConsistencyTime());
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
    if (!(obj instanceof com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo other =
        (com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo) obj;

    if (lastBackupState_ != other.lastBackupState_) return false;
    if (hasLastSuccessfulBackupConsistencyTime() != other.hasLastSuccessfulBackupConsistencyTime())
      return false;
    if (hasLastSuccessfulBackupConsistencyTime()) {
      if (!getLastSuccessfulBackupConsistencyTime()
          .equals(other.getLastSuccessfulBackupConsistencyTime())) return false;
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
    hash = (37 * hash) + LAST_BACKUP_STATE_FIELD_NUMBER;
    hash = (53 * hash) + lastBackupState_;
    if (hasLastSuccessfulBackupConsistencyTime()) {
      hash = (37 * hash) + LAST_SUCCESSFUL_BACKUP_CONSISTENCY_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLastSuccessfulBackupConsistencyTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo parseFrom(
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
      com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo prototype) {
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
   * Information of backup configuration on the DataSource.
   * </pre>
   *
   * Protobuf type {@code google.cloud.backupdr.v1.DataSourceBackupConfigInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.backupdr.v1.DataSourceBackupConfigInfo)
      com.google.cloud.backupdr.v1.DataSourceBackupConfigInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.backupdr.v1.DataSourceReferenceProto
          .internal_static_google_cloud_backupdr_v1_DataSourceBackupConfigInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.backupdr.v1.DataSourceReferenceProto
          .internal_static_google_cloud_backupdr_v1_DataSourceBackupConfigInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo.class,
              com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo.Builder.class);
    }

    // Construct using com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getLastSuccessfulBackupConsistencyTimeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      lastBackupState_ = 0;
      lastSuccessfulBackupConsistencyTime_ = null;
      if (lastSuccessfulBackupConsistencyTimeBuilder_ != null) {
        lastSuccessfulBackupConsistencyTimeBuilder_.dispose();
        lastSuccessfulBackupConsistencyTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.backupdr.v1.DataSourceReferenceProto
          .internal_static_google_cloud_backupdr_v1_DataSourceBackupConfigInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo getDefaultInstanceForType() {
      return com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo build() {
      com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo buildPartial() {
      com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo result =
          new com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.lastBackupState_ = lastBackupState_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.lastSuccessfulBackupConsistencyTime_ =
            lastSuccessfulBackupConsistencyTimeBuilder_ == null
                ? lastSuccessfulBackupConsistencyTime_
                : lastSuccessfulBackupConsistencyTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo) {
        return mergeFrom((com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo other) {
      if (other == com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo.getDefaultInstance())
        return this;
      if (other.lastBackupState_ != 0) {
        setLastBackupStateValue(other.getLastBackupStateValue());
      }
      if (other.hasLastSuccessfulBackupConsistencyTime()) {
        mergeLastSuccessfulBackupConsistencyTime(other.getLastSuccessfulBackupConsistencyTime());
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
                lastBackupState_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(
                    getLastSuccessfulBackupConsistencyTimeFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
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

    private int bitField0_;

    private int lastBackupState_ = 0;

    /**
     *
     *
     * <pre>
     * Output only. The status of the last backup in this DataSource
     * </pre>
     *
     * <code>
     * .google.cloud.backupdr.v1.BackupConfigInfo.LastBackupState last_backup_state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The enum numeric value on the wire for lastBackupState.
     */
    @java.lang.Override
    public int getLastBackupStateValue() {
      return lastBackupState_;
    }

    /**
     *
     *
     * <pre>
     * Output only. The status of the last backup in this DataSource
     * </pre>
     *
     * <code>
     * .google.cloud.backupdr.v1.BackupConfigInfo.LastBackupState last_backup_state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for lastBackupState to set.
     * @return This builder for chaining.
     */
    public Builder setLastBackupStateValue(int value) {
      lastBackupState_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. The status of the last backup in this DataSource
     * </pre>
     *
     * <code>
     * .google.cloud.backupdr.v1.BackupConfigInfo.LastBackupState last_backup_state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The lastBackupState.
     */
    @java.lang.Override
    public com.google.cloud.backupdr.v1.BackupConfigInfo.LastBackupState getLastBackupState() {
      com.google.cloud.backupdr.v1.BackupConfigInfo.LastBackupState result =
          com.google.cloud.backupdr.v1.BackupConfigInfo.LastBackupState.forNumber(lastBackupState_);
      return result == null
          ? com.google.cloud.backupdr.v1.BackupConfigInfo.LastBackupState.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * Output only. The status of the last backup in this DataSource
     * </pre>
     *
     * <code>
     * .google.cloud.backupdr.v1.BackupConfigInfo.LastBackupState last_backup_state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The lastBackupState to set.
     * @return This builder for chaining.
     */
    public Builder setLastBackupState(
        com.google.cloud.backupdr.v1.BackupConfigInfo.LastBackupState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      lastBackupState_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. The status of the last backup in this DataSource
     * </pre>
     *
     * <code>
     * .google.cloud.backupdr.v1.BackupConfigInfo.LastBackupState last_backup_state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLastBackupState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      lastBackupState_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp lastSuccessfulBackupConsistencyTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        lastSuccessfulBackupConsistencyTimeBuilder_;

    /**
     *
     *
     * <pre>
     * Output only. Timestamp of the last successful backup to this DataSource.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp last_successful_backup_consistency_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the lastSuccessfulBackupConsistencyTime field is set.
     */
    public boolean hasLastSuccessfulBackupConsistencyTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Output only. Timestamp of the last successful backup to this DataSource.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp last_successful_backup_consistency_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The lastSuccessfulBackupConsistencyTime.
     */
    public com.google.protobuf.Timestamp getLastSuccessfulBackupConsistencyTime() {
      if (lastSuccessfulBackupConsistencyTimeBuilder_ == null) {
        return lastSuccessfulBackupConsistencyTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : lastSuccessfulBackupConsistencyTime_;
      } else {
        return lastSuccessfulBackupConsistencyTimeBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Timestamp of the last successful backup to this DataSource.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp last_successful_backup_consistency_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setLastSuccessfulBackupConsistencyTime(com.google.protobuf.Timestamp value) {
      if (lastSuccessfulBackupConsistencyTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastSuccessfulBackupConsistencyTime_ = value;
      } else {
        lastSuccessfulBackupConsistencyTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Timestamp of the last successful backup to this DataSource.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp last_successful_backup_consistency_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setLastSuccessfulBackupConsistencyTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (lastSuccessfulBackupConsistencyTimeBuilder_ == null) {
        lastSuccessfulBackupConsistencyTime_ = builderForValue.build();
      } else {
        lastSuccessfulBackupConsistencyTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Timestamp of the last successful backup to this DataSource.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp last_successful_backup_consistency_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeLastSuccessfulBackupConsistencyTime(com.google.protobuf.Timestamp value) {
      if (lastSuccessfulBackupConsistencyTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && lastSuccessfulBackupConsistencyTime_ != null
            && lastSuccessfulBackupConsistencyTime_
                != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getLastSuccessfulBackupConsistencyTimeBuilder().mergeFrom(value);
        } else {
          lastSuccessfulBackupConsistencyTime_ = value;
        }
      } else {
        lastSuccessfulBackupConsistencyTimeBuilder_.mergeFrom(value);
      }
      if (lastSuccessfulBackupConsistencyTime_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Timestamp of the last successful backup to this DataSource.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp last_successful_backup_consistency_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearLastSuccessfulBackupConsistencyTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      lastSuccessfulBackupConsistencyTime_ = null;
      if (lastSuccessfulBackupConsistencyTimeBuilder_ != null) {
        lastSuccessfulBackupConsistencyTimeBuilder_.dispose();
        lastSuccessfulBackupConsistencyTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Timestamp of the last successful backup to this DataSource.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp last_successful_backup_consistency_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.Timestamp.Builder getLastSuccessfulBackupConsistencyTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getLastSuccessfulBackupConsistencyTimeFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Output only. Timestamp of the last successful backup to this DataSource.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp last_successful_backup_consistency_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.TimestampOrBuilder
        getLastSuccessfulBackupConsistencyTimeOrBuilder() {
      if (lastSuccessfulBackupConsistencyTimeBuilder_ != null) {
        return lastSuccessfulBackupConsistencyTimeBuilder_.getMessageOrBuilder();
      } else {
        return lastSuccessfulBackupConsistencyTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : lastSuccessfulBackupConsistencyTime_;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Timestamp of the last successful backup to this DataSource.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp last_successful_backup_consistency_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getLastSuccessfulBackupConsistencyTimeFieldBuilder() {
      if (lastSuccessfulBackupConsistencyTimeBuilder_ == null) {
        lastSuccessfulBackupConsistencyTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getLastSuccessfulBackupConsistencyTime(), getParentForChildren(), isClean());
        lastSuccessfulBackupConsistencyTime_ = null;
      }
      return lastSuccessfulBackupConsistencyTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.backupdr.v1.DataSourceBackupConfigInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.backupdr.v1.DataSourceBackupConfigInfo)
  private static final com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo();
  }

  public static com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataSourceBackupConfigInfo> PARSER =
      new com.google.protobuf.AbstractParser<DataSourceBackupConfigInfo>() {
        @java.lang.Override
        public DataSourceBackupConfigInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataSourceBackupConfigInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataSourceBackupConfigInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.backupdr.v1.DataSourceBackupConfigInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
