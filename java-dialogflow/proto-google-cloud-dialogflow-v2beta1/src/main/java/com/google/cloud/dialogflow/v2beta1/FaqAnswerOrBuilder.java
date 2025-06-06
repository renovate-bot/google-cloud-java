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
// source: google/cloud/dialogflow/v2beta1/participant.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.v2beta1;

public interface FaqAnswerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.FaqAnswer)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The piece of text from the `source` knowledge base document.
   * </pre>
   *
   * <code>string answer = 1;</code>
   *
   * @return The answer.
   */
  java.lang.String getAnswer();

  /**
   *
   *
   * <pre>
   * The piece of text from the `source` knowledge base document.
   * </pre>
   *
   * <code>string answer = 1;</code>
   *
   * @return The bytes for answer.
   */
  com.google.protobuf.ByteString getAnswerBytes();

  /**
   *
   *
   * <pre>
   * The system's confidence score that this Knowledge answer is a good match
   * for this conversational query, range from 0.0 (completely uncertain)
   * to 1.0 (completely certain).
   * </pre>
   *
   * <code>float confidence = 2;</code>
   *
   * @return The confidence.
   */
  float getConfidence();

  /**
   *
   *
   * <pre>
   * The corresponding FAQ question.
   * </pre>
   *
   * <code>string question = 3;</code>
   *
   * @return The question.
   */
  java.lang.String getQuestion();

  /**
   *
   *
   * <pre>
   * The corresponding FAQ question.
   * </pre>
   *
   * <code>string question = 3;</code>
   *
   * @return The bytes for question.
   */
  com.google.protobuf.ByteString getQuestionBytes();

  /**
   *
   *
   * <pre>
   * Indicates which Knowledge Document this answer was extracted
   * from.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agent/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`.
   * </pre>
   *
   * <code>string source = 4;</code>
   *
   * @return The source.
   */
  java.lang.String getSource();

  /**
   *
   *
   * <pre>
   * Indicates which Knowledge Document this answer was extracted
   * from.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agent/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`.
   * </pre>
   *
   * <code>string source = 4;</code>
   *
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString getSourceBytes();

  /**
   *
   *
   * <pre>
   * A map that contains metadata about the answer and the
   * document from which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 5;</code>
   */
  int getMetadataCount();

  /**
   *
   *
   * <pre>
   * A map that contains metadata about the answer and the
   * document from which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 5;</code>
   */
  boolean containsMetadata(java.lang.String key);

  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getMetadata();

  /**
   *
   *
   * <pre>
   * A map that contains metadata about the answer and the
   * document from which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getMetadataMap();

  /**
   *
   *
   * <pre>
   * A map that contains metadata about the answer and the
   * document from which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 5;</code>
   */
  /* nullable */
  java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * A map that contains metadata about the answer and the
   * document from which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 5;</code>
   */
  java.lang.String getMetadataOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The name of answer record, in the format of
   * "projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/answerRecords/&lt;Answer Record
   * ID&gt;"
   * </pre>
   *
   * <code>string answer_record = 6;</code>
   *
   * @return The answerRecord.
   */
  java.lang.String getAnswerRecord();

  /**
   *
   *
   * <pre>
   * The name of answer record, in the format of
   * "projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/answerRecords/&lt;Answer Record
   * ID&gt;"
   * </pre>
   *
   * <code>string answer_record = 6;</code>
   *
   * @return The bytes for answerRecord.
   */
  com.google.protobuf.ByteString getAnswerRecordBytes();
}
