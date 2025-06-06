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
// source: google/cloud/oracledatabase/v1/oracledatabase.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.oracledatabase.v1;

/**
 *
 *
 * <pre>
 * The response for `CloudVmCluster.List`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.oracledatabase.v1.ListCloudVmClustersResponse}
 */
public final class ListCloudVmClustersResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.oracledatabase.v1.ListCloudVmClustersResponse)
    ListCloudVmClustersResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListCloudVmClustersResponse.newBuilder() to construct.
  private ListCloudVmClustersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListCloudVmClustersResponse() {
    cloudVmClusters_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListCloudVmClustersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.oracledatabase.v1.V1mainProto
        .internal_static_google_cloud_oracledatabase_v1_ListCloudVmClustersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.oracledatabase.v1.V1mainProto
        .internal_static_google_cloud_oracledatabase_v1_ListCloudVmClustersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse.class,
            com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse.Builder.class);
  }

  public static final int CLOUD_VM_CLUSTERS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.oracledatabase.v1.CloudVmCluster> cloudVmClusters_;

  /**
   *
   *
   * <pre>
   * The list of VM Clusters.
   * </pre>
   *
   * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.oracledatabase.v1.CloudVmCluster>
      getCloudVmClustersList() {
    return cloudVmClusters_;
  }

  /**
   *
   *
   * <pre>
   * The list of VM Clusters.
   * </pre>
   *
   * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.oracledatabase.v1.CloudVmClusterOrBuilder>
      getCloudVmClustersOrBuilderList() {
    return cloudVmClusters_;
  }

  /**
   *
   *
   * <pre>
   * The list of VM Clusters.
   * </pre>
   *
   * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
   */
  @java.lang.Override
  public int getCloudVmClustersCount() {
    return cloudVmClusters_.size();
  }

  /**
   *
   *
   * <pre>
   * The list of VM Clusters.
   * </pre>
   *
   * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.oracledatabase.v1.CloudVmCluster getCloudVmClusters(int index) {
    return cloudVmClusters_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The list of VM Clusters.
   * </pre>
   *
   * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.oracledatabase.v1.CloudVmClusterOrBuilder getCloudVmClustersOrBuilder(
      int index) {
    return cloudVmClusters_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * A token to fetch the next page of results.
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
   * A token to fetch the next page of results.
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
    for (int i = 0; i < cloudVmClusters_.size(); i++) {
      output.writeMessage(1, cloudVmClusters_.get(i));
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
    for (int i = 0; i < cloudVmClusters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, cloudVmClusters_.get(i));
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
    if (!(obj instanceof com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse other =
        (com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse) obj;

    if (!getCloudVmClustersList().equals(other.getCloudVmClustersList())) return false;
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
    if (getCloudVmClustersCount() > 0) {
      hash = (37 * hash) + CLOUD_VM_CLUSTERS_FIELD_NUMBER;
      hash = (53 * hash) + getCloudVmClustersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse parseFrom(
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
      com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse prototype) {
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
   * The response for `CloudVmCluster.List`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.oracledatabase.v1.ListCloudVmClustersResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.oracledatabase.v1.ListCloudVmClustersResponse)
      com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.oracledatabase.v1.V1mainProto
          .internal_static_google_cloud_oracledatabase_v1_ListCloudVmClustersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.oracledatabase.v1.V1mainProto
          .internal_static_google_cloud_oracledatabase_v1_ListCloudVmClustersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse.class,
              com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse.Builder.class);
    }

    // Construct using com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (cloudVmClustersBuilder_ == null) {
        cloudVmClusters_ = java.util.Collections.emptyList();
      } else {
        cloudVmClusters_ = null;
        cloudVmClustersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.oracledatabase.v1.V1mainProto
          .internal_static_google_cloud_oracledatabase_v1_ListCloudVmClustersResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse
        getDefaultInstanceForType() {
      return com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse build() {
      com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse buildPartial() {
      com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse result =
          new com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse result) {
      if (cloudVmClustersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          cloudVmClusters_ = java.util.Collections.unmodifiableList(cloudVmClusters_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cloudVmClusters_ = cloudVmClusters_;
      } else {
        result.cloudVmClusters_ = cloudVmClustersBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse result) {
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
      if (other instanceof com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse) {
        return mergeFrom((com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse other) {
      if (other
          == com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse.getDefaultInstance())
        return this;
      if (cloudVmClustersBuilder_ == null) {
        if (!other.cloudVmClusters_.isEmpty()) {
          if (cloudVmClusters_.isEmpty()) {
            cloudVmClusters_ = other.cloudVmClusters_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCloudVmClustersIsMutable();
            cloudVmClusters_.addAll(other.cloudVmClusters_);
          }
          onChanged();
        }
      } else {
        if (!other.cloudVmClusters_.isEmpty()) {
          if (cloudVmClustersBuilder_.isEmpty()) {
            cloudVmClustersBuilder_.dispose();
            cloudVmClustersBuilder_ = null;
            cloudVmClusters_ = other.cloudVmClusters_;
            bitField0_ = (bitField0_ & ~0x00000001);
            cloudVmClustersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getCloudVmClustersFieldBuilder()
                    : null;
          } else {
            cloudVmClustersBuilder_.addAllMessages(other.cloudVmClusters_);
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
                com.google.cloud.oracledatabase.v1.CloudVmCluster m =
                    input.readMessage(
                        com.google.cloud.oracledatabase.v1.CloudVmCluster.parser(),
                        extensionRegistry);
                if (cloudVmClustersBuilder_ == null) {
                  ensureCloudVmClustersIsMutable();
                  cloudVmClusters_.add(m);
                } else {
                  cloudVmClustersBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.oracledatabase.v1.CloudVmCluster> cloudVmClusters_ =
        java.util.Collections.emptyList();

    private void ensureCloudVmClustersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cloudVmClusters_ =
            new java.util.ArrayList<com.google.cloud.oracledatabase.v1.CloudVmCluster>(
                cloudVmClusters_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.oracledatabase.v1.CloudVmCluster,
            com.google.cloud.oracledatabase.v1.CloudVmCluster.Builder,
            com.google.cloud.oracledatabase.v1.CloudVmClusterOrBuilder>
        cloudVmClustersBuilder_;

    /**
     *
     *
     * <pre>
     * The list of VM Clusters.
     * </pre>
     *
     * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
     */
    public java.util.List<com.google.cloud.oracledatabase.v1.CloudVmCluster>
        getCloudVmClustersList() {
      if (cloudVmClustersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cloudVmClusters_);
      } else {
        return cloudVmClustersBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The list of VM Clusters.
     * </pre>
     *
     * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
     */
    public int getCloudVmClustersCount() {
      if (cloudVmClustersBuilder_ == null) {
        return cloudVmClusters_.size();
      } else {
        return cloudVmClustersBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The list of VM Clusters.
     * </pre>
     *
     * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
     */
    public com.google.cloud.oracledatabase.v1.CloudVmCluster getCloudVmClusters(int index) {
      if (cloudVmClustersBuilder_ == null) {
        return cloudVmClusters_.get(index);
      } else {
        return cloudVmClustersBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of VM Clusters.
     * </pre>
     *
     * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
     */
    public Builder setCloudVmClusters(
        int index, com.google.cloud.oracledatabase.v1.CloudVmCluster value) {
      if (cloudVmClustersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCloudVmClustersIsMutable();
        cloudVmClusters_.set(index, value);
        onChanged();
      } else {
        cloudVmClustersBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of VM Clusters.
     * </pre>
     *
     * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
     */
    public Builder setCloudVmClusters(
        int index, com.google.cloud.oracledatabase.v1.CloudVmCluster.Builder builderForValue) {
      if (cloudVmClustersBuilder_ == null) {
        ensureCloudVmClustersIsMutable();
        cloudVmClusters_.set(index, builderForValue.build());
        onChanged();
      } else {
        cloudVmClustersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of VM Clusters.
     * </pre>
     *
     * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
     */
    public Builder addCloudVmClusters(com.google.cloud.oracledatabase.v1.CloudVmCluster value) {
      if (cloudVmClustersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCloudVmClustersIsMutable();
        cloudVmClusters_.add(value);
        onChanged();
      } else {
        cloudVmClustersBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of VM Clusters.
     * </pre>
     *
     * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
     */
    public Builder addCloudVmClusters(
        int index, com.google.cloud.oracledatabase.v1.CloudVmCluster value) {
      if (cloudVmClustersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCloudVmClustersIsMutable();
        cloudVmClusters_.add(index, value);
        onChanged();
      } else {
        cloudVmClustersBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of VM Clusters.
     * </pre>
     *
     * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
     */
    public Builder addCloudVmClusters(
        com.google.cloud.oracledatabase.v1.CloudVmCluster.Builder builderForValue) {
      if (cloudVmClustersBuilder_ == null) {
        ensureCloudVmClustersIsMutable();
        cloudVmClusters_.add(builderForValue.build());
        onChanged();
      } else {
        cloudVmClustersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of VM Clusters.
     * </pre>
     *
     * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
     */
    public Builder addCloudVmClusters(
        int index, com.google.cloud.oracledatabase.v1.CloudVmCluster.Builder builderForValue) {
      if (cloudVmClustersBuilder_ == null) {
        ensureCloudVmClustersIsMutable();
        cloudVmClusters_.add(index, builderForValue.build());
        onChanged();
      } else {
        cloudVmClustersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of VM Clusters.
     * </pre>
     *
     * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
     */
    public Builder addAllCloudVmClusters(
        java.lang.Iterable<? extends com.google.cloud.oracledatabase.v1.CloudVmCluster> values) {
      if (cloudVmClustersBuilder_ == null) {
        ensureCloudVmClustersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, cloudVmClusters_);
        onChanged();
      } else {
        cloudVmClustersBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of VM Clusters.
     * </pre>
     *
     * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
     */
    public Builder clearCloudVmClusters() {
      if (cloudVmClustersBuilder_ == null) {
        cloudVmClusters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        cloudVmClustersBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of VM Clusters.
     * </pre>
     *
     * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
     */
    public Builder removeCloudVmClusters(int index) {
      if (cloudVmClustersBuilder_ == null) {
        ensureCloudVmClustersIsMutable();
        cloudVmClusters_.remove(index);
        onChanged();
      } else {
        cloudVmClustersBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of VM Clusters.
     * </pre>
     *
     * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
     */
    public com.google.cloud.oracledatabase.v1.CloudVmCluster.Builder getCloudVmClustersBuilder(
        int index) {
      return getCloudVmClustersFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The list of VM Clusters.
     * </pre>
     *
     * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
     */
    public com.google.cloud.oracledatabase.v1.CloudVmClusterOrBuilder getCloudVmClustersOrBuilder(
        int index) {
      if (cloudVmClustersBuilder_ == null) {
        return cloudVmClusters_.get(index);
      } else {
        return cloudVmClustersBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of VM Clusters.
     * </pre>
     *
     * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.oracledatabase.v1.CloudVmClusterOrBuilder>
        getCloudVmClustersOrBuilderList() {
      if (cloudVmClustersBuilder_ != null) {
        return cloudVmClustersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cloudVmClusters_);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of VM Clusters.
     * </pre>
     *
     * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
     */
    public com.google.cloud.oracledatabase.v1.CloudVmCluster.Builder addCloudVmClustersBuilder() {
      return getCloudVmClustersFieldBuilder()
          .addBuilder(com.google.cloud.oracledatabase.v1.CloudVmCluster.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The list of VM Clusters.
     * </pre>
     *
     * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
     */
    public com.google.cloud.oracledatabase.v1.CloudVmCluster.Builder addCloudVmClustersBuilder(
        int index) {
      return getCloudVmClustersFieldBuilder()
          .addBuilder(
              index, com.google.cloud.oracledatabase.v1.CloudVmCluster.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The list of VM Clusters.
     * </pre>
     *
     * <code>repeated .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_clusters = 1;</code>
     */
    public java.util.List<com.google.cloud.oracledatabase.v1.CloudVmCluster.Builder>
        getCloudVmClustersBuilderList() {
      return getCloudVmClustersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.oracledatabase.v1.CloudVmCluster,
            com.google.cloud.oracledatabase.v1.CloudVmCluster.Builder,
            com.google.cloud.oracledatabase.v1.CloudVmClusterOrBuilder>
        getCloudVmClustersFieldBuilder() {
      if (cloudVmClustersBuilder_ == null) {
        cloudVmClustersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.oracledatabase.v1.CloudVmCluster,
                com.google.cloud.oracledatabase.v1.CloudVmCluster.Builder,
                com.google.cloud.oracledatabase.v1.CloudVmClusterOrBuilder>(
                cloudVmClusters_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        cloudVmClusters_ = null;
      }
      return cloudVmClustersBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * A token to fetch the next page of results.
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
     * A token to fetch the next page of results.
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
     * A token to fetch the next page of results.
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
     * A token to fetch the next page of results.
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
     * A token to fetch the next page of results.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.oracledatabase.v1.ListCloudVmClustersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.oracledatabase.v1.ListCloudVmClustersResponse)
  private static final com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse();
  }

  public static com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCloudVmClustersResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListCloudVmClustersResponse>() {
        @java.lang.Override
        public ListCloudVmClustersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCloudVmClustersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCloudVmClustersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.oracledatabase.v1.ListCloudVmClustersResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
