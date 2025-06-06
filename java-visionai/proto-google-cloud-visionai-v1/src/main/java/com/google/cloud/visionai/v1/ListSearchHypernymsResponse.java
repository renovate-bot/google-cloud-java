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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * Response message for listing SearchHypernyms.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.ListSearchHypernymsResponse}
 */
public final class ListSearchHypernymsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.ListSearchHypernymsResponse)
    ListSearchHypernymsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListSearchHypernymsResponse.newBuilder() to construct.
  private ListSearchHypernymsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListSearchHypernymsResponse() {
    searchHypernyms_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListSearchHypernymsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_ListSearchHypernymsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_ListSearchHypernymsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.ListSearchHypernymsResponse.class,
            com.google.cloud.visionai.v1.ListSearchHypernymsResponse.Builder.class);
  }

  public static final int SEARCH_HYPERNYMS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.visionai.v1.SearchHypernym> searchHypernyms_;

  /**
   *
   *
   * <pre>
   * The SearchHypernyms from the specified corpus.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.visionai.v1.SearchHypernym> getSearchHypernymsList() {
    return searchHypernyms_;
  }

  /**
   *
   *
   * <pre>
   * The SearchHypernyms from the specified corpus.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.visionai.v1.SearchHypernymOrBuilder>
      getSearchHypernymsOrBuilderList() {
    return searchHypernyms_;
  }

  /**
   *
   *
   * <pre>
   * The SearchHypernyms from the specified corpus.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
   */
  @java.lang.Override
  public int getSearchHypernymsCount() {
    return searchHypernyms_.size();
  }

  /**
   *
   *
   * <pre>
   * The SearchHypernyms from the specified corpus.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.SearchHypernym getSearchHypernyms(int index) {
    return searchHypernyms_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The SearchHypernyms from the specified corpus.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.SearchHypernymOrBuilder getSearchHypernymsOrBuilder(
      int index) {
    return searchHypernyms_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
    for (int i = 0; i < searchHypernyms_.size(); i++) {
      output.writeMessage(1, searchHypernyms_.get(i));
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
    for (int i = 0; i < searchHypernyms_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, searchHypernyms_.get(i));
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
    if (!(obj instanceof com.google.cloud.visionai.v1.ListSearchHypernymsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.ListSearchHypernymsResponse other =
        (com.google.cloud.visionai.v1.ListSearchHypernymsResponse) obj;

    if (!getSearchHypernymsList().equals(other.getSearchHypernymsList())) return false;
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
    if (getSearchHypernymsCount() > 0) {
      hash = (37 * hash) + SEARCH_HYPERNYMS_FIELD_NUMBER;
      hash = (53 * hash) + getSearchHypernymsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.ListSearchHypernymsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.ListSearchHypernymsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ListSearchHypernymsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.ListSearchHypernymsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ListSearchHypernymsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.ListSearchHypernymsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ListSearchHypernymsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.ListSearchHypernymsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ListSearchHypernymsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.ListSearchHypernymsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ListSearchHypernymsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.ListSearchHypernymsResponse parseFrom(
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
      com.google.cloud.visionai.v1.ListSearchHypernymsResponse prototype) {
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
   * Response message for listing SearchHypernyms.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.ListSearchHypernymsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.ListSearchHypernymsResponse)
      com.google.cloud.visionai.v1.ListSearchHypernymsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_ListSearchHypernymsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_ListSearchHypernymsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.ListSearchHypernymsResponse.class,
              com.google.cloud.visionai.v1.ListSearchHypernymsResponse.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.ListSearchHypernymsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (searchHypernymsBuilder_ == null) {
        searchHypernyms_ = java.util.Collections.emptyList();
      } else {
        searchHypernyms_ = null;
        searchHypernymsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_ListSearchHypernymsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.ListSearchHypernymsResponse getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.ListSearchHypernymsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.ListSearchHypernymsResponse build() {
      com.google.cloud.visionai.v1.ListSearchHypernymsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.ListSearchHypernymsResponse buildPartial() {
      com.google.cloud.visionai.v1.ListSearchHypernymsResponse result =
          new com.google.cloud.visionai.v1.ListSearchHypernymsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.visionai.v1.ListSearchHypernymsResponse result) {
      if (searchHypernymsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          searchHypernyms_ = java.util.Collections.unmodifiableList(searchHypernyms_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.searchHypernyms_ = searchHypernyms_;
      } else {
        result.searchHypernyms_ = searchHypernymsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.visionai.v1.ListSearchHypernymsResponse result) {
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
      if (other instanceof com.google.cloud.visionai.v1.ListSearchHypernymsResponse) {
        return mergeFrom((com.google.cloud.visionai.v1.ListSearchHypernymsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.ListSearchHypernymsResponse other) {
      if (other == com.google.cloud.visionai.v1.ListSearchHypernymsResponse.getDefaultInstance())
        return this;
      if (searchHypernymsBuilder_ == null) {
        if (!other.searchHypernyms_.isEmpty()) {
          if (searchHypernyms_.isEmpty()) {
            searchHypernyms_ = other.searchHypernyms_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSearchHypernymsIsMutable();
            searchHypernyms_.addAll(other.searchHypernyms_);
          }
          onChanged();
        }
      } else {
        if (!other.searchHypernyms_.isEmpty()) {
          if (searchHypernymsBuilder_.isEmpty()) {
            searchHypernymsBuilder_.dispose();
            searchHypernymsBuilder_ = null;
            searchHypernyms_ = other.searchHypernyms_;
            bitField0_ = (bitField0_ & ~0x00000001);
            searchHypernymsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSearchHypernymsFieldBuilder()
                    : null;
          } else {
            searchHypernymsBuilder_.addAllMessages(other.searchHypernyms_);
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
                com.google.cloud.visionai.v1.SearchHypernym m =
                    input.readMessage(
                        com.google.cloud.visionai.v1.SearchHypernym.parser(), extensionRegistry);
                if (searchHypernymsBuilder_ == null) {
                  ensureSearchHypernymsIsMutable();
                  searchHypernyms_.add(m);
                } else {
                  searchHypernymsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.visionai.v1.SearchHypernym> searchHypernyms_ =
        java.util.Collections.emptyList();

    private void ensureSearchHypernymsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        searchHypernyms_ =
            new java.util.ArrayList<com.google.cloud.visionai.v1.SearchHypernym>(searchHypernyms_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.visionai.v1.SearchHypernym,
            com.google.cloud.visionai.v1.SearchHypernym.Builder,
            com.google.cloud.visionai.v1.SearchHypernymOrBuilder>
        searchHypernymsBuilder_;

    /**
     *
     *
     * <pre>
     * The SearchHypernyms from the specified corpus.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
     */
    public java.util.List<com.google.cloud.visionai.v1.SearchHypernym> getSearchHypernymsList() {
      if (searchHypernymsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(searchHypernyms_);
      } else {
        return searchHypernymsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The SearchHypernyms from the specified corpus.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
     */
    public int getSearchHypernymsCount() {
      if (searchHypernymsBuilder_ == null) {
        return searchHypernyms_.size();
      } else {
        return searchHypernymsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The SearchHypernyms from the specified corpus.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
     */
    public com.google.cloud.visionai.v1.SearchHypernym getSearchHypernyms(int index) {
      if (searchHypernymsBuilder_ == null) {
        return searchHypernyms_.get(index);
      } else {
        return searchHypernymsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The SearchHypernyms from the specified corpus.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
     */
    public Builder setSearchHypernyms(
        int index, com.google.cloud.visionai.v1.SearchHypernym value) {
      if (searchHypernymsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSearchHypernymsIsMutable();
        searchHypernyms_.set(index, value);
        onChanged();
      } else {
        searchHypernymsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SearchHypernyms from the specified corpus.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
     */
    public Builder setSearchHypernyms(
        int index, com.google.cloud.visionai.v1.SearchHypernym.Builder builderForValue) {
      if (searchHypernymsBuilder_ == null) {
        ensureSearchHypernymsIsMutable();
        searchHypernyms_.set(index, builderForValue.build());
        onChanged();
      } else {
        searchHypernymsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SearchHypernyms from the specified corpus.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
     */
    public Builder addSearchHypernyms(com.google.cloud.visionai.v1.SearchHypernym value) {
      if (searchHypernymsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSearchHypernymsIsMutable();
        searchHypernyms_.add(value);
        onChanged();
      } else {
        searchHypernymsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SearchHypernyms from the specified corpus.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
     */
    public Builder addSearchHypernyms(
        int index, com.google.cloud.visionai.v1.SearchHypernym value) {
      if (searchHypernymsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSearchHypernymsIsMutable();
        searchHypernyms_.add(index, value);
        onChanged();
      } else {
        searchHypernymsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SearchHypernyms from the specified corpus.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
     */
    public Builder addSearchHypernyms(
        com.google.cloud.visionai.v1.SearchHypernym.Builder builderForValue) {
      if (searchHypernymsBuilder_ == null) {
        ensureSearchHypernymsIsMutable();
        searchHypernyms_.add(builderForValue.build());
        onChanged();
      } else {
        searchHypernymsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SearchHypernyms from the specified corpus.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
     */
    public Builder addSearchHypernyms(
        int index, com.google.cloud.visionai.v1.SearchHypernym.Builder builderForValue) {
      if (searchHypernymsBuilder_ == null) {
        ensureSearchHypernymsIsMutable();
        searchHypernyms_.add(index, builderForValue.build());
        onChanged();
      } else {
        searchHypernymsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SearchHypernyms from the specified corpus.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
     */
    public Builder addAllSearchHypernyms(
        java.lang.Iterable<? extends com.google.cloud.visionai.v1.SearchHypernym> values) {
      if (searchHypernymsBuilder_ == null) {
        ensureSearchHypernymsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, searchHypernyms_);
        onChanged();
      } else {
        searchHypernymsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SearchHypernyms from the specified corpus.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
     */
    public Builder clearSearchHypernyms() {
      if (searchHypernymsBuilder_ == null) {
        searchHypernyms_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        searchHypernymsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SearchHypernyms from the specified corpus.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
     */
    public Builder removeSearchHypernyms(int index) {
      if (searchHypernymsBuilder_ == null) {
        ensureSearchHypernymsIsMutable();
        searchHypernyms_.remove(index);
        onChanged();
      } else {
        searchHypernymsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SearchHypernyms from the specified corpus.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
     */
    public com.google.cloud.visionai.v1.SearchHypernym.Builder getSearchHypernymsBuilder(
        int index) {
      return getSearchHypernymsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The SearchHypernyms from the specified corpus.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
     */
    public com.google.cloud.visionai.v1.SearchHypernymOrBuilder getSearchHypernymsOrBuilder(
        int index) {
      if (searchHypernymsBuilder_ == null) {
        return searchHypernyms_.get(index);
      } else {
        return searchHypernymsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The SearchHypernyms from the specified corpus.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.visionai.v1.SearchHypernymOrBuilder>
        getSearchHypernymsOrBuilderList() {
      if (searchHypernymsBuilder_ != null) {
        return searchHypernymsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(searchHypernyms_);
      }
    }

    /**
     *
     *
     * <pre>
     * The SearchHypernyms from the specified corpus.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
     */
    public com.google.cloud.visionai.v1.SearchHypernym.Builder addSearchHypernymsBuilder() {
      return getSearchHypernymsFieldBuilder()
          .addBuilder(com.google.cloud.visionai.v1.SearchHypernym.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The SearchHypernyms from the specified corpus.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
     */
    public com.google.cloud.visionai.v1.SearchHypernym.Builder addSearchHypernymsBuilder(
        int index) {
      return getSearchHypernymsFieldBuilder()
          .addBuilder(index, com.google.cloud.visionai.v1.SearchHypernym.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The SearchHypernyms from the specified corpus.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.SearchHypernym search_hypernyms = 1;</code>
     */
    public java.util.List<com.google.cloud.visionai.v1.SearchHypernym.Builder>
        getSearchHypernymsBuilderList() {
      return getSearchHypernymsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.visionai.v1.SearchHypernym,
            com.google.cloud.visionai.v1.SearchHypernym.Builder,
            com.google.cloud.visionai.v1.SearchHypernymOrBuilder>
        getSearchHypernymsFieldBuilder() {
      if (searchHypernymsBuilder_ == null) {
        searchHypernymsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.visionai.v1.SearchHypernym,
                com.google.cloud.visionai.v1.SearchHypernym.Builder,
                com.google.cloud.visionai.v1.SearchHypernymOrBuilder>(
                searchHypernyms_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        searchHypernyms_ = null;
      }
      return searchHypernymsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.ListSearchHypernymsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.ListSearchHypernymsResponse)
  private static final com.google.cloud.visionai.v1.ListSearchHypernymsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.ListSearchHypernymsResponse();
  }

  public static com.google.cloud.visionai.v1.ListSearchHypernymsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSearchHypernymsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListSearchHypernymsResponse>() {
        @java.lang.Override
        public ListSearchHypernymsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSearchHypernymsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSearchHypernymsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.ListSearchHypernymsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
