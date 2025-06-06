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
// source: google/cloud/aiplatform/v1beta1/model_monitoring_spec.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public final class ModelMonitoringSpecProto {
  private ModelMonitoringSpecProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_DataDriftSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_DataDriftSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_DataDriftSpec_FeatureAlertConditionsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_DataDriftSpec_FeatureAlertConditionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_FeatureAttributionSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_FeatureAttributionSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_FeatureAttributionSpec_FeatureAlertConditionsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_FeatureAttributionSpec_FeatureAlertConditionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_TabularObjective_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_TabularObjective_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringOutputSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringOutputSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_ModelMonitoringDataset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_ModelMonitoringDataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_ModelMonitoringDataset_ModelMonitoringGcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_ModelMonitoringDataset_ModelMonitoringGcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_ModelMonitoringDataset_ModelMonitoringBigQuerySource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_ModelMonitoringDataset_ModelMonitoringBigQuerySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_BatchPredictionOutput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_BatchPredictionOutput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_VertexEndpointLogs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_VertexEndpointLogs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_TimeOffset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_TimeOffset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringNotificationSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringNotificationSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringNotificationSpec_EmailConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringNotificationSpec_EmailConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringNotificationSpec_NotificationChannelConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringNotificationSpec_NotificationChannelConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n;google/cloud/aiplatform/v1beta1/model_"
          + "monitoring_spec.proto\022\037google.cloud.aipl"
          + "atform.v1beta1\032\031google/api/resource.prot"
          + "o\0321google/cloud/aiplatform/v1beta1/expla"
          + "nation.proto\032(google/cloud/aiplatform/v1"
          + "beta1/io.proto\0327google/cloud/aiplatform/"
          + "v1beta1/machine_resources.proto\032<google/"
          + "cloud/aiplatform/v1beta1/model_monitorin"
          + "g_alert.proto\032\032google/type/interval.prot"
          + "o\"\232\002\n\023ModelMonitoringSpec\022U\n\016objective_s"
          + "pec\030\001 \001(\0132=.google.cloud.aiplatform.v1be"
          + "ta1.ModelMonitoringObjectiveSpec\022[\n\021noti"
          + "fication_spec\030\002 \001(\0132@.google.cloud.aipla"
          + "tform.v1beta1.ModelMonitoringNotificatio"
          + "nSpec\022O\n\013output_spec\030\003 \001(\0132:.google.clou"
          + "d.aiplatform.v1beta1.ModelMonitoringOutp"
          + "utSpec\"\273\016\n\034ModelMonitoringObjectiveSpec\022"
          + "k\n\021tabular_objective\030\001 \001(\0132N.google.clou"
          + "d.aiplatform.v1beta1.ModelMonitoringObje"
          + "ctiveSpec.TabularObjectiveH\000\022J\n\020explanat"
          + "ion_spec\030\003 \001(\01320.google.cloud.aiplatform"
          + ".v1beta1.ExplanationSpec\022O\n\020baseline_dat"
          + "aset\030\004 \001(\01325.google.cloud.aiplatform.v1b"
          + "eta1.ModelMonitoringInput\022M\n\016target_data"
          + "set\030\005 \001(\01325.google.cloud.aiplatform.v1be"
          + "ta1.ModelMonitoringInput\032\300\004\n\rDataDriftSp"
          + "ec\022\020\n\010features\030\001 \003(\t\022\037\n\027categorical_metr"
          + "ic_type\030\002 \001(\t\022\033\n\023numeric_metric_type\030\003 \001"
          + "(\t\022k\n#default_categorical_alert_conditio"
          + "n\030\004 \001(\0132>.google.cloud.aiplatform.v1beta"
          + "1.ModelMonitoringAlertCondition\022g\n\037defau"
          + "lt_numeric_alert_condition\030\005 \001(\0132>.googl"
          + "e.cloud.aiplatform.v1beta1.ModelMonitori"
          + "ngAlertCondition\022\211\001\n\030feature_alert_condi"
          + "tions\030\006 \003(\0132g.google.cloud.aiplatform.v1"
          + "beta1.ModelMonitoringObjectiveSpec.DataD"
          + "riftSpec.FeatureAlertConditionsEntry\032}\n\033"
          + "FeatureAlertConditionsEntry\022\013\n\003key\030\001 \001(\t"
          + "\022M\n\005value\030\002 \001(\0132>.google.cloud.aiplatfor"
          + "m.v1beta1.ModelMonitoringAlertCondition:"
          + "\0028\001\032\210\004\n\026FeatureAttributionSpec\022\020\n\010featur"
          + "es\030\001 \003(\t\022_\n\027default_alert_condition\030\002 \001("
          + "\0132>.google.cloud.aiplatform.v1beta1.Mode"
          + "lMonitoringAlertCondition\022\222\001\n\030feature_al"
          + "ert_conditions\030\003 \003(\0132p.google.cloud.aipl"
          + "atform.v1beta1.ModelMonitoringObjectiveS"
          + "pec.FeatureAttributionSpec.FeatureAlertC"
          + "onditionsEntry\022g\n%batch_explanation_dedi"
          + "cated_resources\030\004 \001(\01328.google.cloud.aip"
          + "latform.v1beta1.BatchDedicatedResources\032"
          + "}\n\033FeatureAlertConditionsEntry\022\013\n\003key\030\001 "
          + "\001(\t\022M\n\005value\030\002 \001(\0132>.google.cloud.aiplat"
          + "form.v1beta1.ModelMonitoringAlertConditi"
          + "on:\0028\001\032\346\002\n\020TabularObjective\022g\n\022feature_d"
          + "rift_spec\030\n \001(\0132K.google.cloud.aiplatfor"
          + "m.v1beta1.ModelMonitoringObjectiveSpec.D"
          + "ataDriftSpec\022q\n\034prediction_output_drift_"
          + "spec\030\013 \001(\0132K.google.cloud.aiplatform.v1b"
          + "eta1.ModelMonitoringObjectiveSpec.DataDr"
          + "iftSpec\022v\n\030feature_attribution_spec\030\014 \001("
          + "\0132T.google.cloud.aiplatform.v1beta1.Mode"
          + "lMonitoringObjectiveSpec.FeatureAttribut"
          + "ionSpecB\013\n\tobjective\"h\n\031ModelMonitoringO"
          + "utputSpec\022K\n\022gcs_base_directory\030\001 \001(\0132/."
          + "google.cloud.aiplatform.v1beta1.GcsDesti"
          + "nation\"\307\013\n\024ModelMonitoringInput\022j\n\022colum"
          + "nized_dataset\030\001 \001(\0132L.google.cloud.aipla"
          + "tform.v1beta1.ModelMonitoringInput.Model"
          + "MonitoringDatasetH\000\022n\n\027batch_prediction_"
          + "output\030\002 \001(\0132K.google.cloud.aiplatform.v"
          + "1beta1.ModelMonitoringInput.BatchPredict"
          + "ionOutputH\000\022h\n\024vertex_endpoint_logs\030\003 \001("
          + "\0132H.google.cloud.aiplatform.v1beta1.Mode"
          + "lMonitoringInput.VertexEndpointLogsH\000\022.\n"
          + "\rtime_interval\030\006 \001(\0132\025.google.type.Inter"
          + "valH\001\022W\n\013time_offset\030\007 \001(\0132@.google.clou"
          + "d.aiplatform.v1beta1.ModelMonitoringInpu"
          + "t.TimeOffsetH\001\032\335\005\n\026ModelMonitoringDatase"
          + "t\022@\n\016vertex_dataset\030\001 \001(\tB&\372A#\n!aiplatfo"
          + "rm.googleapis.com/DatasetH\000\022{\n\ngcs_sourc"
          + "e\030\002 \001(\0132e.google.cloud.aiplatform.v1beta"
          + "1.ModelMonitoringInput.ModelMonitoringDa"
          + "taset.ModelMonitoringGcsSourceH\000\022\205\001\n\017big"
          + "query_source\030\006 \001(\0132j.google.cloud.aiplat"
          + "form.v1beta1.ModelMonitoringInput.ModelM"
          + "onitoringDataset.ModelMonitoringBigQuery"
          + "SourceH\000\022\027\n\017timestamp_field\030\007 \001(\t\032\374\001\n\030Mo"
          + "delMonitoringGcsSource\022\017\n\007gcs_uri\030\001 \001(\t\022"
          + "\200\001\n\006format\030\002 \001(\0162p.google.cloud.aiplatfo"
          + "rm.v1beta1.ModelMonitoringInput.ModelMon"
          + "itoringDataset.ModelMonitoringGcsSource."
          + "DataFormat\"L\n\nDataFormat\022\033\n\027DATA_FORMAT_"
          + "UNSPECIFIED\020\000\022\007\n\003CSV\020\001\022\r\n\tTF_RECORD\020\002\022\t\n"
          + "\005JSONL\020\003\032S\n\035ModelMonitoringBigQuerySourc"
          + "e\022\023\n\ttable_uri\030\001 \001(\tH\000\022\017\n\005query\030\002 \001(\tH\000B"
          + "\014\n\nconnectionB\017\n\rdata_location\032h\n\025BatchP"
          + "redictionOutput\022O\n\024batch_prediction_job\030"
          + "\001 \001(\tB1\372A.\n,aiplatform.googleapis.com/Ba"
          + "tchPredictionJob\032P\n\022VertexEndpointLogs\022:"
          + "\n\tendpoints\030\001 \003(\tB\'\372A$\n\"aiplatform.googl"
          + "eapis.com/Endpoint\032,\n\nTimeOffset\022\016\n\006offs"
          + "et\030\001 \001(\t\022\016\n\006window\030\002 \001(\tB\t\n\007datasetB\013\n\tt"
          + "ime_spec\"\205\003\n\037ModelMonitoringNotification"
          + "Spec\022b\n\014email_config\030\001 \001(\0132L.google.clou"
          + "d.aiplatform.v1beta1.ModelMonitoringNoti"
          + "ficationSpec.EmailConfig\022\034\n\024enable_cloud"
          + "_logging\030\002 \001(\010\022\200\001\n\034notification_channel_"
          + "configs\030\003 \003(\0132Z.google.cloud.aiplatform."
          + "v1beta1.ModelMonitoringNotificationSpec."
          + "NotificationChannelConfig\032\"\n\013EmailConfig"
          + "\022\023\n\013user_emails\030\001 \003(\t\0329\n\031NotificationCha"
          + "nnelConfig\022\034\n\024notification_channel\030\001 \001(\t"
          + "B\357\001\n#com.google.cloud.aiplatform.v1beta1"
          + "B\030ModelMonitoringSpecProtoP\001ZCcloud.goog"
          + "le.com/go/aiplatform/apiv1beta1/aiplatfo"
          + "rmpb;aiplatformpb\252\002\037Google.Cloud.AIPlatf"
          + "orm.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1"
          + "beta1\352\002\"Google::Cloud::AIPlatform::V1bet"
          + "a1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ModelMonitoringAlertProto.getDescriptor(),
              com.google.type.IntervalProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringSpec_descriptor,
            new java.lang.String[] {
              "ObjectiveSpec", "NotificationSpec", "OutputSpec",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_descriptor,
            new java.lang.String[] {
              "TabularObjective",
              "ExplanationSpec",
              "BaselineDataset",
              "TargetDataset",
              "Objective",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_DataDriftSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_DataDriftSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_DataDriftSpec_descriptor,
            new java.lang.String[] {
              "Features",
              "CategoricalMetricType",
              "NumericMetricType",
              "DefaultCategoricalAlertCondition",
              "DefaultNumericAlertCondition",
              "FeatureAlertConditions",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_DataDriftSpec_FeatureAlertConditionsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_DataDriftSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_DataDriftSpec_FeatureAlertConditionsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_DataDriftSpec_FeatureAlertConditionsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_FeatureAttributionSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_FeatureAttributionSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_FeatureAttributionSpec_descriptor,
            new java.lang.String[] {
              "Features",
              "DefaultAlertCondition",
              "FeatureAlertConditions",
              "BatchExplanationDedicatedResources",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_FeatureAttributionSpec_FeatureAlertConditionsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_FeatureAttributionSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_FeatureAttributionSpec_FeatureAlertConditionsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_FeatureAttributionSpec_FeatureAlertConditionsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_TabularObjective_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_TabularObjective_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveSpec_TabularObjective_descriptor,
            new java.lang.String[] {
              "FeatureDriftSpec", "PredictionOutputDriftSpec", "FeatureAttributionSpec",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringOutputSpec_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringOutputSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringOutputSpec_descriptor,
            new java.lang.String[] {
              "GcsBaseDirectory",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_descriptor,
            new java.lang.String[] {
              "ColumnizedDataset",
              "BatchPredictionOutput",
              "VertexEndpointLogs",
              "TimeInterval",
              "TimeOffset",
              "Dataset",
              "TimeSpec",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_ModelMonitoringDataset_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_ModelMonitoringDataset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_ModelMonitoringDataset_descriptor,
            new java.lang.String[] {
              "VertexDataset", "GcsSource", "BigquerySource", "TimestampField", "DataLocation",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_ModelMonitoringDataset_ModelMonitoringGcsSource_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_ModelMonitoringDataset_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_ModelMonitoringDataset_ModelMonitoringGcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_ModelMonitoringDataset_ModelMonitoringGcsSource_descriptor,
            new java.lang.String[] {
              "GcsUri", "Format",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_ModelMonitoringDataset_ModelMonitoringBigQuerySource_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_ModelMonitoringDataset_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_ModelMonitoringDataset_ModelMonitoringBigQuerySource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_ModelMonitoringDataset_ModelMonitoringBigQuerySource_descriptor,
            new java.lang.String[] {
              "TableUri", "Query", "Connection",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_BatchPredictionOutput_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_BatchPredictionOutput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_BatchPredictionOutput_descriptor,
            new java.lang.String[] {
              "BatchPredictionJob",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_VertexEndpointLogs_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_VertexEndpointLogs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_VertexEndpointLogs_descriptor,
            new java.lang.String[] {
              "Endpoints",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_TimeOffset_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_TimeOffset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringInput_TimeOffset_descriptor,
            new java.lang.String[] {
              "Offset", "Window",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringNotificationSpec_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringNotificationSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringNotificationSpec_descriptor,
            new java.lang.String[] {
              "EmailConfig", "EnableCloudLogging", "NotificationChannelConfigs",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringNotificationSpec_EmailConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringNotificationSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringNotificationSpec_EmailConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringNotificationSpec_EmailConfig_descriptor,
            new java.lang.String[] {
              "UserEmails",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringNotificationSpec_NotificationChannelConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringNotificationSpec_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringNotificationSpec_NotificationChannelConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringNotificationSpec_NotificationChannelConfig_descriptor,
            new java.lang.String[] {
              "NotificationChannel",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ModelMonitoringAlertProto.getDescriptor();
    com.google.type.IntervalProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
