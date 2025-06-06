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
 * Collection of Kubernetes [node
 * taints](https://kubernetes.io/docs/concepts/configuration/taint-and-toleration).
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.NodeTaints}
 */
public final class NodeTaints extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.NodeTaints)
    NodeTaintsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use NodeTaints.newBuilder() to construct.
  private NodeTaints(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NodeTaints() {
    taints_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NodeTaints();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_NodeTaints_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_NodeTaints_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.NodeTaints.class,
            com.google.container.v1beta1.NodeTaints.Builder.class);
  }

  public static final int TAINTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.container.v1beta1.NodeTaint> taints_;

  /**
   *
   *
   * <pre>
   * List of node taints.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.container.v1beta1.NodeTaint> getTaintsList() {
    return taints_;
  }

  /**
   *
   *
   * <pre>
   * List of node taints.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.container.v1beta1.NodeTaintOrBuilder>
      getTaintsOrBuilderList() {
    return taints_;
  }

  /**
   *
   *
   * <pre>
   * List of node taints.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
   */
  @java.lang.Override
  public int getTaintsCount() {
    return taints_.size();
  }

  /**
   *
   *
   * <pre>
   * List of node taints.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
   */
  @java.lang.Override
  public com.google.container.v1beta1.NodeTaint getTaints(int index) {
    return taints_.get(index);
  }

  /**
   *
   *
   * <pre>
   * List of node taints.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
   */
  @java.lang.Override
  public com.google.container.v1beta1.NodeTaintOrBuilder getTaintsOrBuilder(int index) {
    return taints_.get(index);
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
    for (int i = 0; i < taints_.size(); i++) {
      output.writeMessage(1, taints_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < taints_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, taints_.get(i));
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
    if (!(obj instanceof com.google.container.v1beta1.NodeTaints)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.NodeTaints other = (com.google.container.v1beta1.NodeTaints) obj;

    if (!getTaintsList().equals(other.getTaintsList())) return false;
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
    if (getTaintsCount() > 0) {
      hash = (37 * hash) + TAINTS_FIELD_NUMBER;
      hash = (53 * hash) + getTaintsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.NodeTaints parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.NodeTaints parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.NodeTaints parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.NodeTaints parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.NodeTaints parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.NodeTaints parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.NodeTaints parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.NodeTaints parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.NodeTaints parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.NodeTaints parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.NodeTaints parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.NodeTaints parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.NodeTaints prototype) {
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
   * Collection of Kubernetes [node
   * taints](https://kubernetes.io/docs/concepts/configuration/taint-and-toleration).
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.NodeTaints}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.NodeTaints)
      com.google.container.v1beta1.NodeTaintsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_NodeTaints_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_NodeTaints_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.NodeTaints.class,
              com.google.container.v1beta1.NodeTaints.Builder.class);
    }

    // Construct using com.google.container.v1beta1.NodeTaints.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (taintsBuilder_ == null) {
        taints_ = java.util.Collections.emptyList();
      } else {
        taints_ = null;
        taintsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_NodeTaints_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.NodeTaints getDefaultInstanceForType() {
      return com.google.container.v1beta1.NodeTaints.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.NodeTaints build() {
      com.google.container.v1beta1.NodeTaints result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.NodeTaints buildPartial() {
      com.google.container.v1beta1.NodeTaints result =
          new com.google.container.v1beta1.NodeTaints(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.container.v1beta1.NodeTaints result) {
      if (taintsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          taints_ = java.util.Collections.unmodifiableList(taints_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.taints_ = taints_;
      } else {
        result.taints_ = taintsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.container.v1beta1.NodeTaints result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.container.v1beta1.NodeTaints) {
        return mergeFrom((com.google.container.v1beta1.NodeTaints) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.NodeTaints other) {
      if (other == com.google.container.v1beta1.NodeTaints.getDefaultInstance()) return this;
      if (taintsBuilder_ == null) {
        if (!other.taints_.isEmpty()) {
          if (taints_.isEmpty()) {
            taints_ = other.taints_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTaintsIsMutable();
            taints_.addAll(other.taints_);
          }
          onChanged();
        }
      } else {
        if (!other.taints_.isEmpty()) {
          if (taintsBuilder_.isEmpty()) {
            taintsBuilder_.dispose();
            taintsBuilder_ = null;
            taints_ = other.taints_;
            bitField0_ = (bitField0_ & ~0x00000001);
            taintsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTaintsFieldBuilder()
                    : null;
          } else {
            taintsBuilder_.addAllMessages(other.taints_);
          }
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
                com.google.container.v1beta1.NodeTaint m =
                    input.readMessage(
                        com.google.container.v1beta1.NodeTaint.parser(), extensionRegistry);
                if (taintsBuilder_ == null) {
                  ensureTaintsIsMutable();
                  taints_.add(m);
                } else {
                  taintsBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.container.v1beta1.NodeTaint> taints_ =
        java.util.Collections.emptyList();

    private void ensureTaintsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        taints_ = new java.util.ArrayList<com.google.container.v1beta1.NodeTaint>(taints_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.container.v1beta1.NodeTaint,
            com.google.container.v1beta1.NodeTaint.Builder,
            com.google.container.v1beta1.NodeTaintOrBuilder>
        taintsBuilder_;

    /**
     *
     *
     * <pre>
     * List of node taints.
     * </pre>
     *
     * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
     */
    public java.util.List<com.google.container.v1beta1.NodeTaint> getTaintsList() {
      if (taintsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(taints_);
      } else {
        return taintsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * List of node taints.
     * </pre>
     *
     * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
     */
    public int getTaintsCount() {
      if (taintsBuilder_ == null) {
        return taints_.size();
      } else {
        return taintsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * List of node taints.
     * </pre>
     *
     * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
     */
    public com.google.container.v1beta1.NodeTaint getTaints(int index) {
      if (taintsBuilder_ == null) {
        return taints_.get(index);
      } else {
        return taintsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * List of node taints.
     * </pre>
     *
     * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
     */
    public Builder setTaints(int index, com.google.container.v1beta1.NodeTaint value) {
      if (taintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTaintsIsMutable();
        taints_.set(index, value);
        onChanged();
      } else {
        taintsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of node taints.
     * </pre>
     *
     * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
     */
    public Builder setTaints(
        int index, com.google.container.v1beta1.NodeTaint.Builder builderForValue) {
      if (taintsBuilder_ == null) {
        ensureTaintsIsMutable();
        taints_.set(index, builderForValue.build());
        onChanged();
      } else {
        taintsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of node taints.
     * </pre>
     *
     * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
     */
    public Builder addTaints(com.google.container.v1beta1.NodeTaint value) {
      if (taintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTaintsIsMutable();
        taints_.add(value);
        onChanged();
      } else {
        taintsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of node taints.
     * </pre>
     *
     * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
     */
    public Builder addTaints(int index, com.google.container.v1beta1.NodeTaint value) {
      if (taintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTaintsIsMutable();
        taints_.add(index, value);
        onChanged();
      } else {
        taintsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of node taints.
     * </pre>
     *
     * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
     */
    public Builder addTaints(com.google.container.v1beta1.NodeTaint.Builder builderForValue) {
      if (taintsBuilder_ == null) {
        ensureTaintsIsMutable();
        taints_.add(builderForValue.build());
        onChanged();
      } else {
        taintsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of node taints.
     * </pre>
     *
     * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
     */
    public Builder addTaints(
        int index, com.google.container.v1beta1.NodeTaint.Builder builderForValue) {
      if (taintsBuilder_ == null) {
        ensureTaintsIsMutable();
        taints_.add(index, builderForValue.build());
        onChanged();
      } else {
        taintsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of node taints.
     * </pre>
     *
     * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
     */
    public Builder addAllTaints(
        java.lang.Iterable<? extends com.google.container.v1beta1.NodeTaint> values) {
      if (taintsBuilder_ == null) {
        ensureTaintsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, taints_);
        onChanged();
      } else {
        taintsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of node taints.
     * </pre>
     *
     * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
     */
    public Builder clearTaints() {
      if (taintsBuilder_ == null) {
        taints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        taintsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of node taints.
     * </pre>
     *
     * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
     */
    public Builder removeTaints(int index) {
      if (taintsBuilder_ == null) {
        ensureTaintsIsMutable();
        taints_.remove(index);
        onChanged();
      } else {
        taintsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of node taints.
     * </pre>
     *
     * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
     */
    public com.google.container.v1beta1.NodeTaint.Builder getTaintsBuilder(int index) {
      return getTaintsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * List of node taints.
     * </pre>
     *
     * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
     */
    public com.google.container.v1beta1.NodeTaintOrBuilder getTaintsOrBuilder(int index) {
      if (taintsBuilder_ == null) {
        return taints_.get(index);
      } else {
        return taintsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * List of node taints.
     * </pre>
     *
     * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
     */
    public java.util.List<? extends com.google.container.v1beta1.NodeTaintOrBuilder>
        getTaintsOrBuilderList() {
      if (taintsBuilder_ != null) {
        return taintsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(taints_);
      }
    }

    /**
     *
     *
     * <pre>
     * List of node taints.
     * </pre>
     *
     * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
     */
    public com.google.container.v1beta1.NodeTaint.Builder addTaintsBuilder() {
      return getTaintsFieldBuilder()
          .addBuilder(com.google.container.v1beta1.NodeTaint.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * List of node taints.
     * </pre>
     *
     * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
     */
    public com.google.container.v1beta1.NodeTaint.Builder addTaintsBuilder(int index) {
      return getTaintsFieldBuilder()
          .addBuilder(index, com.google.container.v1beta1.NodeTaint.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * List of node taints.
     * </pre>
     *
     * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
     */
    public java.util.List<com.google.container.v1beta1.NodeTaint.Builder> getTaintsBuilderList() {
      return getTaintsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.container.v1beta1.NodeTaint,
            com.google.container.v1beta1.NodeTaint.Builder,
            com.google.container.v1beta1.NodeTaintOrBuilder>
        getTaintsFieldBuilder() {
      if (taintsBuilder_ == null) {
        taintsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.container.v1beta1.NodeTaint,
                com.google.container.v1beta1.NodeTaint.Builder,
                com.google.container.v1beta1.NodeTaintOrBuilder>(
                taints_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        taints_ = null;
      }
      return taintsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.NodeTaints)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.NodeTaints)
  private static final com.google.container.v1beta1.NodeTaints DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.NodeTaints();
  }

  public static com.google.container.v1beta1.NodeTaints getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeTaints> PARSER =
      new com.google.protobuf.AbstractParser<NodeTaints>() {
        @java.lang.Override
        public NodeTaints parsePartialFrom(
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

  public static com.google.protobuf.Parser<NodeTaints> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeTaints> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.NodeTaints getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
