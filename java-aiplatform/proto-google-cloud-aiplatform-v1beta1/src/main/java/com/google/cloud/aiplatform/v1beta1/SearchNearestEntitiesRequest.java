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
// source: google/cloud/aiplatform/v1beta1/feature_online_store_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * The request message for
 * [FeatureOnlineStoreService.SearchNearestEntities][google.cloud.aiplatform.v1beta1.FeatureOnlineStoreService.SearchNearestEntities].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest}
 */
public final class SearchNearestEntitiesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest)
    SearchNearestEntitiesRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SearchNearestEntitiesRequest.newBuilder() to construct.
  private SearchNearestEntitiesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchNearestEntitiesRequest() {
    featureView_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchNearestEntitiesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.FeatureOnlineStoreServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_SearchNearestEntitiesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.FeatureOnlineStoreServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_SearchNearestEntitiesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest.class,
            com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest.Builder.class);
  }

  private int bitField0_;
  public static final int FEATURE_VIEW_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object featureView_ = "";

  /**
   *
   *
   * <pre>
   * Required. FeatureView resource format
   * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}/featureViews/{featureView}`
   * </pre>
   *
   * <code>
   * string feature_view = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The featureView.
   */
  @java.lang.Override
  public java.lang.String getFeatureView() {
    java.lang.Object ref = featureView_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      featureView_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. FeatureView resource format
   * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}/featureViews/{featureView}`
   * </pre>
   *
   * <code>
   * string feature_view = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for featureView.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFeatureViewBytes() {
    java.lang.Object ref = featureView_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      featureView_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUERY_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery query_;

  /**
   *
   *
   * <pre>
   * Required. The query.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.NearestNeighborQuery query = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the query field is set.
   */
  @java.lang.Override
  public boolean hasQuery() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The query.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.NearestNeighborQuery query = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The query.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery getQuery() {
    return query_ == null
        ? com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery.getDefaultInstance()
        : query_;
  }

  /**
   *
   *
   * <pre>
   * Required. The query.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.NearestNeighborQuery query = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.NearestNeighborQueryOrBuilder getQueryOrBuilder() {
    return query_ == null
        ? com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery.getDefaultInstance()
        : query_;
  }

  public static final int RETURN_FULL_ENTITY_FIELD_NUMBER = 3;
  private boolean returnFullEntity_ = false;

  /**
   *
   *
   * <pre>
   * Optional. If set to true, the full entities (including all vector values
   * and metadata) of the nearest neighbors are returned; otherwise only entity
   * id of the nearest neighbors will be returned. Note that returning full
   * entities will significantly increase the latency and cost of the query.
   * </pre>
   *
   * <code>bool return_full_entity = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The returnFullEntity.
   */
  @java.lang.Override
  public boolean getReturnFullEntity() {
    return returnFullEntity_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(featureView_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, featureView_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getQuery());
    }
    if (returnFullEntity_ != false) {
      output.writeBool(3, returnFullEntity_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(featureView_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, featureView_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getQuery());
    }
    if (returnFullEntity_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, returnFullEntity_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest other =
        (com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest) obj;

    if (!getFeatureView().equals(other.getFeatureView())) return false;
    if (hasQuery() != other.hasQuery()) return false;
    if (hasQuery()) {
      if (!getQuery().equals(other.getQuery())) return false;
    }
    if (getReturnFullEntity() != other.getReturnFullEntity()) return false;
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
    hash = (37 * hash) + FEATURE_VIEW_FIELD_NUMBER;
    hash = (53 * hash) + getFeatureView().hashCode();
    if (hasQuery()) {
      hash = (37 * hash) + QUERY_FIELD_NUMBER;
      hash = (53 * hash) + getQuery().hashCode();
    }
    hash = (37 * hash) + RETURN_FULL_ENTITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getReturnFullEntity());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest prototype) {
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
   * The request message for
   * [FeatureOnlineStoreService.SearchNearestEntities][google.cloud.aiplatform.v1beta1.FeatureOnlineStoreService.SearchNearestEntities].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest)
      com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.FeatureOnlineStoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_SearchNearestEntitiesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.FeatureOnlineStoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_SearchNearestEntitiesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest.class,
              com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getQueryFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      featureView_ = "";
      query_ = null;
      if (queryBuilder_ != null) {
        queryBuilder_.dispose();
        queryBuilder_ = null;
      }
      returnFullEntity_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.FeatureOnlineStoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_SearchNearestEntitiesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest build() {
      com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest result =
          new com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.featureView_ = featureView_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.query_ = queryBuilder_ == null ? query_ : queryBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.returnFullEntity_ = returnFullEntity_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest.getDefaultInstance())
        return this;
      if (!other.getFeatureView().isEmpty()) {
        featureView_ = other.featureView_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasQuery()) {
        mergeQuery(other.getQuery());
      }
      if (other.getReturnFullEntity() != false) {
        setReturnFullEntity(other.getReturnFullEntity());
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
                featureView_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getQueryFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                returnFullEntity_ = input.readBool();
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

    private java.lang.Object featureView_ = "";

    /**
     *
     *
     * <pre>
     * Required. FeatureView resource format
     * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}/featureViews/{featureView}`
     * </pre>
     *
     * <code>
     * string feature_view = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The featureView.
     */
    public java.lang.String getFeatureView() {
      java.lang.Object ref = featureView_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        featureView_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. FeatureView resource format
     * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}/featureViews/{featureView}`
     * </pre>
     *
     * <code>
     * string feature_view = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for featureView.
     */
    public com.google.protobuf.ByteString getFeatureViewBytes() {
      java.lang.Object ref = featureView_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        featureView_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. FeatureView resource format
     * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}/featureViews/{featureView}`
     * </pre>
     *
     * <code>
     * string feature_view = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The featureView to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureView(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      featureView_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. FeatureView resource format
     * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}/featureViews/{featureView}`
     * </pre>
     *
     * <code>
     * string feature_view = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFeatureView() {
      featureView_ = getDefaultInstance().getFeatureView();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. FeatureView resource format
     * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}/featureViews/{featureView}`
     * </pre>
     *
     * <code>
     * string feature_view = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for featureView to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureViewBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      featureView_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery query_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery,
            com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery.Builder,
            com.google.cloud.aiplatform.v1beta1.NearestNeighborQueryOrBuilder>
        queryBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The query.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.NearestNeighborQuery query = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the query field is set.
     */
    public boolean hasQuery() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The query.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.NearestNeighborQuery query = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The query.
     */
    public com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery getQuery() {
      if (queryBuilder_ == null) {
        return query_ == null
            ? com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery.getDefaultInstance()
            : query_;
      } else {
        return queryBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The query.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.NearestNeighborQuery query = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setQuery(com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery value) {
      if (queryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        query_ = value;
      } else {
        queryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The query.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.NearestNeighborQuery query = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setQuery(
        com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery.Builder builderForValue) {
      if (queryBuilder_ == null) {
        query_ = builderForValue.build();
      } else {
        queryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The query.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.NearestNeighborQuery query = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeQuery(com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery value) {
      if (queryBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && query_ != null
            && query_
                != com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery.getDefaultInstance()) {
          getQueryBuilder().mergeFrom(value);
        } else {
          query_ = value;
        }
      } else {
        queryBuilder_.mergeFrom(value);
      }
      if (query_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The query.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.NearestNeighborQuery query = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearQuery() {
      bitField0_ = (bitField0_ & ~0x00000002);
      query_ = null;
      if (queryBuilder_ != null) {
        queryBuilder_.dispose();
        queryBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The query.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.NearestNeighborQuery query = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery.Builder getQueryBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getQueryFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The query.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.NearestNeighborQuery query = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.NearestNeighborQueryOrBuilder getQueryOrBuilder() {
      if (queryBuilder_ != null) {
        return queryBuilder_.getMessageOrBuilder();
      } else {
        return query_ == null
            ? com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery.getDefaultInstance()
            : query_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The query.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.NearestNeighborQuery query = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery,
            com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery.Builder,
            com.google.cloud.aiplatform.v1beta1.NearestNeighborQueryOrBuilder>
        getQueryFieldBuilder() {
      if (queryBuilder_ == null) {
        queryBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery,
                com.google.cloud.aiplatform.v1beta1.NearestNeighborQuery.Builder,
                com.google.cloud.aiplatform.v1beta1.NearestNeighborQueryOrBuilder>(
                getQuery(), getParentForChildren(), isClean());
        query_ = null;
      }
      return queryBuilder_;
    }

    private boolean returnFullEntity_;

    /**
     *
     *
     * <pre>
     * Optional. If set to true, the full entities (including all vector values
     * and metadata) of the nearest neighbors are returned; otherwise only entity
     * id of the nearest neighbors will be returned. Note that returning full
     * entities will significantly increase the latency and cost of the query.
     * </pre>
     *
     * <code>bool return_full_entity = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The returnFullEntity.
     */
    @java.lang.Override
    public boolean getReturnFullEntity() {
      return returnFullEntity_;
    }

    /**
     *
     *
     * <pre>
     * Optional. If set to true, the full entities (including all vector values
     * and metadata) of the nearest neighbors are returned; otherwise only entity
     * id of the nearest neighbors will be returned. Note that returning full
     * entities will significantly increase the latency and cost of the query.
     * </pre>
     *
     * <code>bool return_full_entity = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The returnFullEntity to set.
     * @return This builder for chaining.
     */
    public Builder setReturnFullEntity(boolean value) {

      returnFullEntity_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. If set to true, the full entities (including all vector values
     * and metadata) of the nearest neighbors are returned; otherwise only entity
     * id of the nearest neighbors will be returned. Note that returning full
     * entities will significantly increase the latency and cost of the query.
     * </pre>
     *
     * <code>bool return_full_entity = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearReturnFullEntity() {
      bitField0_ = (bitField0_ & ~0x00000004);
      returnFullEntity_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest)
  private static final com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchNearestEntitiesRequest> PARSER =
      new com.google.protobuf.AbstractParser<SearchNearestEntitiesRequest>() {
        @java.lang.Override
        public SearchNearestEntitiesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchNearestEntitiesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchNearestEntitiesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.SearchNearestEntitiesRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
