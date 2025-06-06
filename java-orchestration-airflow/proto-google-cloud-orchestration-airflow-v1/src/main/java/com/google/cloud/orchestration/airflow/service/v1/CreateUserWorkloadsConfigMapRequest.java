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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.orchestration.airflow.service.v1;

/**
 *
 *
 * <pre>
 * Create user workloads ConfigMap request.
 * </pre>
 *
 * Protobuf type {@code
 * google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest}
 */
public final class CreateUserWorkloadsConfigMapRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest)
    CreateUserWorkloadsConfigMapRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateUserWorkloadsConfigMapRequest.newBuilder() to construct.
  private CreateUserWorkloadsConfigMapRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateUserWorkloadsConfigMapRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateUserWorkloadsConfigMapRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
        .internal_static_google_cloud_orchestration_airflow_service_v1_CreateUserWorkloadsConfigMapRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
        .internal_static_google_cloud_orchestration_airflow_service_v1_CreateUserWorkloadsConfigMapRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest
                .class,
            com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest
                .Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The environment name to create a ConfigMap for, in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
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
   * Required. The environment name to create a ConfigMap for, in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
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

  public static final int USER_WORKLOADS_CONFIG_MAP_FIELD_NUMBER = 2;
  private com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap
      userWorkloadsConfigMap_;

  /**
   *
   *
   * <pre>
   * Required. User workloads ConfigMap to create.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap user_workloads_config_map = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the userWorkloadsConfigMap field is set.
   */
  @java.lang.Override
  public boolean hasUserWorkloadsConfigMap() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. User workloads ConfigMap to create.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap user_workloads_config_map = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The userWorkloadsConfigMap.
   */
  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap
      getUserWorkloadsConfigMap() {
    return userWorkloadsConfigMap_ == null
        ? com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap
            .getDefaultInstance()
        : userWorkloadsConfigMap_;
  }

  /**
   *
   *
   * <pre>
   * Required. User workloads ConfigMap to create.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap user_workloads_config_map = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMapOrBuilder
      getUserWorkloadsConfigMapOrBuilder() {
    return userWorkloadsConfigMap_ == null
        ? com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap
            .getDefaultInstance()
        : userWorkloadsConfigMap_;
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
      output.writeMessage(2, getUserWorkloadsConfigMap());
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
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUserWorkloadsConfigMap());
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
    if (!(obj
        instanceof
        com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest other =
        (com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasUserWorkloadsConfigMap() != other.hasUserWorkloadsConfigMap()) return false;
    if (hasUserWorkloadsConfigMap()) {
      if (!getUserWorkloadsConfigMap().equals(other.getUserWorkloadsConfigMap())) return false;
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
    if (hasUserWorkloadsConfigMap()) {
      hash = (37 * hash) + USER_WORKLOADS_CONFIG_MAP_FIELD_NUMBER;
      hash = (53 * hash) + getUserWorkloadsConfigMap().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.orchestration.airflow.service.v1
          .CreateUserWorkloadsConfigMapRequest
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1
          .CreateUserWorkloadsConfigMapRequest
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1
          .CreateUserWorkloadsConfigMapRequest
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1
          .CreateUserWorkloadsConfigMapRequest
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1
          .CreateUserWorkloadsConfigMapRequest
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1
          .CreateUserWorkloadsConfigMapRequest
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1
          .CreateUserWorkloadsConfigMapRequest
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1
          .CreateUserWorkloadsConfigMapRequest
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1
          .CreateUserWorkloadsConfigMapRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1
          .CreateUserWorkloadsConfigMapRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1
          .CreateUserWorkloadsConfigMapRequest
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1
          .CreateUserWorkloadsConfigMapRequest
      parseFrom(
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
      com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest
          prototype) {
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
   * Create user workloads ConfigMap request.
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest)
      com.google.cloud.orchestration.airflow.service.v1
          .CreateUserWorkloadsConfigMapRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_CreateUserWorkloadsConfigMapRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_CreateUserWorkloadsConfigMapRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest
                  .class,
              com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest
                  .Builder.class);
    }

    // Construct using
    // com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getUserWorkloadsConfigMapFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      userWorkloadsConfigMap_ = null;
      if (userWorkloadsConfigMapBuilder_ != null) {
        userWorkloadsConfigMapBuilder_.dispose();
        userWorkloadsConfigMapBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_CreateUserWorkloadsConfigMapRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest
        getDefaultInstanceForType() {
      return com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest
        build() {
      com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest
        buildPartial() {
      com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest result =
          new com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest(
              this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest
            result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.userWorkloadsConfigMap_ =
            userWorkloadsConfigMapBuilder_ == null
                ? userWorkloadsConfigMap_
                : userWorkloadsConfigMapBuilder_.build();
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
      if (other
          instanceof
          com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest) {
        return mergeFrom(
            (com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest
            other) {
      if (other
          == com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasUserWorkloadsConfigMap()) {
        mergeUserWorkloadsConfigMap(other.getUserWorkloadsConfigMap());
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
                input.readMessage(
                    getUserWorkloadsConfigMapFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";

    /**
     *
     *
     * <pre>
     * Required. The environment name to create a ConfigMap for, in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
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
     * Required. The environment name to create a ConfigMap for, in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
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
     * Required. The environment name to create a ConfigMap for, in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
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
     * Required. The environment name to create a ConfigMap for, in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
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
     * Required. The environment name to create a ConfigMap for, in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
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

    private com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap
        userWorkloadsConfigMap_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap,
            com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap.Builder,
            com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMapOrBuilder>
        userWorkloadsConfigMapBuilder_;

    /**
     *
     *
     * <pre>
     * Required. User workloads ConfigMap to create.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap user_workloads_config_map = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the userWorkloadsConfigMap field is set.
     */
    public boolean hasUserWorkloadsConfigMap() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. User workloads ConfigMap to create.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap user_workloads_config_map = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The userWorkloadsConfigMap.
     */
    public com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap
        getUserWorkloadsConfigMap() {
      if (userWorkloadsConfigMapBuilder_ == null) {
        return userWorkloadsConfigMap_ == null
            ? com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap
                .getDefaultInstance()
            : userWorkloadsConfigMap_;
      } else {
        return userWorkloadsConfigMapBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. User workloads ConfigMap to create.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap user_workloads_config_map = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUserWorkloadsConfigMap(
        com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap value) {
      if (userWorkloadsConfigMapBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userWorkloadsConfigMap_ = value;
      } else {
        userWorkloadsConfigMapBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. User workloads ConfigMap to create.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap user_workloads_config_map = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUserWorkloadsConfigMap(
        com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap.Builder
            builderForValue) {
      if (userWorkloadsConfigMapBuilder_ == null) {
        userWorkloadsConfigMap_ = builderForValue.build();
      } else {
        userWorkloadsConfigMapBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. User workloads ConfigMap to create.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap user_workloads_config_map = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUserWorkloadsConfigMap(
        com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap value) {
      if (userWorkloadsConfigMapBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && userWorkloadsConfigMap_ != null
            && userWorkloadsConfigMap_
                != com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap
                    .getDefaultInstance()) {
          getUserWorkloadsConfigMapBuilder().mergeFrom(value);
        } else {
          userWorkloadsConfigMap_ = value;
        }
      } else {
        userWorkloadsConfigMapBuilder_.mergeFrom(value);
      }
      if (userWorkloadsConfigMap_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. User workloads ConfigMap to create.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap user_workloads_config_map = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUserWorkloadsConfigMap() {
      bitField0_ = (bitField0_ & ~0x00000002);
      userWorkloadsConfigMap_ = null;
      if (userWorkloadsConfigMapBuilder_ != null) {
        userWorkloadsConfigMapBuilder_.dispose();
        userWorkloadsConfigMapBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. User workloads ConfigMap to create.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap user_workloads_config_map = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap.Builder
        getUserWorkloadsConfigMapBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUserWorkloadsConfigMapFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. User workloads ConfigMap to create.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap user_workloads_config_map = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMapOrBuilder
        getUserWorkloadsConfigMapOrBuilder() {
      if (userWorkloadsConfigMapBuilder_ != null) {
        return userWorkloadsConfigMapBuilder_.getMessageOrBuilder();
      } else {
        return userWorkloadsConfigMap_ == null
            ? com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap
                .getDefaultInstance()
            : userWorkloadsConfigMap_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. User workloads ConfigMap to create.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap user_workloads_config_map = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap,
            com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap.Builder,
            com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMapOrBuilder>
        getUserWorkloadsConfigMapFieldBuilder() {
      if (userWorkloadsConfigMapBuilder_ == null) {
        userWorkloadsConfigMapBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap,
                com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap.Builder,
                com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMapOrBuilder>(
                getUserWorkloadsConfigMap(), getParentForChildren(), isClean());
        userWorkloadsConfigMap_ = null;
      }
      return userWorkloadsConfigMapBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest)
  private static final com.google.cloud.orchestration.airflow.service.v1
          .CreateUserWorkloadsConfigMapRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest();
  }

  public static com.google.cloud.orchestration.airflow.service.v1
          .CreateUserWorkloadsConfigMapRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateUserWorkloadsConfigMapRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateUserWorkloadsConfigMapRequest>() {
        @java.lang.Override
        public CreateUserWorkloadsConfigMapRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateUserWorkloadsConfigMapRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateUserWorkloadsConfigMapRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
