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
// source: google/cloud/websecurityscanner/v1beta/crawled_url.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.websecurityscanner.v1beta;

/**
 *
 *
 * <pre>
 * A CrawledUrl resource represents a URL that was crawled during a ScanRun. Web
 * Security Scanner Service crawls the web applications, following all links
 * within the scope of sites, to find the URLs to test against.
 * </pre>
 *
 * Protobuf type {@code google.cloud.websecurityscanner.v1beta.CrawledUrl}
 */
public final class CrawledUrl extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.websecurityscanner.v1beta.CrawledUrl)
    CrawledUrlOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CrawledUrl.newBuilder() to construct.
  private CrawledUrl(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CrawledUrl() {
    httpMethod_ = "";
    url_ = "";
    body_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CrawledUrl();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.websecurityscanner.v1beta.CrawledUrlProto
        .internal_static_google_cloud_websecurityscanner_v1beta_CrawledUrl_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.websecurityscanner.v1beta.CrawledUrlProto
        .internal_static_google_cloud_websecurityscanner_v1beta_CrawledUrl_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.websecurityscanner.v1beta.CrawledUrl.class,
            com.google.cloud.websecurityscanner.v1beta.CrawledUrl.Builder.class);
  }

  public static final int HTTP_METHOD_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object httpMethod_ = "";

  /**
   *
   *
   * <pre>
   * The http method of the request that was used to visit the URL, in
   * uppercase.
   * </pre>
   *
   * <code>string http_method = 1;</code>
   *
   * @return The httpMethod.
   */
  @java.lang.Override
  public java.lang.String getHttpMethod() {
    java.lang.Object ref = httpMethod_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      httpMethod_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The http method of the request that was used to visit the URL, in
   * uppercase.
   * </pre>
   *
   * <code>string http_method = 1;</code>
   *
   * @return The bytes for httpMethod.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getHttpMethodBytes() {
    java.lang.Object ref = httpMethod_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      httpMethod_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object url_ = "";

  /**
   *
   *
   * <pre>
   * The URL that was crawled.
   * </pre>
   *
   * <code>string url = 2;</code>
   *
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The URL that was crawled.
   * </pre>
   *
   * <code>string url = 2;</code>
   *
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BODY_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object body_ = "";

  /**
   *
   *
   * <pre>
   * The body of the request that was used to visit the URL.
   * </pre>
   *
   * <code>string body = 3;</code>
   *
   * @return The body.
   */
  @java.lang.Override
  public java.lang.String getBody() {
    java.lang.Object ref = body_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      body_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The body of the request that was used to visit the URL.
   * </pre>
   *
   * <code>string body = 3;</code>
   *
   * @return The bytes for body.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBodyBytes() {
    java.lang.Object ref = body_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      body_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(httpMethod_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, httpMethod_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, url_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(body_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, body_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(httpMethod_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, httpMethod_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, url_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(body_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, body_);
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
    if (!(obj instanceof com.google.cloud.websecurityscanner.v1beta.CrawledUrl)) {
      return super.equals(obj);
    }
    com.google.cloud.websecurityscanner.v1beta.CrawledUrl other =
        (com.google.cloud.websecurityscanner.v1beta.CrawledUrl) obj;

    if (!getHttpMethod().equals(other.getHttpMethod())) return false;
    if (!getUrl().equals(other.getUrl())) return false;
    if (!getBody().equals(other.getBody())) return false;
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
    hash = (37 * hash) + HTTP_METHOD_FIELD_NUMBER;
    hash = (53 * hash) + getHttpMethod().hashCode();
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (37 * hash) + BODY_FIELD_NUMBER;
    hash = (53 * hash) + getBody().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.websecurityscanner.v1beta.CrawledUrl parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1beta.CrawledUrl parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.CrawledUrl parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1beta.CrawledUrl parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.CrawledUrl parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1beta.CrawledUrl parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.CrawledUrl parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1beta.CrawledUrl parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.CrawledUrl parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1beta.CrawledUrl parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.CrawledUrl parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1beta.CrawledUrl parseFrom(
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
      com.google.cloud.websecurityscanner.v1beta.CrawledUrl prototype) {
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
   * A CrawledUrl resource represents a URL that was crawled during a ScanRun. Web
   * Security Scanner Service crawls the web applications, following all links
   * within the scope of sites, to find the URLs to test against.
   * </pre>
   *
   * Protobuf type {@code google.cloud.websecurityscanner.v1beta.CrawledUrl}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.websecurityscanner.v1beta.CrawledUrl)
      com.google.cloud.websecurityscanner.v1beta.CrawledUrlOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.websecurityscanner.v1beta.CrawledUrlProto
          .internal_static_google_cloud_websecurityscanner_v1beta_CrawledUrl_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.websecurityscanner.v1beta.CrawledUrlProto
          .internal_static_google_cloud_websecurityscanner_v1beta_CrawledUrl_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.websecurityscanner.v1beta.CrawledUrl.class,
              com.google.cloud.websecurityscanner.v1beta.CrawledUrl.Builder.class);
    }

    // Construct using com.google.cloud.websecurityscanner.v1beta.CrawledUrl.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      httpMethod_ = "";
      url_ = "";
      body_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.websecurityscanner.v1beta.CrawledUrlProto
          .internal_static_google_cloud_websecurityscanner_v1beta_CrawledUrl_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1beta.CrawledUrl getDefaultInstanceForType() {
      return com.google.cloud.websecurityscanner.v1beta.CrawledUrl.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1beta.CrawledUrl build() {
      com.google.cloud.websecurityscanner.v1beta.CrawledUrl result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1beta.CrawledUrl buildPartial() {
      com.google.cloud.websecurityscanner.v1beta.CrawledUrl result =
          new com.google.cloud.websecurityscanner.v1beta.CrawledUrl(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.websecurityscanner.v1beta.CrawledUrl result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.httpMethod_ = httpMethod_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.url_ = url_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.body_ = body_;
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
      if (other instanceof com.google.cloud.websecurityscanner.v1beta.CrawledUrl) {
        return mergeFrom((com.google.cloud.websecurityscanner.v1beta.CrawledUrl) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.websecurityscanner.v1beta.CrawledUrl other) {
      if (other == com.google.cloud.websecurityscanner.v1beta.CrawledUrl.getDefaultInstance())
        return this;
      if (!other.getHttpMethod().isEmpty()) {
        httpMethod_ = other.httpMethod_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getBody().isEmpty()) {
        body_ = other.body_;
        bitField0_ |= 0x00000004;
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
                httpMethod_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                url_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                body_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
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

    private int bitField0_;

    private java.lang.Object httpMethod_ = "";

    /**
     *
     *
     * <pre>
     * The http method of the request that was used to visit the URL, in
     * uppercase.
     * </pre>
     *
     * <code>string http_method = 1;</code>
     *
     * @return The httpMethod.
     */
    public java.lang.String getHttpMethod() {
      java.lang.Object ref = httpMethod_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        httpMethod_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The http method of the request that was used to visit the URL, in
     * uppercase.
     * </pre>
     *
     * <code>string http_method = 1;</code>
     *
     * @return The bytes for httpMethod.
     */
    public com.google.protobuf.ByteString getHttpMethodBytes() {
      java.lang.Object ref = httpMethod_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        httpMethod_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The http method of the request that was used to visit the URL, in
     * uppercase.
     * </pre>
     *
     * <code>string http_method = 1;</code>
     *
     * @param value The httpMethod to set.
     * @return This builder for chaining.
     */
    public Builder setHttpMethod(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      httpMethod_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The http method of the request that was used to visit the URL, in
     * uppercase.
     * </pre>
     *
     * <code>string http_method = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHttpMethod() {
      httpMethod_ = getDefaultInstance().getHttpMethod();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The http method of the request that was used to visit the URL, in
     * uppercase.
     * </pre>
     *
     * <code>string http_method = 1;</code>
     *
     * @param value The bytes for httpMethod to set.
     * @return This builder for chaining.
     */
    public Builder setHttpMethodBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      httpMethod_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";

    /**
     *
     *
     * <pre>
     * The URL that was crawled.
     * </pre>
     *
     * <code>string url = 2;</code>
     *
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The URL that was crawled.
     * </pre>
     *
     * <code>string url = 2;</code>
     *
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The URL that was crawled.
     * </pre>
     *
     * <code>string url = 2;</code>
     *
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      url_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The URL that was crawled.
     * </pre>
     *
     * <code>string url = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      url_ = getDefaultInstance().getUrl();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The URL that was crawled.
     * </pre>
     *
     * <code>string url = 2;</code>
     *
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      url_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object body_ = "";

    /**
     *
     *
     * <pre>
     * The body of the request that was used to visit the URL.
     * </pre>
     *
     * <code>string body = 3;</code>
     *
     * @return The body.
     */
    public java.lang.String getBody() {
      java.lang.Object ref = body_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        body_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The body of the request that was used to visit the URL.
     * </pre>
     *
     * <code>string body = 3;</code>
     *
     * @return The bytes for body.
     */
    public com.google.protobuf.ByteString getBodyBytes() {
      java.lang.Object ref = body_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        body_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The body of the request that was used to visit the URL.
     * </pre>
     *
     * <code>string body = 3;</code>
     *
     * @param value The body to set.
     * @return This builder for chaining.
     */
    public Builder setBody(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      body_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The body of the request that was used to visit the URL.
     * </pre>
     *
     * <code>string body = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBody() {
      body_ = getDefaultInstance().getBody();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The body of the request that was used to visit the URL.
     * </pre>
     *
     * <code>string body = 3;</code>
     *
     * @param value The bytes for body to set.
     * @return This builder for chaining.
     */
    public Builder setBodyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      body_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.websecurityscanner.v1beta.CrawledUrl)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1beta.CrawledUrl)
  private static final com.google.cloud.websecurityscanner.v1beta.CrawledUrl DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.websecurityscanner.v1beta.CrawledUrl();
  }

  public static com.google.cloud.websecurityscanner.v1beta.CrawledUrl getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CrawledUrl> PARSER =
      new com.google.protobuf.AbstractParser<CrawledUrl>() {
        @java.lang.Override
        public CrawledUrl parsePartialFrom(
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

  public static com.google.protobuf.Parser<CrawledUrl> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CrawledUrl> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1beta.CrawledUrl getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
