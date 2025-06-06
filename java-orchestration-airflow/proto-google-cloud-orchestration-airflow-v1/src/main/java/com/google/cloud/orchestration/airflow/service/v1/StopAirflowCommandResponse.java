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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.orchestration.airflow.service.v1;

/**
 *
 *
 * <pre>
 * Response to StopAirflowCommandRequest.
 * </pre>
 *
 * Protobuf type {@code google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse}
 */
public final class StopAirflowCommandResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse)
    StopAirflowCommandResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use StopAirflowCommandResponse.newBuilder() to construct.
  private StopAirflowCommandResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StopAirflowCommandResponse() {
    output_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StopAirflowCommandResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
        .internal_static_google_cloud_orchestration_airflow_service_v1_StopAirflowCommandResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
        .internal_static_google_cloud_orchestration_airflow_service_v1_StopAirflowCommandResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse.class,
            com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse.Builder
                .class);
  }

  public static final int IS_DONE_FIELD_NUMBER = 1;
  private boolean isDone_ = false;

  /**
   *
   *
   * <pre>
   * Whether the execution is still running.
   * </pre>
   *
   * <code>bool is_done = 1;</code>
   *
   * @return The isDone.
   */
  @java.lang.Override
  public boolean getIsDone() {
    return isDone_;
  }

  public static final int OUTPUT_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList output_ =
      com.google.protobuf.LazyStringArrayList.emptyList();

  /**
   *
   *
   * <pre>
   * Output message from stopping execution request.
   * </pre>
   *
   * <code>repeated string output = 2;</code>
   *
   * @return A list containing the output.
   */
  public com.google.protobuf.ProtocolStringList getOutputList() {
    return output_;
  }

  /**
   *
   *
   * <pre>
   * Output message from stopping execution request.
   * </pre>
   *
   * <code>repeated string output = 2;</code>
   *
   * @return The count of output.
   */
  public int getOutputCount() {
    return output_.size();
  }

  /**
   *
   *
   * <pre>
   * Output message from stopping execution request.
   * </pre>
   *
   * <code>repeated string output = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The output at the given index.
   */
  public java.lang.String getOutput(int index) {
    return output_.get(index);
  }

  /**
   *
   *
   * <pre>
   * Output message from stopping execution request.
   * </pre>
   *
   * <code>repeated string output = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the output at the given index.
   */
  public com.google.protobuf.ByteString getOutputBytes(int index) {
    return output_.getByteString(index);
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
    if (isDone_ != false) {
      output.writeBool(1, isDone_);
    }
    for (int i = 0; i < output_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, output_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isDone_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, isDone_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < output_.size(); i++) {
        dataSize += computeStringSizeNoTag(output_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getOutputList().size();
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
    if (!(obj
        instanceof com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse other =
        (com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse) obj;

    if (getIsDone() != other.getIsDone()) return false;
    if (!getOutputList().equals(other.getOutputList())) return false;
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
    hash = (37 * hash) + IS_DONE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsDone());
    if (getOutputCount() > 0) {
      hash = (37 * hash) + OUTPUT_FIELD_NUMBER;
      hash = (53 * hash) + getOutputList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
      parseFrom(
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
      com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse prototype) {
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
   * Response to StopAirflowCommandRequest.
   * </pre>
   *
   * Protobuf type {@code google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse)
      com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_StopAirflowCommandResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_StopAirflowCommandResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse.class,
              com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      isDone_ = false;
      output_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_StopAirflowCommandResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
        getDefaultInstanceForType() {
      return com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse build() {
      com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
        buildPartial() {
      com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse result =
          new com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isDone_ = isDone_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        output_.makeImmutable();
        result.output_ = output_;
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
      if (other
          instanceof com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse) {
        return mergeFrom(
            (com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse other) {
      if (other
          == com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
              .getDefaultInstance()) return this;
      if (other.getIsDone() != false) {
        setIsDone(other.getIsDone());
      }
      if (!other.output_.isEmpty()) {
        if (output_.isEmpty()) {
          output_ = other.output_;
          bitField0_ |= 0x00000002;
        } else {
          ensureOutputIsMutable();
          output_.addAll(other.output_);
        }
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
                isDone_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureOutputIsMutable();
                output_.add(s);
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

    private boolean isDone_;

    /**
     *
     *
     * <pre>
     * Whether the execution is still running.
     * </pre>
     *
     * <code>bool is_done = 1;</code>
     *
     * @return The isDone.
     */
    @java.lang.Override
    public boolean getIsDone() {
      return isDone_;
    }

    /**
     *
     *
     * <pre>
     * Whether the execution is still running.
     * </pre>
     *
     * <code>bool is_done = 1;</code>
     *
     * @param value The isDone to set.
     * @return This builder for chaining.
     */
    public Builder setIsDone(boolean value) {

      isDone_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Whether the execution is still running.
     * </pre>
     *
     * <code>bool is_done = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIsDone() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isDone_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList output_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureOutputIsMutable() {
      if (!output_.isModifiable()) {
        output_ = new com.google.protobuf.LazyStringArrayList(output_);
      }
      bitField0_ |= 0x00000002;
    }

    /**
     *
     *
     * <pre>
     * Output message from stopping execution request.
     * </pre>
     *
     * <code>repeated string output = 2;</code>
     *
     * @return A list containing the output.
     */
    public com.google.protobuf.ProtocolStringList getOutputList() {
      output_.makeImmutable();
      return output_;
    }

    /**
     *
     *
     * <pre>
     * Output message from stopping execution request.
     * </pre>
     *
     * <code>repeated string output = 2;</code>
     *
     * @return The count of output.
     */
    public int getOutputCount() {
      return output_.size();
    }

    /**
     *
     *
     * <pre>
     * Output message from stopping execution request.
     * </pre>
     *
     * <code>repeated string output = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The output at the given index.
     */
    public java.lang.String getOutput(int index) {
      return output_.get(index);
    }

    /**
     *
     *
     * <pre>
     * Output message from stopping execution request.
     * </pre>
     *
     * <code>repeated string output = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the output at the given index.
     */
    public com.google.protobuf.ByteString getOutputBytes(int index) {
      return output_.getByteString(index);
    }

    /**
     *
     *
     * <pre>
     * Output message from stopping execution request.
     * </pre>
     *
     * <code>repeated string output = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The output to set.
     * @return This builder for chaining.
     */
    public Builder setOutput(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureOutputIsMutable();
      output_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output message from stopping execution request.
     * </pre>
     *
     * <code>repeated string output = 2;</code>
     *
     * @param value The output to add.
     * @return This builder for chaining.
     */
    public Builder addOutput(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureOutputIsMutable();
      output_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output message from stopping execution request.
     * </pre>
     *
     * <code>repeated string output = 2;</code>
     *
     * @param values The output to add.
     * @return This builder for chaining.
     */
    public Builder addAllOutput(java.lang.Iterable<java.lang.String> values) {
      ensureOutputIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, output_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output message from stopping execution request.
     * </pre>
     *
     * <code>repeated string output = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOutput() {
      output_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output message from stopping execution request.
     * </pre>
     *
     * <code>repeated string output = 2;</code>
     *
     * @param value The bytes of the output to add.
     * @return This builder for chaining.
     */
    public Builder addOutputBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureOutputIsMutable();
      output_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse)
  private static final com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse();
  }

  public static com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StopAirflowCommandResponse> PARSER =
      new com.google.protobuf.AbstractParser<StopAirflowCommandResponse>() {
        @java.lang.Override
        public StopAirflowCommandResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<StopAirflowCommandResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StopAirflowCommandResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
