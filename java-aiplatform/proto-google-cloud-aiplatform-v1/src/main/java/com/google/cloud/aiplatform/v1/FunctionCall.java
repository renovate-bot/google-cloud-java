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
// source: google/cloud/aiplatform/v1/tool.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * A predicted [FunctionCall] returned from the model that contains a string
 * representing the [FunctionDeclaration.name] and a structured JSON object
 * containing the parameters and their values.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.FunctionCall}
 */
public final class FunctionCall extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.FunctionCall)
    FunctionCallOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use FunctionCall.newBuilder() to construct.
  private FunctionCall(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FunctionCall() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FunctionCall();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.ToolProto
        .internal_static_google_cloud_aiplatform_v1_FunctionCall_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ToolProto
        .internal_static_google_cloud_aiplatform_v1_FunctionCall_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.FunctionCall.class,
            com.google.cloud.aiplatform.v1.FunctionCall.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * Required. The name of the function to call.
   * Matches [FunctionDeclaration.name].
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
   * Required. The name of the function to call.
   * Matches [FunctionDeclaration.name].
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

  public static final int ARGS_FIELD_NUMBER = 2;
  private com.google.protobuf.Struct args_;

  /**
   *
   *
   * <pre>
   * Optional. Required. The function parameters and values in JSON object
   * format. See [FunctionDeclaration.parameters] for parameter details.
   * </pre>
   *
   * <code>.google.protobuf.Struct args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the args field is set.
   */
  @java.lang.Override
  public boolean hasArgs() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Optional. Required. The function parameters and values in JSON object
   * format. See [FunctionDeclaration.parameters] for parameter details.
   * </pre>
   *
   * <code>.google.protobuf.Struct args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The args.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getArgs() {
    return args_ == null ? com.google.protobuf.Struct.getDefaultInstance() : args_;
  }

  /**
   *
   *
   * <pre>
   * Optional. Required. The function parameters and values in JSON object
   * format. See [FunctionDeclaration.parameters] for parameter details.
   * </pre>
   *
   * <code>.google.protobuf.Struct args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getArgsOrBuilder() {
    return args_ == null ? com.google.protobuf.Struct.getDefaultInstance() : args_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getArgs());
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getArgs());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.FunctionCall)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.FunctionCall other =
        (com.google.cloud.aiplatform.v1.FunctionCall) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasArgs() != other.hasArgs()) return false;
    if (hasArgs()) {
      if (!getArgs().equals(other.getArgs())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasArgs()) {
      hash = (37 * hash) + ARGS_FIELD_NUMBER;
      hash = (53 * hash) + getArgs().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.FunctionCall parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.FunctionCall parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.FunctionCall parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.FunctionCall parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.FunctionCall parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.FunctionCall parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.FunctionCall parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.FunctionCall parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.FunctionCall parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.FunctionCall parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.FunctionCall parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.FunctionCall parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.FunctionCall prototype) {
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
   * A predicted [FunctionCall] returned from the model that contains a string
   * representing the [FunctionDeclaration.name] and a structured JSON object
   * containing the parameters and their values.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.FunctionCall}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.FunctionCall)
      com.google.cloud.aiplatform.v1.FunctionCallOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.ToolProto
          .internal_static_google_cloud_aiplatform_v1_FunctionCall_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ToolProto
          .internal_static_google_cloud_aiplatform_v1_FunctionCall_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.FunctionCall.class,
              com.google.cloud.aiplatform.v1.FunctionCall.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.FunctionCall.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getArgsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      args_ = null;
      if (argsBuilder_ != null) {
        argsBuilder_.dispose();
        argsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ToolProto
          .internal_static_google_cloud_aiplatform_v1_FunctionCall_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.FunctionCall getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.FunctionCall.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.FunctionCall build() {
      com.google.cloud.aiplatform.v1.FunctionCall result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.FunctionCall buildPartial() {
      com.google.cloud.aiplatform.v1.FunctionCall result =
          new com.google.cloud.aiplatform.v1.FunctionCall(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.FunctionCall result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.args_ = argsBuilder_ == null ? args_ : argsBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.FunctionCall) {
        return mergeFrom((com.google.cloud.aiplatform.v1.FunctionCall) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.FunctionCall other) {
      if (other == com.google.cloud.aiplatform.v1.FunctionCall.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasArgs()) {
        mergeArgs(other.getArgs());
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
            case 18:
              {
                input.readMessage(getArgsFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object name_ = "";

    /**
     *
     *
     * <pre>
     * Required. The name of the function to call.
     * Matches [FunctionDeclaration.name].
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The name of the function to call.
     * Matches [FunctionDeclaration.name].
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The name of the function to call.
     * Matches [FunctionDeclaration.name].
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The name of the function to call.
     * Matches [FunctionDeclaration.name].
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The name of the function to call.
     * Matches [FunctionDeclaration.name].
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

    private com.google.protobuf.Struct args_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        argsBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. Required. The function parameters and values in JSON object
     * format. See [FunctionDeclaration.parameters] for parameter details.
     * </pre>
     *
     * <code>.google.protobuf.Struct args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the args field is set.
     */
    public boolean hasArgs() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Optional. Required. The function parameters and values in JSON object
     * format. See [FunctionDeclaration.parameters] for parameter details.
     * </pre>
     *
     * <code>.google.protobuf.Struct args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The args.
     */
    public com.google.protobuf.Struct getArgs() {
      if (argsBuilder_ == null) {
        return args_ == null ? com.google.protobuf.Struct.getDefaultInstance() : args_;
      } else {
        return argsBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Required. The function parameters and values in JSON object
     * format. See [FunctionDeclaration.parameters] for parameter details.
     * </pre>
     *
     * <code>.google.protobuf.Struct args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setArgs(com.google.protobuf.Struct value) {
      if (argsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        args_ = value;
      } else {
        argsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Required. The function parameters and values in JSON object
     * format. See [FunctionDeclaration.parameters] for parameter details.
     * </pre>
     *
     * <code>.google.protobuf.Struct args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setArgs(com.google.protobuf.Struct.Builder builderForValue) {
      if (argsBuilder_ == null) {
        args_ = builderForValue.build();
      } else {
        argsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Required. The function parameters and values in JSON object
     * format. See [FunctionDeclaration.parameters] for parameter details.
     * </pre>
     *
     * <code>.google.protobuf.Struct args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeArgs(com.google.protobuf.Struct value) {
      if (argsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && args_ != null
            && args_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getArgsBuilder().mergeFrom(value);
        } else {
          args_ = value;
        }
      } else {
        argsBuilder_.mergeFrom(value);
      }
      if (args_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Required. The function parameters and values in JSON object
     * format. See [FunctionDeclaration.parameters] for parameter details.
     * </pre>
     *
     * <code>.google.protobuf.Struct args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearArgs() {
      bitField0_ = (bitField0_ & ~0x00000002);
      args_ = null;
      if (argsBuilder_ != null) {
        argsBuilder_.dispose();
        argsBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Required. The function parameters and values in JSON object
     * format. See [FunctionDeclaration.parameters] for parameter details.
     * </pre>
     *
     * <code>.google.protobuf.Struct args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.Struct.Builder getArgsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getArgsFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Optional. Required. The function parameters and values in JSON object
     * format. See [FunctionDeclaration.parameters] for parameter details.
     * </pre>
     *
     * <code>.google.protobuf.Struct args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.StructOrBuilder getArgsOrBuilder() {
      if (argsBuilder_ != null) {
        return argsBuilder_.getMessageOrBuilder();
      } else {
        return args_ == null ? com.google.protobuf.Struct.getDefaultInstance() : args_;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Required. The function parameters and values in JSON object
     * format. See [FunctionDeclaration.parameters] for parameter details.
     * </pre>
     *
     * <code>.google.protobuf.Struct args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        getArgsFieldBuilder() {
      if (argsBuilder_ == null) {
        argsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Struct,
                com.google.protobuf.Struct.Builder,
                com.google.protobuf.StructOrBuilder>(getArgs(), getParentForChildren(), isClean());
        args_ = null;
      }
      return argsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.FunctionCall)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.FunctionCall)
  private static final com.google.cloud.aiplatform.v1.FunctionCall DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.FunctionCall();
  }

  public static com.google.cloud.aiplatform.v1.FunctionCall getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FunctionCall> PARSER =
      new com.google.protobuf.AbstractParser<FunctionCall>() {
        @java.lang.Override
        public FunctionCall parsePartialFrom(
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

  public static com.google.protobuf.Parser<FunctionCall> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FunctionCall> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.FunctionCall getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
