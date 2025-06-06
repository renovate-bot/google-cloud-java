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
// source: google/cloud/datacatalog/v1/common.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * This enum lists all the systems that Data Catalog integrates with.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.datacatalog.v1.IntegratedSystem}
 */
public enum IntegratedSystem implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default unknown system.
   * </pre>
   *
   * <code>INTEGRATED_SYSTEM_UNSPECIFIED = 0;</code>
   */
  INTEGRATED_SYSTEM_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * BigQuery.
   * </pre>
   *
   * <code>BIGQUERY = 1;</code>
   */
  BIGQUERY(1),
  /**
   *
   *
   * <pre>
   * Cloud Pub/Sub.
   * </pre>
   *
   * <code>CLOUD_PUBSUB = 2;</code>
   */
  CLOUD_PUBSUB(2),
  /**
   *
   *
   * <pre>
   * Dataproc Metastore.
   * </pre>
   *
   * <code>DATAPROC_METASTORE = 3;</code>
   */
  DATAPROC_METASTORE(3),
  /**
   *
   *
   * <pre>
   * Dataplex.
   * </pre>
   *
   * <code>DATAPLEX = 4;</code>
   */
  DATAPLEX(4),
  /**
   *
   *
   * <pre>
   * Cloud Spanner
   * </pre>
   *
   * <code>CLOUD_SPANNER = 6;</code>
   */
  CLOUD_SPANNER(6),
  /**
   *
   *
   * <pre>
   * Cloud Bigtable
   * </pre>
   *
   * <code>CLOUD_BIGTABLE = 7;</code>
   */
  CLOUD_BIGTABLE(7),
  /**
   *
   *
   * <pre>
   * Cloud Sql
   * </pre>
   *
   * <code>CLOUD_SQL = 8;</code>
   */
  CLOUD_SQL(8),
  /**
   *
   *
   * <pre>
   * Looker
   * </pre>
   *
   * <code>LOOKER = 9;</code>
   */
  LOOKER(9),
  /**
   *
   *
   * <pre>
   * Vertex AI
   * </pre>
   *
   * <code>VERTEX_AI = 10;</code>
   */
  VERTEX_AI(10),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default unknown system.
   * </pre>
   *
   * <code>INTEGRATED_SYSTEM_UNSPECIFIED = 0;</code>
   */
  public static final int INTEGRATED_SYSTEM_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * BigQuery.
   * </pre>
   *
   * <code>BIGQUERY = 1;</code>
   */
  public static final int BIGQUERY_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Cloud Pub/Sub.
   * </pre>
   *
   * <code>CLOUD_PUBSUB = 2;</code>
   */
  public static final int CLOUD_PUBSUB_VALUE = 2;

  /**
   *
   *
   * <pre>
   * Dataproc Metastore.
   * </pre>
   *
   * <code>DATAPROC_METASTORE = 3;</code>
   */
  public static final int DATAPROC_METASTORE_VALUE = 3;

  /**
   *
   *
   * <pre>
   * Dataplex.
   * </pre>
   *
   * <code>DATAPLEX = 4;</code>
   */
  public static final int DATAPLEX_VALUE = 4;

  /**
   *
   *
   * <pre>
   * Cloud Spanner
   * </pre>
   *
   * <code>CLOUD_SPANNER = 6;</code>
   */
  public static final int CLOUD_SPANNER_VALUE = 6;

  /**
   *
   *
   * <pre>
   * Cloud Bigtable
   * </pre>
   *
   * <code>CLOUD_BIGTABLE = 7;</code>
   */
  public static final int CLOUD_BIGTABLE_VALUE = 7;

  /**
   *
   *
   * <pre>
   * Cloud Sql
   * </pre>
   *
   * <code>CLOUD_SQL = 8;</code>
   */
  public static final int CLOUD_SQL_VALUE = 8;

  /**
   *
   *
   * <pre>
   * Looker
   * </pre>
   *
   * <code>LOOKER = 9;</code>
   */
  public static final int LOOKER_VALUE = 9;

  /**
   *
   *
   * <pre>
   * Vertex AI
   * </pre>
   *
   * <code>VERTEX_AI = 10;</code>
   */
  public static final int VERTEX_AI_VALUE = 10;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static IntegratedSystem valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IntegratedSystem forNumber(int value) {
    switch (value) {
      case 0:
        return INTEGRATED_SYSTEM_UNSPECIFIED;
      case 1:
        return BIGQUERY;
      case 2:
        return CLOUD_PUBSUB;
      case 3:
        return DATAPROC_METASTORE;
      case 4:
        return DATAPLEX;
      case 6:
        return CLOUD_SPANNER;
      case 7:
        return CLOUD_BIGTABLE;
      case 8:
        return CLOUD_SQL;
      case 9:
        return LOOKER;
      case 10:
        return VERTEX_AI;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IntegratedSystem> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<IntegratedSystem> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<IntegratedSystem>() {
        public IntegratedSystem findValueByNumber(int number) {
          return IntegratedSystem.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.Common.getDescriptor().getEnumTypes().get(0);
  }

  private static final IntegratedSystem[] VALUES = values();

  public static IntegratedSystem valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private IntegratedSystem(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.datacatalog.v1.IntegratedSystem)
}
