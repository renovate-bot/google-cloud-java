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
// source: google/cloud/securesourcemanager/v1/secure_source_manager.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securesourcemanager.v1;

/**
 *
 *
 * <pre>
 * Request message for fetching a tree structure from a repository.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securesourcemanager.v1.FetchTreeRequest}
 */
public final class FetchTreeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securesourcemanager.v1.FetchTreeRequest)
    FetchTreeRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use FetchTreeRequest.newBuilder() to construct.
  private FetchTreeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FetchTreeRequest() {
    repository_ = "";
    ref_ = "";
    pageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FetchTreeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securesourcemanager.v1.SecureSourceManagerProto
        .internal_static_google_cloud_securesourcemanager_v1_FetchTreeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securesourcemanager.v1.SecureSourceManagerProto
        .internal_static_google_cloud_securesourcemanager_v1_FetchTreeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securesourcemanager.v1.FetchTreeRequest.class,
            com.google.cloud.securesourcemanager.v1.FetchTreeRequest.Builder.class);
  }

  public static final int REPOSITORY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object repository_ = "";

  /**
   *
   *
   * <pre>
   * Required. The format is
   * `projects/{project_number}/locations/{location_id}/repositories/{repository_id}`.
   * Specifies the repository to fetch the tree from.
   * </pre>
   *
   * <code>
   * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The repository.
   */
  @java.lang.Override
  public java.lang.String getRepository() {
    java.lang.Object ref = repository_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      repository_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The format is
   * `projects/{project_number}/locations/{location_id}/repositories/{repository_id}`.
   * Specifies the repository to fetch the tree from.
   * </pre>
   *
   * <code>
   * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for repository.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRepositoryBytes() {
    java.lang.Object ref = repository_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      repository_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REF_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object ref_ = "";

  /**
   *
   *
   * <pre>
   * Optional. `ref` can be a SHA-1 hash, a branch name, or a tag. Specifies
   * which tree to fetch. If not specified, the default branch will be used.
   * </pre>
   *
   * <code>string ref = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The ref.
   */
  @java.lang.Override
  public java.lang.String getRef() {
    java.lang.Object ref = ref_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ref_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. `ref` can be a SHA-1 hash, a branch name, or a tag. Specifies
   * which tree to fetch. If not specified, the default branch will be used.
   * </pre>
   *
   * <code>string ref = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for ref.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRefBytes() {
    java.lang.Object ref = ref_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ref_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECURSIVE_FIELD_NUMBER = 3;
  private boolean recursive_ = false;

  /**
   *
   *
   * <pre>
   * Optional. If true, include all subfolders and their files in the response.
   * If false, only the immediate children are returned.
   * </pre>
   *
   * <code>bool recursive = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The recursive.
   */
  @java.lang.Override
  public boolean getRecursive() {
    return recursive_;
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 4;
  private int pageSize_ = 0;

  /**
   *
   *
   * <pre>
   * Optional. Requested page size.  Server may return fewer items than
   * requested. If unspecified, at most 10,000 items will be returned.
   * </pre>
   *
   * <code>int32 page_size = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 5;

  @SuppressWarnings("serial")
  private volatile java.lang.Object pageToken_ = "";

  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pageToken_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(repository_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, repository_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ref_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ref_);
    }
    if (recursive_ != false) {
      output.writeBool(3, recursive_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(4, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, pageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(repository_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, repository_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ref_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ref_);
    }
    if (recursive_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, recursive_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, pageToken_);
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
    if (!(obj instanceof com.google.cloud.securesourcemanager.v1.FetchTreeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securesourcemanager.v1.FetchTreeRequest other =
        (com.google.cloud.securesourcemanager.v1.FetchTreeRequest) obj;

    if (!getRepository().equals(other.getRepository())) return false;
    if (!getRef().equals(other.getRef())) return false;
    if (getRecursive() != other.getRecursive()) return false;
    if (getPageSize() != other.getPageSize()) return false;
    if (!getPageToken().equals(other.getPageToken())) return false;
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
    hash = (37 * hash) + REPOSITORY_FIELD_NUMBER;
    hash = (53 * hash) + getRepository().hashCode();
    hash = (37 * hash) + REF_FIELD_NUMBER;
    hash = (53 * hash) + getRef().hashCode();
    hash = (37 * hash) + RECURSIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getRecursive());
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securesourcemanager.v1.FetchTreeRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchTreeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchTreeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchTreeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchTreeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchTreeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchTreeRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchTreeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchTreeRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchTreeRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchTreeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchTreeRequest parseFrom(
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
      com.google.cloud.securesourcemanager.v1.FetchTreeRequest prototype) {
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
   * Request message for fetching a tree structure from a repository.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securesourcemanager.v1.FetchTreeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securesourcemanager.v1.FetchTreeRequest)
      com.google.cloud.securesourcemanager.v1.FetchTreeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securesourcemanager.v1.SecureSourceManagerProto
          .internal_static_google_cloud_securesourcemanager_v1_FetchTreeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securesourcemanager.v1.SecureSourceManagerProto
          .internal_static_google_cloud_securesourcemanager_v1_FetchTreeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securesourcemanager.v1.FetchTreeRequest.class,
              com.google.cloud.securesourcemanager.v1.FetchTreeRequest.Builder.class);
    }

    // Construct using com.google.cloud.securesourcemanager.v1.FetchTreeRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      repository_ = "";
      ref_ = "";
      recursive_ = false;
      pageSize_ = 0;
      pageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securesourcemanager.v1.SecureSourceManagerProto
          .internal_static_google_cloud_securesourcemanager_v1_FetchTreeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securesourcemanager.v1.FetchTreeRequest getDefaultInstanceForType() {
      return com.google.cloud.securesourcemanager.v1.FetchTreeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securesourcemanager.v1.FetchTreeRequest build() {
      com.google.cloud.securesourcemanager.v1.FetchTreeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securesourcemanager.v1.FetchTreeRequest buildPartial() {
      com.google.cloud.securesourcemanager.v1.FetchTreeRequest result =
          new com.google.cloud.securesourcemanager.v1.FetchTreeRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securesourcemanager.v1.FetchTreeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.repository_ = repository_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ref_ = ref_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.recursive_ = recursive_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pageSize_ = pageSize_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.pageToken_ = pageToken_;
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
      if (other instanceof com.google.cloud.securesourcemanager.v1.FetchTreeRequest) {
        return mergeFrom((com.google.cloud.securesourcemanager.v1.FetchTreeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securesourcemanager.v1.FetchTreeRequest other) {
      if (other == com.google.cloud.securesourcemanager.v1.FetchTreeRequest.getDefaultInstance())
        return this;
      if (!other.getRepository().isEmpty()) {
        repository_ = other.repository_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRef().isEmpty()) {
        ref_ = other.ref_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getRecursive() != false) {
        setRecursive(other.getRecursive());
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        bitField0_ |= 0x00000010;
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
                repository_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                ref_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                recursive_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 32:
              {
                pageSize_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
            case 42:
              {
                pageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000010;
                break;
              } // case 42
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

    private java.lang.Object repository_ = "";

    /**
     *
     *
     * <pre>
     * Required. The format is
     * `projects/{project_number}/locations/{location_id}/repositories/{repository_id}`.
     * Specifies the repository to fetch the tree from.
     * </pre>
     *
     * <code>
     * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The repository.
     */
    public java.lang.String getRepository() {
      java.lang.Object ref = repository_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        repository_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The format is
     * `projects/{project_number}/locations/{location_id}/repositories/{repository_id}`.
     * Specifies the repository to fetch the tree from.
     * </pre>
     *
     * <code>
     * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for repository.
     */
    public com.google.protobuf.ByteString getRepositoryBytes() {
      java.lang.Object ref = repository_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        repository_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The format is
     * `projects/{project_number}/locations/{location_id}/repositories/{repository_id}`.
     * Specifies the repository to fetch the tree from.
     * </pre>
     *
     * <code>
     * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The repository to set.
     * @return This builder for chaining.
     */
    public Builder setRepository(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      repository_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The format is
     * `projects/{project_number}/locations/{location_id}/repositories/{repository_id}`.
     * Specifies the repository to fetch the tree from.
     * </pre>
     *
     * <code>
     * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRepository() {
      repository_ = getDefaultInstance().getRepository();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The format is
     * `projects/{project_number}/locations/{location_id}/repositories/{repository_id}`.
     * Specifies the repository to fetch the tree from.
     * </pre>
     *
     * <code>
     * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for repository to set.
     * @return This builder for chaining.
     */
    public Builder setRepositoryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      repository_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object ref_ = "";

    /**
     *
     *
     * <pre>
     * Optional. `ref` can be a SHA-1 hash, a branch name, or a tag. Specifies
     * which tree to fetch. If not specified, the default branch will be used.
     * </pre>
     *
     * <code>string ref = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The ref.
     */
    public java.lang.String getRef() {
      java.lang.Object ref = ref_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ref_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. `ref` can be a SHA-1 hash, a branch name, or a tag. Specifies
     * which tree to fetch. If not specified, the default branch will be used.
     * </pre>
     *
     * <code>string ref = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for ref.
     */
    public com.google.protobuf.ByteString getRefBytes() {
      java.lang.Object ref = ref_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ref_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. `ref` can be a SHA-1 hash, a branch name, or a tag. Specifies
     * which tree to fetch. If not specified, the default branch will be used.
     * </pre>
     *
     * <code>string ref = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The ref to set.
     * @return This builder for chaining.
     */
    public Builder setRef(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ref_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. `ref` can be a SHA-1 hash, a branch name, or a tag. Specifies
     * which tree to fetch. If not specified, the default branch will be used.
     * </pre>
     *
     * <code>string ref = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRef() {
      ref_ = getDefaultInstance().getRef();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. `ref` can be a SHA-1 hash, a branch name, or a tag. Specifies
     * which tree to fetch. If not specified, the default branch will be used.
     * </pre>
     *
     * <code>string ref = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for ref to set.
     * @return This builder for chaining.
     */
    public Builder setRefBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ref_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean recursive_;

    /**
     *
     *
     * <pre>
     * Optional. If true, include all subfolders and their files in the response.
     * If false, only the immediate children are returned.
     * </pre>
     *
     * <code>bool recursive = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The recursive.
     */
    @java.lang.Override
    public boolean getRecursive() {
      return recursive_;
    }

    /**
     *
     *
     * <pre>
     * Optional. If true, include all subfolders and their files in the response.
     * If false, only the immediate children are returned.
     * </pre>
     *
     * <code>bool recursive = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The recursive to set.
     * @return This builder for chaining.
     */
    public Builder setRecursive(boolean value) {

      recursive_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. If true, include all subfolders and their files in the response.
     * If false, only the immediate children are returned.
     * </pre>
     *
     * <code>bool recursive = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRecursive() {
      bitField0_ = (bitField0_ & ~0x00000004);
      recursive_ = false;
      onChanged();
      return this;
    }

    private int pageSize_;

    /**
     *
     *
     * <pre>
     * Optional. Requested page size.  Server may return fewer items than
     * requested. If unspecified, at most 10,000 items will be returned.
     * </pre>
     *
     * <code>int32 page_size = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }

    /**
     *
     *
     * <pre>
     * Optional. Requested page size.  Server may return fewer items than
     * requested. If unspecified, at most 10,000 items will be returned.
     * </pre>
     *
     * <code>int32 page_size = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {

      pageSize_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Requested page size.  Server may return fewer items than
     * requested. If unspecified, at most 10,000 items will be returned.
     * </pre>
     *
     * <code>int32 page_size = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      bitField0_ = (bitField0_ & ~0x00000008);
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";

    /**
     *
     *
     * <pre>
     * Optional. A token identifying a page of results the server should return.
     * </pre>
     *
     * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. A token identifying a page of results the server should return.
     * </pre>
     *
     * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. A token identifying a page of results the server should return.
     * </pre>
     *
     * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      pageToken_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. A token identifying a page of results the server should return.
     * </pre>
     *
     * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      pageToken_ = getDefaultInstance().getPageToken();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. A token identifying a page of results the server should return.
     * </pre>
     *
     * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      pageToken_ = value;
      bitField0_ |= 0x00000010;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securesourcemanager.v1.FetchTreeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securesourcemanager.v1.FetchTreeRequest)
  private static final com.google.cloud.securesourcemanager.v1.FetchTreeRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securesourcemanager.v1.FetchTreeRequest();
  }

  public static com.google.cloud.securesourcemanager.v1.FetchTreeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchTreeRequest> PARSER =
      new com.google.protobuf.AbstractParser<FetchTreeRequest>() {
        @java.lang.Override
        public FetchTreeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<FetchTreeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchTreeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securesourcemanager.v1.FetchTreeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
