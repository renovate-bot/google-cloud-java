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
// source: grafeas/v1/severity.proto

// Protobuf Java Version: 3.25.8
package io.grafeas.v1;

public final class SeverityOuterClass {
  private SeverityOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "\031grafeas/v1/severity.proto\022\n"
          + "grafeas.v1*^\n"
          + "\010Severity\022\030\n"
          + "\024SEVERITY_UNSPECIFIED\020\000\022\013\n"
          + "\007MINIMAL\020\001\022\007\n"
          + "\003LOW\020\002\022\n\n"
          + "\006MEDIUM\020\003\022\010\n"
          + "\004HIGH\020\004\022\014\n"
          + "\010CRITICAL\020\005BQ\n\r"
          + "io.grafeas.v1P\001Z8google.golang.org/genproto/googleapis/grafea"
          + "s/v1;grafeas\242\002\003GRAb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
