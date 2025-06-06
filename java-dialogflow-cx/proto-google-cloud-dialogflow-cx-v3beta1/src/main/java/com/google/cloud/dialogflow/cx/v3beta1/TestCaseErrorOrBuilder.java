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

public interface TestCaseErrorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.TestCaseError)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The test case.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.TestCase test_case = 1;</code>
   *
   * @return Whether the testCase field is set.
   */
  boolean hasTestCase();

  /**
   *
   *
   * <pre>
   * The test case.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.TestCase test_case = 1;</code>
   *
   * @return The testCase.
   */
  com.google.cloud.dialogflow.cx.v3beta1.TestCase getTestCase();

  /**
   *
   *
   * <pre>
   * The test case.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.TestCase test_case = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.TestCaseOrBuilder getTestCaseOrBuilder();

  /**
   *
   *
   * <pre>
   * The status associated with the test case.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();

  /**
   *
   *
   * <pre>
   * The status associated with the test case.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   *
   * @return The status.
   */
  com.google.rpc.Status getStatus();

  /**
   *
   *
   * <pre>
   * The status associated with the test case.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();
}
