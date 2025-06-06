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
// source: google/api/serviceusage/v1beta1/serviceusage.proto

// Protobuf Java Version: 3.25.8
package com.google.api.serviceusage.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for ListConsumerQuotaMetrics
 * </pre>
 *
 * Protobuf type {@code google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse}
 */
public final class ListConsumerQuotaMetricsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse)
    ListConsumerQuotaMetricsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListConsumerQuotaMetricsResponse.newBuilder() to construct.
  private ListConsumerQuotaMetricsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListConsumerQuotaMetricsResponse() {
    metrics_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListConsumerQuotaMetricsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.serviceusage.v1beta1.ServiceUsageProto
        .internal_static_google_api_serviceusage_v1beta1_ListConsumerQuotaMetricsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.serviceusage.v1beta1.ServiceUsageProto
        .internal_static_google_api_serviceusage_v1beta1_ListConsumerQuotaMetricsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse.class,
            com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse.Builder.class);
  }

  public static final int METRICS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric> metrics_;

  /**
   *
   *
   * <pre>
   * Quota settings for the consumer, organized by quota metric.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric> getMetricsList() {
    return metrics_;
  }

  /**
   *
   *
   * <pre>
   * Quota settings for the consumer, organized by quota metric.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.api.serviceusage.v1beta1.ConsumerQuotaMetricOrBuilder>
      getMetricsOrBuilderList() {
    return metrics_;
  }

  /**
   *
   *
   * <pre>
   * Quota settings for the consumer, organized by quota metric.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
   */
  @java.lang.Override
  public int getMetricsCount() {
    return metrics_.size();
  }

  /**
   *
   *
   * <pre>
   * Quota settings for the consumer, organized by quota metric.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
   */
  @java.lang.Override
  public com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric getMetrics(int index) {
    return metrics_.get(index);
  }

  /**
   *
   *
   * <pre>
   * Quota settings for the consumer, organized by quota metric.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
   */
  @java.lang.Override
  public com.google.api.serviceusage.v1beta1.ConsumerQuotaMetricOrBuilder getMetricsOrBuilder(
      int index) {
    return metrics_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * Token identifying which result to start with; returned by a previous list
   * call.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Token identifying which result to start with; returned by a previous list
   * call.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < metrics_.size(); i++) {
      output.writeMessage(1, metrics_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < metrics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, metrics_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse)) {
      return super.equals(obj);
    }
    com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse other =
        (com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse) obj;

    if (!getMetricsList().equals(other.getMetricsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getMetricsCount() > 0) {
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getMetricsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse parseFrom(
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
      com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse prototype) {
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
   * Response message for ListConsumerQuotaMetrics
   * </pre>
   *
   * Protobuf type {@code google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse)
      com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.serviceusage.v1beta1.ServiceUsageProto
          .internal_static_google_api_serviceusage_v1beta1_ListConsumerQuotaMetricsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.serviceusage.v1beta1.ServiceUsageProto
          .internal_static_google_api_serviceusage_v1beta1_ListConsumerQuotaMetricsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse.class,
              com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse.Builder.class);
    }

    // Construct using
    // com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
      } else {
        metrics_ = null;
        metricsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.serviceusage.v1beta1.ServiceUsageProto
          .internal_static_google_api_serviceusage_v1beta1_ListConsumerQuotaMetricsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse
        getDefaultInstanceForType() {
      return com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse build() {
      com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse buildPartial() {
      com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse result =
          new com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse result) {
      if (metricsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          metrics_ = java.util.Collections.unmodifiableList(metrics_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.metrics_ = metrics_;
      } else {
        result.metrics_ = metricsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse) {
        return mergeFrom(
            (com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse other) {
      if (other
          == com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse
              .getDefaultInstance()) return this;
      if (metricsBuilder_ == null) {
        if (!other.metrics_.isEmpty()) {
          if (metrics_.isEmpty()) {
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMetricsIsMutable();
            metrics_.addAll(other.metrics_);
          }
          onChanged();
        }
      } else {
        if (!other.metrics_.isEmpty()) {
          if (metricsBuilder_.isEmpty()) {
            metricsBuilder_.dispose();
            metricsBuilder_ = null;
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
            metricsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMetricsFieldBuilder()
                    : null;
          } else {
            metricsBuilder_.addAllMessages(other.metrics_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric m =
                    input.readMessage(
                        com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric.parser(),
                        extensionRegistry);
                if (metricsBuilder_ == null) {
                  ensureMetricsIsMutable();
                  metrics_.add(m);
                } else {
                  metricsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric> metrics_ =
        java.util.Collections.emptyList();

    private void ensureMetricsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        metrics_ =
            new java.util.ArrayList<com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric>(
                metrics_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric,
            com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric.Builder,
            com.google.api.serviceusage.v1beta1.ConsumerQuotaMetricOrBuilder>
        metricsBuilder_;

    /**
     *
     *
     * <pre>
     * Quota settings for the consumer, organized by quota metric.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
     */
    public java.util.List<com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric>
        getMetricsList() {
      if (metricsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(metrics_);
      } else {
        return metricsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * Quota settings for the consumer, organized by quota metric.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
     */
    public int getMetricsCount() {
      if (metricsBuilder_ == null) {
        return metrics_.size();
      } else {
        return metricsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * Quota settings for the consumer, organized by quota metric.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric getMetrics(int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);
      } else {
        return metricsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Quota settings for the consumer, organized by quota metric.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
     */
    public Builder setMetrics(
        int index, com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.set(index, value);
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Quota settings for the consumer, organized by quota metric.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
     */
    public Builder setMetrics(
        int index,
        com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.set(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Quota settings for the consumer, organized by quota metric.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
     */
    public Builder addMetrics(com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Quota settings for the consumer, organized by quota metric.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
     */
    public Builder addMetrics(
        int index, com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(index, value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Quota settings for the consumer, organized by quota metric.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
     */
    public Builder addMetrics(
        com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Quota settings for the consumer, organized by quota metric.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
     */
    public Builder addMetrics(
        int index,
        com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Quota settings for the consumer, organized by quota metric.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
     */
    public Builder addAllMetrics(
        java.lang.Iterable<? extends com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric>
            values) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, metrics_);
        onChanged();
      } else {
        metricsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Quota settings for the consumer, organized by quota metric.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
     */
    public Builder clearMetrics() {
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        metricsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Quota settings for the consumer, organized by quota metric.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
     */
    public Builder removeMetrics(int index) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.remove(index);
        onChanged();
      } else {
        metricsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Quota settings for the consumer, organized by quota metric.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric.Builder getMetricsBuilder(
        int index) {
      return getMetricsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * Quota settings for the consumer, organized by quota metric.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.ConsumerQuotaMetricOrBuilder getMetricsOrBuilder(
        int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);
      } else {
        return metricsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Quota settings for the consumer, organized by quota metric.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
     */
    public java.util.List<
            ? extends com.google.api.serviceusage.v1beta1.ConsumerQuotaMetricOrBuilder>
        getMetricsOrBuilderList() {
      if (metricsBuilder_ != null) {
        return metricsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(metrics_);
      }
    }

    /**
     *
     *
     * <pre>
     * Quota settings for the consumer, organized by quota metric.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric.Builder addMetricsBuilder() {
      return getMetricsFieldBuilder()
          .addBuilder(com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Quota settings for the consumer, organized by quota metric.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric.Builder addMetricsBuilder(
        int index) {
      return getMetricsFieldBuilder()
          .addBuilder(
              index, com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Quota settings for the consumer, organized by quota metric.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaMetric metrics = 1;</code>
     */
    public java.util.List<com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric.Builder>
        getMetricsBuilderList() {
      return getMetricsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric,
            com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric.Builder,
            com.google.api.serviceusage.v1beta1.ConsumerQuotaMetricOrBuilder>
        getMetricsFieldBuilder() {
      if (metricsBuilder_ == null) {
        metricsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric,
                com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric.Builder,
                com.google.api.serviceusage.v1beta1.ConsumerQuotaMetricOrBuilder>(
                metrics_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        metrics_ = null;
      }
      return metricsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * Token identifying which result to start with; returned by a previous list
     * call.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Token identifying which result to start with; returned by a previous list
     * call.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Token identifying which result to start with; returned by a previous list
     * call.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Token identifying which result to start with; returned by a previous list
     * call.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Token identifying which result to start with; returned by a previous list
     * call.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse)
  private static final com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse();
  }

  public static com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListConsumerQuotaMetricsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListConsumerQuotaMetricsResponse>() {
        @java.lang.Override
        public ListConsumerQuotaMetricsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListConsumerQuotaMetricsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListConsumerQuotaMetricsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.serviceusage.v1beta1.ListConsumerQuotaMetricsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
