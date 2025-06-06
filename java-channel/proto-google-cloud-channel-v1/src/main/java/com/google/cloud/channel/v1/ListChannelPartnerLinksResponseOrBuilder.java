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
// source: google/cloud/channel/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.channel.v1;

public interface ListChannelPartnerLinksResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ListChannelPartnerLinksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Channel partner links for a reseller.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
   */
  java.util.List<com.google.cloud.channel.v1.ChannelPartnerLink> getChannelPartnerLinksList();

  /**
   *
   *
   * <pre>
   * The Channel partner links for a reseller.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
   */
  com.google.cloud.channel.v1.ChannelPartnerLink getChannelPartnerLinks(int index);

  /**
   *
   *
   * <pre>
   * The Channel partner links for a reseller.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
   */
  int getChannelPartnerLinksCount();

  /**
   *
   *
   * <pre>
   * The Channel partner links for a reseller.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
   */
  java.util.List<? extends com.google.cloud.channel.v1.ChannelPartnerLinkOrBuilder>
      getChannelPartnerLinksOrBuilderList();

  /**
   *
   *
   * <pre>
   * The Channel partner links for a reseller.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
   */
  com.google.cloud.channel.v1.ChannelPartnerLinkOrBuilder getChannelPartnerLinksOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListChannelPartnerLinksRequest.page_token][google.cloud.channel.v1.ListChannelPartnerLinksRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();

  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListChannelPartnerLinksRequest.page_token][google.cloud.channel.v1.ListChannelPartnerLinksRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
