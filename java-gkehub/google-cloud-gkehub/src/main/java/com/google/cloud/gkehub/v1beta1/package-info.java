/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to GKE Hub API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= GkeHubMembershipServiceClient =======================
 *
 * <p>Service Description: The GKE Hub MembershipService handles the registration of many Kubernetes
 * clusters to Google Cloud, represented with the
 * [Membership][google.cloud.gkehub.v1beta1.Membership] resource.
 *
 * <p>GKE Hub is currently available in the global region and all regions in
 * https://cloud.google.com/compute/docs/regions-zones.
 *
 * <p>&#42;&#42;Membership management may be non-trivial:&#42;&#42; it is recommended to use one of
 * the Google-provided client libraries or tools where possible when working with Membership
 * resources.
 *
 * <p>Sample for GkeHubMembershipServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (GkeHubMembershipServiceClient gkeHubMembershipServiceClient =
 *     GkeHubMembershipServiceClient.create()) {
 *   MembershipName name = MembershipName.of("[PROJECT]", "[LOCATION]", "[MEMBERSHIP]");
 *   Membership response = gkeHubMembershipServiceClient.getMembership(name);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.gkehub.v1beta1;

import javax.annotation.Generated;
