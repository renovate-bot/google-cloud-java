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
// source: google/cloud/aiplatform/v1beta1/featurestore_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [FeaturestoreService.CreateEntityType][google.cloud.aiplatform.v1beta1.FeaturestoreService.CreateEntityType].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest}
 */
public final class CreateEntityTypeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest)
    CreateEntityTypeRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateEntityTypeRequest.newBuilder() to construct.
  private CreateEntityTypeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateEntityTypeRequest() {
    parent_ = "";
    entityTypeId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateEntityTypeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_CreateEntityTypeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_CreateEntityTypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest.class,
            com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Featurestore to create EntityTypes.
   * Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Featurestore to create EntityTypes.
   * Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTITY_TYPE_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.EntityType entityType_;

  /**
   *
   *
   * <pre>
   * The EntityType to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EntityType entity_type = 2;</code>
   *
   * @return Whether the entityType field is set.
   */
  @java.lang.Override
  public boolean hasEntityType() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The EntityType to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EntityType entity_type = 2;</code>
   *
   * @return The entityType.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.EntityType getEntityType() {
    return entityType_ == null
        ? com.google.cloud.aiplatform.v1beta1.EntityType.getDefaultInstance()
        : entityType_;
  }

  /**
   *
   *
   * <pre>
   * The EntityType to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EntityType entity_type = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.EntityTypeOrBuilder getEntityTypeOrBuilder() {
    return entityType_ == null
        ? com.google.cloud.aiplatform.v1beta1.EntityType.getDefaultInstance()
        : entityType_;
  }

  public static final int ENTITY_TYPE_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object entityTypeId_ = "";

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the EntityType, which will become the final
   * component of the EntityType's resource name.
   *
   * This value may be up to 60 characters, and valid characters are
   * `[a-z0-9_]`. The first character cannot be a number.
   *
   * The value must be unique within a featurestore.
   * </pre>
   *
   * <code>string entity_type_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The entityTypeId.
   */
  @java.lang.Override
  public java.lang.String getEntityTypeId() {
    java.lang.Object ref = entityTypeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entityTypeId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the EntityType, which will become the final
   * component of the EntityType's resource name.
   *
   * This value may be up to 60 characters, and valid characters are
   * `[a-z0-9_]`. The first character cannot be a number.
   *
   * The value must be unique within a featurestore.
   * </pre>
   *
   * <code>string entity_type_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for entityTypeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEntityTypeIdBytes() {
    java.lang.Object ref = entityTypeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      entityTypeId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getEntityType());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityTypeId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, entityTypeId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEntityType());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityTypeId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, entityTypeId_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest other =
        (com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasEntityType() != other.hasEntityType()) return false;
    if (hasEntityType()) {
      if (!getEntityType().equals(other.getEntityType())) return false;
    }
    if (!getEntityTypeId().equals(other.getEntityTypeId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasEntityType()) {
      hash = (37 * hash) + ENTITY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getEntityType().hashCode();
    }
    hash = (37 * hash) + ENTITY_TYPE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEntityTypeId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest prototype) {
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
   * Request message for
   * [FeaturestoreService.CreateEntityType][google.cloud.aiplatform.v1beta1.FeaturestoreService.CreateEntityType].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest)
      com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreateEntityTypeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreateEntityTypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest.class,
              com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEntityTypeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      entityType_ = null;
      if (entityTypeBuilder_ != null) {
        entityTypeBuilder_.dispose();
        entityTypeBuilder_ = null;
      }
      entityTypeId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreateEntityTypeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest build() {
      com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest result =
          new com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.entityType_ = entityTypeBuilder_ == null ? entityType_ : entityTypeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.entityTypeId_ = entityTypeId_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest other) {
      if (other == com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasEntityType()) {
        mergeEntityType(other.getEntityType());
      }
      if (!other.getEntityTypeId().isEmpty()) {
        entityTypeId_ = other.entityTypeId_;
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getEntityTypeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                entityTypeId_ = input.readStringRequireUtf8();
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

    private java.lang.Object parent_ = "";

    /**
     *
     *
     * <pre>
     * Required. The resource name of the Featurestore to create EntityTypes.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the Featurestore to create EntityTypes.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the Featurestore to create EntityTypes.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the Featurestore to create EntityTypes.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the Featurestore to create EntityTypes.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.EntityType entityType_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.EntityType,
            com.google.cloud.aiplatform.v1beta1.EntityType.Builder,
            com.google.cloud.aiplatform.v1beta1.EntityTypeOrBuilder>
        entityTypeBuilder_;

    /**
     *
     *
     * <pre>
     * The EntityType to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.EntityType entity_type = 2;</code>
     *
     * @return Whether the entityType field is set.
     */
    public boolean hasEntityType() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * The EntityType to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.EntityType entity_type = 2;</code>
     *
     * @return The entityType.
     */
    public com.google.cloud.aiplatform.v1beta1.EntityType getEntityType() {
      if (entityTypeBuilder_ == null) {
        return entityType_ == null
            ? com.google.cloud.aiplatform.v1beta1.EntityType.getDefaultInstance()
            : entityType_;
      } else {
        return entityTypeBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The EntityType to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.EntityType entity_type = 2;</code>
     */
    public Builder setEntityType(com.google.cloud.aiplatform.v1beta1.EntityType value) {
      if (entityTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entityType_ = value;
      } else {
        entityTypeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The EntityType to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.EntityType entity_type = 2;</code>
     */
    public Builder setEntityType(
        com.google.cloud.aiplatform.v1beta1.EntityType.Builder builderForValue) {
      if (entityTypeBuilder_ == null) {
        entityType_ = builderForValue.build();
      } else {
        entityTypeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The EntityType to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.EntityType entity_type = 2;</code>
     */
    public Builder mergeEntityType(com.google.cloud.aiplatform.v1beta1.EntityType value) {
      if (entityTypeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && entityType_ != null
            && entityType_ != com.google.cloud.aiplatform.v1beta1.EntityType.getDefaultInstance()) {
          getEntityTypeBuilder().mergeFrom(value);
        } else {
          entityType_ = value;
        }
      } else {
        entityTypeBuilder_.mergeFrom(value);
      }
      if (entityType_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The EntityType to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.EntityType entity_type = 2;</code>
     */
    public Builder clearEntityType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      entityType_ = null;
      if (entityTypeBuilder_ != null) {
        entityTypeBuilder_.dispose();
        entityTypeBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The EntityType to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.EntityType entity_type = 2;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.EntityType.Builder getEntityTypeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEntityTypeFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The EntityType to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.EntityType entity_type = 2;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.EntityTypeOrBuilder getEntityTypeOrBuilder() {
      if (entityTypeBuilder_ != null) {
        return entityTypeBuilder_.getMessageOrBuilder();
      } else {
        return entityType_ == null
            ? com.google.cloud.aiplatform.v1beta1.EntityType.getDefaultInstance()
            : entityType_;
      }
    }

    /**
     *
     *
     * <pre>
     * The EntityType to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.EntityType entity_type = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.EntityType,
            com.google.cloud.aiplatform.v1beta1.EntityType.Builder,
            com.google.cloud.aiplatform.v1beta1.EntityTypeOrBuilder>
        getEntityTypeFieldBuilder() {
      if (entityTypeBuilder_ == null) {
        entityTypeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.EntityType,
                com.google.cloud.aiplatform.v1beta1.EntityType.Builder,
                com.google.cloud.aiplatform.v1beta1.EntityTypeOrBuilder>(
                getEntityType(), getParentForChildren(), isClean());
        entityType_ = null;
      }
      return entityTypeBuilder_;
    }

    private java.lang.Object entityTypeId_ = "";

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the EntityType, which will become the final
     * component of the EntityType's resource name.
     *
     * This value may be up to 60 characters, and valid characters are
     * `[a-z0-9_]`. The first character cannot be a number.
     *
     * The value must be unique within a featurestore.
     * </pre>
     *
     * <code>string entity_type_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The entityTypeId.
     */
    public java.lang.String getEntityTypeId() {
      java.lang.Object ref = entityTypeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entityTypeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the EntityType, which will become the final
     * component of the EntityType's resource name.
     *
     * This value may be up to 60 characters, and valid characters are
     * `[a-z0-9_]`. The first character cannot be a number.
     *
     * The value must be unique within a featurestore.
     * </pre>
     *
     * <code>string entity_type_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for entityTypeId.
     */
    public com.google.protobuf.ByteString getEntityTypeIdBytes() {
      java.lang.Object ref = entityTypeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        entityTypeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the EntityType, which will become the final
     * component of the EntityType's resource name.
     *
     * This value may be up to 60 characters, and valid characters are
     * `[a-z0-9_]`. The first character cannot be a number.
     *
     * The value must be unique within a featurestore.
     * </pre>
     *
     * <code>string entity_type_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The entityTypeId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityTypeId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      entityTypeId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the EntityType, which will become the final
     * component of the EntityType's resource name.
     *
     * This value may be up to 60 characters, and valid characters are
     * `[a-z0-9_]`. The first character cannot be a number.
     *
     * The value must be unique within a featurestore.
     * </pre>
     *
     * <code>string entity_type_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEntityTypeId() {
      entityTypeId_ = getDefaultInstance().getEntityTypeId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the EntityType, which will become the final
     * component of the EntityType's resource name.
     *
     * This value may be up to 60 characters, and valid characters are
     * `[a-z0-9_]`. The first character cannot be a number.
     *
     * The value must be unique within a featurestore.
     * </pre>
     *
     * <code>string entity_type_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for entityTypeId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityTypeIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      entityTypeId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest)
  private static final com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEntityTypeRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateEntityTypeRequest>() {
        @java.lang.Override
        public CreateEntityTypeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateEntityTypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEntityTypeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
