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
// source: google/cloud/dialogflow/v2/conversation_profile.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * The type of Human Agent Assistant API suggestion to perform, and the maximum
 * number of results to return for that type. Multiple `Feature` objects can
 * be specified in the `features` list.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.SuggestionFeature}
 */
public final class SuggestionFeature extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.SuggestionFeature)
    SuggestionFeatureOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SuggestionFeature.newBuilder() to construct.
  private SuggestionFeature(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SuggestionFeature() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SuggestionFeature();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.ConversationProfileProto
        .internal_static_google_cloud_dialogflow_v2_SuggestionFeature_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ConversationProfileProto
        .internal_static_google_cloud_dialogflow_v2_SuggestionFeature_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.SuggestionFeature.class,
            com.google.cloud.dialogflow.v2.SuggestionFeature.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Defines the type of Human Agent Assistant feature.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.dialogflow.v2.SuggestionFeature.Type}
   */
  public enum Type implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified feature type.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Run article suggestion model for chat.
     * </pre>
     *
     * <code>ARTICLE_SUGGESTION = 1;</code>
     */
    ARTICLE_SUGGESTION(1),
    /**
     *
     *
     * <pre>
     * Run FAQ model for chat.
     * </pre>
     *
     * <code>FAQ = 2;</code>
     */
    FAQ(2),
    /**
     *
     *
     * <pre>
     * Run smart reply model for chat.
     * </pre>
     *
     * <code>SMART_REPLY = 3;</code>
     */
    SMART_REPLY(3),
    /**
     *
     *
     * <pre>
     * Run conversation summarization model for chat.
     * </pre>
     *
     * <code>CONVERSATION_SUMMARIZATION = 8;</code>
     */
    CONVERSATION_SUMMARIZATION(8),
    /**
     *
     *
     * <pre>
     * Run knowledge search with text input from agent or text generated query.
     * </pre>
     *
     * <code>KNOWLEDGE_SEARCH = 14;</code>
     */
    KNOWLEDGE_SEARCH(14),
    /**
     *
     *
     * <pre>
     * Run knowledge assist with automatic query generation.
     * </pre>
     *
     * <code>KNOWLEDGE_ASSIST = 15;</code>
     */
    KNOWLEDGE_ASSIST(15),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified feature type.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int TYPE_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * Run article suggestion model for chat.
     * </pre>
     *
     * <code>ARTICLE_SUGGESTION = 1;</code>
     */
    public static final int ARTICLE_SUGGESTION_VALUE = 1;

    /**
     *
     *
     * <pre>
     * Run FAQ model for chat.
     * </pre>
     *
     * <code>FAQ = 2;</code>
     */
    public static final int FAQ_VALUE = 2;

    /**
     *
     *
     * <pre>
     * Run smart reply model for chat.
     * </pre>
     *
     * <code>SMART_REPLY = 3;</code>
     */
    public static final int SMART_REPLY_VALUE = 3;

    /**
     *
     *
     * <pre>
     * Run conversation summarization model for chat.
     * </pre>
     *
     * <code>CONVERSATION_SUMMARIZATION = 8;</code>
     */
    public static final int CONVERSATION_SUMMARIZATION_VALUE = 8;

    /**
     *
     *
     * <pre>
     * Run knowledge search with text input from agent or text generated query.
     * </pre>
     *
     * <code>KNOWLEDGE_SEARCH = 14;</code>
     */
    public static final int KNOWLEDGE_SEARCH_VALUE = 14;

    /**
     *
     *
     * <pre>
     * Run knowledge assist with automatic query generation.
     * </pre>
     *
     * <code>KNOWLEDGE_ASSIST = 15;</code>
     */
    public static final int KNOWLEDGE_ASSIST_VALUE = 15;

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
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0:
          return TYPE_UNSPECIFIED;
        case 1:
          return ARTICLE_SUGGESTION;
        case 2:
          return FAQ;
        case 3:
          return SMART_REPLY;
        case 8:
          return CONVERSATION_SUMMARIZATION;
        case 14:
          return KNOWLEDGE_SEARCH;
        case 15:
          return KNOWLEDGE_ASSIST;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Type> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Type>() {
          public Type findValueByNumber(int number) {
            return Type.forNumber(number);
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
      return com.google.cloud.dialogflow.v2.SuggestionFeature.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.v2.SuggestionFeature.Type)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;

  /**
   *
   *
   * <pre>
   * Type of Human Agent Assistant API feature to request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SuggestionFeature.Type type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override
  public int getTypeValue() {
    return type_;
  }

  /**
   *
   *
   * <pre>
   * Type of Human Agent Assistant API feature to request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SuggestionFeature.Type type = 1;</code>
   *
   * @return The type.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.SuggestionFeature.Type getType() {
    com.google.cloud.dialogflow.v2.SuggestionFeature.Type result =
        com.google.cloud.dialogflow.v2.SuggestionFeature.Type.forNumber(type_);
    return result == null
        ? com.google.cloud.dialogflow.v2.SuggestionFeature.Type.UNRECOGNIZED
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
    if (type_
        != com.google.cloud.dialogflow.v2.SuggestionFeature.Type.TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_
        != com.google.cloud.dialogflow.v2.SuggestionFeature.Type.TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, type_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.SuggestionFeature)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.SuggestionFeature other =
        (com.google.cloud.dialogflow.v2.SuggestionFeature) obj;

    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.SuggestionFeature parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.SuggestionFeature parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SuggestionFeature parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.SuggestionFeature parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SuggestionFeature parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.SuggestionFeature parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SuggestionFeature parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.SuggestionFeature parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SuggestionFeature parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.SuggestionFeature parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SuggestionFeature parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.SuggestionFeature parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.v2.SuggestionFeature prototype) {
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
   * The type of Human Agent Assistant API suggestion to perform, and the maximum
   * number of results to return for that type. Multiple `Feature` objects can
   * be specified in the `features` list.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.SuggestionFeature}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.SuggestionFeature)
      com.google.cloud.dialogflow.v2.SuggestionFeatureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.ConversationProfileProto
          .internal_static_google_cloud_dialogflow_v2_SuggestionFeature_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ConversationProfileProto
          .internal_static_google_cloud_dialogflow_v2_SuggestionFeature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.SuggestionFeature.class,
              com.google.cloud.dialogflow.v2.SuggestionFeature.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.SuggestionFeature.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ConversationProfileProto
          .internal_static_google_cloud_dialogflow_v2_SuggestionFeature_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SuggestionFeature getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.SuggestionFeature.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SuggestionFeature build() {
      com.google.cloud.dialogflow.v2.SuggestionFeature result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SuggestionFeature buildPartial() {
      com.google.cloud.dialogflow.v2.SuggestionFeature result =
          new com.google.cloud.dialogflow.v2.SuggestionFeature(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2.SuggestionFeature result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.SuggestionFeature) {
        return mergeFrom((com.google.cloud.dialogflow.v2.SuggestionFeature) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.SuggestionFeature other) {
      if (other == com.google.cloud.dialogflow.v2.SuggestionFeature.getDefaultInstance())
        return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
                type_ = input.readEnum();
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

    private int type_ = 0;

    /**
     *
     *
     * <pre>
     * Type of Human Agent Assistant API feature to request.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SuggestionFeature.Type type = 1;</code>
     *
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override
    public int getTypeValue() {
      return type_;
    }

    /**
     *
     *
     * <pre>
     * Type of Human Agent Assistant API feature to request.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SuggestionFeature.Type type = 1;</code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Type of Human Agent Assistant API feature to request.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SuggestionFeature.Type type = 1;</code>
     *
     * @return The type.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SuggestionFeature.Type getType() {
      com.google.cloud.dialogflow.v2.SuggestionFeature.Type result =
          com.google.cloud.dialogflow.v2.SuggestionFeature.Type.forNumber(type_);
      return result == null
          ? com.google.cloud.dialogflow.v2.SuggestionFeature.Type.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * Type of Human Agent Assistant API feature to request.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SuggestionFeature.Type type = 1;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.cloud.dialogflow.v2.SuggestionFeature.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Type of Human Agent Assistant API feature to request.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SuggestionFeature.Type type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.SuggestionFeature)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.SuggestionFeature)
  private static final com.google.cloud.dialogflow.v2.SuggestionFeature DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.SuggestionFeature();
  }

  public static com.google.cloud.dialogflow.v2.SuggestionFeature getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SuggestionFeature> PARSER =
      new com.google.protobuf.AbstractParser<SuggestionFeature>() {
        @java.lang.Override
        public SuggestionFeature parsePartialFrom(
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

  public static com.google.protobuf.Parser<SuggestionFeature> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SuggestionFeature> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.SuggestionFeature getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
