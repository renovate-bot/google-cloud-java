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
// source: google/cloud/dialogflow/cx/v3/environment.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.cx.v3;

/**
 *
 *
 * <pre>
 * The response message for
 * [Environments.DeployFlow][google.cloud.dialogflow.cx.v3.Environments.DeployFlow].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.DeployFlowResponse}
 */
public final class DeployFlowResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.DeployFlowResponse)
    DeployFlowResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use DeployFlowResponse.newBuilder() to construct.
  private DeployFlowResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DeployFlowResponse() {
    deployment_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DeployFlowResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.EnvironmentProto
        .internal_static_google_cloud_dialogflow_cx_v3_DeployFlowResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.EnvironmentProto
        .internal_static_google_cloud_dialogflow_cx_v3_DeployFlowResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.DeployFlowResponse.class,
            com.google.cloud.dialogflow.cx.v3.DeployFlowResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ENVIRONMENT_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.cx.v3.Environment environment_;

  /**
   *
   *
   * <pre>
   * The updated environment where the flow is deployed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1;</code>
   *
   * @return Whether the environment field is set.
   */
  @java.lang.Override
  public boolean hasEnvironment() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The updated environment where the flow is deployed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1;</code>
   *
   * @return The environment.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.Environment getEnvironment() {
    return environment_ == null
        ? com.google.cloud.dialogflow.cx.v3.Environment.getDefaultInstance()
        : environment_;
  }

  /**
   *
   *
   * <pre>
   * The updated environment where the flow is deployed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.EnvironmentOrBuilder getEnvironmentOrBuilder() {
    return environment_ == null
        ? com.google.cloud.dialogflow.cx.v3.Environment.getDefaultInstance()
        : environment_;
  }

  public static final int DEPLOYMENT_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object deployment_ = "";

  /**
   *
   *
   * <pre>
   * The name of the flow version
   * [Deployment][google.cloud.dialogflow.cx.v3.Deployment]. Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/environments/&lt;EnvironmentID&gt;/deployments/&lt;DeploymentID&gt;`.
   * </pre>
   *
   * <code>string deployment = 2;</code>
   *
   * @return The deployment.
   */
  @java.lang.Override
  public java.lang.String getDeployment() {
    java.lang.Object ref = deployment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deployment_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The name of the flow version
   * [Deployment][google.cloud.dialogflow.cx.v3.Deployment]. Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/environments/&lt;EnvironmentID&gt;/deployments/&lt;DeploymentID&gt;`.
   * </pre>
   *
   * <code>string deployment = 2;</code>
   *
   * @return The bytes for deployment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDeploymentBytes() {
    java.lang.Object ref = deployment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      deployment_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getEnvironment());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployment_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deployment_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getEnvironment());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployment_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deployment_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.DeployFlowResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.DeployFlowResponse other =
        (com.google.cloud.dialogflow.cx.v3.DeployFlowResponse) obj;

    if (hasEnvironment() != other.hasEnvironment()) return false;
    if (hasEnvironment()) {
      if (!getEnvironment().equals(other.getEnvironment())) return false;
    }
    if (!getDeployment().equals(other.getDeployment())) return false;
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
    if (hasEnvironment()) {
      hash = (37 * hash) + ENVIRONMENT_FIELD_NUMBER;
      hash = (53 * hash) + getEnvironment().hashCode();
    }
    hash = (37 * hash) + DEPLOYMENT_FIELD_NUMBER;
    hash = (53 * hash) + getDeployment().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.DeployFlowResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.DeployFlowResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.DeployFlowResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.DeployFlowResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.DeployFlowResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.DeployFlowResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.DeployFlowResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.DeployFlowResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.DeployFlowResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.DeployFlowResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.DeployFlowResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.DeployFlowResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3.DeployFlowResponse prototype) {
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
   * The response message for
   * [Environments.DeployFlow][google.cloud.dialogflow.cx.v3.Environments.DeployFlow].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.DeployFlowResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.DeployFlowResponse)
      com.google.cloud.dialogflow.cx.v3.DeployFlowResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.EnvironmentProto
          .internal_static_google_cloud_dialogflow_cx_v3_DeployFlowResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.EnvironmentProto
          .internal_static_google_cloud_dialogflow_cx_v3_DeployFlowResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.DeployFlowResponse.class,
              com.google.cloud.dialogflow.cx.v3.DeployFlowResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.DeployFlowResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEnvironmentFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      environment_ = null;
      if (environmentBuilder_ != null) {
        environmentBuilder_.dispose();
        environmentBuilder_ = null;
      }
      deployment_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.EnvironmentProto
          .internal_static_google_cloud_dialogflow_cx_v3_DeployFlowResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.DeployFlowResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.DeployFlowResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.DeployFlowResponse build() {
      com.google.cloud.dialogflow.cx.v3.DeployFlowResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.DeployFlowResponse buildPartial() {
      com.google.cloud.dialogflow.cx.v3.DeployFlowResponse result =
          new com.google.cloud.dialogflow.cx.v3.DeployFlowResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3.DeployFlowResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.environment_ =
            environmentBuilder_ == null ? environment_ : environmentBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.deployment_ = deployment_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3.DeployFlowResponse) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.DeployFlowResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.DeployFlowResponse other) {
      if (other == com.google.cloud.dialogflow.cx.v3.DeployFlowResponse.getDefaultInstance())
        return this;
      if (other.hasEnvironment()) {
        mergeEnvironment(other.getEnvironment());
      }
      if (!other.getDeployment().isEmpty()) {
        deployment_ = other.deployment_;
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
                input.readMessage(getEnvironmentFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                deployment_ = input.readStringRequireUtf8();
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

    private com.google.cloud.dialogflow.cx.v3.Environment environment_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.Environment,
            com.google.cloud.dialogflow.cx.v3.Environment.Builder,
            com.google.cloud.dialogflow.cx.v3.EnvironmentOrBuilder>
        environmentBuilder_;

    /**
     *
     *
     * <pre>
     * The updated environment where the flow is deployed.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1;</code>
     *
     * @return Whether the environment field is set.
     */
    public boolean hasEnvironment() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * The updated environment where the flow is deployed.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1;</code>
     *
     * @return The environment.
     */
    public com.google.cloud.dialogflow.cx.v3.Environment getEnvironment() {
      if (environmentBuilder_ == null) {
        return environment_ == null
            ? com.google.cloud.dialogflow.cx.v3.Environment.getDefaultInstance()
            : environment_;
      } else {
        return environmentBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The updated environment where the flow is deployed.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1;</code>
     */
    public Builder setEnvironment(com.google.cloud.dialogflow.cx.v3.Environment value) {
      if (environmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        environment_ = value;
      } else {
        environmentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The updated environment where the flow is deployed.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1;</code>
     */
    public Builder setEnvironment(
        com.google.cloud.dialogflow.cx.v3.Environment.Builder builderForValue) {
      if (environmentBuilder_ == null) {
        environment_ = builderForValue.build();
      } else {
        environmentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The updated environment where the flow is deployed.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1;</code>
     */
    public Builder mergeEnvironment(com.google.cloud.dialogflow.cx.v3.Environment value) {
      if (environmentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && environment_ != null
            && environment_ != com.google.cloud.dialogflow.cx.v3.Environment.getDefaultInstance()) {
          getEnvironmentBuilder().mergeFrom(value);
        } else {
          environment_ = value;
        }
      } else {
        environmentBuilder_.mergeFrom(value);
      }
      if (environment_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The updated environment where the flow is deployed.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1;</code>
     */
    public Builder clearEnvironment() {
      bitField0_ = (bitField0_ & ~0x00000001);
      environment_ = null;
      if (environmentBuilder_ != null) {
        environmentBuilder_.dispose();
        environmentBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The updated environment where the flow is deployed.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Environment.Builder getEnvironmentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEnvironmentFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The updated environment where the flow is deployed.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.EnvironmentOrBuilder getEnvironmentOrBuilder() {
      if (environmentBuilder_ != null) {
        return environmentBuilder_.getMessageOrBuilder();
      } else {
        return environment_ == null
            ? com.google.cloud.dialogflow.cx.v3.Environment.getDefaultInstance()
            : environment_;
      }
    }

    /**
     *
     *
     * <pre>
     * The updated environment where the flow is deployed.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.Environment,
            com.google.cloud.dialogflow.cx.v3.Environment.Builder,
            com.google.cloud.dialogflow.cx.v3.EnvironmentOrBuilder>
        getEnvironmentFieldBuilder() {
      if (environmentBuilder_ == null) {
        environmentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.cx.v3.Environment,
                com.google.cloud.dialogflow.cx.v3.Environment.Builder,
                com.google.cloud.dialogflow.cx.v3.EnvironmentOrBuilder>(
                getEnvironment(), getParentForChildren(), isClean());
        environment_ = null;
      }
      return environmentBuilder_;
    }

    private java.lang.Object deployment_ = "";

    /**
     *
     *
     * <pre>
     * The name of the flow version
     * [Deployment][google.cloud.dialogflow.cx.v3.Deployment]. Format:
     * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/environments/&lt;EnvironmentID&gt;/deployments/&lt;DeploymentID&gt;`.
     * </pre>
     *
     * <code>string deployment = 2;</code>
     *
     * @return The deployment.
     */
    public java.lang.String getDeployment() {
      java.lang.Object ref = deployment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deployment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The name of the flow version
     * [Deployment][google.cloud.dialogflow.cx.v3.Deployment]. Format:
     * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/environments/&lt;EnvironmentID&gt;/deployments/&lt;DeploymentID&gt;`.
     * </pre>
     *
     * <code>string deployment = 2;</code>
     *
     * @return The bytes for deployment.
     */
    public com.google.protobuf.ByteString getDeploymentBytes() {
      java.lang.Object ref = deployment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        deployment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The name of the flow version
     * [Deployment][google.cloud.dialogflow.cx.v3.Deployment]. Format:
     * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/environments/&lt;EnvironmentID&gt;/deployments/&lt;DeploymentID&gt;`.
     * </pre>
     *
     * <code>string deployment = 2;</code>
     *
     * @param value The deployment to set.
     * @return This builder for chaining.
     */
    public Builder setDeployment(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      deployment_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The name of the flow version
     * [Deployment][google.cloud.dialogflow.cx.v3.Deployment]. Format:
     * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/environments/&lt;EnvironmentID&gt;/deployments/&lt;DeploymentID&gt;`.
     * </pre>
     *
     * <code>string deployment = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDeployment() {
      deployment_ = getDefaultInstance().getDeployment();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The name of the flow version
     * [Deployment][google.cloud.dialogflow.cx.v3.Deployment]. Format:
     * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/environments/&lt;EnvironmentID&gt;/deployments/&lt;DeploymentID&gt;`.
     * </pre>
     *
     * <code>string deployment = 2;</code>
     *
     * @param value The bytes for deployment to set.
     * @return This builder for chaining.
     */
    public Builder setDeploymentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      deployment_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.DeployFlowResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.DeployFlowResponse)
  private static final com.google.cloud.dialogflow.cx.v3.DeployFlowResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.DeployFlowResponse();
  }

  public static com.google.cloud.dialogflow.cx.v3.DeployFlowResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeployFlowResponse> PARSER =
      new com.google.protobuf.AbstractParser<DeployFlowResponse>() {
        @java.lang.Override
        public DeployFlowResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeployFlowResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeployFlowResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.DeployFlowResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
