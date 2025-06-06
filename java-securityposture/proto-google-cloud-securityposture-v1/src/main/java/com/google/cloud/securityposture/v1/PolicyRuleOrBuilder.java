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
// source: google/cloud/securityposture/v1/org_policy_config.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securityposture.v1;

public interface PolicyRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securityposture.v1.PolicyRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of values to be used for this policy rule. This field can be set
   * only in policies for list constraints.
   * </pre>
   *
   * <code>.google.cloud.securityposture.v1.PolicyRule.StringValues values = 1;</code>
   *
   * @return Whether the values field is set.
   */
  boolean hasValues();

  /**
   *
   *
   * <pre>
   * List of values to be used for this policy rule. This field can be set
   * only in policies for list constraints.
   * </pre>
   *
   * <code>.google.cloud.securityposture.v1.PolicyRule.StringValues values = 1;</code>
   *
   * @return The values.
   */
  com.google.cloud.securityposture.v1.PolicyRule.StringValues getValues();

  /**
   *
   *
   * <pre>
   * List of values to be used for this policy rule. This field can be set
   * only in policies for list constraints.
   * </pre>
   *
   * <code>.google.cloud.securityposture.v1.PolicyRule.StringValues values = 1;</code>
   */
  com.google.cloud.securityposture.v1.PolicyRule.StringValuesOrBuilder getValuesOrBuilder();

  /**
   *
   *
   * <pre>
   * Setting this to true means that all values are allowed. This field can
   * be set only in policies for list constraints.
   * </pre>
   *
   * <code>bool allow_all = 2;</code>
   *
   * @return Whether the allowAll field is set.
   */
  boolean hasAllowAll();

  /**
   *
   *
   * <pre>
   * Setting this to true means that all values are allowed. This field can
   * be set only in policies for list constraints.
   * </pre>
   *
   * <code>bool allow_all = 2;</code>
   *
   * @return The allowAll.
   */
  boolean getAllowAll();

  /**
   *
   *
   * <pre>
   * Setting this to true means that all values are denied. This field can
   * be set only in policies for list constraints.
   * </pre>
   *
   * <code>bool deny_all = 3;</code>
   *
   * @return Whether the denyAll field is set.
   */
  boolean hasDenyAll();

  /**
   *
   *
   * <pre>
   * Setting this to true means that all values are denied. This field can
   * be set only in policies for list constraints.
   * </pre>
   *
   * <code>bool deny_all = 3;</code>
   *
   * @return The denyAll.
   */
  boolean getDenyAll();

  /**
   *
   *
   * <pre>
   * If `true`, then the policy is enforced. If `false`, then any
   * configuration is acceptable.
   * This field can be set only in policies for boolean constraints.
   * </pre>
   *
   * <code>bool enforce = 4;</code>
   *
   * @return Whether the enforce field is set.
   */
  boolean hasEnforce();

  /**
   *
   *
   * <pre>
   * If `true`, then the policy is enforced. If `false`, then any
   * configuration is acceptable.
   * This field can be set only in policies for boolean constraints.
   * </pre>
   *
   * <code>bool enforce = 4;</code>
   *
   * @return The enforce.
   */
  boolean getEnforce();

  /**
   *
   *
   * <pre>
   * A condition which determines whether this rule is used
   * in the evaluation of the policy. When set, the `expression` field in
   * the `Expr' must include from 1 to 10 subexpressions, joined by the "||"
   * or "&amp;&amp;" operators. Each subexpression must be of the form
   * "resource.matchTag('&lt;ORG_ID&gt;/tag_key_short_name,
   * 'tag_value_short_name')" or "resource.matchTagId('tagKeys/key_id',
   * 'tagValues/value_id')" where key_name and value_name are the resource
   * names for Label Keys and Values. These names are available from the Tag
   * Manager Service. An example expression is:
   * "resource.matchTag('123456789/environment,
   * 'prod')" or "resource.matchTagId('tagKeys/123',
   * 'tagValues/456')".
   * </pre>
   *
   * <code>.google.type.Expr condition = 5;</code>
   *
   * @return Whether the condition field is set.
   */
  boolean hasCondition();

  /**
   *
   *
   * <pre>
   * A condition which determines whether this rule is used
   * in the evaluation of the policy. When set, the `expression` field in
   * the `Expr' must include from 1 to 10 subexpressions, joined by the "||"
   * or "&amp;&amp;" operators. Each subexpression must be of the form
   * "resource.matchTag('&lt;ORG_ID&gt;/tag_key_short_name,
   * 'tag_value_short_name')" or "resource.matchTagId('tagKeys/key_id',
   * 'tagValues/value_id')" where key_name and value_name are the resource
   * names for Label Keys and Values. These names are available from the Tag
   * Manager Service. An example expression is:
   * "resource.matchTag('123456789/environment,
   * 'prod')" or "resource.matchTagId('tagKeys/123',
   * 'tagValues/456')".
   * </pre>
   *
   * <code>.google.type.Expr condition = 5;</code>
   *
   * @return The condition.
   */
  com.google.type.Expr getCondition();

  /**
   *
   *
   * <pre>
   * A condition which determines whether this rule is used
   * in the evaluation of the policy. When set, the `expression` field in
   * the `Expr' must include from 1 to 10 subexpressions, joined by the "||"
   * or "&amp;&amp;" operators. Each subexpression must be of the form
   * "resource.matchTag('&lt;ORG_ID&gt;/tag_key_short_name,
   * 'tag_value_short_name')" or "resource.matchTagId('tagKeys/key_id',
   * 'tagValues/value_id')" where key_name and value_name are the resource
   * names for Label Keys and Values. These names are available from the Tag
   * Manager Service. An example expression is:
   * "resource.matchTag('123456789/environment,
   * 'prod')" or "resource.matchTagId('tagKeys/123',
   * 'tagValues/456')".
   * </pre>
   *
   * <code>.google.type.Expr condition = 5;</code>
   */
  com.google.type.ExprOrBuilder getConditionOrBuilder();

  com.google.cloud.securityposture.v1.PolicyRule.KindCase getKindCase();
}
