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
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

// Protobuf Java Version: 3.25.8
package com.google.identity.accesscontextmanager.v1;

/**
 *
 *
 * <pre>
 * A response to `ListAccessPoliciesRequest`.
 * </pre>
 *
 * Protobuf type {@code google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse}
 */
public final class ListAccessPoliciesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse)
    ListAccessPoliciesResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListAccessPoliciesResponse.newBuilder() to construct.
  private ListAccessPoliciesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListAccessPoliciesResponse() {
    accessPolicies_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListAccessPoliciesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
        .internal_static_google_identity_accesscontextmanager_v1_ListAccessPoliciesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
        .internal_static_google_identity_accesscontextmanager_v1_ListAccessPoliciesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse.class,
            com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse.Builder.class);
  }

  public static final int ACCESS_POLICIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.identity.accesscontextmanager.v1.AccessPolicy> accessPolicies_;

  /**
   *
   *
   * <pre>
   * List of the AccessPolicy instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.identity.accesscontextmanager.v1.AccessPolicy>
      getAccessPoliciesList() {
    return accessPolicies_;
  }

  /**
   *
   *
   * <pre>
   * List of the AccessPolicy instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.identity.accesscontextmanager.v1.AccessPolicyOrBuilder>
      getAccessPoliciesOrBuilderList() {
    return accessPolicies_;
  }

  /**
   *
   *
   * <pre>
   * List of the AccessPolicy instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
   * </code>
   */
  @java.lang.Override
  public int getAccessPoliciesCount() {
    return accessPolicies_.size();
  }

  /**
   *
   *
   * <pre>
   * List of the AccessPolicy instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.AccessPolicy getAccessPolicies(int index) {
    return accessPolicies_.get(index);
  }

  /**
   *
   *
   * <pre>
   * List of the AccessPolicy instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.AccessPolicyOrBuilder
      getAccessPoliciesOrBuilder(int index) {
    return accessPolicies_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * The pagination token to retrieve the next page of results. If the value is
   * empty, no further results remain.
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
   * The pagination token to retrieve the next page of results. If the value is
   * empty, no further results remain.
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
    for (int i = 0; i < accessPolicies_.size(); i++) {
      output.writeMessage(1, accessPolicies_.get(i));
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
    for (int i = 0; i < accessPolicies_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, accessPolicies_.get(i));
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
    if (!(obj instanceof com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse)) {
      return super.equals(obj);
    }
    com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse other =
        (com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse) obj;

    if (!getAccessPoliciesList().equals(other.getAccessPoliciesList())) return false;
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
    if (getAccessPoliciesCount() > 0) {
      hash = (37 * hash) + ACCESS_POLICIES_FIELD_NUMBER;
      hash = (53 * hash) + getAccessPoliciesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse parseFrom(
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
      com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse prototype) {
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
   * A response to `ListAccessPoliciesRequest`.
   * </pre>
   *
   * Protobuf type {@code google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse)
      com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_ListAccessPoliciesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_ListAccessPoliciesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse.class,
              com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse.Builder.class);
    }

    // Construct using
    // com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (accessPoliciesBuilder_ == null) {
        accessPolicies_ = java.util.Collections.emptyList();
      } else {
        accessPolicies_ = null;
        accessPoliciesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_ListAccessPoliciesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse
        getDefaultInstanceForType() {
      return com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse build() {
      com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse buildPartial() {
      com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse result =
          new com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse result) {
      if (accessPoliciesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          accessPolicies_ = java.util.Collections.unmodifiableList(accessPolicies_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.accessPolicies_ = accessPolicies_;
      } else {
        result.accessPolicies_ = accessPoliciesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse result) {
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
      if (other instanceof com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse) {
        return mergeFrom(
            (com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse other) {
      if (other
          == com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse
              .getDefaultInstance()) return this;
      if (accessPoliciesBuilder_ == null) {
        if (!other.accessPolicies_.isEmpty()) {
          if (accessPolicies_.isEmpty()) {
            accessPolicies_ = other.accessPolicies_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAccessPoliciesIsMutable();
            accessPolicies_.addAll(other.accessPolicies_);
          }
          onChanged();
        }
      } else {
        if (!other.accessPolicies_.isEmpty()) {
          if (accessPoliciesBuilder_.isEmpty()) {
            accessPoliciesBuilder_.dispose();
            accessPoliciesBuilder_ = null;
            accessPolicies_ = other.accessPolicies_;
            bitField0_ = (bitField0_ & ~0x00000001);
            accessPoliciesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAccessPoliciesFieldBuilder()
                    : null;
          } else {
            accessPoliciesBuilder_.addAllMessages(other.accessPolicies_);
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
                com.google.identity.accesscontextmanager.v1.AccessPolicy m =
                    input.readMessage(
                        com.google.identity.accesscontextmanager.v1.AccessPolicy.parser(),
                        extensionRegistry);
                if (accessPoliciesBuilder_ == null) {
                  ensureAccessPoliciesIsMutable();
                  accessPolicies_.add(m);
                } else {
                  accessPoliciesBuilder_.addMessage(m);
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

    private java.util.List<com.google.identity.accesscontextmanager.v1.AccessPolicy>
        accessPolicies_ = java.util.Collections.emptyList();

    private void ensureAccessPoliciesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        accessPolicies_ =
            new java.util.ArrayList<com.google.identity.accesscontextmanager.v1.AccessPolicy>(
                accessPolicies_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.identity.accesscontextmanager.v1.AccessPolicy,
            com.google.identity.accesscontextmanager.v1.AccessPolicy.Builder,
            com.google.identity.accesscontextmanager.v1.AccessPolicyOrBuilder>
        accessPoliciesBuilder_;

    /**
     *
     *
     * <pre>
     * List of the AccessPolicy instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
     * </code>
     */
    public java.util.List<com.google.identity.accesscontextmanager.v1.AccessPolicy>
        getAccessPoliciesList() {
      if (accessPoliciesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(accessPolicies_);
      } else {
        return accessPoliciesBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * List of the AccessPolicy instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
     * </code>
     */
    public int getAccessPoliciesCount() {
      if (accessPoliciesBuilder_ == null) {
        return accessPolicies_.size();
      } else {
        return accessPoliciesBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * List of the AccessPolicy instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
     * </code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessPolicy getAccessPolicies(int index) {
      if (accessPoliciesBuilder_ == null) {
        return accessPolicies_.get(index);
      } else {
        return accessPoliciesBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * List of the AccessPolicy instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
     * </code>
     */
    public Builder setAccessPolicies(
        int index, com.google.identity.accesscontextmanager.v1.AccessPolicy value) {
      if (accessPoliciesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessPoliciesIsMutable();
        accessPolicies_.set(index, value);
        onChanged();
      } else {
        accessPoliciesBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of the AccessPolicy instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
     * </code>
     */
    public Builder setAccessPolicies(
        int index,
        com.google.identity.accesscontextmanager.v1.AccessPolicy.Builder builderForValue) {
      if (accessPoliciesBuilder_ == null) {
        ensureAccessPoliciesIsMutable();
        accessPolicies_.set(index, builderForValue.build());
        onChanged();
      } else {
        accessPoliciesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of the AccessPolicy instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
     * </code>
     */
    public Builder addAccessPolicies(
        com.google.identity.accesscontextmanager.v1.AccessPolicy value) {
      if (accessPoliciesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessPoliciesIsMutable();
        accessPolicies_.add(value);
        onChanged();
      } else {
        accessPoliciesBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of the AccessPolicy instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
     * </code>
     */
    public Builder addAccessPolicies(
        int index, com.google.identity.accesscontextmanager.v1.AccessPolicy value) {
      if (accessPoliciesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessPoliciesIsMutable();
        accessPolicies_.add(index, value);
        onChanged();
      } else {
        accessPoliciesBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of the AccessPolicy instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
     * </code>
     */
    public Builder addAccessPolicies(
        com.google.identity.accesscontextmanager.v1.AccessPolicy.Builder builderForValue) {
      if (accessPoliciesBuilder_ == null) {
        ensureAccessPoliciesIsMutable();
        accessPolicies_.add(builderForValue.build());
        onChanged();
      } else {
        accessPoliciesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of the AccessPolicy instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
     * </code>
     */
    public Builder addAccessPolicies(
        int index,
        com.google.identity.accesscontextmanager.v1.AccessPolicy.Builder builderForValue) {
      if (accessPoliciesBuilder_ == null) {
        ensureAccessPoliciesIsMutable();
        accessPolicies_.add(index, builderForValue.build());
        onChanged();
      } else {
        accessPoliciesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of the AccessPolicy instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
     * </code>
     */
    public Builder addAllAccessPolicies(
        java.lang.Iterable<? extends com.google.identity.accesscontextmanager.v1.AccessPolicy>
            values) {
      if (accessPoliciesBuilder_ == null) {
        ensureAccessPoliciesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, accessPolicies_);
        onChanged();
      } else {
        accessPoliciesBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of the AccessPolicy instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
     * </code>
     */
    public Builder clearAccessPolicies() {
      if (accessPoliciesBuilder_ == null) {
        accessPolicies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        accessPoliciesBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of the AccessPolicy instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
     * </code>
     */
    public Builder removeAccessPolicies(int index) {
      if (accessPoliciesBuilder_ == null) {
        ensureAccessPoliciesIsMutable();
        accessPolicies_.remove(index);
        onChanged();
      } else {
        accessPoliciesBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of the AccessPolicy instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
     * </code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessPolicy.Builder
        getAccessPoliciesBuilder(int index) {
      return getAccessPoliciesFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * List of the AccessPolicy instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
     * </code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessPolicyOrBuilder
        getAccessPoliciesOrBuilder(int index) {
      if (accessPoliciesBuilder_ == null) {
        return accessPolicies_.get(index);
      } else {
        return accessPoliciesBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * List of the AccessPolicy instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
     * </code>
     */
    public java.util.List<
            ? extends com.google.identity.accesscontextmanager.v1.AccessPolicyOrBuilder>
        getAccessPoliciesOrBuilderList() {
      if (accessPoliciesBuilder_ != null) {
        return accessPoliciesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(accessPolicies_);
      }
    }

    /**
     *
     *
     * <pre>
     * List of the AccessPolicy instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
     * </code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessPolicy.Builder
        addAccessPoliciesBuilder() {
      return getAccessPoliciesFieldBuilder()
          .addBuilder(
              com.google.identity.accesscontextmanager.v1.AccessPolicy.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * List of the AccessPolicy instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
     * </code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessPolicy.Builder
        addAccessPoliciesBuilder(int index) {
      return getAccessPoliciesFieldBuilder()
          .addBuilder(
              index, com.google.identity.accesscontextmanager.v1.AccessPolicy.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * List of the AccessPolicy instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessPolicy access_policies = 1;
     * </code>
     */
    public java.util.List<com.google.identity.accesscontextmanager.v1.AccessPolicy.Builder>
        getAccessPoliciesBuilderList() {
      return getAccessPoliciesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.identity.accesscontextmanager.v1.AccessPolicy,
            com.google.identity.accesscontextmanager.v1.AccessPolicy.Builder,
            com.google.identity.accesscontextmanager.v1.AccessPolicyOrBuilder>
        getAccessPoliciesFieldBuilder() {
      if (accessPoliciesBuilder_ == null) {
        accessPoliciesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.identity.accesscontextmanager.v1.AccessPolicy,
                com.google.identity.accesscontextmanager.v1.AccessPolicy.Builder,
                com.google.identity.accesscontextmanager.v1.AccessPolicyOrBuilder>(
                accessPolicies_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        accessPolicies_ = null;
      }
      return accessPoliciesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * The pagination token to retrieve the next page of results. If the value is
     * empty, no further results remain.
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
     * The pagination token to retrieve the next page of results. If the value is
     * empty, no further results remain.
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
     * The pagination token to retrieve the next page of results. If the value is
     * empty, no further results remain.
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
     * The pagination token to retrieve the next page of results. If the value is
     * empty, no further results remain.
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
     * The pagination token to retrieve the next page of results. If the value is
     * empty, no further results remain.
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

    // @@protoc_insertion_point(builder_scope:google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse)
  private static final com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse();
  }

  public static com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAccessPoliciesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListAccessPoliciesResponse>() {
        @java.lang.Override
        public ListAccessPoliciesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAccessPoliciesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAccessPoliciesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.ListAccessPoliciesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
