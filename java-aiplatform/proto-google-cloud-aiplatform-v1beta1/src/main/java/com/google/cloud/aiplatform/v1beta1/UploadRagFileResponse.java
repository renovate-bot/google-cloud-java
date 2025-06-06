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
// source: google/cloud/aiplatform/v1beta1/vertex_rag_data_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for
 * [VertexRagDataService.UploadRagFile][google.cloud.aiplatform.v1beta1.VertexRagDataService.UploadRagFile].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.UploadRagFileResponse}
 */
public final class UploadRagFileResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.UploadRagFileResponse)
    UploadRagFileResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UploadRagFileResponse.newBuilder() to construct.
  private UploadRagFileResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UploadRagFileResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UploadRagFileResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.VertexRagDataServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_UploadRagFileResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.VertexRagDataServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_UploadRagFileResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse.class,
            com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse.Builder.class);
  }

  private int resultCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object result_;

  public enum ResultCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    RAG_FILE(1),
    ERROR(4),
    RESULT_NOT_SET(0);
    private final int value;

    private ResultCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResultCase valueOf(int value) {
      return forNumber(value);
    }

    public static ResultCase forNumber(int value) {
      switch (value) {
        case 1:
          return RAG_FILE;
        case 4:
          return ERROR;
        case 0:
          return RESULT_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ResultCase getResultCase() {
    return ResultCase.forNumber(resultCase_);
  }

  public static final int RAG_FILE_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * The RagFile that had been uploaded into the RagCorpus.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RagFile rag_file = 1;</code>
   *
   * @return Whether the ragFile field is set.
   */
  @java.lang.Override
  public boolean hasRagFile() {
    return resultCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * The RagFile that had been uploaded into the RagCorpus.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RagFile rag_file = 1;</code>
   *
   * @return The ragFile.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RagFile getRagFile() {
    if (resultCase_ == 1) {
      return (com.google.cloud.aiplatform.v1beta1.RagFile) result_;
    }
    return com.google.cloud.aiplatform.v1beta1.RagFile.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * The RagFile that had been uploaded into the RagCorpus.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RagFile rag_file = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RagFileOrBuilder getRagFileOrBuilder() {
    if (resultCase_ == 1) {
      return (com.google.cloud.aiplatform.v1beta1.RagFile) result_;
    }
    return com.google.cloud.aiplatform.v1beta1.RagFile.getDefaultInstance();
  }

  public static final int ERROR_FIELD_NUMBER = 4;

  /**
   *
   *
   * <pre>
   * The error that occurred while processing the RagFile.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4;</code>
   *
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return resultCase_ == 4;
  }

  /**
   *
   *
   * <pre>
   * The error that occurred while processing the RagFile.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4;</code>
   *
   * @return The error.
   */
  @java.lang.Override
  public com.google.rpc.Status getError() {
    if (resultCase_ == 4) {
      return (com.google.rpc.Status) result_;
    }
    return com.google.rpc.Status.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * The error that occurred while processing the RagFile.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getErrorOrBuilder() {
    if (resultCase_ == 4) {
      return (com.google.rpc.Status) result_;
    }
    return com.google.rpc.Status.getDefaultInstance();
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
    if (resultCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.aiplatform.v1beta1.RagFile) result_);
    }
    if (resultCase_ == 4) {
      output.writeMessage(4, (com.google.rpc.Status) result_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resultCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.aiplatform.v1beta1.RagFile) result_);
    }
    if (resultCase_ == 4) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              4, (com.google.rpc.Status) result_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse other =
        (com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse) obj;

    if (!getResultCase().equals(other.getResultCase())) return false;
    switch (resultCase_) {
      case 1:
        if (!getRagFile().equals(other.getRagFile())) return false;
        break;
      case 4:
        if (!getError().equals(other.getError())) return false;
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
    switch (resultCase_) {
      case 1:
        hash = (37 * hash) + RAG_FILE_FIELD_NUMBER;
        hash = (53 * hash) + getRagFile().hashCode();
        break;
      case 4:
        hash = (37 * hash) + ERROR_FIELD_NUMBER;
        hash = (53 * hash) + getError().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse prototype) {
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
   * [VertexRagDataService.UploadRagFile][google.cloud.aiplatform.v1beta1.VertexRagDataService.UploadRagFile].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.UploadRagFileResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.UploadRagFileResponse)
      com.google.cloud.aiplatform.v1beta1.UploadRagFileResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.VertexRagDataServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UploadRagFileResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.VertexRagDataServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UploadRagFileResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse.class,
              com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (ragFileBuilder_ != null) {
        ragFileBuilder_.clear();
      }
      if (errorBuilder_ != null) {
        errorBuilder_.clear();
      }
      resultCase_ = 0;
      result_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.VertexRagDataServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UploadRagFileResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse build() {
      com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse result =
          new com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(
        com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse result) {
      result.resultCase_ = resultCase_;
      result.result_ = this.result_;
      if (resultCase_ == 1 && ragFileBuilder_ != null) {
        result.result_ = ragFileBuilder_.build();
      }
      if (resultCase_ == 4 && errorBuilder_ != null) {
        result.result_ = errorBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse other) {
      if (other == com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse.getDefaultInstance())
        return this;
      switch (other.getResultCase()) {
        case RAG_FILE:
          {
            mergeRagFile(other.getRagFile());
            break;
          }
        case ERROR:
          {
            mergeError(other.getError());
            break;
          }
        case RESULT_NOT_SET:
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
                input.readMessage(getRagFileFieldBuilder().getBuilder(), extensionRegistry);
                resultCase_ = 1;
                break;
              } // case 10
            case 34:
              {
                input.readMessage(getErrorFieldBuilder().getBuilder(), extensionRegistry);
                resultCase_ = 4;
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

    private int resultCase_ = 0;
    private java.lang.Object result_;

    public ResultCase getResultCase() {
      return ResultCase.forNumber(resultCase_);
    }

    public Builder clearResult() {
      resultCase_ = 0;
      result_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.RagFile,
            com.google.cloud.aiplatform.v1beta1.RagFile.Builder,
            com.google.cloud.aiplatform.v1beta1.RagFileOrBuilder>
        ragFileBuilder_;

    /**
     *
     *
     * <pre>
     * The RagFile that had been uploaded into the RagCorpus.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RagFile rag_file = 1;</code>
     *
     * @return Whether the ragFile field is set.
     */
    @java.lang.Override
    public boolean hasRagFile() {
      return resultCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * The RagFile that had been uploaded into the RagCorpus.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RagFile rag_file = 1;</code>
     *
     * @return The ragFile.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RagFile getRagFile() {
      if (ragFileBuilder_ == null) {
        if (resultCase_ == 1) {
          return (com.google.cloud.aiplatform.v1beta1.RagFile) result_;
        }
        return com.google.cloud.aiplatform.v1beta1.RagFile.getDefaultInstance();
      } else {
        if (resultCase_ == 1) {
          return ragFileBuilder_.getMessage();
        }
        return com.google.cloud.aiplatform.v1beta1.RagFile.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * The RagFile that had been uploaded into the RagCorpus.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RagFile rag_file = 1;</code>
     */
    public Builder setRagFile(com.google.cloud.aiplatform.v1beta1.RagFile value) {
      if (ragFileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        ragFileBuilder_.setMessage(value);
      }
      resultCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * The RagFile that had been uploaded into the RagCorpus.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RagFile rag_file = 1;</code>
     */
    public Builder setRagFile(com.google.cloud.aiplatform.v1beta1.RagFile.Builder builderForValue) {
      if (ragFileBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        ragFileBuilder_.setMessage(builderForValue.build());
      }
      resultCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * The RagFile that had been uploaded into the RagCorpus.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RagFile rag_file = 1;</code>
     */
    public Builder mergeRagFile(com.google.cloud.aiplatform.v1beta1.RagFile value) {
      if (ragFileBuilder_ == null) {
        if (resultCase_ == 1
            && result_ != com.google.cloud.aiplatform.v1beta1.RagFile.getDefaultInstance()) {
          result_ =
              com.google.cloud.aiplatform.v1beta1.RagFile.newBuilder(
                      (com.google.cloud.aiplatform.v1beta1.RagFile) result_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        if (resultCase_ == 1) {
          ragFileBuilder_.mergeFrom(value);
        } else {
          ragFileBuilder_.setMessage(value);
        }
      }
      resultCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * The RagFile that had been uploaded into the RagCorpus.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RagFile rag_file = 1;</code>
     */
    public Builder clearRagFile() {
      if (ragFileBuilder_ == null) {
        if (resultCase_ == 1) {
          resultCase_ = 0;
          result_ = null;
          onChanged();
        }
      } else {
        if (resultCase_ == 1) {
          resultCase_ = 0;
          result_ = null;
        }
        ragFileBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The RagFile that had been uploaded into the RagCorpus.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RagFile rag_file = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RagFile.Builder getRagFileBuilder() {
      return getRagFileFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The RagFile that had been uploaded into the RagCorpus.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RagFile rag_file = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RagFileOrBuilder getRagFileOrBuilder() {
      if ((resultCase_ == 1) && (ragFileBuilder_ != null)) {
        return ragFileBuilder_.getMessageOrBuilder();
      } else {
        if (resultCase_ == 1) {
          return (com.google.cloud.aiplatform.v1beta1.RagFile) result_;
        }
        return com.google.cloud.aiplatform.v1beta1.RagFile.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * The RagFile that had been uploaded into the RagCorpus.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RagFile rag_file = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.RagFile,
            com.google.cloud.aiplatform.v1beta1.RagFile.Builder,
            com.google.cloud.aiplatform.v1beta1.RagFileOrBuilder>
        getRagFileFieldBuilder() {
      if (ragFileBuilder_ == null) {
        if (!(resultCase_ == 1)) {
          result_ = com.google.cloud.aiplatform.v1beta1.RagFile.getDefaultInstance();
        }
        ragFileBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.RagFile,
                com.google.cloud.aiplatform.v1beta1.RagFile.Builder,
                com.google.cloud.aiplatform.v1beta1.RagFileOrBuilder>(
                (com.google.cloud.aiplatform.v1beta1.RagFile) result_,
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      resultCase_ = 1;
      onChanged();
      return ragFileBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        errorBuilder_;

    /**
     *
     *
     * <pre>
     * The error that occurred while processing the RagFile.
     * </pre>
     *
     * <code>.google.rpc.Status error = 4;</code>
     *
     * @return Whether the error field is set.
     */
    @java.lang.Override
    public boolean hasError() {
      return resultCase_ == 4;
    }

    /**
     *
     *
     * <pre>
     * The error that occurred while processing the RagFile.
     * </pre>
     *
     * <code>.google.rpc.Status error = 4;</code>
     *
     * @return The error.
     */
    @java.lang.Override
    public com.google.rpc.Status getError() {
      if (errorBuilder_ == null) {
        if (resultCase_ == 4) {
          return (com.google.rpc.Status) result_;
        }
        return com.google.rpc.Status.getDefaultInstance();
      } else {
        if (resultCase_ == 4) {
          return errorBuilder_.getMessage();
        }
        return com.google.rpc.Status.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * The error that occurred while processing the RagFile.
     * </pre>
     *
     * <code>.google.rpc.Status error = 4;</code>
     */
    public Builder setError(com.google.rpc.Status value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        errorBuilder_.setMessage(value);
      }
      resultCase_ = 4;
      return this;
    }

    /**
     *
     *
     * <pre>
     * The error that occurred while processing the RagFile.
     * </pre>
     *
     * <code>.google.rpc.Status error = 4;</code>
     */
    public Builder setError(com.google.rpc.Status.Builder builderForValue) {
      if (errorBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }
      resultCase_ = 4;
      return this;
    }

    /**
     *
     *
     * <pre>
     * The error that occurred while processing the RagFile.
     * </pre>
     *
     * <code>.google.rpc.Status error = 4;</code>
     */
    public Builder mergeError(com.google.rpc.Status value) {
      if (errorBuilder_ == null) {
        if (resultCase_ == 4 && result_ != com.google.rpc.Status.getDefaultInstance()) {
          result_ =
              com.google.rpc.Status.newBuilder((com.google.rpc.Status) result_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        if (resultCase_ == 4) {
          errorBuilder_.mergeFrom(value);
        } else {
          errorBuilder_.setMessage(value);
        }
      }
      resultCase_ = 4;
      return this;
    }

    /**
     *
     *
     * <pre>
     * The error that occurred while processing the RagFile.
     * </pre>
     *
     * <code>.google.rpc.Status error = 4;</code>
     */
    public Builder clearError() {
      if (errorBuilder_ == null) {
        if (resultCase_ == 4) {
          resultCase_ = 0;
          result_ = null;
          onChanged();
        }
      } else {
        if (resultCase_ == 4) {
          resultCase_ = 0;
          result_ = null;
        }
        errorBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The error that occurred while processing the RagFile.
     * </pre>
     *
     * <code>.google.rpc.Status error = 4;</code>
     */
    public com.google.rpc.Status.Builder getErrorBuilder() {
      return getErrorFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The error that occurred while processing the RagFile.
     * </pre>
     *
     * <code>.google.rpc.Status error = 4;</code>
     */
    @java.lang.Override
    public com.google.rpc.StatusOrBuilder getErrorOrBuilder() {
      if ((resultCase_ == 4) && (errorBuilder_ != null)) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        if (resultCase_ == 4) {
          return (com.google.rpc.Status) result_;
        }
        return com.google.rpc.Status.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * The error that occurred while processing the RagFile.
     * </pre>
     *
     * <code>.google.rpc.Status error = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        if (!(resultCase_ == 4)) {
          result_ = com.google.rpc.Status.getDefaultInstance();
        }
        errorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.rpc.Status,
                com.google.rpc.Status.Builder,
                com.google.rpc.StatusOrBuilder>(
                (com.google.rpc.Status) result_, getParentForChildren(), isClean());
        result_ = null;
      }
      resultCase_ = 4;
      onChanged();
      return errorBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.UploadRagFileResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.UploadRagFileResponse)
  private static final com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UploadRagFileResponse> PARSER =
      new com.google.protobuf.AbstractParser<UploadRagFileResponse>() {
        @java.lang.Override
        public UploadRagFileResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UploadRagFileResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UploadRagFileResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
