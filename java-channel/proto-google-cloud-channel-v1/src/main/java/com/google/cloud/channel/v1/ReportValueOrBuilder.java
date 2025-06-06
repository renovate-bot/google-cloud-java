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
// source: google/cloud/channel/v1/reports_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.channel.v1;

@java.lang.Deprecated
public interface ReportValueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ReportValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A value of type `string`.
   * </pre>
   *
   * <code>string string_value = 1;</code>
   *
   * @return Whether the stringValue field is set.
   */
  boolean hasStringValue();

  /**
   *
   *
   * <pre>
   * A value of type `string`.
   * </pre>
   *
   * <code>string string_value = 1;</code>
   *
   * @return The stringValue.
   */
  java.lang.String getStringValue();

  /**
   *
   *
   * <pre>
   * A value of type `string`.
   * </pre>
   *
   * <code>string string_value = 1;</code>
   *
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString getStringValueBytes();

  /**
   *
   *
   * <pre>
   * A value of type `int`.
   * </pre>
   *
   * <code>int64 int_value = 2;</code>
   *
   * @return Whether the intValue field is set.
   */
  boolean hasIntValue();

  /**
   *
   *
   * <pre>
   * A value of type `int`.
   * </pre>
   *
   * <code>int64 int_value = 2;</code>
   *
   * @return The intValue.
   */
  long getIntValue();

  /**
   *
   *
   * <pre>
   * A value of type `google.type.Decimal`, representing non-integer numeric
   * values.
   * </pre>
   *
   * <code>.google.type.Decimal decimal_value = 3;</code>
   *
   * @return Whether the decimalValue field is set.
   */
  boolean hasDecimalValue();

  /**
   *
   *
   * <pre>
   * A value of type `google.type.Decimal`, representing non-integer numeric
   * values.
   * </pre>
   *
   * <code>.google.type.Decimal decimal_value = 3;</code>
   *
   * @return The decimalValue.
   */
  com.google.type.Decimal getDecimalValue();

  /**
   *
   *
   * <pre>
   * A value of type `google.type.Decimal`, representing non-integer numeric
   * values.
   * </pre>
   *
   * <code>.google.type.Decimal decimal_value = 3;</code>
   */
  com.google.type.DecimalOrBuilder getDecimalValueOrBuilder();

  /**
   *
   *
   * <pre>
   * A value of type `google.type.Money` (currency code, whole units, decimal
   * units).
   * </pre>
   *
   * <code>.google.type.Money money_value = 4;</code>
   *
   * @return Whether the moneyValue field is set.
   */
  boolean hasMoneyValue();

  /**
   *
   *
   * <pre>
   * A value of type `google.type.Money` (currency code, whole units, decimal
   * units).
   * </pre>
   *
   * <code>.google.type.Money money_value = 4;</code>
   *
   * @return The moneyValue.
   */
  com.google.type.Money getMoneyValue();

  /**
   *
   *
   * <pre>
   * A value of type `google.type.Money` (currency code, whole units, decimal
   * units).
   * </pre>
   *
   * <code>.google.type.Money money_value = 4;</code>
   */
  com.google.type.MoneyOrBuilder getMoneyValueOrBuilder();

  /**
   *
   *
   * <pre>
   * A value of type `google.type.Date` (year, month, day).
   * </pre>
   *
   * <code>.google.type.Date date_value = 5;</code>
   *
   * @return Whether the dateValue field is set.
   */
  boolean hasDateValue();

  /**
   *
   *
   * <pre>
   * A value of type `google.type.Date` (year, month, day).
   * </pre>
   *
   * <code>.google.type.Date date_value = 5;</code>
   *
   * @return The dateValue.
   */
  com.google.type.Date getDateValue();

  /**
   *
   *
   * <pre>
   * A value of type `google.type.Date` (year, month, day).
   * </pre>
   *
   * <code>.google.type.Date date_value = 5;</code>
   */
  com.google.type.DateOrBuilder getDateValueOrBuilder();

  /**
   *
   *
   * <pre>
   * A value of type `google.type.DateTime` (year, month, day, hour, minute,
   * second, and UTC offset or timezone.)
   * </pre>
   *
   * <code>.google.type.DateTime date_time_value = 6;</code>
   *
   * @return Whether the dateTimeValue field is set.
   */
  boolean hasDateTimeValue();

  /**
   *
   *
   * <pre>
   * A value of type `google.type.DateTime` (year, month, day, hour, minute,
   * second, and UTC offset or timezone.)
   * </pre>
   *
   * <code>.google.type.DateTime date_time_value = 6;</code>
   *
   * @return The dateTimeValue.
   */
  com.google.type.DateTime getDateTimeValue();

  /**
   *
   *
   * <pre>
   * A value of type `google.type.DateTime` (year, month, day, hour, minute,
   * second, and UTC offset or timezone.)
   * </pre>
   *
   * <code>.google.type.DateTime date_time_value = 6;</code>
   */
  com.google.type.DateTimeOrBuilder getDateTimeValueOrBuilder();

  com.google.cloud.channel.v1.ReportValue.ValueCase getValueCase();
}
