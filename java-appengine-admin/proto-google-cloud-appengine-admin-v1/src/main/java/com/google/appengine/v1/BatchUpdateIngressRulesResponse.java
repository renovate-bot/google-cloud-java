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
// source: google/appengine/v1/appengine.proto

// Protobuf Java Version: 3.25.8
package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * Response message for `Firewall.UpdateAllIngressRules`.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.BatchUpdateIngressRulesResponse}
 */
public final class BatchUpdateIngressRulesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.BatchUpdateIngressRulesResponse)
    BatchUpdateIngressRulesResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use BatchUpdateIngressRulesResponse.newBuilder() to construct.
  private BatchUpdateIngressRulesResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchUpdateIngressRulesResponse() {
    ingressRules_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchUpdateIngressRulesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.appengine.v1.AppengineProto
        .internal_static_google_appengine_v1_BatchUpdateIngressRulesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.AppengineProto
        .internal_static_google_appengine_v1_BatchUpdateIngressRulesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.BatchUpdateIngressRulesResponse.class,
            com.google.appengine.v1.BatchUpdateIngressRulesResponse.Builder.class);
  }

  public static final int INGRESS_RULES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.appengine.v1.firewall.FirewallRule> ingressRules_;

  /**
   *
   *
   * <pre>
   * The full list of ingress FirewallRules for this application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.appengine.v1.firewall.FirewallRule> getIngressRulesList() {
    return ingressRules_;
  }

  /**
   *
   *
   * <pre>
   * The full list of ingress FirewallRules for this application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.appengine.v1.firewall.FirewallRuleOrBuilder>
      getIngressRulesOrBuilderList() {
    return ingressRules_;
  }

  /**
   *
   *
   * <pre>
   * The full list of ingress FirewallRules for this application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
   */
  @java.lang.Override
  public int getIngressRulesCount() {
    return ingressRules_.size();
  }

  /**
   *
   *
   * <pre>
   * The full list of ingress FirewallRules for this application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
   */
  @java.lang.Override
  public com.google.appengine.v1.firewall.FirewallRule getIngressRules(int index) {
    return ingressRules_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The full list of ingress FirewallRules for this application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
   */
  @java.lang.Override
  public com.google.appengine.v1.firewall.FirewallRuleOrBuilder getIngressRulesOrBuilder(
      int index) {
    return ingressRules_.get(index);
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
    for (int i = 0; i < ingressRules_.size(); i++) {
      output.writeMessage(1, ingressRules_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < ingressRules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, ingressRules_.get(i));
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
    if (!(obj instanceof com.google.appengine.v1.BatchUpdateIngressRulesResponse)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.BatchUpdateIngressRulesResponse other =
        (com.google.appengine.v1.BatchUpdateIngressRulesResponse) obj;

    if (!getIngressRulesList().equals(other.getIngressRulesList())) return false;
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
    if (getIngressRulesCount() > 0) {
      hash = (37 * hash) + INGRESS_RULES_FIELD_NUMBER;
      hash = (53 * hash) + getIngressRulesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.BatchUpdateIngressRulesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.BatchUpdateIngressRulesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.BatchUpdateIngressRulesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.BatchUpdateIngressRulesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.BatchUpdateIngressRulesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.BatchUpdateIngressRulesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.BatchUpdateIngressRulesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.BatchUpdateIngressRulesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.BatchUpdateIngressRulesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.BatchUpdateIngressRulesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.BatchUpdateIngressRulesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.BatchUpdateIngressRulesResponse parseFrom(
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
      com.google.appengine.v1.BatchUpdateIngressRulesResponse prototype) {
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
   * Response message for `Firewall.UpdateAllIngressRules`.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.BatchUpdateIngressRulesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.BatchUpdateIngressRulesResponse)
      com.google.appengine.v1.BatchUpdateIngressRulesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.AppengineProto
          .internal_static_google_appengine_v1_BatchUpdateIngressRulesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.AppengineProto
          .internal_static_google_appengine_v1_BatchUpdateIngressRulesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.BatchUpdateIngressRulesResponse.class,
              com.google.appengine.v1.BatchUpdateIngressRulesResponse.Builder.class);
    }

    // Construct using com.google.appengine.v1.BatchUpdateIngressRulesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (ingressRulesBuilder_ == null) {
        ingressRules_ = java.util.Collections.emptyList();
      } else {
        ingressRules_ = null;
        ingressRulesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.AppengineProto
          .internal_static_google_appengine_v1_BatchUpdateIngressRulesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.BatchUpdateIngressRulesResponse getDefaultInstanceForType() {
      return com.google.appengine.v1.BatchUpdateIngressRulesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.BatchUpdateIngressRulesResponse build() {
      com.google.appengine.v1.BatchUpdateIngressRulesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.BatchUpdateIngressRulesResponse buildPartial() {
      com.google.appengine.v1.BatchUpdateIngressRulesResponse result =
          new com.google.appengine.v1.BatchUpdateIngressRulesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.appengine.v1.BatchUpdateIngressRulesResponse result) {
      if (ingressRulesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          ingressRules_ = java.util.Collections.unmodifiableList(ingressRules_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ingressRules_ = ingressRules_;
      } else {
        result.ingressRules_ = ingressRulesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.appengine.v1.BatchUpdateIngressRulesResponse result) {
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
      if (other instanceof com.google.appengine.v1.BatchUpdateIngressRulesResponse) {
        return mergeFrom((com.google.appengine.v1.BatchUpdateIngressRulesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.BatchUpdateIngressRulesResponse other) {
      if (other == com.google.appengine.v1.BatchUpdateIngressRulesResponse.getDefaultInstance())
        return this;
      if (ingressRulesBuilder_ == null) {
        if (!other.ingressRules_.isEmpty()) {
          if (ingressRules_.isEmpty()) {
            ingressRules_ = other.ingressRules_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIngressRulesIsMutable();
            ingressRules_.addAll(other.ingressRules_);
          }
          onChanged();
        }
      } else {
        if (!other.ingressRules_.isEmpty()) {
          if (ingressRulesBuilder_.isEmpty()) {
            ingressRulesBuilder_.dispose();
            ingressRulesBuilder_ = null;
            ingressRules_ = other.ingressRules_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ingressRulesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getIngressRulesFieldBuilder()
                    : null;
          } else {
            ingressRulesBuilder_.addAllMessages(other.ingressRules_);
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
                com.google.appengine.v1.firewall.FirewallRule m =
                    input.readMessage(
                        com.google.appengine.v1.firewall.FirewallRule.parser(), extensionRegistry);
                if (ingressRulesBuilder_ == null) {
                  ensureIngressRulesIsMutable();
                  ingressRules_.add(m);
                } else {
                  ingressRulesBuilder_.addMessage(m);
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

    private java.util.List<com.google.appengine.v1.firewall.FirewallRule> ingressRules_ =
        java.util.Collections.emptyList();

    private void ensureIngressRulesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ingressRules_ =
            new java.util.ArrayList<com.google.appengine.v1.firewall.FirewallRule>(ingressRules_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.appengine.v1.firewall.FirewallRule,
            com.google.appengine.v1.firewall.FirewallRule.Builder,
            com.google.appengine.v1.firewall.FirewallRuleOrBuilder>
        ingressRulesBuilder_;

    /**
     *
     *
     * <pre>
     * The full list of ingress FirewallRules for this application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
     */
    public java.util.List<com.google.appengine.v1.firewall.FirewallRule> getIngressRulesList() {
      if (ingressRulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ingressRules_);
      } else {
        return ingressRulesBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The full list of ingress FirewallRules for this application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
     */
    public int getIngressRulesCount() {
      if (ingressRulesBuilder_ == null) {
        return ingressRules_.size();
      } else {
        return ingressRulesBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The full list of ingress FirewallRules for this application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
     */
    public com.google.appengine.v1.firewall.FirewallRule getIngressRules(int index) {
      if (ingressRulesBuilder_ == null) {
        return ingressRules_.get(index);
      } else {
        return ingressRulesBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The full list of ingress FirewallRules for this application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
     */
    public Builder setIngressRules(int index, com.google.appengine.v1.firewall.FirewallRule value) {
      if (ingressRulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIngressRulesIsMutable();
        ingressRules_.set(index, value);
        onChanged();
      } else {
        ingressRulesBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The full list of ingress FirewallRules for this application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
     */
    public Builder setIngressRules(
        int index, com.google.appengine.v1.firewall.FirewallRule.Builder builderForValue) {
      if (ingressRulesBuilder_ == null) {
        ensureIngressRulesIsMutable();
        ingressRules_.set(index, builderForValue.build());
        onChanged();
      } else {
        ingressRulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The full list of ingress FirewallRules for this application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
     */
    public Builder addIngressRules(com.google.appengine.v1.firewall.FirewallRule value) {
      if (ingressRulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIngressRulesIsMutable();
        ingressRules_.add(value);
        onChanged();
      } else {
        ingressRulesBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The full list of ingress FirewallRules for this application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
     */
    public Builder addIngressRules(int index, com.google.appengine.v1.firewall.FirewallRule value) {
      if (ingressRulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIngressRulesIsMutable();
        ingressRules_.add(index, value);
        onChanged();
      } else {
        ingressRulesBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The full list of ingress FirewallRules for this application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
     */
    public Builder addIngressRules(
        com.google.appengine.v1.firewall.FirewallRule.Builder builderForValue) {
      if (ingressRulesBuilder_ == null) {
        ensureIngressRulesIsMutable();
        ingressRules_.add(builderForValue.build());
        onChanged();
      } else {
        ingressRulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The full list of ingress FirewallRules for this application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
     */
    public Builder addIngressRules(
        int index, com.google.appengine.v1.firewall.FirewallRule.Builder builderForValue) {
      if (ingressRulesBuilder_ == null) {
        ensureIngressRulesIsMutable();
        ingressRules_.add(index, builderForValue.build());
        onChanged();
      } else {
        ingressRulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The full list of ingress FirewallRules for this application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
     */
    public Builder addAllIngressRules(
        java.lang.Iterable<? extends com.google.appengine.v1.firewall.FirewallRule> values) {
      if (ingressRulesBuilder_ == null) {
        ensureIngressRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, ingressRules_);
        onChanged();
      } else {
        ingressRulesBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The full list of ingress FirewallRules for this application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
     */
    public Builder clearIngressRules() {
      if (ingressRulesBuilder_ == null) {
        ingressRules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ingressRulesBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The full list of ingress FirewallRules for this application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
     */
    public Builder removeIngressRules(int index) {
      if (ingressRulesBuilder_ == null) {
        ensureIngressRulesIsMutable();
        ingressRules_.remove(index);
        onChanged();
      } else {
        ingressRulesBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The full list of ingress FirewallRules for this application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
     */
    public com.google.appengine.v1.firewall.FirewallRule.Builder getIngressRulesBuilder(int index) {
      return getIngressRulesFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The full list of ingress FirewallRules for this application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
     */
    public com.google.appengine.v1.firewall.FirewallRuleOrBuilder getIngressRulesOrBuilder(
        int index) {
      if (ingressRulesBuilder_ == null) {
        return ingressRules_.get(index);
      } else {
        return ingressRulesBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The full list of ingress FirewallRules for this application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
     */
    public java.util.List<? extends com.google.appengine.v1.firewall.FirewallRuleOrBuilder>
        getIngressRulesOrBuilderList() {
      if (ingressRulesBuilder_ != null) {
        return ingressRulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ingressRules_);
      }
    }

    /**
     *
     *
     * <pre>
     * The full list of ingress FirewallRules for this application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
     */
    public com.google.appengine.v1.firewall.FirewallRule.Builder addIngressRulesBuilder() {
      return getIngressRulesFieldBuilder()
          .addBuilder(com.google.appengine.v1.firewall.FirewallRule.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The full list of ingress FirewallRules for this application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
     */
    public com.google.appengine.v1.firewall.FirewallRule.Builder addIngressRulesBuilder(int index) {
      return getIngressRulesFieldBuilder()
          .addBuilder(index, com.google.appengine.v1.firewall.FirewallRule.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The full list of ingress FirewallRules for this application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
     */
    public java.util.List<com.google.appengine.v1.firewall.FirewallRule.Builder>
        getIngressRulesBuilderList() {
      return getIngressRulesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.appengine.v1.firewall.FirewallRule,
            com.google.appengine.v1.firewall.FirewallRule.Builder,
            com.google.appengine.v1.firewall.FirewallRuleOrBuilder>
        getIngressRulesFieldBuilder() {
      if (ingressRulesBuilder_ == null) {
        ingressRulesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.appengine.v1.firewall.FirewallRule,
                com.google.appengine.v1.firewall.FirewallRule.Builder,
                com.google.appengine.v1.firewall.FirewallRuleOrBuilder>(
                ingressRules_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        ingressRules_ = null;
      }
      return ingressRulesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.BatchUpdateIngressRulesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.BatchUpdateIngressRulesResponse)
  private static final com.google.appengine.v1.BatchUpdateIngressRulesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.BatchUpdateIngressRulesResponse();
  }

  public static com.google.appengine.v1.BatchUpdateIngressRulesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchUpdateIngressRulesResponse> PARSER =
      new com.google.protobuf.AbstractParser<BatchUpdateIngressRulesResponse>() {
        @java.lang.Override
        public BatchUpdateIngressRulesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchUpdateIngressRulesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchUpdateIngressRulesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.BatchUpdateIngressRulesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
