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
// source: google/cloud/dialogflow/v2/conversation_model.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * Metadata for article suggestion models.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata}
 */
public final class ArticleSuggestionModelMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata)
    ArticleSuggestionModelMetadataOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ArticleSuggestionModelMetadata.newBuilder() to construct.
  private ArticleSuggestionModelMetadata(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ArticleSuggestionModelMetadata() {
    trainingModelType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ArticleSuggestionModelMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.ConversationModelProto
        .internal_static_google_cloud_dialogflow_v2_ArticleSuggestionModelMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ConversationModelProto
        .internal_static_google_cloud_dialogflow_v2_ArticleSuggestionModelMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata.class,
            com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata.Builder.class);
  }

  public static final int TRAINING_MODEL_TYPE_FIELD_NUMBER = 3;
  private int trainingModelType_ = 0;

  /**
   *
   *
   * <pre>
   * Optional. Type of the article suggestion model. If not provided, model_type
   * is used.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationModel.ModelType training_model_type = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for trainingModelType.
   */
  @java.lang.Override
  public int getTrainingModelTypeValue() {
    return trainingModelType_;
  }

  /**
   *
   *
   * <pre>
   * Optional. Type of the article suggestion model. If not provided, model_type
   * is used.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationModel.ModelType training_model_type = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The trainingModelType.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ConversationModel.ModelType getTrainingModelType() {
    com.google.cloud.dialogflow.v2.ConversationModel.ModelType result =
        com.google.cloud.dialogflow.v2.ConversationModel.ModelType.forNumber(trainingModelType_);
    return result == null
        ? com.google.cloud.dialogflow.v2.ConversationModel.ModelType.UNRECOGNIZED
        : result;
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
    if (trainingModelType_
        != com.google.cloud.dialogflow.v2.ConversationModel.ModelType.MODEL_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, trainingModelType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (trainingModelType_
        != com.google.cloud.dialogflow.v2.ConversationModel.ModelType.MODEL_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, trainingModelType_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata other =
        (com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata) obj;

    if (trainingModelType_ != other.trainingModelType_) return false;
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
    hash = (37 * hash) + TRAINING_MODEL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + trainingModelType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata parseFrom(
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
      com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata prototype) {
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
   * Metadata for article suggestion models.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata)
      com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.ConversationModelProto
          .internal_static_google_cloud_dialogflow_v2_ArticleSuggestionModelMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ConversationModelProto
          .internal_static_google_cloud_dialogflow_v2_ArticleSuggestionModelMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata.class,
              com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      trainingModelType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ConversationModelProto
          .internal_static_google_cloud_dialogflow_v2_ArticleSuggestionModelMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata build() {
      com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata buildPartial() {
      com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata result =
          new com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.trainingModelType_ = trainingModelType_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata) {
        return mergeFrom((com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata other) {
      if (other
          == com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata.getDefaultInstance())
        return this;
      if (other.trainingModelType_ != 0) {
        setTrainingModelTypeValue(other.getTrainingModelTypeValue());
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
            case 24:
              {
                trainingModelType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 24
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

    private int trainingModelType_ = 0;

    /**
     *
     *
     * <pre>
     * Optional. Type of the article suggestion model. If not provided, model_type
     * is used.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationModel.ModelType training_model_type = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for trainingModelType.
     */
    @java.lang.Override
    public int getTrainingModelTypeValue() {
      return trainingModelType_;
    }

    /**
     *
     *
     * <pre>
     * Optional. Type of the article suggestion model. If not provided, model_type
     * is used.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationModel.ModelType training_model_type = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for trainingModelType to set.
     * @return This builder for chaining.
     */
    public Builder setTrainingModelTypeValue(int value) {
      trainingModelType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Type of the article suggestion model. If not provided, model_type
     * is used.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationModel.ModelType training_model_type = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The trainingModelType.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ConversationModel.ModelType getTrainingModelType() {
      com.google.cloud.dialogflow.v2.ConversationModel.ModelType result =
          com.google.cloud.dialogflow.v2.ConversationModel.ModelType.forNumber(trainingModelType_);
      return result == null
          ? com.google.cloud.dialogflow.v2.ConversationModel.ModelType.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * Optional. Type of the article suggestion model. If not provided, model_type
     * is used.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationModel.ModelType training_model_type = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The trainingModelType to set.
     * @return This builder for chaining.
     */
    public Builder setTrainingModelType(
        com.google.cloud.dialogflow.v2.ConversationModel.ModelType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      trainingModelType_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Type of the article suggestion model. If not provided, model_type
     * is used.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationModel.ModelType training_model_type = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTrainingModelType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      trainingModelType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata)
  private static final com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata();
  }

  public static com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ArticleSuggestionModelMetadata> PARSER =
      new com.google.protobuf.AbstractParser<ArticleSuggestionModelMetadata>() {
        @java.lang.Override
        public ArticleSuggestionModelMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<ArticleSuggestionModelMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ArticleSuggestionModelMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
