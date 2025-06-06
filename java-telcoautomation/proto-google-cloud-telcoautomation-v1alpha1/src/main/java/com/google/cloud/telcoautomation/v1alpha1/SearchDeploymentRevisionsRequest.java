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
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.telcoautomation.v1alpha1;

/**
 *
 *
 * <pre>
 * Request object for `SearchDeploymentRevisions`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest}
 */
public final class SearchDeploymentRevisionsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest)
    SearchDeploymentRevisionsRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SearchDeploymentRevisionsRequest.newBuilder() to construct.
  private SearchDeploymentRevisionsRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchDeploymentRevisionsRequest() {
    parent_ = "";
    query_ = "";
    pageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchDeploymentRevisionsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto
        .internal_static_google_cloud_telcoautomation_v1alpha1_SearchDeploymentRevisionsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto
        .internal_static_google_cloud_telcoautomation_v1alpha1_SearchDeploymentRevisionsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest.class,
            com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest.Builder
                .class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The name of parent orchestration cluster resource.
   * Format should be -
   * "projects/{project_id}/locations/{location_name}/orchestrationClusters/{orchestration_cluster}".
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
   * Required. The name of parent orchestration cluster resource.
   * Format should be -
   * "projects/{project_id}/locations/{location_name}/orchestrationClusters/{orchestration_cluster}".
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

  public static final int QUERY_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object query_ = "";

  /**
   *
   *
   * <pre>
   * Required. Supported queries:
   * 1. ""                       : Lists all revisions across all deployments.
   * 2. "latest=true"            : Lists latest revisions across all
   * deployments.
   * 3. "name={name}"            : Lists all revisions of deployment with name
   * {name}.
   * 4. "name={name} latest=true": Lists latest revision of deployment with name
   * {name}
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The query.
   */
  @java.lang.Override
  public java.lang.String getQuery() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      query_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. Supported queries:
   * 1. ""                       : Lists all revisions across all deployments.
   * 2. "latest=true"            : Lists latest revisions across all
   * deployments.
   * 3. "name={name}"            : Lists all revisions of deployment with name
   * {name}.
   * 4. "name={name} latest=true": Lists latest revision of deployment with name
   * {name}
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for query.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getQueryBytes() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      query_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 3;
  private int pageSize_ = 0;

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of deployment revisions to return per page.
   * max page size = 100, default page size = 20.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object pageToken_ = "";

  /**
   *
   *
   * <pre>
   * Optional. The page token, received from a previous search call.
   * It can be provided to retrieve the subsequent page.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. The page token, received from a previous search call.
   * It can be provided to retrieve the subsequent page.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(query_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, query_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(3, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, pageToken_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(query_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, query_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, pageToken_);
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
    if (!(obj
        instanceof com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest other =
        (com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getQuery().equals(other.getQuery())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + QUERY_FIELD_NUMBER;
    hash = (53 * hash) + getQuery().hashCode();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
      parseFrom(
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
      com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest prototype) {
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
   * Request object for `SearchDeploymentRevisions`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest)
      com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto
          .internal_static_google_cloud_telcoautomation_v1alpha1_SearchDeploymentRevisionsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto
          .internal_static_google_cloud_telcoautomation_v1alpha1_SearchDeploymentRevisionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest.class,
              com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      query_ = "";
      pageSize_ = 0;
      pageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto
          .internal_static_google_cloud_telcoautomation_v1alpha1_SearchDeploymentRevisionsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
        getDefaultInstanceForType() {
      return com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest build() {
      com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
        buildPartial() {
      com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest result =
          new com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.query_ = query_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pageSize_ = pageSize_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
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
      if (other
          instanceof com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest) {
        return mergeFrom(
            (com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest other) {
      if (other
          == com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getQuery().isEmpty()) {
        query_ = other.query_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        bitField0_ |= 0x00000008;
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                query_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                pageSize_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 34:
              {
                pageToken_ = input.readStringRequireUtf8();
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

    private java.lang.Object parent_ = "";

    /**
     *
     *
     * <pre>
     * Required. The name of parent orchestration cluster resource.
     * Format should be -
     * "projects/{project_id}/locations/{location_name}/orchestrationClusters/{orchestration_cluster}".
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
     * Required. The name of parent orchestration cluster resource.
     * Format should be -
     * "projects/{project_id}/locations/{location_name}/orchestrationClusters/{orchestration_cluster}".
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
     * Required. The name of parent orchestration cluster resource.
     * Format should be -
     * "projects/{project_id}/locations/{location_name}/orchestrationClusters/{orchestration_cluster}".
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
     * Required. The name of parent orchestration cluster resource.
     * Format should be -
     * "projects/{project_id}/locations/{location_name}/orchestrationClusters/{orchestration_cluster}".
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
     * Required. The name of parent orchestration cluster resource.
     * Format should be -
     * "projects/{project_id}/locations/{location_name}/orchestrationClusters/{orchestration_cluster}".
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

    private java.lang.Object query_ = "";

    /**
     *
     *
     * <pre>
     * Required. Supported queries:
     * 1. ""                       : Lists all revisions across all deployments.
     * 2. "latest=true"            : Lists latest revisions across all
     * deployments.
     * 3. "name={name}"            : Lists all revisions of deployment with name
     * {name}.
     * 4. "name={name} latest=true": Lists latest revision of deployment with name
     * {name}
     * </pre>
     *
     * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The query.
     */
    public java.lang.String getQuery() {
      java.lang.Object ref = query_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        query_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Supported queries:
     * 1. ""                       : Lists all revisions across all deployments.
     * 2. "latest=true"            : Lists latest revisions across all
     * deployments.
     * 3. "name={name}"            : Lists all revisions of deployment with name
     * {name}.
     * 4. "name={name} latest=true": Lists latest revision of deployment with name
     * {name}
     * </pre>
     *
     * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for query.
     */
    public com.google.protobuf.ByteString getQueryBytes() {
      java.lang.Object ref = query_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        query_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Supported queries:
     * 1. ""                       : Lists all revisions across all deployments.
     * 2. "latest=true"            : Lists latest revisions across all
     * deployments.
     * 3. "name={name}"            : Lists all revisions of deployment with name
     * {name}.
     * 4. "name={name} latest=true": Lists latest revision of deployment with name
     * {name}
     * </pre>
     *
     * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The query to set.
     * @return This builder for chaining.
     */
    public Builder setQuery(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      query_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Supported queries:
     * 1. ""                       : Lists all revisions across all deployments.
     * 2. "latest=true"            : Lists latest revisions across all
     * deployments.
     * 3. "name={name}"            : Lists all revisions of deployment with name
     * {name}.
     * 4. "name={name} latest=true": Lists latest revision of deployment with name
     * {name}
     * </pre>
     *
     * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearQuery() {
      query_ = getDefaultInstance().getQuery();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Supported queries:
     * 1. ""                       : Lists all revisions across all deployments.
     * 2. "latest=true"            : Lists latest revisions across all
     * deployments.
     * 3. "name={name}"            : Lists all revisions of deployment with name
     * {name}.
     * 4. "name={name} latest=true": Lists latest revision of deployment with name
     * {name}
     * </pre>
     *
     * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for query to set.
     * @return This builder for chaining.
     */
    public Builder setQueryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      query_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int pageSize_;

    /**
     *
     *
     * <pre>
     * Optional. The maximum number of deployment revisions to return per page.
     * max page size = 100, default page size = 20.
     * </pre>
     *
     * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The maximum number of deployment revisions to return per page.
     * max page size = 100, default page size = 20.
     * </pre>
     *
     * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {

      pageSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The maximum number of deployment revisions to return per page.
     * max page size = 100, default page size = 20.
     * </pre>
     *
     * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";

    /**
     *
     *
     * <pre>
     * Optional. The page token, received from a previous search call.
     * It can be provided to retrieve the subsequent page.
     * </pre>
     *
     * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The page token, received from a previous search call.
     * It can be provided to retrieve the subsequent page.
     * </pre>
     *
     * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The page token, received from a previous search call.
     * It can be provided to retrieve the subsequent page.
     * </pre>
     *
     * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      pageToken_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The page token, received from a previous search call.
     * It can be provided to retrieve the subsequent page.
     * </pre>
     *
     * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      pageToken_ = getDefaultInstance().getPageToken();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The page token, received from a previous search call.
     * It can be provided to retrieve the subsequent page.
     * </pre>
     *
     * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
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
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest)
  private static final com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest();
  }

  public static com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchDeploymentRevisionsRequest> PARSER =
      new com.google.protobuf.AbstractParser<SearchDeploymentRevisionsRequest>() {
        @java.lang.Override
        public SearchDeploymentRevisionsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchDeploymentRevisionsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchDeploymentRevisionsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
