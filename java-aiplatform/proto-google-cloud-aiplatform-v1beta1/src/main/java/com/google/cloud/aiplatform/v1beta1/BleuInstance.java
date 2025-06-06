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
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Spec for bleu instance.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.BleuInstance}
 */
public final class BleuInstance extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.BleuInstance)
    BleuInstanceOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use BleuInstance.newBuilder() to construct.
  private BleuInstance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BleuInstance() {
    prediction_ = "";
    reference_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BleuInstance();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_BleuInstance_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_BleuInstance_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.BleuInstance.class,
            com.google.cloud.aiplatform.v1beta1.BleuInstance.Builder.class);
  }

  private int bitField0_;
  public static final int PREDICTION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object prediction_ = "";

  /**
   *
   *
   * <pre>
   * Required. Output of the evaluated model.
   * </pre>
   *
   * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the prediction field is set.
   */
  @java.lang.Override
  public boolean hasPrediction() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. Output of the evaluated model.
   * </pre>
   *
   * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The prediction.
   */
  @java.lang.Override
  public java.lang.String getPrediction() {
    java.lang.Object ref = prediction_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      prediction_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. Output of the evaluated model.
   * </pre>
   *
   * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for prediction.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPredictionBytes() {
    java.lang.Object ref = prediction_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      prediction_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REFERENCE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object reference_ = "";

  /**
   *
   *
   * <pre>
   * Required. Ground truth used to compare against the prediction.
   * </pre>
   *
   * <code>optional string reference = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the reference field is set.
   */
  @java.lang.Override
  public boolean hasReference() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. Ground truth used to compare against the prediction.
   * </pre>
   *
   * <code>optional string reference = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The reference.
   */
  @java.lang.Override
  public java.lang.String getReference() {
    java.lang.Object ref = reference_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reference_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. Ground truth used to compare against the prediction.
   * </pre>
   *
   * <code>optional string reference = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for reference.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getReferenceBytes() {
    java.lang.Object ref = reference_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      reference_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, prediction_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, reference_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, prediction_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, reference_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.BleuInstance)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.BleuInstance other =
        (com.google.cloud.aiplatform.v1beta1.BleuInstance) obj;

    if (hasPrediction() != other.hasPrediction()) return false;
    if (hasPrediction()) {
      if (!getPrediction().equals(other.getPrediction())) return false;
    }
    if (hasReference() != other.hasReference()) return false;
    if (hasReference()) {
      if (!getReference().equals(other.getReference())) return false;
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
    if (hasPrediction()) {
      hash = (37 * hash) + PREDICTION_FIELD_NUMBER;
      hash = (53 * hash) + getPrediction().hashCode();
    }
    if (hasReference()) {
      hash = (37 * hash) + REFERENCE_FIELD_NUMBER;
      hash = (53 * hash) + getReference().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.BleuInstance parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.BleuInstance parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BleuInstance parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.BleuInstance parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BleuInstance parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.BleuInstance parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BleuInstance parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.BleuInstance parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BleuInstance parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.BleuInstance parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BleuInstance parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.BleuInstance parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.BleuInstance prototype) {
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
   * Spec for bleu instance.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.BleuInstance}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.BleuInstance)
      com.google.cloud.aiplatform.v1beta1.BleuInstanceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_BleuInstance_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_BleuInstance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.BleuInstance.class,
              com.google.cloud.aiplatform.v1beta1.BleuInstance.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.BleuInstance.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      prediction_ = "";
      reference_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_BleuInstance_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.BleuInstance getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.BleuInstance.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.BleuInstance build() {
      com.google.cloud.aiplatform.v1beta1.BleuInstance result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.BleuInstance buildPartial() {
      com.google.cloud.aiplatform.v1beta1.BleuInstance result =
          new com.google.cloud.aiplatform.v1beta1.BleuInstance(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.BleuInstance result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.prediction_ = prediction_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reference_ = reference_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.BleuInstance) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.BleuInstance) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.BleuInstance other) {
      if (other == com.google.cloud.aiplatform.v1beta1.BleuInstance.getDefaultInstance())
        return this;
      if (other.hasPrediction()) {
        prediction_ = other.prediction_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasReference()) {
        reference_ = other.reference_;
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
            case 10:
              {
                prediction_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                reference_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
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

    private java.lang.Object prediction_ = "";

    /**
     *
     *
     * <pre>
     * Required. Output of the evaluated model.
     * </pre>
     *
     * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the prediction field is set.
     */
    public boolean hasPrediction() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. Output of the evaluated model.
     * </pre>
     *
     * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The prediction.
     */
    public java.lang.String getPrediction() {
      java.lang.Object ref = prediction_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        prediction_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Output of the evaluated model.
     * </pre>
     *
     * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for prediction.
     */
    public com.google.protobuf.ByteString getPredictionBytes() {
      java.lang.Object ref = prediction_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        prediction_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Output of the evaluated model.
     * </pre>
     *
     * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The prediction to set.
     * @return This builder for chaining.
     */
    public Builder setPrediction(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      prediction_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Output of the evaluated model.
     * </pre>
     *
     * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrediction() {
      prediction_ = getDefaultInstance().getPrediction();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Output of the evaluated model.
     * </pre>
     *
     * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for prediction to set.
     * @return This builder for chaining.
     */
    public Builder setPredictionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      prediction_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object reference_ = "";

    /**
     *
     *
     * <pre>
     * Required. Ground truth used to compare against the prediction.
     * </pre>
     *
     * <code>optional string reference = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the reference field is set.
     */
    public boolean hasReference() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. Ground truth used to compare against the prediction.
     * </pre>
     *
     * <code>optional string reference = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The reference.
     */
    public java.lang.String getReference() {
      java.lang.Object ref = reference_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reference_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Ground truth used to compare against the prediction.
     * </pre>
     *
     * <code>optional string reference = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for reference.
     */
    public com.google.protobuf.ByteString getReferenceBytes() {
      java.lang.Object ref = reference_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        reference_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Ground truth used to compare against the prediction.
     * </pre>
     *
     * <code>optional string reference = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The reference to set.
     * @return This builder for chaining.
     */
    public Builder setReference(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      reference_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Ground truth used to compare against the prediction.
     * </pre>
     *
     * <code>optional string reference = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearReference() {
      reference_ = getDefaultInstance().getReference();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Ground truth used to compare against the prediction.
     * </pre>
     *
     * <code>optional string reference = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for reference to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      reference_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.BleuInstance)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.BleuInstance)
  private static final com.google.cloud.aiplatform.v1beta1.BleuInstance DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.BleuInstance();
  }

  public static com.google.cloud.aiplatform.v1beta1.BleuInstance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BleuInstance> PARSER =
      new com.google.protobuf.AbstractParser<BleuInstance>() {
        @java.lang.Override
        public BleuInstance parsePartialFrom(
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

  public static com.google.protobuf.Parser<BleuInstance> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BleuInstance> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.BleuInstance getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
