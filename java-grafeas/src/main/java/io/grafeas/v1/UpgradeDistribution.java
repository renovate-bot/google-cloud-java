/*
 * Copyright 2025 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/upgrade.proto

// Protobuf Java Version: 3.25.8
package io.grafeas.v1;

/**
 *
 *
 * <pre>
 * The Upgrade Distribution represents metadata about the Upgrade for each
 * operating system (CPE). Some distributions have additional metadata around
 * updates, classifying them into various categories and severities.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.UpgradeDistribution}
 */
public final class UpgradeDistribution extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.UpgradeDistribution)
    UpgradeDistributionOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UpgradeDistribution.newBuilder() to construct.
  private UpgradeDistribution(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpgradeDistribution() {
    cpeUri_ = "";
    classification_ = "";
    severity_ = "";
    cve_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpgradeDistribution();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1.Upgrade.internal_static_grafeas_v1_UpgradeDistribution_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.Upgrade.internal_static_grafeas_v1_UpgradeDistribution_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.UpgradeDistribution.class,
            io.grafeas.v1.UpgradeDistribution.Builder.class);
  }

  public static final int CPE_URI_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object cpeUri_ = "";

  /**
   *
   *
   * <pre>
   * Required - The specific operating system this metadata applies to. See
   * https://cpe.mitre.org/specification/.
   * </pre>
   *
   * <code>string cpe_uri = 1;</code>
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
   * Required - The specific operating system this metadata applies to. See
   * https://cpe.mitre.org/specification/.
   * </pre>
   *
   * <code>string cpe_uri = 1;</code>
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

  public static final int CLASSIFICATION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object classification_ = "";

  /**
   *
   *
   * <pre>
   * The operating system classification of this Upgrade, as specified by the
   * upstream operating system upgrade feed. For Windows the classification is
   * one of the category_ids listed at
   * https://docs.microsoft.com/en-us/previous-versions/windows/desktop/ff357803(v=vs.85)
   * </pre>
   *
   * <code>string classification = 2;</code>
   *
   * @return The classification.
   */
  @java.lang.Override
  public java.lang.String getClassification() {
    java.lang.Object ref = classification_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      classification_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The operating system classification of this Upgrade, as specified by the
   * upstream operating system upgrade feed. For Windows the classification is
   * one of the category_ids listed at
   * https://docs.microsoft.com/en-us/previous-versions/windows/desktop/ff357803(v=vs.85)
   * </pre>
   *
   * <code>string classification = 2;</code>
   *
   * @return The bytes for classification.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getClassificationBytes() {
    java.lang.Object ref = classification_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      classification_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEVERITY_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object severity_ = "";

  /**
   *
   *
   * <pre>
   * The severity as specified by the upstream operating system.
   * </pre>
   *
   * <code>string severity = 3;</code>
   *
   * @return The severity.
   */
  @java.lang.Override
  public java.lang.String getSeverity() {
    java.lang.Object ref = severity_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      severity_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The severity as specified by the upstream operating system.
   * </pre>
   *
   * <code>string severity = 3;</code>
   *
   * @return The bytes for severity.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSeverityBytes() {
    java.lang.Object ref = severity_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      severity_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CVE_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList cve_ =
      com.google.protobuf.LazyStringArrayList.emptyList();

  /**
   *
   *
   * <pre>
   * The cve tied to this Upgrade.
   * </pre>
   *
   * <code>repeated string cve = 4;</code>
   *
   * @return A list containing the cve.
   */
  public com.google.protobuf.ProtocolStringList getCveList() {
    return cve_;
  }

  /**
   *
   *
   * <pre>
   * The cve tied to this Upgrade.
   * </pre>
   *
   * <code>repeated string cve = 4;</code>
   *
   * @return The count of cve.
   */
  public int getCveCount() {
    return cve_.size();
  }

  /**
   *
   *
   * <pre>
   * The cve tied to this Upgrade.
   * </pre>
   *
   * <code>repeated string cve = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The cve at the given index.
   */
  public java.lang.String getCve(int index) {
    return cve_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The cve tied to this Upgrade.
   * </pre>
   *
   * <code>repeated string cve = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the cve at the given index.
   */
  public com.google.protobuf.ByteString getCveBytes(int index) {
    return cve_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cpeUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cpeUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classification_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, classification_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(severity_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, severity_);
    }
    for (int i = 0; i < cve_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, cve_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cpeUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cpeUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classification_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, classification_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(severity_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, severity_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < cve_.size(); i++) {
        dataSize += computeStringSizeNoTag(cve_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCveList().size();
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
    if (!(obj instanceof io.grafeas.v1.UpgradeDistribution)) {
      return super.equals(obj);
    }
    io.grafeas.v1.UpgradeDistribution other = (io.grafeas.v1.UpgradeDistribution) obj;

    if (!getCpeUri().equals(other.getCpeUri())) return false;
    if (!getClassification().equals(other.getClassification())) return false;
    if (!getSeverity().equals(other.getSeverity())) return false;
    if (!getCveList().equals(other.getCveList())) return false;
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
    hash = (37 * hash) + CPE_URI_FIELD_NUMBER;
    hash = (53 * hash) + getCpeUri().hashCode();
    hash = (37 * hash) + CLASSIFICATION_FIELD_NUMBER;
    hash = (53 * hash) + getClassification().hashCode();
    hash = (37 * hash) + SEVERITY_FIELD_NUMBER;
    hash = (53 * hash) + getSeverity().hashCode();
    if (getCveCount() > 0) {
      hash = (37 * hash) + CVE_FIELD_NUMBER;
      hash = (53 * hash) + getCveList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.UpgradeDistribution parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.UpgradeDistribution parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.UpgradeDistribution parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.UpgradeDistribution parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.UpgradeDistribution parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.UpgradeDistribution parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.UpgradeDistribution parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.UpgradeDistribution parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.UpgradeDistribution parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.UpgradeDistribution parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.UpgradeDistribution parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.UpgradeDistribution parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1.UpgradeDistribution prototype) {
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
   * The Upgrade Distribution represents metadata about the Upgrade for each
   * operating system (CPE). Some distributions have additional metadata around
   * updates, classifying them into various categories and severities.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.UpgradeDistribution}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.UpgradeDistribution)
      io.grafeas.v1.UpgradeDistributionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1.Upgrade.internal_static_grafeas_v1_UpgradeDistribution_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.Upgrade.internal_static_grafeas_v1_UpgradeDistribution_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.UpgradeDistribution.class,
              io.grafeas.v1.UpgradeDistribution.Builder.class);
    }

    // Construct using io.grafeas.v1.UpgradeDistribution.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      cpeUri_ = "";
      classification_ = "";
      severity_ = "";
      cve_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1.Upgrade.internal_static_grafeas_v1_UpgradeDistribution_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.UpgradeDistribution getDefaultInstanceForType() {
      return io.grafeas.v1.UpgradeDistribution.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.UpgradeDistribution build() {
      io.grafeas.v1.UpgradeDistribution result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.UpgradeDistribution buildPartial() {
      io.grafeas.v1.UpgradeDistribution result = new io.grafeas.v1.UpgradeDistribution(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grafeas.v1.UpgradeDistribution result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cpeUri_ = cpeUri_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.classification_ = classification_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.severity_ = severity_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        cve_.makeImmutable();
        result.cve_ = cve_;
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
      if (other instanceof io.grafeas.v1.UpgradeDistribution) {
        return mergeFrom((io.grafeas.v1.UpgradeDistribution) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.UpgradeDistribution other) {
      if (other == io.grafeas.v1.UpgradeDistribution.getDefaultInstance()) return this;
      if (!other.getCpeUri().isEmpty()) {
        cpeUri_ = other.cpeUri_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getClassification().isEmpty()) {
        classification_ = other.classification_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getSeverity().isEmpty()) {
        severity_ = other.severity_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.cve_.isEmpty()) {
        if (cve_.isEmpty()) {
          cve_ = other.cve_;
          bitField0_ |= 0x00000008;
        } else {
          ensureCveIsMutable();
          cve_.addAll(other.cve_);
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
            case 10:
              {
                cpeUri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                classification_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                severity_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 34:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureCveIsMutable();
                cve_.add(s);
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

    private java.lang.Object cpeUri_ = "";

    /**
     *
     *
     * <pre>
     * Required - The specific operating system this metadata applies to. See
     * https://cpe.mitre.org/specification/.
     * </pre>
     *
     * <code>string cpe_uri = 1;</code>
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
     * Required - The specific operating system this metadata applies to. See
     * https://cpe.mitre.org/specification/.
     * </pre>
     *
     * <code>string cpe_uri = 1;</code>
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
     * Required - The specific operating system this metadata applies to. See
     * https://cpe.mitre.org/specification/.
     * </pre>
     *
     * <code>string cpe_uri = 1;</code>
     *
     * @param value The cpeUri to set.
     * @return This builder for chaining.
     */
    public Builder setCpeUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      cpeUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required - The specific operating system this metadata applies to. See
     * https://cpe.mitre.org/specification/.
     * </pre>
     *
     * <code>string cpe_uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCpeUri() {
      cpeUri_ = getDefaultInstance().getCpeUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required - The specific operating system this metadata applies to. See
     * https://cpe.mitre.org/specification/.
     * </pre>
     *
     * <code>string cpe_uri = 1;</code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object classification_ = "";

    /**
     *
     *
     * <pre>
     * The operating system classification of this Upgrade, as specified by the
     * upstream operating system upgrade feed. For Windows the classification is
     * one of the category_ids listed at
     * https://docs.microsoft.com/en-us/previous-versions/windows/desktop/ff357803(v=vs.85)
     * </pre>
     *
     * <code>string classification = 2;</code>
     *
     * @return The classification.
     */
    public java.lang.String getClassification() {
      java.lang.Object ref = classification_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        classification_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The operating system classification of this Upgrade, as specified by the
     * upstream operating system upgrade feed. For Windows the classification is
     * one of the category_ids listed at
     * https://docs.microsoft.com/en-us/previous-versions/windows/desktop/ff357803(v=vs.85)
     * </pre>
     *
     * <code>string classification = 2;</code>
     *
     * @return The bytes for classification.
     */
    public com.google.protobuf.ByteString getClassificationBytes() {
      java.lang.Object ref = classification_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        classification_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The operating system classification of this Upgrade, as specified by the
     * upstream operating system upgrade feed. For Windows the classification is
     * one of the category_ids listed at
     * https://docs.microsoft.com/en-us/previous-versions/windows/desktop/ff357803(v=vs.85)
     * </pre>
     *
     * <code>string classification = 2;</code>
     *
     * @param value The classification to set.
     * @return This builder for chaining.
     */
    public Builder setClassification(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      classification_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The operating system classification of this Upgrade, as specified by the
     * upstream operating system upgrade feed. For Windows the classification is
     * one of the category_ids listed at
     * https://docs.microsoft.com/en-us/previous-versions/windows/desktop/ff357803(v=vs.85)
     * </pre>
     *
     * <code>string classification = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearClassification() {
      classification_ = getDefaultInstance().getClassification();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The operating system classification of this Upgrade, as specified by the
     * upstream operating system upgrade feed. For Windows the classification is
     * one of the category_ids listed at
     * https://docs.microsoft.com/en-us/previous-versions/windows/desktop/ff357803(v=vs.85)
     * </pre>
     *
     * <code>string classification = 2;</code>
     *
     * @param value The bytes for classification to set.
     * @return This builder for chaining.
     */
    public Builder setClassificationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      classification_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object severity_ = "";

    /**
     *
     *
     * <pre>
     * The severity as specified by the upstream operating system.
     * </pre>
     *
     * <code>string severity = 3;</code>
     *
     * @return The severity.
     */
    public java.lang.String getSeverity() {
      java.lang.Object ref = severity_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        severity_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The severity as specified by the upstream operating system.
     * </pre>
     *
     * <code>string severity = 3;</code>
     *
     * @return The bytes for severity.
     */
    public com.google.protobuf.ByteString getSeverityBytes() {
      java.lang.Object ref = severity_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        severity_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The severity as specified by the upstream operating system.
     * </pre>
     *
     * <code>string severity = 3;</code>
     *
     * @param value The severity to set.
     * @return This builder for chaining.
     */
    public Builder setSeverity(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      severity_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The severity as specified by the upstream operating system.
     * </pre>
     *
     * <code>string severity = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSeverity() {
      severity_ = getDefaultInstance().getSeverity();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The severity as specified by the upstream operating system.
     * </pre>
     *
     * <code>string severity = 3;</code>
     *
     * @param value The bytes for severity to set.
     * @return This builder for chaining.
     */
    public Builder setSeverityBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      severity_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList cve_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureCveIsMutable() {
      if (!cve_.isModifiable()) {
        cve_ = new com.google.protobuf.LazyStringArrayList(cve_);
      }
      bitField0_ |= 0x00000008;
    }

    /**
     *
     *
     * <pre>
     * The cve tied to this Upgrade.
     * </pre>
     *
     * <code>repeated string cve = 4;</code>
     *
     * @return A list containing the cve.
     */
    public com.google.protobuf.ProtocolStringList getCveList() {
      cve_.makeImmutable();
      return cve_;
    }

    /**
     *
     *
     * <pre>
     * The cve tied to this Upgrade.
     * </pre>
     *
     * <code>repeated string cve = 4;</code>
     *
     * @return The count of cve.
     */
    public int getCveCount() {
      return cve_.size();
    }

    /**
     *
     *
     * <pre>
     * The cve tied to this Upgrade.
     * </pre>
     *
     * <code>repeated string cve = 4;</code>
     *
     * @param index The index of the element to return.
     * @return The cve at the given index.
     */
    public java.lang.String getCve(int index) {
      return cve_.get(index);
    }

    /**
     *
     *
     * <pre>
     * The cve tied to this Upgrade.
     * </pre>
     *
     * <code>repeated string cve = 4;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the cve at the given index.
     */
    public com.google.protobuf.ByteString getCveBytes(int index) {
      return cve_.getByteString(index);
    }

    /**
     *
     *
     * <pre>
     * The cve tied to this Upgrade.
     * </pre>
     *
     * <code>repeated string cve = 4;</code>
     *
     * @param index The index to set the value at.
     * @param value The cve to set.
     * @return This builder for chaining.
     */
    public Builder setCve(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCveIsMutable();
      cve_.set(index, value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The cve tied to this Upgrade.
     * </pre>
     *
     * <code>repeated string cve = 4;</code>
     *
     * @param value The cve to add.
     * @return This builder for chaining.
     */
    public Builder addCve(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCveIsMutable();
      cve_.add(value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The cve tied to this Upgrade.
     * </pre>
     *
     * <code>repeated string cve = 4;</code>
     *
     * @param values The cve to add.
     * @return This builder for chaining.
     */
    public Builder addAllCve(java.lang.Iterable<java.lang.String> values) {
      ensureCveIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, cve_);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The cve tied to this Upgrade.
     * </pre>
     *
     * <code>repeated string cve = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCve() {
      cve_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);
      ;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The cve tied to this Upgrade.
     * </pre>
     *
     * <code>repeated string cve = 4;</code>
     *
     * @param value The bytes of the cve to add.
     * @return This builder for chaining.
     */
    public Builder addCveBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureCveIsMutable();
      cve_.add(value);
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1.UpgradeDistribution)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.UpgradeDistribution)
  private static final io.grafeas.v1.UpgradeDistribution DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.UpgradeDistribution();
  }

  public static io.grafeas.v1.UpgradeDistribution getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpgradeDistribution> PARSER =
      new com.google.protobuf.AbstractParser<UpgradeDistribution>() {
        @java.lang.Override
        public UpgradeDistribution parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpgradeDistribution> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpgradeDistribution> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.UpgradeDistribution getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
