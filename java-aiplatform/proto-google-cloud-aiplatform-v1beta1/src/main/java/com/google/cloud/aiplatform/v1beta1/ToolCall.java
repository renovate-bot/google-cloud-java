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
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Spec for tool call.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ToolCall}
 */
public final class ToolCall extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ToolCall)
    ToolCallOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ToolCall.newBuilder() to construct.
  private ToolCall(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ToolCall() {
    toolName_ = "";
    toolInput_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ToolCall();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ToolCall_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ToolCall_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ToolCall.class,
            com.google.cloud.aiplatform.v1beta1.ToolCall.Builder.class);
  }

  private int bitField0_;
  public static final int TOOL_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object toolName_ = "";

  /**
   *
   *
   * <pre>
   * Required. Spec for tool name
   * </pre>
   *
   * <code>optional string tool_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the toolName field is set.
   */
  @java.lang.Override
  public boolean hasToolName() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. Spec for tool name
   * </pre>
   *
   * <code>optional string tool_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The toolName.
   */
  @java.lang.Override
  public java.lang.String getToolName() {
    java.lang.Object ref = toolName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toolName_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. Spec for tool name
   * </pre>
   *
   * <code>optional string tool_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for toolName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getToolNameBytes() {
    java.lang.Object ref = toolName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      toolName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOOL_INPUT_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object toolInput_ = "";

  /**
   *
   *
   * <pre>
   * Optional. Spec for tool input
   * </pre>
   *
   * <code>optional string tool_input = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the toolInput field is set.
   */
  @java.lang.Override
  public boolean hasToolInput() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Optional. Spec for tool input
   * </pre>
   *
   * <code>optional string tool_input = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The toolInput.
   */
  @java.lang.Override
  public java.lang.String getToolInput() {
    java.lang.Object ref = toolInput_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toolInput_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. Spec for tool input
   * </pre>
   *
   * <code>optional string tool_input = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for toolInput.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getToolInputBytes() {
    java.lang.Object ref = toolInput_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      toolInput_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, toolName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, toolInput_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, toolName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, toolInput_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ToolCall)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ToolCall other =
        (com.google.cloud.aiplatform.v1beta1.ToolCall) obj;

    if (hasToolName() != other.hasToolName()) return false;
    if (hasToolName()) {
      if (!getToolName().equals(other.getToolName())) return false;
    }
    if (hasToolInput() != other.hasToolInput()) return false;
    if (hasToolInput()) {
      if (!getToolInput().equals(other.getToolInput())) return false;
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
    if (hasToolName()) {
      hash = (37 * hash) + TOOL_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getToolName().hashCode();
    }
    if (hasToolInput()) {
      hash = (37 * hash) + TOOL_INPUT_FIELD_NUMBER;
      hash = (53 * hash) + getToolInput().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolCall parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolCall parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolCall parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolCall parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolCall parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolCall parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolCall parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolCall parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolCall parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolCall parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolCall parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolCall parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.ToolCall prototype) {
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
   * Spec for tool call.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ToolCall}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ToolCall)
      com.google.cloud.aiplatform.v1beta1.ToolCallOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ToolCall_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ToolCall_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ToolCall.class,
              com.google.cloud.aiplatform.v1beta1.ToolCall.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ToolCall.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      toolName_ = "";
      toolInput_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ToolCall_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ToolCall getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ToolCall.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ToolCall build() {
      com.google.cloud.aiplatform.v1beta1.ToolCall result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ToolCall buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ToolCall result =
          new com.google.cloud.aiplatform.v1beta1.ToolCall(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.ToolCall result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.toolName_ = toolName_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.toolInput_ = toolInput_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ToolCall) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ToolCall) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ToolCall other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ToolCall.getDefaultInstance()) return this;
      if (other.hasToolName()) {
        toolName_ = other.toolName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasToolInput()) {
        toolInput_ = other.toolInput_;
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
                toolName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                toolInput_ = input.readStringRequireUtf8();
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

    private java.lang.Object toolName_ = "";

    /**
     *
     *
     * <pre>
     * Required. Spec for tool name
     * </pre>
     *
     * <code>optional string tool_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the toolName field is set.
     */
    public boolean hasToolName() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. Spec for tool name
     * </pre>
     *
     * <code>optional string tool_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The toolName.
     */
    public java.lang.String getToolName() {
      java.lang.Object ref = toolName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toolName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Spec for tool name
     * </pre>
     *
     * <code>optional string tool_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for toolName.
     */
    public com.google.protobuf.ByteString getToolNameBytes() {
      java.lang.Object ref = toolName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        toolName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Spec for tool name
     * </pre>
     *
     * <code>optional string tool_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The toolName to set.
     * @return This builder for chaining.
     */
    public Builder setToolName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      toolName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Spec for tool name
     * </pre>
     *
     * <code>optional string tool_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearToolName() {
      toolName_ = getDefaultInstance().getToolName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Spec for tool name
     * </pre>
     *
     * <code>optional string tool_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for toolName to set.
     * @return This builder for chaining.
     */
    public Builder setToolNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      toolName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object toolInput_ = "";

    /**
     *
     *
     * <pre>
     * Optional. Spec for tool input
     * </pre>
     *
     * <code>optional string tool_input = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the toolInput field is set.
     */
    public boolean hasToolInput() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Optional. Spec for tool input
     * </pre>
     *
     * <code>optional string tool_input = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The toolInput.
     */
    public java.lang.String getToolInput() {
      java.lang.Object ref = toolInput_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toolInput_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Spec for tool input
     * </pre>
     *
     * <code>optional string tool_input = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for toolInput.
     */
    public com.google.protobuf.ByteString getToolInputBytes() {
      java.lang.Object ref = toolInput_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        toolInput_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Spec for tool input
     * </pre>
     *
     * <code>optional string tool_input = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The toolInput to set.
     * @return This builder for chaining.
     */
    public Builder setToolInput(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      toolInput_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Spec for tool input
     * </pre>
     *
     * <code>optional string tool_input = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearToolInput() {
      toolInput_ = getDefaultInstance().getToolInput();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Spec for tool input
     * </pre>
     *
     * <code>optional string tool_input = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for toolInput to set.
     * @return This builder for chaining.
     */
    public Builder setToolInputBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      toolInput_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ToolCall)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ToolCall)
  private static final com.google.cloud.aiplatform.v1beta1.ToolCall DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ToolCall();
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolCall getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ToolCall> PARSER =
      new com.google.protobuf.AbstractParser<ToolCall>() {
        @java.lang.Override
        public ToolCall parsePartialFrom(
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

  public static com.google.protobuf.Parser<ToolCall> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ToolCall> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ToolCall getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
