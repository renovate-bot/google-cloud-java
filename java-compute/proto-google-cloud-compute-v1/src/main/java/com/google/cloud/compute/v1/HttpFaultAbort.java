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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * Specification for how requests are aborted as part of fault injection.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.HttpFaultAbort}
 */
public final class HttpFaultAbort extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.HttpFaultAbort)
    HttpFaultAbortOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use HttpFaultAbort.newBuilder() to construct.
  private HttpFaultAbort(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HttpFaultAbort() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new HttpFaultAbort();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_HttpFaultAbort_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_HttpFaultAbort_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.HttpFaultAbort.class,
            com.google.cloud.compute.v1.HttpFaultAbort.Builder.class);
  }

  private int bitField0_;
  public static final int HTTP_STATUS_FIELD_NUMBER = 468949897;
  private int httpStatus_ = 0;

  /**
   *
   *
   * <pre>
   * The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
   * </pre>
   *
   * <code>optional uint32 http_status = 468949897;</code>
   *
   * @return Whether the httpStatus field is set.
   */
  @java.lang.Override
  public boolean hasHttpStatus() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
   * </pre>
   *
   * <code>optional uint32 http_status = 468949897;</code>
   *
   * @return The httpStatus.
   */
  @java.lang.Override
  public int getHttpStatus() {
    return httpStatus_;
  }

  public static final int PERCENTAGE_FIELD_NUMBER = 151909018;
  private double percentage_ = 0D;

  /**
   *
   *
   * <pre>
   * The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
   * </pre>
   *
   * <code>optional double percentage = 151909018;</code>
   *
   * @return Whether the percentage field is set.
   */
  @java.lang.Override
  public boolean hasPercentage() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
   * </pre>
   *
   * <code>optional double percentage = 151909018;</code>
   *
   * @return The percentage.
   */
  @java.lang.Override
  public double getPercentage() {
    return percentage_;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeDouble(151909018, percentage_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeUInt32(468949897, httpStatus_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(151909018, percentage_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeUInt32Size(468949897, httpStatus_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.HttpFaultAbort)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.HttpFaultAbort other =
        (com.google.cloud.compute.v1.HttpFaultAbort) obj;

    if (hasHttpStatus() != other.hasHttpStatus()) return false;
    if (hasHttpStatus()) {
      if (getHttpStatus() != other.getHttpStatus()) return false;
    }
    if (hasPercentage() != other.hasPercentage()) return false;
    if (hasPercentage()) {
      if (java.lang.Double.doubleToLongBits(getPercentage())
          != java.lang.Double.doubleToLongBits(other.getPercentage())) return false;
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
    if (hasHttpStatus()) {
      hash = (37 * hash) + HTTP_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getHttpStatus();
    }
    if (hasPercentage()) {
      hash = (37 * hash) + PERCENTAGE_FIELD_NUMBER;
      hash =
          (53 * hash)
              + com.google.protobuf.Internal.hashLong(
                  java.lang.Double.doubleToLongBits(getPercentage()));
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.HttpFaultAbort parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.HttpFaultAbort parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HttpFaultAbort parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.HttpFaultAbort parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HttpFaultAbort parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.HttpFaultAbort parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HttpFaultAbort parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.HttpFaultAbort parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HttpFaultAbort parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.HttpFaultAbort parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HttpFaultAbort parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.HttpFaultAbort parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.HttpFaultAbort prototype) {
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
   * Specification for how requests are aborted as part of fault injection.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.HttpFaultAbort}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.HttpFaultAbort)
      com.google.cloud.compute.v1.HttpFaultAbortOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_HttpFaultAbort_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_HttpFaultAbort_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.HttpFaultAbort.class,
              com.google.cloud.compute.v1.HttpFaultAbort.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.HttpFaultAbort.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      httpStatus_ = 0;
      percentage_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_HttpFaultAbort_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.HttpFaultAbort getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.HttpFaultAbort.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.HttpFaultAbort build() {
      com.google.cloud.compute.v1.HttpFaultAbort result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.HttpFaultAbort buildPartial() {
      com.google.cloud.compute.v1.HttpFaultAbort result =
          new com.google.cloud.compute.v1.HttpFaultAbort(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.HttpFaultAbort result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.httpStatus_ = httpStatus_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.percentage_ = percentage_;
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
      if (other instanceof com.google.cloud.compute.v1.HttpFaultAbort) {
        return mergeFrom((com.google.cloud.compute.v1.HttpFaultAbort) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.HttpFaultAbort other) {
      if (other == com.google.cloud.compute.v1.HttpFaultAbort.getDefaultInstance()) return this;
      if (other.hasHttpStatus()) {
        setHttpStatus(other.getHttpStatus());
      }
      if (other.hasPercentage()) {
        setPercentage(other.getPercentage());
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
            case 1215272145:
              {
                percentage_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 1215272145
            case -543368120:
              {
                httpStatus_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case -543368120
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

    private int httpStatus_;

    /**
     *
     *
     * <pre>
     * The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
     * </pre>
     *
     * <code>optional uint32 http_status = 468949897;</code>
     *
     * @return Whether the httpStatus field is set.
     */
    @java.lang.Override
    public boolean hasHttpStatus() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
     * </pre>
     *
     * <code>optional uint32 http_status = 468949897;</code>
     *
     * @return The httpStatus.
     */
    @java.lang.Override
    public int getHttpStatus() {
      return httpStatus_;
    }

    /**
     *
     *
     * <pre>
     * The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
     * </pre>
     *
     * <code>optional uint32 http_status = 468949897;</code>
     *
     * @param value The httpStatus to set.
     * @return This builder for chaining.
     */
    public Builder setHttpStatus(int value) {

      httpStatus_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
     * </pre>
     *
     * <code>optional uint32 http_status = 468949897;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHttpStatus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      httpStatus_ = 0;
      onChanged();
      return this;
    }

    private double percentage_;

    /**
     *
     *
     * <pre>
     * The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * </pre>
     *
     * <code>optional double percentage = 151909018;</code>
     *
     * @return Whether the percentage field is set.
     */
    @java.lang.Override
    public boolean hasPercentage() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * </pre>
     *
     * <code>optional double percentage = 151909018;</code>
     *
     * @return The percentage.
     */
    @java.lang.Override
    public double getPercentage() {
      return percentage_;
    }

    /**
     *
     *
     * <pre>
     * The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * </pre>
     *
     * <code>optional double percentage = 151909018;</code>
     *
     * @param value The percentage to set.
     * @return This builder for chaining.
     */
    public Builder setPercentage(double value) {

      percentage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * </pre>
     *
     * <code>optional double percentage = 151909018;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPercentage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      percentage_ = 0D;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.HttpFaultAbort)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.HttpFaultAbort)
  private static final com.google.cloud.compute.v1.HttpFaultAbort DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.HttpFaultAbort();
  }

  public static com.google.cloud.compute.v1.HttpFaultAbort getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HttpFaultAbort> PARSER =
      new com.google.protobuf.AbstractParser<HttpFaultAbort>() {
        @java.lang.Override
        public HttpFaultAbort parsePartialFrom(
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

  public static com.google.protobuf.Parser<HttpFaultAbort> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HttpFaultAbort> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.HttpFaultAbort getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
