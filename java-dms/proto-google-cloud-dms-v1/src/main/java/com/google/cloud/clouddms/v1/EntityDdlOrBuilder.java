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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.clouddms.v1;

public interface EntityDdlOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.EntityDdl)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Type of DDL (Create, Alter).
   * </pre>
   *
   * <code>string ddl_type = 1;</code>
   *
   * @return The ddlType.
   */
  java.lang.String getDdlType();

  /**
   *
   *
   * <pre>
   * Type of DDL (Create, Alter).
   * </pre>
   *
   * <code>string ddl_type = 1;</code>
   *
   * @return The bytes for ddlType.
   */
  com.google.protobuf.ByteString getDdlTypeBytes();

  /**
   *
   *
   * <pre>
   * The name of the database entity the ddl refers to.
   * </pre>
   *
   * <code>string entity = 2;</code>
   *
   * @return The entity.
   */
  java.lang.String getEntity();

  /**
   *
   *
   * <pre>
   * The name of the database entity the ddl refers to.
   * </pre>
   *
   * <code>string entity = 2;</code>
   *
   * @return The bytes for entity.
   */
  com.google.protobuf.ByteString getEntityBytes();

  /**
   *
   *
   * <pre>
   * The actual ddl code.
   * </pre>
   *
   * <code>string ddl = 3;</code>
   *
   * @return The ddl.
   */
  java.lang.String getDdl();

  /**
   *
   *
   * <pre>
   * The actual ddl code.
   * </pre>
   *
   * <code>string ddl = 3;</code>
   *
   * @return The bytes for ddl.
   */
  com.google.protobuf.ByteString getDdlBytes();

  /**
   *
   *
   * <pre>
   * The entity type (if the DDL is for a sub entity).
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.DatabaseEntityType entity_type = 4;</code>
   *
   * @return The enum numeric value on the wire for entityType.
   */
  int getEntityTypeValue();

  /**
   *
   *
   * <pre>
   * The entity type (if the DDL is for a sub entity).
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.DatabaseEntityType entity_type = 4;</code>
   *
   * @return The entityType.
   */
  com.google.cloud.clouddms.v1.DatabaseEntityType getEntityType();

  /**
   *
   *
   * <pre>
   * EntityIssues found for this ddl.
   * </pre>
   *
   * <code>repeated string issue_id = 100;</code>
   *
   * @return A list containing the issueId.
   */
  java.util.List<java.lang.String> getIssueIdList();

  /**
   *
   *
   * <pre>
   * EntityIssues found for this ddl.
   * </pre>
   *
   * <code>repeated string issue_id = 100;</code>
   *
   * @return The count of issueId.
   */
  int getIssueIdCount();

  /**
   *
   *
   * <pre>
   * EntityIssues found for this ddl.
   * </pre>
   *
   * <code>repeated string issue_id = 100;</code>
   *
   * @param index The index of the element to return.
   * @return The issueId at the given index.
   */
  java.lang.String getIssueId(int index);

  /**
   *
   *
   * <pre>
   * EntityIssues found for this ddl.
   * </pre>
   *
   * <code>repeated string issue_id = 100;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the issueId at the given index.
   */
  com.google.protobuf.ByteString getIssueIdBytes(int index);
}
