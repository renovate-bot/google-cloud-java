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
// source: google/privacy/dlp/v2/storage.proto

// Protobuf Java Version: 3.25.8
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Instructions regarding the table content being inspected.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.TableOptions}
 */
public final class TableOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.TableOptions)
    TableOptionsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use TableOptions.newBuilder() to construct.
  private TableOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TableOptions() {
    identifyingFields_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TableOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpStorage
        .internal_static_google_privacy_dlp_v2_TableOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpStorage
        .internal_static_google_privacy_dlp_v2_TableOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.TableOptions.class,
            com.google.privacy.dlp.v2.TableOptions.Builder.class);
  }

  public static final int IDENTIFYING_FIELDS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.privacy.dlp.v2.FieldId> identifyingFields_;

  /**
   *
   *
   * <pre>
   * The columns that are the primary keys for table objects included in
   * ContentItem. A copy of this cell's value will stored alongside alongside
   * each finding so that the finding can be traced to the specific row it came
   * from. No more than 3 may be provided.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.privacy.dlp.v2.FieldId> getIdentifyingFieldsList() {
    return identifyingFields_;
  }

  /**
   *
   *
   * <pre>
   * The columns that are the primary keys for table objects included in
   * ContentItem. A copy of this cell's value will stored alongside alongside
   * each finding so that the finding can be traced to the specific row it came
   * from. No more than 3 may be provided.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.privacy.dlp.v2.FieldIdOrBuilder>
      getIdentifyingFieldsOrBuilderList() {
    return identifyingFields_;
  }

  /**
   *
   *
   * <pre>
   * The columns that are the primary keys for table objects included in
   * ContentItem. A copy of this cell's value will stored alongside alongside
   * each finding so that the finding can be traced to the specific row it came
   * from. No more than 3 may be provided.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
   */
  @java.lang.Override
  public int getIdentifyingFieldsCount() {
    return identifyingFields_.size();
  }

  /**
   *
   *
   * <pre>
   * The columns that are the primary keys for table objects included in
   * ContentItem. A copy of this cell's value will stored alongside alongside
   * each finding so that the finding can be traced to the specific row it came
   * from. No more than 3 may be provided.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.FieldId getIdentifyingFields(int index) {
    return identifyingFields_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The columns that are the primary keys for table objects included in
   * ContentItem. A copy of this cell's value will stored alongside alongside
   * each finding so that the finding can be traced to the specific row it came
   * from. No more than 3 may be provided.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.FieldIdOrBuilder getIdentifyingFieldsOrBuilder(int index) {
    return identifyingFields_.get(index);
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
    for (int i = 0; i < identifyingFields_.size(); i++) {
      output.writeMessage(1, identifyingFields_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < identifyingFields_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, identifyingFields_.get(i));
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
    if (!(obj instanceof com.google.privacy.dlp.v2.TableOptions)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.TableOptions other = (com.google.privacy.dlp.v2.TableOptions) obj;

    if (!getIdentifyingFieldsList().equals(other.getIdentifyingFieldsList())) return false;
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
    if (getIdentifyingFieldsCount() > 0) {
      hash = (37 * hash) + IDENTIFYING_FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getIdentifyingFieldsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.TableOptions parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.TableOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.TableOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.TableOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.TableOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.TableOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.TableOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.TableOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.TableOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.TableOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.TableOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.TableOptions parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.TableOptions prototype) {
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
   * Instructions regarding the table content being inspected.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.TableOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.TableOptions)
      com.google.privacy.dlp.v2.TableOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_TableOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_TableOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.TableOptions.class,
              com.google.privacy.dlp.v2.TableOptions.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.TableOptions.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (identifyingFieldsBuilder_ == null) {
        identifyingFields_ = java.util.Collections.emptyList();
      } else {
        identifyingFields_ = null;
        identifyingFieldsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_TableOptions_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.TableOptions getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.TableOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.TableOptions build() {
      com.google.privacy.dlp.v2.TableOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.TableOptions buildPartial() {
      com.google.privacy.dlp.v2.TableOptions result =
          new com.google.privacy.dlp.v2.TableOptions(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.privacy.dlp.v2.TableOptions result) {
      if (identifyingFieldsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          identifyingFields_ = java.util.Collections.unmodifiableList(identifyingFields_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.identifyingFields_ = identifyingFields_;
      } else {
        result.identifyingFields_ = identifyingFieldsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.privacy.dlp.v2.TableOptions result) {
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
      if (other instanceof com.google.privacy.dlp.v2.TableOptions) {
        return mergeFrom((com.google.privacy.dlp.v2.TableOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.TableOptions other) {
      if (other == com.google.privacy.dlp.v2.TableOptions.getDefaultInstance()) return this;
      if (identifyingFieldsBuilder_ == null) {
        if (!other.identifyingFields_.isEmpty()) {
          if (identifyingFields_.isEmpty()) {
            identifyingFields_ = other.identifyingFields_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIdentifyingFieldsIsMutable();
            identifyingFields_.addAll(other.identifyingFields_);
          }
          onChanged();
        }
      } else {
        if (!other.identifyingFields_.isEmpty()) {
          if (identifyingFieldsBuilder_.isEmpty()) {
            identifyingFieldsBuilder_.dispose();
            identifyingFieldsBuilder_ = null;
            identifyingFields_ = other.identifyingFields_;
            bitField0_ = (bitField0_ & ~0x00000001);
            identifyingFieldsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getIdentifyingFieldsFieldBuilder()
                    : null;
          } else {
            identifyingFieldsBuilder_.addAllMessages(other.identifyingFields_);
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
                com.google.privacy.dlp.v2.FieldId m =
                    input.readMessage(
                        com.google.privacy.dlp.v2.FieldId.parser(), extensionRegistry);
                if (identifyingFieldsBuilder_ == null) {
                  ensureIdentifyingFieldsIsMutable();
                  identifyingFields_.add(m);
                } else {
                  identifyingFieldsBuilder_.addMessage(m);
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

    private java.util.List<com.google.privacy.dlp.v2.FieldId> identifyingFields_ =
        java.util.Collections.emptyList();

    private void ensureIdentifyingFieldsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        identifyingFields_ =
            new java.util.ArrayList<com.google.privacy.dlp.v2.FieldId>(identifyingFields_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2.FieldId,
            com.google.privacy.dlp.v2.FieldId.Builder,
            com.google.privacy.dlp.v2.FieldIdOrBuilder>
        identifyingFieldsBuilder_;

    /**
     *
     *
     * <pre>
     * The columns that are the primary keys for table objects included in
     * ContentItem. A copy of this cell's value will stored alongside alongside
     * each finding so that the finding can be traced to the specific row it came
     * from. No more than 3 may be provided.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2.FieldId> getIdentifyingFieldsList() {
      if (identifyingFieldsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(identifyingFields_);
      } else {
        return identifyingFieldsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The columns that are the primary keys for table objects included in
     * ContentItem. A copy of this cell's value will stored alongside alongside
     * each finding so that the finding can be traced to the specific row it came
     * from. No more than 3 may be provided.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
     */
    public int getIdentifyingFieldsCount() {
      if (identifyingFieldsBuilder_ == null) {
        return identifyingFields_.size();
      } else {
        return identifyingFieldsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The columns that are the primary keys for table objects included in
     * ContentItem. A copy of this cell's value will stored alongside alongside
     * each finding so that the finding can be traced to the specific row it came
     * from. No more than 3 may be provided.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
     */
    public com.google.privacy.dlp.v2.FieldId getIdentifyingFields(int index) {
      if (identifyingFieldsBuilder_ == null) {
        return identifyingFields_.get(index);
      } else {
        return identifyingFieldsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The columns that are the primary keys for table objects included in
     * ContentItem. A copy of this cell's value will stored alongside alongside
     * each finding so that the finding can be traced to the specific row it came
     * from. No more than 3 may be provided.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
     */
    public Builder setIdentifyingFields(int index, com.google.privacy.dlp.v2.FieldId value) {
      if (identifyingFieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdentifyingFieldsIsMutable();
        identifyingFields_.set(index, value);
        onChanged();
      } else {
        identifyingFieldsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The columns that are the primary keys for table objects included in
     * ContentItem. A copy of this cell's value will stored alongside alongside
     * each finding so that the finding can be traced to the specific row it came
     * from. No more than 3 may be provided.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
     */
    public Builder setIdentifyingFields(
        int index, com.google.privacy.dlp.v2.FieldId.Builder builderForValue) {
      if (identifyingFieldsBuilder_ == null) {
        ensureIdentifyingFieldsIsMutable();
        identifyingFields_.set(index, builderForValue.build());
        onChanged();
      } else {
        identifyingFieldsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The columns that are the primary keys for table objects included in
     * ContentItem. A copy of this cell's value will stored alongside alongside
     * each finding so that the finding can be traced to the specific row it came
     * from. No more than 3 may be provided.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
     */
    public Builder addIdentifyingFields(com.google.privacy.dlp.v2.FieldId value) {
      if (identifyingFieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdentifyingFieldsIsMutable();
        identifyingFields_.add(value);
        onChanged();
      } else {
        identifyingFieldsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The columns that are the primary keys for table objects included in
     * ContentItem. A copy of this cell's value will stored alongside alongside
     * each finding so that the finding can be traced to the specific row it came
     * from. No more than 3 may be provided.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
     */
    public Builder addIdentifyingFields(int index, com.google.privacy.dlp.v2.FieldId value) {
      if (identifyingFieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdentifyingFieldsIsMutable();
        identifyingFields_.add(index, value);
        onChanged();
      } else {
        identifyingFieldsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The columns that are the primary keys for table objects included in
     * ContentItem. A copy of this cell's value will stored alongside alongside
     * each finding so that the finding can be traced to the specific row it came
     * from. No more than 3 may be provided.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
     */
    public Builder addIdentifyingFields(com.google.privacy.dlp.v2.FieldId.Builder builderForValue) {
      if (identifyingFieldsBuilder_ == null) {
        ensureIdentifyingFieldsIsMutable();
        identifyingFields_.add(builderForValue.build());
        onChanged();
      } else {
        identifyingFieldsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The columns that are the primary keys for table objects included in
     * ContentItem. A copy of this cell's value will stored alongside alongside
     * each finding so that the finding can be traced to the specific row it came
     * from. No more than 3 may be provided.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
     */
    public Builder addIdentifyingFields(
        int index, com.google.privacy.dlp.v2.FieldId.Builder builderForValue) {
      if (identifyingFieldsBuilder_ == null) {
        ensureIdentifyingFieldsIsMutable();
        identifyingFields_.add(index, builderForValue.build());
        onChanged();
      } else {
        identifyingFieldsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The columns that are the primary keys for table objects included in
     * ContentItem. A copy of this cell's value will stored alongside alongside
     * each finding so that the finding can be traced to the specific row it came
     * from. No more than 3 may be provided.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
     */
    public Builder addAllIdentifyingFields(
        java.lang.Iterable<? extends com.google.privacy.dlp.v2.FieldId> values) {
      if (identifyingFieldsBuilder_ == null) {
        ensureIdentifyingFieldsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, identifyingFields_);
        onChanged();
      } else {
        identifyingFieldsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The columns that are the primary keys for table objects included in
     * ContentItem. A copy of this cell's value will stored alongside alongside
     * each finding so that the finding can be traced to the specific row it came
     * from. No more than 3 may be provided.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
     */
    public Builder clearIdentifyingFields() {
      if (identifyingFieldsBuilder_ == null) {
        identifyingFields_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        identifyingFieldsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The columns that are the primary keys for table objects included in
     * ContentItem. A copy of this cell's value will stored alongside alongside
     * each finding so that the finding can be traced to the specific row it came
     * from. No more than 3 may be provided.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
     */
    public Builder removeIdentifyingFields(int index) {
      if (identifyingFieldsBuilder_ == null) {
        ensureIdentifyingFieldsIsMutable();
        identifyingFields_.remove(index);
        onChanged();
      } else {
        identifyingFieldsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The columns that are the primary keys for table objects included in
     * ContentItem. A copy of this cell's value will stored alongside alongside
     * each finding so that the finding can be traced to the specific row it came
     * from. No more than 3 may be provided.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
     */
    public com.google.privacy.dlp.v2.FieldId.Builder getIdentifyingFieldsBuilder(int index) {
      return getIdentifyingFieldsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The columns that are the primary keys for table objects included in
     * ContentItem. A copy of this cell's value will stored alongside alongside
     * each finding so that the finding can be traced to the specific row it came
     * from. No more than 3 may be provided.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
     */
    public com.google.privacy.dlp.v2.FieldIdOrBuilder getIdentifyingFieldsOrBuilder(int index) {
      if (identifyingFieldsBuilder_ == null) {
        return identifyingFields_.get(index);
      } else {
        return identifyingFieldsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The columns that are the primary keys for table objects included in
     * ContentItem. A copy of this cell's value will stored alongside alongside
     * each finding so that the finding can be traced to the specific row it came
     * from. No more than 3 may be provided.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
     */
    public java.util.List<? extends com.google.privacy.dlp.v2.FieldIdOrBuilder>
        getIdentifyingFieldsOrBuilderList() {
      if (identifyingFieldsBuilder_ != null) {
        return identifyingFieldsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(identifyingFields_);
      }
    }

    /**
     *
     *
     * <pre>
     * The columns that are the primary keys for table objects included in
     * ContentItem. A copy of this cell's value will stored alongside alongside
     * each finding so that the finding can be traced to the specific row it came
     * from. No more than 3 may be provided.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
     */
    public com.google.privacy.dlp.v2.FieldId.Builder addIdentifyingFieldsBuilder() {
      return getIdentifyingFieldsFieldBuilder()
          .addBuilder(com.google.privacy.dlp.v2.FieldId.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The columns that are the primary keys for table objects included in
     * ContentItem. A copy of this cell's value will stored alongside alongside
     * each finding so that the finding can be traced to the specific row it came
     * from. No more than 3 may be provided.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
     */
    public com.google.privacy.dlp.v2.FieldId.Builder addIdentifyingFieldsBuilder(int index) {
      return getIdentifyingFieldsFieldBuilder()
          .addBuilder(index, com.google.privacy.dlp.v2.FieldId.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The columns that are the primary keys for table objects included in
     * ContentItem. A copy of this cell's value will stored alongside alongside
     * each finding so that the finding can be traced to the specific row it came
     * from. No more than 3 may be provided.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2.FieldId.Builder>
        getIdentifyingFieldsBuilderList() {
      return getIdentifyingFieldsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2.FieldId,
            com.google.privacy.dlp.v2.FieldId.Builder,
            com.google.privacy.dlp.v2.FieldIdOrBuilder>
        getIdentifyingFieldsFieldBuilder() {
      if (identifyingFieldsBuilder_ == null) {
        identifyingFieldsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.privacy.dlp.v2.FieldId,
                com.google.privacy.dlp.v2.FieldId.Builder,
                com.google.privacy.dlp.v2.FieldIdOrBuilder>(
                identifyingFields_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        identifyingFields_ = null;
      }
      return identifyingFieldsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.TableOptions)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.TableOptions)
  private static final com.google.privacy.dlp.v2.TableOptions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.TableOptions();
  }

  public static com.google.privacy.dlp.v2.TableOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TableOptions> PARSER =
      new com.google.protobuf.AbstractParser<TableOptions>() {
        @java.lang.Override
        public TableOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<TableOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TableOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.TableOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
