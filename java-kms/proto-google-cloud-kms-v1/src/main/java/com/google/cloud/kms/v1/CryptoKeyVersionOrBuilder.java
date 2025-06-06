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
// source: google/cloud/kms/v1/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.kms.v1;

public interface CryptoKeyVersionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.CryptoKeyVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name for this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;&#47;cryptoKeyVersions/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. The resource name for this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;&#47;cryptoKeyVersions/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The current state of the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState state = 3;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * The current state of the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState state = 3;</code>
   *
   * @return The state.
   */
  com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState getState();

  /**
   *
   *
   * <pre>
   * Output only. The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel]
   * describing how crypto operations are performed with this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion].
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.ProtectionLevel protection_level = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for protectionLevel.
   */
  int getProtectionLevelValue();

  /**
   *
   *
   * <pre>
   * Output only. The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel]
   * describing how crypto operations are performed with this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion].
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.ProtectionLevel protection_level = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The protectionLevel.
   */
  com.google.cloud.kms.v1.ProtectionLevel getProtectionLevel();

  /**
   *
   *
   * <pre>
   * Output only. The
   * [CryptoKeyVersionAlgorithm][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm]
   * that this [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]
   * supports.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for algorithm.
   */
  int getAlgorithmValue();

  /**
   *
   *
   * <pre>
   * Output only. The
   * [CryptoKeyVersionAlgorithm][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm]
   * that this [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]
   * supports.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The algorithm.
   */
  com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm getAlgorithm();

  /**
   *
   *
   * <pre>
   * Output only. Statement that was generated and signed by the HSM at key
   * creation time. Use this statement to verify attributes of the key as stored
   * on the HSM, independently of Google. Only provided for key versions with
   * [protection_level][google.cloud.kms.v1.CryptoKeyVersion.protection_level]
   * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM].
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.KeyOperationAttestation attestation = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the attestation field is set.
   */
  boolean hasAttestation();

  /**
   *
   *
   * <pre>
   * Output only. Statement that was generated and signed by the HSM at key
   * creation time. Use this statement to verify attributes of the key as stored
   * on the HSM, independently of Google. Only provided for key versions with
   * [protection_level][google.cloud.kms.v1.CryptoKeyVersion.protection_level]
   * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM].
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.KeyOperationAttestation attestation = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The attestation.
   */
  com.google.cloud.kms.v1.KeyOperationAttestation getAttestation();

  /**
   *
   *
   * <pre>
   * Output only. Statement that was generated and signed by the HSM at key
   * creation time. Use this statement to verify attributes of the key as stored
   * on the HSM, independently of Google. Only provided for key versions with
   * [protection_level][google.cloud.kms.v1.CryptoKeyVersion.protection_level]
   * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM].
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.KeyOperationAttestation attestation = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.kms.v1.KeyOperationAttestationOrBuilder getAttestationOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]'s key material was
   * generated.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp generate_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the generateTime field is set.
   */
  boolean hasGenerateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]'s key material was
   * generated.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp generate_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The generateTime.
   */
  com.google.protobuf.Timestamp getGenerateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]'s key material was
   * generated.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp generate_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getGenerateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]'s key material is
   * scheduled for destruction. Only present if
   * [state][google.cloud.kms.v1.CryptoKeyVersion.state] is
   * [DESTROY_SCHEDULED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROY_SCHEDULED].
   * </pre>
   *
   * <code>.google.protobuf.Timestamp destroy_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the destroyTime field is set.
   */
  boolean hasDestroyTime();

  /**
   *
   *
   * <pre>
   * Output only. The time this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]'s key material is
   * scheduled for destruction. Only present if
   * [state][google.cloud.kms.v1.CryptoKeyVersion.state] is
   * [DESTROY_SCHEDULED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROY_SCHEDULED].
   * </pre>
   *
   * <code>.google.protobuf.Timestamp destroy_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The destroyTime.
   */
  com.google.protobuf.Timestamp getDestroyTime();

  /**
   *
   *
   * <pre>
   * Output only. The time this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]'s key material is
   * scheduled for destruction. Only present if
   * [state][google.cloud.kms.v1.CryptoKeyVersion.state] is
   * [DESTROY_SCHEDULED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROY_SCHEDULED].
   * </pre>
   *
   * <code>.google.protobuf.Timestamp destroy_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDestroyTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time this CryptoKeyVersion's key material was
   * destroyed. Only present if
   * [state][google.cloud.kms.v1.CryptoKeyVersion.state] is
   * [DESTROYED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROYED].
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp destroy_event_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the destroyEventTime field is set.
   */
  boolean hasDestroyEventTime();

  /**
   *
   *
   * <pre>
   * Output only. The time this CryptoKeyVersion's key material was
   * destroyed. Only present if
   * [state][google.cloud.kms.v1.CryptoKeyVersion.state] is
   * [DESTROYED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROYED].
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp destroy_event_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The destroyEventTime.
   */
  com.google.protobuf.Timestamp getDestroyEventTime();

  /**
   *
   *
   * <pre>
   * Output only. The time this CryptoKeyVersion's key material was
   * destroyed. Only present if
   * [state][google.cloud.kms.v1.CryptoKeyVersion.state] is
   * [DESTROYED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROYED].
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp destroy_event_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDestroyEventTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The name of the [ImportJob][google.cloud.kms.v1.ImportJob]
   * used in the most recent import of this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]. Only present if
   * the underlying key material was imported.
   * </pre>
   *
   * <code>string import_job = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The importJob.
   */
  java.lang.String getImportJob();

  /**
   *
   *
   * <pre>
   * Output only. The name of the [ImportJob][google.cloud.kms.v1.ImportJob]
   * used in the most recent import of this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]. Only present if
   * the underlying key material was imported.
   * </pre>
   *
   * <code>string import_job = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for importJob.
   */
  com.google.protobuf.ByteString getImportJobBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]'s key material was
   * most recently imported.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp import_time = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the importTime field is set.
   */
  boolean hasImportTime();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]'s key material was
   * most recently imported.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp import_time = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The importTime.
   */
  com.google.protobuf.Timestamp getImportTime();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]'s key material was
   * most recently imported.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp import_time = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getImportTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The root cause of the most recent import failure. Only present
   * if [state][google.cloud.kms.v1.CryptoKeyVersion.state] is
   * [IMPORT_FAILED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.IMPORT_FAILED].
   * </pre>
   *
   * <code>string import_failure_reason = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The importFailureReason.
   */
  java.lang.String getImportFailureReason();

  /**
   *
   *
   * <pre>
   * Output only. The root cause of the most recent import failure. Only present
   * if [state][google.cloud.kms.v1.CryptoKeyVersion.state] is
   * [IMPORT_FAILED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.IMPORT_FAILED].
   * </pre>
   *
   * <code>string import_failure_reason = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for importFailureReason.
   */
  com.google.protobuf.ByteString getImportFailureReasonBytes();

  /**
   *
   *
   * <pre>
   * Output only. The root cause of the most recent generation failure. Only
   * present if [state][google.cloud.kms.v1.CryptoKeyVersion.state] is
   * [GENERATION_FAILED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.GENERATION_FAILED].
   * </pre>
   *
   * <code>string generation_failure_reason = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The generationFailureReason.
   */
  java.lang.String getGenerationFailureReason();

  /**
   *
   *
   * <pre>
   * Output only. The root cause of the most recent generation failure. Only
   * present if [state][google.cloud.kms.v1.CryptoKeyVersion.state] is
   * [GENERATION_FAILED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.GENERATION_FAILED].
   * </pre>
   *
   * <code>string generation_failure_reason = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for generationFailureReason.
   */
  com.google.protobuf.ByteString getGenerationFailureReasonBytes();

  /**
   *
   *
   * <pre>
   * Output only. The root cause of the most recent external destruction
   * failure. Only present if
   * [state][google.cloud.kms.v1.CryptoKeyVersion.state] is
   * [EXTERNAL_DESTRUCTION_FAILED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.EXTERNAL_DESTRUCTION_FAILED].
   * </pre>
   *
   * <code>
   * string external_destruction_failure_reason = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The externalDestructionFailureReason.
   */
  java.lang.String getExternalDestructionFailureReason();

  /**
   *
   *
   * <pre>
   * Output only. The root cause of the most recent external destruction
   * failure. Only present if
   * [state][google.cloud.kms.v1.CryptoKeyVersion.state] is
   * [EXTERNAL_DESTRUCTION_FAILED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.EXTERNAL_DESTRUCTION_FAILED].
   * </pre>
   *
   * <code>
   * string external_destruction_failure_reason = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for externalDestructionFailureReason.
   */
  com.google.protobuf.ByteString getExternalDestructionFailureReasonBytes();

  /**
   *
   *
   * <pre>
   * ExternalProtectionLevelOptions stores a group of additional fields for
   * configuring a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] that
   * are specific to the
   * [EXTERNAL][google.cloud.kms.v1.ProtectionLevel.EXTERNAL] protection level
   * and [EXTERNAL_VPC][google.cloud.kms.v1.ProtectionLevel.EXTERNAL_VPC]
   * protection levels.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.ExternalProtectionLevelOptions external_protection_level_options = 17;
   * </code>
   *
   * @return Whether the externalProtectionLevelOptions field is set.
   */
  boolean hasExternalProtectionLevelOptions();

  /**
   *
   *
   * <pre>
   * ExternalProtectionLevelOptions stores a group of additional fields for
   * configuring a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] that
   * are specific to the
   * [EXTERNAL][google.cloud.kms.v1.ProtectionLevel.EXTERNAL] protection level
   * and [EXTERNAL_VPC][google.cloud.kms.v1.ProtectionLevel.EXTERNAL_VPC]
   * protection levels.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.ExternalProtectionLevelOptions external_protection_level_options = 17;
   * </code>
   *
   * @return The externalProtectionLevelOptions.
   */
  com.google.cloud.kms.v1.ExternalProtectionLevelOptions getExternalProtectionLevelOptions();

  /**
   *
   *
   * <pre>
   * ExternalProtectionLevelOptions stores a group of additional fields for
   * configuring a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] that
   * are specific to the
   * [EXTERNAL][google.cloud.kms.v1.ProtectionLevel.EXTERNAL] protection level
   * and [EXTERNAL_VPC][google.cloud.kms.v1.ProtectionLevel.EXTERNAL_VPC]
   * protection levels.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.ExternalProtectionLevelOptions external_protection_level_options = 17;
   * </code>
   */
  com.google.cloud.kms.v1.ExternalProtectionLevelOptionsOrBuilder
      getExternalProtectionLevelOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Whether or not this key version is eligible for reimport, by
   * being specified as a target in
   * [ImportCryptoKeyVersionRequest.crypto_key_version][google.cloud.kms.v1.ImportCryptoKeyVersionRequest.crypto_key_version].
   * </pre>
   *
   * <code>bool reimport_eligible = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reimportEligible.
   */
  boolean getReimportEligible();
}
