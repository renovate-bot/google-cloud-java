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
// source: google/maps/places/v1/ev_charging.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.places.v1;

/**
 *
 *
 * <pre>
 * See http://ieeexplore.ieee.org/stamp/stamp.jsp?arnumber=6872107 for
 * additional information/context on EV charging connector types.
 * </pre>
 *
 * Protobuf enum {@code google.maps.places.v1.EVConnectorType}
 */
public enum EVConnectorType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified connector.
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_UNSPECIFIED = 0;</code>
   */
  EV_CONNECTOR_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Other connector types.
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_OTHER = 1;</code>
   */
  EV_CONNECTOR_TYPE_OTHER(1),
  /**
   *
   *
   * <pre>
   * J1772 type 1 connector.
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_J1772 = 2;</code>
   */
  EV_CONNECTOR_TYPE_J1772(2),
  /**
   *
   *
   * <pre>
   * IEC 62196 type 2 connector. Often referred to as MENNEKES.
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_TYPE_2 = 3;</code>
   */
  EV_CONNECTOR_TYPE_TYPE_2(3),
  /**
   *
   *
   * <pre>
   * CHAdeMO type connector.
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_CHADEMO = 4;</code>
   */
  EV_CONNECTOR_TYPE_CHADEMO(4),
  /**
   *
   *
   * <pre>
   * Combined Charging System (AC and DC). Based on SAE.
   *  Type-1 J-1772 connector
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_CCS_COMBO_1 = 5;</code>
   */
  EV_CONNECTOR_TYPE_CCS_COMBO_1(5),
  /**
   *
   *
   * <pre>
   * Combined Charging System (AC and DC). Based on Type-2
   * Mennekes connector
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_CCS_COMBO_2 = 6;</code>
   */
  EV_CONNECTOR_TYPE_CCS_COMBO_2(6),
  /**
   *
   *
   * <pre>
   * The generic TESLA connector. This is NACS in the North America but can be
   * non-NACS in other parts of the world (e.g. CCS Combo 2 (CCS2) or GB/T).
   * This value is less representative of an actual connector type, and more
   * represents the ability to charge a Tesla brand vehicle at a Tesla owned
   * charging station.
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_TESLA = 7;</code>
   */
  EV_CONNECTOR_TYPE_TESLA(7),
  /**
   *
   *
   * <pre>
   * GB/T type corresponds to the GB/T standard in China. This type covers all
   * GB_T types.
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T = 8;</code>
   */
  EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T(8),
  /**
   *
   *
   * <pre>
   * Unspecified wall outlet.
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET = 9;</code>
   */
  EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET(9),
  /**
   *
   *
   * <pre>
   * The North American Charging System (NACS), standardized as SAE J3400.
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_NACS = 10;</code>
   */
  EV_CONNECTOR_TYPE_NACS(10),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified connector.
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int EV_CONNECTOR_TYPE_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Other connector types.
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_OTHER = 1;</code>
   */
  public static final int EV_CONNECTOR_TYPE_OTHER_VALUE = 1;

  /**
   *
   *
   * <pre>
   * J1772 type 1 connector.
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_J1772 = 2;</code>
   */
  public static final int EV_CONNECTOR_TYPE_J1772_VALUE = 2;

  /**
   *
   *
   * <pre>
   * IEC 62196 type 2 connector. Often referred to as MENNEKES.
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_TYPE_2 = 3;</code>
   */
  public static final int EV_CONNECTOR_TYPE_TYPE_2_VALUE = 3;

  /**
   *
   *
   * <pre>
   * CHAdeMO type connector.
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_CHADEMO = 4;</code>
   */
  public static final int EV_CONNECTOR_TYPE_CHADEMO_VALUE = 4;

  /**
   *
   *
   * <pre>
   * Combined Charging System (AC and DC). Based on SAE.
   *  Type-1 J-1772 connector
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_CCS_COMBO_1 = 5;</code>
   */
  public static final int EV_CONNECTOR_TYPE_CCS_COMBO_1_VALUE = 5;

  /**
   *
   *
   * <pre>
   * Combined Charging System (AC and DC). Based on Type-2
   * Mennekes connector
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_CCS_COMBO_2 = 6;</code>
   */
  public static final int EV_CONNECTOR_TYPE_CCS_COMBO_2_VALUE = 6;

  /**
   *
   *
   * <pre>
   * The generic TESLA connector. This is NACS in the North America but can be
   * non-NACS in other parts of the world (e.g. CCS Combo 2 (CCS2) or GB/T).
   * This value is less representative of an actual connector type, and more
   * represents the ability to charge a Tesla brand vehicle at a Tesla owned
   * charging station.
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_TESLA = 7;</code>
   */
  public static final int EV_CONNECTOR_TYPE_TESLA_VALUE = 7;

  /**
   *
   *
   * <pre>
   * GB/T type corresponds to the GB/T standard in China. This type covers all
   * GB_T types.
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T = 8;</code>
   */
  public static final int EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T_VALUE = 8;

  /**
   *
   *
   * <pre>
   * Unspecified wall outlet.
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET = 9;</code>
   */
  public static final int EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET_VALUE = 9;

  /**
   *
   *
   * <pre>
   * The North American Charging System (NACS), standardized as SAE J3400.
   * </pre>
   *
   * <code>EV_CONNECTOR_TYPE_NACS = 10;</code>
   */
  public static final int EV_CONNECTOR_TYPE_NACS_VALUE = 10;

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
  public static EVConnectorType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EVConnectorType forNumber(int value) {
    switch (value) {
      case 0:
        return EV_CONNECTOR_TYPE_UNSPECIFIED;
      case 1:
        return EV_CONNECTOR_TYPE_OTHER;
      case 2:
        return EV_CONNECTOR_TYPE_J1772;
      case 3:
        return EV_CONNECTOR_TYPE_TYPE_2;
      case 4:
        return EV_CONNECTOR_TYPE_CHADEMO;
      case 5:
        return EV_CONNECTOR_TYPE_CCS_COMBO_1;
      case 6:
        return EV_CONNECTOR_TYPE_CCS_COMBO_2;
      case 7:
        return EV_CONNECTOR_TYPE_TESLA;
      case 8:
        return EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T;
      case 9:
        return EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;
      case 10:
        return EV_CONNECTOR_TYPE_NACS;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EVConnectorType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<EVConnectorType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<EVConnectorType>() {
        public EVConnectorType findValueByNumber(int number) {
          return EVConnectorType.forNumber(number);
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
    return com.google.maps.places.v1.EvChargingProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final EVConnectorType[] VALUES = values();

  public static EVConnectorType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private EVConnectorType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.maps.places.v1.EVConnectorType)
}
