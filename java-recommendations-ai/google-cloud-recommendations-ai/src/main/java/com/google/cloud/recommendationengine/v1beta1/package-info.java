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
 * A client to Recommendations AI
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= CatalogServiceClient =======================
 *
 * <p>Service Description: Service for ingesting catalog information of the customer's website.
 *
 * <p>Sample for CatalogServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (CatalogServiceClient catalogServiceClient = CatalogServiceClient.create()) {
 *   CatalogName parent = CatalogName.of("[PROJECT]", "[LOCATION]", "[CATALOG]");
 *   CatalogItem catalogItem = CatalogItem.newBuilder().build();
 *   CatalogItem response = catalogServiceClient.createCatalogItem(parent, catalogItem);
 * }
 * }</pre>
 *
 * <p>======================= PredictionApiKeyRegistryClient =======================
 *
 * <p>Service Description: Service for registering API keys for use with the `predict` method. If
 * you use an API key to request predictions, you must first register the API key. Otherwise, your
 * prediction request is rejected. If you use OAuth to authenticate your `predict` method call, you
 * do not need to register an API key. You can register up to 20 API keys per project.
 *
 * <p>Sample for PredictionApiKeyRegistryClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (PredictionApiKeyRegistryClient predictionApiKeyRegistryClient =
 *     PredictionApiKeyRegistryClient.create()) {
 *   EventStoreName parent =
 *       EventStoreName.of("[PROJECT]", "[LOCATION]", "[CATALOG]", "[EVENT_STORE]");
 *   PredictionApiKeyRegistration predictionApiKeyRegistration =
 *       PredictionApiKeyRegistration.newBuilder().build();
 *   PredictionApiKeyRegistration response =
 *       predictionApiKeyRegistryClient.createPredictionApiKeyRegistration(
 *           parent, predictionApiKeyRegistration);
 * }
 * }</pre>
 *
 * <p>======================= PredictionServiceClient =======================
 *
 * <p>Service Description: Service for making recommendation prediction.
 *
 * <p>Sample for PredictionServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (PredictionServiceClient predictionServiceClient = PredictionServiceClient.create()) {
 *   PlacementName name =
 *       PlacementName.of("[PROJECT]", "[LOCATION]", "[CATALOG]", "[EVENT_STORE]", "[PLACEMENT]");
 *   UserEvent userEvent = UserEvent.newBuilder().build();
 *   for (Map.Entry<String, Value> element :
 *       predictionServiceClient.predict(name, userEvent).iterateAll()) {
 *     // doThingsWith(element);
 *   }
 * }
 * }</pre>
 *
 * <p>======================= UserEventServiceClient =======================
 *
 * <p>Service Description: Service for ingesting end user actions on the customer website.
 *
 * <p>Sample for UserEventServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (UserEventServiceClient userEventServiceClient = UserEventServiceClient.create()) {
 *   EventStoreName parent =
 *       EventStoreName.of("[PROJECT]", "[LOCATION]", "[CATALOG]", "[EVENT_STORE]");
 *   UserEvent userEvent = UserEvent.newBuilder().build();
 *   UserEvent response = userEventServiceClient.writeUserEvent(parent, userEvent);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.recommendationengine.v1beta1;

import javax.annotation.Generated;
