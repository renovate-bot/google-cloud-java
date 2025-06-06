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
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.cx.v3beta1;

/**
 *
 *
 * <pre>
 * The request message for
 * [TestCases.ImportTestCases][google.cloud.dialogflow.cx.v3beta1.TestCases.ImportTestCases].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest}
 */
public final class ImportTestCasesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest)
    ImportTestCasesRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ImportTestCasesRequest.newBuilder() to construct.
  private ImportTestCasesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImportTestCasesRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImportTestCasesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_ImportTestCasesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_ImportTestCasesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest.class,
            com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest.Builder.class);
  }

  private int sourceCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object source_;

  public enum SourceCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GCS_URI(2),
    CONTENT(3),
    SOURCE_NOT_SET(0);
    private final int value;

    private SourceCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 2:
          return GCS_URI;
        case 3:
          return CONTENT;
        case 0:
          return SOURCE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase getSourceCase() {
    return SourceCase.forNumber(sourceCase_);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The agent to import test cases to.
   * Format: `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The agent to import test cases to.
   * Format: `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GCS_URI_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI
   * to import test cases from. The format of this URI must be
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   *
   * Dialogflow performs a read operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have read permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string gcs_uri = 2;</code>
   *
   * @return Whether the gcsUri field is set.
   */
  public boolean hasGcsUri() {
    return sourceCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI
   * to import test cases from. The format of this URI must be
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   *
   * Dialogflow performs a read operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have read permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string gcs_uri = 2;</code>
   *
   * @return The gcsUri.
   */
  public java.lang.String getGcsUri() {
    java.lang.Object ref = "";
    if (sourceCase_ == 2) {
      ref = source_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (sourceCase_ == 2) {
        source_ = s;
      }
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI
   * to import test cases from. The format of this URI must be
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   *
   * Dialogflow performs a read operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have read permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string gcs_uri = 2;</code>
   *
   * @return The bytes for gcsUri.
   */
  public com.google.protobuf.ByteString getGcsUriBytes() {
    java.lang.Object ref = "";
    if (sourceCase_ == 2) {
      ref = source_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (sourceCase_ == 2) {
        source_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTENT_FIELD_NUMBER = 3;

  /**
   *
   *
   * <pre>
   * Uncompressed raw byte content for test cases.
   * </pre>
   *
   * <code>bytes content = 3;</code>
   *
   * @return Whether the content field is set.
   */
  @java.lang.Override
  public boolean hasContent() {
    return sourceCase_ == 3;
  }

  /**
   *
   *
   * <pre>
   * Uncompressed raw byte content for test cases.
   * </pre>
   *
   * <code>bytes content = 3;</code>
   *
   * @return The content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContent() {
    if (sourceCase_ == 3) {
      return (com.google.protobuf.ByteString) source_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (sourceCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, source_);
    }
    if (sourceCase_ == 3) {
      output.writeBytes(3, (com.google.protobuf.ByteString) source_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (sourceCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, source_);
    }
    if (sourceCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(
              3, (com.google.protobuf.ByteString) source_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest other =
        (com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 2:
        if (!getGcsUri().equals(other.getGcsUri())) return false;
        break;
      case 3:
        if (!getContent().equals(other.getContent())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    switch (sourceCase_) {
      case 2:
        hash = (37 * hash) + GCS_URI_FIELD_NUMBER;
        hash = (53 * hash) + getGcsUri().hashCode();
        break;
      case 3:
        hash = (37 * hash) + CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getContent().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest parseFrom(
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
      com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest prototype) {
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
   * The request message for
   * [TestCases.ImportTestCases][google.cloud.dialogflow.cx.v3beta1.TestCases.ImportTestCases].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest)
      com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_ImportTestCasesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_ImportTestCasesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest.class,
              com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_ImportTestCasesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest build() {
      com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest result =
          new com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
    }

    private void buildPartialOneofs(
        com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest result) {
      result.sourceCase_ = sourceCase_;
      result.source_ = this.source_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest other) {
      if (other
          == com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      switch (other.getSourceCase()) {
        case GCS_URI:
          {
            sourceCase_ = 2;
            source_ = other.source_;
            onChanged();
            break;
          }
        case CONTENT:
          {
            setContent(other.getContent());
            break;
          }
        case SOURCE_NOT_SET:
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                sourceCase_ = 2;
                source_ = s;
                break;
              } // case 18
            case 26:
              {
                source_ = input.readBytes();
                sourceCase_ = 3;
                break;
              } // case 26
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

    private int sourceCase_ = 0;
    private java.lang.Object source_;

    public SourceCase getSourceCase() {
      return SourceCase.forNumber(sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object parent_ = "";

    /**
     *
     *
     * <pre>
     * Required. The agent to import test cases to.
     * Format: `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The agent to import test cases to.
     * Format: `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The agent to import test cases to.
     * Format: `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The agent to import test cases to.
     * Format: `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The agent to import test cases to.
     * Format: `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI
     * to import test cases from. The format of this URI must be
     * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
     *
     * Dialogflow performs a read operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have read permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string gcs_uri = 2;</code>
     *
     * @return Whether the gcsUri field is set.
     */
    @java.lang.Override
    public boolean hasGcsUri() {
      return sourceCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI
     * to import test cases from. The format of this URI must be
     * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
     *
     * Dialogflow performs a read operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have read permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string gcs_uri = 2;</code>
     *
     * @return The gcsUri.
     */
    @java.lang.Override
    public java.lang.String getGcsUri() {
      java.lang.Object ref = "";
      if (sourceCase_ == 2) {
        ref = source_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (sourceCase_ == 2) {
          source_ = s;
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
     * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI
     * to import test cases from. The format of this URI must be
     * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
     *
     * Dialogflow performs a read operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have read permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string gcs_uri = 2;</code>
     *
     * @return The bytes for gcsUri.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getGcsUriBytes() {
      java.lang.Object ref = "";
      if (sourceCase_ == 2) {
        ref = source_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (sourceCase_ == 2) {
          source_ = b;
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
     * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI
     * to import test cases from. The format of this URI must be
     * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
     *
     * Dialogflow performs a read operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have read permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string gcs_uri = 2;</code>
     *
     * @param value The gcsUri to set.
     * @return This builder for chaining.
     */
    public Builder setGcsUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sourceCase_ = 2;
      source_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI
     * to import test cases from. The format of this URI must be
     * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
     *
     * Dialogflow performs a read operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have read permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string gcs_uri = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGcsUri() {
      if (sourceCase_ == 2) {
        sourceCase_ = 0;
        source_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI
     * to import test cases from. The format of this URI must be
     * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
     *
     * Dialogflow performs a read operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have read permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string gcs_uri = 2;</code>
     *
     * @param value The bytes for gcsUri to set.
     * @return This builder for chaining.
     */
    public Builder setGcsUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sourceCase_ = 2;
      source_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Uncompressed raw byte content for test cases.
     * </pre>
     *
     * <code>bytes content = 3;</code>
     *
     * @return Whether the content field is set.
     */
    public boolean hasContent() {
      return sourceCase_ == 3;
    }

    /**
     *
     *
     * <pre>
     * Uncompressed raw byte content for test cases.
     * </pre>
     *
     * <code>bytes content = 3;</code>
     *
     * @return The content.
     */
    public com.google.protobuf.ByteString getContent() {
      if (sourceCase_ == 3) {
        return (com.google.protobuf.ByteString) source_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }

    /**
     *
     *
     * <pre>
     * Uncompressed raw byte content for test cases.
     * </pre>
     *
     * <code>bytes content = 3;</code>
     *
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sourceCase_ = 3;
      source_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Uncompressed raw byte content for test cases.
     * </pre>
     *
     * <code>bytes content = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      if (sourceCase_ == 3) {
        sourceCase_ = 0;
        source_ = null;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest)
  private static final com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportTestCasesRequest> PARSER =
      new com.google.protobuf.AbstractParser<ImportTestCasesRequest>() {
        @java.lang.Override
        public ImportTestCasesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportTestCasesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportTestCasesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.ImportTestCasesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
