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
// source: google/cloud/dialogflow/v2/participant.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.v2;

public interface AnalyzeContentResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.AnalyzeContentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The output text content.
   * This field is set if the automated agent responded with text to show to
   * the user.
   * </pre>
   *
   * <code>string reply_text = 1;</code>
   *
   * @return The replyText.
   */
  java.lang.String getReplyText();

  /**
   *
   *
   * <pre>
   * The output text content.
   * This field is set if the automated agent responded with text to show to
   * the user.
   * </pre>
   *
   * <code>string reply_text = 1;</code>
   *
   * @return The bytes for replyText.
   */
  com.google.protobuf.ByteString getReplyTextBytes();

  /**
   *
   *
   * <pre>
   * The audio data bytes encoded as specified in the request.
   * This field is set if:
   *
   *  - `reply_audio_config` was specified in the request, or
   *  - The automated agent responded with audio to play to the user. In such
   *    case, `reply_audio.config` contains settings used to synthesize the
   *    speech.
   *
   * In some scenarios, multiple output audio fields may be present in the
   * response structure. In these cases, only the top-most-level audio output
   * has content.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.OutputAudio reply_audio = 2;</code>
   *
   * @return Whether the replyAudio field is set.
   */
  boolean hasReplyAudio();

  /**
   *
   *
   * <pre>
   * The audio data bytes encoded as specified in the request.
   * This field is set if:
   *
   *  - `reply_audio_config` was specified in the request, or
   *  - The automated agent responded with audio to play to the user. In such
   *    case, `reply_audio.config` contains settings used to synthesize the
   *    speech.
   *
   * In some scenarios, multiple output audio fields may be present in the
   * response structure. In these cases, only the top-most-level audio output
   * has content.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.OutputAudio reply_audio = 2;</code>
   *
   * @return The replyAudio.
   */
  com.google.cloud.dialogflow.v2.OutputAudio getReplyAudio();

  /**
   *
   *
   * <pre>
   * The audio data bytes encoded as specified in the request.
   * This field is set if:
   *
   *  - `reply_audio_config` was specified in the request, or
   *  - The automated agent responded with audio to play to the user. In such
   *    case, `reply_audio.config` contains settings used to synthesize the
   *    speech.
   *
   * In some scenarios, multiple output audio fields may be present in the
   * response structure. In these cases, only the top-most-level audio output
   * has content.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.OutputAudio reply_audio = 2;</code>
   */
  com.google.cloud.dialogflow.v2.OutputAudioOrBuilder getReplyAudioOrBuilder();

  /**
   *
   *
   * <pre>
   * Only set if a Dialogflow automated agent has responded.
   * Note that in [AutomatedAgentReply.DetectIntentResponse][],
   * [Sessions.DetectIntentResponse.output_audio][]
   * and [Sessions.DetectIntentResponse.output_audio_config][]
   * are always empty, use
   * [reply_audio][google.cloud.dialogflow.v2.AnalyzeContentResponse.reply_audio]
   * instead.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AutomatedAgentReply automated_agent_reply = 3;</code>
   *
   * @return Whether the automatedAgentReply field is set.
   */
  boolean hasAutomatedAgentReply();

  /**
   *
   *
   * <pre>
   * Only set if a Dialogflow automated agent has responded.
   * Note that in [AutomatedAgentReply.DetectIntentResponse][],
   * [Sessions.DetectIntentResponse.output_audio][]
   * and [Sessions.DetectIntentResponse.output_audio_config][]
   * are always empty, use
   * [reply_audio][google.cloud.dialogflow.v2.AnalyzeContentResponse.reply_audio]
   * instead.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AutomatedAgentReply automated_agent_reply = 3;</code>
   *
   * @return The automatedAgentReply.
   */
  com.google.cloud.dialogflow.v2.AutomatedAgentReply getAutomatedAgentReply();

  /**
   *
   *
   * <pre>
   * Only set if a Dialogflow automated agent has responded.
   * Note that in [AutomatedAgentReply.DetectIntentResponse][],
   * [Sessions.DetectIntentResponse.output_audio][]
   * and [Sessions.DetectIntentResponse.output_audio_config][]
   * are always empty, use
   * [reply_audio][google.cloud.dialogflow.v2.AnalyzeContentResponse.reply_audio]
   * instead.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AutomatedAgentReply automated_agent_reply = 3;</code>
   */
  com.google.cloud.dialogflow.v2.AutomatedAgentReplyOrBuilder getAutomatedAgentReplyOrBuilder();

  /**
   *
   *
   * <pre>
   * Message analyzed by CCAI.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Message message = 5;</code>
   *
   * @return Whether the message field is set.
   */
  boolean hasMessage();

  /**
   *
   *
   * <pre>
   * Message analyzed by CCAI.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Message message = 5;</code>
   *
   * @return The message.
   */
  com.google.cloud.dialogflow.v2.Message getMessage();

  /**
   *
   *
   * <pre>
   * Message analyzed by CCAI.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Message message = 5;</code>
   */
  com.google.cloud.dialogflow.v2.MessageOrBuilder getMessageOrBuilder();

  /**
   *
   *
   * <pre>
   * The suggestions for most recent human agent. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.human_agent_suggestion_config][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.human_agent_suggestion_config].
   *
   * Note that any failure of Agent Assist features will not lead to the overall
   * failure of an AnalyzeContent API call. Instead, the features will
   * fail silently with the error field set in the corresponding
   * SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SuggestionResult human_agent_suggestion_results = 6;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.SuggestionResult>
      getHumanAgentSuggestionResultsList();

  /**
   *
   *
   * <pre>
   * The suggestions for most recent human agent. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.human_agent_suggestion_config][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.human_agent_suggestion_config].
   *
   * Note that any failure of Agent Assist features will not lead to the overall
   * failure of an AnalyzeContent API call. Instead, the features will
   * fail silently with the error field set in the corresponding
   * SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SuggestionResult human_agent_suggestion_results = 6;
   * </code>
   */
  com.google.cloud.dialogflow.v2.SuggestionResult getHumanAgentSuggestionResults(int index);

  /**
   *
   *
   * <pre>
   * The suggestions for most recent human agent. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.human_agent_suggestion_config][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.human_agent_suggestion_config].
   *
   * Note that any failure of Agent Assist features will not lead to the overall
   * failure of an AnalyzeContent API call. Instead, the features will
   * fail silently with the error field set in the corresponding
   * SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SuggestionResult human_agent_suggestion_results = 6;
   * </code>
   */
  int getHumanAgentSuggestionResultsCount();

  /**
   *
   *
   * <pre>
   * The suggestions for most recent human agent. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.human_agent_suggestion_config][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.human_agent_suggestion_config].
   *
   * Note that any failure of Agent Assist features will not lead to the overall
   * failure of an AnalyzeContent API call. Instead, the features will
   * fail silently with the error field set in the corresponding
   * SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SuggestionResult human_agent_suggestion_results = 6;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.SuggestionResultOrBuilder>
      getHumanAgentSuggestionResultsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The suggestions for most recent human agent. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.human_agent_suggestion_config][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.human_agent_suggestion_config].
   *
   * Note that any failure of Agent Assist features will not lead to the overall
   * failure of an AnalyzeContent API call. Instead, the features will
   * fail silently with the error field set in the corresponding
   * SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SuggestionResult human_agent_suggestion_results = 6;
   * </code>
   */
  com.google.cloud.dialogflow.v2.SuggestionResultOrBuilder getHumanAgentSuggestionResultsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The suggestions for end user. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.end_user_suggestion_config][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.end_user_suggestion_config].
   *
   * Same as human_agent_suggestion_results, any failure of Agent Assist
   * features will not lead to the overall failure of an AnalyzeContent API
   * call. Instead, the features will fail silently with the error field set in
   * the corresponding SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SuggestionResult end_user_suggestion_results = 7;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.SuggestionResult> getEndUserSuggestionResultsList();

  /**
   *
   *
   * <pre>
   * The suggestions for end user. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.end_user_suggestion_config][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.end_user_suggestion_config].
   *
   * Same as human_agent_suggestion_results, any failure of Agent Assist
   * features will not lead to the overall failure of an AnalyzeContent API
   * call. Instead, the features will fail silently with the error field set in
   * the corresponding SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SuggestionResult end_user_suggestion_results = 7;
   * </code>
   */
  com.google.cloud.dialogflow.v2.SuggestionResult getEndUserSuggestionResults(int index);

  /**
   *
   *
   * <pre>
   * The suggestions for end user. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.end_user_suggestion_config][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.end_user_suggestion_config].
   *
   * Same as human_agent_suggestion_results, any failure of Agent Assist
   * features will not lead to the overall failure of an AnalyzeContent API
   * call. Instead, the features will fail silently with the error field set in
   * the corresponding SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SuggestionResult end_user_suggestion_results = 7;
   * </code>
   */
  int getEndUserSuggestionResultsCount();

  /**
   *
   *
   * <pre>
   * The suggestions for end user. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.end_user_suggestion_config][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.end_user_suggestion_config].
   *
   * Same as human_agent_suggestion_results, any failure of Agent Assist
   * features will not lead to the overall failure of an AnalyzeContent API
   * call. Instead, the features will fail silently with the error field set in
   * the corresponding SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SuggestionResult end_user_suggestion_results = 7;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.SuggestionResultOrBuilder>
      getEndUserSuggestionResultsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The suggestions for end user. The order is the same as
   * [HumanAgentAssistantConfig.SuggestionConfig.feature_configs][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig.feature_configs]
   * of
   * [HumanAgentAssistantConfig.end_user_suggestion_config][google.cloud.dialogflow.v2.HumanAgentAssistantConfig.end_user_suggestion_config].
   *
   * Same as human_agent_suggestion_results, any failure of Agent Assist
   * features will not lead to the overall failure of an AnalyzeContent API
   * call. Instead, the features will fail silently with the error field set in
   * the corresponding SuggestionResult.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SuggestionResult end_user_suggestion_results = 7;
   * </code>
   */
  com.google.cloud.dialogflow.v2.SuggestionResultOrBuilder getEndUserSuggestionResultsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Indicates the parameters of DTMF.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.DtmfParameters dtmf_parameters = 9;</code>
   *
   * @return Whether the dtmfParameters field is set.
   */
  boolean hasDtmfParameters();

  /**
   *
   *
   * <pre>
   * Indicates the parameters of DTMF.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.DtmfParameters dtmf_parameters = 9;</code>
   *
   * @return The dtmfParameters.
   */
  com.google.cloud.dialogflow.v2.DtmfParameters getDtmfParameters();

  /**
   *
   *
   * <pre>
   * Indicates the parameters of DTMF.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.DtmfParameters dtmf_parameters = 9;</code>
   */
  com.google.cloud.dialogflow.v2.DtmfParametersOrBuilder getDtmfParametersOrBuilder();
}
