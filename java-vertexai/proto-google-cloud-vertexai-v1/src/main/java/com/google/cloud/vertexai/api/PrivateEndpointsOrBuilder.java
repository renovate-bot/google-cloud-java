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
// source: google/cloud/vertexai/v1/endpoint.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vertexai.api;

public interface PrivateEndpointsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1.PrivateEndpoints)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Http(s) path to send prediction requests.
   * </pre>
   *
   * <code>string predict_http_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The predictHttpUri.
   */
  java.lang.String getPredictHttpUri();

  /**
   *
   *
   * <pre>
   * Output only. Http(s) path to send prediction requests.
   * </pre>
   *
   * <code>string predict_http_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for predictHttpUri.
   */
  com.google.protobuf.ByteString getPredictHttpUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. Http(s) path to send explain requests.
   * </pre>
   *
   * <code>string explain_http_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The explainHttpUri.
   */
  java.lang.String getExplainHttpUri();

  /**
   *
   *
   * <pre>
   * Output only. Http(s) path to send explain requests.
   * </pre>
   *
   * <code>string explain_http_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for explainHttpUri.
   */
  com.google.protobuf.ByteString getExplainHttpUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. Http(s) path to send health check requests.
   * </pre>
   *
   * <code>string health_http_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The healthHttpUri.
   */
  java.lang.String getHealthHttpUri();

  /**
   *
   *
   * <pre>
   * Output only. Http(s) path to send health check requests.
   * </pre>
   *
   * <code>string health_http_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for healthHttpUri.
   */
  com.google.protobuf.ByteString getHealthHttpUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. The name of the service attachment resource. Populated if
   * private service connect is enabled.
   * </pre>
   *
   * <code>string service_attachment = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The serviceAttachment.
   */
  java.lang.String getServiceAttachment();

  /**
   *
   *
   * <pre>
   * Output only. The name of the service attachment resource. Populated if
   * private service connect is enabled.
   * </pre>
   *
   * <code>string service_attachment = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for serviceAttachment.
   */
  com.google.protobuf.ByteString getServiceAttachmentBytes();
}
