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
// source: google/cloud/contentwarehouse/v1/histogram.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.contentwarehouse.v1;

public interface HistogramQueryPropertyNameFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * This filter specifies the exact document schema(s)
   * [Document.document_schema_name][google.cloud.contentwarehouse.v1.Document.document_schema_name]
   * to run histogram query against. It is optional. It will perform histogram
   * for property names for all the document schemas if it is not set.
   *
   * At most 10 document schema names are allowed.
   * Format:
   * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
   * </pre>
   *
   * <code>repeated string document_schemas = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return A list containing the documentSchemas.
   */
  java.util.List<java.lang.String> getDocumentSchemasList();

  /**
   *
   *
   * <pre>
   * This filter specifies the exact document schema(s)
   * [Document.document_schema_name][google.cloud.contentwarehouse.v1.Document.document_schema_name]
   * to run histogram query against. It is optional. It will perform histogram
   * for property names for all the document schemas if it is not set.
   *
   * At most 10 document schema names are allowed.
   * Format:
   * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
   * </pre>
   *
   * <code>repeated string document_schemas = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The count of documentSchemas.
   */
  int getDocumentSchemasCount();

  /**
   *
   *
   * <pre>
   * This filter specifies the exact document schema(s)
   * [Document.document_schema_name][google.cloud.contentwarehouse.v1.Document.document_schema_name]
   * to run histogram query against. It is optional. It will perform histogram
   * for property names for all the document schemas if it is not set.
   *
   * At most 10 document schema names are allowed.
   * Format:
   * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
   * </pre>
   *
   * <code>repeated string document_schemas = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the element to return.
   * @return The documentSchemas at the given index.
   */
  java.lang.String getDocumentSchemas(int index);

  /**
   *
   *
   * <pre>
   * This filter specifies the exact document schema(s)
   * [Document.document_schema_name][google.cloud.contentwarehouse.v1.Document.document_schema_name]
   * to run histogram query against. It is optional. It will perform histogram
   * for property names for all the document schemas if it is not set.
   *
   * At most 10 document schema names are allowed.
   * Format:
   * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
   * </pre>
   *
   * <code>repeated string document_schemas = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the documentSchemas at the given index.
   */
  com.google.protobuf.ByteString getDocumentSchemasBytes(int index);

  /**
   *
   *
   * <pre>
   * It is optional. It will perform histogram for all the property names if it
   * is not set.
   * The properties need to be defined with the is_filterable flag set to
   * true and the name of the property should be in the format:
   * "schemaId.propertyName". The property needs to be defined in the schema.
   * Example: the schema id is abc. Then the name of property for property
   * MORTGAGE_TYPE will be "abc.MORTGAGE_TYPE".
   * </pre>
   *
   * <code>repeated string property_names = 2;</code>
   *
   * @return A list containing the propertyNames.
   */
  java.util.List<java.lang.String> getPropertyNamesList();

  /**
   *
   *
   * <pre>
   * It is optional. It will perform histogram for all the property names if it
   * is not set.
   * The properties need to be defined with the is_filterable flag set to
   * true and the name of the property should be in the format:
   * "schemaId.propertyName". The property needs to be defined in the schema.
   * Example: the schema id is abc. Then the name of property for property
   * MORTGAGE_TYPE will be "abc.MORTGAGE_TYPE".
   * </pre>
   *
   * <code>repeated string property_names = 2;</code>
   *
   * @return The count of propertyNames.
   */
  int getPropertyNamesCount();

  /**
   *
   *
   * <pre>
   * It is optional. It will perform histogram for all the property names if it
   * is not set.
   * The properties need to be defined with the is_filterable flag set to
   * true and the name of the property should be in the format:
   * "schemaId.propertyName". The property needs to be defined in the schema.
   * Example: the schema id is abc. Then the name of property for property
   * MORTGAGE_TYPE will be "abc.MORTGAGE_TYPE".
   * </pre>
   *
   * <code>repeated string property_names = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The propertyNames at the given index.
   */
  java.lang.String getPropertyNames(int index);

  /**
   *
   *
   * <pre>
   * It is optional. It will perform histogram for all the property names if it
   * is not set.
   * The properties need to be defined with the is_filterable flag set to
   * true and the name of the property should be in the format:
   * "schemaId.propertyName". The property needs to be defined in the schema.
   * Example: the schema id is abc. Then the name of property for property
   * MORTGAGE_TYPE will be "abc.MORTGAGE_TYPE".
   * </pre>
   *
   * <code>repeated string property_names = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the propertyNames at the given index.
   */
  com.google.protobuf.ByteString getPropertyNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * By default, the y_axis is HISTOGRAM_YAXIS_DOCUMENT if this field is not
   * set.
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter.HistogramYAxis y_axis = 3;
   * </code>
   *
   * @return The enum numeric value on the wire for yAxis.
   */
  int getYAxisValue();

  /**
   *
   *
   * <pre>
   * By default, the y_axis is HISTOGRAM_YAXIS_DOCUMENT if this field is not
   * set.
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter.HistogramYAxis y_axis = 3;
   * </code>
   *
   * @return The yAxis.
   */
  com.google.cloud.contentwarehouse.v1.HistogramQueryPropertyNameFilter.HistogramYAxis getYAxis();
}
