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
// source: google/cloud/securitycenter/v2/securitycenter_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v2;

/**
 *
 *
 * <pre>
 * Request message for updating a finding's mute status.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v2.SetMuteRequest}
 */
public final class SetMuteRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v2.SetMuteRequest)
    SetMuteRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SetMuteRequest.newBuilder() to construct.
  private SetMuteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SetMuteRequest() {
    name_ = "";
    mute_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SetMuteRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v2.SecuritycenterServiceProto
        .internal_static_google_cloud_securitycenter_v2_SetMuteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v2.SecuritycenterServiceProto
        .internal_static_google_cloud_securitycenter_v2_SetMuteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v2.SetMuteRequest.class,
            com.google.cloud.securitycenter.v2.SetMuteRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * Required. The [relative resource
   * name](https://cloud.google.com/apis/design/resource_names#relative_resource_name)
   * of the finding. If no location is specified, finding is assumed to be in
   * global. The following list shows some examples:
   *
   * +
   * `organizations/{organization_id}/sources/{source_id}/findings/{finding_id}`
   * +
   * `organizations/{organization_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
   * + `folders/{folder_id}/sources/{source_id}/findings/{finding_id}`
   * +
   * `folders/{folder_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
   * + `projects/{project_id}/sources/{source_id}/findings/{finding_id}`
   * +
   * `projects/{project_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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
   * Required. The [relative resource
   * name](https://cloud.google.com/apis/design/resource_names#relative_resource_name)
   * of the finding. If no location is specified, finding is assumed to be in
   * global. The following list shows some examples:
   *
   * +
   * `organizations/{organization_id}/sources/{source_id}/findings/{finding_id}`
   * +
   * `organizations/{organization_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
   * + `folders/{folder_id}/sources/{source_id}/findings/{finding_id}`
   * +
   * `folders/{folder_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
   * + `projects/{project_id}/sources/{source_id}/findings/{finding_id}`
   * +
   * `projects/{project_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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

  public static final int MUTE_FIELD_NUMBER = 2;
  private int mute_ = 0;

  /**
   *
   *
   * <pre>
   * Required. The desired state of the Mute.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v2.Finding.Mute mute = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for mute.
   */
  @java.lang.Override
  public int getMuteValue() {
    return mute_;
  }

  /**
   *
   *
   * <pre>
   * Required. The desired state of the Mute.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v2.Finding.Mute mute = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The mute.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v2.Finding.Mute getMute() {
    com.google.cloud.securitycenter.v2.Finding.Mute result =
        com.google.cloud.securitycenter.v2.Finding.Mute.forNumber(mute_);
    return result == null ? com.google.cloud.securitycenter.v2.Finding.Mute.UNRECOGNIZED : result;
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
    if (mute_ != com.google.cloud.securitycenter.v2.Finding.Mute.MUTE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, mute_);
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
    if (mute_ != com.google.cloud.securitycenter.v2.Finding.Mute.MUTE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, mute_);
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
    if (!(obj instanceof com.google.cloud.securitycenter.v2.SetMuteRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v2.SetMuteRequest other =
        (com.google.cloud.securitycenter.v2.SetMuteRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (mute_ != other.mute_) return false;
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
    hash = (37 * hash) + MUTE_FIELD_NUMBER;
    hash = (53 * hash) + mute_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v2.SetMuteRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v2.SetMuteRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.SetMuteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v2.SetMuteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.SetMuteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v2.SetMuteRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.SetMuteRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v2.SetMuteRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.SetMuteRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v2.SetMuteRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.SetMuteRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v2.SetMuteRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.securitycenter.v2.SetMuteRequest prototype) {
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
   * Request message for updating a finding's mute status.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v2.SetMuteRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v2.SetMuteRequest)
      com.google.cloud.securitycenter.v2.SetMuteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v2.SecuritycenterServiceProto
          .internal_static_google_cloud_securitycenter_v2_SetMuteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v2.SecuritycenterServiceProto
          .internal_static_google_cloud_securitycenter_v2_SetMuteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v2.SetMuteRequest.class,
              com.google.cloud.securitycenter.v2.SetMuteRequest.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v2.SetMuteRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      mute_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v2.SecuritycenterServiceProto
          .internal_static_google_cloud_securitycenter_v2_SetMuteRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v2.SetMuteRequest getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v2.SetMuteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v2.SetMuteRequest build() {
      com.google.cloud.securitycenter.v2.SetMuteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v2.SetMuteRequest buildPartial() {
      com.google.cloud.securitycenter.v2.SetMuteRequest result =
          new com.google.cloud.securitycenter.v2.SetMuteRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v2.SetMuteRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.mute_ = mute_;
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
      if (other instanceof com.google.cloud.securitycenter.v2.SetMuteRequest) {
        return mergeFrom((com.google.cloud.securitycenter.v2.SetMuteRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v2.SetMuteRequest other) {
      if (other == com.google.cloud.securitycenter.v2.SetMuteRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.mute_ != 0) {
        setMuteValue(other.getMuteValue());
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
            case 16:
              {
                mute_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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
     * Required. The [relative resource
     * name](https://cloud.google.com/apis/design/resource_names#relative_resource_name)
     * of the finding. If no location is specified, finding is assumed to be in
     * global. The following list shows some examples:
     *
     * +
     * `organizations/{organization_id}/sources/{source_id}/findings/{finding_id}`
     * +
     * `organizations/{organization_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
     * + `folders/{folder_id}/sources/{source_id}/findings/{finding_id}`
     * +
     * `folders/{folder_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
     * + `projects/{project_id}/sources/{source_id}/findings/{finding_id}`
     * +
     * `projects/{project_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The [relative resource
     * name](https://cloud.google.com/apis/design/resource_names#relative_resource_name)
     * of the finding. If no location is specified, finding is assumed to be in
     * global. The following list shows some examples:
     *
     * +
     * `organizations/{organization_id}/sources/{source_id}/findings/{finding_id}`
     * +
     * `organizations/{organization_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
     * + `folders/{folder_id}/sources/{source_id}/findings/{finding_id}`
     * +
     * `folders/{folder_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
     * + `projects/{project_id}/sources/{source_id}/findings/{finding_id}`
     * +
     * `projects/{project_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The [relative resource
     * name](https://cloud.google.com/apis/design/resource_names#relative_resource_name)
     * of the finding. If no location is specified, finding is assumed to be in
     * global. The following list shows some examples:
     *
     * +
     * `organizations/{organization_id}/sources/{source_id}/findings/{finding_id}`
     * +
     * `organizations/{organization_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
     * + `folders/{folder_id}/sources/{source_id}/findings/{finding_id}`
     * +
     * `folders/{folder_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
     * + `projects/{project_id}/sources/{source_id}/findings/{finding_id}`
     * +
     * `projects/{project_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The [relative resource
     * name](https://cloud.google.com/apis/design/resource_names#relative_resource_name)
     * of the finding. If no location is specified, finding is assumed to be in
     * global. The following list shows some examples:
     *
     * +
     * `organizations/{organization_id}/sources/{source_id}/findings/{finding_id}`
     * +
     * `organizations/{organization_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
     * + `folders/{folder_id}/sources/{source_id}/findings/{finding_id}`
     * +
     * `folders/{folder_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
     * + `projects/{project_id}/sources/{source_id}/findings/{finding_id}`
     * +
     * `projects/{project_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The [relative resource
     * name](https://cloud.google.com/apis/design/resource_names#relative_resource_name)
     * of the finding. If no location is specified, finding is assumed to be in
     * global. The following list shows some examples:
     *
     * +
     * `organizations/{organization_id}/sources/{source_id}/findings/{finding_id}`
     * +
     * `organizations/{organization_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
     * + `folders/{folder_id}/sources/{source_id}/findings/{finding_id}`
     * +
     * `folders/{folder_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
     * + `projects/{project_id}/sources/{source_id}/findings/{finding_id}`
     * +
     * `projects/{project_id}/sources/{source_id}/locations/{location_id}/findings/{finding_id}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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

    private int mute_ = 0;

    /**
     *
     *
     * <pre>
     * Required. The desired state of the Mute.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v2.Finding.Mute mute = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for mute.
     */
    @java.lang.Override
    public int getMuteValue() {
      return mute_;
    }

    /**
     *
     *
     * <pre>
     * Required. The desired state of the Mute.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v2.Finding.Mute mute = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for mute to set.
     * @return This builder for chaining.
     */
    public Builder setMuteValue(int value) {
      mute_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The desired state of the Mute.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v2.Finding.Mute mute = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The mute.
     */
    @java.lang.Override
    public com.google.cloud.securitycenter.v2.Finding.Mute getMute() {
      com.google.cloud.securitycenter.v2.Finding.Mute result =
          com.google.cloud.securitycenter.v2.Finding.Mute.forNumber(mute_);
      return result == null ? com.google.cloud.securitycenter.v2.Finding.Mute.UNRECOGNIZED : result;
    }

    /**
     *
     *
     * <pre>
     * Required. The desired state of the Mute.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v2.Finding.Mute mute = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The mute to set.
     * @return This builder for chaining.
     */
    public Builder setMute(com.google.cloud.securitycenter.v2.Finding.Mute value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      mute_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The desired state of the Mute.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v2.Finding.Mute mute = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMute() {
      bitField0_ = (bitField0_ & ~0x00000002);
      mute_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v2.SetMuteRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v2.SetMuteRequest)
  private static final com.google.cloud.securitycenter.v2.SetMuteRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v2.SetMuteRequest();
  }

  public static com.google.cloud.securitycenter.v2.SetMuteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetMuteRequest> PARSER =
      new com.google.protobuf.AbstractParser<SetMuteRequest>() {
        @java.lang.Override
        public SetMuteRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetMuteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetMuteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v2.SetMuteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
