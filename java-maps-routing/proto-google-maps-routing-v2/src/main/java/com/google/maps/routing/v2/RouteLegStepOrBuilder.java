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
// source: google/maps/routing/v2/route.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.routing.v2;

public interface RouteLegStepOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.routing.v2.RouteLegStep)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The travel distance of this step, in meters. In some circumstances, this
   * field might not have a value.
   * </pre>
   *
   * <code>int32 distance_meters = 1;</code>
   *
   * @return The distanceMeters.
   */
  int getDistanceMeters();

  /**
   *
   *
   * <pre>
   * The duration of travel through this step without taking traffic conditions
   * into consideration. In some circumstances, this field might not have a
   * value.
   * </pre>
   *
   * <code>.google.protobuf.Duration static_duration = 2;</code>
   *
   * @return Whether the staticDuration field is set.
   */
  boolean hasStaticDuration();

  /**
   *
   *
   * <pre>
   * The duration of travel through this step without taking traffic conditions
   * into consideration. In some circumstances, this field might not have a
   * value.
   * </pre>
   *
   * <code>.google.protobuf.Duration static_duration = 2;</code>
   *
   * @return The staticDuration.
   */
  com.google.protobuf.Duration getStaticDuration();

  /**
   *
   *
   * <pre>
   * The duration of travel through this step without taking traffic conditions
   * into consideration. In some circumstances, this field might not have a
   * value.
   * </pre>
   *
   * <code>.google.protobuf.Duration static_duration = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getStaticDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * The polyline associated with this step.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Polyline polyline = 3;</code>
   *
   * @return Whether the polyline field is set.
   */
  boolean hasPolyline();

  /**
   *
   *
   * <pre>
   * The polyline associated with this step.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Polyline polyline = 3;</code>
   *
   * @return The polyline.
   */
  com.google.maps.routing.v2.Polyline getPolyline();

  /**
   *
   *
   * <pre>
   * The polyline associated with this step.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Polyline polyline = 3;</code>
   */
  com.google.maps.routing.v2.PolylineOrBuilder getPolylineOrBuilder();

  /**
   *
   *
   * <pre>
   * The start location of this step.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Location start_location = 4;</code>
   *
   * @return Whether the startLocation field is set.
   */
  boolean hasStartLocation();

  /**
   *
   *
   * <pre>
   * The start location of this step.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Location start_location = 4;</code>
   *
   * @return The startLocation.
   */
  com.google.maps.routing.v2.Location getStartLocation();

  /**
   *
   *
   * <pre>
   * The start location of this step.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Location start_location = 4;</code>
   */
  com.google.maps.routing.v2.LocationOrBuilder getStartLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * The end location of this step.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Location end_location = 5;</code>
   *
   * @return Whether the endLocation field is set.
   */
  boolean hasEndLocation();

  /**
   *
   *
   * <pre>
   * The end location of this step.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Location end_location = 5;</code>
   *
   * @return The endLocation.
   */
  com.google.maps.routing.v2.Location getEndLocation();

  /**
   *
   *
   * <pre>
   * The end location of this step.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Location end_location = 5;</code>
   */
  com.google.maps.routing.v2.LocationOrBuilder getEndLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * Navigation instructions.
   * </pre>
   *
   * <code>.google.maps.routing.v2.NavigationInstruction navigation_instruction = 6;</code>
   *
   * @return Whether the navigationInstruction field is set.
   */
  boolean hasNavigationInstruction();

  /**
   *
   *
   * <pre>
   * Navigation instructions.
   * </pre>
   *
   * <code>.google.maps.routing.v2.NavigationInstruction navigation_instruction = 6;</code>
   *
   * @return The navigationInstruction.
   */
  com.google.maps.routing.v2.NavigationInstruction getNavigationInstruction();

  /**
   *
   *
   * <pre>
   * Navigation instructions.
   * </pre>
   *
   * <code>.google.maps.routing.v2.NavigationInstruction navigation_instruction = 6;</code>
   */
  com.google.maps.routing.v2.NavigationInstructionOrBuilder getNavigationInstructionOrBuilder();

  /**
   *
   *
   * <pre>
   * Contains the additional information that the user should be informed
   * about, such as possible traffic zone restrictions, on a leg step.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteLegStepTravelAdvisory travel_advisory = 7;</code>
   *
   * @return Whether the travelAdvisory field is set.
   */
  boolean hasTravelAdvisory();

  /**
   *
   *
   * <pre>
   * Contains the additional information that the user should be informed
   * about, such as possible traffic zone restrictions, on a leg step.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteLegStepTravelAdvisory travel_advisory = 7;</code>
   *
   * @return The travelAdvisory.
   */
  com.google.maps.routing.v2.RouteLegStepTravelAdvisory getTravelAdvisory();

  /**
   *
   *
   * <pre>
   * Contains the additional information that the user should be informed
   * about, such as possible traffic zone restrictions, on a leg step.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteLegStepTravelAdvisory travel_advisory = 7;</code>
   */
  com.google.maps.routing.v2.RouteLegStepTravelAdvisoryOrBuilder getTravelAdvisoryOrBuilder();

  /**
   *
   *
   * <pre>
   * Text representations of properties of the `RouteLegStep`.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteLegStep.RouteLegStepLocalizedValues localized_values = 8;
   * </code>
   *
   * @return Whether the localizedValues field is set.
   */
  boolean hasLocalizedValues();

  /**
   *
   *
   * <pre>
   * Text representations of properties of the `RouteLegStep`.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteLegStep.RouteLegStepLocalizedValues localized_values = 8;
   * </code>
   *
   * @return The localizedValues.
   */
  com.google.maps.routing.v2.RouteLegStep.RouteLegStepLocalizedValues getLocalizedValues();

  /**
   *
   *
   * <pre>
   * Text representations of properties of the `RouteLegStep`.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteLegStep.RouteLegStepLocalizedValues localized_values = 8;
   * </code>
   */
  com.google.maps.routing.v2.RouteLegStep.RouteLegStepLocalizedValuesOrBuilder
      getLocalizedValuesOrBuilder();

  /**
   *
   *
   * <pre>
   * Details pertaining to this step if the travel mode is `TRANSIT`.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteLegStepTransitDetails transit_details = 9;</code>
   *
   * @return Whether the transitDetails field is set.
   */
  boolean hasTransitDetails();

  /**
   *
   *
   * <pre>
   * Details pertaining to this step if the travel mode is `TRANSIT`.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteLegStepTransitDetails transit_details = 9;</code>
   *
   * @return The transitDetails.
   */
  com.google.maps.routing.v2.RouteLegStepTransitDetails getTransitDetails();

  /**
   *
   *
   * <pre>
   * Details pertaining to this step if the travel mode is `TRANSIT`.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteLegStepTransitDetails transit_details = 9;</code>
   */
  com.google.maps.routing.v2.RouteLegStepTransitDetailsOrBuilder getTransitDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * The travel mode used for this step.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteTravelMode travel_mode = 10;</code>
   *
   * @return The enum numeric value on the wire for travelMode.
   */
  int getTravelModeValue();

  /**
   *
   *
   * <pre>
   * The travel mode used for this step.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteTravelMode travel_mode = 10;</code>
   *
   * @return The travelMode.
   */
  com.google.maps.routing.v2.RouteTravelMode getTravelMode();
}
