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
// source: google/cloud/retail/v2/common.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2;

/**
 *
 *
 * <pre>
 * The rating of a [Product][google.cloud.retail.v2.Product].
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2.Rating}
 */
public final class Rating extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2.Rating)
    RatingOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Rating.newBuilder() to construct.
  private Rating(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Rating() {
    ratingHistogram_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Rating();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2.CommonProto
        .internal_static_google_cloud_retail_v2_Rating_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2.CommonProto
        .internal_static_google_cloud_retail_v2_Rating_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2.Rating.class,
            com.google.cloud.retail.v2.Rating.Builder.class);
  }

  public static final int RATING_COUNT_FIELD_NUMBER = 1;
  private int ratingCount_ = 0;

  /**
   *
   *
   * <pre>
   * The total number of ratings. This value is independent of the value of
   * [rating_histogram][google.cloud.retail.v2.Rating.rating_histogram].
   *
   * This value must be nonnegative. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * </pre>
   *
   * <code>int32 rating_count = 1;</code>
   *
   * @return The ratingCount.
   */
  @java.lang.Override
  public int getRatingCount() {
    return ratingCount_;
  }

  public static final int AVERAGE_RATING_FIELD_NUMBER = 2;
  private float averageRating_ = 0F;

  /**
   *
   *
   * <pre>
   * The average rating of the [Product][google.cloud.retail.v2.Product].
   *
   * The rating is scaled at 1-5. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * </pre>
   *
   * <code>float average_rating = 2;</code>
   *
   * @return The averageRating.
   */
  @java.lang.Override
  public float getAverageRating() {
    return averageRating_;
  }

  public static final int RATING_HISTOGRAM_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList ratingHistogram_ = emptyIntList();

  /**
   *
   *
   * <pre>
   * List of rating counts per rating value (index = rating - 1). The list is
   * empty if there is no rating. If the list is non-empty, its size is
   * always 5. Otherwise, an INVALID_ARGUMENT error is returned.
   *
   * For example, [41, 14, 13, 47, 303]. It means that the
   * [Product][google.cloud.retail.v2.Product] got 41 ratings with 1 star, 14
   * ratings with 2 star, and so on.
   * </pre>
   *
   * <code>repeated int32 rating_histogram = 3;</code>
   *
   * @return A list containing the ratingHistogram.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer> getRatingHistogramList() {
    return ratingHistogram_;
  }

  /**
   *
   *
   * <pre>
   * List of rating counts per rating value (index = rating - 1). The list is
   * empty if there is no rating. If the list is non-empty, its size is
   * always 5. Otherwise, an INVALID_ARGUMENT error is returned.
   *
   * For example, [41, 14, 13, 47, 303]. It means that the
   * [Product][google.cloud.retail.v2.Product] got 41 ratings with 1 star, 14
   * ratings with 2 star, and so on.
   * </pre>
   *
   * <code>repeated int32 rating_histogram = 3;</code>
   *
   * @return The count of ratingHistogram.
   */
  public int getRatingHistogramCount() {
    return ratingHistogram_.size();
  }

  /**
   *
   *
   * <pre>
   * List of rating counts per rating value (index = rating - 1). The list is
   * empty if there is no rating. If the list is non-empty, its size is
   * always 5. Otherwise, an INVALID_ARGUMENT error is returned.
   *
   * For example, [41, 14, 13, 47, 303]. It means that the
   * [Product][google.cloud.retail.v2.Product] got 41 ratings with 1 star, 14
   * ratings with 2 star, and so on.
   * </pre>
   *
   * <code>repeated int32 rating_histogram = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The ratingHistogram at the given index.
   */
  public int getRatingHistogram(int index) {
    return ratingHistogram_.getInt(index);
  }

  private int ratingHistogramMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (ratingCount_ != 0) {
      output.writeInt32(1, ratingCount_);
    }
    if (java.lang.Float.floatToRawIntBits(averageRating_) != 0) {
      output.writeFloat(2, averageRating_);
    }
    if (getRatingHistogramList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(ratingHistogramMemoizedSerializedSize);
    }
    for (int i = 0; i < ratingHistogram_.size(); i++) {
      output.writeInt32NoTag(ratingHistogram_.getInt(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ratingCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, ratingCount_);
    }
    if (java.lang.Float.floatToRawIntBits(averageRating_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, averageRating_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < ratingHistogram_.size(); i++) {
        dataSize +=
            com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(ratingHistogram_.getInt(i));
      }
      size += dataSize;
      if (!getRatingHistogramList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
      }
      ratingHistogramMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.cloud.retail.v2.Rating)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2.Rating other = (com.google.cloud.retail.v2.Rating) obj;

    if (getRatingCount() != other.getRatingCount()) return false;
    if (java.lang.Float.floatToIntBits(getAverageRating())
        != java.lang.Float.floatToIntBits(other.getAverageRating())) return false;
    if (!getRatingHistogramList().equals(other.getRatingHistogramList())) return false;
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
    hash = (37 * hash) + RATING_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getRatingCount();
    hash = (37 * hash) + AVERAGE_RATING_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getAverageRating());
    if (getRatingHistogramCount() > 0) {
      hash = (37 * hash) + RATING_HISTOGRAM_FIELD_NUMBER;
      hash = (53 * hash) + getRatingHistogramList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2.Rating parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2.Rating parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.Rating parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2.Rating parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.Rating parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2.Rating parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.Rating parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2.Rating parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.Rating parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2.Rating parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.Rating parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2.Rating parseFrom(
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

  public static Builder newBuilder(com.google.cloud.retail.v2.Rating prototype) {
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
   * The rating of a [Product][google.cloud.retail.v2.Product].
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2.Rating}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2.Rating)
      com.google.cloud.retail.v2.RatingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2.CommonProto
          .internal_static_google_cloud_retail_v2_Rating_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2.CommonProto
          .internal_static_google_cloud_retail_v2_Rating_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2.Rating.class,
              com.google.cloud.retail.v2.Rating.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2.Rating.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      ratingCount_ = 0;
      averageRating_ = 0F;
      ratingHistogram_ = emptyIntList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2.CommonProto
          .internal_static_google_cloud_retail_v2_Rating_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.Rating getDefaultInstanceForType() {
      return com.google.cloud.retail.v2.Rating.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.Rating build() {
      com.google.cloud.retail.v2.Rating result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.Rating buildPartial() {
      com.google.cloud.retail.v2.Rating result = new com.google.cloud.retail.v2.Rating(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.retail.v2.Rating result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ratingCount_ = ratingCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.averageRating_ = averageRating_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        ratingHistogram_.makeImmutable();
        result.ratingHistogram_ = ratingHistogram_;
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
      if (other instanceof com.google.cloud.retail.v2.Rating) {
        return mergeFrom((com.google.cloud.retail.v2.Rating) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2.Rating other) {
      if (other == com.google.cloud.retail.v2.Rating.getDefaultInstance()) return this;
      if (other.getRatingCount() != 0) {
        setRatingCount(other.getRatingCount());
      }
      if (other.getAverageRating() != 0F) {
        setAverageRating(other.getAverageRating());
      }
      if (!other.ratingHistogram_.isEmpty()) {
        if (ratingHistogram_.isEmpty()) {
          ratingHistogram_ = other.ratingHistogram_;
          ratingHistogram_.makeImmutable();
          bitField0_ |= 0x00000004;
        } else {
          ensureRatingHistogramIsMutable();
          ratingHistogram_.addAll(other.ratingHistogram_);
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
                ratingCount_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 21:
              {
                averageRating_ = input.readFloat();
                bitField0_ |= 0x00000002;
                break;
              } // case 21
            case 24:
              {
                int v = input.readInt32();
                ensureRatingHistogramIsMutable();
                ratingHistogram_.addInt(v);
                break;
              } // case 24
            case 26:
              {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureRatingHistogramIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  ratingHistogram_.addInt(input.readInt32());
                }
                input.popLimit(limit);
                break;
              } // case 26
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

    private int ratingCount_;

    /**
     *
     *
     * <pre>
     * The total number of ratings. This value is independent of the value of
     * [rating_histogram][google.cloud.retail.v2.Rating.rating_histogram].
     *
     * This value must be nonnegative. Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * </pre>
     *
     * <code>int32 rating_count = 1;</code>
     *
     * @return The ratingCount.
     */
    @java.lang.Override
    public int getRatingCount() {
      return ratingCount_;
    }

    /**
     *
     *
     * <pre>
     * The total number of ratings. This value is independent of the value of
     * [rating_histogram][google.cloud.retail.v2.Rating.rating_histogram].
     *
     * This value must be nonnegative. Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * </pre>
     *
     * <code>int32 rating_count = 1;</code>
     *
     * @param value The ratingCount to set.
     * @return This builder for chaining.
     */
    public Builder setRatingCount(int value) {

      ratingCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The total number of ratings. This value is independent of the value of
     * [rating_histogram][google.cloud.retail.v2.Rating.rating_histogram].
     *
     * This value must be nonnegative. Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * </pre>
     *
     * <code>int32 rating_count = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRatingCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ratingCount_ = 0;
      onChanged();
      return this;
    }

    private float averageRating_;

    /**
     *
     *
     * <pre>
     * The average rating of the [Product][google.cloud.retail.v2.Product].
     *
     * The rating is scaled at 1-5. Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * </pre>
     *
     * <code>float average_rating = 2;</code>
     *
     * @return The averageRating.
     */
    @java.lang.Override
    public float getAverageRating() {
      return averageRating_;
    }

    /**
     *
     *
     * <pre>
     * The average rating of the [Product][google.cloud.retail.v2.Product].
     *
     * The rating is scaled at 1-5. Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * </pre>
     *
     * <code>float average_rating = 2;</code>
     *
     * @param value The averageRating to set.
     * @return This builder for chaining.
     */
    public Builder setAverageRating(float value) {

      averageRating_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The average rating of the [Product][google.cloud.retail.v2.Product].
     *
     * The rating is scaled at 1-5. Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * </pre>
     *
     * <code>float average_rating = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAverageRating() {
      bitField0_ = (bitField0_ & ~0x00000002);
      averageRating_ = 0F;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList ratingHistogram_ = emptyIntList();

    private void ensureRatingHistogramIsMutable() {
      if (!ratingHistogram_.isModifiable()) {
        ratingHistogram_ = makeMutableCopy(ratingHistogram_);
      }
      bitField0_ |= 0x00000004;
    }

    /**
     *
     *
     * <pre>
     * List of rating counts per rating value (index = rating - 1). The list is
     * empty if there is no rating. If the list is non-empty, its size is
     * always 5. Otherwise, an INVALID_ARGUMENT error is returned.
     *
     * For example, [41, 14, 13, 47, 303]. It means that the
     * [Product][google.cloud.retail.v2.Product] got 41 ratings with 1 star, 14
     * ratings with 2 star, and so on.
     * </pre>
     *
     * <code>repeated int32 rating_histogram = 3;</code>
     *
     * @return A list containing the ratingHistogram.
     */
    public java.util.List<java.lang.Integer> getRatingHistogramList() {
      ratingHistogram_.makeImmutable();
      return ratingHistogram_;
    }

    /**
     *
     *
     * <pre>
     * List of rating counts per rating value (index = rating - 1). The list is
     * empty if there is no rating. If the list is non-empty, its size is
     * always 5. Otherwise, an INVALID_ARGUMENT error is returned.
     *
     * For example, [41, 14, 13, 47, 303]. It means that the
     * [Product][google.cloud.retail.v2.Product] got 41 ratings with 1 star, 14
     * ratings with 2 star, and so on.
     * </pre>
     *
     * <code>repeated int32 rating_histogram = 3;</code>
     *
     * @return The count of ratingHistogram.
     */
    public int getRatingHistogramCount() {
      return ratingHistogram_.size();
    }

    /**
     *
     *
     * <pre>
     * List of rating counts per rating value (index = rating - 1). The list is
     * empty if there is no rating. If the list is non-empty, its size is
     * always 5. Otherwise, an INVALID_ARGUMENT error is returned.
     *
     * For example, [41, 14, 13, 47, 303]. It means that the
     * [Product][google.cloud.retail.v2.Product] got 41 ratings with 1 star, 14
     * ratings with 2 star, and so on.
     * </pre>
     *
     * <code>repeated int32 rating_histogram = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The ratingHistogram at the given index.
     */
    public int getRatingHistogram(int index) {
      return ratingHistogram_.getInt(index);
    }

    /**
     *
     *
     * <pre>
     * List of rating counts per rating value (index = rating - 1). The list is
     * empty if there is no rating. If the list is non-empty, its size is
     * always 5. Otherwise, an INVALID_ARGUMENT error is returned.
     *
     * For example, [41, 14, 13, 47, 303]. It means that the
     * [Product][google.cloud.retail.v2.Product] got 41 ratings with 1 star, 14
     * ratings with 2 star, and so on.
     * </pre>
     *
     * <code>repeated int32 rating_histogram = 3;</code>
     *
     * @param index The index to set the value at.
     * @param value The ratingHistogram to set.
     * @return This builder for chaining.
     */
    public Builder setRatingHistogram(int index, int value) {

      ensureRatingHistogramIsMutable();
      ratingHistogram_.setInt(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of rating counts per rating value (index = rating - 1). The list is
     * empty if there is no rating. If the list is non-empty, its size is
     * always 5. Otherwise, an INVALID_ARGUMENT error is returned.
     *
     * For example, [41, 14, 13, 47, 303]. It means that the
     * [Product][google.cloud.retail.v2.Product] got 41 ratings with 1 star, 14
     * ratings with 2 star, and so on.
     * </pre>
     *
     * <code>repeated int32 rating_histogram = 3;</code>
     *
     * @param value The ratingHistogram to add.
     * @return This builder for chaining.
     */
    public Builder addRatingHistogram(int value) {

      ensureRatingHistogramIsMutable();
      ratingHistogram_.addInt(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of rating counts per rating value (index = rating - 1). The list is
     * empty if there is no rating. If the list is non-empty, its size is
     * always 5. Otherwise, an INVALID_ARGUMENT error is returned.
     *
     * For example, [41, 14, 13, 47, 303]. It means that the
     * [Product][google.cloud.retail.v2.Product] got 41 ratings with 1 star, 14
     * ratings with 2 star, and so on.
     * </pre>
     *
     * <code>repeated int32 rating_histogram = 3;</code>
     *
     * @param values The ratingHistogram to add.
     * @return This builder for chaining.
     */
    public Builder addAllRatingHistogram(java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureRatingHistogramIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, ratingHistogram_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of rating counts per rating value (index = rating - 1). The list is
     * empty if there is no rating. If the list is non-empty, its size is
     * always 5. Otherwise, an INVALID_ARGUMENT error is returned.
     *
     * For example, [41, 14, 13, 47, 303]. It means that the
     * [Product][google.cloud.retail.v2.Product] got 41 ratings with 1 star, 14
     * ratings with 2 star, and so on.
     * </pre>
     *
     * <code>repeated int32 rating_histogram = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRatingHistogram() {
      ratingHistogram_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000004);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2.Rating)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2.Rating)
  private static final com.google.cloud.retail.v2.Rating DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2.Rating();
  }

  public static com.google.cloud.retail.v2.Rating getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Rating> PARSER =
      new com.google.protobuf.AbstractParser<Rating>() {
        @java.lang.Override
        public Rating parsePartialFrom(
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

  public static com.google.protobuf.Parser<Rating> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Rating> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2.Rating getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
