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
// source: google/chat/v1/event_payload.proto

// Protobuf Java Version: 3.25.8
package com.google.chat.v1;

public interface MembershipBatchCreatedEventDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.MembershipBatchCreatedEventData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of new memberships.
   * </pre>
   *
   * <code>repeated .google.chat.v1.MembershipCreatedEventData memberships = 1;</code>
   */
  java.util.List<com.google.chat.v1.MembershipCreatedEventData> getMembershipsList();

  /**
   *
   *
   * <pre>
   * A list of new memberships.
   * </pre>
   *
   * <code>repeated .google.chat.v1.MembershipCreatedEventData memberships = 1;</code>
   */
  com.google.chat.v1.MembershipCreatedEventData getMemberships(int index);

  /**
   *
   *
   * <pre>
   * A list of new memberships.
   * </pre>
   *
   * <code>repeated .google.chat.v1.MembershipCreatedEventData memberships = 1;</code>
   */
  int getMembershipsCount();

  /**
   *
   *
   * <pre>
   * A list of new memberships.
   * </pre>
   *
   * <code>repeated .google.chat.v1.MembershipCreatedEventData memberships = 1;</code>
   */
  java.util.List<? extends com.google.chat.v1.MembershipCreatedEventDataOrBuilder>
      getMembershipsOrBuilderList();

  /**
   *
   *
   * <pre>
   * A list of new memberships.
   * </pre>
   *
   * <code>repeated .google.chat.v1.MembershipCreatedEventData memberships = 1;</code>
   */
  com.google.chat.v1.MembershipCreatedEventDataOrBuilder getMembershipsOrBuilder(int index);
}
