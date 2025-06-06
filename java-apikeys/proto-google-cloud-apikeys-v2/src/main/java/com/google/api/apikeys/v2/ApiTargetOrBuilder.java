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
// source: google/api/apikeys/v2/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.api.apikeys.v2;

public interface ApiTargetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.apikeys.v2.ApiTarget)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The service for this restriction. It should be the canonical
   * service name, for example: `translate.googleapis.com`.
   * You can use [`gcloud services list`](/sdk/gcloud/reference/services/list)
   * to get a list of services that are enabled in the project.
   * </pre>
   *
   * <code>string service = 1;</code>
   *
   * @return The service.
   */
  java.lang.String getService();

  /**
   *
   *
   * <pre>
   * The service for this restriction. It should be the canonical
   * service name, for example: `translate.googleapis.com`.
   * You can use [`gcloud services list`](/sdk/gcloud/reference/services/list)
   * to get a list of services that are enabled in the project.
   * </pre>
   *
   * <code>string service = 1;</code>
   *
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString getServiceBytes();

  /**
   *
   *
   * <pre>
   * Optional. List of one or more methods that can be called.
   * If empty, all methods for the service are allowed. A wildcard
   * (*) can be used as the last symbol.
   * Valid examples:
   *   `google.cloud.translate.v2.TranslateService.GetSupportedLanguage`
   *   `TranslateText`
   *   `Get*`
   *   `translate.googleapis.com.Get*`
   * </pre>
   *
   * <code>repeated string methods = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the methods.
   */
  java.util.List<java.lang.String> getMethodsList();

  /**
   *
   *
   * <pre>
   * Optional. List of one or more methods that can be called.
   * If empty, all methods for the service are allowed. A wildcard
   * (*) can be used as the last symbol.
   * Valid examples:
   *   `google.cloud.translate.v2.TranslateService.GetSupportedLanguage`
   *   `TranslateText`
   *   `Get*`
   *   `translate.googleapis.com.Get*`
   * </pre>
   *
   * <code>repeated string methods = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of methods.
   */
  int getMethodsCount();

  /**
   *
   *
   * <pre>
   * Optional. List of one or more methods that can be called.
   * If empty, all methods for the service are allowed. A wildcard
   * (*) can be used as the last symbol.
   * Valid examples:
   *   `google.cloud.translate.v2.TranslateService.GetSupportedLanguage`
   *   `TranslateText`
   *   `Get*`
   *   `translate.googleapis.com.Get*`
   * </pre>
   *
   * <code>repeated string methods = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The methods at the given index.
   */
  java.lang.String getMethods(int index);

  /**
   *
   *
   * <pre>
   * Optional. List of one or more methods that can be called.
   * If empty, all methods for the service are allowed. A wildcard
   * (*) can be used as the last symbol.
   * Valid examples:
   *   `google.cloud.translate.v2.TranslateService.GetSupportedLanguage`
   *   `TranslateText`
   *   `Get*`
   *   `translate.googleapis.com.Get*`
   * </pre>
   *
   * <code>repeated string methods = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the methods at the given index.
   */
  com.google.protobuf.ByteString getMethodsBytes(int index);
}
