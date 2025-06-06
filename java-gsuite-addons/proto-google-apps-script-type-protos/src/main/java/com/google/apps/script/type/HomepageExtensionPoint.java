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
// source: google/apps/script/type/extension_point.proto

// Protobuf Java Version: 3.25.8
package com.google.apps.script.type;

/**
 *
 *
 * <pre>
 * Common format for declaring an add-on's home-page view.
 * </pre>
 *
 * Protobuf type {@code google.apps.script.type.HomepageExtensionPoint}
 */
public final class HomepageExtensionPoint extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.apps.script.type.HomepageExtensionPoint)
    HomepageExtensionPointOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use HomepageExtensionPoint.newBuilder() to construct.
  private HomepageExtensionPoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HomepageExtensionPoint() {
    runFunction_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new HomepageExtensionPoint();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.apps.script.type.ExtensionPoint
        .internal_static_google_apps_script_type_HomepageExtensionPoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.script.type.ExtensionPoint
        .internal_static_google_apps_script_type_HomepageExtensionPoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.script.type.HomepageExtensionPoint.class,
            com.google.apps.script.type.HomepageExtensionPoint.Builder.class);
  }

  private int bitField0_;
  public static final int RUN_FUNCTION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object runFunction_ = "";

  /**
   *
   *
   * <pre>
   * Required. The endpoint to execute when this extension point is
   * activated.
   * </pre>
   *
   * <code>string run_function = 1;</code>
   *
   * @return The runFunction.
   */
  @java.lang.Override
  public java.lang.String getRunFunction() {
    java.lang.Object ref = runFunction_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      runFunction_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The endpoint to execute when this extension point is
   * activated.
   * </pre>
   *
   * <code>string run_function = 1;</code>
   *
   * @return The bytes for runFunction.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRunFunctionBytes() {
    java.lang.Object ref = runFunction_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      runFunction_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENABLED_FIELD_NUMBER = 2;
  private com.google.protobuf.BoolValue enabled_;

  /**
   *
   *
   * <pre>
   * Optional. If set to `false`, disable the home-page view in this context.
   *
   * Defaults to `true` if unset.
   *
   * If an add-ons custom home-page view is disabled, an autogenerated overview
   * card will be provided for users instead.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enabled = 2;</code>
   *
   * @return Whether the enabled field is set.
   */
  @java.lang.Override
  public boolean hasEnabled() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Optional. If set to `false`, disable the home-page view in this context.
   *
   * Defaults to `true` if unset.
   *
   * If an add-ons custom home-page view is disabled, an autogenerated overview
   * card will be provided for users instead.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enabled = 2;</code>
   *
   * @return The enabled.
   */
  @java.lang.Override
  public com.google.protobuf.BoolValue getEnabled() {
    return enabled_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : enabled_;
  }

  /**
   *
   *
   * <pre>
   * Optional. If set to `false`, disable the home-page view in this context.
   *
   * Defaults to `true` if unset.
   *
   * If an add-ons custom home-page view is disabled, an autogenerated overview
   * card will be provided for users instead.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enabled = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.BoolValueOrBuilder getEnabledOrBuilder() {
    return enabled_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : enabled_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(runFunction_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, runFunction_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getEnabled());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(runFunction_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, runFunction_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEnabled());
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
    if (!(obj instanceof com.google.apps.script.type.HomepageExtensionPoint)) {
      return super.equals(obj);
    }
    com.google.apps.script.type.HomepageExtensionPoint other =
        (com.google.apps.script.type.HomepageExtensionPoint) obj;

    if (!getRunFunction().equals(other.getRunFunction())) return false;
    if (hasEnabled() != other.hasEnabled()) return false;
    if (hasEnabled()) {
      if (!getEnabled().equals(other.getEnabled())) return false;
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
    hash = (37 * hash) + RUN_FUNCTION_FIELD_NUMBER;
    hash = (53 * hash) + getRunFunction().hashCode();
    if (hasEnabled()) {
      hash = (37 * hash) + ENABLED_FIELD_NUMBER;
      hash = (53 * hash) + getEnabled().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.script.type.HomepageExtensionPoint parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.script.type.HomepageExtensionPoint parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.script.type.HomepageExtensionPoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.script.type.HomepageExtensionPoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.script.type.HomepageExtensionPoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.script.type.HomepageExtensionPoint parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.script.type.HomepageExtensionPoint parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.HomepageExtensionPoint parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.script.type.HomepageExtensionPoint parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.HomepageExtensionPoint parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.script.type.HomepageExtensionPoint parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.HomepageExtensionPoint parseFrom(
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

  public static Builder newBuilder(com.google.apps.script.type.HomepageExtensionPoint prototype) {
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
   * Common format for declaring an add-on's home-page view.
   * </pre>
   *
   * Protobuf type {@code google.apps.script.type.HomepageExtensionPoint}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.apps.script.type.HomepageExtensionPoint)
      com.google.apps.script.type.HomepageExtensionPointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.apps.script.type.ExtensionPoint
          .internal_static_google_apps_script_type_HomepageExtensionPoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.script.type.ExtensionPoint
          .internal_static_google_apps_script_type_HomepageExtensionPoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.script.type.HomepageExtensionPoint.class,
              com.google.apps.script.type.HomepageExtensionPoint.Builder.class);
    }

    // Construct using com.google.apps.script.type.HomepageExtensionPoint.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEnabledFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      runFunction_ = "";
      enabled_ = null;
      if (enabledBuilder_ != null) {
        enabledBuilder_.dispose();
        enabledBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.apps.script.type.ExtensionPoint
          .internal_static_google_apps_script_type_HomepageExtensionPoint_descriptor;
    }

    @java.lang.Override
    public com.google.apps.script.type.HomepageExtensionPoint getDefaultInstanceForType() {
      return com.google.apps.script.type.HomepageExtensionPoint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.script.type.HomepageExtensionPoint build() {
      com.google.apps.script.type.HomepageExtensionPoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.script.type.HomepageExtensionPoint buildPartial() {
      com.google.apps.script.type.HomepageExtensionPoint result =
          new com.google.apps.script.type.HomepageExtensionPoint(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.apps.script.type.HomepageExtensionPoint result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.runFunction_ = runFunction_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.enabled_ = enabledBuilder_ == null ? enabled_ : enabledBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.apps.script.type.HomepageExtensionPoint) {
        return mergeFrom((com.google.apps.script.type.HomepageExtensionPoint) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.script.type.HomepageExtensionPoint other) {
      if (other == com.google.apps.script.type.HomepageExtensionPoint.getDefaultInstance())
        return this;
      if (!other.getRunFunction().isEmpty()) {
        runFunction_ = other.runFunction_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasEnabled()) {
        mergeEnabled(other.getEnabled());
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
                runFunction_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getEnabledFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object runFunction_ = "";

    /**
     *
     *
     * <pre>
     * Required. The endpoint to execute when this extension point is
     * activated.
     * </pre>
     *
     * <code>string run_function = 1;</code>
     *
     * @return The runFunction.
     */
    public java.lang.String getRunFunction() {
      java.lang.Object ref = runFunction_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        runFunction_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The endpoint to execute when this extension point is
     * activated.
     * </pre>
     *
     * <code>string run_function = 1;</code>
     *
     * @return The bytes for runFunction.
     */
    public com.google.protobuf.ByteString getRunFunctionBytes() {
      java.lang.Object ref = runFunction_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        runFunction_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The endpoint to execute when this extension point is
     * activated.
     * </pre>
     *
     * <code>string run_function = 1;</code>
     *
     * @param value The runFunction to set.
     * @return This builder for chaining.
     */
    public Builder setRunFunction(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      runFunction_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The endpoint to execute when this extension point is
     * activated.
     * </pre>
     *
     * <code>string run_function = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRunFunction() {
      runFunction_ = getDefaultInstance().getRunFunction();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The endpoint to execute when this extension point is
     * activated.
     * </pre>
     *
     * <code>string run_function = 1;</code>
     *
     * @param value The bytes for runFunction to set.
     * @return This builder for chaining.
     */
    public Builder setRunFunctionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      runFunction_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.BoolValue enabled_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue,
            com.google.protobuf.BoolValue.Builder,
            com.google.protobuf.BoolValueOrBuilder>
        enabledBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. If set to `false`, disable the home-page view in this context.
     *
     * Defaults to `true` if unset.
     *
     * If an add-ons custom home-page view is disabled, an autogenerated overview
     * card will be provided for users instead.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enabled = 2;</code>
     *
     * @return Whether the enabled field is set.
     */
    public boolean hasEnabled() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Optional. If set to `false`, disable the home-page view in this context.
     *
     * Defaults to `true` if unset.
     *
     * If an add-ons custom home-page view is disabled, an autogenerated overview
     * card will be provided for users instead.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enabled = 2;</code>
     *
     * @return The enabled.
     */
    public com.google.protobuf.BoolValue getEnabled() {
      if (enabledBuilder_ == null) {
        return enabled_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : enabled_;
      } else {
        return enabledBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. If set to `false`, disable the home-page view in this context.
     *
     * Defaults to `true` if unset.
     *
     * If an add-ons custom home-page view is disabled, an autogenerated overview
     * card will be provided for users instead.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enabled = 2;</code>
     */
    public Builder setEnabled(com.google.protobuf.BoolValue value) {
      if (enabledBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        enabled_ = value;
      } else {
        enabledBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. If set to `false`, disable the home-page view in this context.
     *
     * Defaults to `true` if unset.
     *
     * If an add-ons custom home-page view is disabled, an autogenerated overview
     * card will be provided for users instead.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enabled = 2;</code>
     */
    public Builder setEnabled(com.google.protobuf.BoolValue.Builder builderForValue) {
      if (enabledBuilder_ == null) {
        enabled_ = builderForValue.build();
      } else {
        enabledBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. If set to `false`, disable the home-page view in this context.
     *
     * Defaults to `true` if unset.
     *
     * If an add-ons custom home-page view is disabled, an autogenerated overview
     * card will be provided for users instead.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enabled = 2;</code>
     */
    public Builder mergeEnabled(com.google.protobuf.BoolValue value) {
      if (enabledBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && enabled_ != null
            && enabled_ != com.google.protobuf.BoolValue.getDefaultInstance()) {
          getEnabledBuilder().mergeFrom(value);
        } else {
          enabled_ = value;
        }
      } else {
        enabledBuilder_.mergeFrom(value);
      }
      if (enabled_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. If set to `false`, disable the home-page view in this context.
     *
     * Defaults to `true` if unset.
     *
     * If an add-ons custom home-page view is disabled, an autogenerated overview
     * card will be provided for users instead.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enabled = 2;</code>
     */
    public Builder clearEnabled() {
      bitField0_ = (bitField0_ & ~0x00000002);
      enabled_ = null;
      if (enabledBuilder_ != null) {
        enabledBuilder_.dispose();
        enabledBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. If set to `false`, disable the home-page view in this context.
     *
     * Defaults to `true` if unset.
     *
     * If an add-ons custom home-page view is disabled, an autogenerated overview
     * card will be provided for users instead.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enabled = 2;</code>
     */
    public com.google.protobuf.BoolValue.Builder getEnabledBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEnabledFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Optional. If set to `false`, disable the home-page view in this context.
     *
     * Defaults to `true` if unset.
     *
     * If an add-ons custom home-page view is disabled, an autogenerated overview
     * card will be provided for users instead.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enabled = 2;</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getEnabledOrBuilder() {
      if (enabledBuilder_ != null) {
        return enabledBuilder_.getMessageOrBuilder();
      } else {
        return enabled_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : enabled_;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. If set to `false`, disable the home-page view in this context.
     *
     * Defaults to `true` if unset.
     *
     * If an add-ons custom home-page view is disabled, an autogenerated overview
     * card will be provided for users instead.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enabled = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue,
            com.google.protobuf.BoolValue.Builder,
            com.google.protobuf.BoolValueOrBuilder>
        getEnabledFieldBuilder() {
      if (enabledBuilder_ == null) {
        enabledBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.BoolValue,
                com.google.protobuf.BoolValue.Builder,
                com.google.protobuf.BoolValueOrBuilder>(
                getEnabled(), getParentForChildren(), isClean());
        enabled_ = null;
      }
      return enabledBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.apps.script.type.HomepageExtensionPoint)
  }

  // @@protoc_insertion_point(class_scope:google.apps.script.type.HomepageExtensionPoint)
  private static final com.google.apps.script.type.HomepageExtensionPoint DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.apps.script.type.HomepageExtensionPoint();
  }

  public static com.google.apps.script.type.HomepageExtensionPoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HomepageExtensionPoint> PARSER =
      new com.google.protobuf.AbstractParser<HomepageExtensionPoint>() {
        @java.lang.Override
        public HomepageExtensionPoint parsePartialFrom(
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

  public static com.google.protobuf.Parser<HomepageExtensionPoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HomepageExtensionPoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.script.type.HomepageExtensionPoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
