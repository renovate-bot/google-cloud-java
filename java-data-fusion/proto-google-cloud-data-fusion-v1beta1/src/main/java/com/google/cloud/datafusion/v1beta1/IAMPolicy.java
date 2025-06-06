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
// source: google/cloud/datafusion/v1beta1/v1beta1.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datafusion.v1beta1;

/**
 *
 *
 * <pre>
 * IAMPolicy encapsulates the IAM policy name, definition and status of
 * policy fetching.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datafusion.v1beta1.IAMPolicy}
 */
public final class IAMPolicy extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datafusion.v1beta1.IAMPolicy)
    IAMPolicyOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use IAMPolicy.newBuilder() to construct.
  private IAMPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IAMPolicy() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IAMPolicy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datafusion.v1beta1.V1Beta1
        .internal_static_google_cloud_datafusion_v1beta1_IAMPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datafusion.v1beta1.V1Beta1
        .internal_static_google_cloud_datafusion_v1beta1_IAMPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datafusion.v1beta1.IAMPolicy.class,
            com.google.cloud.datafusion.v1beta1.IAMPolicy.Builder.class);
  }

  private int bitField0_;
  public static final int POLICY_FIELD_NUMBER = 1;
  private com.google.iam.v1.Policy policy_;

  /**
   *
   *
   * <pre>
   * Policy definition if IAM policy fetching is successful,
   * otherwise empty.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 1;</code>
   *
   * @return Whether the policy field is set.
   */
  @java.lang.Override
  public boolean hasPolicy() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Policy definition if IAM policy fetching is successful,
   * otherwise empty.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 1;</code>
   *
   * @return The policy.
   */
  @java.lang.Override
  public com.google.iam.v1.Policy getPolicy() {
    return policy_ == null ? com.google.iam.v1.Policy.getDefaultInstance() : policy_;
  }

  /**
   *
   *
   * <pre>
   * Policy definition if IAM policy fetching is successful,
   * otherwise empty.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 1;</code>
   */
  @java.lang.Override
  public com.google.iam.v1.PolicyOrBuilder getPolicyOrBuilder() {
    return policy_ == null ? com.google.iam.v1.Policy.getDefaultInstance() : policy_;
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private com.google.rpc.Status status_;

  /**
   *
   *
   * <pre>
   * Status of iam policy fetching.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   *
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Status of iam policy fetching.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   *
   * @return The status.
   */
  @java.lang.Override
  public com.google.rpc.Status getStatus() {
    return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
  }

  /**
   *
   *
   * <pre>
   * Status of iam policy fetching.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
    return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
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
      output.writeMessage(1, getPolicy());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getStatus());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getPolicy());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getStatus());
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
    if (!(obj instanceof com.google.cloud.datafusion.v1beta1.IAMPolicy)) {
      return super.equals(obj);
    }
    com.google.cloud.datafusion.v1beta1.IAMPolicy other =
        (com.google.cloud.datafusion.v1beta1.IAMPolicy) obj;

    if (hasPolicy() != other.hasPolicy()) return false;
    if (hasPolicy()) {
      if (!getPolicy().equals(other.getPolicy())) return false;
    }
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus().equals(other.getStatus())) return false;
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
    if (hasPolicy()) {
      hash = (37 * hash) + POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getPolicy().hashCode();
    }
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datafusion.v1beta1.IAMPolicy parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datafusion.v1beta1.IAMPolicy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.IAMPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datafusion.v1beta1.IAMPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.IAMPolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datafusion.v1beta1.IAMPolicy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.IAMPolicy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1beta1.IAMPolicy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.IAMPolicy parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1beta1.IAMPolicy parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.IAMPolicy parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1beta1.IAMPolicy parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datafusion.v1beta1.IAMPolicy prototype) {
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
   * IAMPolicy encapsulates the IAM policy name, definition and status of
   * policy fetching.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datafusion.v1beta1.IAMPolicy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datafusion.v1beta1.IAMPolicy)
      com.google.cloud.datafusion.v1beta1.IAMPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datafusion.v1beta1.V1Beta1
          .internal_static_google_cloud_datafusion_v1beta1_IAMPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datafusion.v1beta1.V1Beta1
          .internal_static_google_cloud_datafusion_v1beta1_IAMPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datafusion.v1beta1.IAMPolicy.class,
              com.google.cloud.datafusion.v1beta1.IAMPolicy.Builder.class);
    }

    // Construct using com.google.cloud.datafusion.v1beta1.IAMPolicy.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPolicyFieldBuilder();
        getStatusFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      policy_ = null;
      if (policyBuilder_ != null) {
        policyBuilder_.dispose();
        policyBuilder_ = null;
      }
      status_ = null;
      if (statusBuilder_ != null) {
        statusBuilder_.dispose();
        statusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datafusion.v1beta1.V1Beta1
          .internal_static_google_cloud_datafusion_v1beta1_IAMPolicy_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1beta1.IAMPolicy getDefaultInstanceForType() {
      return com.google.cloud.datafusion.v1beta1.IAMPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1beta1.IAMPolicy build() {
      com.google.cloud.datafusion.v1beta1.IAMPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1beta1.IAMPolicy buildPartial() {
      com.google.cloud.datafusion.v1beta1.IAMPolicy result =
          new com.google.cloud.datafusion.v1beta1.IAMPolicy(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datafusion.v1beta1.IAMPolicy result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.policy_ = policyBuilder_ == null ? policy_ : policyBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.status_ = statusBuilder_ == null ? status_ : statusBuilder_.build();
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
      if (other instanceof com.google.cloud.datafusion.v1beta1.IAMPolicy) {
        return mergeFrom((com.google.cloud.datafusion.v1beta1.IAMPolicy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datafusion.v1beta1.IAMPolicy other) {
      if (other == com.google.cloud.datafusion.v1beta1.IAMPolicy.getDefaultInstance()) return this;
      if (other.hasPolicy()) {
        mergePolicy(other.getPolicy());
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
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
                input.readMessage(getPolicyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getStatusFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.iam.v1.Policy policy_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.v1.Policy,
            com.google.iam.v1.Policy.Builder,
            com.google.iam.v1.PolicyOrBuilder>
        policyBuilder_;

    /**
     *
     *
     * <pre>
     * Policy definition if IAM policy fetching is successful,
     * otherwise empty.
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 1;</code>
     *
     * @return Whether the policy field is set.
     */
    public boolean hasPolicy() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Policy definition if IAM policy fetching is successful,
     * otherwise empty.
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 1;</code>
     *
     * @return The policy.
     */
    public com.google.iam.v1.Policy getPolicy() {
      if (policyBuilder_ == null) {
        return policy_ == null ? com.google.iam.v1.Policy.getDefaultInstance() : policy_;
      } else {
        return policyBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Policy definition if IAM policy fetching is successful,
     * otherwise empty.
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 1;</code>
     */
    public Builder setPolicy(com.google.iam.v1.Policy value) {
      if (policyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policy_ = value;
      } else {
        policyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Policy definition if IAM policy fetching is successful,
     * otherwise empty.
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 1;</code>
     */
    public Builder setPolicy(com.google.iam.v1.Policy.Builder builderForValue) {
      if (policyBuilder_ == null) {
        policy_ = builderForValue.build();
      } else {
        policyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Policy definition if IAM policy fetching is successful,
     * otherwise empty.
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 1;</code>
     */
    public Builder mergePolicy(com.google.iam.v1.Policy value) {
      if (policyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && policy_ != null
            && policy_ != com.google.iam.v1.Policy.getDefaultInstance()) {
          getPolicyBuilder().mergeFrom(value);
        } else {
          policy_ = value;
        }
      } else {
        policyBuilder_.mergeFrom(value);
      }
      if (policy_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Policy definition if IAM policy fetching is successful,
     * otherwise empty.
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 1;</code>
     */
    public Builder clearPolicy() {
      bitField0_ = (bitField0_ & ~0x00000001);
      policy_ = null;
      if (policyBuilder_ != null) {
        policyBuilder_.dispose();
        policyBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Policy definition if IAM policy fetching is successful,
     * otherwise empty.
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 1;</code>
     */
    public com.google.iam.v1.Policy.Builder getPolicyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPolicyFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Policy definition if IAM policy fetching is successful,
     * otherwise empty.
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 1;</code>
     */
    public com.google.iam.v1.PolicyOrBuilder getPolicyOrBuilder() {
      if (policyBuilder_ != null) {
        return policyBuilder_.getMessageOrBuilder();
      } else {
        return policy_ == null ? com.google.iam.v1.Policy.getDefaultInstance() : policy_;
      }
    }

    /**
     *
     *
     * <pre>
     * Policy definition if IAM policy fetching is successful,
     * otherwise empty.
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.v1.Policy,
            com.google.iam.v1.Policy.Builder,
            com.google.iam.v1.PolicyOrBuilder>
        getPolicyFieldBuilder() {
      if (policyBuilder_ == null) {
        policyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.iam.v1.Policy,
                com.google.iam.v1.Policy.Builder,
                com.google.iam.v1.PolicyOrBuilder>(getPolicy(), getParentForChildren(), isClean());
        policy_ = null;
      }
      return policyBuilder_;
    }

    private com.google.rpc.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        statusBuilder_;

    /**
     *
     *
     * <pre>
     * Status of iam policy fetching.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     *
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Status of iam policy fetching.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     *
     * @return The status.
     */
    public com.google.rpc.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Status of iam policy fetching.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public Builder setStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
      } else {
        statusBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Status of iam policy fetching.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public Builder setStatus(com.google.rpc.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Status of iam policy fetching.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public Builder mergeStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && status_ != null
            && status_ != com.google.rpc.Status.getDefaultInstance()) {
          getStatusBuilder().mergeFrom(value);
        } else {
          status_ = value;
        }
      } else {
        statusBuilder_.mergeFrom(value);
      }
      if (status_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Status of iam policy fetching.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      status_ = null;
      if (statusBuilder_ != null) {
        statusBuilder_.dispose();
        statusBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Status of iam policy fetching.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public com.google.rpc.Status.Builder getStatusBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Status of iam policy fetching.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
      }
    }

    /**
     *
     *
     * <pre>
     * Status of iam policy fetching.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.rpc.Status,
                com.google.rpc.Status.Builder,
                com.google.rpc.StatusOrBuilder>(getStatus(), getParentForChildren(), isClean());
        status_ = null;
      }
      return statusBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datafusion.v1beta1.IAMPolicy)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datafusion.v1beta1.IAMPolicy)
  private static final com.google.cloud.datafusion.v1beta1.IAMPolicy DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datafusion.v1beta1.IAMPolicy();
  }

  public static com.google.cloud.datafusion.v1beta1.IAMPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IAMPolicy> PARSER =
      new com.google.protobuf.AbstractParser<IAMPolicy>() {
        @java.lang.Override
        public IAMPolicy parsePartialFrom(
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

  public static com.google.protobuf.Parser<IAMPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IAMPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datafusion.v1beta1.IAMPolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
