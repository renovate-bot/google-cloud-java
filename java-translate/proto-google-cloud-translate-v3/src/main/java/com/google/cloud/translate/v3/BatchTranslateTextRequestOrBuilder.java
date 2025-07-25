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

public interface BatchTranslateTextRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.BatchTranslateTextRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Location to make a call. Must refer to a caller's project.
   *
   * Format: `projects/{project-number-or-id}/locations/{location-id}`.
   *
   * The `global` location is not supported for batch translation.
   *
   * Only AutoML Translation models or glossaries within the same region (have
   * the same location-id) can be used, otherwise an INVALID_ARGUMENT (400)
   * error is returned.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. Location to make a call. Must refer to a caller's project.
   *
   * Format: `projects/{project-number-or-id}/locations/{location-id}`.
   *
   * The `global` location is not supported for batch translation.
   *
   * Only AutoML Translation models or glossaries within the same region (have
   * the same location-id) can be used, otherwise an INVALID_ARGUMENT (400)
   * error is returned.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Source language code. Supported language codes are listed in
   * [Language
   * Support](https://cloud.google.com/translate/docs/languages).
   * </pre>
   *
   * <code>string source_language_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The sourceLanguageCode.
   */
  java.lang.String getSourceLanguageCode();

  /**
   *
   *
   * <pre>
   * Required. Source language code. Supported language codes are listed in
   * [Language
   * Support](https://cloud.google.com/translate/docs/languages).
   * </pre>
   *
   * <code>string source_language_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for sourceLanguageCode.
   */
  com.google.protobuf.ByteString getSourceLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Required. Specify up to 10 language codes here. Supported language codes
   * are listed in [Language
   * Support](https://cloud.google.com/translate/docs/languages).
   * </pre>
   *
   * <code>repeated string target_language_codes = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the targetLanguageCodes.
   */
  java.util.List<java.lang.String> getTargetLanguageCodesList();

  /**
   *
   *
   * <pre>
   * Required. Specify up to 10 language codes here. Supported language codes
   * are listed in [Language
   * Support](https://cloud.google.com/translate/docs/languages).
   * </pre>
   *
   * <code>repeated string target_language_codes = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The count of targetLanguageCodes.
   */
  int getTargetLanguageCodesCount();

  /**
   *
   *
   * <pre>
   * Required. Specify up to 10 language codes here. Supported language codes
   * are listed in [Language
   * Support](https://cloud.google.com/translate/docs/languages).
   * </pre>
   *
   * <code>repeated string target_language_codes = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The targetLanguageCodes at the given index.
   */
  java.lang.String getTargetLanguageCodes(int index);

  /**
   *
   *
   * <pre>
   * Required. Specify up to 10 language codes here. Supported language codes
   * are listed in [Language
   * Support](https://cloud.google.com/translate/docs/languages).
   * </pre>
   *
   * <code>repeated string target_language_codes = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the targetLanguageCodes at the given index.
   */
  com.google.protobuf.ByteString getTargetLanguageCodesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The models to use for translation. Map's key is target language
   * code. Map's value is model name. Value can be a built-in general model,
   * or an AutoML Translation model.
   *
   * The value format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * If the map is empty or a specific model is
   * not requested for a language pair, then default google model (nmt) is used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; models = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getModelsCount();

  /**
   *
   *
   * <pre>
   * Optional. The models to use for translation. Map's key is target language
   * code. Map's value is model name. Value can be a built-in general model,
   * or an AutoML Translation model.
   *
   * The value format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * If the map is empty or a specific model is
   * not requested for a language pair, then default google model (nmt) is used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; models = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsModels(java.lang.String key);

  /** Use {@link #getModelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getModels();

  /**
   *
   *
   * <pre>
   * Optional. The models to use for translation. Map's key is target language
   * code. Map's value is model name. Value can be a built-in general model,
   * or an AutoML Translation model.
   *
   * The value format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * If the map is empty or a specific model is
   * not requested for a language pair, then default google model (nmt) is used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; models = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getModelsMap();

  /**
   *
   *
   * <pre>
   * Optional. The models to use for translation. Map's key is target language
   * code. Map's value is model name. Value can be a built-in general model,
   * or an AutoML Translation model.
   *
   * The value format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * If the map is empty or a specific model is
   * not requested for a language pair, then default google model (nmt) is used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; models = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getModelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. The models to use for translation. Map's key is target language
   * code. Map's value is model name. Value can be a built-in general model,
   * or an AutoML Translation model.
   *
   * The value format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * If the map is empty or a specific model is
   * not requested for a language pair, then default google model (nmt) is used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; models = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getModelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. Input configurations.
   * The total number of files matched should be &lt;= 100.
   * The total content size should be &lt;= 100M Unicode codepoints.
   * The files must use UTF-8 encoding.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.translation.v3.InputConfig input_configs = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.translate.v3.InputConfig> getInputConfigsList();

  /**
   *
   *
   * <pre>
   * Required. Input configurations.
   * The total number of files matched should be &lt;= 100.
   * The total content size should be &lt;= 100M Unicode codepoints.
   * The files must use UTF-8 encoding.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.translation.v3.InputConfig input_configs = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.translate.v3.InputConfig getInputConfigs(int index);

  /**
   *
   *
   * <pre>
   * Required. Input configurations.
   * The total number of files matched should be &lt;= 100.
   * The total content size should be &lt;= 100M Unicode codepoints.
   * The files must use UTF-8 encoding.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.translation.v3.InputConfig input_configs = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getInputConfigsCount();

  /**
   *
   *
   * <pre>
   * Required. Input configurations.
   * The total number of files matched should be &lt;= 100.
   * The total content size should be &lt;= 100M Unicode codepoints.
   * The files must use UTF-8 encoding.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.translation.v3.InputConfig input_configs = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.translate.v3.InputConfigOrBuilder>
      getInputConfigsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Required. Input configurations.
   * The total number of files matched should be &lt;= 100.
   * The total content size should be &lt;= 100M Unicode codepoints.
   * The files must use UTF-8 encoding.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.translation.v3.InputConfig input_configs = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.translate.v3.InputConfigOrBuilder getInputConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Required. Output configuration.
   * If 2 input configs match to the same file (that is, same input path),
   * we don't generate output for duplicate inputs.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.OutputConfig output_config = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();

  /**
   *
   *
   * <pre>
   * Required. Output configuration.
   * If 2 input configs match to the same file (that is, same input path),
   * we don't generate output for duplicate inputs.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.OutputConfig output_config = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The outputConfig.
   */
  com.google.cloud.translate.v3.OutputConfig getOutputConfig();

  /**
   *
   *
   * <pre>
   * Required. Output configuration.
   * If 2 input configs match to the same file (that is, same input path),
   * we don't generate output for duplicate inputs.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.OutputConfig output_config = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.translate.v3.OutputConfigOrBuilder getOutputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Glossaries to be applied for translation.
   * It's keyed by target language code.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.translation.v3.TranslateTextGlossaryConfig&gt; glossaries = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getGlossariesCount();

  /**
   *
   *
   * <pre>
   * Optional. Glossaries to be applied for translation.
   * It's keyed by target language code.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.translation.v3.TranslateTextGlossaryConfig&gt; glossaries = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsGlossaries(java.lang.String key);

  /** Use {@link #getGlossariesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.translate.v3.TranslateTextGlossaryConfig>
      getGlossaries();

  /**
   *
   *
   * <pre>
   * Optional. Glossaries to be applied for translation.
   * It's keyed by target language code.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.translation.v3.TranslateTextGlossaryConfig&gt; glossaries = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.translate.v3.TranslateTextGlossaryConfig>
      getGlossariesMap();

  /**
   *
   *
   * <pre>
   * Optional. Glossaries to be applied for translation.
   * It's keyed by target language code.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.translation.v3.TranslateTextGlossaryConfig&gt; glossaries = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  com.google.cloud.translate.v3.TranslateTextGlossaryConfig getGlossariesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.translate.v3.TranslateTextGlossaryConfig defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. Glossaries to be applied for translation.
   * It's keyed by target language code.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.translation.v3.TranslateTextGlossaryConfig&gt; glossaries = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.translate.v3.TranslateTextGlossaryConfig getGlossariesOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   *
   * See https://cloud.google.com/translate/docs/advanced/labels for more
   * information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   *
   * See https://cloud.google.com/translate/docs/advanced/labels for more
   * information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   *
   * See https://cloud.google.com/translate/docs/advanced/labels for more
   * information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   *
   * See https://cloud.google.com/translate/docs/advanced/labels for more
   * information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   *
   * See https://cloud.google.com/translate/docs/advanced/labels for more
   * information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
