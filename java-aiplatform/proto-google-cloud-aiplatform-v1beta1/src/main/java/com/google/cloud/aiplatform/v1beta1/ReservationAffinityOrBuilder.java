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
// source: google/cloud/aiplatform/v1beta1/reservation_affinity.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface ReservationAffinityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ReservationAffinity)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Specifies the reservation affinity type.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ReservationAffinity.Type reservation_affinity_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for reservationAffinityType.
   */
  int getReservationAffinityTypeValue();

  /**
   *
   *
   * <pre>
   * Required. Specifies the reservation affinity type.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ReservationAffinity.Type reservation_affinity_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The reservationAffinityType.
   */
  com.google.cloud.aiplatform.v1beta1.ReservationAffinity.Type getReservationAffinityType();

  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label key of a reservation resource. To target
   * a SPECIFIC_RESERVATION by name, use
   * `compute.googleapis.com/reservation-name` as the key and specify the name
   * of your reservation as its value.
   * </pre>
   *
   * <code>string key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The key.
   */
  java.lang.String getKey();

  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label key of a reservation resource. To target
   * a SPECIFIC_RESERVATION by name, use
   * `compute.googleapis.com/reservation-name` as the key and specify the name
   * of your reservation as its value.
   * </pre>
   *
   * <code>string key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString getKeyBytes();

  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label values of a reservation resource. This
   * must be the full resource name of the reservation.
   * </pre>
   *
   * <code>
   * repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the values.
   */
  java.util.List<java.lang.String> getValuesList();

  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label values of a reservation resource. This
   * must be the full resource name of the reservation.
   * </pre>
   *
   * <code>
   * repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of values.
   */
  int getValuesCount();

  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label values of a reservation resource. This
   * must be the full resource name of the reservation.
   * </pre>
   *
   * <code>
   * repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  java.lang.String getValues(int index);

  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label values of a reservation resource. This
   * must be the full resource name of the reservation.
   * </pre>
   *
   * <code>
   * repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  com.google.protobuf.ByteString getValuesBytes(int index);
}
