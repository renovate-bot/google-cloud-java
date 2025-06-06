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
// source: google/cloud/aiplatform/v1/featurestore_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [FeaturestoreService.ListFeaturestores][google.cloud.aiplatform.v1.FeaturestoreService.ListFeaturestores].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ListFeaturestoresResponse}
 */
public final class ListFeaturestoresResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ListFeaturestoresResponse)
    ListFeaturestoresResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListFeaturestoresResponse.newBuilder() to construct.
  private ListFeaturestoresResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListFeaturestoresResponse() {
    featurestores_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListFeaturestoresResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto
        .internal_static_google_cloud_aiplatform_v1_ListFeaturestoresResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto
        .internal_static_google_cloud_aiplatform_v1_ListFeaturestoresResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ListFeaturestoresResponse.class,
            com.google.cloud.aiplatform.v1.ListFeaturestoresResponse.Builder.class);
  }

  public static final int FEATURESTORES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1.Featurestore> featurestores_;

  /**
   *
   *
   * <pre>
   * The Featurestores matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1.Featurestore> getFeaturestoresList() {
    return featurestores_;
  }

  /**
   *
   *
   * <pre>
   * The Featurestores matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1.FeaturestoreOrBuilder>
      getFeaturestoresOrBuilderList() {
    return featurestores_;
  }

  /**
   *
   *
   * <pre>
   * The Featurestores matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
   */
  @java.lang.Override
  public int getFeaturestoresCount() {
    return featurestores_.size();
  }

  /**
   *
   *
   * <pre>
   * The Featurestores matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.Featurestore getFeaturestores(int index) {
    return featurestores_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The Featurestores matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.FeaturestoreOrBuilder getFeaturestoresOrBuilder(int index) {
    return featurestores_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [ListFeaturestoresRequest.page_token][google.cloud.aiplatform.v1.ListFeaturestoresRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
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
   * A token, which can be sent as
   * [ListFeaturestoresRequest.page_token][google.cloud.aiplatform.v1.ListFeaturestoresRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
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
    for (int i = 0; i < featurestores_.size(); i++) {
      output.writeMessage(1, featurestores_.get(i));
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
    for (int i = 0; i < featurestores_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, featurestores_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ListFeaturestoresResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ListFeaturestoresResponse other =
        (com.google.cloud.aiplatform.v1.ListFeaturestoresResponse) obj;

    if (!getFeaturestoresList().equals(other.getFeaturestoresList())) return false;
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
    if (getFeaturestoresCount() > 0) {
      hash = (37 * hash) + FEATURESTORES_FIELD_NUMBER;
      hash = (53 * hash) + getFeaturestoresList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ListFeaturestoresResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListFeaturestoresResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListFeaturestoresResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListFeaturestoresResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListFeaturestoresResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListFeaturestoresResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListFeaturestoresResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListFeaturestoresResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListFeaturestoresResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListFeaturestoresResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListFeaturestoresResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListFeaturestoresResponse parseFrom(
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
      com.google.cloud.aiplatform.v1.ListFeaturestoresResponse prototype) {
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
   * [FeaturestoreService.ListFeaturestores][google.cloud.aiplatform.v1.FeaturestoreService.ListFeaturestores].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ListFeaturestoresResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ListFeaturestoresResponse)
      com.google.cloud.aiplatform.v1.ListFeaturestoresResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListFeaturestoresResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListFeaturestoresResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ListFeaturestoresResponse.class,
              com.google.cloud.aiplatform.v1.ListFeaturestoresResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ListFeaturestoresResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (featurestoresBuilder_ == null) {
        featurestores_ = java.util.Collections.emptyList();
      } else {
        featurestores_ = null;
        featurestoresBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListFeaturestoresResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListFeaturestoresResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ListFeaturestoresResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListFeaturestoresResponse build() {
      com.google.cloud.aiplatform.v1.ListFeaturestoresResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListFeaturestoresResponse buildPartial() {
      com.google.cloud.aiplatform.v1.ListFeaturestoresResponse result =
          new com.google.cloud.aiplatform.v1.ListFeaturestoresResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.aiplatform.v1.ListFeaturestoresResponse result) {
      if (featurestoresBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          featurestores_ = java.util.Collections.unmodifiableList(featurestores_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.featurestores_ = featurestores_;
      } else {
        result.featurestores_ = featurestoresBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.ListFeaturestoresResponse result) {
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
      if (other instanceof com.google.cloud.aiplatform.v1.ListFeaturestoresResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ListFeaturestoresResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ListFeaturestoresResponse other) {
      if (other == com.google.cloud.aiplatform.v1.ListFeaturestoresResponse.getDefaultInstance())
        return this;
      if (featurestoresBuilder_ == null) {
        if (!other.featurestores_.isEmpty()) {
          if (featurestores_.isEmpty()) {
            featurestores_ = other.featurestores_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFeaturestoresIsMutable();
            featurestores_.addAll(other.featurestores_);
          }
          onChanged();
        }
      } else {
        if (!other.featurestores_.isEmpty()) {
          if (featurestoresBuilder_.isEmpty()) {
            featurestoresBuilder_.dispose();
            featurestoresBuilder_ = null;
            featurestores_ = other.featurestores_;
            bitField0_ = (bitField0_ & ~0x00000001);
            featurestoresBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getFeaturestoresFieldBuilder()
                    : null;
          } else {
            featurestoresBuilder_.addAllMessages(other.featurestores_);
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
                com.google.cloud.aiplatform.v1.Featurestore m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1.Featurestore.parser(), extensionRegistry);
                if (featurestoresBuilder_ == null) {
                  ensureFeaturestoresIsMutable();
                  featurestores_.add(m);
                } else {
                  featurestoresBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.aiplatform.v1.Featurestore> featurestores_ =
        java.util.Collections.emptyList();

    private void ensureFeaturestoresIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        featurestores_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1.Featurestore>(featurestores_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Featurestore,
            com.google.cloud.aiplatform.v1.Featurestore.Builder,
            com.google.cloud.aiplatform.v1.FeaturestoreOrBuilder>
        featurestoresBuilder_;

    /**
     *
     *
     * <pre>
     * The Featurestores matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.Featurestore> getFeaturestoresList() {
      if (featurestoresBuilder_ == null) {
        return java.util.Collections.unmodifiableList(featurestores_);
      } else {
        return featurestoresBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The Featurestores matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
     */
    public int getFeaturestoresCount() {
      if (featurestoresBuilder_ == null) {
        return featurestores_.size();
      } else {
        return featurestoresBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The Featurestores matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.Featurestore getFeaturestores(int index) {
      if (featurestoresBuilder_ == null) {
        return featurestores_.get(index);
      } else {
        return featurestoresBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The Featurestores matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
     */
    public Builder setFeaturestores(int index, com.google.cloud.aiplatform.v1.Featurestore value) {
      if (featurestoresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeaturestoresIsMutable();
        featurestores_.set(index, value);
        onChanged();
      } else {
        featurestoresBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Featurestores matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
     */
    public Builder setFeaturestores(
        int index, com.google.cloud.aiplatform.v1.Featurestore.Builder builderForValue) {
      if (featurestoresBuilder_ == null) {
        ensureFeaturestoresIsMutable();
        featurestores_.set(index, builderForValue.build());
        onChanged();
      } else {
        featurestoresBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Featurestores matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
     */
    public Builder addFeaturestores(com.google.cloud.aiplatform.v1.Featurestore value) {
      if (featurestoresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeaturestoresIsMutable();
        featurestores_.add(value);
        onChanged();
      } else {
        featurestoresBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Featurestores matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
     */
    public Builder addFeaturestores(int index, com.google.cloud.aiplatform.v1.Featurestore value) {
      if (featurestoresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeaturestoresIsMutable();
        featurestores_.add(index, value);
        onChanged();
      } else {
        featurestoresBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Featurestores matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
     */
    public Builder addFeaturestores(
        com.google.cloud.aiplatform.v1.Featurestore.Builder builderForValue) {
      if (featurestoresBuilder_ == null) {
        ensureFeaturestoresIsMutable();
        featurestores_.add(builderForValue.build());
        onChanged();
      } else {
        featurestoresBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Featurestores matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
     */
    public Builder addFeaturestores(
        int index, com.google.cloud.aiplatform.v1.Featurestore.Builder builderForValue) {
      if (featurestoresBuilder_ == null) {
        ensureFeaturestoresIsMutable();
        featurestores_.add(index, builderForValue.build());
        onChanged();
      } else {
        featurestoresBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Featurestores matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
     */
    public Builder addAllFeaturestores(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1.Featurestore> values) {
      if (featurestoresBuilder_ == null) {
        ensureFeaturestoresIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, featurestores_);
        onChanged();
      } else {
        featurestoresBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Featurestores matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
     */
    public Builder clearFeaturestores() {
      if (featurestoresBuilder_ == null) {
        featurestores_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        featurestoresBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Featurestores matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
     */
    public Builder removeFeaturestores(int index) {
      if (featurestoresBuilder_ == null) {
        ensureFeaturestoresIsMutable();
        featurestores_.remove(index);
        onChanged();
      } else {
        featurestoresBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Featurestores matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.Featurestore.Builder getFeaturestoresBuilder(int index) {
      return getFeaturestoresFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The Featurestores matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.FeaturestoreOrBuilder getFeaturestoresOrBuilder(
        int index) {
      if (featurestoresBuilder_ == null) {
        return featurestores_.get(index);
      } else {
        return featurestoresBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The Featurestores matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1.FeaturestoreOrBuilder>
        getFeaturestoresOrBuilderList() {
      if (featurestoresBuilder_ != null) {
        return featurestoresBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(featurestores_);
      }
    }

    /**
     *
     *
     * <pre>
     * The Featurestores matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.Featurestore.Builder addFeaturestoresBuilder() {
      return getFeaturestoresFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1.Featurestore.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The Featurestores matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.Featurestore.Builder addFeaturestoresBuilder(int index) {
      return getFeaturestoresFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1.Featurestore.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The Featurestores matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Featurestore featurestores = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.Featurestore.Builder>
        getFeaturestoresBuilderList() {
      return getFeaturestoresFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Featurestore,
            com.google.cloud.aiplatform.v1.Featurestore.Builder,
            com.google.cloud.aiplatform.v1.FeaturestoreOrBuilder>
        getFeaturestoresFieldBuilder() {
      if (featurestoresBuilder_ == null) {
        featurestoresBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1.Featurestore,
                com.google.cloud.aiplatform.v1.Featurestore.Builder,
                com.google.cloud.aiplatform.v1.FeaturestoreOrBuilder>(
                featurestores_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        featurestores_ = null;
      }
      return featurestoresBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [ListFeaturestoresRequest.page_token][google.cloud.aiplatform.v1.ListFeaturestoresRequest.page_token]
     * to retrieve the next page. If this field is omitted, there are no
     * subsequent pages.
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
     * A token, which can be sent as
     * [ListFeaturestoresRequest.page_token][google.cloud.aiplatform.v1.ListFeaturestoresRequest.page_token]
     * to retrieve the next page. If this field is omitted, there are no
     * subsequent pages.
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
     * A token, which can be sent as
     * [ListFeaturestoresRequest.page_token][google.cloud.aiplatform.v1.ListFeaturestoresRequest.page_token]
     * to retrieve the next page. If this field is omitted, there are no
     * subsequent pages.
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
     * A token, which can be sent as
     * [ListFeaturestoresRequest.page_token][google.cloud.aiplatform.v1.ListFeaturestoresRequest.page_token]
     * to retrieve the next page. If this field is omitted, there are no
     * subsequent pages.
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
     * A token, which can be sent as
     * [ListFeaturestoresRequest.page_token][google.cloud.aiplatform.v1.ListFeaturestoresRequest.page_token]
     * to retrieve the next page. If this field is omitted, there are no
     * subsequent pages.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ListFeaturestoresResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ListFeaturestoresResponse)
  private static final com.google.cloud.aiplatform.v1.ListFeaturestoresResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ListFeaturestoresResponse();
  }

  public static com.google.cloud.aiplatform.v1.ListFeaturestoresResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListFeaturestoresResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListFeaturestoresResponse>() {
        @java.lang.Override
        public ListFeaturestoresResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListFeaturestoresResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListFeaturestoresResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ListFeaturestoresResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
