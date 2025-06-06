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
// source: google/cloud/asset/v1/asset_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.asset.v1;

public interface FeedOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.Feed)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The format will be
   * projects/{project_number}/feeds/{client-assigned_feed_identifier} or
   * folders/{folder_number}/feeds/{client-assigned_feed_identifier} or
   * organizations/{organization_number}/feeds/{client-assigned_feed_identifier}
   *
   * The client-assigned feed identifier must be unique within the parent
   * project/folder/organization.
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
   * Required. The format will be
   * projects/{project_number}/feeds/{client-assigned_feed_identifier} or
   * folders/{folder_number}/feeds/{client-assigned_feed_identifier} or
   * organizations/{organization_number}/feeds/{client-assigned_feed_identifier}
   *
   * The client-assigned feed identifier must be unique within the parent
   * project/folder/organization.
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
   * A list of the full names of the assets to receive updates. You must specify
   * either or both of asset_names and asset_types. Only asset updates matching
   * specified asset_names or asset_types are exported to the feed.
   * Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * For a list of the full names for supported asset types, see [Resource
   * name format](/asset-inventory/docs/resource-name-format).
   * </pre>
   *
   * <code>repeated string asset_names = 2;</code>
   *
   * @return A list containing the assetNames.
   */
  java.util.List<java.lang.String> getAssetNamesList();

  /**
   *
   *
   * <pre>
   * A list of the full names of the assets to receive updates. You must specify
   * either or both of asset_names and asset_types. Only asset updates matching
   * specified asset_names or asset_types are exported to the feed.
   * Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * For a list of the full names for supported asset types, see [Resource
   * name format](/asset-inventory/docs/resource-name-format).
   * </pre>
   *
   * <code>repeated string asset_names = 2;</code>
   *
   * @return The count of assetNames.
   */
  int getAssetNamesCount();

  /**
   *
   *
   * <pre>
   * A list of the full names of the assets to receive updates. You must specify
   * either or both of asset_names and asset_types. Only asset updates matching
   * specified asset_names or asset_types are exported to the feed.
   * Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * For a list of the full names for supported asset types, see [Resource
   * name format](/asset-inventory/docs/resource-name-format).
   * </pre>
   *
   * <code>repeated string asset_names = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The assetNames at the given index.
   */
  java.lang.String getAssetNames(int index);

  /**
   *
   *
   * <pre>
   * A list of the full names of the assets to receive updates. You must specify
   * either or both of asset_names and asset_types. Only asset updates matching
   * specified asset_names or asset_types are exported to the feed.
   * Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * For a list of the full names for supported asset types, see [Resource
   * name format](/asset-inventory/docs/resource-name-format).
   * </pre>
   *
   * <code>repeated string asset_names = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the assetNames at the given index.
   */
  com.google.protobuf.ByteString getAssetNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of types of the assets to receive updates. You must specify either
   * or both of asset_names and asset_types. Only asset updates matching
   * specified asset_names or asset_types are exported to the feed.
   * Example: `"compute.googleapis.com/Disk"`
   *
   * For a list of all supported asset types, see
   * [Supported asset types](/asset-inventory/docs/supported-asset-types).
   * </pre>
   *
   * <code>repeated string asset_types = 3;</code>
   *
   * @return A list containing the assetTypes.
   */
  java.util.List<java.lang.String> getAssetTypesList();

  /**
   *
   *
   * <pre>
   * A list of types of the assets to receive updates. You must specify either
   * or both of asset_names and asset_types. Only asset updates matching
   * specified asset_names or asset_types are exported to the feed.
   * Example: `"compute.googleapis.com/Disk"`
   *
   * For a list of all supported asset types, see
   * [Supported asset types](/asset-inventory/docs/supported-asset-types).
   * </pre>
   *
   * <code>repeated string asset_types = 3;</code>
   *
   * @return The count of assetTypes.
   */
  int getAssetTypesCount();

  /**
   *
   *
   * <pre>
   * A list of types of the assets to receive updates. You must specify either
   * or both of asset_names and asset_types. Only asset updates matching
   * specified asset_names or asset_types are exported to the feed.
   * Example: `"compute.googleapis.com/Disk"`
   *
   * For a list of all supported asset types, see
   * [Supported asset types](/asset-inventory/docs/supported-asset-types).
   * </pre>
   *
   * <code>repeated string asset_types = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The assetTypes at the given index.
   */
  java.lang.String getAssetTypes(int index);

  /**
   *
   *
   * <pre>
   * A list of types of the assets to receive updates. You must specify either
   * or both of asset_names and asset_types. Only asset updates matching
   * specified asset_names or asset_types are exported to the feed.
   * Example: `"compute.googleapis.com/Disk"`
   *
   * For a list of all supported asset types, see
   * [Supported asset types](/asset-inventory/docs/supported-asset-types).
   * </pre>
   *
   * <code>repeated string asset_types = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the assetTypes at the given index.
   */
  com.google.protobuf.ByteString getAssetTypesBytes(int index);

  /**
   *
   *
   * <pre>
   * Asset content type. If not specified, no content but the asset name and
   * type will be returned.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.ContentType content_type = 4;</code>
   *
   * @return The enum numeric value on the wire for contentType.
   */
  int getContentTypeValue();

  /**
   *
   *
   * <pre>
   * Asset content type. If not specified, no content but the asset name and
   * type will be returned.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.ContentType content_type = 4;</code>
   *
   * @return The contentType.
   */
  com.google.cloud.asset.v1.ContentType getContentType();

  /**
   *
   *
   * <pre>
   * Required. Feed output configuration defining where the asset updates are
   * published to.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.FeedOutputConfig feed_output_config = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the feedOutputConfig field is set.
   */
  boolean hasFeedOutputConfig();

  /**
   *
   *
   * <pre>
   * Required. Feed output configuration defining where the asset updates are
   * published to.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.FeedOutputConfig feed_output_config = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The feedOutputConfig.
   */
  com.google.cloud.asset.v1.FeedOutputConfig getFeedOutputConfig();

  /**
   *
   *
   * <pre>
   * Required. Feed output configuration defining where the asset updates are
   * published to.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.FeedOutputConfig feed_output_config = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.asset.v1.FeedOutputConfigOrBuilder getFeedOutputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * A condition which determines whether an asset update should be published.
   * If specified, an asset will be returned only when the expression evaluates
   * to true.
   * When set, `expression` field in the `Expr` must be a valid [CEL expression]
   * (https://github.com/google/cel-spec) on a TemporalAsset with name
   * `temporal_asset`. Example: a Feed with expression ("temporal_asset.deleted
   * == true") will only publish Asset deletions. Other fields of `Expr` are
   * optional.
   *
   * See our [user
   * guide](https://cloud.google.com/asset-inventory/docs/monitoring-asset-changes-with-condition)
   * for detailed instructions.
   * </pre>
   *
   * <code>.google.type.Expr condition = 6;</code>
   *
   * @return Whether the condition field is set.
   */
  boolean hasCondition();

  /**
   *
   *
   * <pre>
   * A condition which determines whether an asset update should be published.
   * If specified, an asset will be returned only when the expression evaluates
   * to true.
   * When set, `expression` field in the `Expr` must be a valid [CEL expression]
   * (https://github.com/google/cel-spec) on a TemporalAsset with name
   * `temporal_asset`. Example: a Feed with expression ("temporal_asset.deleted
   * == true") will only publish Asset deletions. Other fields of `Expr` are
   * optional.
   *
   * See our [user
   * guide](https://cloud.google.com/asset-inventory/docs/monitoring-asset-changes-with-condition)
   * for detailed instructions.
   * </pre>
   *
   * <code>.google.type.Expr condition = 6;</code>
   *
   * @return The condition.
   */
  com.google.type.Expr getCondition();

  /**
   *
   *
   * <pre>
   * A condition which determines whether an asset update should be published.
   * If specified, an asset will be returned only when the expression evaluates
   * to true.
   * When set, `expression` field in the `Expr` must be a valid [CEL expression]
   * (https://github.com/google/cel-spec) on a TemporalAsset with name
   * `temporal_asset`. Example: a Feed with expression ("temporal_asset.deleted
   * == true") will only publish Asset deletions. Other fields of `Expr` are
   * optional.
   *
   * See our [user
   * guide](https://cloud.google.com/asset-inventory/docs/monitoring-asset-changes-with-condition)
   * for detailed instructions.
   * </pre>
   *
   * <code>.google.type.Expr condition = 6;</code>
   */
  com.google.type.ExprOrBuilder getConditionOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of relationship types to output, for example:
   * `INSTANCE_TO_INSTANCEGROUP`. This field should only be specified if
   * content_type=RELATIONSHIP.
   * * If specified:
   * it outputs specified relationship updates on the [asset_names] or the
   * [asset_types]. It returns an error if any of the [relationship_types]
   * doesn't belong to the supported relationship types of the [asset_names] or
   * [asset_types], or any of the [asset_names] or the [asset_types] doesn't
   * belong to the source types of the [relationship_types].
   * * Otherwise:
   * it outputs the supported relationships of the types of [asset_names] and
   * [asset_types] or returns an error if any of the [asset_names] or the
   * [asset_types] has no replationship support.
   * See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/asset-inventory/docs/overview)
   * for all supported asset types and relationship types.
   * </pre>
   *
   * <code>repeated string relationship_types = 7;</code>
   *
   * @return A list containing the relationshipTypes.
   */
  java.util.List<java.lang.String> getRelationshipTypesList();

  /**
   *
   *
   * <pre>
   * A list of relationship types to output, for example:
   * `INSTANCE_TO_INSTANCEGROUP`. This field should only be specified if
   * content_type=RELATIONSHIP.
   * * If specified:
   * it outputs specified relationship updates on the [asset_names] or the
   * [asset_types]. It returns an error if any of the [relationship_types]
   * doesn't belong to the supported relationship types of the [asset_names] or
   * [asset_types], or any of the [asset_names] or the [asset_types] doesn't
   * belong to the source types of the [relationship_types].
   * * Otherwise:
   * it outputs the supported relationships of the types of [asset_names] and
   * [asset_types] or returns an error if any of the [asset_names] or the
   * [asset_types] has no replationship support.
   * See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/asset-inventory/docs/overview)
   * for all supported asset types and relationship types.
   * </pre>
   *
   * <code>repeated string relationship_types = 7;</code>
   *
   * @return The count of relationshipTypes.
   */
  int getRelationshipTypesCount();

  /**
   *
   *
   * <pre>
   * A list of relationship types to output, for example:
   * `INSTANCE_TO_INSTANCEGROUP`. This field should only be specified if
   * content_type=RELATIONSHIP.
   * * If specified:
   * it outputs specified relationship updates on the [asset_names] or the
   * [asset_types]. It returns an error if any of the [relationship_types]
   * doesn't belong to the supported relationship types of the [asset_names] or
   * [asset_types], or any of the [asset_names] or the [asset_types] doesn't
   * belong to the source types of the [relationship_types].
   * * Otherwise:
   * it outputs the supported relationships of the types of [asset_names] and
   * [asset_types] or returns an error if any of the [asset_names] or the
   * [asset_types] has no replationship support.
   * See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/asset-inventory/docs/overview)
   * for all supported asset types and relationship types.
   * </pre>
   *
   * <code>repeated string relationship_types = 7;</code>
   *
   * @param index The index of the element to return.
   * @return The relationshipTypes at the given index.
   */
  java.lang.String getRelationshipTypes(int index);

  /**
   *
   *
   * <pre>
   * A list of relationship types to output, for example:
   * `INSTANCE_TO_INSTANCEGROUP`. This field should only be specified if
   * content_type=RELATIONSHIP.
   * * If specified:
   * it outputs specified relationship updates on the [asset_names] or the
   * [asset_types]. It returns an error if any of the [relationship_types]
   * doesn't belong to the supported relationship types of the [asset_names] or
   * [asset_types], or any of the [asset_names] or the [asset_types] doesn't
   * belong to the source types of the [relationship_types].
   * * Otherwise:
   * it outputs the supported relationships of the types of [asset_names] and
   * [asset_types] or returns an error if any of the [asset_names] or the
   * [asset_types] has no replationship support.
   * See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/asset-inventory/docs/overview)
   * for all supported asset types and relationship types.
   * </pre>
   *
   * <code>repeated string relationship_types = 7;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the relationshipTypes at the given index.
   */
  com.google.protobuf.ByteString getRelationshipTypesBytes(int index);
}
