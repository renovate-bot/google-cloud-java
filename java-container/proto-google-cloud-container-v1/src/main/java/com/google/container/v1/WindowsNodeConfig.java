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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.8
package com.google.container.v1;

/**
 *
 *
 * <pre>
 * Parameters that can be configured on Windows nodes.
 * Windows Node Config that define the parameters that will be used to
 * configure the Windows node pool settings.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.WindowsNodeConfig}
 */
public final class WindowsNodeConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.WindowsNodeConfig)
    WindowsNodeConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use WindowsNodeConfig.newBuilder() to construct.
  private WindowsNodeConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private WindowsNodeConfig() {
    osVersion_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new WindowsNodeConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_WindowsNodeConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_WindowsNodeConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.WindowsNodeConfig.class,
            com.google.container.v1.WindowsNodeConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Possible OS version that can be used.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1.WindowsNodeConfig.OSVersion}
   */
  public enum OSVersion implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * When OSVersion is not specified.
     * </pre>
     *
     * <code>OS_VERSION_UNSPECIFIED = 0;</code>
     */
    OS_VERSION_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * LTSC2019 specifies to use LTSC2019 as the Windows Servercore Base Image.
     * </pre>
     *
     * <code>OS_VERSION_LTSC2019 = 1;</code>
     */
    OS_VERSION_LTSC2019(1),
    /**
     *
     *
     * <pre>
     * LTSC2022 specifies to use LTSC2022 as the Windows Servercore Base Image.
     * </pre>
     *
     * <code>OS_VERSION_LTSC2022 = 2;</code>
     */
    OS_VERSION_LTSC2022(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * When OSVersion is not specified.
     * </pre>
     *
     * <code>OS_VERSION_UNSPECIFIED = 0;</code>
     */
    public static final int OS_VERSION_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * LTSC2019 specifies to use LTSC2019 as the Windows Servercore Base Image.
     * </pre>
     *
     * <code>OS_VERSION_LTSC2019 = 1;</code>
     */
    public static final int OS_VERSION_LTSC2019_VALUE = 1;

    /**
     *
     *
     * <pre>
     * LTSC2022 specifies to use LTSC2022 as the Windows Servercore Base Image.
     * </pre>
     *
     * <code>OS_VERSION_LTSC2022 = 2;</code>
     */
    public static final int OS_VERSION_LTSC2022_VALUE = 2;

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
    public static OSVersion valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static OSVersion forNumber(int value) {
      switch (value) {
        case 0:
          return OS_VERSION_UNSPECIFIED;
        case 1:
          return OS_VERSION_LTSC2019;
        case 2:
          return OS_VERSION_LTSC2022;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OSVersion> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<OSVersion> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OSVersion>() {
          public OSVersion findValueByNumber(int number) {
            return OSVersion.forNumber(number);
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
      return com.google.container.v1.WindowsNodeConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final OSVersion[] VALUES = values();

    public static OSVersion valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private OSVersion(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1.WindowsNodeConfig.OSVersion)
  }

  public static final int OS_VERSION_FIELD_NUMBER = 1;
  private int osVersion_ = 0;

  /**
   *
   *
   * <pre>
   * OSVersion specifies the Windows node config to be used on the node.
   * </pre>
   *
   * <code>.google.container.v1.WindowsNodeConfig.OSVersion os_version = 1;</code>
   *
   * @return The enum numeric value on the wire for osVersion.
   */
  @java.lang.Override
  public int getOsVersionValue() {
    return osVersion_;
  }

  /**
   *
   *
   * <pre>
   * OSVersion specifies the Windows node config to be used on the node.
   * </pre>
   *
   * <code>.google.container.v1.WindowsNodeConfig.OSVersion os_version = 1;</code>
   *
   * @return The osVersion.
   */
  @java.lang.Override
  public com.google.container.v1.WindowsNodeConfig.OSVersion getOsVersion() {
    com.google.container.v1.WindowsNodeConfig.OSVersion result =
        com.google.container.v1.WindowsNodeConfig.OSVersion.forNumber(osVersion_);
    return result == null
        ? com.google.container.v1.WindowsNodeConfig.OSVersion.UNRECOGNIZED
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
    if (osVersion_
        != com.google.container.v1.WindowsNodeConfig.OSVersion.OS_VERSION_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, osVersion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (osVersion_
        != com.google.container.v1.WindowsNodeConfig.OSVersion.OS_VERSION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, osVersion_);
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
    if (!(obj instanceof com.google.container.v1.WindowsNodeConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1.WindowsNodeConfig other =
        (com.google.container.v1.WindowsNodeConfig) obj;

    if (osVersion_ != other.osVersion_) return false;
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
    hash = (37 * hash) + OS_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + osVersion_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.WindowsNodeConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.WindowsNodeConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.WindowsNodeConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.WindowsNodeConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.WindowsNodeConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.WindowsNodeConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.WindowsNodeConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.WindowsNodeConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.WindowsNodeConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.WindowsNodeConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.WindowsNodeConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.WindowsNodeConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1.WindowsNodeConfig prototype) {
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
   * Parameters that can be configured on Windows nodes.
   * Windows Node Config that define the parameters that will be used to
   * configure the Windows node pool settings.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.WindowsNodeConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.WindowsNodeConfig)
      com.google.container.v1.WindowsNodeConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_WindowsNodeConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_WindowsNodeConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.WindowsNodeConfig.class,
              com.google.container.v1.WindowsNodeConfig.Builder.class);
    }

    // Construct using com.google.container.v1.WindowsNodeConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      osVersion_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_WindowsNodeConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.WindowsNodeConfig getDefaultInstanceForType() {
      return com.google.container.v1.WindowsNodeConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.WindowsNodeConfig build() {
      com.google.container.v1.WindowsNodeConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.WindowsNodeConfig buildPartial() {
      com.google.container.v1.WindowsNodeConfig result =
          new com.google.container.v1.WindowsNodeConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1.WindowsNodeConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.osVersion_ = osVersion_;
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
      if (other instanceof com.google.container.v1.WindowsNodeConfig) {
        return mergeFrom((com.google.container.v1.WindowsNodeConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.WindowsNodeConfig other) {
      if (other == com.google.container.v1.WindowsNodeConfig.getDefaultInstance()) return this;
      if (other.osVersion_ != 0) {
        setOsVersionValue(other.getOsVersionValue());
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
                osVersion_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private int osVersion_ = 0;

    /**
     *
     *
     * <pre>
     * OSVersion specifies the Windows node config to be used on the node.
     * </pre>
     *
     * <code>.google.container.v1.WindowsNodeConfig.OSVersion os_version = 1;</code>
     *
     * @return The enum numeric value on the wire for osVersion.
     */
    @java.lang.Override
    public int getOsVersionValue() {
      return osVersion_;
    }

    /**
     *
     *
     * <pre>
     * OSVersion specifies the Windows node config to be used on the node.
     * </pre>
     *
     * <code>.google.container.v1.WindowsNodeConfig.OSVersion os_version = 1;</code>
     *
     * @param value The enum numeric value on the wire for osVersion to set.
     * @return This builder for chaining.
     */
    public Builder setOsVersionValue(int value) {
      osVersion_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * OSVersion specifies the Windows node config to be used on the node.
     * </pre>
     *
     * <code>.google.container.v1.WindowsNodeConfig.OSVersion os_version = 1;</code>
     *
     * @return The osVersion.
     */
    @java.lang.Override
    public com.google.container.v1.WindowsNodeConfig.OSVersion getOsVersion() {
      com.google.container.v1.WindowsNodeConfig.OSVersion result =
          com.google.container.v1.WindowsNodeConfig.OSVersion.forNumber(osVersion_);
      return result == null
          ? com.google.container.v1.WindowsNodeConfig.OSVersion.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * OSVersion specifies the Windows node config to be used on the node.
     * </pre>
     *
     * <code>.google.container.v1.WindowsNodeConfig.OSVersion os_version = 1;</code>
     *
     * @param value The osVersion to set.
     * @return This builder for chaining.
     */
    public Builder setOsVersion(com.google.container.v1.WindowsNodeConfig.OSVersion value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      osVersion_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * OSVersion specifies the Windows node config to be used on the node.
     * </pre>
     *
     * <code>.google.container.v1.WindowsNodeConfig.OSVersion os_version = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOsVersion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      osVersion_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.WindowsNodeConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.WindowsNodeConfig)
  private static final com.google.container.v1.WindowsNodeConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.WindowsNodeConfig();
  }

  public static com.google.container.v1.WindowsNodeConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WindowsNodeConfig> PARSER =
      new com.google.protobuf.AbstractParser<WindowsNodeConfig>() {
        @java.lang.Override
        public WindowsNodeConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<WindowsNodeConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WindowsNodeConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.WindowsNodeConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
