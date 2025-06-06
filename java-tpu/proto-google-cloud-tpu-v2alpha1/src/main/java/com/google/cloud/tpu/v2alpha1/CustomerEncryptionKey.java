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
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.tpu.v2alpha1;

/**
 *
 *
 * <pre>
 * Customer's encryption key.
 * </pre>
 *
 * Protobuf type {@code google.cloud.tpu.v2alpha1.CustomerEncryptionKey}
 */
public final class CustomerEncryptionKey extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tpu.v2alpha1.CustomerEncryptionKey)
    CustomerEncryptionKeyOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CustomerEncryptionKey.newBuilder() to construct.
  private CustomerEncryptionKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CustomerEncryptionKey() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CustomerEncryptionKey();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto
        .internal_static_google_cloud_tpu_v2alpha1_CustomerEncryptionKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto
        .internal_static_google_cloud_tpu_v2alpha1_CustomerEncryptionKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey.class,
            com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey.Builder.class);
  }

  private int keyCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object key_;

  public enum KeyCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    KMS_KEY_NAME(7),
    KEY_NOT_SET(0);
    private final int value;

    private KeyCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static KeyCase valueOf(int value) {
      return forNumber(value);
    }

    public static KeyCase forNumber(int value) {
      switch (value) {
        case 7:
          return KMS_KEY_NAME;
        case 0:
          return KEY_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public KeyCase getKeyCase() {
    return KeyCase.forNumber(keyCase_);
  }

  public static final int KMS_KEY_NAME_FIELD_NUMBER = 7;

  /**
   *
   *
   * <pre>
   * The name of the encryption key that is stored in Google Cloud KMS.
   * For example:
   * &lt;pre class="lang-html"&gt;"kmsKeyName": "projects/
   * &lt;var class="apiparam"&gt;kms_project_id&lt;/var&gt;/locations/
   * &lt;var class="apiparam"&gt;region&lt;/var&gt;/keyRings/&lt;var class="apiparam"&gt;
   * key_region&lt;/var&gt;/cryptoKeys/&lt;var class="apiparam"&gt;key&lt;/var&gt;
   * &lt;/pre&gt;
   * The fully-qualifed key name may be returned for resource GET requests.
   * For example:
   * &lt;pre class="lang-html"&gt;"kmsKeyName": "projects/
   * &lt;var class="apiparam"&gt;kms_project_id&lt;/var&gt;/locations/
   * &lt;var class="apiparam"&gt;region&lt;/var&gt;/keyRings/&lt;var class="apiparam"&gt;
   * key_region&lt;/var&gt;/cryptoKeys/&lt;var class="apiparam"&gt;key&lt;/var&gt;
   * /cryptoKeyVersions/1&lt;/pre&gt;
   * </pre>
   *
   * <code>string kms_key_name = 7;</code>
   *
   * @return Whether the kmsKeyName field is set.
   */
  public boolean hasKmsKeyName() {
    return keyCase_ == 7;
  }

  /**
   *
   *
   * <pre>
   * The name of the encryption key that is stored in Google Cloud KMS.
   * For example:
   * &lt;pre class="lang-html"&gt;"kmsKeyName": "projects/
   * &lt;var class="apiparam"&gt;kms_project_id&lt;/var&gt;/locations/
   * &lt;var class="apiparam"&gt;region&lt;/var&gt;/keyRings/&lt;var class="apiparam"&gt;
   * key_region&lt;/var&gt;/cryptoKeys/&lt;var class="apiparam"&gt;key&lt;/var&gt;
   * &lt;/pre&gt;
   * The fully-qualifed key name may be returned for resource GET requests.
   * For example:
   * &lt;pre class="lang-html"&gt;"kmsKeyName": "projects/
   * &lt;var class="apiparam"&gt;kms_project_id&lt;/var&gt;/locations/
   * &lt;var class="apiparam"&gt;region&lt;/var&gt;/keyRings/&lt;var class="apiparam"&gt;
   * key_region&lt;/var&gt;/cryptoKeys/&lt;var class="apiparam"&gt;key&lt;/var&gt;
   * /cryptoKeyVersions/1&lt;/pre&gt;
   * </pre>
   *
   * <code>string kms_key_name = 7;</code>
   *
   * @return The kmsKeyName.
   */
  public java.lang.String getKmsKeyName() {
    java.lang.Object ref = "";
    if (keyCase_ == 7) {
      ref = key_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (keyCase_ == 7) {
        key_ = s;
      }
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The name of the encryption key that is stored in Google Cloud KMS.
   * For example:
   * &lt;pre class="lang-html"&gt;"kmsKeyName": "projects/
   * &lt;var class="apiparam"&gt;kms_project_id&lt;/var&gt;/locations/
   * &lt;var class="apiparam"&gt;region&lt;/var&gt;/keyRings/&lt;var class="apiparam"&gt;
   * key_region&lt;/var&gt;/cryptoKeys/&lt;var class="apiparam"&gt;key&lt;/var&gt;
   * &lt;/pre&gt;
   * The fully-qualifed key name may be returned for resource GET requests.
   * For example:
   * &lt;pre class="lang-html"&gt;"kmsKeyName": "projects/
   * &lt;var class="apiparam"&gt;kms_project_id&lt;/var&gt;/locations/
   * &lt;var class="apiparam"&gt;region&lt;/var&gt;/keyRings/&lt;var class="apiparam"&gt;
   * key_region&lt;/var&gt;/cryptoKeys/&lt;var class="apiparam"&gt;key&lt;/var&gt;
   * /cryptoKeyVersions/1&lt;/pre&gt;
   * </pre>
   *
   * <code>string kms_key_name = 7;</code>
   *
   * @return The bytes for kmsKeyName.
   */
  public com.google.protobuf.ByteString getKmsKeyNameBytes() {
    java.lang.Object ref = "";
    if (keyCase_ == 7) {
      ref = key_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (keyCase_ == 7) {
        key_ = b;
      }
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
    if (keyCase_ == 7) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, key_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (keyCase_ == 7) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, key_);
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
    if (!(obj instanceof com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey)) {
      return super.equals(obj);
    }
    com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey other =
        (com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey) obj;

    if (!getKeyCase().equals(other.getKeyCase())) return false;
    switch (keyCase_) {
      case 7:
        if (!getKmsKeyName().equals(other.getKmsKeyName())) return false;
        break;
      case 0:
      default:
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
    switch (keyCase_) {
      case 7:
        hash = (37 * hash) + KMS_KEY_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getKmsKeyName().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey parseFrom(
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

  public static Builder newBuilder(com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey prototype) {
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
   * Customer's encryption key.
   * </pre>
   *
   * Protobuf type {@code google.cloud.tpu.v2alpha1.CustomerEncryptionKey}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tpu.v2alpha1.CustomerEncryptionKey)
      com.google.cloud.tpu.v2alpha1.CustomerEncryptionKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto
          .internal_static_google_cloud_tpu_v2alpha1_CustomerEncryptionKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto
          .internal_static_google_cloud_tpu_v2alpha1_CustomerEncryptionKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey.class,
              com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey.Builder.class);
    }

    // Construct using com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      keyCase_ = 0;
      key_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto
          .internal_static_google_cloud_tpu_v2alpha1_CustomerEncryptionKey_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey getDefaultInstanceForType() {
      return com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey build() {
      com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey buildPartial() {
      com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey result =
          new com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey result) {
      result.keyCase_ = keyCase_;
      result.key_ = this.key_;
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
      if (other instanceof com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey) {
        return mergeFrom((com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey other) {
      if (other == com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey.getDefaultInstance())
        return this;
      switch (other.getKeyCase()) {
        case KMS_KEY_NAME:
          {
            keyCase_ = 7;
            key_ = other.key_;
            onChanged();
            break;
          }
        case KEY_NOT_SET:
          {
            break;
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
            case 58:
              {
                java.lang.String s = input.readStringRequireUtf8();
                keyCase_ = 7;
                key_ = s;
                break;
              } // case 58
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

    private int keyCase_ = 0;
    private java.lang.Object key_;

    public KeyCase getKeyCase() {
      return KeyCase.forNumber(keyCase_);
    }

    public Builder clearKey() {
      keyCase_ = 0;
      key_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * The name of the encryption key that is stored in Google Cloud KMS.
     * For example:
     * &lt;pre class="lang-html"&gt;"kmsKeyName": "projects/
     * &lt;var class="apiparam"&gt;kms_project_id&lt;/var&gt;/locations/
     * &lt;var class="apiparam"&gt;region&lt;/var&gt;/keyRings/&lt;var class="apiparam"&gt;
     * key_region&lt;/var&gt;/cryptoKeys/&lt;var class="apiparam"&gt;key&lt;/var&gt;
     * &lt;/pre&gt;
     * The fully-qualifed key name may be returned for resource GET requests.
     * For example:
     * &lt;pre class="lang-html"&gt;"kmsKeyName": "projects/
     * &lt;var class="apiparam"&gt;kms_project_id&lt;/var&gt;/locations/
     * &lt;var class="apiparam"&gt;region&lt;/var&gt;/keyRings/&lt;var class="apiparam"&gt;
     * key_region&lt;/var&gt;/cryptoKeys/&lt;var class="apiparam"&gt;key&lt;/var&gt;
     * /cryptoKeyVersions/1&lt;/pre&gt;
     * </pre>
     *
     * <code>string kms_key_name = 7;</code>
     *
     * @return Whether the kmsKeyName field is set.
     */
    @java.lang.Override
    public boolean hasKmsKeyName() {
      return keyCase_ == 7;
    }

    /**
     *
     *
     * <pre>
     * The name of the encryption key that is stored in Google Cloud KMS.
     * For example:
     * &lt;pre class="lang-html"&gt;"kmsKeyName": "projects/
     * &lt;var class="apiparam"&gt;kms_project_id&lt;/var&gt;/locations/
     * &lt;var class="apiparam"&gt;region&lt;/var&gt;/keyRings/&lt;var class="apiparam"&gt;
     * key_region&lt;/var&gt;/cryptoKeys/&lt;var class="apiparam"&gt;key&lt;/var&gt;
     * &lt;/pre&gt;
     * The fully-qualifed key name may be returned for resource GET requests.
     * For example:
     * &lt;pre class="lang-html"&gt;"kmsKeyName": "projects/
     * &lt;var class="apiparam"&gt;kms_project_id&lt;/var&gt;/locations/
     * &lt;var class="apiparam"&gt;region&lt;/var&gt;/keyRings/&lt;var class="apiparam"&gt;
     * key_region&lt;/var&gt;/cryptoKeys/&lt;var class="apiparam"&gt;key&lt;/var&gt;
     * /cryptoKeyVersions/1&lt;/pre&gt;
     * </pre>
     *
     * <code>string kms_key_name = 7;</code>
     *
     * @return The kmsKeyName.
     */
    @java.lang.Override
    public java.lang.String getKmsKeyName() {
      java.lang.Object ref = "";
      if (keyCase_ == 7) {
        ref = key_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (keyCase_ == 7) {
          key_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The name of the encryption key that is stored in Google Cloud KMS.
     * For example:
     * &lt;pre class="lang-html"&gt;"kmsKeyName": "projects/
     * &lt;var class="apiparam"&gt;kms_project_id&lt;/var&gt;/locations/
     * &lt;var class="apiparam"&gt;region&lt;/var&gt;/keyRings/&lt;var class="apiparam"&gt;
     * key_region&lt;/var&gt;/cryptoKeys/&lt;var class="apiparam"&gt;key&lt;/var&gt;
     * &lt;/pre&gt;
     * The fully-qualifed key name may be returned for resource GET requests.
     * For example:
     * &lt;pre class="lang-html"&gt;"kmsKeyName": "projects/
     * &lt;var class="apiparam"&gt;kms_project_id&lt;/var&gt;/locations/
     * &lt;var class="apiparam"&gt;region&lt;/var&gt;/keyRings/&lt;var class="apiparam"&gt;
     * key_region&lt;/var&gt;/cryptoKeys/&lt;var class="apiparam"&gt;key&lt;/var&gt;
     * /cryptoKeyVersions/1&lt;/pre&gt;
     * </pre>
     *
     * <code>string kms_key_name = 7;</code>
     *
     * @return The bytes for kmsKeyName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKmsKeyNameBytes() {
      java.lang.Object ref = "";
      if (keyCase_ == 7) {
        ref = key_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (keyCase_ == 7) {
          key_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The name of the encryption key that is stored in Google Cloud KMS.
     * For example:
     * &lt;pre class="lang-html"&gt;"kmsKeyName": "projects/
     * &lt;var class="apiparam"&gt;kms_project_id&lt;/var&gt;/locations/
     * &lt;var class="apiparam"&gt;region&lt;/var&gt;/keyRings/&lt;var class="apiparam"&gt;
     * key_region&lt;/var&gt;/cryptoKeys/&lt;var class="apiparam"&gt;key&lt;/var&gt;
     * &lt;/pre&gt;
     * The fully-qualifed key name may be returned for resource GET requests.
     * For example:
     * &lt;pre class="lang-html"&gt;"kmsKeyName": "projects/
     * &lt;var class="apiparam"&gt;kms_project_id&lt;/var&gt;/locations/
     * &lt;var class="apiparam"&gt;region&lt;/var&gt;/keyRings/&lt;var class="apiparam"&gt;
     * key_region&lt;/var&gt;/cryptoKeys/&lt;var class="apiparam"&gt;key&lt;/var&gt;
     * /cryptoKeyVersions/1&lt;/pre&gt;
     * </pre>
     *
     * <code>string kms_key_name = 7;</code>
     *
     * @param value The kmsKeyName to set.
     * @return This builder for chaining.
     */
    public Builder setKmsKeyName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      keyCase_ = 7;
      key_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The name of the encryption key that is stored in Google Cloud KMS.
     * For example:
     * &lt;pre class="lang-html"&gt;"kmsKeyName": "projects/
     * &lt;var class="apiparam"&gt;kms_project_id&lt;/var&gt;/locations/
     * &lt;var class="apiparam"&gt;region&lt;/var&gt;/keyRings/&lt;var class="apiparam"&gt;
     * key_region&lt;/var&gt;/cryptoKeys/&lt;var class="apiparam"&gt;key&lt;/var&gt;
     * &lt;/pre&gt;
     * The fully-qualifed key name may be returned for resource GET requests.
     * For example:
     * &lt;pre class="lang-html"&gt;"kmsKeyName": "projects/
     * &lt;var class="apiparam"&gt;kms_project_id&lt;/var&gt;/locations/
     * &lt;var class="apiparam"&gt;region&lt;/var&gt;/keyRings/&lt;var class="apiparam"&gt;
     * key_region&lt;/var&gt;/cryptoKeys/&lt;var class="apiparam"&gt;key&lt;/var&gt;
     * /cryptoKeyVersions/1&lt;/pre&gt;
     * </pre>
     *
     * <code>string kms_key_name = 7;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKmsKeyName() {
      if (keyCase_ == 7) {
        keyCase_ = 0;
        key_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The name of the encryption key that is stored in Google Cloud KMS.
     * For example:
     * &lt;pre class="lang-html"&gt;"kmsKeyName": "projects/
     * &lt;var class="apiparam"&gt;kms_project_id&lt;/var&gt;/locations/
     * &lt;var class="apiparam"&gt;region&lt;/var&gt;/keyRings/&lt;var class="apiparam"&gt;
     * key_region&lt;/var&gt;/cryptoKeys/&lt;var class="apiparam"&gt;key&lt;/var&gt;
     * &lt;/pre&gt;
     * The fully-qualifed key name may be returned for resource GET requests.
     * For example:
     * &lt;pre class="lang-html"&gt;"kmsKeyName": "projects/
     * &lt;var class="apiparam"&gt;kms_project_id&lt;/var&gt;/locations/
     * &lt;var class="apiparam"&gt;region&lt;/var&gt;/keyRings/&lt;var class="apiparam"&gt;
     * key_region&lt;/var&gt;/cryptoKeys/&lt;var class="apiparam"&gt;key&lt;/var&gt;
     * /cryptoKeyVersions/1&lt;/pre&gt;
     * </pre>
     *
     * <code>string kms_key_name = 7;</code>
     *
     * @param value The bytes for kmsKeyName to set.
     * @return This builder for chaining.
     */
    public Builder setKmsKeyNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      keyCase_ = 7;
      key_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.tpu.v2alpha1.CustomerEncryptionKey)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tpu.v2alpha1.CustomerEncryptionKey)
  private static final com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey();
  }

  public static com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomerEncryptionKey> PARSER =
      new com.google.protobuf.AbstractParser<CustomerEncryptionKey>() {
        @java.lang.Override
        public CustomerEncryptionKey parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomerEncryptionKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomerEncryptionKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.CustomerEncryptionKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
