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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.8
package com.google.privacy.dlp.v2;

public interface TableDataProfileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.TableDataProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the profile.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * The name of the profile.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The resource type that was profiled.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataSourceType data_source_type = 36;</code>
   *
   * @return Whether the dataSourceType field is set.
   */
  boolean hasDataSourceType();

  /**
   *
   *
   * <pre>
   * The resource type that was profiled.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataSourceType data_source_type = 36;</code>
   *
   * @return The dataSourceType.
   */
  com.google.privacy.dlp.v2.DataSourceType getDataSourceType();

  /**
   *
   *
   * <pre>
   * The resource type that was profiled.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataSourceType data_source_type = 36;</code>
   */
  com.google.privacy.dlp.v2.DataSourceTypeOrBuilder getDataSourceTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * The resource name of the project data profile for this table.
   * </pre>
   *
   * <code>string project_data_profile = 2;</code>
   *
   * @return The projectDataProfile.
   */
  java.lang.String getProjectDataProfile();

  /**
   *
   *
   * <pre>
   * The resource name of the project data profile for this table.
   * </pre>
   *
   * <code>string project_data_profile = 2;</code>
   *
   * @return The bytes for projectDataProfile.
   */
  com.google.protobuf.ByteString getProjectDataProfileBytes();

  /**
   *
   *
   * <pre>
   * The Google Cloud project ID that owns the resource.
   * </pre>
   *
   * <code>string dataset_project_id = 24;</code>
   *
   * @return The datasetProjectId.
   */
  java.lang.String getDatasetProjectId();

  /**
   *
   *
   * <pre>
   * The Google Cloud project ID that owns the resource.
   * </pre>
   *
   * <code>string dataset_project_id = 24;</code>
   *
   * @return The bytes for datasetProjectId.
   */
  com.google.protobuf.ByteString getDatasetProjectIdBytes();

  /**
   *
   *
   * <pre>
   * If supported, the location where the dataset's data is stored.
   * See https://cloud.google.com/bigquery/docs/locations for supported
   * locations.
   * </pre>
   *
   * <code>string dataset_location = 29;</code>
   *
   * @return The datasetLocation.
   */
  java.lang.String getDatasetLocation();

  /**
   *
   *
   * <pre>
   * If supported, the location where the dataset's data is stored.
   * See https://cloud.google.com/bigquery/docs/locations for supported
   * locations.
   * </pre>
   *
   * <code>string dataset_location = 29;</code>
   *
   * @return The bytes for datasetLocation.
   */
  com.google.protobuf.ByteString getDatasetLocationBytes();

  /**
   *
   *
   * <pre>
   * If the resource is BigQuery, the dataset ID.
   * </pre>
   *
   * <code>string dataset_id = 25;</code>
   *
   * @return The datasetId.
   */
  java.lang.String getDatasetId();

  /**
   *
   *
   * <pre>
   * If the resource is BigQuery, the dataset ID.
   * </pre>
   *
   * <code>string dataset_id = 25;</code>
   *
   * @return The bytes for datasetId.
   */
  com.google.protobuf.ByteString getDatasetIdBytes();

  /**
   *
   *
   * <pre>
   * The table ID.
   * </pre>
   *
   * <code>string table_id = 26;</code>
   *
   * @return The tableId.
   */
  java.lang.String getTableId();

  /**
   *
   *
   * <pre>
   * The table ID.
   * </pre>
   *
   * <code>string table_id = 26;</code>
   *
   * @return The bytes for tableId.
   */
  com.google.protobuf.ByteString getTableIdBytes();

  /**
   *
   *
   * <pre>
   * The Cloud Asset Inventory resource that was profiled in order to generate
   * this TableDataProfile.
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * </pre>
   *
   * <code>string full_resource = 3;</code>
   *
   * @return The fullResource.
   */
  java.lang.String getFullResource();

  /**
   *
   *
   * <pre>
   * The Cloud Asset Inventory resource that was profiled in order to generate
   * this TableDataProfile.
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * </pre>
   *
   * <code>string full_resource = 3;</code>
   *
   * @return The bytes for fullResource.
   */
  com.google.protobuf.ByteString getFullResourceBytes();

  /**
   *
   *
   * <pre>
   * Success or error status from the most recent profile generation attempt.
   * May be empty if the profile is still being generated.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ProfileStatus profile_status = 21;</code>
   *
   * @return Whether the profileStatus field is set.
   */
  boolean hasProfileStatus();

  /**
   *
   *
   * <pre>
   * Success or error status from the most recent profile generation attempt.
   * May be empty if the profile is still being generated.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ProfileStatus profile_status = 21;</code>
   *
   * @return The profileStatus.
   */
  com.google.privacy.dlp.v2.ProfileStatus getProfileStatus();

  /**
   *
   *
   * <pre>
   * Success or error status from the most recent profile generation attempt.
   * May be empty if the profile is still being generated.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ProfileStatus profile_status = 21;</code>
   */
  com.google.privacy.dlp.v2.ProfileStatusOrBuilder getProfileStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * State of a profile.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TableDataProfile.State state = 22;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * State of a profile.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TableDataProfile.State state = 22;</code>
   *
   * @return The state.
   */
  com.google.privacy.dlp.v2.TableDataProfile.State getState();

  /**
   *
   *
   * <pre>
   * The sensitivity score of this table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.SensitivityScore sensitivity_score = 5;</code>
   *
   * @return Whether the sensitivityScore field is set.
   */
  boolean hasSensitivityScore();

  /**
   *
   *
   * <pre>
   * The sensitivity score of this table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.SensitivityScore sensitivity_score = 5;</code>
   *
   * @return The sensitivityScore.
   */
  com.google.privacy.dlp.v2.SensitivityScore getSensitivityScore();

  /**
   *
   *
   * <pre>
   * The sensitivity score of this table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.SensitivityScore sensitivity_score = 5;</code>
   */
  com.google.privacy.dlp.v2.SensitivityScoreOrBuilder getSensitivityScoreOrBuilder();

  /**
   *
   *
   * <pre>
   * The data risk level of this table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataRiskLevel data_risk_level = 6;</code>
   *
   * @return Whether the dataRiskLevel field is set.
   */
  boolean hasDataRiskLevel();

  /**
   *
   *
   * <pre>
   * The data risk level of this table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataRiskLevel data_risk_level = 6;</code>
   *
   * @return The dataRiskLevel.
   */
  com.google.privacy.dlp.v2.DataRiskLevel getDataRiskLevel();

  /**
   *
   *
   * <pre>
   * The data risk level of this table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataRiskLevel data_risk_level = 6;</code>
   */
  com.google.privacy.dlp.v2.DataRiskLevelOrBuilder getDataRiskLevelOrBuilder();

  /**
   *
   *
   * <pre>
   * The infoTypes predicted from this table's data.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoTypeSummary predicted_info_types = 27;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.InfoTypeSummary> getPredictedInfoTypesList();

  /**
   *
   *
   * <pre>
   * The infoTypes predicted from this table's data.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoTypeSummary predicted_info_types = 27;</code>
   */
  com.google.privacy.dlp.v2.InfoTypeSummary getPredictedInfoTypes(int index);

  /**
   *
   *
   * <pre>
   * The infoTypes predicted from this table's data.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoTypeSummary predicted_info_types = 27;</code>
   */
  int getPredictedInfoTypesCount();

  /**
   *
   *
   * <pre>
   * The infoTypes predicted from this table's data.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoTypeSummary predicted_info_types = 27;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.InfoTypeSummaryOrBuilder>
      getPredictedInfoTypesOrBuilderList();

  /**
   *
   *
   * <pre>
   * The infoTypes predicted from this table's data.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoTypeSummary predicted_info_types = 27;</code>
   */
  com.google.privacy.dlp.v2.InfoTypeSummaryOrBuilder getPredictedInfoTypesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Other infoTypes found in this table's data.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.OtherInfoTypeSummary other_info_types = 28;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.OtherInfoTypeSummary> getOtherInfoTypesList();

  /**
   *
   *
   * <pre>
   * Other infoTypes found in this table's data.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.OtherInfoTypeSummary other_info_types = 28;</code>
   */
  com.google.privacy.dlp.v2.OtherInfoTypeSummary getOtherInfoTypes(int index);

  /**
   *
   *
   * <pre>
   * Other infoTypes found in this table's data.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.OtherInfoTypeSummary other_info_types = 28;</code>
   */
  int getOtherInfoTypesCount();

  /**
   *
   *
   * <pre>
   * Other infoTypes found in this table's data.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.OtherInfoTypeSummary other_info_types = 28;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.OtherInfoTypeSummaryOrBuilder>
      getOtherInfoTypesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Other infoTypes found in this table's data.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.OtherInfoTypeSummary other_info_types = 28;</code>
   */
  com.google.privacy.dlp.v2.OtherInfoTypeSummaryOrBuilder getOtherInfoTypesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The snapshot of the configurations used to generate the profile.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileConfigSnapshot config_snapshot = 7;</code>
   *
   * @return Whether the configSnapshot field is set.
   */
  boolean hasConfigSnapshot();

  /**
   *
   *
   * <pre>
   * The snapshot of the configurations used to generate the profile.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileConfigSnapshot config_snapshot = 7;</code>
   *
   * @return The configSnapshot.
   */
  com.google.privacy.dlp.v2.DataProfileConfigSnapshot getConfigSnapshot();

  /**
   *
   *
   * <pre>
   * The snapshot of the configurations used to generate the profile.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileConfigSnapshot config_snapshot = 7;</code>
   */
  com.google.privacy.dlp.v2.DataProfileConfigSnapshotOrBuilder getConfigSnapshotOrBuilder();

  /**
   *
   *
   * <pre>
   * The time when this table was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_modified_time = 8;</code>
   *
   * @return Whether the lastModifiedTime field is set.
   */
  boolean hasLastModifiedTime();

  /**
   *
   *
   * <pre>
   * The time when this table was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_modified_time = 8;</code>
   *
   * @return The lastModifiedTime.
   */
  com.google.protobuf.Timestamp getLastModifiedTime();

  /**
   *
   *
   * <pre>
   * The time when this table was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_modified_time = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastModifiedTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The time when this table expires.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 9;</code>
   *
   * @return Whether the expirationTime field is set.
   */
  boolean hasExpirationTime();

  /**
   *
   *
   * <pre>
   * Optional. The time when this table expires.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 9;</code>
   *
   * @return The expirationTime.
   */
  com.google.protobuf.Timestamp getExpirationTime();

  /**
   *
   *
   * <pre>
   * Optional. The time when this table expires.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpirationTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The number of columns profiled in the table.
   * </pre>
   *
   * <code>int64 scanned_column_count = 10;</code>
   *
   * @return The scannedColumnCount.
   */
  long getScannedColumnCount();

  /**
   *
   *
   * <pre>
   * The number of columns skipped in the table because of an error.
   * </pre>
   *
   * <code>int64 failed_column_count = 11;</code>
   *
   * @return The failedColumnCount.
   */
  long getFailedColumnCount();

  /**
   *
   *
   * <pre>
   * The size of the table when the profile was generated.
   * </pre>
   *
   * <code>int64 table_size_bytes = 12;</code>
   *
   * @return The tableSizeBytes.
   */
  long getTableSizeBytes();

  /**
   *
   *
   * <pre>
   * Number of rows in the table when the profile was generated.
   * This will not be populated for BigLake tables.
   * </pre>
   *
   * <code>int64 row_count = 13;</code>
   *
   * @return The rowCount.
   */
  long getRowCount();

  /**
   *
   *
   * <pre>
   * How the table is encrypted.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.EncryptionStatus encryption_status = 14;</code>
   *
   * @return The enum numeric value on the wire for encryptionStatus.
   */
  int getEncryptionStatusValue();

  /**
   *
   *
   * <pre>
   * How the table is encrypted.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.EncryptionStatus encryption_status = 14;</code>
   *
   * @return The encryptionStatus.
   */
  com.google.privacy.dlp.v2.EncryptionStatus getEncryptionStatus();

  /**
   *
   *
   * <pre>
   * How broadly a resource has been shared.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ResourceVisibility resource_visibility = 15;</code>
   *
   * @return The enum numeric value on the wire for resourceVisibility.
   */
  int getResourceVisibilityValue();

  /**
   *
   *
   * <pre>
   * How broadly a resource has been shared.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ResourceVisibility resource_visibility = 15;</code>
   *
   * @return The resourceVisibility.
   */
  com.google.privacy.dlp.v2.ResourceVisibility getResourceVisibility();

  /**
   *
   *
   * <pre>
   * The last time the profile was generated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp profile_last_generated = 16;</code>
   *
   * @return Whether the profileLastGenerated field is set.
   */
  boolean hasProfileLastGenerated();

  /**
   *
   *
   * <pre>
   * The last time the profile was generated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp profile_last_generated = 16;</code>
   *
   * @return The profileLastGenerated.
   */
  com.google.protobuf.Timestamp getProfileLastGenerated();

  /**
   *
   *
   * <pre>
   * The last time the profile was generated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp profile_last_generated = 16;</code>
   */
  com.google.protobuf.TimestampOrBuilder getProfileLastGeneratedOrBuilder();

  /**
   *
   *
   * <pre>
   * The labels applied to the resource at the time the profile was generated.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_labels = 17;</code>
   */
  int getResourceLabelsCount();

  /**
   *
   *
   * <pre>
   * The labels applied to the resource at the time the profile was generated.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_labels = 17;</code>
   */
  boolean containsResourceLabels(java.lang.String key);

  /** Use {@link #getResourceLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getResourceLabels();

  /**
   *
   *
   * <pre>
   * The labels applied to the resource at the time the profile was generated.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_labels = 17;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getResourceLabelsMap();

  /**
   *
   *
   * <pre>
   * The labels applied to the resource at the time the profile was generated.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_labels = 17;</code>
   */
  /* nullable */
  java.lang.String getResourceLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * The labels applied to the resource at the time the profile was generated.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_labels = 17;</code>
   */
  java.lang.String getResourceLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The time at which the table was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 23;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * The time at which the table was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 23;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * The time at which the table was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 23;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The BigQuery table to which the sample findings are written.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable sample_findings_table = 37;</code>
   *
   * @return Whether the sampleFindingsTable field is set.
   */
  boolean hasSampleFindingsTable();

  /**
   *
   *
   * <pre>
   * The BigQuery table to which the sample findings are written.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable sample_findings_table = 37;</code>
   *
   * @return The sampleFindingsTable.
   */
  com.google.privacy.dlp.v2.BigQueryTable getSampleFindingsTable();

  /**
   *
   *
   * <pre>
   * The BigQuery table to which the sample findings are written.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable sample_findings_table = 37;</code>
   */
  com.google.privacy.dlp.v2.BigQueryTableOrBuilder getSampleFindingsTableOrBuilder();

  /**
   *
   *
   * <pre>
   * The tags attached to the table, including any tags attached during
   * profiling. Because tags are attached to Cloud SQL instances rather than
   * Cloud SQL tables, this field is empty for Cloud SQL table profiles.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Tag tags = 39;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.Tag> getTagsList();

  /**
   *
   *
   * <pre>
   * The tags attached to the table, including any tags attached during
   * profiling. Because tags are attached to Cloud SQL instances rather than
   * Cloud SQL tables, this field is empty for Cloud SQL table profiles.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Tag tags = 39;</code>
   */
  com.google.privacy.dlp.v2.Tag getTags(int index);

  /**
   *
   *
   * <pre>
   * The tags attached to the table, including any tags attached during
   * profiling. Because tags are attached to Cloud SQL instances rather than
   * Cloud SQL tables, this field is empty for Cloud SQL table profiles.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Tag tags = 39;</code>
   */
  int getTagsCount();

  /**
   *
   *
   * <pre>
   * The tags attached to the table, including any tags attached during
   * profiling. Because tags are attached to Cloud SQL instances rather than
   * Cloud SQL tables, this field is empty for Cloud SQL table profiles.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Tag tags = 39;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.TagOrBuilder> getTagsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The tags attached to the table, including any tags attached during
   * profiling. Because tags are attached to Cloud SQL instances rather than
   * Cloud SQL tables, this field is empty for Cloud SQL table profiles.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Tag tags = 39;</code>
   */
  com.google.privacy.dlp.v2.TagOrBuilder getTagsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Resources related to this profile.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.RelatedResource related_resources = 41;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.RelatedResource> getRelatedResourcesList();

  /**
   *
   *
   * <pre>
   * Resources related to this profile.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.RelatedResource related_resources = 41;</code>
   */
  com.google.privacy.dlp.v2.RelatedResource getRelatedResources(int index);

  /**
   *
   *
   * <pre>
   * Resources related to this profile.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.RelatedResource related_resources = 41;</code>
   */
  int getRelatedResourcesCount();

  /**
   *
   *
   * <pre>
   * Resources related to this profile.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.RelatedResource related_resources = 41;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.RelatedResourceOrBuilder>
      getRelatedResourcesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Resources related to this profile.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.RelatedResource related_resources = 41;</code>
   */
  com.google.privacy.dlp.v2.RelatedResourceOrBuilder getRelatedResourcesOrBuilder(int index);
}
