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
// source: google/analytics/admin/v1alpha/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Event setting conditions to match an event.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.EventMapping}
 */
public final class EventMapping extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.EventMapping)
    EventMappingOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use EventMapping.newBuilder() to construct.
  private EventMapping(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EventMapping() {
    eventName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EventMapping();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.ResourcesProto
        .internal_static_google_analytics_admin_v1alpha_EventMapping_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.ResourcesProto
        .internal_static_google_analytics_admin_v1alpha_EventMapping_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.EventMapping.class,
            com.google.analytics.admin.v1alpha.EventMapping.Builder.class);
  }

  private int bitField0_;
  public static final int EVENT_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object eventName_ = "";

  /**
   *
   *
   * <pre>
   * Required. Name of the Google Analytics event. It must always be set.
   * The max allowed display name length is 40 UTF-16 code units.
   * </pre>
   *
   * <code>string event_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The eventName.
   */
  @java.lang.Override
  public java.lang.String getEventName() {
    java.lang.Object ref = eventName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventName_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. Name of the Google Analytics event. It must always be set.
   * The max allowed display name length is 40 UTF-16 code units.
   * </pre>
   *
   * <code>string event_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for eventName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEventNameBytes() {
    java.lang.Object ref = eventName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      eventName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MIN_EVENT_COUNT_FIELD_NUMBER = 2;
  private long minEventCount_ = 0L;

  /**
   *
   *
   * <pre>
   * At least one of the following four min/max values must be set. The
   * values set will be ANDed together to qualify an event.
   * The minimum number of times the event occurred. If not set, minimum event
   * count won't be checked.
   * </pre>
   *
   * <code>optional int64 min_event_count = 2;</code>
   *
   * @return Whether the minEventCount field is set.
   */
  @java.lang.Override
  public boolean hasMinEventCount() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * At least one of the following four min/max values must be set. The
   * values set will be ANDed together to qualify an event.
   * The minimum number of times the event occurred. If not set, minimum event
   * count won't be checked.
   * </pre>
   *
   * <code>optional int64 min_event_count = 2;</code>
   *
   * @return The minEventCount.
   */
  @java.lang.Override
  public long getMinEventCount() {
    return minEventCount_;
  }

  public static final int MAX_EVENT_COUNT_FIELD_NUMBER = 3;
  private long maxEventCount_ = 0L;

  /**
   *
   *
   * <pre>
   * The maximum number of times the event occurred. If not set, maximum event
   * count won't be checked.
   * </pre>
   *
   * <code>optional int64 max_event_count = 3;</code>
   *
   * @return Whether the maxEventCount field is set.
   */
  @java.lang.Override
  public boolean hasMaxEventCount() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * The maximum number of times the event occurred. If not set, maximum event
   * count won't be checked.
   * </pre>
   *
   * <code>optional int64 max_event_count = 3;</code>
   *
   * @return The maxEventCount.
   */
  @java.lang.Override
  public long getMaxEventCount() {
    return maxEventCount_;
  }

  public static final int MIN_EVENT_VALUE_FIELD_NUMBER = 4;
  private double minEventValue_ = 0D;

  /**
   *
   *
   * <pre>
   * The minimum revenue generated due to the event. Revenue currency will be
   * defined at the property level. If not set, minimum event value won't be
   * checked.
   * </pre>
   *
   * <code>optional double min_event_value = 4;</code>
   *
   * @return Whether the minEventValue field is set.
   */
  @java.lang.Override
  public boolean hasMinEventValue() {
    return ((bitField0_ & 0x00000004) != 0);
  }

  /**
   *
   *
   * <pre>
   * The minimum revenue generated due to the event. Revenue currency will be
   * defined at the property level. If not set, minimum event value won't be
   * checked.
   * </pre>
   *
   * <code>optional double min_event_value = 4;</code>
   *
   * @return The minEventValue.
   */
  @java.lang.Override
  public double getMinEventValue() {
    return minEventValue_;
  }

  public static final int MAX_EVENT_VALUE_FIELD_NUMBER = 5;
  private double maxEventValue_ = 0D;

  /**
   *
   *
   * <pre>
   * The maximum revenue generated due to the event. Revenue currency will be
   * defined at the property level. If not set, maximum event value won't be
   * checked.
   * </pre>
   *
   * <code>optional double max_event_value = 5;</code>
   *
   * @return Whether the maxEventValue field is set.
   */
  @java.lang.Override
  public boolean hasMaxEventValue() {
    return ((bitField0_ & 0x00000008) != 0);
  }

  /**
   *
   *
   * <pre>
   * The maximum revenue generated due to the event. Revenue currency will be
   * defined at the property level. If not set, maximum event value won't be
   * checked.
   * </pre>
   *
   * <code>optional double max_event_value = 5;</code>
   *
   * @return The maxEventValue.
   */
  @java.lang.Override
  public double getMaxEventValue() {
    return maxEventValue_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, eventName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(2, minEventCount_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(3, maxEventCount_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeDouble(4, minEventValue_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeDouble(5, maxEventValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, eventName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, minEventCount_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(3, maxEventCount_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(4, minEventValue_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(5, maxEventValue_);
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.EventMapping)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.EventMapping other =
        (com.google.analytics.admin.v1alpha.EventMapping) obj;

    if (!getEventName().equals(other.getEventName())) return false;
    if (hasMinEventCount() != other.hasMinEventCount()) return false;
    if (hasMinEventCount()) {
      if (getMinEventCount() != other.getMinEventCount()) return false;
    }
    if (hasMaxEventCount() != other.hasMaxEventCount()) return false;
    if (hasMaxEventCount()) {
      if (getMaxEventCount() != other.getMaxEventCount()) return false;
    }
    if (hasMinEventValue() != other.hasMinEventValue()) return false;
    if (hasMinEventValue()) {
      if (java.lang.Double.doubleToLongBits(getMinEventValue())
          != java.lang.Double.doubleToLongBits(other.getMinEventValue())) return false;
    }
    if (hasMaxEventValue() != other.hasMaxEventValue()) return false;
    if (hasMaxEventValue()) {
      if (java.lang.Double.doubleToLongBits(getMaxEventValue())
          != java.lang.Double.doubleToLongBits(other.getMaxEventValue())) return false;
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
    hash = (37 * hash) + EVENT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getEventName().hashCode();
    if (hasMinEventCount()) {
      hash = (37 * hash) + MIN_EVENT_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getMinEventCount());
    }
    if (hasMaxEventCount()) {
      hash = (37 * hash) + MAX_EVENT_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getMaxEventCount());
    }
    if (hasMinEventValue()) {
      hash = (37 * hash) + MIN_EVENT_VALUE_FIELD_NUMBER;
      hash =
          (53 * hash)
              + com.google.protobuf.Internal.hashLong(
                  java.lang.Double.doubleToLongBits(getMinEventValue()));
    }
    if (hasMaxEventValue()) {
      hash = (37 * hash) + MAX_EVENT_VALUE_FIELD_NUMBER;
      hash =
          (53 * hash)
              + com.google.protobuf.Internal.hashLong(
                  java.lang.Double.doubleToLongBits(getMaxEventValue()));
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.EventMapping parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.EventMapping parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.EventMapping parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.EventMapping parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.EventMapping parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.EventMapping parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.EventMapping parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.EventMapping parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.EventMapping parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.EventMapping parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.EventMapping parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.EventMapping parseFrom(
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

  public static Builder newBuilder(com.google.analytics.admin.v1alpha.EventMapping prototype) {
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
   * Event setting conditions to match an event.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.EventMapping}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.EventMapping)
      com.google.analytics.admin.v1alpha.EventMappingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_EventMapping_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_EventMapping_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.EventMapping.class,
              com.google.analytics.admin.v1alpha.EventMapping.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.EventMapping.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      eventName_ = "";
      minEventCount_ = 0L;
      maxEventCount_ = 0L;
      minEventValue_ = 0D;
      maxEventValue_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_EventMapping_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.EventMapping getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.EventMapping.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.EventMapping build() {
      com.google.analytics.admin.v1alpha.EventMapping result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.EventMapping buildPartial() {
      com.google.analytics.admin.v1alpha.EventMapping result =
          new com.google.analytics.admin.v1alpha.EventMapping(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.admin.v1alpha.EventMapping result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.eventName_ = eventName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.minEventCount_ = minEventCount_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.maxEventCount_ = maxEventCount_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.minEventValue_ = minEventValue_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.maxEventValue_ = maxEventValue_;
        to_bitField0_ |= 0x00000008;
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
      if (other instanceof com.google.analytics.admin.v1alpha.EventMapping) {
        return mergeFrom((com.google.analytics.admin.v1alpha.EventMapping) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.EventMapping other) {
      if (other == com.google.analytics.admin.v1alpha.EventMapping.getDefaultInstance())
        return this;
      if (!other.getEventName().isEmpty()) {
        eventName_ = other.eventName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasMinEventCount()) {
        setMinEventCount(other.getMinEventCount());
      }
      if (other.hasMaxEventCount()) {
        setMaxEventCount(other.getMaxEventCount());
      }
      if (other.hasMinEventValue()) {
        setMinEventValue(other.getMinEventValue());
      }
      if (other.hasMaxEventValue()) {
        setMaxEventValue(other.getMaxEventValue());
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
                eventName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                minEventCount_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                maxEventCount_ = input.readInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 33:
              {
                minEventValue_ = input.readDouble();
                bitField0_ |= 0x00000008;
                break;
              } // case 33
            case 41:
              {
                maxEventValue_ = input.readDouble();
                bitField0_ |= 0x00000010;
                break;
              } // case 41
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

    private java.lang.Object eventName_ = "";

    /**
     *
     *
     * <pre>
     * Required. Name of the Google Analytics event. It must always be set.
     * The max allowed display name length is 40 UTF-16 code units.
     * </pre>
     *
     * <code>string event_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The eventName.
     */
    public java.lang.String getEventName() {
      java.lang.Object ref = eventName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Name of the Google Analytics event. It must always be set.
     * The max allowed display name length is 40 UTF-16 code units.
     * </pre>
     *
     * <code>string event_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for eventName.
     */
    public com.google.protobuf.ByteString getEventNameBytes() {
      java.lang.Object ref = eventName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        eventName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Name of the Google Analytics event. It must always be set.
     * The max allowed display name length is 40 UTF-16 code units.
     * </pre>
     *
     * <code>string event_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The eventName to set.
     * @return This builder for chaining.
     */
    public Builder setEventName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      eventName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Name of the Google Analytics event. It must always be set.
     * The max allowed display name length is 40 UTF-16 code units.
     * </pre>
     *
     * <code>string event_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEventName() {
      eventName_ = getDefaultInstance().getEventName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Name of the Google Analytics event. It must always be set.
     * The max allowed display name length is 40 UTF-16 code units.
     * </pre>
     *
     * <code>string event_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for eventName to set.
     * @return This builder for chaining.
     */
    public Builder setEventNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      eventName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long minEventCount_;

    /**
     *
     *
     * <pre>
     * At least one of the following four min/max values must be set. The
     * values set will be ANDed together to qualify an event.
     * The minimum number of times the event occurred. If not set, minimum event
     * count won't be checked.
     * </pre>
     *
     * <code>optional int64 min_event_count = 2;</code>
     *
     * @return Whether the minEventCount field is set.
     */
    @java.lang.Override
    public boolean hasMinEventCount() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * At least one of the following four min/max values must be set. The
     * values set will be ANDed together to qualify an event.
     * The minimum number of times the event occurred. If not set, minimum event
     * count won't be checked.
     * </pre>
     *
     * <code>optional int64 min_event_count = 2;</code>
     *
     * @return The minEventCount.
     */
    @java.lang.Override
    public long getMinEventCount() {
      return minEventCount_;
    }

    /**
     *
     *
     * <pre>
     * At least one of the following four min/max values must be set. The
     * values set will be ANDed together to qualify an event.
     * The minimum number of times the event occurred. If not set, minimum event
     * count won't be checked.
     * </pre>
     *
     * <code>optional int64 min_event_count = 2;</code>
     *
     * @param value The minEventCount to set.
     * @return This builder for chaining.
     */
    public Builder setMinEventCount(long value) {

      minEventCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * At least one of the following four min/max values must be set. The
     * values set will be ANDed together to qualify an event.
     * The minimum number of times the event occurred. If not set, minimum event
     * count won't be checked.
     * </pre>
     *
     * <code>optional int64 min_event_count = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMinEventCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      minEventCount_ = 0L;
      onChanged();
      return this;
    }

    private long maxEventCount_;

    /**
     *
     *
     * <pre>
     * The maximum number of times the event occurred. If not set, maximum event
     * count won't be checked.
     * </pre>
     *
     * <code>optional int64 max_event_count = 3;</code>
     *
     * @return Whether the maxEventCount field is set.
     */
    @java.lang.Override
    public boolean hasMaxEventCount() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * The maximum number of times the event occurred. If not set, maximum event
     * count won't be checked.
     * </pre>
     *
     * <code>optional int64 max_event_count = 3;</code>
     *
     * @return The maxEventCount.
     */
    @java.lang.Override
    public long getMaxEventCount() {
      return maxEventCount_;
    }

    /**
     *
     *
     * <pre>
     * The maximum number of times the event occurred. If not set, maximum event
     * count won't be checked.
     * </pre>
     *
     * <code>optional int64 max_event_count = 3;</code>
     *
     * @param value The maxEventCount to set.
     * @return This builder for chaining.
     */
    public Builder setMaxEventCount(long value) {

      maxEventCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The maximum number of times the event occurred. If not set, maximum event
     * count won't be checked.
     * </pre>
     *
     * <code>optional int64 max_event_count = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxEventCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      maxEventCount_ = 0L;
      onChanged();
      return this;
    }

    private double minEventValue_;

    /**
     *
     *
     * <pre>
     * The minimum revenue generated due to the event. Revenue currency will be
     * defined at the property level. If not set, minimum event value won't be
     * checked.
     * </pre>
     *
     * <code>optional double min_event_value = 4;</code>
     *
     * @return Whether the minEventValue field is set.
     */
    @java.lang.Override
    public boolean hasMinEventValue() {
      return ((bitField0_ & 0x00000008) != 0);
    }

    /**
     *
     *
     * <pre>
     * The minimum revenue generated due to the event. Revenue currency will be
     * defined at the property level. If not set, minimum event value won't be
     * checked.
     * </pre>
     *
     * <code>optional double min_event_value = 4;</code>
     *
     * @return The minEventValue.
     */
    @java.lang.Override
    public double getMinEventValue() {
      return minEventValue_;
    }

    /**
     *
     *
     * <pre>
     * The minimum revenue generated due to the event. Revenue currency will be
     * defined at the property level. If not set, minimum event value won't be
     * checked.
     * </pre>
     *
     * <code>optional double min_event_value = 4;</code>
     *
     * @param value The minEventValue to set.
     * @return This builder for chaining.
     */
    public Builder setMinEventValue(double value) {

      minEventValue_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The minimum revenue generated due to the event. Revenue currency will be
     * defined at the property level. If not set, minimum event value won't be
     * checked.
     * </pre>
     *
     * <code>optional double min_event_value = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMinEventValue() {
      bitField0_ = (bitField0_ & ~0x00000008);
      minEventValue_ = 0D;
      onChanged();
      return this;
    }

    private double maxEventValue_;

    /**
     *
     *
     * <pre>
     * The maximum revenue generated due to the event. Revenue currency will be
     * defined at the property level. If not set, maximum event value won't be
     * checked.
     * </pre>
     *
     * <code>optional double max_event_value = 5;</code>
     *
     * @return Whether the maxEventValue field is set.
     */
    @java.lang.Override
    public boolean hasMaxEventValue() {
      return ((bitField0_ & 0x00000010) != 0);
    }

    /**
     *
     *
     * <pre>
     * The maximum revenue generated due to the event. Revenue currency will be
     * defined at the property level. If not set, maximum event value won't be
     * checked.
     * </pre>
     *
     * <code>optional double max_event_value = 5;</code>
     *
     * @return The maxEventValue.
     */
    @java.lang.Override
    public double getMaxEventValue() {
      return maxEventValue_;
    }

    /**
     *
     *
     * <pre>
     * The maximum revenue generated due to the event. Revenue currency will be
     * defined at the property level. If not set, maximum event value won't be
     * checked.
     * </pre>
     *
     * <code>optional double max_event_value = 5;</code>
     *
     * @param value The maxEventValue to set.
     * @return This builder for chaining.
     */
    public Builder setMaxEventValue(double value) {

      maxEventValue_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The maximum revenue generated due to the event. Revenue currency will be
     * defined at the property level. If not set, maximum event value won't be
     * checked.
     * </pre>
     *
     * <code>optional double max_event_value = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxEventValue() {
      bitField0_ = (bitField0_ & ~0x00000010);
      maxEventValue_ = 0D;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.EventMapping)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.EventMapping)
  private static final com.google.analytics.admin.v1alpha.EventMapping DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.EventMapping();
  }

  public static com.google.analytics.admin.v1alpha.EventMapping getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventMapping> PARSER =
      new com.google.protobuf.AbstractParser<EventMapping>() {
        @java.lang.Override
        public EventMapping parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventMapping> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventMapping> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.EventMapping getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
