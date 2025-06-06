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
 * Describes the auto-registration of the forwarding rule to Service Directory. The region and project of the Service Directory resource generated from this registration will be the same as this forwarding rule.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration}
 */
public final class ForwardingRuleServiceDirectoryRegistration
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration)
    ForwardingRuleServiceDirectoryRegistrationOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ForwardingRuleServiceDirectoryRegistration.newBuilder() to construct.
  private ForwardingRuleServiceDirectoryRegistration(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ForwardingRuleServiceDirectoryRegistration() {
    namespace_ = "";
    service_ = "";
    serviceDirectoryRegion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ForwardingRuleServiceDirectoryRegistration();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ForwardingRuleServiceDirectoryRegistration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ForwardingRuleServiceDirectoryRegistration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration.class,
            com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration.Builder.class);
  }

  private int bitField0_;
  public static final int NAMESPACE_FIELD_NUMBER = 178476379;

  @SuppressWarnings("serial")
  private volatile java.lang.Object namespace_ = "";

  /**
   *
   *
   * <pre>
   * Service Directory namespace to register the forwarding rule under.
   * </pre>
   *
   * <code>optional string namespace = 178476379;</code>
   *
   * @return Whether the namespace field is set.
   */
  @java.lang.Override
  public boolean hasNamespace() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Service Directory namespace to register the forwarding rule under.
   * </pre>
   *
   * <code>optional string namespace = 178476379;</code>
   *
   * @return The namespace.
   */
  @java.lang.Override
  public java.lang.String getNamespace() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namespace_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Service Directory namespace to register the forwarding rule under.
   * </pre>
   *
   * <code>optional string namespace = 178476379;</code>
   *
   * @return The bytes for namespace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNamespaceBytes() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      namespace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_FIELD_NUMBER = 373540533;

  @SuppressWarnings("serial")
  private volatile java.lang.Object service_ = "";

  /**
   *
   *
   * <pre>
   * Service Directory service to register the forwarding rule under.
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   *
   * @return Whether the service field is set.
   */
  @java.lang.Override
  public boolean hasService() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Service Directory service to register the forwarding rule under.
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   *
   * @return The service.
   */
  @java.lang.Override
  public java.lang.String getService() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      service_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Service Directory service to register the forwarding rule under.
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   *
   * @return The bytes for service.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceBytes() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      service_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_DIRECTORY_REGION_FIELD_NUMBER = 74030416;

  @SuppressWarnings("serial")
  private volatile java.lang.Object serviceDirectoryRegion_ = "";

  /**
   *
   *
   * <pre>
   * [Optional] Service Directory region to register this global forwarding rule under. Default to "us-central1". Only used for PSC for Google APIs. All PSC for Google APIs forwarding rules on the same network should use the same Service Directory region.
   * </pre>
   *
   * <code>optional string service_directory_region = 74030416;</code>
   *
   * @return Whether the serviceDirectoryRegion field is set.
   */
  @java.lang.Override
  public boolean hasServiceDirectoryRegion() {
    return ((bitField0_ & 0x00000004) != 0);
  }

  /**
   *
   *
   * <pre>
   * [Optional] Service Directory region to register this global forwarding rule under. Default to "us-central1". Only used for PSC for Google APIs. All PSC for Google APIs forwarding rules on the same network should use the same Service Directory region.
   * </pre>
   *
   * <code>optional string service_directory_region = 74030416;</code>
   *
   * @return The serviceDirectoryRegion.
   */
  @java.lang.Override
  public java.lang.String getServiceDirectoryRegion() {
    java.lang.Object ref = serviceDirectoryRegion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceDirectoryRegion_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * [Optional] Service Directory region to register this global forwarding rule under. Default to "us-central1". Only used for PSC for Google APIs. All PSC for Google APIs forwarding rules on the same network should use the same Service Directory region.
   * </pre>
   *
   * <code>optional string service_directory_region = 74030416;</code>
   *
   * @return The bytes for serviceDirectoryRegion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceDirectoryRegionBytes() {
    java.lang.Object ref = serviceDirectoryRegion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      serviceDirectoryRegion_ = b;
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
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 74030416, serviceDirectoryRegion_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 178476379, namespace_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 373540533, service_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000004) != 0)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(
              74030416, serviceDirectoryRegion_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(178476379, namespace_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(373540533, service_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration other =
        (com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration) obj;

    if (hasNamespace() != other.hasNamespace()) return false;
    if (hasNamespace()) {
      if (!getNamespace().equals(other.getNamespace())) return false;
    }
    if (hasService() != other.hasService()) return false;
    if (hasService()) {
      if (!getService().equals(other.getService())) return false;
    }
    if (hasServiceDirectoryRegion() != other.hasServiceDirectoryRegion()) return false;
    if (hasServiceDirectoryRegion()) {
      if (!getServiceDirectoryRegion().equals(other.getServiceDirectoryRegion())) return false;
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
    if (hasNamespace()) {
      hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
      hash = (53 * hash) + getNamespace().hashCode();
    }
    if (hasService()) {
      hash = (37 * hash) + SERVICE_FIELD_NUMBER;
      hash = (53 * hash) + getService().hashCode();
    }
    if (hasServiceDirectoryRegion()) {
      hash = (37 * hash) + SERVICE_DIRECTORY_REGION_FIELD_NUMBER;
      hash = (53 * hash) + getServiceDirectoryRegion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration parseFrom(
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
      com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration prototype) {
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
   * Describes the auto-registration of the forwarding rule to Service Directory. The region and project of the Service Directory resource generated from this registration will be the same as this forwarding rule.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration)
      com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistrationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ForwardingRuleServiceDirectoryRegistration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ForwardingRuleServiceDirectoryRegistration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration.class,
              com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration.Builder.class);
    }

    // Construct using
    // com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      namespace_ = "";
      service_ = "";
      serviceDirectoryRegion_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ForwardingRuleServiceDirectoryRegistration_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration build() {
      com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration buildPartial() {
      com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration result =
          new com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.namespace_ = namespace_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.service_ = service_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.serviceDirectoryRegion_ = serviceDirectoryRegion_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration) {
        return mergeFrom(
            (com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration other) {
      if (other
          == com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration
              .getDefaultInstance()) return this;
      if (other.hasNamespace()) {
        namespace_ = other.namespace_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasService()) {
        service_ = other.service_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasServiceDirectoryRegion()) {
        serviceDirectoryRegion_ = other.serviceDirectoryRegion_;
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
            case 592243330:
              {
                serviceDirectoryRegion_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 592243330
            case 1427811034:
              {
                namespace_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 1427811034
            case -1306643030:
              {
                service_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case -1306643030
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

    private java.lang.Object namespace_ = "";

    /**
     *
     *
     * <pre>
     * Service Directory namespace to register the forwarding rule under.
     * </pre>
     *
     * <code>optional string namespace = 178476379;</code>
     *
     * @return Whether the namespace field is set.
     */
    public boolean hasNamespace() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Service Directory namespace to register the forwarding rule under.
     * </pre>
     *
     * <code>optional string namespace = 178476379;</code>
     *
     * @return The namespace.
     */
    public java.lang.String getNamespace() {
      java.lang.Object ref = namespace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namespace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Service Directory namespace to register the forwarding rule under.
     * </pre>
     *
     * <code>optional string namespace = 178476379;</code>
     *
     * @return The bytes for namespace.
     */
    public com.google.protobuf.ByteString getNamespaceBytes() {
      java.lang.Object ref = namespace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        namespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Service Directory namespace to register the forwarding rule under.
     * </pre>
     *
     * <code>optional string namespace = 178476379;</code>
     *
     * @param value The namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespace(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      namespace_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Service Directory namespace to register the forwarding rule under.
     * </pre>
     *
     * <code>optional string namespace = 178476379;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNamespace() {
      namespace_ = getDefaultInstance().getNamespace();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Service Directory namespace to register the forwarding rule under.
     * </pre>
     *
     * <code>optional string namespace = 178476379;</code>
     *
     * @param value The bytes for namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      namespace_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object service_ = "";

    /**
     *
     *
     * <pre>
     * Service Directory service to register the forwarding rule under.
     * </pre>
     *
     * <code>optional string service = 373540533;</code>
     *
     * @return Whether the service field is set.
     */
    public boolean hasService() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Service Directory service to register the forwarding rule under.
     * </pre>
     *
     * <code>optional string service = 373540533;</code>
     *
     * @return The service.
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        service_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Service Directory service to register the forwarding rule under.
     * </pre>
     *
     * <code>optional string service = 373540533;</code>
     *
     * @return The bytes for service.
     */
    public com.google.protobuf.ByteString getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Service Directory service to register the forwarding rule under.
     * </pre>
     *
     * <code>optional string service = 373540533;</code>
     *
     * @param value The service to set.
     * @return This builder for chaining.
     */
    public Builder setService(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      service_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Service Directory service to register the forwarding rule under.
     * </pre>
     *
     * <code>optional string service = 373540533;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearService() {
      service_ = getDefaultInstance().getService();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Service Directory service to register the forwarding rule under.
     * </pre>
     *
     * <code>optional string service = 373540533;</code>
     *
     * @param value The bytes for service to set.
     * @return This builder for chaining.
     */
    public Builder setServiceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      service_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object serviceDirectoryRegion_ = "";

    /**
     *
     *
     * <pre>
     * [Optional] Service Directory region to register this global forwarding rule under. Default to "us-central1". Only used for PSC for Google APIs. All PSC for Google APIs forwarding rules on the same network should use the same Service Directory region.
     * </pre>
     *
     * <code>optional string service_directory_region = 74030416;</code>
     *
     * @return Whether the serviceDirectoryRegion field is set.
     */
    public boolean hasServiceDirectoryRegion() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * [Optional] Service Directory region to register this global forwarding rule under. Default to "us-central1". Only used for PSC for Google APIs. All PSC for Google APIs forwarding rules on the same network should use the same Service Directory region.
     * </pre>
     *
     * <code>optional string service_directory_region = 74030416;</code>
     *
     * @return The serviceDirectoryRegion.
     */
    public java.lang.String getServiceDirectoryRegion() {
      java.lang.Object ref = serviceDirectoryRegion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceDirectoryRegion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * [Optional] Service Directory region to register this global forwarding rule under. Default to "us-central1". Only used for PSC for Google APIs. All PSC for Google APIs forwarding rules on the same network should use the same Service Directory region.
     * </pre>
     *
     * <code>optional string service_directory_region = 74030416;</code>
     *
     * @return The bytes for serviceDirectoryRegion.
     */
    public com.google.protobuf.ByteString getServiceDirectoryRegionBytes() {
      java.lang.Object ref = serviceDirectoryRegion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serviceDirectoryRegion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * [Optional] Service Directory region to register this global forwarding rule under. Default to "us-central1". Only used for PSC for Google APIs. All PSC for Google APIs forwarding rules on the same network should use the same Service Directory region.
     * </pre>
     *
     * <code>optional string service_directory_region = 74030416;</code>
     *
     * @param value The serviceDirectoryRegion to set.
     * @return This builder for chaining.
     */
    public Builder setServiceDirectoryRegion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      serviceDirectoryRegion_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Optional] Service Directory region to register this global forwarding rule under. Default to "us-central1". Only used for PSC for Google APIs. All PSC for Google APIs forwarding rules on the same network should use the same Service Directory region.
     * </pre>
     *
     * <code>optional string service_directory_region = 74030416;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServiceDirectoryRegion() {
      serviceDirectoryRegion_ = getDefaultInstance().getServiceDirectoryRegion();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Optional] Service Directory region to register this global forwarding rule under. Default to "us-central1". Only used for PSC for Google APIs. All PSC for Google APIs forwarding rules on the same network should use the same Service Directory region.
     * </pre>
     *
     * <code>optional string service_directory_region = 74030416;</code>
     *
     * @param value The bytes for serviceDirectoryRegion to set.
     * @return This builder for chaining.
     */
    public Builder setServiceDirectoryRegionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      serviceDirectoryRegion_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration)
  private static final com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration();
  }

  public static com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ForwardingRuleServiceDirectoryRegistration>
      PARSER =
          new com.google.protobuf.AbstractParser<ForwardingRuleServiceDirectoryRegistration>() {
            @java.lang.Override
            public ForwardingRuleServiceDirectoryRegistration parsePartialFrom(
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

  public static com.google.protobuf.Parser<ForwardingRuleServiceDirectoryRegistration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ForwardingRuleServiceDirectoryRegistration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
