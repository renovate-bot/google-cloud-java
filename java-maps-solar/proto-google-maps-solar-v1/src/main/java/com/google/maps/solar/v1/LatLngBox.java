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
// source: google/maps/solar/v1/solar_service.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.solar.v1;

/**
 *
 *
 * <pre>
 * A bounding box in lat/lng coordinates.
 * </pre>
 *
 * Protobuf type {@code google.maps.solar.v1.LatLngBox}
 */
public final class LatLngBox extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.maps.solar.v1.LatLngBox)
    LatLngBoxOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use LatLngBox.newBuilder() to construct.
  private LatLngBox(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LatLngBox() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LatLngBox();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.solar.v1.SolarServiceProto
        .internal_static_google_maps_solar_v1_LatLngBox_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.solar.v1.SolarServiceProto
        .internal_static_google_maps_solar_v1_LatLngBox_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.solar.v1.LatLngBox.class,
            com.google.maps.solar.v1.LatLngBox.Builder.class);
  }

  private int bitField0_;
  public static final int SW_FIELD_NUMBER = 1;
  private com.google.type.LatLng sw_;

  /**
   *
   *
   * <pre>
   * The southwest corner of the box.
   * </pre>
   *
   * <code>.google.type.LatLng sw = 1;</code>
   *
   * @return Whether the sw field is set.
   */
  @java.lang.Override
  public boolean hasSw() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The southwest corner of the box.
   * </pre>
   *
   * <code>.google.type.LatLng sw = 1;</code>
   *
   * @return The sw.
   */
  @java.lang.Override
  public com.google.type.LatLng getSw() {
    return sw_ == null ? com.google.type.LatLng.getDefaultInstance() : sw_;
  }

  /**
   *
   *
   * <pre>
   * The southwest corner of the box.
   * </pre>
   *
   * <code>.google.type.LatLng sw = 1;</code>
   */
  @java.lang.Override
  public com.google.type.LatLngOrBuilder getSwOrBuilder() {
    return sw_ == null ? com.google.type.LatLng.getDefaultInstance() : sw_;
  }

  public static final int NE_FIELD_NUMBER = 2;
  private com.google.type.LatLng ne_;

  /**
   *
   *
   * <pre>
   * The northeast corner of the box.
   * </pre>
   *
   * <code>.google.type.LatLng ne = 2;</code>
   *
   * @return Whether the ne field is set.
   */
  @java.lang.Override
  public boolean hasNe() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * The northeast corner of the box.
   * </pre>
   *
   * <code>.google.type.LatLng ne = 2;</code>
   *
   * @return The ne.
   */
  @java.lang.Override
  public com.google.type.LatLng getNe() {
    return ne_ == null ? com.google.type.LatLng.getDefaultInstance() : ne_;
  }

  /**
   *
   *
   * <pre>
   * The northeast corner of the box.
   * </pre>
   *
   * <code>.google.type.LatLng ne = 2;</code>
   */
  @java.lang.Override
  public com.google.type.LatLngOrBuilder getNeOrBuilder() {
    return ne_ == null ? com.google.type.LatLng.getDefaultInstance() : ne_;
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
      output.writeMessage(1, getSw());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getNe());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSw());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getNe());
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
    if (!(obj instanceof com.google.maps.solar.v1.LatLngBox)) {
      return super.equals(obj);
    }
    com.google.maps.solar.v1.LatLngBox other = (com.google.maps.solar.v1.LatLngBox) obj;

    if (hasSw() != other.hasSw()) return false;
    if (hasSw()) {
      if (!getSw().equals(other.getSw())) return false;
    }
    if (hasNe() != other.hasNe()) return false;
    if (hasNe()) {
      if (!getNe().equals(other.getNe())) return false;
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
    if (hasSw()) {
      hash = (37 * hash) + SW_FIELD_NUMBER;
      hash = (53 * hash) + getSw().hashCode();
    }
    if (hasNe()) {
      hash = (37 * hash) + NE_FIELD_NUMBER;
      hash = (53 * hash) + getNe().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.solar.v1.LatLngBox parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.solar.v1.LatLngBox parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.solar.v1.LatLngBox parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.solar.v1.LatLngBox parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.solar.v1.LatLngBox parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.solar.v1.LatLngBox parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.solar.v1.LatLngBox parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.solar.v1.LatLngBox parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.solar.v1.LatLngBox parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.solar.v1.LatLngBox parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.solar.v1.LatLngBox parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.solar.v1.LatLngBox parseFrom(
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

  public static Builder newBuilder(com.google.maps.solar.v1.LatLngBox prototype) {
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
   * A bounding box in lat/lng coordinates.
   * </pre>
   *
   * Protobuf type {@code google.maps.solar.v1.LatLngBox}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.maps.solar.v1.LatLngBox)
      com.google.maps.solar.v1.LatLngBoxOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.solar.v1.SolarServiceProto
          .internal_static_google_maps_solar_v1_LatLngBox_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.solar.v1.SolarServiceProto
          .internal_static_google_maps_solar_v1_LatLngBox_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.solar.v1.LatLngBox.class,
              com.google.maps.solar.v1.LatLngBox.Builder.class);
    }

    // Construct using com.google.maps.solar.v1.LatLngBox.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSwFieldBuilder();
        getNeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sw_ = null;
      if (swBuilder_ != null) {
        swBuilder_.dispose();
        swBuilder_ = null;
      }
      ne_ = null;
      if (neBuilder_ != null) {
        neBuilder_.dispose();
        neBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.solar.v1.SolarServiceProto
          .internal_static_google_maps_solar_v1_LatLngBox_descriptor;
    }

    @java.lang.Override
    public com.google.maps.solar.v1.LatLngBox getDefaultInstanceForType() {
      return com.google.maps.solar.v1.LatLngBox.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.solar.v1.LatLngBox build() {
      com.google.maps.solar.v1.LatLngBox result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.solar.v1.LatLngBox buildPartial() {
      com.google.maps.solar.v1.LatLngBox result = new com.google.maps.solar.v1.LatLngBox(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.maps.solar.v1.LatLngBox result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sw_ = swBuilder_ == null ? sw_ : swBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ne_ = neBuilder_ == null ? ne_ : neBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.maps.solar.v1.LatLngBox) {
        return mergeFrom((com.google.maps.solar.v1.LatLngBox) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.solar.v1.LatLngBox other) {
      if (other == com.google.maps.solar.v1.LatLngBox.getDefaultInstance()) return this;
      if (other.hasSw()) {
        mergeSw(other.getSw());
      }
      if (other.hasNe()) {
        mergeNe(other.getNe());
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
                input.readMessage(getSwFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getNeFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.type.LatLng sw_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        swBuilder_;

    /**
     *
     *
     * <pre>
     * The southwest corner of the box.
     * </pre>
     *
     * <code>.google.type.LatLng sw = 1;</code>
     *
     * @return Whether the sw field is set.
     */
    public boolean hasSw() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * The southwest corner of the box.
     * </pre>
     *
     * <code>.google.type.LatLng sw = 1;</code>
     *
     * @return The sw.
     */
    public com.google.type.LatLng getSw() {
      if (swBuilder_ == null) {
        return sw_ == null ? com.google.type.LatLng.getDefaultInstance() : sw_;
      } else {
        return swBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The southwest corner of the box.
     * </pre>
     *
     * <code>.google.type.LatLng sw = 1;</code>
     */
    public Builder setSw(com.google.type.LatLng value) {
      if (swBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sw_ = value;
      } else {
        swBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The southwest corner of the box.
     * </pre>
     *
     * <code>.google.type.LatLng sw = 1;</code>
     */
    public Builder setSw(com.google.type.LatLng.Builder builderForValue) {
      if (swBuilder_ == null) {
        sw_ = builderForValue.build();
      } else {
        swBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The southwest corner of the box.
     * </pre>
     *
     * <code>.google.type.LatLng sw = 1;</code>
     */
    public Builder mergeSw(com.google.type.LatLng value) {
      if (swBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && sw_ != null
            && sw_ != com.google.type.LatLng.getDefaultInstance()) {
          getSwBuilder().mergeFrom(value);
        } else {
          sw_ = value;
        }
      } else {
        swBuilder_.mergeFrom(value);
      }
      if (sw_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The southwest corner of the box.
     * </pre>
     *
     * <code>.google.type.LatLng sw = 1;</code>
     */
    public Builder clearSw() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sw_ = null;
      if (swBuilder_ != null) {
        swBuilder_.dispose();
        swBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The southwest corner of the box.
     * </pre>
     *
     * <code>.google.type.LatLng sw = 1;</code>
     */
    public com.google.type.LatLng.Builder getSwBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSwFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The southwest corner of the box.
     * </pre>
     *
     * <code>.google.type.LatLng sw = 1;</code>
     */
    public com.google.type.LatLngOrBuilder getSwOrBuilder() {
      if (swBuilder_ != null) {
        return swBuilder_.getMessageOrBuilder();
      } else {
        return sw_ == null ? com.google.type.LatLng.getDefaultInstance() : sw_;
      }
    }

    /**
     *
     *
     * <pre>
     * The southwest corner of the box.
     * </pre>
     *
     * <code>.google.type.LatLng sw = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        getSwFieldBuilder() {
      if (swBuilder_ == null) {
        swBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.LatLng,
                com.google.type.LatLng.Builder,
                com.google.type.LatLngOrBuilder>(getSw(), getParentForChildren(), isClean());
        sw_ = null;
      }
      return swBuilder_;
    }

    private com.google.type.LatLng ne_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        neBuilder_;

    /**
     *
     *
     * <pre>
     * The northeast corner of the box.
     * </pre>
     *
     * <code>.google.type.LatLng ne = 2;</code>
     *
     * @return Whether the ne field is set.
     */
    public boolean hasNe() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * The northeast corner of the box.
     * </pre>
     *
     * <code>.google.type.LatLng ne = 2;</code>
     *
     * @return The ne.
     */
    public com.google.type.LatLng getNe() {
      if (neBuilder_ == null) {
        return ne_ == null ? com.google.type.LatLng.getDefaultInstance() : ne_;
      } else {
        return neBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The northeast corner of the box.
     * </pre>
     *
     * <code>.google.type.LatLng ne = 2;</code>
     */
    public Builder setNe(com.google.type.LatLng value) {
      if (neBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ne_ = value;
      } else {
        neBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The northeast corner of the box.
     * </pre>
     *
     * <code>.google.type.LatLng ne = 2;</code>
     */
    public Builder setNe(com.google.type.LatLng.Builder builderForValue) {
      if (neBuilder_ == null) {
        ne_ = builderForValue.build();
      } else {
        neBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The northeast corner of the box.
     * </pre>
     *
     * <code>.google.type.LatLng ne = 2;</code>
     */
    public Builder mergeNe(com.google.type.LatLng value) {
      if (neBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && ne_ != null
            && ne_ != com.google.type.LatLng.getDefaultInstance()) {
          getNeBuilder().mergeFrom(value);
        } else {
          ne_ = value;
        }
      } else {
        neBuilder_.mergeFrom(value);
      }
      if (ne_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The northeast corner of the box.
     * </pre>
     *
     * <code>.google.type.LatLng ne = 2;</code>
     */
    public Builder clearNe() {
      bitField0_ = (bitField0_ & ~0x00000002);
      ne_ = null;
      if (neBuilder_ != null) {
        neBuilder_.dispose();
        neBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The northeast corner of the box.
     * </pre>
     *
     * <code>.google.type.LatLng ne = 2;</code>
     */
    public com.google.type.LatLng.Builder getNeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getNeFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The northeast corner of the box.
     * </pre>
     *
     * <code>.google.type.LatLng ne = 2;</code>
     */
    public com.google.type.LatLngOrBuilder getNeOrBuilder() {
      if (neBuilder_ != null) {
        return neBuilder_.getMessageOrBuilder();
      } else {
        return ne_ == null ? com.google.type.LatLng.getDefaultInstance() : ne_;
      }
    }

    /**
     *
     *
     * <pre>
     * The northeast corner of the box.
     * </pre>
     *
     * <code>.google.type.LatLng ne = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        getNeFieldBuilder() {
      if (neBuilder_ == null) {
        neBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.LatLng,
                com.google.type.LatLng.Builder,
                com.google.type.LatLngOrBuilder>(getNe(), getParentForChildren(), isClean());
        ne_ = null;
      }
      return neBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.maps.solar.v1.LatLngBox)
  }

  // @@protoc_insertion_point(class_scope:google.maps.solar.v1.LatLngBox)
  private static final com.google.maps.solar.v1.LatLngBox DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.solar.v1.LatLngBox();
  }

  public static com.google.maps.solar.v1.LatLngBox getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LatLngBox> PARSER =
      new com.google.protobuf.AbstractParser<LatLngBox>() {
        @java.lang.Override
        public LatLngBox parsePartialFrom(
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

  public static com.google.protobuf.Parser<LatLngBox> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LatLngBox> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.solar.v1.LatLngBox getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
