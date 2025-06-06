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
// source: google/cloud/documentai/v1beta3/document_io.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.documentai.v1beta3;

/**
 *
 *
 * <pre>
 * Specifies a set of documents on Cloud Storage.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1beta3.GcsDocuments}
 */
public final class GcsDocuments extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1beta3.GcsDocuments)
    GcsDocumentsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use GcsDocuments.newBuilder() to construct.
  private GcsDocuments(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GcsDocuments() {
    documents_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GcsDocuments();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.documentai.v1beta3.DocumentIoProto
        .internal_static_google_cloud_documentai_v1beta3_GcsDocuments_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1beta3.DocumentIoProto
        .internal_static_google_cloud_documentai_v1beta3_GcsDocuments_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1beta3.GcsDocuments.class,
            com.google.cloud.documentai.v1beta3.GcsDocuments.Builder.class);
  }

  public static final int DOCUMENTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.documentai.v1beta3.GcsDocument> documents_;

  /**
   *
   *
   * <pre>
   * The list of documents.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.documentai.v1beta3.GcsDocument> getDocumentsList() {
    return documents_;
  }

  /**
   *
   *
   * <pre>
   * The list of documents.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.documentai.v1beta3.GcsDocumentOrBuilder>
      getDocumentsOrBuilderList() {
    return documents_;
  }

  /**
   *
   *
   * <pre>
   * The list of documents.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
   */
  @java.lang.Override
  public int getDocumentsCount() {
    return documents_.size();
  }

  /**
   *
   *
   * <pre>
   * The list of documents.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.GcsDocument getDocuments(int index) {
    return documents_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The list of documents.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.GcsDocumentOrBuilder getDocumentsOrBuilder(int index) {
    return documents_.get(index);
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
    for (int i = 0; i < documents_.size(); i++) {
      output.writeMessage(1, documents_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < documents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, documents_.get(i));
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
    if (!(obj instanceof com.google.cloud.documentai.v1beta3.GcsDocuments)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1beta3.GcsDocuments other =
        (com.google.cloud.documentai.v1beta3.GcsDocuments) obj;

    if (!getDocumentsList().equals(other.getDocumentsList())) return false;
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
    if (getDocumentsCount() > 0) {
      hash = (37 * hash) + DOCUMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getDocumentsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1beta3.GcsDocuments parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta3.GcsDocuments parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.GcsDocuments parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta3.GcsDocuments parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.GcsDocuments parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta3.GcsDocuments parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.GcsDocuments parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta3.GcsDocuments parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.GcsDocuments parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta3.GcsDocuments parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.GcsDocuments parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta3.GcsDocuments parseFrom(
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

  public static Builder newBuilder(com.google.cloud.documentai.v1beta3.GcsDocuments prototype) {
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
   * Specifies a set of documents on Cloud Storage.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1beta3.GcsDocuments}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1beta3.GcsDocuments)
      com.google.cloud.documentai.v1beta3.GcsDocumentsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.documentai.v1beta3.DocumentIoProto
          .internal_static_google_cloud_documentai_v1beta3_GcsDocuments_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1beta3.DocumentIoProto
          .internal_static_google_cloud_documentai_v1beta3_GcsDocuments_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1beta3.GcsDocuments.class,
              com.google.cloud.documentai.v1beta3.GcsDocuments.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1beta3.GcsDocuments.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (documentsBuilder_ == null) {
        documents_ = java.util.Collections.emptyList();
      } else {
        documents_ = null;
        documentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.documentai.v1beta3.DocumentIoProto
          .internal_static_google_cloud_documentai_v1beta3_GcsDocuments_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.GcsDocuments getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1beta3.GcsDocuments.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.GcsDocuments build() {
      com.google.cloud.documentai.v1beta3.GcsDocuments result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.GcsDocuments buildPartial() {
      com.google.cloud.documentai.v1beta3.GcsDocuments result =
          new com.google.cloud.documentai.v1beta3.GcsDocuments(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.documentai.v1beta3.GcsDocuments result) {
      if (documentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          documents_ = java.util.Collections.unmodifiableList(documents_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.documents_ = documents_;
      } else {
        result.documents_ = documentsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.documentai.v1beta3.GcsDocuments result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.documentai.v1beta3.GcsDocuments) {
        return mergeFrom((com.google.cloud.documentai.v1beta3.GcsDocuments) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1beta3.GcsDocuments other) {
      if (other == com.google.cloud.documentai.v1beta3.GcsDocuments.getDefaultInstance())
        return this;
      if (documentsBuilder_ == null) {
        if (!other.documents_.isEmpty()) {
          if (documents_.isEmpty()) {
            documents_ = other.documents_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDocumentsIsMutable();
            documents_.addAll(other.documents_);
          }
          onChanged();
        }
      } else {
        if (!other.documents_.isEmpty()) {
          if (documentsBuilder_.isEmpty()) {
            documentsBuilder_.dispose();
            documentsBuilder_ = null;
            documents_ = other.documents_;
            bitField0_ = (bitField0_ & ~0x00000001);
            documentsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDocumentsFieldBuilder()
                    : null;
          } else {
            documentsBuilder_.addAllMessages(other.documents_);
          }
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
                com.google.cloud.documentai.v1beta3.GcsDocument m =
                    input.readMessage(
                        com.google.cloud.documentai.v1beta3.GcsDocument.parser(),
                        extensionRegistry);
                if (documentsBuilder_ == null) {
                  ensureDocumentsIsMutable();
                  documents_.add(m);
                } else {
                  documentsBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.cloud.documentai.v1beta3.GcsDocument> documents_ =
        java.util.Collections.emptyList();

    private void ensureDocumentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        documents_ =
            new java.util.ArrayList<com.google.cloud.documentai.v1beta3.GcsDocument>(documents_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.documentai.v1beta3.GcsDocument,
            com.google.cloud.documentai.v1beta3.GcsDocument.Builder,
            com.google.cloud.documentai.v1beta3.GcsDocumentOrBuilder>
        documentsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
     */
    public java.util.List<com.google.cloud.documentai.v1beta3.GcsDocument> getDocumentsList() {
      if (documentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(documents_);
      } else {
        return documentsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
     */
    public int getDocumentsCount() {
      if (documentsBuilder_ == null) {
        return documents_.size();
      } else {
        return documentsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
     */
    public com.google.cloud.documentai.v1beta3.GcsDocument getDocuments(int index) {
      if (documentsBuilder_ == null) {
        return documents_.get(index);
      } else {
        return documentsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
     */
    public Builder setDocuments(int index, com.google.cloud.documentai.v1beta3.GcsDocument value) {
      if (documentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDocumentsIsMutable();
        documents_.set(index, value);
        onChanged();
      } else {
        documentsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
     */
    public Builder setDocuments(
        int index, com.google.cloud.documentai.v1beta3.GcsDocument.Builder builderForValue) {
      if (documentsBuilder_ == null) {
        ensureDocumentsIsMutable();
        documents_.set(index, builderForValue.build());
        onChanged();
      } else {
        documentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
     */
    public Builder addDocuments(com.google.cloud.documentai.v1beta3.GcsDocument value) {
      if (documentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDocumentsIsMutable();
        documents_.add(value);
        onChanged();
      } else {
        documentsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
     */
    public Builder addDocuments(int index, com.google.cloud.documentai.v1beta3.GcsDocument value) {
      if (documentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDocumentsIsMutable();
        documents_.add(index, value);
        onChanged();
      } else {
        documentsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
     */
    public Builder addDocuments(
        com.google.cloud.documentai.v1beta3.GcsDocument.Builder builderForValue) {
      if (documentsBuilder_ == null) {
        ensureDocumentsIsMutable();
        documents_.add(builderForValue.build());
        onChanged();
      } else {
        documentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
     */
    public Builder addDocuments(
        int index, com.google.cloud.documentai.v1beta3.GcsDocument.Builder builderForValue) {
      if (documentsBuilder_ == null) {
        ensureDocumentsIsMutable();
        documents_.add(index, builderForValue.build());
        onChanged();
      } else {
        documentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
     */
    public Builder addAllDocuments(
        java.lang.Iterable<? extends com.google.cloud.documentai.v1beta3.GcsDocument> values) {
      if (documentsBuilder_ == null) {
        ensureDocumentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, documents_);
        onChanged();
      } else {
        documentsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
     */
    public Builder clearDocuments() {
      if (documentsBuilder_ == null) {
        documents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        documentsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
     */
    public Builder removeDocuments(int index) {
      if (documentsBuilder_ == null) {
        ensureDocumentsIsMutable();
        documents_.remove(index);
        onChanged();
      } else {
        documentsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
     */
    public com.google.cloud.documentai.v1beta3.GcsDocument.Builder getDocumentsBuilder(int index) {
      return getDocumentsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
     */
    public com.google.cloud.documentai.v1beta3.GcsDocumentOrBuilder getDocumentsOrBuilder(
        int index) {
      if (documentsBuilder_ == null) {
        return documents_.get(index);
      } else {
        return documentsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.documentai.v1beta3.GcsDocumentOrBuilder>
        getDocumentsOrBuilderList() {
      if (documentsBuilder_ != null) {
        return documentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(documents_);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
     */
    public com.google.cloud.documentai.v1beta3.GcsDocument.Builder addDocumentsBuilder() {
      return getDocumentsFieldBuilder()
          .addBuilder(com.google.cloud.documentai.v1beta3.GcsDocument.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
     */
    public com.google.cloud.documentai.v1beta3.GcsDocument.Builder addDocumentsBuilder(int index) {
      return getDocumentsFieldBuilder()
          .addBuilder(index, com.google.cloud.documentai.v1beta3.GcsDocument.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.GcsDocument documents = 1;</code>
     */
    public java.util.List<com.google.cloud.documentai.v1beta3.GcsDocument.Builder>
        getDocumentsBuilderList() {
      return getDocumentsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.documentai.v1beta3.GcsDocument,
            com.google.cloud.documentai.v1beta3.GcsDocument.Builder,
            com.google.cloud.documentai.v1beta3.GcsDocumentOrBuilder>
        getDocumentsFieldBuilder() {
      if (documentsBuilder_ == null) {
        documentsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.documentai.v1beta3.GcsDocument,
                com.google.cloud.documentai.v1beta3.GcsDocument.Builder,
                com.google.cloud.documentai.v1beta3.GcsDocumentOrBuilder>(
                documents_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        documents_ = null;
      }
      return documentsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1beta3.GcsDocuments)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta3.GcsDocuments)
  private static final com.google.cloud.documentai.v1beta3.GcsDocuments DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1beta3.GcsDocuments();
  }

  public static com.google.cloud.documentai.v1beta3.GcsDocuments getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcsDocuments> PARSER =
      new com.google.protobuf.AbstractParser<GcsDocuments>() {
        @java.lang.Override
        public GcsDocuments parsePartialFrom(
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

  public static com.google.protobuf.Parser<GcsDocuments> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcsDocuments> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.GcsDocuments getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
