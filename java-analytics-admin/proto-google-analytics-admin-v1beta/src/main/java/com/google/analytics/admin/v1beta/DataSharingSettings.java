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
// source: google/analytics/admin/v1beta/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.admin.v1beta;

/**
 *
 *
 * <pre>
 * A resource message representing data sharing settings of a Google Analytics
 * account.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1beta.DataSharingSettings}
 */
public final class DataSharingSettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1beta.DataSharingSettings)
    DataSharingSettingsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use DataSharingSettings.newBuilder() to construct.
  private DataSharingSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataSharingSettings() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataSharingSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1beta.ResourcesProto
        .internal_static_google_analytics_admin_v1beta_DataSharingSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1beta.ResourcesProto
        .internal_static_google_analytics_admin_v1beta_DataSharingSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1beta.DataSharingSettings.class,
            com.google.analytics.admin.v1beta.DataSharingSettings.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * Output only. Resource name.
   * Format: accounts/{account}/dataSharingSettings
   * Example: "accounts/1000/dataSharingSettings"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
   * Output only. Resource name.
   * Format: accounts/{account}/dataSharingSettings
   * Example: "accounts/1000/dataSharingSettings"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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

  public static final int SHARING_WITH_GOOGLE_SUPPORT_ENABLED_FIELD_NUMBER = 2;
  private boolean sharingWithGoogleSupportEnabled_ = false;

  /**
   *
   *
   * <pre>
   * Allows Google support to access the data in order to help troubleshoot
   * issues.
   * </pre>
   *
   * <code>bool sharing_with_google_support_enabled = 2;</code>
   *
   * @return The sharingWithGoogleSupportEnabled.
   */
  @java.lang.Override
  public boolean getSharingWithGoogleSupportEnabled() {
    return sharingWithGoogleSupportEnabled_;
  }

  public static final int SHARING_WITH_GOOGLE_ASSIGNED_SALES_ENABLED_FIELD_NUMBER = 3;
  private boolean sharingWithGoogleAssignedSalesEnabled_ = false;

  /**
   *
   *
   * <pre>
   * Allows Google sales teams that are assigned to the customer to access the
   * data in order to suggest configuration changes to improve results.
   * Sales team restrictions still apply when enabled.
   * </pre>
   *
   * <code>bool sharing_with_google_assigned_sales_enabled = 3;</code>
   *
   * @return The sharingWithGoogleAssignedSalesEnabled.
   */
  @java.lang.Override
  public boolean getSharingWithGoogleAssignedSalesEnabled() {
    return sharingWithGoogleAssignedSalesEnabled_;
  }

  public static final int SHARING_WITH_GOOGLE_ANY_SALES_ENABLED_FIELD_NUMBER = 4;
  private boolean sharingWithGoogleAnySalesEnabled_ = false;

  /**
   *
   *
   * <pre>
   * Allows any of Google sales to access the data in order to suggest
   * configuration changes to improve results.
   * </pre>
   *
   * <code>bool sharing_with_google_any_sales_enabled = 4;</code>
   *
   * @return The sharingWithGoogleAnySalesEnabled.
   */
  @java.lang.Override
  public boolean getSharingWithGoogleAnySalesEnabled() {
    return sharingWithGoogleAnySalesEnabled_;
  }

  public static final int SHARING_WITH_GOOGLE_PRODUCTS_ENABLED_FIELD_NUMBER = 5;
  private boolean sharingWithGoogleProductsEnabled_ = false;

  /**
   *
   *
   * <pre>
   * Allows Google to use the data to improve other Google products or services.
   * </pre>
   *
   * <code>bool sharing_with_google_products_enabled = 5;</code>
   *
   * @return The sharingWithGoogleProductsEnabled.
   */
  @java.lang.Override
  public boolean getSharingWithGoogleProductsEnabled() {
    return sharingWithGoogleProductsEnabled_;
  }

  public static final int SHARING_WITH_OTHERS_ENABLED_FIELD_NUMBER = 6;
  private boolean sharingWithOthersEnabled_ = false;

  /**
   *
   *
   * <pre>
   * Allows Google to share the data anonymously in aggregate form with others.
   * </pre>
   *
   * <code>bool sharing_with_others_enabled = 6;</code>
   *
   * @return The sharingWithOthersEnabled.
   */
  @java.lang.Override
  public boolean getSharingWithOthersEnabled() {
    return sharingWithOthersEnabled_;
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
    if (sharingWithGoogleSupportEnabled_ != false) {
      output.writeBool(2, sharingWithGoogleSupportEnabled_);
    }
    if (sharingWithGoogleAssignedSalesEnabled_ != false) {
      output.writeBool(3, sharingWithGoogleAssignedSalesEnabled_);
    }
    if (sharingWithGoogleAnySalesEnabled_ != false) {
      output.writeBool(4, sharingWithGoogleAnySalesEnabled_);
    }
    if (sharingWithGoogleProductsEnabled_ != false) {
      output.writeBool(5, sharingWithGoogleProductsEnabled_);
    }
    if (sharingWithOthersEnabled_ != false) {
      output.writeBool(6, sharingWithOthersEnabled_);
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
    if (sharingWithGoogleSupportEnabled_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              2, sharingWithGoogleSupportEnabled_);
    }
    if (sharingWithGoogleAssignedSalesEnabled_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              3, sharingWithGoogleAssignedSalesEnabled_);
    }
    if (sharingWithGoogleAnySalesEnabled_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              4, sharingWithGoogleAnySalesEnabled_);
    }
    if (sharingWithGoogleProductsEnabled_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              5, sharingWithGoogleProductsEnabled_);
    }
    if (sharingWithOthersEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(6, sharingWithOthersEnabled_);
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
    if (!(obj instanceof com.google.analytics.admin.v1beta.DataSharingSettings)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1beta.DataSharingSettings other =
        (com.google.analytics.admin.v1beta.DataSharingSettings) obj;

    if (!getName().equals(other.getName())) return false;
    if (getSharingWithGoogleSupportEnabled() != other.getSharingWithGoogleSupportEnabled())
      return false;
    if (getSharingWithGoogleAssignedSalesEnabled()
        != other.getSharingWithGoogleAssignedSalesEnabled()) return false;
    if (getSharingWithGoogleAnySalesEnabled() != other.getSharingWithGoogleAnySalesEnabled())
      return false;
    if (getSharingWithGoogleProductsEnabled() != other.getSharingWithGoogleProductsEnabled())
      return false;
    if (getSharingWithOthersEnabled() != other.getSharingWithOthersEnabled()) return false;
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
    hash = (37 * hash) + SHARING_WITH_GOOGLE_SUPPORT_ENABLED_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashBoolean(getSharingWithGoogleSupportEnabled());
    hash = (37 * hash) + SHARING_WITH_GOOGLE_ASSIGNED_SALES_ENABLED_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashBoolean(getSharingWithGoogleAssignedSalesEnabled());
    hash = (37 * hash) + SHARING_WITH_GOOGLE_ANY_SALES_ENABLED_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashBoolean(getSharingWithGoogleAnySalesEnabled());
    hash = (37 * hash) + SHARING_WITH_GOOGLE_PRODUCTS_ENABLED_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashBoolean(getSharingWithGoogleProductsEnabled());
    hash = (37 * hash) + SHARING_WITH_OTHERS_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSharingWithOthersEnabled());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1beta.DataSharingSettings parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.DataSharingSettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.DataSharingSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.DataSharingSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.DataSharingSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.DataSharingSettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.DataSharingSettings parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.DataSharingSettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.DataSharingSettings parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.DataSharingSettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.DataSharingSettings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.DataSharingSettings parseFrom(
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
      com.google.analytics.admin.v1beta.DataSharingSettings prototype) {
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
   * A resource message representing data sharing settings of a Google Analytics
   * account.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1beta.DataSharingSettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1beta.DataSharingSettings)
      com.google.analytics.admin.v1beta.DataSharingSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1beta.ResourcesProto
          .internal_static_google_analytics_admin_v1beta_DataSharingSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1beta.ResourcesProto
          .internal_static_google_analytics_admin_v1beta_DataSharingSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1beta.DataSharingSettings.class,
              com.google.analytics.admin.v1beta.DataSharingSettings.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1beta.DataSharingSettings.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      sharingWithGoogleSupportEnabled_ = false;
      sharingWithGoogleAssignedSalesEnabled_ = false;
      sharingWithGoogleAnySalesEnabled_ = false;
      sharingWithGoogleProductsEnabled_ = false;
      sharingWithOthersEnabled_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1beta.ResourcesProto
          .internal_static_google_analytics_admin_v1beta_DataSharingSettings_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.DataSharingSettings getDefaultInstanceForType() {
      return com.google.analytics.admin.v1beta.DataSharingSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.DataSharingSettings build() {
      com.google.analytics.admin.v1beta.DataSharingSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.DataSharingSettings buildPartial() {
      com.google.analytics.admin.v1beta.DataSharingSettings result =
          new com.google.analytics.admin.v1beta.DataSharingSettings(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.admin.v1beta.DataSharingSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sharingWithGoogleSupportEnabled_ = sharingWithGoogleSupportEnabled_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sharingWithGoogleAssignedSalesEnabled_ = sharingWithGoogleAssignedSalesEnabled_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.sharingWithGoogleAnySalesEnabled_ = sharingWithGoogleAnySalesEnabled_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.sharingWithGoogleProductsEnabled_ = sharingWithGoogleProductsEnabled_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.sharingWithOthersEnabled_ = sharingWithOthersEnabled_;
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
      if (other instanceof com.google.analytics.admin.v1beta.DataSharingSettings) {
        return mergeFrom((com.google.analytics.admin.v1beta.DataSharingSettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1beta.DataSharingSettings other) {
      if (other == com.google.analytics.admin.v1beta.DataSharingSettings.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getSharingWithGoogleSupportEnabled() != false) {
        setSharingWithGoogleSupportEnabled(other.getSharingWithGoogleSupportEnabled());
      }
      if (other.getSharingWithGoogleAssignedSalesEnabled() != false) {
        setSharingWithGoogleAssignedSalesEnabled(other.getSharingWithGoogleAssignedSalesEnabled());
      }
      if (other.getSharingWithGoogleAnySalesEnabled() != false) {
        setSharingWithGoogleAnySalesEnabled(other.getSharingWithGoogleAnySalesEnabled());
      }
      if (other.getSharingWithGoogleProductsEnabled() != false) {
        setSharingWithGoogleProductsEnabled(other.getSharingWithGoogleProductsEnabled());
      }
      if (other.getSharingWithOthersEnabled() != false) {
        setSharingWithOthersEnabled(other.getSharingWithOthersEnabled());
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
                sharingWithGoogleSupportEnabled_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                sharingWithGoogleAssignedSalesEnabled_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 32:
              {
                sharingWithGoogleAnySalesEnabled_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
            case 40:
              {
                sharingWithGoogleProductsEnabled_ = input.readBool();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
            case 48:
              {
                sharingWithOthersEnabled_ = input.readBool();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
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
     * Output only. Resource name.
     * Format: accounts/{account}/dataSharingSettings
     * Example: "accounts/1000/dataSharingSettings"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Resource name.
     * Format: accounts/{account}/dataSharingSettings
     * Example: "accounts/1000/dataSharingSettings"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Resource name.
     * Format: accounts/{account}/dataSharingSettings
     * Example: "accounts/1000/dataSharingSettings"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Resource name.
     * Format: accounts/{account}/dataSharingSettings
     * Example: "accounts/1000/dataSharingSettings"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Resource name.
     * Format: accounts/{account}/dataSharingSettings
     * Example: "accounts/1000/dataSharingSettings"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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

    private boolean sharingWithGoogleSupportEnabled_;

    /**
     *
     *
     * <pre>
     * Allows Google support to access the data in order to help troubleshoot
     * issues.
     * </pre>
     *
     * <code>bool sharing_with_google_support_enabled = 2;</code>
     *
     * @return The sharingWithGoogleSupportEnabled.
     */
    @java.lang.Override
    public boolean getSharingWithGoogleSupportEnabled() {
      return sharingWithGoogleSupportEnabled_;
    }

    /**
     *
     *
     * <pre>
     * Allows Google support to access the data in order to help troubleshoot
     * issues.
     * </pre>
     *
     * <code>bool sharing_with_google_support_enabled = 2;</code>
     *
     * @param value The sharingWithGoogleSupportEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setSharingWithGoogleSupportEnabled(boolean value) {

      sharingWithGoogleSupportEnabled_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Allows Google support to access the data in order to help troubleshoot
     * issues.
     * </pre>
     *
     * <code>bool sharing_with_google_support_enabled = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSharingWithGoogleSupportEnabled() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sharingWithGoogleSupportEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean sharingWithGoogleAssignedSalesEnabled_;

    /**
     *
     *
     * <pre>
     * Allows Google sales teams that are assigned to the customer to access the
     * data in order to suggest configuration changes to improve results.
     * Sales team restrictions still apply when enabled.
     * </pre>
     *
     * <code>bool sharing_with_google_assigned_sales_enabled = 3;</code>
     *
     * @return The sharingWithGoogleAssignedSalesEnabled.
     */
    @java.lang.Override
    public boolean getSharingWithGoogleAssignedSalesEnabled() {
      return sharingWithGoogleAssignedSalesEnabled_;
    }

    /**
     *
     *
     * <pre>
     * Allows Google sales teams that are assigned to the customer to access the
     * data in order to suggest configuration changes to improve results.
     * Sales team restrictions still apply when enabled.
     * </pre>
     *
     * <code>bool sharing_with_google_assigned_sales_enabled = 3;</code>
     *
     * @param value The sharingWithGoogleAssignedSalesEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setSharingWithGoogleAssignedSalesEnabled(boolean value) {

      sharingWithGoogleAssignedSalesEnabled_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Allows Google sales teams that are assigned to the customer to access the
     * data in order to suggest configuration changes to improve results.
     * Sales team restrictions still apply when enabled.
     * </pre>
     *
     * <code>bool sharing_with_google_assigned_sales_enabled = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSharingWithGoogleAssignedSalesEnabled() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sharingWithGoogleAssignedSalesEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean sharingWithGoogleAnySalesEnabled_;

    /**
     *
     *
     * <pre>
     * Allows any of Google sales to access the data in order to suggest
     * configuration changes to improve results.
     * </pre>
     *
     * <code>bool sharing_with_google_any_sales_enabled = 4;</code>
     *
     * @return The sharingWithGoogleAnySalesEnabled.
     */
    @java.lang.Override
    public boolean getSharingWithGoogleAnySalesEnabled() {
      return sharingWithGoogleAnySalesEnabled_;
    }

    /**
     *
     *
     * <pre>
     * Allows any of Google sales to access the data in order to suggest
     * configuration changes to improve results.
     * </pre>
     *
     * <code>bool sharing_with_google_any_sales_enabled = 4;</code>
     *
     * @param value The sharingWithGoogleAnySalesEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setSharingWithGoogleAnySalesEnabled(boolean value) {

      sharingWithGoogleAnySalesEnabled_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Allows any of Google sales to access the data in order to suggest
     * configuration changes to improve results.
     * </pre>
     *
     * <code>bool sharing_with_google_any_sales_enabled = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSharingWithGoogleAnySalesEnabled() {
      bitField0_ = (bitField0_ & ~0x00000008);
      sharingWithGoogleAnySalesEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean sharingWithGoogleProductsEnabled_;

    /**
     *
     *
     * <pre>
     * Allows Google to use the data to improve other Google products or services.
     * </pre>
     *
     * <code>bool sharing_with_google_products_enabled = 5;</code>
     *
     * @return The sharingWithGoogleProductsEnabled.
     */
    @java.lang.Override
    public boolean getSharingWithGoogleProductsEnabled() {
      return sharingWithGoogleProductsEnabled_;
    }

    /**
     *
     *
     * <pre>
     * Allows Google to use the data to improve other Google products or services.
     * </pre>
     *
     * <code>bool sharing_with_google_products_enabled = 5;</code>
     *
     * @param value The sharingWithGoogleProductsEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setSharingWithGoogleProductsEnabled(boolean value) {

      sharingWithGoogleProductsEnabled_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Allows Google to use the data to improve other Google products or services.
     * </pre>
     *
     * <code>bool sharing_with_google_products_enabled = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSharingWithGoogleProductsEnabled() {
      bitField0_ = (bitField0_ & ~0x00000010);
      sharingWithGoogleProductsEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean sharingWithOthersEnabled_;

    /**
     *
     *
     * <pre>
     * Allows Google to share the data anonymously in aggregate form with others.
     * </pre>
     *
     * <code>bool sharing_with_others_enabled = 6;</code>
     *
     * @return The sharingWithOthersEnabled.
     */
    @java.lang.Override
    public boolean getSharingWithOthersEnabled() {
      return sharingWithOthersEnabled_;
    }

    /**
     *
     *
     * <pre>
     * Allows Google to share the data anonymously in aggregate form with others.
     * </pre>
     *
     * <code>bool sharing_with_others_enabled = 6;</code>
     *
     * @param value The sharingWithOthersEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setSharingWithOthersEnabled(boolean value) {

      sharingWithOthersEnabled_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Allows Google to share the data anonymously in aggregate form with others.
     * </pre>
     *
     * <code>bool sharing_with_others_enabled = 6;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSharingWithOthersEnabled() {
      bitField0_ = (bitField0_ & ~0x00000020);
      sharingWithOthersEnabled_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1beta.DataSharingSettings)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1beta.DataSharingSettings)
  private static final com.google.analytics.admin.v1beta.DataSharingSettings DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1beta.DataSharingSettings();
  }

  public static com.google.analytics.admin.v1beta.DataSharingSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataSharingSettings> PARSER =
      new com.google.protobuf.AbstractParser<DataSharingSettings>() {
        @java.lang.Override
        public DataSharingSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataSharingSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataSharingSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1beta.DataSharingSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
