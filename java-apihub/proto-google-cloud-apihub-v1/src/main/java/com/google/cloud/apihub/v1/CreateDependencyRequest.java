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
// source: google/cloud/apihub/v1/apihub_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.apihub.v1;

/**
 *
 *
 * <pre>
 * The
 * [CreateDependency][google.cloud.apihub.v1.ApiHubDependencies.CreateDependency]
 * method's request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.apihub.v1.CreateDependencyRequest}
 */
public final class CreateDependencyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.apihub.v1.CreateDependencyRequest)
    CreateDependencyRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateDependencyRequest.newBuilder() to construct.
  private CreateDependencyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateDependencyRequest() {
    parent_ = "";
    dependencyId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateDependencyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.apihub.v1.ApiHubServiceProto
        .internal_static_google_cloud_apihub_v1_CreateDependencyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apihub.v1.ApiHubServiceProto
        .internal_static_google_cloud_apihub_v1_CreateDependencyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apihub.v1.CreateDependencyRequest.class,
            com.google.cloud.apihub.v1.CreateDependencyRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The parent resource for the dependency resource.
   * Format: `projects/{project}/locations/{location}`
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
   * Required. The parent resource for the dependency resource.
   * Format: `projects/{project}/locations/{location}`
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

  public static final int DEPENDENCY_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object dependencyId_ = "";

  /**
   *
   *
   * <pre>
   * Optional. The ID to use for the dependency resource, which will become the
   * final component of the dependency's resource name. This field is optional.
   * * If provided, the same will be used. The service will throw an error if
   * duplicate id is provided by the client.
   * * If not provided, a system generated id will be used.
   *
   * This value should be 4-500 characters, and valid characters
   * are `[a-z][A-Z][0-9]-_`.
   * </pre>
   *
   * <code>string dependency_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The dependencyId.
   */
  @java.lang.Override
  public java.lang.String getDependencyId() {
    java.lang.Object ref = dependencyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dependencyId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. The ID to use for the dependency resource, which will become the
   * final component of the dependency's resource name. This field is optional.
   * * If provided, the same will be used. The service will throw an error if
   * duplicate id is provided by the client.
   * * If not provided, a system generated id will be used.
   *
   * This value should be 4-500 characters, and valid characters
   * are `[a-z][A-Z][0-9]-_`.
   * </pre>
   *
   * <code>string dependency_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for dependencyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDependencyIdBytes() {
    java.lang.Object ref = dependencyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      dependencyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPENDENCY_FIELD_NUMBER = 3;
  private com.google.cloud.apihub.v1.Dependency dependency_;

  /**
   *
   *
   * <pre>
   * Required. The dependency resource to create.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.Dependency dependency = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dependency field is set.
   */
  @java.lang.Override
  public boolean hasDependency() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The dependency resource to create.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.Dependency dependency = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dependency.
   */
  @java.lang.Override
  public com.google.cloud.apihub.v1.Dependency getDependency() {
    return dependency_ == null
        ? com.google.cloud.apihub.v1.Dependency.getDefaultInstance()
        : dependency_;
  }

  /**
   *
   *
   * <pre>
   * Required. The dependency resource to create.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.Dependency dependency = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.apihub.v1.DependencyOrBuilder getDependencyOrBuilder() {
    return dependency_ == null
        ? com.google.cloud.apihub.v1.Dependency.getDefaultInstance()
        : dependency_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dependencyId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dependencyId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getDependency());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dependencyId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dependencyId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getDependency());
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
    if (!(obj instanceof com.google.cloud.apihub.v1.CreateDependencyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.apihub.v1.CreateDependencyRequest other =
        (com.google.cloud.apihub.v1.CreateDependencyRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getDependencyId().equals(other.getDependencyId())) return false;
    if (hasDependency() != other.hasDependency()) return false;
    if (hasDependency()) {
      if (!getDependency().equals(other.getDependency())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + DEPENDENCY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDependencyId().hashCode();
    if (hasDependency()) {
      hash = (37 * hash) + DEPENDENCY_FIELD_NUMBER;
      hash = (53 * hash) + getDependency().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apihub.v1.CreateDependencyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apihub.v1.CreateDependencyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.CreateDependencyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apihub.v1.CreateDependencyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.CreateDependencyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apihub.v1.CreateDependencyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.CreateDependencyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apihub.v1.CreateDependencyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.CreateDependencyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.apihub.v1.CreateDependencyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.CreateDependencyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apihub.v1.CreateDependencyRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.apihub.v1.CreateDependencyRequest prototype) {
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
   * The
   * [CreateDependency][google.cloud.apihub.v1.ApiHubDependencies.CreateDependency]
   * method's request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.apihub.v1.CreateDependencyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apihub.v1.CreateDependencyRequest)
      com.google.cloud.apihub.v1.CreateDependencyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.apihub.v1.ApiHubServiceProto
          .internal_static_google_cloud_apihub_v1_CreateDependencyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apihub.v1.ApiHubServiceProto
          .internal_static_google_cloud_apihub_v1_CreateDependencyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apihub.v1.CreateDependencyRequest.class,
              com.google.cloud.apihub.v1.CreateDependencyRequest.Builder.class);
    }

    // Construct using com.google.cloud.apihub.v1.CreateDependencyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDependencyFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      dependencyId_ = "";
      dependency_ = null;
      if (dependencyBuilder_ != null) {
        dependencyBuilder_.dispose();
        dependencyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.apihub.v1.ApiHubServiceProto
          .internal_static_google_cloud_apihub_v1_CreateDependencyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apihub.v1.CreateDependencyRequest getDefaultInstanceForType() {
      return com.google.cloud.apihub.v1.CreateDependencyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apihub.v1.CreateDependencyRequest build() {
      com.google.cloud.apihub.v1.CreateDependencyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apihub.v1.CreateDependencyRequest buildPartial() {
      com.google.cloud.apihub.v1.CreateDependencyRequest result =
          new com.google.cloud.apihub.v1.CreateDependencyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.apihub.v1.CreateDependencyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dependencyId_ = dependencyId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.dependency_ = dependencyBuilder_ == null ? dependency_ : dependencyBuilder_.build();
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
      if (other instanceof com.google.cloud.apihub.v1.CreateDependencyRequest) {
        return mergeFrom((com.google.cloud.apihub.v1.CreateDependencyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apihub.v1.CreateDependencyRequest other) {
      if (other == com.google.cloud.apihub.v1.CreateDependencyRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDependencyId().isEmpty()) {
        dependencyId_ = other.dependencyId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasDependency()) {
        mergeDependency(other.getDependency());
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
                dependencyId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getDependencyFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. The parent resource for the dependency resource.
     * Format: `projects/{project}/locations/{location}`
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
     * Required. The parent resource for the dependency resource.
     * Format: `projects/{project}/locations/{location}`
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
     * Required. The parent resource for the dependency resource.
     * Format: `projects/{project}/locations/{location}`
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
     * Required. The parent resource for the dependency resource.
     * Format: `projects/{project}/locations/{location}`
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
     * Required. The parent resource for the dependency resource.
     * Format: `projects/{project}/locations/{location}`
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

    private java.lang.Object dependencyId_ = "";

    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the dependency resource, which will become the
     * final component of the dependency's resource name. This field is optional.
     * * If provided, the same will be used. The service will throw an error if
     * duplicate id is provided by the client.
     * * If not provided, a system generated id will be used.
     *
     * This value should be 4-500 characters, and valid characters
     * are `[a-z][A-Z][0-9]-_`.
     * </pre>
     *
     * <code>string dependency_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The dependencyId.
     */
    public java.lang.String getDependencyId() {
      java.lang.Object ref = dependencyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dependencyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the dependency resource, which will become the
     * final component of the dependency's resource name. This field is optional.
     * * If provided, the same will be used. The service will throw an error if
     * duplicate id is provided by the client.
     * * If not provided, a system generated id will be used.
     *
     * This value should be 4-500 characters, and valid characters
     * are `[a-z][A-Z][0-9]-_`.
     * </pre>
     *
     * <code>string dependency_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for dependencyId.
     */
    public com.google.protobuf.ByteString getDependencyIdBytes() {
      java.lang.Object ref = dependencyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        dependencyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the dependency resource, which will become the
     * final component of the dependency's resource name. This field is optional.
     * * If provided, the same will be used. The service will throw an error if
     * duplicate id is provided by the client.
     * * If not provided, a system generated id will be used.
     *
     * This value should be 4-500 characters, and valid characters
     * are `[a-z][A-Z][0-9]-_`.
     * </pre>
     *
     * <code>string dependency_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The dependencyId to set.
     * @return This builder for chaining.
     */
    public Builder setDependencyId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      dependencyId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the dependency resource, which will become the
     * final component of the dependency's resource name. This field is optional.
     * * If provided, the same will be used. The service will throw an error if
     * duplicate id is provided by the client.
     * * If not provided, a system generated id will be used.
     *
     * This value should be 4-500 characters, and valid characters
     * are `[a-z][A-Z][0-9]-_`.
     * </pre>
     *
     * <code>string dependency_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDependencyId() {
      dependencyId_ = getDefaultInstance().getDependencyId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the dependency resource, which will become the
     * final component of the dependency's resource name. This field is optional.
     * * If provided, the same will be used. The service will throw an error if
     * duplicate id is provided by the client.
     * * If not provided, a system generated id will be used.
     *
     * This value should be 4-500 characters, and valid characters
     * are `[a-z][A-Z][0-9]-_`.
     * </pre>
     *
     * <code>string dependency_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for dependencyId to set.
     * @return This builder for chaining.
     */
    public Builder setDependencyIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      dependencyId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.apihub.v1.Dependency dependency_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apihub.v1.Dependency,
            com.google.cloud.apihub.v1.Dependency.Builder,
            com.google.cloud.apihub.v1.DependencyOrBuilder>
        dependencyBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The dependency resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.Dependency dependency = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the dependency field is set.
     */
    public boolean hasDependency() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The dependency resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.Dependency dependency = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The dependency.
     */
    public com.google.cloud.apihub.v1.Dependency getDependency() {
      if (dependencyBuilder_ == null) {
        return dependency_ == null
            ? com.google.cloud.apihub.v1.Dependency.getDefaultInstance()
            : dependency_;
      } else {
        return dependencyBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The dependency resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.Dependency dependency = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDependency(com.google.cloud.apihub.v1.Dependency value) {
      if (dependencyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dependency_ = value;
      } else {
        dependencyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The dependency resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.Dependency dependency = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDependency(com.google.cloud.apihub.v1.Dependency.Builder builderForValue) {
      if (dependencyBuilder_ == null) {
        dependency_ = builderForValue.build();
      } else {
        dependencyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The dependency resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.Dependency dependency = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDependency(com.google.cloud.apihub.v1.Dependency value) {
      if (dependencyBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && dependency_ != null
            && dependency_ != com.google.cloud.apihub.v1.Dependency.getDefaultInstance()) {
          getDependencyBuilder().mergeFrom(value);
        } else {
          dependency_ = value;
        }
      } else {
        dependencyBuilder_.mergeFrom(value);
      }
      if (dependency_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The dependency resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.Dependency dependency = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDependency() {
      bitField0_ = (bitField0_ & ~0x00000004);
      dependency_ = null;
      if (dependencyBuilder_ != null) {
        dependencyBuilder_.dispose();
        dependencyBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The dependency resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.Dependency dependency = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.apihub.v1.Dependency.Builder getDependencyBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getDependencyFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The dependency resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.Dependency dependency = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.apihub.v1.DependencyOrBuilder getDependencyOrBuilder() {
      if (dependencyBuilder_ != null) {
        return dependencyBuilder_.getMessageOrBuilder();
      } else {
        return dependency_ == null
            ? com.google.cloud.apihub.v1.Dependency.getDefaultInstance()
            : dependency_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The dependency resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.Dependency dependency = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apihub.v1.Dependency,
            com.google.cloud.apihub.v1.Dependency.Builder,
            com.google.cloud.apihub.v1.DependencyOrBuilder>
        getDependencyFieldBuilder() {
      if (dependencyBuilder_ == null) {
        dependencyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.apihub.v1.Dependency,
                com.google.cloud.apihub.v1.Dependency.Builder,
                com.google.cloud.apihub.v1.DependencyOrBuilder>(
                getDependency(), getParentForChildren(), isClean());
        dependency_ = null;
      }
      return dependencyBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.apihub.v1.CreateDependencyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apihub.v1.CreateDependencyRequest)
  private static final com.google.cloud.apihub.v1.CreateDependencyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.apihub.v1.CreateDependencyRequest();
  }

  public static com.google.cloud.apihub.v1.CreateDependencyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDependencyRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateDependencyRequest>() {
        @java.lang.Override
        public CreateDependencyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDependencyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDependencyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apihub.v1.CreateDependencyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
