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
// source: google/apps/script/type/script_manifest.proto

// Protobuf Java Version: 3.25.8
package com.google.apps.script.type;

/**
 *
 *
 * <pre>
 * Card layout properties shared across all add-on host applications.
 * </pre>
 *
 * Protobuf type {@code google.apps.script.type.LayoutProperties}
 */
public final class LayoutProperties extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.apps.script.type.LayoutProperties)
    LayoutPropertiesOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use LayoutProperties.newBuilder() to construct.
  private LayoutProperties(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LayoutProperties() {
    primaryColor_ = "";
    secondaryColor_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LayoutProperties();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.apps.script.type.ScriptManifest
        .internal_static_google_apps_script_type_LayoutProperties_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.script.type.ScriptManifest
        .internal_static_google_apps_script_type_LayoutProperties_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.script.type.LayoutProperties.class,
            com.google.apps.script.type.LayoutProperties.Builder.class);
  }

  public static final int PRIMARY_COLOR_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object primaryColor_ = "";

  /**
   *
   *
   * <pre>
   * The primary color of the add-on. It sets the color of toolbar. If no
   * primary color is set explicitly, the default value provided by the
   * framework is used.
   * </pre>
   *
   * <code>string primary_color = 1;</code>
   *
   * @return The primaryColor.
   */
  @java.lang.Override
  public java.lang.String getPrimaryColor() {
    java.lang.Object ref = primaryColor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      primaryColor_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The primary color of the add-on. It sets the color of toolbar. If no
   * primary color is set explicitly, the default value provided by the
   * framework is used.
   * </pre>
   *
   * <code>string primary_color = 1;</code>
   *
   * @return The bytes for primaryColor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPrimaryColorBytes() {
    java.lang.Object ref = primaryColor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      primaryColor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECONDARY_COLOR_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object secondaryColor_ = "";

  /**
   *
   *
   * <pre>
   * The secondary color of the add-on. It sets the color of buttons.
   * If primary color is set but no secondary color is set, the
   * secondary color is the same as the primary color. If neither primary
   * color nor secondary color is set, the default value provided by the
   * framework is used.
   * </pre>
   *
   * <code>string secondary_color = 2;</code>
   *
   * @return The secondaryColor.
   */
  @java.lang.Override
  public java.lang.String getSecondaryColor() {
    java.lang.Object ref = secondaryColor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      secondaryColor_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The secondary color of the add-on. It sets the color of buttons.
   * If primary color is set but no secondary color is set, the
   * secondary color is the same as the primary color. If neither primary
   * color nor secondary color is set, the default value provided by the
   * framework is used.
   * </pre>
   *
   * <code>string secondary_color = 2;</code>
   *
   * @return The bytes for secondaryColor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSecondaryColorBytes() {
    java.lang.Object ref = secondaryColor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      secondaryColor_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(primaryColor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, primaryColor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secondaryColor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, secondaryColor_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(primaryColor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, primaryColor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secondaryColor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, secondaryColor_);
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
    if (!(obj instanceof com.google.apps.script.type.LayoutProperties)) {
      return super.equals(obj);
    }
    com.google.apps.script.type.LayoutProperties other =
        (com.google.apps.script.type.LayoutProperties) obj;

    if (!getPrimaryColor().equals(other.getPrimaryColor())) return false;
    if (!getSecondaryColor().equals(other.getSecondaryColor())) return false;
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
    hash = (37 * hash) + PRIMARY_COLOR_FIELD_NUMBER;
    hash = (53 * hash) + getPrimaryColor().hashCode();
    hash = (37 * hash) + SECONDARY_COLOR_FIELD_NUMBER;
    hash = (53 * hash) + getSecondaryColor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.script.type.LayoutProperties parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.script.type.LayoutProperties parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.script.type.LayoutProperties parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.script.type.LayoutProperties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.script.type.LayoutProperties parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.script.type.LayoutProperties parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.script.type.LayoutProperties parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.LayoutProperties parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.script.type.LayoutProperties parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.LayoutProperties parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.script.type.LayoutProperties parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.LayoutProperties parseFrom(
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

  public static Builder newBuilder(com.google.apps.script.type.LayoutProperties prototype) {
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
   * Card layout properties shared across all add-on host applications.
   * </pre>
   *
   * Protobuf type {@code google.apps.script.type.LayoutProperties}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.apps.script.type.LayoutProperties)
      com.google.apps.script.type.LayoutPropertiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.apps.script.type.ScriptManifest
          .internal_static_google_apps_script_type_LayoutProperties_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.script.type.ScriptManifest
          .internal_static_google_apps_script_type_LayoutProperties_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.script.type.LayoutProperties.class,
              com.google.apps.script.type.LayoutProperties.Builder.class);
    }

    // Construct using com.google.apps.script.type.LayoutProperties.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      primaryColor_ = "";
      secondaryColor_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.apps.script.type.ScriptManifest
          .internal_static_google_apps_script_type_LayoutProperties_descriptor;
    }

    @java.lang.Override
    public com.google.apps.script.type.LayoutProperties getDefaultInstanceForType() {
      return com.google.apps.script.type.LayoutProperties.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.script.type.LayoutProperties build() {
      com.google.apps.script.type.LayoutProperties result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.script.type.LayoutProperties buildPartial() {
      com.google.apps.script.type.LayoutProperties result =
          new com.google.apps.script.type.LayoutProperties(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.apps.script.type.LayoutProperties result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.primaryColor_ = primaryColor_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.secondaryColor_ = secondaryColor_;
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
      if (other instanceof com.google.apps.script.type.LayoutProperties) {
        return mergeFrom((com.google.apps.script.type.LayoutProperties) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.script.type.LayoutProperties other) {
      if (other == com.google.apps.script.type.LayoutProperties.getDefaultInstance()) return this;
      if (!other.getPrimaryColor().isEmpty()) {
        primaryColor_ = other.primaryColor_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSecondaryColor().isEmpty()) {
        secondaryColor_ = other.secondaryColor_;
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
                primaryColor_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                secondaryColor_ = input.readStringRequireUtf8();
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

    private java.lang.Object primaryColor_ = "";

    /**
     *
     *
     * <pre>
     * The primary color of the add-on. It sets the color of toolbar. If no
     * primary color is set explicitly, the default value provided by the
     * framework is used.
     * </pre>
     *
     * <code>string primary_color = 1;</code>
     *
     * @return The primaryColor.
     */
    public java.lang.String getPrimaryColor() {
      java.lang.Object ref = primaryColor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        primaryColor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The primary color of the add-on. It sets the color of toolbar. If no
     * primary color is set explicitly, the default value provided by the
     * framework is used.
     * </pre>
     *
     * <code>string primary_color = 1;</code>
     *
     * @return The bytes for primaryColor.
     */
    public com.google.protobuf.ByteString getPrimaryColorBytes() {
      java.lang.Object ref = primaryColor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        primaryColor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The primary color of the add-on. It sets the color of toolbar. If no
     * primary color is set explicitly, the default value provided by the
     * framework is used.
     * </pre>
     *
     * <code>string primary_color = 1;</code>
     *
     * @param value The primaryColor to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryColor(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      primaryColor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The primary color of the add-on. It sets the color of toolbar. If no
     * primary color is set explicitly, the default value provided by the
     * framework is used.
     * </pre>
     *
     * <code>string primary_color = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrimaryColor() {
      primaryColor_ = getDefaultInstance().getPrimaryColor();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The primary color of the add-on. It sets the color of toolbar. If no
     * primary color is set explicitly, the default value provided by the
     * framework is used.
     * </pre>
     *
     * <code>string primary_color = 1;</code>
     *
     * @param value The bytes for primaryColor to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryColorBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      primaryColor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object secondaryColor_ = "";

    /**
     *
     *
     * <pre>
     * The secondary color of the add-on. It sets the color of buttons.
     * If primary color is set but no secondary color is set, the
     * secondary color is the same as the primary color. If neither primary
     * color nor secondary color is set, the default value provided by the
     * framework is used.
     * </pre>
     *
     * <code>string secondary_color = 2;</code>
     *
     * @return The secondaryColor.
     */
    public java.lang.String getSecondaryColor() {
      java.lang.Object ref = secondaryColor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        secondaryColor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The secondary color of the add-on. It sets the color of buttons.
     * If primary color is set but no secondary color is set, the
     * secondary color is the same as the primary color. If neither primary
     * color nor secondary color is set, the default value provided by the
     * framework is used.
     * </pre>
     *
     * <code>string secondary_color = 2;</code>
     *
     * @return The bytes for secondaryColor.
     */
    public com.google.protobuf.ByteString getSecondaryColorBytes() {
      java.lang.Object ref = secondaryColor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        secondaryColor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The secondary color of the add-on. It sets the color of buttons.
     * If primary color is set but no secondary color is set, the
     * secondary color is the same as the primary color. If neither primary
     * color nor secondary color is set, the default value provided by the
     * framework is used.
     * </pre>
     *
     * <code>string secondary_color = 2;</code>
     *
     * @param value The secondaryColor to set.
     * @return This builder for chaining.
     */
    public Builder setSecondaryColor(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      secondaryColor_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The secondary color of the add-on. It sets the color of buttons.
     * If primary color is set but no secondary color is set, the
     * secondary color is the same as the primary color. If neither primary
     * color nor secondary color is set, the default value provided by the
     * framework is used.
     * </pre>
     *
     * <code>string secondary_color = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSecondaryColor() {
      secondaryColor_ = getDefaultInstance().getSecondaryColor();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The secondary color of the add-on. It sets the color of buttons.
     * If primary color is set but no secondary color is set, the
     * secondary color is the same as the primary color. If neither primary
     * color nor secondary color is set, the default value provided by the
     * framework is used.
     * </pre>
     *
     * <code>string secondary_color = 2;</code>
     *
     * @param value The bytes for secondaryColor to set.
     * @return This builder for chaining.
     */
    public Builder setSecondaryColorBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      secondaryColor_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.apps.script.type.LayoutProperties)
  }

  // @@protoc_insertion_point(class_scope:google.apps.script.type.LayoutProperties)
  private static final com.google.apps.script.type.LayoutProperties DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.apps.script.type.LayoutProperties();
  }

  public static com.google.apps.script.type.LayoutProperties getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LayoutProperties> PARSER =
      new com.google.protobuf.AbstractParser<LayoutProperties>() {
        @java.lang.Override
        public LayoutProperties parsePartialFrom(
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

  public static com.google.protobuf.Parser<LayoutProperties> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LayoutProperties> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.script.type.LayoutProperties getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
