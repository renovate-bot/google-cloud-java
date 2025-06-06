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
// source: google/cloud/retail/v2/import_config.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2;

public interface ImportProductsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.ImportProductsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required.
   * `projects/1234/locations/global/catalogs/default_catalog/branches/default_branch`
   *
   * If no updateMask is specified, requires products.create permission.
   * If updateMask is specified, requires products.update permission.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required.
   * `projects/1234/locations/global/catalogs/default_catalog/branches/default_branch`
   *
   * If no updateMask is specified, requires products.create permission.
   * If updateMask is specified, requires products.update permission.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>string request_id = 6 [deprecated = true];</code>
   *
   * @deprecated google.cloud.retail.v2.ImportProductsRequest.request_id is deprecated. See
   *     google/cloud/retail/v2/import_config.proto;l=186
   * @return The requestId.
   */
  @java.lang.Deprecated
  java.lang.String getRequestId();

  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>string request_id = 6 [deprecated = true];</code>
   *
   * @deprecated google.cloud.retail.v2.ImportProductsRequest.request_id is deprecated. See
   *     google/cloud/retail/v2/import_config.proto;l=186
   * @return The bytes for requestId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.ProductInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the inputConfig field is set.
   */
  boolean hasInputConfig();

  /**
   *
   *
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.ProductInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The inputConfig.
   */
  com.google.cloud.retail.v2.ProductInputConfig getInputConfig();

  /**
   *
   *
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.ProductInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2.ProductInputConfigOrBuilder getInputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the Import.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
   *
   * @return Whether the errorsConfig field is set.
   */
  boolean hasErrorsConfig();

  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the Import.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
   *
   * @return The errorsConfig.
   */
  com.google.cloud.retail.v2.ImportErrorsConfig getErrorsConfig();

  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the Import.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
   */
  com.google.cloud.retail.v2.ImportErrorsConfigOrBuilder getErrorsConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided imported `products` to update. If
   * not set, all fields are updated. If provided, only the existing product
   * fields are updated. Missing products will not be created.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided imported `products` to update. If
   * not set, all fields are updated. If provided, only the existing product
   * fields are updated. Missing products will not be created.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided imported `products` to update. If
   * not set, all fields are updated. If provided, only the existing product
   * fields are updated. Missing products will not be created.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * The mode of reconciliation between existing products and the products to be
   * imported. Defaults to
   * [ReconciliationMode.INCREMENTAL][google.cloud.retail.v2.ImportProductsRequest.ReconciliationMode.INCREMENTAL].
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ImportProductsRequest.ReconciliationMode reconciliation_mode = 5;
   * </code>
   *
   * @return The enum numeric value on the wire for reconciliationMode.
   */
  int getReconciliationModeValue();

  /**
   *
   *
   * <pre>
   * The mode of reconciliation between existing products and the products to be
   * imported. Defaults to
   * [ReconciliationMode.INCREMENTAL][google.cloud.retail.v2.ImportProductsRequest.ReconciliationMode.INCREMENTAL].
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ImportProductsRequest.ReconciliationMode reconciliation_mode = 5;
   * </code>
   *
   * @return The reconciliationMode.
   */
  com.google.cloud.retail.v2.ImportProductsRequest.ReconciliationMode getReconciliationMode();

  /**
   *
   *
   * <pre>
   * Full Pub/Sub topic name for receiving notification. If this field is set,
   * when the import is finished, a notification is sent to
   * specified Pub/Sub topic. The message data is JSON string of a
   * [Operation][google.longrunning.Operation].
   *
   * Format of the Pub/Sub topic is `projects/{project}/topics/{topic}`. It has
   * to be within the same project as
   * [ImportProductsRequest.parent][google.cloud.retail.v2.ImportProductsRequest.parent].
   * Make sure that both
   * `cloud-retail-customer-data-access&#64;system.gserviceaccount.com` and
   * `service-&lt;project number&gt;&#64;gcp-sa-retail.iam.gserviceaccount.com`
   * have the `pubsub.topics.publish` IAM permission on the topic.
   *
   * Only supported when
   * [ImportProductsRequest.reconciliation_mode][google.cloud.retail.v2.ImportProductsRequest.reconciliation_mode]
   * is set to `FULL`.
   * </pre>
   *
   * <code>string notification_pubsub_topic = 7;</code>
   *
   * @return The notificationPubsubTopic.
   */
  java.lang.String getNotificationPubsubTopic();

  /**
   *
   *
   * <pre>
   * Full Pub/Sub topic name for receiving notification. If this field is set,
   * when the import is finished, a notification is sent to
   * specified Pub/Sub topic. The message data is JSON string of a
   * [Operation][google.longrunning.Operation].
   *
   * Format of the Pub/Sub topic is `projects/{project}/topics/{topic}`. It has
   * to be within the same project as
   * [ImportProductsRequest.parent][google.cloud.retail.v2.ImportProductsRequest.parent].
   * Make sure that both
   * `cloud-retail-customer-data-access&#64;system.gserviceaccount.com` and
   * `service-&lt;project number&gt;&#64;gcp-sa-retail.iam.gserviceaccount.com`
   * have the `pubsub.topics.publish` IAM permission on the topic.
   *
   * Only supported when
   * [ImportProductsRequest.reconciliation_mode][google.cloud.retail.v2.ImportProductsRequest.reconciliation_mode]
   * is set to `FULL`.
   * </pre>
   *
   * <code>string notification_pubsub_topic = 7;</code>
   *
   * @return The bytes for notificationPubsubTopic.
   */
  com.google.protobuf.ByteString getNotificationPubsubTopicBytes();
}
