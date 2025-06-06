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
 * Protobuf type {@code google.cloud.compute.v1.TargetPoolsScopedList}
 */
public final class TargetPoolsScopedList extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.TargetPoolsScopedList)
    TargetPoolsScopedListOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use TargetPoolsScopedList.newBuilder() to construct.
  private TargetPoolsScopedList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TargetPoolsScopedList() {
    targetPools_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TargetPoolsScopedList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_TargetPoolsScopedList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_TargetPoolsScopedList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.TargetPoolsScopedList.class,
            com.google.cloud.compute.v1.TargetPoolsScopedList.Builder.class);
  }

  private int bitField0_;
  public static final int TARGET_POOLS_FIELD_NUMBER = 336072617;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.TargetPool> targetPools_;

  /**
   *
   *
   * <pre>
   * A list of target pools contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.TargetPool> getTargetPoolsList() {
    return targetPools_;
  }

  /**
   *
   *
   * <pre>
   * A list of target pools contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.TargetPoolOrBuilder>
      getTargetPoolsOrBuilderList() {
    return targetPools_;
  }

  /**
   *
   *
   * <pre>
   * A list of target pools contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
   */
  @java.lang.Override
  public int getTargetPoolsCount() {
    return targetPools_.size();
  }

  /**
   *
   *
   * <pre>
   * A list of target pools contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.TargetPool getTargetPools(int index) {
    return targetPools_.get(index);
  }

  /**
   *
   *
   * <pre>
   * A list of target pools contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.TargetPoolOrBuilder getTargetPoolsOrBuilder(int index) {
    return targetPools_.get(index);
  }

  public static final int WARNING_FIELD_NUMBER = 50704284;
  private com.google.cloud.compute.v1.Warning warning_;

  /**
   *
   *
   * <pre>
   * Informational warning which replaces the list of addresses when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return Whether the warning field is set.
   */
  @java.lang.Override
  public boolean hasWarning() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Informational warning which replaces the list of addresses when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return The warning.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Warning getWarning() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
  }

  /**
   *
   *
   * <pre>
   * Informational warning which replaces the list of addresses when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
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
      output.writeMessage(50704284, getWarning());
    }
    for (int i = 0; i < targetPools_.size(); i++) {
      output.writeMessage(336072617, targetPools_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(50704284, getWarning());
    }
    for (int i = 0; i < targetPools_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(336072617, targetPools_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.TargetPoolsScopedList)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.TargetPoolsScopedList other =
        (com.google.cloud.compute.v1.TargetPoolsScopedList) obj;

    if (!getTargetPoolsList().equals(other.getTargetPoolsList())) return false;
    if (hasWarning() != other.hasWarning()) return false;
    if (hasWarning()) {
      if (!getWarning().equals(other.getWarning())) return false;
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
    if (getTargetPoolsCount() > 0) {
      hash = (37 * hash) + TARGET_POOLS_FIELD_NUMBER;
      hash = (53 * hash) + getTargetPoolsList().hashCode();
    }
    if (hasWarning()) {
      hash = (37 * hash) + WARNING_FIELD_NUMBER;
      hash = (53 * hash) + getWarning().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.TargetPoolsScopedList parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.TargetPoolsScopedList parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetPoolsScopedList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.TargetPoolsScopedList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetPoolsScopedList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.TargetPoolsScopedList parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetPoolsScopedList parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.TargetPoolsScopedList parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetPoolsScopedList parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.TargetPoolsScopedList parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetPoolsScopedList parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.TargetPoolsScopedList parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.TargetPoolsScopedList prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.TargetPoolsScopedList}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.TargetPoolsScopedList)
      com.google.cloud.compute.v1.TargetPoolsScopedListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_TargetPoolsScopedList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_TargetPoolsScopedList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.TargetPoolsScopedList.class,
              com.google.cloud.compute.v1.TargetPoolsScopedList.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.TargetPoolsScopedList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getTargetPoolsFieldBuilder();
        getWarningFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (targetPoolsBuilder_ == null) {
        targetPools_ = java.util.Collections.emptyList();
      } else {
        targetPools_ = null;
        targetPoolsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_TargetPoolsScopedList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetPoolsScopedList getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.TargetPoolsScopedList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetPoolsScopedList build() {
      com.google.cloud.compute.v1.TargetPoolsScopedList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetPoolsScopedList buildPartial() {
      com.google.cloud.compute.v1.TargetPoolsScopedList result =
          new com.google.cloud.compute.v1.TargetPoolsScopedList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.compute.v1.TargetPoolsScopedList result) {
      if (targetPoolsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          targetPools_ = java.util.Collections.unmodifiableList(targetPools_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.targetPools_ = targetPools_;
      } else {
        result.targetPools_ = targetPoolsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.TargetPoolsScopedList result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.warning_ = warningBuilder_ == null ? warning_ : warningBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.TargetPoolsScopedList) {
        return mergeFrom((com.google.cloud.compute.v1.TargetPoolsScopedList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.TargetPoolsScopedList other) {
      if (other == com.google.cloud.compute.v1.TargetPoolsScopedList.getDefaultInstance())
        return this;
      if (targetPoolsBuilder_ == null) {
        if (!other.targetPools_.isEmpty()) {
          if (targetPools_.isEmpty()) {
            targetPools_ = other.targetPools_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTargetPoolsIsMutable();
            targetPools_.addAll(other.targetPools_);
          }
          onChanged();
        }
      } else {
        if (!other.targetPools_.isEmpty()) {
          if (targetPoolsBuilder_.isEmpty()) {
            targetPoolsBuilder_.dispose();
            targetPoolsBuilder_ = null;
            targetPools_ = other.targetPools_;
            bitField0_ = (bitField0_ & ~0x00000001);
            targetPoolsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTargetPoolsFieldBuilder()
                    : null;
          } else {
            targetPoolsBuilder_.addAllMessages(other.targetPools_);
          }
        }
      }
      if (other.hasWarning()) {
        mergeWarning(other.getWarning());
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
            case 405634274:
              {
                input.readMessage(getWarningFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 405634274
            case -1606386358:
              {
                com.google.cloud.compute.v1.TargetPool m =
                    input.readMessage(
                        com.google.cloud.compute.v1.TargetPool.parser(), extensionRegistry);
                if (targetPoolsBuilder_ == null) {
                  ensureTargetPoolsIsMutable();
                  targetPools_.add(m);
                } else {
                  targetPoolsBuilder_.addMessage(m);
                }
                break;
              } // case -1606386358
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

    private java.util.List<com.google.cloud.compute.v1.TargetPool> targetPools_ =
        java.util.Collections.emptyList();

    private void ensureTargetPoolsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        targetPools_ =
            new java.util.ArrayList<com.google.cloud.compute.v1.TargetPool>(targetPools_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.TargetPool,
            com.google.cloud.compute.v1.TargetPool.Builder,
            com.google.cloud.compute.v1.TargetPoolOrBuilder>
        targetPoolsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of target pools contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.TargetPool> getTargetPoolsList() {
      if (targetPoolsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(targetPools_);
      } else {
        return targetPoolsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * A list of target pools contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
     */
    public int getTargetPoolsCount() {
      if (targetPoolsBuilder_ == null) {
        return targetPools_.size();
      } else {
        return targetPoolsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * A list of target pools contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
     */
    public com.google.cloud.compute.v1.TargetPool getTargetPools(int index) {
      if (targetPoolsBuilder_ == null) {
        return targetPools_.get(index);
      } else {
        return targetPoolsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * A list of target pools contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
     */
    public Builder setTargetPools(int index, com.google.cloud.compute.v1.TargetPool value) {
      if (targetPoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetPoolsIsMutable();
        targetPools_.set(index, value);
        onChanged();
      } else {
        targetPoolsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of target pools contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
     */
    public Builder setTargetPools(
        int index, com.google.cloud.compute.v1.TargetPool.Builder builderForValue) {
      if (targetPoolsBuilder_ == null) {
        ensureTargetPoolsIsMutable();
        targetPools_.set(index, builderForValue.build());
        onChanged();
      } else {
        targetPoolsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of target pools contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
     */
    public Builder addTargetPools(com.google.cloud.compute.v1.TargetPool value) {
      if (targetPoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetPoolsIsMutable();
        targetPools_.add(value);
        onChanged();
      } else {
        targetPoolsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of target pools contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
     */
    public Builder addTargetPools(int index, com.google.cloud.compute.v1.TargetPool value) {
      if (targetPoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetPoolsIsMutable();
        targetPools_.add(index, value);
        onChanged();
      } else {
        targetPoolsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of target pools contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
     */
    public Builder addTargetPools(com.google.cloud.compute.v1.TargetPool.Builder builderForValue) {
      if (targetPoolsBuilder_ == null) {
        ensureTargetPoolsIsMutable();
        targetPools_.add(builderForValue.build());
        onChanged();
      } else {
        targetPoolsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of target pools contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
     */
    public Builder addTargetPools(
        int index, com.google.cloud.compute.v1.TargetPool.Builder builderForValue) {
      if (targetPoolsBuilder_ == null) {
        ensureTargetPoolsIsMutable();
        targetPools_.add(index, builderForValue.build());
        onChanged();
      } else {
        targetPoolsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of target pools contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
     */
    public Builder addAllTargetPools(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.TargetPool> values) {
      if (targetPoolsBuilder_ == null) {
        ensureTargetPoolsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, targetPools_);
        onChanged();
      } else {
        targetPoolsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of target pools contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
     */
    public Builder clearTargetPools() {
      if (targetPoolsBuilder_ == null) {
        targetPools_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        targetPoolsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of target pools contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
     */
    public Builder removeTargetPools(int index) {
      if (targetPoolsBuilder_ == null) {
        ensureTargetPoolsIsMutable();
        targetPools_.remove(index);
        onChanged();
      } else {
        targetPoolsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of target pools contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
     */
    public com.google.cloud.compute.v1.TargetPool.Builder getTargetPoolsBuilder(int index) {
      return getTargetPoolsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * A list of target pools contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
     */
    public com.google.cloud.compute.v1.TargetPoolOrBuilder getTargetPoolsOrBuilder(int index) {
      if (targetPoolsBuilder_ == null) {
        return targetPools_.get(index);
      } else {
        return targetPoolsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * A list of target pools contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.TargetPoolOrBuilder>
        getTargetPoolsOrBuilderList() {
      if (targetPoolsBuilder_ != null) {
        return targetPoolsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(targetPools_);
      }
    }

    /**
     *
     *
     * <pre>
     * A list of target pools contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
     */
    public com.google.cloud.compute.v1.TargetPool.Builder addTargetPoolsBuilder() {
      return getTargetPoolsFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.TargetPool.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * A list of target pools contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
     */
    public com.google.cloud.compute.v1.TargetPool.Builder addTargetPoolsBuilder(int index) {
      return getTargetPoolsFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.TargetPool.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * A list of target pools contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.TargetPool target_pools = 336072617;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.TargetPool.Builder>
        getTargetPoolsBuilderList() {
      return getTargetPoolsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.TargetPool,
            com.google.cloud.compute.v1.TargetPool.Builder,
            com.google.cloud.compute.v1.TargetPoolOrBuilder>
        getTargetPoolsFieldBuilder() {
      if (targetPoolsBuilder_ == null) {
        targetPoolsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.TargetPool,
                com.google.cloud.compute.v1.TargetPool.Builder,
                com.google.cloud.compute.v1.TargetPoolOrBuilder>(
                targetPools_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        targetPools_ = null;
      }
      return targetPoolsBuilder_;
    }

    private com.google.cloud.compute.v1.Warning warning_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Warning,
            com.google.cloud.compute.v1.Warning.Builder,
            com.google.cloud.compute.v1.WarningOrBuilder>
        warningBuilder_;

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of addresses when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     *
     * @return Whether the warning field is set.
     */
    public boolean hasWarning() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of addresses when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     *
     * @return The warning.
     */
    public com.google.cloud.compute.v1.Warning getWarning() {
      if (warningBuilder_ == null) {
        return warning_ == null
            ? com.google.cloud.compute.v1.Warning.getDefaultInstance()
            : warning_;
      } else {
        return warningBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of addresses when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        warning_ = value;
      } else {
        warningBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of addresses when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(com.google.cloud.compute.v1.Warning.Builder builderForValue) {
      if (warningBuilder_ == null) {
        warning_ = builderForValue.build();
      } else {
        warningBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of addresses when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder mergeWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && warning_ != null
            && warning_ != com.google.cloud.compute.v1.Warning.getDefaultInstance()) {
          getWarningBuilder().mergeFrom(value);
        } else {
          warning_ = value;
        }
      } else {
        warningBuilder_.mergeFrom(value);
      }
      if (warning_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of addresses when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder clearWarning() {
      bitField0_ = (bitField0_ & ~0x00000002);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of addresses when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.Warning.Builder getWarningBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getWarningFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of addresses when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
      if (warningBuilder_ != null) {
        return warningBuilder_.getMessageOrBuilder();
      } else {
        return warning_ == null
            ? com.google.cloud.compute.v1.Warning.getDefaultInstance()
            : warning_;
      }
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of addresses when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Warning,
            com.google.cloud.compute.v1.Warning.Builder,
            com.google.cloud.compute.v1.WarningOrBuilder>
        getWarningFieldBuilder() {
      if (warningBuilder_ == null) {
        warningBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.Warning,
                com.google.cloud.compute.v1.Warning.Builder,
                com.google.cloud.compute.v1.WarningOrBuilder>(
                getWarning(), getParentForChildren(), isClean());
        warning_ = null;
      }
      return warningBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.TargetPoolsScopedList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.TargetPoolsScopedList)
  private static final com.google.cloud.compute.v1.TargetPoolsScopedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.TargetPoolsScopedList();
  }

  public static com.google.cloud.compute.v1.TargetPoolsScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetPoolsScopedList> PARSER =
      new com.google.protobuf.AbstractParser<TargetPoolsScopedList>() {
        @java.lang.Override
        public TargetPoolsScopedList parsePartialFrom(
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

  public static com.google.protobuf.Parser<TargetPoolsScopedList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetPoolsScopedList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.TargetPoolsScopedList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
