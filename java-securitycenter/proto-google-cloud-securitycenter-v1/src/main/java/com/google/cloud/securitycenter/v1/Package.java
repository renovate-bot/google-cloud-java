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
// source: google/cloud/securitycenter/v1/vulnerability.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v1;

/**
 *
 *
 * <pre>
 * Package is a generic definition of a package.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.Package}
 */
public final class Package extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.Package)
    PackageOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Package.newBuilder() to construct.
  private Package(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Package() {
    packageName_ = "";
    cpeUri_ = "";
    packageType_ = "";
    packageVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Package();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1.VulnerabilityProto
        .internal_static_google_cloud_securitycenter_v1_Package_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.VulnerabilityProto
        .internal_static_google_cloud_securitycenter_v1_Package_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.Package.class,
            com.google.cloud.securitycenter.v1.Package.Builder.class);
  }

  public static final int PACKAGE_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object packageName_ = "";

  /**
   *
   *
   * <pre>
   * The name of the package where the vulnerability was detected.
   * </pre>
   *
   * <code>string package_name = 1;</code>
   *
   * @return The packageName.
   */
  @java.lang.Override
  public java.lang.String getPackageName() {
    java.lang.Object ref = packageName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      packageName_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The name of the package where the vulnerability was detected.
   * </pre>
   *
   * <code>string package_name = 1;</code>
   *
   * @return The bytes for packageName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPackageNameBytes() {
    java.lang.Object ref = packageName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      packageName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CPE_URI_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object cpeUri_ = "";

  /**
   *
   *
   * <pre>
   * The CPE URI where the vulnerability was detected.
   * </pre>
   *
   * <code>string cpe_uri = 2;</code>
   *
   * @return The cpeUri.
   */
  @java.lang.Override
  public java.lang.String getCpeUri() {
    java.lang.Object ref = cpeUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cpeUri_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The CPE URI where the vulnerability was detected.
   * </pre>
   *
   * <code>string cpe_uri = 2;</code>
   *
   * @return The bytes for cpeUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCpeUriBytes() {
    java.lang.Object ref = cpeUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      cpeUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PACKAGE_TYPE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object packageType_ = "";

  /**
   *
   *
   * <pre>
   * Type of package, for example, os, maven, or go.
   * </pre>
   *
   * <code>string package_type = 3;</code>
   *
   * @return The packageType.
   */
  @java.lang.Override
  public java.lang.String getPackageType() {
    java.lang.Object ref = packageType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      packageType_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Type of package, for example, os, maven, or go.
   * </pre>
   *
   * <code>string package_type = 3;</code>
   *
   * @return The bytes for packageType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPackageTypeBytes() {
    java.lang.Object ref = packageType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      packageType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PACKAGE_VERSION_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object packageVersion_ = "";

  /**
   *
   *
   * <pre>
   * The version of the package.
   * </pre>
   *
   * <code>string package_version = 4;</code>
   *
   * @return The packageVersion.
   */
  @java.lang.Override
  public java.lang.String getPackageVersion() {
    java.lang.Object ref = packageVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      packageVersion_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The version of the package.
   * </pre>
   *
   * <code>string package_version = 4;</code>
   *
   * @return The bytes for packageVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPackageVersionBytes() {
    java.lang.Object ref = packageVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      packageVersion_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(packageName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, packageName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cpeUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cpeUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(packageType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, packageType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(packageVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, packageVersion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(packageName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, packageName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cpeUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cpeUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(packageType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, packageType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(packageVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, packageVersion_);
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.Package)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.Package other =
        (com.google.cloud.securitycenter.v1.Package) obj;

    if (!getPackageName().equals(other.getPackageName())) return false;
    if (!getCpeUri().equals(other.getCpeUri())) return false;
    if (!getPackageType().equals(other.getPackageType())) return false;
    if (!getPackageVersion().equals(other.getPackageVersion())) return false;
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
    hash = (37 * hash) + PACKAGE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPackageName().hashCode();
    hash = (37 * hash) + CPE_URI_FIELD_NUMBER;
    hash = (53 * hash) + getCpeUri().hashCode();
    hash = (37 * hash) + PACKAGE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getPackageType().hashCode();
    hash = (37 * hash) + PACKAGE_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getPackageVersion().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.Package parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.Package parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.Package parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.Package parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.Package parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.Package parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.Package parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.Package parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.Package parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.Package parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.Package parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.Package parseFrom(
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

  public static Builder newBuilder(com.google.cloud.securitycenter.v1.Package prototype) {
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
   * Package is a generic definition of a package.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.Package}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.Package)
      com.google.cloud.securitycenter.v1.PackageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1.VulnerabilityProto
          .internal_static_google_cloud_securitycenter_v1_Package_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.VulnerabilityProto
          .internal_static_google_cloud_securitycenter_v1_Package_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.Package.class,
              com.google.cloud.securitycenter.v1.Package.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1.Package.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      packageName_ = "";
      cpeUri_ = "";
      packageType_ = "";
      packageVersion_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.VulnerabilityProto
          .internal_static_google_cloud_securitycenter_v1_Package_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.Package getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.Package.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.Package build() {
      com.google.cloud.securitycenter.v1.Package result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.Package buildPartial() {
      com.google.cloud.securitycenter.v1.Package result =
          new com.google.cloud.securitycenter.v1.Package(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v1.Package result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.packageName_ = packageName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cpeUri_ = cpeUri_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.packageType_ = packageType_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.packageVersion_ = packageVersion_;
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
      if (other instanceof com.google.cloud.securitycenter.v1.Package) {
        return mergeFrom((com.google.cloud.securitycenter.v1.Package) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1.Package other) {
      if (other == com.google.cloud.securitycenter.v1.Package.getDefaultInstance()) return this;
      if (!other.getPackageName().isEmpty()) {
        packageName_ = other.packageName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCpeUri().isEmpty()) {
        cpeUri_ = other.cpeUri_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getPackageType().isEmpty()) {
        packageType_ = other.packageType_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getPackageVersion().isEmpty()) {
        packageVersion_ = other.packageVersion_;
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
            case 10:
              {
                packageName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                cpeUri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                packageType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 34:
              {
                packageVersion_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

    private java.lang.Object packageName_ = "";

    /**
     *
     *
     * <pre>
     * The name of the package where the vulnerability was detected.
     * </pre>
     *
     * <code>string package_name = 1;</code>
     *
     * @return The packageName.
     */
    public java.lang.String getPackageName() {
      java.lang.Object ref = packageName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        packageName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The name of the package where the vulnerability was detected.
     * </pre>
     *
     * <code>string package_name = 1;</code>
     *
     * @return The bytes for packageName.
     */
    public com.google.protobuf.ByteString getPackageNameBytes() {
      java.lang.Object ref = packageName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        packageName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The name of the package where the vulnerability was detected.
     * </pre>
     *
     * <code>string package_name = 1;</code>
     *
     * @param value The packageName to set.
     * @return This builder for chaining.
     */
    public Builder setPackageName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      packageName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The name of the package where the vulnerability was detected.
     * </pre>
     *
     * <code>string package_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPackageName() {
      packageName_ = getDefaultInstance().getPackageName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The name of the package where the vulnerability was detected.
     * </pre>
     *
     * <code>string package_name = 1;</code>
     *
     * @param value The bytes for packageName to set.
     * @return This builder for chaining.
     */
    public Builder setPackageNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      packageName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object cpeUri_ = "";

    /**
     *
     *
     * <pre>
     * The CPE URI where the vulnerability was detected.
     * </pre>
     *
     * <code>string cpe_uri = 2;</code>
     *
     * @return The cpeUri.
     */
    public java.lang.String getCpeUri() {
      java.lang.Object ref = cpeUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cpeUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The CPE URI where the vulnerability was detected.
     * </pre>
     *
     * <code>string cpe_uri = 2;</code>
     *
     * @return The bytes for cpeUri.
     */
    public com.google.protobuf.ByteString getCpeUriBytes() {
      java.lang.Object ref = cpeUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        cpeUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The CPE URI where the vulnerability was detected.
     * </pre>
     *
     * <code>string cpe_uri = 2;</code>
     *
     * @param value The cpeUri to set.
     * @return This builder for chaining.
     */
    public Builder setCpeUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      cpeUri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The CPE URI where the vulnerability was detected.
     * </pre>
     *
     * <code>string cpe_uri = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCpeUri() {
      cpeUri_ = getDefaultInstance().getCpeUri();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The CPE URI where the vulnerability was detected.
     * </pre>
     *
     * <code>string cpe_uri = 2;</code>
     *
     * @param value The bytes for cpeUri to set.
     * @return This builder for chaining.
     */
    public Builder setCpeUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      cpeUri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object packageType_ = "";

    /**
     *
     *
     * <pre>
     * Type of package, for example, os, maven, or go.
     * </pre>
     *
     * <code>string package_type = 3;</code>
     *
     * @return The packageType.
     */
    public java.lang.String getPackageType() {
      java.lang.Object ref = packageType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        packageType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Type of package, for example, os, maven, or go.
     * </pre>
     *
     * <code>string package_type = 3;</code>
     *
     * @return The bytes for packageType.
     */
    public com.google.protobuf.ByteString getPackageTypeBytes() {
      java.lang.Object ref = packageType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        packageType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Type of package, for example, os, maven, or go.
     * </pre>
     *
     * <code>string package_type = 3;</code>
     *
     * @param value The packageType to set.
     * @return This builder for chaining.
     */
    public Builder setPackageType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      packageType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Type of package, for example, os, maven, or go.
     * </pre>
     *
     * <code>string package_type = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPackageType() {
      packageType_ = getDefaultInstance().getPackageType();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Type of package, for example, os, maven, or go.
     * </pre>
     *
     * <code>string package_type = 3;</code>
     *
     * @param value The bytes for packageType to set.
     * @return This builder for chaining.
     */
    public Builder setPackageTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      packageType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object packageVersion_ = "";

    /**
     *
     *
     * <pre>
     * The version of the package.
     * </pre>
     *
     * <code>string package_version = 4;</code>
     *
     * @return The packageVersion.
     */
    public java.lang.String getPackageVersion() {
      java.lang.Object ref = packageVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        packageVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The version of the package.
     * </pre>
     *
     * <code>string package_version = 4;</code>
     *
     * @return The bytes for packageVersion.
     */
    public com.google.protobuf.ByteString getPackageVersionBytes() {
      java.lang.Object ref = packageVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        packageVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The version of the package.
     * </pre>
     *
     * <code>string package_version = 4;</code>
     *
     * @param value The packageVersion to set.
     * @return This builder for chaining.
     */
    public Builder setPackageVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      packageVersion_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The version of the package.
     * </pre>
     *
     * <code>string package_version = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPackageVersion() {
      packageVersion_ = getDefaultInstance().getPackageVersion();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The version of the package.
     * </pre>
     *
     * <code>string package_version = 4;</code>
     *
     * @param value The bytes for packageVersion to set.
     * @return This builder for chaining.
     */
    public Builder setPackageVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      packageVersion_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.Package)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.Package)
  private static final com.google.cloud.securitycenter.v1.Package DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.Package();
  }

  public static com.google.cloud.securitycenter.v1.Package getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Package> PARSER =
      new com.google.protobuf.AbstractParser<Package>() {
        @java.lang.Override
        public Package parsePartialFrom(
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

  public static com.google.protobuf.Parser<Package> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Package> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.Package getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
