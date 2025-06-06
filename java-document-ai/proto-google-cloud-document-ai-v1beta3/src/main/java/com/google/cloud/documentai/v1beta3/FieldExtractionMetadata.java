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
// source: google/cloud/documentai/v1beta3/document_schema.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.documentai.v1beta3;

/**
 *
 *
 * <pre>
 * Metadata for how this field value is extracted.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1beta3.FieldExtractionMetadata}
 */
public final class FieldExtractionMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1beta3.FieldExtractionMetadata)
    FieldExtractionMetadataOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use FieldExtractionMetadata.newBuilder() to construct.
  private FieldExtractionMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FieldExtractionMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FieldExtractionMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.documentai.v1beta3.DocumentAiDocumentSchema
        .internal_static_google_cloud_documentai_v1beta3_FieldExtractionMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1beta3.DocumentAiDocumentSchema
        .internal_static_google_cloud_documentai_v1beta3_FieldExtractionMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1beta3.FieldExtractionMetadata.class,
            com.google.cloud.documentai.v1beta3.FieldExtractionMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int SUMMARY_OPTIONS_FIELD_NUMBER = 2;
  private com.google.cloud.documentai.v1beta3.SummaryOptions summaryOptions_;

  /**
   *
   *
   * <pre>
   * Summary options config.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.SummaryOptions summary_options = 2;</code>
   *
   * @return Whether the summaryOptions field is set.
   */
  @java.lang.Override
  public boolean hasSummaryOptions() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Summary options config.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.SummaryOptions summary_options = 2;</code>
   *
   * @return The summaryOptions.
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.SummaryOptions getSummaryOptions() {
    return summaryOptions_ == null
        ? com.google.cloud.documentai.v1beta3.SummaryOptions.getDefaultInstance()
        : summaryOptions_;
  }

  /**
   *
   *
   * <pre>
   * Summary options config.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.SummaryOptions summary_options = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.SummaryOptionsOrBuilder getSummaryOptionsOrBuilder() {
    return summaryOptions_ == null
        ? com.google.cloud.documentai.v1beta3.SummaryOptions.getDefaultInstance()
        : summaryOptions_;
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
      output.writeMessage(2, getSummaryOptions());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSummaryOptions());
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
    if (!(obj instanceof com.google.cloud.documentai.v1beta3.FieldExtractionMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1beta3.FieldExtractionMetadata other =
        (com.google.cloud.documentai.v1beta3.FieldExtractionMetadata) obj;

    if (hasSummaryOptions() != other.hasSummaryOptions()) return false;
    if (hasSummaryOptions()) {
      if (!getSummaryOptions().equals(other.getSummaryOptions())) return false;
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
    if (hasSummaryOptions()) {
      hash = (37 * hash) + SUMMARY_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getSummaryOptions().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1beta3.FieldExtractionMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta3.FieldExtractionMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.FieldExtractionMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta3.FieldExtractionMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.FieldExtractionMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta3.FieldExtractionMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.FieldExtractionMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta3.FieldExtractionMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.FieldExtractionMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta3.FieldExtractionMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.FieldExtractionMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta3.FieldExtractionMetadata parseFrom(
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
      com.google.cloud.documentai.v1beta3.FieldExtractionMetadata prototype) {
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
   * Metadata for how this field value is extracted.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1beta3.FieldExtractionMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1beta3.FieldExtractionMetadata)
      com.google.cloud.documentai.v1beta3.FieldExtractionMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.documentai.v1beta3.DocumentAiDocumentSchema
          .internal_static_google_cloud_documentai_v1beta3_FieldExtractionMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1beta3.DocumentAiDocumentSchema
          .internal_static_google_cloud_documentai_v1beta3_FieldExtractionMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1beta3.FieldExtractionMetadata.class,
              com.google.cloud.documentai.v1beta3.FieldExtractionMetadata.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1beta3.FieldExtractionMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSummaryOptionsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      summaryOptions_ = null;
      if (summaryOptionsBuilder_ != null) {
        summaryOptionsBuilder_.dispose();
        summaryOptionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.documentai.v1beta3.DocumentAiDocumentSchema
          .internal_static_google_cloud_documentai_v1beta3_FieldExtractionMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.FieldExtractionMetadata getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1beta3.FieldExtractionMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.FieldExtractionMetadata build() {
      com.google.cloud.documentai.v1beta3.FieldExtractionMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.FieldExtractionMetadata buildPartial() {
      com.google.cloud.documentai.v1beta3.FieldExtractionMetadata result =
          new com.google.cloud.documentai.v1beta3.FieldExtractionMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.documentai.v1beta3.FieldExtractionMetadata result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.summaryOptions_ =
            summaryOptionsBuilder_ == null ? summaryOptions_ : summaryOptionsBuilder_.build();
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
      if (other instanceof com.google.cloud.documentai.v1beta3.FieldExtractionMetadata) {
        return mergeFrom((com.google.cloud.documentai.v1beta3.FieldExtractionMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1beta3.FieldExtractionMetadata other) {
      if (other == com.google.cloud.documentai.v1beta3.FieldExtractionMetadata.getDefaultInstance())
        return this;
      if (other.hasSummaryOptions()) {
        mergeSummaryOptions(other.getSummaryOptions());
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
            case 18:
              {
                input.readMessage(getSummaryOptionsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.cloud.documentai.v1beta3.SummaryOptions summaryOptions_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta3.SummaryOptions,
            com.google.cloud.documentai.v1beta3.SummaryOptions.Builder,
            com.google.cloud.documentai.v1beta3.SummaryOptionsOrBuilder>
        summaryOptionsBuilder_;

    /**
     *
     *
     * <pre>
     * Summary options config.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.SummaryOptions summary_options = 2;</code>
     *
     * @return Whether the summaryOptions field is set.
     */
    public boolean hasSummaryOptions() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Summary options config.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.SummaryOptions summary_options = 2;</code>
     *
     * @return The summaryOptions.
     */
    public com.google.cloud.documentai.v1beta3.SummaryOptions getSummaryOptions() {
      if (summaryOptionsBuilder_ == null) {
        return summaryOptions_ == null
            ? com.google.cloud.documentai.v1beta3.SummaryOptions.getDefaultInstance()
            : summaryOptions_;
      } else {
        return summaryOptionsBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Summary options config.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.SummaryOptions summary_options = 2;</code>
     */
    public Builder setSummaryOptions(com.google.cloud.documentai.v1beta3.SummaryOptions value) {
      if (summaryOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        summaryOptions_ = value;
      } else {
        summaryOptionsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Summary options config.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.SummaryOptions summary_options = 2;</code>
     */
    public Builder setSummaryOptions(
        com.google.cloud.documentai.v1beta3.SummaryOptions.Builder builderForValue) {
      if (summaryOptionsBuilder_ == null) {
        summaryOptions_ = builderForValue.build();
      } else {
        summaryOptionsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Summary options config.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.SummaryOptions summary_options = 2;</code>
     */
    public Builder mergeSummaryOptions(com.google.cloud.documentai.v1beta3.SummaryOptions value) {
      if (summaryOptionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && summaryOptions_ != null
            && summaryOptions_
                != com.google.cloud.documentai.v1beta3.SummaryOptions.getDefaultInstance()) {
          getSummaryOptionsBuilder().mergeFrom(value);
        } else {
          summaryOptions_ = value;
        }
      } else {
        summaryOptionsBuilder_.mergeFrom(value);
      }
      if (summaryOptions_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Summary options config.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.SummaryOptions summary_options = 2;</code>
     */
    public Builder clearSummaryOptions() {
      bitField0_ = (bitField0_ & ~0x00000001);
      summaryOptions_ = null;
      if (summaryOptionsBuilder_ != null) {
        summaryOptionsBuilder_.dispose();
        summaryOptionsBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Summary options config.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.SummaryOptions summary_options = 2;</code>
     */
    public com.google.cloud.documentai.v1beta3.SummaryOptions.Builder getSummaryOptionsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSummaryOptionsFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Summary options config.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.SummaryOptions summary_options = 2;</code>
     */
    public com.google.cloud.documentai.v1beta3.SummaryOptionsOrBuilder
        getSummaryOptionsOrBuilder() {
      if (summaryOptionsBuilder_ != null) {
        return summaryOptionsBuilder_.getMessageOrBuilder();
      } else {
        return summaryOptions_ == null
            ? com.google.cloud.documentai.v1beta3.SummaryOptions.getDefaultInstance()
            : summaryOptions_;
      }
    }

    /**
     *
     *
     * <pre>
     * Summary options config.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.SummaryOptions summary_options = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta3.SummaryOptions,
            com.google.cloud.documentai.v1beta3.SummaryOptions.Builder,
            com.google.cloud.documentai.v1beta3.SummaryOptionsOrBuilder>
        getSummaryOptionsFieldBuilder() {
      if (summaryOptionsBuilder_ == null) {
        summaryOptionsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.documentai.v1beta3.SummaryOptions,
                com.google.cloud.documentai.v1beta3.SummaryOptions.Builder,
                com.google.cloud.documentai.v1beta3.SummaryOptionsOrBuilder>(
                getSummaryOptions(), getParentForChildren(), isClean());
        summaryOptions_ = null;
      }
      return summaryOptionsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1beta3.FieldExtractionMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta3.FieldExtractionMetadata)
  private static final com.google.cloud.documentai.v1beta3.FieldExtractionMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1beta3.FieldExtractionMetadata();
  }

  public static com.google.cloud.documentai.v1beta3.FieldExtractionMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FieldExtractionMetadata> PARSER =
      new com.google.protobuf.AbstractParser<FieldExtractionMetadata>() {
        @java.lang.Override
        public FieldExtractionMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<FieldExtractionMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FieldExtractionMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.FieldExtractionMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
