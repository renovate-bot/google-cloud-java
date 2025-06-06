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
// source: google/appengine/v1/appengine.proto

// Protobuf Java Version: 3.25.8
package com.google.appengine.v1;

public interface CreateDomainMappingRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.CreateDomainMappingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the parent Application resource. Example: `apps/myapp`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Name of the parent Application resource. Example: `apps/myapp`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Domain mapping configuration.
   * </pre>
   *
   * <code>.google.appengine.v1.DomainMapping domain_mapping = 2;</code>
   *
   * @return Whether the domainMapping field is set.
   */
  boolean hasDomainMapping();

  /**
   *
   *
   * <pre>
   * Domain mapping configuration.
   * </pre>
   *
   * <code>.google.appengine.v1.DomainMapping domain_mapping = 2;</code>
   *
   * @return The domainMapping.
   */
  com.google.appengine.v1.DomainMapping getDomainMapping();

  /**
   *
   *
   * <pre>
   * Domain mapping configuration.
   * </pre>
   *
   * <code>.google.appengine.v1.DomainMapping domain_mapping = 2;</code>
   */
  com.google.appengine.v1.DomainMappingOrBuilder getDomainMappingOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether the domain creation should override any existing mappings for this
   * domain. By default, overrides are rejected.
   * </pre>
   *
   * <code>.google.appengine.v1.DomainOverrideStrategy override_strategy = 4;</code>
   *
   * @return The enum numeric value on the wire for overrideStrategy.
   */
  int getOverrideStrategyValue();

  /**
   *
   *
   * <pre>
   * Whether the domain creation should override any existing mappings for this
   * domain. By default, overrides are rejected.
   * </pre>
   *
   * <code>.google.appengine.v1.DomainOverrideStrategy override_strategy = 4;</code>
   *
   * @return The overrideStrategy.
   */
  com.google.appengine.v1.DomainOverrideStrategy getOverrideStrategy();
}
