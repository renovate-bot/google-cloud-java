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
// source: google/analytics/admin/v1alpha/audience.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Defines a simple filter that a user must satisfy to be a member of the
 * Audience.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.AudienceSimpleFilter}
 */
public final class AudienceSimpleFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.AudienceSimpleFilter)
    AudienceSimpleFilterOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use AudienceSimpleFilter.newBuilder() to construct.
  private AudienceSimpleFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AudienceSimpleFilter() {
    scope_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AudienceSimpleFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AudienceProto
        .internal_static_google_analytics_admin_v1alpha_AudienceSimpleFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AudienceProto
        .internal_static_google_analytics_admin_v1alpha_AudienceSimpleFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.AudienceSimpleFilter.class,
            com.google.analytics.admin.v1alpha.AudienceSimpleFilter.Builder.class);
  }

  private int bitField0_;
  public static final int SCOPE_FIELD_NUMBER = 1;
  private int scope_ = 0;

  /**
   *
   *
   * <pre>
   * Required. Immutable. Specifies the scope for this filter.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AudienceFilterScope scope = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for scope.
   */
  @java.lang.Override
  public int getScopeValue() {
    return scope_;
  }

  /**
   *
   *
   * <pre>
   * Required. Immutable. Specifies the scope for this filter.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AudienceFilterScope scope = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The scope.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AudienceFilterScope getScope() {
    com.google.analytics.admin.v1alpha.AudienceFilterScope result =
        com.google.analytics.admin.v1alpha.AudienceFilterScope.forNumber(scope_);
    return result == null
        ? com.google.analytics.admin.v1alpha.AudienceFilterScope.UNRECOGNIZED
        : result;
  }

  public static final int FILTER_EXPRESSION_FIELD_NUMBER = 2;
  private com.google.analytics.admin.v1alpha.AudienceFilterExpression filterExpression_;

  /**
   *
   *
   * <pre>
   * Required. Immutable. A logical expression of Audience dimension, metric, or
   * event filters.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expression = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the filterExpression field is set.
   */
  @java.lang.Override
  public boolean hasFilterExpression() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. Immutable. A logical expression of Audience dimension, metric, or
   * event filters.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expression = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The filterExpression.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AudienceFilterExpression getFilterExpression() {
    return filterExpression_ == null
        ? com.google.analytics.admin.v1alpha.AudienceFilterExpression.getDefaultInstance()
        : filterExpression_;
  }

  /**
   *
   *
   * <pre>
   * Required. Immutable. A logical expression of Audience dimension, metric, or
   * event filters.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expression = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder
      getFilterExpressionOrBuilder() {
    return filterExpression_ == null
        ? com.google.analytics.admin.v1alpha.AudienceFilterExpression.getDefaultInstance()
        : filterExpression_;
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
    if (scope_
        != com.google.analytics.admin.v1alpha.AudienceFilterScope.AUDIENCE_FILTER_SCOPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, scope_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getFilterExpression());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scope_
        != com.google.analytics.admin.v1alpha.AudienceFilterScope.AUDIENCE_FILTER_SCOPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, scope_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getFilterExpression());
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.AudienceSimpleFilter)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.AudienceSimpleFilter other =
        (com.google.analytics.admin.v1alpha.AudienceSimpleFilter) obj;

    if (scope_ != other.scope_) return false;
    if (hasFilterExpression() != other.hasFilterExpression()) return false;
    if (hasFilterExpression()) {
      if (!getFilterExpression().equals(other.getFilterExpression())) return false;
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
    hash = (37 * hash) + SCOPE_FIELD_NUMBER;
    hash = (53 * hash) + scope_;
    if (hasFilterExpression()) {
      hash = (37 * hash) + FILTER_EXPRESSION_FIELD_NUMBER;
      hash = (53 * hash) + getFilterExpression().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.AudienceSimpleFilter parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AudienceSimpleFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AudienceSimpleFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AudienceSimpleFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AudienceSimpleFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AudienceSimpleFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AudienceSimpleFilter parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AudienceSimpleFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AudienceSimpleFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AudienceSimpleFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AudienceSimpleFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AudienceSimpleFilter parseFrom(
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
      com.google.analytics.admin.v1alpha.AudienceSimpleFilter prototype) {
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
   * Defines a simple filter that a user must satisfy to be a member of the
   * Audience.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.AudienceSimpleFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.AudienceSimpleFilter)
      com.google.analytics.admin.v1alpha.AudienceSimpleFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AudienceProto
          .internal_static_google_analytics_admin_v1alpha_AudienceSimpleFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AudienceProto
          .internal_static_google_analytics_admin_v1alpha_AudienceSimpleFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.AudienceSimpleFilter.class,
              com.google.analytics.admin.v1alpha.AudienceSimpleFilter.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.AudienceSimpleFilter.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getFilterExpressionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      scope_ = 0;
      filterExpression_ = null;
      if (filterExpressionBuilder_ != null) {
        filterExpressionBuilder_.dispose();
        filterExpressionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AudienceProto
          .internal_static_google_analytics_admin_v1alpha_AudienceSimpleFilter_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AudienceSimpleFilter getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.AudienceSimpleFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AudienceSimpleFilter build() {
      com.google.analytics.admin.v1alpha.AudienceSimpleFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AudienceSimpleFilter buildPartial() {
      com.google.analytics.admin.v1alpha.AudienceSimpleFilter result =
          new com.google.analytics.admin.v1alpha.AudienceSimpleFilter(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.admin.v1alpha.AudienceSimpleFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scope_ = scope_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.filterExpression_ =
            filterExpressionBuilder_ == null ? filterExpression_ : filterExpressionBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1alpha.AudienceSimpleFilter) {
        return mergeFrom((com.google.analytics.admin.v1alpha.AudienceSimpleFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.AudienceSimpleFilter other) {
      if (other == com.google.analytics.admin.v1alpha.AudienceSimpleFilter.getDefaultInstance())
        return this;
      if (other.scope_ != 0) {
        setScopeValue(other.getScopeValue());
      }
      if (other.hasFilterExpression()) {
        mergeFilterExpression(other.getFilterExpression());
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
                scope_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(
                    getFilterExpressionFieldBuilder().getBuilder(), extensionRegistry);
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

    private int scope_ = 0;

    /**
     *
     *
     * <pre>
     * Required. Immutable. Specifies the scope for this filter.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterScope scope = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return The enum numeric value on the wire for scope.
     */
    @java.lang.Override
    public int getScopeValue() {
      return scope_;
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. Specifies the scope for this filter.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterScope scope = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @param value The enum numeric value on the wire for scope to set.
     * @return This builder for chaining.
     */
    public Builder setScopeValue(int value) {
      scope_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. Specifies the scope for this filter.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterScope scope = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return The scope.
     */
    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AudienceFilterScope getScope() {
      com.google.analytics.admin.v1alpha.AudienceFilterScope result =
          com.google.analytics.admin.v1alpha.AudienceFilterScope.forNumber(scope_);
      return result == null
          ? com.google.analytics.admin.v1alpha.AudienceFilterScope.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. Specifies the scope for this filter.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterScope scope = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @param value The scope to set.
     * @return This builder for chaining.
     */
    public Builder setScope(com.google.analytics.admin.v1alpha.AudienceFilterScope value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      scope_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. Specifies the scope for this filter.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterScope scope = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearScope() {
      bitField0_ = (bitField0_ & ~0x00000001);
      scope_ = 0;
      onChanged();
      return this;
    }

    private com.google.analytics.admin.v1alpha.AudienceFilterExpression filterExpression_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.AudienceFilterExpression,
            com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder,
            com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder>
        filterExpressionBuilder_;

    /**
     *
     *
     * <pre>
     * Required. Immutable. A logical expression of Audience dimension, metric, or
     * event filters.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expression = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return Whether the filterExpression field is set.
     */
    public boolean hasFilterExpression() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. A logical expression of Audience dimension, metric, or
     * event filters.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expression = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return The filterExpression.
     */
    public com.google.analytics.admin.v1alpha.AudienceFilterExpression getFilterExpression() {
      if (filterExpressionBuilder_ == null) {
        return filterExpression_ == null
            ? com.google.analytics.admin.v1alpha.AudienceFilterExpression.getDefaultInstance()
            : filterExpression_;
      } else {
        return filterExpressionBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. A logical expression of Audience dimension, metric, or
     * event filters.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expression = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     */
    public Builder setFilterExpression(
        com.google.analytics.admin.v1alpha.AudienceFilterExpression value) {
      if (filterExpressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filterExpression_ = value;
      } else {
        filterExpressionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. A logical expression of Audience dimension, metric, or
     * event filters.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expression = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     */
    public Builder setFilterExpression(
        com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder builderForValue) {
      if (filterExpressionBuilder_ == null) {
        filterExpression_ = builderForValue.build();
      } else {
        filterExpressionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. A logical expression of Audience dimension, metric, or
     * event filters.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expression = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     */
    public Builder mergeFilterExpression(
        com.google.analytics.admin.v1alpha.AudienceFilterExpression value) {
      if (filterExpressionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && filterExpression_ != null
            && filterExpression_
                != com.google.analytics.admin.v1alpha.AudienceFilterExpression
                    .getDefaultInstance()) {
          getFilterExpressionBuilder().mergeFrom(value);
        } else {
          filterExpression_ = value;
        }
      } else {
        filterExpressionBuilder_.mergeFrom(value);
      }
      if (filterExpression_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. A logical expression of Audience dimension, metric, or
     * event filters.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expression = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     */
    public Builder clearFilterExpression() {
      bitField0_ = (bitField0_ & ~0x00000002);
      filterExpression_ = null;
      if (filterExpressionBuilder_ != null) {
        filterExpressionBuilder_.dispose();
        filterExpressionBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. A logical expression of Audience dimension, metric, or
     * event filters.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expression = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder
        getFilterExpressionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFilterExpressionFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. A logical expression of Audience dimension, metric, or
     * event filters.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expression = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder
        getFilterExpressionOrBuilder() {
      if (filterExpressionBuilder_ != null) {
        return filterExpressionBuilder_.getMessageOrBuilder();
      } else {
        return filterExpression_ == null
            ? com.google.analytics.admin.v1alpha.AudienceFilterExpression.getDefaultInstance()
            : filterExpression_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. A logical expression of Audience dimension, metric, or
     * event filters.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterExpression filter_expression = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.AudienceFilterExpression,
            com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder,
            com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder>
        getFilterExpressionFieldBuilder() {
      if (filterExpressionBuilder_ == null) {
        filterExpressionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.AudienceFilterExpression,
                com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder,
                com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder>(
                getFilterExpression(), getParentForChildren(), isClean());
        filterExpression_ = null;
      }
      return filterExpressionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.AudienceSimpleFilter)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.AudienceSimpleFilter)
  private static final com.google.analytics.admin.v1alpha.AudienceSimpleFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.AudienceSimpleFilter();
  }

  public static com.google.analytics.admin.v1alpha.AudienceSimpleFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AudienceSimpleFilter> PARSER =
      new com.google.protobuf.AbstractParser<AudienceSimpleFilter>() {
        @java.lang.Override
        public AudienceSimpleFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<AudienceSimpleFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AudienceSimpleFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AudienceSimpleFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
