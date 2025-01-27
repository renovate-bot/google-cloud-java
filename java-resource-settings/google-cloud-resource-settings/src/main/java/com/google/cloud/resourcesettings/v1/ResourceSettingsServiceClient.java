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

package com.google.cloud.resourcesettings.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.resourcenames.ResourceName;
import com.google.cloud.resourcesettings.v1.stub.ResourceSettingsServiceStub;
import com.google.cloud.resourcesettings.v1.stub.ResourceSettingsServiceStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: An interface to interact with resource settings and setting values
 * throughout the resource hierarchy.
 *
 * <p>Services may surface a number of settings for users to control how their resources behave.
 * Values of settings applied on a given Cloud resource are evaluated hierarchically and inherited
 * by all descendants of that resource.
 *
 * <p>For all requests, returns a `google.rpc.Status` with `google.rpc.Code.PERMISSION_DENIED` if
 * the IAM check fails or the `parent` resource is not in a Cloud Organization. For all requests,
 * returns a `google.rpc.Status` with `google.rpc.Code.INVALID_ARGUMENT` if the request is
 * malformed. (== deprecation_description Resource Settings is deprecated. As of November 7, 2023,
 * no organizations will be onboarded for any of the enabled settings, and the service will be shut
 * down on October 1, 2024. ==)
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (ResourceSettingsServiceClient resourceSettingsServiceClient =
 *     ResourceSettingsServiceClient.create()) {
 *   SettingName name =
 *       SettingName.ofOrganizationSettingNameName("[ORGANIZATION]", "[SETTING_NAME]");
 *   Setting response = resourceSettingsServiceClient.getSetting(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the ResourceSettingsServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> ListSettings</td>
 *      <td><p> Lists all the settings that are available on the Cloud resource `parent`.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listSettings(ListSettingsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listSettings(ResourceName parent)
 *           <li><p> listSettings(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listSettingsPagedCallable()
 *           <li><p> listSettingsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetSetting</td>
 *      <td><p> Gets a setting.
 * <p>  Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the setting does not exist.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getSetting(GetSettingRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getSetting(SettingName name)
 *           <li><p> getSetting(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getSettingCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateSetting</td>
 *      <td><p> Updates a setting.
 * <p>  Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the setting does not exist. Returns a `google.rpc.Status` with `google.rpc.Code.FAILED_PRECONDITION` if the setting is flagged as read only. Returns a `google.rpc.Status` with `google.rpc.Code.ABORTED` if the etag supplied in the request does not match the persisted etag of the setting value.
 * <p>  On success, the response will contain only `name`, `local_value` and `etag`.  The `metadata` and `effective_value` cannot be updated through this API.
 * <p>  Note: the supplied setting will perform a full overwrite of the `local_value` field.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateSetting(UpdateSettingRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateSettingCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of
 * ResourceSettingsServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ResourceSettingsServiceSettings resourceSettingsServiceSettings =
 *     ResourceSettingsServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ResourceSettingsServiceClient resourceSettingsServiceClient =
 *     ResourceSettingsServiceClient.create(resourceSettingsServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ResourceSettingsServiceSettings resourceSettingsServiceSettings =
 *     ResourceSettingsServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ResourceSettingsServiceClient resourceSettingsServiceClient =
 *     ResourceSettingsServiceClient.create(resourceSettingsServiceSettings);
 * }</pre>
 *
 * <p>To use REST (HTTP1.1/JSON) transport (instead of gRPC) for sending and receiving requests over
 * the wire:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ResourceSettingsServiceSettings resourceSettingsServiceSettings =
 *     ResourceSettingsServiceSettings.newHttpJsonBuilder().build();
 * ResourceSettingsServiceClient resourceSettingsServiceClient =
 *     ResourceSettingsServiceClient.create(resourceSettingsServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 *
 * @deprecated This class is deprecated and will be removed in the next major version update.
 */
@Deprecated
@Generated("by gapic-generator-java")
public class ResourceSettingsServiceClient implements BackgroundResource {
  private final ResourceSettingsServiceSettings settings;
  private final ResourceSettingsServiceStub stub;

  /** Constructs an instance of ResourceSettingsServiceClient with default settings. */
  public static final ResourceSettingsServiceClient create() throws IOException {
    return create(ResourceSettingsServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ResourceSettingsServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ResourceSettingsServiceClient create(ResourceSettingsServiceSettings settings)
      throws IOException {
    return new ResourceSettingsServiceClient(settings);
  }

  /**
   * Constructs an instance of ResourceSettingsServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(ResourceSettingsServiceSettings).
   */
  public static final ResourceSettingsServiceClient create(ResourceSettingsServiceStub stub) {
    return new ResourceSettingsServiceClient(stub);
  }

  /**
   * Constructs an instance of ResourceSettingsServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected ResourceSettingsServiceClient(ResourceSettingsServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((ResourceSettingsServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected ResourceSettingsServiceClient(ResourceSettingsServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ResourceSettingsServiceSettings getSettings() {
    return settings;
  }

  public ResourceSettingsServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all the settings that are available on the Cloud resource `parent`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ResourceSettingsServiceClient resourceSettingsServiceClient =
   *     ResourceSettingsServiceClient.create()) {
   *   ResourceName parent =
   *       new ResourceName() {
   *         {@literal @}Override
   *         public Map<String, String> getFieldValuesMap() {
   *           Map<String, String> fieldValuesMap = new HashMap<>();
   *           fieldValuesMap.put("parent", "organizations/organization-8287");
   *           return fieldValuesMap;
   *         }
   *
   *         {@literal @}Override
   *         public String getFieldValue(String fieldName) {
   *           return getFieldValuesMap().get(fieldName);
   *         }
   *
   *         {@literal @}Override
   *         public String toString() {
   *           return "organizations/organization-8287";
   *         }
   *       };
   *   for (Setting element : resourceSettingsServiceClient.listSettings(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The Cloud resource that parents the setting. Must be in one of the
   *     following forms:
   *     <ul>
   *       <li>`projects/{project_number}`
   *       <li>`projects/{project_id}`
   *       <li>`folders/{folder_id}`
   *       <li>`organizations/{organization_id}`
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSettingsPagedResponse listSettings(ResourceName parent) {
    ListSettingsRequest request =
        ListSettingsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listSettings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all the settings that are available on the Cloud resource `parent`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ResourceSettingsServiceClient resourceSettingsServiceClient =
   *     ResourceSettingsServiceClient.create()) {
   *   String parent =
   *       SettingName.ofProjectNumberSettingNameName("[PROJECT_NUMBER]", "[SETTING_NAME]")
   *           .toString();
   *   for (Setting element : resourceSettingsServiceClient.listSettings(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The Cloud resource that parents the setting. Must be in one of the
   *     following forms:
   *     <ul>
   *       <li>`projects/{project_number}`
   *       <li>`projects/{project_id}`
   *       <li>`folders/{folder_id}`
   *       <li>`organizations/{organization_id}`
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSettingsPagedResponse listSettings(String parent) {
    ListSettingsRequest request = ListSettingsRequest.newBuilder().setParent(parent).build();
    return listSettings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all the settings that are available on the Cloud resource `parent`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ResourceSettingsServiceClient resourceSettingsServiceClient =
   *     ResourceSettingsServiceClient.create()) {
   *   ListSettingsRequest request =
   *       ListSettingsRequest.newBuilder()
   *           .setParent("ListSettingsRequest-286838706".toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setView(SettingView.forNumber(0))
   *           .build();
   *   for (Setting element : resourceSettingsServiceClient.listSettings(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSettingsPagedResponse listSettings(ListSettingsRequest request) {
    return listSettingsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all the settings that are available on the Cloud resource `parent`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ResourceSettingsServiceClient resourceSettingsServiceClient =
   *     ResourceSettingsServiceClient.create()) {
   *   ListSettingsRequest request =
   *       ListSettingsRequest.newBuilder()
   *           .setParent("ListSettingsRequest-286838706".toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setView(SettingView.forNumber(0))
   *           .build();
   *   ApiFuture<Setting> future =
   *       resourceSettingsServiceClient.listSettingsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Setting element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListSettingsRequest, ListSettingsPagedResponse>
      listSettingsPagedCallable() {
    return stub.listSettingsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all the settings that are available on the Cloud resource `parent`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ResourceSettingsServiceClient resourceSettingsServiceClient =
   *     ResourceSettingsServiceClient.create()) {
   *   ListSettingsRequest request =
   *       ListSettingsRequest.newBuilder()
   *           .setParent("ListSettingsRequest-286838706".toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setView(SettingView.forNumber(0))
   *           .build();
   *   while (true) {
   *     ListSettingsResponse response =
   *         resourceSettingsServiceClient.listSettingsCallable().call(request);
   *     for (Setting element : response.getSettingsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListSettingsRequest, ListSettingsResponse> listSettingsCallable() {
    return stub.listSettingsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a setting.
   *
   * <p>Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the setting does not
   * exist.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ResourceSettingsServiceClient resourceSettingsServiceClient =
   *     ResourceSettingsServiceClient.create()) {
   *   SettingName name =
   *       SettingName.ofOrganizationSettingNameName("[ORGANIZATION]", "[SETTING_NAME]");
   *   Setting response = resourceSettingsServiceClient.getSetting(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the setting to get. See
   *     [Setting][google.cloud.resourcesettings.v1.Setting] for naming requirements.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Setting getSetting(SettingName name) {
    GetSettingRequest request =
        GetSettingRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getSetting(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a setting.
   *
   * <p>Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the setting does not
   * exist.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ResourceSettingsServiceClient resourceSettingsServiceClient =
   *     ResourceSettingsServiceClient.create()) {
   *   String name =
   *       SettingName.ofProjectNumberSettingNameName("[PROJECT_NUMBER]", "[SETTING_NAME]")
   *           .toString();
   *   Setting response = resourceSettingsServiceClient.getSetting(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the setting to get. See
   *     [Setting][google.cloud.resourcesettings.v1.Setting] for naming requirements.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Setting getSetting(String name) {
    GetSettingRequest request = GetSettingRequest.newBuilder().setName(name).build();
    return getSetting(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a setting.
   *
   * <p>Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the setting does not
   * exist.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ResourceSettingsServiceClient resourceSettingsServiceClient =
   *     ResourceSettingsServiceClient.create()) {
   *   GetSettingRequest request =
   *       GetSettingRequest.newBuilder()
   *           .setName(
   *               SettingName.ofOrganizationSettingNameName("[ORGANIZATION]", "[SETTING_NAME]")
   *                   .toString())
   *           .setView(SettingView.forNumber(0))
   *           .build();
   *   Setting response = resourceSettingsServiceClient.getSetting(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Setting getSetting(GetSettingRequest request) {
    return getSettingCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a setting.
   *
   * <p>Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the setting does not
   * exist.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ResourceSettingsServiceClient resourceSettingsServiceClient =
   *     ResourceSettingsServiceClient.create()) {
   *   GetSettingRequest request =
   *       GetSettingRequest.newBuilder()
   *           .setName(
   *               SettingName.ofOrganizationSettingNameName("[ORGANIZATION]", "[SETTING_NAME]")
   *                   .toString())
   *           .setView(SettingView.forNumber(0))
   *           .build();
   *   ApiFuture<Setting> future =
   *       resourceSettingsServiceClient.getSettingCallable().futureCall(request);
   *   // Do something.
   *   Setting response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetSettingRequest, Setting> getSettingCallable() {
    return stub.getSettingCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a setting.
   *
   * <p>Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the setting does not
   * exist. Returns a `google.rpc.Status` with `google.rpc.Code.FAILED_PRECONDITION` if the setting
   * is flagged as read only. Returns a `google.rpc.Status` with `google.rpc.Code.ABORTED` if the
   * etag supplied in the request does not match the persisted etag of the setting value.
   *
   * <p>On success, the response will contain only `name`, `local_value` and `etag`. The `metadata`
   * and `effective_value` cannot be updated through this API.
   *
   * <p>Note: the supplied setting will perform a full overwrite of the `local_value` field.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ResourceSettingsServiceClient resourceSettingsServiceClient =
   *     ResourceSettingsServiceClient.create()) {
   *   UpdateSettingRequest request =
   *       UpdateSettingRequest.newBuilder().setSetting(Setting.newBuilder().build()).build();
   *   Setting response = resourceSettingsServiceClient.updateSetting(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Setting updateSetting(UpdateSettingRequest request) {
    return updateSettingCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a setting.
   *
   * <p>Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the setting does not
   * exist. Returns a `google.rpc.Status` with `google.rpc.Code.FAILED_PRECONDITION` if the setting
   * is flagged as read only. Returns a `google.rpc.Status` with `google.rpc.Code.ABORTED` if the
   * etag supplied in the request does not match the persisted etag of the setting value.
   *
   * <p>On success, the response will contain only `name`, `local_value` and `etag`. The `metadata`
   * and `effective_value` cannot be updated through this API.
   *
   * <p>Note: the supplied setting will perform a full overwrite of the `local_value` field.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ResourceSettingsServiceClient resourceSettingsServiceClient =
   *     ResourceSettingsServiceClient.create()) {
   *   UpdateSettingRequest request =
   *       UpdateSettingRequest.newBuilder().setSetting(Setting.newBuilder().build()).build();
   *   ApiFuture<Setting> future =
   *       resourceSettingsServiceClient.updateSettingCallable().futureCall(request);
   *   // Do something.
   *   Setting response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateSettingRequest, Setting> updateSettingCallable() {
    return stub.updateSettingCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListSettingsPagedResponse
      extends AbstractPagedListResponse<
          ListSettingsRequest,
          ListSettingsResponse,
          Setting,
          ListSettingsPage,
          ListSettingsFixedSizeCollection> {

    public static ApiFuture<ListSettingsPagedResponse> createAsync(
        PageContext<ListSettingsRequest, ListSettingsResponse, Setting> context,
        ApiFuture<ListSettingsResponse> futureResponse) {
      ApiFuture<ListSettingsPage> futurePage =
          ListSettingsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListSettingsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListSettingsPagedResponse(ListSettingsPage page) {
      super(page, ListSettingsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListSettingsPage
      extends AbstractPage<ListSettingsRequest, ListSettingsResponse, Setting, ListSettingsPage> {

    private ListSettingsPage(
        PageContext<ListSettingsRequest, ListSettingsResponse, Setting> context,
        ListSettingsResponse response) {
      super(context, response);
    }

    private static ListSettingsPage createEmptyPage() {
      return new ListSettingsPage(null, null);
    }

    @Override
    protected ListSettingsPage createPage(
        PageContext<ListSettingsRequest, ListSettingsResponse, Setting> context,
        ListSettingsResponse response) {
      return new ListSettingsPage(context, response);
    }

    @Override
    public ApiFuture<ListSettingsPage> createPageAsync(
        PageContext<ListSettingsRequest, ListSettingsResponse, Setting> context,
        ApiFuture<ListSettingsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListSettingsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListSettingsRequest,
          ListSettingsResponse,
          Setting,
          ListSettingsPage,
          ListSettingsFixedSizeCollection> {

    private ListSettingsFixedSizeCollection(List<ListSettingsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListSettingsFixedSizeCollection createEmptyCollection() {
      return new ListSettingsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListSettingsFixedSizeCollection createCollection(
        List<ListSettingsPage> pages, int collectionSize) {
      return new ListSettingsFixedSizeCollection(pages, collectionSize);
    }
  }
}
