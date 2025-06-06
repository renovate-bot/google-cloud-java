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
 * Protobuf type {@code google.cloud.compute.v1.AutoscalersScopedList}
 */
public final class AutoscalersScopedList extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.AutoscalersScopedList)
    AutoscalersScopedListOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use AutoscalersScopedList.newBuilder() to construct.
  private AutoscalersScopedList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AutoscalersScopedList() {
    autoscalers_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AutoscalersScopedList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_AutoscalersScopedList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_AutoscalersScopedList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.AutoscalersScopedList.class,
            com.google.cloud.compute.v1.AutoscalersScopedList.Builder.class);
  }

  private int bitField0_;
  public static final int AUTOSCALERS_FIELD_NUMBER = 465771644;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.Autoscaler> autoscalers_;

  /**
   *
   *
   * <pre>
   * [Output Only] A list of autoscalers contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.Autoscaler> getAutoscalersList() {
    return autoscalers_;
  }

  /**
   *
   *
   * <pre>
   * [Output Only] A list of autoscalers contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.AutoscalerOrBuilder>
      getAutoscalersOrBuilderList() {
    return autoscalers_;
  }

  /**
   *
   *
   * <pre>
   * [Output Only] A list of autoscalers contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
   */
  @java.lang.Override
  public int getAutoscalersCount() {
    return autoscalers_.size();
  }

  /**
   *
   *
   * <pre>
   * [Output Only] A list of autoscalers contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Autoscaler getAutoscalers(int index) {
    return autoscalers_.get(index);
  }

  /**
   *
   *
   * <pre>
   * [Output Only] A list of autoscalers contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.AutoscalerOrBuilder getAutoscalersOrBuilder(int index) {
    return autoscalers_.get(index);
  }

  public static final int WARNING_FIELD_NUMBER = 50704284;
  private com.google.cloud.compute.v1.Warning warning_;

  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning which replaces the list of autoscalers when the list is empty.
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
   * [Output Only] Informational warning which replaces the list of autoscalers when the list is empty.
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
   * [Output Only] Informational warning which replaces the list of autoscalers when the list is empty.
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
    for (int i = 0; i < autoscalers_.size(); i++) {
      output.writeMessage(465771644, autoscalers_.get(i));
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
    for (int i = 0; i < autoscalers_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(465771644, autoscalers_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.AutoscalersScopedList)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.AutoscalersScopedList other =
        (com.google.cloud.compute.v1.AutoscalersScopedList) obj;

    if (!getAutoscalersList().equals(other.getAutoscalersList())) return false;
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
    if (getAutoscalersCount() > 0) {
      hash = (37 * hash) + AUTOSCALERS_FIELD_NUMBER;
      hash = (53 * hash) + getAutoscalersList().hashCode();
    }
    if (hasWarning()) {
      hash = (37 * hash) + WARNING_FIELD_NUMBER;
      hash = (53 * hash) + getWarning().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.AutoscalersScopedList parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AutoscalersScopedList parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AutoscalersScopedList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AutoscalersScopedList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AutoscalersScopedList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AutoscalersScopedList parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AutoscalersScopedList parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AutoscalersScopedList parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AutoscalersScopedList parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AutoscalersScopedList parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AutoscalersScopedList parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AutoscalersScopedList parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.AutoscalersScopedList prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.AutoscalersScopedList}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.AutoscalersScopedList)
      com.google.cloud.compute.v1.AutoscalersScopedListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AutoscalersScopedList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AutoscalersScopedList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.AutoscalersScopedList.class,
              com.google.cloud.compute.v1.AutoscalersScopedList.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.AutoscalersScopedList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAutoscalersFieldBuilder();
        getWarningFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (autoscalersBuilder_ == null) {
        autoscalers_ = java.util.Collections.emptyList();
      } else {
        autoscalers_ = null;
        autoscalersBuilder_.clear();
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
          .internal_static_google_cloud_compute_v1_AutoscalersScopedList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AutoscalersScopedList getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.AutoscalersScopedList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AutoscalersScopedList build() {
      com.google.cloud.compute.v1.AutoscalersScopedList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AutoscalersScopedList buildPartial() {
      com.google.cloud.compute.v1.AutoscalersScopedList result =
          new com.google.cloud.compute.v1.AutoscalersScopedList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.compute.v1.AutoscalersScopedList result) {
      if (autoscalersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          autoscalers_ = java.util.Collections.unmodifiableList(autoscalers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.autoscalers_ = autoscalers_;
      } else {
        result.autoscalers_ = autoscalersBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.AutoscalersScopedList result) {
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
      if (other instanceof com.google.cloud.compute.v1.AutoscalersScopedList) {
        return mergeFrom((com.google.cloud.compute.v1.AutoscalersScopedList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.AutoscalersScopedList other) {
      if (other == com.google.cloud.compute.v1.AutoscalersScopedList.getDefaultInstance())
        return this;
      if (autoscalersBuilder_ == null) {
        if (!other.autoscalers_.isEmpty()) {
          if (autoscalers_.isEmpty()) {
            autoscalers_ = other.autoscalers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAutoscalersIsMutable();
            autoscalers_.addAll(other.autoscalers_);
          }
          onChanged();
        }
      } else {
        if (!other.autoscalers_.isEmpty()) {
          if (autoscalersBuilder_.isEmpty()) {
            autoscalersBuilder_.dispose();
            autoscalersBuilder_ = null;
            autoscalers_ = other.autoscalers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            autoscalersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAutoscalersFieldBuilder()
                    : null;
          } else {
            autoscalersBuilder_.addAllMessages(other.autoscalers_);
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
            case -568794142:
              {
                com.google.cloud.compute.v1.Autoscaler m =
                    input.readMessage(
                        com.google.cloud.compute.v1.Autoscaler.parser(), extensionRegistry);
                if (autoscalersBuilder_ == null) {
                  ensureAutoscalersIsMutable();
                  autoscalers_.add(m);
                } else {
                  autoscalersBuilder_.addMessage(m);
                }
                break;
              } // case -568794142
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

    private java.util.List<com.google.cloud.compute.v1.Autoscaler> autoscalers_ =
        java.util.Collections.emptyList();

    private void ensureAutoscalersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        autoscalers_ =
            new java.util.ArrayList<com.google.cloud.compute.v1.Autoscaler>(autoscalers_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.Autoscaler,
            com.google.cloud.compute.v1.Autoscaler.Builder,
            com.google.cloud.compute.v1.AutoscalerOrBuilder>
        autoscalersBuilder_;

    /**
     *
     *
     * <pre>
     * [Output Only] A list of autoscalers contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.Autoscaler> getAutoscalersList() {
      if (autoscalersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(autoscalers_);
      } else {
        return autoscalersBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * [Output Only] A list of autoscalers contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
     */
    public int getAutoscalersCount() {
      if (autoscalersBuilder_ == null) {
        return autoscalers_.size();
      } else {
        return autoscalersBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * [Output Only] A list of autoscalers contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
     */
    public com.google.cloud.compute.v1.Autoscaler getAutoscalers(int index) {
      if (autoscalersBuilder_ == null) {
        return autoscalers_.get(index);
      } else {
        return autoscalersBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * [Output Only] A list of autoscalers contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
     */
    public Builder setAutoscalers(int index, com.google.cloud.compute.v1.Autoscaler value) {
      if (autoscalersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAutoscalersIsMutable();
        autoscalers_.set(index, value);
        onChanged();
      } else {
        autoscalersBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] A list of autoscalers contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
     */
    public Builder setAutoscalers(
        int index, com.google.cloud.compute.v1.Autoscaler.Builder builderForValue) {
      if (autoscalersBuilder_ == null) {
        ensureAutoscalersIsMutable();
        autoscalers_.set(index, builderForValue.build());
        onChanged();
      } else {
        autoscalersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] A list of autoscalers contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
     */
    public Builder addAutoscalers(com.google.cloud.compute.v1.Autoscaler value) {
      if (autoscalersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAutoscalersIsMutable();
        autoscalers_.add(value);
        onChanged();
      } else {
        autoscalersBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] A list of autoscalers contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
     */
    public Builder addAutoscalers(int index, com.google.cloud.compute.v1.Autoscaler value) {
      if (autoscalersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAutoscalersIsMutable();
        autoscalers_.add(index, value);
        onChanged();
      } else {
        autoscalersBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] A list of autoscalers contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
     */
    public Builder addAutoscalers(com.google.cloud.compute.v1.Autoscaler.Builder builderForValue) {
      if (autoscalersBuilder_ == null) {
        ensureAutoscalersIsMutable();
        autoscalers_.add(builderForValue.build());
        onChanged();
      } else {
        autoscalersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] A list of autoscalers contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
     */
    public Builder addAutoscalers(
        int index, com.google.cloud.compute.v1.Autoscaler.Builder builderForValue) {
      if (autoscalersBuilder_ == null) {
        ensureAutoscalersIsMutable();
        autoscalers_.add(index, builderForValue.build());
        onChanged();
      } else {
        autoscalersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] A list of autoscalers contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
     */
    public Builder addAllAutoscalers(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.Autoscaler> values) {
      if (autoscalersBuilder_ == null) {
        ensureAutoscalersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, autoscalers_);
        onChanged();
      } else {
        autoscalersBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] A list of autoscalers contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
     */
    public Builder clearAutoscalers() {
      if (autoscalersBuilder_ == null) {
        autoscalers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        autoscalersBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] A list of autoscalers contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
     */
    public Builder removeAutoscalers(int index) {
      if (autoscalersBuilder_ == null) {
        ensureAutoscalersIsMutable();
        autoscalers_.remove(index);
        onChanged();
      } else {
        autoscalersBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] A list of autoscalers contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
     */
    public com.google.cloud.compute.v1.Autoscaler.Builder getAutoscalersBuilder(int index) {
      return getAutoscalersFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * [Output Only] A list of autoscalers contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
     */
    public com.google.cloud.compute.v1.AutoscalerOrBuilder getAutoscalersOrBuilder(int index) {
      if (autoscalersBuilder_ == null) {
        return autoscalers_.get(index);
      } else {
        return autoscalersBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * [Output Only] A list of autoscalers contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.AutoscalerOrBuilder>
        getAutoscalersOrBuilderList() {
      if (autoscalersBuilder_ != null) {
        return autoscalersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(autoscalers_);
      }
    }

    /**
     *
     *
     * <pre>
     * [Output Only] A list of autoscalers contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
     */
    public com.google.cloud.compute.v1.Autoscaler.Builder addAutoscalersBuilder() {
      return getAutoscalersFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.Autoscaler.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * [Output Only] A list of autoscalers contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
     */
    public com.google.cloud.compute.v1.Autoscaler.Builder addAutoscalersBuilder(int index) {
      return getAutoscalersFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.Autoscaler.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * [Output Only] A list of autoscalers contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Autoscaler autoscalers = 465771644;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.Autoscaler.Builder>
        getAutoscalersBuilderList() {
      return getAutoscalersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.Autoscaler,
            com.google.cloud.compute.v1.Autoscaler.Builder,
            com.google.cloud.compute.v1.AutoscalerOrBuilder>
        getAutoscalersFieldBuilder() {
      if (autoscalersBuilder_ == null) {
        autoscalersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.Autoscaler,
                com.google.cloud.compute.v1.Autoscaler.Builder,
                com.google.cloud.compute.v1.AutoscalerOrBuilder>(
                autoscalers_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        autoscalers_ = null;
      }
      return autoscalersBuilder_;
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
     * [Output Only] Informational warning which replaces the list of autoscalers when the list is empty.
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
     * [Output Only] Informational warning which replaces the list of autoscalers when the list is empty.
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
     * [Output Only] Informational warning which replaces the list of autoscalers when the list is empty.
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
     * [Output Only] Informational warning which replaces the list of autoscalers when the list is empty.
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
     * [Output Only] Informational warning which replaces the list of autoscalers when the list is empty.
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
     * [Output Only] Informational warning which replaces the list of autoscalers when the list is empty.
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
     * [Output Only] Informational warning which replaces the list of autoscalers when the list is empty.
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
     * [Output Only] Informational warning which replaces the list of autoscalers when the list is empty.
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
     * [Output Only] Informational warning which replaces the list of autoscalers when the list is empty.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.AutoscalersScopedList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.AutoscalersScopedList)
  private static final com.google.cloud.compute.v1.AutoscalersScopedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.AutoscalersScopedList();
  }

  public static com.google.cloud.compute.v1.AutoscalersScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoscalersScopedList> PARSER =
      new com.google.protobuf.AbstractParser<AutoscalersScopedList>() {
        @java.lang.Override
        public AutoscalersScopedList parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutoscalersScopedList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoscalersScopedList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.AutoscalersScopedList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
