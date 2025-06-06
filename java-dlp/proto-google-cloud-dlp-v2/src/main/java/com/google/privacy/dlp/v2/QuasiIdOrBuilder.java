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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.8
package com.google.privacy.dlp.v2;

public interface QuasiIdOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.QuasiId)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Identifies the column.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId field = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the field field is set.
   */
  boolean hasField();

  /**
   *
   *
   * <pre>
   * Required. Identifies the column.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId field = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The field.
   */
  com.google.privacy.dlp.v2.FieldId getField();

  /**
   *
   *
   * <pre>
   * Required. Identifies the column.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId field = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.privacy.dlp.v2.FieldIdOrBuilder getFieldOrBuilder();

  /**
   *
   *
   * <pre>
   * A column can be tagged with a InfoType to use the relevant public
   * dataset as a statistical model of population, if available. We
   * currently support US ZIP codes, region codes, ages and genders.
   * To programmatically obtain the list of supported InfoTypes, use
   * ListInfoTypes with the supported_by=RISK_ANALYSIS filter.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 2;</code>
   *
   * @return Whether the infoType field is set.
   */
  boolean hasInfoType();

  /**
   *
   *
   * <pre>
   * A column can be tagged with a InfoType to use the relevant public
   * dataset as a statistical model of population, if available. We
   * currently support US ZIP codes, region codes, ages and genders.
   * To programmatically obtain the list of supported InfoTypes, use
   * ListInfoTypes with the supported_by=RISK_ANALYSIS filter.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 2;</code>
   *
   * @return The infoType.
   */
  com.google.privacy.dlp.v2.InfoType getInfoType();

  /**
   *
   *
   * <pre>
   * A column can be tagged with a InfoType to use the relevant public
   * dataset as a statistical model of population, if available. We
   * currently support US ZIP codes, region codes, ages and genders.
   * To programmatically obtain the list of supported InfoTypes, use
   * ListInfoTypes with the supported_by=RISK_ANALYSIS filter.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 2;</code>
   */
  com.google.privacy.dlp.v2.InfoTypeOrBuilder getInfoTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * A column can be tagged with a custom tag. In this case, the user must
   * indicate an auxiliary table that contains statistical information on
   * the possible values of this column (below).
   * </pre>
   *
   * <code>string custom_tag = 3;</code>
   *
   * @return Whether the customTag field is set.
   */
  boolean hasCustomTag();

  /**
   *
   *
   * <pre>
   * A column can be tagged with a custom tag. In this case, the user must
   * indicate an auxiliary table that contains statistical information on
   * the possible values of this column (below).
   * </pre>
   *
   * <code>string custom_tag = 3;</code>
   *
   * @return The customTag.
   */
  java.lang.String getCustomTag();

  /**
   *
   *
   * <pre>
   * A column can be tagged with a custom tag. In this case, the user must
   * indicate an auxiliary table that contains statistical information on
   * the possible values of this column (below).
   * </pre>
   *
   * <code>string custom_tag = 3;</code>
   *
   * @return The bytes for customTag.
   */
  com.google.protobuf.ByteString getCustomTagBytes();

  /**
   *
   *
   * <pre>
   * If no semantic tag is indicated, we infer the statistical model from
   * the distribution of values in the input data
   * </pre>
   *
   * <code>.google.protobuf.Empty inferred = 4;</code>
   *
   * @return Whether the inferred field is set.
   */
  boolean hasInferred();

  /**
   *
   *
   * <pre>
   * If no semantic tag is indicated, we infer the statistical model from
   * the distribution of values in the input data
   * </pre>
   *
   * <code>.google.protobuf.Empty inferred = 4;</code>
   *
   * @return The inferred.
   */
  com.google.protobuf.Empty getInferred();

  /**
   *
   *
   * <pre>
   * If no semantic tag is indicated, we infer the statistical model from
   * the distribution of values in the input data
   * </pre>
   *
   * <code>.google.protobuf.Empty inferred = 4;</code>
   */
  com.google.protobuf.EmptyOrBuilder getInferredOrBuilder();

  com.google.privacy.dlp.v2.QuasiId.TagCase getTagCase();
}
