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
// source: google/cloud/bigquery/biglake/v1/metastore.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.bigquery.biglake.v1;

/**
 *
 *
 * <pre>
 * Request message for the CreateDatabase method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.biglake.v1.CreateDatabaseRequest}
 */
public final class CreateDatabaseRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.biglake.v1.CreateDatabaseRequest)
    CreateDatabaseRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateDatabaseRequest.newBuilder() to construct.
  private CreateDatabaseRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateDatabaseRequest() {
    parent_ = "";
    databaseId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateDatabaseRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.biglake.v1.MetastoreProto
        .internal_static_google_cloud_bigquery_biglake_v1_CreateDatabaseRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.biglake.v1.MetastoreProto
        .internal_static_google_cloud_bigquery_biglake_v1_CreateDatabaseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest.class,
            com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The parent resource where this database will be created.
   * Format:
   * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}
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
   * Required. The parent resource where this database will be created.
   * Format:
   * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}
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

  public static final int DATABASE_FIELD_NUMBER = 2;
  private com.google.cloud.bigquery.biglake.v1.Database database_;

  /**
   *
   *
   * <pre>
   * Required. The database to create.
   * The `name` field does not need to be provided.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.biglake.v1.Database database = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the database field is set.
   */
  @java.lang.Override
  public boolean hasDatabase() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The database to create.
   * The `name` field does not need to be provided.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.biglake.v1.Database database = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The database.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.biglake.v1.Database getDatabase() {
    return database_ == null
        ? com.google.cloud.bigquery.biglake.v1.Database.getDefaultInstance()
        : database_;
  }

  /**
   *
   *
   * <pre>
   * Required. The database to create.
   * The `name` field does not need to be provided.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.biglake.v1.Database database = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.biglake.v1.DatabaseOrBuilder getDatabaseOrBuilder() {
    return database_ == null
        ? com.google.cloud.bigquery.biglake.v1.Database.getDefaultInstance()
        : database_;
  }

  public static final int DATABASE_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object databaseId_ = "";

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the database, which will become the final
   * component of the database's resource name.
   * </pre>
   *
   * <code>string database_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The databaseId.
   */
  @java.lang.Override
  public java.lang.String getDatabaseId() {
    java.lang.Object ref = databaseId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      databaseId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the database, which will become the final
   * component of the database's resource name.
   * </pre>
   *
   * <code>string database_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for databaseId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDatabaseIdBytes() {
    java.lang.Object ref = databaseId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      databaseId_ = b;
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
      output.writeMessage(2, getDatabase());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(databaseId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, databaseId_);
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDatabase());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(databaseId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, databaseId_);
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
    if (!(obj instanceof com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest other =
        (com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasDatabase() != other.hasDatabase()) return false;
    if (hasDatabase()) {
      if (!getDatabase().equals(other.getDatabase())) return false;
    }
    if (!getDatabaseId().equals(other.getDatabaseId())) return false;
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
    if (hasDatabase()) {
      hash = (37 * hash) + DATABASE_FIELD_NUMBER;
      hash = (53 * hash) + getDatabase().hashCode();
    }
    hash = (37 * hash) + DATABASE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDatabaseId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest parseFrom(
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
      com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest prototype) {
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
   * Request message for the CreateDatabase method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.biglake.v1.CreateDatabaseRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.biglake.v1.CreateDatabaseRequest)
      com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.biglake.v1.MetastoreProto
          .internal_static_google_cloud_bigquery_biglake_v1_CreateDatabaseRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.biglake.v1.MetastoreProto
          .internal_static_google_cloud_bigquery_biglake_v1_CreateDatabaseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest.class,
              com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDatabaseFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      database_ = null;
      if (databaseBuilder_ != null) {
        databaseBuilder_.dispose();
        databaseBuilder_ = null;
      }
      databaseId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.biglake.v1.MetastoreProto
          .internal_static_google_cloud_bigquery_biglake_v1_CreateDatabaseRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest getDefaultInstanceForType() {
      return com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest build() {
      com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest buildPartial() {
      com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest result =
          new com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.database_ = databaseBuilder_ == null ? database_ : databaseBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.databaseId_ = databaseId_;
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
      if (other instanceof com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest) {
        return mergeFrom((com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest other) {
      if (other == com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDatabase()) {
        mergeDatabase(other.getDatabase());
      }
      if (!other.getDatabaseId().isEmpty()) {
        databaseId_ = other.databaseId_;
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
                input.readMessage(getDatabaseFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                databaseId_ = input.readStringRequireUtf8();
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
     * Required. The parent resource where this database will be created.
     * Format:
     * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}
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
     * Required. The parent resource where this database will be created.
     * Format:
     * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}
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
     * Required. The parent resource where this database will be created.
     * Format:
     * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}
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
     * Required. The parent resource where this database will be created.
     * Format:
     * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}
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
     * Required. The parent resource where this database will be created.
     * Format:
     * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}
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

    private com.google.cloud.bigquery.biglake.v1.Database database_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.biglake.v1.Database,
            com.google.cloud.bigquery.biglake.v1.Database.Builder,
            com.google.cloud.bigquery.biglake.v1.DatabaseOrBuilder>
        databaseBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The database to create.
     * The `name` field does not need to be provided.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.biglake.v1.Database database = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the database field is set.
     */
    public boolean hasDatabase() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The database to create.
     * The `name` field does not need to be provided.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.biglake.v1.Database database = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The database.
     */
    public com.google.cloud.bigquery.biglake.v1.Database getDatabase() {
      if (databaseBuilder_ == null) {
        return database_ == null
            ? com.google.cloud.bigquery.biglake.v1.Database.getDefaultInstance()
            : database_;
      } else {
        return databaseBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The database to create.
     * The `name` field does not need to be provided.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.biglake.v1.Database database = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDatabase(com.google.cloud.bigquery.biglake.v1.Database value) {
      if (databaseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        database_ = value;
      } else {
        databaseBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The database to create.
     * The `name` field does not need to be provided.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.biglake.v1.Database database = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDatabase(
        com.google.cloud.bigquery.biglake.v1.Database.Builder builderForValue) {
      if (databaseBuilder_ == null) {
        database_ = builderForValue.build();
      } else {
        databaseBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The database to create.
     * The `name` field does not need to be provided.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.biglake.v1.Database database = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDatabase(com.google.cloud.bigquery.biglake.v1.Database value) {
      if (databaseBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && database_ != null
            && database_ != com.google.cloud.bigquery.biglake.v1.Database.getDefaultInstance()) {
          getDatabaseBuilder().mergeFrom(value);
        } else {
          database_ = value;
        }
      } else {
        databaseBuilder_.mergeFrom(value);
      }
      if (database_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The database to create.
     * The `name` field does not need to be provided.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.biglake.v1.Database database = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDatabase() {
      bitField0_ = (bitField0_ & ~0x00000002);
      database_ = null;
      if (databaseBuilder_ != null) {
        databaseBuilder_.dispose();
        databaseBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The database to create.
     * The `name` field does not need to be provided.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.biglake.v1.Database database = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.bigquery.biglake.v1.Database.Builder getDatabaseBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDatabaseFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The database to create.
     * The `name` field does not need to be provided.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.biglake.v1.Database database = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.bigquery.biglake.v1.DatabaseOrBuilder getDatabaseOrBuilder() {
      if (databaseBuilder_ != null) {
        return databaseBuilder_.getMessageOrBuilder();
      } else {
        return database_ == null
            ? com.google.cloud.bigquery.biglake.v1.Database.getDefaultInstance()
            : database_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The database to create.
     * The `name` field does not need to be provided.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.biglake.v1.Database database = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.biglake.v1.Database,
            com.google.cloud.bigquery.biglake.v1.Database.Builder,
            com.google.cloud.bigquery.biglake.v1.DatabaseOrBuilder>
        getDatabaseFieldBuilder() {
      if (databaseBuilder_ == null) {
        databaseBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.bigquery.biglake.v1.Database,
                com.google.cloud.bigquery.biglake.v1.Database.Builder,
                com.google.cloud.bigquery.biglake.v1.DatabaseOrBuilder>(
                getDatabase(), getParentForChildren(), isClean());
        database_ = null;
      }
      return databaseBuilder_;
    }

    private java.lang.Object databaseId_ = "";

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the database, which will become the final
     * component of the database's resource name.
     * </pre>
     *
     * <code>string database_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The databaseId.
     */
    public java.lang.String getDatabaseId() {
      java.lang.Object ref = databaseId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        databaseId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the database, which will become the final
     * component of the database's resource name.
     * </pre>
     *
     * <code>string database_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for databaseId.
     */
    public com.google.protobuf.ByteString getDatabaseIdBytes() {
      java.lang.Object ref = databaseId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        databaseId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the database, which will become the final
     * component of the database's resource name.
     * </pre>
     *
     * <code>string database_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The databaseId to set.
     * @return This builder for chaining.
     */
    public Builder setDatabaseId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      databaseId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the database, which will become the final
     * component of the database's resource name.
     * </pre>
     *
     * <code>string database_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDatabaseId() {
      databaseId_ = getDefaultInstance().getDatabaseId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the database, which will become the final
     * component of the database's resource name.
     * </pre>
     *
     * <code>string database_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for databaseId to set.
     * @return This builder for chaining.
     */
    public Builder setDatabaseIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      databaseId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.biglake.v1.CreateDatabaseRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.biglake.v1.CreateDatabaseRequest)
  private static final com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest();
  }

  public static com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDatabaseRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateDatabaseRequest>() {
        @java.lang.Override
        public CreateDatabaseRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDatabaseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDatabaseRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.biglake.v1.CreateDatabaseRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
