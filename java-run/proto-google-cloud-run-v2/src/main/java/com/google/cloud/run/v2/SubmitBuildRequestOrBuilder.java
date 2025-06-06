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
// source: google/cloud/run/v2/build.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.run.v2;

public interface SubmitBuildRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.SubmitBuildRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project and location to build in. Location must be a region,
   * e.g., 'us-central1' or 'global' if the global builder is to be used.
   * Format:
   * `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The project and location to build in. Location must be a region,
   * e.g., 'us-central1' or 'global' if the global builder is to be used.
   * Format:
   * `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Source for the build.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.StorageSource storage_source = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the storageSource field is set.
   */
  boolean hasStorageSource();

  /**
   *
   *
   * <pre>
   * Required. Source for the build.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.StorageSource storage_source = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The storageSource.
   */
  com.google.cloud.run.v2.StorageSource getStorageSource();

  /**
   *
   *
   * <pre>
   * Required. Source for the build.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.StorageSource storage_source = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.run.v2.StorageSourceOrBuilder getStorageSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Artifact Registry URI to store the built image.
   * </pre>
   *
   * <code>string image_uri = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The imageUri.
   */
  java.lang.String getImageUri();

  /**
   *
   *
   * <pre>
   * Required. Artifact Registry URI to store the built image.
   * </pre>
   *
   * <code>string image_uri = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for imageUri.
   */
  com.google.protobuf.ByteString getImageUriBytes();

  /**
   *
   *
   * <pre>
   * Build the source using Buildpacks.
   * </pre>
   *
   * <code>.google.cloud.run.v2.SubmitBuildRequest.BuildpacksBuild buildpack_build = 4;</code>
   *
   * @return Whether the buildpackBuild field is set.
   */
  boolean hasBuildpackBuild();

  /**
   *
   *
   * <pre>
   * Build the source using Buildpacks.
   * </pre>
   *
   * <code>.google.cloud.run.v2.SubmitBuildRequest.BuildpacksBuild buildpack_build = 4;</code>
   *
   * @return The buildpackBuild.
   */
  com.google.cloud.run.v2.SubmitBuildRequest.BuildpacksBuild getBuildpackBuild();

  /**
   *
   *
   * <pre>
   * Build the source using Buildpacks.
   * </pre>
   *
   * <code>.google.cloud.run.v2.SubmitBuildRequest.BuildpacksBuild buildpack_build = 4;</code>
   */
  com.google.cloud.run.v2.SubmitBuildRequest.BuildpacksBuildOrBuilder getBuildpackBuildOrBuilder();

  /**
   *
   *
   * <pre>
   * Build the source using Docker. This means the source has a Dockerfile.
   * </pre>
   *
   * <code>.google.cloud.run.v2.SubmitBuildRequest.DockerBuild docker_build = 5;</code>
   *
   * @return Whether the dockerBuild field is set.
   */
  boolean hasDockerBuild();

  /**
   *
   *
   * <pre>
   * Build the source using Docker. This means the source has a Dockerfile.
   * </pre>
   *
   * <code>.google.cloud.run.v2.SubmitBuildRequest.DockerBuild docker_build = 5;</code>
   *
   * @return The dockerBuild.
   */
  com.google.cloud.run.v2.SubmitBuildRequest.DockerBuild getDockerBuild();

  /**
   *
   *
   * <pre>
   * Build the source using Docker. This means the source has a Dockerfile.
   * </pre>
   *
   * <code>.google.cloud.run.v2.SubmitBuildRequest.DockerBuild docker_build = 5;</code>
   */
  com.google.cloud.run.v2.SubmitBuildRequest.DockerBuildOrBuilder getDockerBuildOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The service account to use for the build. If not set, the default
   * Cloud Build service account for the project will be used.
   * </pre>
   *
   * <code>string service_account = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();

  /**
   *
   *
   * <pre>
   * Optional. The service account to use for the build. If not set, the default
   * Cloud Build service account for the project will be used.
   * </pre>
   *
   * <code>string service_account = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Optional. Name of the Cloud Build Custom Worker Pool that should be used to
   * build the function. The format of this field is
   * `projects/{project}/locations/{region}/workerPools/{workerPool}` where
   * `{project}` and `{region}` are the project id and region respectively where
   * the worker pool is defined and `{workerPool}` is the short name of the
   * worker pool.
   * </pre>
   *
   * <code>
   * string worker_pool = 7 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The workerPool.
   */
  java.lang.String getWorkerPool();

  /**
   *
   *
   * <pre>
   * Optional. Name of the Cloud Build Custom Worker Pool that should be used to
   * build the function. The format of this field is
   * `projects/{project}/locations/{region}/workerPools/{workerPool}` where
   * `{project}` and `{region}` are the project id and region respectively where
   * the worker pool is defined and `{workerPool}` is the short name of the
   * worker pool.
   * </pre>
   *
   * <code>
   * string worker_pool = 7 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for workerPool.
   */
  com.google.protobuf.ByteString getWorkerPoolBytes();

  /**
   *
   *
   * <pre>
   * Optional. Additional tags to annotate the build.
   * </pre>
   *
   * <code>repeated string tags = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String> getTagsList();

  /**
   *
   *
   * <pre>
   * Optional. Additional tags to annotate the build.
   * </pre>
   *
   * <code>repeated string tags = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of tags.
   */
  int getTagsCount();

  /**
   *
   *
   * <pre>
   * Optional. Additional tags to annotate the build.
   * </pre>
   *
   * <code>repeated string tags = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);

  /**
   *
   *
   * <pre>
   * Optional. Additional tags to annotate the build.
   * </pre>
   *
   * <code>repeated string tags = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString getTagsBytes(int index);

  com.google.cloud.run.v2.SubmitBuildRequest.SourceCase getSourceCase();

  com.google.cloud.run.v2.SubmitBuildRequest.BuildTypeCase getBuildTypeCase();
}
