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
// source: google/maps/addressvalidation/v1/metadata.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.addressvalidation.v1;

/**
 *
 *
 * <pre>
 * The metadata for the post-processed address. `metadata` is not guaranteed to
 * be fully populated for every address sent to the Address Validation API.
 * </pre>
 *
 * Protobuf type {@code google.maps.addressvalidation.v1.AddressMetadata}
 */
public final class AddressMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.maps.addressvalidation.v1.AddressMetadata)
    AddressMetadataOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use AddressMetadata.newBuilder() to construct.
  private AddressMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AddressMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AddressMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.addressvalidation.v1.MetadataProto
        .internal_static_google_maps_addressvalidation_v1_AddressMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.addressvalidation.v1.MetadataProto
        .internal_static_google_maps_addressvalidation_v1_AddressMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.addressvalidation.v1.AddressMetadata.class,
            com.google.maps.addressvalidation.v1.AddressMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int BUSINESS_FIELD_NUMBER = 2;
  private boolean business_ = false;

  /**
   *
   *
   * <pre>
   * Indicates that this is the address of a business.
   * If unset, indicates that the value is unknown.
   * </pre>
   *
   * <code>optional bool business = 2;</code>
   *
   * @return Whether the business field is set.
   */
  @java.lang.Override
  public boolean hasBusiness() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Indicates that this is the address of a business.
   * If unset, indicates that the value is unknown.
   * </pre>
   *
   * <code>optional bool business = 2;</code>
   *
   * @return The business.
   */
  @java.lang.Override
  public boolean getBusiness() {
    return business_;
  }

  public static final int PO_BOX_FIELD_NUMBER = 3;
  private boolean poBox_ = false;

  /**
   *
   *
   * <pre>
   * Indicates that the address of a PO box.
   * If unset, indicates that the value is unknown.
   * </pre>
   *
   * <code>optional bool po_box = 3;</code>
   *
   * @return Whether the poBox field is set.
   */
  @java.lang.Override
  public boolean hasPoBox() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Indicates that the address of a PO box.
   * If unset, indicates that the value is unknown.
   * </pre>
   *
   * <code>optional bool po_box = 3;</code>
   *
   * @return The poBox.
   */
  @java.lang.Override
  public boolean getPoBox() {
    return poBox_;
  }

  public static final int RESIDENTIAL_FIELD_NUMBER = 6;
  private boolean residential_ = false;

  /**
   *
   *
   * <pre>
   * Indicates that this is the address of a residence.
   * If unset, indicates that the value is unknown.
   * </pre>
   *
   * <code>optional bool residential = 6;</code>
   *
   * @return Whether the residential field is set.
   */
  @java.lang.Override
  public boolean hasResidential() {
    return ((bitField0_ & 0x00000004) != 0);
  }

  /**
   *
   *
   * <pre>
   * Indicates that this is the address of a residence.
   * If unset, indicates that the value is unknown.
   * </pre>
   *
   * <code>optional bool residential = 6;</code>
   *
   * @return The residential.
   */
  @java.lang.Override
  public boolean getResidential() {
    return residential_;
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
      output.writeBool(2, business_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(3, poBox_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBool(6, residential_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, business_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, poBox_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(6, residential_);
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
    if (!(obj instanceof com.google.maps.addressvalidation.v1.AddressMetadata)) {
      return super.equals(obj);
    }
    com.google.maps.addressvalidation.v1.AddressMetadata other =
        (com.google.maps.addressvalidation.v1.AddressMetadata) obj;

    if (hasBusiness() != other.hasBusiness()) return false;
    if (hasBusiness()) {
      if (getBusiness() != other.getBusiness()) return false;
    }
    if (hasPoBox() != other.hasPoBox()) return false;
    if (hasPoBox()) {
      if (getPoBox() != other.getPoBox()) return false;
    }
    if (hasResidential() != other.hasResidential()) return false;
    if (hasResidential()) {
      if (getResidential() != other.getResidential()) return false;
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
    if (hasBusiness()) {
      hash = (37 * hash) + BUSINESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getBusiness());
    }
    if (hasPoBox()) {
      hash = (37 * hash) + PO_BOX_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getPoBox());
    }
    if (hasResidential()) {
      hash = (37 * hash) + RESIDENTIAL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getResidential());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.addressvalidation.v1.AddressMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.addressvalidation.v1.AddressMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.addressvalidation.v1.AddressMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.addressvalidation.v1.AddressMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.addressvalidation.v1.AddressMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.addressvalidation.v1.AddressMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.addressvalidation.v1.AddressMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.addressvalidation.v1.AddressMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.addressvalidation.v1.AddressMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.addressvalidation.v1.AddressMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.addressvalidation.v1.AddressMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.addressvalidation.v1.AddressMetadata parseFrom(
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

  public static Builder newBuilder(com.google.maps.addressvalidation.v1.AddressMetadata prototype) {
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
   * The metadata for the post-processed address. `metadata` is not guaranteed to
   * be fully populated for every address sent to the Address Validation API.
   * </pre>
   *
   * Protobuf type {@code google.maps.addressvalidation.v1.AddressMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.maps.addressvalidation.v1.AddressMetadata)
      com.google.maps.addressvalidation.v1.AddressMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.addressvalidation.v1.MetadataProto
          .internal_static_google_maps_addressvalidation_v1_AddressMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.addressvalidation.v1.MetadataProto
          .internal_static_google_maps_addressvalidation_v1_AddressMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.addressvalidation.v1.AddressMetadata.class,
              com.google.maps.addressvalidation.v1.AddressMetadata.Builder.class);
    }

    // Construct using com.google.maps.addressvalidation.v1.AddressMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      business_ = false;
      poBox_ = false;
      residential_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.addressvalidation.v1.MetadataProto
          .internal_static_google_maps_addressvalidation_v1_AddressMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.maps.addressvalidation.v1.AddressMetadata getDefaultInstanceForType() {
      return com.google.maps.addressvalidation.v1.AddressMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.addressvalidation.v1.AddressMetadata build() {
      com.google.maps.addressvalidation.v1.AddressMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.addressvalidation.v1.AddressMetadata buildPartial() {
      com.google.maps.addressvalidation.v1.AddressMetadata result =
          new com.google.maps.addressvalidation.v1.AddressMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.maps.addressvalidation.v1.AddressMetadata result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.business_ = business_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.poBox_ = poBox_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.residential_ = residential_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.maps.addressvalidation.v1.AddressMetadata) {
        return mergeFrom((com.google.maps.addressvalidation.v1.AddressMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.addressvalidation.v1.AddressMetadata other) {
      if (other == com.google.maps.addressvalidation.v1.AddressMetadata.getDefaultInstance())
        return this;
      if (other.hasBusiness()) {
        setBusiness(other.getBusiness());
      }
      if (other.hasPoBox()) {
        setPoBox(other.getPoBox());
      }
      if (other.hasResidential()) {
        setResidential(other.getResidential());
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
            case 16:
              {
                business_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
            case 24:
              {
                poBox_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
            case 48:
              {
                residential_ = input.readBool();
                bitField0_ |= 0x00000004;
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

    private boolean business_;

    /**
     *
     *
     * <pre>
     * Indicates that this is the address of a business.
     * If unset, indicates that the value is unknown.
     * </pre>
     *
     * <code>optional bool business = 2;</code>
     *
     * @return Whether the business field is set.
     */
    @java.lang.Override
    public boolean hasBusiness() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Indicates that this is the address of a business.
     * If unset, indicates that the value is unknown.
     * </pre>
     *
     * <code>optional bool business = 2;</code>
     *
     * @return The business.
     */
    @java.lang.Override
    public boolean getBusiness() {
      return business_;
    }

    /**
     *
     *
     * <pre>
     * Indicates that this is the address of a business.
     * If unset, indicates that the value is unknown.
     * </pre>
     *
     * <code>optional bool business = 2;</code>
     *
     * @param value The business to set.
     * @return This builder for chaining.
     */
    public Builder setBusiness(boolean value) {

      business_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Indicates that this is the address of a business.
     * If unset, indicates that the value is unknown.
     * </pre>
     *
     * <code>optional bool business = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBusiness() {
      bitField0_ = (bitField0_ & ~0x00000001);
      business_ = false;
      onChanged();
      return this;
    }

    private boolean poBox_;

    /**
     *
     *
     * <pre>
     * Indicates that the address of a PO box.
     * If unset, indicates that the value is unknown.
     * </pre>
     *
     * <code>optional bool po_box = 3;</code>
     *
     * @return Whether the poBox field is set.
     */
    @java.lang.Override
    public boolean hasPoBox() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Indicates that the address of a PO box.
     * If unset, indicates that the value is unknown.
     * </pre>
     *
     * <code>optional bool po_box = 3;</code>
     *
     * @return The poBox.
     */
    @java.lang.Override
    public boolean getPoBox() {
      return poBox_;
    }

    /**
     *
     *
     * <pre>
     * Indicates that the address of a PO box.
     * If unset, indicates that the value is unknown.
     * </pre>
     *
     * <code>optional bool po_box = 3;</code>
     *
     * @param value The poBox to set.
     * @return This builder for chaining.
     */
    public Builder setPoBox(boolean value) {

      poBox_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Indicates that the address of a PO box.
     * If unset, indicates that the value is unknown.
     * </pre>
     *
     * <code>optional bool po_box = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPoBox() {
      bitField0_ = (bitField0_ & ~0x00000002);
      poBox_ = false;
      onChanged();
      return this;
    }

    private boolean residential_;

    /**
     *
     *
     * <pre>
     * Indicates that this is the address of a residence.
     * If unset, indicates that the value is unknown.
     * </pre>
     *
     * <code>optional bool residential = 6;</code>
     *
     * @return Whether the residential field is set.
     */
    @java.lang.Override
    public boolean hasResidential() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Indicates that this is the address of a residence.
     * If unset, indicates that the value is unknown.
     * </pre>
     *
     * <code>optional bool residential = 6;</code>
     *
     * @return The residential.
     */
    @java.lang.Override
    public boolean getResidential() {
      return residential_;
    }

    /**
     *
     *
     * <pre>
     * Indicates that this is the address of a residence.
     * If unset, indicates that the value is unknown.
     * </pre>
     *
     * <code>optional bool residential = 6;</code>
     *
     * @param value The residential to set.
     * @return This builder for chaining.
     */
    public Builder setResidential(boolean value) {

      residential_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Indicates that this is the address of a residence.
     * If unset, indicates that the value is unknown.
     * </pre>
     *
     * <code>optional bool residential = 6;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResidential() {
      bitField0_ = (bitField0_ & ~0x00000004);
      residential_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.maps.addressvalidation.v1.AddressMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.maps.addressvalidation.v1.AddressMetadata)
  private static final com.google.maps.addressvalidation.v1.AddressMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.addressvalidation.v1.AddressMetadata();
  }

  public static com.google.maps.addressvalidation.v1.AddressMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddressMetadata> PARSER =
      new com.google.protobuf.AbstractParser<AddressMetadata>() {
        @java.lang.Override
        public AddressMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddressMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddressMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.addressvalidation.v1.AddressMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
