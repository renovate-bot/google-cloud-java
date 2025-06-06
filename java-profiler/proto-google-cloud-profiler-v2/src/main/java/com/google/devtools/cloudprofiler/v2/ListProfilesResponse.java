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
// source: google/devtools/cloudprofiler/v2/profiler.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.cloudprofiler.v2;

/**
 *
 *
 * <pre>
 * ListProfileResponse contains the list of collected profiles for deployments
 * in projects which the user has permissions to view.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudprofiler.v2.ListProfilesResponse}
 */
public final class ListProfilesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudprofiler.v2.ListProfilesResponse)
    ListProfilesResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListProfilesResponse.newBuilder() to construct.
  private ListProfilesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListProfilesResponse() {
    profiles_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListProfilesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.cloudprofiler.v2.ProfilerProto
        .internal_static_google_devtools_cloudprofiler_v2_ListProfilesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.cloudprofiler.v2.ProfilerProto
        .internal_static_google_devtools_cloudprofiler_v2_ListProfilesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.cloudprofiler.v2.ListProfilesResponse.class,
            com.google.devtools.cloudprofiler.v2.ListProfilesResponse.Builder.class);
  }

  public static final int PROFILES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.devtools.cloudprofiler.v2.Profile> profiles_;

  /**
   *
   *
   * <pre>
   * List of profiles fetched.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.devtools.cloudprofiler.v2.Profile> getProfilesList() {
    return profiles_;
  }

  /**
   *
   *
   * <pre>
   * List of profiles fetched.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.devtools.cloudprofiler.v2.ProfileOrBuilder>
      getProfilesOrBuilderList() {
    return profiles_;
  }

  /**
   *
   *
   * <pre>
   * List of profiles fetched.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
   */
  @java.lang.Override
  public int getProfilesCount() {
    return profiles_.size();
  }

  /**
   *
   *
   * <pre>
   * List of profiles fetched.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.cloudprofiler.v2.Profile getProfiles(int index) {
    return profiles_.get(index);
  }

  /**
   *
   *
   * <pre>
   * List of profiles fetched.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.cloudprofiler.v2.ProfileOrBuilder getProfilesOrBuilder(int index) {
    return profiles_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * Token to receive the next page of results.
   * This field maybe empty if there are no more profiles to fetch.
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
   * Token to receive the next page of results.
   * This field maybe empty if there are no more profiles to fetch.
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

  public static final int SKIPPED_PROFILES_FIELD_NUMBER = 3;
  private int skippedProfiles_ = 0;

  /**
   *
   *
   * <pre>
   * Number of profiles that were skipped in the current page since they were
   * not able to be fetched successfully. This should typically be zero. A
   * non-zero value may indicate a transient failure, in which case if the
   * number is too high for your use case, the call may be retried.
   * </pre>
   *
   * <code>int32 skipped_profiles = 3;</code>
   *
   * @return The skippedProfiles.
   */
  @java.lang.Override
  public int getSkippedProfiles() {
    return skippedProfiles_;
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
    for (int i = 0; i < profiles_.size(); i++) {
      output.writeMessage(1, profiles_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    if (skippedProfiles_ != 0) {
      output.writeInt32(3, skippedProfiles_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < profiles_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, profiles_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    if (skippedProfiles_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, skippedProfiles_);
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
    if (!(obj instanceof com.google.devtools.cloudprofiler.v2.ListProfilesResponse)) {
      return super.equals(obj);
    }
    com.google.devtools.cloudprofiler.v2.ListProfilesResponse other =
        (com.google.devtools.cloudprofiler.v2.ListProfilesResponse) obj;

    if (!getProfilesList().equals(other.getProfilesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (getSkippedProfiles() != other.getSkippedProfiles()) return false;
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
    if (getProfilesCount() > 0) {
      hash = (37 * hash) + PROFILES_FIELD_NUMBER;
      hash = (53 * hash) + getProfilesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (37 * hash) + SKIPPED_PROFILES_FIELD_NUMBER;
    hash = (53 * hash) + getSkippedProfiles();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.cloudprofiler.v2.ListProfilesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.cloudprofiler.v2.ListProfilesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.cloudprofiler.v2.ListProfilesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.cloudprofiler.v2.ListProfilesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.cloudprofiler.v2.ListProfilesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.cloudprofiler.v2.ListProfilesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.cloudprofiler.v2.ListProfilesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudprofiler.v2.ListProfilesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.cloudprofiler.v2.ListProfilesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudprofiler.v2.ListProfilesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.cloudprofiler.v2.ListProfilesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudprofiler.v2.ListProfilesResponse parseFrom(
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
      com.google.devtools.cloudprofiler.v2.ListProfilesResponse prototype) {
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
   * ListProfileResponse contains the list of collected profiles for deployments
   * in projects which the user has permissions to view.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudprofiler.v2.ListProfilesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudprofiler.v2.ListProfilesResponse)
      com.google.devtools.cloudprofiler.v2.ListProfilesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.cloudprofiler.v2.ProfilerProto
          .internal_static_google_devtools_cloudprofiler_v2_ListProfilesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.cloudprofiler.v2.ProfilerProto
          .internal_static_google_devtools_cloudprofiler_v2_ListProfilesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.cloudprofiler.v2.ListProfilesResponse.class,
              com.google.devtools.cloudprofiler.v2.ListProfilesResponse.Builder.class);
    }

    // Construct using com.google.devtools.cloudprofiler.v2.ListProfilesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (profilesBuilder_ == null) {
        profiles_ = java.util.Collections.emptyList();
      } else {
        profiles_ = null;
        profilesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      skippedProfiles_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.cloudprofiler.v2.ProfilerProto
          .internal_static_google_devtools_cloudprofiler_v2_ListProfilesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.cloudprofiler.v2.ListProfilesResponse getDefaultInstanceForType() {
      return com.google.devtools.cloudprofiler.v2.ListProfilesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.cloudprofiler.v2.ListProfilesResponse build() {
      com.google.devtools.cloudprofiler.v2.ListProfilesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.cloudprofiler.v2.ListProfilesResponse buildPartial() {
      com.google.devtools.cloudprofiler.v2.ListProfilesResponse result =
          new com.google.devtools.cloudprofiler.v2.ListProfilesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.devtools.cloudprofiler.v2.ListProfilesResponse result) {
      if (profilesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          profiles_ = java.util.Collections.unmodifiableList(profiles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.profiles_ = profiles_;
      } else {
        result.profiles_ = profilesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.devtools.cloudprofiler.v2.ListProfilesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.skippedProfiles_ = skippedProfiles_;
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
      if (other instanceof com.google.devtools.cloudprofiler.v2.ListProfilesResponse) {
        return mergeFrom((com.google.devtools.cloudprofiler.v2.ListProfilesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.cloudprofiler.v2.ListProfilesResponse other) {
      if (other == com.google.devtools.cloudprofiler.v2.ListProfilesResponse.getDefaultInstance())
        return this;
      if (profilesBuilder_ == null) {
        if (!other.profiles_.isEmpty()) {
          if (profiles_.isEmpty()) {
            profiles_ = other.profiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProfilesIsMutable();
            profiles_.addAll(other.profiles_);
          }
          onChanged();
        }
      } else {
        if (!other.profiles_.isEmpty()) {
          if (profilesBuilder_.isEmpty()) {
            profilesBuilder_.dispose();
            profilesBuilder_ = null;
            profiles_ = other.profiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            profilesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getProfilesFieldBuilder()
                    : null;
          } else {
            profilesBuilder_.addAllMessages(other.profiles_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getSkippedProfiles() != 0) {
        setSkippedProfiles(other.getSkippedProfiles());
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
                com.google.devtools.cloudprofiler.v2.Profile m =
                    input.readMessage(
                        com.google.devtools.cloudprofiler.v2.Profile.parser(), extensionRegistry);
                if (profilesBuilder_ == null) {
                  ensureProfilesIsMutable();
                  profiles_.add(m);
                } else {
                  profilesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                skippedProfiles_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private java.util.List<com.google.devtools.cloudprofiler.v2.Profile> profiles_ =
        java.util.Collections.emptyList();

    private void ensureProfilesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        profiles_ =
            new java.util.ArrayList<com.google.devtools.cloudprofiler.v2.Profile>(profiles_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.cloudprofiler.v2.Profile,
            com.google.devtools.cloudprofiler.v2.Profile.Builder,
            com.google.devtools.cloudprofiler.v2.ProfileOrBuilder>
        profilesBuilder_;

    /**
     *
     *
     * <pre>
     * List of profiles fetched.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
     */
    public java.util.List<com.google.devtools.cloudprofiler.v2.Profile> getProfilesList() {
      if (profilesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(profiles_);
      } else {
        return profilesBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * List of profiles fetched.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
     */
    public int getProfilesCount() {
      if (profilesBuilder_ == null) {
        return profiles_.size();
      } else {
        return profilesBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * List of profiles fetched.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
     */
    public com.google.devtools.cloudprofiler.v2.Profile getProfiles(int index) {
      if (profilesBuilder_ == null) {
        return profiles_.get(index);
      } else {
        return profilesBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * List of profiles fetched.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
     */
    public Builder setProfiles(int index, com.google.devtools.cloudprofiler.v2.Profile value) {
      if (profilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProfilesIsMutable();
        profiles_.set(index, value);
        onChanged();
      } else {
        profilesBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of profiles fetched.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
     */
    public Builder setProfiles(
        int index, com.google.devtools.cloudprofiler.v2.Profile.Builder builderForValue) {
      if (profilesBuilder_ == null) {
        ensureProfilesIsMutable();
        profiles_.set(index, builderForValue.build());
        onChanged();
      } else {
        profilesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of profiles fetched.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
     */
    public Builder addProfiles(com.google.devtools.cloudprofiler.v2.Profile value) {
      if (profilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProfilesIsMutable();
        profiles_.add(value);
        onChanged();
      } else {
        profilesBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of profiles fetched.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
     */
    public Builder addProfiles(int index, com.google.devtools.cloudprofiler.v2.Profile value) {
      if (profilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProfilesIsMutable();
        profiles_.add(index, value);
        onChanged();
      } else {
        profilesBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of profiles fetched.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
     */
    public Builder addProfiles(
        com.google.devtools.cloudprofiler.v2.Profile.Builder builderForValue) {
      if (profilesBuilder_ == null) {
        ensureProfilesIsMutable();
        profiles_.add(builderForValue.build());
        onChanged();
      } else {
        profilesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of profiles fetched.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
     */
    public Builder addProfiles(
        int index, com.google.devtools.cloudprofiler.v2.Profile.Builder builderForValue) {
      if (profilesBuilder_ == null) {
        ensureProfilesIsMutable();
        profiles_.add(index, builderForValue.build());
        onChanged();
      } else {
        profilesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of profiles fetched.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
     */
    public Builder addAllProfiles(
        java.lang.Iterable<? extends com.google.devtools.cloudprofiler.v2.Profile> values) {
      if (profilesBuilder_ == null) {
        ensureProfilesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, profiles_);
        onChanged();
      } else {
        profilesBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of profiles fetched.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
     */
    public Builder clearProfiles() {
      if (profilesBuilder_ == null) {
        profiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        profilesBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of profiles fetched.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
     */
    public Builder removeProfiles(int index) {
      if (profilesBuilder_ == null) {
        ensureProfilesIsMutable();
        profiles_.remove(index);
        onChanged();
      } else {
        profilesBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of profiles fetched.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
     */
    public com.google.devtools.cloudprofiler.v2.Profile.Builder getProfilesBuilder(int index) {
      return getProfilesFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * List of profiles fetched.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
     */
    public com.google.devtools.cloudprofiler.v2.ProfileOrBuilder getProfilesOrBuilder(int index) {
      if (profilesBuilder_ == null) {
        return profiles_.get(index);
      } else {
        return profilesBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * List of profiles fetched.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
     */
    public java.util.List<? extends com.google.devtools.cloudprofiler.v2.ProfileOrBuilder>
        getProfilesOrBuilderList() {
      if (profilesBuilder_ != null) {
        return profilesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(profiles_);
      }
    }

    /**
     *
     *
     * <pre>
     * List of profiles fetched.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
     */
    public com.google.devtools.cloudprofiler.v2.Profile.Builder addProfilesBuilder() {
      return getProfilesFieldBuilder()
          .addBuilder(com.google.devtools.cloudprofiler.v2.Profile.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * List of profiles fetched.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
     */
    public com.google.devtools.cloudprofiler.v2.Profile.Builder addProfilesBuilder(int index) {
      return getProfilesFieldBuilder()
          .addBuilder(index, com.google.devtools.cloudprofiler.v2.Profile.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * List of profiles fetched.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
     */
    public java.util.List<com.google.devtools.cloudprofiler.v2.Profile.Builder>
        getProfilesBuilderList() {
      return getProfilesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.cloudprofiler.v2.Profile,
            com.google.devtools.cloudprofiler.v2.Profile.Builder,
            com.google.devtools.cloudprofiler.v2.ProfileOrBuilder>
        getProfilesFieldBuilder() {
      if (profilesBuilder_ == null) {
        profilesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.devtools.cloudprofiler.v2.Profile,
                com.google.devtools.cloudprofiler.v2.Profile.Builder,
                com.google.devtools.cloudprofiler.v2.ProfileOrBuilder>(
                profiles_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        profiles_ = null;
      }
      return profilesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * Token to receive the next page of results.
     * This field maybe empty if there are no more profiles to fetch.
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
     * Token to receive the next page of results.
     * This field maybe empty if there are no more profiles to fetch.
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
     * Token to receive the next page of results.
     * This field maybe empty if there are no more profiles to fetch.
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
     * Token to receive the next page of results.
     * This field maybe empty if there are no more profiles to fetch.
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
     * Token to receive the next page of results.
     * This field maybe empty if there are no more profiles to fetch.
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

    private int skippedProfiles_;

    /**
     *
     *
     * <pre>
     * Number of profiles that were skipped in the current page since they were
     * not able to be fetched successfully. This should typically be zero. A
     * non-zero value may indicate a transient failure, in which case if the
     * number is too high for your use case, the call may be retried.
     * </pre>
     *
     * <code>int32 skipped_profiles = 3;</code>
     *
     * @return The skippedProfiles.
     */
    @java.lang.Override
    public int getSkippedProfiles() {
      return skippedProfiles_;
    }

    /**
     *
     *
     * <pre>
     * Number of profiles that were skipped in the current page since they were
     * not able to be fetched successfully. This should typically be zero. A
     * non-zero value may indicate a transient failure, in which case if the
     * number is too high for your use case, the call may be retried.
     * </pre>
     *
     * <code>int32 skipped_profiles = 3;</code>
     *
     * @param value The skippedProfiles to set.
     * @return This builder for chaining.
     */
    public Builder setSkippedProfiles(int value) {

      skippedProfiles_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Number of profiles that were skipped in the current page since they were
     * not able to be fetched successfully. This should typically be zero. A
     * non-zero value may indicate a transient failure, in which case if the
     * number is too high for your use case, the call may be retried.
     * </pre>
     *
     * <code>int32 skipped_profiles = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSkippedProfiles() {
      bitField0_ = (bitField0_ & ~0x00000004);
      skippedProfiles_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudprofiler.v2.ListProfilesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudprofiler.v2.ListProfilesResponse)
  private static final com.google.devtools.cloudprofiler.v2.ListProfilesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.cloudprofiler.v2.ListProfilesResponse();
  }

  public static com.google.devtools.cloudprofiler.v2.ListProfilesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListProfilesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListProfilesResponse>() {
        @java.lang.Override
        public ListProfilesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListProfilesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListProfilesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.cloudprofiler.v2.ListProfilesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
