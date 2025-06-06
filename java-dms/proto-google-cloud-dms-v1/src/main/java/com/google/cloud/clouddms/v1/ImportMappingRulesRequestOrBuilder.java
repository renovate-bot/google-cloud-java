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
// source: google/cloud/clouddms/v1/clouddms.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.clouddms.v1;

public interface ImportMappingRulesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.ImportMappingRulesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the conversion workspace resource to import the rules to
   * in the form of:
   * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
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
   * Required. Name of the conversion workspace resource to import the rules to
   * in the form of:
   * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
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
   * Required. The format of the rules content file.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ImportRulesFileFormat rules_format = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for rulesFormat.
   */
  int getRulesFormatValue();

  /**
   *
   *
   * <pre>
   * Required. The format of the rules content file.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ImportRulesFileFormat rules_format = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The rulesFormat.
   */
  com.google.cloud.clouddms.v1.ImportRulesFileFormat getRulesFormat();

  /**
   *
   *
   * <pre>
   * Required. One or more rules files.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.clouddms.v1.ImportMappingRulesRequest.RulesFile rules_files = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.clouddms.v1.ImportMappingRulesRequest.RulesFile>
      getRulesFilesList();

  /**
   *
   *
   * <pre>
   * Required. One or more rules files.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.clouddms.v1.ImportMappingRulesRequest.RulesFile rules_files = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.clouddms.v1.ImportMappingRulesRequest.RulesFile getRulesFiles(int index);

  /**
   *
   *
   * <pre>
   * Required. One or more rules files.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.clouddms.v1.ImportMappingRulesRequest.RulesFile rules_files = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getRulesFilesCount();

  /**
   *
   *
   * <pre>
   * Required. One or more rules files.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.clouddms.v1.ImportMappingRulesRequest.RulesFile rules_files = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.clouddms.v1.ImportMappingRulesRequest.RulesFileOrBuilder>
      getRulesFilesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Required. One or more rules files.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.clouddms.v1.ImportMappingRulesRequest.RulesFile rules_files = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.clouddms.v1.ImportMappingRulesRequest.RulesFileOrBuilder getRulesFilesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Required. Should the conversion workspace be committed automatically after
   * the import operation.
   * </pre>
   *
   * <code>bool auto_commit = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The autoCommit.
   */
  boolean getAutoCommit();
}
