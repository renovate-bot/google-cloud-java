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
// source: google/cloud/aiplatform/v1/metadata_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [MetadataService.ListExecutions][google.cloud.aiplatform.v1.MetadataService.ListExecutions].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ListExecutionsResponse}
 */
public final class ListExecutionsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ListExecutionsResponse)
    ListExecutionsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListExecutionsResponse.newBuilder() to construct.
  private ListExecutionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListExecutionsResponse() {
    executions_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListExecutionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.MetadataServiceProto
        .internal_static_google_cloud_aiplatform_v1_ListExecutionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.MetadataServiceProto
        .internal_static_google_cloud_aiplatform_v1_ListExecutionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ListExecutionsResponse.class,
            com.google.cloud.aiplatform.v1.ListExecutionsResponse.Builder.class);
  }

  public static final int EXECUTIONS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1.Execution> executions_;

  /**
   *
   *
   * <pre>
   * The Executions retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1.Execution> getExecutionsList() {
    return executions_;
  }

  /**
   *
   *
   * <pre>
   * The Executions retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1.ExecutionOrBuilder>
      getExecutionsOrBuilderList() {
    return executions_;
  }

  /**
   *
   *
   * <pre>
   * The Executions retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
   */
  @java.lang.Override
  public int getExecutionsCount() {
    return executions_.size();
  }

  /**
   *
   *
   * <pre>
   * The Executions retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.Execution getExecutions(int index) {
    return executions_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The Executions retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ExecutionOrBuilder getExecutionsOrBuilder(int index) {
    return executions_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [ListExecutionsRequest.page_token][google.cloud.aiplatform.v1.ListExecutionsRequest.page_token]
   * to retrieve the next page.
   * If this field is not populated, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [ListExecutionsRequest.page_token][google.cloud.aiplatform.v1.ListExecutionsRequest.page_token]
   * to retrieve the next page.
   * If this field is not populated, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < executions_.size(); i++) {
      output.writeMessage(1, executions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < executions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, executions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ListExecutionsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ListExecutionsResponse other =
        (com.google.cloud.aiplatform.v1.ListExecutionsResponse) obj;

    if (!getExecutionsList().equals(other.getExecutionsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getExecutionsCount() > 0) {
      hash = (37 * hash) + EXECUTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getExecutionsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ListExecutionsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListExecutionsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListExecutionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListExecutionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListExecutionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListExecutionsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListExecutionsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListExecutionsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListExecutionsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListExecutionsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListExecutionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListExecutionsResponse parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.aiplatform.v1.ListExecutionsResponse prototype) {
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
   * Response message for
   * [MetadataService.ListExecutions][google.cloud.aiplatform.v1.MetadataService.ListExecutions].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ListExecutionsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ListExecutionsResponse)
      com.google.cloud.aiplatform.v1.ListExecutionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListExecutionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListExecutionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ListExecutionsResponse.class,
              com.google.cloud.aiplatform.v1.ListExecutionsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ListExecutionsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (executionsBuilder_ == null) {
        executions_ = java.util.Collections.emptyList();
      } else {
        executions_ = null;
        executionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListExecutionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListExecutionsResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ListExecutionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListExecutionsResponse build() {
      com.google.cloud.aiplatform.v1.ListExecutionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListExecutionsResponse buildPartial() {
      com.google.cloud.aiplatform.v1.ListExecutionsResponse result =
          new com.google.cloud.aiplatform.v1.ListExecutionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.aiplatform.v1.ListExecutionsResponse result) {
      if (executionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          executions_ = java.util.Collections.unmodifiableList(executions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.executions_ = executions_;
      } else {
        result.executions_ = executionsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.ListExecutionsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.ListExecutionsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ListExecutionsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ListExecutionsResponse other) {
      if (other == com.google.cloud.aiplatform.v1.ListExecutionsResponse.getDefaultInstance())
        return this;
      if (executionsBuilder_ == null) {
        if (!other.executions_.isEmpty()) {
          if (executions_.isEmpty()) {
            executions_ = other.executions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExecutionsIsMutable();
            executions_.addAll(other.executions_);
          }
          onChanged();
        }
      } else {
        if (!other.executions_.isEmpty()) {
          if (executionsBuilder_.isEmpty()) {
            executionsBuilder_.dispose();
            executionsBuilder_ = null;
            executions_ = other.executions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            executionsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getExecutionsFieldBuilder()
                    : null;
          } else {
            executionsBuilder_.addAllMessages(other.executions_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloud.aiplatform.v1.Execution m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1.Execution.parser(), extensionRegistry);
                if (executionsBuilder_ == null) {
                  ensureExecutionsIsMutable();
                  executions_.add(m);
                } else {
                  executionsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.aiplatform.v1.Execution> executions_ =
        java.util.Collections.emptyList();

    private void ensureExecutionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        executions_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1.Execution>(executions_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Execution,
            com.google.cloud.aiplatform.v1.Execution.Builder,
            com.google.cloud.aiplatform.v1.ExecutionOrBuilder>
        executionsBuilder_;

    /**
     *
     *
     * <pre>
     * The Executions retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.Execution> getExecutionsList() {
      if (executionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(executions_);
      } else {
        return executionsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The Executions retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
     */
    public int getExecutionsCount() {
      if (executionsBuilder_ == null) {
        return executions_.size();
      } else {
        return executionsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The Executions retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.Execution getExecutions(int index) {
      if (executionsBuilder_ == null) {
        return executions_.get(index);
      } else {
        return executionsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The Executions retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
     */
    public Builder setExecutions(int index, com.google.cloud.aiplatform.v1.Execution value) {
      if (executionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExecutionsIsMutable();
        executions_.set(index, value);
        onChanged();
      } else {
        executionsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Executions retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
     */
    public Builder setExecutions(
        int index, com.google.cloud.aiplatform.v1.Execution.Builder builderForValue) {
      if (executionsBuilder_ == null) {
        ensureExecutionsIsMutable();
        executions_.set(index, builderForValue.build());
        onChanged();
      } else {
        executionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Executions retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
     */
    public Builder addExecutions(com.google.cloud.aiplatform.v1.Execution value) {
      if (executionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExecutionsIsMutable();
        executions_.add(value);
        onChanged();
      } else {
        executionsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Executions retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
     */
    public Builder addExecutions(int index, com.google.cloud.aiplatform.v1.Execution value) {
      if (executionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExecutionsIsMutable();
        executions_.add(index, value);
        onChanged();
      } else {
        executionsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Executions retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
     */
    public Builder addExecutions(com.google.cloud.aiplatform.v1.Execution.Builder builderForValue) {
      if (executionsBuilder_ == null) {
        ensureExecutionsIsMutable();
        executions_.add(builderForValue.build());
        onChanged();
      } else {
        executionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Executions retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
     */
    public Builder addExecutions(
        int index, com.google.cloud.aiplatform.v1.Execution.Builder builderForValue) {
      if (executionsBuilder_ == null) {
        ensureExecutionsIsMutable();
        executions_.add(index, builderForValue.build());
        onChanged();
      } else {
        executionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Executions retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
     */
    public Builder addAllExecutions(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1.Execution> values) {
      if (executionsBuilder_ == null) {
        ensureExecutionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, executions_);
        onChanged();
      } else {
        executionsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Executions retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
     */
    public Builder clearExecutions() {
      if (executionsBuilder_ == null) {
        executions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        executionsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Executions retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
     */
    public Builder removeExecutions(int index) {
      if (executionsBuilder_ == null) {
        ensureExecutionsIsMutable();
        executions_.remove(index);
        onChanged();
      } else {
        executionsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Executions retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.Execution.Builder getExecutionsBuilder(int index) {
      return getExecutionsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The Executions retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.ExecutionOrBuilder getExecutionsOrBuilder(int index) {
      if (executionsBuilder_ == null) {
        return executions_.get(index);
      } else {
        return executionsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The Executions retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1.ExecutionOrBuilder>
        getExecutionsOrBuilderList() {
      if (executionsBuilder_ != null) {
        return executionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(executions_);
      }
    }

    /**
     *
     *
     * <pre>
     * The Executions retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.Execution.Builder addExecutionsBuilder() {
      return getExecutionsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1.Execution.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The Executions retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.Execution.Builder addExecutionsBuilder(int index) {
      return getExecutionsFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1.Execution.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The Executions retrieved from the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.Execution.Builder>
        getExecutionsBuilderList() {
      return getExecutionsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Execution,
            com.google.cloud.aiplatform.v1.Execution.Builder,
            com.google.cloud.aiplatform.v1.ExecutionOrBuilder>
        getExecutionsFieldBuilder() {
      if (executionsBuilder_ == null) {
        executionsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1.Execution,
                com.google.cloud.aiplatform.v1.Execution.Builder,
                com.google.cloud.aiplatform.v1.ExecutionOrBuilder>(
                executions_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        executions_ = null;
      }
      return executionsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [ListExecutionsRequest.page_token][google.cloud.aiplatform.v1.ListExecutionsRequest.page_token]
     * to retrieve the next page.
     * If this field is not populated, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [ListExecutionsRequest.page_token][google.cloud.aiplatform.v1.ListExecutionsRequest.page_token]
     * to retrieve the next page.
     * If this field is not populated, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [ListExecutionsRequest.page_token][google.cloud.aiplatform.v1.ListExecutionsRequest.page_token]
     * to retrieve the next page.
     * If this field is not populated, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [ListExecutionsRequest.page_token][google.cloud.aiplatform.v1.ListExecutionsRequest.page_token]
     * to retrieve the next page.
     * If this field is not populated, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [ListExecutionsRequest.page_token][google.cloud.aiplatform.v1.ListExecutionsRequest.page_token]
     * to retrieve the next page.
     * If this field is not populated, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ListExecutionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ListExecutionsResponse)
  private static final com.google.cloud.aiplatform.v1.ListExecutionsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ListExecutionsResponse();
  }

  public static com.google.cloud.aiplatform.v1.ListExecutionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListExecutionsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListExecutionsResponse>() {
        @java.lang.Override
        public ListExecutionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListExecutionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListExecutionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ListExecutionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
