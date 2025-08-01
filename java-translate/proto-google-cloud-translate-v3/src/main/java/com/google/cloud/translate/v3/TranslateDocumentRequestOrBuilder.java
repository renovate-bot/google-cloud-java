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
// source: google/cloud/translate/v3/translation_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.translate.v3;

public interface TranslateDocumentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.TranslateDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Location to make a regional call.
   *
   * Format: `projects/{project-number-or-id}/locations/{location-id}`.
   *
   * For global calls, use `projects/{project-number-or-id}/locations/global` or
   * `projects/{project-number-or-id}`.
   *
   * Non-global location is required for requests using AutoML models or custom
   * glossaries.
   *
   * Models and glossaries must be within the same region (have the same
   * location-id), otherwise an INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. Location to make a regional call.
   *
   * Format: `projects/{project-number-or-id}/locations/{location-id}`.
   *
   * For global calls, use `projects/{project-number-or-id}/locations/global` or
   * `projects/{project-number-or-id}`.
   *
   * Non-global location is required for requests using AutoML models or custom
   * glossaries.
   *
   * Models and glossaries must be within the same region (have the same
   * location-id), otherwise an INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The ISO-639 language code of the input document if known, for
   * example, "en-US" or "sr-Latn". Supported language codes are listed in
   * [Language Support](https://cloud.google.com/translate/docs/languages). If
   * the source language isn't specified, the API attempts to identify the
   * source language automatically and returns the source language within the
   * response. Source language must be specified if the request contains a
   * glossary or a custom model.
   * </pre>
   *
   * <code>string source_language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sourceLanguageCode.
   */
  java.lang.String getSourceLanguageCode();

  /**
   *
   *
   * <pre>
   * Optional. The ISO-639 language code of the input document if known, for
   * example, "en-US" or "sr-Latn". Supported language codes are listed in
   * [Language Support](https://cloud.google.com/translate/docs/languages). If
   * the source language isn't specified, the API attempts to identify the
   * source language automatically and returns the source language within the
   * response. Source language must be specified if the request contains a
   * glossary or a custom model.
   * </pre>
   *
   * <code>string source_language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for sourceLanguageCode.
   */
  com.google.protobuf.ByteString getSourceLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Required. The ISO-639 language code to use for translation of the input
   * document, set to one of the language codes listed in [Language
   * Support](https://cloud.google.com/translate/docs/languages).
   * </pre>
   *
   * <code>string target_language_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The targetLanguageCode.
   */
  java.lang.String getTargetLanguageCode();

  /**
   *
   *
   * <pre>
   * Required. The ISO-639 language code to use for translation of the input
   * document, set to one of the language codes listed in [Language
   * Support](https://cloud.google.com/translate/docs/languages).
   * </pre>
   *
   * <code>string target_language_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for targetLanguageCode.
   */
  com.google.protobuf.ByteString getTargetLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Required. Input configurations.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.DocumentInputConfig document_input_config = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the documentInputConfig field is set.
   */
  boolean hasDocumentInputConfig();

  /**
   *
   *
   * <pre>
   * Required. Input configurations.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.DocumentInputConfig document_input_config = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The documentInputConfig.
   */
  com.google.cloud.translate.v3.DocumentInputConfig getDocumentInputConfig();

  /**
   *
   *
   * <pre>
   * Required. Input configurations.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.DocumentInputConfig document_input_config = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.translate.v3.DocumentInputConfigOrBuilder getDocumentInputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Output configurations.
   * Defines if the output file should be stored within Cloud Storage as well
   * as the desired output format. If not provided the translated file will
   * only be returned through a byte-stream and its output mime type will be
   * the same as the input file's mime type.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.DocumentOutputConfig document_output_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the documentOutputConfig field is set.
   */
  boolean hasDocumentOutputConfig();

  /**
   *
   *
   * <pre>
   * Optional. Output configurations.
   * Defines if the output file should be stored within Cloud Storage as well
   * as the desired output format. If not provided the translated file will
   * only be returned through a byte-stream and its output mime type will be
   * the same as the input file's mime type.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.DocumentOutputConfig document_output_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The documentOutputConfig.
   */
  com.google.cloud.translate.v3.DocumentOutputConfig getDocumentOutputConfig();

  /**
   *
   *
   * <pre>
   * Optional. Output configurations.
   * Defines if the output file should be stored within Cloud Storage as well
   * as the desired output format. If not provided the translated file will
   * only be returned through a byte-stream and its output mime type will be
   * the same as the input file's mime type.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.DocumentOutputConfig document_output_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.translate.v3.DocumentOutputConfigOrBuilder getDocumentOutputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The `model` type requested for this translation.
   *
   * The format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * If not provided, the default Google model (NMT) will be used for
   * translation.
   * </pre>
   *
   * <code>string model = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The model.
   */
  java.lang.String getModel();

  /**
   *
   *
   * <pre>
   * Optional. The `model` type requested for this translation.
   *
   * The format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * If not provided, the default Google model (NMT) will be used for
   * translation.
   * </pre>
   *
   * <code>string model = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();

  /**
   *
   *
   * <pre>
   * Optional. Glossary to be applied. The glossary must be within the same
   * region (have the same location-id) as the model, otherwise an
   * INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.TranslateTextGlossaryConfig glossary_config = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the glossaryConfig field is set.
   */
  boolean hasGlossaryConfig();

  /**
   *
   *
   * <pre>
   * Optional. Glossary to be applied. The glossary must be within the same
   * region (have the same location-id) as the model, otherwise an
   * INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.TranslateTextGlossaryConfig glossary_config = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The glossaryConfig.
   */
  com.google.cloud.translate.v3.TranslateTextGlossaryConfig getGlossaryConfig();

  /**
   *
   *
   * <pre>
   * Optional. Glossary to be applied. The glossary must be within the same
   * region (have the same location-id) as the model, otherwise an
   * INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.TranslateTextGlossaryConfig glossary_config = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.translate.v3.TranslateTextGlossaryConfigOrBuilder getGlossaryConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters (Unicode
   * codepoints), can only contain lowercase letters, numeric characters,
   * underscores and dashes. International characters are allowed. Label values
   * are optional. Label keys must start with a letter.
   *
   * See https://cloud.google.com/translate/docs/advanced/labels for more
   * information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters (Unicode
   * codepoints), can only contain lowercase letters, numeric characters,
   * underscores and dashes. International characters are allowed. Label values
   * are optional. Label keys must start with a letter.
   *
   * See https://cloud.google.com/translate/docs/advanced/labels for more
   * information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters (Unicode
   * codepoints), can only contain lowercase letters, numeric characters,
   * underscores and dashes. International characters are allowed. Label values
   * are optional. Label keys must start with a letter.
   *
   * See https://cloud.google.com/translate/docs/advanced/labels for more
   * information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters (Unicode
   * codepoints), can only contain lowercase letters, numeric characters,
   * underscores and dashes. International characters are allowed. Label values
   * are optional. Label keys must start with a letter.
   *
   * See https://cloud.google.com/translate/docs/advanced/labels for more
   * information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters (Unicode
   * codepoints), can only contain lowercase letters, numeric characters,
   * underscores and dashes. International characters are allowed. Label values
   * are optional. Label keys must start with a letter.
   *
   * See https://cloud.google.com/translate/docs/advanced/labels for more
   * information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. This flag is to support user customized attribution.
   * If not provided, the default is `Machine Translated by Google`.
   * Customized attribution should follow rules in
   * https://cloud.google.com/translate/attribution#attribution_and_logos
   * </pre>
   *
   * <code>string customized_attribution = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The customizedAttribution.
   */
  java.lang.String getCustomizedAttribution();

  /**
   *
   *
   * <pre>
   * Optional. This flag is to support user customized attribution.
   * If not provided, the default is `Machine Translated by Google`.
   * Customized attribution should follow rules in
   * https://cloud.google.com/translate/attribution#attribution_and_logos
   * </pre>
   *
   * <code>string customized_attribution = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for customizedAttribution.
   */
  com.google.protobuf.ByteString getCustomizedAttributionBytes();

  /**
   *
   *
   * <pre>
   * Optional. is_translate_native_pdf_only field for external customers.
   * If true, the page limit of online native pdf translation is 300 and only
   * native pdf pages will be translated.
   * </pre>
   *
   * <code>bool is_translate_native_pdf_only = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The isTranslateNativePdfOnly.
   */
  boolean getIsTranslateNativePdfOnly();

  /**
   *
   *
   * <pre>
   * Optional. If true, use the text removal server to remove the shadow text on
   * background image for native pdf translation.
   * Shadow removal feature can only be enabled when
   * is_translate_native_pdf_only: false &amp;&amp; pdf_native_only: false
   * </pre>
   *
   * <code>bool enable_shadow_removal_native_pdf = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enableShadowRemovalNativePdf.
   */
  boolean getEnableShadowRemovalNativePdf();

  /**
   *
   *
   * <pre>
   * Optional. If true, enable auto rotation correction in DVS.
   * </pre>
   *
   * <code>bool enable_rotation_correction = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enableRotationCorrection.
   */
  boolean getEnableRotationCorrection();
}
