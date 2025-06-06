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
// source: google/chat/v1/space_notification_setting.proto

// Protobuf Java Version: 3.25.8
package com.google.chat.v1;

public interface SpaceNotificationSettingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.SpaceNotificationSetting)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the space notification setting.
   * Format: `users/{user}/spaces/{space}/spaceNotificationSetting`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the space notification setting.
   * Format: `users/{user}/spaces/{space}/spaceNotificationSetting`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The notification setting.
   * </pre>
   *
   * <code>
   * optional .google.chat.v1.SpaceNotificationSetting.NotificationSetting notification_setting = 2;
   * </code>
   *
   * @return Whether the notificationSetting field is set.
   */
  boolean hasNotificationSetting();

  /**
   *
   *
   * <pre>
   * The notification setting.
   * </pre>
   *
   * <code>
   * optional .google.chat.v1.SpaceNotificationSetting.NotificationSetting notification_setting = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for notificationSetting.
   */
  int getNotificationSettingValue();

  /**
   *
   *
   * <pre>
   * The notification setting.
   * </pre>
   *
   * <code>
   * optional .google.chat.v1.SpaceNotificationSetting.NotificationSetting notification_setting = 2;
   * </code>
   *
   * @return The notificationSetting.
   */
  com.google.chat.v1.SpaceNotificationSetting.NotificationSetting getNotificationSetting();

  /**
   *
   *
   * <pre>
   * The space notification mute setting.
   * </pre>
   *
   * <code>optional .google.chat.v1.SpaceNotificationSetting.MuteSetting mute_setting = 3;</code>
   *
   * @return Whether the muteSetting field is set.
   */
  boolean hasMuteSetting();

  /**
   *
   *
   * <pre>
   * The space notification mute setting.
   * </pre>
   *
   * <code>optional .google.chat.v1.SpaceNotificationSetting.MuteSetting mute_setting = 3;</code>
   *
   * @return The enum numeric value on the wire for muteSetting.
   */
  int getMuteSettingValue();

  /**
   *
   *
   * <pre>
   * The space notification mute setting.
   * </pre>
   *
   * <code>optional .google.chat.v1.SpaceNotificationSetting.MuteSetting mute_setting = 3;</code>
   *
   * @return The muteSetting.
   */
  com.google.chat.v1.SpaceNotificationSetting.MuteSetting getMuteSetting();
}
