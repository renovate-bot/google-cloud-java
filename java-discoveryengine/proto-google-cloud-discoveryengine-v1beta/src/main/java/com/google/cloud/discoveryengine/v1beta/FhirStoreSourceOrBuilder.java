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
// source: google/cloud/discoveryengine/v1beta/import_config.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1beta;

public interface FhirStoreSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.FhirStoreSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The full resource name of the FHIR store to import data from, in
   * the format of
   * `projects/{project}/locations/{location}/datasets/{dataset}/fhirStores/{fhir_store}`.
   * </pre>
   *
   * <code>
   * string fhir_store = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The fhirStore.
   */
  java.lang.String getFhirStore();

  /**
   *
   *
   * <pre>
   * Required. The full resource name of the FHIR store to import data from, in
   * the format of
   * `projects/{project}/locations/{location}/datasets/{dataset}/fhirStores/{fhir_store}`.
   * </pre>
   *
   * <code>
   * string fhir_store = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for fhirStore.
   */
  com.google.protobuf.ByteString getFhirStoreBytes();

  /**
   *
   *
   * <pre>
   * Intermediate Cloud Storage directory used for the import with a length
   * limit of 2,000 characters. Can be specified if one wants to have the
   * FhirStore export to a specific Cloud Storage directory.
   * </pre>
   *
   * <code>string gcs_staging_dir = 2;</code>
   *
   * @return The gcsStagingDir.
   */
  java.lang.String getGcsStagingDir();

  /**
   *
   *
   * <pre>
   * Intermediate Cloud Storage directory used for the import with a length
   * limit of 2,000 characters. Can be specified if one wants to have the
   * FhirStore export to a specific Cloud Storage directory.
   * </pre>
   *
   * <code>string gcs_staging_dir = 2;</code>
   *
   * @return The bytes for gcsStagingDir.
   */
  com.google.protobuf.ByteString getGcsStagingDirBytes();

  /**
   *
   *
   * <pre>
   * The FHIR resource types to import. The resource types should be a subset of
   * all [supported FHIR resource
   * types](https://cloud.google.com/generative-ai-app-builder/docs/fhir-schema-reference#resource-level-specification).
   * Default to all supported FHIR resource types if empty.
   * </pre>
   *
   * <code>repeated string resource_types = 3;</code>
   *
   * @return A list containing the resourceTypes.
   */
  java.util.List<java.lang.String> getResourceTypesList();

  /**
   *
   *
   * <pre>
   * The FHIR resource types to import. The resource types should be a subset of
   * all [supported FHIR resource
   * types](https://cloud.google.com/generative-ai-app-builder/docs/fhir-schema-reference#resource-level-specification).
   * Default to all supported FHIR resource types if empty.
   * </pre>
   *
   * <code>repeated string resource_types = 3;</code>
   *
   * @return The count of resourceTypes.
   */
  int getResourceTypesCount();

  /**
   *
   *
   * <pre>
   * The FHIR resource types to import. The resource types should be a subset of
   * all [supported FHIR resource
   * types](https://cloud.google.com/generative-ai-app-builder/docs/fhir-schema-reference#resource-level-specification).
   * Default to all supported FHIR resource types if empty.
   * </pre>
   *
   * <code>repeated string resource_types = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The resourceTypes at the given index.
   */
  java.lang.String getResourceTypes(int index);

  /**
   *
   *
   * <pre>
   * The FHIR resource types to import. The resource types should be a subset of
   * all [supported FHIR resource
   * types](https://cloud.google.com/generative-ai-app-builder/docs/fhir-schema-reference#resource-level-specification).
   * Default to all supported FHIR resource types if empty.
   * </pre>
   *
   * <code>repeated string resource_types = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the resourceTypes at the given index.
   */
  com.google.protobuf.ByteString getResourceTypesBytes(int index);
}
