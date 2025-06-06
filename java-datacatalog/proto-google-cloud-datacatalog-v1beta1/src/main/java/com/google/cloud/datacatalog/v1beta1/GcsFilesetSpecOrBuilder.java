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
// source: google/cloud/datacatalog/v1beta1/gcs_fileset_spec.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datacatalog.v1beta1;

public interface GcsFilesetSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.GcsFilesetSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Patterns to identify a set of files in Google Cloud Storage.
   * See [Cloud Storage
   * documentation](https://cloud.google.com/storage/docs/wildcards)
   * for more information. Note that bucket wildcards are currently not
   * supported.
   *
   * Examples of valid file_patterns:
   *
   *  * `gs://bucket_name/dir/&#42;`: matches all files within `bucket_name/dir`
   *                              directory.
   *  * `gs://bucket_name/dir/&#42;*`: matches all files in `bucket_name/dir`
   *                               spanning all subdirectories.
   *  * `gs://bucket_name/file*`: matches files prefixed by `file` in
   *                              `bucket_name`
   *  * `gs://bucket_name/??.txt`: matches files with two characters followed by
   *                               `.txt` in `bucket_name`
   *  * `gs://bucket_name/[aeiou].txt`: matches files that contain a single
   *                                    vowel character followed by `.txt` in
   *                                    `bucket_name`
   *  * `gs://bucket_name/[a-m].txt`: matches files that contain `a`, `b`, ...
   *                                  or `m` followed by `.txt` in `bucket_name`
   *  * `gs://bucket_name/a/&#42;&#47;b`: matches all files in `bucket_name` that match
   *                              `a/&#42;&#47;b` pattern, such as `a/c/b`, `a/d/b`
   *  * `gs://another_bucket/a.txt`: matches `gs://another_bucket/a.txt`
   *
   * You can combine wildcards to provide more powerful matches, for example:
   *
   *  * `gs://bucket_name/[a-m]??.j*g`
   * </pre>
   *
   * <code>repeated string file_patterns = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the filePatterns.
   */
  java.util.List<java.lang.String> getFilePatternsList();

  /**
   *
   *
   * <pre>
   * Required. Patterns to identify a set of files in Google Cloud Storage.
   * See [Cloud Storage
   * documentation](https://cloud.google.com/storage/docs/wildcards)
   * for more information. Note that bucket wildcards are currently not
   * supported.
   *
   * Examples of valid file_patterns:
   *
   *  * `gs://bucket_name/dir/&#42;`: matches all files within `bucket_name/dir`
   *                              directory.
   *  * `gs://bucket_name/dir/&#42;*`: matches all files in `bucket_name/dir`
   *                               spanning all subdirectories.
   *  * `gs://bucket_name/file*`: matches files prefixed by `file` in
   *                              `bucket_name`
   *  * `gs://bucket_name/??.txt`: matches files with two characters followed by
   *                               `.txt` in `bucket_name`
   *  * `gs://bucket_name/[aeiou].txt`: matches files that contain a single
   *                                    vowel character followed by `.txt` in
   *                                    `bucket_name`
   *  * `gs://bucket_name/[a-m].txt`: matches files that contain `a`, `b`, ...
   *                                  or `m` followed by `.txt` in `bucket_name`
   *  * `gs://bucket_name/a/&#42;&#47;b`: matches all files in `bucket_name` that match
   *                              `a/&#42;&#47;b` pattern, such as `a/c/b`, `a/d/b`
   *  * `gs://another_bucket/a.txt`: matches `gs://another_bucket/a.txt`
   *
   * You can combine wildcards to provide more powerful matches, for example:
   *
   *  * `gs://bucket_name/[a-m]??.j*g`
   * </pre>
   *
   * <code>repeated string file_patterns = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of filePatterns.
   */
  int getFilePatternsCount();

  /**
   *
   *
   * <pre>
   * Required. Patterns to identify a set of files in Google Cloud Storage.
   * See [Cloud Storage
   * documentation](https://cloud.google.com/storage/docs/wildcards)
   * for more information. Note that bucket wildcards are currently not
   * supported.
   *
   * Examples of valid file_patterns:
   *
   *  * `gs://bucket_name/dir/&#42;`: matches all files within `bucket_name/dir`
   *                              directory.
   *  * `gs://bucket_name/dir/&#42;*`: matches all files in `bucket_name/dir`
   *                               spanning all subdirectories.
   *  * `gs://bucket_name/file*`: matches files prefixed by `file` in
   *                              `bucket_name`
   *  * `gs://bucket_name/??.txt`: matches files with two characters followed by
   *                               `.txt` in `bucket_name`
   *  * `gs://bucket_name/[aeiou].txt`: matches files that contain a single
   *                                    vowel character followed by `.txt` in
   *                                    `bucket_name`
   *  * `gs://bucket_name/[a-m].txt`: matches files that contain `a`, `b`, ...
   *                                  or `m` followed by `.txt` in `bucket_name`
   *  * `gs://bucket_name/a/&#42;&#47;b`: matches all files in `bucket_name` that match
   *                              `a/&#42;&#47;b` pattern, such as `a/c/b`, `a/d/b`
   *  * `gs://another_bucket/a.txt`: matches `gs://another_bucket/a.txt`
   *
   * You can combine wildcards to provide more powerful matches, for example:
   *
   *  * `gs://bucket_name/[a-m]??.j*g`
   * </pre>
   *
   * <code>repeated string file_patterns = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The filePatterns at the given index.
   */
  java.lang.String getFilePatterns(int index);

  /**
   *
   *
   * <pre>
   * Required. Patterns to identify a set of files in Google Cloud Storage.
   * See [Cloud Storage
   * documentation](https://cloud.google.com/storage/docs/wildcards)
   * for more information. Note that bucket wildcards are currently not
   * supported.
   *
   * Examples of valid file_patterns:
   *
   *  * `gs://bucket_name/dir/&#42;`: matches all files within `bucket_name/dir`
   *                              directory.
   *  * `gs://bucket_name/dir/&#42;*`: matches all files in `bucket_name/dir`
   *                               spanning all subdirectories.
   *  * `gs://bucket_name/file*`: matches files prefixed by `file` in
   *                              `bucket_name`
   *  * `gs://bucket_name/??.txt`: matches files with two characters followed by
   *                               `.txt` in `bucket_name`
   *  * `gs://bucket_name/[aeiou].txt`: matches files that contain a single
   *                                    vowel character followed by `.txt` in
   *                                    `bucket_name`
   *  * `gs://bucket_name/[a-m].txt`: matches files that contain `a`, `b`, ...
   *                                  or `m` followed by `.txt` in `bucket_name`
   *  * `gs://bucket_name/a/&#42;&#47;b`: matches all files in `bucket_name` that match
   *                              `a/&#42;&#47;b` pattern, such as `a/c/b`, `a/d/b`
   *  * `gs://another_bucket/a.txt`: matches `gs://another_bucket/a.txt`
   *
   * You can combine wildcards to provide more powerful matches, for example:
   *
   *  * `gs://bucket_name/[a-m]??.j*g`
   * </pre>
   *
   * <code>repeated string file_patterns = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the filePatterns at the given index.
   */
  com.google.protobuf.ByteString getFilePatternsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. Sample files contained in this fileset, not all files
   * contained in this fileset are represented here.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.GcsFileSpec sample_gcs_file_specs = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.datacatalog.v1beta1.GcsFileSpec> getSampleGcsFileSpecsList();

  /**
   *
   *
   * <pre>
   * Output only. Sample files contained in this fileset, not all files
   * contained in this fileset are represented here.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.GcsFileSpec sample_gcs_file_specs = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.datacatalog.v1beta1.GcsFileSpec getSampleGcsFileSpecs(int index);

  /**
   *
   *
   * <pre>
   * Output only. Sample files contained in this fileset, not all files
   * contained in this fileset are represented here.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.GcsFileSpec sample_gcs_file_specs = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getSampleGcsFileSpecsCount();

  /**
   *
   *
   * <pre>
   * Output only. Sample files contained in this fileset, not all files
   * contained in this fileset are represented here.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.GcsFileSpec sample_gcs_file_specs = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1beta1.GcsFileSpecOrBuilder>
      getSampleGcsFileSpecsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. Sample files contained in this fileset, not all files
   * contained in this fileset are represented here.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.GcsFileSpec sample_gcs_file_specs = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.datacatalog.v1beta1.GcsFileSpecOrBuilder getSampleGcsFileSpecsOrBuilder(
      int index);
}
