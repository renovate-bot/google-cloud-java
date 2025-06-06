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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.orchestration.airflow.service.v1;

public interface FetchDatabasePropertiesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1.FetchDatabasePropertiesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Compute Engine zone that the instance is currently serving from.
   * </pre>
   *
   * <code>string primary_gce_zone = 1;</code>
   *
   * @return The primaryGceZone.
   */
  java.lang.String getPrimaryGceZone();

  /**
   *
   *
   * <pre>
   * The Compute Engine zone that the instance is currently serving from.
   * </pre>
   *
   * <code>string primary_gce_zone = 1;</code>
   *
   * @return The bytes for primaryGceZone.
   */
  com.google.protobuf.ByteString getPrimaryGceZoneBytes();

  /**
   *
   *
   * <pre>
   * The Compute Engine zone that the failover instance is currently serving
   * from for a regional Cloud SQL instance.
   * </pre>
   *
   * <code>string secondary_gce_zone = 2;</code>
   *
   * @return The secondaryGceZone.
   */
  java.lang.String getSecondaryGceZone();

  /**
   *
   *
   * <pre>
   * The Compute Engine zone that the failover instance is currently serving
   * from for a regional Cloud SQL instance.
   * </pre>
   *
   * <code>string secondary_gce_zone = 2;</code>
   *
   * @return The bytes for secondaryGceZone.
   */
  com.google.protobuf.ByteString getSecondaryGceZoneBytes();

  /**
   *
   *
   * <pre>
   * The availability status of the failover replica. A false status indicates
   * that the failover replica is out of sync. The primary instance can only
   * fail over to the failover replica when the status is true.
   * </pre>
   *
   * <code>bool is_failover_replica_available = 3;</code>
   *
   * @return The isFailoverReplicaAvailable.
   */
  boolean getIsFailoverReplicaAvailable();
}
