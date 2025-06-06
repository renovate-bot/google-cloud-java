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
 * Protobuf type {@code google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest}
 */
public final class TargetPoolsAddHealthCheckRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest)
    TargetPoolsAddHealthCheckRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use TargetPoolsAddHealthCheckRequest.newBuilder() to construct.
  private TargetPoolsAddHealthCheckRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TargetPoolsAddHealthCheckRequest() {
    healthChecks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TargetPoolsAddHealthCheckRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_TargetPoolsAddHealthCheckRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_TargetPoolsAddHealthCheckRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest.class,
            com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest.Builder.class);
  }

  public static final int HEALTH_CHECKS_FIELD_NUMBER = 448370606;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.HealthCheckReference> healthChecks_;

  /**
   *
   *
   * <pre>
   * The HttpHealthCheck to add to the target pool.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.HealthCheckReference> getHealthChecksList() {
    return healthChecks_;
  }

  /**
   *
   *
   * <pre>
   * The HttpHealthCheck to add to the target pool.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.HealthCheckReferenceOrBuilder>
      getHealthChecksOrBuilderList() {
    return healthChecks_;
  }

  /**
   *
   *
   * <pre>
   * The HttpHealthCheck to add to the target pool.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;</code>
   */
  @java.lang.Override
  public int getHealthChecksCount() {
    return healthChecks_.size();
  }

  /**
   *
   *
   * <pre>
   * The HttpHealthCheck to add to the target pool.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.HealthCheckReference getHealthChecks(int index) {
    return healthChecks_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The HttpHealthCheck to add to the target pool.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.HealthCheckReferenceOrBuilder getHealthChecksOrBuilder(
      int index) {
    return healthChecks_.get(index);
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
    for (int i = 0; i < healthChecks_.size(); i++) {
      output.writeMessage(448370606, healthChecks_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < healthChecks_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(448370606, healthChecks_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest other =
        (com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest) obj;

    if (!getHealthChecksList().equals(other.getHealthChecksList())) return false;
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
    if (getHealthChecksCount() > 0) {
      hash = (37 * hash) + HEALTH_CHECKS_FIELD_NUMBER;
      hash = (53 * hash) + getHealthChecksList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest parseFrom(
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
      com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest)
      com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_TargetPoolsAddHealthCheckRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_TargetPoolsAddHealthCheckRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest.class,
              com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (healthChecksBuilder_ == null) {
        healthChecks_ = java.util.Collections.emptyList();
      } else {
        healthChecks_ = null;
        healthChecksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_TargetPoolsAddHealthCheckRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest build() {
      com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest buildPartial() {
      com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest result =
          new com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest result) {
      if (healthChecksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          healthChecks_ = java.util.Collections.unmodifiableList(healthChecks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.healthChecks_ = healthChecks_;
      } else {
        result.healthChecks_ = healthChecksBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest result) {
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
      if (other instanceof com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest) {
        return mergeFrom((com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest other) {
      if (other
          == com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest.getDefaultInstance())
        return this;
      if (healthChecksBuilder_ == null) {
        if (!other.healthChecks_.isEmpty()) {
          if (healthChecks_.isEmpty()) {
            healthChecks_ = other.healthChecks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHealthChecksIsMutable();
            healthChecks_.addAll(other.healthChecks_);
          }
          onChanged();
        }
      } else {
        if (!other.healthChecks_.isEmpty()) {
          if (healthChecksBuilder_.isEmpty()) {
            healthChecksBuilder_.dispose();
            healthChecksBuilder_ = null;
            healthChecks_ = other.healthChecks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            healthChecksBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getHealthChecksFieldBuilder()
                    : null;
          } else {
            healthChecksBuilder_.addAllMessages(other.healthChecks_);
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
            case -708002446:
              {
                com.google.cloud.compute.v1.HealthCheckReference m =
                    input.readMessage(
                        com.google.cloud.compute.v1.HealthCheckReference.parser(),
                        extensionRegistry);
                if (healthChecksBuilder_ == null) {
                  ensureHealthChecksIsMutable();
                  healthChecks_.add(m);
                } else {
                  healthChecksBuilder_.addMessage(m);
                }
                break;
              } // case -708002446
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

    private java.util.List<com.google.cloud.compute.v1.HealthCheckReference> healthChecks_ =
        java.util.Collections.emptyList();

    private void ensureHealthChecksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        healthChecks_ =
            new java.util.ArrayList<com.google.cloud.compute.v1.HealthCheckReference>(
                healthChecks_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.HealthCheckReference,
            com.google.cloud.compute.v1.HealthCheckReference.Builder,
            com.google.cloud.compute.v1.HealthCheckReferenceOrBuilder>
        healthChecksBuilder_;

    /**
     *
     *
     * <pre>
     * The HttpHealthCheck to add to the target pool.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;
     * </code>
     */
    public java.util.List<com.google.cloud.compute.v1.HealthCheckReference> getHealthChecksList() {
      if (healthChecksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(healthChecks_);
      } else {
        return healthChecksBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The HttpHealthCheck to add to the target pool.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;
     * </code>
     */
    public int getHealthChecksCount() {
      if (healthChecksBuilder_ == null) {
        return healthChecks_.size();
      } else {
        return healthChecksBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The HttpHealthCheck to add to the target pool.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;
     * </code>
     */
    public com.google.cloud.compute.v1.HealthCheckReference getHealthChecks(int index) {
      if (healthChecksBuilder_ == null) {
        return healthChecks_.get(index);
      } else {
        return healthChecksBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The HttpHealthCheck to add to the target pool.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;
     * </code>
     */
    public Builder setHealthChecks(
        int index, com.google.cloud.compute.v1.HealthCheckReference value) {
      if (healthChecksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHealthChecksIsMutable();
        healthChecks_.set(index, value);
        onChanged();
      } else {
        healthChecksBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The HttpHealthCheck to add to the target pool.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;
     * </code>
     */
    public Builder setHealthChecks(
        int index, com.google.cloud.compute.v1.HealthCheckReference.Builder builderForValue) {
      if (healthChecksBuilder_ == null) {
        ensureHealthChecksIsMutable();
        healthChecks_.set(index, builderForValue.build());
        onChanged();
      } else {
        healthChecksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The HttpHealthCheck to add to the target pool.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;
     * </code>
     */
    public Builder addHealthChecks(com.google.cloud.compute.v1.HealthCheckReference value) {
      if (healthChecksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHealthChecksIsMutable();
        healthChecks_.add(value);
        onChanged();
      } else {
        healthChecksBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The HttpHealthCheck to add to the target pool.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;
     * </code>
     */
    public Builder addHealthChecks(
        int index, com.google.cloud.compute.v1.HealthCheckReference value) {
      if (healthChecksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHealthChecksIsMutable();
        healthChecks_.add(index, value);
        onChanged();
      } else {
        healthChecksBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The HttpHealthCheck to add to the target pool.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;
     * </code>
     */
    public Builder addHealthChecks(
        com.google.cloud.compute.v1.HealthCheckReference.Builder builderForValue) {
      if (healthChecksBuilder_ == null) {
        ensureHealthChecksIsMutable();
        healthChecks_.add(builderForValue.build());
        onChanged();
      } else {
        healthChecksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The HttpHealthCheck to add to the target pool.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;
     * </code>
     */
    public Builder addHealthChecks(
        int index, com.google.cloud.compute.v1.HealthCheckReference.Builder builderForValue) {
      if (healthChecksBuilder_ == null) {
        ensureHealthChecksIsMutable();
        healthChecks_.add(index, builderForValue.build());
        onChanged();
      } else {
        healthChecksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The HttpHealthCheck to add to the target pool.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;
     * </code>
     */
    public Builder addAllHealthChecks(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.HealthCheckReference> values) {
      if (healthChecksBuilder_ == null) {
        ensureHealthChecksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, healthChecks_);
        onChanged();
      } else {
        healthChecksBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The HttpHealthCheck to add to the target pool.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;
     * </code>
     */
    public Builder clearHealthChecks() {
      if (healthChecksBuilder_ == null) {
        healthChecks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        healthChecksBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The HttpHealthCheck to add to the target pool.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;
     * </code>
     */
    public Builder removeHealthChecks(int index) {
      if (healthChecksBuilder_ == null) {
        ensureHealthChecksIsMutable();
        healthChecks_.remove(index);
        onChanged();
      } else {
        healthChecksBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The HttpHealthCheck to add to the target pool.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;
     * </code>
     */
    public com.google.cloud.compute.v1.HealthCheckReference.Builder getHealthChecksBuilder(
        int index) {
      return getHealthChecksFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The HttpHealthCheck to add to the target pool.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;
     * </code>
     */
    public com.google.cloud.compute.v1.HealthCheckReferenceOrBuilder getHealthChecksOrBuilder(
        int index) {
      if (healthChecksBuilder_ == null) {
        return healthChecks_.get(index);
      } else {
        return healthChecksBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The HttpHealthCheck to add to the target pool.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;
     * </code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.HealthCheckReferenceOrBuilder>
        getHealthChecksOrBuilderList() {
      if (healthChecksBuilder_ != null) {
        return healthChecksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(healthChecks_);
      }
    }

    /**
     *
     *
     * <pre>
     * The HttpHealthCheck to add to the target pool.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;
     * </code>
     */
    public com.google.cloud.compute.v1.HealthCheckReference.Builder addHealthChecksBuilder() {
      return getHealthChecksFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.HealthCheckReference.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The HttpHealthCheck to add to the target pool.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;
     * </code>
     */
    public com.google.cloud.compute.v1.HealthCheckReference.Builder addHealthChecksBuilder(
        int index) {
      return getHealthChecksFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.HealthCheckReference.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The HttpHealthCheck to add to the target pool.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;
     * </code>
     */
    public java.util.List<com.google.cloud.compute.v1.HealthCheckReference.Builder>
        getHealthChecksBuilderList() {
      return getHealthChecksFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.HealthCheckReference,
            com.google.cloud.compute.v1.HealthCheckReference.Builder,
            com.google.cloud.compute.v1.HealthCheckReferenceOrBuilder>
        getHealthChecksFieldBuilder() {
      if (healthChecksBuilder_ == null) {
        healthChecksBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.HealthCheckReference,
                com.google.cloud.compute.v1.HealthCheckReference.Builder,
                com.google.cloud.compute.v1.HealthCheckReferenceOrBuilder>(
                healthChecks_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        healthChecks_ = null;
      }
      return healthChecksBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest)
  private static final com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest();
  }

  public static com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetPoolsAddHealthCheckRequest> PARSER =
      new com.google.protobuf.AbstractParser<TargetPoolsAddHealthCheckRequest>() {
        @java.lang.Override
        public TargetPoolsAddHealthCheckRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<TargetPoolsAddHealthCheckRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetPoolsAddHealthCheckRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
