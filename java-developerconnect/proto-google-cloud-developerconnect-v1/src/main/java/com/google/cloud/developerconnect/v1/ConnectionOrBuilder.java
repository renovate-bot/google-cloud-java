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
// source: google/cloud/developerconnect/v1/developer_connect.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.developerconnect.v1;

public interface ConnectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.developerconnect.v1.Connection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Configuration for connections to github.com.
   * </pre>
   *
   * <code>.google.cloud.developerconnect.v1.GitHubConfig github_config = 5;</code>
   *
   * @return Whether the githubConfig field is set.
   */
  boolean hasGithubConfig();

  /**
   *
   *
   * <pre>
   * Configuration for connections to github.com.
   * </pre>
   *
   * <code>.google.cloud.developerconnect.v1.GitHubConfig github_config = 5;</code>
   *
   * @return The githubConfig.
   */
  com.google.cloud.developerconnect.v1.GitHubConfig getGithubConfig();

  /**
   *
   *
   * <pre>
   * Configuration for connections to github.com.
   * </pre>
   *
   * <code>.google.cloud.developerconnect.v1.GitHubConfig github_config = 5;</code>
   */
  com.google.cloud.developerconnect.v1.GitHubConfigOrBuilder getGithubConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for connections to an instance of GitHub Enterprise.
   * </pre>
   *
   * <code>.google.cloud.developerconnect.v1.GitHubEnterpriseConfig github_enterprise_config = 13;
   * </code>
   *
   * @return Whether the githubEnterpriseConfig field is set.
   */
  boolean hasGithubEnterpriseConfig();

  /**
   *
   *
   * <pre>
   * Configuration for connections to an instance of GitHub Enterprise.
   * </pre>
   *
   * <code>.google.cloud.developerconnect.v1.GitHubEnterpriseConfig github_enterprise_config = 13;
   * </code>
   *
   * @return The githubEnterpriseConfig.
   */
  com.google.cloud.developerconnect.v1.GitHubEnterpriseConfig getGithubEnterpriseConfig();

  /**
   *
   *
   * <pre>
   * Configuration for connections to an instance of GitHub Enterprise.
   * </pre>
   *
   * <code>.google.cloud.developerconnect.v1.GitHubEnterpriseConfig github_enterprise_config = 13;
   * </code>
   */
  com.google.cloud.developerconnect.v1.GitHubEnterpriseConfigOrBuilder
      getGithubEnterpriseConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for connections to gitlab.com.
   * </pre>
   *
   * <code>.google.cloud.developerconnect.v1.GitLabConfig gitlab_config = 14;</code>
   *
   * @return Whether the gitlabConfig field is set.
   */
  boolean hasGitlabConfig();

  /**
   *
   *
   * <pre>
   * Configuration for connections to gitlab.com.
   * </pre>
   *
   * <code>.google.cloud.developerconnect.v1.GitLabConfig gitlab_config = 14;</code>
   *
   * @return The gitlabConfig.
   */
  com.google.cloud.developerconnect.v1.GitLabConfig getGitlabConfig();

  /**
   *
   *
   * <pre>
   * Configuration for connections to gitlab.com.
   * </pre>
   *
   * <code>.google.cloud.developerconnect.v1.GitLabConfig gitlab_config = 14;</code>
   */
  com.google.cloud.developerconnect.v1.GitLabConfigOrBuilder getGitlabConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for connections to an instance of GitLab Enterprise.
   * </pre>
   *
   * <code>.google.cloud.developerconnect.v1.GitLabEnterpriseConfig gitlab_enterprise_config = 16;
   * </code>
   *
   * @return Whether the gitlabEnterpriseConfig field is set.
   */
  boolean hasGitlabEnterpriseConfig();

  /**
   *
   *
   * <pre>
   * Configuration for connections to an instance of GitLab Enterprise.
   * </pre>
   *
   * <code>.google.cloud.developerconnect.v1.GitLabEnterpriseConfig gitlab_enterprise_config = 16;
   * </code>
   *
   * @return The gitlabEnterpriseConfig.
   */
  com.google.cloud.developerconnect.v1.GitLabEnterpriseConfig getGitlabEnterpriseConfig();

  /**
   *
   *
   * <pre>
   * Configuration for connections to an instance of GitLab Enterprise.
   * </pre>
   *
   * <code>.google.cloud.developerconnect.v1.GitLabEnterpriseConfig gitlab_enterprise_config = 16;
   * </code>
   */
  com.google.cloud.developerconnect.v1.GitLabEnterpriseConfigOrBuilder
      getGitlabEnterpriseConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for connections to an instance of Bitbucket Data Center.
   * </pre>
   *
   * <code>
   * .google.cloud.developerconnect.v1.BitbucketDataCenterConfig bitbucket_data_center_config = 17;
   * </code>
   *
   * @return Whether the bitbucketDataCenterConfig field is set.
   */
  boolean hasBitbucketDataCenterConfig();

  /**
   *
   *
   * <pre>
   * Configuration for connections to an instance of Bitbucket Data Center.
   * </pre>
   *
   * <code>
   * .google.cloud.developerconnect.v1.BitbucketDataCenterConfig bitbucket_data_center_config = 17;
   * </code>
   *
   * @return The bitbucketDataCenterConfig.
   */
  com.google.cloud.developerconnect.v1.BitbucketDataCenterConfig getBitbucketDataCenterConfig();

  /**
   *
   *
   * <pre>
   * Configuration for connections to an instance of Bitbucket Data Center.
   * </pre>
   *
   * <code>
   * .google.cloud.developerconnect.v1.BitbucketDataCenterConfig bitbucket_data_center_config = 17;
   * </code>
   */
  com.google.cloud.developerconnect.v1.BitbucketDataCenterConfigOrBuilder
      getBitbucketDataCenterConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for connections to an instance of Bitbucket Clouds.
   * </pre>
   *
   * <code>.google.cloud.developerconnect.v1.BitbucketCloudConfig bitbucket_cloud_config = 18;
   * </code>
   *
   * @return Whether the bitbucketCloudConfig field is set.
   */
  boolean hasBitbucketCloudConfig();

  /**
   *
   *
   * <pre>
   * Configuration for connections to an instance of Bitbucket Clouds.
   * </pre>
   *
   * <code>.google.cloud.developerconnect.v1.BitbucketCloudConfig bitbucket_cloud_config = 18;
   * </code>
   *
   * @return The bitbucketCloudConfig.
   */
  com.google.cloud.developerconnect.v1.BitbucketCloudConfig getBitbucketCloudConfig();

  /**
   *
   *
   * <pre>
   * Configuration for connections to an instance of Bitbucket Clouds.
   * </pre>
   *
   * <code>.google.cloud.developerconnect.v1.BitbucketCloudConfig bitbucket_cloud_config = 18;
   * </code>
   */
  com.google.cloud.developerconnect.v1.BitbucketCloudConfigOrBuilder
      getBitbucketCloudConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the connection, in the format
   * `projects/{project}/locations/{location}/connections/{connection_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the connection, in the format
   * `projects/{project}/locations/{location}/connections/{connection_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. [Output only] Create timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. [Output only] Create timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. [Output only] Create timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. [Output only] Update timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. [Output only] Update timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. [Output only] Update timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. [Output only] Delete timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();

  /**
   *
   *
   * <pre>
   * Output only. [Output only] Delete timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();

  /**
   *
   *
   * <pre>
   * Output only. [Output only] Delete timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Optional. Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Optional. Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Optional. Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Installation state of the Connection.
   * </pre>
   *
   * <code>
   * .google.cloud.developerconnect.v1.InstallationState installation_state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the installationState field is set.
   */
  boolean hasInstallationState();

  /**
   *
   *
   * <pre>
   * Output only. Installation state of the Connection.
   * </pre>
   *
   * <code>
   * .google.cloud.developerconnect.v1.InstallationState installation_state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The installationState.
   */
  com.google.cloud.developerconnect.v1.InstallationState getInstallationState();

  /**
   *
   *
   * <pre>
   * Output only. Installation state of the Connection.
   * </pre>
   *
   * <code>
   * .google.cloud.developerconnect.v1.InstallationState installation_state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.developerconnect.v1.InstallationStateOrBuilder getInstallationStateOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. If disabled is set to true, functionality is disabled for this
   * connection. Repository based API methods and webhooks processing for
   * repositories in this connection will be disabled.
   * </pre>
   *
   * <code>bool disabled = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   *
   *
   * <pre>
   * Output only. Set to true when the connection is being set up or updated in
   * the background.
   * </pre>
   *
   * <code>bool reconciling = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reconciling.
   */
  boolean getReconciling();

  /**
   *
   *
   * <pre>
   * Optional. Allows clients to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAnnotationsCount();

  /**
   *
   *
   * <pre>
   * Optional. Allows clients to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsAnnotations(java.lang.String key);

  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();

  /**
   *
   *
   * <pre>
   * Optional. Allows clients to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();

  /**
   *
   *
   * <pre>
   * Optional. Allows clients to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. Allows clients to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. This checksum is computed by the server based on the value of
   * other fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * Optional. This checksum is computed by the server based on the value of
   * other fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Output only. A system-assigned unique identifier for the Connection.
   * </pre>
   *
   * <code>
   * string uid = 12 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The uid.
   */
  java.lang.String getUid();

  /**
   *
   *
   * <pre>
   * Output only. A system-assigned unique identifier for the Connection.
   * </pre>
   *
   * <code>
   * string uid = 12 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Optional. The crypto key configuration. This field is used by the
   * Customer-Managed Encryption Keys (CMEK) feature.
   * </pre>
   *
   * <code>
   * .google.cloud.developerconnect.v1.CryptoKeyConfig crypto_key_config = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the cryptoKeyConfig field is set.
   */
  boolean hasCryptoKeyConfig();

  /**
   *
   *
   * <pre>
   * Optional. The crypto key configuration. This field is used by the
   * Customer-Managed Encryption Keys (CMEK) feature.
   * </pre>
   *
   * <code>
   * .google.cloud.developerconnect.v1.CryptoKeyConfig crypto_key_config = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The cryptoKeyConfig.
   */
  com.google.cloud.developerconnect.v1.CryptoKeyConfig getCryptoKeyConfig();

  /**
   *
   *
   * <pre>
   * Optional. The crypto key configuration. This field is used by the
   * Customer-Managed Encryption Keys (CMEK) feature.
   * </pre>
   *
   * <code>
   * .google.cloud.developerconnect.v1.CryptoKeyConfig crypto_key_config = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.developerconnect.v1.CryptoKeyConfigOrBuilder getCryptoKeyConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Configuration for the git proxy feature. Enabling the git proxy
   * allows clients to perform git operations on the repositories linked in the
   * connection.
   * </pre>
   *
   * <code>
   * .google.cloud.developerconnect.v1.GitProxyConfig git_proxy_config = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the gitProxyConfig field is set.
   */
  boolean hasGitProxyConfig();

  /**
   *
   *
   * <pre>
   * Optional. Configuration for the git proxy feature. Enabling the git proxy
   * allows clients to perform git operations on the repositories linked in the
   * connection.
   * </pre>
   *
   * <code>
   * .google.cloud.developerconnect.v1.GitProxyConfig git_proxy_config = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The gitProxyConfig.
   */
  com.google.cloud.developerconnect.v1.GitProxyConfig getGitProxyConfig();

  /**
   *
   *
   * <pre>
   * Optional. Configuration for the git proxy feature. Enabling the git proxy
   * allows clients to perform git operations on the repositories linked in the
   * connection.
   * </pre>
   *
   * <code>
   * .google.cloud.developerconnect.v1.GitProxyConfig git_proxy_config = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.developerconnect.v1.GitProxyConfigOrBuilder getGitProxyConfigOrBuilder();

  com.google.cloud.developerconnect.v1.Connection.ConnectionConfigCase getConnectionConfigCase();
}
