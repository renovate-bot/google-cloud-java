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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.8
package com.google.container.v1beta1;

public interface IstioConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.IstioConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether Istio is enabled for this cluster.
   * </pre>
   *
   * <code>bool disabled = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1beta1.IstioConfig.disabled is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=2198
   * @return The disabled.
   */
  @java.lang.Deprecated
  boolean getDisabled();

  /**
   *
   *
   * <pre>
   * The specified Istio auth mode, either none, or mutual TLS.
   * </pre>
   *
   * <code>.google.container.v1beta1.IstioConfig.IstioAuthMode auth = 2 [deprecated = true];</code>
   *
   * @deprecated google.container.v1beta1.IstioConfig.auth is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=2201
   * @return The enum numeric value on the wire for auth.
   */
  @java.lang.Deprecated
  int getAuthValue();

  /**
   *
   *
   * <pre>
   * The specified Istio auth mode, either none, or mutual TLS.
   * </pre>
   *
   * <code>.google.container.v1beta1.IstioConfig.IstioAuthMode auth = 2 [deprecated = true];</code>
   *
   * @deprecated google.container.v1beta1.IstioConfig.auth is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=2201
   * @return The auth.
   */
  @java.lang.Deprecated
  com.google.container.v1beta1.IstioConfig.IstioAuthMode getAuth();
}
