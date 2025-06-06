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
// source: google/cloud/backupdr/v1/backupvault.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.backupdr.v1;

/**
 *
 *
 * <pre>
 * Details of the target resource created/modified as part of restore.
 * </pre>
 *
 * Protobuf type {@code google.cloud.backupdr.v1.TargetResource}
 */
public final class TargetResource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.backupdr.v1.TargetResource)
    TargetResourceOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use TargetResource.newBuilder() to construct.
  private TargetResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TargetResource() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TargetResource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.backupdr.v1.BackupVaultProto
        .internal_static_google_cloud_backupdr_v1_TargetResource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.backupdr.v1.BackupVaultProto
        .internal_static_google_cloud_backupdr_v1_TargetResource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.backupdr.v1.TargetResource.class,
            com.google.cloud.backupdr.v1.TargetResource.Builder.class);
  }

  private int targetResourceInfoCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object targetResourceInfo_;

  public enum TargetResourceInfoCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GCP_RESOURCE(1),
    TARGETRESOURCEINFO_NOT_SET(0);
    private final int value;

    private TargetResourceInfoCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TargetResourceInfoCase valueOf(int value) {
      return forNumber(value);
    }

    public static TargetResourceInfoCase forNumber(int value) {
      switch (value) {
        case 1:
          return GCP_RESOURCE;
        case 0:
          return TARGETRESOURCEINFO_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public TargetResourceInfoCase getTargetResourceInfoCase() {
    return TargetResourceInfoCase.forNumber(targetResourceInfoCase_);
  }

  public static final int GCP_RESOURCE_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * Details of the native Google Cloud resource created as part of restore.
   * </pre>
   *
   * <code>.google.cloud.backupdr.v1.GcpResource gcp_resource = 1;</code>
   *
   * @return Whether the gcpResource field is set.
   */
  @java.lang.Override
  public boolean hasGcpResource() {
    return targetResourceInfoCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * Details of the native Google Cloud resource created as part of restore.
   * </pre>
   *
   * <code>.google.cloud.backupdr.v1.GcpResource gcp_resource = 1;</code>
   *
   * @return The gcpResource.
   */
  @java.lang.Override
  public com.google.cloud.backupdr.v1.GcpResource getGcpResource() {
    if (targetResourceInfoCase_ == 1) {
      return (com.google.cloud.backupdr.v1.GcpResource) targetResourceInfo_;
    }
    return com.google.cloud.backupdr.v1.GcpResource.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * Details of the native Google Cloud resource created as part of restore.
   * </pre>
   *
   * <code>.google.cloud.backupdr.v1.GcpResource gcp_resource = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.backupdr.v1.GcpResourceOrBuilder getGcpResourceOrBuilder() {
    if (targetResourceInfoCase_ == 1) {
      return (com.google.cloud.backupdr.v1.GcpResource) targetResourceInfo_;
    }
    return com.google.cloud.backupdr.v1.GcpResource.getDefaultInstance();
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
    if (targetResourceInfoCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.backupdr.v1.GcpResource) targetResourceInfo_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (targetResourceInfoCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.backupdr.v1.GcpResource) targetResourceInfo_);
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
    if (!(obj instanceof com.google.cloud.backupdr.v1.TargetResource)) {
      return super.equals(obj);
    }
    com.google.cloud.backupdr.v1.TargetResource other =
        (com.google.cloud.backupdr.v1.TargetResource) obj;

    if (!getTargetResourceInfoCase().equals(other.getTargetResourceInfoCase())) return false;
    switch (targetResourceInfoCase_) {
      case 1:
        if (!getGcpResource().equals(other.getGcpResource())) return false;
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
    switch (targetResourceInfoCase_) {
      case 1:
        hash = (37 * hash) + GCP_RESOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getGcpResource().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.backupdr.v1.TargetResource parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.backupdr.v1.TargetResource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.TargetResource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.backupdr.v1.TargetResource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.TargetResource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.backupdr.v1.TargetResource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.TargetResource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.backupdr.v1.TargetResource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.TargetResource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.backupdr.v1.TargetResource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.TargetResource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.backupdr.v1.TargetResource parseFrom(
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

  public static Builder newBuilder(com.google.cloud.backupdr.v1.TargetResource prototype) {
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
   * Details of the target resource created/modified as part of restore.
   * </pre>
   *
   * Protobuf type {@code google.cloud.backupdr.v1.TargetResource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.backupdr.v1.TargetResource)
      com.google.cloud.backupdr.v1.TargetResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.backupdr.v1.BackupVaultProto
          .internal_static_google_cloud_backupdr_v1_TargetResource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.backupdr.v1.BackupVaultProto
          .internal_static_google_cloud_backupdr_v1_TargetResource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.backupdr.v1.TargetResource.class,
              com.google.cloud.backupdr.v1.TargetResource.Builder.class);
    }

    // Construct using com.google.cloud.backupdr.v1.TargetResource.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (gcpResourceBuilder_ != null) {
        gcpResourceBuilder_.clear();
      }
      targetResourceInfoCase_ = 0;
      targetResourceInfo_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.backupdr.v1.BackupVaultProto
          .internal_static_google_cloud_backupdr_v1_TargetResource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.backupdr.v1.TargetResource getDefaultInstanceForType() {
      return com.google.cloud.backupdr.v1.TargetResource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.backupdr.v1.TargetResource build() {
      com.google.cloud.backupdr.v1.TargetResource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.backupdr.v1.TargetResource buildPartial() {
      com.google.cloud.backupdr.v1.TargetResource result =
          new com.google.cloud.backupdr.v1.TargetResource(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.backupdr.v1.TargetResource result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.backupdr.v1.TargetResource result) {
      result.targetResourceInfoCase_ = targetResourceInfoCase_;
      result.targetResourceInfo_ = this.targetResourceInfo_;
      if (targetResourceInfoCase_ == 1 && gcpResourceBuilder_ != null) {
        result.targetResourceInfo_ = gcpResourceBuilder_.build();
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
      if (other instanceof com.google.cloud.backupdr.v1.TargetResource) {
        return mergeFrom((com.google.cloud.backupdr.v1.TargetResource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.backupdr.v1.TargetResource other) {
      if (other == com.google.cloud.backupdr.v1.TargetResource.getDefaultInstance()) return this;
      switch (other.getTargetResourceInfoCase()) {
        case GCP_RESOURCE:
          {
            mergeGcpResource(other.getGcpResource());
            break;
          }
        case TARGETRESOURCEINFO_NOT_SET:
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
                input.readMessage(getGcpResourceFieldBuilder().getBuilder(), extensionRegistry);
                targetResourceInfoCase_ = 1;
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

    private int targetResourceInfoCase_ = 0;
    private java.lang.Object targetResourceInfo_;

    public TargetResourceInfoCase getTargetResourceInfoCase() {
      return TargetResourceInfoCase.forNumber(targetResourceInfoCase_);
    }

    public Builder clearTargetResourceInfo() {
      targetResourceInfoCase_ = 0;
      targetResourceInfo_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.backupdr.v1.GcpResource,
            com.google.cloud.backupdr.v1.GcpResource.Builder,
            com.google.cloud.backupdr.v1.GcpResourceOrBuilder>
        gcpResourceBuilder_;

    /**
     *
     *
     * <pre>
     * Details of the native Google Cloud resource created as part of restore.
     * </pre>
     *
     * <code>.google.cloud.backupdr.v1.GcpResource gcp_resource = 1;</code>
     *
     * @return Whether the gcpResource field is set.
     */
    @java.lang.Override
    public boolean hasGcpResource() {
      return targetResourceInfoCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * Details of the native Google Cloud resource created as part of restore.
     * </pre>
     *
     * <code>.google.cloud.backupdr.v1.GcpResource gcp_resource = 1;</code>
     *
     * @return The gcpResource.
     */
    @java.lang.Override
    public com.google.cloud.backupdr.v1.GcpResource getGcpResource() {
      if (gcpResourceBuilder_ == null) {
        if (targetResourceInfoCase_ == 1) {
          return (com.google.cloud.backupdr.v1.GcpResource) targetResourceInfo_;
        }
        return com.google.cloud.backupdr.v1.GcpResource.getDefaultInstance();
      } else {
        if (targetResourceInfoCase_ == 1) {
          return gcpResourceBuilder_.getMessage();
        }
        return com.google.cloud.backupdr.v1.GcpResource.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Details of the native Google Cloud resource created as part of restore.
     * </pre>
     *
     * <code>.google.cloud.backupdr.v1.GcpResource gcp_resource = 1;</code>
     */
    public Builder setGcpResource(com.google.cloud.backupdr.v1.GcpResource value) {
      if (gcpResourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        targetResourceInfo_ = value;
        onChanged();
      } else {
        gcpResourceBuilder_.setMessage(value);
      }
      targetResourceInfoCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Details of the native Google Cloud resource created as part of restore.
     * </pre>
     *
     * <code>.google.cloud.backupdr.v1.GcpResource gcp_resource = 1;</code>
     */
    public Builder setGcpResource(
        com.google.cloud.backupdr.v1.GcpResource.Builder builderForValue) {
      if (gcpResourceBuilder_ == null) {
        targetResourceInfo_ = builderForValue.build();
        onChanged();
      } else {
        gcpResourceBuilder_.setMessage(builderForValue.build());
      }
      targetResourceInfoCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Details of the native Google Cloud resource created as part of restore.
     * </pre>
     *
     * <code>.google.cloud.backupdr.v1.GcpResource gcp_resource = 1;</code>
     */
    public Builder mergeGcpResource(com.google.cloud.backupdr.v1.GcpResource value) {
      if (gcpResourceBuilder_ == null) {
        if (targetResourceInfoCase_ == 1
            && targetResourceInfo_
                != com.google.cloud.backupdr.v1.GcpResource.getDefaultInstance()) {
          targetResourceInfo_ =
              com.google.cloud.backupdr.v1.GcpResource.newBuilder(
                      (com.google.cloud.backupdr.v1.GcpResource) targetResourceInfo_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          targetResourceInfo_ = value;
        }
        onChanged();
      } else {
        if (targetResourceInfoCase_ == 1) {
          gcpResourceBuilder_.mergeFrom(value);
        } else {
          gcpResourceBuilder_.setMessage(value);
        }
      }
      targetResourceInfoCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Details of the native Google Cloud resource created as part of restore.
     * </pre>
     *
     * <code>.google.cloud.backupdr.v1.GcpResource gcp_resource = 1;</code>
     */
    public Builder clearGcpResource() {
      if (gcpResourceBuilder_ == null) {
        if (targetResourceInfoCase_ == 1) {
          targetResourceInfoCase_ = 0;
          targetResourceInfo_ = null;
          onChanged();
        }
      } else {
        if (targetResourceInfoCase_ == 1) {
          targetResourceInfoCase_ = 0;
          targetResourceInfo_ = null;
        }
        gcpResourceBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Details of the native Google Cloud resource created as part of restore.
     * </pre>
     *
     * <code>.google.cloud.backupdr.v1.GcpResource gcp_resource = 1;</code>
     */
    public com.google.cloud.backupdr.v1.GcpResource.Builder getGcpResourceBuilder() {
      return getGcpResourceFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Details of the native Google Cloud resource created as part of restore.
     * </pre>
     *
     * <code>.google.cloud.backupdr.v1.GcpResource gcp_resource = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.backupdr.v1.GcpResourceOrBuilder getGcpResourceOrBuilder() {
      if ((targetResourceInfoCase_ == 1) && (gcpResourceBuilder_ != null)) {
        return gcpResourceBuilder_.getMessageOrBuilder();
      } else {
        if (targetResourceInfoCase_ == 1) {
          return (com.google.cloud.backupdr.v1.GcpResource) targetResourceInfo_;
        }
        return com.google.cloud.backupdr.v1.GcpResource.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Details of the native Google Cloud resource created as part of restore.
     * </pre>
     *
     * <code>.google.cloud.backupdr.v1.GcpResource gcp_resource = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.backupdr.v1.GcpResource,
            com.google.cloud.backupdr.v1.GcpResource.Builder,
            com.google.cloud.backupdr.v1.GcpResourceOrBuilder>
        getGcpResourceFieldBuilder() {
      if (gcpResourceBuilder_ == null) {
        if (!(targetResourceInfoCase_ == 1)) {
          targetResourceInfo_ = com.google.cloud.backupdr.v1.GcpResource.getDefaultInstance();
        }
        gcpResourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.backupdr.v1.GcpResource,
                com.google.cloud.backupdr.v1.GcpResource.Builder,
                com.google.cloud.backupdr.v1.GcpResourceOrBuilder>(
                (com.google.cloud.backupdr.v1.GcpResource) targetResourceInfo_,
                getParentForChildren(),
                isClean());
        targetResourceInfo_ = null;
      }
      targetResourceInfoCase_ = 1;
      onChanged();
      return gcpResourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.backupdr.v1.TargetResource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.backupdr.v1.TargetResource)
  private static final com.google.cloud.backupdr.v1.TargetResource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.backupdr.v1.TargetResource();
  }

  public static com.google.cloud.backupdr.v1.TargetResource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetResource> PARSER =
      new com.google.protobuf.AbstractParser<TargetResource>() {
        @java.lang.Override
        public TargetResource parsePartialFrom(
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

  public static com.google.protobuf.Parser<TargetResource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetResource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.backupdr.v1.TargetResource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
