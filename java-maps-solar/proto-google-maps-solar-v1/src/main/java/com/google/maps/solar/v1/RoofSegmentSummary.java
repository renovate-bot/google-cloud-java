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
 * Information about a roof segment on the building, with some number of
 * panels placed on it.
 * </pre>
 *
 * Protobuf type {@code google.maps.solar.v1.RoofSegmentSummary}
 */
public final class RoofSegmentSummary extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.maps.solar.v1.RoofSegmentSummary)
    RoofSegmentSummaryOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use RoofSegmentSummary.newBuilder() to construct.
  private RoofSegmentSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RoofSegmentSummary() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RoofSegmentSummary();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.solar.v1.SolarServiceProto
        .internal_static_google_maps_solar_v1_RoofSegmentSummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.solar.v1.SolarServiceProto
        .internal_static_google_maps_solar_v1_RoofSegmentSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.solar.v1.RoofSegmentSummary.class,
            com.google.maps.solar.v1.RoofSegmentSummary.Builder.class);
  }

  private int bitField0_;
  public static final int PITCH_DEGREES_FIELD_NUMBER = 2;
  private float pitchDegrees_ = 0F;

  /**
   *
   *
   * <pre>
   * Angle of the roof segment relative to the theoretical ground plane.
   * 0 = parallel to the ground, 90 = perpendicular to the ground.
   * </pre>
   *
   * <code>optional float pitch_degrees = 2;</code>
   *
   * @return Whether the pitchDegrees field is set.
   */
  @java.lang.Override
  public boolean hasPitchDegrees() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Angle of the roof segment relative to the theoretical ground plane.
   * 0 = parallel to the ground, 90 = perpendicular to the ground.
   * </pre>
   *
   * <code>optional float pitch_degrees = 2;</code>
   *
   * @return The pitchDegrees.
   */
  @java.lang.Override
  public float getPitchDegrees() {
    return pitchDegrees_;
  }

  public static final int AZIMUTH_DEGREES_FIELD_NUMBER = 3;
  private float azimuthDegrees_ = 0F;

  /**
   *
   *
   * <pre>
   * Compass direction the roof segment is pointing in. 0 = North, 90 =
   * East, 180 = South. For a "flat" roof segment (`pitch_degrees` very
   * near 0), azimuth is not well defined, so for consistency, we define it
   * arbitrarily to be 0 (North).
   * </pre>
   *
   * <code>optional float azimuth_degrees = 3;</code>
   *
   * @return Whether the azimuthDegrees field is set.
   */
  @java.lang.Override
  public boolean hasAzimuthDegrees() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Compass direction the roof segment is pointing in. 0 = North, 90 =
   * East, 180 = South. For a "flat" roof segment (`pitch_degrees` very
   * near 0), azimuth is not well defined, so for consistency, we define it
   * arbitrarily to be 0 (North).
   * </pre>
   *
   * <code>optional float azimuth_degrees = 3;</code>
   *
   * @return The azimuthDegrees.
   */
  @java.lang.Override
  public float getAzimuthDegrees() {
    return azimuthDegrees_;
  }

  public static final int PANELS_COUNT_FIELD_NUMBER = 7;
  private int panelsCount_ = 0;

  /**
   *
   *
   * <pre>
   * The total number of panels on this segment.
   * </pre>
   *
   * <code>int32 panels_count = 7;</code>
   *
   * @return The panelsCount.
   */
  @java.lang.Override
  public int getPanelsCount() {
    return panelsCount_;
  }

  public static final int YEARLY_ENERGY_DC_KWH_FIELD_NUMBER = 8;
  private float yearlyEnergyDcKwh_ = 0F;

  /**
   *
   *
   * <pre>
   * How much sunlight energy this part of the layout captures over the
   * course of a year, in DC kWh, assuming the panels described above.
   * </pre>
   *
   * <code>float yearly_energy_dc_kwh = 8;</code>
   *
   * @return The yearlyEnergyDcKwh.
   */
  @java.lang.Override
  public float getYearlyEnergyDcKwh() {
    return yearlyEnergyDcKwh_;
  }

  public static final int SEGMENT_INDEX_FIELD_NUMBER = 9;
  private int segmentIndex_ = 0;

  /**
   *
   *
   * <pre>
   * Index in [roof_segment_stats]
   * [google.maps.solar.v1.SolarPotential.roof_segment_stats]
   * of the corresponding `RoofSegmentSizeAndSunshineStats`.
   * </pre>
   *
   * <code>optional int32 segment_index = 9;</code>
   *
   * @return Whether the segmentIndex field is set.
   */
  @java.lang.Override
  public boolean hasSegmentIndex() {
    return ((bitField0_ & 0x00000004) != 0);
  }

  /**
   *
   *
   * <pre>
   * Index in [roof_segment_stats]
   * [google.maps.solar.v1.SolarPotential.roof_segment_stats]
   * of the corresponding `RoofSegmentSizeAndSunshineStats`.
   * </pre>
   *
   * <code>optional int32 segment_index = 9;</code>
   *
   * @return The segmentIndex.
   */
  @java.lang.Override
  public int getSegmentIndex() {
    return segmentIndex_;
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
      output.writeFloat(2, pitchDegrees_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeFloat(3, azimuthDegrees_);
    }
    if (panelsCount_ != 0) {
      output.writeInt32(7, panelsCount_);
    }
    if (java.lang.Float.floatToRawIntBits(yearlyEnergyDcKwh_) != 0) {
      output.writeFloat(8, yearlyEnergyDcKwh_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(9, segmentIndex_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, pitchDegrees_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(3, azimuthDegrees_);
    }
    if (panelsCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(7, panelsCount_);
    }
    if (java.lang.Float.floatToRawIntBits(yearlyEnergyDcKwh_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(8, yearlyEnergyDcKwh_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(9, segmentIndex_);
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
    if (!(obj instanceof com.google.maps.solar.v1.RoofSegmentSummary)) {
      return super.equals(obj);
    }
    com.google.maps.solar.v1.RoofSegmentSummary other =
        (com.google.maps.solar.v1.RoofSegmentSummary) obj;

    if (hasPitchDegrees() != other.hasPitchDegrees()) return false;
    if (hasPitchDegrees()) {
      if (java.lang.Float.floatToIntBits(getPitchDegrees())
          != java.lang.Float.floatToIntBits(other.getPitchDegrees())) return false;
    }
    if (hasAzimuthDegrees() != other.hasAzimuthDegrees()) return false;
    if (hasAzimuthDegrees()) {
      if (java.lang.Float.floatToIntBits(getAzimuthDegrees())
          != java.lang.Float.floatToIntBits(other.getAzimuthDegrees())) return false;
    }
    if (getPanelsCount() != other.getPanelsCount()) return false;
    if (java.lang.Float.floatToIntBits(getYearlyEnergyDcKwh())
        != java.lang.Float.floatToIntBits(other.getYearlyEnergyDcKwh())) return false;
    if (hasSegmentIndex() != other.hasSegmentIndex()) return false;
    if (hasSegmentIndex()) {
      if (getSegmentIndex() != other.getSegmentIndex()) return false;
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
    if (hasPitchDegrees()) {
      hash = (37 * hash) + PITCH_DEGREES_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(getPitchDegrees());
    }
    if (hasAzimuthDegrees()) {
      hash = (37 * hash) + AZIMUTH_DEGREES_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(getAzimuthDegrees());
    }
    hash = (37 * hash) + PANELS_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getPanelsCount();
    hash = (37 * hash) + YEARLY_ENERGY_DC_KWH_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getYearlyEnergyDcKwh());
    if (hasSegmentIndex()) {
      hash = (37 * hash) + SEGMENT_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getSegmentIndex();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.solar.v1.RoofSegmentSummary parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.solar.v1.RoofSegmentSummary parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.solar.v1.RoofSegmentSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.solar.v1.RoofSegmentSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.solar.v1.RoofSegmentSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.solar.v1.RoofSegmentSummary parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.solar.v1.RoofSegmentSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.solar.v1.RoofSegmentSummary parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.solar.v1.RoofSegmentSummary parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.solar.v1.RoofSegmentSummary parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.solar.v1.RoofSegmentSummary parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.solar.v1.RoofSegmentSummary parseFrom(
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

  public static Builder newBuilder(com.google.maps.solar.v1.RoofSegmentSummary prototype) {
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
   * Information about a roof segment on the building, with some number of
   * panels placed on it.
   * </pre>
   *
   * Protobuf type {@code google.maps.solar.v1.RoofSegmentSummary}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.maps.solar.v1.RoofSegmentSummary)
      com.google.maps.solar.v1.RoofSegmentSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.solar.v1.SolarServiceProto
          .internal_static_google_maps_solar_v1_RoofSegmentSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.solar.v1.SolarServiceProto
          .internal_static_google_maps_solar_v1_RoofSegmentSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.solar.v1.RoofSegmentSummary.class,
              com.google.maps.solar.v1.RoofSegmentSummary.Builder.class);
    }

    // Construct using com.google.maps.solar.v1.RoofSegmentSummary.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      pitchDegrees_ = 0F;
      azimuthDegrees_ = 0F;
      panelsCount_ = 0;
      yearlyEnergyDcKwh_ = 0F;
      segmentIndex_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.solar.v1.SolarServiceProto
          .internal_static_google_maps_solar_v1_RoofSegmentSummary_descriptor;
    }

    @java.lang.Override
    public com.google.maps.solar.v1.RoofSegmentSummary getDefaultInstanceForType() {
      return com.google.maps.solar.v1.RoofSegmentSummary.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.solar.v1.RoofSegmentSummary build() {
      com.google.maps.solar.v1.RoofSegmentSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.solar.v1.RoofSegmentSummary buildPartial() {
      com.google.maps.solar.v1.RoofSegmentSummary result =
          new com.google.maps.solar.v1.RoofSegmentSummary(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.maps.solar.v1.RoofSegmentSummary result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pitchDegrees_ = pitchDegrees_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.azimuthDegrees_ = azimuthDegrees_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.panelsCount_ = panelsCount_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.yearlyEnergyDcKwh_ = yearlyEnergyDcKwh_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.segmentIndex_ = segmentIndex_;
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
      if (other instanceof com.google.maps.solar.v1.RoofSegmentSummary) {
        return mergeFrom((com.google.maps.solar.v1.RoofSegmentSummary) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.solar.v1.RoofSegmentSummary other) {
      if (other == com.google.maps.solar.v1.RoofSegmentSummary.getDefaultInstance()) return this;
      if (other.hasPitchDegrees()) {
        setPitchDegrees(other.getPitchDegrees());
      }
      if (other.hasAzimuthDegrees()) {
        setAzimuthDegrees(other.getAzimuthDegrees());
      }
      if (other.getPanelsCount() != 0) {
        setPanelsCount(other.getPanelsCount());
      }
      if (other.getYearlyEnergyDcKwh() != 0F) {
        setYearlyEnergyDcKwh(other.getYearlyEnergyDcKwh());
      }
      if (other.hasSegmentIndex()) {
        setSegmentIndex(other.getSegmentIndex());
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
            case 21:
              {
                pitchDegrees_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 21
            case 29:
              {
                azimuthDegrees_ = input.readFloat();
                bitField0_ |= 0x00000002;
                break;
              } // case 29
            case 56:
              {
                panelsCount_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 56
            case 69:
              {
                yearlyEnergyDcKwh_ = input.readFloat();
                bitField0_ |= 0x00000008;
                break;
              } // case 69
            case 72:
              {
                segmentIndex_ = input.readInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 72
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

    private float pitchDegrees_;

    /**
     *
     *
     * <pre>
     * Angle of the roof segment relative to the theoretical ground plane.
     * 0 = parallel to the ground, 90 = perpendicular to the ground.
     * </pre>
     *
     * <code>optional float pitch_degrees = 2;</code>
     *
     * @return Whether the pitchDegrees field is set.
     */
    @java.lang.Override
    public boolean hasPitchDegrees() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Angle of the roof segment relative to the theoretical ground plane.
     * 0 = parallel to the ground, 90 = perpendicular to the ground.
     * </pre>
     *
     * <code>optional float pitch_degrees = 2;</code>
     *
     * @return The pitchDegrees.
     */
    @java.lang.Override
    public float getPitchDegrees() {
      return pitchDegrees_;
    }

    /**
     *
     *
     * <pre>
     * Angle of the roof segment relative to the theoretical ground plane.
     * 0 = parallel to the ground, 90 = perpendicular to the ground.
     * </pre>
     *
     * <code>optional float pitch_degrees = 2;</code>
     *
     * @param value The pitchDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setPitchDegrees(float value) {

      pitchDegrees_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Angle of the roof segment relative to the theoretical ground plane.
     * 0 = parallel to the ground, 90 = perpendicular to the ground.
     * </pre>
     *
     * <code>optional float pitch_degrees = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPitchDegrees() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pitchDegrees_ = 0F;
      onChanged();
      return this;
    }

    private float azimuthDegrees_;

    /**
     *
     *
     * <pre>
     * Compass direction the roof segment is pointing in. 0 = North, 90 =
     * East, 180 = South. For a "flat" roof segment (`pitch_degrees` very
     * near 0), azimuth is not well defined, so for consistency, we define it
     * arbitrarily to be 0 (North).
     * </pre>
     *
     * <code>optional float azimuth_degrees = 3;</code>
     *
     * @return Whether the azimuthDegrees field is set.
     */
    @java.lang.Override
    public boolean hasAzimuthDegrees() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Compass direction the roof segment is pointing in. 0 = North, 90 =
     * East, 180 = South. For a "flat" roof segment (`pitch_degrees` very
     * near 0), azimuth is not well defined, so for consistency, we define it
     * arbitrarily to be 0 (North).
     * </pre>
     *
     * <code>optional float azimuth_degrees = 3;</code>
     *
     * @return The azimuthDegrees.
     */
    @java.lang.Override
    public float getAzimuthDegrees() {
      return azimuthDegrees_;
    }

    /**
     *
     *
     * <pre>
     * Compass direction the roof segment is pointing in. 0 = North, 90 =
     * East, 180 = South. For a "flat" roof segment (`pitch_degrees` very
     * near 0), azimuth is not well defined, so for consistency, we define it
     * arbitrarily to be 0 (North).
     * </pre>
     *
     * <code>optional float azimuth_degrees = 3;</code>
     *
     * @param value The azimuthDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setAzimuthDegrees(float value) {

      azimuthDegrees_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Compass direction the roof segment is pointing in. 0 = North, 90 =
     * East, 180 = South. For a "flat" roof segment (`pitch_degrees` very
     * near 0), azimuth is not well defined, so for consistency, we define it
     * arbitrarily to be 0 (North).
     * </pre>
     *
     * <code>optional float azimuth_degrees = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAzimuthDegrees() {
      bitField0_ = (bitField0_ & ~0x00000002);
      azimuthDegrees_ = 0F;
      onChanged();
      return this;
    }

    private int panelsCount_;

    /**
     *
     *
     * <pre>
     * The total number of panels on this segment.
     * </pre>
     *
     * <code>int32 panels_count = 7;</code>
     *
     * @return The panelsCount.
     */
    @java.lang.Override
    public int getPanelsCount() {
      return panelsCount_;
    }

    /**
     *
     *
     * <pre>
     * The total number of panels on this segment.
     * </pre>
     *
     * <code>int32 panels_count = 7;</code>
     *
     * @param value The panelsCount to set.
     * @return This builder for chaining.
     */
    public Builder setPanelsCount(int value) {

      panelsCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The total number of panels on this segment.
     * </pre>
     *
     * <code>int32 panels_count = 7;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPanelsCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      panelsCount_ = 0;
      onChanged();
      return this;
    }

    private float yearlyEnergyDcKwh_;

    /**
     *
     *
     * <pre>
     * How much sunlight energy this part of the layout captures over the
     * course of a year, in DC kWh, assuming the panels described above.
     * </pre>
     *
     * <code>float yearly_energy_dc_kwh = 8;</code>
     *
     * @return The yearlyEnergyDcKwh.
     */
    @java.lang.Override
    public float getYearlyEnergyDcKwh() {
      return yearlyEnergyDcKwh_;
    }

    /**
     *
     *
     * <pre>
     * How much sunlight energy this part of the layout captures over the
     * course of a year, in DC kWh, assuming the panels described above.
     * </pre>
     *
     * <code>float yearly_energy_dc_kwh = 8;</code>
     *
     * @param value The yearlyEnergyDcKwh to set.
     * @return This builder for chaining.
     */
    public Builder setYearlyEnergyDcKwh(float value) {

      yearlyEnergyDcKwh_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * How much sunlight energy this part of the layout captures over the
     * course of a year, in DC kWh, assuming the panels described above.
     * </pre>
     *
     * <code>float yearly_energy_dc_kwh = 8;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearYearlyEnergyDcKwh() {
      bitField0_ = (bitField0_ & ~0x00000008);
      yearlyEnergyDcKwh_ = 0F;
      onChanged();
      return this;
    }

    private int segmentIndex_;

    /**
     *
     *
     * <pre>
     * Index in [roof_segment_stats]
     * [google.maps.solar.v1.SolarPotential.roof_segment_stats]
     * of the corresponding `RoofSegmentSizeAndSunshineStats`.
     * </pre>
     *
     * <code>optional int32 segment_index = 9;</code>
     *
     * @return Whether the segmentIndex field is set.
     */
    @java.lang.Override
    public boolean hasSegmentIndex() {
      return ((bitField0_ & 0x00000010) != 0);
    }

    /**
     *
     *
     * <pre>
     * Index in [roof_segment_stats]
     * [google.maps.solar.v1.SolarPotential.roof_segment_stats]
     * of the corresponding `RoofSegmentSizeAndSunshineStats`.
     * </pre>
     *
     * <code>optional int32 segment_index = 9;</code>
     *
     * @return The segmentIndex.
     */
    @java.lang.Override
    public int getSegmentIndex() {
      return segmentIndex_;
    }

    /**
     *
     *
     * <pre>
     * Index in [roof_segment_stats]
     * [google.maps.solar.v1.SolarPotential.roof_segment_stats]
     * of the corresponding `RoofSegmentSizeAndSunshineStats`.
     * </pre>
     *
     * <code>optional int32 segment_index = 9;</code>
     *
     * @param value The segmentIndex to set.
     * @return This builder for chaining.
     */
    public Builder setSegmentIndex(int value) {

      segmentIndex_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Index in [roof_segment_stats]
     * [google.maps.solar.v1.SolarPotential.roof_segment_stats]
     * of the corresponding `RoofSegmentSizeAndSunshineStats`.
     * </pre>
     *
     * <code>optional int32 segment_index = 9;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSegmentIndex() {
      bitField0_ = (bitField0_ & ~0x00000010);
      segmentIndex_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.maps.solar.v1.RoofSegmentSummary)
  }

  // @@protoc_insertion_point(class_scope:google.maps.solar.v1.RoofSegmentSummary)
  private static final com.google.maps.solar.v1.RoofSegmentSummary DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.solar.v1.RoofSegmentSummary();
  }

  public static com.google.maps.solar.v1.RoofSegmentSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RoofSegmentSummary> PARSER =
      new com.google.protobuf.AbstractParser<RoofSegmentSummary>() {
        @java.lang.Override
        public RoofSegmentSummary parsePartialFrom(
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

  public static com.google.protobuf.Parser<RoofSegmentSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RoofSegmentSummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.solar.v1.RoofSegmentSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
