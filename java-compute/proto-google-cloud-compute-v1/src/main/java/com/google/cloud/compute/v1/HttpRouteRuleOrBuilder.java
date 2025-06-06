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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

public interface HttpRouteRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.HttpRouteRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * customErrorResponsePolicy specifies how the Load Balancer returns error responses when BackendServiceor BackendBucket responds with an error. If a policy for an error code is not configured for the RouteRule, a policy for the error code configured in pathMatcher.defaultCustomErrorResponsePolicy is applied. If one is not specified in pathMatcher.defaultCustomErrorResponsePolicy, the policy configured in UrlMap.defaultCustomErrorResponsePolicy takes effect. For example, consider a UrlMap with the following configuration: - UrlMap.defaultCustomErrorResponsePolicy are configured with policies for 5xx and 4xx errors - A RouteRule for /coming_soon/ is configured for the error code 404. If the request is for www.myotherdomain.com and a 404 is encountered, the policy under UrlMap.defaultCustomErrorResponsePolicy takes effect. If a 404 response is encountered for the request www.example.com/current_events/, the pathMatcher's policy takes effect. If however, the request for www.example.com/coming_soon/ encounters a 404, the policy in RouteRule.customErrorResponsePolicy takes effect. If any of the requests in this example encounter a 500 error code, the policy at UrlMap.defaultCustomErrorResponsePolicy takes effect. When used in conjunction with routeRules.routeAction.retryPolicy, retries take precedence. Only once all retries are exhausted, the customErrorResponsePolicy is applied. While attempting a retry, if load balancer is successful in reaching the service, the customErrorResponsePolicy is ignored and the response from the service is returned to the client. customErrorResponsePolicy is supported only for global external Application Load Balancers.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.CustomErrorResponsePolicy custom_error_response_policy = 202816619;
   * </code>
   *
   * @return Whether the customErrorResponsePolicy field is set.
   */
  boolean hasCustomErrorResponsePolicy();

  /**
   *
   *
   * <pre>
   * customErrorResponsePolicy specifies how the Load Balancer returns error responses when BackendServiceor BackendBucket responds with an error. If a policy for an error code is not configured for the RouteRule, a policy for the error code configured in pathMatcher.defaultCustomErrorResponsePolicy is applied. If one is not specified in pathMatcher.defaultCustomErrorResponsePolicy, the policy configured in UrlMap.defaultCustomErrorResponsePolicy takes effect. For example, consider a UrlMap with the following configuration: - UrlMap.defaultCustomErrorResponsePolicy are configured with policies for 5xx and 4xx errors - A RouteRule for /coming_soon/ is configured for the error code 404. If the request is for www.myotherdomain.com and a 404 is encountered, the policy under UrlMap.defaultCustomErrorResponsePolicy takes effect. If a 404 response is encountered for the request www.example.com/current_events/, the pathMatcher's policy takes effect. If however, the request for www.example.com/coming_soon/ encounters a 404, the policy in RouteRule.customErrorResponsePolicy takes effect. If any of the requests in this example encounter a 500 error code, the policy at UrlMap.defaultCustomErrorResponsePolicy takes effect. When used in conjunction with routeRules.routeAction.retryPolicy, retries take precedence. Only once all retries are exhausted, the customErrorResponsePolicy is applied. While attempting a retry, if load balancer is successful in reaching the service, the customErrorResponsePolicy is ignored and the response from the service is returned to the client. customErrorResponsePolicy is supported only for global external Application Load Balancers.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.CustomErrorResponsePolicy custom_error_response_policy = 202816619;
   * </code>
   *
   * @return The customErrorResponsePolicy.
   */
  com.google.cloud.compute.v1.CustomErrorResponsePolicy getCustomErrorResponsePolicy();

  /**
   *
   *
   * <pre>
   * customErrorResponsePolicy specifies how the Load Balancer returns error responses when BackendServiceor BackendBucket responds with an error. If a policy for an error code is not configured for the RouteRule, a policy for the error code configured in pathMatcher.defaultCustomErrorResponsePolicy is applied. If one is not specified in pathMatcher.defaultCustomErrorResponsePolicy, the policy configured in UrlMap.defaultCustomErrorResponsePolicy takes effect. For example, consider a UrlMap with the following configuration: - UrlMap.defaultCustomErrorResponsePolicy are configured with policies for 5xx and 4xx errors - A RouteRule for /coming_soon/ is configured for the error code 404. If the request is for www.myotherdomain.com and a 404 is encountered, the policy under UrlMap.defaultCustomErrorResponsePolicy takes effect. If a 404 response is encountered for the request www.example.com/current_events/, the pathMatcher's policy takes effect. If however, the request for www.example.com/coming_soon/ encounters a 404, the policy in RouteRule.customErrorResponsePolicy takes effect. If any of the requests in this example encounter a 500 error code, the policy at UrlMap.defaultCustomErrorResponsePolicy takes effect. When used in conjunction with routeRules.routeAction.retryPolicy, retries take precedence. Only once all retries are exhausted, the customErrorResponsePolicy is applied. While attempting a retry, if load balancer is successful in reaching the service, the customErrorResponsePolicy is ignored and the response from the service is returned to the client. customErrorResponsePolicy is supported only for global external Application Load Balancers.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.CustomErrorResponsePolicy custom_error_response_policy = 202816619;
   * </code>
   */
  com.google.cloud.compute.v1.CustomErrorResponsePolicyOrBuilder
      getCustomErrorResponsePolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * The short description conveying the intent of this routeRule. The description can have a maximum length of 1024 characters.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();

  /**
   *
   *
   * <pre>
   * The short description conveying the intent of this routeRule. The description can have a maximum length of 1024 characters.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * The short description conveying the intent of this routeRule. The description can have a maximum length of 1024 characters.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction value specified here is applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpHeaderAction header_action = 328077352;</code>
   *
   * @return Whether the headerAction field is set.
   */
  boolean hasHeaderAction();

  /**
   *
   *
   * <pre>
   * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction value specified here is applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpHeaderAction header_action = 328077352;</code>
   *
   * @return The headerAction.
   */
  com.google.cloud.compute.v1.HttpHeaderAction getHeaderAction();

  /**
   *
   *
   * <pre>
   * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction value specified here is applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpHeaderAction header_action = 328077352;</code>
   */
  com.google.cloud.compute.v1.HttpHeaderActionOrBuilder getHeaderActionOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRuleMatch match_rules = 376200701;</code>
   */
  java.util.List<com.google.cloud.compute.v1.HttpRouteRuleMatch> getMatchRulesList();

  /**
   *
   *
   * <pre>
   * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRuleMatch match_rules = 376200701;</code>
   */
  com.google.cloud.compute.v1.HttpRouteRuleMatch getMatchRules(int index);

  /**
   *
   *
   * <pre>
   * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRuleMatch match_rules = 376200701;</code>
   */
  int getMatchRulesCount();

  /**
   *
   *
   * <pre>
   * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRuleMatch match_rules = 376200701;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.HttpRouteRuleMatchOrBuilder>
      getMatchRulesOrBuilderList();

  /**
   *
   *
   * <pre>
   * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRuleMatch match_rules = 376200701;</code>
   */
  com.google.cloud.compute.v1.HttpRouteRuleMatchOrBuilder getMatchRulesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * For routeRules within a given pathMatcher, priority determines the order in which a load balancer interprets routeRules. RouteRules are evaluated in order of priority, from the lowest to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The first rule that matches the request is applied. You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number from 0 to 2147483647 inclusive. Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
   * </pre>
   *
   * <code>optional int32 priority = 445151652;</code>
   *
   * @return Whether the priority field is set.
   */
  boolean hasPriority();

  /**
   *
   *
   * <pre>
   * For routeRules within a given pathMatcher, priority determines the order in which a load balancer interprets routeRules. RouteRules are evaluated in order of priority, from the lowest to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The first rule that matches the request is applied. You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number from 0 to 2147483647 inclusive. Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
   * </pre>
   *
   * <code>optional int32 priority = 445151652;</code>
   *
   * @return The priority.
   */
  int getPriority();

  /**
   *
   *
   * <pre>
   * In response to a matching matchRule, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. Only one of urlRedirect, service or routeAction.weightedBackendService can be set. URL maps for classic Application Load Balancers only support the urlRewrite action within a route rule's routeAction.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpRouteAction route_action = 424563948;</code>
   *
   * @return Whether the routeAction field is set.
   */
  boolean hasRouteAction();

  /**
   *
   *
   * <pre>
   * In response to a matching matchRule, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. Only one of urlRedirect, service or routeAction.weightedBackendService can be set. URL maps for classic Application Load Balancers only support the urlRewrite action within a route rule's routeAction.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpRouteAction route_action = 424563948;</code>
   *
   * @return The routeAction.
   */
  com.google.cloud.compute.v1.HttpRouteAction getRouteAction();

  /**
   *
   *
   * <pre>
   * In response to a matching matchRule, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. Only one of urlRedirect, service or routeAction.weightedBackendService can be set. URL maps for classic Application Load Balancers only support the urlRewrite action within a route rule's routeAction.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpRouteAction route_action = 424563948;</code>
   */
  com.google.cloud.compute.v1.HttpRouteActionOrBuilder getRouteActionOrBuilder();

  /**
   *
   *
   * <pre>
   * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. Only one of urlRedirect, service or routeAction.weightedBackendService can be set.
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   *
   * @return Whether the service field is set.
   */
  boolean hasService();

  /**
   *
   *
   * <pre>
   * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. Only one of urlRedirect, service or routeAction.weightedBackendService can be set.
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   *
   * @return The service.
   */
  java.lang.String getService();

  /**
   *
   *
   * <pre>
   * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. Only one of urlRedirect, service or routeAction.weightedBackendService can be set.
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   *
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString getServiceBytes();

  /**
   *
   *
   * <pre>
   * When this rule is matched, the request is redirected to a URL specified by urlRedirect. Only one of urlRedirect, service or routeAction.weightedBackendService can be set. Not supported when the URL map is bound to a target gRPC proxy.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpRedirectAction url_redirect = 405147820;</code>
   *
   * @return Whether the urlRedirect field is set.
   */
  boolean hasUrlRedirect();

  /**
   *
   *
   * <pre>
   * When this rule is matched, the request is redirected to a URL specified by urlRedirect. Only one of urlRedirect, service or routeAction.weightedBackendService can be set. Not supported when the URL map is bound to a target gRPC proxy.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpRedirectAction url_redirect = 405147820;</code>
   *
   * @return The urlRedirect.
   */
  com.google.cloud.compute.v1.HttpRedirectAction getUrlRedirect();

  /**
   *
   *
   * <pre>
   * When this rule is matched, the request is redirected to a URL specified by urlRedirect. Only one of urlRedirect, service or routeAction.weightedBackendService can be set. Not supported when the URL map is bound to a target gRPC proxy.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpRedirectAction url_redirect = 405147820;</code>
   */
  com.google.cloud.compute.v1.HttpRedirectActionOrBuilder getUrlRedirectOrBuilder();
}
