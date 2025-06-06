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
// source: google/cloud/language/v1/language_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.language.v1;

public interface AnnotateTextResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1.AnnotateTextResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Sentences in the input document. Populated if the user enables
   * [AnnotateTextRequest.Features.extract_syntax][google.cloud.language.v1.AnnotateTextRequest.Features.extract_syntax].
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Sentence sentences = 1;</code>
   */
  java.util.List<com.google.cloud.language.v1.Sentence> getSentencesList();

  /**
   *
   *
   * <pre>
   * Sentences in the input document. Populated if the user enables
   * [AnnotateTextRequest.Features.extract_syntax][google.cloud.language.v1.AnnotateTextRequest.Features.extract_syntax].
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Sentence sentences = 1;</code>
   */
  com.google.cloud.language.v1.Sentence getSentences(int index);

  /**
   *
   *
   * <pre>
   * Sentences in the input document. Populated if the user enables
   * [AnnotateTextRequest.Features.extract_syntax][google.cloud.language.v1.AnnotateTextRequest.Features.extract_syntax].
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Sentence sentences = 1;</code>
   */
  int getSentencesCount();

  /**
   *
   *
   * <pre>
   * Sentences in the input document. Populated if the user enables
   * [AnnotateTextRequest.Features.extract_syntax][google.cloud.language.v1.AnnotateTextRequest.Features.extract_syntax].
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Sentence sentences = 1;</code>
   */
  java.util.List<? extends com.google.cloud.language.v1.SentenceOrBuilder>
      getSentencesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Sentences in the input document. Populated if the user enables
   * [AnnotateTextRequest.Features.extract_syntax][google.cloud.language.v1.AnnotateTextRequest.Features.extract_syntax].
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Sentence sentences = 1;</code>
   */
  com.google.cloud.language.v1.SentenceOrBuilder getSentencesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Tokens, along with their syntactic information, in the input document.
   * Populated if the user enables
   * [AnnotateTextRequest.Features.extract_syntax][google.cloud.language.v1.AnnotateTextRequest.Features.extract_syntax].
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Token tokens = 2;</code>
   */
  java.util.List<com.google.cloud.language.v1.Token> getTokensList();

  /**
   *
   *
   * <pre>
   * Tokens, along with their syntactic information, in the input document.
   * Populated if the user enables
   * [AnnotateTextRequest.Features.extract_syntax][google.cloud.language.v1.AnnotateTextRequest.Features.extract_syntax].
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Token tokens = 2;</code>
   */
  com.google.cloud.language.v1.Token getTokens(int index);

  /**
   *
   *
   * <pre>
   * Tokens, along with their syntactic information, in the input document.
   * Populated if the user enables
   * [AnnotateTextRequest.Features.extract_syntax][google.cloud.language.v1.AnnotateTextRequest.Features.extract_syntax].
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Token tokens = 2;</code>
   */
  int getTokensCount();

  /**
   *
   *
   * <pre>
   * Tokens, along with their syntactic information, in the input document.
   * Populated if the user enables
   * [AnnotateTextRequest.Features.extract_syntax][google.cloud.language.v1.AnnotateTextRequest.Features.extract_syntax].
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Token tokens = 2;</code>
   */
  java.util.List<? extends com.google.cloud.language.v1.TokenOrBuilder> getTokensOrBuilderList();

  /**
   *
   *
   * <pre>
   * Tokens, along with their syntactic information, in the input document.
   * Populated if the user enables
   * [AnnotateTextRequest.Features.extract_syntax][google.cloud.language.v1.AnnotateTextRequest.Features.extract_syntax].
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Token tokens = 2;</code>
   */
  com.google.cloud.language.v1.TokenOrBuilder getTokensOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Entities, along with their semantic information, in the input document.
   * Populated if the user enables
   * [AnnotateTextRequest.Features.extract_entities][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entities].
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 3;</code>
   */
  java.util.List<com.google.cloud.language.v1.Entity> getEntitiesList();

  /**
   *
   *
   * <pre>
   * Entities, along with their semantic information, in the input document.
   * Populated if the user enables
   * [AnnotateTextRequest.Features.extract_entities][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entities].
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 3;</code>
   */
  com.google.cloud.language.v1.Entity getEntities(int index);

  /**
   *
   *
   * <pre>
   * Entities, along with their semantic information, in the input document.
   * Populated if the user enables
   * [AnnotateTextRequest.Features.extract_entities][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entities].
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 3;</code>
   */
  int getEntitiesCount();

  /**
   *
   *
   * <pre>
   * Entities, along with their semantic information, in the input document.
   * Populated if the user enables
   * [AnnotateTextRequest.Features.extract_entities][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entities].
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 3;</code>
   */
  java.util.List<? extends com.google.cloud.language.v1.EntityOrBuilder> getEntitiesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Entities, along with their semantic information, in the input document.
   * Populated if the user enables
   * [AnnotateTextRequest.Features.extract_entities][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entities].
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 3;</code>
   */
  com.google.cloud.language.v1.EntityOrBuilder getEntitiesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The overall sentiment for the document. Populated if the user enables
   * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment].
   * </pre>
   *
   * <code>.google.cloud.language.v1.Sentiment document_sentiment = 4;</code>
   *
   * @return Whether the documentSentiment field is set.
   */
  boolean hasDocumentSentiment();

  /**
   *
   *
   * <pre>
   * The overall sentiment for the document. Populated if the user enables
   * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment].
   * </pre>
   *
   * <code>.google.cloud.language.v1.Sentiment document_sentiment = 4;</code>
   *
   * @return The documentSentiment.
   */
  com.google.cloud.language.v1.Sentiment getDocumentSentiment();

  /**
   *
   *
   * <pre>
   * The overall sentiment for the document. Populated if the user enables
   * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment].
   * </pre>
   *
   * <code>.google.cloud.language.v1.Sentiment document_sentiment = 4;</code>
   */
  com.google.cloud.language.v1.SentimentOrBuilder getDocumentSentimentOrBuilder();

  /**
   *
   *
   * <pre>
   * The language of the text, which will be the same as the language specified
   * in the request or, if not specified, the automatically-detected language.
   * See [Document.language][google.cloud.language.v1.Document.language] field
   * for more details.
   * </pre>
   *
   * <code>string language = 5;</code>
   *
   * @return The language.
   */
  java.lang.String getLanguage();

  /**
   *
   *
   * <pre>
   * The language of the text, which will be the same as the language specified
   * in the request or, if not specified, the automatically-detected language.
   * See [Document.language][google.cloud.language.v1.Document.language] field
   * for more details.
   * </pre>
   *
   * <code>string language = 5;</code>
   *
   * @return The bytes for language.
   */
  com.google.protobuf.ByteString getLanguageBytes();

  /**
   *
   *
   * <pre>
   * Categories identified in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.ClassificationCategory categories = 6;</code>
   */
  java.util.List<com.google.cloud.language.v1.ClassificationCategory> getCategoriesList();

  /**
   *
   *
   * <pre>
   * Categories identified in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.ClassificationCategory categories = 6;</code>
   */
  com.google.cloud.language.v1.ClassificationCategory getCategories(int index);

  /**
   *
   *
   * <pre>
   * Categories identified in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.ClassificationCategory categories = 6;</code>
   */
  int getCategoriesCount();

  /**
   *
   *
   * <pre>
   * Categories identified in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.ClassificationCategory categories = 6;</code>
   */
  java.util.List<? extends com.google.cloud.language.v1.ClassificationCategoryOrBuilder>
      getCategoriesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Categories identified in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.ClassificationCategory categories = 6;</code>
   */
  com.google.cloud.language.v1.ClassificationCategoryOrBuilder getCategoriesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Harmful and sensitive categories identified in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.ClassificationCategory moderation_categories = 7;
   * </code>
   */
  java.util.List<com.google.cloud.language.v1.ClassificationCategory> getModerationCategoriesList();

  /**
   *
   *
   * <pre>
   * Harmful and sensitive categories identified in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.ClassificationCategory moderation_categories = 7;
   * </code>
   */
  com.google.cloud.language.v1.ClassificationCategory getModerationCategories(int index);

  /**
   *
   *
   * <pre>
   * Harmful and sensitive categories identified in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.ClassificationCategory moderation_categories = 7;
   * </code>
   */
  int getModerationCategoriesCount();

  /**
   *
   *
   * <pre>
   * Harmful and sensitive categories identified in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.ClassificationCategory moderation_categories = 7;
   * </code>
   */
  java.util.List<? extends com.google.cloud.language.v1.ClassificationCategoryOrBuilder>
      getModerationCategoriesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Harmful and sensitive categories identified in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.ClassificationCategory moderation_categories = 7;
   * </code>
   */
  com.google.cloud.language.v1.ClassificationCategoryOrBuilder getModerationCategoriesOrBuilder(
      int index);
}
