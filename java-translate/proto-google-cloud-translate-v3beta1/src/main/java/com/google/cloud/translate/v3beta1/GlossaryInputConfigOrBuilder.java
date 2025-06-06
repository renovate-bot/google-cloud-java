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
// source: google/cloud/translate/v3beta1/translation_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.translate.v3beta1;

public interface GlossaryInputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3beta1.GlossaryInputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage location of glossary data.
   * File format is determined based on the filename extension. API returns
   * [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file
   * formats. Wildcards are not allowed. This must be a single file in one of
   * the following formats:
   *
   * For unidirectional glossaries:
   *
   * - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated.
   *   The first column is source text. The second column is target text.
   *   The file must not contain headers. That is, the first row is data, not
   *   column names.
   *
   * - TMX (`.tmx`): TMX file with parallel data defining source/target term
   * pairs.
   *
   * For equivalent term sets glossaries:
   *
   * - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms
   *   in multiple languages. See documentation for more information -
   *   [glossaries](https://cloud.google.com/translate/docs/advanced/glossary).
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.GcsSource gcs_source = 1;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();

  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage location of glossary data.
   * File format is determined based on the filename extension. API returns
   * [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file
   * formats. Wildcards are not allowed. This must be a single file in one of
   * the following formats:
   *
   * For unidirectional glossaries:
   *
   * - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated.
   *   The first column is source text. The second column is target text.
   *   The file must not contain headers. That is, the first row is data, not
   *   column names.
   *
   * - TMX (`.tmx`): TMX file with parallel data defining source/target term
   * pairs.
   *
   * For equivalent term sets glossaries:
   *
   * - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms
   *   in multiple languages. See documentation for more information -
   *   [glossaries](https://cloud.google.com/translate/docs/advanced/glossary).
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.GcsSource gcs_source = 1;</code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.translate.v3beta1.GcsSource getGcsSource();

  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage location of glossary data.
   * File format is determined based on the filename extension. API returns
   * [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file
   * formats. Wildcards are not allowed. This must be a single file in one of
   * the following formats:
   *
   * For unidirectional glossaries:
   *
   * - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated.
   *   The first column is source text. The second column is target text.
   *   The file must not contain headers. That is, the first row is data, not
   *   column names.
   *
   * - TMX (`.tmx`): TMX file with parallel data defining source/target term
   * pairs.
   *
   * For equivalent term sets glossaries:
   *
   * - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms
   *   in multiple languages. See documentation for more information -
   *   [glossaries](https://cloud.google.com/translate/docs/advanced/glossary).
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.GcsSource gcs_source = 1;</code>
   */
  com.google.cloud.translate.v3beta1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  com.google.cloud.translate.v3beta1.GlossaryInputConfig.SourceCase getSourceCase();
}
