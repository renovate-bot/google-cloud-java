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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.8
package com.google.recaptchaenterprise.v1;

/**
 *
 *
 * <pre>
 * The migrate key request message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.MigrateKeyRequest}
 */
public final class MigrateKeyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.MigrateKeyRequest)
    MigrateKeyRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use MigrateKeyRequest.newBuilder() to construct.
  private MigrateKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MigrateKeyRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MigrateKeyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_MigrateKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_MigrateKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.MigrateKeyRequest.class,
            com.google.recaptchaenterprise.v1.MigrateKeyRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * Required. The name of the key to be migrated, in the format
   * `projects/{project}/keys/{key}`.
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
   * Required. The name of the key to be migrated, in the format
   * `projects/{project}/keys/{key}`.
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

  public static final int SKIP_BILLING_CHECK_FIELD_NUMBER = 2;
  private boolean skipBillingCheck_ = false;

  /**
   *
   *
   * <pre>
   * Optional. If true, skips the billing check.
   * A reCAPTCHA Enterprise key or migrated key behaves differently than a
   * reCAPTCHA (non-Enterprise version) key when you reach a quota limit (see
   * https://cloud.google.com/recaptcha/quotas#quota_limit). To avoid
   * any disruption of your usage, we check that a billing account is present.
   * If your usage of reCAPTCHA is under the free quota, you can safely skip the
   * billing check and proceed with the migration. See
   * https://cloud.google.com/recaptcha/docs/billing-information.
   * </pre>
   *
   * <code>bool skip_billing_check = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The skipBillingCheck.
   */
  @java.lang.Override
  public boolean getSkipBillingCheck() {
    return skipBillingCheck_;
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
    if (skipBillingCheck_ != false) {
      output.writeBool(2, skipBillingCheck_);
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
    if (skipBillingCheck_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, skipBillingCheck_);
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1.MigrateKeyRequest)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.MigrateKeyRequest other =
        (com.google.recaptchaenterprise.v1.MigrateKeyRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (getSkipBillingCheck() != other.getSkipBillingCheck()) return false;
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
    hash = (37 * hash) + SKIP_BILLING_CHECK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSkipBillingCheck());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.MigrateKeyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.MigrateKeyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.MigrateKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.MigrateKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.MigrateKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.MigrateKeyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.MigrateKeyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.MigrateKeyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.MigrateKeyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.MigrateKeyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.MigrateKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.MigrateKeyRequest parseFrom(
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

  public static Builder newBuilder(com.google.recaptchaenterprise.v1.MigrateKeyRequest prototype) {
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
   * The migrate key request message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.MigrateKeyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.MigrateKeyRequest)
      com.google.recaptchaenterprise.v1.MigrateKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_MigrateKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_MigrateKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.MigrateKeyRequest.class,
              com.google.recaptchaenterprise.v1.MigrateKeyRequest.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1.MigrateKeyRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      skipBillingCheck_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_MigrateKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.MigrateKeyRequest getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.MigrateKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.MigrateKeyRequest build() {
      com.google.recaptchaenterprise.v1.MigrateKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.MigrateKeyRequest buildPartial() {
      com.google.recaptchaenterprise.v1.MigrateKeyRequest result =
          new com.google.recaptchaenterprise.v1.MigrateKeyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.recaptchaenterprise.v1.MigrateKeyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.skipBillingCheck_ = skipBillingCheck_;
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
      if (other instanceof com.google.recaptchaenterprise.v1.MigrateKeyRequest) {
        return mergeFrom((com.google.recaptchaenterprise.v1.MigrateKeyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1.MigrateKeyRequest other) {
      if (other == com.google.recaptchaenterprise.v1.MigrateKeyRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getSkipBillingCheck() != false) {
        setSkipBillingCheck(other.getSkipBillingCheck());
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
            case 16:
              {
                skipBillingCheck_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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
     * Required. The name of the key to be migrated, in the format
     * `projects/{project}/keys/{key}`.
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
     * Required. The name of the key to be migrated, in the format
     * `projects/{project}/keys/{key}`.
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
     * Required. The name of the key to be migrated, in the format
     * `projects/{project}/keys/{key}`.
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
     * Required. The name of the key to be migrated, in the format
     * `projects/{project}/keys/{key}`.
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
     * Required. The name of the key to be migrated, in the format
     * `projects/{project}/keys/{key}`.
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

    private boolean skipBillingCheck_;

    /**
     *
     *
     * <pre>
     * Optional. If true, skips the billing check.
     * A reCAPTCHA Enterprise key or migrated key behaves differently than a
     * reCAPTCHA (non-Enterprise version) key when you reach a quota limit (see
     * https://cloud.google.com/recaptcha/quotas#quota_limit). To avoid
     * any disruption of your usage, we check that a billing account is present.
     * If your usage of reCAPTCHA is under the free quota, you can safely skip the
     * billing check and proceed with the migration. See
     * https://cloud.google.com/recaptcha/docs/billing-information.
     * </pre>
     *
     * <code>bool skip_billing_check = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The skipBillingCheck.
     */
    @java.lang.Override
    public boolean getSkipBillingCheck() {
      return skipBillingCheck_;
    }

    /**
     *
     *
     * <pre>
     * Optional. If true, skips the billing check.
     * A reCAPTCHA Enterprise key or migrated key behaves differently than a
     * reCAPTCHA (non-Enterprise version) key when you reach a quota limit (see
     * https://cloud.google.com/recaptcha/quotas#quota_limit). To avoid
     * any disruption of your usage, we check that a billing account is present.
     * If your usage of reCAPTCHA is under the free quota, you can safely skip the
     * billing check and proceed with the migration. See
     * https://cloud.google.com/recaptcha/docs/billing-information.
     * </pre>
     *
     * <code>bool skip_billing_check = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The skipBillingCheck to set.
     * @return This builder for chaining.
     */
    public Builder setSkipBillingCheck(boolean value) {

      skipBillingCheck_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. If true, skips the billing check.
     * A reCAPTCHA Enterprise key or migrated key behaves differently than a
     * reCAPTCHA (non-Enterprise version) key when you reach a quota limit (see
     * https://cloud.google.com/recaptcha/quotas#quota_limit). To avoid
     * any disruption of your usage, we check that a billing account is present.
     * If your usage of reCAPTCHA is under the free quota, you can safely skip the
     * billing check and proceed with the migration. See
     * https://cloud.google.com/recaptcha/docs/billing-information.
     * </pre>
     *
     * <code>bool skip_billing_check = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSkipBillingCheck() {
      bitField0_ = (bitField0_ & ~0x00000002);
      skipBillingCheck_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.MigrateKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.MigrateKeyRequest)
  private static final com.google.recaptchaenterprise.v1.MigrateKeyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.MigrateKeyRequest();
  }

  public static com.google.recaptchaenterprise.v1.MigrateKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MigrateKeyRequest> PARSER =
      new com.google.protobuf.AbstractParser<MigrateKeyRequest>() {
        @java.lang.Override
        public MigrateKeyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<MigrateKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MigrateKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.MigrateKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
