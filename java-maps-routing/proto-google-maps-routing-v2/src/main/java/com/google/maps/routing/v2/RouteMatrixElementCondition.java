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
// source: google/maps/routing/v2/routes_service.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.routing.v2;

/**
 *
 *
 * <pre>
 * The condition of the route being returned.
 * </pre>
 *
 * Protobuf enum {@code google.maps.routing.v2.RouteMatrixElementCondition}
 */
public enum RouteMatrixElementCondition implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Only used when the `status` of the element is not OK.
   * </pre>
   *
   * <code>ROUTE_MATRIX_ELEMENT_CONDITION_UNSPECIFIED = 0;</code>
   */
  ROUTE_MATRIX_ELEMENT_CONDITION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * A route was found, and the corresponding information was filled out for the
   * element.
   * </pre>
   *
   * <code>ROUTE_EXISTS = 1;</code>
   */
  ROUTE_EXISTS(1),
  /**
   *
   *
   * <pre>
   * No route could be found. Fields containing route information, such as
   * `distance_meters` or `duration`, will not be filled out in the element.
   * </pre>
   *
   * <code>ROUTE_NOT_FOUND = 2;</code>
   */
  ROUTE_NOT_FOUND(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Only used when the `status` of the element is not OK.
   * </pre>
   *
   * <code>ROUTE_MATRIX_ELEMENT_CONDITION_UNSPECIFIED = 0;</code>
   */
  public static final int ROUTE_MATRIX_ELEMENT_CONDITION_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * A route was found, and the corresponding information was filled out for the
   * element.
   * </pre>
   *
   * <code>ROUTE_EXISTS = 1;</code>
   */
  public static final int ROUTE_EXISTS_VALUE = 1;

  /**
   *
   *
   * <pre>
   * No route could be found. Fields containing route information, such as
   * `distance_meters` or `duration`, will not be filled out in the element.
   * </pre>
   *
   * <code>ROUTE_NOT_FOUND = 2;</code>
   */
  public static final int ROUTE_NOT_FOUND_VALUE = 2;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static RouteMatrixElementCondition valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RouteMatrixElementCondition forNumber(int value) {
    switch (value) {
      case 0:
        return ROUTE_MATRIX_ELEMENT_CONDITION_UNSPECIFIED;
      case 1:
        return ROUTE_EXISTS;
      case 2:
        return ROUTE_NOT_FOUND;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RouteMatrixElementCondition>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<RouteMatrixElementCondition>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RouteMatrixElementCondition>() {
            public RouteMatrixElementCondition findValueByNumber(int number) {
              return RouteMatrixElementCondition.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.maps.routing.v2.RoutesServiceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final RouteMatrixElementCondition[] VALUES = values();

  public static RouteMatrixElementCondition valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private RouteMatrixElementCondition(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.maps.routing.v2.RouteMatrixElementCondition)
}
