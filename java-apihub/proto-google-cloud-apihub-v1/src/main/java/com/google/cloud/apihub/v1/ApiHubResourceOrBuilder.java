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
// source: google/cloud/apihub/v1/apihub_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.apihub.v1;

public interface ApiHubResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apihub.v1.ApiHubResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * This represents Api resource in search results. Only name, display_name,
   * description and owner fields are populated in search results.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Api api = 1;</code>
   *
   * @return Whether the api field is set.
   */
  boolean hasApi();

  /**
   *
   *
   * <pre>
   * This represents Api resource in search results. Only name, display_name,
   * description and owner fields are populated in search results.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Api api = 1;</code>
   *
   * @return The api.
   */
  com.google.cloud.apihub.v1.Api getApi();

  /**
   *
   *
   * <pre>
   * This represents Api resource in search results. Only name, display_name,
   * description and owner fields are populated in search results.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Api api = 1;</code>
   */
  com.google.cloud.apihub.v1.ApiOrBuilder getApiOrBuilder();

  /**
   *
   *
   * <pre>
   * This represents ApiOperation resource in search results. Only name,
   * and description fields are populated in search results.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.ApiOperation operation = 2;</code>
   *
   * @return Whether the operation field is set.
   */
  boolean hasOperation();

  /**
   *
   *
   * <pre>
   * This represents ApiOperation resource in search results. Only name,
   * and description fields are populated in search results.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.ApiOperation operation = 2;</code>
   *
   * @return The operation.
   */
  com.google.cloud.apihub.v1.ApiOperation getOperation();

  /**
   *
   *
   * <pre>
   * This represents ApiOperation resource in search results. Only name,
   * and description fields are populated in search results.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.ApiOperation operation = 2;</code>
   */
  com.google.cloud.apihub.v1.ApiOperationOrBuilder getOperationOrBuilder();

  /**
   *
   *
   * <pre>
   * This represents Deployment resource in search results. Only name,
   * display_name and description fields are populated in search results.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Deployment deployment = 3;</code>
   *
   * @return Whether the deployment field is set.
   */
  boolean hasDeployment();

  /**
   *
   *
   * <pre>
   * This represents Deployment resource in search results. Only name,
   * display_name and description fields are populated in search results.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Deployment deployment = 3;</code>
   *
   * @return The deployment.
   */
  com.google.cloud.apihub.v1.Deployment getDeployment();

  /**
   *
   *
   * <pre>
   * This represents Deployment resource in search results. Only name,
   * display_name and description fields are populated in search results.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Deployment deployment = 3;</code>
   */
  com.google.cloud.apihub.v1.DeploymentOrBuilder getDeploymentOrBuilder();

  /**
   *
   *
   * <pre>
   * This represents Spec resource in search results. Only name,
   * display_name and description fields are populated in search results.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Spec spec = 4;</code>
   *
   * @return Whether the spec field is set.
   */
  boolean hasSpec();

  /**
   *
   *
   * <pre>
   * This represents Spec resource in search results. Only name,
   * display_name and description fields are populated in search results.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Spec spec = 4;</code>
   *
   * @return The spec.
   */
  com.google.cloud.apihub.v1.Spec getSpec();

  /**
   *
   *
   * <pre>
   * This represents Spec resource in search results. Only name,
   * display_name and description fields are populated in search results.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Spec spec = 4;</code>
   */
  com.google.cloud.apihub.v1.SpecOrBuilder getSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * This represents Definition resource in search results.
   * Only name field is populated in search results.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Definition definition = 5;</code>
   *
   * @return Whether the definition field is set.
   */
  boolean hasDefinition();

  /**
   *
   *
   * <pre>
   * This represents Definition resource in search results.
   * Only name field is populated in search results.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Definition definition = 5;</code>
   *
   * @return The definition.
   */
  com.google.cloud.apihub.v1.Definition getDefinition();

  /**
   *
   *
   * <pre>
   * This represents Definition resource in search results.
   * Only name field is populated in search results.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Definition definition = 5;</code>
   */
  com.google.cloud.apihub.v1.DefinitionOrBuilder getDefinitionOrBuilder();

  /**
   *
   *
   * <pre>
   * This represents Version resource in search results. Only name,
   * display_name and description fields are populated in search results.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Version version = 6;</code>
   *
   * @return Whether the version field is set.
   */
  boolean hasVersion();

  /**
   *
   *
   * <pre>
   * This represents Version resource in search results. Only name,
   * display_name and description fields are populated in search results.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Version version = 6;</code>
   *
   * @return The version.
   */
  com.google.cloud.apihub.v1.Version getVersion();

  /**
   *
   *
   * <pre>
   * This represents Version resource in search results. Only name,
   * display_name and description fields are populated in search results.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Version version = 6;</code>
   */
  com.google.cloud.apihub.v1.VersionOrBuilder getVersionOrBuilder();

  com.google.cloud.apihub.v1.ApiHubResource.ResourceCase getResourceCase();
}
