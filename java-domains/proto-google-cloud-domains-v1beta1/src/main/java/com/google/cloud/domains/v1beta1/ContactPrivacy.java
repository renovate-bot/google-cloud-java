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
// source: google/cloud/domains/v1beta1/domains.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.domains.v1beta1;

/**
 *
 *
 * <pre>
 * Defines a set of possible contact privacy settings for a `Registration`.
 *
 * [ICANN](https://icann.org/) maintains the WHOIS database, a publicly
 * accessible mapping from domain name to contact information, and requires that
 * each domain name have an entry. Choose from these options to control how much
 * information in your `ContactSettings` is published.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.domains.v1beta1.ContactPrivacy}
 */
public enum ContactPrivacy implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The contact privacy settings are undefined.
   * </pre>
   *
   * <code>CONTACT_PRIVACY_UNSPECIFIED = 0;</code>
   */
  CONTACT_PRIVACY_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * All the data from `ContactSettings` is publicly available. When setting
   * this option, you must also provide a
   * `PUBLIC_CONTACT_DATA_ACKNOWLEDGEMENT` in the `contact_notices` field of the
   * request.
   * </pre>
   *
   * <code>PUBLIC_CONTACT_DATA = 1;</code>
   */
  PUBLIC_CONTACT_DATA(1),
  /**
   *
   *
   * <pre>
   * None of the data from `ContactSettings` is publicly available. Instead,
   * proxy contact data is published for your domain. Email sent to the proxy
   * email address is forwarded to the registrant's email address. Cloud Domains
   * provides this privacy proxy service at no additional cost.
   * </pre>
   *
   * <code>PRIVATE_CONTACT_DATA = 2;</code>
   */
  PRIVATE_CONTACT_DATA(2),
  /**
   *
   *
   * <pre>
   * Some data from `ContactSettings` is publicly available. The actual
   * information redacted depends on the domain. For details, see [the
   * registration privacy
   * article](https://support.google.com/domains/answer/3251242).
   * </pre>
   *
   * <code>REDACTED_CONTACT_DATA = 3;</code>
   */
  REDACTED_CONTACT_DATA(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The contact privacy settings are undefined.
   * </pre>
   *
   * <code>CONTACT_PRIVACY_UNSPECIFIED = 0;</code>
   */
  public static final int CONTACT_PRIVACY_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * All the data from `ContactSettings` is publicly available. When setting
   * this option, you must also provide a
   * `PUBLIC_CONTACT_DATA_ACKNOWLEDGEMENT` in the `contact_notices` field of the
   * request.
   * </pre>
   *
   * <code>PUBLIC_CONTACT_DATA = 1;</code>
   */
  public static final int PUBLIC_CONTACT_DATA_VALUE = 1;

  /**
   *
   *
   * <pre>
   * None of the data from `ContactSettings` is publicly available. Instead,
   * proxy contact data is published for your domain. Email sent to the proxy
   * email address is forwarded to the registrant's email address. Cloud Domains
   * provides this privacy proxy service at no additional cost.
   * </pre>
   *
   * <code>PRIVATE_CONTACT_DATA = 2;</code>
   */
  public static final int PRIVATE_CONTACT_DATA_VALUE = 2;

  /**
   *
   *
   * <pre>
   * Some data from `ContactSettings` is publicly available. The actual
   * information redacted depends on the domain. For details, see [the
   * registration privacy
   * article](https://support.google.com/domains/answer/3251242).
   * </pre>
   *
   * <code>REDACTED_CONTACT_DATA = 3;</code>
   */
  public static final int REDACTED_CONTACT_DATA_VALUE = 3;

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
  public static ContactPrivacy valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ContactPrivacy forNumber(int value) {
    switch (value) {
      case 0:
        return CONTACT_PRIVACY_UNSPECIFIED;
      case 1:
        return PUBLIC_CONTACT_DATA;
      case 2:
        return PRIVATE_CONTACT_DATA;
      case 3:
        return REDACTED_CONTACT_DATA;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ContactPrivacy> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ContactPrivacy> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ContactPrivacy>() {
        public ContactPrivacy findValueByNumber(int number) {
          return ContactPrivacy.forNumber(number);
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
    return com.google.cloud.domains.v1beta1.DomainsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ContactPrivacy[] VALUES = values();

  public static ContactPrivacy valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ContactPrivacy(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.domains.v1beta1.ContactPrivacy)
}
