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
// source: google/maps/routing/v2/navigation_instruction.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.routing.v2;

/**
 *
 *
 * <pre>
 * Encapsulates navigation instructions for a
 * [`RouteLegStep`][google.maps.routing.v2.RouteLegStep].
 * </pre>
 *
 * Protobuf type {@code google.maps.routing.v2.NavigationInstruction}
 */
public final class NavigationInstruction extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.maps.routing.v2.NavigationInstruction)
    NavigationInstructionOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use NavigationInstruction.newBuilder() to construct.
  private NavigationInstruction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NavigationInstruction() {
    maneuver_ = 0;
    instructions_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NavigationInstruction();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.routing.v2.NavigationInstructionProto
        .internal_static_google_maps_routing_v2_NavigationInstruction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.routing.v2.NavigationInstructionProto
        .internal_static_google_maps_routing_v2_NavigationInstruction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.routing.v2.NavigationInstruction.class,
            com.google.maps.routing.v2.NavigationInstruction.Builder.class);
  }

  public static final int MANEUVER_FIELD_NUMBER = 1;
  private int maneuver_ = 0;

  /**
   *
   *
   * <pre>
   * Encapsulates the navigation instructions for the current step (for example,
   * turn left, merge, or straight). This field determines which icon to
   * display.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Maneuver maneuver = 1;</code>
   *
   * @return The enum numeric value on the wire for maneuver.
   */
  @java.lang.Override
  public int getManeuverValue() {
    return maneuver_;
  }

  /**
   *
   *
   * <pre>
   * Encapsulates the navigation instructions for the current step (for example,
   * turn left, merge, or straight). This field determines which icon to
   * display.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Maneuver maneuver = 1;</code>
   *
   * @return The maneuver.
   */
  @java.lang.Override
  public com.google.maps.routing.v2.Maneuver getManeuver() {
    com.google.maps.routing.v2.Maneuver result =
        com.google.maps.routing.v2.Maneuver.forNumber(maneuver_);
    return result == null ? com.google.maps.routing.v2.Maneuver.UNRECOGNIZED : result;
  }

  public static final int INSTRUCTIONS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object instructions_ = "";

  /**
   *
   *
   * <pre>
   * Instructions for navigating this step.
   * </pre>
   *
   * <code>string instructions = 2;</code>
   *
   * @return The instructions.
   */
  @java.lang.Override
  public java.lang.String getInstructions() {
    java.lang.Object ref = instructions_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instructions_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Instructions for navigating this step.
   * </pre>
   *
   * <code>string instructions = 2;</code>
   *
   * @return The bytes for instructions.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInstructionsBytes() {
    java.lang.Object ref = instructions_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      instructions_ = b;
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
    if (maneuver_ != com.google.maps.routing.v2.Maneuver.MANEUVER_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, maneuver_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instructions_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, instructions_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maneuver_ != com.google.maps.routing.v2.Maneuver.MANEUVER_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, maneuver_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instructions_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, instructions_);
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
    if (!(obj instanceof com.google.maps.routing.v2.NavigationInstruction)) {
      return super.equals(obj);
    }
    com.google.maps.routing.v2.NavigationInstruction other =
        (com.google.maps.routing.v2.NavigationInstruction) obj;

    if (maneuver_ != other.maneuver_) return false;
    if (!getInstructions().equals(other.getInstructions())) return false;
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
    hash = (37 * hash) + MANEUVER_FIELD_NUMBER;
    hash = (53 * hash) + maneuver_;
    hash = (37 * hash) + INSTRUCTIONS_FIELD_NUMBER;
    hash = (53 * hash) + getInstructions().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.routing.v2.NavigationInstruction parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.routing.v2.NavigationInstruction parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.routing.v2.NavigationInstruction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.routing.v2.NavigationInstruction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.routing.v2.NavigationInstruction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.routing.v2.NavigationInstruction parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.routing.v2.NavigationInstruction parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.routing.v2.NavigationInstruction parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.routing.v2.NavigationInstruction parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.routing.v2.NavigationInstruction parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.routing.v2.NavigationInstruction parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.routing.v2.NavigationInstruction parseFrom(
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

  public static Builder newBuilder(com.google.maps.routing.v2.NavigationInstruction prototype) {
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
   * Encapsulates navigation instructions for a
   * [`RouteLegStep`][google.maps.routing.v2.RouteLegStep].
   * </pre>
   *
   * Protobuf type {@code google.maps.routing.v2.NavigationInstruction}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.maps.routing.v2.NavigationInstruction)
      com.google.maps.routing.v2.NavigationInstructionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.routing.v2.NavigationInstructionProto
          .internal_static_google_maps_routing_v2_NavigationInstruction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.routing.v2.NavigationInstructionProto
          .internal_static_google_maps_routing_v2_NavigationInstruction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.routing.v2.NavigationInstruction.class,
              com.google.maps.routing.v2.NavigationInstruction.Builder.class);
    }

    // Construct using com.google.maps.routing.v2.NavigationInstruction.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      maneuver_ = 0;
      instructions_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.routing.v2.NavigationInstructionProto
          .internal_static_google_maps_routing_v2_NavigationInstruction_descriptor;
    }

    @java.lang.Override
    public com.google.maps.routing.v2.NavigationInstruction getDefaultInstanceForType() {
      return com.google.maps.routing.v2.NavigationInstruction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.routing.v2.NavigationInstruction build() {
      com.google.maps.routing.v2.NavigationInstruction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.routing.v2.NavigationInstruction buildPartial() {
      com.google.maps.routing.v2.NavigationInstruction result =
          new com.google.maps.routing.v2.NavigationInstruction(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.maps.routing.v2.NavigationInstruction result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maneuver_ = maneuver_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.instructions_ = instructions_;
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
      if (other instanceof com.google.maps.routing.v2.NavigationInstruction) {
        return mergeFrom((com.google.maps.routing.v2.NavigationInstruction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.routing.v2.NavigationInstruction other) {
      if (other == com.google.maps.routing.v2.NavigationInstruction.getDefaultInstance())
        return this;
      if (other.maneuver_ != 0) {
        setManeuverValue(other.getManeuverValue());
      }
      if (!other.getInstructions().isEmpty()) {
        instructions_ = other.instructions_;
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
            case 8:
              {
                maneuver_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                instructions_ = input.readStringRequireUtf8();
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

    private int maneuver_ = 0;

    /**
     *
     *
     * <pre>
     * Encapsulates the navigation instructions for the current step (for example,
     * turn left, merge, or straight). This field determines which icon to
     * display.
     * </pre>
     *
     * <code>.google.maps.routing.v2.Maneuver maneuver = 1;</code>
     *
     * @return The enum numeric value on the wire for maneuver.
     */
    @java.lang.Override
    public int getManeuverValue() {
      return maneuver_;
    }

    /**
     *
     *
     * <pre>
     * Encapsulates the navigation instructions for the current step (for example,
     * turn left, merge, or straight). This field determines which icon to
     * display.
     * </pre>
     *
     * <code>.google.maps.routing.v2.Maneuver maneuver = 1;</code>
     *
     * @param value The enum numeric value on the wire for maneuver to set.
     * @return This builder for chaining.
     */
    public Builder setManeuverValue(int value) {
      maneuver_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Encapsulates the navigation instructions for the current step (for example,
     * turn left, merge, or straight). This field determines which icon to
     * display.
     * </pre>
     *
     * <code>.google.maps.routing.v2.Maneuver maneuver = 1;</code>
     *
     * @return The maneuver.
     */
    @java.lang.Override
    public com.google.maps.routing.v2.Maneuver getManeuver() {
      com.google.maps.routing.v2.Maneuver result =
          com.google.maps.routing.v2.Maneuver.forNumber(maneuver_);
      return result == null ? com.google.maps.routing.v2.Maneuver.UNRECOGNIZED : result;
    }

    /**
     *
     *
     * <pre>
     * Encapsulates the navigation instructions for the current step (for example,
     * turn left, merge, or straight). This field determines which icon to
     * display.
     * </pre>
     *
     * <code>.google.maps.routing.v2.Maneuver maneuver = 1;</code>
     *
     * @param value The maneuver to set.
     * @return This builder for chaining.
     */
    public Builder setManeuver(com.google.maps.routing.v2.Maneuver value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      maneuver_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Encapsulates the navigation instructions for the current step (for example,
     * turn left, merge, or straight). This field determines which icon to
     * display.
     * </pre>
     *
     * <code>.google.maps.routing.v2.Maneuver maneuver = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearManeuver() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maneuver_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object instructions_ = "";

    /**
     *
     *
     * <pre>
     * Instructions for navigating this step.
     * </pre>
     *
     * <code>string instructions = 2;</code>
     *
     * @return The instructions.
     */
    public java.lang.String getInstructions() {
      java.lang.Object ref = instructions_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instructions_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Instructions for navigating this step.
     * </pre>
     *
     * <code>string instructions = 2;</code>
     *
     * @return The bytes for instructions.
     */
    public com.google.protobuf.ByteString getInstructionsBytes() {
      java.lang.Object ref = instructions_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        instructions_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Instructions for navigating this step.
     * </pre>
     *
     * <code>string instructions = 2;</code>
     *
     * @param value The instructions to set.
     * @return This builder for chaining.
     */
    public Builder setInstructions(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      instructions_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Instructions for navigating this step.
     * </pre>
     *
     * <code>string instructions = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInstructions() {
      instructions_ = getDefaultInstance().getInstructions();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Instructions for navigating this step.
     * </pre>
     *
     * <code>string instructions = 2;</code>
     *
     * @param value The bytes for instructions to set.
     * @return This builder for chaining.
     */
    public Builder setInstructionsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      instructions_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.maps.routing.v2.NavigationInstruction)
  }

  // @@protoc_insertion_point(class_scope:google.maps.routing.v2.NavigationInstruction)
  private static final com.google.maps.routing.v2.NavigationInstruction DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.routing.v2.NavigationInstruction();
  }

  public static com.google.maps.routing.v2.NavigationInstruction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NavigationInstruction> PARSER =
      new com.google.protobuf.AbstractParser<NavigationInstruction>() {
        @java.lang.Override
        public NavigationInstruction parsePartialFrom(
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

  public static com.google.protobuf.Parser<NavigationInstruction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NavigationInstruction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.routing.v2.NavigationInstruction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
