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
// source: google/cloud/notebooks/v2/instance.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.notebooks.v2;

public interface InstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v2.Instance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of this notebook instance. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. The name of this notebook instance. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Compute Engine setup for the notebook. Uses notebook-defined
   * fields.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v2.GceSetup gce_setup = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the gceSetup field is set.
   */
  boolean hasGceSetup();

  /**
   *
   *
   * <pre>
   * Optional. Compute Engine setup for the notebook. Uses notebook-defined
   * fields.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v2.GceSetup gce_setup = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The gceSetup.
   */
  com.google.cloud.notebooks.v2.GceSetup getGceSetup();

  /**
   *
   *
   * <pre>
   * Optional. Compute Engine setup for the notebook. Uses notebook-defined
   * fields.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v2.GceSetup gce_setup = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.notebooks.v2.GceSetupOrBuilder getGceSetupOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The proxy endpoint that is used to access the Jupyter
   * notebook.
   * </pre>
   *
   * <code>string proxy_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The proxyUri.
   */
  java.lang.String getProxyUri();

  /**
   *
   *
   * <pre>
   * Output only. The proxy endpoint that is used to access the Jupyter
   * notebook.
   * </pre>
   *
   * <code>string proxy_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for proxyUri.
   */
  com.google.protobuf.ByteString getProxyUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. Input only. The owner of this instance after creation. Format:
   * `alias&#64;example.com`
   *
   * Currently supports one owner only. If not specified, all of the service
   * account users of your VM instance's service account can use
   * the instance.
   * </pre>
   *
   * <code>
   * repeated string instance_owners = 4 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the instanceOwners.
   */
  java.util.List<java.lang.String> getInstanceOwnersList();

  /**
   *
   *
   * <pre>
   * Optional. Input only. The owner of this instance after creation. Format:
   * `alias&#64;example.com`
   *
   * Currently supports one owner only. If not specified, all of the service
   * account users of your VM instance's service account can use
   * the instance.
   * </pre>
   *
   * <code>
   * repeated string instance_owners = 4 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of instanceOwners.
   */
  int getInstanceOwnersCount();

  /**
   *
   *
   * <pre>
   * Optional. Input only. The owner of this instance after creation. Format:
   * `alias&#64;example.com`
   *
   * Currently supports one owner only. If not specified, all of the service
   * account users of your VM instance's service account can use
   * the instance.
   * </pre>
   *
   * <code>
   * repeated string instance_owners = 4 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The instanceOwners at the given index.
   */
  java.lang.String getInstanceOwners(int index);

  /**
   *
   *
   * <pre>
   * Optional. Input only. The owner of this instance after creation. Format:
   * `alias&#64;example.com`
   *
   * Currently supports one owner only. If not specified, all of the service
   * account users of your VM instance's service account can use
   * the instance.
   * </pre>
   *
   * <code>
   * repeated string instance_owners = 4 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the instanceOwners at the given index.
   */
  com.google.protobuf.ByteString getInstanceOwnersBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. Email address of entity that sent original CreateInstance
   * request.
   * </pre>
   *
   * <code>string creator = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The creator.
   */
  java.lang.String getCreator();

  /**
   *
   *
   * <pre>
   * Output only. Email address of entity that sent original CreateInstance
   * request.
   * </pre>
   *
   * <code>string creator = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString getCreatorBytes();

  /**
   *
   *
   * <pre>
   * Output only. The state of this instance.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v2.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The state of this instance.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v2.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.notebooks.v2.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The upgrade history of this instance.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.notebooks.v2.UpgradeHistoryEntry upgrade_history = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.notebooks.v2.UpgradeHistoryEntry> getUpgradeHistoryList();

  /**
   *
   *
   * <pre>
   * Output only. The upgrade history of this instance.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.notebooks.v2.UpgradeHistoryEntry upgrade_history = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.notebooks.v2.UpgradeHistoryEntry getUpgradeHistory(int index);

  /**
   *
   *
   * <pre>
   * Output only. The upgrade history of this instance.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.notebooks.v2.UpgradeHistoryEntry upgrade_history = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getUpgradeHistoryCount();

  /**
   *
   *
   * <pre>
   * Output only. The upgrade history of this instance.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.notebooks.v2.UpgradeHistoryEntry upgrade_history = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.notebooks.v2.UpgradeHistoryEntryOrBuilder>
      getUpgradeHistoryOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. The upgrade history of this instance.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.notebooks.v2.UpgradeHistoryEntry upgrade_history = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.notebooks.v2.UpgradeHistoryEntryOrBuilder getUpgradeHistoryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Unique ID of the resource.
   * </pre>
   *
   * <code>string id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The id.
   */
  java.lang.String getId();

  /**
   *
   *
   * <pre>
   * Output only. Unique ID of the resource.
   * </pre>
   *
   * <code>string id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Instance health_state.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v2.HealthState health_state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for healthState.
   */
  int getHealthStateValue();

  /**
   *
   *
   * <pre>
   * Output only. Instance health_state.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v2.HealthState health_state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The healthState.
   */
  com.google.cloud.notebooks.v2.HealthState getHealthState();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about instance health.
   * Example:
   *
   *     healthInfo": {
   *       "docker_proxy_agent_status": "1",
   *       "docker_status": "1",
   *       "jupyterlab_api_status": "-1",
   *       "jupyterlab_status": "-1",
   *       "updated": "2020-10-18 09:40:03.573409"
   *     }
   * </pre>
   *
   * <code>map&lt;string, string&gt; health_info = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getHealthInfoCount();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about instance health.
   * Example:
   *
   *     healthInfo": {
   *       "docker_proxy_agent_status": "1",
   *       "docker_status": "1",
   *       "jupyterlab_api_status": "-1",
   *       "jupyterlab_status": "-1",
   *       "updated": "2020-10-18 09:40:03.573409"
   *     }
   * </pre>
   *
   * <code>map&lt;string, string&gt; health_info = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsHealthInfo(java.lang.String key);

  /** Use {@link #getHealthInfoMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getHealthInfo();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about instance health.
   * Example:
   *
   *     healthInfo": {
   *       "docker_proxy_agent_status": "1",
   *       "docker_status": "1",
   *       "jupyterlab_api_status": "-1",
   *       "jupyterlab_status": "-1",
   *       "updated": "2020-10-18 09:40:03.573409"
   *     }
   * </pre>
   *
   * <code>map&lt;string, string&gt; health_info = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getHealthInfoMap();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about instance health.
   * Example:
   *
   *     healthInfo": {
   *       "docker_proxy_agent_status": "1",
   *       "docker_status": "1",
   *       "jupyterlab_api_status": "-1",
   *       "jupyterlab_status": "-1",
   *       "updated": "2020-10-18 09:40:03.573409"
   *     }
   * </pre>
   *
   * <code>map&lt;string, string&gt; health_info = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  /* nullable */
  java.lang.String getHealthInfoOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Output only. Additional information about instance health.
   * Example:
   *
   *     healthInfo": {
   *       "docker_proxy_agent_status": "1",
   *       "docker_status": "1",
   *       "jupyterlab_api_status": "-1",
   *       "jupyterlab_status": "-1",
   *       "updated": "2020-10-18 09:40:03.573409"
   *     }
   * </pre>
   *
   * <code>map&lt;string, string&gt; health_info = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.lang.String getHealthInfoOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Instance creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Instance creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Instance creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Instance update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Instance update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Instance update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. If true, the notebook instance will not register with the proxy.
   * </pre>
   *
   * <code>bool disable_proxy_access = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The disableProxyAccess.
   */
  boolean getDisableProxyAccess();

  /**
   *
   *
   * <pre>
   * Optional. Labels to apply to this instance.
   * These can be later modified by the UpdateInstance method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Optional. Labels to apply to this instance.
   * These can be later modified by the UpdateInstance method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Optional. Labels to apply to this instance.
   * These can be later modified by the UpdateInstance method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Optional. Labels to apply to this instance.
   * These can be later modified by the UpdateInstance method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. Labels to apply to this instance.
   * These can be later modified by the UpdateInstance method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  com.google.cloud.notebooks.v2.Instance.InfrastructureCase getInfrastructureCase();
}
