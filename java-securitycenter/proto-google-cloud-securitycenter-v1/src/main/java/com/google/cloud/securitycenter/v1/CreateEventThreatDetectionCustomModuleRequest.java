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
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v1;

/**
 *
 *
 * <pre>
 * Request to create an Event Threat Detection custom module.
 * </pre>
 *
 * Protobuf type {@code
 * google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest}
 */
public final class CreateEventThreatDetectionCustomModuleRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest)
    CreateEventThreatDetectionCustomModuleRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateEventThreatDetectionCustomModuleRequest.newBuilder() to construct.
  private CreateEventThreatDetectionCustomModuleRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateEventThreatDetectionCustomModuleRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateEventThreatDetectionCustomModuleRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1_CreateEventThreatDetectionCustomModuleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1_CreateEventThreatDetectionCustomModuleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest.class,
            com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest.Builder
                .class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The new custom module's parent.
   *
   * Its format is:
   *
   *   * `organizations/{organization}/eventThreatDetectionSettings`.
   *   * `folders/{folder}/eventThreatDetectionSettings`.
   *   * `projects/{project}/eventThreatDetectionSettings`.
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
   * Required. The new custom module's parent.
   *
   * Its format is:
   *
   *   * `organizations/{organization}/eventThreatDetectionSettings`.
   *   * `folders/{folder}/eventThreatDetectionSettings`.
   *   * `projects/{project}/eventThreatDetectionSettings`.
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

  public static final int EVENT_THREAT_DETECTION_CUSTOM_MODULE_FIELD_NUMBER = 2;
  private com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule
      eventThreatDetectionCustomModule_;

  /**
   *
   *
   * <pre>
   * Required. The module to create. The
   * event_threat_detection_custom_module.name will be ignored and server
   * generated.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the eventThreatDetectionCustomModule field is set.
   */
  @java.lang.Override
  public boolean hasEventThreatDetectionCustomModule() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The module to create. The
   * event_threat_detection_custom_module.name will be ignored and server
   * generated.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The eventThreatDetectionCustomModule.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule
      getEventThreatDetectionCustomModule() {
    return eventThreatDetectionCustomModule_ == null
        ? com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule.getDefaultInstance()
        : eventThreatDetectionCustomModule_;
  }

  /**
   *
   *
   * <pre>
   * Required. The module to create. The
   * event_threat_detection_custom_module.name will be ignored and server
   * generated.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModuleOrBuilder
      getEventThreatDetectionCustomModuleOrBuilder() {
    return eventThreatDetectionCustomModule_ == null
        ? com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule.getDefaultInstance()
        : eventThreatDetectionCustomModule_;
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
      output.writeMessage(2, getEventThreatDetectionCustomModule());
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
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, getEventThreatDetectionCustomModule());
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
        com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest other =
        (com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasEventThreatDetectionCustomModule() != other.hasEventThreatDetectionCustomModule())
      return false;
    if (hasEventThreatDetectionCustomModule()) {
      if (!getEventThreatDetectionCustomModule()
          .equals(other.getEventThreatDetectionCustomModule())) return false;
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
    if (hasEventThreatDetectionCustomModule()) {
      hash = (37 * hash) + EVENT_THREAT_DETECTION_CUSTOM_MODULE_FIELD_NUMBER;
      hash = (53 * hash) + getEventThreatDetectionCustomModule().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
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
      com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest prototype) {
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
   * Request to create an Event Threat Detection custom module.
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest)
      com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_CreateEventThreatDetectionCustomModuleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_CreateEventThreatDetectionCustomModuleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
                  .class,
              com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
                  .Builder.class);
    }

    // Construct using
    // com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEventThreatDetectionCustomModuleFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      eventThreatDetectionCustomModule_ = null;
      if (eventThreatDetectionCustomModuleBuilder_ != null) {
        eventThreatDetectionCustomModuleBuilder_.dispose();
        eventThreatDetectionCustomModuleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_CreateEventThreatDetectionCustomModuleRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
        getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
        build() {
      com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
        buildPartial() {
      com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest result =
          new com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest(
              this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.eventThreatDetectionCustomModule_ =
            eventThreatDetectionCustomModuleBuilder_ == null
                ? eventThreatDetectionCustomModule_
                : eventThreatDetectionCustomModuleBuilder_.build();
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
          com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest) {
        return mergeFrom(
            (com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest other) {
      if (other
          == com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasEventThreatDetectionCustomModule()) {
        mergeEventThreatDetectionCustomModule(other.getEventThreatDetectionCustomModule());
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
                    getEventThreatDetectionCustomModuleFieldBuilder().getBuilder(),
                    extensionRegistry);
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
     * Required. The new custom module's parent.
     *
     * Its format is:
     *
     *   * `organizations/{organization}/eventThreatDetectionSettings`.
     *   * `folders/{folder}/eventThreatDetectionSettings`.
     *   * `projects/{project}/eventThreatDetectionSettings`.
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
     * Required. The new custom module's parent.
     *
     * Its format is:
     *
     *   * `organizations/{organization}/eventThreatDetectionSettings`.
     *   * `folders/{folder}/eventThreatDetectionSettings`.
     *   * `projects/{project}/eventThreatDetectionSettings`.
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
     * Required. The new custom module's parent.
     *
     * Its format is:
     *
     *   * `organizations/{organization}/eventThreatDetectionSettings`.
     *   * `folders/{folder}/eventThreatDetectionSettings`.
     *   * `projects/{project}/eventThreatDetectionSettings`.
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
     * Required. The new custom module's parent.
     *
     * Its format is:
     *
     *   * `organizations/{organization}/eventThreatDetectionSettings`.
     *   * `folders/{folder}/eventThreatDetectionSettings`.
     *   * `projects/{project}/eventThreatDetectionSettings`.
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
     * Required. The new custom module's parent.
     *
     * Its format is:
     *
     *   * `organizations/{organization}/eventThreatDetectionSettings`.
     *   * `folders/{folder}/eventThreatDetectionSettings`.
     *   * `projects/{project}/eventThreatDetectionSettings`.
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

    private com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule
        eventThreatDetectionCustomModule_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule,
            com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule.Builder,
            com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModuleOrBuilder>
        eventThreatDetectionCustomModuleBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The module to create. The
     * event_threat_detection_custom_module.name will be ignored and server
     * generated.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the eventThreatDetectionCustomModule field is set.
     */
    public boolean hasEventThreatDetectionCustomModule() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The module to create. The
     * event_threat_detection_custom_module.name will be ignored and server
     * generated.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The eventThreatDetectionCustomModule.
     */
    public com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule
        getEventThreatDetectionCustomModule() {
      if (eventThreatDetectionCustomModuleBuilder_ == null) {
        return eventThreatDetectionCustomModule_ == null
            ? com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule
                .getDefaultInstance()
            : eventThreatDetectionCustomModule_;
      } else {
        return eventThreatDetectionCustomModuleBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The module to create. The
     * event_threat_detection_custom_module.name will be ignored and server
     * generated.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEventThreatDetectionCustomModule(
        com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule value) {
      if (eventThreatDetectionCustomModuleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        eventThreatDetectionCustomModule_ = value;
      } else {
        eventThreatDetectionCustomModuleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The module to create. The
     * event_threat_detection_custom_module.name will be ignored and server
     * generated.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEventThreatDetectionCustomModule(
        com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule.Builder
            builderForValue) {
      if (eventThreatDetectionCustomModuleBuilder_ == null) {
        eventThreatDetectionCustomModule_ = builderForValue.build();
      } else {
        eventThreatDetectionCustomModuleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The module to create. The
     * event_threat_detection_custom_module.name will be ignored and server
     * generated.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeEventThreatDetectionCustomModule(
        com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule value) {
      if (eventThreatDetectionCustomModuleBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && eventThreatDetectionCustomModule_ != null
            && eventThreatDetectionCustomModule_
                != com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule
                    .getDefaultInstance()) {
          getEventThreatDetectionCustomModuleBuilder().mergeFrom(value);
        } else {
          eventThreatDetectionCustomModule_ = value;
        }
      } else {
        eventThreatDetectionCustomModuleBuilder_.mergeFrom(value);
      }
      if (eventThreatDetectionCustomModule_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The module to create. The
     * event_threat_detection_custom_module.name will be ignored and server
     * generated.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearEventThreatDetectionCustomModule() {
      bitField0_ = (bitField0_ & ~0x00000002);
      eventThreatDetectionCustomModule_ = null;
      if (eventThreatDetectionCustomModuleBuilder_ != null) {
        eventThreatDetectionCustomModuleBuilder_.dispose();
        eventThreatDetectionCustomModuleBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The module to create. The
     * event_threat_detection_custom_module.name will be ignored and server
     * generated.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule.Builder
        getEventThreatDetectionCustomModuleBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEventThreatDetectionCustomModuleFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The module to create. The
     * event_threat_detection_custom_module.name will be ignored and server
     * generated.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModuleOrBuilder
        getEventThreatDetectionCustomModuleOrBuilder() {
      if (eventThreatDetectionCustomModuleBuilder_ != null) {
        return eventThreatDetectionCustomModuleBuilder_.getMessageOrBuilder();
      } else {
        return eventThreatDetectionCustomModule_ == null
            ? com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule
                .getDefaultInstance()
            : eventThreatDetectionCustomModule_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The module to create. The
     * event_threat_detection_custom_module.name will be ignored and server
     * generated.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule,
            com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule.Builder,
            com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModuleOrBuilder>
        getEventThreatDetectionCustomModuleFieldBuilder() {
      if (eventThreatDetectionCustomModuleBuilder_ == null) {
        eventThreatDetectionCustomModuleBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule,
                com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule.Builder,
                com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModuleOrBuilder>(
                getEventThreatDetectionCustomModule(), getParentForChildren(), isClean());
        eventThreatDetectionCustomModule_ = null;
      }
      return eventThreatDetectionCustomModuleBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest)
  private static final com.google.cloud.securitycenter.v1
          .CreateEventThreatDetectionCustomModuleRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest();
  }

  public static com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEventThreatDetectionCustomModuleRequest>
      PARSER =
          new com.google.protobuf.AbstractParser<CreateEventThreatDetectionCustomModuleRequest>() {
            @java.lang.Override
            public CreateEventThreatDetectionCustomModuleRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<CreateEventThreatDetectionCustomModuleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEventThreatDetectionCustomModuleRequest>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
