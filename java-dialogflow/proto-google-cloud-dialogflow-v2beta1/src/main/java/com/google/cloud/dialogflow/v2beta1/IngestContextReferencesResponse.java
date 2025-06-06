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
// source: google/cloud/dialogflow/v2beta1/conversation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.v2beta1;

/**
 *
 *
 * <pre>
 * The response message for [ConversationsService.IngestContextReferences][].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse}
 */
public final class IngestContextReferencesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse)
    IngestContextReferencesResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use IngestContextReferencesResponse.newBuilder() to construct.
  private IngestContextReferencesResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IngestContextReferencesResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IngestContextReferencesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.ConversationProto
        .internal_static_google_cloud_dialogflow_v2beta1_IngestContextReferencesResponse_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetIngestedContextReferences();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.ConversationProto
        .internal_static_google_cloud_dialogflow_v2beta1_IngestContextReferencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse.class,
            com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse.Builder.class);
  }

  public static final int INGESTED_CONTEXT_REFERENCES_FIELD_NUMBER = 1;

  private static final class IngestedContextReferencesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
            java.lang.String, com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference>
        defaultEntry =
            com.google.protobuf.MapEntry
                .<java.lang.String,
                    com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference>
                    newDefaultInstance(
                        com.google.cloud.dialogflow.v2beta1.ConversationProto
                            .internal_static_google_cloud_dialogflow_v2beta1_IngestContextReferencesResponse_IngestedContextReferencesEntry_descriptor,
                        com.google.protobuf.WireFormat.FieldType.STRING,
                        "",
                        com.google.protobuf.WireFormat.FieldType.MESSAGE,
                        com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference
                            .getDefaultInstance());
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
          java.lang.String, com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference>
      ingestedContextReferences_;

  private com.google.protobuf.MapField<
          java.lang.String, com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference>
      internalGetIngestedContextReferences() {
    if (ingestedContextReferences_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          IngestedContextReferencesDefaultEntryHolder.defaultEntry);
    }
    return ingestedContextReferences_;
  }

  public int getIngestedContextReferencesCount() {
    return internalGetIngestedContextReferences().getMap().size();
  }

  /**
   *
   *
   * <pre>
   * All context references ingested.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dialogflow.v2beta1.Conversation.ContextReference&gt; ingested_context_references = 1;
   * </code>
   */
  @java.lang.Override
  public boolean containsIngestedContextReferences(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetIngestedContextReferences().getMap().containsKey(key);
  }

  /** Use {@link #getIngestedContextReferencesMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<
          java.lang.String, com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference>
      getIngestedContextReferences() {
    return getIngestedContextReferencesMap();
  }

  /**
   *
   *
   * <pre>
   * All context references ingested.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dialogflow.v2beta1.Conversation.ContextReference&gt; ingested_context_references = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.Map<
          java.lang.String, com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference>
      getIngestedContextReferencesMap() {
    return internalGetIngestedContextReferences().getMap();
  }

  /**
   *
   *
   * <pre>
   * All context references ingested.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dialogflow.v2beta1.Conversation.ContextReference&gt; ingested_context_references = 1;
   * </code>
   */
  @java.lang.Override
  public /* nullable */ com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference
      getIngestedContextReferencesOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<
            java.lang.String, com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference>
        map = internalGetIngestedContextReferences().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }

  /**
   *
   *
   * <pre>
   * All context references ingested.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dialogflow.v2beta1.Conversation.ContextReference&gt; ingested_context_references = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference
      getIngestedContextReferencesOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<
            java.lang.String, com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference>
        map = internalGetIngestedContextReferences().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output,
        internalGetIngestedContextReferences(),
        IngestedContextReferencesDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<
            java.lang.String, com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference>
        entry : internalGetIngestedContextReferences().getMap().entrySet()) {
      com.google.protobuf.MapEntry<
              java.lang.String, com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference>
          ingestedContextReferences__ =
              IngestedContextReferencesDefaultEntryHolder.defaultEntry
                  .newBuilderForType()
                  .setKey(entry.getKey())
                  .setValue(entry.getValue())
                  .build();
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, ingestedContextReferences__);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse other =
        (com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse) obj;

    if (!internalGetIngestedContextReferences()
        .equals(other.internalGetIngestedContextReferences())) return false;
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
    if (!internalGetIngestedContextReferences().getMap().isEmpty()) {
      hash = (37 * hash) + INGESTED_CONTEXT_REFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetIngestedContextReferences().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse parseFrom(
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
      com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse prototype) {
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
   * The response message for [ConversationsService.IngestContextReferences][].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse)
      com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.ConversationProto
          .internal_static_google_cloud_dialogflow_v2beta1_IngestContextReferencesResponse_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetIngestedContextReferences();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableIngestedContextReferences();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.ConversationProto
          .internal_static_google_cloud_dialogflow_v2beta1_IngestContextReferencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse.class,
              com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableIngestedContextReferences().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.ConversationProto
          .internal_static_google_cloud_dialogflow_v2beta1_IngestContextReferencesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse build() {
      com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse buildPartial() {
      com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse result =
          new com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ingestedContextReferences_ =
            internalGetIngestedContextReferences()
                .build(IngestedContextReferencesDefaultEntryHolder.defaultEntry);
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse) {
        return mergeFrom(
            (com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse other) {
      if (other
          == com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse
              .getDefaultInstance()) return this;
      internalGetMutableIngestedContextReferences()
          .mergeFrom(other.internalGetIngestedContextReferences());
      bitField0_ |= 0x00000001;
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
                com.google.protobuf.MapEntry<
                        java.lang.String,
                        com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference>
                    ingestedContextReferences__ =
                        input.readMessage(
                            IngestedContextReferencesDefaultEntryHolder.defaultEntry
                                .getParserForType(),
                            extensionRegistry);
                internalGetMutableIngestedContextReferences()
                    .ensureBuilderMap()
                    .put(
                        ingestedContextReferences__.getKey(),
                        ingestedContextReferences__.getValue());
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

    private static final class IngestedContextReferencesConverter
        implements com.google.protobuf.MapFieldBuilder.Converter<
            java.lang.String,
            com.google.cloud.dialogflow.v2beta1.Conversation.ContextReferenceOrBuilder,
            com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference> {
      @java.lang.Override
      public com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference build(
          com.google.cloud.dialogflow.v2beta1.Conversation.ContextReferenceOrBuilder val) {
        if (val instanceof com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference) {
          return (com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference) val;
        }
        return ((com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference.Builder) val)
            .build();
      }

      @java.lang.Override
      public com.google.protobuf.MapEntry<
              java.lang.String, com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference>
          defaultEntry() {
        return IngestedContextReferencesDefaultEntryHolder.defaultEntry;
      }
    }
    ;

    private static final IngestedContextReferencesConverter ingestedContextReferencesConverter =
        new IngestedContextReferencesConverter();

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.cloud.dialogflow.v2beta1.Conversation.ContextReferenceOrBuilder,
            com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference,
            com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference.Builder>
        ingestedContextReferences_;

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.cloud.dialogflow.v2beta1.Conversation.ContextReferenceOrBuilder,
            com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference,
            com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference.Builder>
        internalGetIngestedContextReferences() {
      if (ingestedContextReferences_ == null) {
        return new com.google.protobuf.MapFieldBuilder<>(ingestedContextReferencesConverter);
      }
      return ingestedContextReferences_;
    }

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.cloud.dialogflow.v2beta1.Conversation.ContextReferenceOrBuilder,
            com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference,
            com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference.Builder>
        internalGetMutableIngestedContextReferences() {
      if (ingestedContextReferences_ == null) {
        ingestedContextReferences_ =
            new com.google.protobuf.MapFieldBuilder<>(ingestedContextReferencesConverter);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return ingestedContextReferences_;
    }

    public int getIngestedContextReferencesCount() {
      return internalGetIngestedContextReferences().ensureBuilderMap().size();
    }

    /**
     *
     *
     * <pre>
     * All context references ingested.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.dialogflow.v2beta1.Conversation.ContextReference&gt; ingested_context_references = 1;
     * </code>
     */
    @java.lang.Override
    public boolean containsIngestedContextReferences(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetIngestedContextReferences().ensureBuilderMap().containsKey(key);
    }

    /** Use {@link #getIngestedContextReferencesMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<
            java.lang.String, com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference>
        getIngestedContextReferences() {
      return getIngestedContextReferencesMap();
    }

    /**
     *
     *
     * <pre>
     * All context references ingested.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.dialogflow.v2beta1.Conversation.ContextReference&gt; ingested_context_references = 1;
     * </code>
     */
    @java.lang.Override
    public java.util.Map<
            java.lang.String, com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference>
        getIngestedContextReferencesMap() {
      return internalGetIngestedContextReferences().getImmutableMap();
    }

    /**
     *
     *
     * <pre>
     * All context references ingested.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.dialogflow.v2beta1.Conversation.ContextReference&gt; ingested_context_references = 1;
     * </code>
     */
    @java.lang.Override
    public /* nullable */ com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference
        getIngestedContextReferencesOrDefault(
            java.lang.String key,
            /* nullable */
            com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<
              java.lang.String,
              com.google.cloud.dialogflow.v2beta1.Conversation.ContextReferenceOrBuilder>
          map = internalGetMutableIngestedContextReferences().ensureBuilderMap();
      return map.containsKey(key)
          ? ingestedContextReferencesConverter.build(map.get(key))
          : defaultValue;
    }

    /**
     *
     *
     * <pre>
     * All context references ingested.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.dialogflow.v2beta1.Conversation.ContextReference&gt; ingested_context_references = 1;
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference
        getIngestedContextReferencesOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<
              java.lang.String,
              com.google.cloud.dialogflow.v2beta1.Conversation.ContextReferenceOrBuilder>
          map = internalGetMutableIngestedContextReferences().ensureBuilderMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return ingestedContextReferencesConverter.build(map.get(key));
    }

    public Builder clearIngestedContextReferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableIngestedContextReferences().clear();
      return this;
    }

    /**
     *
     *
     * <pre>
     * All context references ingested.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.dialogflow.v2beta1.Conversation.ContextReference&gt; ingested_context_references = 1;
     * </code>
     */
    public Builder removeIngestedContextReferences(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableIngestedContextReferences().ensureBuilderMap().remove(key);
      return this;
    }

    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<
            java.lang.String, com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference>
        getMutableIngestedContextReferences() {
      bitField0_ |= 0x00000001;
      return internalGetMutableIngestedContextReferences().ensureMessageMap();
    }

    /**
     *
     *
     * <pre>
     * All context references ingested.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.dialogflow.v2beta1.Conversation.ContextReference&gt; ingested_context_references = 1;
     * </code>
     */
    public Builder putIngestedContextReferences(
        java.lang.String key,
        com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableIngestedContextReferences().ensureBuilderMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }

    /**
     *
     *
     * <pre>
     * All context references ingested.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.dialogflow.v2beta1.Conversation.ContextReference&gt; ingested_context_references = 1;
     * </code>
     */
    public Builder putAllIngestedContextReferences(
        java.util.Map<
                java.lang.String, com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference>
            values) {
      for (java.util.Map.Entry<
              java.lang.String, com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference>
          e : values.entrySet()) {
        if (e.getKey() == null || e.getValue() == null) {
          throw new NullPointerException();
        }
      }
      internalGetMutableIngestedContextReferences().ensureBuilderMap().putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    /**
     *
     *
     * <pre>
     * All context references ingested.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.dialogflow.v2beta1.Conversation.ContextReference&gt; ingested_context_references = 1;
     * </code>
     */
    public com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference.Builder
        putIngestedContextReferencesBuilderIfAbsent(java.lang.String key) {
      java.util.Map<
              java.lang.String,
              com.google.cloud.dialogflow.v2beta1.Conversation.ContextReferenceOrBuilder>
          builderMap = internalGetMutableIngestedContextReferences().ensureBuilderMap();
      com.google.cloud.dialogflow.v2beta1.Conversation.ContextReferenceOrBuilder entry =
          builderMap.get(key);
      if (entry == null) {
        entry = com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference.newBuilder();
        builderMap.put(key, entry);
      }
      if (entry instanceof com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference) {
        entry =
            ((com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference) entry).toBuilder();
        builderMap.put(key, entry);
      }
      return (com.google.cloud.dialogflow.v2beta1.Conversation.ContextReference.Builder) entry;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse)
  private static final com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse();
  }

  public static com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IngestContextReferencesResponse> PARSER =
      new com.google.protobuf.AbstractParser<IngestContextReferencesResponse>() {
        @java.lang.Override
        public IngestContextReferencesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<IngestContextReferencesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IngestContextReferencesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.IngestContextReferencesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
