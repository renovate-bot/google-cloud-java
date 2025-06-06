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
// source: google/cloud/channel/v1/common.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.channel.v1;

public interface EduDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.EduData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Designated institute type of customer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.EduData.InstituteType institute_type = 1;</code>
   *
   * @return The enum numeric value on the wire for instituteType.
   */
  int getInstituteTypeValue();

  /**
   *
   *
   * <pre>
   * Designated institute type of customer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.EduData.InstituteType institute_type = 1;</code>
   *
   * @return The instituteType.
   */
  com.google.cloud.channel.v1.EduData.InstituteType getInstituteType();

  /**
   *
   *
   * <pre>
   * Size of the institute.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.EduData.InstituteSize institute_size = 2;</code>
   *
   * @return The enum numeric value on the wire for instituteSize.
   */
  int getInstituteSizeValue();

  /**
   *
   *
   * <pre>
   * Size of the institute.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.EduData.InstituteSize institute_size = 2;</code>
   *
   * @return The instituteSize.
   */
  com.google.cloud.channel.v1.EduData.InstituteSize getInstituteSize();

  /**
   *
   *
   * <pre>
   * Web address for the edu customer's institution.
   * </pre>
   *
   * <code>string website = 3;</code>
   *
   * @return The website.
   */
  java.lang.String getWebsite();

  /**
   *
   *
   * <pre>
   * Web address for the edu customer's institution.
   * </pre>
   *
   * <code>string website = 3;</code>
   *
   * @return The bytes for website.
   */
  com.google.protobuf.ByteString getWebsiteBytes();
}
