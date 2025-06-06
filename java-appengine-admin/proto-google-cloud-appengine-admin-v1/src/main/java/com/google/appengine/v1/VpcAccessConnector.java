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
// source: google/appengine/v1/version.proto

// Protobuf Java Version: 3.25.8
package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * VPC access connector specification.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.VpcAccessConnector}
 */
public final class VpcAccessConnector extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.VpcAccessConnector)
    VpcAccessConnectorOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use VpcAccessConnector.newBuilder() to construct.
  private VpcAccessConnector(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VpcAccessConnector() {
    name_ = "";
    egressSetting_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VpcAccessConnector();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.appengine.v1.VersionProto
        .internal_static_google_appengine_v1_VpcAccessConnector_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.VersionProto
        .internal_static_google_appengine_v1_VpcAccessConnector_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.VpcAccessConnector.class,
            com.google.appengine.v1.VpcAccessConnector.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Available egress settings.
   *
   * This controls what traffic is diverted through the VPC Access Connector
   * resource. By default PRIVATE_IP_RANGES will be used.
   * </pre>
   *
   * Protobuf enum {@code google.appengine.v1.VpcAccessConnector.EgressSetting}
   */
  public enum EgressSetting implements com.google.protobuf.ProtocolMessageEnum {
    /** <code>EGRESS_SETTING_UNSPECIFIED = 0;</code> */
    EGRESS_SETTING_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Force the use of VPC Access for all egress traffic from the function.
     * </pre>
     *
     * <code>ALL_TRAFFIC = 1;</code>
     */
    ALL_TRAFFIC(1),
    /**
     *
     *
     * <pre>
     * Use the VPC Access Connector for private IP space from RFC1918.
     * </pre>
     *
     * <code>PRIVATE_IP_RANGES = 2;</code>
     */
    PRIVATE_IP_RANGES(2),
    UNRECOGNIZED(-1),
    ;

    /** <code>EGRESS_SETTING_UNSPECIFIED = 0;</code> */
    public static final int EGRESS_SETTING_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * Force the use of VPC Access for all egress traffic from the function.
     * </pre>
     *
     * <code>ALL_TRAFFIC = 1;</code>
     */
    public static final int ALL_TRAFFIC_VALUE = 1;

    /**
     *
     *
     * <pre>
     * Use the VPC Access Connector for private IP space from RFC1918.
     * </pre>
     *
     * <code>PRIVATE_IP_RANGES = 2;</code>
     */
    public static final int PRIVATE_IP_RANGES_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EgressSetting valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EgressSetting forNumber(int value) {
      switch (value) {
        case 0:
          return EGRESS_SETTING_UNSPECIFIED;
        case 1:
          return ALL_TRAFFIC;
        case 2:
          return PRIVATE_IP_RANGES;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EgressSetting> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<EgressSetting> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EgressSetting>() {
          public EgressSetting findValueByNumber(int number) {
            return EgressSetting.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.appengine.v1.VpcAccessConnector.getDescriptor().getEnumTypes().get(0);
    }

    private static final EgressSetting[] VALUES = values();

    public static EgressSetting valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private EgressSetting(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.appengine.v1.VpcAccessConnector.EgressSetting)
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * Full Serverless VPC Access Connector name e.g.
   * /projects/my-project/locations/us-central1/connectors/c1.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Full Serverless VPC Access Connector name e.g.
   * /projects/my-project/locations/us-central1/connectors/c1.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EGRESS_SETTING_FIELD_NUMBER = 2;
  private int egressSetting_ = 0;

  /**
   *
   *
   * <pre>
   * The egress setting for the connector, controlling what traffic is diverted
   * through it.
   * </pre>
   *
   * <code>.google.appengine.v1.VpcAccessConnector.EgressSetting egress_setting = 2;</code>
   *
   * @return The enum numeric value on the wire for egressSetting.
   */
  @java.lang.Override
  public int getEgressSettingValue() {
    return egressSetting_;
  }

  /**
   *
   *
   * <pre>
   * The egress setting for the connector, controlling what traffic is diverted
   * through it.
   * </pre>
   *
   * <code>.google.appengine.v1.VpcAccessConnector.EgressSetting egress_setting = 2;</code>
   *
   * @return The egressSetting.
   */
  @java.lang.Override
  public com.google.appengine.v1.VpcAccessConnector.EgressSetting getEgressSetting() {
    com.google.appengine.v1.VpcAccessConnector.EgressSetting result =
        com.google.appengine.v1.VpcAccessConnector.EgressSetting.forNumber(egressSetting_);
    return result == null
        ? com.google.appengine.v1.VpcAccessConnector.EgressSetting.UNRECOGNIZED
        : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (egressSetting_
        != com.google.appengine.v1.VpcAccessConnector.EgressSetting.EGRESS_SETTING_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, egressSetting_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (egressSetting_
        != com.google.appengine.v1.VpcAccessConnector.EgressSetting.EGRESS_SETTING_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, egressSetting_);
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
    if (!(obj instanceof com.google.appengine.v1.VpcAccessConnector)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.VpcAccessConnector other =
        (com.google.appengine.v1.VpcAccessConnector) obj;

    if (!getName().equals(other.getName())) return false;
    if (egressSetting_ != other.egressSetting_) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + EGRESS_SETTING_FIELD_NUMBER;
    hash = (53 * hash) + egressSetting_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.VpcAccessConnector parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.VpcAccessConnector parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.VpcAccessConnector parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.VpcAccessConnector parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.VpcAccessConnector parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.VpcAccessConnector parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.VpcAccessConnector parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.VpcAccessConnector parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.VpcAccessConnector parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.VpcAccessConnector parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.VpcAccessConnector parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.VpcAccessConnector parseFrom(
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

  public static Builder newBuilder(com.google.appengine.v1.VpcAccessConnector prototype) {
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
   * VPC access connector specification.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.VpcAccessConnector}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.VpcAccessConnector)
      com.google.appengine.v1.VpcAccessConnectorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.VersionProto
          .internal_static_google_appengine_v1_VpcAccessConnector_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.VersionProto
          .internal_static_google_appengine_v1_VpcAccessConnector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.VpcAccessConnector.class,
              com.google.appengine.v1.VpcAccessConnector.Builder.class);
    }

    // Construct using com.google.appengine.v1.VpcAccessConnector.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      egressSetting_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.VersionProto
          .internal_static_google_appengine_v1_VpcAccessConnector_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.VpcAccessConnector getDefaultInstanceForType() {
      return com.google.appengine.v1.VpcAccessConnector.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.VpcAccessConnector build() {
      com.google.appengine.v1.VpcAccessConnector result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.VpcAccessConnector buildPartial() {
      com.google.appengine.v1.VpcAccessConnector result =
          new com.google.appengine.v1.VpcAccessConnector(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.appengine.v1.VpcAccessConnector result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.egressSetting_ = egressSetting_;
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
      if (other instanceof com.google.appengine.v1.VpcAccessConnector) {
        return mergeFrom((com.google.appengine.v1.VpcAccessConnector) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.VpcAccessConnector other) {
      if (other == com.google.appengine.v1.VpcAccessConnector.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.egressSetting_ != 0) {
        setEgressSettingValue(other.getEgressSettingValue());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                egressSetting_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private java.lang.Object name_ = "";

    /**
     *
     *
     * <pre>
     * Full Serverless VPC Access Connector name e.g.
     * /projects/my-project/locations/us-central1/connectors/c1.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Full Serverless VPC Access Connector name e.g.
     * /projects/my-project/locations/us-central1/connectors/c1.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Full Serverless VPC Access Connector name e.g.
     * /projects/my-project/locations/us-central1/connectors/c1.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Full Serverless VPC Access Connector name e.g.
     * /projects/my-project/locations/us-central1/connectors/c1.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Full Serverless VPC Access Connector name e.g.
     * /projects/my-project/locations/us-central1/connectors/c1.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int egressSetting_ = 0;

    /**
     *
     *
     * <pre>
     * The egress setting for the connector, controlling what traffic is diverted
     * through it.
     * </pre>
     *
     * <code>.google.appengine.v1.VpcAccessConnector.EgressSetting egress_setting = 2;</code>
     *
     * @return The enum numeric value on the wire for egressSetting.
     */
    @java.lang.Override
    public int getEgressSettingValue() {
      return egressSetting_;
    }

    /**
     *
     *
     * <pre>
     * The egress setting for the connector, controlling what traffic is diverted
     * through it.
     * </pre>
     *
     * <code>.google.appengine.v1.VpcAccessConnector.EgressSetting egress_setting = 2;</code>
     *
     * @param value The enum numeric value on the wire for egressSetting to set.
     * @return This builder for chaining.
     */
    public Builder setEgressSettingValue(int value) {
      egressSetting_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The egress setting for the connector, controlling what traffic is diverted
     * through it.
     * </pre>
     *
     * <code>.google.appengine.v1.VpcAccessConnector.EgressSetting egress_setting = 2;</code>
     *
     * @return The egressSetting.
     */
    @java.lang.Override
    public com.google.appengine.v1.VpcAccessConnector.EgressSetting getEgressSetting() {
      com.google.appengine.v1.VpcAccessConnector.EgressSetting result =
          com.google.appengine.v1.VpcAccessConnector.EgressSetting.forNumber(egressSetting_);
      return result == null
          ? com.google.appengine.v1.VpcAccessConnector.EgressSetting.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * The egress setting for the connector, controlling what traffic is diverted
     * through it.
     * </pre>
     *
     * <code>.google.appengine.v1.VpcAccessConnector.EgressSetting egress_setting = 2;</code>
     *
     * @param value The egressSetting to set.
     * @return This builder for chaining.
     */
    public Builder setEgressSetting(
        com.google.appengine.v1.VpcAccessConnector.EgressSetting value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      egressSetting_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The egress setting for the connector, controlling what traffic is diverted
     * through it.
     * </pre>
     *
     * <code>.google.appengine.v1.VpcAccessConnector.EgressSetting egress_setting = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEgressSetting() {
      bitField0_ = (bitField0_ & ~0x00000002);
      egressSetting_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.VpcAccessConnector)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.VpcAccessConnector)
  private static final com.google.appengine.v1.VpcAccessConnector DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.VpcAccessConnector();
  }

  public static com.google.appengine.v1.VpcAccessConnector getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VpcAccessConnector> PARSER =
      new com.google.protobuf.AbstractParser<VpcAccessConnector>() {
        @java.lang.Override
        public VpcAccessConnector parsePartialFrom(
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

  public static com.google.protobuf.Parser<VpcAccessConnector> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VpcAccessConnector> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.VpcAccessConnector getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
