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
// source: google/shopping/merchant/products/v1beta/products_common.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.products.v1beta;

/**
 *
 *
 * <pre>
 * A message that represents installment.
 * </pre>
 *
 * Protobuf type {@code google.shopping.merchant.products.v1beta.Installment}
 */
public final class Installment extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.shopping.merchant.products.v1beta.Installment)
    InstallmentOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Installment.newBuilder() to construct.
  private Installment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Installment() {
    creditType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Installment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
        .internal_static_google_shopping_merchant_products_v1beta_Installment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
        .internal_static_google_shopping_merchant_products_v1beta_Installment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.merchant.products.v1beta.Installment.class,
            com.google.shopping.merchant.products.v1beta.Installment.Builder.class);
  }

  private int bitField0_;
  public static final int MONTHS_FIELD_NUMBER = 1;
  private long months_ = 0L;

  /**
   *
   *
   * <pre>
   * The number of installments the buyer has to pay.
   * </pre>
   *
   * <code>int64 months = 1;</code>
   *
   * @return The months.
   */
  @java.lang.Override
  public long getMonths() {
    return months_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private com.google.shopping.type.Price amount_;

  /**
   *
   *
   * <pre>
   * The amount the buyer has to pay per month.
   * </pre>
   *
   * <code>.google.shopping.type.Price amount = 2;</code>
   *
   * @return Whether the amount field is set.
   */
  @java.lang.Override
  public boolean hasAmount() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The amount the buyer has to pay per month.
   * </pre>
   *
   * <code>.google.shopping.type.Price amount = 2;</code>
   *
   * @return The amount.
   */
  @java.lang.Override
  public com.google.shopping.type.Price getAmount() {
    return amount_ == null ? com.google.shopping.type.Price.getDefaultInstance() : amount_;
  }

  /**
   *
   *
   * <pre>
   * The amount the buyer has to pay per month.
   * </pre>
   *
   * <code>.google.shopping.type.Price amount = 2;</code>
   */
  @java.lang.Override
  public com.google.shopping.type.PriceOrBuilder getAmountOrBuilder() {
    return amount_ == null ? com.google.shopping.type.Price.getDefaultInstance() : amount_;
  }

  public static final int DOWNPAYMENT_FIELD_NUMBER = 3;
  private com.google.shopping.type.Price downpayment_;

  /**
   *
   *
   * <pre>
   * The up-front down payment amount the buyer has to pay.
   * </pre>
   *
   * <code>optional .google.shopping.type.Price downpayment = 3;</code>
   *
   * @return Whether the downpayment field is set.
   */
  @java.lang.Override
  public boolean hasDownpayment() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * The up-front down payment amount the buyer has to pay.
   * </pre>
   *
   * <code>optional .google.shopping.type.Price downpayment = 3;</code>
   *
   * @return The downpayment.
   */
  @java.lang.Override
  public com.google.shopping.type.Price getDownpayment() {
    return downpayment_ == null
        ? com.google.shopping.type.Price.getDefaultInstance()
        : downpayment_;
  }

  /**
   *
   *
   * <pre>
   * The up-front down payment amount the buyer has to pay.
   * </pre>
   *
   * <code>optional .google.shopping.type.Price downpayment = 3;</code>
   */
  @java.lang.Override
  public com.google.shopping.type.PriceOrBuilder getDownpaymentOrBuilder() {
    return downpayment_ == null
        ? com.google.shopping.type.Price.getDefaultInstance()
        : downpayment_;
  }

  public static final int CREDIT_TYPE_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object creditType_ = "";

  /**
   *
   *
   * <pre>
   * Type of installment payments.
   * Supported values are:
   *   * "`finance`"
   *   * "`lease`"
   * </pre>
   *
   * <code>optional string credit_type = 4;</code>
   *
   * @return Whether the creditType field is set.
   */
  @java.lang.Override
  public boolean hasCreditType() {
    return ((bitField0_ & 0x00000004) != 0);
  }

  /**
   *
   *
   * <pre>
   * Type of installment payments.
   * Supported values are:
   *   * "`finance`"
   *   * "`lease`"
   * </pre>
   *
   * <code>optional string credit_type = 4;</code>
   *
   * @return The creditType.
   */
  @java.lang.Override
  public java.lang.String getCreditType() {
    java.lang.Object ref = creditType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      creditType_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Type of installment payments.
   * Supported values are:
   *   * "`finance`"
   *   * "`lease`"
   * </pre>
   *
   * <code>optional string credit_type = 4;</code>
   *
   * @return The bytes for creditType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCreditTypeBytes() {
    java.lang.Object ref = creditType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      creditType_ = b;
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
    if (months_ != 0L) {
      output.writeInt64(1, months_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getAmount());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getDownpayment());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, creditType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (months_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, months_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getAmount());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getDownpayment());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, creditType_);
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
    if (!(obj instanceof com.google.shopping.merchant.products.v1beta.Installment)) {
      return super.equals(obj);
    }
    com.google.shopping.merchant.products.v1beta.Installment other =
        (com.google.shopping.merchant.products.v1beta.Installment) obj;

    if (getMonths() != other.getMonths()) return false;
    if (hasAmount() != other.hasAmount()) return false;
    if (hasAmount()) {
      if (!getAmount().equals(other.getAmount())) return false;
    }
    if (hasDownpayment() != other.hasDownpayment()) return false;
    if (hasDownpayment()) {
      if (!getDownpayment().equals(other.getDownpayment())) return false;
    }
    if (hasCreditType() != other.hasCreditType()) return false;
    if (hasCreditType()) {
      if (!getCreditType().equals(other.getCreditType())) return false;
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
    hash = (37 * hash) + MONTHS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getMonths());
    if (hasAmount()) {
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAmount().hashCode();
    }
    if (hasDownpayment()) {
      hash = (37 * hash) + DOWNPAYMENT_FIELD_NUMBER;
      hash = (53 * hash) + getDownpayment().hashCode();
    }
    if (hasCreditType()) {
      hash = (37 * hash) + CREDIT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getCreditType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.merchant.products.v1beta.Installment parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.products.v1beta.Installment parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.Installment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.products.v1beta.Installment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.Installment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.products.v1beta.Installment parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.Installment parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.products.v1beta.Installment parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.Installment parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.products.v1beta.Installment parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.Installment parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.products.v1beta.Installment parseFrom(
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
      com.google.shopping.merchant.products.v1beta.Installment prototype) {
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
   * A message that represents installment.
   * </pre>
   *
   * Protobuf type {@code google.shopping.merchant.products.v1beta.Installment}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.shopping.merchant.products.v1beta.Installment)
      com.google.shopping.merchant.products.v1beta.InstallmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
          .internal_static_google_shopping_merchant_products_v1beta_Installment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
          .internal_static_google_shopping_merchant_products_v1beta_Installment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.merchant.products.v1beta.Installment.class,
              com.google.shopping.merchant.products.v1beta.Installment.Builder.class);
    }

    // Construct using com.google.shopping.merchant.products.v1beta.Installment.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAmountFieldBuilder();
        getDownpaymentFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      months_ = 0L;
      amount_ = null;
      if (amountBuilder_ != null) {
        amountBuilder_.dispose();
        amountBuilder_ = null;
      }
      downpayment_ = null;
      if (downpaymentBuilder_ != null) {
        downpaymentBuilder_.dispose();
        downpaymentBuilder_ = null;
      }
      creditType_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
          .internal_static_google_shopping_merchant_products_v1beta_Installment_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.merchant.products.v1beta.Installment getDefaultInstanceForType() {
      return com.google.shopping.merchant.products.v1beta.Installment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.merchant.products.v1beta.Installment build() {
      com.google.shopping.merchant.products.v1beta.Installment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.merchant.products.v1beta.Installment buildPartial() {
      com.google.shopping.merchant.products.v1beta.Installment result =
          new com.google.shopping.merchant.products.v1beta.Installment(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.shopping.merchant.products.v1beta.Installment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.months_ = months_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.amount_ = amountBuilder_ == null ? amount_ : amountBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.downpayment_ =
            downpaymentBuilder_ == null ? downpayment_ : downpaymentBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.creditType_ = creditType_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.shopping.merchant.products.v1beta.Installment) {
        return mergeFrom((com.google.shopping.merchant.products.v1beta.Installment) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.shopping.merchant.products.v1beta.Installment other) {
      if (other == com.google.shopping.merchant.products.v1beta.Installment.getDefaultInstance())
        return this;
      if (other.getMonths() != 0L) {
        setMonths(other.getMonths());
      }
      if (other.hasAmount()) {
        mergeAmount(other.getAmount());
      }
      if (other.hasDownpayment()) {
        mergeDownpayment(other.getDownpayment());
      }
      if (other.hasCreditType()) {
        creditType_ = other.creditType_;
        bitField0_ |= 0x00000008;
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
                months_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(getAmountFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getDownpaymentFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 34:
              {
                creditType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

    private long months_;

    /**
     *
     *
     * <pre>
     * The number of installments the buyer has to pay.
     * </pre>
     *
     * <code>int64 months = 1;</code>
     *
     * @return The months.
     */
    @java.lang.Override
    public long getMonths() {
      return months_;
    }

    /**
     *
     *
     * <pre>
     * The number of installments the buyer has to pay.
     * </pre>
     *
     * <code>int64 months = 1;</code>
     *
     * @param value The months to set.
     * @return This builder for chaining.
     */
    public Builder setMonths(long value) {

      months_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The number of installments the buyer has to pay.
     * </pre>
     *
     * <code>int64 months = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMonths() {
      bitField0_ = (bitField0_ & ~0x00000001);
      months_ = 0L;
      onChanged();
      return this;
    }

    private com.google.shopping.type.Price amount_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.shopping.type.Price,
            com.google.shopping.type.Price.Builder,
            com.google.shopping.type.PriceOrBuilder>
        amountBuilder_;

    /**
     *
     *
     * <pre>
     * The amount the buyer has to pay per month.
     * </pre>
     *
     * <code>.google.shopping.type.Price amount = 2;</code>
     *
     * @return Whether the amount field is set.
     */
    public boolean hasAmount() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * The amount the buyer has to pay per month.
     * </pre>
     *
     * <code>.google.shopping.type.Price amount = 2;</code>
     *
     * @return The amount.
     */
    public com.google.shopping.type.Price getAmount() {
      if (amountBuilder_ == null) {
        return amount_ == null ? com.google.shopping.type.Price.getDefaultInstance() : amount_;
      } else {
        return amountBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The amount the buyer has to pay per month.
     * </pre>
     *
     * <code>.google.shopping.type.Price amount = 2;</code>
     */
    public Builder setAmount(com.google.shopping.type.Price value) {
      if (amountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        amount_ = value;
      } else {
        amountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The amount the buyer has to pay per month.
     * </pre>
     *
     * <code>.google.shopping.type.Price amount = 2;</code>
     */
    public Builder setAmount(com.google.shopping.type.Price.Builder builderForValue) {
      if (amountBuilder_ == null) {
        amount_ = builderForValue.build();
      } else {
        amountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The amount the buyer has to pay per month.
     * </pre>
     *
     * <code>.google.shopping.type.Price amount = 2;</code>
     */
    public Builder mergeAmount(com.google.shopping.type.Price value) {
      if (amountBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && amount_ != null
            && amount_ != com.google.shopping.type.Price.getDefaultInstance()) {
          getAmountBuilder().mergeFrom(value);
        } else {
          amount_ = value;
        }
      } else {
        amountBuilder_.mergeFrom(value);
      }
      if (amount_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The amount the buyer has to pay per month.
     * </pre>
     *
     * <code>.google.shopping.type.Price amount = 2;</code>
     */
    public Builder clearAmount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      amount_ = null;
      if (amountBuilder_ != null) {
        amountBuilder_.dispose();
        amountBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The amount the buyer has to pay per month.
     * </pre>
     *
     * <code>.google.shopping.type.Price amount = 2;</code>
     */
    public com.google.shopping.type.Price.Builder getAmountBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAmountFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The amount the buyer has to pay per month.
     * </pre>
     *
     * <code>.google.shopping.type.Price amount = 2;</code>
     */
    public com.google.shopping.type.PriceOrBuilder getAmountOrBuilder() {
      if (amountBuilder_ != null) {
        return amountBuilder_.getMessageOrBuilder();
      } else {
        return amount_ == null ? com.google.shopping.type.Price.getDefaultInstance() : amount_;
      }
    }

    /**
     *
     *
     * <pre>
     * The amount the buyer has to pay per month.
     * </pre>
     *
     * <code>.google.shopping.type.Price amount = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.shopping.type.Price,
            com.google.shopping.type.Price.Builder,
            com.google.shopping.type.PriceOrBuilder>
        getAmountFieldBuilder() {
      if (amountBuilder_ == null) {
        amountBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.shopping.type.Price,
                com.google.shopping.type.Price.Builder,
                com.google.shopping.type.PriceOrBuilder>(
                getAmount(), getParentForChildren(), isClean());
        amount_ = null;
      }
      return amountBuilder_;
    }

    private com.google.shopping.type.Price downpayment_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.shopping.type.Price,
            com.google.shopping.type.Price.Builder,
            com.google.shopping.type.PriceOrBuilder>
        downpaymentBuilder_;

    /**
     *
     *
     * <pre>
     * The up-front down payment amount the buyer has to pay.
     * </pre>
     *
     * <code>optional .google.shopping.type.Price downpayment = 3;</code>
     *
     * @return Whether the downpayment field is set.
     */
    public boolean hasDownpayment() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * The up-front down payment amount the buyer has to pay.
     * </pre>
     *
     * <code>optional .google.shopping.type.Price downpayment = 3;</code>
     *
     * @return The downpayment.
     */
    public com.google.shopping.type.Price getDownpayment() {
      if (downpaymentBuilder_ == null) {
        return downpayment_ == null
            ? com.google.shopping.type.Price.getDefaultInstance()
            : downpayment_;
      } else {
        return downpaymentBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The up-front down payment amount the buyer has to pay.
     * </pre>
     *
     * <code>optional .google.shopping.type.Price downpayment = 3;</code>
     */
    public Builder setDownpayment(com.google.shopping.type.Price value) {
      if (downpaymentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        downpayment_ = value;
      } else {
        downpaymentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The up-front down payment amount the buyer has to pay.
     * </pre>
     *
     * <code>optional .google.shopping.type.Price downpayment = 3;</code>
     */
    public Builder setDownpayment(com.google.shopping.type.Price.Builder builderForValue) {
      if (downpaymentBuilder_ == null) {
        downpayment_ = builderForValue.build();
      } else {
        downpaymentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The up-front down payment amount the buyer has to pay.
     * </pre>
     *
     * <code>optional .google.shopping.type.Price downpayment = 3;</code>
     */
    public Builder mergeDownpayment(com.google.shopping.type.Price value) {
      if (downpaymentBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && downpayment_ != null
            && downpayment_ != com.google.shopping.type.Price.getDefaultInstance()) {
          getDownpaymentBuilder().mergeFrom(value);
        } else {
          downpayment_ = value;
        }
      } else {
        downpaymentBuilder_.mergeFrom(value);
      }
      if (downpayment_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The up-front down payment amount the buyer has to pay.
     * </pre>
     *
     * <code>optional .google.shopping.type.Price downpayment = 3;</code>
     */
    public Builder clearDownpayment() {
      bitField0_ = (bitField0_ & ~0x00000004);
      downpayment_ = null;
      if (downpaymentBuilder_ != null) {
        downpaymentBuilder_.dispose();
        downpaymentBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The up-front down payment amount the buyer has to pay.
     * </pre>
     *
     * <code>optional .google.shopping.type.Price downpayment = 3;</code>
     */
    public com.google.shopping.type.Price.Builder getDownpaymentBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getDownpaymentFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The up-front down payment amount the buyer has to pay.
     * </pre>
     *
     * <code>optional .google.shopping.type.Price downpayment = 3;</code>
     */
    public com.google.shopping.type.PriceOrBuilder getDownpaymentOrBuilder() {
      if (downpaymentBuilder_ != null) {
        return downpaymentBuilder_.getMessageOrBuilder();
      } else {
        return downpayment_ == null
            ? com.google.shopping.type.Price.getDefaultInstance()
            : downpayment_;
      }
    }

    /**
     *
     *
     * <pre>
     * The up-front down payment amount the buyer has to pay.
     * </pre>
     *
     * <code>optional .google.shopping.type.Price downpayment = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.shopping.type.Price,
            com.google.shopping.type.Price.Builder,
            com.google.shopping.type.PriceOrBuilder>
        getDownpaymentFieldBuilder() {
      if (downpaymentBuilder_ == null) {
        downpaymentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.shopping.type.Price,
                com.google.shopping.type.Price.Builder,
                com.google.shopping.type.PriceOrBuilder>(
                getDownpayment(), getParentForChildren(), isClean());
        downpayment_ = null;
      }
      return downpaymentBuilder_;
    }

    private java.lang.Object creditType_ = "";

    /**
     *
     *
     * <pre>
     * Type of installment payments.
     * Supported values are:
     *   * "`finance`"
     *   * "`lease`"
     * </pre>
     *
     * <code>optional string credit_type = 4;</code>
     *
     * @return Whether the creditType field is set.
     */
    public boolean hasCreditType() {
      return ((bitField0_ & 0x00000008) != 0);
    }

    /**
     *
     *
     * <pre>
     * Type of installment payments.
     * Supported values are:
     *   * "`finance`"
     *   * "`lease`"
     * </pre>
     *
     * <code>optional string credit_type = 4;</code>
     *
     * @return The creditType.
     */
    public java.lang.String getCreditType() {
      java.lang.Object ref = creditType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        creditType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Type of installment payments.
     * Supported values are:
     *   * "`finance`"
     *   * "`lease`"
     * </pre>
     *
     * <code>optional string credit_type = 4;</code>
     *
     * @return The bytes for creditType.
     */
    public com.google.protobuf.ByteString getCreditTypeBytes() {
      java.lang.Object ref = creditType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        creditType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Type of installment payments.
     * Supported values are:
     *   * "`finance`"
     *   * "`lease`"
     * </pre>
     *
     * <code>optional string credit_type = 4;</code>
     *
     * @param value The creditType to set.
     * @return This builder for chaining.
     */
    public Builder setCreditType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      creditType_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Type of installment payments.
     * Supported values are:
     *   * "`finance`"
     *   * "`lease`"
     * </pre>
     *
     * <code>optional string credit_type = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCreditType() {
      creditType_ = getDefaultInstance().getCreditType();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Type of installment payments.
     * Supported values are:
     *   * "`finance`"
     *   * "`lease`"
     * </pre>
     *
     * <code>optional string credit_type = 4;</code>
     *
     * @param value The bytes for creditType to set.
     * @return This builder for chaining.
     */
    public Builder setCreditTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      creditType_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.shopping.merchant.products.v1beta.Installment)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.merchant.products.v1beta.Installment)
  private static final com.google.shopping.merchant.products.v1beta.Installment DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.shopping.merchant.products.v1beta.Installment();
  }

  public static com.google.shopping.merchant.products.v1beta.Installment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Installment> PARSER =
      new com.google.protobuf.AbstractParser<Installment>() {
        @java.lang.Override
        public Installment parsePartialFrom(
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

  public static com.google.protobuf.Parser<Installment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Installment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.merchant.products.v1beta.Installment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
