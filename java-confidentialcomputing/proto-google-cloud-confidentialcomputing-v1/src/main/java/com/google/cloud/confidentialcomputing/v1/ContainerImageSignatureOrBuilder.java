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
// source: google/cloud/confidentialcomputing/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.confidentialcomputing.v1;

public interface ContainerImageSignatureOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.confidentialcomputing.v1.ContainerImageSignature)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The binary signature payload following the SimpleSigning format
   * https://github.com/sigstore/cosign/blob/main/specs/SIGNATURE_SPEC.md#simple-signing.
   * This payload includes the container image digest.
   * </pre>
   *
   * <code>bytes payload = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();

  /**
   *
   *
   * <pre>
   * Optional. A signature over the payload.
   * The container image digest is incorporated into the signature as follows:
   * 1. Generate a SimpleSigning format payload that includes the container
   * image digest.
   * 2. Generate a signature over SHA256 digest of the payload.
   * The signature generation process can be represented as follows:
   * `Sign(sha256(SimpleSigningPayload(sha256(Image Manifest))))`
   * </pre>
   *
   * <code>bytes signature = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();

  /**
   *
   *
   * <pre>
   * Optional. Reserved for future use.
   * </pre>
   *
   * <code>bytes public_key = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The publicKey.
   */
  com.google.protobuf.ByteString getPublicKey();

  /**
   *
   *
   * <pre>
   * Optional. Reserved for future use.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.SigningAlgorithm sig_alg = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for sigAlg.
   */
  int getSigAlgValue();

  /**
   *
   *
   * <pre>
   * Optional. Reserved for future use.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.SigningAlgorithm sig_alg = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sigAlg.
   */
  com.google.cloud.confidentialcomputing.v1.SigningAlgorithm getSigAlg();
}
