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
// source: google/cloud/aiplatform/v1beta1/feature_online_store_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface FeatureViewDirectWriteRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.FeatureViewDirectWriteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * FeatureView resource format
   * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}/featureViews/{featureView}`
   * </pre>
   *
   * <code>string feature_view = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The featureView.
   */
  java.lang.String getFeatureView();

  /**
   *
   *
   * <pre>
   * FeatureView resource format
   * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}/featureViews/{featureView}`
   * </pre>
   *
   * <code>string feature_view = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for featureView.
   */
  com.google.protobuf.ByteString getFeatureViewBytes();

  /**
   *
   *
   * <pre>
   * Required. The data keys and associated feature values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.FeatureViewDirectWriteRequest.DataKeyAndFeatureValues data_key_and_feature_values = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<
          com.google.cloud.aiplatform.v1beta1.FeatureViewDirectWriteRequest.DataKeyAndFeatureValues>
      getDataKeyAndFeatureValuesList();

  /**
   *
   *
   * <pre>
   * Required. The data keys and associated feature values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.FeatureViewDirectWriteRequest.DataKeyAndFeatureValues data_key_and_feature_values = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureViewDirectWriteRequest.DataKeyAndFeatureValues
      getDataKeyAndFeatureValues(int index);

  /**
   *
   *
   * <pre>
   * Required. The data keys and associated feature values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.FeatureViewDirectWriteRequest.DataKeyAndFeatureValues data_key_and_feature_values = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getDataKeyAndFeatureValuesCount();

  /**
   *
   *
   * <pre>
   * Required. The data keys and associated feature values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.FeatureViewDirectWriteRequest.DataKeyAndFeatureValues data_key_and_feature_values = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.aiplatform.v1beta1.FeatureViewDirectWriteRequest
                  .DataKeyAndFeatureValuesOrBuilder>
      getDataKeyAndFeatureValuesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Required. The data keys and associated feature values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.FeatureViewDirectWriteRequest.DataKeyAndFeatureValues data_key_and_feature_values = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureViewDirectWriteRequest.DataKeyAndFeatureValuesOrBuilder
      getDataKeyAndFeatureValuesOrBuilder(int index);
}
