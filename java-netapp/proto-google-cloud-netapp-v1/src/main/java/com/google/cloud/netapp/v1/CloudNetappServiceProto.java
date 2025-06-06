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
// source: google/cloud/netapp/v1/cloud_netapp_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.netapp.v1;

public final class CloudNetappServiceProto {
  private CloudNetappServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "1google/cloud/netapp/v1/cloud_netapp_se"
          + "rvice.proto\022\026google.cloud.netapp.v1\032\034goo"
          + "gle/api/annotations.proto\032\027google/api/cl"
          + "ient.proto\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\032-google/c"
          + "loud/netapp/v1/active_directory.proto\032#google/cloud/netapp/v1/backup.proto\032*goog"
          + "le/cloud/netapp/v1/backup_policy.proto\032)"
          + "google/cloud/netapp/v1/backup_vault.proto\032"
          + " google/cloud/netapp/v1/kms.proto\032\'google/cloud/netapp/v1/quota_rule.proto\032(go"
          + "ogle/cloud/netapp/v1/replication.proto\032%google/cloud/netapp/v1/snapshot.proto\032)g"
          + "oogle/cloud/netapp/v1/storage_pool.proto\032#google/cloud/netapp/v1/volume.proto\032#g"
          + "oogle/longrunning/operations.proto\032\033goog"
          + "le/protobuf/empty.proto\032\037google/protobuf/timestamp.proto\"\200\002\n"
          + "\021OperationMetadata\0224\n"
          + "\013create_time\030\001 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221\n"
          + "\010end_time\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\023\n"
          + "\006target\030\003 \001(\tB\003\340A\003\022\021\n"
          + "\004verb\030\004 \001(\tB\003\340A\003\022\033\n"
          + "\016status_message\030\005 \001(\tB\003\340A\003\022#\n"
          + "\026requested_cancellation\030\006 \001(\010B\003\340A\003\022\030\n"
          + "\013api_version\030\007 \001(\tB\003\340A\0032\221d\n"
          + "\006NetApp\022\270\001\n"
          + "\020ListStoragePools\022/.google.cloud.netapp.v1.ListStoragePoolsRequest\0320.g"
          + "oogle.cloud.netapp.v1.ListStoragePoolsRe"
          + "sponse\"A\332A\006parent\202\323\344\223\0022\0220/v1/{parent=projects/*/locations/*}/storagePools\022\366\001\n"
          + "\021CreateStoragePool\0220.google.cloud.netapp.v1"
          + ".CreateStoragePoolRequest\032\035.google.longrunning.Operation\"\217\001\312A \n"
          + "\013StoragePool\022\021OperationMetadata\332A#parent,storage_pool,sto"
          + "rage_pool_id\202\323\344\223\002@\"0/v1/{parent=projects"
          + "/*/locations/*}/storagePools:\014storage_pool\022\245\001\n"
          + "\016GetStoragePool\022-.google.cloud.netapp.v1.GetStoragePoolRequest\032#.google.cl"
          + "oud.netapp.v1.StoragePool\"?\332A\004name\202\323\344\223\0022"
          + "\0220/v1/{name=projects/*/locations/*/storagePools/*}\022\370\001\n"
          + "\021UpdateStoragePool\0220.googl"
          + "e.cloud.netapp.v1.UpdateStoragePoolRequest\032\035.google.longrunning.Operation\"\221\001\312A"
          + " \n"
          + "\013StoragePool\022\021OperationMetadata\332A\030storag"
          + "e_pool,update_mask\202\323\344\223\002M2=/v1/{storage_p"
          + "ool.name=projects/*/locations/*/storagePools/*}:\014storage_pool\022\322\001\n"
          + "\021DeleteStoragePool\0220.google.cloud.netapp.v1.DeleteStora"
          + "gePoolRequest\032\035.google.longrunning.Operation\"l\312A*\n"
          + "\025google.protobuf.Empty\022\021Operat"
          + "ionMetadata\332A\004name\202\323\344\223\0022*0/v1/{name=projects/*/locations/*/storagePools/*}\022\366\001\n"
          + "\030ValidateDirectoryService\0227.google.cloud.n"
          + "etapp.v1.ValidateDirectoryServiceRequest\032\035.google.longrunning.Operation\"\201\001\312A*\n"
          + "\025google.protobuf.Empty\022\021OperationMetadata\202"
          + "\323\344\223\002N\"I/v1/{name=projects/*/locations/*/"
          + "storagePools/*}:validateDirectoryService:\001*\022\327\001\n"
          + "\027SwitchActiveReplicaZone\0226.google.cloud.netapp.v1.SwitchActiveReplicaZone"
          + "Request\032\035.google.longrunning.Operation\"e\312A \n"
          + "\013StoragePool\022\021OperationMetadata\202\323\344\223\002"
          + "<\"7/v1/{name=projects/*/locations/*/storagePools/*}:switch:\001*\022\244\001\n"
          + "\013ListVolumes\022*.google.cloud.netapp.v1.ListVolumesReques"
          + "t\032+.google.cloud.netapp.v1.ListVolumesRe"
          + "sponse\"<\332A\006parent\202\323\344\223\002-\022+/v1/{parent=projects/*/locations/*}/volumes\022\221\001\n"
          + "\tGetVolume\022(.google.cloud.netapp.v1.GetVolumeReq"
          + "uest\032\036.google.cloud.netapp.v1.Volume\":\332A"
          + "\004name\202\323\344\223\002-\022+/v1/{name=projects/*/locations/*/volumes/*}\022\317\001\n"
          + "\014CreateVolume\022+.goog"
          + "le.cloud.netapp.v1.CreateVolumeRequest\032\035.google.longrunning.Operation\"s\312A\033\n"
          + "\006Volume\022\021OperationMetadata\332A\027parent,volume,vo"
          + "lume_id\202\323\344\223\0025\"+/v1/{parent=projects/*/locations/*}/volumes:\006volume\022\321\001\n"
          + "\014UpdateVolume\022+.google.cloud.netapp.v1.UpdateVolum"
          + "eRequest\032\035.google.longrunning.Operation\"u\312A\033\n"
          + "\006Volume\022\021OperationMetadata\332A\022volume"
          + ",update_mask\202\323\344\223\002<22/v1/{volume.name=pro"
          + "jects/*/locations/*/volumes/*}:\006volume\022\303\001\n"
          + "\014DeleteVolume\022+.google.cloud.netapp.v1"
          + ".DeleteVolumeRequest\032\035.google.longrunning.Operation\"g\312A*\n"
          + "\025google.protobuf.Empty\022"
          + "\021OperationMetadata\332A\004name\202\323\344\223\002-*+/v1/{name=projects/*/locations/*/volumes/*}\022\267\001\n"
          + "\014RevertVolume\022+.google.cloud.netapp.v1.R"
          + "evertVolumeRequest\032\035.google.longrunning.Operation\"[\312A\033\n"
          + "\006Volume\022\021OperationMetadat"
          + "a\202\323\344\223\0027\"2/v1/{name=projects/*/locations/*/volumes/*}:revert:\001*\022\266\001\n\r"
          + "ListSnapshots\022,.google.cloud.netapp.v1.ListSnapshotsR"
          + "equest\032-.google.cloud.netapp.v1.ListSnap"
          + "shotsResponse\"H\332A\006parent\202\323\344\223\0029\0227/v1/{par"
          + "ent=projects/*/locations/*/volumes/*}/snapshots\022\243\001\n"
          + "\013GetSnapshot\022*.google.cloud.netapp.v1.GetSnapshotRequest\032 .google.clo"
          + "ud.netapp.v1.Snapshot\"F\332A\004name\202\323\344\223\0029\0227/v"
          + "1/{name=projects/*/locations/*/volumes/*/snapshots/*}\022\350\001\n"
          + "\016CreateSnapshot\022-.googl"
          + "e.cloud.netapp.v1.CreateSnapshotRequest\032\035.google.longrunning.Operation\"\207\001\312A\035\n"
          + "\010Snapshot\022\021OperationMetadata\332A\033parent,snaps"
          + "hot,snapshot_id\202\323\344\223\002C\"7/v1/{parent=proje"
          + "cts/*/locations/*/volumes/*}/snapshots:\010snapshot\022\323\001\n"
          + "\016DeleteSnapshot\022-.google.clo"
          + "ud.netapp.v1.DeleteSnapshotRequest\032\035.google.longrunning.Operation\"s\312A*\n"
          + "\025google.protobuf.Empty\022\021OperationMetadata\332A\004name\202"
          + "\323\344\223\0029*7/v1/{name=projects/*/locations/*/volumes/*/snapshots/*}\022\352\001\n"
          + "\016UpdateSnapshot\022-.google.cloud.netapp.v1.UpdateSnapsho"
          + "tRequest\032\035.google.longrunning.Operation\"\211\001\312A\035\n"
          + "\010Snapshot\022\021OperationMetadata\332A\024sna"
          + "pshot,update_mask\202\323\344\223\002L2@/v1/{snapshot.n"
          + "ame=projects/*/locations/*/volumes/*/snapshots/*}:\010snapshot\022\314\001\n"
          + "\025ListActiveDirectories\0224.google.cloud.netapp.v1.ListActiv"
          + "eDirectoriesRequest\0325.google.cloud.netap"
          + "p.v1.ListActiveDirectoriesResponse\"F\332A\006p"
          + "arent\202\323\344\223\0027\0225/v1/{parent=projects/*/locations/*}/activeDirectories\022\266\001\n"
          + "\022GetActiveDirectory\0221.google.cloud.netapp.v1.GetAc"
          + "tiveDirectoryRequest\032\'.google.cloud.neta"
          + "pp.v1.ActiveDirectory\"D\332A\004name\202\323\344\223\0027\0225/v"
          + "1/{name=projects/*/locations/*/activeDirectories/*}\022\223\002\n"
          + "\025CreateActiveDirectory\0224.google.cloud.netapp.v1.CreateActiveDirec"
          + "toryRequest\032\035.google.longrunning.Operation\"\244\001\312A$\n"
          + "\017ActiveDirectory\022\021OperationMetadata\332A+parent,active_directory,active_di"
          + "rectory_id\202\323\344\223\002I\"5/v1/{parent=projects/*"
          + "/locations/*}/activeDirectories:\020active_directory\022\225\002\n"
          + "\025UpdateActiveDirectory\0224.google.cloud.netapp.v1.UpdateActiveDirecto"
          + "ryRequest\032\035.google.longrunning.Operation\"\246\001\312A$\n"
          + "\017ActiveDirectory\022\021OperationMetada"
          + "ta\332A\034active_directory,update_mask\202\323\344\223\002Z2"
          + "F/v1/{active_directory.name=projects/*/l"
          + "ocations/*/activeDirectories/*}:\020active_directory\022\337\001\n"
          + "\025DeleteActiveDirectory\0224.google.cloud.netapp.v1.DeleteActiveDirecto"
          + "ryRequest\032\035.google.longrunning.Operation\"q\312A*\n"
          + "\025google.protobuf.Empty\022\021OperationM"
          + "etadata\332A\004name\202\323\344\223\0027*5/v1/{name=projects/*/locations/*/activeDirectories/*}\022\260\001\n"
          + "\016ListKmsConfigs\022-.google.cloud.netapp.v1."
          + "ListKmsConfigsRequest\032..google.cloud.net"
          + "app.v1.ListKmsConfigsResponse\"?\332A\006parent"
          + "\202\323\344\223\0020\022./v1/{parent=projects/*/locations/*}/kmsConfigs\022\350\001\n"
          + "\017CreateKmsConfig\022..goo"
          + "gle.cloud.netapp.v1.CreateKmsConfigRequest\032\035.google.longrunning.Operation\"\205\001\312A\036\n"
          + "\tKmsConfig\022\021OperationMetadata\332A\037parent,k"
          + "ms_config,kms_config_id\202\323\344\223\002<\"./v1/{parent=projects/*/locations/*}/kmsConfigs:\n"
          + "kms_config\022\235\001\n"
          + "\014GetKmsConfig\022+.google.cloud.netapp.v1.GetKmsConfigRequest\032!.google"
          + ".cloud.netapp.v1.KmsConfig\"=\332A\004name\202\323\344\223\002"
          + "0\022./v1/{name=projects/*/locations/*/kmsConfigs/*}\022\352\001\n"
          + "\017UpdateKmsConfig\022..google.c"
          + "loud.netapp.v1.UpdateKmsConfigRequest\032\035.google.longrunning.Operation\"\207\001\312A\036\n"
          + "\tKmsConfig\022\021OperationMetadata\332A\026kms_config,up"
          + "date_mask\202\323\344\223\002G29/v1/{kms_config.name=projects/*/locations/*/kmsConfigs/*}:\n"
          + "kms_config\022\302\001\n"
          + "\016EncryptVolumes\022-.google.cloud"
          + ".netapp.v1.EncryptVolumesRequest\032\035.google.longrunning.Operation\"b\312A\036\n"
          + "\tKmsConfig\022\021OperationMetadata\202\323\344\223\002;\"6/v1/{name=proj"
          + "ects/*/locations/*/kmsConfigs/*}:encrypt:\001*\022\264\001\n"
          + "\017VerifyKmsConfig\022..google.cloud.netapp.v1.VerifyKmsConfigRequest\032/.google"
          + ".cloud.netapp.v1.VerifyKmsConfigResponse"
          + "\"@\202\323\344\223\002:\"5/v1/{name=projects/*/locations/*/kmsConfigs/*}:verify:\001*\022\314\001\n"
          + "\017DeleteKmsConfig\022..google.cloud.netapp.v1.DeleteKm"
          + "sConfigRequest\032\035.google.longrunning.Operation\"j\312A*\n"
          + "\025google.protobuf.Empty\022\021Opera"
          + "tionMetadata\332A\004name\202\323\344\223\0020*./v1/{name=projects/*/locations/*/kmsConfigs/*}\022\302\001\n"
          + "\020ListReplications\022/.google.cloud.netapp.v1."
          + "ListReplicationsRequest\0320.google.cloud.n"
          + "etapp.v1.ListReplicationsResponse\"K\332A\006pa"
          + "rent\202\323\344\223\002<\022:/v1/{parent=projects/*/locations/*/volumes/*}/replications\022\257\001\n"
          + "\016GetReplication\022-.google.cloud.netapp.v1.GetRe"
          + "plicationRequest\032#.google.cloud.netapp.v"
          + "1.Replication\"I\332A\004name\202\323\344\223\002<\022:/v1/{name="
          + "projects/*/locations/*/volumes/*/replications/*}\022\375\001\n"
          + "\021CreateReplication\0220.google."
          + "cloud.netapp.v1.CreateReplicationRequest\032\035.google.longrunning.Operation\"\226\001\312A"
          + " \n"
          + "\013Replication\022\021OperationMetadata\332A!parent,r"
          + "eplication,replication_id\202\323\344\223\002I\":/v1/{pa"
          + "rent=projects/*/locations/*/volumes/*}/replications:\013replication\022\334\001\n"
          + "\021DeleteReplication\0220.google.cloud.netapp.v1.DeleteRe"
          + "plicationRequest\032\035.google.longrunning.Operation\"v\312A*\n"
          + "\025google.protobuf.Empty\022\021Ope"
          + "rationMetadata\332A\004name\202\323\344\223\002<*:/v1/{name=p"
          + "rojects/*/locations/*/volumes/*/replications/*}\022\377\001\n"
          + "\021UpdateReplication\0220.google.c"
          + "loud.netapp.v1.UpdateReplicationRequest\032\035.google.longrunning.Operation\"\230\001\312A"
          + " \n"
          + "\013Replication\022\021OperationMetadata\332A\027replicati"
          + "on,update_mask\202\323\344\223\002U2F/v1/{replication.n"
          + "ame=projects/*/locations/*/volumes/*/replications/*}:\013replication\022\317\001\n"
          + "\017StopReplication\022..google.cloud.netapp.v1.StopRepli"
          + "cationRequest\032\035.google.longrunning.Operation\"m\312A \n"
          + "\013Replication\022\021OperationMetadat"
          + "a\202\323\344\223\002D\"?/v1/{name=projects/*/locations/*/volumes/*/replications/*}:stop:\001*\022\325\001\n"
          + "\021ResumeReplication\0220.google.cloud.netapp."
          + "v1.ResumeReplicationRequest\032\035.google.longrunning.Operation\"o\312A \n"
          + "\013Replication\022\021OperationMetadata\202\323\344\223\002F\"A/v1/{name=project"
          + "s/*/locations/*/volumes/*/replications/*}:resume:\001*\022\363\001\n"
          + "\033ReverseReplicationDirection\022:.google.cloud.netapp.v1.ReverseRepl"
          + "icationDirectionRequest\032\035.google.longrunning.Operation\"y\312A \n"
          + "\013Replication\022\021OperationMetadata\202\323\344\223\002P\"K/v1/{name=projects/*/"
          + "locations/*/volumes/*/replications/*}:reverseDirection:\001*\022\335\001\n"
          + "\020EstablishPeering\022/.google.cloud.netapp.v1.EstablishPeering"
          + "Request\032\035.google.longrunning.Operation\"y\312A \n"
          + "\013Replication\022\021OperationMetadata\202\323\344\223\002"
          + "P\"K/v1/{name=projects/*/locations/*/volu"
          + "mes/*/replications/*}:establishPeering:\001*\022\317\001\n"
          + "\017SyncReplication\022..google.cloud.net"
          + "app.v1.SyncReplicationRequest\032\035.google.longrunning.Operation\"m\312A \n"
          + "\013Replication\022\021OperationMetadata\202\323\344\223\002D\"?/v1/{name=proje"
          + "cts/*/locations/*/volumes/*/replications/*}:sync:\001*\022\366\001\n"
          + "\021CreateBackupVault\0220.goog"
          + "le.cloud.netapp.v1.CreateBackupVaultRequest\032\035.google.longrunning.Operation\"\217\001\312A"
          + " \n"
          + "\013BackupVault\022\021OperationMetadata\332A#paren"
          + "t,backup_vault,backup_vault_id\202\323\344\223\002@\"0/v"
          + "1/{parent=projects/*/locations/*}/backupVaults:\014backup_vault\022\245\001\n"
          + "\016GetBackupVault\022-.google.cloud.netapp.v1.GetBackupVaultR"
          + "equest\032#.google.cloud.netapp.v1.BackupVa"
          + "ult\"?\332A\004name\202\323\344\223\0022\0220/v1/{name=projects/*/locations/*/backupVaults/*}\022\270\001\n"
          + "\020ListBackupVaults\022/.google.cloud.netapp.v1.ListB"
          + "ackupVaultsRequest\0320.google.cloud.netapp"
          + ".v1.ListBackupVaultsResponse\"A\332A\006parent\202"
          + "\323\344\223\0022\0220/v1/{parent=projects/*/locations/*}/backupVaults\022\370\001\n"
          + "\021UpdateBackupVault\0220.google.cloud.netapp.v1.UpdateBackupVault"
          + "Request\032\035.google.longrunning.Operation\"\221\001\312A \n"
          + "\013BackupVault\022\021OperationMetadata\332A\030b"
          + "ackup_vault,update_mask\202\323\344\223\002M2=/v1/{back"
          + "up_vault.name=projects/*/locations/*/backupVaults/*}:\014backup_vault\022\322\001\n"
          + "\021DeleteBackupVault\0220.google.cloud.netapp.v1.Delete"
          + "BackupVaultRequest\032\035.google.longrunning.Operation\"l\312A*\n"
          + "\025google.protobuf.Empty\022\021O"
          + "perationMetadata\332A\004name\202\323\344\223\0022*0/v1/{name"
          + "=projects/*/locations/*/backupVaults/*}\022\337\001\n"
          + "\014CreateBackup\022+.google.cloud.netapp.v"
          + "1.CreateBackupRequest\032\035.google.longrunning.Operation\"\202\001\312A\033\n"
          + "\006Backup\022\021OperationMet"
          + "adata\332A\027parent,backup,backup_id\202\323\344\223\002D\":/"
          + "v1/{parent=projects/*/locations/*/backupVaults/*}/backups:\006backup\022\240\001\n"
          + "\tGetBackup\022(.google.cloud.netapp.v1.GetBackupReques"
          + "t\032\036.google.cloud.netapp.v1.Backup\"I\332A\004na"
          + "me\202\323\344\223\002<\022:/v1/{name=projects/*/locations/*/backupVaults/*/backups/*}\022\263\001\n"
          + "\013ListBackups\022*.google.cloud.netapp.v1.ListBackup"
          + "sRequest\032+.google.cloud.netapp.v1.ListBa"
          + "ckupsResponse\"K\332A\006parent\202\323\344\223\002<\022:/v1/{par"
          + "ent=projects/*/locations/*/backupVaults/*}/backups\022\322\001\n"
          + "\014DeleteBackup\022+.google.clo"
          + "ud.netapp.v1.DeleteBackupRequest\032\035.google.longrunning.Operation\"v\312A*\n"
          + "\025google.protobuf.Empty\022\021OperationMetadata\332A\004name\202\323\344"
          + "\223\002<*:/v1/{name=projects/*/locations/*/backupVaults/*/backups/*}\022\341\001\n"
          + "\014UpdateBackup\022+.google.cloud.netapp.v1.UpdateBackupRe"
          + "quest\032\035.google.longrunning.Operation\"\204\001\312A\033\n"
          + "\006Backup\022\021OperationMetadata\332A\022backup,u"
          + "pdate_mask\202\323\344\223\002K2A/v1/{backup.name=proje"
          + "cts/*/locations/*/backupVaults/*/backups/*}:\006backup\022\376\001\n"
          + "\022CreateBackupPolicy\0221.google.cloud.netapp.v1.CreateBackupPolicyRe"
          + "quest\032\035.google.longrunning.Operation\"\225\001\312A!\n"
          + "\014BackupPolicy\022\021OperationMetadata\332A%pa"
          + "rent,backup_policy,backup_policy_id\202\323\344\223\002"
          + "C\"2/v1/{parent=projects/*/locations/*}/backupPolicies:\r"
          + "backup_policy\022\252\001\n"
          + "\017GetBackupPolicy\022..google.cloud.netapp.v1.GetBac"
          + "kupPolicyRequest\032$.google.cloud.netapp.v"
          + "1.BackupPolicy\"A\332A\004name\202\323\344\223\0024\0222/v1/{name"
          + "=projects/*/locations/*/backupPolicies/*}\022\300\001\n"
          + "\022ListBackupPolicies\0221.google.cloud.netapp.v1.ListBackupPoliciesRequest\0322.go"
          + "ogle.cloud.netapp.v1.ListBackupPoliciesR"
          + "esponse\"C\332A\006parent\202\323\344\223\0024\0222/v1/{parent=projects/*/locations/*}/backupPolicies\022\200\002\n"
          + "\022UpdateBackupPolicy\0221.google.cloud.netap"
          + "p.v1.UpdateBackupPolicyRequest\032\035.google.longrunning.Operation\"\227\001\312A!\n"
          + "\014BackupPolicy\022\021OperationMetadata\332A\031backup_policy,upd"
          + "ate_mask\202\323\344\223\002Q2@/v1/{backup_policy.name="
          + "projects/*/locations/*/backupPolicies/*}:\r"
          + "backup_policy\022\326\001\n"
          + "\022DeleteBackupPolicy\0221.google.cloud.netapp.v1.DeleteBackupPoli"
          + "cyRequest\032\035.google.longrunning.Operation\"n\312A*\n"
          + "\025google.protobuf.Empty\022\021OperationM"
          + "etadata\332A\004name\202\323\344\223\0024*2/v1/{name=projects/*/locations/*/backupPolicies/*}\022\272\001\n"
          + "\016ListQuotaRules\022-.google.cloud.netapp.v1.Lis"
          + "tQuotaRulesRequest\032..google.cloud.netapp"
          + ".v1.ListQuotaRulesResponse\"I\332A\006parent\202\323\344"
          + "\223\002:\0228/v1/{parent=projects/*/locations/*/volumes/*}/quotaRules\022\247\001\n"
          + "\014GetQuotaRule\022+.google.cloud.netapp.v1.GetQuotaRuleRequ"
          + "est\032!.google.cloud.netapp.v1.QuotaRule\"G"
          + "\332A\004name\202\323\344\223\002:\0228/v1/{name=projects/*/locations/*/volumes/*/quotaRules/*}\022\362\001\n"
          + "\017CreateQuotaRule\022..google.cloud.netapp.v1.Cre"
          + "ateQuotaRuleRequest\032\035.google.longrunning.Operation\"\217\001\312A\036\n"
          + "\tQuotaRule\022\021OperationMetadata\332A\037parent,quota_rule,quota_rule_id"
          + "\202\323\344\223\002F\"8/v1/{parent=projects/*/locations/*/volumes/*}/quotaRules:\n"
          + "quota_rule\022\364\001\n"
          + "\017UpdateQuotaRule\022..google.cloud.netapp.v"
          + "1.UpdateQuotaRuleRequest\032\035.google.longrunning.Operation\"\221\001\312A\036\n"
          + "\tQuotaRule\022\021OperationMetadata\332A\026quota_rule,update_mask\202\323\344\223"
          + "\002Q2C/v1/{quota_rule.name=projects/*/locations/*/volumes/*/quotaRules/*}:\n"
          + "quota_rule\022\326\001\n"
          + "\017DeleteQuotaRule\022..google.cloud.n"
          + "etapp.v1.DeleteQuotaRuleRequest\032\035.google.longrunning.Operation\"t\312A*\n"
          + "\025google.protobuf.Empty\022\021OperationMetadata\332A\004name\202\323\344\223"
          + "\002:*8/v1/{name=projects/*/locations/*/vol"
          + "umes/*/quotaRules/*}\032I\312A\025netapp.googleap"
          + "is.com\322A.https://www.googleapis.com/auth/cloud-platformB\212\002\n"
          + "\032com.google.cloud.netapp.v1B\027CloudNetappServiceProtoP\001Z2cloud"
          + ".google.com/go/netapp/apiv1/netapppb;net"
          + "apppb\252\002\026Google.Cloud.NetApp.V1\312\002\026Google\\"
          + "Cloud\\NetApp\\V1\352\002\031Google::Cloud::NetApp::V1\352AN\n"
          + "\036compute.googleapis.com/Network\022,projects/{project}/global/networks/{netw"
          + "ork}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.netapp.v1.ActiveDirectoryProto.getDescriptor(),
              com.google.cloud.netapp.v1.BackupProto.getDescriptor(),
              com.google.cloud.netapp.v1.BackupPolicyProto.getDescriptor(),
              com.google.cloud.netapp.v1.BackupVaultProto.getDescriptor(),
              com.google.cloud.netapp.v1.KmsProto.getDescriptor(),
              com.google.cloud.netapp.v1.QuotaRuleProto.getDescriptor(),
              com.google.cloud.netapp.v1.ReplicationProto.getDescriptor(),
              com.google.cloud.netapp.v1.SnapshotProto.getDescriptor(),
              com.google.cloud.netapp.v1.StoragePoolProto.getDescriptor(),
              com.google.cloud.netapp.v1.VolumeProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_netapp_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_netapp_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.netapp.v1.ActiveDirectoryProto.getDescriptor();
    com.google.cloud.netapp.v1.BackupProto.getDescriptor();
    com.google.cloud.netapp.v1.BackupPolicyProto.getDescriptor();
    com.google.cloud.netapp.v1.BackupVaultProto.getDescriptor();
    com.google.cloud.netapp.v1.KmsProto.getDescriptor();
    com.google.cloud.netapp.v1.QuotaRuleProto.getDescriptor();
    com.google.cloud.netapp.v1.ReplicationProto.getDescriptor();
    com.google.cloud.netapp.v1.SnapshotProto.getDescriptor();
    com.google.cloud.netapp.v1.StoragePoolProto.getDescriptor();
    com.google.cloud.netapp.v1.VolumeProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
