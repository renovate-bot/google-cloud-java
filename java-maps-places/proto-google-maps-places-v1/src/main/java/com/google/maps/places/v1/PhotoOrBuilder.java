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
// source: google/maps/places/v1/photo.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.places.v1;

public interface PhotoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.places.v1.Photo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. A reference representing this place photo which may be used to
   * look up this place photo again (also called the API "resource" name:
   * `places/{place_id}/photos/{photo}`).
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
   * Identifier. A reference representing this place photo which may be used to
   * look up this place photo again (also called the API "resource" name:
   * `places/{place_id}/photos/{photo}`).
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
   * The maximum available width, in pixels.
   * </pre>
   *
   * <code>int32 width_px = 2;</code>
   *
   * @return The widthPx.
   */
  int getWidthPx();

  /**
   *
   *
   * <pre>
   * The maximum available height, in pixels.
   * </pre>
   *
   * <code>int32 height_px = 3;</code>
   *
   * @return The heightPx.
   */
  int getHeightPx();

  /**
   *
   *
   * <pre>
   * This photo's authors.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.AuthorAttribution author_attributions = 4;</code>
   */
  java.util.List<com.google.maps.places.v1.AuthorAttribution> getAuthorAttributionsList();

  /**
   *
   *
   * <pre>
   * This photo's authors.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.AuthorAttribution author_attributions = 4;</code>
   */
  com.google.maps.places.v1.AuthorAttribution getAuthorAttributions(int index);

  /**
   *
   *
   * <pre>
   * This photo's authors.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.AuthorAttribution author_attributions = 4;</code>
   */
  int getAuthorAttributionsCount();

  /**
   *
   *
   * <pre>
   * This photo's authors.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.AuthorAttribution author_attributions = 4;</code>
   */
  java.util.List<? extends com.google.maps.places.v1.AuthorAttributionOrBuilder>
      getAuthorAttributionsOrBuilderList();

  /**
   *
   *
   * <pre>
   * This photo's authors.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.AuthorAttribution author_attributions = 4;</code>
   */
  com.google.maps.places.v1.AuthorAttributionOrBuilder getAuthorAttributionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A link where users can flag a problem with the photo.
   * </pre>
   *
   * <code>string flag_content_uri = 5;</code>
   *
   * @return The flagContentUri.
   */
  java.lang.String getFlagContentUri();

  /**
   *
   *
   * <pre>
   * A link where users can flag a problem with the photo.
   * </pre>
   *
   * <code>string flag_content_uri = 5;</code>
   *
   * @return The bytes for flagContentUri.
   */
  com.google.protobuf.ByteString getFlagContentUriBytes();

  /**
   *
   *
   * <pre>
   * A link to show the photo on Google Maps.
   * </pre>
   *
   * <code>string google_maps_uri = 6;</code>
   *
   * @return The googleMapsUri.
   */
  java.lang.String getGoogleMapsUri();

  /**
   *
   *
   * <pre>
   * A link to show the photo on Google Maps.
   * </pre>
   *
   * <code>string google_maps_uri = 6;</code>
   *
   * @return The bytes for googleMapsUri.
   */
  com.google.protobuf.ByteString getGoogleMapsUriBytes();
}
