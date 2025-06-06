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
 * Protobuf type {@code google.cloud.compute.v1.AllocationReservationSharingPolicy}
 */
public final class AllocationReservationSharingPolicy extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.AllocationReservationSharingPolicy)
    AllocationReservationSharingPolicyOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use AllocationReservationSharingPolicy.newBuilder() to construct.
  private AllocationReservationSharingPolicy(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AllocationReservationSharingPolicy() {
    serviceShareType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AllocationReservationSharingPolicy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_AllocationReservationSharingPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_AllocationReservationSharingPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.AllocationReservationSharingPolicy.class,
            com.google.cloud.compute.v1.AllocationReservationSharingPolicy.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Sharing config for all Google Cloud services.
   * </pre>
   *
   * Protobuf enum {@code
   * google.cloud.compute.v1.AllocationReservationSharingPolicy.ServiceShareType}
   */
  public enum ServiceShareType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_SERVICE_SHARE_TYPE = 0;</code>
     */
    UNDEFINED_SERVICE_SHARE_TYPE(0),
    /**
     *
     *
     * <pre>
     * Allow all Google Cloud managed services to share reservations.
     * </pre>
     *
     * <code>ALLOW_ALL = 475536235;</code>
     */
    ALLOW_ALL(475536235),
    /**
     *
     *
     * <pre>
     * [Default] Disallow sharing with all Google Cloud services.
     * </pre>
     *
     * <code>DISALLOW_ALL = 277786301;</code>
     */
    DISALLOW_ALL(277786301),
    /** <code>SERVICE_SHARE_TYPE_UNSPECIFIED = 279057148;</code> */
    SERVICE_SHARE_TYPE_UNSPECIFIED(279057148),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_SERVICE_SHARE_TYPE = 0;</code>
     */
    public static final int UNDEFINED_SERVICE_SHARE_TYPE_VALUE = 0;

    /**
     *
     *
     * <pre>
     * Allow all Google Cloud managed services to share reservations.
     * </pre>
     *
     * <code>ALLOW_ALL = 475536235;</code>
     */
    public static final int ALLOW_ALL_VALUE = 475536235;

    /**
     *
     *
     * <pre>
     * [Default] Disallow sharing with all Google Cloud services.
     * </pre>
     *
     * <code>DISALLOW_ALL = 277786301;</code>
     */
    public static final int DISALLOW_ALL_VALUE = 277786301;

    /** <code>SERVICE_SHARE_TYPE_UNSPECIFIED = 279057148;</code> */
    public static final int SERVICE_SHARE_TYPE_UNSPECIFIED_VALUE = 279057148;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ServiceShareType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ServiceShareType forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_SERVICE_SHARE_TYPE;
        case 475536235:
          return ALLOW_ALL;
        case 277786301:
          return DISALLOW_ALL;
        case 279057148:
          return SERVICE_SHARE_TYPE_UNSPECIFIED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ServiceShareType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ServiceShareType>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ServiceShareType>() {
              public ServiceShareType findValueByNumber(int number) {
                return ServiceShareType.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.compute.v1.AllocationReservationSharingPolicy.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final ServiceShareType[] VALUES = values();

    public static ServiceShareType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ServiceShareType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.AllocationReservationSharingPolicy.ServiceShareType)
  }

  private int bitField0_;
  public static final int SERVICE_SHARE_TYPE_FIELD_NUMBER = 514508644;

  @SuppressWarnings("serial")
  private volatile java.lang.Object serviceShareType_ = "";

  /**
   *
   *
   * <pre>
   * Sharing config for all Google Cloud services.
   * Check the ServiceShareType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string service_share_type = 514508644;</code>
   *
   * @return Whether the serviceShareType field is set.
   */
  @java.lang.Override
  public boolean hasServiceShareType() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Sharing config for all Google Cloud services.
   * Check the ServiceShareType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string service_share_type = 514508644;</code>
   *
   * @return The serviceShareType.
   */
  @java.lang.Override
  public java.lang.String getServiceShareType() {
    java.lang.Object ref = serviceShareType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceShareType_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Sharing config for all Google Cloud services.
   * Check the ServiceShareType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string service_share_type = 514508644;</code>
   *
   * @return The bytes for serviceShareType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceShareTypeBytes() {
    java.lang.Object ref = serviceShareType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      serviceShareType_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 514508644, serviceShareType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(514508644, serviceShareType_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.AllocationReservationSharingPolicy)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.AllocationReservationSharingPolicy other =
        (com.google.cloud.compute.v1.AllocationReservationSharingPolicy) obj;

    if (hasServiceShareType() != other.hasServiceShareType()) return false;
    if (hasServiceShareType()) {
      if (!getServiceShareType().equals(other.getServiceShareType())) return false;
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
    if (hasServiceShareType()) {
      hash = (37 * hash) + SERVICE_SHARE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getServiceShareType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.AllocationReservationSharingPolicy parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AllocationReservationSharingPolicy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AllocationReservationSharingPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AllocationReservationSharingPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AllocationReservationSharingPolicy parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AllocationReservationSharingPolicy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AllocationReservationSharingPolicy parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AllocationReservationSharingPolicy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AllocationReservationSharingPolicy parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AllocationReservationSharingPolicy parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AllocationReservationSharingPolicy parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AllocationReservationSharingPolicy parseFrom(
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
      com.google.cloud.compute.v1.AllocationReservationSharingPolicy prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.AllocationReservationSharingPolicy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.AllocationReservationSharingPolicy)
      com.google.cloud.compute.v1.AllocationReservationSharingPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AllocationReservationSharingPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AllocationReservationSharingPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.AllocationReservationSharingPolicy.class,
              com.google.cloud.compute.v1.AllocationReservationSharingPolicy.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.AllocationReservationSharingPolicy.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      serviceShareType_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AllocationReservationSharingPolicy_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AllocationReservationSharingPolicy
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.AllocationReservationSharingPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AllocationReservationSharingPolicy build() {
      com.google.cloud.compute.v1.AllocationReservationSharingPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AllocationReservationSharingPolicy buildPartial() {
      com.google.cloud.compute.v1.AllocationReservationSharingPolicy result =
          new com.google.cloud.compute.v1.AllocationReservationSharingPolicy(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.AllocationReservationSharingPolicy result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.serviceShareType_ = serviceShareType_;
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
      if (other instanceof com.google.cloud.compute.v1.AllocationReservationSharingPolicy) {
        return mergeFrom((com.google.cloud.compute.v1.AllocationReservationSharingPolicy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.AllocationReservationSharingPolicy other) {
      if (other
          == com.google.cloud.compute.v1.AllocationReservationSharingPolicy.getDefaultInstance())
        return this;
      if (other.hasServiceShareType()) {
        serviceShareType_ = other.serviceShareType_;
        bitField0_ |= 0x00000001;
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
            case -178898142:
              {
                serviceShareType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case -178898142
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

    private java.lang.Object serviceShareType_ = "";

    /**
     *
     *
     * <pre>
     * Sharing config for all Google Cloud services.
     * Check the ServiceShareType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string service_share_type = 514508644;</code>
     *
     * @return Whether the serviceShareType field is set.
     */
    public boolean hasServiceShareType() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Sharing config for all Google Cloud services.
     * Check the ServiceShareType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string service_share_type = 514508644;</code>
     *
     * @return The serviceShareType.
     */
    public java.lang.String getServiceShareType() {
      java.lang.Object ref = serviceShareType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceShareType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Sharing config for all Google Cloud services.
     * Check the ServiceShareType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string service_share_type = 514508644;</code>
     *
     * @return The bytes for serviceShareType.
     */
    public com.google.protobuf.ByteString getServiceShareTypeBytes() {
      java.lang.Object ref = serviceShareType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serviceShareType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Sharing config for all Google Cloud services.
     * Check the ServiceShareType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string service_share_type = 514508644;</code>
     *
     * @param value The serviceShareType to set.
     * @return This builder for chaining.
     */
    public Builder setServiceShareType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      serviceShareType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Sharing config for all Google Cloud services.
     * Check the ServiceShareType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string service_share_type = 514508644;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServiceShareType() {
      serviceShareType_ = getDefaultInstance().getServiceShareType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Sharing config for all Google Cloud services.
     * Check the ServiceShareType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string service_share_type = 514508644;</code>
     *
     * @param value The bytes for serviceShareType to set.
     * @return This builder for chaining.
     */
    public Builder setServiceShareTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      serviceShareType_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.AllocationReservationSharingPolicy)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.AllocationReservationSharingPolicy)
  private static final com.google.cloud.compute.v1.AllocationReservationSharingPolicy
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.AllocationReservationSharingPolicy();
  }

  public static com.google.cloud.compute.v1.AllocationReservationSharingPolicy
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllocationReservationSharingPolicy> PARSER =
      new com.google.protobuf.AbstractParser<AllocationReservationSharingPolicy>() {
        @java.lang.Override
        public AllocationReservationSharingPolicy parsePartialFrom(
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

  public static com.google.protobuf.Parser<AllocationReservationSharingPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllocationReservationSharingPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.AllocationReservationSharingPolicy
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
