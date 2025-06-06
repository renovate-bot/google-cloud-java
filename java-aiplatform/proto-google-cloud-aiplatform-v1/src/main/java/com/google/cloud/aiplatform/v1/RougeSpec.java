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
// source: google/cloud/aiplatform/v1/evaluation_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Spec for rouge score metric - calculates the recall of n-grams in prediction
 * as compared to reference - returns a score ranging between 0 and 1.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.RougeSpec}
 */
public final class RougeSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.RougeSpec)
    RougeSpecOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use RougeSpec.newBuilder() to construct.
  private RougeSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RougeSpec() {
    rougeType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RougeSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1_RougeSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1_RougeSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.RougeSpec.class,
            com.google.cloud.aiplatform.v1.RougeSpec.Builder.class);
  }

  public static final int ROUGE_TYPE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object rougeType_ = "";

  /**
   *
   *
   * <pre>
   * Optional. Supported rouge types are rougen[1-9], rougeL, and rougeLsum.
   * </pre>
   *
   * <code>string rouge_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The rougeType.
   */
  @java.lang.Override
  public java.lang.String getRougeType() {
    java.lang.Object ref = rougeType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rougeType_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. Supported rouge types are rougen[1-9], rougeL, and rougeLsum.
   * </pre>
   *
   * <code>string rouge_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for rougeType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRougeTypeBytes() {
    java.lang.Object ref = rougeType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      rougeType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USE_STEMMER_FIELD_NUMBER = 2;
  private boolean useStemmer_ = false;

  /**
   *
   *
   * <pre>
   * Optional. Whether to use stemmer to compute rouge score.
   * </pre>
   *
   * <code>bool use_stemmer = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The useStemmer.
   */
  @java.lang.Override
  public boolean getUseStemmer() {
    return useStemmer_;
  }

  public static final int SPLIT_SUMMARIES_FIELD_NUMBER = 3;
  private boolean splitSummaries_ = false;

  /**
   *
   *
   * <pre>
   * Optional. Whether to split summaries while using rougeLsum.
   * </pre>
   *
   * <code>bool split_summaries = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The splitSummaries.
   */
  @java.lang.Override
  public boolean getSplitSummaries() {
    return splitSummaries_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rougeType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rougeType_);
    }
    if (useStemmer_ != false) {
      output.writeBool(2, useStemmer_);
    }
    if (splitSummaries_ != false) {
      output.writeBool(3, splitSummaries_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rougeType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rougeType_);
    }
    if (useStemmer_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, useStemmer_);
    }
    if (splitSummaries_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, splitSummaries_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.RougeSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.RougeSpec other = (com.google.cloud.aiplatform.v1.RougeSpec) obj;

    if (!getRougeType().equals(other.getRougeType())) return false;
    if (getUseStemmer() != other.getUseStemmer()) return false;
    if (getSplitSummaries() != other.getSplitSummaries()) return false;
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
    hash = (37 * hash) + ROUGE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getRougeType().hashCode();
    hash = (37 * hash) + USE_STEMMER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getUseStemmer());
    hash = (37 * hash) + SPLIT_SUMMARIES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSplitSummaries());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.RougeSpec parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.RougeSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.RougeSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.RougeSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.RougeSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.RougeSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.RougeSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.RougeSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.RougeSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.RougeSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.RougeSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.RougeSpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.RougeSpec prototype) {
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
   * Spec for rouge score metric - calculates the recall of n-grams in prediction
   * as compared to reference - returns a score ranging between 0 and 1.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.RougeSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.RougeSpec)
      com.google.cloud.aiplatform.v1.RougeSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1_RougeSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1_RougeSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.RougeSpec.class,
              com.google.cloud.aiplatform.v1.RougeSpec.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.RougeSpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      rougeType_ = "";
      useStemmer_ = false;
      splitSummaries_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1_RougeSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.RougeSpec getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.RougeSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.RougeSpec build() {
      com.google.cloud.aiplatform.v1.RougeSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.RougeSpec buildPartial() {
      com.google.cloud.aiplatform.v1.RougeSpec result =
          new com.google.cloud.aiplatform.v1.RougeSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.RougeSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rougeType_ = rougeType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.useStemmer_ = useStemmer_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.splitSummaries_ = splitSummaries_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.RougeSpec) {
        return mergeFrom((com.google.cloud.aiplatform.v1.RougeSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.RougeSpec other) {
      if (other == com.google.cloud.aiplatform.v1.RougeSpec.getDefaultInstance()) return this;
      if (!other.getRougeType().isEmpty()) {
        rougeType_ = other.rougeType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getUseStemmer() != false) {
        setUseStemmer(other.getUseStemmer());
      }
      if (other.getSplitSummaries() != false) {
        setSplitSummaries(other.getSplitSummaries());
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
                rougeType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                useStemmer_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                splitSummaries_ = input.readBool();
                bitField0_ |= 0x00000004;
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

    private java.lang.Object rougeType_ = "";

    /**
     *
     *
     * <pre>
     * Optional. Supported rouge types are rougen[1-9], rougeL, and rougeLsum.
     * </pre>
     *
     * <code>string rouge_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The rougeType.
     */
    public java.lang.String getRougeType() {
      java.lang.Object ref = rougeType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rougeType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Supported rouge types are rougen[1-9], rougeL, and rougeLsum.
     * </pre>
     *
     * <code>string rouge_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for rougeType.
     */
    public com.google.protobuf.ByteString getRougeTypeBytes() {
      java.lang.Object ref = rougeType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        rougeType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Supported rouge types are rougen[1-9], rougeL, and rougeLsum.
     * </pre>
     *
     * <code>string rouge_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The rougeType to set.
     * @return This builder for chaining.
     */
    public Builder setRougeType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      rougeType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Supported rouge types are rougen[1-9], rougeL, and rougeLsum.
     * </pre>
     *
     * <code>string rouge_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRougeType() {
      rougeType_ = getDefaultInstance().getRougeType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Supported rouge types are rougen[1-9], rougeL, and rougeLsum.
     * </pre>
     *
     * <code>string rouge_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for rougeType to set.
     * @return This builder for chaining.
     */
    public Builder setRougeTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      rougeType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean useStemmer_;

    /**
     *
     *
     * <pre>
     * Optional. Whether to use stemmer to compute rouge score.
     * </pre>
     *
     * <code>bool use_stemmer = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The useStemmer.
     */
    @java.lang.Override
    public boolean getUseStemmer() {
      return useStemmer_;
    }

    /**
     *
     *
     * <pre>
     * Optional. Whether to use stemmer to compute rouge score.
     * </pre>
     *
     * <code>bool use_stemmer = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The useStemmer to set.
     * @return This builder for chaining.
     */
    public Builder setUseStemmer(boolean value) {

      useStemmer_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Whether to use stemmer to compute rouge score.
     * </pre>
     *
     * <code>bool use_stemmer = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUseStemmer() {
      bitField0_ = (bitField0_ & ~0x00000002);
      useStemmer_ = false;
      onChanged();
      return this;
    }

    private boolean splitSummaries_;

    /**
     *
     *
     * <pre>
     * Optional. Whether to split summaries while using rougeLsum.
     * </pre>
     *
     * <code>bool split_summaries = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The splitSummaries.
     */
    @java.lang.Override
    public boolean getSplitSummaries() {
      return splitSummaries_;
    }

    /**
     *
     *
     * <pre>
     * Optional. Whether to split summaries while using rougeLsum.
     * </pre>
     *
     * <code>bool split_summaries = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The splitSummaries to set.
     * @return This builder for chaining.
     */
    public Builder setSplitSummaries(boolean value) {

      splitSummaries_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Whether to split summaries while using rougeLsum.
     * </pre>
     *
     * <code>bool split_summaries = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSplitSummaries() {
      bitField0_ = (bitField0_ & ~0x00000004);
      splitSummaries_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.RougeSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.RougeSpec)
  private static final com.google.cloud.aiplatform.v1.RougeSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.RougeSpec();
  }

  public static com.google.cloud.aiplatform.v1.RougeSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RougeSpec> PARSER =
      new com.google.protobuf.AbstractParser<RougeSpec>() {
        @java.lang.Override
        public RougeSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<RougeSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RougeSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.RougeSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
