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
// source: google/dataflow/v1beta3/environment.proto

// Protobuf Java Version: 3.25.8
package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Describes the data disk used by a workflow job.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.Disk}
 */
public final class Disk extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.Disk)
    DiskOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Disk.newBuilder() to construct.
  private Disk(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Disk() {
    diskType_ = "";
    mountPoint_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Disk();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.dataflow.v1beta3.EnvironmentProto
        .internal_static_google_dataflow_v1beta3_Disk_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.EnvironmentProto
        .internal_static_google_dataflow_v1beta3_Disk_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.Disk.class, com.google.dataflow.v1beta3.Disk.Builder.class);
  }

  public static final int SIZE_GB_FIELD_NUMBER = 1;
  private int sizeGb_ = 0;

  /**
   *
   *
   * <pre>
   * Size of disk in GB.  If zero or unspecified, the service will
   * attempt to choose a reasonable default.
   * </pre>
   *
   * <code>int32 size_gb = 1;</code>
   *
   * @return The sizeGb.
   */
  @java.lang.Override
  public int getSizeGb() {
    return sizeGb_;
  }

  public static final int DISK_TYPE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object diskType_ = "";

  /**
   *
   *
   * <pre>
   * Disk storage type, as defined by Google Compute Engine.  This
   * must be a disk type appropriate to the project and zone in which
   * the workers will run.  If unknown or unspecified, the service
   * will attempt to choose a reasonable default.
   *
   * For example, the standard persistent disk type is a resource name
   * typically ending in "pd-standard".  If SSD persistent disks are
   * available, the resource name typically ends with "pd-ssd".  The
   * actual valid values are defined the Google Compute Engine API,
   * not by the Cloud Dataflow API; consult the Google Compute Engine
   * documentation for more information about determining the set of
   * available disk types for a particular project and zone.
   *
   * Google Compute Engine Disk types are local to a particular
   * project in a particular zone, and so the resource name will
   * typically look something like this:
   *
   * compute.googleapis.com/projects/project-id/zones/zone/diskTypes/pd-standard
   * </pre>
   *
   * <code>string disk_type = 2;</code>
   *
   * @return The diskType.
   */
  @java.lang.Override
  public java.lang.String getDiskType() {
    java.lang.Object ref = diskType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      diskType_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Disk storage type, as defined by Google Compute Engine.  This
   * must be a disk type appropriate to the project and zone in which
   * the workers will run.  If unknown or unspecified, the service
   * will attempt to choose a reasonable default.
   *
   * For example, the standard persistent disk type is a resource name
   * typically ending in "pd-standard".  If SSD persistent disks are
   * available, the resource name typically ends with "pd-ssd".  The
   * actual valid values are defined the Google Compute Engine API,
   * not by the Cloud Dataflow API; consult the Google Compute Engine
   * documentation for more information about determining the set of
   * available disk types for a particular project and zone.
   *
   * Google Compute Engine Disk types are local to a particular
   * project in a particular zone, and so the resource name will
   * typically look something like this:
   *
   * compute.googleapis.com/projects/project-id/zones/zone/diskTypes/pd-standard
   * </pre>
   *
   * <code>string disk_type = 2;</code>
   *
   * @return The bytes for diskType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDiskTypeBytes() {
    java.lang.Object ref = diskType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      diskType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MOUNT_POINT_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object mountPoint_ = "";

  /**
   *
   *
   * <pre>
   * Directory in a VM where disk is mounted.
   * </pre>
   *
   * <code>string mount_point = 3;</code>
   *
   * @return The mountPoint.
   */
  @java.lang.Override
  public java.lang.String getMountPoint() {
    java.lang.Object ref = mountPoint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mountPoint_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Directory in a VM where disk is mounted.
   * </pre>
   *
   * <code>string mount_point = 3;</code>
   *
   * @return The bytes for mountPoint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMountPointBytes() {
    java.lang.Object ref = mountPoint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      mountPoint_ = b;
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
    if (sizeGb_ != 0) {
      output.writeInt32(1, sizeGb_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(diskType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, diskType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mountPoint_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, mountPoint_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sizeGb_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, sizeGb_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(diskType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, diskType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mountPoint_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, mountPoint_);
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
    if (!(obj instanceof com.google.dataflow.v1beta3.Disk)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.Disk other = (com.google.dataflow.v1beta3.Disk) obj;

    if (getSizeGb() != other.getSizeGb()) return false;
    if (!getDiskType().equals(other.getDiskType())) return false;
    if (!getMountPoint().equals(other.getMountPoint())) return false;
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
    hash = (37 * hash) + SIZE_GB_FIELD_NUMBER;
    hash = (53 * hash) + getSizeGb();
    hash = (37 * hash) + DISK_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDiskType().hashCode();
    hash = (37 * hash) + MOUNT_POINT_FIELD_NUMBER;
    hash = (53 * hash) + getMountPoint().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.Disk parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.Disk parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.Disk parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.Disk parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.Disk parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.Disk parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.Disk parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.Disk parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.Disk parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.Disk parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.Disk parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.Disk parseFrom(
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

  public static Builder newBuilder(com.google.dataflow.v1beta3.Disk prototype) {
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
   * Describes the data disk used by a workflow job.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.Disk}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.Disk)
      com.google.dataflow.v1beta3.DiskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.dataflow.v1beta3.EnvironmentProto
          .internal_static_google_dataflow_v1beta3_Disk_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.EnvironmentProto
          .internal_static_google_dataflow_v1beta3_Disk_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.Disk.class,
              com.google.dataflow.v1beta3.Disk.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.Disk.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sizeGb_ = 0;
      diskType_ = "";
      mountPoint_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.dataflow.v1beta3.EnvironmentProto
          .internal_static_google_dataflow_v1beta3_Disk_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.Disk getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.Disk.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.Disk build() {
      com.google.dataflow.v1beta3.Disk result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.Disk buildPartial() {
      com.google.dataflow.v1beta3.Disk result = new com.google.dataflow.v1beta3.Disk(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.dataflow.v1beta3.Disk result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sizeGb_ = sizeGb_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.diskType_ = diskType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.mountPoint_ = mountPoint_;
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
      if (other instanceof com.google.dataflow.v1beta3.Disk) {
        return mergeFrom((com.google.dataflow.v1beta3.Disk) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.Disk other) {
      if (other == com.google.dataflow.v1beta3.Disk.getDefaultInstance()) return this;
      if (other.getSizeGb() != 0) {
        setSizeGb(other.getSizeGb());
      }
      if (!other.getDiskType().isEmpty()) {
        diskType_ = other.diskType_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getMountPoint().isEmpty()) {
        mountPoint_ = other.mountPoint_;
        bitField0_ |= 0x00000004;
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
            case 8:
              {
                sizeGb_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                diskType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                mountPoint_ = input.readStringRequireUtf8();
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

    private int sizeGb_;

    /**
     *
     *
     * <pre>
     * Size of disk in GB.  If zero or unspecified, the service will
     * attempt to choose a reasonable default.
     * </pre>
     *
     * <code>int32 size_gb = 1;</code>
     *
     * @return The sizeGb.
     */
    @java.lang.Override
    public int getSizeGb() {
      return sizeGb_;
    }

    /**
     *
     *
     * <pre>
     * Size of disk in GB.  If zero or unspecified, the service will
     * attempt to choose a reasonable default.
     * </pre>
     *
     * <code>int32 size_gb = 1;</code>
     *
     * @param value The sizeGb to set.
     * @return This builder for chaining.
     */
    public Builder setSizeGb(int value) {

      sizeGb_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Size of disk in GB.  If zero or unspecified, the service will
     * attempt to choose a reasonable default.
     * </pre>
     *
     * <code>int32 size_gb = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSizeGb() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sizeGb_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object diskType_ = "";

    /**
     *
     *
     * <pre>
     * Disk storage type, as defined by Google Compute Engine.  This
     * must be a disk type appropriate to the project and zone in which
     * the workers will run.  If unknown or unspecified, the service
     * will attempt to choose a reasonable default.
     *
     * For example, the standard persistent disk type is a resource name
     * typically ending in "pd-standard".  If SSD persistent disks are
     * available, the resource name typically ends with "pd-ssd".  The
     * actual valid values are defined the Google Compute Engine API,
     * not by the Cloud Dataflow API; consult the Google Compute Engine
     * documentation for more information about determining the set of
     * available disk types for a particular project and zone.
     *
     * Google Compute Engine Disk types are local to a particular
     * project in a particular zone, and so the resource name will
     * typically look something like this:
     *
     * compute.googleapis.com/projects/project-id/zones/zone/diskTypes/pd-standard
     * </pre>
     *
     * <code>string disk_type = 2;</code>
     *
     * @return The diskType.
     */
    public java.lang.String getDiskType() {
      java.lang.Object ref = diskType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        diskType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Disk storage type, as defined by Google Compute Engine.  This
     * must be a disk type appropriate to the project and zone in which
     * the workers will run.  If unknown or unspecified, the service
     * will attempt to choose a reasonable default.
     *
     * For example, the standard persistent disk type is a resource name
     * typically ending in "pd-standard".  If SSD persistent disks are
     * available, the resource name typically ends with "pd-ssd".  The
     * actual valid values are defined the Google Compute Engine API,
     * not by the Cloud Dataflow API; consult the Google Compute Engine
     * documentation for more information about determining the set of
     * available disk types for a particular project and zone.
     *
     * Google Compute Engine Disk types are local to a particular
     * project in a particular zone, and so the resource name will
     * typically look something like this:
     *
     * compute.googleapis.com/projects/project-id/zones/zone/diskTypes/pd-standard
     * </pre>
     *
     * <code>string disk_type = 2;</code>
     *
     * @return The bytes for diskType.
     */
    public com.google.protobuf.ByteString getDiskTypeBytes() {
      java.lang.Object ref = diskType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        diskType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Disk storage type, as defined by Google Compute Engine.  This
     * must be a disk type appropriate to the project and zone in which
     * the workers will run.  If unknown or unspecified, the service
     * will attempt to choose a reasonable default.
     *
     * For example, the standard persistent disk type is a resource name
     * typically ending in "pd-standard".  If SSD persistent disks are
     * available, the resource name typically ends with "pd-ssd".  The
     * actual valid values are defined the Google Compute Engine API,
     * not by the Cloud Dataflow API; consult the Google Compute Engine
     * documentation for more information about determining the set of
     * available disk types for a particular project and zone.
     *
     * Google Compute Engine Disk types are local to a particular
     * project in a particular zone, and so the resource name will
     * typically look something like this:
     *
     * compute.googleapis.com/projects/project-id/zones/zone/diskTypes/pd-standard
     * </pre>
     *
     * <code>string disk_type = 2;</code>
     *
     * @param value The diskType to set.
     * @return This builder for chaining.
     */
    public Builder setDiskType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      diskType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Disk storage type, as defined by Google Compute Engine.  This
     * must be a disk type appropriate to the project and zone in which
     * the workers will run.  If unknown or unspecified, the service
     * will attempt to choose a reasonable default.
     *
     * For example, the standard persistent disk type is a resource name
     * typically ending in "pd-standard".  If SSD persistent disks are
     * available, the resource name typically ends with "pd-ssd".  The
     * actual valid values are defined the Google Compute Engine API,
     * not by the Cloud Dataflow API; consult the Google Compute Engine
     * documentation for more information about determining the set of
     * available disk types for a particular project and zone.
     *
     * Google Compute Engine Disk types are local to a particular
     * project in a particular zone, and so the resource name will
     * typically look something like this:
     *
     * compute.googleapis.com/projects/project-id/zones/zone/diskTypes/pd-standard
     * </pre>
     *
     * <code>string disk_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDiskType() {
      diskType_ = getDefaultInstance().getDiskType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Disk storage type, as defined by Google Compute Engine.  This
     * must be a disk type appropriate to the project and zone in which
     * the workers will run.  If unknown or unspecified, the service
     * will attempt to choose a reasonable default.
     *
     * For example, the standard persistent disk type is a resource name
     * typically ending in "pd-standard".  If SSD persistent disks are
     * available, the resource name typically ends with "pd-ssd".  The
     * actual valid values are defined the Google Compute Engine API,
     * not by the Cloud Dataflow API; consult the Google Compute Engine
     * documentation for more information about determining the set of
     * available disk types for a particular project and zone.
     *
     * Google Compute Engine Disk types are local to a particular
     * project in a particular zone, and so the resource name will
     * typically look something like this:
     *
     * compute.googleapis.com/projects/project-id/zones/zone/diskTypes/pd-standard
     * </pre>
     *
     * <code>string disk_type = 2;</code>
     *
     * @param value The bytes for diskType to set.
     * @return This builder for chaining.
     */
    public Builder setDiskTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      diskType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object mountPoint_ = "";

    /**
     *
     *
     * <pre>
     * Directory in a VM where disk is mounted.
     * </pre>
     *
     * <code>string mount_point = 3;</code>
     *
     * @return The mountPoint.
     */
    public java.lang.String getMountPoint() {
      java.lang.Object ref = mountPoint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mountPoint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Directory in a VM where disk is mounted.
     * </pre>
     *
     * <code>string mount_point = 3;</code>
     *
     * @return The bytes for mountPoint.
     */
    public com.google.protobuf.ByteString getMountPointBytes() {
      java.lang.Object ref = mountPoint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        mountPoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Directory in a VM where disk is mounted.
     * </pre>
     *
     * <code>string mount_point = 3;</code>
     *
     * @param value The mountPoint to set.
     * @return This builder for chaining.
     */
    public Builder setMountPoint(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      mountPoint_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Directory in a VM where disk is mounted.
     * </pre>
     *
     * <code>string mount_point = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMountPoint() {
      mountPoint_ = getDefaultInstance().getMountPoint();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Directory in a VM where disk is mounted.
     * </pre>
     *
     * <code>string mount_point = 3;</code>
     *
     * @param value The bytes for mountPoint to set.
     * @return This builder for chaining.
     */
    public Builder setMountPointBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      mountPoint_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.Disk)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.Disk)
  private static final com.google.dataflow.v1beta3.Disk DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.Disk();
  }

  public static com.google.dataflow.v1beta3.Disk getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Disk> PARSER =
      new com.google.protobuf.AbstractParser<Disk>() {
        @java.lang.Override
        public Disk parsePartialFrom(
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

  public static com.google.protobuf.Parser<Disk> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Disk> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.Disk getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
