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
 * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagerResourcePolicies}
 */
public final class InstanceGroupManagerResourcePolicies
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstanceGroupManagerResourcePolicies)
    InstanceGroupManagerResourcePoliciesOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use InstanceGroupManagerResourcePolicies.newBuilder() to construct.
  private InstanceGroupManagerResourcePolicies(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceGroupManagerResourcePolicies() {
    workloadPolicy_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceGroupManagerResourcePolicies();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagerResourcePolicies_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagerResourcePolicies_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies.class,
            com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies.Builder.class);
  }

  private int bitField0_;
  public static final int WORKLOAD_POLICY_FIELD_NUMBER = 114721530;

  @SuppressWarnings("serial")
  private volatile java.lang.Object workloadPolicy_ = "";

  /**
   *
   *
   * <pre>
   * The URL of the workload policy that is specified for this managed instance group. It can be a full or partial URL. For example, the following are all valid URLs to a workload policy: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
   * </pre>
   *
   * <code>optional string workload_policy = 114721530;</code>
   *
   * @return Whether the workloadPolicy field is set.
   */
  @java.lang.Override
  public boolean hasWorkloadPolicy() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The URL of the workload policy that is specified for this managed instance group. It can be a full or partial URL. For example, the following are all valid URLs to a workload policy: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
   * </pre>
   *
   * <code>optional string workload_policy = 114721530;</code>
   *
   * @return The workloadPolicy.
   */
  @java.lang.Override
  public java.lang.String getWorkloadPolicy() {
    java.lang.Object ref = workloadPolicy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      workloadPolicy_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The URL of the workload policy that is specified for this managed instance group. It can be a full or partial URL. For example, the following are all valid URLs to a workload policy: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
   * </pre>
   *
   * <code>optional string workload_policy = 114721530;</code>
   *
   * @return The bytes for workloadPolicy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getWorkloadPolicyBytes() {
    java.lang.Object ref = workloadPolicy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      workloadPolicy_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 114721530, workloadPolicy_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(114721530, workloadPolicy_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies other =
        (com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies) obj;

    if (hasWorkloadPolicy() != other.hasWorkloadPolicy()) return false;
    if (hasWorkloadPolicy()) {
      if (!getWorkloadPolicy().equals(other.getWorkloadPolicy())) return false;
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
    if (hasWorkloadPolicy()) {
      hash = (37 * hash) + WORKLOAD_POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getWorkloadPolicy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies parseFrom(
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
      com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagerResourcePolicies}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstanceGroupManagerResourcePolicies)
      com.google.cloud.compute.v1.InstanceGroupManagerResourcePoliciesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerResourcePolicies_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerResourcePolicies_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies.class,
              com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      workloadPolicy_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerResourcePolicies_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies build() {
      com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies buildPartial() {
      com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies result =
          new com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.workloadPolicy_ = workloadPolicy_;
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
      if (other instanceof com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies) {
        return mergeFrom((com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies other) {
      if (other
          == com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies.getDefaultInstance())
        return this;
      if (other.hasWorkloadPolicy()) {
        workloadPolicy_ = other.workloadPolicy_;
        bitField0_ |= 0x00000001;
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
            case 917772242:
              {
                workloadPolicy_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 917772242
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

    private java.lang.Object workloadPolicy_ = "";

    /**
     *
     *
     * <pre>
     * The URL of the workload policy that is specified for this managed instance group. It can be a full or partial URL. For example, the following are all valid URLs to a workload policy: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
     * </pre>
     *
     * <code>optional string workload_policy = 114721530;</code>
     *
     * @return Whether the workloadPolicy field is set.
     */
    public boolean hasWorkloadPolicy() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * The URL of the workload policy that is specified for this managed instance group. It can be a full or partial URL. For example, the following are all valid URLs to a workload policy: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
     * </pre>
     *
     * <code>optional string workload_policy = 114721530;</code>
     *
     * @return The workloadPolicy.
     */
    public java.lang.String getWorkloadPolicy() {
      java.lang.Object ref = workloadPolicy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        workloadPolicy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The URL of the workload policy that is specified for this managed instance group. It can be a full or partial URL. For example, the following are all valid URLs to a workload policy: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
     * </pre>
     *
     * <code>optional string workload_policy = 114721530;</code>
     *
     * @return The bytes for workloadPolicy.
     */
    public com.google.protobuf.ByteString getWorkloadPolicyBytes() {
      java.lang.Object ref = workloadPolicy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        workloadPolicy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The URL of the workload policy that is specified for this managed instance group. It can be a full or partial URL. For example, the following are all valid URLs to a workload policy: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
     * </pre>
     *
     * <code>optional string workload_policy = 114721530;</code>
     *
     * @param value The workloadPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setWorkloadPolicy(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      workloadPolicy_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The URL of the workload policy that is specified for this managed instance group. It can be a full or partial URL. For example, the following are all valid URLs to a workload policy: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
     * </pre>
     *
     * <code>optional string workload_policy = 114721530;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWorkloadPolicy() {
      workloadPolicy_ = getDefaultInstance().getWorkloadPolicy();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The URL of the workload policy that is specified for this managed instance group. It can be a full or partial URL. For example, the following are all valid URLs to a workload policy: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
     * </pre>
     *
     * <code>optional string workload_policy = 114721530;</code>
     *
     * @param value The bytes for workloadPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setWorkloadPolicyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      workloadPolicy_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstanceGroupManagerResourcePolicies)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstanceGroupManagerResourcePolicies)
  private static final com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies();
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceGroupManagerResourcePolicies> PARSER =
      new com.google.protobuf.AbstractParser<InstanceGroupManagerResourcePolicies>() {
        @java.lang.Override
        public InstanceGroupManagerResourcePolicies parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstanceGroupManagerResourcePolicies> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceGroupManagerResourcePolicies> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
