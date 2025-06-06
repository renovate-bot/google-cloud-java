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
// source: google/cloud/aiplatform/v1/model_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public interface BatchImportModelEvaluationSlicesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. List of imported
   * [ModelEvaluationSlice.name][google.cloud.aiplatform.v1.ModelEvaluationSlice.name].
   * </pre>
   *
   * <code>
   * repeated string imported_model_evaluation_slices = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the importedModelEvaluationSlices.
   */
  java.util.List<java.lang.String> getImportedModelEvaluationSlicesList();

  /**
   *
   *
   * <pre>
   * Output only. List of imported
   * [ModelEvaluationSlice.name][google.cloud.aiplatform.v1.ModelEvaluationSlice.name].
   * </pre>
   *
   * <code>
   * repeated string imported_model_evaluation_slices = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of importedModelEvaluationSlices.
   */
  int getImportedModelEvaluationSlicesCount();

  /**
   *
   *
   * <pre>
   * Output only. List of imported
   * [ModelEvaluationSlice.name][google.cloud.aiplatform.v1.ModelEvaluationSlice.name].
   * </pre>
   *
   * <code>
   * repeated string imported_model_evaluation_slices = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The importedModelEvaluationSlices at the given index.
   */
  java.lang.String getImportedModelEvaluationSlices(int index);

  /**
   *
   *
   * <pre>
   * Output only. List of imported
   * [ModelEvaluationSlice.name][google.cloud.aiplatform.v1.ModelEvaluationSlice.name].
   * </pre>
   *
   * <code>
   * repeated string imported_model_evaluation_slices = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the importedModelEvaluationSlices at the given index.
   */
  com.google.protobuf.ByteString getImportedModelEvaluationSlicesBytes(int index);
}
