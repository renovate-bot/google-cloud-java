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
// source: google/cloud/iap/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.iap.v1;

/**
 *
 *
 * <pre>
 * Allows customers to configure HTTP request paths that'll allow HTTP
 * `OPTIONS` call to bypass authentication and authorization.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iap.v1.CorsSettings}
 */
public final class CorsSettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.iap.v1.CorsSettings)
    CorsSettingsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CorsSettings.newBuilder() to construct.
  private CorsSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CorsSettings() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CorsSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.iap.v1.Service
        .internal_static_google_cloud_iap_v1_CorsSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iap.v1.Service
        .internal_static_google_cloud_iap_v1_CorsSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iap.v1.CorsSettings.class,
            com.google.cloud.iap.v1.CorsSettings.Builder.class);
  }

  private int bitField0_;
  public static final int ALLOW_HTTP_OPTIONS_FIELD_NUMBER = 1;
  private com.google.protobuf.BoolValue allowHttpOptions_;

  /**
   *
   *
   * <pre>
   * Configuration to allow HTTP `OPTIONS` calls to skip
   * authentication and authorization. If undefined, IAP will not apply any
   * special logic to `OPTIONS` requests.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue allow_http_options = 1;</code>
   *
   * @return Whether the allowHttpOptions field is set.
   */
  @java.lang.Override
  public boolean hasAllowHttpOptions() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Configuration to allow HTTP `OPTIONS` calls to skip
   * authentication and authorization. If undefined, IAP will not apply any
   * special logic to `OPTIONS` requests.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue allow_http_options = 1;</code>
   *
   * @return The allowHttpOptions.
   */
  @java.lang.Override
  public com.google.protobuf.BoolValue getAllowHttpOptions() {
    return allowHttpOptions_ == null
        ? com.google.protobuf.BoolValue.getDefaultInstance()
        : allowHttpOptions_;
  }

  /**
   *
   *
   * <pre>
   * Configuration to allow HTTP `OPTIONS` calls to skip
   * authentication and authorization. If undefined, IAP will not apply any
   * special logic to `OPTIONS` requests.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue allow_http_options = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.BoolValueOrBuilder getAllowHttpOptionsOrBuilder() {
    return allowHttpOptions_ == null
        ? com.google.protobuf.BoolValue.getDefaultInstance()
        : allowHttpOptions_;
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
      output.writeMessage(1, getAllowHttpOptions());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getAllowHttpOptions());
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
    if (!(obj instanceof com.google.cloud.iap.v1.CorsSettings)) {
      return super.equals(obj);
    }
    com.google.cloud.iap.v1.CorsSettings other = (com.google.cloud.iap.v1.CorsSettings) obj;

    if (hasAllowHttpOptions() != other.hasAllowHttpOptions()) return false;
    if (hasAllowHttpOptions()) {
      if (!getAllowHttpOptions().equals(other.getAllowHttpOptions())) return false;
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
    if (hasAllowHttpOptions()) {
      hash = (37 * hash) + ALLOW_HTTP_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getAllowHttpOptions().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iap.v1.CorsSettings parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iap.v1.CorsSettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.CorsSettings parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iap.v1.CorsSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.CorsSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iap.v1.CorsSettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.CorsSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iap.v1.CorsSettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.CorsSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.iap.v1.CorsSettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.CorsSettings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iap.v1.CorsSettings parseFrom(
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

  public static Builder newBuilder(com.google.cloud.iap.v1.CorsSettings prototype) {
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
   * Allows customers to configure HTTP request paths that'll allow HTTP
   * `OPTIONS` call to bypass authentication and authorization.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iap.v1.CorsSettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iap.v1.CorsSettings)
      com.google.cloud.iap.v1.CorsSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.iap.v1.Service
          .internal_static_google_cloud_iap_v1_CorsSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iap.v1.Service
          .internal_static_google_cloud_iap_v1_CorsSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iap.v1.CorsSettings.class,
              com.google.cloud.iap.v1.CorsSettings.Builder.class);
    }

    // Construct using com.google.cloud.iap.v1.CorsSettings.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAllowHttpOptionsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      allowHttpOptions_ = null;
      if (allowHttpOptionsBuilder_ != null) {
        allowHttpOptionsBuilder_.dispose();
        allowHttpOptionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.iap.v1.Service
          .internal_static_google_cloud_iap_v1_CorsSettings_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.CorsSettings getDefaultInstanceForType() {
      return com.google.cloud.iap.v1.CorsSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.CorsSettings build() {
      com.google.cloud.iap.v1.CorsSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.CorsSettings buildPartial() {
      com.google.cloud.iap.v1.CorsSettings result = new com.google.cloud.iap.v1.CorsSettings(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.iap.v1.CorsSettings result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.allowHttpOptions_ =
            allowHttpOptionsBuilder_ == null ? allowHttpOptions_ : allowHttpOptionsBuilder_.build();
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
      if (other instanceof com.google.cloud.iap.v1.CorsSettings) {
        return mergeFrom((com.google.cloud.iap.v1.CorsSettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iap.v1.CorsSettings other) {
      if (other == com.google.cloud.iap.v1.CorsSettings.getDefaultInstance()) return this;
      if (other.hasAllowHttpOptions()) {
        mergeAllowHttpOptions(other.getAllowHttpOptions());
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
                input.readMessage(
                    getAllowHttpOptionsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.protobuf.BoolValue allowHttpOptions_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue,
            com.google.protobuf.BoolValue.Builder,
            com.google.protobuf.BoolValueOrBuilder>
        allowHttpOptionsBuilder_;

    /**
     *
     *
     * <pre>
     * Configuration to allow HTTP `OPTIONS` calls to skip
     * authentication and authorization. If undefined, IAP will not apply any
     * special logic to `OPTIONS` requests.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue allow_http_options = 1;</code>
     *
     * @return Whether the allowHttpOptions field is set.
     */
    public boolean hasAllowHttpOptions() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Configuration to allow HTTP `OPTIONS` calls to skip
     * authentication and authorization. If undefined, IAP will not apply any
     * special logic to `OPTIONS` requests.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue allow_http_options = 1;</code>
     *
     * @return The allowHttpOptions.
     */
    public com.google.protobuf.BoolValue getAllowHttpOptions() {
      if (allowHttpOptionsBuilder_ == null) {
        return allowHttpOptions_ == null
            ? com.google.protobuf.BoolValue.getDefaultInstance()
            : allowHttpOptions_;
      } else {
        return allowHttpOptionsBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Configuration to allow HTTP `OPTIONS` calls to skip
     * authentication and authorization. If undefined, IAP will not apply any
     * special logic to `OPTIONS` requests.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue allow_http_options = 1;</code>
     */
    public Builder setAllowHttpOptions(com.google.protobuf.BoolValue value) {
      if (allowHttpOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        allowHttpOptions_ = value;
      } else {
        allowHttpOptionsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Configuration to allow HTTP `OPTIONS` calls to skip
     * authentication and authorization. If undefined, IAP will not apply any
     * special logic to `OPTIONS` requests.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue allow_http_options = 1;</code>
     */
    public Builder setAllowHttpOptions(com.google.protobuf.BoolValue.Builder builderForValue) {
      if (allowHttpOptionsBuilder_ == null) {
        allowHttpOptions_ = builderForValue.build();
      } else {
        allowHttpOptionsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Configuration to allow HTTP `OPTIONS` calls to skip
     * authentication and authorization. If undefined, IAP will not apply any
     * special logic to `OPTIONS` requests.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue allow_http_options = 1;</code>
     */
    public Builder mergeAllowHttpOptions(com.google.protobuf.BoolValue value) {
      if (allowHttpOptionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && allowHttpOptions_ != null
            && allowHttpOptions_ != com.google.protobuf.BoolValue.getDefaultInstance()) {
          getAllowHttpOptionsBuilder().mergeFrom(value);
        } else {
          allowHttpOptions_ = value;
        }
      } else {
        allowHttpOptionsBuilder_.mergeFrom(value);
      }
      if (allowHttpOptions_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Configuration to allow HTTP `OPTIONS` calls to skip
     * authentication and authorization. If undefined, IAP will not apply any
     * special logic to `OPTIONS` requests.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue allow_http_options = 1;</code>
     */
    public Builder clearAllowHttpOptions() {
      bitField0_ = (bitField0_ & ~0x00000001);
      allowHttpOptions_ = null;
      if (allowHttpOptionsBuilder_ != null) {
        allowHttpOptionsBuilder_.dispose();
        allowHttpOptionsBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Configuration to allow HTTP `OPTIONS` calls to skip
     * authentication and authorization. If undefined, IAP will not apply any
     * special logic to `OPTIONS` requests.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue allow_http_options = 1;</code>
     */
    public com.google.protobuf.BoolValue.Builder getAllowHttpOptionsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAllowHttpOptionsFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Configuration to allow HTTP `OPTIONS` calls to skip
     * authentication and authorization. If undefined, IAP will not apply any
     * special logic to `OPTIONS` requests.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue allow_http_options = 1;</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getAllowHttpOptionsOrBuilder() {
      if (allowHttpOptionsBuilder_ != null) {
        return allowHttpOptionsBuilder_.getMessageOrBuilder();
      } else {
        return allowHttpOptions_ == null
            ? com.google.protobuf.BoolValue.getDefaultInstance()
            : allowHttpOptions_;
      }
    }

    /**
     *
     *
     * <pre>
     * Configuration to allow HTTP `OPTIONS` calls to skip
     * authentication and authorization. If undefined, IAP will not apply any
     * special logic to `OPTIONS` requests.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue allow_http_options = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue,
            com.google.protobuf.BoolValue.Builder,
            com.google.protobuf.BoolValueOrBuilder>
        getAllowHttpOptionsFieldBuilder() {
      if (allowHttpOptionsBuilder_ == null) {
        allowHttpOptionsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.BoolValue,
                com.google.protobuf.BoolValue.Builder,
                com.google.protobuf.BoolValueOrBuilder>(
                getAllowHttpOptions(), getParentForChildren(), isClean());
        allowHttpOptions_ = null;
      }
      return allowHttpOptionsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.iap.v1.CorsSettings)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iap.v1.CorsSettings)
  private static final com.google.cloud.iap.v1.CorsSettings DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.iap.v1.CorsSettings();
  }

  public static com.google.cloud.iap.v1.CorsSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CorsSettings> PARSER =
      new com.google.protobuf.AbstractParser<CorsSettings>() {
        @java.lang.Override
        public CorsSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<CorsSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CorsSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iap.v1.CorsSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
