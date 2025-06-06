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
// source: google/cloud/aiplatform/v1/schema/predict/params/image_segmentation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1.schema.predict.params;

public interface ImageSegmentationPredictionParamsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * When the model predicts category of pixels of the image, it will only
   * provide predictions for pixels that it is at least this much confident
   * about. All other pixels will be classified as background. Default value is
   * 0.5.
   * </pre>
   *
   * <code>float confidence_threshold = 1;</code>
   *
   * @return The confidenceThreshold.
   */
  float getConfidenceThreshold();
}
