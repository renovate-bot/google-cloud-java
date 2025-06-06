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
// source: google/monitoring/v3/service.proto

// Protobuf Java Version: 3.25.8
package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * Service Level Indicators for which atomic units of service are counted
 * directly.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.RequestBasedSli}
 */
public final class RequestBasedSli extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.RequestBasedSli)
    RequestBasedSliOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use RequestBasedSli.newBuilder() to construct.
  private RequestBasedSli(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RequestBasedSli() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RequestBasedSli();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.ServiceMonitoringProto
        .internal_static_google_monitoring_v3_RequestBasedSli_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.ServiceMonitoringProto
        .internal_static_google_monitoring_v3_RequestBasedSli_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.RequestBasedSli.class,
            com.google.monitoring.v3.RequestBasedSli.Builder.class);
  }

  private int methodCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object method_;

  public enum MethodCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GOOD_TOTAL_RATIO(1),
    DISTRIBUTION_CUT(3),
    METHOD_NOT_SET(0);
    private final int value;

    private MethodCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MethodCase valueOf(int value) {
      return forNumber(value);
    }

    public static MethodCase forNumber(int value) {
      switch (value) {
        case 1:
          return GOOD_TOTAL_RATIO;
        case 3:
          return DISTRIBUTION_CUT;
        case 0:
          return METHOD_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public MethodCase getMethodCase() {
    return MethodCase.forNumber(methodCase_);
  }

  public static final int GOOD_TOTAL_RATIO_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * `good_total_ratio` is used when the ratio of `good_service` to
   * `total_service` is computed from two `TimeSeries`.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeSeriesRatio good_total_ratio = 1;</code>
   *
   * @return Whether the goodTotalRatio field is set.
   */
  @java.lang.Override
  public boolean hasGoodTotalRatio() {
    return methodCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * `good_total_ratio` is used when the ratio of `good_service` to
   * `total_service` is computed from two `TimeSeries`.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeSeriesRatio good_total_ratio = 1;</code>
   *
   * @return The goodTotalRatio.
   */
  @java.lang.Override
  public com.google.monitoring.v3.TimeSeriesRatio getGoodTotalRatio() {
    if (methodCase_ == 1) {
      return (com.google.monitoring.v3.TimeSeriesRatio) method_;
    }
    return com.google.monitoring.v3.TimeSeriesRatio.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * `good_total_ratio` is used when the ratio of `good_service` to
   * `total_service` is computed from two `TimeSeries`.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeSeriesRatio good_total_ratio = 1;</code>
   */
  @java.lang.Override
  public com.google.monitoring.v3.TimeSeriesRatioOrBuilder getGoodTotalRatioOrBuilder() {
    if (methodCase_ == 1) {
      return (com.google.monitoring.v3.TimeSeriesRatio) method_;
    }
    return com.google.monitoring.v3.TimeSeriesRatio.getDefaultInstance();
  }

  public static final int DISTRIBUTION_CUT_FIELD_NUMBER = 3;

  /**
   *
   *
   * <pre>
   * `distribution_cut` is used when `good_service` is a count of values
   * aggregated in a `Distribution` that fall into a good range. The
   * `total_service` is the total count of all values aggregated in the
   * `Distribution`.
   * </pre>
   *
   * <code>.google.monitoring.v3.DistributionCut distribution_cut = 3;</code>
   *
   * @return Whether the distributionCut field is set.
   */
  @java.lang.Override
  public boolean hasDistributionCut() {
    return methodCase_ == 3;
  }

  /**
   *
   *
   * <pre>
   * `distribution_cut` is used when `good_service` is a count of values
   * aggregated in a `Distribution` that fall into a good range. The
   * `total_service` is the total count of all values aggregated in the
   * `Distribution`.
   * </pre>
   *
   * <code>.google.monitoring.v3.DistributionCut distribution_cut = 3;</code>
   *
   * @return The distributionCut.
   */
  @java.lang.Override
  public com.google.monitoring.v3.DistributionCut getDistributionCut() {
    if (methodCase_ == 3) {
      return (com.google.monitoring.v3.DistributionCut) method_;
    }
    return com.google.monitoring.v3.DistributionCut.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * `distribution_cut` is used when `good_service` is a count of values
   * aggregated in a `Distribution` that fall into a good range. The
   * `total_service` is the total count of all values aggregated in the
   * `Distribution`.
   * </pre>
   *
   * <code>.google.monitoring.v3.DistributionCut distribution_cut = 3;</code>
   */
  @java.lang.Override
  public com.google.monitoring.v3.DistributionCutOrBuilder getDistributionCutOrBuilder() {
    if (methodCase_ == 3) {
      return (com.google.monitoring.v3.DistributionCut) method_;
    }
    return com.google.monitoring.v3.DistributionCut.getDefaultInstance();
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
    if (methodCase_ == 1) {
      output.writeMessage(1, (com.google.monitoring.v3.TimeSeriesRatio) method_);
    }
    if (methodCase_ == 3) {
      output.writeMessage(3, (com.google.monitoring.v3.DistributionCut) method_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (methodCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.monitoring.v3.TimeSeriesRatio) method_);
    }
    if (methodCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              3, (com.google.monitoring.v3.DistributionCut) method_);
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
    if (!(obj instanceof com.google.monitoring.v3.RequestBasedSli)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.RequestBasedSli other = (com.google.monitoring.v3.RequestBasedSli) obj;

    if (!getMethodCase().equals(other.getMethodCase())) return false;
    switch (methodCase_) {
      case 1:
        if (!getGoodTotalRatio().equals(other.getGoodTotalRatio())) return false;
        break;
      case 3:
        if (!getDistributionCut().equals(other.getDistributionCut())) return false;
        break;
      case 0:
      default:
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
    switch (methodCase_) {
      case 1:
        hash = (37 * hash) + GOOD_TOTAL_RATIO_FIELD_NUMBER;
        hash = (53 * hash) + getGoodTotalRatio().hashCode();
        break;
      case 3:
        hash = (37 * hash) + DISTRIBUTION_CUT_FIELD_NUMBER;
        hash = (53 * hash) + getDistributionCut().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.RequestBasedSli parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.RequestBasedSli parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.RequestBasedSli parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.RequestBasedSli parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.RequestBasedSli parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.RequestBasedSli parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.RequestBasedSli parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.RequestBasedSli parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.RequestBasedSli parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.RequestBasedSli parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.RequestBasedSli parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.RequestBasedSli parseFrom(
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

  public static Builder newBuilder(com.google.monitoring.v3.RequestBasedSli prototype) {
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
   * Service Level Indicators for which atomic units of service are counted
   * directly.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.RequestBasedSli}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.RequestBasedSli)
      com.google.monitoring.v3.RequestBasedSliOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.ServiceMonitoringProto
          .internal_static_google_monitoring_v3_RequestBasedSli_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.ServiceMonitoringProto
          .internal_static_google_monitoring_v3_RequestBasedSli_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.RequestBasedSli.class,
              com.google.monitoring.v3.RequestBasedSli.Builder.class);
    }

    // Construct using com.google.monitoring.v3.RequestBasedSli.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (goodTotalRatioBuilder_ != null) {
        goodTotalRatioBuilder_.clear();
      }
      if (distributionCutBuilder_ != null) {
        distributionCutBuilder_.clear();
      }
      methodCase_ = 0;
      method_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.ServiceMonitoringProto
          .internal_static_google_monitoring_v3_RequestBasedSli_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.RequestBasedSli getDefaultInstanceForType() {
      return com.google.monitoring.v3.RequestBasedSli.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.RequestBasedSli build() {
      com.google.monitoring.v3.RequestBasedSli result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.RequestBasedSli buildPartial() {
      com.google.monitoring.v3.RequestBasedSli result =
          new com.google.monitoring.v3.RequestBasedSli(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.monitoring.v3.RequestBasedSli result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.monitoring.v3.RequestBasedSli result) {
      result.methodCase_ = methodCase_;
      result.method_ = this.method_;
      if (methodCase_ == 1 && goodTotalRatioBuilder_ != null) {
        result.method_ = goodTotalRatioBuilder_.build();
      }
      if (methodCase_ == 3 && distributionCutBuilder_ != null) {
        result.method_ = distributionCutBuilder_.build();
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
      if (other instanceof com.google.monitoring.v3.RequestBasedSli) {
        return mergeFrom((com.google.monitoring.v3.RequestBasedSli) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.RequestBasedSli other) {
      if (other == com.google.monitoring.v3.RequestBasedSli.getDefaultInstance()) return this;
      switch (other.getMethodCase()) {
        case GOOD_TOTAL_RATIO:
          {
            mergeGoodTotalRatio(other.getGoodTotalRatio());
            break;
          }
        case DISTRIBUTION_CUT:
          {
            mergeDistributionCut(other.getDistributionCut());
            break;
          }
        case METHOD_NOT_SET:
          {
            break;
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
                input.readMessage(getGoodTotalRatioFieldBuilder().getBuilder(), extensionRegistry);
                methodCase_ = 1;
                break;
              } // case 10
            case 26:
              {
                input.readMessage(getDistributionCutFieldBuilder().getBuilder(), extensionRegistry);
                methodCase_ = 3;
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

    private int methodCase_ = 0;
    private java.lang.Object method_;

    public MethodCase getMethodCase() {
      return MethodCase.forNumber(methodCase_);
    }

    public Builder clearMethod() {
      methodCase_ = 0;
      method_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.TimeSeriesRatio,
            com.google.monitoring.v3.TimeSeriesRatio.Builder,
            com.google.monitoring.v3.TimeSeriesRatioOrBuilder>
        goodTotalRatioBuilder_;

    /**
     *
     *
     * <pre>
     * `good_total_ratio` is used when the ratio of `good_service` to
     * `total_service` is computed from two `TimeSeries`.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeriesRatio good_total_ratio = 1;</code>
     *
     * @return Whether the goodTotalRatio field is set.
     */
    @java.lang.Override
    public boolean hasGoodTotalRatio() {
      return methodCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * `good_total_ratio` is used when the ratio of `good_service` to
     * `total_service` is computed from two `TimeSeries`.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeriesRatio good_total_ratio = 1;</code>
     *
     * @return The goodTotalRatio.
     */
    @java.lang.Override
    public com.google.monitoring.v3.TimeSeriesRatio getGoodTotalRatio() {
      if (goodTotalRatioBuilder_ == null) {
        if (methodCase_ == 1) {
          return (com.google.monitoring.v3.TimeSeriesRatio) method_;
        }
        return com.google.monitoring.v3.TimeSeriesRatio.getDefaultInstance();
      } else {
        if (methodCase_ == 1) {
          return goodTotalRatioBuilder_.getMessage();
        }
        return com.google.monitoring.v3.TimeSeriesRatio.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * `good_total_ratio` is used when the ratio of `good_service` to
     * `total_service` is computed from two `TimeSeries`.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeriesRatio good_total_ratio = 1;</code>
     */
    public Builder setGoodTotalRatio(com.google.monitoring.v3.TimeSeriesRatio value) {
      if (goodTotalRatioBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        method_ = value;
        onChanged();
      } else {
        goodTotalRatioBuilder_.setMessage(value);
      }
      methodCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * `good_total_ratio` is used when the ratio of `good_service` to
     * `total_service` is computed from two `TimeSeries`.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeriesRatio good_total_ratio = 1;</code>
     */
    public Builder setGoodTotalRatio(
        com.google.monitoring.v3.TimeSeriesRatio.Builder builderForValue) {
      if (goodTotalRatioBuilder_ == null) {
        method_ = builderForValue.build();
        onChanged();
      } else {
        goodTotalRatioBuilder_.setMessage(builderForValue.build());
      }
      methodCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * `good_total_ratio` is used when the ratio of `good_service` to
     * `total_service` is computed from two `TimeSeries`.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeriesRatio good_total_ratio = 1;</code>
     */
    public Builder mergeGoodTotalRatio(com.google.monitoring.v3.TimeSeriesRatio value) {
      if (goodTotalRatioBuilder_ == null) {
        if (methodCase_ == 1
            && method_ != com.google.monitoring.v3.TimeSeriesRatio.getDefaultInstance()) {
          method_ =
              com.google.monitoring.v3.TimeSeriesRatio.newBuilder(
                      (com.google.monitoring.v3.TimeSeriesRatio) method_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          method_ = value;
        }
        onChanged();
      } else {
        if (methodCase_ == 1) {
          goodTotalRatioBuilder_.mergeFrom(value);
        } else {
          goodTotalRatioBuilder_.setMessage(value);
        }
      }
      methodCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * `good_total_ratio` is used when the ratio of `good_service` to
     * `total_service` is computed from two `TimeSeries`.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeriesRatio good_total_ratio = 1;</code>
     */
    public Builder clearGoodTotalRatio() {
      if (goodTotalRatioBuilder_ == null) {
        if (methodCase_ == 1) {
          methodCase_ = 0;
          method_ = null;
          onChanged();
        }
      } else {
        if (methodCase_ == 1) {
          methodCase_ = 0;
          method_ = null;
        }
        goodTotalRatioBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * `good_total_ratio` is used when the ratio of `good_service` to
     * `total_service` is computed from two `TimeSeries`.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeriesRatio good_total_ratio = 1;</code>
     */
    public com.google.monitoring.v3.TimeSeriesRatio.Builder getGoodTotalRatioBuilder() {
      return getGoodTotalRatioFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * `good_total_ratio` is used when the ratio of `good_service` to
     * `total_service` is computed from two `TimeSeries`.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeriesRatio good_total_ratio = 1;</code>
     */
    @java.lang.Override
    public com.google.monitoring.v3.TimeSeriesRatioOrBuilder getGoodTotalRatioOrBuilder() {
      if ((methodCase_ == 1) && (goodTotalRatioBuilder_ != null)) {
        return goodTotalRatioBuilder_.getMessageOrBuilder();
      } else {
        if (methodCase_ == 1) {
          return (com.google.monitoring.v3.TimeSeriesRatio) method_;
        }
        return com.google.monitoring.v3.TimeSeriesRatio.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * `good_total_ratio` is used when the ratio of `good_service` to
     * `total_service` is computed from two `TimeSeries`.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeriesRatio good_total_ratio = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.TimeSeriesRatio,
            com.google.monitoring.v3.TimeSeriesRatio.Builder,
            com.google.monitoring.v3.TimeSeriesRatioOrBuilder>
        getGoodTotalRatioFieldBuilder() {
      if (goodTotalRatioBuilder_ == null) {
        if (!(methodCase_ == 1)) {
          method_ = com.google.monitoring.v3.TimeSeriesRatio.getDefaultInstance();
        }
        goodTotalRatioBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.monitoring.v3.TimeSeriesRatio,
                com.google.monitoring.v3.TimeSeriesRatio.Builder,
                com.google.monitoring.v3.TimeSeriesRatioOrBuilder>(
                (com.google.monitoring.v3.TimeSeriesRatio) method_,
                getParentForChildren(),
                isClean());
        method_ = null;
      }
      methodCase_ = 1;
      onChanged();
      return goodTotalRatioBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.DistributionCut,
            com.google.monitoring.v3.DistributionCut.Builder,
            com.google.monitoring.v3.DistributionCutOrBuilder>
        distributionCutBuilder_;

    /**
     *
     *
     * <pre>
     * `distribution_cut` is used when `good_service` is a count of values
     * aggregated in a `Distribution` that fall into a good range. The
     * `total_service` is the total count of all values aggregated in the
     * `Distribution`.
     * </pre>
     *
     * <code>.google.monitoring.v3.DistributionCut distribution_cut = 3;</code>
     *
     * @return Whether the distributionCut field is set.
     */
    @java.lang.Override
    public boolean hasDistributionCut() {
      return methodCase_ == 3;
    }

    /**
     *
     *
     * <pre>
     * `distribution_cut` is used when `good_service` is a count of values
     * aggregated in a `Distribution` that fall into a good range. The
     * `total_service` is the total count of all values aggregated in the
     * `Distribution`.
     * </pre>
     *
     * <code>.google.monitoring.v3.DistributionCut distribution_cut = 3;</code>
     *
     * @return The distributionCut.
     */
    @java.lang.Override
    public com.google.monitoring.v3.DistributionCut getDistributionCut() {
      if (distributionCutBuilder_ == null) {
        if (methodCase_ == 3) {
          return (com.google.monitoring.v3.DistributionCut) method_;
        }
        return com.google.monitoring.v3.DistributionCut.getDefaultInstance();
      } else {
        if (methodCase_ == 3) {
          return distributionCutBuilder_.getMessage();
        }
        return com.google.monitoring.v3.DistributionCut.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * `distribution_cut` is used when `good_service` is a count of values
     * aggregated in a `Distribution` that fall into a good range. The
     * `total_service` is the total count of all values aggregated in the
     * `Distribution`.
     * </pre>
     *
     * <code>.google.monitoring.v3.DistributionCut distribution_cut = 3;</code>
     */
    public Builder setDistributionCut(com.google.monitoring.v3.DistributionCut value) {
      if (distributionCutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        method_ = value;
        onChanged();
      } else {
        distributionCutBuilder_.setMessage(value);
      }
      methodCase_ = 3;
      return this;
    }

    /**
     *
     *
     * <pre>
     * `distribution_cut` is used when `good_service` is a count of values
     * aggregated in a `Distribution` that fall into a good range. The
     * `total_service` is the total count of all values aggregated in the
     * `Distribution`.
     * </pre>
     *
     * <code>.google.monitoring.v3.DistributionCut distribution_cut = 3;</code>
     */
    public Builder setDistributionCut(
        com.google.monitoring.v3.DistributionCut.Builder builderForValue) {
      if (distributionCutBuilder_ == null) {
        method_ = builderForValue.build();
        onChanged();
      } else {
        distributionCutBuilder_.setMessage(builderForValue.build());
      }
      methodCase_ = 3;
      return this;
    }

    /**
     *
     *
     * <pre>
     * `distribution_cut` is used when `good_service` is a count of values
     * aggregated in a `Distribution` that fall into a good range. The
     * `total_service` is the total count of all values aggregated in the
     * `Distribution`.
     * </pre>
     *
     * <code>.google.monitoring.v3.DistributionCut distribution_cut = 3;</code>
     */
    public Builder mergeDistributionCut(com.google.monitoring.v3.DistributionCut value) {
      if (distributionCutBuilder_ == null) {
        if (methodCase_ == 3
            && method_ != com.google.monitoring.v3.DistributionCut.getDefaultInstance()) {
          method_ =
              com.google.monitoring.v3.DistributionCut.newBuilder(
                      (com.google.monitoring.v3.DistributionCut) method_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          method_ = value;
        }
        onChanged();
      } else {
        if (methodCase_ == 3) {
          distributionCutBuilder_.mergeFrom(value);
        } else {
          distributionCutBuilder_.setMessage(value);
        }
      }
      methodCase_ = 3;
      return this;
    }

    /**
     *
     *
     * <pre>
     * `distribution_cut` is used when `good_service` is a count of values
     * aggregated in a `Distribution` that fall into a good range. The
     * `total_service` is the total count of all values aggregated in the
     * `Distribution`.
     * </pre>
     *
     * <code>.google.monitoring.v3.DistributionCut distribution_cut = 3;</code>
     */
    public Builder clearDistributionCut() {
      if (distributionCutBuilder_ == null) {
        if (methodCase_ == 3) {
          methodCase_ = 0;
          method_ = null;
          onChanged();
        }
      } else {
        if (methodCase_ == 3) {
          methodCase_ = 0;
          method_ = null;
        }
        distributionCutBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * `distribution_cut` is used when `good_service` is a count of values
     * aggregated in a `Distribution` that fall into a good range. The
     * `total_service` is the total count of all values aggregated in the
     * `Distribution`.
     * </pre>
     *
     * <code>.google.monitoring.v3.DistributionCut distribution_cut = 3;</code>
     */
    public com.google.monitoring.v3.DistributionCut.Builder getDistributionCutBuilder() {
      return getDistributionCutFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * `distribution_cut` is used when `good_service` is a count of values
     * aggregated in a `Distribution` that fall into a good range. The
     * `total_service` is the total count of all values aggregated in the
     * `Distribution`.
     * </pre>
     *
     * <code>.google.monitoring.v3.DistributionCut distribution_cut = 3;</code>
     */
    @java.lang.Override
    public com.google.monitoring.v3.DistributionCutOrBuilder getDistributionCutOrBuilder() {
      if ((methodCase_ == 3) && (distributionCutBuilder_ != null)) {
        return distributionCutBuilder_.getMessageOrBuilder();
      } else {
        if (methodCase_ == 3) {
          return (com.google.monitoring.v3.DistributionCut) method_;
        }
        return com.google.monitoring.v3.DistributionCut.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * `distribution_cut` is used when `good_service` is a count of values
     * aggregated in a `Distribution` that fall into a good range. The
     * `total_service` is the total count of all values aggregated in the
     * `Distribution`.
     * </pre>
     *
     * <code>.google.monitoring.v3.DistributionCut distribution_cut = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.DistributionCut,
            com.google.monitoring.v3.DistributionCut.Builder,
            com.google.monitoring.v3.DistributionCutOrBuilder>
        getDistributionCutFieldBuilder() {
      if (distributionCutBuilder_ == null) {
        if (!(methodCase_ == 3)) {
          method_ = com.google.monitoring.v3.DistributionCut.getDefaultInstance();
        }
        distributionCutBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.monitoring.v3.DistributionCut,
                com.google.monitoring.v3.DistributionCut.Builder,
                com.google.monitoring.v3.DistributionCutOrBuilder>(
                (com.google.monitoring.v3.DistributionCut) method_,
                getParentForChildren(),
                isClean());
        method_ = null;
      }
      methodCase_ = 3;
      onChanged();
      return distributionCutBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.RequestBasedSli)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.RequestBasedSli)
  private static final com.google.monitoring.v3.RequestBasedSli DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.RequestBasedSli();
  }

  public static com.google.monitoring.v3.RequestBasedSli getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestBasedSli> PARSER =
      new com.google.protobuf.AbstractParser<RequestBasedSli>() {
        @java.lang.Override
        public RequestBasedSli parsePartialFrom(
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

  public static com.google.protobuf.Parser<RequestBasedSli> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestBasedSli> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.RequestBasedSli getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
