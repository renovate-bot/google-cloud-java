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
// source: google/marketingplatform/admin/v1alpha/marketingplatform_admin.proto

// Protobuf Java Version: 3.25.8
package com.google.ads.marketingplatform.admin.v1alpha;

public interface ListAnalyticsAccountLinksResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.marketingplatform.admin.v1alpha.ListAnalyticsAccountLinksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Analytics account links in this organization.
   * </pre>
   *
   * <code>
   * repeated .google.marketingplatform.admin.v1alpha.AnalyticsAccountLink analytics_account_links = 1;
   * </code>
   */
  java.util.List<com.google.ads.marketingplatform.admin.v1alpha.AnalyticsAccountLink>
      getAnalyticsAccountLinksList();

  /**
   *
   *
   * <pre>
   * Analytics account links in this organization.
   * </pre>
   *
   * <code>
   * repeated .google.marketingplatform.admin.v1alpha.AnalyticsAccountLink analytics_account_links = 1;
   * </code>
   */
  com.google.ads.marketingplatform.admin.v1alpha.AnalyticsAccountLink getAnalyticsAccountLinks(
      int index);

  /**
   *
   *
   * <pre>
   * Analytics account links in this organization.
   * </pre>
   *
   * <code>
   * repeated .google.marketingplatform.admin.v1alpha.AnalyticsAccountLink analytics_account_links = 1;
   * </code>
   */
  int getAnalyticsAccountLinksCount();

  /**
   *
   *
   * <pre>
   * Analytics account links in this organization.
   * </pre>
   *
   * <code>
   * repeated .google.marketingplatform.admin.v1alpha.AnalyticsAccountLink analytics_account_links = 1;
   * </code>
   */
  java.util.List<
          ? extends com.google.ads.marketingplatform.admin.v1alpha.AnalyticsAccountLinkOrBuilder>
      getAnalyticsAccountLinksOrBuilderList();

  /**
   *
   *
   * <pre>
   * Analytics account links in this organization.
   * </pre>
   *
   * <code>
   * repeated .google.marketingplatform.admin.v1alpha.AnalyticsAccountLink analytics_account_links = 1;
   * </code>
   */
  com.google.ads.marketingplatform.admin.v1alpha.AnalyticsAccountLinkOrBuilder
      getAnalyticsAccountLinksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
