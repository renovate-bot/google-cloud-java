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
// source: google/cloud/aiplatform/v1beta1/explanation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public final class ExplanationProto {
  private ExplanationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Explanation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Explanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Attribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Attribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Neighbor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Neighbor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_BlurBaselineConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BlurBaselineConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Examples_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Examples_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Examples_ExampleGcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Examples_ExampleGcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Presets_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Presets_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpecOverride_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpecOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputMetadataOverride_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputMetadataOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExamplesOverride_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExamplesOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExamplesRestrictionsNamespace_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExamplesRestrictionsNamespace_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "1google/cloud/aiplatform/v1beta1/explanation.proto\022\037google.cloud.aiplatform.v1b"
          + "eta1\032\037google/api/field_behavior.proto\032:g"
          + "oogle/cloud/aiplatform/v1beta1/explanation_metadata.proto\032(google/cloud/aiplatfo"
          + "rm/v1beta1/io.proto\032\034google/protobuf/struct.proto\"\231\001\n"
          + "\013Explanation\022G\n"
          + "\014attributions\030\001"
          + " \003(\0132,.google.cloud.aiplatform.v1beta1.AttributionB\003\340A\003\022A\n"
          + "\tneighbors\030\002 \003(\0132)."
          + "google.cloud.aiplatform.v1beta1.NeighborB\003\340A\003\"`\n"
          + "\020ModelExplanation\022L\n"
          + "\021mean_attributions\030\001"
          + " \003(\0132,.google.cloud.aiplatform.v1beta1.AttributionB\003\340A\003\"\211\002\n"
          + "\013Attribution\022\"\n"
          + "\025baseline_output_value\030\001 \001(\001B\003\340A\003\022\"\n"
          + "\025instance_output_value\030\002 \001(\001B\003\340A\003\0229\n"
          + "\024feature_attributions\030\003"
          + " \001(\0132\026.google.protobuf.ValueB\003\340A\003\022\031\n"
          + "\014output_index\030\004 \003(\005B\003\340A\003\022 \n"
          + "\023output_display_name\030\005 \001(\tB\003\340A\003\022 \n"
          + "\023approximation_error\030\006 \001(\001B\003\340A\003\022\030\n"
          + "\013output_name\030\007 \001(\tB\003\340A\003\"D\n"
          + "\010Neighbor\022\030\n"
          + "\013neighbor_id\030\001 \001(\tB\003\340A\003\022\036\n"
          + "\021neighbor_distance\030\002 \001(\001B\003\340A\003\"\257\001\n"
          + "\017ExplanationSpec\022O\n\n"
          + "parameters\030\001 \001("
          + "\01326.google.cloud.aiplatform.v1beta1.ExplanationParametersB\003\340A\002\022K\n"
          + "\010metadata\030\002 \001(\013"
          + "24.google.cloud.aiplatform.v1beta1.ExplanationMetadataB\003\340A\001\"\301\003\n"
          + "\025ExplanationParameters\022a\n"
          + "\033sampled_shapley_attribution\030\001 \001"
          + "(\0132:.google.cloud.aiplatform.v1beta1.SampledShapleyAttributionH\000\022k\n"
          + " integrated_gradients_attribution\030\002 \001(\0132?.google.clou"
          + "d.aiplatform.v1beta1.IntegratedGradientsAttributionH\000\022L\n"
          + "\020xrai_attribution\030\003 \001(\0132"
          + "0.google.cloud.aiplatform.v1beta1.XraiAttributionH\000\022=\n"
          + "\010examples\030\007 \001(\0132).google.cloud.aiplatform.v1beta1.ExamplesH\000\022\r\n"
          + "\005top_k\030\004 \001(\005\0222\n"
          + "\016output_indices\030\005 \001(\0132\032.google.protobuf.ListValueB\010\n"
          + "\006method\"4\n"
          + "\031SampledShapleyAttribution\022\027\n\n"
          + "path_count\030\001 \001(\005B\003\340A\002\"\333\001\n"
          + "\036IntegratedGradientsAttribution\022\027\n\n"
          + "step_count\030\001 \001(\005B\003\340A\002\022M\n"
          + "\022smooth_grad_config\030\002"
          + " \001(\01321.google.cloud.aiplatform.v1beta1.SmoothGradConfig\022Q\n"
          + "\024blur_baseline_config\030\003"
          + " \001(\01323.google.cloud.aiplatform.v1beta1.BlurBaselineConfig\"\314\001\n"
          + "\017XraiAttribution\022\027\n\n"
          + "step_count\030\001 \001(\005B\003\340A\002\022M\n"
          + "\022smooth_grad_config\030\002"
          + " \001(\01321.google.cloud.aiplatform.v1beta1.SmoothGradConfig\022Q\n"
          + "\024blur_baseline_config\030\003"
          + " \001(\01323.google.cloud.aiplatform.v1beta1.BlurBaselineConfig\"\256\001\n"
          + "\020SmoothGradConfig\022\025\n"
          + "\013noise_sigma\030\001 \001(\002H\000\022Q\n"
          + "\023feature_noise_sigma\030\002 \001(\01322.google.clo"
          + "ud.aiplatform.v1beta1.FeatureNoiseSigmaH\000\022\032\n"
          + "\022noisy_sample_count\030\003 \001(\005B\024\n"
          + "\022GradientNoiseSigma\"\246\001\n"
          + "\021FeatureNoiseSigma\022\\\n"
          + "\013noise_sigma\030\001 \003(\0132G.google.cloud.aiplatform"
          + ".v1beta1.FeatureNoiseSigma.NoiseSigmaForFeature\0323\n"
          + "\024NoiseSigmaForFeature\022\014\n"
          + "\004name\030\001 \001(\t\022\r\n"
          + "\005sigma\030\002 \001(\002\",\n"
          + "\022BlurBaselineConfig\022\026\n"
          + "\016max_blur_sigma\030\001 \001(\002\"\266\004\n"
          + "\010Examples\022X\n"
          + "\022example_gcs_source\030\005 \001(\0132:.google.clo"
          + "ud.aiplatform.v1beta1.Examples.ExampleGcsSourceH\000\022@\n"
          + "\036nearest_neighbor_search_config\030\002"
          + " \001(\0132\026.google.protobuf.ValueH\001\022;\n"
          + "\007presets\030\004 \001(\0132(.google.cloud.aiplatform.v1beta1.PresetsH\001\022>\n\n"
          + "gcs_source\030\001 \001(\0132*.google.cloud.aiplatform.v1beta1.GcsSource\022\026\n"
          + "\016neighbor_count\030\003 \001(\005\032\344\001\n"
          + "\020ExampleGcsSource\022Z\n"
          + "\013data_format\030\001 \001(\0162E.google.clou"
          + "d.aiplatform.v1beta1.Examples.ExampleGcsSource.DataFormat\022>\n\n"
          + "gcs_source\030\002 \001(\0132*.google.cloud.aiplatform.v1beta1.GcsSource\"4\n\n"
          + "DataFormat\022\033\n"
          + "\027DATA_FORMAT_UNSPECIFIED\020\000\022\t\n"
          + "\005JSONL\020\001B\010\n"
          + "\006sourceB\010\n"
          + "\006config\"\204\002\n"
          + "\007Presets\022B\n"
          + "\005query\030\001"
          + " \001(\0162..google.cloud.aiplatform.v1beta1.Presets.QueryH\000\210\001\001\022C\n"
          + "\010modality\030\002"
          + " \001(\01621.google.cloud.aiplatform.v1beta1.Presets.Modality\"\036\n"
          + "\005Query\022\013\n"
          + "\007PRECISE\020\000\022\010\n"
          + "\004FAST\020\001\"F\n"
          + "\010Modality\022\030\n"
          + "\024MODALITY_UNSPECIFIED\020\000\022\t\n"
          + "\005IMAGE\020\001\022\010\n"
          + "\004TEXT\020\002\022\013\n"
          + "\007TABULAR\020\003B\010\n"
          + "\006_query\"\203\002\n"
          + "\027ExplanationSpecOverride\022J\n\n"
          + "parameters\030\001 \001(\01326.google.clou"
          + "d.aiplatform.v1beta1.ExplanationParameters\022N\n"
          + "\010metadata\030\002 \001(\0132<.google.cloud.aipl"
          + "atform.v1beta1.ExplanationMetadataOverride\022L\n"
          + "\021examples_override\030\003 \001(\01321.google.c"
          + "loud.aiplatform.v1beta1.ExamplesOverride\"\312\002\n"
          + "\033ExplanationMetadataOverride\022]\n"
          + "\006inputs\030\001 \003(\0132H.google.cloud.aiplatform.v1bet"
          + "a1.ExplanationMetadataOverride.InputsEntryB\003\340A\002\032H\n"
          + "\025InputMetadataOverride\022/\n"
          + "\017input_baselines\030\001 \003(\0132\026.google.protobuf.Value\032\201\001\n"
          + "\013InputsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022a\n"
          + "\005value\030\002 \001(\0132R.google.cloud.aiplatform.v1beta1."
          + "ExplanationMetadataOverride.InputMetadataOverride:\0028\001\"\320\002\n"
          + "\020ExamplesOverride\022\026\n"
          + "\016neighbor_count\030\001 \001(\005\022\026\n"
          + "\016crowding_count\030\002 \001(\005\022T\n"
          + "\014restrictions\030\003 \003(\0132>.google.cloud."
          + "aiplatform.v1beta1.ExamplesRestrictionsNamespace\022\031\n"
          + "\021return_embeddings\030\004 \001(\010\022Q\n"
          + "\013data_format\030\005 \001(\0162<.google.cloud.aiplatfo"
          + "rm.v1beta1.ExamplesOverride.DataFormat\"H\n\n"
          + "DataFormat\022\033\n"
          + "\027DATA_FORMAT_UNSPECIFIED\020\000\022\r\n"
          + "\tINSTANCES\020\001\022\016\n\n"
          + "EMBEDDINGS\020\002\"T\n"
          + "\035ExamplesRestrictionsNamespace\022\026\n"
          + "\016namespace_name\030\001 \001(\t\022\r\n"
          + "\005allow\030\002 \003(\t\022\014\n"
          + "\004deny\030\003 \003(\tB\347\001\n"
          + "#com.google.cloud.aiplatform.v1beta1B\020ExplanationProtoP\001ZCcloud.google.com/go/"
          + "aiplatform/apiv1beta1/aiplatformpb;aipla"
          + "tformpb\252\002\037Google.Cloud.AIPlatform.V1Beta"
          + "1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Go"
          + "ogle::Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExplanationMetadataProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Explanation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Explanation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Explanation_descriptor,
            new java.lang.String[] {
              "Attributions", "Neighbors",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_descriptor,
            new java.lang.String[] {
              "MeanAttributions",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Attribution_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_Attribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Attribution_descriptor,
            new java.lang.String[] {
              "BaselineOutputValue",
              "InstanceOutputValue",
              "FeatureAttributions",
              "OutputIndex",
              "OutputDisplayName",
              "ApproximationError",
              "OutputName",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Neighbor_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_Neighbor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Neighbor_descriptor,
            new java.lang.String[] {
              "NeighborId", "NeighborDistance",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor,
            new java.lang.String[] {
              "Parameters", "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_descriptor,
            new java.lang.String[] {
              "SampledShapleyAttribution",
              "IntegratedGradientsAttribution",
              "XraiAttribution",
              "Examples",
              "TopK",
              "OutputIndices",
              "Method",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_descriptor,
            new java.lang.String[] {
              "PathCount",
            });
    internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_descriptor,
            new java.lang.String[] {
              "StepCount", "SmoothGradConfig", "BlurBaselineConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_descriptor,
            new java.lang.String[] {
              "StepCount", "SmoothGradConfig", "BlurBaselineConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_descriptor,
            new java.lang.String[] {
              "NoiseSigma", "FeatureNoiseSigma", "NoisySampleCount", "GradientNoiseSigma",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_descriptor,
            new java.lang.String[] {
              "NoiseSigma",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_descriptor,
            new java.lang.String[] {
              "Name", "Sigma",
            });
    internal_static_google_cloud_aiplatform_v1beta1_BlurBaselineConfig_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1beta1_BlurBaselineConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_BlurBaselineConfig_descriptor,
            new java.lang.String[] {
              "MaxBlurSigma",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Examples_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_aiplatform_v1beta1_Examples_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Examples_descriptor,
            new java.lang.String[] {
              "ExampleGcsSource",
              "NearestNeighborSearchConfig",
              "Presets",
              "GcsSource",
              "NeighborCount",
              "Source",
              "Config",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Examples_ExampleGcsSource_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Examples_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Examples_ExampleGcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Examples_ExampleGcsSource_descriptor,
            new java.lang.String[] {
              "DataFormat", "GcsSource",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Presets_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_aiplatform_v1beta1_Presets_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Presets_descriptor,
            new java.lang.String[] {
              "Query", "Modality",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpecOverride_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpecOverride_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpecOverride_descriptor,
            new java.lang.String[] {
              "Parameters", "Metadata", "ExamplesOverride",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_descriptor,
            new java.lang.String[] {
              "Inputs",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputMetadataOverride_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputMetadataOverride_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputMetadataOverride_descriptor,
            new java.lang.String[] {
              "InputBaselines",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExamplesOverride_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_aiplatform_v1beta1_ExamplesOverride_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExamplesOverride_descriptor,
            new java.lang.String[] {
              "NeighborCount", "CrowdingCount", "Restrictions", "ReturnEmbeddings", "DataFormat",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExamplesRestrictionsNamespace_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_aiplatform_v1beta1_ExamplesRestrictionsNamespace_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExamplesRestrictionsNamespace_descriptor,
            new java.lang.String[] {
              "NamespaceName", "Allow", "Deny",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationMetadataProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
