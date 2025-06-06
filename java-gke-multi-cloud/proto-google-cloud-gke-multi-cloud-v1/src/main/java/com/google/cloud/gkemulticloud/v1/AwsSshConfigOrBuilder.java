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
// source: google/cloud/gkemulticloud/v1/aws_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkemulticloud.v1;

public interface AwsSshConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AwsSshConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the EC2 key pair used to login into cluster machines.
   * </pre>
   *
   * <code>string ec2_key_pair = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The ec2KeyPair.
   */
  java.lang.String getEc2KeyPair();

  /**
   *
   *
   * <pre>
   * Required. The name of the EC2 key pair used to login into cluster machines.
   * </pre>
   *
   * <code>string ec2_key_pair = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for ec2KeyPair.
   */
  com.google.protobuf.ByteString getEc2KeyPairBytes();
}
