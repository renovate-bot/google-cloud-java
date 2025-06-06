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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

public interface UrlMapValidationResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.UrlMapValidationResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string load_errors = 310147300;</code>
   *
   * @return A list containing the loadErrors.
   */
  java.util.List<java.lang.String> getLoadErrorsList();

  /**
   * <code>repeated string load_errors = 310147300;</code>
   *
   * @return The count of loadErrors.
   */
  int getLoadErrorsCount();

  /**
   * <code>repeated string load_errors = 310147300;</code>
   *
   * @param index The index of the element to return.
   * @return The loadErrors at the given index.
   */
  java.lang.String getLoadErrors(int index);

  /**
   * <code>repeated string load_errors = 310147300;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the loadErrors at the given index.
   */
  com.google.protobuf.ByteString getLoadErrorsBytes(int index);

  /**
   *
   *
   * <pre>
   * Whether the given UrlMap can be successfully loaded. If false, 'loadErrors' indicates the reasons.
   * </pre>
   *
   * <code>optional bool load_succeeded = 128326216;</code>
   *
   * @return Whether the loadSucceeded field is set.
   */
  boolean hasLoadSucceeded();

  /**
   *
   *
   * <pre>
   * Whether the given UrlMap can be successfully loaded. If false, 'loadErrors' indicates the reasons.
   * </pre>
   *
   * <code>optional bool load_succeeded = 128326216;</code>
   *
   * @return The loadSucceeded.
   */
  boolean getLoadSucceeded();

  /** <code>repeated .google.cloud.compute.v1.TestFailure test_failures = 505934134;</code> */
  java.util.List<com.google.cloud.compute.v1.TestFailure> getTestFailuresList();

  /** <code>repeated .google.cloud.compute.v1.TestFailure test_failures = 505934134;</code> */
  com.google.cloud.compute.v1.TestFailure getTestFailures(int index);

  /** <code>repeated .google.cloud.compute.v1.TestFailure test_failures = 505934134;</code> */
  int getTestFailuresCount();

  /** <code>repeated .google.cloud.compute.v1.TestFailure test_failures = 505934134;</code> */
  java.util.List<? extends com.google.cloud.compute.v1.TestFailureOrBuilder>
      getTestFailuresOrBuilderList();

  /** <code>repeated .google.cloud.compute.v1.TestFailure test_failures = 505934134;</code> */
  com.google.cloud.compute.v1.TestFailureOrBuilder getTestFailuresOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If successfully loaded, this field indicates whether the test passed. If false, 'testFailures's indicate the reason of failure.
   * </pre>
   *
   * <code>optional bool test_passed = 192708797;</code>
   *
   * @return Whether the testPassed field is set.
   */
  boolean hasTestPassed();

  /**
   *
   *
   * <pre>
   * If successfully loaded, this field indicates whether the test passed. If false, 'testFailures's indicate the reason of failure.
   * </pre>
   *
   * <code>optional bool test_passed = 192708797;</code>
   *
   * @return The testPassed.
   */
  boolean getTestPassed();
}
