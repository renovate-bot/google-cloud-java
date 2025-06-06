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
// source: google/cloud/oracledatabase/v1/vm_cluster.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.oracledatabase.v1;

public interface CloudVmClusterPropertiesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.oracledatabase.v1.CloudVmClusterProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Oracle Cloud Infrastructure ID of VM Cluster.
   * </pre>
   *
   * <code>string ocid = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The ocid.
   */
  java.lang.String getOcid();

  /**
   *
   *
   * <pre>
   * Output only. Oracle Cloud Infrastructure ID of VM Cluster.
   * </pre>
   *
   * <code>string ocid = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for ocid.
   */
  com.google.protobuf.ByteString getOcidBytes();

  /**
   *
   *
   * <pre>
   * Required. License type of VM Cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.CloudVmClusterProperties.LicenseType license_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for licenseType.
   */
  int getLicenseTypeValue();

  /**
   *
   *
   * <pre>
   * Required. License type of VM Cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.CloudVmClusterProperties.LicenseType license_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The licenseType.
   */
  com.google.cloud.oracledatabase.v1.CloudVmClusterProperties.LicenseType getLicenseType();

  /**
   *
   *
   * <pre>
   * Optional. Grid Infrastructure Version.
   * </pre>
   *
   * <code>string gi_version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The giVersion.
   */
  java.lang.String getGiVersion();

  /**
   *
   *
   * <pre>
   * Optional. Grid Infrastructure Version.
   * </pre>
   *
   * <code>string gi_version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for giVersion.
   */
  com.google.protobuf.ByteString getGiVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Time zone of VM Cluster to set. Defaults to UTC if not specified.
   * </pre>
   *
   * <code>.google.type.TimeZone time_zone = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the timeZone field is set.
   */
  boolean hasTimeZone();

  /**
   *
   *
   * <pre>
   * Optional. Time zone of VM Cluster to set. Defaults to UTC if not specified.
   * </pre>
   *
   * <code>.google.type.TimeZone time_zone = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The timeZone.
   */
  com.google.type.TimeZone getTimeZone();

  /**
   *
   *
   * <pre>
   * Optional. Time zone of VM Cluster to set. Defaults to UTC if not specified.
   * </pre>
   *
   * <code>.google.type.TimeZone time_zone = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.type.TimeZoneOrBuilder getTimeZoneOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. SSH public keys to be stored with cluster.
   * </pre>
   *
   * <code>repeated string ssh_public_keys = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the sshPublicKeys.
   */
  java.util.List<java.lang.String> getSshPublicKeysList();

  /**
   *
   *
   * <pre>
   * Optional. SSH public keys to be stored with cluster.
   * </pre>
   *
   * <code>repeated string ssh_public_keys = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of sshPublicKeys.
   */
  int getSshPublicKeysCount();

  /**
   *
   *
   * <pre>
   * Optional. SSH public keys to be stored with cluster.
   * </pre>
   *
   * <code>repeated string ssh_public_keys = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The sshPublicKeys at the given index.
   */
  java.lang.String getSshPublicKeys(int index);

  /**
   *
   *
   * <pre>
   * Optional. SSH public keys to be stored with cluster.
   * </pre>
   *
   * <code>repeated string ssh_public_keys = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sshPublicKeys at the given index.
   */
  com.google.protobuf.ByteString getSshPublicKeysBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Number of database servers.
   * </pre>
   *
   * <code>int32 node_count = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The nodeCount.
   */
  int getNodeCount();

  /**
   *
   *
   * <pre>
   * Output only. Shape of VM Cluster.
   * </pre>
   *
   * <code>string shape = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The shape.
   */
  java.lang.String getShape();

  /**
   *
   *
   * <pre>
   * Output only. Shape of VM Cluster.
   * </pre>
   *
   * <code>string shape = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for shape.
   */
  com.google.protobuf.ByteString getShapeBytes();

  /**
   *
   *
   * <pre>
   * Optional. OCPU count per VM. Minimum is 0.1.
   * </pre>
   *
   * <code>float ocpu_count = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The ocpuCount.
   */
  float getOcpuCount();

  /**
   *
   *
   * <pre>
   * Optional. Memory allocated in GBs.
   * </pre>
   *
   * <code>int32 memory_size_gb = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The memorySizeGb.
   */
  int getMemorySizeGb();

  /**
   *
   *
   * <pre>
   * Optional. Local storage per VM.
   * </pre>
   *
   * <code>int32 db_node_storage_size_gb = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The dbNodeStorageSizeGb.
   */
  int getDbNodeStorageSizeGb();

  /**
   *
   *
   * <pre>
   * Output only. The storage allocation for the disk group, in gigabytes (GB).
   * </pre>
   *
   * <code>int32 storage_size_gb = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The storageSizeGb.
   */
  int getStorageSizeGb();

  /**
   *
   *
   * <pre>
   * Optional. The data disk group size to be allocated in TBs.
   * </pre>
   *
   * <code>double data_storage_size_tb = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The dataStorageSizeTb.
   */
  double getDataStorageSizeTb();

  /**
   *
   *
   * <pre>
   * Optional. The type of redundancy.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.CloudVmClusterProperties.DiskRedundancy disk_redundancy = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for diskRedundancy.
   */
  int getDiskRedundancyValue();

  /**
   *
   *
   * <pre>
   * Optional. The type of redundancy.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.CloudVmClusterProperties.DiskRedundancy disk_redundancy = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The diskRedundancy.
   */
  com.google.cloud.oracledatabase.v1.CloudVmClusterProperties.DiskRedundancy getDiskRedundancy();

  /**
   *
   *
   * <pre>
   * Optional. Use exadata sparse snapshots.
   * </pre>
   *
   * <code>bool sparse_diskgroup_enabled = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sparseDiskgroupEnabled.
   */
  boolean getSparseDiskgroupEnabled();

  /**
   *
   *
   * <pre>
   * Optional. Use local backup.
   * </pre>
   *
   * <code>bool local_backup_enabled = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The localBackupEnabled.
   */
  boolean getLocalBackupEnabled();

  /**
   *
   *
   * <pre>
   * Optional. Prefix for VM cluster host names.
   * </pre>
   *
   * <code>string hostname_prefix = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The hostnamePrefix.
   */
  java.lang.String getHostnamePrefix();

  /**
   *
   *
   * <pre>
   * Optional. Prefix for VM cluster host names.
   * </pre>
   *
   * <code>string hostname_prefix = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for hostnamePrefix.
   */
  com.google.protobuf.ByteString getHostnamePrefixBytes();

  /**
   *
   *
   * <pre>
   * Optional. Data collection options for diagnostics.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.DataCollectionOptions diagnostics_data_collection_options = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the diagnosticsDataCollectionOptions field is set.
   */
  boolean hasDiagnosticsDataCollectionOptions();

  /**
   *
   *
   * <pre>
   * Optional. Data collection options for diagnostics.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.DataCollectionOptions diagnostics_data_collection_options = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The diagnosticsDataCollectionOptions.
   */
  com.google.cloud.oracledatabase.v1.DataCollectionOptions getDiagnosticsDataCollectionOptions();

  /**
   *
   *
   * <pre>
   * Optional. Data collection options for diagnostics.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.DataCollectionOptions diagnostics_data_collection_options = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.oracledatabase.v1.DataCollectionOptionsOrBuilder
      getDiagnosticsDataCollectionOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. State of the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.CloudVmClusterProperties.State state = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. State of the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.CloudVmClusterProperties.State state = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.oracledatabase.v1.CloudVmClusterProperties.State getState();

  /**
   *
   *
   * <pre>
   * Output only. SCAN listener port - TCP
   * </pre>
   *
   * <code>int32 scan_listener_port_tcp = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The scanListenerPortTcp.
   */
  int getScanListenerPortTcp();

  /**
   *
   *
   * <pre>
   * Output only. SCAN listener port - TLS
   * </pre>
   *
   * <code>int32 scan_listener_port_tcp_ssl = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The scanListenerPortTcpSsl.
   */
  int getScanListenerPortTcpSsl();

  /**
   *
   *
   * <pre>
   * Output only. Parent DNS domain where SCAN DNS and hosts names are
   * qualified. ex: ocispdelegated.ocisp10jvnet.oraclevcn.com
   * </pre>
   *
   * <code>string domain = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The domain.
   */
  java.lang.String getDomain();

  /**
   *
   *
   * <pre>
   * Output only. Parent DNS domain where SCAN DNS and hosts names are
   * qualified. ex: ocispdelegated.ocisp10jvnet.oraclevcn.com
   * </pre>
   *
   * <code>string domain = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString getDomainBytes();

  /**
   *
   *
   * <pre>
   * Output only. SCAN DNS name.
   * ex: sp2-yi0xq-scan.ocispdelegated.ocisp10jvnet.oraclevcn.com
   * </pre>
   *
   * <code>string scan_dns = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The scanDns.
   */
  java.lang.String getScanDns();

  /**
   *
   *
   * <pre>
   * Output only. SCAN DNS name.
   * ex: sp2-yi0xq-scan.ocispdelegated.ocisp10jvnet.oraclevcn.com
   * </pre>
   *
   * <code>string scan_dns = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for scanDns.
   */
  com.google.protobuf.ByteString getScanDnsBytes();

  /**
   *
   *
   * <pre>
   * Output only. host name without domain.
   * format: "&lt;hostname_prefix&gt;-" with some suffix.
   * ex: sp2-yi0xq where "sp2" is the hostname_prefix.
   * </pre>
   *
   * <code>string hostname = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The hostname.
   */
  java.lang.String getHostname();

  /**
   *
   *
   * <pre>
   * Output only. host name without domain.
   * format: "&lt;hostname_prefix&gt;-" with some suffix.
   * ex: sp2-yi0xq where "sp2" is the hostname_prefix.
   * </pre>
   *
   * <code>string hostname = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for hostname.
   */
  com.google.protobuf.ByteString getHostnameBytes();

  /**
   *
   *
   * <pre>
   * Required. Number of enabled CPU cores.
   * </pre>
   *
   * <code>int32 cpu_core_count = 26 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The cpuCoreCount.
   */
  int getCpuCoreCount();

  /**
   *
   *
   * <pre>
   * Optional. Operating system version of the image.
   * </pre>
   *
   * <code>string system_version = 27 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The systemVersion.
   */
  java.lang.String getSystemVersion();

  /**
   *
   *
   * <pre>
   * Optional. Operating system version of the image.
   * </pre>
   *
   * <code>string system_version = 27 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for systemVersion.
   */
  com.google.protobuf.ByteString getSystemVersionBytes();

  /**
   *
   *
   * <pre>
   * Output only. OCIDs of scan IPs.
   * </pre>
   *
   * <code>repeated string scan_ip_ids = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return A list containing the scanIpIds.
   */
  java.util.List<java.lang.String> getScanIpIdsList();

  /**
   *
   *
   * <pre>
   * Output only. OCIDs of scan IPs.
   * </pre>
   *
   * <code>repeated string scan_ip_ids = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The count of scanIpIds.
   */
  int getScanIpIdsCount();

  /**
   *
   *
   * <pre>
   * Output only. OCIDs of scan IPs.
   * </pre>
   *
   * <code>repeated string scan_ip_ids = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the element to return.
   * @return The scanIpIds at the given index.
   */
  java.lang.String getScanIpIds(int index);

  /**
   *
   *
   * <pre>
   * Output only. OCIDs of scan IPs.
   * </pre>
   *
   * <code>repeated string scan_ip_ids = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the scanIpIds at the given index.
   */
  com.google.protobuf.ByteString getScanIpIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. OCID of scan DNS record.
   * </pre>
   *
   * <code>string scan_dns_record_id = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The scanDnsRecordId.
   */
  java.lang.String getScanDnsRecordId();

  /**
   *
   *
   * <pre>
   * Output only. OCID of scan DNS record.
   * </pre>
   *
   * <code>string scan_dns_record_id = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for scanDnsRecordId.
   */
  com.google.protobuf.ByteString getScanDnsRecordIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Deep link to the OCI console to view this resource.
   * </pre>
   *
   * <code>string oci_url = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The ociUrl.
   */
  java.lang.String getOciUrl();

  /**
   *
   *
   * <pre>
   * Output only. Deep link to the OCI console to view this resource.
   * </pre>
   *
   * <code>string oci_url = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for ociUrl.
   */
  com.google.protobuf.ByteString getOciUrlBytes();

  /**
   *
   *
   * <pre>
   * Optional. OCID of database servers.
   * </pre>
   *
   * <code>repeated string db_server_ocids = 31 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the dbServerOcids.
   */
  java.util.List<java.lang.String> getDbServerOcidsList();

  /**
   *
   *
   * <pre>
   * Optional. OCID of database servers.
   * </pre>
   *
   * <code>repeated string db_server_ocids = 31 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of dbServerOcids.
   */
  int getDbServerOcidsCount();

  /**
   *
   *
   * <pre>
   * Optional. OCID of database servers.
   * </pre>
   *
   * <code>repeated string db_server_ocids = 31 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The dbServerOcids at the given index.
   */
  java.lang.String getDbServerOcids(int index);

  /**
   *
   *
   * <pre>
   * Optional. OCID of database servers.
   * </pre>
   *
   * <code>repeated string db_server_ocids = 31 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the dbServerOcids at the given index.
   */
  com.google.protobuf.ByteString getDbServerOcidsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. Compartment ID of cluster.
   * </pre>
   *
   * <code>string compartment_id = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The compartmentId.
   */
  java.lang.String getCompartmentId();

  /**
   *
   *
   * <pre>
   * Output only. Compartment ID of cluster.
   * </pre>
   *
   * <code>string compartment_id = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for compartmentId.
   */
  com.google.protobuf.ByteString getCompartmentIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. DNS listener IP.
   * </pre>
   *
   * <code>string dns_listener_ip = 35 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The dnsListenerIp.
   */
  java.lang.String getDnsListenerIp();

  /**
   *
   *
   * <pre>
   * Output only. DNS listener IP.
   * </pre>
   *
   * <code>string dns_listener_ip = 35 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for dnsListenerIp.
   */
  com.google.protobuf.ByteString getDnsListenerIpBytes();

  /**
   *
   *
   * <pre>
   * Optional. OCI Cluster name.
   * </pre>
   *
   * <code>string cluster_name = 36 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The clusterName.
   */
  java.lang.String getClusterName();

  /**
   *
   *
   * <pre>
   * Optional. OCI Cluster name.
   * </pre>
   *
   * <code>string cluster_name = 36 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for clusterName.
   */
  com.google.protobuf.ByteString getClusterNameBytes();
}
