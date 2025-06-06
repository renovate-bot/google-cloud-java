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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.8
package com.google.cloudbuild.v1;

/**
 *
 *
 * <pre>
 * Pairs a secret environment variable with a SecretVersion in Secret Manager.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.SecretManagerSecret}
 */
public final class SecretManagerSecret extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.SecretManagerSecret)
    SecretManagerSecretOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SecretManagerSecret.newBuilder() to construct.
  private SecretManagerSecret(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SecretManagerSecret() {
    versionName_ = "";
    env_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SecretManagerSecret();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_SecretManagerSecret_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_SecretManagerSecret_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.SecretManagerSecret.class,
            com.google.cloudbuild.v1.SecretManagerSecret.Builder.class);
  }

  public static final int VERSION_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object versionName_ = "";

  /**
   *
   *
   * <pre>
   * Resource name of the SecretVersion. In format:
   * projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;
   * </pre>
   *
   * <code>string version_name = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The versionName.
   */
  @java.lang.Override
  public java.lang.String getVersionName() {
    java.lang.Object ref = versionName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      versionName_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Resource name of the SecretVersion. In format:
   * projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;
   * </pre>
   *
   * <code>string version_name = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for versionName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVersionNameBytes() {
    java.lang.Object ref = versionName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      versionName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENV_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object env_ = "";

  /**
   *
   *
   * <pre>
   * Environment variable name to associate with the secret.
   * Secret environment variables must be unique across all of a build's
   * secrets, and must be used by at least one build step.
   * </pre>
   *
   * <code>string env = 2;</code>
   *
   * @return The env.
   */
  @java.lang.Override
  public java.lang.String getEnv() {
    java.lang.Object ref = env_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      env_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Environment variable name to associate with the secret.
   * Secret environment variables must be unique across all of a build's
   * secrets, and must be used by at least one build step.
   * </pre>
   *
   * <code>string env = 2;</code>
   *
   * @return The bytes for env.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEnvBytes() {
    java.lang.Object ref = env_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      env_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(versionName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, versionName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(env_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, env_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(versionName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, versionName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(env_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, env_);
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
    if (!(obj instanceof com.google.cloudbuild.v1.SecretManagerSecret)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.SecretManagerSecret other =
        (com.google.cloudbuild.v1.SecretManagerSecret) obj;

    if (!getVersionName().equals(other.getVersionName())) return false;
    if (!getEnv().equals(other.getEnv())) return false;
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
    hash = (37 * hash) + VERSION_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getVersionName().hashCode();
    hash = (37 * hash) + ENV_FIELD_NUMBER;
    hash = (53 * hash) + getEnv().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.SecretManagerSecret parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.SecretManagerSecret parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.SecretManagerSecret parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.SecretManagerSecret parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.SecretManagerSecret parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.SecretManagerSecret parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.SecretManagerSecret parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.SecretManagerSecret parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.SecretManagerSecret parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.SecretManagerSecret parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.SecretManagerSecret parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.SecretManagerSecret parseFrom(
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

  public static Builder newBuilder(com.google.cloudbuild.v1.SecretManagerSecret prototype) {
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
   * Pairs a secret environment variable with a SecretVersion in Secret Manager.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.SecretManagerSecret}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.SecretManagerSecret)
      com.google.cloudbuild.v1.SecretManagerSecretOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_SecretManagerSecret_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_SecretManagerSecret_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.SecretManagerSecret.class,
              com.google.cloudbuild.v1.SecretManagerSecret.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.SecretManagerSecret.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      versionName_ = "";
      env_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_SecretManagerSecret_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.SecretManagerSecret getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.SecretManagerSecret.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.SecretManagerSecret build() {
      com.google.cloudbuild.v1.SecretManagerSecret result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.SecretManagerSecret buildPartial() {
      com.google.cloudbuild.v1.SecretManagerSecret result =
          new com.google.cloudbuild.v1.SecretManagerSecret(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloudbuild.v1.SecretManagerSecret result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.versionName_ = versionName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.env_ = env_;
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
      if (other instanceof com.google.cloudbuild.v1.SecretManagerSecret) {
        return mergeFrom((com.google.cloudbuild.v1.SecretManagerSecret) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.SecretManagerSecret other) {
      if (other == com.google.cloudbuild.v1.SecretManagerSecret.getDefaultInstance()) return this;
      if (!other.getVersionName().isEmpty()) {
        versionName_ = other.versionName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEnv().isEmpty()) {
        env_ = other.env_;
        bitField0_ |= 0x00000002;
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
            case 10:
              {
                versionName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                env_ = input.readStringRequireUtf8();
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

    private java.lang.Object versionName_ = "";

    /**
     *
     *
     * <pre>
     * Resource name of the SecretVersion. In format:
     * projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;
     * </pre>
     *
     * <code>string version_name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The versionName.
     */
    public java.lang.String getVersionName() {
      java.lang.Object ref = versionName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        versionName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Resource name of the SecretVersion. In format:
     * projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;
     * </pre>
     *
     * <code>string version_name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for versionName.
     */
    public com.google.protobuf.ByteString getVersionNameBytes() {
      java.lang.Object ref = versionName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        versionName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Resource name of the SecretVersion. In format:
     * projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;
     * </pre>
     *
     * <code>string version_name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The versionName to set.
     * @return This builder for chaining.
     */
    public Builder setVersionName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      versionName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Resource name of the SecretVersion. In format:
     * projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;
     * </pre>
     *
     * <code>string version_name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersionName() {
      versionName_ = getDefaultInstance().getVersionName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Resource name of the SecretVersion. In format:
     * projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;
     * </pre>
     *
     * <code>string version_name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for versionName to set.
     * @return This builder for chaining.
     */
    public Builder setVersionNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      versionName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object env_ = "";

    /**
     *
     *
     * <pre>
     * Environment variable name to associate with the secret.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step.
     * </pre>
     *
     * <code>string env = 2;</code>
     *
     * @return The env.
     */
    public java.lang.String getEnv() {
      java.lang.Object ref = env_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        env_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Environment variable name to associate with the secret.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step.
     * </pre>
     *
     * <code>string env = 2;</code>
     *
     * @return The bytes for env.
     */
    public com.google.protobuf.ByteString getEnvBytes() {
      java.lang.Object ref = env_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        env_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Environment variable name to associate with the secret.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step.
     * </pre>
     *
     * <code>string env = 2;</code>
     *
     * @param value The env to set.
     * @return This builder for chaining.
     */
    public Builder setEnv(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      env_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Environment variable name to associate with the secret.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step.
     * </pre>
     *
     * <code>string env = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnv() {
      env_ = getDefaultInstance().getEnv();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Environment variable name to associate with the secret.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step.
     * </pre>
     *
     * <code>string env = 2;</code>
     *
     * @param value The bytes for env to set.
     * @return This builder for chaining.
     */
    public Builder setEnvBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      env_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.SecretManagerSecret)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.SecretManagerSecret)
  private static final com.google.cloudbuild.v1.SecretManagerSecret DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.SecretManagerSecret();
  }

  public static com.google.cloudbuild.v1.SecretManagerSecret getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecretManagerSecret> PARSER =
      new com.google.protobuf.AbstractParser<SecretManagerSecret>() {
        @java.lang.Override
        public SecretManagerSecret parsePartialFrom(
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

  public static com.google.protobuf.Parser<SecretManagerSecret> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecretManagerSecret> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.SecretManagerSecret getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
