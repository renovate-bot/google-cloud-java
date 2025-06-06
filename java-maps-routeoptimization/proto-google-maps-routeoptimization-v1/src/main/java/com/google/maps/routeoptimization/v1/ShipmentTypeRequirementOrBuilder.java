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
// source: google/maps/routeoptimization/v1/route_optimization_service.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.routeoptimization.v1;

public interface ShipmentTypeRequirementOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.routeoptimization.v1.ShipmentTypeRequirement)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of alternative shipment types required by the
   * `dependent_shipment_types`.
   * </pre>
   *
   * <code>repeated string required_shipment_type_alternatives = 1;</code>
   *
   * @return A list containing the requiredShipmentTypeAlternatives.
   */
  java.util.List<java.lang.String> getRequiredShipmentTypeAlternativesList();

  /**
   *
   *
   * <pre>
   * List of alternative shipment types required by the
   * `dependent_shipment_types`.
   * </pre>
   *
   * <code>repeated string required_shipment_type_alternatives = 1;</code>
   *
   * @return The count of requiredShipmentTypeAlternatives.
   */
  int getRequiredShipmentTypeAlternativesCount();

  /**
   *
   *
   * <pre>
   * List of alternative shipment types required by the
   * `dependent_shipment_types`.
   * </pre>
   *
   * <code>repeated string required_shipment_type_alternatives = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The requiredShipmentTypeAlternatives at the given index.
   */
  java.lang.String getRequiredShipmentTypeAlternatives(int index);

  /**
   *
   *
   * <pre>
   * List of alternative shipment types required by the
   * `dependent_shipment_types`.
   * </pre>
   *
   * <code>repeated string required_shipment_type_alternatives = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the requiredShipmentTypeAlternatives at the given index.
   */
  com.google.protobuf.ByteString getRequiredShipmentTypeAlternativesBytes(int index);

  /**
   *
   *
   * <pre>
   * All shipments with a type in the `dependent_shipment_types` field require
   * at least one shipment of type `required_shipment_type_alternatives` to be
   * visited on the same route.
   *
   * NOTE: Chains of requirements such that a `shipment_type` depends on itself
   * are not allowed.
   * </pre>
   *
   * <code>repeated string dependent_shipment_types = 2;</code>
   *
   * @return A list containing the dependentShipmentTypes.
   */
  java.util.List<java.lang.String> getDependentShipmentTypesList();

  /**
   *
   *
   * <pre>
   * All shipments with a type in the `dependent_shipment_types` field require
   * at least one shipment of type `required_shipment_type_alternatives` to be
   * visited on the same route.
   *
   * NOTE: Chains of requirements such that a `shipment_type` depends on itself
   * are not allowed.
   * </pre>
   *
   * <code>repeated string dependent_shipment_types = 2;</code>
   *
   * @return The count of dependentShipmentTypes.
   */
  int getDependentShipmentTypesCount();

  /**
   *
   *
   * <pre>
   * All shipments with a type in the `dependent_shipment_types` field require
   * at least one shipment of type `required_shipment_type_alternatives` to be
   * visited on the same route.
   *
   * NOTE: Chains of requirements such that a `shipment_type` depends on itself
   * are not allowed.
   * </pre>
   *
   * <code>repeated string dependent_shipment_types = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The dependentShipmentTypes at the given index.
   */
  java.lang.String getDependentShipmentTypes(int index);

  /**
   *
   *
   * <pre>
   * All shipments with a type in the `dependent_shipment_types` field require
   * at least one shipment of type `required_shipment_type_alternatives` to be
   * visited on the same route.
   *
   * NOTE: Chains of requirements such that a `shipment_type` depends on itself
   * are not allowed.
   * </pre>
   *
   * <code>repeated string dependent_shipment_types = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the dependentShipmentTypes at the given index.
   */
  com.google.protobuf.ByteString getDependentShipmentTypesBytes(int index);

  /**
   *
   *
   * <pre>
   * Mode applied to the requirement.
   * </pre>
   *
   * <code>
   * .google.maps.routeoptimization.v1.ShipmentTypeRequirement.RequirementMode requirement_mode = 3;
   * </code>
   *
   * @return The enum numeric value on the wire for requirementMode.
   */
  int getRequirementModeValue();

  /**
   *
   *
   * <pre>
   * Mode applied to the requirement.
   * </pre>
   *
   * <code>
   * .google.maps.routeoptimization.v1.ShipmentTypeRequirement.RequirementMode requirement_mode = 3;
   * </code>
   *
   * @return The requirementMode.
   */
  com.google.maps.routeoptimization.v1.ShipmentTypeRequirement.RequirementMode getRequirementMode();
}
