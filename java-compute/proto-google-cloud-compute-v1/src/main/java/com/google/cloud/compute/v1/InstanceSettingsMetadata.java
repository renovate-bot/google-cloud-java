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
 * Protobuf type {@code google.cloud.compute.v1.InstanceSettingsMetadata}
 */
public final class InstanceSettingsMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstanceSettingsMetadata)
    InstanceSettingsMetadataOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use InstanceSettingsMetadata.newBuilder() to construct.
  private InstanceSettingsMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceSettingsMetadata() {
    kind_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceSettingsMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceSettingsMetadata_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 100526016:
        return internalGetItems();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceSettingsMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstanceSettingsMetadata.class,
            com.google.cloud.compute.v1.InstanceSettingsMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int ITEMS_FIELD_NUMBER = 100526016;

  private static final class ItemsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.compute.v1.Compute
                .internal_static_google_cloud_compute_v1_InstanceSettingsMetadata_ItemsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> items_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetItems() {
    if (items_ == null) {
      return com.google.protobuf.MapField.emptyMapField(ItemsDefaultEntryHolder.defaultEntry);
    }
    return items_;
  }

  public int getItemsCount() {
    return internalGetItems().getMap().size();
  }

  /**
   *
   *
   * <pre>
   * A metadata key/value items map. The total size of all keys and values must be less than 512KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; items = 100526016;</code>
   */
  @java.lang.Override
  public boolean containsItems(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetItems().getMap().containsKey(key);
  }

  /** Use {@link #getItemsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getItems() {
    return getItemsMap();
  }

  /**
   *
   *
   * <pre>
   * A metadata key/value items map. The total size of all keys and values must be less than 512KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; items = 100526016;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getItemsMap() {
    return internalGetItems().getMap();
  }

  /**
   *
   *
   * <pre>
   * A metadata key/value items map. The total size of all keys and values must be less than 512KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; items = 100526016;</code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getItemsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetItems().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }

  /**
   *
   *
   * <pre>
   * A metadata key/value items map. The total size of all keys and values must be less than 512KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; items = 100526016;</code>
   */
  @java.lang.Override
  public java.lang.String getItemsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetItems().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int KIND_FIELD_NUMBER = 3292052;

  @SuppressWarnings("serial")
  private volatile java.lang.Object kind_ = "";

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#metadata for metadata.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  @java.lang.Override
  public boolean hasKind() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#metadata for metadata.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  @java.lang.Override
  public java.lang.String getKind() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kind_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#metadata for metadata.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKindBytes() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      kind_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3292052, kind_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetItems(), ItemsDefaultEntryHolder.defaultEntry, 100526016);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3292052, kind_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetItems().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> items__ =
          ItemsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(100526016, items__);
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
    if (!(obj instanceof com.google.cloud.compute.v1.InstanceSettingsMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstanceSettingsMetadata other =
        (com.google.cloud.compute.v1.InstanceSettingsMetadata) obj;

    if (!internalGetItems().equals(other.internalGetItems())) return false;
    if (hasKind() != other.hasKind()) return false;
    if (hasKind()) {
      if (!getKind().equals(other.getKind())) return false;
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
    if (!internalGetItems().getMap().isEmpty()) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetItems().hashCode();
    }
    if (hasKind()) {
      hash = (37 * hash) + KIND_FIELD_NUMBER;
      hash = (53 * hash) + getKind().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstanceSettingsMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceSettingsMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceSettingsMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceSettingsMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceSettingsMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceSettingsMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceSettingsMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceSettingsMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceSettingsMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceSettingsMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceSettingsMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceSettingsMetadata parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.InstanceSettingsMetadata prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.InstanceSettingsMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstanceSettingsMetadata)
      com.google.cloud.compute.v1.InstanceSettingsMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceSettingsMetadata_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 100526016:
          return internalGetItems();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 100526016:
          return internalGetMutableItems();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceSettingsMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstanceSettingsMetadata.class,
              com.google.cloud.compute.v1.InstanceSettingsMetadata.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InstanceSettingsMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableItems().clear();
      kind_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceSettingsMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceSettingsMetadata getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstanceSettingsMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceSettingsMetadata build() {
      com.google.cloud.compute.v1.InstanceSettingsMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceSettingsMetadata buildPartial() {
      com.google.cloud.compute.v1.InstanceSettingsMetadata result =
          new com.google.cloud.compute.v1.InstanceSettingsMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.InstanceSettingsMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.items_ = internalGetItems();
        result.items_.makeImmutable();
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.kind_ = kind_;
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
      if (other instanceof com.google.cloud.compute.v1.InstanceSettingsMetadata) {
        return mergeFrom((com.google.cloud.compute.v1.InstanceSettingsMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.InstanceSettingsMetadata other) {
      if (other == com.google.cloud.compute.v1.InstanceSettingsMetadata.getDefaultInstance())
        return this;
      internalGetMutableItems().mergeFrom(other.internalGetItems());
      bitField0_ |= 0x00000001;
      if (other.hasKind()) {
        kind_ = other.kind_;
        bitField0_ |= 0x00000002;
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
            case 26336418:
              {
                kind_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 26336418
            case 804208130:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> items__ =
                    input.readMessage(
                        ItemsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableItems().getMutableMap().put(items__.getKey(), items__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 804208130
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

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> items_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetItems() {
      if (items_ == null) {
        return com.google.protobuf.MapField.emptyMapField(ItemsDefaultEntryHolder.defaultEntry);
      }
      return items_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableItems() {
      if (items_ == null) {
        items_ = com.google.protobuf.MapField.newMapField(ItemsDefaultEntryHolder.defaultEntry);
      }
      if (!items_.isMutable()) {
        items_ = items_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return items_;
    }

    public int getItemsCount() {
      return internalGetItems().getMap().size();
    }

    /**
     *
     *
     * <pre>
     * A metadata key/value items map. The total size of all keys and values must be less than 512KB.
     * </pre>
     *
     * <code>map&lt;string, string&gt; items = 100526016;</code>
     */
    @java.lang.Override
    public boolean containsItems(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetItems().getMap().containsKey(key);
    }

    /** Use {@link #getItemsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getItems() {
      return getItemsMap();
    }

    /**
     *
     *
     * <pre>
     * A metadata key/value items map. The total size of all keys and values must be less than 512KB.
     * </pre>
     *
     * <code>map&lt;string, string&gt; items = 100526016;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getItemsMap() {
      return internalGetItems().getMap();
    }

    /**
     *
     *
     * <pre>
     * A metadata key/value items map. The total size of all keys and values must be less than 512KB.
     * </pre>
     *
     * <code>map&lt;string, string&gt; items = 100526016;</code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getItemsOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetItems().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }

    /**
     *
     *
     * <pre>
     * A metadata key/value items map. The total size of all keys and values must be less than 512KB.
     * </pre>
     *
     * <code>map&lt;string, string&gt; items = 100526016;</code>
     */
    @java.lang.Override
    public java.lang.String getItemsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetItems().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearItems() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableItems().getMutableMap().clear();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A metadata key/value items map. The total size of all keys and values must be less than 512KB.
     * </pre>
     *
     * <code>map&lt;string, string&gt; items = 100526016;</code>
     */
    public Builder removeItems(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableItems().getMutableMap().remove(key);
      return this;
    }

    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableItems() {
      bitField0_ |= 0x00000001;
      return internalGetMutableItems().getMutableMap();
    }

    /**
     *
     *
     * <pre>
     * A metadata key/value items map. The total size of all keys and values must be less than 512KB.
     * </pre>
     *
     * <code>map&lt;string, string&gt; items = 100526016;</code>
     */
    public Builder putItems(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableItems().getMutableMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }

    /**
     *
     *
     * <pre>
     * A metadata key/value items map. The total size of all keys and values must be less than 512KB.
     * </pre>
     *
     * <code>map&lt;string, string&gt; items = 100526016;</code>
     */
    public Builder putAllItems(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableItems().getMutableMap().putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    private java.lang.Object kind_ = "";

    /**
     *
     *
     * <pre>
     * [Output Only] Type of the resource. Always compute#metadata for metadata.
     * </pre>
     *
     * <code>optional string kind = 3292052;</code>
     *
     * @return Whether the kind field is set.
     */
    public boolean hasKind() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * [Output Only] Type of the resource. Always compute#metadata for metadata.
     * </pre>
     *
     * <code>optional string kind = 3292052;</code>
     *
     * @return The kind.
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kind_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * [Output Only] Type of the resource. Always compute#metadata for metadata.
     * </pre>
     *
     * <code>optional string kind = 3292052;</code>
     *
     * @return The bytes for kind.
     */
    public com.google.protobuf.ByteString getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * [Output Only] Type of the resource. Always compute#metadata for metadata.
     * </pre>
     *
     * <code>optional string kind = 3292052;</code>
     *
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      kind_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] Type of the resource. Always compute#metadata for metadata.
     * </pre>
     *
     * <code>optional string kind = 3292052;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      kind_ = getDefaultInstance().getKind();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] Type of the resource. Always compute#metadata for metadata.
     * </pre>
     *
     * <code>optional string kind = 3292052;</code>
     *
     * @param value The bytes for kind to set.
     * @return This builder for chaining.
     */
    public Builder setKindBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      kind_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstanceSettingsMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstanceSettingsMetadata)
  private static final com.google.cloud.compute.v1.InstanceSettingsMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InstanceSettingsMetadata();
  }

  public static com.google.cloud.compute.v1.InstanceSettingsMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceSettingsMetadata> PARSER =
      new com.google.protobuf.AbstractParser<InstanceSettingsMetadata>() {
        @java.lang.Override
        public InstanceSettingsMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstanceSettingsMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceSettingsMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceSettingsMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
