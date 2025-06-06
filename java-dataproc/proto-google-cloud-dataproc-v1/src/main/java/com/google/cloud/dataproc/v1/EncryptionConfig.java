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
// source: google/cloud/dataproc/v1/clusters.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * Encryption settings for the cluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.EncryptionConfig}
 */
public final class EncryptionConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.EncryptionConfig)
    EncryptionConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use EncryptionConfig.newBuilder() to construct.
  private EncryptionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EncryptionConfig() {
    gcePdKmsKeyName_ = "";
    kmsKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EncryptionConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.ClustersProto
        .internal_static_google_cloud_dataproc_v1_EncryptionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.ClustersProto
        .internal_static_google_cloud_dataproc_v1_EncryptionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.EncryptionConfig.class,
            com.google.cloud.dataproc.v1.EncryptionConfig.Builder.class);
  }

  public static final int GCE_PD_KMS_KEY_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object gcePdKmsKeyName_ = "";

  /**
   *
   *
   * <pre>
   * Optional. The Cloud KMS key resource name to use for persistent disk
   * encryption for all instances in the cluster. See [Use CMEK with cluster
   * data]
   * (https://cloud.google.com//dataproc/docs/concepts/configuring-clusters/customer-managed-encryption#use_cmek_with_cluster_data)
   * for more information.
   * </pre>
   *
   * <code>string gce_pd_kms_key_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The gcePdKmsKeyName.
   */
  @java.lang.Override
  public java.lang.String getGcePdKmsKeyName() {
    java.lang.Object ref = gcePdKmsKeyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gcePdKmsKeyName_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. The Cloud KMS key resource name to use for persistent disk
   * encryption for all instances in the cluster. See [Use CMEK with cluster
   * data]
   * (https://cloud.google.com//dataproc/docs/concepts/configuring-clusters/customer-managed-encryption#use_cmek_with_cluster_data)
   * for more information.
   * </pre>
   *
   * <code>string gce_pd_kms_key_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for gcePdKmsKeyName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGcePdKmsKeyNameBytes() {
    java.lang.Object ref = gcePdKmsKeyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      gcePdKmsKeyName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KMS_KEY_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object kmsKey_ = "";

  /**
   *
   *
   * <pre>
   * Optional. The Cloud KMS key resource name to use for cluster persistent
   * disk and job argument encryption. See [Use CMEK with cluster data]
   * (https://cloud.google.com//dataproc/docs/concepts/configuring-clusters/customer-managed-encryption#use_cmek_with_cluster_data)
   * for more information.
   *
   * When this key resource name is provided, the following job arguments of
   * the following job types submitted to the cluster are encrypted using CMEK:
   *
   * * [FlinkJob
   * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/FlinkJob)
   * * [HadoopJob
   * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/HadoopJob)
   * * [SparkJob
   * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkJob)
   * * [SparkRJob
   * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkRJob)
   * * [PySparkJob
   * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/PySparkJob)
   * * [SparkSqlJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkSqlJob)
   *   scriptVariables and queryList.queries
   * * [HiveJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/HiveJob)
   *   scriptVariables and queryList.queries
   * * [PigJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/PigJob)
   *   scriptVariables and queryList.queries
   * * [PrestoJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/PrestoJob)
   *   scriptVariables and queryList.queries
   * </pre>
   *
   * <code>
   * string kms_key = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The kmsKey.
   */
  @java.lang.Override
  public java.lang.String getKmsKey() {
    java.lang.Object ref = kmsKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kmsKey_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. The Cloud KMS key resource name to use for cluster persistent
   * disk and job argument encryption. See [Use CMEK with cluster data]
   * (https://cloud.google.com//dataproc/docs/concepts/configuring-clusters/customer-managed-encryption#use_cmek_with_cluster_data)
   * for more information.
   *
   * When this key resource name is provided, the following job arguments of
   * the following job types submitted to the cluster are encrypted using CMEK:
   *
   * * [FlinkJob
   * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/FlinkJob)
   * * [HadoopJob
   * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/HadoopJob)
   * * [SparkJob
   * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkJob)
   * * [SparkRJob
   * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkRJob)
   * * [PySparkJob
   * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/PySparkJob)
   * * [SparkSqlJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkSqlJob)
   *   scriptVariables and queryList.queries
   * * [HiveJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/HiveJob)
   *   scriptVariables and queryList.queries
   * * [PigJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/PigJob)
   *   scriptVariables and queryList.queries
   * * [PrestoJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/PrestoJob)
   *   scriptVariables and queryList.queries
   * </pre>
   *
   * <code>
   * string kms_key = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for kmsKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKmsKeyBytes() {
    java.lang.Object ref = kmsKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      kmsKey_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gcePdKmsKeyName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, gcePdKmsKeyName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kmsKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, kmsKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gcePdKmsKeyName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, gcePdKmsKeyName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kmsKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, kmsKey_);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.EncryptionConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.EncryptionConfig other =
        (com.google.cloud.dataproc.v1.EncryptionConfig) obj;

    if (!getGcePdKmsKeyName().equals(other.getGcePdKmsKeyName())) return false;
    if (!getKmsKey().equals(other.getKmsKey())) return false;
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
    hash = (37 * hash) + GCE_PD_KMS_KEY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getGcePdKmsKeyName().hashCode();
    hash = (37 * hash) + KMS_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKmsKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.EncryptionConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.EncryptionConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.EncryptionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.EncryptionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.EncryptionConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.EncryptionConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.EncryptionConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.EncryptionConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.EncryptionConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.EncryptionConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.EncryptionConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.EncryptionConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1.EncryptionConfig prototype) {
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
   * Encryption settings for the cluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.EncryptionConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.EncryptionConfig)
      com.google.cloud.dataproc.v1.EncryptionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_EncryptionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_EncryptionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.EncryptionConfig.class,
              com.google.cloud.dataproc.v1.EncryptionConfig.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.EncryptionConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      gcePdKmsKeyName_ = "";
      kmsKey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_EncryptionConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.EncryptionConfig getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.EncryptionConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.EncryptionConfig build() {
      com.google.cloud.dataproc.v1.EncryptionConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.EncryptionConfig buildPartial() {
      com.google.cloud.dataproc.v1.EncryptionConfig result =
          new com.google.cloud.dataproc.v1.EncryptionConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataproc.v1.EncryptionConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.gcePdKmsKeyName_ = gcePdKmsKeyName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.kmsKey_ = kmsKey_;
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
      if (other instanceof com.google.cloud.dataproc.v1.EncryptionConfig) {
        return mergeFrom((com.google.cloud.dataproc.v1.EncryptionConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.EncryptionConfig other) {
      if (other == com.google.cloud.dataproc.v1.EncryptionConfig.getDefaultInstance()) return this;
      if (!other.getGcePdKmsKeyName().isEmpty()) {
        gcePdKmsKeyName_ = other.gcePdKmsKeyName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getKmsKey().isEmpty()) {
        kmsKey_ = other.kmsKey_;
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
                gcePdKmsKeyName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                kmsKey_ = input.readStringRequireUtf8();
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

    private java.lang.Object gcePdKmsKeyName_ = "";

    /**
     *
     *
     * <pre>
     * Optional. The Cloud KMS key resource name to use for persistent disk
     * encryption for all instances in the cluster. See [Use CMEK with cluster
     * data]
     * (https://cloud.google.com//dataproc/docs/concepts/configuring-clusters/customer-managed-encryption#use_cmek_with_cluster_data)
     * for more information.
     * </pre>
     *
     * <code>string gce_pd_kms_key_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The gcePdKmsKeyName.
     */
    public java.lang.String getGcePdKmsKeyName() {
      java.lang.Object ref = gcePdKmsKeyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gcePdKmsKeyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The Cloud KMS key resource name to use for persistent disk
     * encryption for all instances in the cluster. See [Use CMEK with cluster
     * data]
     * (https://cloud.google.com//dataproc/docs/concepts/configuring-clusters/customer-managed-encryption#use_cmek_with_cluster_data)
     * for more information.
     * </pre>
     *
     * <code>string gce_pd_kms_key_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for gcePdKmsKeyName.
     */
    public com.google.protobuf.ByteString getGcePdKmsKeyNameBytes() {
      java.lang.Object ref = gcePdKmsKeyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        gcePdKmsKeyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The Cloud KMS key resource name to use for persistent disk
     * encryption for all instances in the cluster. See [Use CMEK with cluster
     * data]
     * (https://cloud.google.com//dataproc/docs/concepts/configuring-clusters/customer-managed-encryption#use_cmek_with_cluster_data)
     * for more information.
     * </pre>
     *
     * <code>string gce_pd_kms_key_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The gcePdKmsKeyName to set.
     * @return This builder for chaining.
     */
    public Builder setGcePdKmsKeyName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      gcePdKmsKeyName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The Cloud KMS key resource name to use for persistent disk
     * encryption for all instances in the cluster. See [Use CMEK with cluster
     * data]
     * (https://cloud.google.com//dataproc/docs/concepts/configuring-clusters/customer-managed-encryption#use_cmek_with_cluster_data)
     * for more information.
     * </pre>
     *
     * <code>string gce_pd_kms_key_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGcePdKmsKeyName() {
      gcePdKmsKeyName_ = getDefaultInstance().getGcePdKmsKeyName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The Cloud KMS key resource name to use for persistent disk
     * encryption for all instances in the cluster. See [Use CMEK with cluster
     * data]
     * (https://cloud.google.com//dataproc/docs/concepts/configuring-clusters/customer-managed-encryption#use_cmek_with_cluster_data)
     * for more information.
     * </pre>
     *
     * <code>string gce_pd_kms_key_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for gcePdKmsKeyName to set.
     * @return This builder for chaining.
     */
    public Builder setGcePdKmsKeyNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      gcePdKmsKeyName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object kmsKey_ = "";

    /**
     *
     *
     * <pre>
     * Optional. The Cloud KMS key resource name to use for cluster persistent
     * disk and job argument encryption. See [Use CMEK with cluster data]
     * (https://cloud.google.com//dataproc/docs/concepts/configuring-clusters/customer-managed-encryption#use_cmek_with_cluster_data)
     * for more information.
     *
     * When this key resource name is provided, the following job arguments of
     * the following job types submitted to the cluster are encrypted using CMEK:
     *
     * * [FlinkJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/FlinkJob)
     * * [HadoopJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/HadoopJob)
     * * [SparkJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkJob)
     * * [SparkRJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkRJob)
     * * [PySparkJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/PySparkJob)
     * * [SparkSqlJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkSqlJob)
     *   scriptVariables and queryList.queries
     * * [HiveJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/HiveJob)
     *   scriptVariables and queryList.queries
     * * [PigJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/PigJob)
     *   scriptVariables and queryList.queries
     * * [PrestoJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/PrestoJob)
     *   scriptVariables and queryList.queries
     * </pre>
     *
     * <code>
     * string kms_key = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The kmsKey.
     */
    public java.lang.String getKmsKey() {
      java.lang.Object ref = kmsKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kmsKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The Cloud KMS key resource name to use for cluster persistent
     * disk and job argument encryption. See [Use CMEK with cluster data]
     * (https://cloud.google.com//dataproc/docs/concepts/configuring-clusters/customer-managed-encryption#use_cmek_with_cluster_data)
     * for more information.
     *
     * When this key resource name is provided, the following job arguments of
     * the following job types submitted to the cluster are encrypted using CMEK:
     *
     * * [FlinkJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/FlinkJob)
     * * [HadoopJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/HadoopJob)
     * * [SparkJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkJob)
     * * [SparkRJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkRJob)
     * * [PySparkJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/PySparkJob)
     * * [SparkSqlJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkSqlJob)
     *   scriptVariables and queryList.queries
     * * [HiveJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/HiveJob)
     *   scriptVariables and queryList.queries
     * * [PigJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/PigJob)
     *   scriptVariables and queryList.queries
     * * [PrestoJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/PrestoJob)
     *   scriptVariables and queryList.queries
     * </pre>
     *
     * <code>
     * string kms_key = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for kmsKey.
     */
    public com.google.protobuf.ByteString getKmsKeyBytes() {
      java.lang.Object ref = kmsKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        kmsKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The Cloud KMS key resource name to use for cluster persistent
     * disk and job argument encryption. See [Use CMEK with cluster data]
     * (https://cloud.google.com//dataproc/docs/concepts/configuring-clusters/customer-managed-encryption#use_cmek_with_cluster_data)
     * for more information.
     *
     * When this key resource name is provided, the following job arguments of
     * the following job types submitted to the cluster are encrypted using CMEK:
     *
     * * [FlinkJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/FlinkJob)
     * * [HadoopJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/HadoopJob)
     * * [SparkJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkJob)
     * * [SparkRJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkRJob)
     * * [PySparkJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/PySparkJob)
     * * [SparkSqlJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkSqlJob)
     *   scriptVariables and queryList.queries
     * * [HiveJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/HiveJob)
     *   scriptVariables and queryList.queries
     * * [PigJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/PigJob)
     *   scriptVariables and queryList.queries
     * * [PrestoJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/PrestoJob)
     *   scriptVariables and queryList.queries
     * </pre>
     *
     * <code>
     * string kms_key = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The kmsKey to set.
     * @return This builder for chaining.
     */
    public Builder setKmsKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      kmsKey_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The Cloud KMS key resource name to use for cluster persistent
     * disk and job argument encryption. See [Use CMEK with cluster data]
     * (https://cloud.google.com//dataproc/docs/concepts/configuring-clusters/customer-managed-encryption#use_cmek_with_cluster_data)
     * for more information.
     *
     * When this key resource name is provided, the following job arguments of
     * the following job types submitted to the cluster are encrypted using CMEK:
     *
     * * [FlinkJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/FlinkJob)
     * * [HadoopJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/HadoopJob)
     * * [SparkJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkJob)
     * * [SparkRJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkRJob)
     * * [PySparkJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/PySparkJob)
     * * [SparkSqlJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkSqlJob)
     *   scriptVariables and queryList.queries
     * * [HiveJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/HiveJob)
     *   scriptVariables and queryList.queries
     * * [PigJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/PigJob)
     *   scriptVariables and queryList.queries
     * * [PrestoJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/PrestoJob)
     *   scriptVariables and queryList.queries
     * </pre>
     *
     * <code>
     * string kms_key = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKmsKey() {
      kmsKey_ = getDefaultInstance().getKmsKey();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The Cloud KMS key resource name to use for cluster persistent
     * disk and job argument encryption. See [Use CMEK with cluster data]
     * (https://cloud.google.com//dataproc/docs/concepts/configuring-clusters/customer-managed-encryption#use_cmek_with_cluster_data)
     * for more information.
     *
     * When this key resource name is provided, the following job arguments of
     * the following job types submitted to the cluster are encrypted using CMEK:
     *
     * * [FlinkJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/FlinkJob)
     * * [HadoopJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/HadoopJob)
     * * [SparkJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkJob)
     * * [SparkRJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkRJob)
     * * [PySparkJob
     * args](https://cloud.google.com/dataproc/docs/reference/rest/v1/PySparkJob)
     * * [SparkSqlJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/SparkSqlJob)
     *   scriptVariables and queryList.queries
     * * [HiveJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/HiveJob)
     *   scriptVariables and queryList.queries
     * * [PigJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/PigJob)
     *   scriptVariables and queryList.queries
     * * [PrestoJob](https://cloud.google.com/dataproc/docs/reference/rest/v1/PrestoJob)
     *   scriptVariables and queryList.queries
     * </pre>
     *
     * <code>
     * string kms_key = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for kmsKey to set.
     * @return This builder for chaining.
     */
    public Builder setKmsKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      kmsKey_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.EncryptionConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.EncryptionConfig)
  private static final com.google.cloud.dataproc.v1.EncryptionConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.EncryptionConfig();
  }

  public static com.google.cloud.dataproc.v1.EncryptionConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncryptionConfig> PARSER =
      new com.google.protobuf.AbstractParser<EncryptionConfig>() {
        @java.lang.Override
        public EncryptionConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<EncryptionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncryptionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.EncryptionConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
