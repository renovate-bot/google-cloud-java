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
// source: google/cloud/automl/v1beta1/model.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.automl.v1beta1;

public interface ModelOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.Model)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Metadata for translation models.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TranslationModelMetadata translation_model_metadata = 15;
   * </code>
   *
   * @return Whether the translationModelMetadata field is set.
   */
  boolean hasTranslationModelMetadata();

  /**
   *
   *
   * <pre>
   * Metadata for translation models.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TranslationModelMetadata translation_model_metadata = 15;
   * </code>
   *
   * @return The translationModelMetadata.
   */
  com.google.cloud.automl.v1beta1.TranslationModelMetadata getTranslationModelMetadata();

  /**
   *
   *
   * <pre>
   * Metadata for translation models.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TranslationModelMetadata translation_model_metadata = 15;
   * </code>
   */
  com.google.cloud.automl.v1beta1.TranslationModelMetadataOrBuilder
      getTranslationModelMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata for image classification models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.ImageClassificationModelMetadata image_classification_model_metadata = 13;
   * </code>
   *
   * @return Whether the imageClassificationModelMetadata field is set.
   */
  boolean hasImageClassificationModelMetadata();

  /**
   *
   *
   * <pre>
   * Metadata for image classification models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.ImageClassificationModelMetadata image_classification_model_metadata = 13;
   * </code>
   *
   * @return The imageClassificationModelMetadata.
   */
  com.google.cloud.automl.v1beta1.ImageClassificationModelMetadata
      getImageClassificationModelMetadata();

  /**
   *
   *
   * <pre>
   * Metadata for image classification models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.ImageClassificationModelMetadata image_classification_model_metadata = 13;
   * </code>
   */
  com.google.cloud.automl.v1beta1.ImageClassificationModelMetadataOrBuilder
      getImageClassificationModelMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata for text classification models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.TextClassificationModelMetadata text_classification_model_metadata = 14;
   * </code>
   *
   * @return Whether the textClassificationModelMetadata field is set.
   */
  boolean hasTextClassificationModelMetadata();

  /**
   *
   *
   * <pre>
   * Metadata for text classification models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.TextClassificationModelMetadata text_classification_model_metadata = 14;
   * </code>
   *
   * @return The textClassificationModelMetadata.
   */
  com.google.cloud.automl.v1beta1.TextClassificationModelMetadata
      getTextClassificationModelMetadata();

  /**
   *
   *
   * <pre>
   * Metadata for text classification models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.TextClassificationModelMetadata text_classification_model_metadata = 14;
   * </code>
   */
  com.google.cloud.automl.v1beta1.TextClassificationModelMetadataOrBuilder
      getTextClassificationModelMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata for image object detection models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.ImageObjectDetectionModelMetadata image_object_detection_model_metadata = 20;
   * </code>
   *
   * @return Whether the imageObjectDetectionModelMetadata field is set.
   */
  boolean hasImageObjectDetectionModelMetadata();

  /**
   *
   *
   * <pre>
   * Metadata for image object detection models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.ImageObjectDetectionModelMetadata image_object_detection_model_metadata = 20;
   * </code>
   *
   * @return The imageObjectDetectionModelMetadata.
   */
  com.google.cloud.automl.v1beta1.ImageObjectDetectionModelMetadata
      getImageObjectDetectionModelMetadata();

  /**
   *
   *
   * <pre>
   * Metadata for image object detection models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.ImageObjectDetectionModelMetadata image_object_detection_model_metadata = 20;
   * </code>
   */
  com.google.cloud.automl.v1beta1.ImageObjectDetectionModelMetadataOrBuilder
      getImageObjectDetectionModelMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata for video classification models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.VideoClassificationModelMetadata video_classification_model_metadata = 23;
   * </code>
   *
   * @return Whether the videoClassificationModelMetadata field is set.
   */
  boolean hasVideoClassificationModelMetadata();

  /**
   *
   *
   * <pre>
   * Metadata for video classification models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.VideoClassificationModelMetadata video_classification_model_metadata = 23;
   * </code>
   *
   * @return The videoClassificationModelMetadata.
   */
  com.google.cloud.automl.v1beta1.VideoClassificationModelMetadata
      getVideoClassificationModelMetadata();

  /**
   *
   *
   * <pre>
   * Metadata for video classification models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.VideoClassificationModelMetadata video_classification_model_metadata = 23;
   * </code>
   */
  com.google.cloud.automl.v1beta1.VideoClassificationModelMetadataOrBuilder
      getVideoClassificationModelMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata for video object tracking models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.VideoObjectTrackingModelMetadata video_object_tracking_model_metadata = 21;
   * </code>
   *
   * @return Whether the videoObjectTrackingModelMetadata field is set.
   */
  boolean hasVideoObjectTrackingModelMetadata();

  /**
   *
   *
   * <pre>
   * Metadata for video object tracking models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.VideoObjectTrackingModelMetadata video_object_tracking_model_metadata = 21;
   * </code>
   *
   * @return The videoObjectTrackingModelMetadata.
   */
  com.google.cloud.automl.v1beta1.VideoObjectTrackingModelMetadata
      getVideoObjectTrackingModelMetadata();

  /**
   *
   *
   * <pre>
   * Metadata for video object tracking models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.VideoObjectTrackingModelMetadata video_object_tracking_model_metadata = 21;
   * </code>
   */
  com.google.cloud.automl.v1beta1.VideoObjectTrackingModelMetadataOrBuilder
      getVideoObjectTrackingModelMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata for text extraction models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.TextExtractionModelMetadata text_extraction_model_metadata = 19;
   * </code>
   *
   * @return Whether the textExtractionModelMetadata field is set.
   */
  boolean hasTextExtractionModelMetadata();

  /**
   *
   *
   * <pre>
   * Metadata for text extraction models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.TextExtractionModelMetadata text_extraction_model_metadata = 19;
   * </code>
   *
   * @return The textExtractionModelMetadata.
   */
  com.google.cloud.automl.v1beta1.TextExtractionModelMetadata getTextExtractionModelMetadata();

  /**
   *
   *
   * <pre>
   * Metadata for text extraction models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.TextExtractionModelMetadata text_extraction_model_metadata = 19;
   * </code>
   */
  com.google.cloud.automl.v1beta1.TextExtractionModelMetadataOrBuilder
      getTextExtractionModelMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata for Tables models.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TablesModelMetadata tables_model_metadata = 24;</code>
   *
   * @return Whether the tablesModelMetadata field is set.
   */
  boolean hasTablesModelMetadata();

  /**
   *
   *
   * <pre>
   * Metadata for Tables models.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TablesModelMetadata tables_model_metadata = 24;</code>
   *
   * @return The tablesModelMetadata.
   */
  com.google.cloud.automl.v1beta1.TablesModelMetadata getTablesModelMetadata();

  /**
   *
   *
   * <pre>
   * Metadata for Tables models.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TablesModelMetadata tables_model_metadata = 24;</code>
   */
  com.google.cloud.automl.v1beta1.TablesModelMetadataOrBuilder getTablesModelMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata for text sentiment models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.TextSentimentModelMetadata text_sentiment_model_metadata = 22;
   * </code>
   *
   * @return Whether the textSentimentModelMetadata field is set.
   */
  boolean hasTextSentimentModelMetadata();

  /**
   *
   *
   * <pre>
   * Metadata for text sentiment models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.TextSentimentModelMetadata text_sentiment_model_metadata = 22;
   * </code>
   *
   * @return The textSentimentModelMetadata.
   */
  com.google.cloud.automl.v1beta1.TextSentimentModelMetadata getTextSentimentModelMetadata();

  /**
   *
   *
   * <pre>
   * Metadata for text sentiment models.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.TextSentimentModelMetadata text_sentiment_model_metadata = 22;
   * </code>
   */
  com.google.cloud.automl.v1beta1.TextSentimentModelMetadataOrBuilder
      getTextSentimentModelMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Resource name of the model.
   * Format: `projects/{project_id}/locations/{location_id}/models/{model_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. Resource name of the model.
   * Format: `projects/{project_id}/locations/{location_id}/models/{model_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the model to show in the interface. The name can be
   * up to 32 characters long and can consist only of ASCII Latin letters A-Z
   * and a-z, underscores
   * (_), and ASCII digits 0-9. It must start with a letter.
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
   * Required. The name of the model to show in the interface. The name can be
   * up to 32 characters long and can consist only of ASCII Latin letters A-Z
   * and a-z, underscores
   * (_), and ASCII digits 0-9. It must start with a letter.
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
   * Required. The resource ID of the dataset used to create the model. The dataset must
   * come from the same ancestor project and location.
   * </pre>
   *
   * <code>string dataset_id = 3;</code>
   *
   * @return The datasetId.
   */
  java.lang.String getDatasetId();

  /**
   *
   *
   * <pre>
   * Required. The resource ID of the dataset used to create the model. The dataset must
   * come from the same ancestor project and location.
   * </pre>
   *
   * <code>string dataset_id = 3;</code>
   *
   * @return The bytes for datasetId.
   */
  com.google.protobuf.ByteString getDatasetIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the model training finished  and can be used for prediction.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the model training finished  and can be used for prediction.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the model training finished  and can be used for prediction.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this model was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this model was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this model was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Deployment state of the model. A model can only serve
   * prediction requests after it gets deployed.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Model.DeploymentState deployment_state = 8;</code>
   *
   * @return The enum numeric value on the wire for deploymentState.
   */
  int getDeploymentStateValue();

  /**
   *
   *
   * <pre>
   * Output only. Deployment state of the model. A model can only serve
   * prediction requests after it gets deployed.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Model.DeploymentState deployment_state = 8;</code>
   *
   * @return The deploymentState.
   */
  com.google.cloud.automl.v1beta1.Model.DeploymentState getDeploymentState();

  com.google.cloud.automl.v1beta1.Model.ModelMetadataCase getModelMetadataCase();
}
