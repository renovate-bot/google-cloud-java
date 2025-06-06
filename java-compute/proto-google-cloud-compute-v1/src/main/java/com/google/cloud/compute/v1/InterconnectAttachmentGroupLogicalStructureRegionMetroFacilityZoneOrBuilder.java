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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

public interface InterconnectAttachmentGroupLogicalStructureRegionMetroFacilityZoneOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InterconnectAttachmentGroupLogicalStructureRegionMetroFacilityZone)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] URLs of Attachments in the given zone, to the given region, on Interconnects in the given facility and metro. Every Attachment in the AG has such an entry.
   * </pre>
   *
   * <code>repeated string attachments = 334744496;</code>
   *
   * @return A list containing the attachments.
   */
  java.util.List<java.lang.String> getAttachmentsList();

  /**
   *
   *
   * <pre>
   * [Output Only] URLs of Attachments in the given zone, to the given region, on Interconnects in the given facility and metro. Every Attachment in the AG has such an entry.
   * </pre>
   *
   * <code>repeated string attachments = 334744496;</code>
   *
   * @return The count of attachments.
   */
  int getAttachmentsCount();

  /**
   *
   *
   * <pre>
   * [Output Only] URLs of Attachments in the given zone, to the given region, on Interconnects in the given facility and metro. Every Attachment in the AG has such an entry.
   * </pre>
   *
   * <code>repeated string attachments = 334744496;</code>
   *
   * @param index The index of the element to return.
   * @return The attachments at the given index.
   */
  java.lang.String getAttachments(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] URLs of Attachments in the given zone, to the given region, on Interconnects in the given facility and metro. Every Attachment in the AG has such an entry.
   * </pre>
   *
   * <code>repeated string attachments = 334744496;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the attachments at the given index.
   */
  com.google.protobuf.ByteString getAttachmentsBytes(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] The name of a zone, either "zone1" or "zone2".
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return Whether the zone field is set.
   */
  boolean hasZone();

  /**
   *
   *
   * <pre>
   * [Output Only] The name of a zone, either "zone1" or "zone2".
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();

  /**
   *
   *
   * <pre>
   * [Output Only] The name of a zone, either "zone1" or "zone2".
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();
}
