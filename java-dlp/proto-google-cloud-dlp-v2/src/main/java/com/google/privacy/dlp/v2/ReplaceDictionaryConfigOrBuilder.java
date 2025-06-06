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

public interface ReplaceDictionaryConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ReplaceDictionaryConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of words to select from for random replacement. The
   * [limits](https://cloud.google.com/sensitive-data-protection/limits) page
   * contains details about the size limits of dictionaries.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Dictionary.WordList word_list = 1;</code>
   *
   * @return Whether the wordList field is set.
   */
  boolean hasWordList();

  /**
   *
   *
   * <pre>
   * A list of words to select from for random replacement. The
   * [limits](https://cloud.google.com/sensitive-data-protection/limits) page
   * contains details about the size limits of dictionaries.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Dictionary.WordList word_list = 1;</code>
   *
   * @return The wordList.
   */
  com.google.privacy.dlp.v2.CustomInfoType.Dictionary.WordList getWordList();

  /**
   *
   *
   * <pre>
   * A list of words to select from for random replacement. The
   * [limits](https://cloud.google.com/sensitive-data-protection/limits) page
   * contains details about the size limits of dictionaries.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Dictionary.WordList word_list = 1;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType.Dictionary.WordListOrBuilder getWordListOrBuilder();

  com.google.privacy.dlp.v2.ReplaceDictionaryConfig.TypeCase getTypeCase();
}
