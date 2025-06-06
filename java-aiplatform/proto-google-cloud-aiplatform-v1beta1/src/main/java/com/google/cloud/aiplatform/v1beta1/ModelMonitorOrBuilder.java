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
// source: google/cloud/aiplatform/v1beta1/model_monitor.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface ModelMonitorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ModelMonitor)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional default tabular model monitoring objective.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveSpec.TabularObjective tabular_objective = 11;
   * </code>
   *
   * @return Whether the tabularObjective field is set.
   */
  boolean hasTabularObjective();

  /**
   *
   *
   * <pre>
   * Optional default tabular model monitoring objective.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveSpec.TabularObjective tabular_objective = 11;
   * </code>
   *
   * @return The tabularObjective.
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveSpec.TabularObjective
      getTabularObjective();

  /**
   *
   *
   * <pre>
   * Optional default tabular model monitoring objective.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveSpec.TabularObjective tabular_objective = 11;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveSpec.TabularObjectiveOrBuilder
      getTabularObjectiveOrBuilder();

  /**
   *
   *
   * <pre>
   * Immutable. Resource name of the ModelMonitor. Format:
   * `projects/{project}/locations/{location}/modelMonitors/{model_monitor}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Immutable. Resource name of the ModelMonitor. Format:
   * `projects/{project}/locations/{location}/modelMonitors/{model_monitor}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The display name of the ModelMonitor.
   * The name can be up to 128 characters long and can consist of any UTF-8.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * The display name of the ModelMonitor.
   * The name can be up to 128 characters long and can consist of any UTF-8.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The entity that is subject to analysis.
   * Currently only models in Vertex AI Model Registry are supported. If you
   * want to analyze the model which is outside the Vertex AI, you could
   * register a model in Vertex AI Model Registry using just a display name.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitor.ModelMonitoringTarget model_monitoring_target = 3;
   * </code>
   *
   * @return Whether the modelMonitoringTarget field is set.
   */
  boolean hasModelMonitoringTarget();

  /**
   *
   *
   * <pre>
   * The entity that is subject to analysis.
   * Currently only models in Vertex AI Model Registry are supported. If you
   * want to analyze the model which is outside the Vertex AI, you could
   * register a model in Vertex AI Model Registry using just a display name.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitor.ModelMonitoringTarget model_monitoring_target = 3;
   * </code>
   *
   * @return The modelMonitoringTarget.
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitor.ModelMonitoringTarget getModelMonitoringTarget();

  /**
   *
   *
   * <pre>
   * The entity that is subject to analysis.
   * Currently only models in Vertex AI Model Registry are supported. If you
   * want to analyze the model which is outside the Vertex AI, you could
   * register a model in Vertex AI Model Registry using just a display name.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitor.ModelMonitoringTarget model_monitoring_target = 3;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitor.ModelMonitoringTargetOrBuilder
      getModelMonitoringTargetOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional training dataset used to train the model.
   * It can serve as a reference dataset to identify changes in production.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringInput training_dataset = 10;</code>
   *
   * @return Whether the trainingDataset field is set.
   */
  boolean hasTrainingDataset();

  /**
   *
   *
   * <pre>
   * Optional training dataset used to train the model.
   * It can serve as a reference dataset to identify changes in production.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringInput training_dataset = 10;</code>
   *
   * @return The trainingDataset.
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringInput getTrainingDataset();

  /**
   *
   *
   * <pre>
   * Optional training dataset used to train the model.
   * It can serve as a reference dataset to identify changes in production.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringInput training_dataset = 10;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringInputOrBuilder getTrainingDatasetOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional default notification spec, it can be overridden in the
   * ModelMonitoringJob notification spec.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringNotificationSpec notification_spec = 12;
   * </code>
   *
   * @return Whether the notificationSpec field is set.
   */
  boolean hasNotificationSpec();

  /**
   *
   *
   * <pre>
   * Optional default notification spec, it can be overridden in the
   * ModelMonitoringJob notification spec.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringNotificationSpec notification_spec = 12;
   * </code>
   *
   * @return The notificationSpec.
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringNotificationSpec getNotificationSpec();

  /**
   *
   *
   * <pre>
   * Optional default notification spec, it can be overridden in the
   * ModelMonitoringJob notification spec.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringNotificationSpec notification_spec = 12;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringNotificationSpecOrBuilder
      getNotificationSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional default monitoring metrics/logs export spec, it can be overridden
   * in the ModelMonitoringJob output spec.
   * If not specified, a default Google Cloud Storage bucket will be created
   * under your project.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec output_spec = 13;</code>
   *
   * @return Whether the outputSpec field is set.
   */
  boolean hasOutputSpec();

  /**
   *
   *
   * <pre>
   * Optional default monitoring metrics/logs export spec, it can be overridden
   * in the ModelMonitoringJob output spec.
   * If not specified, a default Google Cloud Storage bucket will be created
   * under your project.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec output_spec = 13;</code>
   *
   * @return The outputSpec.
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec getOutputSpec();

  /**
   *
   *
   * <pre>
   * Optional default monitoring metrics/logs export spec, it can be overridden
   * in the ModelMonitoringJob output spec.
   * If not specified, a default Google Cloud Storage bucket will be created
   * under your project.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec output_spec = 13;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpecOrBuilder getOutputSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional model explanation spec. It is used for feature attribution
   * monitoring.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationSpec explanation_spec = 16;</code>
   *
   * @return Whether the explanationSpec field is set.
   */
  boolean hasExplanationSpec();

  /**
   *
   *
   * <pre>
   * Optional model explanation spec. It is used for feature attribution
   * monitoring.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationSpec explanation_spec = 16;</code>
   *
   * @return The explanationSpec.
   */
  com.google.cloud.aiplatform.v1beta1.ExplanationSpec getExplanationSpec();

  /**
   *
   *
   * <pre>
   * Optional model explanation spec. It is used for feature attribution
   * monitoring.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationSpec explanation_spec = 16;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ExplanationSpecOrBuilder getExplanationSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Monitoring Schema is to specify the model's features, prediction outputs
   * and ground truth properties. It is used to extract pertinent data from the
   * dataset and to process features based on their properties.
   * Make sure that the schema aligns with your dataset, if it does not, we will
   * be unable to extract data from the dataset.
   * It is required for most models, but optional for Vertex AI AutoML Tables
   * unless the schem information is not available.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringSchema model_monitoring_schema = 9;
   * </code>
   *
   * @return Whether the modelMonitoringSchema field is set.
   */
  boolean hasModelMonitoringSchema();

  /**
   *
   *
   * <pre>
   * Monitoring Schema is to specify the model's features, prediction outputs
   * and ground truth properties. It is used to extract pertinent data from the
   * dataset and to process features based on their properties.
   * Make sure that the schema aligns with your dataset, if it does not, we will
   * be unable to extract data from the dataset.
   * It is required for most models, but optional for Vertex AI AutoML Tables
   * unless the schem information is not available.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringSchema model_monitoring_schema = 9;
   * </code>
   *
   * @return The modelMonitoringSchema.
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringSchema getModelMonitoringSchema();

  /**
   *
   *
   * <pre>
   * Monitoring Schema is to specify the model's features, prediction outputs
   * and ground truth properties. It is used to extract pertinent data from the
   * dataset and to process features based on their properties.
   * Make sure that the schema aligns with your dataset, if it does not, we will
   * be unable to extract data from the dataset.
   * It is required for most models, but optional for Vertex AI AutoML Tables
   * unless the schem information is not available.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringSchema model_monitoring_schema = 9;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringSchemaOrBuilder
      getModelMonitoringSchemaOrBuilder();

  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a ModelMonitor. If
   * set, this ModelMonitor and all sub-resources of this
   * ModelMonitor will be secured by this key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 5;</code>
   *
   * @return Whether the encryptionSpec field is set.
   */
  boolean hasEncryptionSpec();

  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a ModelMonitor. If
   * set, this ModelMonitor and all sub-resources of this
   * ModelMonitor will be secured by this key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 5;</code>
   *
   * @return The encryptionSpec.
   */
  com.google.cloud.aiplatform.v1beta1.EncryptionSpec getEncryptionSpec();

  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a ModelMonitor. If
   * set, this ModelMonitor and all sub-resources of this
   * ModelMonitor will be secured by this key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 5;</code>
   */
  com.google.cloud.aiplatform.v1beta1.EncryptionSpecOrBuilder getEncryptionSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelMonitor was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelMonitor was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelMonitor was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelMonitor was updated most recently.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelMonitor was updated most recently.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ModelMonitor was updated most recently.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>bool satisfies_pzs = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The satisfiesPzs.
   */
  boolean getSatisfiesPzs();

  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>bool satisfies_pzi = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The satisfiesPzi.
   */
  boolean getSatisfiesPzi();

  com.google.cloud.aiplatform.v1beta1.ModelMonitor.DefaultObjectiveCase getDefaultObjectiveCase();
}
