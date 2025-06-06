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
// source: google/cloud/aiplatform/v1/vizier_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public interface ListOptimalTrialsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListOptimalTrialsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The pareto-optimal Trials for multiple objective Study or the
   * optimal trial for single objective Study. The definition of
   * pareto-optimal can be checked in wiki page.
   * https://en.wikipedia.org/wiki/Pareto_efficiency
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial optimal_trials = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Trial> getOptimalTrialsList();

  /**
   *
   *
   * <pre>
   * The pareto-optimal Trials for multiple objective Study or the
   * optimal trial for single objective Study. The definition of
   * pareto-optimal can be checked in wiki page.
   * https://en.wikipedia.org/wiki/Pareto_efficiency
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial optimal_trials = 1;</code>
   */
  com.google.cloud.aiplatform.v1.Trial getOptimalTrials(int index);

  /**
   *
   *
   * <pre>
   * The pareto-optimal Trials for multiple objective Study or the
   * optimal trial for single objective Study. The definition of
   * pareto-optimal can be checked in wiki page.
   * https://en.wikipedia.org/wiki/Pareto_efficiency
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial optimal_trials = 1;</code>
   */
  int getOptimalTrialsCount();

  /**
   *
   *
   * <pre>
   * The pareto-optimal Trials for multiple objective Study or the
   * optimal trial for single objective Study. The definition of
   * pareto-optimal can be checked in wiki page.
   * https://en.wikipedia.org/wiki/Pareto_efficiency
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial optimal_trials = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.TrialOrBuilder>
      getOptimalTrialsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The pareto-optimal Trials for multiple objective Study or the
   * optimal trial for single objective Study. The definition of
   * pareto-optimal can be checked in wiki page.
   * https://en.wikipedia.org/wiki/Pareto_efficiency
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial optimal_trials = 1;</code>
   */
  com.google.cloud.aiplatform.v1.TrialOrBuilder getOptimalTrialsOrBuilder(int index);
}
