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
// source: google/devtools/cloudtrace/v1/trace.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.cloudtrace.v1;

public interface TraceSpanOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudtrace.v1.TraceSpan)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier for the span. Must be a 64-bit integer other than 0 and
   * unique within a trace. For example, `2205310701640571284`.
   * </pre>
   *
   * <code>fixed64 span_id = 1;</code>
   *
   * @return The spanId.
   */
  long getSpanId();

  /**
   *
   *
   * <pre>
   * Distinguishes between spans generated in a particular context. For example,
   * two spans with the same name may be distinguished using `RPC_CLIENT`
   * and `RPC_SERVER` to identify queueing latency associated with the span.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v1.TraceSpan.SpanKind kind = 2;</code>
   *
   * @return The enum numeric value on the wire for kind.
   */
  int getKindValue();

  /**
   *
   *
   * <pre>
   * Distinguishes between spans generated in a particular context. For example,
   * two spans with the same name may be distinguished using `RPC_CLIENT`
   * and `RPC_SERVER` to identify queueing latency associated with the span.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v1.TraceSpan.SpanKind kind = 2;</code>
   *
   * @return The kind.
   */
  com.google.devtools.cloudtrace.v1.TraceSpan.SpanKind getKind();

  /**
   *
   *
   * <pre>
   * Name of the span. Must be less than 128 bytes. The span name is sanitized
   * and displayed in the Stackdriver Trace tool in the
   * Google Cloud Platform Console.
   * The name may be a method name or some other per-call site name.
   * For the same executable and the same call point, a best practice is
   * to use a consistent name, which makes it easier to correlate
   * cross-trace spans.
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Name of the span. Must be less than 128 bytes. The span name is sanitized
   * and displayed in the Stackdriver Trace tool in the
   * Google Cloud Platform Console.
   * The name may be a method name or some other per-call site name.
   * For the same executable and the same call point, a best practice is
   * to use a consistent name, which makes it easier to correlate
   * cross-trace spans.
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Start time of the span in nanoseconds from the UNIX epoch.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * Start time of the span in nanoseconds from the UNIX epoch.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   *
   *
   * <pre>
   * Start time of the span in nanoseconds from the UNIX epoch.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * End time of the span in nanoseconds from the UNIX epoch.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * End time of the span in nanoseconds from the UNIX epoch.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   *
   *
   * <pre>
   * End time of the span in nanoseconds from the UNIX epoch.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. ID of the parent span, if any.
   * </pre>
   *
   * <code>fixed64 parent_span_id = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The parentSpanId.
   */
  long getParentSpanId();

  /**
   *
   *
   * <pre>
   * Collection of labels associated with the span. Label keys must be less than
   * 128 bytes. Label values must be less than 16 kilobytes (10MB for
   * `/stacktrace` values).
   *
   * Some predefined label keys exist, or you may create your own. When creating
   * your own, we recommend the following formats:
   *
   * * `/category/product/key` for agents of well-known products (e.g.
   *   `/db/mongodb/read_size`).
   * * `short_host/path/key` for domain-specific keys (e.g.
   *   `foo.com/myproduct/bar`)
   *
   * Predefined labels include:
   *
   * *   `/agent`
   * *   `/component`
   * *   `/error/message`
   * *   `/error/name`
   * *   `/http/client_city`
   * *   `/http/client_country`
   * *   `/http/client_protocol`
   * *   `/http/client_region`
   * *   `/http/host`
   * *   `/http/method`
   * *   `/http/path`
   * *   `/http/redirected_url`
   * *   `/http/request/size`
   * *   `/http/response/size`
   * *   `/http/route`
   * *   `/http/status_code`
   * *   `/http/url`
   * *   `/http/user_agent`
   * *   `/pid`
   * *   `/stacktrace`
   * *   `/tid`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Collection of labels associated with the span. Label keys must be less than
   * 128 bytes. Label values must be less than 16 kilobytes (10MB for
   * `/stacktrace` values).
   *
   * Some predefined label keys exist, or you may create your own. When creating
   * your own, we recommend the following formats:
   *
   * * `/category/product/key` for agents of well-known products (e.g.
   *   `/db/mongodb/read_size`).
   * * `short_host/path/key` for domain-specific keys (e.g.
   *   `foo.com/myproduct/bar`)
   *
   * Predefined labels include:
   *
   * *   `/agent`
   * *   `/component`
   * *   `/error/message`
   * *   `/error/name`
   * *   `/http/client_city`
   * *   `/http/client_country`
   * *   `/http/client_protocol`
   * *   `/http/client_region`
   * *   `/http/host`
   * *   `/http/method`
   * *   `/http/path`
   * *   `/http/redirected_url`
   * *   `/http/request/size`
   * *   `/http/response/size`
   * *   `/http/route`
   * *   `/http/status_code`
   * *   `/http/url`
   * *   `/http/user_agent`
   * *   `/pid`
   * *   `/stacktrace`
   * *   `/tid`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Collection of labels associated with the span. Label keys must be less than
   * 128 bytes. Label values must be less than 16 kilobytes (10MB for
   * `/stacktrace` values).
   *
   * Some predefined label keys exist, or you may create your own. When creating
   * your own, we recommend the following formats:
   *
   * * `/category/product/key` for agents of well-known products (e.g.
   *   `/db/mongodb/read_size`).
   * * `short_host/path/key` for domain-specific keys (e.g.
   *   `foo.com/myproduct/bar`)
   *
   * Predefined labels include:
   *
   * *   `/agent`
   * *   `/component`
   * *   `/error/message`
   * *   `/error/name`
   * *   `/http/client_city`
   * *   `/http/client_country`
   * *   `/http/client_protocol`
   * *   `/http/client_region`
   * *   `/http/host`
   * *   `/http/method`
   * *   `/http/path`
   * *   `/http/redirected_url`
   * *   `/http/request/size`
   * *   `/http/response/size`
   * *   `/http/route`
   * *   `/http/status_code`
   * *   `/http/url`
   * *   `/http/user_agent`
   * *   `/pid`
   * *   `/stacktrace`
   * *   `/tid`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Collection of labels associated with the span. Label keys must be less than
   * 128 bytes. Label values must be less than 16 kilobytes (10MB for
   * `/stacktrace` values).
   *
   * Some predefined label keys exist, or you may create your own. When creating
   * your own, we recommend the following formats:
   *
   * * `/category/product/key` for agents of well-known products (e.g.
   *   `/db/mongodb/read_size`).
   * * `short_host/path/key` for domain-specific keys (e.g.
   *   `foo.com/myproduct/bar`)
   *
   * Predefined labels include:
   *
   * *   `/agent`
   * *   `/component`
   * *   `/error/message`
   * *   `/error/name`
   * *   `/http/client_city`
   * *   `/http/client_country`
   * *   `/http/client_protocol`
   * *   `/http/client_region`
   * *   `/http/host`
   * *   `/http/method`
   * *   `/http/path`
   * *   `/http/redirected_url`
   * *   `/http/request/size`
   * *   `/http/response/size`
   * *   `/http/route`
   * *   `/http/status_code`
   * *   `/http/url`
   * *   `/http/user_agent`
   * *   `/pid`
   * *   `/stacktrace`
   * *   `/tid`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Collection of labels associated with the span. Label keys must be less than
   * 128 bytes. Label values must be less than 16 kilobytes (10MB for
   * `/stacktrace` values).
   *
   * Some predefined label keys exist, or you may create your own. When creating
   * your own, we recommend the following formats:
   *
   * * `/category/product/key` for agents of well-known products (e.g.
   *   `/db/mongodb/read_size`).
   * * `short_host/path/key` for domain-specific keys (e.g.
   *   `foo.com/myproduct/bar`)
   *
   * Predefined labels include:
   *
   * *   `/agent`
   * *   `/component`
   * *   `/error/message`
   * *   `/error/name`
   * *   `/http/client_city`
   * *   `/http/client_country`
   * *   `/http/client_protocol`
   * *   `/http/client_region`
   * *   `/http/host`
   * *   `/http/method`
   * *   `/http/path`
   * *   `/http/redirected_url`
   * *   `/http/request/size`
   * *   `/http/response/size`
   * *   `/http/route`
   * *   `/http/status_code`
   * *   `/http/url`
   * *   `/http/user_agent`
   * *   `/pid`
   * *   `/stacktrace`
   * *   `/tid`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
