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
// source: google/cloud/memorystore/v1beta/memorystore.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.memorystore.v1beta;

public interface PersistenceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.memorystore.v1beta.PersistenceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Current persistence mode.
   * </pre>
   *
   * <code>
   * .google.cloud.memorystore.v1beta.PersistenceConfig.PersistenceMode mode = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();

  /**
   *
   *
   * <pre>
   * Optional. Current persistence mode.
   * </pre>
   *
   * <code>
   * .google.cloud.memorystore.v1beta.PersistenceConfig.PersistenceMode mode = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The mode.
   */
  com.google.cloud.memorystore.v1beta.PersistenceConfig.PersistenceMode getMode();

  /**
   *
   *
   * <pre>
   * Optional. RDB configuration. This field will be ignored if mode is not RDB.
   * </pre>
   *
   * <code>
   * .google.cloud.memorystore.v1beta.PersistenceConfig.RDBConfig rdb_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the rdbConfig field is set.
   */
  boolean hasRdbConfig();

  /**
   *
   *
   * <pre>
   * Optional. RDB configuration. This field will be ignored if mode is not RDB.
   * </pre>
   *
   * <code>
   * .google.cloud.memorystore.v1beta.PersistenceConfig.RDBConfig rdb_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The rdbConfig.
   */
  com.google.cloud.memorystore.v1beta.PersistenceConfig.RDBConfig getRdbConfig();

  /**
   *
   *
   * <pre>
   * Optional. RDB configuration. This field will be ignored if mode is not RDB.
   * </pre>
   *
   * <code>
   * .google.cloud.memorystore.v1beta.PersistenceConfig.RDBConfig rdb_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.memorystore.v1beta.PersistenceConfig.RDBConfigOrBuilder getRdbConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. AOF configuration. This field will be ignored if mode is not AOF.
   * </pre>
   *
   * <code>
   * .google.cloud.memorystore.v1beta.PersistenceConfig.AOFConfig aof_config = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the aofConfig field is set.
   */
  boolean hasAofConfig();

  /**
   *
   *
   * <pre>
   * Optional. AOF configuration. This field will be ignored if mode is not AOF.
   * </pre>
   *
   * <code>
   * .google.cloud.memorystore.v1beta.PersistenceConfig.AOFConfig aof_config = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The aofConfig.
   */
  com.google.cloud.memorystore.v1beta.PersistenceConfig.AOFConfig getAofConfig();

  /**
   *
   *
   * <pre>
   * Optional. AOF configuration. This field will be ignored if mode is not AOF.
   * </pre>
   *
   * <code>
   * .google.cloud.memorystore.v1beta.PersistenceConfig.AOFConfig aof_config = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.memorystore.v1beta.PersistenceConfig.AOFConfigOrBuilder getAofConfigOrBuilder();
}
