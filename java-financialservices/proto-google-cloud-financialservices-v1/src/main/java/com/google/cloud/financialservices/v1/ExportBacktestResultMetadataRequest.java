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
// source: google/cloud/financialservices/v1/backtest_result.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.financialservices.v1;

/**
 *
 *
 * <pre>
 * Request for exporting BacktestResult metadata.
 * </pre>
 *
 * Protobuf type {@code google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest}
 */
public final class ExportBacktestResultMetadataRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest)
    ExportBacktestResultMetadataRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ExportBacktestResultMetadataRequest.newBuilder() to construct.
  private ExportBacktestResultMetadataRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExportBacktestResultMetadataRequest() {
    backtestResult_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExportBacktestResultMetadataRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.financialservices.v1.BacktestResultProto
        .internal_static_google_cloud_financialservices_v1_ExportBacktestResultMetadataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.financialservices.v1.BacktestResultProto
        .internal_static_google_cloud_financialservices_v1_ExportBacktestResultMetadataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest.class,
            com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest.Builder
                .class);
  }

  private int bitField0_;
  public static final int BACKTEST_RESULT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object backtestResult_ = "";

  /**
   *
   *
   * <pre>
   * Required. The resource name of the BacktestResult.
   * </pre>
   *
   * <code>
   * string backtest_result = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The backtestResult.
   */
  @java.lang.Override
  public java.lang.String getBacktestResult() {
    java.lang.Object ref = backtestResult_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      backtestResult_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The resource name of the BacktestResult.
   * </pre>
   *
   * <code>
   * string backtest_result = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for backtestResult.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBacktestResultBytes() {
    java.lang.Object ref = backtestResult_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      backtestResult_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STRUCTURED_METADATA_DESTINATION_FIELD_NUMBER = 2;
  private com.google.cloud.financialservices.v1.BigQueryDestination structuredMetadataDestination_;

  /**
   *
   *
   * <pre>
   * Required. BigQuery output where the metadata will be written.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.BigQueryDestination structured_metadata_destination = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the structuredMetadataDestination field is set.
   */
  @java.lang.Override
  public boolean hasStructuredMetadataDestination() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. BigQuery output where the metadata will be written.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.BigQueryDestination structured_metadata_destination = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The structuredMetadataDestination.
   */
  @java.lang.Override
  public com.google.cloud.financialservices.v1.BigQueryDestination
      getStructuredMetadataDestination() {
    return structuredMetadataDestination_ == null
        ? com.google.cloud.financialservices.v1.BigQueryDestination.getDefaultInstance()
        : structuredMetadataDestination_;
  }

  /**
   *
   *
   * <pre>
   * Required. BigQuery output where the metadata will be written.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.BigQueryDestination structured_metadata_destination = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.financialservices.v1.BigQueryDestinationOrBuilder
      getStructuredMetadataDestinationOrBuilder() {
    return structuredMetadataDestination_ == null
        ? com.google.cloud.financialservices.v1.BigQueryDestination.getDefaultInstance()
        : structuredMetadataDestination_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(backtestResult_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, backtestResult_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getStructuredMetadataDestination());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(backtestResult_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, backtestResult_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, getStructuredMetadataDestination());
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
    if (!(obj
        instanceof com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest other =
        (com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest) obj;

    if (!getBacktestResult().equals(other.getBacktestResult())) return false;
    if (hasStructuredMetadataDestination() != other.hasStructuredMetadataDestination())
      return false;
    if (hasStructuredMetadataDestination()) {
      if (!getStructuredMetadataDestination().equals(other.getStructuredMetadataDestination()))
        return false;
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
    hash = (37 * hash) + BACKTEST_RESULT_FIELD_NUMBER;
    hash = (53 * hash) + getBacktestResult().hashCode();
    if (hasStructuredMetadataDestination()) {
      hash = (37 * hash) + STRUCTURED_METADATA_DESTINATION_FIELD_NUMBER;
      hash = (53 * hash) + getStructuredMetadataDestination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest parseFrom(
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
      com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest prototype) {
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
   * Request for exporting BacktestResult metadata.
   * </pre>
   *
   * Protobuf type {@code google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest)
      com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.financialservices.v1.BacktestResultProto
          .internal_static_google_cloud_financialservices_v1_ExportBacktestResultMetadataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.financialservices.v1.BacktestResultProto
          .internal_static_google_cloud_financialservices_v1_ExportBacktestResultMetadataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest.class,
              com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getStructuredMetadataDestinationFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      backtestResult_ = "";
      structuredMetadataDestination_ = null;
      if (structuredMetadataDestinationBuilder_ != null) {
        structuredMetadataDestinationBuilder_.dispose();
        structuredMetadataDestinationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.financialservices.v1.BacktestResultProto
          .internal_static_google_cloud_financialservices_v1_ExportBacktestResultMetadataRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest
        getDefaultInstanceForType() {
      return com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest build() {
      com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest
        buildPartial() {
      com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest result =
          new com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.backtestResult_ = backtestResult_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.structuredMetadataDestination_ =
            structuredMetadataDestinationBuilder_ == null
                ? structuredMetadataDestination_
                : structuredMetadataDestinationBuilder_.build();
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
      if (other
          instanceof com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest) {
        return mergeFrom(
            (com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest other) {
      if (other
          == com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest
              .getDefaultInstance()) return this;
      if (!other.getBacktestResult().isEmpty()) {
        backtestResult_ = other.backtestResult_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasStructuredMetadataDestination()) {
        mergeStructuredMetadataDestination(other.getStructuredMetadataDestination());
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
                backtestResult_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getStructuredMetadataDestinationFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object backtestResult_ = "";

    /**
     *
     *
     * <pre>
     * Required. The resource name of the BacktestResult.
     * </pre>
     *
     * <code>
     * string backtest_result = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The backtestResult.
     */
    public java.lang.String getBacktestResult() {
      java.lang.Object ref = backtestResult_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        backtestResult_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the BacktestResult.
     * </pre>
     *
     * <code>
     * string backtest_result = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for backtestResult.
     */
    public com.google.protobuf.ByteString getBacktestResultBytes() {
      java.lang.Object ref = backtestResult_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        backtestResult_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the BacktestResult.
     * </pre>
     *
     * <code>
     * string backtest_result = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The backtestResult to set.
     * @return This builder for chaining.
     */
    public Builder setBacktestResult(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      backtestResult_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the BacktestResult.
     * </pre>
     *
     * <code>
     * string backtest_result = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBacktestResult() {
      backtestResult_ = getDefaultInstance().getBacktestResult();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the BacktestResult.
     * </pre>
     *
     * <code>
     * string backtest_result = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for backtestResult to set.
     * @return This builder for chaining.
     */
    public Builder setBacktestResultBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      backtestResult_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.financialservices.v1.BigQueryDestination
        structuredMetadataDestination_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.financialservices.v1.BigQueryDestination,
            com.google.cloud.financialservices.v1.BigQueryDestination.Builder,
            com.google.cloud.financialservices.v1.BigQueryDestinationOrBuilder>
        structuredMetadataDestinationBuilder_;

    /**
     *
     *
     * <pre>
     * Required. BigQuery output where the metadata will be written.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.BigQueryDestination structured_metadata_destination = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the structuredMetadataDestination field is set.
     */
    public boolean hasStructuredMetadataDestination() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. BigQuery output where the metadata will be written.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.BigQueryDestination structured_metadata_destination = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The structuredMetadataDestination.
     */
    public com.google.cloud.financialservices.v1.BigQueryDestination
        getStructuredMetadataDestination() {
      if (structuredMetadataDestinationBuilder_ == null) {
        return structuredMetadataDestination_ == null
            ? com.google.cloud.financialservices.v1.BigQueryDestination.getDefaultInstance()
            : structuredMetadataDestination_;
      } else {
        return structuredMetadataDestinationBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. BigQuery output where the metadata will be written.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.BigQueryDestination structured_metadata_destination = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setStructuredMetadataDestination(
        com.google.cloud.financialservices.v1.BigQueryDestination value) {
      if (structuredMetadataDestinationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        structuredMetadataDestination_ = value;
      } else {
        structuredMetadataDestinationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. BigQuery output where the metadata will be written.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.BigQueryDestination structured_metadata_destination = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setStructuredMetadataDestination(
        com.google.cloud.financialservices.v1.BigQueryDestination.Builder builderForValue) {
      if (structuredMetadataDestinationBuilder_ == null) {
        structuredMetadataDestination_ = builderForValue.build();
      } else {
        structuredMetadataDestinationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. BigQuery output where the metadata will be written.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.BigQueryDestination structured_metadata_destination = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeStructuredMetadataDestination(
        com.google.cloud.financialservices.v1.BigQueryDestination value) {
      if (structuredMetadataDestinationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && structuredMetadataDestination_ != null
            && structuredMetadataDestination_
                != com.google.cloud.financialservices.v1.BigQueryDestination.getDefaultInstance()) {
          getStructuredMetadataDestinationBuilder().mergeFrom(value);
        } else {
          structuredMetadataDestination_ = value;
        }
      } else {
        structuredMetadataDestinationBuilder_.mergeFrom(value);
      }
      if (structuredMetadataDestination_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. BigQuery output where the metadata will be written.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.BigQueryDestination structured_metadata_destination = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearStructuredMetadataDestination() {
      bitField0_ = (bitField0_ & ~0x00000002);
      structuredMetadataDestination_ = null;
      if (structuredMetadataDestinationBuilder_ != null) {
        structuredMetadataDestinationBuilder_.dispose();
        structuredMetadataDestinationBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. BigQuery output where the metadata will be written.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.BigQueryDestination structured_metadata_destination = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.financialservices.v1.BigQueryDestination.Builder
        getStructuredMetadataDestinationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStructuredMetadataDestinationFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. BigQuery output where the metadata will be written.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.BigQueryDestination structured_metadata_destination = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.financialservices.v1.BigQueryDestinationOrBuilder
        getStructuredMetadataDestinationOrBuilder() {
      if (structuredMetadataDestinationBuilder_ != null) {
        return structuredMetadataDestinationBuilder_.getMessageOrBuilder();
      } else {
        return structuredMetadataDestination_ == null
            ? com.google.cloud.financialservices.v1.BigQueryDestination.getDefaultInstance()
            : structuredMetadataDestination_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. BigQuery output where the metadata will be written.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.BigQueryDestination structured_metadata_destination = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.financialservices.v1.BigQueryDestination,
            com.google.cloud.financialservices.v1.BigQueryDestination.Builder,
            com.google.cloud.financialservices.v1.BigQueryDestinationOrBuilder>
        getStructuredMetadataDestinationFieldBuilder() {
      if (structuredMetadataDestinationBuilder_ == null) {
        structuredMetadataDestinationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.financialservices.v1.BigQueryDestination,
                com.google.cloud.financialservices.v1.BigQueryDestination.Builder,
                com.google.cloud.financialservices.v1.BigQueryDestinationOrBuilder>(
                getStructuredMetadataDestination(), getParentForChildren(), isClean());
        structuredMetadataDestination_ = null;
      }
      return structuredMetadataDestinationBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest)
  private static final com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest();
  }

  public static com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportBacktestResultMetadataRequest> PARSER =
      new com.google.protobuf.AbstractParser<ExportBacktestResultMetadataRequest>() {
        @java.lang.Override
        public ExportBacktestResultMetadataRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExportBacktestResultMetadataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportBacktestResultMetadataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.financialservices.v1.ExportBacktestResultMetadataRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
