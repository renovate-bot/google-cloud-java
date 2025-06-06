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
// source: google/maps/areainsights/v1/area_insights_service.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.areainsights.v1;

/**
 *
 *
 * <pre>
 * Supported insights.
 * </pre>
 *
 * Protobuf enum {@code google.maps.areainsights.v1.Insight}
 */
public enum Insight implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not Specified.
   * </pre>
   *
   * <code>INSIGHT_UNSPECIFIED = 0;</code>
   */
  INSIGHT_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Count insight.
   *
   * When this insight is specified ComputeInsights returns the number of
   * places that match the specified filter criteria.
   *
   * Example request:
   * ```
   * {
   *   "insights": ["INSIGHT_COUNT"],
   *   "filter": {
   *     "locationFilter": {
   *       "region": {
   *         "place": "places/ChIJPV4oX_65j4ARVW8IJ6IJUYs"
   *       }
   *     },
   *     "typeFilter": {
   *       "includedTypes": ["restaurant"]
   *     },
   *     "operatingStatus": ["OPERATING_STATUS_OPERATIONAL"],
   *     "priceLevels": [
   *       "PRICE_LEVEL_FREE",
   *       "PRICE_LEVEL_INEXPENSIVE"
   *     ],
   *     "ratingFilter": {
   *       "minRating": 4.0
   *     }
   *   }
   * }
   * ```
   *
   * Example response:
   * ```
   * {
   *   "count": 1234
   * }
   * ```
   * </pre>
   *
   * <code>INSIGHT_COUNT = 1;</code>
   */
  INSIGHT_COUNT(1),
  /**
   *
   *
   * <pre>
   * Return Places
   *
   * When this insight is specified ComputeInsights returns places IDs
   * that match the specified filter criteria.
   *
   * Example request:
   * ```
   * {
   *   "insights": ["INSIGHT_PLACES"],
   *   "filter": {
   *     "locationFilter": {
   *       "region": {
   *         "place": "places/ChIJPV4oX_65j4ARVW8IJ6IJUYs"
   *       }
   *     },
   *     "typeFilter": {
   *       "includedTypes": ["restaurant"]
   *     },
   *     "operatingStatus": ["OPERATING_STATUS_OPERATIONAL"],
   *     "priceLevels": [
   *       "PRICE_LEVEL_FREE",
   *       "PRICE_LEVEL_INEXPENSIVE"
   *     ],
   *     "ratingFilter": {
   *       "minRating": 4.0
   *     }
   *   }
   * }
   * ```
   *
   * Example response:
   * ```
   * {
   *   "placeInsights": [
   *     {"place": "places/ABC"},
   *     {"place": "places/PQR"},
   *     {"place": "places/XYZ"}
   *   ]
   * }
   * ```
   * </pre>
   *
   * <code>INSIGHT_PLACES = 2;</code>
   */
  INSIGHT_PLACES(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not Specified.
   * </pre>
   *
   * <code>INSIGHT_UNSPECIFIED = 0;</code>
   */
  public static final int INSIGHT_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Count insight.
   *
   * When this insight is specified ComputeInsights returns the number of
   * places that match the specified filter criteria.
   *
   * Example request:
   * ```
   * {
   *   "insights": ["INSIGHT_COUNT"],
   *   "filter": {
   *     "locationFilter": {
   *       "region": {
   *         "place": "places/ChIJPV4oX_65j4ARVW8IJ6IJUYs"
   *       }
   *     },
   *     "typeFilter": {
   *       "includedTypes": ["restaurant"]
   *     },
   *     "operatingStatus": ["OPERATING_STATUS_OPERATIONAL"],
   *     "priceLevels": [
   *       "PRICE_LEVEL_FREE",
   *       "PRICE_LEVEL_INEXPENSIVE"
   *     ],
   *     "ratingFilter": {
   *       "minRating": 4.0
   *     }
   *   }
   * }
   * ```
   *
   * Example response:
   * ```
   * {
   *   "count": 1234
   * }
   * ```
   * </pre>
   *
   * <code>INSIGHT_COUNT = 1;</code>
   */
  public static final int INSIGHT_COUNT_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Return Places
   *
   * When this insight is specified ComputeInsights returns places IDs
   * that match the specified filter criteria.
   *
   * Example request:
   * ```
   * {
   *   "insights": ["INSIGHT_PLACES"],
   *   "filter": {
   *     "locationFilter": {
   *       "region": {
   *         "place": "places/ChIJPV4oX_65j4ARVW8IJ6IJUYs"
   *       }
   *     },
   *     "typeFilter": {
   *       "includedTypes": ["restaurant"]
   *     },
   *     "operatingStatus": ["OPERATING_STATUS_OPERATIONAL"],
   *     "priceLevels": [
   *       "PRICE_LEVEL_FREE",
   *       "PRICE_LEVEL_INEXPENSIVE"
   *     ],
   *     "ratingFilter": {
   *       "minRating": 4.0
   *     }
   *   }
   * }
   * ```
   *
   * Example response:
   * ```
   * {
   *   "placeInsights": [
   *     {"place": "places/ABC"},
   *     {"place": "places/PQR"},
   *     {"place": "places/XYZ"}
   *   ]
   * }
   * ```
   * </pre>
   *
   * <code>INSIGHT_PLACES = 2;</code>
   */
  public static final int INSIGHT_PLACES_VALUE = 2;

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
  public static Insight valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Insight forNumber(int value) {
    switch (value) {
      case 0:
        return INSIGHT_UNSPECIFIED;
      case 1:
        return INSIGHT_COUNT;
      case 2:
        return INSIGHT_PLACES;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Insight> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<Insight> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<Insight>() {
        public Insight findValueByNumber(int number) {
          return Insight.forNumber(number);
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
    return com.google.maps.areainsights.v1.AreaInsightsServiceProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final Insight[] VALUES = values();

  public static Insight valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Insight(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.maps.areainsights.v1.Insight)
}
