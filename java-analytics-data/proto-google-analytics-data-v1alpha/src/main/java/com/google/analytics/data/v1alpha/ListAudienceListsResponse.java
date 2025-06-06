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
// source: google/analytics/data/v1alpha/analytics_data_api.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.data.v1alpha;

/**
 *
 *
 * <pre>
 * A list of all audience lists for a property.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.ListAudienceListsResponse}
 */
public final class ListAudienceListsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.ListAudienceListsResponse)
    ListAudienceListsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListAudienceListsResponse.newBuilder() to construct.
  private ListAudienceListsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListAudienceListsResponse() {
    audienceLists_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListAudienceListsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_ListAudienceListsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_ListAudienceListsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.ListAudienceListsResponse.class,
            com.google.analytics.data.v1alpha.ListAudienceListsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int AUDIENCE_LISTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.analytics.data.v1alpha.AudienceList> audienceLists_;

  /**
   *
   *
   * <pre>
   * Each audience list for a property.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.AudienceList> getAudienceListsList() {
    return audienceLists_;
  }

  /**
   *
   *
   * <pre>
   * Each audience list for a property.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.AudienceListOrBuilder>
      getAudienceListsOrBuilderList() {
    return audienceLists_;
  }

  /**
   *
   *
   * <pre>
   * Each audience list for a property.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
   */
  @java.lang.Override
  public int getAudienceListsCount() {
    return audienceLists_.size();
  }

  /**
   *
   *
   * <pre>
   * Each audience list for a property.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.AudienceList getAudienceLists(int index) {
    return audienceLists_.get(index);
  }

  /**
   *
   *
   * <pre>
   * Each audience list for a property.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.AudienceListOrBuilder getAudienceListsOrBuilder(
      int index) {
    return audienceLists_.get(index);
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
   * <code>optional string next_page_token = 2;</code>
   *
   * @return Whether the nextPageToken field is set.
   */
  @java.lang.Override
  public boolean hasNextPageToken() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
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
   * <code>optional string next_page_token = 2;</code>
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
    for (int i = 0; i < audienceLists_.size(); i++) {
      output.writeMessage(1, audienceLists_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < audienceLists_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, audienceLists_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.ListAudienceListsResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.ListAudienceListsResponse other =
        (com.google.analytics.data.v1alpha.ListAudienceListsResponse) obj;

    if (!getAudienceListsList().equals(other.getAudienceListsList())) return false;
    if (hasNextPageToken() != other.hasNextPageToken()) return false;
    if (hasNextPageToken()) {
      if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getAudienceListsCount() > 0) {
      hash = (37 * hash) + AUDIENCE_LISTS_FIELD_NUMBER;
      hash = (53 * hash) + getAudienceListsList().hashCode();
    }
    if (hasNextPageToken()) {
      hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getNextPageToken().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.ListAudienceListsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.ListAudienceListsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.ListAudienceListsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.ListAudienceListsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.ListAudienceListsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.ListAudienceListsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.ListAudienceListsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.ListAudienceListsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.ListAudienceListsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.ListAudienceListsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.ListAudienceListsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.ListAudienceListsResponse parseFrom(
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
      com.google.analytics.data.v1alpha.ListAudienceListsResponse prototype) {
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
   * A list of all audience lists for a property.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.ListAudienceListsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.ListAudienceListsResponse)
      com.google.analytics.data.v1alpha.ListAudienceListsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_ListAudienceListsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_ListAudienceListsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.ListAudienceListsResponse.class,
              com.google.analytics.data.v1alpha.ListAudienceListsResponse.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.ListAudienceListsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (audienceListsBuilder_ == null) {
        audienceLists_ = java.util.Collections.emptyList();
      } else {
        audienceLists_ = null;
        audienceListsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_ListAudienceListsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.ListAudienceListsResponse getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.ListAudienceListsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.ListAudienceListsResponse build() {
      com.google.analytics.data.v1alpha.ListAudienceListsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.ListAudienceListsResponse buildPartial() {
      com.google.analytics.data.v1alpha.ListAudienceListsResponse result =
          new com.google.analytics.data.v1alpha.ListAudienceListsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.analytics.data.v1alpha.ListAudienceListsResponse result) {
      if (audienceListsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          audienceLists_ = java.util.Collections.unmodifiableList(audienceLists_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.audienceLists_ = audienceLists_;
      } else {
        result.audienceLists_ = audienceListsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.analytics.data.v1alpha.ListAudienceListsResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.analytics.data.v1alpha.ListAudienceListsResponse) {
        return mergeFrom((com.google.analytics.data.v1alpha.ListAudienceListsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.ListAudienceListsResponse other) {
      if (other == com.google.analytics.data.v1alpha.ListAudienceListsResponse.getDefaultInstance())
        return this;
      if (audienceListsBuilder_ == null) {
        if (!other.audienceLists_.isEmpty()) {
          if (audienceLists_.isEmpty()) {
            audienceLists_ = other.audienceLists_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAudienceListsIsMutable();
            audienceLists_.addAll(other.audienceLists_);
          }
          onChanged();
        }
      } else {
        if (!other.audienceLists_.isEmpty()) {
          if (audienceListsBuilder_.isEmpty()) {
            audienceListsBuilder_.dispose();
            audienceListsBuilder_ = null;
            audienceLists_ = other.audienceLists_;
            bitField0_ = (bitField0_ & ~0x00000001);
            audienceListsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAudienceListsFieldBuilder()
                    : null;
          } else {
            audienceListsBuilder_.addAllMessages(other.audienceLists_);
          }
        }
      }
      if (other.hasNextPageToken()) {
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
                com.google.analytics.data.v1alpha.AudienceList m =
                    input.readMessage(
                        com.google.analytics.data.v1alpha.AudienceList.parser(), extensionRegistry);
                if (audienceListsBuilder_ == null) {
                  ensureAudienceListsIsMutable();
                  audienceLists_.add(m);
                } else {
                  audienceListsBuilder_.addMessage(m);
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

    private java.util.List<com.google.analytics.data.v1alpha.AudienceList> audienceLists_ =
        java.util.Collections.emptyList();

    private void ensureAudienceListsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        audienceLists_ =
            new java.util.ArrayList<com.google.analytics.data.v1alpha.AudienceList>(audienceLists_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.AudienceList,
            com.google.analytics.data.v1alpha.AudienceList.Builder,
            com.google.analytics.data.v1alpha.AudienceListOrBuilder>
        audienceListsBuilder_;

    /**
     *
     *
     * <pre>
     * Each audience list for a property.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.AudienceList> getAudienceListsList() {
      if (audienceListsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(audienceLists_);
      } else {
        return audienceListsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * Each audience list for a property.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
     */
    public int getAudienceListsCount() {
      if (audienceListsBuilder_ == null) {
        return audienceLists_.size();
      } else {
        return audienceListsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * Each audience list for a property.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
     */
    public com.google.analytics.data.v1alpha.AudienceList getAudienceLists(int index) {
      if (audienceListsBuilder_ == null) {
        return audienceLists_.get(index);
      } else {
        return audienceListsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Each audience list for a property.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
     */
    public Builder setAudienceLists(
        int index, com.google.analytics.data.v1alpha.AudienceList value) {
      if (audienceListsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAudienceListsIsMutable();
        audienceLists_.set(index, value);
        onChanged();
      } else {
        audienceListsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Each audience list for a property.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
     */
    public Builder setAudienceLists(
        int index, com.google.analytics.data.v1alpha.AudienceList.Builder builderForValue) {
      if (audienceListsBuilder_ == null) {
        ensureAudienceListsIsMutable();
        audienceLists_.set(index, builderForValue.build());
        onChanged();
      } else {
        audienceListsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Each audience list for a property.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
     */
    public Builder addAudienceLists(com.google.analytics.data.v1alpha.AudienceList value) {
      if (audienceListsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAudienceListsIsMutable();
        audienceLists_.add(value);
        onChanged();
      } else {
        audienceListsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Each audience list for a property.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
     */
    public Builder addAudienceLists(
        int index, com.google.analytics.data.v1alpha.AudienceList value) {
      if (audienceListsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAudienceListsIsMutable();
        audienceLists_.add(index, value);
        onChanged();
      } else {
        audienceListsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Each audience list for a property.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
     */
    public Builder addAudienceLists(
        com.google.analytics.data.v1alpha.AudienceList.Builder builderForValue) {
      if (audienceListsBuilder_ == null) {
        ensureAudienceListsIsMutable();
        audienceLists_.add(builderForValue.build());
        onChanged();
      } else {
        audienceListsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Each audience list for a property.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
     */
    public Builder addAudienceLists(
        int index, com.google.analytics.data.v1alpha.AudienceList.Builder builderForValue) {
      if (audienceListsBuilder_ == null) {
        ensureAudienceListsIsMutable();
        audienceLists_.add(index, builderForValue.build());
        onChanged();
      } else {
        audienceListsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Each audience list for a property.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
     */
    public Builder addAllAudienceLists(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.AudienceList> values) {
      if (audienceListsBuilder_ == null) {
        ensureAudienceListsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, audienceLists_);
        onChanged();
      } else {
        audienceListsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Each audience list for a property.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
     */
    public Builder clearAudienceLists() {
      if (audienceListsBuilder_ == null) {
        audienceLists_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        audienceListsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Each audience list for a property.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
     */
    public Builder removeAudienceLists(int index) {
      if (audienceListsBuilder_ == null) {
        ensureAudienceListsIsMutable();
        audienceLists_.remove(index);
        onChanged();
      } else {
        audienceListsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Each audience list for a property.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
     */
    public com.google.analytics.data.v1alpha.AudienceList.Builder getAudienceListsBuilder(
        int index) {
      return getAudienceListsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * Each audience list for a property.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
     */
    public com.google.analytics.data.v1alpha.AudienceListOrBuilder getAudienceListsOrBuilder(
        int index) {
      if (audienceListsBuilder_ == null) {
        return audienceLists_.get(index);
      } else {
        return audienceListsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Each audience list for a property.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.AudienceListOrBuilder>
        getAudienceListsOrBuilderList() {
      if (audienceListsBuilder_ != null) {
        return audienceListsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(audienceLists_);
      }
    }

    /**
     *
     *
     * <pre>
     * Each audience list for a property.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
     */
    public com.google.analytics.data.v1alpha.AudienceList.Builder addAudienceListsBuilder() {
      return getAudienceListsFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.AudienceList.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Each audience list for a property.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
     */
    public com.google.analytics.data.v1alpha.AudienceList.Builder addAudienceListsBuilder(
        int index) {
      return getAudienceListsFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.AudienceList.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Each audience list for a property.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.AudienceList audience_lists = 1;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.AudienceList.Builder>
        getAudienceListsBuilderList() {
      return getAudienceListsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.AudienceList,
            com.google.analytics.data.v1alpha.AudienceList.Builder,
            com.google.analytics.data.v1alpha.AudienceListOrBuilder>
        getAudienceListsFieldBuilder() {
      if (audienceListsBuilder_ == null) {
        audienceListsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.AudienceList,
                com.google.analytics.data.v1alpha.AudienceList.Builder,
                com.google.analytics.data.v1alpha.AudienceListOrBuilder>(
                audienceLists_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        audienceLists_ = null;
      }
      return audienceListsBuilder_;
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
     * <code>optional string next_page_token = 2;</code>
     *
     * @return Whether the nextPageToken field is set.
     */
    public boolean hasNextPageToken() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>optional string next_page_token = 2;</code>
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
     * <code>optional string next_page_token = 2;</code>
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
     * <code>optional string next_page_token = 2;</code>
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
     * <code>optional string next_page_token = 2;</code>
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
     * <code>optional string next_page_token = 2;</code>
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.ListAudienceListsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.ListAudienceListsResponse)
  private static final com.google.analytics.data.v1alpha.ListAudienceListsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.ListAudienceListsResponse();
  }

  public static com.google.analytics.data.v1alpha.ListAudienceListsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAudienceListsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListAudienceListsResponse>() {
        @java.lang.Override
        public ListAudienceListsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAudienceListsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAudienceListsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.ListAudienceListsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
