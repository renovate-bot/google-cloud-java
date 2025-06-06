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
// source: google/maps/places/v1/address_descriptor.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.places.v1;

public interface AddressDescriptorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.places.v1.AddressDescriptor)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A ranked list of nearby landmarks. The most recognizable and nearby
   * landmarks are ranked first.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.AddressDescriptor.Landmark landmarks = 1;</code>
   */
  java.util.List<com.google.maps.places.v1.AddressDescriptor.Landmark> getLandmarksList();

  /**
   *
   *
   * <pre>
   * A ranked list of nearby landmarks. The most recognizable and nearby
   * landmarks are ranked first.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.AddressDescriptor.Landmark landmarks = 1;</code>
   */
  com.google.maps.places.v1.AddressDescriptor.Landmark getLandmarks(int index);

  /**
   *
   *
   * <pre>
   * A ranked list of nearby landmarks. The most recognizable and nearby
   * landmarks are ranked first.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.AddressDescriptor.Landmark landmarks = 1;</code>
   */
  int getLandmarksCount();

  /**
   *
   *
   * <pre>
   * A ranked list of nearby landmarks. The most recognizable and nearby
   * landmarks are ranked first.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.AddressDescriptor.Landmark landmarks = 1;</code>
   */
  java.util.List<? extends com.google.maps.places.v1.AddressDescriptor.LandmarkOrBuilder>
      getLandmarksOrBuilderList();

  /**
   *
   *
   * <pre>
   * A ranked list of nearby landmarks. The most recognizable and nearby
   * landmarks are ranked first.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.AddressDescriptor.Landmark landmarks = 1;</code>
   */
  com.google.maps.places.v1.AddressDescriptor.LandmarkOrBuilder getLandmarksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A ranked list of containing or adjacent areas. The most recognizable and
   * precise areas are ranked first.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.AddressDescriptor.Area areas = 2;</code>
   */
  java.util.List<com.google.maps.places.v1.AddressDescriptor.Area> getAreasList();

  /**
   *
   *
   * <pre>
   * A ranked list of containing or adjacent areas. The most recognizable and
   * precise areas are ranked first.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.AddressDescriptor.Area areas = 2;</code>
   */
  com.google.maps.places.v1.AddressDescriptor.Area getAreas(int index);

  /**
   *
   *
   * <pre>
   * A ranked list of containing or adjacent areas. The most recognizable and
   * precise areas are ranked first.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.AddressDescriptor.Area areas = 2;</code>
   */
  int getAreasCount();

  /**
   *
   *
   * <pre>
   * A ranked list of containing or adjacent areas. The most recognizable and
   * precise areas are ranked first.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.AddressDescriptor.Area areas = 2;</code>
   */
  java.util.List<? extends com.google.maps.places.v1.AddressDescriptor.AreaOrBuilder>
      getAreasOrBuilderList();

  /**
   *
   *
   * <pre>
   * A ranked list of containing or adjacent areas. The most recognizable and
   * precise areas are ranked first.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.AddressDescriptor.Area areas = 2;</code>
   */
  com.google.maps.places.v1.AddressDescriptor.AreaOrBuilder getAreasOrBuilder(int index);
}
