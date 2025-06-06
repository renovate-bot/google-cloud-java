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
// source: google/cloud/discoveryengine/v1/search_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1;

public interface SearchResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.SearchResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of matched documents. The order represents the ranking.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.SearchResult results = 1;</code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1.SearchResponse.SearchResult> getResultsList();

  /**
   *
   *
   * <pre>
   * A list of matched documents. The order represents the ranking.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.SearchResult results = 1;</code>
   */
  com.google.cloud.discoveryengine.v1.SearchResponse.SearchResult getResults(int index);

  /**
   *
   *
   * <pre>
   * A list of matched documents. The order represents the ranking.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.SearchResult results = 1;</code>
   */
  int getResultsCount();

  /**
   *
   *
   * <pre>
   * A list of matched documents. The order represents the ranking.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.SearchResult results = 1;</code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1.SearchResponse.SearchResultOrBuilder>
      getResultsOrBuilderList();

  /**
   *
   *
   * <pre>
   * A list of matched documents. The order represents the ranking.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.SearchResult results = 1;</code>
   */
  com.google.cloud.discoveryengine.v1.SearchResponse.SearchResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Results of facets requested by user.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.Facet facets = 2;</code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1.SearchResponse.Facet> getFacetsList();

  /**
   *
   *
   * <pre>
   * Results of facets requested by user.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.Facet facets = 2;</code>
   */
  com.google.cloud.discoveryengine.v1.SearchResponse.Facet getFacets(int index);

  /**
   *
   *
   * <pre>
   * Results of facets requested by user.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.Facet facets = 2;</code>
   */
  int getFacetsCount();

  /**
   *
   *
   * <pre>
   * Results of facets requested by user.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.Facet facets = 2;</code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1.SearchResponse.FacetOrBuilder>
      getFacetsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Results of facets requested by user.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.Facet facets = 2;</code>
   */
  com.google.cloud.discoveryengine.v1.SearchResponse.FacetOrBuilder getFacetsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The estimated total count of matched items irrespective of pagination. The
   * count of [results][google.cloud.discoveryengine.v1.SearchResponse.results]
   * returned by pagination may be less than the
   * [total_size][google.cloud.discoveryengine.v1.SearchResponse.total_size]
   * that matches.
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   *
   * @return The totalSize.
   */
  int getTotalSize();

  /**
   *
   *
   * <pre>
   * A unique search token. This should be included in the
   * [UserEvent][google.cloud.discoveryengine.v1.UserEvent] logs resulting from
   * this search, which enables accurate attribution of search model
   * performance. This also helps to identify a request during the customer
   * support scenarios.
   * </pre>
   *
   * <code>string attribution_token = 4;</code>
   *
   * @return The attributionToken.
   */
  java.lang.String getAttributionToken();

  /**
   *
   *
   * <pre>
   * A unique search token. This should be included in the
   * [UserEvent][google.cloud.discoveryengine.v1.UserEvent] logs resulting from
   * this search, which enables accurate attribution of search model
   * performance. This also helps to identify a request during the customer
   * support scenarios.
   * </pre>
   *
   * <code>string attribution_token = 4;</code>
   *
   * @return The bytes for attributionToken.
   */
  com.google.protobuf.ByteString getAttributionTokenBytes();

  /**
   *
   *
   * <pre>
   * The URI of a customer-defined redirect page. If redirect action is
   * triggered, no search is performed, and only
   * [redirect_uri][google.cloud.discoveryengine.v1.SearchResponse.redirect_uri]
   * and
   * [attribution_token][google.cloud.discoveryengine.v1.SearchResponse.attribution_token]
   * are set in the response.
   * </pre>
   *
   * <code>string redirect_uri = 12;</code>
   *
   * @return The redirectUri.
   */
  java.lang.String getRedirectUri();

  /**
   *
   *
   * <pre>
   * The URI of a customer-defined redirect page. If redirect action is
   * triggered, no search is performed, and only
   * [redirect_uri][google.cloud.discoveryengine.v1.SearchResponse.redirect_uri]
   * and
   * [attribution_token][google.cloud.discoveryengine.v1.SearchResponse.attribution_token]
   * are set in the response.
   * </pre>
   *
   * <code>string redirect_uri = 12;</code>
   *
   * @return The bytes for redirectUri.
   */
  com.google.protobuf.ByteString getRedirectUriBytes();

  /**
   *
   *
   * <pre>
   * A token that can be sent as
   * [SearchRequest.page_token][google.cloud.discoveryengine.v1.SearchRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 5;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();

  /**
   *
   *
   * <pre>
   * A token that can be sent as
   * [SearchRequest.page_token][google.cloud.discoveryengine.v1.SearchRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 5;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Contains the spell corrected query, if found. If the spell correction type
   * is AUTOMATIC, then the search results are based on corrected_query.
   * Otherwise the original query is used for search.
   * </pre>
   *
   * <code>string corrected_query = 7;</code>
   *
   * @return The correctedQuery.
   */
  java.lang.String getCorrectedQuery();

  /**
   *
   *
   * <pre>
   * Contains the spell corrected query, if found. If the spell correction type
   * is AUTOMATIC, then the search results are based on corrected_query.
   * Otherwise the original query is used for search.
   * </pre>
   *
   * <code>string corrected_query = 7;</code>
   *
   * @return The bytes for correctedQuery.
   */
  com.google.protobuf.ByteString getCorrectedQueryBytes();

  /**
   *
   *
   * <pre>
   * A summary as part of the search results.
   * This field is only returned if
   * [SearchRequest.ContentSearchSpec.summary_spec][google.cloud.discoveryengine.v1.SearchRequest.ContentSearchSpec.summary_spec]
   * is set.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.SearchResponse.Summary summary = 9;</code>
   *
   * @return Whether the summary field is set.
   */
  boolean hasSummary();

  /**
   *
   *
   * <pre>
   * A summary as part of the search results.
   * This field is only returned if
   * [SearchRequest.ContentSearchSpec.summary_spec][google.cloud.discoveryengine.v1.SearchRequest.ContentSearchSpec.summary_spec]
   * is set.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.SearchResponse.Summary summary = 9;</code>
   *
   * @return The summary.
   */
  com.google.cloud.discoveryengine.v1.SearchResponse.Summary getSummary();

  /**
   *
   *
   * <pre>
   * A summary as part of the search results.
   * This field is only returned if
   * [SearchRequest.ContentSearchSpec.summary_spec][google.cloud.discoveryengine.v1.SearchRequest.ContentSearchSpec.summary_spec]
   * is set.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.SearchResponse.Summary summary = 9;</code>
   */
  com.google.cloud.discoveryengine.v1.SearchResponse.SummaryOrBuilder getSummaryOrBuilder();

  /**
   *
   *
   * <pre>
   * Query expansion information for the returned results.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.SearchResponse.QueryExpansionInfo query_expansion_info = 14;
   * </code>
   *
   * @return Whether the queryExpansionInfo field is set.
   */
  boolean hasQueryExpansionInfo();

  /**
   *
   *
   * <pre>
   * Query expansion information for the returned results.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.SearchResponse.QueryExpansionInfo query_expansion_info = 14;
   * </code>
   *
   * @return The queryExpansionInfo.
   */
  com.google.cloud.discoveryengine.v1.SearchResponse.QueryExpansionInfo getQueryExpansionInfo();

  /**
   *
   *
   * <pre>
   * Query expansion information for the returned results.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.SearchResponse.QueryExpansionInfo query_expansion_info = 14;
   * </code>
   */
  com.google.cloud.discoveryengine.v1.SearchResponse.QueryExpansionInfoOrBuilder
      getQueryExpansionInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Session information.
   *
   * Only set if
   * [SearchRequest.session][google.cloud.discoveryengine.v1.SearchRequest.session]
   * is provided. See its description for more details.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.SearchResponse.SessionInfo session_info = 19;</code>
   *
   * @return Whether the sessionInfo field is set.
   */
  boolean hasSessionInfo();

  /**
   *
   *
   * <pre>
   * Session information.
   *
   * Only set if
   * [SearchRequest.session][google.cloud.discoveryengine.v1.SearchRequest.session]
   * is provided. See its description for more details.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.SearchResponse.SessionInfo session_info = 19;</code>
   *
   * @return The sessionInfo.
   */
  com.google.cloud.discoveryengine.v1.SearchResponse.SessionInfo getSessionInfo();

  /**
   *
   *
   * <pre>
   * Session information.
   *
   * Only set if
   * [SearchRequest.session][google.cloud.discoveryengine.v1.SearchRequest.session]
   * is provided. See its description for more details.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.SearchResponse.SessionInfo session_info = 19;</code>
   */
  com.google.cloud.discoveryengine.v1.SearchResponse.SessionInfoOrBuilder getSessionInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Promotions for site search.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1.SearchLinkPromotion search_link_promotions = 23;
   * </code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1.SearchLinkPromotion>
      getSearchLinkPromotionsList();

  /**
   *
   *
   * <pre>
   * Promotions for site search.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1.SearchLinkPromotion search_link_promotions = 23;
   * </code>
   */
  com.google.cloud.discoveryengine.v1.SearchLinkPromotion getSearchLinkPromotions(int index);

  /**
   *
   *
   * <pre>
   * Promotions for site search.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1.SearchLinkPromotion search_link_promotions = 23;
   * </code>
   */
  int getSearchLinkPromotionsCount();

  /**
   *
   *
   * <pre>
   * Promotions for site search.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1.SearchLinkPromotion search_link_promotions = 23;
   * </code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1.SearchLinkPromotionOrBuilder>
      getSearchLinkPromotionsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Promotions for site search.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1.SearchLinkPromotion search_link_promotions = 23;
   * </code>
   */
  com.google.cloud.discoveryengine.v1.SearchLinkPromotionOrBuilder getSearchLinkPromotionsOrBuilder(
      int index);
}
