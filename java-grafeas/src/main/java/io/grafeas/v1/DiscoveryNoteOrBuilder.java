/*
 * Copyright 2025 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/discovery.proto

// Protobuf Java Version: 3.25.8
package io.grafeas.v1;

public interface DiscoveryNoteOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.DiscoveryNote)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Immutable. The kind of analysis that is handled by this
   * discovery.
   * </pre>
   *
   * <code>.grafeas.v1.NoteKind analysis_kind = 1;</code>
   *
   * @return The enum numeric value on the wire for analysisKind.
   */
  int getAnalysisKindValue();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The kind of analysis that is handled by this
   * discovery.
   * </pre>
   *
   * <code>.grafeas.v1.NoteKind analysis_kind = 1;</code>
   *
   * @return The analysisKind.
   */
  io.grafeas.v1.NoteKind getAnalysisKind();
}
