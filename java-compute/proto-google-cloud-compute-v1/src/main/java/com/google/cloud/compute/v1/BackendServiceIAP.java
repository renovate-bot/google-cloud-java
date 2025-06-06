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
 * Identity-Aware Proxy
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.BackendServiceIAP}
 */
public final class BackendServiceIAP extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.BackendServiceIAP)
    BackendServiceIAPOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use BackendServiceIAP.newBuilder() to construct.
  private BackendServiceIAP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BackendServiceIAP() {
    oauth2ClientId_ = "";
    oauth2ClientSecret_ = "";
    oauth2ClientSecretSha256_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BackendServiceIAP();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_BackendServiceIAP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_BackendServiceIAP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.BackendServiceIAP.class,
            com.google.cloud.compute.v1.BackendServiceIAP.Builder.class);
  }

  private int bitField0_;
  public static final int ENABLED_FIELD_NUMBER = 1018689;
  private boolean enabled_ = false;

  /**
   *
   *
   * <pre>
   * Whether the serving infrastructure will authenticate and authorize all incoming requests.
   * </pre>
   *
   * <code>optional bool enabled = 1018689;</code>
   *
   * @return Whether the enabled field is set.
   */
  @java.lang.Override
  public boolean hasEnabled() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Whether the serving infrastructure will authenticate and authorize all incoming requests.
   * </pre>
   *
   * <code>optional bool enabled = 1018689;</code>
   *
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int OAUTH2_CLIENT_ID_FIELD_NUMBER = 314017611;

  @SuppressWarnings("serial")
  private volatile java.lang.Object oauth2ClientId_ = "";

  /**
   *
   *
   * <pre>
   * OAuth2 client ID to use for the authentication flow.
   * </pre>
   *
   * <code>optional string oauth2_client_id = 314017611;</code>
   *
   * @return Whether the oauth2ClientId field is set.
   */
  @java.lang.Override
  public boolean hasOauth2ClientId() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * OAuth2 client ID to use for the authentication flow.
   * </pre>
   *
   * <code>optional string oauth2_client_id = 314017611;</code>
   *
   * @return The oauth2ClientId.
   */
  @java.lang.Override
  public java.lang.String getOauth2ClientId() {
    java.lang.Object ref = oauth2ClientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oauth2ClientId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * OAuth2 client ID to use for the authentication flow.
   * </pre>
   *
   * <code>optional string oauth2_client_id = 314017611;</code>
   *
   * @return The bytes for oauth2ClientId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOauth2ClientIdBytes() {
    java.lang.Object ref = oauth2ClientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      oauth2ClientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OAUTH2_CLIENT_SECRET_FIELD_NUMBER = 50999520;

  @SuppressWarnings("serial")
  private volatile java.lang.Object oauth2ClientSecret_ = "";

  /**
   *
   *
   * <pre>
   * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field. &#64;InputOnly
   * </pre>
   *
   * <code>optional string oauth2_client_secret = 50999520;</code>
   *
   * @return Whether the oauth2ClientSecret field is set.
   */
  @java.lang.Override
  public boolean hasOauth2ClientSecret() {
    return ((bitField0_ & 0x00000004) != 0);
  }

  /**
   *
   *
   * <pre>
   * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field. &#64;InputOnly
   * </pre>
   *
   * <code>optional string oauth2_client_secret = 50999520;</code>
   *
   * @return The oauth2ClientSecret.
   */
  @java.lang.Override
  public java.lang.String getOauth2ClientSecret() {
    java.lang.Object ref = oauth2ClientSecret_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oauth2ClientSecret_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field. &#64;InputOnly
   * </pre>
   *
   * <code>optional string oauth2_client_secret = 50999520;</code>
   *
   * @return The bytes for oauth2ClientSecret.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOauth2ClientSecretBytes() {
    java.lang.Object ref = oauth2ClientSecret_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      oauth2ClientSecret_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OAUTH2_CLIENT_SECRET_SHA256_FIELD_NUMBER = 112903782;

  @SuppressWarnings("serial")
  private volatile java.lang.Object oauth2ClientSecretSha256_ = "";

  /**
   *
   *
   * <pre>
   * [Output Only] SHA256 hash value for the field oauth2_client_secret above.
   * </pre>
   *
   * <code>optional string oauth2_client_secret_sha256 = 112903782;</code>
   *
   * @return Whether the oauth2ClientSecretSha256 field is set.
   */
  @java.lang.Override
  public boolean hasOauth2ClientSecretSha256() {
    return ((bitField0_ & 0x00000008) != 0);
  }

  /**
   *
   *
   * <pre>
   * [Output Only] SHA256 hash value for the field oauth2_client_secret above.
   * </pre>
   *
   * <code>optional string oauth2_client_secret_sha256 = 112903782;</code>
   *
   * @return The oauth2ClientSecretSha256.
   */
  @java.lang.Override
  public java.lang.String getOauth2ClientSecretSha256() {
    java.lang.Object ref = oauth2ClientSecretSha256_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oauth2ClientSecretSha256_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * [Output Only] SHA256 hash value for the field oauth2_client_secret above.
   * </pre>
   *
   * <code>optional string oauth2_client_secret_sha256 = 112903782;</code>
   *
   * @return The bytes for oauth2ClientSecretSha256.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOauth2ClientSecretSha256Bytes() {
    java.lang.Object ref = oauth2ClientSecretSha256_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      oauth2ClientSecretSha256_ = b;
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
      output.writeBool(1018689, enabled_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 50999520, oauth2ClientSecret_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(
          output, 112903782, oauth2ClientSecretSha256_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 314017611, oauth2ClientId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1018689, enabled_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(50999520, oauth2ClientSecret_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(
              112903782, oauth2ClientSecretSha256_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(314017611, oauth2ClientId_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.BackendServiceIAP)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.BackendServiceIAP other =
        (com.google.cloud.compute.v1.BackendServiceIAP) obj;

    if (hasEnabled() != other.hasEnabled()) return false;
    if (hasEnabled()) {
      if (getEnabled() != other.getEnabled()) return false;
    }
    if (hasOauth2ClientId() != other.hasOauth2ClientId()) return false;
    if (hasOauth2ClientId()) {
      if (!getOauth2ClientId().equals(other.getOauth2ClientId())) return false;
    }
    if (hasOauth2ClientSecret() != other.hasOauth2ClientSecret()) return false;
    if (hasOauth2ClientSecret()) {
      if (!getOauth2ClientSecret().equals(other.getOauth2ClientSecret())) return false;
    }
    if (hasOauth2ClientSecretSha256() != other.hasOauth2ClientSecretSha256()) return false;
    if (hasOauth2ClientSecretSha256()) {
      if (!getOauth2ClientSecretSha256().equals(other.getOauth2ClientSecretSha256())) return false;
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
    if (hasEnabled()) {
      hash = (37 * hash) + ENABLED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnabled());
    }
    if (hasOauth2ClientId()) {
      hash = (37 * hash) + OAUTH2_CLIENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOauth2ClientId().hashCode();
    }
    if (hasOauth2ClientSecret()) {
      hash = (37 * hash) + OAUTH2_CLIENT_SECRET_FIELD_NUMBER;
      hash = (53 * hash) + getOauth2ClientSecret().hashCode();
    }
    if (hasOauth2ClientSecretSha256()) {
      hash = (37 * hash) + OAUTH2_CLIENT_SECRET_SHA256_FIELD_NUMBER;
      hash = (53 * hash) + getOauth2ClientSecretSha256().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.BackendServiceIAP parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.BackendServiceIAP parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceIAP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.BackendServiceIAP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceIAP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.BackendServiceIAP parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceIAP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BackendServiceIAP parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceIAP parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BackendServiceIAP parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceIAP parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BackendServiceIAP parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.BackendServiceIAP prototype) {
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
   * Identity-Aware Proxy
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.BackendServiceIAP}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.BackendServiceIAP)
      com.google.cloud.compute.v1.BackendServiceIAPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_BackendServiceIAP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_BackendServiceIAP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.BackendServiceIAP.class,
              com.google.cloud.compute.v1.BackendServiceIAP.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.BackendServiceIAP.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enabled_ = false;
      oauth2ClientId_ = "";
      oauth2ClientSecret_ = "";
      oauth2ClientSecretSha256_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_BackendServiceIAP_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BackendServiceIAP getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.BackendServiceIAP.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BackendServiceIAP build() {
      com.google.cloud.compute.v1.BackendServiceIAP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BackendServiceIAP buildPartial() {
      com.google.cloud.compute.v1.BackendServiceIAP result =
          new com.google.cloud.compute.v1.BackendServiceIAP(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.BackendServiceIAP result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enabled_ = enabled_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.oauth2ClientId_ = oauth2ClientId_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.oauth2ClientSecret_ = oauth2ClientSecret_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.oauth2ClientSecretSha256_ = oauth2ClientSecretSha256_;
        to_bitField0_ |= 0x00000008;
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
      if (other instanceof com.google.cloud.compute.v1.BackendServiceIAP) {
        return mergeFrom((com.google.cloud.compute.v1.BackendServiceIAP) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.BackendServiceIAP other) {
      if (other == com.google.cloud.compute.v1.BackendServiceIAP.getDefaultInstance()) return this;
      if (other.hasEnabled()) {
        setEnabled(other.getEnabled());
      }
      if (other.hasOauth2ClientId()) {
        oauth2ClientId_ = other.oauth2ClientId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasOauth2ClientSecret()) {
        oauth2ClientSecret_ = other.oauth2ClientSecret_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasOauth2ClientSecretSha256()) {
        oauth2ClientSecretSha256_ = other.oauth2ClientSecretSha256_;
        bitField0_ |= 0x00000008;
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
            case 8149512:
              {
                enabled_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8149512
            case 407996162:
              {
                oauth2ClientSecret_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 407996162
            case 903230258:
              {
                oauth2ClientSecretSha256_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 903230258
            case -1782826406:
              {
                oauth2ClientId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case -1782826406
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

    private boolean enabled_;

    /**
     *
     *
     * <pre>
     * Whether the serving infrastructure will authenticate and authorize all incoming requests.
     * </pre>
     *
     * <code>optional bool enabled = 1018689;</code>
     *
     * @return Whether the enabled field is set.
     */
    @java.lang.Override
    public boolean hasEnabled() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Whether the serving infrastructure will authenticate and authorize all incoming requests.
     * </pre>
     *
     * <code>optional bool enabled = 1018689;</code>
     *
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }

    /**
     *
     *
     * <pre>
     * Whether the serving infrastructure will authenticate and authorize all incoming requests.
     * </pre>
     *
     * <code>optional bool enabled = 1018689;</code>
     *
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {

      enabled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Whether the serving infrastructure will authenticate and authorize all incoming requests.
     * </pre>
     *
     * <code>optional bool enabled = 1018689;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enabled_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object oauth2ClientId_ = "";

    /**
     *
     *
     * <pre>
     * OAuth2 client ID to use for the authentication flow.
     * </pre>
     *
     * <code>optional string oauth2_client_id = 314017611;</code>
     *
     * @return Whether the oauth2ClientId field is set.
     */
    public boolean hasOauth2ClientId() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * OAuth2 client ID to use for the authentication flow.
     * </pre>
     *
     * <code>optional string oauth2_client_id = 314017611;</code>
     *
     * @return The oauth2ClientId.
     */
    public java.lang.String getOauth2ClientId() {
      java.lang.Object ref = oauth2ClientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oauth2ClientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * OAuth2 client ID to use for the authentication flow.
     * </pre>
     *
     * <code>optional string oauth2_client_id = 314017611;</code>
     *
     * @return The bytes for oauth2ClientId.
     */
    public com.google.protobuf.ByteString getOauth2ClientIdBytes() {
      java.lang.Object ref = oauth2ClientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        oauth2ClientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * OAuth2 client ID to use for the authentication flow.
     * </pre>
     *
     * <code>optional string oauth2_client_id = 314017611;</code>
     *
     * @param value The oauth2ClientId to set.
     * @return This builder for chaining.
     */
    public Builder setOauth2ClientId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      oauth2ClientId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * OAuth2 client ID to use for the authentication flow.
     * </pre>
     *
     * <code>optional string oauth2_client_id = 314017611;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOauth2ClientId() {
      oauth2ClientId_ = getDefaultInstance().getOauth2ClientId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * OAuth2 client ID to use for the authentication flow.
     * </pre>
     *
     * <code>optional string oauth2_client_id = 314017611;</code>
     *
     * @param value The bytes for oauth2ClientId to set.
     * @return This builder for chaining.
     */
    public Builder setOauth2ClientIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      oauth2ClientId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object oauth2ClientSecret_ = "";

    /**
     *
     *
     * <pre>
     * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field. &#64;InputOnly
     * </pre>
     *
     * <code>optional string oauth2_client_secret = 50999520;</code>
     *
     * @return Whether the oauth2ClientSecret field is set.
     */
    public boolean hasOauth2ClientSecret() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field. &#64;InputOnly
     * </pre>
     *
     * <code>optional string oauth2_client_secret = 50999520;</code>
     *
     * @return The oauth2ClientSecret.
     */
    public java.lang.String getOauth2ClientSecret() {
      java.lang.Object ref = oauth2ClientSecret_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oauth2ClientSecret_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field. &#64;InputOnly
     * </pre>
     *
     * <code>optional string oauth2_client_secret = 50999520;</code>
     *
     * @return The bytes for oauth2ClientSecret.
     */
    public com.google.protobuf.ByteString getOauth2ClientSecretBytes() {
      java.lang.Object ref = oauth2ClientSecret_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        oauth2ClientSecret_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field. &#64;InputOnly
     * </pre>
     *
     * <code>optional string oauth2_client_secret = 50999520;</code>
     *
     * @param value The oauth2ClientSecret to set.
     * @return This builder for chaining.
     */
    public Builder setOauth2ClientSecret(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      oauth2ClientSecret_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field. &#64;InputOnly
     * </pre>
     *
     * <code>optional string oauth2_client_secret = 50999520;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOauth2ClientSecret() {
      oauth2ClientSecret_ = getDefaultInstance().getOauth2ClientSecret();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field. &#64;InputOnly
     * </pre>
     *
     * <code>optional string oauth2_client_secret = 50999520;</code>
     *
     * @param value The bytes for oauth2ClientSecret to set.
     * @return This builder for chaining.
     */
    public Builder setOauth2ClientSecretBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      oauth2ClientSecret_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object oauth2ClientSecretSha256_ = "";

    /**
     *
     *
     * <pre>
     * [Output Only] SHA256 hash value for the field oauth2_client_secret above.
     * </pre>
     *
     * <code>optional string oauth2_client_secret_sha256 = 112903782;</code>
     *
     * @return Whether the oauth2ClientSecretSha256 field is set.
     */
    public boolean hasOauth2ClientSecretSha256() {
      return ((bitField0_ & 0x00000008) != 0);
    }

    /**
     *
     *
     * <pre>
     * [Output Only] SHA256 hash value for the field oauth2_client_secret above.
     * </pre>
     *
     * <code>optional string oauth2_client_secret_sha256 = 112903782;</code>
     *
     * @return The oauth2ClientSecretSha256.
     */
    public java.lang.String getOauth2ClientSecretSha256() {
      java.lang.Object ref = oauth2ClientSecretSha256_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oauth2ClientSecretSha256_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * [Output Only] SHA256 hash value for the field oauth2_client_secret above.
     * </pre>
     *
     * <code>optional string oauth2_client_secret_sha256 = 112903782;</code>
     *
     * @return The bytes for oauth2ClientSecretSha256.
     */
    public com.google.protobuf.ByteString getOauth2ClientSecretSha256Bytes() {
      java.lang.Object ref = oauth2ClientSecretSha256_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        oauth2ClientSecretSha256_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * [Output Only] SHA256 hash value for the field oauth2_client_secret above.
     * </pre>
     *
     * <code>optional string oauth2_client_secret_sha256 = 112903782;</code>
     *
     * @param value The oauth2ClientSecretSha256 to set.
     * @return This builder for chaining.
     */
    public Builder setOauth2ClientSecretSha256(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      oauth2ClientSecretSha256_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] SHA256 hash value for the field oauth2_client_secret above.
     * </pre>
     *
     * <code>optional string oauth2_client_secret_sha256 = 112903782;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOauth2ClientSecretSha256() {
      oauth2ClientSecretSha256_ = getDefaultInstance().getOauth2ClientSecretSha256();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] SHA256 hash value for the field oauth2_client_secret above.
     * </pre>
     *
     * <code>optional string oauth2_client_secret_sha256 = 112903782;</code>
     *
     * @param value The bytes for oauth2ClientSecretSha256 to set.
     * @return This builder for chaining.
     */
    public Builder setOauth2ClientSecretSha256Bytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      oauth2ClientSecretSha256_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.BackendServiceIAP)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.BackendServiceIAP)
  private static final com.google.cloud.compute.v1.BackendServiceIAP DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.BackendServiceIAP();
  }

  public static com.google.cloud.compute.v1.BackendServiceIAP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BackendServiceIAP> PARSER =
      new com.google.protobuf.AbstractParser<BackendServiceIAP>() {
        @java.lang.Override
        public BackendServiceIAP parsePartialFrom(
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

  public static com.google.protobuf.Parser<BackendServiceIAP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BackendServiceIAP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.BackendServiceIAP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
