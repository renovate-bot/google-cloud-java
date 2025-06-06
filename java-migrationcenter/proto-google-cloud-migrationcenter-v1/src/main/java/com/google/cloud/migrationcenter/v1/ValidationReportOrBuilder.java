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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.migrationcenter.v1;

public interface ValidationReportOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.ValidationReport)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of errors found in files.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.FileValidationReport file_validations = 1;
   * </code>
   */
  java.util.List<com.google.cloud.migrationcenter.v1.FileValidationReport> getFileValidationsList();

  /**
   *
   *
   * <pre>
   * List of errors found in files.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.FileValidationReport file_validations = 1;
   * </code>
   */
  com.google.cloud.migrationcenter.v1.FileValidationReport getFileValidations(int index);

  /**
   *
   *
   * <pre>
   * List of errors found in files.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.FileValidationReport file_validations = 1;
   * </code>
   */
  int getFileValidationsCount();

  /**
   *
   *
   * <pre>
   * List of errors found in files.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.FileValidationReport file_validations = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.migrationcenter.v1.FileValidationReportOrBuilder>
      getFileValidationsOrBuilderList();

  /**
   *
   *
   * <pre>
   * List of errors found in files.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.FileValidationReport file_validations = 1;
   * </code>
   */
  com.google.cloud.migrationcenter.v1.FileValidationReportOrBuilder getFileValidationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * List of job level errors.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportError job_errors = 2;</code>
   */
  java.util.List<com.google.cloud.migrationcenter.v1.ImportError> getJobErrorsList();

  /**
   *
   *
   * <pre>
   * List of job level errors.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportError job_errors = 2;</code>
   */
  com.google.cloud.migrationcenter.v1.ImportError getJobErrors(int index);

  /**
   *
   *
   * <pre>
   * List of job level errors.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportError job_errors = 2;</code>
   */
  int getJobErrorsCount();

  /**
   *
   *
   * <pre>
   * List of job level errors.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportError job_errors = 2;</code>
   */
  java.util.List<? extends com.google.cloud.migrationcenter.v1.ImportErrorOrBuilder>
      getJobErrorsOrBuilderList();

  /**
   *
   *
   * <pre>
   * List of job level errors.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportError job_errors = 2;</code>
   */
  com.google.cloud.migrationcenter.v1.ImportErrorOrBuilder getJobErrorsOrBuilder(int index);
}
