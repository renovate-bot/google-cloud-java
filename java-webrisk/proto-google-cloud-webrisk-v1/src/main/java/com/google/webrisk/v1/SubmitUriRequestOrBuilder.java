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
// source: google/cloud/webrisk/v1/webrisk.proto

// Protobuf Java Version: 3.25.8
package com.google.webrisk.v1;

public interface SubmitUriRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.webrisk.v1.SubmitUriRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the project that is making the submission. This
   * string is in the format "projects/{project_number}".
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
   * Required. The name of the project that is making the submission. This
   * string is in the format "projects/{project_number}".
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
   * Required. The submission that contains the URI to be scanned.
   * </pre>
   *
   * <code>
   * .google.cloud.webrisk.v1.Submission submission = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the submission field is set.
   */
  boolean hasSubmission();

  /**
   *
   *
   * <pre>
   * Required. The submission that contains the URI to be scanned.
   * </pre>
   *
   * <code>
   * .google.cloud.webrisk.v1.Submission submission = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The submission.
   */
  com.google.webrisk.v1.Submission getSubmission();

  /**
   *
   *
   * <pre>
   * Required. The submission that contains the URI to be scanned.
   * </pre>
   *
   * <code>
   * .google.cloud.webrisk.v1.Submission submission = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.webrisk.v1.SubmissionOrBuilder getSubmissionOrBuilder();

  /**
   *
   *
   * <pre>
   * Provides additional information about the submission.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.ThreatInfo threat_info = 3;</code>
   *
   * @return Whether the threatInfo field is set.
   */
  boolean hasThreatInfo();

  /**
   *
   *
   * <pre>
   * Provides additional information about the submission.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.ThreatInfo threat_info = 3;</code>
   *
   * @return The threatInfo.
   */
  com.google.webrisk.v1.ThreatInfo getThreatInfo();

  /**
   *
   *
   * <pre>
   * Provides additional information about the submission.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.ThreatInfo threat_info = 3;</code>
   */
  com.google.webrisk.v1.ThreatInfoOrBuilder getThreatInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Provides additional information about how the submission was discovered.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.ThreatDiscovery threat_discovery = 4;</code>
   *
   * @return Whether the threatDiscovery field is set.
   */
  boolean hasThreatDiscovery();

  /**
   *
   *
   * <pre>
   * Provides additional information about how the submission was discovered.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.ThreatDiscovery threat_discovery = 4;</code>
   *
   * @return The threatDiscovery.
   */
  com.google.webrisk.v1.ThreatDiscovery getThreatDiscovery();

  /**
   *
   *
   * <pre>
   * Provides additional information about how the submission was discovered.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.ThreatDiscovery threat_discovery = 4;</code>
   */
  com.google.webrisk.v1.ThreatDiscoveryOrBuilder getThreatDiscoveryOrBuilder();
}
