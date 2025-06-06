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
// source: google/cloud/vmwareengine/v1/vmwareengine_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.vmwareengine.v1;

/**
 *
 *
 * <pre>
 * VmwareEngine specific metadata for the given
 * [google.cloud.location.Location][google.cloud.location.Location]. It is
 * returned as a content of the `google.cloud.location.Location.metadata` field.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vmwareengine.v1.LocationMetadata}
 */
public final class LocationMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vmwareengine.v1.LocationMetadata)
    LocationMetadataOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use LocationMetadata.newBuilder() to construct.
  private LocationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LocationMetadata() {
    capabilities_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LocationMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vmwareengine.v1.VmwareengineResourcesProto
        .internal_static_google_cloud_vmwareengine_v1_LocationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vmwareengine.v1.VmwareengineResourcesProto
        .internal_static_google_cloud_vmwareengine_v1_LocationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vmwareengine.v1.LocationMetadata.class,
            com.google.cloud.vmwareengine.v1.LocationMetadata.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Capability of a location.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.vmwareengine.v1.LocationMetadata.Capability}
   */
  public enum Capability implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * The default value. This value is used if the capability is omitted or
     * unknown.
     * </pre>
     *
     * <code>CAPABILITY_UNSPECIFIED = 0;</code>
     */
    CAPABILITY_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Stretch clusters are supported in this location.
     * </pre>
     *
     * <code>STRETCHED_CLUSTERS = 1;</code>
     */
    STRETCHED_CLUSTERS(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * The default value. This value is used if the capability is omitted or
     * unknown.
     * </pre>
     *
     * <code>CAPABILITY_UNSPECIFIED = 0;</code>
     */
    public static final int CAPABILITY_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * Stretch clusters are supported in this location.
     * </pre>
     *
     * <code>STRETCHED_CLUSTERS = 1;</code>
     */
    public static final int STRETCHED_CLUSTERS_VALUE = 1;

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
    public static Capability valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Capability forNumber(int value) {
      switch (value) {
        case 0:
          return CAPABILITY_UNSPECIFIED;
        case 1:
          return STRETCHED_CLUSTERS;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Capability> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Capability> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Capability>() {
          public Capability findValueByNumber(int number) {
            return Capability.forNumber(number);
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
      return com.google.cloud.vmwareengine.v1.LocationMetadata.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Capability[] VALUES = values();

    public static Capability valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Capability(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.vmwareengine.v1.LocationMetadata.Capability)
  }

  public static final int CAPABILITIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> capabilities_;

  private static final com.google.protobuf.Internal.ListAdapter.Converter<
          java.lang.Integer, com.google.cloud.vmwareengine.v1.LocationMetadata.Capability>
      capabilities_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.cloud.vmwareengine.v1.LocationMetadata.Capability>() {
            public com.google.cloud.vmwareengine.v1.LocationMetadata.Capability convert(
                java.lang.Integer from) {
              com.google.cloud.vmwareengine.v1.LocationMetadata.Capability result =
                  com.google.cloud.vmwareengine.v1.LocationMetadata.Capability.forNumber(from);
              return result == null
                  ? com.google.cloud.vmwareengine.v1.LocationMetadata.Capability.UNRECOGNIZED
                  : result;
            }
          };

  /**
   *
   *
   * <pre>
   * Output only. Capabilities of this location.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the capabilities.
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.vmwareengine.v1.LocationMetadata.Capability>
      getCapabilitiesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.cloud.vmwareengine.v1.LocationMetadata.Capability>(
        capabilities_, capabilities_converter_);
  }

  /**
   *
   *
   * <pre>
   * Output only. Capabilities of this location.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of capabilities.
   */
  @java.lang.Override
  public int getCapabilitiesCount() {
    return capabilities_.size();
  }

  /**
   *
   *
   * <pre>
   * Output only. Capabilities of this location.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The capabilities at the given index.
   */
  @java.lang.Override
  public com.google.cloud.vmwareengine.v1.LocationMetadata.Capability getCapabilities(int index) {
    return capabilities_converter_.convert(capabilities_.get(index));
  }

  /**
   *
   *
   * <pre>
   * Output only. Capabilities of this location.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for capabilities.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer> getCapabilitiesValueList() {
    return capabilities_;
  }

  /**
   *
   *
   * <pre>
   * Output only. Capabilities of this location.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of capabilities at the given index.
   */
  @java.lang.Override
  public int getCapabilitiesValue(int index) {
    return capabilities_.get(index);
  }

  private int capabilitiesMemoizedSerializedSize;

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
    getSerializedSize();
    if (getCapabilitiesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(capabilitiesMemoizedSerializedSize);
    }
    for (int i = 0; i < capabilities_.size(); i++) {
      output.writeEnumNoTag(capabilities_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < capabilities_.size(); i++) {
        dataSize +=
            com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(capabilities_.get(i));
      }
      size += dataSize;
      if (!getCapabilitiesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(dataSize);
      }
      capabilitiesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.cloud.vmwareengine.v1.LocationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.vmwareengine.v1.LocationMetadata other =
        (com.google.cloud.vmwareengine.v1.LocationMetadata) obj;

    if (!capabilities_.equals(other.capabilities_)) return false;
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
    if (getCapabilitiesCount() > 0) {
      hash = (37 * hash) + CAPABILITIES_FIELD_NUMBER;
      hash = (53 * hash) + capabilities_.hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vmwareengine.v1.LocationMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmwareengine.v1.LocationMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmwareengine.v1.LocationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmwareengine.v1.LocationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmwareengine.v1.LocationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmwareengine.v1.LocationMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmwareengine.v1.LocationMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmwareengine.v1.LocationMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vmwareengine.v1.LocationMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmwareengine.v1.LocationMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vmwareengine.v1.LocationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmwareengine.v1.LocationMetadata parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vmwareengine.v1.LocationMetadata prototype) {
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
   * VmwareEngine specific metadata for the given
   * [google.cloud.location.Location][google.cloud.location.Location]. It is
   * returned as a content of the `google.cloud.location.Location.metadata` field.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vmwareengine.v1.LocationMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vmwareengine.v1.LocationMetadata)
      com.google.cloud.vmwareengine.v1.LocationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vmwareengine.v1.VmwareengineResourcesProto
          .internal_static_google_cloud_vmwareengine_v1_LocationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vmwareengine.v1.VmwareengineResourcesProto
          .internal_static_google_cloud_vmwareengine_v1_LocationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vmwareengine.v1.LocationMetadata.class,
              com.google.cloud.vmwareengine.v1.LocationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.vmwareengine.v1.LocationMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      capabilities_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vmwareengine.v1.VmwareengineResourcesProto
          .internal_static_google_cloud_vmwareengine_v1_LocationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.LocationMetadata getDefaultInstanceForType() {
      return com.google.cloud.vmwareengine.v1.LocationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.LocationMetadata build() {
      com.google.cloud.vmwareengine.v1.LocationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.LocationMetadata buildPartial() {
      com.google.cloud.vmwareengine.v1.LocationMetadata result =
          new com.google.cloud.vmwareengine.v1.LocationMetadata(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.vmwareengine.v1.LocationMetadata result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        capabilities_ = java.util.Collections.unmodifiableList(capabilities_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.capabilities_ = capabilities_;
    }

    private void buildPartial0(com.google.cloud.vmwareengine.v1.LocationMetadata result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.vmwareengine.v1.LocationMetadata) {
        return mergeFrom((com.google.cloud.vmwareengine.v1.LocationMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vmwareengine.v1.LocationMetadata other) {
      if (other == com.google.cloud.vmwareengine.v1.LocationMetadata.getDefaultInstance())
        return this;
      if (!other.capabilities_.isEmpty()) {
        if (capabilities_.isEmpty()) {
          capabilities_ = other.capabilities_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCapabilitiesIsMutable();
          capabilities_.addAll(other.capabilities_);
        }
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
            case 8:
              {
                int tmpRaw = input.readEnum();
                ensureCapabilitiesIsMutable();
                capabilities_.add(tmpRaw);
                break;
              } // case 8
            case 10:
              {
                int length = input.readRawVarint32();
                int oldLimit = input.pushLimit(length);
                while (input.getBytesUntilLimit() > 0) {
                  int tmpRaw = input.readEnum();
                  ensureCapabilitiesIsMutable();
                  capabilities_.add(tmpRaw);
                }
                input.popLimit(oldLimit);
                break;
              } // case 10
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

    private java.util.List<java.lang.Integer> capabilities_ = java.util.Collections.emptyList();

    private void ensureCapabilitiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        capabilities_ = new java.util.ArrayList<java.lang.Integer>(capabilities_);
        bitField0_ |= 0x00000001;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Capabilities of this location.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return A list containing the capabilities.
     */
    public java.util.List<com.google.cloud.vmwareengine.v1.LocationMetadata.Capability>
        getCapabilitiesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.cloud.vmwareengine.v1.LocationMetadata.Capability>(
          capabilities_, capabilities_converter_);
    }

    /**
     *
     *
     * <pre>
     * Output only. Capabilities of this location.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The count of capabilities.
     */
    public int getCapabilitiesCount() {
      return capabilities_.size();
    }

    /**
     *
     *
     * <pre>
     * Output only. Capabilities of this location.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index of the element to return.
     * @return The capabilities at the given index.
     */
    public com.google.cloud.vmwareengine.v1.LocationMetadata.Capability getCapabilities(int index) {
      return capabilities_converter_.convert(capabilities_.get(index));
    }

    /**
     *
     *
     * <pre>
     * Output only. Capabilities of this location.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The capabilities to set.
     * @return This builder for chaining.
     */
    public Builder setCapabilities(
        int index, com.google.cloud.vmwareengine.v1.LocationMetadata.Capability value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCapabilitiesIsMutable();
      capabilities_.set(index, value.getNumber());
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Capabilities of this location.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The capabilities to add.
     * @return This builder for chaining.
     */
    public Builder addCapabilities(
        com.google.cloud.vmwareengine.v1.LocationMetadata.Capability value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCapabilitiesIsMutable();
      capabilities_.add(value.getNumber());
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Capabilities of this location.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param values The capabilities to add.
     * @return This builder for chaining.
     */
    public Builder addAllCapabilities(
        java.lang.Iterable<? extends com.google.cloud.vmwareengine.v1.LocationMetadata.Capability>
            values) {
      ensureCapabilitiesIsMutable();
      for (com.google.cloud.vmwareengine.v1.LocationMetadata.Capability value : values) {
        capabilities_.add(value.getNumber());
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Capabilities of this location.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCapabilities() {
      capabilities_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Capabilities of this location.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return A list containing the enum numeric values on the wire for capabilities.
     */
    public java.util.List<java.lang.Integer> getCapabilitiesValueList() {
      return java.util.Collections.unmodifiableList(capabilities_);
    }

    /**
     *
     *
     * <pre>
     * Output only. Capabilities of this location.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of capabilities at the given index.
     */
    public int getCapabilitiesValue(int index) {
      return capabilities_.get(index);
    }

    /**
     *
     *
     * <pre>
     * Output only. Capabilities of this location.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for capabilities to set.
     * @return This builder for chaining.
     */
    public Builder setCapabilitiesValue(int index, int value) {
      ensureCapabilitiesIsMutable();
      capabilities_.set(index, value);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Capabilities of this location.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for capabilities to add.
     * @return This builder for chaining.
     */
    public Builder addCapabilitiesValue(int value) {
      ensureCapabilitiesIsMutable();
      capabilities_.add(value);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Capabilities of this location.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param values The enum numeric values on the wire for capabilities to add.
     * @return This builder for chaining.
     */
    public Builder addAllCapabilitiesValue(java.lang.Iterable<java.lang.Integer> values) {
      ensureCapabilitiesIsMutable();
      for (int value : values) {
        capabilities_.add(value);
      }
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vmwareengine.v1.LocationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vmwareengine.v1.LocationMetadata)
  private static final com.google.cloud.vmwareengine.v1.LocationMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vmwareengine.v1.LocationMetadata();
  }

  public static com.google.cloud.vmwareengine.v1.LocationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocationMetadata> PARSER =
      new com.google.protobuf.AbstractParser<LocationMetadata>() {
        @java.lang.Override
        public LocationMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<LocationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vmwareengine.v1.LocationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
