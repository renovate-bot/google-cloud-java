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
// source: google/maps/solar/v1/solar_service.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.solar.v1;

/**
 *
 *
 * <pre>
 * Cost and benefit of leasing a particular configuration of solar panels
 * with a particular electricity usage.
 * </pre>
 *
 * Protobuf type {@code google.maps.solar.v1.LeasingSavings}
 */
public final class LeasingSavings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.maps.solar.v1.LeasingSavings)
    LeasingSavingsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use LeasingSavings.newBuilder() to construct.
  private LeasingSavings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LeasingSavings() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LeasingSavings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.solar.v1.SolarServiceProto
        .internal_static_google_maps_solar_v1_LeasingSavings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.solar.v1.SolarServiceProto
        .internal_static_google_maps_solar_v1_LeasingSavings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.solar.v1.LeasingSavings.class,
            com.google.maps.solar.v1.LeasingSavings.Builder.class);
  }

  private int bitField0_;
  public static final int LEASES_ALLOWED_FIELD_NUMBER = 1;
  private boolean leasesAllowed_ = false;

  /**
   *
   *
   * <pre>
   * Whether leases are allowed in this juristiction (leases are not
   * allowed in some states). If this field is false, then the values in
   * this message should probably be ignored.
   * </pre>
   *
   * <code>bool leases_allowed = 1;</code>
   *
   * @return The leasesAllowed.
   */
  @java.lang.Override
  public boolean getLeasesAllowed() {
    return leasesAllowed_;
  }

  public static final int LEASES_SUPPORTED_FIELD_NUMBER = 2;
  private boolean leasesSupported_ = false;

  /**
   *
   *
   * <pre>
   * Whether leases are supported in this juristiction by the financial
   * calculation engine. If this field is false, then the values in this
   * message should probably be ignored. This is independent of
   * `leases_allowed`: in some areas leases are allowed, but under conditions
   * that aren't handled by the financial models.
   * </pre>
   *
   * <code>bool leases_supported = 2;</code>
   *
   * @return The leasesSupported.
   */
  @java.lang.Override
  public boolean getLeasesSupported() {
    return leasesSupported_;
  }

  public static final int ANNUAL_LEASING_COST_FIELD_NUMBER = 3;
  private com.google.type.Money annualLeasingCost_;

  /**
   *
   *
   * <pre>
   * Estimated annual leasing cost.
   * </pre>
   *
   * <code>.google.type.Money annual_leasing_cost = 3;</code>
   *
   * @return Whether the annualLeasingCost field is set.
   */
  @java.lang.Override
  public boolean hasAnnualLeasingCost() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Estimated annual leasing cost.
   * </pre>
   *
   * <code>.google.type.Money annual_leasing_cost = 3;</code>
   *
   * @return The annualLeasingCost.
   */
  @java.lang.Override
  public com.google.type.Money getAnnualLeasingCost() {
    return annualLeasingCost_ == null
        ? com.google.type.Money.getDefaultInstance()
        : annualLeasingCost_;
  }

  /**
   *
   *
   * <pre>
   * Estimated annual leasing cost.
   * </pre>
   *
   * <code>.google.type.Money annual_leasing_cost = 3;</code>
   */
  @java.lang.Override
  public com.google.type.MoneyOrBuilder getAnnualLeasingCostOrBuilder() {
    return annualLeasingCost_ == null
        ? com.google.type.Money.getDefaultInstance()
        : annualLeasingCost_;
  }

  public static final int SAVINGS_FIELD_NUMBER = 4;
  private com.google.maps.solar.v1.SavingsOverTime savings_;

  /**
   *
   *
   * <pre>
   * How much is saved (or not) over the lifetime period.
   * </pre>
   *
   * <code>.google.maps.solar.v1.SavingsOverTime savings = 4;</code>
   *
   * @return Whether the savings field is set.
   */
  @java.lang.Override
  public boolean hasSavings() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * How much is saved (or not) over the lifetime period.
   * </pre>
   *
   * <code>.google.maps.solar.v1.SavingsOverTime savings = 4;</code>
   *
   * @return The savings.
   */
  @java.lang.Override
  public com.google.maps.solar.v1.SavingsOverTime getSavings() {
    return savings_ == null
        ? com.google.maps.solar.v1.SavingsOverTime.getDefaultInstance()
        : savings_;
  }

  /**
   *
   *
   * <pre>
   * How much is saved (or not) over the lifetime period.
   * </pre>
   *
   * <code>.google.maps.solar.v1.SavingsOverTime savings = 4;</code>
   */
  @java.lang.Override
  public com.google.maps.solar.v1.SavingsOverTimeOrBuilder getSavingsOrBuilder() {
    return savings_ == null
        ? com.google.maps.solar.v1.SavingsOverTime.getDefaultInstance()
        : savings_;
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
    if (leasesAllowed_ != false) {
      output.writeBool(1, leasesAllowed_);
    }
    if (leasesSupported_ != false) {
      output.writeBool(2, leasesSupported_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getAnnualLeasingCost());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(4, getSavings());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (leasesAllowed_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, leasesAllowed_);
    }
    if (leasesSupported_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, leasesSupported_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getAnnualLeasingCost());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getSavings());
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
    if (!(obj instanceof com.google.maps.solar.v1.LeasingSavings)) {
      return super.equals(obj);
    }
    com.google.maps.solar.v1.LeasingSavings other = (com.google.maps.solar.v1.LeasingSavings) obj;

    if (getLeasesAllowed() != other.getLeasesAllowed()) return false;
    if (getLeasesSupported() != other.getLeasesSupported()) return false;
    if (hasAnnualLeasingCost() != other.hasAnnualLeasingCost()) return false;
    if (hasAnnualLeasingCost()) {
      if (!getAnnualLeasingCost().equals(other.getAnnualLeasingCost())) return false;
    }
    if (hasSavings() != other.hasSavings()) return false;
    if (hasSavings()) {
      if (!getSavings().equals(other.getSavings())) return false;
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
    hash = (37 * hash) + LEASES_ALLOWED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getLeasesAllowed());
    hash = (37 * hash) + LEASES_SUPPORTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getLeasesSupported());
    if (hasAnnualLeasingCost()) {
      hash = (37 * hash) + ANNUAL_LEASING_COST_FIELD_NUMBER;
      hash = (53 * hash) + getAnnualLeasingCost().hashCode();
    }
    if (hasSavings()) {
      hash = (37 * hash) + SAVINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSavings().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.solar.v1.LeasingSavings parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.solar.v1.LeasingSavings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.solar.v1.LeasingSavings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.solar.v1.LeasingSavings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.solar.v1.LeasingSavings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.solar.v1.LeasingSavings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.solar.v1.LeasingSavings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.solar.v1.LeasingSavings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.solar.v1.LeasingSavings parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.solar.v1.LeasingSavings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.solar.v1.LeasingSavings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.solar.v1.LeasingSavings parseFrom(
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

  public static Builder newBuilder(com.google.maps.solar.v1.LeasingSavings prototype) {
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
   * Cost and benefit of leasing a particular configuration of solar panels
   * with a particular electricity usage.
   * </pre>
   *
   * Protobuf type {@code google.maps.solar.v1.LeasingSavings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.maps.solar.v1.LeasingSavings)
      com.google.maps.solar.v1.LeasingSavingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.solar.v1.SolarServiceProto
          .internal_static_google_maps_solar_v1_LeasingSavings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.solar.v1.SolarServiceProto
          .internal_static_google_maps_solar_v1_LeasingSavings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.solar.v1.LeasingSavings.class,
              com.google.maps.solar.v1.LeasingSavings.Builder.class);
    }

    // Construct using com.google.maps.solar.v1.LeasingSavings.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAnnualLeasingCostFieldBuilder();
        getSavingsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      leasesAllowed_ = false;
      leasesSupported_ = false;
      annualLeasingCost_ = null;
      if (annualLeasingCostBuilder_ != null) {
        annualLeasingCostBuilder_.dispose();
        annualLeasingCostBuilder_ = null;
      }
      savings_ = null;
      if (savingsBuilder_ != null) {
        savingsBuilder_.dispose();
        savingsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.solar.v1.SolarServiceProto
          .internal_static_google_maps_solar_v1_LeasingSavings_descriptor;
    }

    @java.lang.Override
    public com.google.maps.solar.v1.LeasingSavings getDefaultInstanceForType() {
      return com.google.maps.solar.v1.LeasingSavings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.solar.v1.LeasingSavings build() {
      com.google.maps.solar.v1.LeasingSavings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.solar.v1.LeasingSavings buildPartial() {
      com.google.maps.solar.v1.LeasingSavings result =
          new com.google.maps.solar.v1.LeasingSavings(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.maps.solar.v1.LeasingSavings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.leasesAllowed_ = leasesAllowed_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.leasesSupported_ = leasesSupported_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.annualLeasingCost_ =
            annualLeasingCostBuilder_ == null
                ? annualLeasingCost_
                : annualLeasingCostBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.savings_ = savingsBuilder_ == null ? savings_ : savingsBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.maps.solar.v1.LeasingSavings) {
        return mergeFrom((com.google.maps.solar.v1.LeasingSavings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.solar.v1.LeasingSavings other) {
      if (other == com.google.maps.solar.v1.LeasingSavings.getDefaultInstance()) return this;
      if (other.getLeasesAllowed() != false) {
        setLeasesAllowed(other.getLeasesAllowed());
      }
      if (other.getLeasesSupported() != false) {
        setLeasesSupported(other.getLeasesSupported());
      }
      if (other.hasAnnualLeasingCost()) {
        mergeAnnualLeasingCost(other.getAnnualLeasingCost());
      }
      if (other.hasSavings()) {
        mergeSavings(other.getSavings());
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
                leasesAllowed_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                leasesSupported_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                input.readMessage(
                    getAnnualLeasingCostFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 34:
              {
                input.readMessage(getSavingsFieldBuilder().getBuilder(), extensionRegistry);
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

    private boolean leasesAllowed_;

    /**
     *
     *
     * <pre>
     * Whether leases are allowed in this juristiction (leases are not
     * allowed in some states). If this field is false, then the values in
     * this message should probably be ignored.
     * </pre>
     *
     * <code>bool leases_allowed = 1;</code>
     *
     * @return The leasesAllowed.
     */
    @java.lang.Override
    public boolean getLeasesAllowed() {
      return leasesAllowed_;
    }

    /**
     *
     *
     * <pre>
     * Whether leases are allowed in this juristiction (leases are not
     * allowed in some states). If this field is false, then the values in
     * this message should probably be ignored.
     * </pre>
     *
     * <code>bool leases_allowed = 1;</code>
     *
     * @param value The leasesAllowed to set.
     * @return This builder for chaining.
     */
    public Builder setLeasesAllowed(boolean value) {

      leasesAllowed_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Whether leases are allowed in this juristiction (leases are not
     * allowed in some states). If this field is false, then the values in
     * this message should probably be ignored.
     * </pre>
     *
     * <code>bool leases_allowed = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLeasesAllowed() {
      bitField0_ = (bitField0_ & ~0x00000001);
      leasesAllowed_ = false;
      onChanged();
      return this;
    }

    private boolean leasesSupported_;

    /**
     *
     *
     * <pre>
     * Whether leases are supported in this juristiction by the financial
     * calculation engine. If this field is false, then the values in this
     * message should probably be ignored. This is independent of
     * `leases_allowed`: in some areas leases are allowed, but under conditions
     * that aren't handled by the financial models.
     * </pre>
     *
     * <code>bool leases_supported = 2;</code>
     *
     * @return The leasesSupported.
     */
    @java.lang.Override
    public boolean getLeasesSupported() {
      return leasesSupported_;
    }

    /**
     *
     *
     * <pre>
     * Whether leases are supported in this juristiction by the financial
     * calculation engine. If this field is false, then the values in this
     * message should probably be ignored. This is independent of
     * `leases_allowed`: in some areas leases are allowed, but under conditions
     * that aren't handled by the financial models.
     * </pre>
     *
     * <code>bool leases_supported = 2;</code>
     *
     * @param value The leasesSupported to set.
     * @return This builder for chaining.
     */
    public Builder setLeasesSupported(boolean value) {

      leasesSupported_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Whether leases are supported in this juristiction by the financial
     * calculation engine. If this field is false, then the values in this
     * message should probably be ignored. This is independent of
     * `leases_allowed`: in some areas leases are allowed, but under conditions
     * that aren't handled by the financial models.
     * </pre>
     *
     * <code>bool leases_supported = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLeasesSupported() {
      bitField0_ = (bitField0_ & ~0x00000002);
      leasesSupported_ = false;
      onChanged();
      return this;
    }

    private com.google.type.Money annualLeasingCost_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Money, com.google.type.Money.Builder, com.google.type.MoneyOrBuilder>
        annualLeasingCostBuilder_;

    /**
     *
     *
     * <pre>
     * Estimated annual leasing cost.
     * </pre>
     *
     * <code>.google.type.Money annual_leasing_cost = 3;</code>
     *
     * @return Whether the annualLeasingCost field is set.
     */
    public boolean hasAnnualLeasingCost() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Estimated annual leasing cost.
     * </pre>
     *
     * <code>.google.type.Money annual_leasing_cost = 3;</code>
     *
     * @return The annualLeasingCost.
     */
    public com.google.type.Money getAnnualLeasingCost() {
      if (annualLeasingCostBuilder_ == null) {
        return annualLeasingCost_ == null
            ? com.google.type.Money.getDefaultInstance()
            : annualLeasingCost_;
      } else {
        return annualLeasingCostBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Estimated annual leasing cost.
     * </pre>
     *
     * <code>.google.type.Money annual_leasing_cost = 3;</code>
     */
    public Builder setAnnualLeasingCost(com.google.type.Money value) {
      if (annualLeasingCostBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        annualLeasingCost_ = value;
      } else {
        annualLeasingCostBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Estimated annual leasing cost.
     * </pre>
     *
     * <code>.google.type.Money annual_leasing_cost = 3;</code>
     */
    public Builder setAnnualLeasingCost(com.google.type.Money.Builder builderForValue) {
      if (annualLeasingCostBuilder_ == null) {
        annualLeasingCost_ = builderForValue.build();
      } else {
        annualLeasingCostBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Estimated annual leasing cost.
     * </pre>
     *
     * <code>.google.type.Money annual_leasing_cost = 3;</code>
     */
    public Builder mergeAnnualLeasingCost(com.google.type.Money value) {
      if (annualLeasingCostBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && annualLeasingCost_ != null
            && annualLeasingCost_ != com.google.type.Money.getDefaultInstance()) {
          getAnnualLeasingCostBuilder().mergeFrom(value);
        } else {
          annualLeasingCost_ = value;
        }
      } else {
        annualLeasingCostBuilder_.mergeFrom(value);
      }
      if (annualLeasingCost_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Estimated annual leasing cost.
     * </pre>
     *
     * <code>.google.type.Money annual_leasing_cost = 3;</code>
     */
    public Builder clearAnnualLeasingCost() {
      bitField0_ = (bitField0_ & ~0x00000004);
      annualLeasingCost_ = null;
      if (annualLeasingCostBuilder_ != null) {
        annualLeasingCostBuilder_.dispose();
        annualLeasingCostBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Estimated annual leasing cost.
     * </pre>
     *
     * <code>.google.type.Money annual_leasing_cost = 3;</code>
     */
    public com.google.type.Money.Builder getAnnualLeasingCostBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAnnualLeasingCostFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Estimated annual leasing cost.
     * </pre>
     *
     * <code>.google.type.Money annual_leasing_cost = 3;</code>
     */
    public com.google.type.MoneyOrBuilder getAnnualLeasingCostOrBuilder() {
      if (annualLeasingCostBuilder_ != null) {
        return annualLeasingCostBuilder_.getMessageOrBuilder();
      } else {
        return annualLeasingCost_ == null
            ? com.google.type.Money.getDefaultInstance()
            : annualLeasingCost_;
      }
    }

    /**
     *
     *
     * <pre>
     * Estimated annual leasing cost.
     * </pre>
     *
     * <code>.google.type.Money annual_leasing_cost = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Money, com.google.type.Money.Builder, com.google.type.MoneyOrBuilder>
        getAnnualLeasingCostFieldBuilder() {
      if (annualLeasingCostBuilder_ == null) {
        annualLeasingCostBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.Money,
                com.google.type.Money.Builder,
                com.google.type.MoneyOrBuilder>(
                getAnnualLeasingCost(), getParentForChildren(), isClean());
        annualLeasingCost_ = null;
      }
      return annualLeasingCostBuilder_;
    }

    private com.google.maps.solar.v1.SavingsOverTime savings_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.maps.solar.v1.SavingsOverTime,
            com.google.maps.solar.v1.SavingsOverTime.Builder,
            com.google.maps.solar.v1.SavingsOverTimeOrBuilder>
        savingsBuilder_;

    /**
     *
     *
     * <pre>
     * How much is saved (or not) over the lifetime period.
     * </pre>
     *
     * <code>.google.maps.solar.v1.SavingsOverTime savings = 4;</code>
     *
     * @return Whether the savings field is set.
     */
    public boolean hasSavings() {
      return ((bitField0_ & 0x00000008) != 0);
    }

    /**
     *
     *
     * <pre>
     * How much is saved (or not) over the lifetime period.
     * </pre>
     *
     * <code>.google.maps.solar.v1.SavingsOverTime savings = 4;</code>
     *
     * @return The savings.
     */
    public com.google.maps.solar.v1.SavingsOverTime getSavings() {
      if (savingsBuilder_ == null) {
        return savings_ == null
            ? com.google.maps.solar.v1.SavingsOverTime.getDefaultInstance()
            : savings_;
      } else {
        return savingsBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * How much is saved (or not) over the lifetime period.
     * </pre>
     *
     * <code>.google.maps.solar.v1.SavingsOverTime savings = 4;</code>
     */
    public Builder setSavings(com.google.maps.solar.v1.SavingsOverTime value) {
      if (savingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        savings_ = value;
      } else {
        savingsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * How much is saved (or not) over the lifetime period.
     * </pre>
     *
     * <code>.google.maps.solar.v1.SavingsOverTime savings = 4;</code>
     */
    public Builder setSavings(com.google.maps.solar.v1.SavingsOverTime.Builder builderForValue) {
      if (savingsBuilder_ == null) {
        savings_ = builderForValue.build();
      } else {
        savingsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * How much is saved (or not) over the lifetime period.
     * </pre>
     *
     * <code>.google.maps.solar.v1.SavingsOverTime savings = 4;</code>
     */
    public Builder mergeSavings(com.google.maps.solar.v1.SavingsOverTime value) {
      if (savingsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)
            && savings_ != null
            && savings_ != com.google.maps.solar.v1.SavingsOverTime.getDefaultInstance()) {
          getSavingsBuilder().mergeFrom(value);
        } else {
          savings_ = value;
        }
      } else {
        savingsBuilder_.mergeFrom(value);
      }
      if (savings_ != null) {
        bitField0_ |= 0x00000008;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * How much is saved (or not) over the lifetime period.
     * </pre>
     *
     * <code>.google.maps.solar.v1.SavingsOverTime savings = 4;</code>
     */
    public Builder clearSavings() {
      bitField0_ = (bitField0_ & ~0x00000008);
      savings_ = null;
      if (savingsBuilder_ != null) {
        savingsBuilder_.dispose();
        savingsBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * How much is saved (or not) over the lifetime period.
     * </pre>
     *
     * <code>.google.maps.solar.v1.SavingsOverTime savings = 4;</code>
     */
    public com.google.maps.solar.v1.SavingsOverTime.Builder getSavingsBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getSavingsFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * How much is saved (or not) over the lifetime period.
     * </pre>
     *
     * <code>.google.maps.solar.v1.SavingsOverTime savings = 4;</code>
     */
    public com.google.maps.solar.v1.SavingsOverTimeOrBuilder getSavingsOrBuilder() {
      if (savingsBuilder_ != null) {
        return savingsBuilder_.getMessageOrBuilder();
      } else {
        return savings_ == null
            ? com.google.maps.solar.v1.SavingsOverTime.getDefaultInstance()
            : savings_;
      }
    }

    /**
     *
     *
     * <pre>
     * How much is saved (or not) over the lifetime period.
     * </pre>
     *
     * <code>.google.maps.solar.v1.SavingsOverTime savings = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.maps.solar.v1.SavingsOverTime,
            com.google.maps.solar.v1.SavingsOverTime.Builder,
            com.google.maps.solar.v1.SavingsOverTimeOrBuilder>
        getSavingsFieldBuilder() {
      if (savingsBuilder_ == null) {
        savingsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.maps.solar.v1.SavingsOverTime,
                com.google.maps.solar.v1.SavingsOverTime.Builder,
                com.google.maps.solar.v1.SavingsOverTimeOrBuilder>(
                getSavings(), getParentForChildren(), isClean());
        savings_ = null;
      }
      return savingsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.maps.solar.v1.LeasingSavings)
  }

  // @@protoc_insertion_point(class_scope:google.maps.solar.v1.LeasingSavings)
  private static final com.google.maps.solar.v1.LeasingSavings DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.solar.v1.LeasingSavings();
  }

  public static com.google.maps.solar.v1.LeasingSavings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LeasingSavings> PARSER =
      new com.google.protobuf.AbstractParser<LeasingSavings>() {
        @java.lang.Override
        public LeasingSavings parsePartialFrom(
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

  public static com.google.protobuf.Parser<LeasingSavings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LeasingSavings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.solar.v1.LeasingSavings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
