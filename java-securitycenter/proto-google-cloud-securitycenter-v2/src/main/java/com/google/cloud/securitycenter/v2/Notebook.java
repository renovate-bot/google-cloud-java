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
// source: google/cloud/securitycenter/v2/notebook.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v2;

/**
 *
 *
 * <pre>
 * Represents a Jupyter notebook IPYNB file, such as a [Colab Enterprise
 * notebook](https://cloud.google.com/colab/docs/introduction) file, that is
 * associated with a finding.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v2.Notebook}
 */
public final class Notebook extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v2.Notebook)
    NotebookOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Notebook.newBuilder() to construct.
  private Notebook(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Notebook() {
    name_ = "";
    service_ = "";
    lastAuthor_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Notebook();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v2.NotebookProto
        .internal_static_google_cloud_securitycenter_v2_Notebook_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v2.NotebookProto
        .internal_static_google_cloud_securitycenter_v2_Notebook_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v2.Notebook.class,
            com.google.cloud.securitycenter.v2.Notebook.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * The name of the notebook.
   * </pre>
   *
   * <code>string name = 1;</code>
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
   * The name of the notebook.
   * </pre>
   *
   * <code>string name = 1;</code>
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

  public static final int SERVICE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object service_ = "";

  /**
   *
   *
   * <pre>
   * The source notebook service, for example, "Colab Enterprise".
   * </pre>
   *
   * <code>string service = 2;</code>
   *
   * @return The service.
   */
  @java.lang.Override
  public java.lang.String getService() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      service_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The source notebook service, for example, "Colab Enterprise".
   * </pre>
   *
   * <code>string service = 2;</code>
   *
   * @return The bytes for service.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceBytes() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      service_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAST_AUTHOR_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object lastAuthor_ = "";

  /**
   *
   *
   * <pre>
   * The user ID of the latest author to modify the notebook.
   * </pre>
   *
   * <code>string last_author = 3;</code>
   *
   * @return The lastAuthor.
   */
  @java.lang.Override
  public java.lang.String getLastAuthor() {
    java.lang.Object ref = lastAuthor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lastAuthor_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The user ID of the latest author to modify the notebook.
   * </pre>
   *
   * <code>string last_author = 3;</code>
   *
   * @return The bytes for lastAuthor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLastAuthorBytes() {
    java.lang.Object ref = lastAuthor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      lastAuthor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NOTEBOOK_UPDATE_TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp notebookUpdateTime_;

  /**
   *
   *
   * <pre>
   * The most recent time the notebook was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp notebook_update_time = 4;</code>
   *
   * @return Whether the notebookUpdateTime field is set.
   */
  @java.lang.Override
  public boolean hasNotebookUpdateTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The most recent time the notebook was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp notebook_update_time = 4;</code>
   *
   * @return The notebookUpdateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getNotebookUpdateTime() {
    return notebookUpdateTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : notebookUpdateTime_;
  }

  /**
   *
   *
   * <pre>
   * The most recent time the notebook was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp notebook_update_time = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getNotebookUpdateTimeOrBuilder() {
    return notebookUpdateTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : notebookUpdateTime_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lastAuthor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lastAuthor_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(4, getNotebookUpdateTime());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lastAuthor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lastAuthor_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getNotebookUpdateTime());
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
    if (!(obj instanceof com.google.cloud.securitycenter.v2.Notebook)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v2.Notebook other =
        (com.google.cloud.securitycenter.v2.Notebook) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getService().equals(other.getService())) return false;
    if (!getLastAuthor().equals(other.getLastAuthor())) return false;
    if (hasNotebookUpdateTime() != other.hasNotebookUpdateTime()) return false;
    if (hasNotebookUpdateTime()) {
      if (!getNotebookUpdateTime().equals(other.getNotebookUpdateTime())) return false;
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
    hash = (37 * hash) + SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getService().hashCode();
    hash = (37 * hash) + LAST_AUTHOR_FIELD_NUMBER;
    hash = (53 * hash) + getLastAuthor().hashCode();
    if (hasNotebookUpdateTime()) {
      hash = (37 * hash) + NOTEBOOK_UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getNotebookUpdateTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v2.Notebook parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v2.Notebook parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.Notebook parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v2.Notebook parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.Notebook parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v2.Notebook parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.Notebook parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v2.Notebook parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.Notebook parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v2.Notebook parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.Notebook parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v2.Notebook parseFrom(
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

  public static Builder newBuilder(com.google.cloud.securitycenter.v2.Notebook prototype) {
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
   * Represents a Jupyter notebook IPYNB file, such as a [Colab Enterprise
   * notebook](https://cloud.google.com/colab/docs/introduction) file, that is
   * associated with a finding.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v2.Notebook}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v2.Notebook)
      com.google.cloud.securitycenter.v2.NotebookOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v2.NotebookProto
          .internal_static_google_cloud_securitycenter_v2_Notebook_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v2.NotebookProto
          .internal_static_google_cloud_securitycenter_v2_Notebook_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v2.Notebook.class,
              com.google.cloud.securitycenter.v2.Notebook.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v2.Notebook.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getNotebookUpdateTimeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      service_ = "";
      lastAuthor_ = "";
      notebookUpdateTime_ = null;
      if (notebookUpdateTimeBuilder_ != null) {
        notebookUpdateTimeBuilder_.dispose();
        notebookUpdateTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v2.NotebookProto
          .internal_static_google_cloud_securitycenter_v2_Notebook_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v2.Notebook getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v2.Notebook.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v2.Notebook build() {
      com.google.cloud.securitycenter.v2.Notebook result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v2.Notebook buildPartial() {
      com.google.cloud.securitycenter.v2.Notebook result =
          new com.google.cloud.securitycenter.v2.Notebook(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v2.Notebook result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.service_ = service_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.lastAuthor_ = lastAuthor_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.notebookUpdateTime_ =
            notebookUpdateTimeBuilder_ == null
                ? notebookUpdateTime_
                : notebookUpdateTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.securitycenter.v2.Notebook) {
        return mergeFrom((com.google.cloud.securitycenter.v2.Notebook) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v2.Notebook other) {
      if (other == com.google.cloud.securitycenter.v2.Notebook.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getService().isEmpty()) {
        service_ = other.service_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getLastAuthor().isEmpty()) {
        lastAuthor_ = other.lastAuthor_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasNotebookUpdateTime()) {
        mergeNotebookUpdateTime(other.getNotebookUpdateTime());
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
                service_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                lastAuthor_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 34:
              {
                input.readMessage(
                    getNotebookUpdateTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000008;
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

    private int bitField0_;

    private java.lang.Object name_ = "";

    /**
     *
     *
     * <pre>
     * The name of the notebook.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The name of the notebook.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The name of the notebook.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The name of the notebook.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The name of the notebook.
     * </pre>
     *
     * <code>string name = 1;</code>
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

    private java.lang.Object service_ = "";

    /**
     *
     *
     * <pre>
     * The source notebook service, for example, "Colab Enterprise".
     * </pre>
     *
     * <code>string service = 2;</code>
     *
     * @return The service.
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        service_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The source notebook service, for example, "Colab Enterprise".
     * </pre>
     *
     * <code>string service = 2;</code>
     *
     * @return The bytes for service.
     */
    public com.google.protobuf.ByteString getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The source notebook service, for example, "Colab Enterprise".
     * </pre>
     *
     * <code>string service = 2;</code>
     *
     * @param value The service to set.
     * @return This builder for chaining.
     */
    public Builder setService(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      service_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The source notebook service, for example, "Colab Enterprise".
     * </pre>
     *
     * <code>string service = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearService() {
      service_ = getDefaultInstance().getService();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The source notebook service, for example, "Colab Enterprise".
     * </pre>
     *
     * <code>string service = 2;</code>
     *
     * @param value The bytes for service to set.
     * @return This builder for chaining.
     */
    public Builder setServiceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      service_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object lastAuthor_ = "";

    /**
     *
     *
     * <pre>
     * The user ID of the latest author to modify the notebook.
     * </pre>
     *
     * <code>string last_author = 3;</code>
     *
     * @return The lastAuthor.
     */
    public java.lang.String getLastAuthor() {
      java.lang.Object ref = lastAuthor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastAuthor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The user ID of the latest author to modify the notebook.
     * </pre>
     *
     * <code>string last_author = 3;</code>
     *
     * @return The bytes for lastAuthor.
     */
    public com.google.protobuf.ByteString getLastAuthorBytes() {
      java.lang.Object ref = lastAuthor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        lastAuthor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The user ID of the latest author to modify the notebook.
     * </pre>
     *
     * <code>string last_author = 3;</code>
     *
     * @param value The lastAuthor to set.
     * @return This builder for chaining.
     */
    public Builder setLastAuthor(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      lastAuthor_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The user ID of the latest author to modify the notebook.
     * </pre>
     *
     * <code>string last_author = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLastAuthor() {
      lastAuthor_ = getDefaultInstance().getLastAuthor();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The user ID of the latest author to modify the notebook.
     * </pre>
     *
     * <code>string last_author = 3;</code>
     *
     * @param value The bytes for lastAuthor to set.
     * @return This builder for chaining.
     */
    public Builder setLastAuthorBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      lastAuthor_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp notebookUpdateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        notebookUpdateTimeBuilder_;

    /**
     *
     *
     * <pre>
     * The most recent time the notebook was updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp notebook_update_time = 4;</code>
     *
     * @return Whether the notebookUpdateTime field is set.
     */
    public boolean hasNotebookUpdateTime() {
      return ((bitField0_ & 0x00000008) != 0);
    }

    /**
     *
     *
     * <pre>
     * The most recent time the notebook was updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp notebook_update_time = 4;</code>
     *
     * @return The notebookUpdateTime.
     */
    public com.google.protobuf.Timestamp getNotebookUpdateTime() {
      if (notebookUpdateTimeBuilder_ == null) {
        return notebookUpdateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : notebookUpdateTime_;
      } else {
        return notebookUpdateTimeBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The most recent time the notebook was updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp notebook_update_time = 4;</code>
     */
    public Builder setNotebookUpdateTime(com.google.protobuf.Timestamp value) {
      if (notebookUpdateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        notebookUpdateTime_ = value;
      } else {
        notebookUpdateTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The most recent time the notebook was updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp notebook_update_time = 4;</code>
     */
    public Builder setNotebookUpdateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (notebookUpdateTimeBuilder_ == null) {
        notebookUpdateTime_ = builderForValue.build();
      } else {
        notebookUpdateTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The most recent time the notebook was updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp notebook_update_time = 4;</code>
     */
    public Builder mergeNotebookUpdateTime(com.google.protobuf.Timestamp value) {
      if (notebookUpdateTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)
            && notebookUpdateTime_ != null
            && notebookUpdateTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getNotebookUpdateTimeBuilder().mergeFrom(value);
        } else {
          notebookUpdateTime_ = value;
        }
      } else {
        notebookUpdateTimeBuilder_.mergeFrom(value);
      }
      if (notebookUpdateTime_ != null) {
        bitField0_ |= 0x00000008;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The most recent time the notebook was updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp notebook_update_time = 4;</code>
     */
    public Builder clearNotebookUpdateTime() {
      bitField0_ = (bitField0_ & ~0x00000008);
      notebookUpdateTime_ = null;
      if (notebookUpdateTimeBuilder_ != null) {
        notebookUpdateTimeBuilder_.dispose();
        notebookUpdateTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The most recent time the notebook was updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp notebook_update_time = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getNotebookUpdateTimeBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getNotebookUpdateTimeFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The most recent time the notebook was updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp notebook_update_time = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getNotebookUpdateTimeOrBuilder() {
      if (notebookUpdateTimeBuilder_ != null) {
        return notebookUpdateTimeBuilder_.getMessageOrBuilder();
      } else {
        return notebookUpdateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : notebookUpdateTime_;
      }
    }

    /**
     *
     *
     * <pre>
     * The most recent time the notebook was updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp notebook_update_time = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getNotebookUpdateTimeFieldBuilder() {
      if (notebookUpdateTimeBuilder_ == null) {
        notebookUpdateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getNotebookUpdateTime(), getParentForChildren(), isClean());
        notebookUpdateTime_ = null;
      }
      return notebookUpdateTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v2.Notebook)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v2.Notebook)
  private static final com.google.cloud.securitycenter.v2.Notebook DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v2.Notebook();
  }

  public static com.google.cloud.securitycenter.v2.Notebook getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Notebook> PARSER =
      new com.google.protobuf.AbstractParser<Notebook>() {
        @java.lang.Override
        public Notebook parsePartialFrom(
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

  public static com.google.protobuf.Parser<Notebook> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Notebook> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v2.Notebook getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
