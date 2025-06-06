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
// source: google/api/cloudquotas/v1beta/quota_adjuster_settings.proto

// Protobuf Java Version: 3.25.8
package com.google.api.cloudquotas.v1beta;

/**
 *
 *
 * <pre>
 * Request for updating QuotaAdjusterSettings
 * </pre>
 *
 * Protobuf type {@code google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest}
 */
public final class UpdateQuotaAdjusterSettingsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest)
    UpdateQuotaAdjusterSettingsRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UpdateQuotaAdjusterSettingsRequest.newBuilder() to construct.
  private UpdateQuotaAdjusterSettingsRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateQuotaAdjusterSettingsRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateQuotaAdjusterSettingsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.cloudquotas.v1beta.QuotaAdjusterSettingsProto
        .internal_static_google_api_cloudquotas_v1beta_UpdateQuotaAdjusterSettingsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.cloudquotas.v1beta.QuotaAdjusterSettingsProto
        .internal_static_google_api_cloudquotas_v1beta_UpdateQuotaAdjusterSettingsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest.class,
            com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int QUOTA_ADJUSTER_SETTINGS_FIELD_NUMBER = 1;
  private com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings quotaAdjusterSettings_;

  /**
   *
   *
   * <pre>
   * Required. The QuotaAdjusterSettings to update.
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings quota_adjuster_settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the quotaAdjusterSettings field is set.
   */
  @java.lang.Override
  public boolean hasQuotaAdjusterSettings() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The QuotaAdjusterSettings to update.
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings quota_adjuster_settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The quotaAdjusterSettings.
   */
  @java.lang.Override
  public com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings getQuotaAdjusterSettings() {
    return quotaAdjusterSettings_ == null
        ? com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings.getDefaultInstance()
        : quotaAdjusterSettings_;
  }

  /**
   *
   *
   * <pre>
   * Required. The QuotaAdjusterSettings to update.
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings quota_adjuster_settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.api.cloudquotas.v1beta.QuotaAdjusterSettingsOrBuilder
      getQuotaAdjusterSettingsOrBuilder() {
    return quotaAdjusterSettings_ == null
        ? com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings.getDefaultInstance()
        : quotaAdjusterSettings_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;

  /**
   *
   *
   * <pre>
   * Optional. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Optional. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  /**
   *
   *
   * <pre>
   * Optional. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 3;
  private boolean validateOnly_ = false;

  /**
   *
   *
   * <pre>
   * Optional. If set to true, checks the syntax of the request but doesn't
   * update the quota adjuster settings value. Note that although a request can
   * be valid, that doesn't guarantee that the request will be fulfilled.
   * </pre>
   *
   * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
      output.writeMessage(1, getQuotaAdjusterSettings());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      output.writeBool(3, validateOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getQuotaAdjusterSettings());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, validateOnly_);
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
    if (!(obj instanceof com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest)) {
      return super.equals(obj);
    }
    com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest other =
        (com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest) obj;

    if (hasQuotaAdjusterSettings() != other.hasQuotaAdjusterSettings()) return false;
    if (hasQuotaAdjusterSettings()) {
      if (!getQuotaAdjusterSettings().equals(other.getQuotaAdjusterSettings())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (getValidateOnly() != other.getValidateOnly()) return false;
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
    if (hasQuotaAdjusterSettings()) {
      hash = (37 * hash) + QUOTA_ADJUSTER_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getQuotaAdjusterSettings().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest parseFrom(
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
      com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest prototype) {
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
   * Request for updating QuotaAdjusterSettings
   * </pre>
   *
   * Protobuf type {@code google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest)
      com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.cloudquotas.v1beta.QuotaAdjusterSettingsProto
          .internal_static_google_api_cloudquotas_v1beta_UpdateQuotaAdjusterSettingsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.cloudquotas.v1beta.QuotaAdjusterSettingsProto
          .internal_static_google_api_cloudquotas_v1beta_UpdateQuotaAdjusterSettingsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest.class,
              com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest.Builder.class);
    }

    // Construct using
    // com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getQuotaAdjusterSettingsFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      quotaAdjusterSettings_ = null;
      if (quotaAdjusterSettingsBuilder_ != null) {
        quotaAdjusterSettingsBuilder_.dispose();
        quotaAdjusterSettingsBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.cloudquotas.v1beta.QuotaAdjusterSettingsProto
          .internal_static_google_api_cloudquotas_v1beta_UpdateQuotaAdjusterSettingsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest
        getDefaultInstanceForType() {
      return com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest build() {
      com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest buildPartial() {
      com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest result =
          new com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.quotaAdjusterSettings_ =
            quotaAdjusterSettingsBuilder_ == null
                ? quotaAdjusterSettings_
                : quotaAdjusterSettingsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest) {
        return mergeFrom(
            (com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest other) {
      if (other
          == com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest
              .getDefaultInstance()) return this;
      if (other.hasQuotaAdjusterSettings()) {
        mergeQuotaAdjusterSettings(other.getQuotaAdjusterSettings());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
                input.readMessage(
                    getQuotaAdjusterSettingsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                validateOnly_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings quotaAdjusterSettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings,
            com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings.Builder,
            com.google.api.cloudquotas.v1beta.QuotaAdjusterSettingsOrBuilder>
        quotaAdjusterSettingsBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The QuotaAdjusterSettings to update.
     * </pre>
     *
     * <code>
     * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings quota_adjuster_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the quotaAdjusterSettings field is set.
     */
    public boolean hasQuotaAdjusterSettings() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The QuotaAdjusterSettings to update.
     * </pre>
     *
     * <code>
     * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings quota_adjuster_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The quotaAdjusterSettings.
     */
    public com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings getQuotaAdjusterSettings() {
      if (quotaAdjusterSettingsBuilder_ == null) {
        return quotaAdjusterSettings_ == null
            ? com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings.getDefaultInstance()
            : quotaAdjusterSettings_;
      } else {
        return quotaAdjusterSettingsBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The QuotaAdjusterSettings to update.
     * </pre>
     *
     * <code>
     * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings quota_adjuster_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setQuotaAdjusterSettings(
        com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings value) {
      if (quotaAdjusterSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        quotaAdjusterSettings_ = value;
      } else {
        quotaAdjusterSettingsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The QuotaAdjusterSettings to update.
     * </pre>
     *
     * <code>
     * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings quota_adjuster_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setQuotaAdjusterSettings(
        com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings.Builder builderForValue) {
      if (quotaAdjusterSettingsBuilder_ == null) {
        quotaAdjusterSettings_ = builderForValue.build();
      } else {
        quotaAdjusterSettingsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The QuotaAdjusterSettings to update.
     * </pre>
     *
     * <code>
     * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings quota_adjuster_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeQuotaAdjusterSettings(
        com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings value) {
      if (quotaAdjusterSettingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && quotaAdjusterSettings_ != null
            && quotaAdjusterSettings_
                != com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings.getDefaultInstance()) {
          getQuotaAdjusterSettingsBuilder().mergeFrom(value);
        } else {
          quotaAdjusterSettings_ = value;
        }
      } else {
        quotaAdjusterSettingsBuilder_.mergeFrom(value);
      }
      if (quotaAdjusterSettings_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The QuotaAdjusterSettings to update.
     * </pre>
     *
     * <code>
     * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings quota_adjuster_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearQuotaAdjusterSettings() {
      bitField0_ = (bitField0_ & ~0x00000001);
      quotaAdjusterSettings_ = null;
      if (quotaAdjusterSettingsBuilder_ != null) {
        quotaAdjusterSettingsBuilder_.dispose();
        quotaAdjusterSettingsBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The QuotaAdjusterSettings to update.
     * </pre>
     *
     * <code>
     * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings quota_adjuster_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings.Builder
        getQuotaAdjusterSettingsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getQuotaAdjusterSettingsFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The QuotaAdjusterSettings to update.
     * </pre>
     *
     * <code>
     * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings quota_adjuster_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.api.cloudquotas.v1beta.QuotaAdjusterSettingsOrBuilder
        getQuotaAdjusterSettingsOrBuilder() {
      if (quotaAdjusterSettingsBuilder_ != null) {
        return quotaAdjusterSettingsBuilder_.getMessageOrBuilder();
      } else {
        return quotaAdjusterSettings_ == null
            ? com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings.getDefaultInstance()
            : quotaAdjusterSettings_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The QuotaAdjusterSettings to update.
     * </pre>
     *
     * <code>
     * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings quota_adjuster_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings,
            com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings.Builder,
            com.google.api.cloudquotas.v1beta.QuotaAdjusterSettingsOrBuilder>
        getQuotaAdjusterSettingsFieldBuilder() {
      if (quotaAdjusterSettingsBuilder_ == null) {
        quotaAdjusterSettingsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings,
                com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings.Builder,
                com.google.api.cloudquotas.v1beta.QuotaAdjusterSettingsOrBuilder>(
                getQuotaAdjusterSettings(), getParentForChildren(), isClean());
        quotaAdjusterSettings_ = null;
      }
      return quotaAdjusterSettingsBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Optional. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Optional. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private boolean validateOnly_;

    /**
     *
     *
     * <pre>
     * Optional. If set to true, checks the syntax of the request but doesn't
     * update the quota adjuster settings value. Note that although a request can
     * be valid, that doesn't guarantee that the request will be fulfilled.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }

    /**
     *
     *
     * <pre>
     * Optional. If set to true, checks the syntax of the request but doesn't
     * update the quota adjuster settings value. Note that although a request can
     * be valid, that doesn't guarantee that the request will be fulfilled.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. If set to true, checks the syntax of the request but doesn't
     * update the quota adjuster settings value. Note that although a request can
     * be valid, that doesn't guarantee that the request will be fulfilled.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000004);
      validateOnly_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest)
  private static final com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest();
  }

  public static com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateQuotaAdjusterSettingsRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateQuotaAdjusterSettingsRequest>() {
        @java.lang.Override
        public UpdateQuotaAdjusterSettingsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateQuotaAdjusterSettingsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateQuotaAdjusterSettingsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
