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
// source: google/shopping/merchant/datasources/v1beta/datasourcetypes.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.datasources.v1beta;

/**
 *
 *
 * <pre>
 * The promotion data source.
 * </pre>
 *
 * Protobuf type {@code google.shopping.merchant.datasources.v1beta.PromotionDataSource}
 */
public final class PromotionDataSource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.shopping.merchant.datasources.v1beta.PromotionDataSource)
    PromotionDataSourceOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use PromotionDataSource.newBuilder() to construct.
  private PromotionDataSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PromotionDataSource() {
    targetCountry_ = "";
    contentLanguage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PromotionDataSource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.shopping.merchant.datasources.v1beta.DatasourcetypesProto
        .internal_static_google_shopping_merchant_datasources_v1beta_PromotionDataSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.merchant.datasources.v1beta.DatasourcetypesProto
        .internal_static_google_shopping_merchant_datasources_v1beta_PromotionDataSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.merchant.datasources.v1beta.PromotionDataSource.class,
            com.google.shopping.merchant.datasources.v1beta.PromotionDataSource.Builder.class);
  }

  public static final int TARGET_COUNTRY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object targetCountry_ = "";

  /**
   *
   *
   * <pre>
   * Required. Immutable. The target country used as part of the unique
   * identifier. Represented as a [CLDR territory
   * code](https://github.com/unicode-org/cldr/blob/latest/common/main/en.xml).
   *
   * Promotions are only available in selected
   * [countries](https://support.google.com/merchants/answer/4588460).
   * </pre>
   *
   * <code>
   * string target_country = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The targetCountry.
   */
  @java.lang.Override
  public java.lang.String getTargetCountry() {
    java.lang.Object ref = targetCountry_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      targetCountry_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. Immutable. The target country used as part of the unique
   * identifier. Represented as a [CLDR territory
   * code](https://github.com/unicode-org/cldr/blob/latest/common/main/en.xml).
   *
   * Promotions are only available in selected
   * [countries](https://support.google.com/merchants/answer/4588460).
   * </pre>
   *
   * <code>
   * string target_country = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for targetCountry.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTargetCountryBytes() {
    java.lang.Object ref = targetCountry_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      targetCountry_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTENT_LANGUAGE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object contentLanguage_ = "";

  /**
   *
   *
   * <pre>
   * Required. Immutable. The two-letter ISO 639-1 language of the items in the
   * data source.
   * </pre>
   *
   * <code>
   * string content_language = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The contentLanguage.
   */
  @java.lang.Override
  public java.lang.String getContentLanguage() {
    java.lang.Object ref = contentLanguage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contentLanguage_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. Immutable. The two-letter ISO 639-1 language of the items in the
   * data source.
   * </pre>
   *
   * <code>
   * string content_language = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for contentLanguage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContentLanguageBytes() {
    java.lang.Object ref = contentLanguage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      contentLanguage_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetCountry_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, targetCountry_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentLanguage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, contentLanguage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetCountry_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, targetCountry_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentLanguage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, contentLanguage_);
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
    if (!(obj instanceof com.google.shopping.merchant.datasources.v1beta.PromotionDataSource)) {
      return super.equals(obj);
    }
    com.google.shopping.merchant.datasources.v1beta.PromotionDataSource other =
        (com.google.shopping.merchant.datasources.v1beta.PromotionDataSource) obj;

    if (!getTargetCountry().equals(other.getTargetCountry())) return false;
    if (!getContentLanguage().equals(other.getContentLanguage())) return false;
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
    hash = (37 * hash) + TARGET_COUNTRY_FIELD_NUMBER;
    hash = (53 * hash) + getTargetCountry().hashCode();
    hash = (37 * hash) + CONTENT_LANGUAGE_FIELD_NUMBER;
    hash = (53 * hash) + getContentLanguage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.merchant.datasources.v1beta.PromotionDataSource parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.datasources.v1beta.PromotionDataSource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.datasources.v1beta.PromotionDataSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.datasources.v1beta.PromotionDataSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.datasources.v1beta.PromotionDataSource parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.datasources.v1beta.PromotionDataSource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.datasources.v1beta.PromotionDataSource parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.datasources.v1beta.PromotionDataSource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.datasources.v1beta.PromotionDataSource
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.datasources.v1beta.PromotionDataSource
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.datasources.v1beta.PromotionDataSource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.datasources.v1beta.PromotionDataSource parseFrom(
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
      com.google.shopping.merchant.datasources.v1beta.PromotionDataSource prototype) {
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
   * The promotion data source.
   * </pre>
   *
   * Protobuf type {@code google.shopping.merchant.datasources.v1beta.PromotionDataSource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.shopping.merchant.datasources.v1beta.PromotionDataSource)
      com.google.shopping.merchant.datasources.v1beta.PromotionDataSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.shopping.merchant.datasources.v1beta.DatasourcetypesProto
          .internal_static_google_shopping_merchant_datasources_v1beta_PromotionDataSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.merchant.datasources.v1beta.DatasourcetypesProto
          .internal_static_google_shopping_merchant_datasources_v1beta_PromotionDataSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.merchant.datasources.v1beta.PromotionDataSource.class,
              com.google.shopping.merchant.datasources.v1beta.PromotionDataSource.Builder.class);
    }

    // Construct using
    // com.google.shopping.merchant.datasources.v1beta.PromotionDataSource.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      targetCountry_ = "";
      contentLanguage_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.shopping.merchant.datasources.v1beta.DatasourcetypesProto
          .internal_static_google_shopping_merchant_datasources_v1beta_PromotionDataSource_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.merchant.datasources.v1beta.PromotionDataSource
        getDefaultInstanceForType() {
      return com.google.shopping.merchant.datasources.v1beta.PromotionDataSource
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.merchant.datasources.v1beta.PromotionDataSource build() {
      com.google.shopping.merchant.datasources.v1beta.PromotionDataSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.merchant.datasources.v1beta.PromotionDataSource buildPartial() {
      com.google.shopping.merchant.datasources.v1beta.PromotionDataSource result =
          new com.google.shopping.merchant.datasources.v1beta.PromotionDataSource(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.shopping.merchant.datasources.v1beta.PromotionDataSource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.targetCountry_ = targetCountry_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.contentLanguage_ = contentLanguage_;
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
      if (other instanceof com.google.shopping.merchant.datasources.v1beta.PromotionDataSource) {
        return mergeFrom(
            (com.google.shopping.merchant.datasources.v1beta.PromotionDataSource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.shopping.merchant.datasources.v1beta.PromotionDataSource other) {
      if (other
          == com.google.shopping.merchant.datasources.v1beta.PromotionDataSource
              .getDefaultInstance()) return this;
      if (!other.getTargetCountry().isEmpty()) {
        targetCountry_ = other.targetCountry_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getContentLanguage().isEmpty()) {
        contentLanguage_ = other.contentLanguage_;
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
                targetCountry_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                contentLanguage_ = input.readStringRequireUtf8();
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

    private java.lang.Object targetCountry_ = "";

    /**
     *
     *
     * <pre>
     * Required. Immutable. The target country used as part of the unique
     * identifier. Represented as a [CLDR territory
     * code](https://github.com/unicode-org/cldr/blob/latest/common/main/en.xml).
     *
     * Promotions are only available in selected
     * [countries](https://support.google.com/merchants/answer/4588460).
     * </pre>
     *
     * <code>
     * string target_country = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return The targetCountry.
     */
    public java.lang.String getTargetCountry() {
      java.lang.Object ref = targetCountry_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetCountry_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. The target country used as part of the unique
     * identifier. Represented as a [CLDR territory
     * code](https://github.com/unicode-org/cldr/blob/latest/common/main/en.xml).
     *
     * Promotions are only available in selected
     * [countries](https://support.google.com/merchants/answer/4588460).
     * </pre>
     *
     * <code>
     * string target_country = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return The bytes for targetCountry.
     */
    public com.google.protobuf.ByteString getTargetCountryBytes() {
      java.lang.Object ref = targetCountry_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        targetCountry_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. The target country used as part of the unique
     * identifier. Represented as a [CLDR territory
     * code](https://github.com/unicode-org/cldr/blob/latest/common/main/en.xml).
     *
     * Promotions are only available in selected
     * [countries](https://support.google.com/merchants/answer/4588460).
     * </pre>
     *
     * <code>
     * string target_country = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @param value The targetCountry to set.
     * @return This builder for chaining.
     */
    public Builder setTargetCountry(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      targetCountry_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. The target country used as part of the unique
     * identifier. Represented as a [CLDR territory
     * code](https://github.com/unicode-org/cldr/blob/latest/common/main/en.xml).
     *
     * Promotions are only available in selected
     * [countries](https://support.google.com/merchants/answer/4588460).
     * </pre>
     *
     * <code>
     * string target_country = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTargetCountry() {
      targetCountry_ = getDefaultInstance().getTargetCountry();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. The target country used as part of the unique
     * identifier. Represented as a [CLDR territory
     * code](https://github.com/unicode-org/cldr/blob/latest/common/main/en.xml).
     *
     * Promotions are only available in selected
     * [countries](https://support.google.com/merchants/answer/4588460).
     * </pre>
     *
     * <code>
     * string target_country = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @param value The bytes for targetCountry to set.
     * @return This builder for chaining.
     */
    public Builder setTargetCountryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      targetCountry_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object contentLanguage_ = "";

    /**
     *
     *
     * <pre>
     * Required. Immutable. The two-letter ISO 639-1 language of the items in the
     * data source.
     * </pre>
     *
     * <code>
     * string content_language = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return The contentLanguage.
     */
    public java.lang.String getContentLanguage() {
      java.lang.Object ref = contentLanguage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contentLanguage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. The two-letter ISO 639-1 language of the items in the
     * data source.
     * </pre>
     *
     * <code>
     * string content_language = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return The bytes for contentLanguage.
     */
    public com.google.protobuf.ByteString getContentLanguageBytes() {
      java.lang.Object ref = contentLanguage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        contentLanguage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. The two-letter ISO 639-1 language of the items in the
     * data source.
     * </pre>
     *
     * <code>
     * string content_language = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @param value The contentLanguage to set.
     * @return This builder for chaining.
     */
    public Builder setContentLanguage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      contentLanguage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. The two-letter ISO 639-1 language of the items in the
     * data source.
     * </pre>
     *
     * <code>
     * string content_language = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContentLanguage() {
      contentLanguage_ = getDefaultInstance().getContentLanguage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. The two-letter ISO 639-1 language of the items in the
     * data source.
     * </pre>
     *
     * <code>
     * string content_language = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @param value The bytes for contentLanguage to set.
     * @return This builder for chaining.
     */
    public Builder setContentLanguageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      contentLanguage_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.shopping.merchant.datasources.v1beta.PromotionDataSource)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.merchant.datasources.v1beta.PromotionDataSource)
  private static final com.google.shopping.merchant.datasources.v1beta.PromotionDataSource
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.shopping.merchant.datasources.v1beta.PromotionDataSource();
  }

  public static com.google.shopping.merchant.datasources.v1beta.PromotionDataSource
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PromotionDataSource> PARSER =
      new com.google.protobuf.AbstractParser<PromotionDataSource>() {
        @java.lang.Override
        public PromotionDataSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<PromotionDataSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PromotionDataSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.merchant.datasources.v1beta.PromotionDataSource
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
