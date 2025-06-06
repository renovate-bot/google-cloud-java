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
// source: google/cloud/automl/v1/io.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.automl.v1;

/**
 *
 *
 * <pre>
 * Input configuration of a [Document][google.cloud.automl.v1.Document].
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1.DocumentInputConfig}
 */
public final class DocumentInputConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1.DocumentInputConfig)
    DocumentInputConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use DocumentInputConfig.newBuilder() to construct.
  private DocumentInputConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DocumentInputConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DocumentInputConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1.Io
        .internal_static_google_cloud_automl_v1_DocumentInputConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1.Io
        .internal_static_google_cloud_automl_v1_DocumentInputConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1.DocumentInputConfig.class,
            com.google.cloud.automl.v1.DocumentInputConfig.Builder.class);
  }

  private int bitField0_;
  public static final int GCS_SOURCE_FIELD_NUMBER = 1;
  private com.google.cloud.automl.v1.GcsSource gcsSource_;

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location of the document file. Only a single path
   * should be given.
   *
   * Max supported size: 512MB.
   *
   * Supported extensions: .PDF.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  @java.lang.Override
  public boolean hasGcsSource() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location of the document file. Only a single path
   * should be given.
   *
   * Max supported size: 512MB.
   *
   * Supported extensions: .PDF.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
   *
   * @return The gcsSource.
   */
  @java.lang.Override
  public com.google.cloud.automl.v1.GcsSource getGcsSource() {
    return gcsSource_ == null
        ? com.google.cloud.automl.v1.GcsSource.getDefaultInstance()
        : gcsSource_;
  }

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location of the document file. Only a single path
   * should be given.
   *
   * Max supported size: 512MB.
   *
   * Supported extensions: .PDF.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.automl.v1.GcsSourceOrBuilder getGcsSourceOrBuilder() {
    return gcsSource_ == null
        ? com.google.cloud.automl.v1.GcsSource.getDefaultInstance()
        : gcsSource_;
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
      output.writeMessage(1, getGcsSource());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getGcsSource());
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
    if (!(obj instanceof com.google.cloud.automl.v1.DocumentInputConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1.DocumentInputConfig other =
        (com.google.cloud.automl.v1.DocumentInputConfig) obj;

    if (hasGcsSource() != other.hasGcsSource()) return false;
    if (hasGcsSource()) {
      if (!getGcsSource().equals(other.getGcsSource())) return false;
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
    if (hasGcsSource()) {
      hash = (37 * hash) + GCS_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getGcsSource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1.DocumentInputConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.DocumentInputConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.DocumentInputConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.DocumentInputConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.DocumentInputConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.DocumentInputConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.DocumentInputConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.DocumentInputConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.DocumentInputConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.DocumentInputConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.DocumentInputConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.DocumentInputConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.automl.v1.DocumentInputConfig prototype) {
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
   * Input configuration of a [Document][google.cloud.automl.v1.Document].
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1.DocumentInputConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1.DocumentInputConfig)
      com.google.cloud.automl.v1.DocumentInputConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1.Io
          .internal_static_google_cloud_automl_v1_DocumentInputConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1.Io
          .internal_static_google_cloud_automl_v1_DocumentInputConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1.DocumentInputConfig.class,
              com.google.cloud.automl.v1.DocumentInputConfig.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1.DocumentInputConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getGcsSourceFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      gcsSource_ = null;
      if (gcsSourceBuilder_ != null) {
        gcsSourceBuilder_.dispose();
        gcsSourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1.Io
          .internal_static_google_cloud_automl_v1_DocumentInputConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.DocumentInputConfig getDefaultInstanceForType() {
      return com.google.cloud.automl.v1.DocumentInputConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.DocumentInputConfig build() {
      com.google.cloud.automl.v1.DocumentInputConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.DocumentInputConfig buildPartial() {
      com.google.cloud.automl.v1.DocumentInputConfig result =
          new com.google.cloud.automl.v1.DocumentInputConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.automl.v1.DocumentInputConfig result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.gcsSource_ = gcsSourceBuilder_ == null ? gcsSource_ : gcsSourceBuilder_.build();
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
      if (other instanceof com.google.cloud.automl.v1.DocumentInputConfig) {
        return mergeFrom((com.google.cloud.automl.v1.DocumentInputConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1.DocumentInputConfig other) {
      if (other == com.google.cloud.automl.v1.DocumentInputConfig.getDefaultInstance()) return this;
      if (other.hasGcsSource()) {
        mergeGcsSource(other.getGcsSource());
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
                input.readMessage(getGcsSourceFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.cloud.automl.v1.GcsSource gcsSource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1.GcsSource,
            com.google.cloud.automl.v1.GcsSource.Builder,
            com.google.cloud.automl.v1.GcsSourceOrBuilder>
        gcsSourceBuilder_;

    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location of the document file. Only a single path
     * should be given.
     *
     * Max supported size: 512MB.
     *
     * Supported extensions: .PDF.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
     *
     * @return Whether the gcsSource field is set.
     */
    public boolean hasGcsSource() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location of the document file. Only a single path
     * should be given.
     *
     * Max supported size: 512MB.
     *
     * Supported extensions: .PDF.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
     *
     * @return The gcsSource.
     */
    public com.google.cloud.automl.v1.GcsSource getGcsSource() {
      if (gcsSourceBuilder_ == null) {
        return gcsSource_ == null
            ? com.google.cloud.automl.v1.GcsSource.getDefaultInstance()
            : gcsSource_;
      } else {
        return gcsSourceBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location of the document file. Only a single path
     * should be given.
     *
     * Max supported size: 512MB.
     *
     * Supported extensions: .PDF.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
     */
    public Builder setGcsSource(com.google.cloud.automl.v1.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gcsSource_ = value;
      } else {
        gcsSourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location of the document file. Only a single path
     * should be given.
     *
     * Max supported size: 512MB.
     *
     * Supported extensions: .PDF.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
     */
    public Builder setGcsSource(com.google.cloud.automl.v1.GcsSource.Builder builderForValue) {
      if (gcsSourceBuilder_ == null) {
        gcsSource_ = builderForValue.build();
      } else {
        gcsSourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location of the document file. Only a single path
     * should be given.
     *
     * Max supported size: 512MB.
     *
     * Supported extensions: .PDF.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
     */
    public Builder mergeGcsSource(com.google.cloud.automl.v1.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && gcsSource_ != null
            && gcsSource_ != com.google.cloud.automl.v1.GcsSource.getDefaultInstance()) {
          getGcsSourceBuilder().mergeFrom(value);
        } else {
          gcsSource_ = value;
        }
      } else {
        gcsSourceBuilder_.mergeFrom(value);
      }
      if (gcsSource_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location of the document file. Only a single path
     * should be given.
     *
     * Max supported size: 512MB.
     *
     * Supported extensions: .PDF.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
     */
    public Builder clearGcsSource() {
      bitField0_ = (bitField0_ & ~0x00000001);
      gcsSource_ = null;
      if (gcsSourceBuilder_ != null) {
        gcsSourceBuilder_.dispose();
        gcsSourceBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location of the document file. Only a single path
     * should be given.
     *
     * Max supported size: 512MB.
     *
     * Supported extensions: .PDF.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
     */
    public com.google.cloud.automl.v1.GcsSource.Builder getGcsSourceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGcsSourceFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location of the document file. Only a single path
     * should be given.
     *
     * Max supported size: 512MB.
     *
     * Supported extensions: .PDF.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
     */
    public com.google.cloud.automl.v1.GcsSourceOrBuilder getGcsSourceOrBuilder() {
      if (gcsSourceBuilder_ != null) {
        return gcsSourceBuilder_.getMessageOrBuilder();
      } else {
        return gcsSource_ == null
            ? com.google.cloud.automl.v1.GcsSource.getDefaultInstance()
            : gcsSource_;
      }
    }

    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location of the document file. Only a single path
     * should be given.
     *
     * Max supported size: 512MB.
     *
     * Supported extensions: .PDF.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1.GcsSource,
            com.google.cloud.automl.v1.GcsSource.Builder,
            com.google.cloud.automl.v1.GcsSourceOrBuilder>
        getGcsSourceFieldBuilder() {
      if (gcsSourceBuilder_ == null) {
        gcsSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.automl.v1.GcsSource,
                com.google.cloud.automl.v1.GcsSource.Builder,
                com.google.cloud.automl.v1.GcsSourceOrBuilder>(
                getGcsSource(), getParentForChildren(), isClean());
        gcsSource_ = null;
      }
      return gcsSourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1.DocumentInputConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1.DocumentInputConfig)
  private static final com.google.cloud.automl.v1.DocumentInputConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1.DocumentInputConfig();
  }

  public static com.google.cloud.automl.v1.DocumentInputConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentInputConfig> PARSER =
      new com.google.protobuf.AbstractParser<DocumentInputConfig>() {
        @java.lang.Override
        public DocumentInputConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<DocumentInputConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentInputConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1.DocumentInputConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
