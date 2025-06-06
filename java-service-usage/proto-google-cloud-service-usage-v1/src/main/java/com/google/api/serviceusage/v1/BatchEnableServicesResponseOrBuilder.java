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
// source: google/api/serviceusage/v1/serviceusage.proto

// Protobuf Java Version: 3.25.8
package com.google.api.serviceusage.v1;

public interface BatchEnableServicesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1.BatchEnableServicesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The new state of the services after enabling.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1;</code>
   */
  java.util.List<com.google.api.serviceusage.v1.Service> getServicesList();

  /**
   *
   *
   * <pre>
   * The new state of the services after enabling.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1;</code>
   */
  com.google.api.serviceusage.v1.Service getServices(int index);

  /**
   *
   *
   * <pre>
   * The new state of the services after enabling.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1;</code>
   */
  int getServicesCount();

  /**
   *
   *
   * <pre>
   * The new state of the services after enabling.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1;</code>
   */
  java.util.List<? extends com.google.api.serviceusage.v1.ServiceOrBuilder>
      getServicesOrBuilderList();

  /**
   *
   *
   * <pre>
   * The new state of the services after enabling.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1;</code>
   */
  com.google.api.serviceusage.v1.ServiceOrBuilder getServicesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If allow_partial_success is true, and one or more services could not be
   * enabled, this field contains the details about each failure.
   * </pre>
   *
   * <code>
   * repeated .google.api.serviceusage.v1.BatchEnableServicesResponse.EnableFailure failures = 2;
   * </code>
   */
  java.util.List<com.google.api.serviceusage.v1.BatchEnableServicesResponse.EnableFailure>
      getFailuresList();

  /**
   *
   *
   * <pre>
   * If allow_partial_success is true, and one or more services could not be
   * enabled, this field contains the details about each failure.
   * </pre>
   *
   * <code>
   * repeated .google.api.serviceusage.v1.BatchEnableServicesResponse.EnableFailure failures = 2;
   * </code>
   */
  com.google.api.serviceusage.v1.BatchEnableServicesResponse.EnableFailure getFailures(int index);

  /**
   *
   *
   * <pre>
   * If allow_partial_success is true, and one or more services could not be
   * enabled, this field contains the details about each failure.
   * </pre>
   *
   * <code>
   * repeated .google.api.serviceusage.v1.BatchEnableServicesResponse.EnableFailure failures = 2;
   * </code>
   */
  int getFailuresCount();

  /**
   *
   *
   * <pre>
   * If allow_partial_success is true, and one or more services could not be
   * enabled, this field contains the details about each failure.
   * </pre>
   *
   * <code>
   * repeated .google.api.serviceusage.v1.BatchEnableServicesResponse.EnableFailure failures = 2;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.api.serviceusage.v1.BatchEnableServicesResponse.EnableFailureOrBuilder>
      getFailuresOrBuilderList();

  /**
   *
   *
   * <pre>
   * If allow_partial_success is true, and one or more services could not be
   * enabled, this field contains the details about each failure.
   * </pre>
   *
   * <code>
   * repeated .google.api.serviceusage.v1.BatchEnableServicesResponse.EnableFailure failures = 2;
   * </code>
   */
  com.google.api.serviceusage.v1.BatchEnableServicesResponse.EnableFailureOrBuilder
      getFailuresOrBuilder(int index);
}
