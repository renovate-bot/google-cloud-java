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
// source: google/maps/fleetengine/v1/vehicles.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.fleetengine.v1;

/**
 *
 *
 * <pre>
 * The license plate information of the Vehicle.  To avoid storing
 * personally-identifiable information, only the minimum information
 * about the license plate is stored as part of the entity.
 * </pre>
 *
 * Protobuf type {@code maps.fleetengine.v1.LicensePlate}
 */
public final class LicensePlate extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:maps.fleetengine.v1.LicensePlate)
    LicensePlateOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use LicensePlate.newBuilder() to construct.
  private LicensePlate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LicensePlate() {
    countryCode_ = "";
    lastCharacter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LicensePlate();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.fleetengine.v1.Vehicles
        .internal_static_maps_fleetengine_v1_LicensePlate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.fleetengine.v1.Vehicles
        .internal_static_maps_fleetengine_v1_LicensePlate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.fleetengine.v1.LicensePlate.class,
            com.google.maps.fleetengine.v1.LicensePlate.Builder.class);
  }

  public static final int COUNTRY_CODE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object countryCode_ = "";

  /**
   *
   *
   * <pre>
   * Required. CLDR Country/Region Code.  For example, `US` for United States,
   * or `IN` for India.
   * </pre>
   *
   * <code>string country_code = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The countryCode.
   */
  @java.lang.Override
  public java.lang.String getCountryCode() {
    java.lang.Object ref = countryCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      countryCode_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. CLDR Country/Region Code.  For example, `US` for United States,
   * or `IN` for India.
   * </pre>
   *
   * <code>string country_code = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for countryCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCountryCodeBytes() {
    java.lang.Object ref = countryCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      countryCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAST_CHARACTER_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object lastCharacter_ = "";

  /**
   *
   *
   * <pre>
   * The last digit of the license plate or "-1" to denote no numeric value
   * is present in the license plate.
   *
   * * "ABC 1234" -&gt; "4"
   * * "AB 123 CD" -&gt; "3"
   * * "ABCDEF" -&gt; "-1"
   * </pre>
   *
   * <code>string last_character = 2;</code>
   *
   * @return The lastCharacter.
   */
  @java.lang.Override
  public java.lang.String getLastCharacter() {
    java.lang.Object ref = lastCharacter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lastCharacter_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The last digit of the license plate or "-1" to denote no numeric value
   * is present in the license plate.
   *
   * * "ABC 1234" -&gt; "4"
   * * "AB 123 CD" -&gt; "3"
   * * "ABCDEF" -&gt; "-1"
   * </pre>
   *
   * <code>string last_character = 2;</code>
   *
   * @return The bytes for lastCharacter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLastCharacterBytes() {
    java.lang.Object ref = lastCharacter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      lastCharacter_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(countryCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, countryCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lastCharacter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lastCharacter_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(countryCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, countryCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lastCharacter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lastCharacter_);
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
    if (!(obj instanceof com.google.maps.fleetengine.v1.LicensePlate)) {
      return super.equals(obj);
    }
    com.google.maps.fleetengine.v1.LicensePlate other =
        (com.google.maps.fleetengine.v1.LicensePlate) obj;

    if (!getCountryCode().equals(other.getCountryCode())) return false;
    if (!getLastCharacter().equals(other.getLastCharacter())) return false;
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
    hash = (37 * hash) + COUNTRY_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCountryCode().hashCode();
    hash = (37 * hash) + LAST_CHARACTER_FIELD_NUMBER;
    hash = (53 * hash) + getLastCharacter().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.fleetengine.v1.LicensePlate parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.fleetengine.v1.LicensePlate parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.fleetengine.v1.LicensePlate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.fleetengine.v1.LicensePlate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.fleetengine.v1.LicensePlate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.fleetengine.v1.LicensePlate parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.fleetengine.v1.LicensePlate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.fleetengine.v1.LicensePlate parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.fleetengine.v1.LicensePlate parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.fleetengine.v1.LicensePlate parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.fleetengine.v1.LicensePlate parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.fleetengine.v1.LicensePlate parseFrom(
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

  public static Builder newBuilder(com.google.maps.fleetengine.v1.LicensePlate prototype) {
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
   * The license plate information of the Vehicle.  To avoid storing
   * personally-identifiable information, only the minimum information
   * about the license plate is stored as part of the entity.
   * </pre>
   *
   * Protobuf type {@code maps.fleetengine.v1.LicensePlate}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:maps.fleetengine.v1.LicensePlate)
      com.google.maps.fleetengine.v1.LicensePlateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.fleetengine.v1.Vehicles
          .internal_static_maps_fleetengine_v1_LicensePlate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.fleetengine.v1.Vehicles
          .internal_static_maps_fleetengine_v1_LicensePlate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.fleetengine.v1.LicensePlate.class,
              com.google.maps.fleetengine.v1.LicensePlate.Builder.class);
    }

    // Construct using com.google.maps.fleetengine.v1.LicensePlate.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      countryCode_ = "";
      lastCharacter_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.fleetengine.v1.Vehicles
          .internal_static_maps_fleetengine_v1_LicensePlate_descriptor;
    }

    @java.lang.Override
    public com.google.maps.fleetengine.v1.LicensePlate getDefaultInstanceForType() {
      return com.google.maps.fleetengine.v1.LicensePlate.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.fleetengine.v1.LicensePlate build() {
      com.google.maps.fleetengine.v1.LicensePlate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.fleetengine.v1.LicensePlate buildPartial() {
      com.google.maps.fleetengine.v1.LicensePlate result =
          new com.google.maps.fleetengine.v1.LicensePlate(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.maps.fleetengine.v1.LicensePlate result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.countryCode_ = countryCode_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.lastCharacter_ = lastCharacter_;
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
      if (other instanceof com.google.maps.fleetengine.v1.LicensePlate) {
        return mergeFrom((com.google.maps.fleetengine.v1.LicensePlate) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.fleetengine.v1.LicensePlate other) {
      if (other == com.google.maps.fleetengine.v1.LicensePlate.getDefaultInstance()) return this;
      if (!other.getCountryCode().isEmpty()) {
        countryCode_ = other.countryCode_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getLastCharacter().isEmpty()) {
        lastCharacter_ = other.lastCharacter_;
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
                countryCode_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                lastCharacter_ = input.readStringRequireUtf8();
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

    private java.lang.Object countryCode_ = "";

    /**
     *
     *
     * <pre>
     * Required. CLDR Country/Region Code.  For example, `US` for United States,
     * or `IN` for India.
     * </pre>
     *
     * <code>string country_code = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The countryCode.
     */
    public java.lang.String getCountryCode() {
      java.lang.Object ref = countryCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        countryCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. CLDR Country/Region Code.  For example, `US` for United States,
     * or `IN` for India.
     * </pre>
     *
     * <code>string country_code = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for countryCode.
     */
    public com.google.protobuf.ByteString getCountryCodeBytes() {
      java.lang.Object ref = countryCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        countryCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. CLDR Country/Region Code.  For example, `US` for United States,
     * or `IN` for India.
     * </pre>
     *
     * <code>string country_code = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The countryCode to set.
     * @return This builder for chaining.
     */
    public Builder setCountryCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      countryCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. CLDR Country/Region Code.  For example, `US` for United States,
     * or `IN` for India.
     * </pre>
     *
     * <code>string country_code = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCountryCode() {
      countryCode_ = getDefaultInstance().getCountryCode();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. CLDR Country/Region Code.  For example, `US` for United States,
     * or `IN` for India.
     * </pre>
     *
     * <code>string country_code = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for countryCode to set.
     * @return This builder for chaining.
     */
    public Builder setCountryCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      countryCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object lastCharacter_ = "";

    /**
     *
     *
     * <pre>
     * The last digit of the license plate or "-1" to denote no numeric value
     * is present in the license plate.
     *
     * * "ABC 1234" -&gt; "4"
     * * "AB 123 CD" -&gt; "3"
     * * "ABCDEF" -&gt; "-1"
     * </pre>
     *
     * <code>string last_character = 2;</code>
     *
     * @return The lastCharacter.
     */
    public java.lang.String getLastCharacter() {
      java.lang.Object ref = lastCharacter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastCharacter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The last digit of the license plate or "-1" to denote no numeric value
     * is present in the license plate.
     *
     * * "ABC 1234" -&gt; "4"
     * * "AB 123 CD" -&gt; "3"
     * * "ABCDEF" -&gt; "-1"
     * </pre>
     *
     * <code>string last_character = 2;</code>
     *
     * @return The bytes for lastCharacter.
     */
    public com.google.protobuf.ByteString getLastCharacterBytes() {
      java.lang.Object ref = lastCharacter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        lastCharacter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The last digit of the license plate or "-1" to denote no numeric value
     * is present in the license plate.
     *
     * * "ABC 1234" -&gt; "4"
     * * "AB 123 CD" -&gt; "3"
     * * "ABCDEF" -&gt; "-1"
     * </pre>
     *
     * <code>string last_character = 2;</code>
     *
     * @param value The lastCharacter to set.
     * @return This builder for chaining.
     */
    public Builder setLastCharacter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      lastCharacter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The last digit of the license plate or "-1" to denote no numeric value
     * is present in the license plate.
     *
     * * "ABC 1234" -&gt; "4"
     * * "AB 123 CD" -&gt; "3"
     * * "ABCDEF" -&gt; "-1"
     * </pre>
     *
     * <code>string last_character = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLastCharacter() {
      lastCharacter_ = getDefaultInstance().getLastCharacter();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The last digit of the license plate or "-1" to denote no numeric value
     * is present in the license plate.
     *
     * * "ABC 1234" -&gt; "4"
     * * "AB 123 CD" -&gt; "3"
     * * "ABCDEF" -&gt; "-1"
     * </pre>
     *
     * <code>string last_character = 2;</code>
     *
     * @param value The bytes for lastCharacter to set.
     * @return This builder for chaining.
     */
    public Builder setLastCharacterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      lastCharacter_ = value;
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

    // @@protoc_insertion_point(builder_scope:maps.fleetengine.v1.LicensePlate)
  }

  // @@protoc_insertion_point(class_scope:maps.fleetengine.v1.LicensePlate)
  private static final com.google.maps.fleetengine.v1.LicensePlate DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.fleetengine.v1.LicensePlate();
  }

  public static com.google.maps.fleetengine.v1.LicensePlate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LicensePlate> PARSER =
      new com.google.protobuf.AbstractParser<LicensePlate>() {
        @java.lang.Override
        public LicensePlate parsePartialFrom(
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

  public static com.google.protobuf.Parser<LicensePlate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LicensePlate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.fleetengine.v1.LicensePlate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
