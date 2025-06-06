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
// source: google/cloud/dialogflow/cx/v3/flow.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.cx.v3;

/**
 *
 *
 * <pre>
 * The response message for
 * [Flows.ExportFlow][google.cloud.dialogflow.cx.v3.Flows.ExportFlow].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.ExportFlowResponse}
 */
public final class ExportFlowResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.ExportFlowResponse)
    ExportFlowResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ExportFlowResponse.newBuilder() to construct.
  private ExportFlowResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExportFlowResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExportFlowResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.FlowProto
        .internal_static_google_cloud_dialogflow_cx_v3_ExportFlowResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.FlowProto
        .internal_static_google_cloud_dialogflow_cx_v3_ExportFlowResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.ExportFlowResponse.class,
            com.google.cloud.dialogflow.cx.v3.ExportFlowResponse.Builder.class);
  }

  private int flowCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object flow_;

  public enum FlowCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    FLOW_URI(1),
    FLOW_CONTENT(2),
    FLOW_NOT_SET(0);
    private final int value;

    private FlowCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FlowCase valueOf(int value) {
      return forNumber(value);
    }

    public static FlowCase forNumber(int value) {
      switch (value) {
        case 1:
          return FLOW_URI;
        case 2:
          return FLOW_CONTENT;
        case 0:
          return FLOW_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public FlowCase getFlowCase() {
    return FlowCase.forNumber(flowCase_);
  }

  public static final int FLOW_URI_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * The URI to a file containing the exported flow. This field is populated
   * only if `flow_uri` is specified in
   * [ExportFlowRequest][google.cloud.dialogflow.cx.v3.ExportFlowRequest].
   * </pre>
   *
   * <code>string flow_uri = 1;</code>
   *
   * @return Whether the flowUri field is set.
   */
  public boolean hasFlowUri() {
    return flowCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * The URI to a file containing the exported flow. This field is populated
   * only if `flow_uri` is specified in
   * [ExportFlowRequest][google.cloud.dialogflow.cx.v3.ExportFlowRequest].
   * </pre>
   *
   * <code>string flow_uri = 1;</code>
   *
   * @return The flowUri.
   */
  public java.lang.String getFlowUri() {
    java.lang.Object ref = "";
    if (flowCase_ == 1) {
      ref = flow_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (flowCase_ == 1) {
        flow_ = s;
      }
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The URI to a file containing the exported flow. This field is populated
   * only if `flow_uri` is specified in
   * [ExportFlowRequest][google.cloud.dialogflow.cx.v3.ExportFlowRequest].
   * </pre>
   *
   * <code>string flow_uri = 1;</code>
   *
   * @return The bytes for flowUri.
   */
  public com.google.protobuf.ByteString getFlowUriBytes() {
    java.lang.Object ref = "";
    if (flowCase_ == 1) {
      ref = flow_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (flowCase_ == 1) {
        flow_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FLOW_CONTENT_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * Uncompressed raw byte content for flow.
   * </pre>
   *
   * <code>bytes flow_content = 2;</code>
   *
   * @return Whether the flowContent field is set.
   */
  @java.lang.Override
  public boolean hasFlowContent() {
    return flowCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * Uncompressed raw byte content for flow.
   * </pre>
   *
   * <code>bytes flow_content = 2;</code>
   *
   * @return The flowContent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFlowContent() {
    if (flowCase_ == 2) {
      return (com.google.protobuf.ByteString) flow_;
    }
    return com.google.protobuf.ByteString.EMPTY;
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
    if (flowCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, flow_);
    }
    if (flowCase_ == 2) {
      output.writeBytes(2, (com.google.protobuf.ByteString) flow_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (flowCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, flow_);
    }
    if (flowCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(
              2, (com.google.protobuf.ByteString) flow_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.ExportFlowResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.ExportFlowResponse other =
        (com.google.cloud.dialogflow.cx.v3.ExportFlowResponse) obj;

    if (!getFlowCase().equals(other.getFlowCase())) return false;
    switch (flowCase_) {
      case 1:
        if (!getFlowUri().equals(other.getFlowUri())) return false;
        break;
      case 2:
        if (!getFlowContent().equals(other.getFlowContent())) return false;
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
    switch (flowCase_) {
      case 1:
        hash = (37 * hash) + FLOW_URI_FIELD_NUMBER;
        hash = (53 * hash) + getFlowUri().hashCode();
        break;
      case 2:
        hash = (37 * hash) + FLOW_CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getFlowContent().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3.ExportFlowResponse prototype) {
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
   * The response message for
   * [Flows.ExportFlow][google.cloud.dialogflow.cx.v3.Flows.ExportFlow].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.ExportFlowResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.ExportFlowResponse)
      com.google.cloud.dialogflow.cx.v3.ExportFlowResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.FlowProto
          .internal_static_google_cloud_dialogflow_cx_v3_ExportFlowResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.FlowProto
          .internal_static_google_cloud_dialogflow_cx_v3_ExportFlowResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.ExportFlowResponse.class,
              com.google.cloud.dialogflow.cx.v3.ExportFlowResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.ExportFlowResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      flowCase_ = 0;
      flow_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.FlowProto
          .internal_static_google_cloud_dialogflow_cx_v3_ExportFlowResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ExportFlowResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.ExportFlowResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ExportFlowResponse build() {
      com.google.cloud.dialogflow.cx.v3.ExportFlowResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ExportFlowResponse buildPartial() {
      com.google.cloud.dialogflow.cx.v3.ExportFlowResponse result =
          new com.google.cloud.dialogflow.cx.v3.ExportFlowResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3.ExportFlowResponse result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.dialogflow.cx.v3.ExportFlowResponse result) {
      result.flowCase_ = flowCase_;
      result.flow_ = this.flow_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3.ExportFlowResponse) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.ExportFlowResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.ExportFlowResponse other) {
      if (other == com.google.cloud.dialogflow.cx.v3.ExportFlowResponse.getDefaultInstance())
        return this;
      switch (other.getFlowCase()) {
        case FLOW_URI:
          {
            flowCase_ = 1;
            flow_ = other.flow_;
            onChanged();
            break;
          }
        case FLOW_CONTENT:
          {
            setFlowContent(other.getFlowContent());
            break;
          }
        case FLOW_NOT_SET:
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
            case 10:
              {
                java.lang.String s = input.readStringRequireUtf8();
                flowCase_ = 1;
                flow_ = s;
                break;
              } // case 10
            case 18:
              {
                flow_ = input.readBytes();
                flowCase_ = 2;
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

    private int flowCase_ = 0;
    private java.lang.Object flow_;

    public FlowCase getFlowCase() {
      return FlowCase.forNumber(flowCase_);
    }

    public Builder clearFlow() {
      flowCase_ = 0;
      flow_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * The URI to a file containing the exported flow. This field is populated
     * only if `flow_uri` is specified in
     * [ExportFlowRequest][google.cloud.dialogflow.cx.v3.ExportFlowRequest].
     * </pre>
     *
     * <code>string flow_uri = 1;</code>
     *
     * @return Whether the flowUri field is set.
     */
    @java.lang.Override
    public boolean hasFlowUri() {
      return flowCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * The URI to a file containing the exported flow. This field is populated
     * only if `flow_uri` is specified in
     * [ExportFlowRequest][google.cloud.dialogflow.cx.v3.ExportFlowRequest].
     * </pre>
     *
     * <code>string flow_uri = 1;</code>
     *
     * @return The flowUri.
     */
    @java.lang.Override
    public java.lang.String getFlowUri() {
      java.lang.Object ref = "";
      if (flowCase_ == 1) {
        ref = flow_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (flowCase_ == 1) {
          flow_ = s;
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
     * The URI to a file containing the exported flow. This field is populated
     * only if `flow_uri` is specified in
     * [ExportFlowRequest][google.cloud.dialogflow.cx.v3.ExportFlowRequest].
     * </pre>
     *
     * <code>string flow_uri = 1;</code>
     *
     * @return The bytes for flowUri.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getFlowUriBytes() {
      java.lang.Object ref = "";
      if (flowCase_ == 1) {
        ref = flow_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (flowCase_ == 1) {
          flow_ = b;
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
     * The URI to a file containing the exported flow. This field is populated
     * only if `flow_uri` is specified in
     * [ExportFlowRequest][google.cloud.dialogflow.cx.v3.ExportFlowRequest].
     * </pre>
     *
     * <code>string flow_uri = 1;</code>
     *
     * @param value The flowUri to set.
     * @return This builder for chaining.
     */
    public Builder setFlowUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      flowCase_ = 1;
      flow_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The URI to a file containing the exported flow. This field is populated
     * only if `flow_uri` is specified in
     * [ExportFlowRequest][google.cloud.dialogflow.cx.v3.ExportFlowRequest].
     * </pre>
     *
     * <code>string flow_uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFlowUri() {
      if (flowCase_ == 1) {
        flowCase_ = 0;
        flow_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The URI to a file containing the exported flow. This field is populated
     * only if `flow_uri` is specified in
     * [ExportFlowRequest][google.cloud.dialogflow.cx.v3.ExportFlowRequest].
     * </pre>
     *
     * <code>string flow_uri = 1;</code>
     *
     * @param value The bytes for flowUri to set.
     * @return This builder for chaining.
     */
    public Builder setFlowUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      flowCase_ = 1;
      flow_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Uncompressed raw byte content for flow.
     * </pre>
     *
     * <code>bytes flow_content = 2;</code>
     *
     * @return Whether the flowContent field is set.
     */
    public boolean hasFlowContent() {
      return flowCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * Uncompressed raw byte content for flow.
     * </pre>
     *
     * <code>bytes flow_content = 2;</code>
     *
     * @return The flowContent.
     */
    public com.google.protobuf.ByteString getFlowContent() {
      if (flowCase_ == 2) {
        return (com.google.protobuf.ByteString) flow_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }

    /**
     *
     *
     * <pre>
     * Uncompressed raw byte content for flow.
     * </pre>
     *
     * <code>bytes flow_content = 2;</code>
     *
     * @param value The flowContent to set.
     * @return This builder for chaining.
     */
    public Builder setFlowContent(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      flowCase_ = 2;
      flow_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Uncompressed raw byte content for flow.
     * </pre>
     *
     * <code>bytes flow_content = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFlowContent() {
      if (flowCase_ == 2) {
        flowCase_ = 0;
        flow_ = null;
        onChanged();
      }
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.ExportFlowResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.ExportFlowResponse)
  private static final com.google.cloud.dialogflow.cx.v3.ExportFlowResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.ExportFlowResponse();
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportFlowResponse> PARSER =
      new com.google.protobuf.AbstractParser<ExportFlowResponse>() {
        @java.lang.Override
        public ExportFlowResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExportFlowResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportFlowResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.ExportFlowResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
