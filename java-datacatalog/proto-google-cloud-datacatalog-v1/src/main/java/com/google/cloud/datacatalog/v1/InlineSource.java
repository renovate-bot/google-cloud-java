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
// source: google/cloud/datacatalog/v1/policytagmanagerserialization.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Inline source containing taxonomies to import.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.InlineSource}
 */
public final class InlineSource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.InlineSource)
    InlineSourceOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use InlineSource.newBuilder() to construct.
  private InlineSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InlineSource() {
    taxonomies_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InlineSource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.PolicyTagManagerSerializationProto
        .internal_static_google_cloud_datacatalog_v1_InlineSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.PolicyTagManagerSerializationProto
        .internal_static_google_cloud_datacatalog_v1_InlineSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.InlineSource.class,
            com.google.cloud.datacatalog.v1.InlineSource.Builder.class);
  }

  public static final int TAXONOMIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.datacatalog.v1.SerializedTaxonomy> taxonomies_;

  /**
   *
   *
   * <pre>
   * Required. Taxonomies to import.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datacatalog.v1.SerializedTaxonomy> getTaxonomiesList() {
    return taxonomies_;
  }

  /**
   *
   *
   * <pre>
   * Required. Taxonomies to import.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datacatalog.v1.SerializedTaxonomyOrBuilder>
      getTaxonomiesOrBuilderList() {
    return taxonomies_;
  }

  /**
   *
   *
   * <pre>
   * Required. Taxonomies to import.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public int getTaxonomiesCount() {
    return taxonomies_.size();
  }

  /**
   *
   *
   * <pre>
   * Required. Taxonomies to import.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.SerializedTaxonomy getTaxonomies(int index) {
    return taxonomies_.get(index);
  }

  /**
   *
   *
   * <pre>
   * Required. Taxonomies to import.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.SerializedTaxonomyOrBuilder getTaxonomiesOrBuilder(
      int index) {
    return taxonomies_.get(index);
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
    for (int i = 0; i < taxonomies_.size(); i++) {
      output.writeMessage(1, taxonomies_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < taxonomies_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, taxonomies_.get(i));
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.InlineSource)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.InlineSource other =
        (com.google.cloud.datacatalog.v1.InlineSource) obj;

    if (!getTaxonomiesList().equals(other.getTaxonomiesList())) return false;
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
    if (getTaxonomiesCount() > 0) {
      hash = (37 * hash) + TAXONOMIES_FIELD_NUMBER;
      hash = (53 * hash) + getTaxonomiesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.InlineSource parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.InlineSource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.InlineSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.InlineSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.InlineSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.InlineSource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.InlineSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.InlineSource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.InlineSource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.InlineSource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.InlineSource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.InlineSource parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datacatalog.v1.InlineSource prototype) {
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
   * Inline source containing taxonomies to import.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.InlineSource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.InlineSource)
      com.google.cloud.datacatalog.v1.InlineSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.PolicyTagManagerSerializationProto
          .internal_static_google_cloud_datacatalog_v1_InlineSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.PolicyTagManagerSerializationProto
          .internal_static_google_cloud_datacatalog_v1_InlineSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.InlineSource.class,
              com.google.cloud.datacatalog.v1.InlineSource.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.InlineSource.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (taxonomiesBuilder_ == null) {
        taxonomies_ = java.util.Collections.emptyList();
      } else {
        taxonomies_ = null;
        taxonomiesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.PolicyTagManagerSerializationProto
          .internal_static_google_cloud_datacatalog_v1_InlineSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.InlineSource getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.InlineSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.InlineSource build() {
      com.google.cloud.datacatalog.v1.InlineSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.InlineSource buildPartial() {
      com.google.cloud.datacatalog.v1.InlineSource result =
          new com.google.cloud.datacatalog.v1.InlineSource(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.datacatalog.v1.InlineSource result) {
      if (taxonomiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          taxonomies_ = java.util.Collections.unmodifiableList(taxonomies_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.taxonomies_ = taxonomies_;
      } else {
        result.taxonomies_ = taxonomiesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.InlineSource result) {
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
      if (other instanceof com.google.cloud.datacatalog.v1.InlineSource) {
        return mergeFrom((com.google.cloud.datacatalog.v1.InlineSource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.InlineSource other) {
      if (other == com.google.cloud.datacatalog.v1.InlineSource.getDefaultInstance()) return this;
      if (taxonomiesBuilder_ == null) {
        if (!other.taxonomies_.isEmpty()) {
          if (taxonomies_.isEmpty()) {
            taxonomies_ = other.taxonomies_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTaxonomiesIsMutable();
            taxonomies_.addAll(other.taxonomies_);
          }
          onChanged();
        }
      } else {
        if (!other.taxonomies_.isEmpty()) {
          if (taxonomiesBuilder_.isEmpty()) {
            taxonomiesBuilder_.dispose();
            taxonomiesBuilder_ = null;
            taxonomies_ = other.taxonomies_;
            bitField0_ = (bitField0_ & ~0x00000001);
            taxonomiesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTaxonomiesFieldBuilder()
                    : null;
          } else {
            taxonomiesBuilder_.addAllMessages(other.taxonomies_);
          }
        }
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
                com.google.cloud.datacatalog.v1.SerializedTaxonomy m =
                    input.readMessage(
                        com.google.cloud.datacatalog.v1.SerializedTaxonomy.parser(),
                        extensionRegistry);
                if (taxonomiesBuilder_ == null) {
                  ensureTaxonomiesIsMutable();
                  taxonomies_.add(m);
                } else {
                  taxonomiesBuilder_.addMessage(m);
                }
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

    private java.util.List<com.google.cloud.datacatalog.v1.SerializedTaxonomy> taxonomies_ =
        java.util.Collections.emptyList();

    private void ensureTaxonomiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        taxonomies_ =
            new java.util.ArrayList<com.google.cloud.datacatalog.v1.SerializedTaxonomy>(
                taxonomies_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datacatalog.v1.SerializedTaxonomy,
            com.google.cloud.datacatalog.v1.SerializedTaxonomy.Builder,
            com.google.cloud.datacatalog.v1.SerializedTaxonomyOrBuilder>
        taxonomiesBuilder_;

    /**
     *
     *
     * <pre>
     * Required. Taxonomies to import.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.datacatalog.v1.SerializedTaxonomy> getTaxonomiesList() {
      if (taxonomiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(taxonomies_);
      } else {
        return taxonomiesBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Taxonomies to import.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public int getTaxonomiesCount() {
      if (taxonomiesBuilder_ == null) {
        return taxonomies_.size();
      } else {
        return taxonomiesBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Taxonomies to import.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.SerializedTaxonomy getTaxonomies(int index) {
      if (taxonomiesBuilder_ == null) {
        return taxonomies_.get(index);
      } else {
        return taxonomiesBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Taxonomies to import.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTaxonomies(
        int index, com.google.cloud.datacatalog.v1.SerializedTaxonomy value) {
      if (taxonomiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTaxonomiesIsMutable();
        taxonomies_.set(index, value);
        onChanged();
      } else {
        taxonomiesBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Taxonomies to import.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTaxonomies(
        int index, com.google.cloud.datacatalog.v1.SerializedTaxonomy.Builder builderForValue) {
      if (taxonomiesBuilder_ == null) {
        ensureTaxonomiesIsMutable();
        taxonomies_.set(index, builderForValue.build());
        onChanged();
      } else {
        taxonomiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Taxonomies to import.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addTaxonomies(com.google.cloud.datacatalog.v1.SerializedTaxonomy value) {
      if (taxonomiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTaxonomiesIsMutable();
        taxonomies_.add(value);
        onChanged();
      } else {
        taxonomiesBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Taxonomies to import.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addTaxonomies(
        int index, com.google.cloud.datacatalog.v1.SerializedTaxonomy value) {
      if (taxonomiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTaxonomiesIsMutable();
        taxonomies_.add(index, value);
        onChanged();
      } else {
        taxonomiesBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Taxonomies to import.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addTaxonomies(
        com.google.cloud.datacatalog.v1.SerializedTaxonomy.Builder builderForValue) {
      if (taxonomiesBuilder_ == null) {
        ensureTaxonomiesIsMutable();
        taxonomies_.add(builderForValue.build());
        onChanged();
      } else {
        taxonomiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Taxonomies to import.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addTaxonomies(
        int index, com.google.cloud.datacatalog.v1.SerializedTaxonomy.Builder builderForValue) {
      if (taxonomiesBuilder_ == null) {
        ensureTaxonomiesIsMutable();
        taxonomies_.add(index, builderForValue.build());
        onChanged();
      } else {
        taxonomiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Taxonomies to import.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addAllTaxonomies(
        java.lang.Iterable<? extends com.google.cloud.datacatalog.v1.SerializedTaxonomy> values) {
      if (taxonomiesBuilder_ == null) {
        ensureTaxonomiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, taxonomies_);
        onChanged();
      } else {
        taxonomiesBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Taxonomies to import.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearTaxonomies() {
      if (taxonomiesBuilder_ == null) {
        taxonomies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        taxonomiesBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Taxonomies to import.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder removeTaxonomies(int index) {
      if (taxonomiesBuilder_ == null) {
        ensureTaxonomiesIsMutable();
        taxonomies_.remove(index);
        onChanged();
      } else {
        taxonomiesBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Taxonomies to import.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.SerializedTaxonomy.Builder getTaxonomiesBuilder(
        int index) {
      return getTaxonomiesFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * Required. Taxonomies to import.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.SerializedTaxonomyOrBuilder getTaxonomiesOrBuilder(
        int index) {
      if (taxonomiesBuilder_ == null) {
        return taxonomies_.get(index);
      } else {
        return taxonomiesBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Taxonomies to import.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<? extends com.google.cloud.datacatalog.v1.SerializedTaxonomyOrBuilder>
        getTaxonomiesOrBuilderList() {
      if (taxonomiesBuilder_ != null) {
        return taxonomiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(taxonomies_);
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Taxonomies to import.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.SerializedTaxonomy.Builder addTaxonomiesBuilder() {
      return getTaxonomiesFieldBuilder()
          .addBuilder(com.google.cloud.datacatalog.v1.SerializedTaxonomy.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Required. Taxonomies to import.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.SerializedTaxonomy.Builder addTaxonomiesBuilder(
        int index) {
      return getTaxonomiesFieldBuilder()
          .addBuilder(
              index, com.google.cloud.datacatalog.v1.SerializedTaxonomy.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Required. Taxonomies to import.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.datacatalog.v1.SerializedTaxonomy.Builder>
        getTaxonomiesBuilderList() {
      return getTaxonomiesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datacatalog.v1.SerializedTaxonomy,
            com.google.cloud.datacatalog.v1.SerializedTaxonomy.Builder,
            com.google.cloud.datacatalog.v1.SerializedTaxonomyOrBuilder>
        getTaxonomiesFieldBuilder() {
      if (taxonomiesBuilder_ == null) {
        taxonomiesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.datacatalog.v1.SerializedTaxonomy,
                com.google.cloud.datacatalog.v1.SerializedTaxonomy.Builder,
                com.google.cloud.datacatalog.v1.SerializedTaxonomyOrBuilder>(
                taxonomies_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        taxonomies_ = null;
      }
      return taxonomiesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.InlineSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.InlineSource)
  private static final com.google.cloud.datacatalog.v1.InlineSource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.InlineSource();
  }

  public static com.google.cloud.datacatalog.v1.InlineSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InlineSource> PARSER =
      new com.google.protobuf.AbstractParser<InlineSource>() {
        @java.lang.Override
        public InlineSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<InlineSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InlineSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.InlineSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
