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
// source: google/devtools/cloudprofiler/v2/profiler.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.cloudprofiler.v2;

public interface UpdateProfileRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudprofiler.v2.UpdateProfileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Profile to update.
   * </pre>
   *
   * <code>.google.devtools.cloudprofiler.v2.Profile profile = 1;</code>
   *
   * @return Whether the profile field is set.
   */
  boolean hasProfile();

  /**
   *
   *
   * <pre>
   * Profile to update.
   * </pre>
   *
   * <code>.google.devtools.cloudprofiler.v2.Profile profile = 1;</code>
   *
   * @return The profile.
   */
  com.google.devtools.cloudprofiler.v2.Profile getProfile();

  /**
   *
   *
   * <pre>
   * Profile to update.
   * </pre>
   *
   * <code>.google.devtools.cloudprofiler.v2.Profile profile = 1;</code>
   */
  com.google.devtools.cloudprofiler.v2.ProfileOrBuilder getProfileOrBuilder();

  /**
   *
   *
   * <pre>
   * Field mask used to specify the fields to be overwritten. Currently only
   * profile_bytes and labels fields are supported by UpdateProfile, so only
   * those fields can be specified in the mask. When no mask is provided, all
   * fields are overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * Field mask used to specify the fields to be overwritten. Currently only
   * profile_bytes and labels fields are supported by UpdateProfile, so only
   * those fields can be specified in the mask. When no mask is provided, all
   * fields are overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * Field mask used to specify the fields to be overwritten. Currently only
   * profile_bytes and labels fields are supported by UpdateProfile, so only
   * those fields can be specified in the mask. When no mask is provided, all
   * fields are overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
