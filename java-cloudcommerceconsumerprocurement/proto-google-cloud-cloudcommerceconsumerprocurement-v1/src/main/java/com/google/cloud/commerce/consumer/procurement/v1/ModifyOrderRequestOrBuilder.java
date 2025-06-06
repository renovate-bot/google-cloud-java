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
// source: google/cloud/commerce/consumer/procurement/v1/procurement_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.commerce.consumer.procurement.v1;

public interface ModifyOrderRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.commerce.consumer.procurement.v1.ModifyOrderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the order to update.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. Name of the order to update.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Modifications for an existing Order created by an Offer.
   * Required when Offer based Order is being modified, except for when going
   * from an offer to a public plan.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.commerce.consumer.procurement.v1.ModifyOrderRequest.Modification modifications = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.commerce.consumer.procurement.v1.ModifyOrderRequest.Modification>
      getModificationsList();

  /**
   *
   *
   * <pre>
   * Optional. Modifications for an existing Order created by an Offer.
   * Required when Offer based Order is being modified, except for when going
   * from an offer to a public plan.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.commerce.consumer.procurement.v1.ModifyOrderRequest.Modification modifications = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.commerce.consumer.procurement.v1.ModifyOrderRequest.Modification
      getModifications(int index);

  /**
   *
   *
   * <pre>
   * Optional. Modifications for an existing Order created by an Offer.
   * Required when Offer based Order is being modified, except for when going
   * from an offer to a public plan.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.commerce.consumer.procurement.v1.ModifyOrderRequest.Modification modifications = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getModificationsCount();

  /**
   *
   *
   * <pre>
   * Optional. Modifications for an existing Order created by an Offer.
   * Required when Offer based Order is being modified, except for when going
   * from an offer to a public plan.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.commerce.consumer.procurement.v1.ModifyOrderRequest.Modification modifications = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.commerce.consumer.procurement.v1.ModifyOrderRequest
                  .ModificationOrBuilder>
      getModificationsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. Modifications for an existing Order created by an Offer.
   * Required when Offer based Order is being modified, except for when going
   * from an offer to a public plan.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.commerce.consumer.procurement.v1.ModifyOrderRequest.Modification modifications = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.commerce.consumer.procurement.v1.ModifyOrderRequest.ModificationOrBuilder
      getModificationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Updated display name of the order, leave as empty if you do not
   * want to update current display name.
   * </pre>
   *
   * <code>string display_name = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Optional. Updated display name of the order, leave as empty if you do not
   * want to update current display name.
   * </pre>
   *
   * <code>string display_name = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The weak etag, which can be optionally populated, of the order
   * that this modify request is based on. Validation checking will only happen
   * if the invoker supplies this field.
   * </pre>
   *
   * <code>string etag = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * Optional. The weak etag, which can be optionally populated, of the order
   * that this modify request is based on. Validation checking will only happen
   * if the invoker supplies this field.
   * </pre>
   *
   * <code>string etag = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
