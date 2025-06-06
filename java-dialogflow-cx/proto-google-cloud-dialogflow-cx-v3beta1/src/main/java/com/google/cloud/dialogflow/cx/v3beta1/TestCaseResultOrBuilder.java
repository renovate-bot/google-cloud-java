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
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.cx.v3beta1;

public interface TestCaseResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.TestCaseResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name for the test case result. Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCaseID&gt;/results/&lt;TestCaseResultID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * The resource name for the test case result. Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCaseID&gt;/results/&lt;TestCaseResultID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Environment where the test was run. If not set, it indicates the draft
   * environment.
   * </pre>
   *
   * <code>string environment = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The environment.
   */
  java.lang.String getEnvironment();

  /**
   *
   *
   * <pre>
   * Environment where the test was run. If not set, it indicates the draft
   * environment.
   * </pre>
   *
   * <code>string environment = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for environment.
   */
  com.google.protobuf.ByteString getEnvironmentBytes();

  /**
   *
   *
   * <pre>
   * The conversation turns uttered during the test case replay in chronological
   * order.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ConversationTurn conversation_turns = 3;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.ConversationTurn>
      getConversationTurnsList();

  /**
   *
   *
   * <pre>
   * The conversation turns uttered during the test case replay in chronological
   * order.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ConversationTurn conversation_turns = 3;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ConversationTurn getConversationTurns(int index);

  /**
   *
   *
   * <pre>
   * The conversation turns uttered during the test case replay in chronological
   * order.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ConversationTurn conversation_turns = 3;
   * </code>
   */
  int getConversationTurnsCount();

  /**
   *
   *
   * <pre>
   * The conversation turns uttered during the test case replay in chronological
   * order.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ConversationTurn conversation_turns = 3;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.ConversationTurnOrBuilder>
      getConversationTurnsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The conversation turns uttered during the test case replay in chronological
   * order.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ConversationTurn conversation_turns = 3;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ConversationTurnOrBuilder getConversationTurnsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Whether the test case passed in the agent environment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.TestResult test_result = 4;</code>
   *
   * @return The enum numeric value on the wire for testResult.
   */
  int getTestResultValue();

  /**
   *
   *
   * <pre>
   * Whether the test case passed in the agent environment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.TestResult test_result = 4;</code>
   *
   * @return The testResult.
   */
  com.google.cloud.dialogflow.cx.v3beta1.TestResult getTestResult();

  /**
   *
   *
   * <pre>
   * The time that the test was run.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp test_time = 5;</code>
   *
   * @return Whether the testTime field is set.
   */
  boolean hasTestTime();

  /**
   *
   *
   * <pre>
   * The time that the test was run.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp test_time = 5;</code>
   *
   * @return The testTime.
   */
  com.google.protobuf.Timestamp getTestTime();

  /**
   *
   *
   * <pre>
   * The time that the test was run.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp test_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTestTimeOrBuilder();
}
