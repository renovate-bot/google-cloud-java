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
// source: google/cloud/clouddms/v1/clouddms.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.clouddms.v1;

/**
 *
 *
 * <pre>
 * AIP-157 Partial Response view for Database Entity.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.clouddms.v1.DatabaseEntityView}
 */
public enum DatabaseEntityView implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified view. Defaults to basic view.
   * </pre>
   *
   * <code>DATABASE_ENTITY_VIEW_UNSPECIFIED = 0;</code>
   */
  DATABASE_ENTITY_VIEW_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Default view. Does not return DDLs or Issues.
   * </pre>
   *
   * <code>DATABASE_ENTITY_VIEW_BASIC = 1;</code>
   */
  DATABASE_ENTITY_VIEW_BASIC(1),
  /**
   *
   *
   * <pre>
   * Return full entity details including mappings, ddl and issues.
   * </pre>
   *
   * <code>DATABASE_ENTITY_VIEW_FULL = 2;</code>
   */
  DATABASE_ENTITY_VIEW_FULL(2),
  /**
   *
   *
   * <pre>
   * Top-most (Database, Schema) nodes which are returned contains summary
   * details for their decendents such as the number of entities per type and
   * issues rollups. When this view is used, only a single page of result is
   * returned and the page_size property of the request is ignored. The
   * returned page will only include the top-most node types.
   * </pre>
   *
   * <code>DATABASE_ENTITY_VIEW_ROOT_SUMMARY = 3;</code>
   */
  DATABASE_ENTITY_VIEW_ROOT_SUMMARY(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified view. Defaults to basic view.
   * </pre>
   *
   * <code>DATABASE_ENTITY_VIEW_UNSPECIFIED = 0;</code>
   */
  public static final int DATABASE_ENTITY_VIEW_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Default view. Does not return DDLs or Issues.
   * </pre>
   *
   * <code>DATABASE_ENTITY_VIEW_BASIC = 1;</code>
   */
  public static final int DATABASE_ENTITY_VIEW_BASIC_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Return full entity details including mappings, ddl and issues.
   * </pre>
   *
   * <code>DATABASE_ENTITY_VIEW_FULL = 2;</code>
   */
  public static final int DATABASE_ENTITY_VIEW_FULL_VALUE = 2;

  /**
   *
   *
   * <pre>
   * Top-most (Database, Schema) nodes which are returned contains summary
   * details for their decendents such as the number of entities per type and
   * issues rollups. When this view is used, only a single page of result is
   * returned and the page_size property of the request is ignored. The
   * returned page will only include the top-most node types.
   * </pre>
   *
   * <code>DATABASE_ENTITY_VIEW_ROOT_SUMMARY = 3;</code>
   */
  public static final int DATABASE_ENTITY_VIEW_ROOT_SUMMARY_VALUE = 3;

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
  public static DatabaseEntityView valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DatabaseEntityView forNumber(int value) {
    switch (value) {
      case 0:
        return DATABASE_ENTITY_VIEW_UNSPECIFIED;
      case 1:
        return DATABASE_ENTITY_VIEW_BASIC;
      case 2:
        return DATABASE_ENTITY_VIEW_FULL;
      case 3:
        return DATABASE_ENTITY_VIEW_ROOT_SUMMARY;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DatabaseEntityView> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<DatabaseEntityView>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DatabaseEntityView>() {
            public DatabaseEntityView findValueByNumber(int number) {
              return DatabaseEntityView.forNumber(number);
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
    return com.google.cloud.clouddms.v1.ClouddmsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final DatabaseEntityView[] VALUES = values();

  public static DatabaseEntityView valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DatabaseEntityView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.clouddms.v1.DatabaseEntityView)
}
