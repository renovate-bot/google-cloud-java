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
// source: google/cloud/websecurityscanner/v1alpha/web_security_scanner.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.websecurityscanner.v1alpha;

/**
 *
 *
 * <pre>
 * Response for the `ListCrawledUrls` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse}
 */
public final class ListCrawledUrlsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse)
    ListCrawledUrlsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListCrawledUrlsResponse.newBuilder() to construct.
  private ListCrawledUrlsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListCrawledUrlsResponse() {
    crawledUrls_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListCrawledUrlsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
        .internal_static_google_cloud_websecurityscanner_v1alpha_ListCrawledUrlsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
        .internal_static_google_cloud_websecurityscanner_v1alpha_ListCrawledUrlsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse.class,
            com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse.Builder.class);
  }

  public static final int CRAWLED_URLS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.websecurityscanner.v1alpha.CrawledUrl> crawledUrls_;

  /**
   *
   *
   * <pre>
   * The list of CrawledUrls returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.websecurityscanner.v1alpha.CrawledUrl>
      getCrawledUrlsList() {
    return crawledUrls_;
  }

  /**
   *
   *
   * <pre>
   * The list of CrawledUrls returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.websecurityscanner.v1alpha.CrawledUrlOrBuilder>
      getCrawledUrlsOrBuilderList() {
    return crawledUrls_;
  }

  /**
   *
   *
   * <pre>
   * The list of CrawledUrls returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
   */
  @java.lang.Override
  public int getCrawledUrlsCount() {
    return crawledUrls_.size();
  }

  /**
   *
   *
   * <pre>
   * The list of CrawledUrls returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1alpha.CrawledUrl getCrawledUrls(int index) {
    return crawledUrls_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The list of CrawledUrls returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1alpha.CrawledUrlOrBuilder getCrawledUrlsOrBuilder(
      int index) {
    return crawledUrls_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
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
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
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
    for (int i = 0; i < crawledUrls_.size(); i++) {
      output.writeMessage(1, crawledUrls_.get(i));
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
    for (int i = 0; i < crawledUrls_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, crawledUrls_.get(i));
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
    if (!(obj instanceof com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse other =
        (com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse) obj;

    if (!getCrawledUrlsList().equals(other.getCrawledUrlsList())) return false;
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
    if (getCrawledUrlsCount() > 0) {
      hash = (37 * hash) + CRAWLED_URLS_FIELD_NUMBER;
      hash = (53 * hash) + getCrawledUrlsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse parseFrom(
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
      com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse prototype) {
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
   * Response for the `ListCrawledUrls` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse)
      com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1alpha_ListCrawledUrlsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1alpha_ListCrawledUrlsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse.class,
              com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (crawledUrlsBuilder_ == null) {
        crawledUrls_ = java.util.Collections.emptyList();
      } else {
        crawledUrls_ = null;
        crawledUrlsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1alpha_ListCrawledUrlsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse build() {
      com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse buildPartial() {
      com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse result =
          new com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse result) {
      if (crawledUrlsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          crawledUrls_ = java.util.Collections.unmodifiableList(crawledUrls_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.crawledUrls_ = crawledUrls_;
      } else {
        result.crawledUrls_ = crawledUrlsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse result) {
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
      if (other instanceof com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse) {
        return mergeFrom(
            (com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse other) {
      if (other
          == com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse
              .getDefaultInstance()) return this;
      if (crawledUrlsBuilder_ == null) {
        if (!other.crawledUrls_.isEmpty()) {
          if (crawledUrls_.isEmpty()) {
            crawledUrls_ = other.crawledUrls_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCrawledUrlsIsMutable();
            crawledUrls_.addAll(other.crawledUrls_);
          }
          onChanged();
        }
      } else {
        if (!other.crawledUrls_.isEmpty()) {
          if (crawledUrlsBuilder_.isEmpty()) {
            crawledUrlsBuilder_.dispose();
            crawledUrlsBuilder_ = null;
            crawledUrls_ = other.crawledUrls_;
            bitField0_ = (bitField0_ & ~0x00000001);
            crawledUrlsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getCrawledUrlsFieldBuilder()
                    : null;
          } else {
            crawledUrlsBuilder_.addAllMessages(other.crawledUrls_);
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
                com.google.cloud.websecurityscanner.v1alpha.CrawledUrl m =
                    input.readMessage(
                        com.google.cloud.websecurityscanner.v1alpha.CrawledUrl.parser(),
                        extensionRegistry);
                if (crawledUrlsBuilder_ == null) {
                  ensureCrawledUrlsIsMutable();
                  crawledUrls_.add(m);
                } else {
                  crawledUrlsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.websecurityscanner.v1alpha.CrawledUrl> crawledUrls_ =
        java.util.Collections.emptyList();

    private void ensureCrawledUrlsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        crawledUrls_ =
            new java.util.ArrayList<com.google.cloud.websecurityscanner.v1alpha.CrawledUrl>(
                crawledUrls_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.websecurityscanner.v1alpha.CrawledUrl,
            com.google.cloud.websecurityscanner.v1alpha.CrawledUrl.Builder,
            com.google.cloud.websecurityscanner.v1alpha.CrawledUrlOrBuilder>
        crawledUrlsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of CrawledUrls returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
     */
    public java.util.List<com.google.cloud.websecurityscanner.v1alpha.CrawledUrl>
        getCrawledUrlsList() {
      if (crawledUrlsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(crawledUrls_);
      } else {
        return crawledUrlsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The list of CrawledUrls returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
     */
    public int getCrawledUrlsCount() {
      if (crawledUrlsBuilder_ == null) {
        return crawledUrls_.size();
      } else {
        return crawledUrlsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The list of CrawledUrls returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1alpha.CrawledUrl getCrawledUrls(int index) {
      if (crawledUrlsBuilder_ == null) {
        return crawledUrls_.get(index);
      } else {
        return crawledUrlsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of CrawledUrls returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
     */
    public Builder setCrawledUrls(
        int index, com.google.cloud.websecurityscanner.v1alpha.CrawledUrl value) {
      if (crawledUrlsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCrawledUrlsIsMutable();
        crawledUrls_.set(index, value);
        onChanged();
      } else {
        crawledUrlsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of CrawledUrls returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
     */
    public Builder setCrawledUrls(
        int index, com.google.cloud.websecurityscanner.v1alpha.CrawledUrl.Builder builderForValue) {
      if (crawledUrlsBuilder_ == null) {
        ensureCrawledUrlsIsMutable();
        crawledUrls_.set(index, builderForValue.build());
        onChanged();
      } else {
        crawledUrlsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of CrawledUrls returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
     */
    public Builder addCrawledUrls(com.google.cloud.websecurityscanner.v1alpha.CrawledUrl value) {
      if (crawledUrlsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCrawledUrlsIsMutable();
        crawledUrls_.add(value);
        onChanged();
      } else {
        crawledUrlsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of CrawledUrls returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
     */
    public Builder addCrawledUrls(
        int index, com.google.cloud.websecurityscanner.v1alpha.CrawledUrl value) {
      if (crawledUrlsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCrawledUrlsIsMutable();
        crawledUrls_.add(index, value);
        onChanged();
      } else {
        crawledUrlsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of CrawledUrls returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
     */
    public Builder addCrawledUrls(
        com.google.cloud.websecurityscanner.v1alpha.CrawledUrl.Builder builderForValue) {
      if (crawledUrlsBuilder_ == null) {
        ensureCrawledUrlsIsMutable();
        crawledUrls_.add(builderForValue.build());
        onChanged();
      } else {
        crawledUrlsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of CrawledUrls returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
     */
    public Builder addCrawledUrls(
        int index, com.google.cloud.websecurityscanner.v1alpha.CrawledUrl.Builder builderForValue) {
      if (crawledUrlsBuilder_ == null) {
        ensureCrawledUrlsIsMutable();
        crawledUrls_.add(index, builderForValue.build());
        onChanged();
      } else {
        crawledUrlsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of CrawledUrls returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
     */
    public Builder addAllCrawledUrls(
        java.lang.Iterable<? extends com.google.cloud.websecurityscanner.v1alpha.CrawledUrl>
            values) {
      if (crawledUrlsBuilder_ == null) {
        ensureCrawledUrlsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, crawledUrls_);
        onChanged();
      } else {
        crawledUrlsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of CrawledUrls returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
     */
    public Builder clearCrawledUrls() {
      if (crawledUrlsBuilder_ == null) {
        crawledUrls_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        crawledUrlsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of CrawledUrls returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
     */
    public Builder removeCrawledUrls(int index) {
      if (crawledUrlsBuilder_ == null) {
        ensureCrawledUrlsIsMutable();
        crawledUrls_.remove(index);
        onChanged();
      } else {
        crawledUrlsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of CrawledUrls returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1alpha.CrawledUrl.Builder getCrawledUrlsBuilder(
        int index) {
      return getCrawledUrlsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The list of CrawledUrls returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1alpha.CrawledUrlOrBuilder getCrawledUrlsOrBuilder(
        int index) {
      if (crawledUrlsBuilder_ == null) {
        return crawledUrls_.get(index);
      } else {
        return crawledUrlsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of CrawledUrls returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.websecurityscanner.v1alpha.CrawledUrlOrBuilder>
        getCrawledUrlsOrBuilderList() {
      if (crawledUrlsBuilder_ != null) {
        return crawledUrlsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(crawledUrls_);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of CrawledUrls returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1alpha.CrawledUrl.Builder addCrawledUrlsBuilder() {
      return getCrawledUrlsFieldBuilder()
          .addBuilder(com.google.cloud.websecurityscanner.v1alpha.CrawledUrl.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The list of CrawledUrls returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1alpha.CrawledUrl.Builder addCrawledUrlsBuilder(
        int index) {
      return getCrawledUrlsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.websecurityscanner.v1alpha.CrawledUrl.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The list of CrawledUrls returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.CrawledUrl crawled_urls = 1;</code>
     */
    public java.util.List<com.google.cloud.websecurityscanner.v1alpha.CrawledUrl.Builder>
        getCrawledUrlsBuilderList() {
      return getCrawledUrlsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.websecurityscanner.v1alpha.CrawledUrl,
            com.google.cloud.websecurityscanner.v1alpha.CrawledUrl.Builder,
            com.google.cloud.websecurityscanner.v1alpha.CrawledUrlOrBuilder>
        getCrawledUrlsFieldBuilder() {
      if (crawledUrlsBuilder_ == null) {
        crawledUrlsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.websecurityscanner.v1alpha.CrawledUrl,
                com.google.cloud.websecurityscanner.v1alpha.CrawledUrl.Builder,
                com.google.cloud.websecurityscanner.v1alpha.CrawledUrlOrBuilder>(
                crawledUrls_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        crawledUrls_ = null;
      }
      return crawledUrlsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse)
  private static final com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse();
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCrawledUrlsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListCrawledUrlsResponse>() {
        @java.lang.Override
        public ListCrawledUrlsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCrawledUrlsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCrawledUrlsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
