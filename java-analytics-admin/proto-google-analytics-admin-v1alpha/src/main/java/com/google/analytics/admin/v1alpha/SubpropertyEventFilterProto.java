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
// source: google/analytics/admin/v1alpha/subproperty_event_filter.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.admin.v1alpha;

public final class SubpropertyEventFilterProto {
  private SubpropertyEventFilterProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_StringFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_StringFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpression_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpression_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpressionList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpressionList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterClause_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterClause_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "=google/analytics/admin/v1alpha/subproperty_event_filter.proto\022\036google.analytic"
          + "s.admin.v1alpha\032\037google/api/field_behavior.proto\032\031google/api/resource.proto\"\201\004\n"
          + "\037SubpropertyEventFilterCondition\022\025\n"
          + "\013null_filter\030\002 \001(\010H\000\022e\n\r"
          + "string_filter\030\003 \001(\0132L."
          + "google.analytics.admin.v1alpha.SubpropertyEventFilterCondition.StringFilterH\000\022\027\n"
          + "\n"
          + "field_name\030\001 \001(\tB\003\340A\002\032\270\002\n"
          + "\014StringFilter\022o\n\n"
          + "match_type\030\001 \001(\0162V.google.analytics.a"
          + "dmin.v1alpha.SubpropertyEventFilterCondition.StringFilter.MatchTypeB\003\340A\002\022\022\n"
          + "\005value\030\002 \001(\tB\003\340A\002\022\033\n"
          + "\016case_sensitive\030\003 \001(\010B\003\340A\001\"\205\001\n"
          + "\tMatchType\022\032\n"
          + "\026MATCH_TYPE_UNSPECIFIED\020\000\022\t\n"
          + "\005EXACT\020\001\022\017\n"
          + "\013BEGINS_WITH\020\002\022\r\n"
          + "\tENDS_WITH\020\003\022\014\n"
          + "\010CONTAINS\020\004\022\017\n"
          + "\013FULL_REGEXP\020\005\022\022\n"
          + "\016PARTIAL_REGEXP\020\006B\014\n\n"
          + "one_filter\"\275\002\n"
          + " SubpropertyEventFilterExpression\022X\n"
          + "\010or_group\030\001 \001(\0132D.google.analytics.admin.v1alpha."
          + "SubpropertyEventFilterExpressionListH\000\022Z\n"
          + "\016not_expression\030\002 \001(\0132@.google.analytic"
          + "s.admin.v1alpha.SubpropertyEventFilterExpressionH\000\022[\n"
          + "\020filter_condition\030\003 \001(\0132?.g"
          + "oogle.analytics.admin.v1alpha.SubpropertyEventFilterConditionH\000B\006\n"
          + "\004expr\"\214\001\n"
          + "$SubpropertyEventFilterExpressionList\022d\n"
          + "\022filter_expressions\030\001 \003(\0132@.google.analytics."
          + "admin.v1alpha.SubpropertyEventFilterExpressionB\006\340A\002\340A\006\"\302\002\n"
          + "\034SubpropertyEventFilterClause\022n\n"
          + "\022filter_clause_type\030\001 \001(\0162M.google.analytics.admin.v1alpha.Subproperty"
          + "EventFilterClause.FilterClauseTypeB\003\340A\002\022`\n"
          + "\021filter_expression\030\002 \001(\0132@.google.anal"
          + "ytics.admin.v1alpha.SubpropertyEventFilterExpressionB\003\340A\002\"P\n"
          + "\020FilterClauseType\022\"\n"
          + "\036FILTER_CLAUSE_TYPE_UNSPECIFIED\020\000\022\013\n"
          + "\007INCLUDE\020\001\022\013\n"
          + "\007EXCLUDE\020\002\"\375\002\n"
          + "\026SubpropertyEventFilter\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\003\022#\n"
          + "\021apply_to_property\030\002 \001(\tB\003\340A\005H\000\210\001\001\022\\\n"
          + "\016filter_clauses\030\003 \003(\0132<.google.analytics.admin.v1alpha."
          + "SubpropertyEventFilterClauseB\006\340A\002\340A\006:\266\001\352A\262\001\n"
          + "4analyticsadmin.googleapis.com/SubpropertyEventFilter\022Iproperties/{property}"
          + "/subpropertyEventFilters/{sub_property_e"
          + "vent_filter}*\027subpropertyEventFilters2\026subpropertyEventFilterB\024\n"
          + "\022_apply_to_propertyB\203\001\n"
          + "\"com.google.analytics.admin.v1alphaB\033SubpropertyEventFilterProtoP\001Z>cloud"
          + ".google.com/go/analytics/admin/apiv1alpha/adminpb;adminpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_descriptor,
            new java.lang.String[] {
              "NullFilter", "StringFilter", "FieldName", "OneFilter",
            });
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_StringFilter_descriptor =
        internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_StringFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_StringFilter_descriptor,
            new java.lang.String[] {
              "MatchType", "Value", "CaseSensitive",
            });
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpression_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpression_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpression_descriptor,
            new java.lang.String[] {
              "OrGroup", "NotExpression", "FilterCondition", "Expr",
            });
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpressionList_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpressionList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpressionList_descriptor,
            new java.lang.String[] {
              "FilterExpressions",
            });
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterClause_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterClause_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterClause_descriptor,
            new java.lang.String[] {
              "FilterClauseType", "FilterExpression",
            });
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilter_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilter_descriptor,
            new java.lang.String[] {
              "Name", "ApplyToProperty", "FilterClauses",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
