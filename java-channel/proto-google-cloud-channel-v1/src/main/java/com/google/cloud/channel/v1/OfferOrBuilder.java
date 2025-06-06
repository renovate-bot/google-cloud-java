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
// source: google/cloud/channel/v1/offers.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.channel.v1;

public interface OfferOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.Offer)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource Name of the Offer.
   * Format: accounts/{account_id}/offers/{offer_id}
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Resource Name of the Offer.
   * Format: accounts/{account_id}/offers/{offer_id}
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Marketing information for the Offer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.MarketingInfo marketing_info = 2;</code>
   *
   * @return Whether the marketingInfo field is set.
   */
  boolean hasMarketingInfo();

  /**
   *
   *
   * <pre>
   * Marketing information for the Offer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.MarketingInfo marketing_info = 2;</code>
   *
   * @return The marketingInfo.
   */
  com.google.cloud.channel.v1.MarketingInfo getMarketingInfo();

  /**
   *
   *
   * <pre>
   * Marketing information for the Offer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.MarketingInfo marketing_info = 2;</code>
   */
  com.google.cloud.channel.v1.MarketingInfoOrBuilder getMarketingInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * SKU the offer is associated with.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Sku sku = 3;</code>
   *
   * @return Whether the sku field is set.
   */
  boolean hasSku();

  /**
   *
   *
   * <pre>
   * SKU the offer is associated with.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Sku sku = 3;</code>
   *
   * @return The sku.
   */
  com.google.cloud.channel.v1.Sku getSku();

  /**
   *
   *
   * <pre>
   * SKU the offer is associated with.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Sku sku = 3;</code>
   */
  com.google.cloud.channel.v1.SkuOrBuilder getSkuOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes the payment plan for the Offer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Plan plan = 4;</code>
   *
   * @return Whether the plan field is set.
   */
  boolean hasPlan();

  /**
   *
   *
   * <pre>
   * Describes the payment plan for the Offer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Plan plan = 4;</code>
   *
   * @return The plan.
   */
  com.google.cloud.channel.v1.Plan getPlan();

  /**
   *
   *
   * <pre>
   * Describes the payment plan for the Offer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Plan plan = 4;</code>
   */
  com.google.cloud.channel.v1.PlanOrBuilder getPlanOrBuilder();

  /**
   *
   *
   * <pre>
   * Constraints on transacting the Offer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Constraints constraints = 5;</code>
   *
   * @return Whether the constraints field is set.
   */
  boolean hasConstraints();

  /**
   *
   *
   * <pre>
   * Constraints on transacting the Offer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Constraints constraints = 5;</code>
   *
   * @return The constraints.
   */
  com.google.cloud.channel.v1.Constraints getConstraints();

  /**
   *
   *
   * <pre>
   * Constraints on transacting the Offer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Constraints constraints = 5;</code>
   */
  com.google.cloud.channel.v1.ConstraintsOrBuilder getConstraintsOrBuilder();

  /**
   *
   *
   * <pre>
   * Price for each monetizable resource type.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.PriceByResource price_by_resources = 6;</code>
   */
  java.util.List<com.google.cloud.channel.v1.PriceByResource> getPriceByResourcesList();

  /**
   *
   *
   * <pre>
   * Price for each monetizable resource type.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.PriceByResource price_by_resources = 6;</code>
   */
  com.google.cloud.channel.v1.PriceByResource getPriceByResources(int index);

  /**
   *
   *
   * <pre>
   * Price for each monetizable resource type.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.PriceByResource price_by_resources = 6;</code>
   */
  int getPriceByResourcesCount();

  /**
   *
   *
   * <pre>
   * Price for each monetizable resource type.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.PriceByResource price_by_resources = 6;</code>
   */
  java.util.List<? extends com.google.cloud.channel.v1.PriceByResourceOrBuilder>
      getPriceByResourcesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Price for each monetizable resource type.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.PriceByResource price_by_resources = 6;</code>
   */
  com.google.cloud.channel.v1.PriceByResourceOrBuilder getPriceByResourcesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Start of the Offer validity time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * Start of the Offer validity time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   *
   *
   * <pre>
   * Start of the Offer validity time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. End of the Offer validity time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * Output only. End of the Offer validity time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   *
   *
   * <pre>
   * Output only. End of the Offer validity time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Parameters required to use current Offer to purchase.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ParameterDefinition parameter_definitions = 9;</code>
   */
  java.util.List<com.google.cloud.channel.v1.ParameterDefinition> getParameterDefinitionsList();

  /**
   *
   *
   * <pre>
   * Parameters required to use current Offer to purchase.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ParameterDefinition parameter_definitions = 9;</code>
   */
  com.google.cloud.channel.v1.ParameterDefinition getParameterDefinitions(int index);

  /**
   *
   *
   * <pre>
   * Parameters required to use current Offer to purchase.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ParameterDefinition parameter_definitions = 9;</code>
   */
  int getParameterDefinitionsCount();

  /**
   *
   *
   * <pre>
   * Parameters required to use current Offer to purchase.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ParameterDefinition parameter_definitions = 9;</code>
   */
  java.util.List<? extends com.google.cloud.channel.v1.ParameterDefinitionOrBuilder>
      getParameterDefinitionsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Parameters required to use current Offer to purchase.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ParameterDefinition parameter_definitions = 9;</code>
   */
  com.google.cloud.channel.v1.ParameterDefinitionOrBuilder getParameterDefinitionsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The deal code of the offer to get a special promotion or discount.
   * </pre>
   *
   * <code>string deal_code = 12;</code>
   *
   * @return The dealCode.
   */
  java.lang.String getDealCode();

  /**
   *
   *
   * <pre>
   * The deal code of the offer to get a special promotion or discount.
   * </pre>
   *
   * <code>string deal_code = 12;</code>
   *
   * @return The bytes for dealCode.
   */
  com.google.protobuf.ByteString getDealCodeBytes();
}
