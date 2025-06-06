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
// source: google/monitoring/v3/uptime.proto

// Protobuf Java Version: 3.25.8
package com.google.monitoring.v3;

public final class UptimeProto {
  private UptimeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_InternalChecker_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_InternalChecker_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_SyntheticMonitorTarget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_SyntheticMonitorTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_SyntheticMonitorTarget_CloudFunctionV2Target_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_SyntheticMonitorTarget_CloudFunctionV2Target_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UptimeCheckConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UptimeCheckConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UptimeCheckConfig_ResourceGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UptimeCheckConfig_ResourceGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UptimeCheckConfig_PingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UptimeCheckConfig_PingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_BasicAuthentication_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_BasicAuthentication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_ResponseStatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_ResponseStatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_ServiceAgentAuthentication_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_ServiceAgentAuthentication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_HeadersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_HeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UptimeCheckConfig_TcpCheck_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UptimeCheckConfig_TcpCheck_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UptimeCheckConfig_ContentMatcher_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UptimeCheckConfig_ContentMatcher_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UptimeCheckConfig_ContentMatcher_JsonPathMatcher_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UptimeCheckConfig_ContentMatcher_JsonPathMatcher_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UptimeCheckConfig_UserLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UptimeCheckConfig_UserLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UptimeCheckIp_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UptimeCheckIp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "!google/monitoring/v3/uptime.proto\022\024goo"
          + "gle.monitoring.v3\032\037google/api/field_beha"
          + "vior.proto\032\033google/api/field_info.proto\032"
          + "#google/api/monitored_resource.proto\032\031go"
          + "ogle/api/resource.proto\032\036google/protobuf/duration.proto\"\346\001\n"
          + "\017InternalChecker\022\014\n"
          + "\004name\030\001 \001(\t\022\024\n"
          + "\014display_name\030\002 \001(\t\022\017\n"
          + "\007network\030\003 \001(\t\022\020\n"
          + "\010gcp_zone\030\004 \001(\t\022\027\n"
          + "\017peer_project_id\030\006 \001(\t\022:\n"
          + "\005state\030\007 \001(\0162+.google.monitoring.v3.InternalChecker.State\"3\n"
          + "\005State\022\017\n"
          + "\013UNSPECIFIED\020\000\022\014\n"
          + "\010CREATING\020\001\022\013\n"
          + "\007RUNNING\020\002:\002\030\001\"\233\002\n"
          + "\026SyntheticMonitorTarget\022_\n"
          + "\021cloud_function_v2\030\001 \001(\0132B.google.monitori"
          + "ng.v3.SyntheticMonitorTarget.CloudFunctionV2TargetH\000\032\225\001\n"
          + "\025CloudFunctionV2Target\022<\n"
          + "\004name\030\001 \001(\tB.\340A\002\372A(\n"
          + "&cloudfunctions.googleapis.com/Function\022>\n"
          + "\022cloud_run_revision\030\002"
          + " \001(\0132\035.google.api.MonitoredResourceB\003\340A\003B\010\n"
          + "\006target\"\326\036\n"
          + "\021UptimeCheckConfig\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\010\022\024\n"
          + "\014display_name\030\002 \001(\t\022;\n"
          + "\022monitored_resource\030\003 \001(\0132\035.google.api.MonitoredResourceH\000\022O\n"
          + "\016resource_group\030\004 \001"
          + "(\01325.google.monitoring.v3.UptimeCheckConfig.ResourceGroupH\000\022I\n"
          + "\021synthetic_monitor\030\025"
          + " \001(\0132,.google.monitoring.v3.SyntheticMonitorTargetH\000\022G\n\n"
          + "http_check\030\005 \001(\01321.goo"
          + "gle.monitoring.v3.UptimeCheckConfig.HttpCheckH\001\022E\n"
          + "\ttcp_check\030\006 \001(\01320.google.moni"
          + "toring.v3.UptimeCheckConfig.TcpCheckH\001\022)\n"
          + "\006period\030\007 \001(\0132\031.google.protobuf.Duration\022*\n"
          + "\007timeout\030\010 \001(\0132\031.google.protobuf.Duration\022P\n"
          + "\020content_matchers\030\t \003(\01326.google"
          + ".monitoring.v3.UptimeCheckConfig.ContentMatcher\022I\n"
          + "\014checker_type\030\021 \001(\01623.google.m"
          + "onitoring.v3.UptimeCheckConfig.CheckerType\022A\n"
          + "\020selected_regions\030\n"
          + " \003(\0162\'.google.monitoring.v3.UptimeCheckRegion\022\027\n"
          + "\013is_internal\030\017 \001(\010B\002\030\001\022D\n"
          + "\021internal_checkers\030\016 \003("
          + "\0132%.google.monitoring.v3.InternalCheckerB\002\030\001\022L\n"
          + "\013user_labels\030\024 \003(\01327.google.monit"
          + "oring.v3.UptimeCheckConfig.UserLabelsEntry\032a\n\r"
          + "ResourceGroup\022\020\n"
          + "\010group_id\030\001 \001(\t\022>\n"
          + "\r"
          + "resource_type\030\002 \001(\0162\'.google.monitoring.v3.GroupResourceType\032!\n\n"
          + "PingConfig\022\023\n"
          + "\013pings_count\030\001 \001(\005\032\362\014\n"
          + "\tHttpCheck\022W\n"
          + "\016request_method\030\010 \001(\0162?.google.monitoring.v3.Up"
          + "timeCheckConfig.HttpCheck.RequestMethod\022\017\n"
          + "\007use_ssl\030\001 \001(\010\022\014\n"
          + "\004path\030\002 \001(\t\022\014\n"
          + "\004port\030\003 \001(\005\022X\n"
          + "\tauth_info\030\004 \001(\0132E.google.monitor"
          + "ing.v3.UptimeCheckConfig.HttpCheck.BasicAuthentication\022\024\n"
          + "\014mask_headers\030\005 \001(\010\022O\n"
          + "\007headers\030\006"
          + " \003(\0132>.google.monitoring.v3.UptimeCheckConfig.HttpCheck.HeadersEntry\022S\n"
          + "\014content_type\030\t \001(\0162=.google.monitoring."
          + "v3.UptimeCheckConfig.HttpCheck.ContentType\022\033\n"
          + "\023custom_content_type\030\r"
          + " \001(\t\022\024\n"
          + "\014validate_ssl\030\007 \001(\010\022\014\n"
          + "\004body\030\n"
          + " \001(\014\022l\n"
          + "\036accepted_response_status_codes\030\013 \003(\0132D.google.mon"
          + "itoring.v3.UptimeCheckConfig.HttpCheck.ResponseStatusCode\022G\n"
          + "\013ping_config\030\014 \001(\01322"
          + ".google.monitoring.v3.UptimeCheckConfig.PingConfig\022t\n"
          + "\034service_agent_authentication\030\016 \001(\0132L.google.monitoring.v3.UptimeCh"
          + "eckConfig.HttpCheck.ServiceAgentAuthenticationH\000\0329\n"
          + "\023BasicAuthentication\022\020\n"
          + "\010username\030\001 \001(\t\022\020\n"
          + "\010password\030\002 \001(\t\032\334\002\n"
          + "\022ResponseStatusCode\022\026\n"
          + "\014status_value\030\001 \001(\005H\000\022h\n"
          + "\014status_class\030\002 \001(\0162P.google.monitoring.v3."
          + "UptimeCheckConfig.HttpCheck.ResponseStatusCode.StatusClassH\000\"\264\001\n"
          + "\013StatusClass\022\034\n"
          + "\030STATUS_CLASS_UNSPECIFIED\020\000\022\024\n"
          + "\020STATUS_CLASS_1XX\020d\022\025\n"
          + "\020STATUS_CLASS_2XX\020\310\001\022\025\n"
          + "\020STATUS_CLASS_3XX\020\254\002\022\025\n"
          + "\020STATUS_CLASS_4XX\020\220\003\022\025\n"
          + "\020STATUS_CLASS_5XX\020\364\003\022\025\n"
          + "\020STATUS_CLASS_ANY\020\350\007B\r\n"
          + "\013status_code\032\374\001\n"
          + "\032ServiceAgentAuthentication\022y\n"
          + "\004type\030\001 \001(\0162k.google.monitoring.v3.UptimeCheckConfig.HttpCheck.Servi"
          + "ceAgentAuthentication.ServiceAgentAuthenticationType\"c\n"
          + "\036ServiceAgentAuthenticationType\0221\n"
          + "-SERVICE_AGENT_AUTHENTICATION_TYPE_UNSPECIFIED\020\000\022\016\n\n"
          + "OIDC_TOKEN\020\001\032.\n"
          + "\014HeadersEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\":\n\r"
          + "RequestMethod\022\026\n"
          + "\022METHOD_UNSPECIFIED\020\000\022\007\n"
          + "\003GET\020\001\022\010\n"
          + "\004POST\020\002\"G\n"
          + "\013ContentType\022\024\n"
          + "\020TYPE_UNSPECIFIED\020\000\022\017\n"
          + "\013URL_ENCODED\020\001\022\021\n\r"
          + "USER_PROVIDED\020\002B\r\n"
          + "\013auth_method\032a\n"
          + "\010TcpCheck\022\014\n"
          + "\004port\030\001 \001(\005\022G\n"
          + "\013ping_config\030\002 \001(\01322.g"
          + "oogle.monitoring.v3.UptimeCheckConfig.PingConfig\032\312\005\n"
          + "\016ContentMatcher\022\017\n"
          + "\007content\030\001 \001(\t\022\\\n"
          + "\007matcher\030\002 \001(\0162K.google.monitorin"
          + "g.v3.UptimeCheckConfig.ContentMatcher.ContentMatcherOption\022c\n"
          + "\021json_path_matcher\030\003 \001(\0132F.google.monitoring.v3.UptimeCheck"
          + "Config.ContentMatcher.JsonPathMatcherH\000\032\375\001\n"
          + "\017JsonPathMatcher\022\021\n"
          + "\tjson_path\030\001 \001(\t\022r\n"
          + "\014json_matcher\030\002 \001(\0162\\.google.monitoring"
          + ".v3.UptimeCheckConfig.ContentMatcher.JsonPathMatcher.JsonPathMatcherOption\"c\n"
          + "\025JsonPathMatcherOption\022(\n"
          + "$JSON_PATH_MATCHER_OPTION_UNSPECIFIED\020\000\022\017\n"
          + "\013EXACT_MATCH\020\001\022\017\n"
          + "\013REGEX_MATCH\020\002\"\310\001\n"
          + "\024ContentMatcherOption\022&\n"
          + "\"CONTENT_MATCHER_OPTION_UNSPECIFIED\020\000\022\023\n"
          + "\017CONTAINS_STRING\020\001\022\027\n"
          + "\023NOT_CONTAINS_STRING\020\002\022\021\n\r"
          + "MATCHES_REGEX\020\003\022\025\n"
          + "\021NOT_MATCHES_REGEX\020\004\022\025\n"
          + "\021MATCHES_JSON_PATH\020\005\022\031\n"
          + "\025NOT_MATCHES_JSON_PATH\020\006B\031\n"
          + "\027additional_matcher_info\0321\n"
          + "\017UserLabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"U\n"
          + "\013CheckerType\022\034\n"
          + "\030CHECKER_TYPE_UNSPECIFIED\020\000\022\026\n"
          + "\022STATIC_IP_CHECKERS\020\001\022\020\n"
          + "\014VPC_CHECKERS\020\003:\363\001\352A\357\001\n"
          + "+monitoring.googleapis.com/UptimeCheckConfig\022;pro"
          + "jects/{project}/uptimeCheckConfigs/{uptime_check_config}\022Eorganizations/{organiz"
          + "ation}/uptimeCheckConfigs/{uptime_check_"
          + "config}\0229folders/{folder}/uptimeCheckConfigs/{uptime_check_config}\022\001*B\n\n"
          + "\010resourceB\024\n"
          + "\022check_request_type\"n\n\r"
          + "UptimeCheckIp\0227\n"
          + "\006region\030\001 \001(\0162\'.google.monitoring.v3.UptimeCheckRegion\022\020\n"
          + "\010location\030\002 \001(\t\022\022\n\n"
          + "ip_address\030\003 \001(\t*\225\001\n"
          + "\021UptimeCheckRegion\022\026\n"
          + "\022REGION_UNSPECIFIED\020\000\022\007\n"
          + "\003USA\020\001\022\n\n"
          + "\006EUROPE\020\002\022\021\n\r"
          + "SOUTH_AMERICA\020\003\022\020\n"
          + "\014ASIA_PACIFIC\020\004\022\016\n\n"
          + "USA_OREGON\020\005\022\014\n"
          + "\010USA_IOWA\020\006\022\020\n"
          + "\014USA_VIRGINIA\020\007*[\n"
          + "\021GroupResourceType\022\035\n"
          + "\031RESOURCE_TYPE_UNSPECIFIED\020\000\022\014\n"
          + "\010INSTANCE\020\001\022\031\n"
          + "\025AWS_ELB_LOAD_BALANCER\020\002B\257\002\n"
          + "\030com.google.monitoring.v3B\013UptimeProtoP\001ZAcloud.google.c"
          + "om/go/monitoring/apiv3/v2/monitoringpb;m"
          + "onitoringpb\252\002\032Google.Cloud.Monitoring.V3"
          + "\312\002\032Google\\Cloud\\Monitoring\\V3\352\002\035Google::Cloud::Monitoring::V3\352Af\n"
          + "&cloudfunctions.googleapis.com/Function\022<projects/{proj"
          + "ect}/locations/{location}/functions/{function}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.FieldInfoProto.getDescriptor(),
              com.google.api.MonitoredResourceProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_InternalChecker_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_InternalChecker_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_InternalChecker_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Network", "GcpZone", "PeerProjectId", "State",
            });
    internal_static_google_monitoring_v3_SyntheticMonitorTarget_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_SyntheticMonitorTarget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_SyntheticMonitorTarget_descriptor,
            new java.lang.String[] {
              "CloudFunctionV2", "Target",
            });
    internal_static_google_monitoring_v3_SyntheticMonitorTarget_CloudFunctionV2Target_descriptor =
        internal_static_google_monitoring_v3_SyntheticMonitorTarget_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_v3_SyntheticMonitorTarget_CloudFunctionV2Target_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_SyntheticMonitorTarget_CloudFunctionV2Target_descriptor,
            new java.lang.String[] {
              "Name", "CloudRunRevision",
            });
    internal_static_google_monitoring_v3_UptimeCheckConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_UptimeCheckConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UptimeCheckConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "MonitoredResource",
              "ResourceGroup",
              "SyntheticMonitor",
              "HttpCheck",
              "TcpCheck",
              "Period",
              "Timeout",
              "ContentMatchers",
              "CheckerType",
              "SelectedRegions",
              "IsInternal",
              "InternalCheckers",
              "UserLabels",
              "Resource",
              "CheckRequestType",
            });
    internal_static_google_monitoring_v3_UptimeCheckConfig_ResourceGroup_descriptor =
        internal_static_google_monitoring_v3_UptimeCheckConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_UptimeCheckConfig_ResourceGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UptimeCheckConfig_ResourceGroup_descriptor,
            new java.lang.String[] {
              "GroupId", "ResourceType",
            });
    internal_static_google_monitoring_v3_UptimeCheckConfig_PingConfig_descriptor =
        internal_static_google_monitoring_v3_UptimeCheckConfig_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_v3_UptimeCheckConfig_PingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UptimeCheckConfig_PingConfig_descriptor,
            new java.lang.String[] {
              "PingsCount",
            });
    internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_descriptor =
        internal_static_google_monitoring_v3_UptimeCheckConfig_descriptor.getNestedTypes().get(2);
    internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_descriptor,
            new java.lang.String[] {
              "RequestMethod",
              "UseSsl",
              "Path",
              "Port",
              "AuthInfo",
              "MaskHeaders",
              "Headers",
              "ContentType",
              "CustomContentType",
              "ValidateSsl",
              "Body",
              "AcceptedResponseStatusCodes",
              "PingConfig",
              "ServiceAgentAuthentication",
              "AuthMethod",
            });
    internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_BasicAuthentication_descriptor =
        internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_BasicAuthentication_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_BasicAuthentication_descriptor,
            new java.lang.String[] {
              "Username", "Password",
            });
    internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_ResponseStatusCode_descriptor =
        internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_ResponseStatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_ResponseStatusCode_descriptor,
            new java.lang.String[] {
              "StatusValue", "StatusClass", "StatusCode",
            });
    internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_ServiceAgentAuthentication_descriptor =
        internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_ServiceAgentAuthentication_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_ServiceAgentAuthentication_descriptor,
            new java.lang.String[] {
              "Type",
            });
    internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_HeadersEntry_descriptor =
        internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_HeadersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UptimeCheckConfig_HttpCheck_HeadersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_monitoring_v3_UptimeCheckConfig_TcpCheck_descriptor =
        internal_static_google_monitoring_v3_UptimeCheckConfig_descriptor.getNestedTypes().get(3);
    internal_static_google_monitoring_v3_UptimeCheckConfig_TcpCheck_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UptimeCheckConfig_TcpCheck_descriptor,
            new java.lang.String[] {
              "Port", "PingConfig",
            });
    internal_static_google_monitoring_v3_UptimeCheckConfig_ContentMatcher_descriptor =
        internal_static_google_monitoring_v3_UptimeCheckConfig_descriptor.getNestedTypes().get(4);
    internal_static_google_monitoring_v3_UptimeCheckConfig_ContentMatcher_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UptimeCheckConfig_ContentMatcher_descriptor,
            new java.lang.String[] {
              "Content", "Matcher", "JsonPathMatcher", "AdditionalMatcherInfo",
            });
    internal_static_google_monitoring_v3_UptimeCheckConfig_ContentMatcher_JsonPathMatcher_descriptor =
        internal_static_google_monitoring_v3_UptimeCheckConfig_ContentMatcher_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_v3_UptimeCheckConfig_ContentMatcher_JsonPathMatcher_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UptimeCheckConfig_ContentMatcher_JsonPathMatcher_descriptor,
            new java.lang.String[] {
              "JsonPath", "JsonMatcher",
            });
    internal_static_google_monitoring_v3_UptimeCheckConfig_UserLabelsEntry_descriptor =
        internal_static_google_monitoring_v3_UptimeCheckConfig_descriptor.getNestedTypes().get(5);
    internal_static_google_monitoring_v3_UptimeCheckConfig_UserLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UptimeCheckConfig_UserLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_monitoring_v3_UptimeCheckIp_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_v3_UptimeCheckIp_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UptimeCheckIp_descriptor,
            new java.lang.String[] {
              "Region", "Location", "IpAddress",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.FieldInfoProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
