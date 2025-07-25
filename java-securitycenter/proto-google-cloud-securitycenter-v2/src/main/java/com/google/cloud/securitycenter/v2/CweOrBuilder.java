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
// source: google/cloud/securitycenter/v2/vulnerability.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v2;

public interface CweOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v2.Cwe)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The CWE identifier, e.g. CWE-94
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();

  /**
   *
   *
   * <pre>
   * The CWE identifier, e.g. CWE-94
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Any reference to the details on the CWE, for example,
   * https://cwe.mitre.org/data/definitions/94.html
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v2.Reference references = 2;</code>
   */
  java.util.List<com.google.cloud.securitycenter.v2.Reference> getReferencesList();

  /**
   *
   *
   * <pre>
   * Any reference to the details on the CWE, for example,
   * https://cwe.mitre.org/data/definitions/94.html
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v2.Reference references = 2;</code>
   */
  com.google.cloud.securitycenter.v2.Reference getReferences(int index);

  /**
   *
   *
   * <pre>
   * Any reference to the details on the CWE, for example,
   * https://cwe.mitre.org/data/definitions/94.html
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v2.Reference references = 2;</code>
   */
  int getReferencesCount();

  /**
   *
   *
   * <pre>
   * Any reference to the details on the CWE, for example,
   * https://cwe.mitre.org/data/definitions/94.html
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v2.Reference references = 2;</code>
   */
  java.util.List<? extends com.google.cloud.securitycenter.v2.ReferenceOrBuilder>
      getReferencesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Any reference to the details on the CWE, for example,
   * https://cwe.mitre.org/data/definitions/94.html
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v2.Reference references = 2;</code>
   */
  com.google.cloud.securitycenter.v2.ReferenceOrBuilder getReferencesOrBuilder(int index);
}
