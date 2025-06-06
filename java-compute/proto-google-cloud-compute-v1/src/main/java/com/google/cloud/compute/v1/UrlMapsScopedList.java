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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.UrlMapsScopedList}
 */
public final class UrlMapsScopedList extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.UrlMapsScopedList)
    UrlMapsScopedListOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UrlMapsScopedList.newBuilder() to construct.
  private UrlMapsScopedList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UrlMapsScopedList() {
    urlMaps_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UrlMapsScopedList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_UrlMapsScopedList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_UrlMapsScopedList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.UrlMapsScopedList.class,
            com.google.cloud.compute.v1.UrlMapsScopedList.Builder.class);
  }

  private int bitField0_;
  public static final int URL_MAPS_FIELD_NUMBER = 103352167;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.UrlMap> urlMaps_;

  /**
   *
   *
   * <pre>
   * A list of UrlMaps contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.UrlMap> getUrlMapsList() {
    return urlMaps_;
  }

  /**
   *
   *
   * <pre>
   * A list of UrlMaps contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.UrlMapOrBuilder>
      getUrlMapsOrBuilderList() {
    return urlMaps_;
  }

  /**
   *
   *
   * <pre>
   * A list of UrlMaps contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
   */
  @java.lang.Override
  public int getUrlMapsCount() {
    return urlMaps_.size();
  }

  /**
   *
   *
   * <pre>
   * A list of UrlMaps contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.UrlMap getUrlMaps(int index) {
    return urlMaps_.get(index);
  }

  /**
   *
   *
   * <pre>
   * A list of UrlMaps contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.UrlMapOrBuilder getUrlMapsOrBuilder(int index) {
    return urlMaps_.get(index);
  }

  public static final int WARNING_FIELD_NUMBER = 50704284;
  private com.google.cloud.compute.v1.Warning warning_;

  /**
   *
   *
   * <pre>
   * Informational warning which replaces the list of backend services when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return Whether the warning field is set.
   */
  @java.lang.Override
  public boolean hasWarning() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Informational warning which replaces the list of backend services when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return The warning.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Warning getWarning() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
  }

  /**
   *
   *
   * <pre>
   * Informational warning which replaces the list of backend services when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(50704284, getWarning());
    }
    for (int i = 0; i < urlMaps_.size(); i++) {
      output.writeMessage(103352167, urlMaps_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(50704284, getWarning());
    }
    for (int i = 0; i < urlMaps_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(103352167, urlMaps_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.UrlMapsScopedList)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.UrlMapsScopedList other =
        (com.google.cloud.compute.v1.UrlMapsScopedList) obj;

    if (!getUrlMapsList().equals(other.getUrlMapsList())) return false;
    if (hasWarning() != other.hasWarning()) return false;
    if (hasWarning()) {
      if (!getWarning().equals(other.getWarning())) return false;
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
    if (getUrlMapsCount() > 0) {
      hash = (37 * hash) + URL_MAPS_FIELD_NUMBER;
      hash = (53 * hash) + getUrlMapsList().hashCode();
    }
    if (hasWarning()) {
      hash = (37 * hash) + WARNING_FIELD_NUMBER;
      hash = (53 * hash) + getWarning().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.UrlMapsScopedList parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.UrlMapsScopedList parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.UrlMapsScopedList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.UrlMapsScopedList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.UrlMapsScopedList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.UrlMapsScopedList parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.UrlMapsScopedList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.UrlMapsScopedList parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.UrlMapsScopedList parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.UrlMapsScopedList parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.UrlMapsScopedList parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.UrlMapsScopedList parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.UrlMapsScopedList prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.UrlMapsScopedList}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.UrlMapsScopedList)
      com.google.cloud.compute.v1.UrlMapsScopedListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_UrlMapsScopedList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_UrlMapsScopedList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.UrlMapsScopedList.class,
              com.google.cloud.compute.v1.UrlMapsScopedList.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.UrlMapsScopedList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getUrlMapsFieldBuilder();
        getWarningFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (urlMapsBuilder_ == null) {
        urlMaps_ = java.util.Collections.emptyList();
      } else {
        urlMaps_ = null;
        urlMapsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_UrlMapsScopedList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.UrlMapsScopedList getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.UrlMapsScopedList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.UrlMapsScopedList build() {
      com.google.cloud.compute.v1.UrlMapsScopedList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.UrlMapsScopedList buildPartial() {
      com.google.cloud.compute.v1.UrlMapsScopedList result =
          new com.google.cloud.compute.v1.UrlMapsScopedList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.compute.v1.UrlMapsScopedList result) {
      if (urlMapsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          urlMaps_ = java.util.Collections.unmodifiableList(urlMaps_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.urlMaps_ = urlMaps_;
      } else {
        result.urlMaps_ = urlMapsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.UrlMapsScopedList result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.warning_ = warningBuilder_ == null ? warning_ : warningBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.UrlMapsScopedList) {
        return mergeFrom((com.google.cloud.compute.v1.UrlMapsScopedList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.UrlMapsScopedList other) {
      if (other == com.google.cloud.compute.v1.UrlMapsScopedList.getDefaultInstance()) return this;
      if (urlMapsBuilder_ == null) {
        if (!other.urlMaps_.isEmpty()) {
          if (urlMaps_.isEmpty()) {
            urlMaps_ = other.urlMaps_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUrlMapsIsMutable();
            urlMaps_.addAll(other.urlMaps_);
          }
          onChanged();
        }
      } else {
        if (!other.urlMaps_.isEmpty()) {
          if (urlMapsBuilder_.isEmpty()) {
            urlMapsBuilder_.dispose();
            urlMapsBuilder_ = null;
            urlMaps_ = other.urlMaps_;
            bitField0_ = (bitField0_ & ~0x00000001);
            urlMapsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getUrlMapsFieldBuilder()
                    : null;
          } else {
            urlMapsBuilder_.addAllMessages(other.urlMaps_);
          }
        }
      }
      if (other.hasWarning()) {
        mergeWarning(other.getWarning());
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
            case 405634274:
              {
                input.readMessage(getWarningFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 405634274
            case 826817338:
              {
                com.google.cloud.compute.v1.UrlMap m =
                    input.readMessage(
                        com.google.cloud.compute.v1.UrlMap.parser(), extensionRegistry);
                if (urlMapsBuilder_ == null) {
                  ensureUrlMapsIsMutable();
                  urlMaps_.add(m);
                } else {
                  urlMapsBuilder_.addMessage(m);
                }
                break;
              } // case 826817338
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

    private java.util.List<com.google.cloud.compute.v1.UrlMap> urlMaps_ =
        java.util.Collections.emptyList();

    private void ensureUrlMapsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        urlMaps_ = new java.util.ArrayList<com.google.cloud.compute.v1.UrlMap>(urlMaps_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.UrlMap,
            com.google.cloud.compute.v1.UrlMap.Builder,
            com.google.cloud.compute.v1.UrlMapOrBuilder>
        urlMapsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of UrlMaps contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.UrlMap> getUrlMapsList() {
      if (urlMapsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(urlMaps_);
      } else {
        return urlMapsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * A list of UrlMaps contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
     */
    public int getUrlMapsCount() {
      if (urlMapsBuilder_ == null) {
        return urlMaps_.size();
      } else {
        return urlMapsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * A list of UrlMaps contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
     */
    public com.google.cloud.compute.v1.UrlMap getUrlMaps(int index) {
      if (urlMapsBuilder_ == null) {
        return urlMaps_.get(index);
      } else {
        return urlMapsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * A list of UrlMaps contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
     */
    public Builder setUrlMaps(int index, com.google.cloud.compute.v1.UrlMap value) {
      if (urlMapsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUrlMapsIsMutable();
        urlMaps_.set(index, value);
        onChanged();
      } else {
        urlMapsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of UrlMaps contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
     */
    public Builder setUrlMaps(
        int index, com.google.cloud.compute.v1.UrlMap.Builder builderForValue) {
      if (urlMapsBuilder_ == null) {
        ensureUrlMapsIsMutable();
        urlMaps_.set(index, builderForValue.build());
        onChanged();
      } else {
        urlMapsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of UrlMaps contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
     */
    public Builder addUrlMaps(com.google.cloud.compute.v1.UrlMap value) {
      if (urlMapsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUrlMapsIsMutable();
        urlMaps_.add(value);
        onChanged();
      } else {
        urlMapsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of UrlMaps contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
     */
    public Builder addUrlMaps(int index, com.google.cloud.compute.v1.UrlMap value) {
      if (urlMapsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUrlMapsIsMutable();
        urlMaps_.add(index, value);
        onChanged();
      } else {
        urlMapsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of UrlMaps contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
     */
    public Builder addUrlMaps(com.google.cloud.compute.v1.UrlMap.Builder builderForValue) {
      if (urlMapsBuilder_ == null) {
        ensureUrlMapsIsMutable();
        urlMaps_.add(builderForValue.build());
        onChanged();
      } else {
        urlMapsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of UrlMaps contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
     */
    public Builder addUrlMaps(
        int index, com.google.cloud.compute.v1.UrlMap.Builder builderForValue) {
      if (urlMapsBuilder_ == null) {
        ensureUrlMapsIsMutable();
        urlMaps_.add(index, builderForValue.build());
        onChanged();
      } else {
        urlMapsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of UrlMaps contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
     */
    public Builder addAllUrlMaps(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.UrlMap> values) {
      if (urlMapsBuilder_ == null) {
        ensureUrlMapsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, urlMaps_);
        onChanged();
      } else {
        urlMapsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of UrlMaps contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
     */
    public Builder clearUrlMaps() {
      if (urlMapsBuilder_ == null) {
        urlMaps_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        urlMapsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of UrlMaps contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
     */
    public Builder removeUrlMaps(int index) {
      if (urlMapsBuilder_ == null) {
        ensureUrlMapsIsMutable();
        urlMaps_.remove(index);
        onChanged();
      } else {
        urlMapsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of UrlMaps contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
     */
    public com.google.cloud.compute.v1.UrlMap.Builder getUrlMapsBuilder(int index) {
      return getUrlMapsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * A list of UrlMaps contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
     */
    public com.google.cloud.compute.v1.UrlMapOrBuilder getUrlMapsOrBuilder(int index) {
      if (urlMapsBuilder_ == null) {
        return urlMaps_.get(index);
      } else {
        return urlMapsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * A list of UrlMaps contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.UrlMapOrBuilder>
        getUrlMapsOrBuilderList() {
      if (urlMapsBuilder_ != null) {
        return urlMapsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(urlMaps_);
      }
    }

    /**
     *
     *
     * <pre>
     * A list of UrlMaps contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
     */
    public com.google.cloud.compute.v1.UrlMap.Builder addUrlMapsBuilder() {
      return getUrlMapsFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.UrlMap.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * A list of UrlMaps contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
     */
    public com.google.cloud.compute.v1.UrlMap.Builder addUrlMapsBuilder(int index) {
      return getUrlMapsFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.UrlMap.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * A list of UrlMaps contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.UrlMap url_maps = 103352167;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.UrlMap.Builder> getUrlMapsBuilderList() {
      return getUrlMapsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.UrlMap,
            com.google.cloud.compute.v1.UrlMap.Builder,
            com.google.cloud.compute.v1.UrlMapOrBuilder>
        getUrlMapsFieldBuilder() {
      if (urlMapsBuilder_ == null) {
        urlMapsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.UrlMap,
                com.google.cloud.compute.v1.UrlMap.Builder,
                com.google.cloud.compute.v1.UrlMapOrBuilder>(
                urlMaps_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        urlMaps_ = null;
      }
      return urlMapsBuilder_;
    }

    private com.google.cloud.compute.v1.Warning warning_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Warning,
            com.google.cloud.compute.v1.Warning.Builder,
            com.google.cloud.compute.v1.WarningOrBuilder>
        warningBuilder_;

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     *
     * @return Whether the warning field is set.
     */
    public boolean hasWarning() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     *
     * @return The warning.
     */
    public com.google.cloud.compute.v1.Warning getWarning() {
      if (warningBuilder_ == null) {
        return warning_ == null
            ? com.google.cloud.compute.v1.Warning.getDefaultInstance()
            : warning_;
      } else {
        return warningBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        warning_ = value;
      } else {
        warningBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(com.google.cloud.compute.v1.Warning.Builder builderForValue) {
      if (warningBuilder_ == null) {
        warning_ = builderForValue.build();
      } else {
        warningBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder mergeWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && warning_ != null
            && warning_ != com.google.cloud.compute.v1.Warning.getDefaultInstance()) {
          getWarningBuilder().mergeFrom(value);
        } else {
          warning_ = value;
        }
      } else {
        warningBuilder_.mergeFrom(value);
      }
      if (warning_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder clearWarning() {
      bitField0_ = (bitField0_ & ~0x00000002);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.Warning.Builder getWarningBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getWarningFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
      if (warningBuilder_ != null) {
        return warningBuilder_.getMessageOrBuilder();
      } else {
        return warning_ == null
            ? com.google.cloud.compute.v1.Warning.getDefaultInstance()
            : warning_;
      }
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Warning,
            com.google.cloud.compute.v1.Warning.Builder,
            com.google.cloud.compute.v1.WarningOrBuilder>
        getWarningFieldBuilder() {
      if (warningBuilder_ == null) {
        warningBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.Warning,
                com.google.cloud.compute.v1.Warning.Builder,
                com.google.cloud.compute.v1.WarningOrBuilder>(
                getWarning(), getParentForChildren(), isClean());
        warning_ = null;
      }
      return warningBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.UrlMapsScopedList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.UrlMapsScopedList)
  private static final com.google.cloud.compute.v1.UrlMapsScopedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.UrlMapsScopedList();
  }

  public static com.google.cloud.compute.v1.UrlMapsScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UrlMapsScopedList> PARSER =
      new com.google.protobuf.AbstractParser<UrlMapsScopedList>() {
        @java.lang.Override
        public UrlMapsScopedList parsePartialFrom(
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

  public static com.google.protobuf.Parser<UrlMapsScopedList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UrlMapsScopedList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.UrlMapsScopedList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
