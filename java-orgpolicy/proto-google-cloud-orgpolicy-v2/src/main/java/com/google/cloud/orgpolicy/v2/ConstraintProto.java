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
// source: google/cloud/orgpolicy/v2/constraint.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.orgpolicy.v2;

public final class ConstraintProto {
  private ConstraintProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v2_Constraint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_Constraint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v2_Constraint_ListConstraint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_Constraint_ListConstraint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_Parameter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_Parameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_Parameter_Metadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_Parameter_Metadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_ParametersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_ParametersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v2_Constraint_BooleanConstraint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_Constraint_BooleanConstraint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v2_CustomConstraint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_CustomConstraint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "*google/cloud/orgpolicy/v2/constraint.p"
          + "roto\022\031google.cloud.orgpolicy.v2\032\037google/"
          + "api/field_behavior.proto\032\031google/api/res"
          + "ource.proto\032\034google/protobuf/struct.proto\032\037google/protobuf/timestamp.proto\"\372\017\n\n"
          + "Constraint\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\005\022\024\n"
          + "\014display_name\030\002 \001(\t\022\023\n"
          + "\013description\030\003 \001(\t\022S\n"
          + "\022constraint_default\030\004"
          + " \001(\01627.google.cloud.orgpolicy.v2.Constraint.ConstraintDefault\022O\n"
          + "\017list_constraint\030\005"
          + " \001(\01324.google.cloud.orgpolicy.v2.Constraint.ListConstraintH\000\022U\n"
          + "\022boolean_constraint\030\006 \001(\01327.google.cloud"
          + ".orgpolicy.v2.Constraint.BooleanConstraintH\000\022\030\n"
          + "\020supports_dry_run\030\007 \001(\010\022\035\n"
          + "\025equivalent_constraint\030\010 \001(\t\022\033\n"
          + "\023supports_simulation\030\t \001(\010\032=\n"
          + "\016ListConstraint\022\023\n"
          + "\013supports_in\030\001 \001(\010\022\026\n"
          + "\016supports_under\030\002 \001(\010\032\202\t\n"
          + "\032CustomConstraintDefinition\022\026\n"
          + "\016resource_types\030\001 \003(\t\022a\n"
          + "\014method_types\030\002 \003(\0162K.google."
          + "cloud.orgpolicy.v2.Constraint.CustomConstraintDefinition.MethodType\022\021\n"
          + "\tcondition\030\003 \001(\t\022`\n"
          + "\013action_type\030\004 \001(\0162K.google.clo"
          + "ud.orgpolicy.v2.Constraint.CustomConstraintDefinition.ActionType\022d\n\n"
          + "parameters\030\005 \003(\0132P.google.cloud.orgpolicy.v2.Constra"
          + "int.CustomConstraintDefinition.ParametersEntry\032\334\003\n"
          + "\tParameter\022]\n"
          + "\004type\030\001 \001(\0162O.goo"
          + "gle.cloud.orgpolicy.v2.Constraint.CustomConstraintDefinition.Parameter.Type\022-\n\r"
          + "default_value\030\002 \001(\0132\026.google.protobuf.Value\022\031\n"
          + "\021valid_values_expr\030\003 \001(\t\022e\n"
          + "\010metadata\030\004 \001(\0132S.google.cloud.orgpolicy.v2.Cons"
          + "traint.CustomConstraintDefinition.Parameter.Metadata\022]\n"
          + "\004item\030\005 \001(\0162O.google.clou"
          + "d.orgpolicy.v2.Constraint.CustomConstraintDefinition.Parameter.Type\032\037\n"
          + "\010Metadata\022\023\n"
          + "\013description\030\001 \001(\t\"?\n"
          + "\004Type\022\024\n"
          + "\020TYPE_UNSPECIFIED\020\000\022\010\n"
          + "\004LIST\020\001\022\n\n"
          + "\006STRING\020\002\022\013\n"
          + "\007BOOLEAN\020\003\032}\n"
          + "\017ParametersEntry\022\013\n"
          + "\003key\030\001 \001(\t\022Y\n"
          + "\005value\030\002 \001(\0132J.google.cloud.orgpolicy.v2"
          + ".Constraint.CustomConstraintDefinition.Parameter:\0028\001\"p\n\n"
          + "MethodType\022\033\n"
          + "\027METHOD_TYPE_UNSPECIFIED\020\000\022\n\n"
          + "\006CREATE\020\001\022\n\n"
          + "\006UPDATE\020\002\022\n\n"
          + "\006DELETE\020\003\022\020\n"
          + "\014REMOVE_GRANT\020\004\022\017\n"
          + "\013GOVERN_TAGS\020\005\">\n\n"
          + "ActionType\022\033\n"
          + "\027ACTION_TYPE_UNSPECIFIED\020\000\022\t\n"
          + "\005ALLOW\020\001\022\010\n"
          + "\004DENY\020\002\032{\n"
          + "\021BooleanConstraint\022f\n"
          + "\034custom_constraint_definition\030\001"
          + " \001(\0132@.google.cloud.orgpolicy.v2.Constraint.CustomConstraintDefinition\"L\n"
          + "\021ConstraintDefault\022\"\n"
          + "\036CONSTRAINT_DEFAULT_UNSPECIFIED\020\000\022\t\n"
          + "\005ALLOW\020\001\022\010\n"
          + "\004DENY\020\002:\270\001\352A\264\001\n"
          + "#orgpolicy.googleapis.com/Constraint\022+projects/{project}/constraints/{constrain"
          + "t}\022)folders/{folder}/constraints/{constr"
          + "aint}\0225organizations/{organization}/constraints/{constraint}B\021\n"
          + "\017constraint_type\"\367\004\n"
          + "\020CustomConstraint\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\005\022\033\n"
          + "\016resource_types\030\002 \003(\tB\003\340A\005\022L\n"
          + "\014method_types\030\003"
          + " \003(\01626.google.cloud.orgpolicy.v2.CustomConstraint.MethodType\022\021\n"
          + "\tcondition\030\004 \001(\t\022K\n"
          + "\013action_type\030\005 \001(\01626.google.clou"
          + "d.orgpolicy.v2.CustomConstraint.ActionType\022\024\n"
          + "\014display_name\030\006 \001(\t\022\023\n"
          + "\013description\030\007 \001(\t\0224\n"
          + "\013update_time\030\010 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\"p\n\n"
          + "MethodType\022\033\n"
          + "\027METHOD_TYPE_UNSPECIFIED\020\000\022\n\n"
          + "\006CREATE\020\001\022\n\n"
          + "\006UPDATE\020\002\022\n\n"
          + "\006DELETE\020\003\022\020\n"
          + "\014REMOVE_GRANT\020\004\022\017\n"
          + "\013GOVERN_TAGS\020\005\">\n\n"
          + "ActionType\022\033\n"
          + "\027ACTION_TYPE_UNSPECIFIED\020\000\022\t\n"
          + "\005ALLOW\020\001\022\010\n"
          + "\004DENY\020\002:r\352Ao\n"
          + ")orgpolicy.googleapis.com/CustomConst"
          + "raint\022Borganizations/{organization}/customConstraints/{custom_constraint}B\306\001\n"
          + "\035com.google.cloud.orgpolicy.v2B\017ConstraintP"
          + "rotoP\001Z;cloud.google.com/go/orgpolicy/ap"
          + "iv2/orgpolicypb;orgpolicypb\252\002\031Google.Clo"
          + "ud.OrgPolicy.V2\312\002\031Google\\Cloud\\OrgPolicy"
          + "\\V2\352\002\034Google::Cloud::OrgPolicy::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_orgpolicy_v2_Constraint_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_orgpolicy_v2_Constraint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v2_Constraint_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "ConstraintDefault",
              "ListConstraint",
              "BooleanConstraint",
              "SupportsDryRun",
              "EquivalentConstraint",
              "SupportsSimulation",
              "ConstraintType",
            });
    internal_static_google_cloud_orgpolicy_v2_Constraint_ListConstraint_descriptor =
        internal_static_google_cloud_orgpolicy_v2_Constraint_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_orgpolicy_v2_Constraint_ListConstraint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v2_Constraint_ListConstraint_descriptor,
            new java.lang.String[] {
              "SupportsIn", "SupportsUnder",
            });
    internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_descriptor =
        internal_static_google_cloud_orgpolicy_v2_Constraint_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_descriptor,
            new java.lang.String[] {
              "ResourceTypes", "MethodTypes", "Condition", "ActionType", "Parameters",
            });
    internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_Parameter_descriptor =
        internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_Parameter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_Parameter_descriptor,
            new java.lang.String[] {
              "Type", "DefaultValue", "ValidValuesExpr", "Metadata", "Item",
            });
    internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_Parameter_Metadata_descriptor =
        internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_Parameter_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_Parameter_Metadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_Parameter_Metadata_descriptor,
            new java.lang.String[] {
              "Description",
            });
    internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_ParametersEntry_descriptor =
        internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_ParametersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v2_Constraint_CustomConstraintDefinition_ParametersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_orgpolicy_v2_Constraint_BooleanConstraint_descriptor =
        internal_static_google_cloud_orgpolicy_v2_Constraint_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_orgpolicy_v2_Constraint_BooleanConstraint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v2_Constraint_BooleanConstraint_descriptor,
            new java.lang.String[] {
              "CustomConstraintDefinition",
            });
    internal_static_google_cloud_orgpolicy_v2_CustomConstraint_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_orgpolicy_v2_CustomConstraint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v2_CustomConstraint_descriptor,
            new java.lang.String[] {
              "Name",
              "ResourceTypes",
              "MethodTypes",
              "Condition",
              "ActionType",
              "DisplayName",
              "Description",
              "UpdateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
