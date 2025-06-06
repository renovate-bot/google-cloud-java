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
// source: google/cloud/aiplatform/v1/endpoint.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Configuration for logging request-response to a BigQuery table.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig}
 */
public final class PredictRequestResponseLoggingConfig
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig)
    PredictRequestResponseLoggingConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use PredictRequestResponseLoggingConfig.newBuilder() to construct.
  private PredictRequestResponseLoggingConfig(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PredictRequestResponseLoggingConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PredictRequestResponseLoggingConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.EndpointProto
        .internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.EndpointProto
        .internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig.class,
            com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig.Builder.class);
  }

  private int bitField0_;
  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_ = false;

  /**
   *
   *
   * <pre>
   * If logging is enabled or not.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   *
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int SAMPLING_RATE_FIELD_NUMBER = 2;
  private double samplingRate_ = 0D;

  /**
   *
   *
   * <pre>
   * Percentage of requests to be logged, expressed as a fraction in
   * range(0,1].
   * </pre>
   *
   * <code>double sampling_rate = 2;</code>
   *
   * @return The samplingRate.
   */
  @java.lang.Override
  public double getSamplingRate() {
    return samplingRate_;
  }

  public static final int BIGQUERY_DESTINATION_FIELD_NUMBER = 3;
  private com.google.cloud.aiplatform.v1.BigQueryDestination bigqueryDestination_;

  /**
   *
   *
   * <pre>
   * BigQuery table for logging.
   * If only given a project, a new dataset will be created with name
   * `logging_&lt;endpoint-display-name&gt;_&lt;endpoint-id&gt;` where
   * &lt;endpoint-display-name&gt; will be made BigQuery-dataset-name compatible (e.g.
   * most special characters will become underscores). If no table name is
   * given, a new table will be created with name `request_response_logging`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BigQueryDestination bigquery_destination = 3;</code>
   *
   * @return Whether the bigqueryDestination field is set.
   */
  @java.lang.Override
  public boolean hasBigqueryDestination() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * BigQuery table for logging.
   * If only given a project, a new dataset will be created with name
   * `logging_&lt;endpoint-display-name&gt;_&lt;endpoint-id&gt;` where
   * &lt;endpoint-display-name&gt; will be made BigQuery-dataset-name compatible (e.g.
   * most special characters will become underscores). If no table name is
   * given, a new table will be created with name `request_response_logging`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BigQueryDestination bigquery_destination = 3;</code>
   *
   * @return The bigqueryDestination.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.BigQueryDestination getBigqueryDestination() {
    return bigqueryDestination_ == null
        ? com.google.cloud.aiplatform.v1.BigQueryDestination.getDefaultInstance()
        : bigqueryDestination_;
  }

  /**
   *
   *
   * <pre>
   * BigQuery table for logging.
   * If only given a project, a new dataset will be created with name
   * `logging_&lt;endpoint-display-name&gt;_&lt;endpoint-id&gt;` where
   * &lt;endpoint-display-name&gt; will be made BigQuery-dataset-name compatible (e.g.
   * most special characters will become underscores). If no table name is
   * given, a new table will be created with name `request_response_logging`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BigQueryDestination bigquery_destination = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.BigQueryDestinationOrBuilder
      getBigqueryDestinationOrBuilder() {
    return bigqueryDestination_ == null
        ? com.google.cloud.aiplatform.v1.BigQueryDestination.getDefaultInstance()
        : bigqueryDestination_;
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
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
    if (java.lang.Double.doubleToRawLongBits(samplingRate_) != 0) {
      output.writeDouble(2, samplingRate_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getBigqueryDestination());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, enabled_);
    }
    if (java.lang.Double.doubleToRawLongBits(samplingRate_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, samplingRate_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getBigqueryDestination());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig other =
        (com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig) obj;

    if (getEnabled() != other.getEnabled()) return false;
    if (java.lang.Double.doubleToLongBits(getSamplingRate())
        != java.lang.Double.doubleToLongBits(other.getSamplingRate())) return false;
    if (hasBigqueryDestination() != other.hasBigqueryDestination()) return false;
    if (hasBigqueryDestination()) {
      if (!getBigqueryDestination().equals(other.getBigqueryDestination())) return false;
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnabled());
    hash = (37 * hash) + SAMPLING_RATE_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getSamplingRate()));
    if (hasBigqueryDestination()) {
      hash = (37 * hash) + BIGQUERY_DESTINATION_FIELD_NUMBER;
      hash = (53 * hash) + getBigqueryDestination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig parseFrom(
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
      com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig prototype) {
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
   * Configuration for logging request-response to a BigQuery table.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig)
      com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.EndpointProto
          .internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.EndpointProto
          .internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig.class,
              com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig.Builder.class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getBigqueryDestinationFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enabled_ = false;
      samplingRate_ = 0D;
      bigqueryDestination_ = null;
      if (bigqueryDestinationBuilder_ != null) {
        bigqueryDestinationBuilder_.dispose();
        bigqueryDestinationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.EndpointProto
          .internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig build() {
      com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig buildPartial() {
      com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig result =
          new com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enabled_ = enabled_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.samplingRate_ = samplingRate_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.bigqueryDestination_ =
            bigqueryDestinationBuilder_ == null
                ? bigqueryDestination_
                : bigqueryDestinationBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig other) {
      if (other
          == com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig
              .getDefaultInstance()) return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      if (other.getSamplingRate() != 0D) {
        setSamplingRate(other.getSamplingRate());
      }
      if (other.hasBigqueryDestination()) {
        mergeBigqueryDestination(other.getBigqueryDestination());
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
            case 8:
              {
                enabled_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 17:
              {
                samplingRate_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 17
            case 26:
              {
                input.readMessage(
                    getBigqueryDestinationFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private boolean enabled_;

    /**
     *
     *
     * <pre>
     * If logging is enabled or not.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     *
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }

    /**
     *
     *
     * <pre>
     * If logging is enabled or not.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     *
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {

      enabled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * If logging is enabled or not.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enabled_ = false;
      onChanged();
      return this;
    }

    private double samplingRate_;

    /**
     *
     *
     * <pre>
     * Percentage of requests to be logged, expressed as a fraction in
     * range(0,1].
     * </pre>
     *
     * <code>double sampling_rate = 2;</code>
     *
     * @return The samplingRate.
     */
    @java.lang.Override
    public double getSamplingRate() {
      return samplingRate_;
    }

    /**
     *
     *
     * <pre>
     * Percentage of requests to be logged, expressed as a fraction in
     * range(0,1].
     * </pre>
     *
     * <code>double sampling_rate = 2;</code>
     *
     * @param value The samplingRate to set.
     * @return This builder for chaining.
     */
    public Builder setSamplingRate(double value) {

      samplingRate_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Percentage of requests to be logged, expressed as a fraction in
     * range(0,1].
     * </pre>
     *
     * <code>double sampling_rate = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSamplingRate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      samplingRate_ = 0D;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1.BigQueryDestination bigqueryDestination_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.BigQueryDestination,
            com.google.cloud.aiplatform.v1.BigQueryDestination.Builder,
            com.google.cloud.aiplatform.v1.BigQueryDestinationOrBuilder>
        bigqueryDestinationBuilder_;

    /**
     *
     *
     * <pre>
     * BigQuery table for logging.
     * If only given a project, a new dataset will be created with name
     * `logging_&lt;endpoint-display-name&gt;_&lt;endpoint-id&gt;` where
     * &lt;endpoint-display-name&gt; will be made BigQuery-dataset-name compatible (e.g.
     * most special characters will become underscores). If no table name is
     * given, a new table will be created with name `request_response_logging`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.BigQueryDestination bigquery_destination = 3;</code>
     *
     * @return Whether the bigqueryDestination field is set.
     */
    public boolean hasBigqueryDestination() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * BigQuery table for logging.
     * If only given a project, a new dataset will be created with name
     * `logging_&lt;endpoint-display-name&gt;_&lt;endpoint-id&gt;` where
     * &lt;endpoint-display-name&gt; will be made BigQuery-dataset-name compatible (e.g.
     * most special characters will become underscores). If no table name is
     * given, a new table will be created with name `request_response_logging`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.BigQueryDestination bigquery_destination = 3;</code>
     *
     * @return The bigqueryDestination.
     */
    public com.google.cloud.aiplatform.v1.BigQueryDestination getBigqueryDestination() {
      if (bigqueryDestinationBuilder_ == null) {
        return bigqueryDestination_ == null
            ? com.google.cloud.aiplatform.v1.BigQueryDestination.getDefaultInstance()
            : bigqueryDestination_;
      } else {
        return bigqueryDestinationBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * BigQuery table for logging.
     * If only given a project, a new dataset will be created with name
     * `logging_&lt;endpoint-display-name&gt;_&lt;endpoint-id&gt;` where
     * &lt;endpoint-display-name&gt; will be made BigQuery-dataset-name compatible (e.g.
     * most special characters will become underscores). If no table name is
     * given, a new table will be created with name `request_response_logging`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.BigQueryDestination bigquery_destination = 3;</code>
     */
    public Builder setBigqueryDestination(
        com.google.cloud.aiplatform.v1.BigQueryDestination value) {
      if (bigqueryDestinationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bigqueryDestination_ = value;
      } else {
        bigqueryDestinationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * BigQuery table for logging.
     * If only given a project, a new dataset will be created with name
     * `logging_&lt;endpoint-display-name&gt;_&lt;endpoint-id&gt;` where
     * &lt;endpoint-display-name&gt; will be made BigQuery-dataset-name compatible (e.g.
     * most special characters will become underscores). If no table name is
     * given, a new table will be created with name `request_response_logging`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.BigQueryDestination bigquery_destination = 3;</code>
     */
    public Builder setBigqueryDestination(
        com.google.cloud.aiplatform.v1.BigQueryDestination.Builder builderForValue) {
      if (bigqueryDestinationBuilder_ == null) {
        bigqueryDestination_ = builderForValue.build();
      } else {
        bigqueryDestinationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * BigQuery table for logging.
     * If only given a project, a new dataset will be created with name
     * `logging_&lt;endpoint-display-name&gt;_&lt;endpoint-id&gt;` where
     * &lt;endpoint-display-name&gt; will be made BigQuery-dataset-name compatible (e.g.
     * most special characters will become underscores). If no table name is
     * given, a new table will be created with name `request_response_logging`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.BigQueryDestination bigquery_destination = 3;</code>
     */
    public Builder mergeBigqueryDestination(
        com.google.cloud.aiplatform.v1.BigQueryDestination value) {
      if (bigqueryDestinationBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && bigqueryDestination_ != null
            && bigqueryDestination_
                != com.google.cloud.aiplatform.v1.BigQueryDestination.getDefaultInstance()) {
          getBigqueryDestinationBuilder().mergeFrom(value);
        } else {
          bigqueryDestination_ = value;
        }
      } else {
        bigqueryDestinationBuilder_.mergeFrom(value);
      }
      if (bigqueryDestination_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * BigQuery table for logging.
     * If only given a project, a new dataset will be created with name
     * `logging_&lt;endpoint-display-name&gt;_&lt;endpoint-id&gt;` where
     * &lt;endpoint-display-name&gt; will be made BigQuery-dataset-name compatible (e.g.
     * most special characters will become underscores). If no table name is
     * given, a new table will be created with name `request_response_logging`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.BigQueryDestination bigquery_destination = 3;</code>
     */
    public Builder clearBigqueryDestination() {
      bitField0_ = (bitField0_ & ~0x00000004);
      bigqueryDestination_ = null;
      if (bigqueryDestinationBuilder_ != null) {
        bigqueryDestinationBuilder_.dispose();
        bigqueryDestinationBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * BigQuery table for logging.
     * If only given a project, a new dataset will be created with name
     * `logging_&lt;endpoint-display-name&gt;_&lt;endpoint-id&gt;` where
     * &lt;endpoint-display-name&gt; will be made BigQuery-dataset-name compatible (e.g.
     * most special characters will become underscores). If no table name is
     * given, a new table will be created with name `request_response_logging`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.BigQueryDestination bigquery_destination = 3;</code>
     */
    public com.google.cloud.aiplatform.v1.BigQueryDestination.Builder
        getBigqueryDestinationBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getBigqueryDestinationFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * BigQuery table for logging.
     * If only given a project, a new dataset will be created with name
     * `logging_&lt;endpoint-display-name&gt;_&lt;endpoint-id&gt;` where
     * &lt;endpoint-display-name&gt; will be made BigQuery-dataset-name compatible (e.g.
     * most special characters will become underscores). If no table name is
     * given, a new table will be created with name `request_response_logging`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.BigQueryDestination bigquery_destination = 3;</code>
     */
    public com.google.cloud.aiplatform.v1.BigQueryDestinationOrBuilder
        getBigqueryDestinationOrBuilder() {
      if (bigqueryDestinationBuilder_ != null) {
        return bigqueryDestinationBuilder_.getMessageOrBuilder();
      } else {
        return bigqueryDestination_ == null
            ? com.google.cloud.aiplatform.v1.BigQueryDestination.getDefaultInstance()
            : bigqueryDestination_;
      }
    }

    /**
     *
     *
     * <pre>
     * BigQuery table for logging.
     * If only given a project, a new dataset will be created with name
     * `logging_&lt;endpoint-display-name&gt;_&lt;endpoint-id&gt;` where
     * &lt;endpoint-display-name&gt; will be made BigQuery-dataset-name compatible (e.g.
     * most special characters will become underscores). If no table name is
     * given, a new table will be created with name `request_response_logging`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.BigQueryDestination bigquery_destination = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.BigQueryDestination,
            com.google.cloud.aiplatform.v1.BigQueryDestination.Builder,
            com.google.cloud.aiplatform.v1.BigQueryDestinationOrBuilder>
        getBigqueryDestinationFieldBuilder() {
      if (bigqueryDestinationBuilder_ == null) {
        bigqueryDestinationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.BigQueryDestination,
                com.google.cloud.aiplatform.v1.BigQueryDestination.Builder,
                com.google.cloud.aiplatform.v1.BigQueryDestinationOrBuilder>(
                getBigqueryDestination(), getParentForChildren(), isClean());
        bigqueryDestination_ = null;
      }
      return bigqueryDestinationBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig)
  private static final com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig();
  }

  public static com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PredictRequestResponseLoggingConfig> PARSER =
      new com.google.protobuf.AbstractParser<PredictRequestResponseLoggingConfig>() {
        @java.lang.Override
        public PredictRequestResponseLoggingConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<PredictRequestResponseLoggingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PredictRequestResponseLoggingConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.PredictRequestResponseLoggingConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
