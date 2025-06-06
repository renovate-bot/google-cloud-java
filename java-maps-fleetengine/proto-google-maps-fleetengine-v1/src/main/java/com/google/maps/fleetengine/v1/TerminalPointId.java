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
// source: google/maps/fleetengine/v1/fleetengine.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.fleetengine.v1;

/**
 *
 *
 * <pre>
 * Deprecated: TerminalPoints are no longer supported in Fleet Engine. Use
 * `TerminalLocation.point` instead.
 * </pre>
 *
 * Protobuf type {@code maps.fleetengine.v1.TerminalPointId}
 */
@java.lang.Deprecated
public final class TerminalPointId extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:maps.fleetengine.v1.TerminalPointId)
    TerminalPointIdOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use TerminalPointId.newBuilder() to construct.
  private TerminalPointId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TerminalPointId() {
    value_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TerminalPointId();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.fleetengine.v1.FleetEngine
        .internal_static_maps_fleetengine_v1_TerminalPointId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.fleetengine.v1.FleetEngine
        .internal_static_maps_fleetengine_v1_TerminalPointId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.fleetengine.v1.TerminalPointId.class,
            com.google.maps.fleetengine.v1.TerminalPointId.Builder.class);
  }

  private int idCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object id_;

  public enum IdCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    @java.lang.Deprecated
    PLACE_ID(2),
    @java.lang.Deprecated
    GENERATED_ID(3),
    ID_NOT_SET(0);
    private final int value;

    private IdCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static IdCase valueOf(int value) {
      return forNumber(value);
    }

    public static IdCase forNumber(int value) {
      switch (value) {
        case 2:
          return PLACE_ID;
        case 3:
          return GENERATED_ID;
        case 0:
          return ID_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public IdCase getIdCase() {
    return IdCase.forNumber(idCase_);
  }

  public static final int PLACE_ID_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>string place_id = 2 [deprecated = true];</code>
   *
   * @deprecated maps.fleetengine.v1.TerminalPointId.place_id is deprecated. See
   *     google/maps/fleetengine/v1/fleetengine.proto;l=43
   * @return Whether the placeId field is set.
   */
  @java.lang.Deprecated
  public boolean hasPlaceId() {
    return idCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>string place_id = 2 [deprecated = true];</code>
   *
   * @deprecated maps.fleetengine.v1.TerminalPointId.place_id is deprecated. See
   *     google/maps/fleetengine/v1/fleetengine.proto;l=43
   * @return The placeId.
   */
  @java.lang.Deprecated
  public java.lang.String getPlaceId() {
    java.lang.Object ref = "";
    if (idCase_ == 2) {
      ref = id_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (idCase_ == 2) {
        id_ = s;
      }
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>string place_id = 2 [deprecated = true];</code>
   *
   * @deprecated maps.fleetengine.v1.TerminalPointId.place_id is deprecated. See
   *     google/maps/fleetengine/v1/fleetengine.proto;l=43
   * @return The bytes for placeId.
   */
  @java.lang.Deprecated
  public com.google.protobuf.ByteString getPlaceIdBytes() {
    java.lang.Object ref = "";
    if (idCase_ == 2) {
      ref = id_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (idCase_ == 2) {
        id_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GENERATED_ID_FIELD_NUMBER = 3;

  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>string generated_id = 3 [deprecated = true];</code>
   *
   * @deprecated maps.fleetengine.v1.TerminalPointId.generated_id is deprecated. See
   *     google/maps/fleetengine/v1/fleetengine.proto;l=46
   * @return Whether the generatedId field is set.
   */
  @java.lang.Deprecated
  public boolean hasGeneratedId() {
    return idCase_ == 3;
  }

  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>string generated_id = 3 [deprecated = true];</code>
   *
   * @deprecated maps.fleetengine.v1.TerminalPointId.generated_id is deprecated. See
   *     google/maps/fleetengine/v1/fleetengine.proto;l=46
   * @return The generatedId.
   */
  @java.lang.Deprecated
  public java.lang.String getGeneratedId() {
    java.lang.Object ref = "";
    if (idCase_ == 3) {
      ref = id_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (idCase_ == 3) {
        id_ = s;
      }
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>string generated_id = 3 [deprecated = true];</code>
   *
   * @deprecated maps.fleetengine.v1.TerminalPointId.generated_id is deprecated. See
   *     google/maps/fleetengine/v1/fleetengine.proto;l=46
   * @return The bytes for generatedId.
   */
  @java.lang.Deprecated
  public com.google.protobuf.ByteString getGeneratedIdBytes() {
    java.lang.Object ref = "";
    if (idCase_ == 3) {
      ref = id_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (idCase_ == 3) {
        id_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object value_ = "";

  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>string value = 4 [deprecated = true];</code>
   *
   * @deprecated maps.fleetengine.v1.TerminalPointId.value is deprecated. See
   *     google/maps/fleetengine/v1/fleetengine.proto;l=50
   * @return The value.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>string value = 4 [deprecated = true];</code>
   *
   * @deprecated maps.fleetengine.v1.TerminalPointId.value is deprecated. See
   *     google/maps/fleetengine/v1/fleetengine.proto;l=50
   * @return The bytes for value.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.protobuf.ByteString getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      value_ = b;
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
    if (idCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, id_);
    }
    if (idCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (idCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, id_);
    }
    if (idCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, value_);
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
    if (!(obj instanceof com.google.maps.fleetengine.v1.TerminalPointId)) {
      return super.equals(obj);
    }
    com.google.maps.fleetengine.v1.TerminalPointId other =
        (com.google.maps.fleetengine.v1.TerminalPointId) obj;

    if (!getValue().equals(other.getValue())) return false;
    if (!getIdCase().equals(other.getIdCase())) return false;
    switch (idCase_) {
      case 2:
        if (!getPlaceId().equals(other.getPlaceId())) return false;
        break;
      case 3:
        if (!getGeneratedId().equals(other.getGeneratedId())) return false;
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
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    switch (idCase_) {
      case 2:
        hash = (37 * hash) + PLACE_ID_FIELD_NUMBER;
        hash = (53 * hash) + getPlaceId().hashCode();
        break;
      case 3:
        hash = (37 * hash) + GENERATED_ID_FIELD_NUMBER;
        hash = (53 * hash) + getGeneratedId().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.fleetengine.v1.TerminalPointId parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.fleetengine.v1.TerminalPointId parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.fleetengine.v1.TerminalPointId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.fleetengine.v1.TerminalPointId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.fleetengine.v1.TerminalPointId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.fleetengine.v1.TerminalPointId parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.fleetengine.v1.TerminalPointId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.fleetengine.v1.TerminalPointId parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.fleetengine.v1.TerminalPointId parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.fleetengine.v1.TerminalPointId parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.fleetengine.v1.TerminalPointId parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.fleetengine.v1.TerminalPointId parseFrom(
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

  public static Builder newBuilder(com.google.maps.fleetengine.v1.TerminalPointId prototype) {
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
   * Deprecated: TerminalPoints are no longer supported in Fleet Engine. Use
   * `TerminalLocation.point` instead.
   * </pre>
   *
   * Protobuf type {@code maps.fleetengine.v1.TerminalPointId}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:maps.fleetengine.v1.TerminalPointId)
      com.google.maps.fleetengine.v1.TerminalPointIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.fleetengine.v1.FleetEngine
          .internal_static_maps_fleetengine_v1_TerminalPointId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.fleetengine.v1.FleetEngine
          .internal_static_maps_fleetengine_v1_TerminalPointId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.fleetengine.v1.TerminalPointId.class,
              com.google.maps.fleetengine.v1.TerminalPointId.Builder.class);
    }

    // Construct using com.google.maps.fleetengine.v1.TerminalPointId.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      value_ = "";
      idCase_ = 0;
      id_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.fleetengine.v1.FleetEngine
          .internal_static_maps_fleetengine_v1_TerminalPointId_descriptor;
    }

    @java.lang.Override
    public com.google.maps.fleetengine.v1.TerminalPointId getDefaultInstanceForType() {
      return com.google.maps.fleetengine.v1.TerminalPointId.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.fleetengine.v1.TerminalPointId build() {
      com.google.maps.fleetengine.v1.TerminalPointId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.fleetengine.v1.TerminalPointId buildPartial() {
      com.google.maps.fleetengine.v1.TerminalPointId result =
          new com.google.maps.fleetengine.v1.TerminalPointId(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.maps.fleetengine.v1.TerminalPointId result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.value_ = value_;
      }
    }

    private void buildPartialOneofs(com.google.maps.fleetengine.v1.TerminalPointId result) {
      result.idCase_ = idCase_;
      result.id_ = this.id_;
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
      if (other instanceof com.google.maps.fleetengine.v1.TerminalPointId) {
        return mergeFrom((com.google.maps.fleetengine.v1.TerminalPointId) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.fleetengine.v1.TerminalPointId other) {
      if (other == com.google.maps.fleetengine.v1.TerminalPointId.getDefaultInstance()) return this;
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      switch (other.getIdCase()) {
        case PLACE_ID:
          {
            idCase_ = 2;
            id_ = other.id_;
            onChanged();
            break;
          }
        case GENERATED_ID:
          {
            idCase_ = 3;
            id_ = other.id_;
            onChanged();
            break;
          }
        case ID_NOT_SET:
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
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                idCase_ = 2;
                id_ = s;
                break;
              } // case 18
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                idCase_ = 3;
                id_ = s;
                break;
              } // case 26
            case 34:
              {
                value_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
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

    private int idCase_ = 0;
    private java.lang.Object id_;

    public IdCase getIdCase() {
      return IdCase.forNumber(idCase_);
    }

    public Builder clearId() {
      idCase_ = 0;
      id_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * Deprecated.
     * </pre>
     *
     * <code>string place_id = 2 [deprecated = true];</code>
     *
     * @deprecated maps.fleetengine.v1.TerminalPointId.place_id is deprecated. See
     *     google/maps/fleetengine/v1/fleetengine.proto;l=43
     * @return Whether the placeId field is set.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public boolean hasPlaceId() {
      return idCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * Deprecated.
     * </pre>
     *
     * <code>string place_id = 2 [deprecated = true];</code>
     *
     * @deprecated maps.fleetengine.v1.TerminalPointId.place_id is deprecated. See
     *     google/maps/fleetengine/v1/fleetengine.proto;l=43
     * @return The placeId.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.lang.String getPlaceId() {
      java.lang.Object ref = "";
      if (idCase_ == 2) {
        ref = id_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (idCase_ == 2) {
          id_ = s;
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
     * Deprecated.
     * </pre>
     *
     * <code>string place_id = 2 [deprecated = true];</code>
     *
     * @deprecated maps.fleetengine.v1.TerminalPointId.place_id is deprecated. See
     *     google/maps/fleetengine/v1/fleetengine.proto;l=43
     * @return The bytes for placeId.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public com.google.protobuf.ByteString getPlaceIdBytes() {
      java.lang.Object ref = "";
      if (idCase_ == 2) {
        ref = id_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (idCase_ == 2) {
          id_ = b;
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
     * Deprecated.
     * </pre>
     *
     * <code>string place_id = 2 [deprecated = true];</code>
     *
     * @deprecated maps.fleetengine.v1.TerminalPointId.place_id is deprecated. See
     *     google/maps/fleetengine/v1/fleetengine.proto;l=43
     * @param value The placeId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setPlaceId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      idCase_ = 2;
      id_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Deprecated.
     * </pre>
     *
     * <code>string place_id = 2 [deprecated = true];</code>
     *
     * @deprecated maps.fleetengine.v1.TerminalPointId.place_id is deprecated. See
     *     google/maps/fleetengine/v1/fleetengine.proto;l=43
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearPlaceId() {
      if (idCase_ == 2) {
        idCase_ = 0;
        id_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Deprecated.
     * </pre>
     *
     * <code>string place_id = 2 [deprecated = true];</code>
     *
     * @deprecated maps.fleetengine.v1.TerminalPointId.place_id is deprecated. See
     *     google/maps/fleetengine/v1/fleetengine.proto;l=43
     * @param value The bytes for placeId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setPlaceIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      idCase_ = 2;
      id_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Deprecated.
     * </pre>
     *
     * <code>string generated_id = 3 [deprecated = true];</code>
     *
     * @deprecated maps.fleetengine.v1.TerminalPointId.generated_id is deprecated. See
     *     google/maps/fleetengine/v1/fleetengine.proto;l=46
     * @return Whether the generatedId field is set.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public boolean hasGeneratedId() {
      return idCase_ == 3;
    }

    /**
     *
     *
     * <pre>
     * Deprecated.
     * </pre>
     *
     * <code>string generated_id = 3 [deprecated = true];</code>
     *
     * @deprecated maps.fleetengine.v1.TerminalPointId.generated_id is deprecated. See
     *     google/maps/fleetengine/v1/fleetengine.proto;l=46
     * @return The generatedId.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.lang.String getGeneratedId() {
      java.lang.Object ref = "";
      if (idCase_ == 3) {
        ref = id_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (idCase_ == 3) {
          id_ = s;
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
     * Deprecated.
     * </pre>
     *
     * <code>string generated_id = 3 [deprecated = true];</code>
     *
     * @deprecated maps.fleetengine.v1.TerminalPointId.generated_id is deprecated. See
     *     google/maps/fleetengine/v1/fleetengine.proto;l=46
     * @return The bytes for generatedId.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public com.google.protobuf.ByteString getGeneratedIdBytes() {
      java.lang.Object ref = "";
      if (idCase_ == 3) {
        ref = id_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (idCase_ == 3) {
          id_ = b;
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
     * Deprecated.
     * </pre>
     *
     * <code>string generated_id = 3 [deprecated = true];</code>
     *
     * @deprecated maps.fleetengine.v1.TerminalPointId.generated_id is deprecated. See
     *     google/maps/fleetengine/v1/fleetengine.proto;l=46
     * @param value The generatedId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setGeneratedId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      idCase_ = 3;
      id_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Deprecated.
     * </pre>
     *
     * <code>string generated_id = 3 [deprecated = true];</code>
     *
     * @deprecated maps.fleetengine.v1.TerminalPointId.generated_id is deprecated. See
     *     google/maps/fleetengine/v1/fleetengine.proto;l=46
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearGeneratedId() {
      if (idCase_ == 3) {
        idCase_ = 0;
        id_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Deprecated.
     * </pre>
     *
     * <code>string generated_id = 3 [deprecated = true];</code>
     *
     * @deprecated maps.fleetengine.v1.TerminalPointId.generated_id is deprecated. See
     *     google/maps/fleetengine/v1/fleetengine.proto;l=46
     * @param value The bytes for generatedId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setGeneratedIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      idCase_ = 3;
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object value_ = "";

    /**
     *
     *
     * <pre>
     * Deprecated.
     * </pre>
     *
     * <code>string value = 4 [deprecated = true];</code>
     *
     * @deprecated maps.fleetengine.v1.TerminalPointId.value is deprecated. See
     *     google/maps/fleetengine/v1/fleetengine.proto;l=50
     * @return The value.
     */
    @java.lang.Deprecated
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Deprecated.
     * </pre>
     *
     * <code>string value = 4 [deprecated = true];</code>
     *
     * @deprecated maps.fleetengine.v1.TerminalPointId.value is deprecated. See
     *     google/maps/fleetengine/v1/fleetengine.proto;l=50
     * @return The bytes for value.
     */
    @java.lang.Deprecated
    public com.google.protobuf.ByteString getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Deprecated.
     * </pre>
     *
     * <code>string value = 4 [deprecated = true];</code>
     *
     * @deprecated maps.fleetengine.v1.TerminalPointId.value is deprecated. See
     *     google/maps/fleetengine/v1/fleetengine.proto;l=50
     * @param value The value to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setValue(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      value_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Deprecated.
     * </pre>
     *
     * <code>string value = 4 [deprecated = true];</code>
     *
     * @deprecated maps.fleetengine.v1.TerminalPointId.value is deprecated. See
     *     google/maps/fleetengine/v1/fleetengine.proto;l=50
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearValue() {
      value_ = getDefaultInstance().getValue();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Deprecated.
     * </pre>
     *
     * <code>string value = 4 [deprecated = true];</code>
     *
     * @deprecated maps.fleetengine.v1.TerminalPointId.value is deprecated. See
     *     google/maps/fleetengine/v1/fleetengine.proto;l=50
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setValueBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      value_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:maps.fleetengine.v1.TerminalPointId)
  }

  // @@protoc_insertion_point(class_scope:maps.fleetengine.v1.TerminalPointId)
  private static final com.google.maps.fleetengine.v1.TerminalPointId DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.fleetengine.v1.TerminalPointId();
  }

  public static com.google.maps.fleetengine.v1.TerminalPointId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TerminalPointId> PARSER =
      new com.google.protobuf.AbstractParser<TerminalPointId>() {
        @java.lang.Override
        public TerminalPointId parsePartialFrom(
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

  public static com.google.protobuf.Parser<TerminalPointId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TerminalPointId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.fleetengine.v1.TerminalPointId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
