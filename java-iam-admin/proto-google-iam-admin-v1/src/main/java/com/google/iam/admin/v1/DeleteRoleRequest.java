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
// source: google/iam/admin/v1/iam.proto

// Protobuf Java Version: 3.25.8
package com.google.iam.admin.v1;

/**
 *
 *
 * <pre>
 * The request to delete an existing role.
 * </pre>
 *
 * Protobuf type {@code google.iam.admin.v1.DeleteRoleRequest}
 */
public final class DeleteRoleRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.iam.admin.v1.DeleteRoleRequest)
    DeleteRoleRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use DeleteRoleRequest.newBuilder() to construct.
  private DeleteRoleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DeleteRoleRequest() {
    name_ = "";
    etag_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DeleteRoleRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.iam.admin.v1.Iam
        .internal_static_google_iam_admin_v1_DeleteRoleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.admin.v1.Iam
        .internal_static_google_iam_admin_v1_DeleteRoleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.admin.v1.DeleteRoleRequest.class,
            com.google.iam.admin.v1.DeleteRoleRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * The `name` parameter's value depends on the target resource for the
   * request, namely
   * [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles)
   * or
   * [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles).
   * Each resource type's `name` value format is described below:
   *
   * * [`projects.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/delete):
   *   `projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`. This method deletes only
   *   [custom
   *   roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that
   *   have been created at the project level. Example request URL:
   *   `https://iam.googleapis.com/v1/projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`
   *
   * * [`organizations.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/delete):
   *   `organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`. This method
   *   deletes only [custom
   *   roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that
   *   have been created at the organization level. Example request URL:
   *   `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`
   *
   * Note: Wildcard (*) values are invalid; you must specify a complete project
   * ID or organization ID.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The `name` parameter's value depends on the target resource for the
   * request, namely
   * [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles)
   * or
   * [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles).
   * Each resource type's `name` value format is described below:
   *
   * * [`projects.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/delete):
   *   `projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`. This method deletes only
   *   [custom
   *   roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that
   *   have been created at the project level. Example request URL:
   *   `https://iam.googleapis.com/v1/projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`
   *
   * * [`organizations.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/delete):
   *   `organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`. This method
   *   deletes only [custom
   *   roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that
   *   have been created at the organization level. Example request URL:
   *   `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`
   *
   * Note: Wildcard (*) values are invalid; you must specify a complete project
   * ID or organization ID.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ETAG_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString etag_ = com.google.protobuf.ByteString.EMPTY;

  /**
   *
   *
   * <pre>
   * Used to perform a consistent read-modify-write.
   * </pre>
   *
   * <code>bytes etag = 2;</code>
   *
   * @return The etag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEtag() {
    return etag_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!etag_.isEmpty()) {
      output.writeBytes(2, etag_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!etag_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, etag_);
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
    if (!(obj instanceof com.google.iam.admin.v1.DeleteRoleRequest)) {
      return super.equals(obj);
    }
    com.google.iam.admin.v1.DeleteRoleRequest other =
        (com.google.iam.admin.v1.DeleteRoleRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getEtag().equals(other.getEtag())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ETAG_FIELD_NUMBER;
    hash = (53 * hash) + getEtag().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.admin.v1.DeleteRoleRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.DeleteRoleRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.DeleteRoleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.DeleteRoleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.DeleteRoleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.DeleteRoleRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.DeleteRoleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.DeleteRoleRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.DeleteRoleRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.DeleteRoleRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.DeleteRoleRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.DeleteRoleRequest parseFrom(
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

  public static Builder newBuilder(com.google.iam.admin.v1.DeleteRoleRequest prototype) {
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
   * The request to delete an existing role.
   * </pre>
   *
   * Protobuf type {@code google.iam.admin.v1.DeleteRoleRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.iam.admin.v1.DeleteRoleRequest)
      com.google.iam.admin.v1.DeleteRoleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_DeleteRoleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_DeleteRoleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.admin.v1.DeleteRoleRequest.class,
              com.google.iam.admin.v1.DeleteRoleRequest.Builder.class);
    }

    // Construct using com.google.iam.admin.v1.DeleteRoleRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      etag_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_DeleteRoleRequest_descriptor;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.DeleteRoleRequest getDefaultInstanceForType() {
      return com.google.iam.admin.v1.DeleteRoleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.admin.v1.DeleteRoleRequest build() {
      com.google.iam.admin.v1.DeleteRoleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.DeleteRoleRequest buildPartial() {
      com.google.iam.admin.v1.DeleteRoleRequest result =
          new com.google.iam.admin.v1.DeleteRoleRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.iam.admin.v1.DeleteRoleRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.etag_ = etag_;
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
      if (other instanceof com.google.iam.admin.v1.DeleteRoleRequest) {
        return mergeFrom((com.google.iam.admin.v1.DeleteRoleRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.admin.v1.DeleteRoleRequest other) {
      if (other == com.google.iam.admin.v1.DeleteRoleRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getEtag() != com.google.protobuf.ByteString.EMPTY) {
        setEtag(other.getEtag());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                etag_ = input.readBytes();
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

    private java.lang.Object name_ = "";

    /**
     *
     *
     * <pre>
     * The `name` parameter's value depends on the target resource for the
     * request, namely
     * [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles)
     * or
     * [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles).
     * Each resource type's `name` value format is described below:
     *
     * * [`projects.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/delete):
     *   `projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`. This method deletes only
     *   [custom
     *   roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that
     *   have been created at the project level. Example request URL:
     *   `https://iam.googleapis.com/v1/projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`
     *
     * * [`organizations.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/delete):
     *   `organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`. This method
     *   deletes only [custom
     *   roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that
     *   have been created at the organization level. Example request URL:
     *   `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`
     *
     * Note: Wildcard (*) values are invalid; you must specify a complete project
     * ID or organization ID.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The `name` parameter's value depends on the target resource for the
     * request, namely
     * [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles)
     * or
     * [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles).
     * Each resource type's `name` value format is described below:
     *
     * * [`projects.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/delete):
     *   `projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`. This method deletes only
     *   [custom
     *   roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that
     *   have been created at the project level. Example request URL:
     *   `https://iam.googleapis.com/v1/projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`
     *
     * * [`organizations.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/delete):
     *   `organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`. This method
     *   deletes only [custom
     *   roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that
     *   have been created at the organization level. Example request URL:
     *   `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`
     *
     * Note: Wildcard (*) values are invalid; you must specify a complete project
     * ID or organization ID.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The `name` parameter's value depends on the target resource for the
     * request, namely
     * [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles)
     * or
     * [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles).
     * Each resource type's `name` value format is described below:
     *
     * * [`projects.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/delete):
     *   `projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`. This method deletes only
     *   [custom
     *   roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that
     *   have been created at the project level. Example request URL:
     *   `https://iam.googleapis.com/v1/projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`
     *
     * * [`organizations.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/delete):
     *   `organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`. This method
     *   deletes only [custom
     *   roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that
     *   have been created at the organization level. Example request URL:
     *   `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`
     *
     * Note: Wildcard (*) values are invalid; you must specify a complete project
     * ID or organization ID.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The `name` parameter's value depends on the target resource for the
     * request, namely
     * [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles)
     * or
     * [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles).
     * Each resource type's `name` value format is described below:
     *
     * * [`projects.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/delete):
     *   `projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`. This method deletes only
     *   [custom
     *   roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that
     *   have been created at the project level. Example request URL:
     *   `https://iam.googleapis.com/v1/projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`
     *
     * * [`organizations.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/delete):
     *   `organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`. This method
     *   deletes only [custom
     *   roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that
     *   have been created at the organization level. Example request URL:
     *   `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`
     *
     * Note: Wildcard (*) values are invalid; you must specify a complete project
     * ID or organization ID.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The `name` parameter's value depends on the target resource for the
     * request, namely
     * [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles)
     * or
     * [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles).
     * Each resource type's `name` value format is described below:
     *
     * * [`projects.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/delete):
     *   `projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`. This method deletes only
     *   [custom
     *   roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that
     *   have been created at the project level. Example request URL:
     *   `https://iam.googleapis.com/v1/projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`
     *
     * * [`organizations.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/delete):
     *   `organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`. This method
     *   deletes only [custom
     *   roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that
     *   have been created at the organization level. Example request URL:
     *   `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`
     *
     * Note: Wildcard (*) values are invalid; you must specify a complete project
     * ID or organization ID.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString etag_ = com.google.protobuf.ByteString.EMPTY;

    /**
     *
     *
     * <pre>
     * Used to perform a consistent read-modify-write.
     * </pre>
     *
     * <code>bytes etag = 2;</code>
     *
     * @return The etag.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEtag() {
      return etag_;
    }

    /**
     *
     *
     * <pre>
     * Used to perform a consistent read-modify-write.
     * </pre>
     *
     * <code>bytes etag = 2;</code>
     *
     * @param value The etag to set.
     * @return This builder for chaining.
     */
    public Builder setEtag(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      etag_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Used to perform a consistent read-modify-write.
     * </pre>
     *
     * <code>bytes etag = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEtag() {
      bitField0_ = (bitField0_ & ~0x00000002);
      etag_ = getDefaultInstance().getEtag();
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

    // @@protoc_insertion_point(builder_scope:google.iam.admin.v1.DeleteRoleRequest)
  }

  // @@protoc_insertion_point(class_scope:google.iam.admin.v1.DeleteRoleRequest)
  private static final com.google.iam.admin.v1.DeleteRoleRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.iam.admin.v1.DeleteRoleRequest();
  }

  public static com.google.iam.admin.v1.DeleteRoleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteRoleRequest> PARSER =
      new com.google.protobuf.AbstractParser<DeleteRoleRequest>() {
        @java.lang.Override
        public DeleteRoleRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteRoleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteRoleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.admin.v1.DeleteRoleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
