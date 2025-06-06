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
// source: google/shopping/merchant/reviews/v1beta/productreviews.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.reviews.v1beta;

public interface InsertProductReviewRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.reviews.v1beta.InsertProductReviewRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The account where the product review will be inserted.
   * Format: accounts/{account}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The account where the product review will be inserted.
   * Format: accounts/{account}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The product review to insert.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.reviews.v1beta.ProductReview product_review = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the productReview field is set.
   */
  boolean hasProductReview();

  /**
   *
   *
   * <pre>
   * Required. The product review to insert.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.reviews.v1beta.ProductReview product_review = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The productReview.
   */
  com.google.shopping.merchant.reviews.v1beta.ProductReview getProductReview();

  /**
   *
   *
   * <pre>
   * Required. The product review to insert.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.reviews.v1beta.ProductReview product_review = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.shopping.merchant.reviews.v1beta.ProductReviewOrBuilder getProductReviewOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Format:
   * `accounts/{account}/dataSources/{datasource}`.
   * </pre>
   *
   * <code>string data_source = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The dataSource.
   */
  java.lang.String getDataSource();

  /**
   *
   *
   * <pre>
   * Required. Format:
   * `accounts/{account}/dataSources/{datasource}`.
   * </pre>
   *
   * <code>string data_source = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for dataSource.
   */
  com.google.protobuf.ByteString getDataSourceBytes();
}
