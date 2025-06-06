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
// source: google/cloud/redis/cluster/v1/cloud_redis_cluster.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.redis.cluster.v1;

public interface ClusterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.cluster.v1.Cluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Backups stored in Cloud Storage buckets.
   * The Cloud Storage buckets need to be the same region as the clusters.
   * Read permission is required to import from the provided Cloud Storage
   * objects.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.Cluster.GcsBackupSource gcs_source = 34 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();

  /**
   *
   *
   * <pre>
   * Optional. Backups stored in Cloud Storage buckets.
   * The Cloud Storage buckets need to be the same region as the clusters.
   * Read permission is required to import from the provided Cloud Storage
   * objects.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.Cluster.GcsBackupSource gcs_source = 34 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.redis.cluster.v1.Cluster.GcsBackupSource getGcsSource();

  /**
   *
   *
   * <pre>
   * Optional. Backups stored in Cloud Storage buckets.
   * The Cloud Storage buckets need to be the same region as the clusters.
   * Read permission is required to import from the provided Cloud Storage
   * objects.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.Cluster.GcsBackupSource gcs_source = 34 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.Cluster.GcsBackupSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Backups generated and managed by memorystore service.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.Cluster.ManagedBackupSource managed_backup_source = 35 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the managedBackupSource field is set.
   */
  boolean hasManagedBackupSource();

  /**
   *
   *
   * <pre>
   * Optional. Backups generated and managed by memorystore service.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.Cluster.ManagedBackupSource managed_backup_source = 35 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The managedBackupSource.
   */
  com.google.cloud.redis.cluster.v1.Cluster.ManagedBackupSource getManagedBackupSource();

  /**
   *
   *
   * <pre>
   * Optional. Backups generated and managed by memorystore service.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.Cluster.ManagedBackupSource managed_backup_source = 35 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.Cluster.ManagedBackupSourceOrBuilder
      getManagedBackupSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Identifier. Unique name of the resource in this scope including
   * project and location using the form:
   *     `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IDENTIFIER];
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. Identifier. Unique name of the resource in this scope including
   * project and location using the form:
   *     `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IDENTIFIER];
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp associated with the cluster creation request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp associated with the cluster creation request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp associated with the cluster creation request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The current state of this cluster.
   * Can be CREATING, READY, UPDATING, DELETING and SUSPENDED
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.Cluster.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The current state of this cluster.
   * Can be CREATING, READY, UPDATING, DELETING and SUSPENDED
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.Cluster.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.redis.cluster.v1.Cluster.State getState();

  /**
   *
   *
   * <pre>
   * Output only. System assigned, unique identifier for the cluster.
   * </pre>
   *
   * <code>string uid = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();

  /**
   *
   *
   * <pre>
   * Output only. System assigned, unique identifier for the cluster.
   * </pre>
   *
   * <code>string uid = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Optional. The number of replica nodes per shard.
   * </pre>
   *
   * <code>optional int32 replica_count = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the replicaCount field is set.
   */
  boolean hasReplicaCount();

  /**
   *
   *
   * <pre>
   * Optional. The number of replica nodes per shard.
   * </pre>
   *
   * <code>optional int32 replica_count = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The replicaCount.
   */
  int getReplicaCount();

  /**
   *
   *
   * <pre>
   * Optional. The authorization mode of the Redis cluster.
   * If not provided, auth feature is disabled for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.AuthorizationMode authorization_mode = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for authorizationMode.
   */
  int getAuthorizationModeValue();

  /**
   *
   *
   * <pre>
   * Optional. The authorization mode of the Redis cluster.
   * If not provided, auth feature is disabled for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.AuthorizationMode authorization_mode = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The authorizationMode.
   */
  com.google.cloud.redis.cluster.v1.AuthorizationMode getAuthorizationMode();

  /**
   *
   *
   * <pre>
   * Optional. The in-transit encryption for the Redis cluster.
   * If not provided, encryption  is disabled for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.TransitEncryptionMode transit_encryption_mode = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for transitEncryptionMode.
   */
  int getTransitEncryptionModeValue();

  /**
   *
   *
   * <pre>
   * Optional. The in-transit encryption for the Redis cluster.
   * If not provided, encryption  is disabled for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.TransitEncryptionMode transit_encryption_mode = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The transitEncryptionMode.
   */
  com.google.cloud.redis.cluster.v1.TransitEncryptionMode getTransitEncryptionMode();

  /**
   *
   *
   * <pre>
   * Output only. Redis memory size in GB for the entire cluster rounded up to
   * the next integer.
   * </pre>
   *
   * <code>optional int32 size_gb = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the sizeGb field is set.
   */
  boolean hasSizeGb();

  /**
   *
   *
   * <pre>
   * Output only. Redis memory size in GB for the entire cluster rounded up to
   * the next integer.
   * </pre>
   *
   * <code>optional int32 size_gb = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The sizeGb.
   */
  int getSizeGb();

  /**
   *
   *
   * <pre>
   * Optional. Number of shards for the Redis cluster.
   * </pre>
   *
   * <code>optional int32 shard_count = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the shardCount field is set.
   */
  boolean hasShardCount();

  /**
   *
   *
   * <pre>
   * Optional. Number of shards for the Redis cluster.
   * </pre>
   *
   * <code>optional int32 shard_count = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The shardCount.
   */
  int getShardCount();

  /**
   *
   *
   * <pre>
   * Optional. Each PscConfig configures the consumer network where IPs will
   * be designated to the cluster for client access through Private Service
   * Connect Automation. Currently, only one PscConfig is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConfig psc_configs = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.redis.cluster.v1.PscConfig> getPscConfigsList();

  /**
   *
   *
   * <pre>
   * Optional. Each PscConfig configures the consumer network where IPs will
   * be designated to the cluster for client access through Private Service
   * Connect Automation. Currently, only one PscConfig is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConfig psc_configs = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.PscConfig getPscConfigs(int index);

  /**
   *
   *
   * <pre>
   * Optional. Each PscConfig configures the consumer network where IPs will
   * be designated to the cluster for client access through Private Service
   * Connect Automation. Currently, only one PscConfig is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConfig psc_configs = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getPscConfigsCount();

  /**
   *
   *
   * <pre>
   * Optional. Each PscConfig configures the consumer network where IPs will
   * be designated to the cluster for client access through Private Service
   * Connect Automation. Currently, only one PscConfig is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConfig psc_configs = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.redis.cluster.v1.PscConfigOrBuilder>
      getPscConfigsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. Each PscConfig configures the consumer network where IPs will
   * be designated to the cluster for client access through Private Service
   * Connect Automation. Currently, only one PscConfig is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConfig psc_configs = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.PscConfigOrBuilder getPscConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Endpoints created on each given network, for Redis clients to
   * connect to the cluster. Currently only one discovery endpoint is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.DiscoveryEndpoint discovery_endpoints = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.redis.cluster.v1.DiscoveryEndpoint> getDiscoveryEndpointsList();

  /**
   *
   *
   * <pre>
   * Output only. Endpoints created on each given network, for Redis clients to
   * connect to the cluster. Currently only one discovery endpoint is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.DiscoveryEndpoint discovery_endpoints = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.DiscoveryEndpoint getDiscoveryEndpoints(int index);

  /**
   *
   *
   * <pre>
   * Output only. Endpoints created on each given network, for Redis clients to
   * connect to the cluster. Currently only one discovery endpoint is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.DiscoveryEndpoint discovery_endpoints = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getDiscoveryEndpointsCount();

  /**
   *
   *
   * <pre>
   * Output only. Endpoints created on each given network, for Redis clients to
   * connect to the cluster. Currently only one discovery endpoint is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.DiscoveryEndpoint discovery_endpoints = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.redis.cluster.v1.DiscoveryEndpointOrBuilder>
      getDiscoveryEndpointsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. Endpoints created on each given network, for Redis clients to
   * connect to the cluster. Currently only one discovery endpoint is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.DiscoveryEndpoint discovery_endpoints = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.DiscoveryEndpointOrBuilder getDiscoveryEndpointsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. The list of PSC connections that are auto-created through
   * service connectivity automation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConnection psc_connections = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.redis.cluster.v1.PscConnection> getPscConnectionsList();

  /**
   *
   *
   * <pre>
   * Output only. The list of PSC connections that are auto-created through
   * service connectivity automation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConnection psc_connections = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.PscConnection getPscConnections(int index);

  /**
   *
   *
   * <pre>
   * Output only. The list of PSC connections that are auto-created through
   * service connectivity automation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConnection psc_connections = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getPscConnectionsCount();

  /**
   *
   *
   * <pre>
   * Output only. The list of PSC connections that are auto-created through
   * service connectivity automation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConnection psc_connections = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.redis.cluster.v1.PscConnectionOrBuilder>
      getPscConnectionsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. The list of PSC connections that are auto-created through
   * service connectivity automation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConnection psc_connections = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.PscConnectionOrBuilder getPscConnectionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the current state of the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.Cluster.StateInfo state_info = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the stateInfo field is set.
   */
  boolean hasStateInfo();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the current state of the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.Cluster.StateInfo state_info = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The stateInfo.
   */
  com.google.cloud.redis.cluster.v1.Cluster.StateInfo getStateInfo();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the current state of the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.Cluster.StateInfo state_info = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.Cluster.StateInfoOrBuilder getStateInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The type of a redis node in the cluster. NodeType determines the
   * underlying machine-type of a redis node.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.NodeType node_type = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for nodeType.
   */
  int getNodeTypeValue();

  /**
   *
   *
   * <pre>
   * Optional. The type of a redis node in the cluster. NodeType determines the
   * underlying machine-type of a redis node.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.NodeType node_type = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The nodeType.
   */
  com.google.cloud.redis.cluster.v1.NodeType getNodeType();

  /**
   *
   *
   * <pre>
   * Optional. Persistence config (RDB, AOF) for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.ClusterPersistenceConfig persistence_config = 20 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the persistenceConfig field is set.
   */
  boolean hasPersistenceConfig();

  /**
   *
   *
   * <pre>
   * Optional. Persistence config (RDB, AOF) for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.ClusterPersistenceConfig persistence_config = 20 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The persistenceConfig.
   */
  com.google.cloud.redis.cluster.v1.ClusterPersistenceConfig getPersistenceConfig();

  /**
   *
   *
   * <pre>
   * Optional. Persistence config (RDB, AOF) for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.ClusterPersistenceConfig persistence_config = 20 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.ClusterPersistenceConfigOrBuilder
      getPersistenceConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Key/Value pairs of customer overrides for mutable Redis Configs
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getRedisConfigsCount();

  /**
   *
   *
   * <pre>
   * Optional. Key/Value pairs of customer overrides for mutable Redis Configs
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsRedisConfigs(java.lang.String key);

  /** Use {@link #getRedisConfigsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getRedisConfigs();

  /**
   *
   *
   * <pre>
   * Optional. Key/Value pairs of customer overrides for mutable Redis Configs
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getRedisConfigsMap();

  /**
   *
   *
   * <pre>
   * Optional. Key/Value pairs of customer overrides for mutable Redis Configs
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getRedisConfigsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. Key/Value pairs of customer overrides for mutable Redis Configs
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getRedisConfigsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Precise value of redis memory size in GB for the entire
   * cluster.
   * </pre>
   *
   * <code>optional double precise_size_gb = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the preciseSizeGb field is set.
   */
  boolean hasPreciseSizeGb();

  /**
   *
   *
   * <pre>
   * Output only. Precise value of redis memory size in GB for the entire
   * cluster.
   * </pre>
   *
   * <code>optional double precise_size_gb = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The preciseSizeGb.
   */
  double getPreciseSizeGb();

  /**
   *
   *
   * <pre>
   * Optional. This config will be used to determine how the customer wants us
   * to distribute cluster resources within the region.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.ZoneDistributionConfig zone_distribution_config = 23 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the zoneDistributionConfig field is set.
   */
  boolean hasZoneDistributionConfig();

  /**
   *
   *
   * <pre>
   * Optional. This config will be used to determine how the customer wants us
   * to distribute cluster resources within the region.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.ZoneDistributionConfig zone_distribution_config = 23 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The zoneDistributionConfig.
   */
  com.google.cloud.redis.cluster.v1.ZoneDistributionConfig getZoneDistributionConfig();

  /**
   *
   *
   * <pre>
   * Optional. This config will be used to determine how the customer wants us
   * to distribute cluster resources within the region.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.ZoneDistributionConfig zone_distribution_config = 23 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.ZoneDistributionConfigOrBuilder
      getZoneDistributionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Cross cluster replication config.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.CrossClusterReplicationConfig cross_cluster_replication_config = 24 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the crossClusterReplicationConfig field is set.
   */
  boolean hasCrossClusterReplicationConfig();

  /**
   *
   *
   * <pre>
   * Optional. Cross cluster replication config.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.CrossClusterReplicationConfig cross_cluster_replication_config = 24 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The crossClusterReplicationConfig.
   */
  com.google.cloud.redis.cluster.v1.CrossClusterReplicationConfig
      getCrossClusterReplicationConfig();

  /**
   *
   *
   * <pre>
   * Optional. Cross cluster replication config.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.CrossClusterReplicationConfig cross_cluster_replication_config = 24 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.CrossClusterReplicationConfigOrBuilder
      getCrossClusterReplicationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The delete operation will fail when the value is set to true.
   * </pre>
   *
   * <code>optional bool deletion_protection_enabled = 25 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the deletionProtectionEnabled field is set.
   */
  boolean hasDeletionProtectionEnabled();

  /**
   *
   *
   * <pre>
   * Optional. The delete operation will fail when the value is set to true.
   * </pre>
   *
   * <code>optional bool deletion_protection_enabled = 25 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The deletionProtectionEnabled.
   */
  boolean getDeletionProtectionEnabled();

  /**
   *
   *
   * <pre>
   * Optional. ClusterMaintenancePolicy determines when to allow or deny
   * updates.
   * </pre>
   *
   * <code>
   * optional .google.cloud.redis.cluster.v1.ClusterMaintenancePolicy maintenance_policy = 26 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the maintenancePolicy field is set.
   */
  boolean hasMaintenancePolicy();

  /**
   *
   *
   * <pre>
   * Optional. ClusterMaintenancePolicy determines when to allow or deny
   * updates.
   * </pre>
   *
   * <code>
   * optional .google.cloud.redis.cluster.v1.ClusterMaintenancePolicy maintenance_policy = 26 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The maintenancePolicy.
   */
  com.google.cloud.redis.cluster.v1.ClusterMaintenancePolicy getMaintenancePolicy();

  /**
   *
   *
   * <pre>
   * Optional. ClusterMaintenancePolicy determines when to allow or deny
   * updates.
   * </pre>
   *
   * <code>
   * optional .google.cloud.redis.cluster.v1.ClusterMaintenancePolicy maintenance_policy = 26 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.ClusterMaintenancePolicyOrBuilder
      getMaintenancePolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. ClusterMaintenanceSchedule Output only Published maintenance
   * schedule.
   * </pre>
   *
   * <code>
   * optional .google.cloud.redis.cluster.v1.ClusterMaintenanceSchedule maintenance_schedule = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the maintenanceSchedule field is set.
   */
  boolean hasMaintenanceSchedule();

  /**
   *
   *
   * <pre>
   * Output only. ClusterMaintenanceSchedule Output only Published maintenance
   * schedule.
   * </pre>
   *
   * <code>
   * optional .google.cloud.redis.cluster.v1.ClusterMaintenanceSchedule maintenance_schedule = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The maintenanceSchedule.
   */
  com.google.cloud.redis.cluster.v1.ClusterMaintenanceSchedule getMaintenanceSchedule();

  /**
   *
   *
   * <pre>
   * Output only. ClusterMaintenanceSchedule Output only Published maintenance
   * schedule.
   * </pre>
   *
   * <code>
   * optional .google.cloud.redis.cluster.v1.ClusterMaintenanceSchedule maintenance_schedule = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.ClusterMaintenanceScheduleOrBuilder
      getMaintenanceScheduleOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Service attachment details to configure Psc connections
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscServiceAttachment psc_service_attachments = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.redis.cluster.v1.PscServiceAttachment>
      getPscServiceAttachmentsList();

  /**
   *
   *
   * <pre>
   * Output only. Service attachment details to configure Psc connections
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscServiceAttachment psc_service_attachments = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.PscServiceAttachment getPscServiceAttachments(int index);

  /**
   *
   *
   * <pre>
   * Output only. Service attachment details to configure Psc connections
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscServiceAttachment psc_service_attachments = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getPscServiceAttachmentsCount();

  /**
   *
   *
   * <pre>
   * Output only. Service attachment details to configure Psc connections
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscServiceAttachment psc_service_attachments = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.redis.cluster.v1.PscServiceAttachmentOrBuilder>
      getPscServiceAttachmentsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. Service attachment details to configure Psc connections
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscServiceAttachment psc_service_attachments = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.PscServiceAttachmentOrBuilder getPscServiceAttachmentsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. A list of cluster enpoints.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.ClusterEndpoint cluster_endpoints = 36 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.redis.cluster.v1.ClusterEndpoint> getClusterEndpointsList();

  /**
   *
   *
   * <pre>
   * Optional. A list of cluster enpoints.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.ClusterEndpoint cluster_endpoints = 36 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.ClusterEndpoint getClusterEndpoints(int index);

  /**
   *
   *
   * <pre>
   * Optional. A list of cluster enpoints.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.ClusterEndpoint cluster_endpoints = 36 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getClusterEndpointsCount();

  /**
   *
   *
   * <pre>
   * Optional. A list of cluster enpoints.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.ClusterEndpoint cluster_endpoints = 36 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.redis.cluster.v1.ClusterEndpointOrBuilder>
      getClusterEndpointsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. A list of cluster enpoints.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.ClusterEndpoint cluster_endpoints = 36 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.ClusterEndpointOrBuilder getClusterEndpointsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. Output only. The backup collection full resource name. Example:
   * projects/{project}/locations/{location}/backupCollections/{collection}
   * </pre>
   *
   * <code>
   * optional string backup_collection = 39 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return Whether the backupCollection field is set.
   */
  boolean hasBackupCollection();

  /**
   *
   *
   * <pre>
   * Optional. Output only. The backup collection full resource name. Example:
   * projects/{project}/locations/{location}/backupCollections/{collection}
   * </pre>
   *
   * <code>
   * optional string backup_collection = 39 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The backupCollection.
   */
  java.lang.String getBackupCollection();

  /**
   *
   *
   * <pre>
   * Optional. Output only. The backup collection full resource name. Example:
   * projects/{project}/locations/{location}/backupCollections/{collection}
   * </pre>
   *
   * <code>
   * optional string backup_collection = 39 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for backupCollection.
   */
  com.google.protobuf.ByteString getBackupCollectionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The KMS key used to encrypt the at-rest data of the cluster.
   * </pre>
   *
   * <code>
   * optional string kms_key = 40 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return Whether the kmsKey field is set.
   */
  boolean hasKmsKey();

  /**
   *
   *
   * <pre>
   * Optional. The KMS key used to encrypt the at-rest data of the cluster.
   * </pre>
   *
   * <code>
   * optional string kms_key = 40 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The kmsKey.
   */
  java.lang.String getKmsKey();

  /**
   *
   *
   * <pre>
   * Optional. The KMS key used to encrypt the at-rest data of the cluster.
   * </pre>
   *
   * <code>
   * optional string kms_key = 40 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for kmsKey.
   */
  com.google.protobuf.ByteString getKmsKeyBytes();

  /**
   *
   *
   * <pre>
   * Optional. The automated backup config for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.AutomatedBackupConfig automated_backup_config = 42 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the automatedBackupConfig field is set.
   */
  boolean hasAutomatedBackupConfig();

  /**
   *
   *
   * <pre>
   * Optional. The automated backup config for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.AutomatedBackupConfig automated_backup_config = 42 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The automatedBackupConfig.
   */
  com.google.cloud.redis.cluster.v1.AutomatedBackupConfig getAutomatedBackupConfig();

  /**
   *
   *
   * <pre>
   * Optional. The automated backup config for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.AutomatedBackupConfig automated_backup_config = 42 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.AutomatedBackupConfigOrBuilder
      getAutomatedBackupConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Encryption information of the data at rest of the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.EncryptionInfo encryption_info = 43 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the encryptionInfo field is set.
   */
  boolean hasEncryptionInfo();

  /**
   *
   *
   * <pre>
   * Output only. Encryption information of the data at rest of the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.EncryptionInfo encryption_info = 43 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The encryptionInfo.
   */
  com.google.cloud.redis.cluster.v1.EncryptionInfo getEncryptionInfo();

  /**
   *
   *
   * <pre>
   * Output only. Encryption information of the data at rest of the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.EncryptionInfo encryption_info = 43 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.EncryptionInfoOrBuilder getEncryptionInfoOrBuilder();

  com.google.cloud.redis.cluster.v1.Cluster.ImportSourcesCase getImportSourcesCase();
}
