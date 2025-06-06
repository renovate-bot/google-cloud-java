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
 * Protobuf type {@code google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig}
 */
public final class SecurityPolicyRuleMatcherConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig)
    SecurityPolicyRuleMatcherConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SecurityPolicyRuleMatcherConfig.newBuilder() to construct.
  private SecurityPolicyRuleMatcherConfig(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SecurityPolicyRuleMatcherConfig() {
    srcIpRanges_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SecurityPolicyRuleMatcherConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SecurityPolicyRuleMatcherConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SecurityPolicyRuleMatcherConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig.class,
            com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig.Builder.class);
  }

  public static final int SRC_IP_RANGES_FIELD_NUMBER = 432128083;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList srcIpRanges_ =
      com.google.protobuf.LazyStringArrayList.emptyList();

  /**
   *
   *
   * <pre>
   * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
   * </pre>
   *
   * <code>repeated string src_ip_ranges = 432128083;</code>
   *
   * @return A list containing the srcIpRanges.
   */
  public com.google.protobuf.ProtocolStringList getSrcIpRangesList() {
    return srcIpRanges_;
  }

  /**
   *
   *
   * <pre>
   * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
   * </pre>
   *
   * <code>repeated string src_ip_ranges = 432128083;</code>
   *
   * @return The count of srcIpRanges.
   */
  public int getSrcIpRangesCount() {
    return srcIpRanges_.size();
  }

  /**
   *
   *
   * <pre>
   * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
   * </pre>
   *
   * <code>repeated string src_ip_ranges = 432128083;</code>
   *
   * @param index The index of the element to return.
   * @return The srcIpRanges at the given index.
   */
  public java.lang.String getSrcIpRanges(int index) {
    return srcIpRanges_.get(index);
  }

  /**
   *
   *
   * <pre>
   * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
   * </pre>
   *
   * <code>repeated string src_ip_ranges = 432128083;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the srcIpRanges at the given index.
   */
  public com.google.protobuf.ByteString getSrcIpRangesBytes(int index) {
    return srcIpRanges_.getByteString(index);
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
    for (int i = 0; i < srcIpRanges_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 432128083, srcIpRanges_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < srcIpRanges_.size(); i++) {
        dataSize += computeStringSizeNoTag(srcIpRanges_.getRaw(i));
      }
      size += dataSize;
      size += 5 * getSrcIpRangesList().size();
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
    if (!(obj instanceof com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig other =
        (com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig) obj;

    if (!getSrcIpRangesList().equals(other.getSrcIpRangesList())) return false;
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
    if (getSrcIpRangesCount() > 0) {
      hash = (37 * hash) + SRC_IP_RANGES_FIELD_NUMBER;
      hash = (53 * hash) + getSrcIpRangesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig parseFrom(
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
      com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig)
      com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SecurityPolicyRuleMatcherConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SecurityPolicyRuleMatcherConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig.class,
              com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      srcIpRanges_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SecurityPolicyRuleMatcherConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig build() {
      com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig buildPartial() {
      com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig result =
          new com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        srcIpRanges_.makeImmutable();
        result.srcIpRanges_ = srcIpRanges_;
      }
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
      if (other instanceof com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig) {
        return mergeFrom((com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig other) {
      if (other == com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig.getDefaultInstance())
        return this;
      if (!other.srcIpRanges_.isEmpty()) {
        if (srcIpRanges_.isEmpty()) {
          srcIpRanges_ = other.srcIpRanges_;
          bitField0_ |= 0x00000001;
        } else {
          ensureSrcIpRangesIsMutable();
          srcIpRanges_.addAll(other.srcIpRanges_);
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
            case -837942630:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureSrcIpRangesIsMutable();
                srcIpRanges_.add(s);
                break;
              } // case -837942630
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

    private com.google.protobuf.LazyStringArrayList srcIpRanges_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureSrcIpRangesIsMutable() {
      if (!srcIpRanges_.isModifiable()) {
        srcIpRanges_ = new com.google.protobuf.LazyStringArrayList(srcIpRanges_);
      }
      bitField0_ |= 0x00000001;
    }

    /**
     *
     *
     * <pre>
     * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * </pre>
     *
     * <code>repeated string src_ip_ranges = 432128083;</code>
     *
     * @return A list containing the srcIpRanges.
     */
    public com.google.protobuf.ProtocolStringList getSrcIpRangesList() {
      srcIpRanges_.makeImmutable();
      return srcIpRanges_;
    }

    /**
     *
     *
     * <pre>
     * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * </pre>
     *
     * <code>repeated string src_ip_ranges = 432128083;</code>
     *
     * @return The count of srcIpRanges.
     */
    public int getSrcIpRangesCount() {
      return srcIpRanges_.size();
    }

    /**
     *
     *
     * <pre>
     * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * </pre>
     *
     * <code>repeated string src_ip_ranges = 432128083;</code>
     *
     * @param index The index of the element to return.
     * @return The srcIpRanges at the given index.
     */
    public java.lang.String getSrcIpRanges(int index) {
      return srcIpRanges_.get(index);
    }

    /**
     *
     *
     * <pre>
     * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * </pre>
     *
     * <code>repeated string src_ip_ranges = 432128083;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the srcIpRanges at the given index.
     */
    public com.google.protobuf.ByteString getSrcIpRangesBytes(int index) {
      return srcIpRanges_.getByteString(index);
    }

    /**
     *
     *
     * <pre>
     * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * </pre>
     *
     * <code>repeated string src_ip_ranges = 432128083;</code>
     *
     * @param index The index to set the value at.
     * @param value The srcIpRanges to set.
     * @return This builder for chaining.
     */
    public Builder setSrcIpRanges(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureSrcIpRangesIsMutable();
      srcIpRanges_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * </pre>
     *
     * <code>repeated string src_ip_ranges = 432128083;</code>
     *
     * @param value The srcIpRanges to add.
     * @return This builder for chaining.
     */
    public Builder addSrcIpRanges(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureSrcIpRangesIsMutable();
      srcIpRanges_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * </pre>
     *
     * <code>repeated string src_ip_ranges = 432128083;</code>
     *
     * @param values The srcIpRanges to add.
     * @return This builder for chaining.
     */
    public Builder addAllSrcIpRanges(java.lang.Iterable<java.lang.String> values) {
      ensureSrcIpRangesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, srcIpRanges_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * </pre>
     *
     * <code>repeated string src_ip_ranges = 432128083;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSrcIpRanges() {
      srcIpRanges_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * </pre>
     *
     * <code>repeated string src_ip_ranges = 432128083;</code>
     *
     * @param value The bytes of the srcIpRanges to add.
     * @return This builder for chaining.
     */
    public Builder addSrcIpRangesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureSrcIpRangesIsMutable();
      srcIpRanges_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig)
  private static final com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig();
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecurityPolicyRuleMatcherConfig> PARSER =
      new com.google.protobuf.AbstractParser<SecurityPolicyRuleMatcherConfig>() {
        @java.lang.Override
        public SecurityPolicyRuleMatcherConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<SecurityPolicyRuleMatcherConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecurityPolicyRuleMatcherConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
