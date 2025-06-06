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
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface EvaluateInstancesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.EvaluateInstancesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Auto metric instances.
   * Instances and metric spec for exact match metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExactMatchInput exact_match_input = 2;</code>
   *
   * @return Whether the exactMatchInput field is set.
   */
  boolean hasExactMatchInput();

  /**
   *
   *
   * <pre>
   * Auto metric instances.
   * Instances and metric spec for exact match metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExactMatchInput exact_match_input = 2;</code>
   *
   * @return The exactMatchInput.
   */
  com.google.cloud.aiplatform.v1beta1.ExactMatchInput getExactMatchInput();

  /**
   *
   *
   * <pre>
   * Auto metric instances.
   * Instances and metric spec for exact match metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExactMatchInput exact_match_input = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ExactMatchInputOrBuilder getExactMatchInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Instances and metric spec for bleu metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.BleuInput bleu_input = 3;</code>
   *
   * @return Whether the bleuInput field is set.
   */
  boolean hasBleuInput();

  /**
   *
   *
   * <pre>
   * Instances and metric spec for bleu metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.BleuInput bleu_input = 3;</code>
   *
   * @return The bleuInput.
   */
  com.google.cloud.aiplatform.v1beta1.BleuInput getBleuInput();

  /**
   *
   *
   * <pre>
   * Instances and metric spec for bleu metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.BleuInput bleu_input = 3;</code>
   */
  com.google.cloud.aiplatform.v1beta1.BleuInputOrBuilder getBleuInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Instances and metric spec for rouge metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RougeInput rouge_input = 4;</code>
   *
   * @return Whether the rougeInput field is set.
   */
  boolean hasRougeInput();

  /**
   *
   *
   * <pre>
   * Instances and metric spec for rouge metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RougeInput rouge_input = 4;</code>
   *
   * @return The rougeInput.
   */
  com.google.cloud.aiplatform.v1beta1.RougeInput getRougeInput();

  /**
   *
   *
   * <pre>
   * Instances and metric spec for rouge metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RougeInput rouge_input = 4;</code>
   */
  com.google.cloud.aiplatform.v1beta1.RougeInputOrBuilder getRougeInputOrBuilder();

  /**
   *
   *
   * <pre>
   * LLM-based metric instance.
   * General text generation metrics, applicable to other categories.
   * Input for fluency metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FluencyInput fluency_input = 5;</code>
   *
   * @return Whether the fluencyInput field is set.
   */
  boolean hasFluencyInput();

  /**
   *
   *
   * <pre>
   * LLM-based metric instance.
   * General text generation metrics, applicable to other categories.
   * Input for fluency metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FluencyInput fluency_input = 5;</code>
   *
   * @return The fluencyInput.
   */
  com.google.cloud.aiplatform.v1beta1.FluencyInput getFluencyInput();

  /**
   *
   *
   * <pre>
   * LLM-based metric instance.
   * General text generation metrics, applicable to other categories.
   * Input for fluency metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FluencyInput fluency_input = 5;</code>
   */
  com.google.cloud.aiplatform.v1beta1.FluencyInputOrBuilder getFluencyInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for coherence metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.CoherenceInput coherence_input = 6;</code>
   *
   * @return Whether the coherenceInput field is set.
   */
  boolean hasCoherenceInput();

  /**
   *
   *
   * <pre>
   * Input for coherence metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.CoherenceInput coherence_input = 6;</code>
   *
   * @return The coherenceInput.
   */
  com.google.cloud.aiplatform.v1beta1.CoherenceInput getCoherenceInput();

  /**
   *
   *
   * <pre>
   * Input for coherence metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.CoherenceInput coherence_input = 6;</code>
   */
  com.google.cloud.aiplatform.v1beta1.CoherenceInputOrBuilder getCoherenceInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for safety metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SafetyInput safety_input = 8;</code>
   *
   * @return Whether the safetyInput field is set.
   */
  boolean hasSafetyInput();

  /**
   *
   *
   * <pre>
   * Input for safety metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SafetyInput safety_input = 8;</code>
   *
   * @return The safetyInput.
   */
  com.google.cloud.aiplatform.v1beta1.SafetyInput getSafetyInput();

  /**
   *
   *
   * <pre>
   * Input for safety metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SafetyInput safety_input = 8;</code>
   */
  com.google.cloud.aiplatform.v1beta1.SafetyInputOrBuilder getSafetyInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for groundedness metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GroundednessInput groundedness_input = 9;</code>
   *
   * @return Whether the groundednessInput field is set.
   */
  boolean hasGroundednessInput();

  /**
   *
   *
   * <pre>
   * Input for groundedness metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GroundednessInput groundedness_input = 9;</code>
   *
   * @return The groundednessInput.
   */
  com.google.cloud.aiplatform.v1beta1.GroundednessInput getGroundednessInput();

  /**
   *
   *
   * <pre>
   * Input for groundedness metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GroundednessInput groundedness_input = 9;</code>
   */
  com.google.cloud.aiplatform.v1beta1.GroundednessInputOrBuilder getGroundednessInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for fulfillment metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FulfillmentInput fulfillment_input = 12;</code>
   *
   * @return Whether the fulfillmentInput field is set.
   */
  boolean hasFulfillmentInput();

  /**
   *
   *
   * <pre>
   * Input for fulfillment metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FulfillmentInput fulfillment_input = 12;</code>
   *
   * @return The fulfillmentInput.
   */
  com.google.cloud.aiplatform.v1beta1.FulfillmentInput getFulfillmentInput();

  /**
   *
   *
   * <pre>
   * Input for fulfillment metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FulfillmentInput fulfillment_input = 12;</code>
   */
  com.google.cloud.aiplatform.v1beta1.FulfillmentInputOrBuilder getFulfillmentInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for summarization quality metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SummarizationQualityInput summarization_quality_input = 7;
   * </code>
   *
   * @return Whether the summarizationQualityInput field is set.
   */
  boolean hasSummarizationQualityInput();

  /**
   *
   *
   * <pre>
   * Input for summarization quality metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SummarizationQualityInput summarization_quality_input = 7;
   * </code>
   *
   * @return The summarizationQualityInput.
   */
  com.google.cloud.aiplatform.v1beta1.SummarizationQualityInput getSummarizationQualityInput();

  /**
   *
   *
   * <pre>
   * Input for summarization quality metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SummarizationQualityInput summarization_quality_input = 7;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.SummarizationQualityInputOrBuilder
      getSummarizationQualityInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for pairwise summarization quality metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PairwiseSummarizationQualityInput pairwise_summarization_quality_input = 23;
   * </code>
   *
   * @return Whether the pairwiseSummarizationQualityInput field is set.
   */
  boolean hasPairwiseSummarizationQualityInput();

  /**
   *
   *
   * <pre>
   * Input for pairwise summarization quality metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PairwiseSummarizationQualityInput pairwise_summarization_quality_input = 23;
   * </code>
   *
   * @return The pairwiseSummarizationQualityInput.
   */
  com.google.cloud.aiplatform.v1beta1.PairwiseSummarizationQualityInput
      getPairwiseSummarizationQualityInput();

  /**
   *
   *
   * <pre>
   * Input for pairwise summarization quality metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PairwiseSummarizationQualityInput pairwise_summarization_quality_input = 23;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.PairwiseSummarizationQualityInputOrBuilder
      getPairwiseSummarizationQualityInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for summarization helpfulness metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SummarizationHelpfulnessInput summarization_helpfulness_input = 14;
   * </code>
   *
   * @return Whether the summarizationHelpfulnessInput field is set.
   */
  boolean hasSummarizationHelpfulnessInput();

  /**
   *
   *
   * <pre>
   * Input for summarization helpfulness metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SummarizationHelpfulnessInput summarization_helpfulness_input = 14;
   * </code>
   *
   * @return The summarizationHelpfulnessInput.
   */
  com.google.cloud.aiplatform.v1beta1.SummarizationHelpfulnessInput
      getSummarizationHelpfulnessInput();

  /**
   *
   *
   * <pre>
   * Input for summarization helpfulness metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SummarizationHelpfulnessInput summarization_helpfulness_input = 14;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.SummarizationHelpfulnessInputOrBuilder
      getSummarizationHelpfulnessInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for summarization verbosity metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SummarizationVerbosityInput summarization_verbosity_input = 15;
   * </code>
   *
   * @return Whether the summarizationVerbosityInput field is set.
   */
  boolean hasSummarizationVerbosityInput();

  /**
   *
   *
   * <pre>
   * Input for summarization verbosity metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SummarizationVerbosityInput summarization_verbosity_input = 15;
   * </code>
   *
   * @return The summarizationVerbosityInput.
   */
  com.google.cloud.aiplatform.v1beta1.SummarizationVerbosityInput getSummarizationVerbosityInput();

  /**
   *
   *
   * <pre>
   * Input for summarization verbosity metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SummarizationVerbosityInput summarization_verbosity_input = 15;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.SummarizationVerbosityInputOrBuilder
      getSummarizationVerbosityInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for question answering quality metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.QuestionAnsweringQualityInput question_answering_quality_input = 10;
   * </code>
   *
   * @return Whether the questionAnsweringQualityInput field is set.
   */
  boolean hasQuestionAnsweringQualityInput();

  /**
   *
   *
   * <pre>
   * Input for question answering quality metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.QuestionAnsweringQualityInput question_answering_quality_input = 10;
   * </code>
   *
   * @return The questionAnsweringQualityInput.
   */
  com.google.cloud.aiplatform.v1beta1.QuestionAnsweringQualityInput
      getQuestionAnsweringQualityInput();

  /**
   *
   *
   * <pre>
   * Input for question answering quality metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.QuestionAnsweringQualityInput question_answering_quality_input = 10;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.QuestionAnsweringQualityInputOrBuilder
      getQuestionAnsweringQualityInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for pairwise question answering quality metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualityInput pairwise_question_answering_quality_input = 24;
   * </code>
   *
   * @return Whether the pairwiseQuestionAnsweringQualityInput field is set.
   */
  boolean hasPairwiseQuestionAnsweringQualityInput();

  /**
   *
   *
   * <pre>
   * Input for pairwise question answering quality metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualityInput pairwise_question_answering_quality_input = 24;
   * </code>
   *
   * @return The pairwiseQuestionAnsweringQualityInput.
   */
  com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualityInput
      getPairwiseQuestionAnsweringQualityInput();

  /**
   *
   *
   * <pre>
   * Input for pairwise question answering quality metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualityInput pairwise_question_answering_quality_input = 24;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualityInputOrBuilder
      getPairwiseQuestionAnsweringQualityInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for question answering relevance metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.QuestionAnsweringRelevanceInput question_answering_relevance_input = 16;
   * </code>
   *
   * @return Whether the questionAnsweringRelevanceInput field is set.
   */
  boolean hasQuestionAnsweringRelevanceInput();

  /**
   *
   *
   * <pre>
   * Input for question answering relevance metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.QuestionAnsweringRelevanceInput question_answering_relevance_input = 16;
   * </code>
   *
   * @return The questionAnsweringRelevanceInput.
   */
  com.google.cloud.aiplatform.v1beta1.QuestionAnsweringRelevanceInput
      getQuestionAnsweringRelevanceInput();

  /**
   *
   *
   * <pre>
   * Input for question answering relevance metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.QuestionAnsweringRelevanceInput question_answering_relevance_input = 16;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.QuestionAnsweringRelevanceInputOrBuilder
      getQuestionAnsweringRelevanceInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for question answering helpfulness
   * metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.QuestionAnsweringHelpfulnessInput question_answering_helpfulness_input = 17;
   * </code>
   *
   * @return Whether the questionAnsweringHelpfulnessInput field is set.
   */
  boolean hasQuestionAnsweringHelpfulnessInput();

  /**
   *
   *
   * <pre>
   * Input for question answering helpfulness
   * metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.QuestionAnsweringHelpfulnessInput question_answering_helpfulness_input = 17;
   * </code>
   *
   * @return The questionAnsweringHelpfulnessInput.
   */
  com.google.cloud.aiplatform.v1beta1.QuestionAnsweringHelpfulnessInput
      getQuestionAnsweringHelpfulnessInput();

  /**
   *
   *
   * <pre>
   * Input for question answering helpfulness
   * metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.QuestionAnsweringHelpfulnessInput question_answering_helpfulness_input = 17;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.QuestionAnsweringHelpfulnessInputOrBuilder
      getQuestionAnsweringHelpfulnessInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for question answering correctness
   * metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.QuestionAnsweringCorrectnessInput question_answering_correctness_input = 18;
   * </code>
   *
   * @return Whether the questionAnsweringCorrectnessInput field is set.
   */
  boolean hasQuestionAnsweringCorrectnessInput();

  /**
   *
   *
   * <pre>
   * Input for question answering correctness
   * metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.QuestionAnsweringCorrectnessInput question_answering_correctness_input = 18;
   * </code>
   *
   * @return The questionAnsweringCorrectnessInput.
   */
  com.google.cloud.aiplatform.v1beta1.QuestionAnsweringCorrectnessInput
      getQuestionAnsweringCorrectnessInput();

  /**
   *
   *
   * <pre>
   * Input for question answering correctness
   * metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.QuestionAnsweringCorrectnessInput question_answering_correctness_input = 18;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.QuestionAnsweringCorrectnessInputOrBuilder
      getQuestionAnsweringCorrectnessInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for pointwise metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PointwiseMetricInput pointwise_metric_input = 28;</code>
   *
   * @return Whether the pointwiseMetricInput field is set.
   */
  boolean hasPointwiseMetricInput();

  /**
   *
   *
   * <pre>
   * Input for pointwise metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PointwiseMetricInput pointwise_metric_input = 28;</code>
   *
   * @return The pointwiseMetricInput.
   */
  com.google.cloud.aiplatform.v1beta1.PointwiseMetricInput getPointwiseMetricInput();

  /**
   *
   *
   * <pre>
   * Input for pointwise metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PointwiseMetricInput pointwise_metric_input = 28;</code>
   */
  com.google.cloud.aiplatform.v1beta1.PointwiseMetricInputOrBuilder
      getPointwiseMetricInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for pairwise metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PairwiseMetricInput pairwise_metric_input = 29;</code>
   *
   * @return Whether the pairwiseMetricInput field is set.
   */
  boolean hasPairwiseMetricInput();

  /**
   *
   *
   * <pre>
   * Input for pairwise metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PairwiseMetricInput pairwise_metric_input = 29;</code>
   *
   * @return The pairwiseMetricInput.
   */
  com.google.cloud.aiplatform.v1beta1.PairwiseMetricInput getPairwiseMetricInput();

  /**
   *
   *
   * <pre>
   * Input for pairwise metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PairwiseMetricInput pairwise_metric_input = 29;</code>
   */
  com.google.cloud.aiplatform.v1beta1.PairwiseMetricInputOrBuilder
      getPairwiseMetricInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Tool call metric instances.
   * Input for tool call valid metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ToolCallValidInput tool_call_valid_input = 19;</code>
   *
   * @return Whether the toolCallValidInput field is set.
   */
  boolean hasToolCallValidInput();

  /**
   *
   *
   * <pre>
   * Tool call metric instances.
   * Input for tool call valid metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ToolCallValidInput tool_call_valid_input = 19;</code>
   *
   * @return The toolCallValidInput.
   */
  com.google.cloud.aiplatform.v1beta1.ToolCallValidInput getToolCallValidInput();

  /**
   *
   *
   * <pre>
   * Tool call metric instances.
   * Input for tool call valid metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ToolCallValidInput tool_call_valid_input = 19;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ToolCallValidInputOrBuilder getToolCallValidInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for tool name match metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ToolNameMatchInput tool_name_match_input = 20;</code>
   *
   * @return Whether the toolNameMatchInput field is set.
   */
  boolean hasToolNameMatchInput();

  /**
   *
   *
   * <pre>
   * Input for tool name match metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ToolNameMatchInput tool_name_match_input = 20;</code>
   *
   * @return The toolNameMatchInput.
   */
  com.google.cloud.aiplatform.v1beta1.ToolNameMatchInput getToolNameMatchInput();

  /**
   *
   *
   * <pre>
   * Input for tool name match metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ToolNameMatchInput tool_name_match_input = 20;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ToolNameMatchInputOrBuilder getToolNameMatchInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for tool parameter key match metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchInput tool_parameter_key_match_input = 21;
   * </code>
   *
   * @return Whether the toolParameterKeyMatchInput field is set.
   */
  boolean hasToolParameterKeyMatchInput();

  /**
   *
   *
   * <pre>
   * Input for tool parameter key match metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchInput tool_parameter_key_match_input = 21;
   * </code>
   *
   * @return The toolParameterKeyMatchInput.
   */
  com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchInput getToolParameterKeyMatchInput();

  /**
   *
   *
   * <pre>
   * Input for tool parameter key match metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchInput tool_parameter_key_match_input = 21;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchInputOrBuilder
      getToolParameterKeyMatchInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for tool parameter key value match metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ToolParameterKVMatchInput tool_parameter_kv_match_input = 22;
   * </code>
   *
   * @return Whether the toolParameterKvMatchInput field is set.
   */
  boolean hasToolParameterKvMatchInput();

  /**
   *
   *
   * <pre>
   * Input for tool parameter key value match metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ToolParameterKVMatchInput tool_parameter_kv_match_input = 22;
   * </code>
   *
   * @return The toolParameterKvMatchInput.
   */
  com.google.cloud.aiplatform.v1beta1.ToolParameterKVMatchInput getToolParameterKvMatchInput();

  /**
   *
   *
   * <pre>
   * Input for tool parameter key value match metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ToolParameterKVMatchInput tool_parameter_kv_match_input = 22;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ToolParameterKVMatchInputOrBuilder
      getToolParameterKvMatchInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Translation metrics.
   * Input for Comet metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.CometInput comet_input = 31;</code>
   *
   * @return Whether the cometInput field is set.
   */
  boolean hasCometInput();

  /**
   *
   *
   * <pre>
   * Translation metrics.
   * Input for Comet metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.CometInput comet_input = 31;</code>
   *
   * @return The cometInput.
   */
  com.google.cloud.aiplatform.v1beta1.CometInput getCometInput();

  /**
   *
   *
   * <pre>
   * Translation metrics.
   * Input for Comet metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.CometInput comet_input = 31;</code>
   */
  com.google.cloud.aiplatform.v1beta1.CometInputOrBuilder getCometInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for Metricx metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MetricxInput metricx_input = 32;</code>
   *
   * @return Whether the metricxInput field is set.
   */
  boolean hasMetricxInput();

  /**
   *
   *
   * <pre>
   * Input for Metricx metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MetricxInput metricx_input = 32;</code>
   *
   * @return The metricxInput.
   */
  com.google.cloud.aiplatform.v1beta1.MetricxInput getMetricxInput();

  /**
   *
   *
   * <pre>
   * Input for Metricx metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MetricxInput metricx_input = 32;</code>
   */
  com.google.cloud.aiplatform.v1beta1.MetricxInputOrBuilder getMetricxInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for trajectory exact match metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TrajectoryExactMatchInput trajectory_exact_match_input = 33;
   * </code>
   *
   * @return Whether the trajectoryExactMatchInput field is set.
   */
  boolean hasTrajectoryExactMatchInput();

  /**
   *
   *
   * <pre>
   * Input for trajectory exact match metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TrajectoryExactMatchInput trajectory_exact_match_input = 33;
   * </code>
   *
   * @return The trajectoryExactMatchInput.
   */
  com.google.cloud.aiplatform.v1beta1.TrajectoryExactMatchInput getTrajectoryExactMatchInput();

  /**
   *
   *
   * <pre>
   * Input for trajectory exact match metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TrajectoryExactMatchInput trajectory_exact_match_input = 33;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.TrajectoryExactMatchInputOrBuilder
      getTrajectoryExactMatchInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for trajectory in order match metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TrajectoryInOrderMatchInput trajectory_in_order_match_input = 34;
   * </code>
   *
   * @return Whether the trajectoryInOrderMatchInput field is set.
   */
  boolean hasTrajectoryInOrderMatchInput();

  /**
   *
   *
   * <pre>
   * Input for trajectory in order match metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TrajectoryInOrderMatchInput trajectory_in_order_match_input = 34;
   * </code>
   *
   * @return The trajectoryInOrderMatchInput.
   */
  com.google.cloud.aiplatform.v1beta1.TrajectoryInOrderMatchInput getTrajectoryInOrderMatchInput();

  /**
   *
   *
   * <pre>
   * Input for trajectory in order match metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TrajectoryInOrderMatchInput trajectory_in_order_match_input = 34;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.TrajectoryInOrderMatchInputOrBuilder
      getTrajectoryInOrderMatchInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for trajectory match any order metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TrajectoryAnyOrderMatchInput trajectory_any_order_match_input = 35;
   * </code>
   *
   * @return Whether the trajectoryAnyOrderMatchInput field is set.
   */
  boolean hasTrajectoryAnyOrderMatchInput();

  /**
   *
   *
   * <pre>
   * Input for trajectory match any order metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TrajectoryAnyOrderMatchInput trajectory_any_order_match_input = 35;
   * </code>
   *
   * @return The trajectoryAnyOrderMatchInput.
   */
  com.google.cloud.aiplatform.v1beta1.TrajectoryAnyOrderMatchInput
      getTrajectoryAnyOrderMatchInput();

  /**
   *
   *
   * <pre>
   * Input for trajectory match any order metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TrajectoryAnyOrderMatchInput trajectory_any_order_match_input = 35;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.TrajectoryAnyOrderMatchInputOrBuilder
      getTrajectoryAnyOrderMatchInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for trajectory precision metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TrajectoryPrecisionInput trajectory_precision_input = 37;
   * </code>
   *
   * @return Whether the trajectoryPrecisionInput field is set.
   */
  boolean hasTrajectoryPrecisionInput();

  /**
   *
   *
   * <pre>
   * Input for trajectory precision metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TrajectoryPrecisionInput trajectory_precision_input = 37;
   * </code>
   *
   * @return The trajectoryPrecisionInput.
   */
  com.google.cloud.aiplatform.v1beta1.TrajectoryPrecisionInput getTrajectoryPrecisionInput();

  /**
   *
   *
   * <pre>
   * Input for trajectory precision metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TrajectoryPrecisionInput trajectory_precision_input = 37;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.TrajectoryPrecisionInputOrBuilder
      getTrajectoryPrecisionInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for trajectory recall metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.TrajectoryRecallInput trajectory_recall_input = 38;
   * </code>
   *
   * @return Whether the trajectoryRecallInput field is set.
   */
  boolean hasTrajectoryRecallInput();

  /**
   *
   *
   * <pre>
   * Input for trajectory recall metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.TrajectoryRecallInput trajectory_recall_input = 38;
   * </code>
   *
   * @return The trajectoryRecallInput.
   */
  com.google.cloud.aiplatform.v1beta1.TrajectoryRecallInput getTrajectoryRecallInput();

  /**
   *
   *
   * <pre>
   * Input for trajectory recall metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.TrajectoryRecallInput trajectory_recall_input = 38;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.TrajectoryRecallInputOrBuilder
      getTrajectoryRecallInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Input for trajectory single tool use metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TrajectorySingleToolUseInput trajectory_single_tool_use_input = 39;
   * </code>
   *
   * @return Whether the trajectorySingleToolUseInput field is set.
   */
  boolean hasTrajectorySingleToolUseInput();

  /**
   *
   *
   * <pre>
   * Input for trajectory single tool use metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TrajectorySingleToolUseInput trajectory_single_tool_use_input = 39;
   * </code>
   *
   * @return The trajectorySingleToolUseInput.
   */
  com.google.cloud.aiplatform.v1beta1.TrajectorySingleToolUseInput
      getTrajectorySingleToolUseInput();

  /**
   *
   *
   * <pre>
   * Input for trajectory single tool use metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TrajectorySingleToolUseInput trajectory_single_tool_use_input = 39;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.TrajectorySingleToolUseInputOrBuilder
      getTrajectorySingleToolUseInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Rubric Based Instruction Following metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RubricBasedInstructionFollowingInput rubric_based_instruction_following_input = 40;
   * </code>
   *
   * @return Whether the rubricBasedInstructionFollowingInput field is set.
   */
  boolean hasRubricBasedInstructionFollowingInput();

  /**
   *
   *
   * <pre>
   * Rubric Based Instruction Following metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RubricBasedInstructionFollowingInput rubric_based_instruction_following_input = 40;
   * </code>
   *
   * @return The rubricBasedInstructionFollowingInput.
   */
  com.google.cloud.aiplatform.v1beta1.RubricBasedInstructionFollowingInput
      getRubricBasedInstructionFollowingInput();

  /**
   *
   *
   * <pre>
   * Rubric Based Instruction Following metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RubricBasedInstructionFollowingInput rubric_based_instruction_following_input = 40;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.RubricBasedInstructionFollowingInputOrBuilder
      getRubricBasedInstructionFollowingInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to evaluate the instances.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The location.
   */
  java.lang.String getLocation();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to evaluate the instances.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * Optional. Autorater config used for evaluation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.AutoraterConfig autorater_config = 30 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the autoraterConfig field is set.
   */
  boolean hasAutoraterConfig();

  /**
   *
   *
   * <pre>
   * Optional. Autorater config used for evaluation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.AutoraterConfig autorater_config = 30 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The autoraterConfig.
   */
  com.google.cloud.aiplatform.v1beta1.AutoraterConfig getAutoraterConfig();

  /**
   *
   *
   * <pre>
   * Optional. Autorater config used for evaluation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.AutoraterConfig autorater_config = 30 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.AutoraterConfigOrBuilder getAutoraterConfigOrBuilder();

  com.google.cloud.aiplatform.v1beta1.EvaluateInstancesRequest.MetricInputsCase
      getMetricInputsCase();
}
