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
// source: google/cloud/retail/v2beta/product_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2beta;

public interface AddFulfillmentPlacesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.AddFulfillmentPlacesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Full resource name of
   * [Product][google.cloud.retail.v2beta.Product], such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`.
   *
   * If the caller does not have permission to access the
   * [Product][google.cloud.retail.v2beta.Product], regardless of whether or not
   * it exists, a PERMISSION_DENIED error is returned.
   * </pre>
   *
   * <code>
   * string product = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The product.
   */
  java.lang.String getProduct();

  /**
   *
   *
   * <pre>
   * Required. Full resource name of
   * [Product][google.cloud.retail.v2beta.Product], such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`.
   *
   * If the caller does not have permission to access the
   * [Product][google.cloud.retail.v2beta.Product], regardless of whether or not
   * it exists, a PERMISSION_DENIED error is returned.
   * </pre>
   *
   * <code>
   * string product = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for product.
   */
  com.google.protobuf.ByteString getProductBytes();

  /**
   *
   *
   * <pre>
   * Required. The fulfillment type, including commonly used types (such as
   * pickup in store and same day delivery), and custom types.
   *
   * Supported values:
   *
   * * "pickup-in-store"
   * * "ship-to-store"
   * * "same-day-delivery"
   * * "next-day-delivery"
   * * "custom-type-1"
   * * "custom-type-2"
   * * "custom-type-3"
   * * "custom-type-4"
   * * "custom-type-5"
   *
   * If this field is set to an invalid value other than these, an
   * INVALID_ARGUMENT error is returned.
   *
   * This field directly corresponds to
   * [Product.fulfillment_info.type][google.cloud.retail.v2beta.FulfillmentInfo.type].
   * </pre>
   *
   * <code>string type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The type.
   */
  java.lang.String getType();

  /**
   *
   *
   * <pre>
   * Required. The fulfillment type, including commonly used types (such as
   * pickup in store and same day delivery), and custom types.
   *
   * Supported values:
   *
   * * "pickup-in-store"
   * * "ship-to-store"
   * * "same-day-delivery"
   * * "next-day-delivery"
   * * "custom-type-1"
   * * "custom-type-2"
   * * "custom-type-3"
   * * "custom-type-4"
   * * "custom-type-5"
   *
   * If this field is set to an invalid value other than these, an
   * INVALID_ARGUMENT error is returned.
   *
   * This field directly corresponds to
   * [Product.fulfillment_info.type][google.cloud.retail.v2beta.FulfillmentInfo.type].
   * </pre>
   *
   * <code>string type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * Required. The IDs for this
   * [type][google.cloud.retail.v2beta.AddFulfillmentPlacesRequest.type], such
   * as the store IDs for "pickup-in-store" or the region IDs for
   * "same-day-delivery" to be added for this
   * [type][google.cloud.retail.v2beta.AddFulfillmentPlacesRequest.type].
   * Duplicate IDs will be automatically ignored.
   *
   * At least 1 value is required, and a maximum of 2000 values are allowed.
   * Each value must be a string with a length limit of 10 characters, matching
   * the pattern `[a-zA-Z0-9_-]+`, such as "store1" or "REGION-2". Otherwise, an
   * INVALID_ARGUMENT error is returned.
   *
   * If the total number of place IDs exceeds 2000 for this
   * [type][google.cloud.retail.v2beta.AddFulfillmentPlacesRequest.type] after
   * adding, then the update will be rejected.
   * </pre>
   *
   * <code>repeated string place_ids = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the placeIds.
   */
  java.util.List<java.lang.String> getPlaceIdsList();

  /**
   *
   *
   * <pre>
   * Required. The IDs for this
   * [type][google.cloud.retail.v2beta.AddFulfillmentPlacesRequest.type], such
   * as the store IDs for "pickup-in-store" or the region IDs for
   * "same-day-delivery" to be added for this
   * [type][google.cloud.retail.v2beta.AddFulfillmentPlacesRequest.type].
   * Duplicate IDs will be automatically ignored.
   *
   * At least 1 value is required, and a maximum of 2000 values are allowed.
   * Each value must be a string with a length limit of 10 characters, matching
   * the pattern `[a-zA-Z0-9_-]+`, such as "store1" or "REGION-2". Otherwise, an
   * INVALID_ARGUMENT error is returned.
   *
   * If the total number of place IDs exceeds 2000 for this
   * [type][google.cloud.retail.v2beta.AddFulfillmentPlacesRequest.type] after
   * adding, then the update will be rejected.
   * </pre>
   *
   * <code>repeated string place_ids = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of placeIds.
   */
  int getPlaceIdsCount();

  /**
   *
   *
   * <pre>
   * Required. The IDs for this
   * [type][google.cloud.retail.v2beta.AddFulfillmentPlacesRequest.type], such
   * as the store IDs for "pickup-in-store" or the region IDs for
   * "same-day-delivery" to be added for this
   * [type][google.cloud.retail.v2beta.AddFulfillmentPlacesRequest.type].
   * Duplicate IDs will be automatically ignored.
   *
   * At least 1 value is required, and a maximum of 2000 values are allowed.
   * Each value must be a string with a length limit of 10 characters, matching
   * the pattern `[a-zA-Z0-9_-]+`, such as "store1" or "REGION-2". Otherwise, an
   * INVALID_ARGUMENT error is returned.
   *
   * If the total number of place IDs exceeds 2000 for this
   * [type][google.cloud.retail.v2beta.AddFulfillmentPlacesRequest.type] after
   * adding, then the update will be rejected.
   * </pre>
   *
   * <code>repeated string place_ids = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The placeIds at the given index.
   */
  java.lang.String getPlaceIds(int index);

  /**
   *
   *
   * <pre>
   * Required. The IDs for this
   * [type][google.cloud.retail.v2beta.AddFulfillmentPlacesRequest.type], such
   * as the store IDs for "pickup-in-store" or the region IDs for
   * "same-day-delivery" to be added for this
   * [type][google.cloud.retail.v2beta.AddFulfillmentPlacesRequest.type].
   * Duplicate IDs will be automatically ignored.
   *
   * At least 1 value is required, and a maximum of 2000 values are allowed.
   * Each value must be a string with a length limit of 10 characters, matching
   * the pattern `[a-zA-Z0-9_-]+`, such as "store1" or "REGION-2". Otherwise, an
   * INVALID_ARGUMENT error is returned.
   *
   * If the total number of place IDs exceeds 2000 for this
   * [type][google.cloud.retail.v2beta.AddFulfillmentPlacesRequest.type] after
   * adding, then the update will be rejected.
   * </pre>
   *
   * <code>repeated string place_ids = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the placeIds at the given index.
   */
  com.google.protobuf.ByteString getPlaceIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * The time when the fulfillment updates are issued, used to prevent
   * out-of-order updates on fulfillment information. If not provided, the
   * internal system time will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp add_time = 4;</code>
   *
   * @return Whether the addTime field is set.
   */
  boolean hasAddTime();

  /**
   *
   *
   * <pre>
   * The time when the fulfillment updates are issued, used to prevent
   * out-of-order updates on fulfillment information. If not provided, the
   * internal system time will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp add_time = 4;</code>
   *
   * @return The addTime.
   */
  com.google.protobuf.Timestamp getAddTime();

  /**
   *
   *
   * <pre>
   * The time when the fulfillment updates are issued, used to prevent
   * out-of-order updates on fulfillment information. If not provided, the
   * internal system time will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp add_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getAddTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * If set to true, and the [Product][google.cloud.retail.v2beta.Product] is
   * not found, the fulfillment information will still be processed and retained
   * for at most 1 day and processed once the
   * [Product][google.cloud.retail.v2beta.Product] is created. If set to false,
   * a NOT_FOUND error is returned if the
   * [Product][google.cloud.retail.v2beta.Product] is not found.
   * </pre>
   *
   * <code>bool allow_missing = 5;</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
