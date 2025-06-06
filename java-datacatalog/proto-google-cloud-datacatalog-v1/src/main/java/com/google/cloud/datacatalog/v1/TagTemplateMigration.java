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
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Configuration related to the opt-in status for the migration of TagTemplates
 * to Dataplex.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.datacatalog.v1.TagTemplateMigration}
 */
public enum TagTemplateMigration implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value. Migration of Tag Templates from Data Catalog to Dataplex is
   * not performed.
   * </pre>
   *
   * <code>TAG_TEMPLATE_MIGRATION_UNSPECIFIED = 0;</code>
   */
  TAG_TEMPLATE_MIGRATION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Migration of Tag Templates from Data Catalog to Dataplex is enabled.
   * </pre>
   *
   * <code>TAG_TEMPLATE_MIGRATION_ENABLED = 1;</code>
   */
  TAG_TEMPLATE_MIGRATION_ENABLED(1),
  /**
   *
   *
   * <pre>
   * Migration of Tag Templates from Data Catalog to Dataplex is disabled.
   * </pre>
   *
   * <code>TAG_TEMPLATE_MIGRATION_DISABLED = 2;</code>
   */
  TAG_TEMPLATE_MIGRATION_DISABLED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value. Migration of Tag Templates from Data Catalog to Dataplex is
   * not performed.
   * </pre>
   *
   * <code>TAG_TEMPLATE_MIGRATION_UNSPECIFIED = 0;</code>
   */
  public static final int TAG_TEMPLATE_MIGRATION_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Migration of Tag Templates from Data Catalog to Dataplex is enabled.
   * </pre>
   *
   * <code>TAG_TEMPLATE_MIGRATION_ENABLED = 1;</code>
   */
  public static final int TAG_TEMPLATE_MIGRATION_ENABLED_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Migration of Tag Templates from Data Catalog to Dataplex is disabled.
   * </pre>
   *
   * <code>TAG_TEMPLATE_MIGRATION_DISABLED = 2;</code>
   */
  public static final int TAG_TEMPLATE_MIGRATION_DISABLED_VALUE = 2;

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
  public static TagTemplateMigration valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TagTemplateMigration forNumber(int value) {
    switch (value) {
      case 0:
        return TAG_TEMPLATE_MIGRATION_UNSPECIFIED;
      case 1:
        return TAG_TEMPLATE_MIGRATION_ENABLED;
      case 2:
        return TAG_TEMPLATE_MIGRATION_DISABLED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TagTemplateMigration>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<TagTemplateMigration>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TagTemplateMigration>() {
            public TagTemplateMigration findValueByNumber(int number) {
              return TagTemplateMigration.forNumber(number);
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
    return com.google.cloud.datacatalog.v1.Datacatalog.getDescriptor().getEnumTypes().get(1);
  }

  private static final TagTemplateMigration[] VALUES = values();

  public static TagTemplateMigration valueOf(
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

  private TagTemplateMigration(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.datacatalog.v1.TagTemplateMigration)
}
