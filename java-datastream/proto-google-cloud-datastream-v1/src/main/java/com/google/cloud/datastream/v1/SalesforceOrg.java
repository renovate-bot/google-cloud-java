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
// source: google/cloud/datastream/v1/datastream_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datastream.v1;

/**
 *
 *
 * <pre>
 * Salesforce organization structure.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1.SalesforceOrg}
 */
public final class SalesforceOrg extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1.SalesforceOrg)
    SalesforceOrgOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SalesforceOrg.newBuilder() to construct.
  private SalesforceOrg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SalesforceOrg() {
    objects_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SalesforceOrg();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datastream.v1.DatastreamResourcesProto
        .internal_static_google_cloud_datastream_v1_SalesforceOrg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1.DatastreamResourcesProto
        .internal_static_google_cloud_datastream_v1_SalesforceOrg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1.SalesforceOrg.class,
            com.google.cloud.datastream.v1.SalesforceOrg.Builder.class);
  }

  public static final int OBJECTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.datastream.v1.SalesforceObject> objects_;

  /**
   *
   *
   * <pre>
   * Salesforce objects in the database server.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datastream.v1.SalesforceObject> getObjectsList() {
    return objects_;
  }

  /**
   *
   *
   * <pre>
   * Salesforce objects in the database server.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datastream.v1.SalesforceObjectOrBuilder>
      getObjectsOrBuilderList() {
    return objects_;
  }

  /**
   *
   *
   * <pre>
   * Salesforce objects in the database server.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
   */
  @java.lang.Override
  public int getObjectsCount() {
    return objects_.size();
  }

  /**
   *
   *
   * <pre>
   * Salesforce objects in the database server.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.SalesforceObject getObjects(int index) {
    return objects_.get(index);
  }

  /**
   *
   *
   * <pre>
   * Salesforce objects in the database server.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.SalesforceObjectOrBuilder getObjectsOrBuilder(int index) {
    return objects_.get(index);
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
    for (int i = 0; i < objects_.size(); i++) {
      output.writeMessage(1, objects_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < objects_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, objects_.get(i));
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
    if (!(obj instanceof com.google.cloud.datastream.v1.SalesforceOrg)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1.SalesforceOrg other =
        (com.google.cloud.datastream.v1.SalesforceOrg) obj;

    if (!getObjectsList().equals(other.getObjectsList())) return false;
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
    if (getObjectsCount() > 0) {
      hash = (37 * hash) + OBJECTS_FIELD_NUMBER;
      hash = (53 * hash) + getObjectsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1.SalesforceOrg parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1.SalesforceOrg parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.SalesforceOrg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1.SalesforceOrg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.SalesforceOrg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1.SalesforceOrg parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.SalesforceOrg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1.SalesforceOrg parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.SalesforceOrg parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1.SalesforceOrg parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.SalesforceOrg parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1.SalesforceOrg parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datastream.v1.SalesforceOrg prototype) {
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
   * Salesforce organization structure.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1.SalesforceOrg}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1.SalesforceOrg)
      com.google.cloud.datastream.v1.SalesforceOrgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1_SalesforceOrg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1_SalesforceOrg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1.SalesforceOrg.class,
              com.google.cloud.datastream.v1.SalesforceOrg.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1.SalesforceOrg.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (objectsBuilder_ == null) {
        objects_ = java.util.Collections.emptyList();
      } else {
        objects_ = null;
        objectsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1_SalesforceOrg_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.SalesforceOrg getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1.SalesforceOrg.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.SalesforceOrg build() {
      com.google.cloud.datastream.v1.SalesforceOrg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.SalesforceOrg buildPartial() {
      com.google.cloud.datastream.v1.SalesforceOrg result =
          new com.google.cloud.datastream.v1.SalesforceOrg(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.datastream.v1.SalesforceOrg result) {
      if (objectsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          objects_ = java.util.Collections.unmodifiableList(objects_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.objects_ = objects_;
      } else {
        result.objects_ = objectsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.datastream.v1.SalesforceOrg result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.datastream.v1.SalesforceOrg) {
        return mergeFrom((com.google.cloud.datastream.v1.SalesforceOrg) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1.SalesforceOrg other) {
      if (other == com.google.cloud.datastream.v1.SalesforceOrg.getDefaultInstance()) return this;
      if (objectsBuilder_ == null) {
        if (!other.objects_.isEmpty()) {
          if (objects_.isEmpty()) {
            objects_ = other.objects_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureObjectsIsMutable();
            objects_.addAll(other.objects_);
          }
          onChanged();
        }
      } else {
        if (!other.objects_.isEmpty()) {
          if (objectsBuilder_.isEmpty()) {
            objectsBuilder_.dispose();
            objectsBuilder_ = null;
            objects_ = other.objects_;
            bitField0_ = (bitField0_ & ~0x00000001);
            objectsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getObjectsFieldBuilder()
                    : null;
          } else {
            objectsBuilder_.addAllMessages(other.objects_);
          }
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
                com.google.cloud.datastream.v1.SalesforceObject m =
                    input.readMessage(
                        com.google.cloud.datastream.v1.SalesforceObject.parser(),
                        extensionRegistry);
                if (objectsBuilder_ == null) {
                  ensureObjectsIsMutable();
                  objects_.add(m);
                } else {
                  objectsBuilder_.addMessage(m);
                }
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

    private java.util.List<com.google.cloud.datastream.v1.SalesforceObject> objects_ =
        java.util.Collections.emptyList();

    private void ensureObjectsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        objects_ =
            new java.util.ArrayList<com.google.cloud.datastream.v1.SalesforceObject>(objects_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datastream.v1.SalesforceObject,
            com.google.cloud.datastream.v1.SalesforceObject.Builder,
            com.google.cloud.datastream.v1.SalesforceObjectOrBuilder>
        objectsBuilder_;

    /**
     *
     *
     * <pre>
     * Salesforce objects in the database server.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
     */
    public java.util.List<com.google.cloud.datastream.v1.SalesforceObject> getObjectsList() {
      if (objectsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(objects_);
      } else {
        return objectsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * Salesforce objects in the database server.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
     */
    public int getObjectsCount() {
      if (objectsBuilder_ == null) {
        return objects_.size();
      } else {
        return objectsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * Salesforce objects in the database server.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
     */
    public com.google.cloud.datastream.v1.SalesforceObject getObjects(int index) {
      if (objectsBuilder_ == null) {
        return objects_.get(index);
      } else {
        return objectsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Salesforce objects in the database server.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
     */
    public Builder setObjects(int index, com.google.cloud.datastream.v1.SalesforceObject value) {
      if (objectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureObjectsIsMutable();
        objects_.set(index, value);
        onChanged();
      } else {
        objectsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Salesforce objects in the database server.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
     */
    public Builder setObjects(
        int index, com.google.cloud.datastream.v1.SalesforceObject.Builder builderForValue) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.set(index, builderForValue.build());
        onChanged();
      } else {
        objectsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Salesforce objects in the database server.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
     */
    public Builder addObjects(com.google.cloud.datastream.v1.SalesforceObject value) {
      if (objectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureObjectsIsMutable();
        objects_.add(value);
        onChanged();
      } else {
        objectsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Salesforce objects in the database server.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
     */
    public Builder addObjects(int index, com.google.cloud.datastream.v1.SalesforceObject value) {
      if (objectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureObjectsIsMutable();
        objects_.add(index, value);
        onChanged();
      } else {
        objectsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Salesforce objects in the database server.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
     */
    public Builder addObjects(
        com.google.cloud.datastream.v1.SalesforceObject.Builder builderForValue) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.add(builderForValue.build());
        onChanged();
      } else {
        objectsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Salesforce objects in the database server.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
     */
    public Builder addObjects(
        int index, com.google.cloud.datastream.v1.SalesforceObject.Builder builderForValue) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.add(index, builderForValue.build());
        onChanged();
      } else {
        objectsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Salesforce objects in the database server.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
     */
    public Builder addAllObjects(
        java.lang.Iterable<? extends com.google.cloud.datastream.v1.SalesforceObject> values) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, objects_);
        onChanged();
      } else {
        objectsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Salesforce objects in the database server.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
     */
    public Builder clearObjects() {
      if (objectsBuilder_ == null) {
        objects_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        objectsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Salesforce objects in the database server.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
     */
    public Builder removeObjects(int index) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.remove(index);
        onChanged();
      } else {
        objectsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Salesforce objects in the database server.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
     */
    public com.google.cloud.datastream.v1.SalesforceObject.Builder getObjectsBuilder(int index) {
      return getObjectsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * Salesforce objects in the database server.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
     */
    public com.google.cloud.datastream.v1.SalesforceObjectOrBuilder getObjectsOrBuilder(int index) {
      if (objectsBuilder_ == null) {
        return objects_.get(index);
      } else {
        return objectsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Salesforce objects in the database server.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.datastream.v1.SalesforceObjectOrBuilder>
        getObjectsOrBuilderList() {
      if (objectsBuilder_ != null) {
        return objectsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(objects_);
      }
    }

    /**
     *
     *
     * <pre>
     * Salesforce objects in the database server.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
     */
    public com.google.cloud.datastream.v1.SalesforceObject.Builder addObjectsBuilder() {
      return getObjectsFieldBuilder()
          .addBuilder(com.google.cloud.datastream.v1.SalesforceObject.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Salesforce objects in the database server.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
     */
    public com.google.cloud.datastream.v1.SalesforceObject.Builder addObjectsBuilder(int index) {
      return getObjectsFieldBuilder()
          .addBuilder(index, com.google.cloud.datastream.v1.SalesforceObject.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Salesforce objects in the database server.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.SalesforceObject objects = 1;</code>
     */
    public java.util.List<com.google.cloud.datastream.v1.SalesforceObject.Builder>
        getObjectsBuilderList() {
      return getObjectsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datastream.v1.SalesforceObject,
            com.google.cloud.datastream.v1.SalesforceObject.Builder,
            com.google.cloud.datastream.v1.SalesforceObjectOrBuilder>
        getObjectsFieldBuilder() {
      if (objectsBuilder_ == null) {
        objectsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.datastream.v1.SalesforceObject,
                com.google.cloud.datastream.v1.SalesforceObject.Builder,
                com.google.cloud.datastream.v1.SalesforceObjectOrBuilder>(
                objects_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        objects_ = null;
      }
      return objectsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1.SalesforceOrg)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1.SalesforceOrg)
  private static final com.google.cloud.datastream.v1.SalesforceOrg DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1.SalesforceOrg();
  }

  public static com.google.cloud.datastream.v1.SalesforceOrg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SalesforceOrg> PARSER =
      new com.google.protobuf.AbstractParser<SalesforceOrg>() {
        @java.lang.Override
        public SalesforceOrg parsePartialFrom(
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

  public static com.google.protobuf.Parser<SalesforceOrg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SalesforceOrg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1.SalesforceOrg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
