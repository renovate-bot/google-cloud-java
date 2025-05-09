/*
 * Copyright 2024 Google LLC
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
// source: google/shopping/merchant/notifications/v1beta/notificationsapi.proto

// Protobuf Java Version: 3.25.3
package com.google.shopping.merchant.notifications.v1beta;

/**
 *
 *
 * <pre>
 * The change that happened to the product including old value, new value,
 * country code as the region code and reporting context.
 * </pre>
 *
 * Protobuf type {@code google.shopping.merchant.notifications.v1beta.ProductChange}
 */
public final class ProductChange extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.shopping.merchant.notifications.v1beta.ProductChange)
    ProductChangeOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ProductChange.newBuilder() to construct.
  private ProductChange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProductChange() {
    oldValue_ = "";
    newValue_ = "";
    regionCode_ = "";
    reportingContext_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ProductChange();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.shopping.merchant.notifications.v1beta.NotificationsApiProto
        .internal_static_google_shopping_merchant_notifications_v1beta_ProductChange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.merchant.notifications.v1beta.NotificationsApiProto
        .internal_static_google_shopping_merchant_notifications_v1beta_ProductChange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.merchant.notifications.v1beta.ProductChange.class,
            com.google.shopping.merchant.notifications.v1beta.ProductChange.Builder.class);
  }

  private int bitField0_;
  public static final int OLD_VALUE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object oldValue_ = "";

  /**
   *
   *
   * <pre>
   * The old value of the changed resource or attribute.
   * </pre>
   *
   * <code>optional string old_value = 1;</code>
   *
   * @return Whether the oldValue field is set.
   */
  @java.lang.Override
  public boolean hasOldValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The old value of the changed resource or attribute.
   * </pre>
   *
   * <code>optional string old_value = 1;</code>
   *
   * @return The oldValue.
   */
  @java.lang.Override
  public java.lang.String getOldValue() {
    java.lang.Object ref = oldValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oldValue_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The old value of the changed resource or attribute.
   * </pre>
   *
   * <code>optional string old_value = 1;</code>
   *
   * @return The bytes for oldValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOldValueBytes() {
    java.lang.Object ref = oldValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      oldValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEW_VALUE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object newValue_ = "";

  /**
   *
   *
   * <pre>
   * The new value of the changed resource or attribute.
   * </pre>
   *
   * <code>optional string new_value = 2;</code>
   *
   * @return Whether the newValue field is set.
   */
  @java.lang.Override
  public boolean hasNewValue() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * The new value of the changed resource or attribute.
   * </pre>
   *
   * <code>optional string new_value = 2;</code>
   *
   * @return The newValue.
   */
  @java.lang.Override
  public java.lang.String getNewValue() {
    java.lang.Object ref = newValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newValue_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The new value of the changed resource or attribute.
   * </pre>
   *
   * <code>optional string new_value = 2;</code>
   *
   * @return The bytes for newValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNewValueBytes() {
    java.lang.Object ref = newValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      newValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REGION_CODE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object regionCode_ = "";

  /**
   *
   *
   * <pre>
   * Countries that have the change (if applicable)
   * </pre>
   *
   * <code>optional string region_code = 3;</code>
   *
   * @return Whether the regionCode field is set.
   */
  @java.lang.Override
  public boolean hasRegionCode() {
    return ((bitField0_ & 0x00000004) != 0);
  }

  /**
   *
   *
   * <pre>
   * Countries that have the change (if applicable)
   * </pre>
   *
   * <code>optional string region_code = 3;</code>
   *
   * @return The regionCode.
   */
  @java.lang.Override
  public java.lang.String getRegionCode() {
    java.lang.Object ref = regionCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      regionCode_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Countries that have the change (if applicable)
   * </pre>
   *
   * <code>optional string region_code = 3;</code>
   *
   * @return The bytes for regionCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRegionCodeBytes() {
    java.lang.Object ref = regionCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      regionCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REPORTING_CONTEXT_FIELD_NUMBER = 4;
  private int reportingContext_ = 0;

  /**
   *
   *
   * <pre>
   * Reporting contexts that have the change (if applicable)
   * </pre>
   *
   * <code>
   * optional .google.shopping.type.ReportingContext.ReportingContextEnum reporting_context = 4;
   * </code>
   *
   * @return Whether the reportingContext field is set.
   */
  @java.lang.Override
  public boolean hasReportingContext() {
    return ((bitField0_ & 0x00000008) != 0);
  }

  /**
   *
   *
   * <pre>
   * Reporting contexts that have the change (if applicable)
   * </pre>
   *
   * <code>
   * optional .google.shopping.type.ReportingContext.ReportingContextEnum reporting_context = 4;
   * </code>
   *
   * @return The enum numeric value on the wire for reportingContext.
   */
  @java.lang.Override
  public int getReportingContextValue() {
    return reportingContext_;
  }

  /**
   *
   *
   * <pre>
   * Reporting contexts that have the change (if applicable)
   * </pre>
   *
   * <code>
   * optional .google.shopping.type.ReportingContext.ReportingContextEnum reporting_context = 4;
   * </code>
   *
   * @return The reportingContext.
   */
  @java.lang.Override
  public com.google.shopping.type.ReportingContext.ReportingContextEnum getReportingContext() {
    com.google.shopping.type.ReportingContext.ReportingContextEnum result =
        com.google.shopping.type.ReportingContext.ReportingContextEnum.forNumber(reportingContext_);
    return result == null
        ? com.google.shopping.type.ReportingContext.ReportingContextEnum.UNRECOGNIZED
        : result;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, oldValue_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, newValue_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, regionCode_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeEnum(4, reportingContext_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, oldValue_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, newValue_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, regionCode_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, reportingContext_);
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
    if (!(obj instanceof com.google.shopping.merchant.notifications.v1beta.ProductChange)) {
      return super.equals(obj);
    }
    com.google.shopping.merchant.notifications.v1beta.ProductChange other =
        (com.google.shopping.merchant.notifications.v1beta.ProductChange) obj;

    if (hasOldValue() != other.hasOldValue()) return false;
    if (hasOldValue()) {
      if (!getOldValue().equals(other.getOldValue())) return false;
    }
    if (hasNewValue() != other.hasNewValue()) return false;
    if (hasNewValue()) {
      if (!getNewValue().equals(other.getNewValue())) return false;
    }
    if (hasRegionCode() != other.hasRegionCode()) return false;
    if (hasRegionCode()) {
      if (!getRegionCode().equals(other.getRegionCode())) return false;
    }
    if (hasReportingContext() != other.hasReportingContext()) return false;
    if (hasReportingContext()) {
      if (reportingContext_ != other.reportingContext_) return false;
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
    if (hasOldValue()) {
      hash = (37 * hash) + OLD_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getOldValue().hashCode();
    }
    if (hasNewValue()) {
      hash = (37 * hash) + NEW_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getNewValue().hashCode();
    }
    if (hasRegionCode()) {
      hash = (37 * hash) + REGION_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getRegionCode().hashCode();
    }
    if (hasReportingContext()) {
      hash = (37 * hash) + REPORTING_CONTEXT_FIELD_NUMBER;
      hash = (53 * hash) + reportingContext_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.merchant.notifications.v1beta.ProductChange parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.notifications.v1beta.ProductChange parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.notifications.v1beta.ProductChange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.notifications.v1beta.ProductChange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.notifications.v1beta.ProductChange parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.notifications.v1beta.ProductChange parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.notifications.v1beta.ProductChange parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.notifications.v1beta.ProductChange parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.notifications.v1beta.ProductChange parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.notifications.v1beta.ProductChange parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.notifications.v1beta.ProductChange parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.notifications.v1beta.ProductChange parseFrom(
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
      com.google.shopping.merchant.notifications.v1beta.ProductChange prototype) {
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
   * The change that happened to the product including old value, new value,
   * country code as the region code and reporting context.
   * </pre>
   *
   * Protobuf type {@code google.shopping.merchant.notifications.v1beta.ProductChange}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.shopping.merchant.notifications.v1beta.ProductChange)
      com.google.shopping.merchant.notifications.v1beta.ProductChangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.shopping.merchant.notifications.v1beta.NotificationsApiProto
          .internal_static_google_shopping_merchant_notifications_v1beta_ProductChange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.merchant.notifications.v1beta.NotificationsApiProto
          .internal_static_google_shopping_merchant_notifications_v1beta_ProductChange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.merchant.notifications.v1beta.ProductChange.class,
              com.google.shopping.merchant.notifications.v1beta.ProductChange.Builder.class);
    }

    // Construct using com.google.shopping.merchant.notifications.v1beta.ProductChange.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      oldValue_ = "";
      newValue_ = "";
      regionCode_ = "";
      reportingContext_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.shopping.merchant.notifications.v1beta.NotificationsApiProto
          .internal_static_google_shopping_merchant_notifications_v1beta_ProductChange_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.merchant.notifications.v1beta.ProductChange
        getDefaultInstanceForType() {
      return com.google.shopping.merchant.notifications.v1beta.ProductChange.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.merchant.notifications.v1beta.ProductChange build() {
      com.google.shopping.merchant.notifications.v1beta.ProductChange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.merchant.notifications.v1beta.ProductChange buildPartial() {
      com.google.shopping.merchant.notifications.v1beta.ProductChange result =
          new com.google.shopping.merchant.notifications.v1beta.ProductChange(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.shopping.merchant.notifications.v1beta.ProductChange result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.oldValue_ = oldValue_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.newValue_ = newValue_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.regionCode_ = regionCode_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.reportingContext_ = reportingContext_;
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
      if (other instanceof com.google.shopping.merchant.notifications.v1beta.ProductChange) {
        return mergeFrom((com.google.shopping.merchant.notifications.v1beta.ProductChange) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.shopping.merchant.notifications.v1beta.ProductChange other) {
      if (other
          == com.google.shopping.merchant.notifications.v1beta.ProductChange.getDefaultInstance())
        return this;
      if (other.hasOldValue()) {
        oldValue_ = other.oldValue_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasNewValue()) {
        newValue_ = other.newValue_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasRegionCode()) {
        regionCode_ = other.regionCode_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasReportingContext()) {
        setReportingContext(other.getReportingContext());
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
                oldValue_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                newValue_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                regionCode_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 32:
              {
                reportingContext_ = input.readEnum();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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

    private java.lang.Object oldValue_ = "";

    /**
     *
     *
     * <pre>
     * The old value of the changed resource or attribute.
     * </pre>
     *
     * <code>optional string old_value = 1;</code>
     *
     * @return Whether the oldValue field is set.
     */
    public boolean hasOldValue() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * The old value of the changed resource or attribute.
     * </pre>
     *
     * <code>optional string old_value = 1;</code>
     *
     * @return The oldValue.
     */
    public java.lang.String getOldValue() {
      java.lang.Object ref = oldValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oldValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The old value of the changed resource or attribute.
     * </pre>
     *
     * <code>optional string old_value = 1;</code>
     *
     * @return The bytes for oldValue.
     */
    public com.google.protobuf.ByteString getOldValueBytes() {
      java.lang.Object ref = oldValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        oldValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The old value of the changed resource or attribute.
     * </pre>
     *
     * <code>optional string old_value = 1;</code>
     *
     * @param value The oldValue to set.
     * @return This builder for chaining.
     */
    public Builder setOldValue(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      oldValue_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The old value of the changed resource or attribute.
     * </pre>
     *
     * <code>optional string old_value = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOldValue() {
      oldValue_ = getDefaultInstance().getOldValue();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The old value of the changed resource or attribute.
     * </pre>
     *
     * <code>optional string old_value = 1;</code>
     *
     * @param value The bytes for oldValue to set.
     * @return This builder for chaining.
     */
    public Builder setOldValueBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      oldValue_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object newValue_ = "";

    /**
     *
     *
     * <pre>
     * The new value of the changed resource or attribute.
     * </pre>
     *
     * <code>optional string new_value = 2;</code>
     *
     * @return Whether the newValue field is set.
     */
    public boolean hasNewValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * The new value of the changed resource or attribute.
     * </pre>
     *
     * <code>optional string new_value = 2;</code>
     *
     * @return The newValue.
     */
    public java.lang.String getNewValue() {
      java.lang.Object ref = newValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The new value of the changed resource or attribute.
     * </pre>
     *
     * <code>optional string new_value = 2;</code>
     *
     * @return The bytes for newValue.
     */
    public com.google.protobuf.ByteString getNewValueBytes() {
      java.lang.Object ref = newValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        newValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The new value of the changed resource or attribute.
     * </pre>
     *
     * <code>optional string new_value = 2;</code>
     *
     * @param value The newValue to set.
     * @return This builder for chaining.
     */
    public Builder setNewValue(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      newValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The new value of the changed resource or attribute.
     * </pre>
     *
     * <code>optional string new_value = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNewValue() {
      newValue_ = getDefaultInstance().getNewValue();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The new value of the changed resource or attribute.
     * </pre>
     *
     * <code>optional string new_value = 2;</code>
     *
     * @param value The bytes for newValue to set.
     * @return This builder for chaining.
     */
    public Builder setNewValueBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      newValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object regionCode_ = "";

    /**
     *
     *
     * <pre>
     * Countries that have the change (if applicable)
     * </pre>
     *
     * <code>optional string region_code = 3;</code>
     *
     * @return Whether the regionCode field is set.
     */
    public boolean hasRegionCode() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Countries that have the change (if applicable)
     * </pre>
     *
     * <code>optional string region_code = 3;</code>
     *
     * @return The regionCode.
     */
    public java.lang.String getRegionCode() {
      java.lang.Object ref = regionCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        regionCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Countries that have the change (if applicable)
     * </pre>
     *
     * <code>optional string region_code = 3;</code>
     *
     * @return The bytes for regionCode.
     */
    public com.google.protobuf.ByteString getRegionCodeBytes() {
      java.lang.Object ref = regionCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        regionCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Countries that have the change (if applicable)
     * </pre>
     *
     * <code>optional string region_code = 3;</code>
     *
     * @param value The regionCode to set.
     * @return This builder for chaining.
     */
    public Builder setRegionCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      regionCode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Countries that have the change (if applicable)
     * </pre>
     *
     * <code>optional string region_code = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRegionCode() {
      regionCode_ = getDefaultInstance().getRegionCode();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Countries that have the change (if applicable)
     * </pre>
     *
     * <code>optional string region_code = 3;</code>
     *
     * @param value The bytes for regionCode to set.
     * @return This builder for chaining.
     */
    public Builder setRegionCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      regionCode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int reportingContext_ = 0;

    /**
     *
     *
     * <pre>
     * Reporting contexts that have the change (if applicable)
     * </pre>
     *
     * <code>
     * optional .google.shopping.type.ReportingContext.ReportingContextEnum reporting_context = 4;
     * </code>
     *
     * @return Whether the reportingContext field is set.
     */
    @java.lang.Override
    public boolean hasReportingContext() {
      return ((bitField0_ & 0x00000008) != 0);
    }

    /**
     *
     *
     * <pre>
     * Reporting contexts that have the change (if applicable)
     * </pre>
     *
     * <code>
     * optional .google.shopping.type.ReportingContext.ReportingContextEnum reporting_context = 4;
     * </code>
     *
     * @return The enum numeric value on the wire for reportingContext.
     */
    @java.lang.Override
    public int getReportingContextValue() {
      return reportingContext_;
    }

    /**
     *
     *
     * <pre>
     * Reporting contexts that have the change (if applicable)
     * </pre>
     *
     * <code>
     * optional .google.shopping.type.ReportingContext.ReportingContextEnum reporting_context = 4;
     * </code>
     *
     * @param value The enum numeric value on the wire for reportingContext to set.
     * @return This builder for chaining.
     */
    public Builder setReportingContextValue(int value) {
      reportingContext_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Reporting contexts that have the change (if applicable)
     * </pre>
     *
     * <code>
     * optional .google.shopping.type.ReportingContext.ReportingContextEnum reporting_context = 4;
     * </code>
     *
     * @return The reportingContext.
     */
    @java.lang.Override
    public com.google.shopping.type.ReportingContext.ReportingContextEnum getReportingContext() {
      com.google.shopping.type.ReportingContext.ReportingContextEnum result =
          com.google.shopping.type.ReportingContext.ReportingContextEnum.forNumber(
              reportingContext_);
      return result == null
          ? com.google.shopping.type.ReportingContext.ReportingContextEnum.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * Reporting contexts that have the change (if applicable)
     * </pre>
     *
     * <code>
     * optional .google.shopping.type.ReportingContext.ReportingContextEnum reporting_context = 4;
     * </code>
     *
     * @param value The reportingContext to set.
     * @return This builder for chaining.
     */
    public Builder setReportingContext(
        com.google.shopping.type.ReportingContext.ReportingContextEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      reportingContext_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Reporting contexts that have the change (if applicable)
     * </pre>
     *
     * <code>
     * optional .google.shopping.type.ReportingContext.ReportingContextEnum reporting_context = 4;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearReportingContext() {
      bitField0_ = (bitField0_ & ~0x00000008);
      reportingContext_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.shopping.merchant.notifications.v1beta.ProductChange)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.merchant.notifications.v1beta.ProductChange)
  private static final com.google.shopping.merchant.notifications.v1beta.ProductChange
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.shopping.merchant.notifications.v1beta.ProductChange();
  }

  public static com.google.shopping.merchant.notifications.v1beta.ProductChange
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductChange> PARSER =
      new com.google.protobuf.AbstractParser<ProductChange>() {
        @java.lang.Override
        public ProductChange parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProductChange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductChange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.merchant.notifications.v1beta.ProductChange
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
