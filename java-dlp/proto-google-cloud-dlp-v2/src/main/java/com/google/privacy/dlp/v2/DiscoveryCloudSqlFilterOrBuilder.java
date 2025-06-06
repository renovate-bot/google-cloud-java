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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.8
package com.google.privacy.dlp.v2;

public interface DiscoveryCloudSqlFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.DiscoveryCloudSqlFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A specific set of database resources for this filter to apply to.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DatabaseResourceCollection collection = 1;</code>
   *
   * @return Whether the collection field is set.
   */
  boolean hasCollection();

  /**
   *
   *
   * <pre>
   * A specific set of database resources for this filter to apply to.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DatabaseResourceCollection collection = 1;</code>
   *
   * @return The collection.
   */
  com.google.privacy.dlp.v2.DatabaseResourceCollection getCollection();

  /**
   *
   *
   * <pre>
   * A specific set of database resources for this filter to apply to.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DatabaseResourceCollection collection = 1;</code>
   */
  com.google.privacy.dlp.v2.DatabaseResourceCollectionOrBuilder getCollectionOrBuilder();

  /**
   *
   *
   * <pre>
   * Catch-all. This should always be the last target in the list because
   * anything above it will apply first. Should only appear once in a
   * configuration. If none is specified, a default one will be added
   * automatically.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.AllOtherDatabaseResources others = 2;</code>
   *
   * @return Whether the others field is set.
   */
  boolean hasOthers();

  /**
   *
   *
   * <pre>
   * Catch-all. This should always be the last target in the list because
   * anything above it will apply first. Should only appear once in a
   * configuration. If none is specified, a default one will be added
   * automatically.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.AllOtherDatabaseResources others = 2;</code>
   *
   * @return The others.
   */
  com.google.privacy.dlp.v2.AllOtherDatabaseResources getOthers();

  /**
   *
   *
   * <pre>
   * Catch-all. This should always be the last target in the list because
   * anything above it will apply first. Should only appear once in a
   * configuration. If none is specified, a default one will be added
   * automatically.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.AllOtherDatabaseResources others = 2;</code>
   */
  com.google.privacy.dlp.v2.AllOtherDatabaseResourcesOrBuilder getOthersOrBuilder();

  /**
   *
   *
   * <pre>
   * The database resource to scan. Targets including this can only include
   * one target (the target with this database resource reference).
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DatabaseResourceReference database_resource_reference = 3;</code>
   *
   * @return Whether the databaseResourceReference field is set.
   */
  boolean hasDatabaseResourceReference();

  /**
   *
   *
   * <pre>
   * The database resource to scan. Targets including this can only include
   * one target (the target with this database resource reference).
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DatabaseResourceReference database_resource_reference = 3;</code>
   *
   * @return The databaseResourceReference.
   */
  com.google.privacy.dlp.v2.DatabaseResourceReference getDatabaseResourceReference();

  /**
   *
   *
   * <pre>
   * The database resource to scan. Targets including this can only include
   * one target (the target with this database resource reference).
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DatabaseResourceReference database_resource_reference = 3;</code>
   */
  com.google.privacy.dlp.v2.DatabaseResourceReferenceOrBuilder
      getDatabaseResourceReferenceOrBuilder();

  com.google.privacy.dlp.v2.DiscoveryCloudSqlFilter.FilterCase getFilterCase();
}
