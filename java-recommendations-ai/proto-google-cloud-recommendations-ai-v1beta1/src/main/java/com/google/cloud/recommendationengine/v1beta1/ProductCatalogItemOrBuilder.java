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
// source: google/cloud/recommendationengine/v1beta1/catalog.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.recommendationengine.v1beta1;

public interface ProductCatalogItemOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.ProductCatalogItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The exact product price.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.ProductCatalogItem.ExactPrice exact_price = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the exactPrice field is set.
   */
  boolean hasExactPrice();

  /**
   *
   *
   * <pre>
   * Optional. The exact product price.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.ProductCatalogItem.ExactPrice exact_price = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The exactPrice.
   */
  com.google.cloud.recommendationengine.v1beta1.ProductCatalogItem.ExactPrice getExactPrice();

  /**
   *
   *
   * <pre>
   * Optional. The exact product price.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.ProductCatalogItem.ExactPrice exact_price = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.recommendationengine.v1beta1.ProductCatalogItem.ExactPriceOrBuilder
      getExactPriceOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The product price range.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.ProductCatalogItem.PriceRange price_range = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the priceRange field is set.
   */
  boolean hasPriceRange();

  /**
   *
   *
   * <pre>
   * Optional. The product price range.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.ProductCatalogItem.PriceRange price_range = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The priceRange.
   */
  com.google.cloud.recommendationengine.v1beta1.ProductCatalogItem.PriceRange getPriceRange();

  /**
   *
   *
   * <pre>
   * Optional. The product price range.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.ProductCatalogItem.PriceRange price_range = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.recommendationengine.v1beta1.ProductCatalogItem.PriceRangeOrBuilder
      getPriceRangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A map to pass the costs associated with the product.
   *
   * For example:
   * {"manufacturing": 45.5} The profit of selling this item is computed like
   * so:
   *
   * * If 'exactPrice' is provided, profit = displayPrice - sum(costs)
   * * If 'priceRange' is provided, profit = minPrice - sum(costs)
   * </pre>
   *
   * <code>map&lt;string, float&gt; costs = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getCostsCount();

  /**
   *
   *
   * <pre>
   * Optional. A map to pass the costs associated with the product.
   *
   * For example:
   * {"manufacturing": 45.5} The profit of selling this item is computed like
   * so:
   *
   * * If 'exactPrice' is provided, profit = displayPrice - sum(costs)
   * * If 'priceRange' is provided, profit = minPrice - sum(costs)
   * </pre>
   *
   * <code>map&lt;string, float&gt; costs = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsCosts(java.lang.String key);

  /** Use {@link #getCostsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Float> getCosts();

  /**
   *
   *
   * <pre>
   * Optional. A map to pass the costs associated with the product.
   *
   * For example:
   * {"manufacturing": 45.5} The profit of selling this item is computed like
   * so:
   *
   * * If 'exactPrice' is provided, profit = displayPrice - sum(costs)
   * * If 'priceRange' is provided, profit = minPrice - sum(costs)
   * </pre>
   *
   * <code>map&lt;string, float&gt; costs = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.Float> getCostsMap();

  /**
   *
   *
   * <pre>
   * Optional. A map to pass the costs associated with the product.
   *
   * For example:
   * {"manufacturing": 45.5} The profit of selling this item is computed like
   * so:
   *
   * * If 'exactPrice' is provided, profit = displayPrice - sum(costs)
   * * If 'priceRange' is provided, profit = minPrice - sum(costs)
   * </pre>
   *
   * <code>map&lt;string, float&gt; costs = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  float getCostsOrDefault(java.lang.String key, float defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. A map to pass the costs associated with the product.
   *
   * For example:
   * {"manufacturing": 45.5} The profit of selling this item is computed like
   * so:
   *
   * * If 'exactPrice' is provided, profit = displayPrice - sum(costs)
   * * If 'priceRange' is provided, profit = minPrice - sum(costs)
   * </pre>
   *
   * <code>map&lt;string, float&gt; costs = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  float getCostsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Only required if the price is set. Currency code for price/costs. Use
   * three-character ISO-4217 code.
   * </pre>
   *
   * <code>string currency_code = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();

  /**
   *
   *
   * <pre>
   * Optional. Only required if the price is set. Currency code for price/costs. Use
   * three-character ISO-4217 code.
   * </pre>
   *
   * <code>string currency_code = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString getCurrencyCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Online stock state of the catalog item. Default is `IN_STOCK`.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.ProductCatalogItem.StockState stock_state = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for stockState.
   */
  int getStockStateValue();

  /**
   *
   *
   * <pre>
   * Optional. Online stock state of the catalog item. Default is `IN_STOCK`.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.ProductCatalogItem.StockState stock_state = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The stockState.
   */
  com.google.cloud.recommendationengine.v1beta1.ProductCatalogItem.StockState getStockState();

  /**
   *
   *
   * <pre>
   * Optional. The available quantity of the item.
   * </pre>
   *
   * <code>int64 available_quantity = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The availableQuantity.
   */
  long getAvailableQuantity();

  /**
   *
   *
   * <pre>
   * Optional. Canonical URL directly linking to the item detail page with a
   * length limit of 5 KiB..
   * </pre>
   *
   * <code>string canonical_product_uri = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The canonicalProductUri.
   */
  java.lang.String getCanonicalProductUri();

  /**
   *
   *
   * <pre>
   * Optional. Canonical URL directly linking to the item detail page with a
   * length limit of 5 KiB..
   * </pre>
   *
   * <code>string canonical_product_uri = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for canonicalProductUri.
   */
  com.google.protobuf.ByteString getCanonicalProductUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. Product images for the catalog item.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.Image images = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.recommendationengine.v1beta1.Image> getImagesList();

  /**
   *
   *
   * <pre>
   * Optional. Product images for the catalog item.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.Image images = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.recommendationengine.v1beta1.Image getImages(int index);

  /**
   *
   *
   * <pre>
   * Optional. Product images for the catalog item.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.Image images = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getImagesCount();

  /**
   *
   *
   * <pre>
   * Optional. Product images for the catalog item.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.Image images = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.recommendationengine.v1beta1.ImageOrBuilder>
      getImagesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. Product images for the catalog item.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.Image images = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.recommendationengine.v1beta1.ImageOrBuilder getImagesOrBuilder(int index);

  com.google.cloud.recommendationengine.v1beta1.ProductCatalogItem.PriceCase getPriceCase();
}
