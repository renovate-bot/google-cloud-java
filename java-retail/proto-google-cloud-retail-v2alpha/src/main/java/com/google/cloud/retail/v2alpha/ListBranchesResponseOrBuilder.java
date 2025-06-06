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
// source: google/cloud/retail/v2alpha/branch_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2alpha;

public interface ListBranchesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.ListBranchesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Branches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Branch branches = 1;</code>
   */
  java.util.List<com.google.cloud.retail.v2alpha.Branch> getBranchesList();

  /**
   *
   *
   * <pre>
   * The Branches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Branch branches = 1;</code>
   */
  com.google.cloud.retail.v2alpha.Branch getBranches(int index);

  /**
   *
   *
   * <pre>
   * The Branches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Branch branches = 1;</code>
   */
  int getBranchesCount();

  /**
   *
   *
   * <pre>
   * The Branches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Branch branches = 1;</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2alpha.BranchOrBuilder>
      getBranchesOrBuilderList();

  /**
   *
   *
   * <pre>
   * The Branches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Branch branches = 1;</code>
   */
  com.google.cloud.retail.v2alpha.BranchOrBuilder getBranchesOrBuilder(int index);
}
