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
// source: google/shopping/merchant/issueresolution/v1beta/issueresolution.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.issueresolution.v1beta;

public interface InputValueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.issueresolution.v1beta.InputValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Value for [text
   * input][google.shopping.merchant.issueresolution.v1beta.InputField.TextInput]
   * field.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.issueresolution.v1beta.InputValue.TextInputValue text_input_value = 2;
   * </code>
   *
   * @return Whether the textInputValue field is set.
   */
  boolean hasTextInputValue();

  /**
   *
   *
   * <pre>
   * Value for [text
   * input][google.shopping.merchant.issueresolution.v1beta.InputField.TextInput]
   * field.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.issueresolution.v1beta.InputValue.TextInputValue text_input_value = 2;
   * </code>
   *
   * @return The textInputValue.
   */
  com.google.shopping.merchant.issueresolution.v1beta.InputValue.TextInputValue getTextInputValue();

  /**
   *
   *
   * <pre>
   * Value for [text
   * input][google.shopping.merchant.issueresolution.v1beta.InputField.TextInput]
   * field.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.issueresolution.v1beta.InputValue.TextInputValue text_input_value = 2;
   * </code>
   */
  com.google.shopping.merchant.issueresolution.v1beta.InputValue.TextInputValueOrBuilder
      getTextInputValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Value for [choice
   * input][google.shopping.merchant.issueresolution.v1beta.InputField.ChoiceInput]
   * field.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.issueresolution.v1beta.InputValue.ChoiceInputValue choice_input_value = 3;
   * </code>
   *
   * @return Whether the choiceInputValue field is set.
   */
  boolean hasChoiceInputValue();

  /**
   *
   *
   * <pre>
   * Value for [choice
   * input][google.shopping.merchant.issueresolution.v1beta.InputField.ChoiceInput]
   * field.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.issueresolution.v1beta.InputValue.ChoiceInputValue choice_input_value = 3;
   * </code>
   *
   * @return The choiceInputValue.
   */
  com.google.shopping.merchant.issueresolution.v1beta.InputValue.ChoiceInputValue
      getChoiceInputValue();

  /**
   *
   *
   * <pre>
   * Value for [choice
   * input][google.shopping.merchant.issueresolution.v1beta.InputField.ChoiceInput]
   * field.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.issueresolution.v1beta.InputValue.ChoiceInputValue choice_input_value = 3;
   * </code>
   */
  com.google.shopping.merchant.issueresolution.v1beta.InputValue.ChoiceInputValueOrBuilder
      getChoiceInputValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Value for [checkbox
   * input][google.shopping.merchant.issueresolution.v1beta.InputField.CheckboxInput]
   * field.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.issueresolution.v1beta.InputValue.CheckboxInputValue checkbox_input_value = 4;
   * </code>
   *
   * @return Whether the checkboxInputValue field is set.
   */
  boolean hasCheckboxInputValue();

  /**
   *
   *
   * <pre>
   * Value for [checkbox
   * input][google.shopping.merchant.issueresolution.v1beta.InputField.CheckboxInput]
   * field.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.issueresolution.v1beta.InputValue.CheckboxInputValue checkbox_input_value = 4;
   * </code>
   *
   * @return The checkboxInputValue.
   */
  com.google.shopping.merchant.issueresolution.v1beta.InputValue.CheckboxInputValue
      getCheckboxInputValue();

  /**
   *
   *
   * <pre>
   * Value for [checkbox
   * input][google.shopping.merchant.issueresolution.v1beta.InputField.CheckboxInput]
   * field.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.issueresolution.v1beta.InputValue.CheckboxInputValue checkbox_input_value = 4;
   * </code>
   */
  com.google.shopping.merchant.issueresolution.v1beta.InputValue.CheckboxInputValueOrBuilder
      getCheckboxInputValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Required.
   * [Id][google.shopping.merchant.issueresolution.v1beta.InputField.id] of the
   * corresponding input field.
   * </pre>
   *
   * <code>string input_field_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The inputFieldId.
   */
  java.lang.String getInputFieldId();

  /**
   *
   *
   * <pre>
   * Required.
   * [Id][google.shopping.merchant.issueresolution.v1beta.InputField.id] of the
   * corresponding input field.
   * </pre>
   *
   * <code>string input_field_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for inputFieldId.
   */
  com.google.protobuf.ByteString getInputFieldIdBytes();

  com.google.shopping.merchant.issueresolution.v1beta.InputValue.ValueCase getValueCase();
}
