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
// source: google/cloud/speech/v2/locations_metadata.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.speech.v2;

/**
 *
 *
 * <pre>
 * Represents the collection of features belonging to a model
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v2.ModelFeatures}
 */
public final class ModelFeatures extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v2.ModelFeatures)
    ModelFeaturesOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ModelFeatures.newBuilder() to construct.
  private ModelFeatures(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ModelFeatures() {
    modelFeature_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ModelFeatures();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.speech.v2.LocationsMetadataProto
        .internal_static_google_cloud_speech_v2_ModelFeatures_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v2.LocationsMetadataProto
        .internal_static_google_cloud_speech_v2_ModelFeatures_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v2.ModelFeatures.class,
            com.google.cloud.speech.v2.ModelFeatures.Builder.class);
  }

  public static final int MODEL_FEATURE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.speech.v2.ModelFeature> modelFeature_;

  /**
   *
   *
   * <pre>
   * Repeated field that contains all features of the model
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.speech.v2.ModelFeature> getModelFeatureList() {
    return modelFeature_;
  }

  /**
   *
   *
   * <pre>
   * Repeated field that contains all features of the model
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.speech.v2.ModelFeatureOrBuilder>
      getModelFeatureOrBuilderList() {
    return modelFeature_;
  }

  /**
   *
   *
   * <pre>
   * Repeated field that contains all features of the model
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
   */
  @java.lang.Override
  public int getModelFeatureCount() {
    return modelFeature_.size();
  }

  /**
   *
   *
   * <pre>
   * Repeated field that contains all features of the model
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.speech.v2.ModelFeature getModelFeature(int index) {
    return modelFeature_.get(index);
  }

  /**
   *
   *
   * <pre>
   * Repeated field that contains all features of the model
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.speech.v2.ModelFeatureOrBuilder getModelFeatureOrBuilder(int index) {
    return modelFeature_.get(index);
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
    for (int i = 0; i < modelFeature_.size(); i++) {
      output.writeMessage(1, modelFeature_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < modelFeature_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, modelFeature_.get(i));
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
    if (!(obj instanceof com.google.cloud.speech.v2.ModelFeatures)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v2.ModelFeatures other = (com.google.cloud.speech.v2.ModelFeatures) obj;

    if (!getModelFeatureList().equals(other.getModelFeatureList())) return false;
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
    if (getModelFeatureCount() > 0) {
      hash = (37 * hash) + MODEL_FEATURE_FIELD_NUMBER;
      hash = (53 * hash) + getModelFeatureList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v2.ModelFeatures parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.ModelFeatures parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.ModelFeatures parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.ModelFeatures parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.ModelFeatures parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.ModelFeatures parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.ModelFeatures parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.ModelFeatures parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.ModelFeatures parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.ModelFeatures parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.ModelFeatures parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.ModelFeatures parseFrom(
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

  public static Builder newBuilder(com.google.cloud.speech.v2.ModelFeatures prototype) {
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
   * Represents the collection of features belonging to a model
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v2.ModelFeatures}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v2.ModelFeatures)
      com.google.cloud.speech.v2.ModelFeaturesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.speech.v2.LocationsMetadataProto
          .internal_static_google_cloud_speech_v2_ModelFeatures_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v2.LocationsMetadataProto
          .internal_static_google_cloud_speech_v2_ModelFeatures_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v2.ModelFeatures.class,
              com.google.cloud.speech.v2.ModelFeatures.Builder.class);
    }

    // Construct using com.google.cloud.speech.v2.ModelFeatures.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (modelFeatureBuilder_ == null) {
        modelFeature_ = java.util.Collections.emptyList();
      } else {
        modelFeature_ = null;
        modelFeatureBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.speech.v2.LocationsMetadataProto
          .internal_static_google_cloud_speech_v2_ModelFeatures_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.ModelFeatures getDefaultInstanceForType() {
      return com.google.cloud.speech.v2.ModelFeatures.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.ModelFeatures build() {
      com.google.cloud.speech.v2.ModelFeatures result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.ModelFeatures buildPartial() {
      com.google.cloud.speech.v2.ModelFeatures result =
          new com.google.cloud.speech.v2.ModelFeatures(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.speech.v2.ModelFeatures result) {
      if (modelFeatureBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          modelFeature_ = java.util.Collections.unmodifiableList(modelFeature_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.modelFeature_ = modelFeature_;
      } else {
        result.modelFeature_ = modelFeatureBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.speech.v2.ModelFeatures result) {
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
      if (other instanceof com.google.cloud.speech.v2.ModelFeatures) {
        return mergeFrom((com.google.cloud.speech.v2.ModelFeatures) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v2.ModelFeatures other) {
      if (other == com.google.cloud.speech.v2.ModelFeatures.getDefaultInstance()) return this;
      if (modelFeatureBuilder_ == null) {
        if (!other.modelFeature_.isEmpty()) {
          if (modelFeature_.isEmpty()) {
            modelFeature_ = other.modelFeature_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureModelFeatureIsMutable();
            modelFeature_.addAll(other.modelFeature_);
          }
          onChanged();
        }
      } else {
        if (!other.modelFeature_.isEmpty()) {
          if (modelFeatureBuilder_.isEmpty()) {
            modelFeatureBuilder_.dispose();
            modelFeatureBuilder_ = null;
            modelFeature_ = other.modelFeature_;
            bitField0_ = (bitField0_ & ~0x00000001);
            modelFeatureBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getModelFeatureFieldBuilder()
                    : null;
          } else {
            modelFeatureBuilder_.addAllMessages(other.modelFeature_);
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
                com.google.cloud.speech.v2.ModelFeature m =
                    input.readMessage(
                        com.google.cloud.speech.v2.ModelFeature.parser(), extensionRegistry);
                if (modelFeatureBuilder_ == null) {
                  ensureModelFeatureIsMutable();
                  modelFeature_.add(m);
                } else {
                  modelFeatureBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.speech.v2.ModelFeature> modelFeature_ =
        java.util.Collections.emptyList();

    private void ensureModelFeatureIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        modelFeature_ =
            new java.util.ArrayList<com.google.cloud.speech.v2.ModelFeature>(modelFeature_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.speech.v2.ModelFeature,
            com.google.cloud.speech.v2.ModelFeature.Builder,
            com.google.cloud.speech.v2.ModelFeatureOrBuilder>
        modelFeatureBuilder_;

    /**
     *
     *
     * <pre>
     * Repeated field that contains all features of the model
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
     */
    public java.util.List<com.google.cloud.speech.v2.ModelFeature> getModelFeatureList() {
      if (modelFeatureBuilder_ == null) {
        return java.util.Collections.unmodifiableList(modelFeature_);
      } else {
        return modelFeatureBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * Repeated field that contains all features of the model
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
     */
    public int getModelFeatureCount() {
      if (modelFeatureBuilder_ == null) {
        return modelFeature_.size();
      } else {
        return modelFeatureBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * Repeated field that contains all features of the model
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
     */
    public com.google.cloud.speech.v2.ModelFeature getModelFeature(int index) {
      if (modelFeatureBuilder_ == null) {
        return modelFeature_.get(index);
      } else {
        return modelFeatureBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Repeated field that contains all features of the model
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
     */
    public Builder setModelFeature(int index, com.google.cloud.speech.v2.ModelFeature value) {
      if (modelFeatureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelFeatureIsMutable();
        modelFeature_.set(index, value);
        onChanged();
      } else {
        modelFeatureBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Repeated field that contains all features of the model
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
     */
    public Builder setModelFeature(
        int index, com.google.cloud.speech.v2.ModelFeature.Builder builderForValue) {
      if (modelFeatureBuilder_ == null) {
        ensureModelFeatureIsMutable();
        modelFeature_.set(index, builderForValue.build());
        onChanged();
      } else {
        modelFeatureBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Repeated field that contains all features of the model
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
     */
    public Builder addModelFeature(com.google.cloud.speech.v2.ModelFeature value) {
      if (modelFeatureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelFeatureIsMutable();
        modelFeature_.add(value);
        onChanged();
      } else {
        modelFeatureBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Repeated field that contains all features of the model
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
     */
    public Builder addModelFeature(int index, com.google.cloud.speech.v2.ModelFeature value) {
      if (modelFeatureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelFeatureIsMutable();
        modelFeature_.add(index, value);
        onChanged();
      } else {
        modelFeatureBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Repeated field that contains all features of the model
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
     */
    public Builder addModelFeature(
        com.google.cloud.speech.v2.ModelFeature.Builder builderForValue) {
      if (modelFeatureBuilder_ == null) {
        ensureModelFeatureIsMutable();
        modelFeature_.add(builderForValue.build());
        onChanged();
      } else {
        modelFeatureBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Repeated field that contains all features of the model
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
     */
    public Builder addModelFeature(
        int index, com.google.cloud.speech.v2.ModelFeature.Builder builderForValue) {
      if (modelFeatureBuilder_ == null) {
        ensureModelFeatureIsMutable();
        modelFeature_.add(index, builderForValue.build());
        onChanged();
      } else {
        modelFeatureBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Repeated field that contains all features of the model
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
     */
    public Builder addAllModelFeature(
        java.lang.Iterable<? extends com.google.cloud.speech.v2.ModelFeature> values) {
      if (modelFeatureBuilder_ == null) {
        ensureModelFeatureIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, modelFeature_);
        onChanged();
      } else {
        modelFeatureBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Repeated field that contains all features of the model
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
     */
    public Builder clearModelFeature() {
      if (modelFeatureBuilder_ == null) {
        modelFeature_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        modelFeatureBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Repeated field that contains all features of the model
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
     */
    public Builder removeModelFeature(int index) {
      if (modelFeatureBuilder_ == null) {
        ensureModelFeatureIsMutable();
        modelFeature_.remove(index);
        onChanged();
      } else {
        modelFeatureBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Repeated field that contains all features of the model
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
     */
    public com.google.cloud.speech.v2.ModelFeature.Builder getModelFeatureBuilder(int index) {
      return getModelFeatureFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * Repeated field that contains all features of the model
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
     */
    public com.google.cloud.speech.v2.ModelFeatureOrBuilder getModelFeatureOrBuilder(int index) {
      if (modelFeatureBuilder_ == null) {
        return modelFeature_.get(index);
      } else {
        return modelFeatureBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Repeated field that contains all features of the model
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.speech.v2.ModelFeatureOrBuilder>
        getModelFeatureOrBuilderList() {
      if (modelFeatureBuilder_ != null) {
        return modelFeatureBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(modelFeature_);
      }
    }

    /**
     *
     *
     * <pre>
     * Repeated field that contains all features of the model
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
     */
    public com.google.cloud.speech.v2.ModelFeature.Builder addModelFeatureBuilder() {
      return getModelFeatureFieldBuilder()
          .addBuilder(com.google.cloud.speech.v2.ModelFeature.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Repeated field that contains all features of the model
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
     */
    public com.google.cloud.speech.v2.ModelFeature.Builder addModelFeatureBuilder(int index) {
      return getModelFeatureFieldBuilder()
          .addBuilder(index, com.google.cloud.speech.v2.ModelFeature.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Repeated field that contains all features of the model
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.ModelFeature model_feature = 1;</code>
     */
    public java.util.List<com.google.cloud.speech.v2.ModelFeature.Builder>
        getModelFeatureBuilderList() {
      return getModelFeatureFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.speech.v2.ModelFeature,
            com.google.cloud.speech.v2.ModelFeature.Builder,
            com.google.cloud.speech.v2.ModelFeatureOrBuilder>
        getModelFeatureFieldBuilder() {
      if (modelFeatureBuilder_ == null) {
        modelFeatureBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.speech.v2.ModelFeature,
                com.google.cloud.speech.v2.ModelFeature.Builder,
                com.google.cloud.speech.v2.ModelFeatureOrBuilder>(
                modelFeature_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        modelFeature_ = null;
      }
      return modelFeatureBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v2.ModelFeatures)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v2.ModelFeatures)
  private static final com.google.cloud.speech.v2.ModelFeatures DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v2.ModelFeatures();
  }

  public static com.google.cloud.speech.v2.ModelFeatures getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModelFeatures> PARSER =
      new com.google.protobuf.AbstractParser<ModelFeatures>() {
        @java.lang.Override
        public ModelFeatures parsePartialFrom(
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

  public static com.google.protobuf.Parser<ModelFeatures> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModelFeatures> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v2.ModelFeatures getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
