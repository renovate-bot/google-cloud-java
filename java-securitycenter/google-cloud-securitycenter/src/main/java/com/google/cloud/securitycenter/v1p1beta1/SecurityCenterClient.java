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

package com.google.cloud.securitycenter.v1p1beta1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.longrunning.OperationsClient;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.resourcenames.ResourceName;
import com.google.cloud.securitycenter.v1p1beta1.stub.SecurityCenterStub;
import com.google.cloud.securitycenter.v1p1beta1.stub.SecurityCenterStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: V1p1Beta1 APIs for Security Center service.
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
 * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
 *   OrganizationName parent = OrganizationName.of("[ORGANIZATION]");
 *   Source source = Source.newBuilder().build();
 *   Source response = securityCenterClient.createSource(parent, source);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the SecurityCenterClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> CreateSource</td>
 *      <td><p> Creates a source.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createSource(CreateSourceRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createSource(OrganizationName parent, Source source)
 *           <li><p> createSource(String parent, Source source)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createSourceCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateFinding</td>
 *      <td><p> Creates a finding. The corresponding source must exist for finding creation to succeed.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createFinding(CreateFindingRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createFinding(SourceName parent, Finding finding, String findingId)
 *           <li><p> createFinding(SourceName parent, String findingId, Finding finding)
 *           <li><p> createFinding(String parent, Finding finding, String findingId)
 *           <li><p> createFinding(String parent, String findingId, Finding finding)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createFindingCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateNotificationConfig</td>
 *      <td><p> Creates a notification config.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createNotificationConfig(CreateNotificationConfigRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createNotificationConfig(OrganizationName parent, NotificationConfig notificationConfig)
 *           <li><p> createNotificationConfig(String parent, NotificationConfig notificationConfig)
 *           <li><p> createNotificationConfig(OrganizationName parent, String configId, NotificationConfig notificationConfig)
 *           <li><p> createNotificationConfig(String parent, String configId, NotificationConfig notificationConfig)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createNotificationConfigCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteNotificationConfig</td>
 *      <td><p> Deletes a notification config.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteNotificationConfig(DeleteNotificationConfigRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> deleteNotificationConfig(NotificationConfigName name)
 *           <li><p> deleteNotificationConfig(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteNotificationConfigCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetIamPolicy</td>
 *      <td><p> Gets the access control policy on the specified Source.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getIamPolicy(GetIamPolicyRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getIamPolicy(ResourceName resource)
 *           <li><p> getIamPolicy(String resource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getIamPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetNotificationConfig</td>
 *      <td><p> Gets a notification config.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getNotificationConfig(GetNotificationConfigRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getNotificationConfig(NotificationConfigName name)
 *           <li><p> getNotificationConfig(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getNotificationConfigCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetOrganizationSettings</td>
 *      <td><p> Gets the settings for an organization.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getOrganizationSettings(GetOrganizationSettingsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getOrganizationSettings(OrganizationSettingsName name)
 *           <li><p> getOrganizationSettings(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getOrganizationSettingsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetSource</td>
 *      <td><p> Gets a source.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getSource(GetSourceRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getSource(SourceName name)
 *           <li><p> getSource(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getSourceCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GroupAssets</td>
 *      <td><p> Filters an organization's assets and  groups them by their specified properties.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> groupAssets(GroupAssetsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> groupAssetsPagedCallable()
 *           <li><p> groupAssetsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GroupFindings</td>
 *      <td><p> Filters an organization or source's findings and  groups them by their specified properties.
 * <p>  To group across all sources provide a `-` as the source id. Example: /v1/organizations/{organization_id}/sources/-/findings, /v1/folders/{folder_id}/sources/-/findings, /v1/projects/{project_id}/sources/-/findings</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> groupFindings(GroupFindingsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> groupFindings(SourceName parent, String groupBy)
 *           <li><p> groupFindings(String parent, String groupBy)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> groupFindingsPagedCallable()
 *           <li><p> groupFindingsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListAssets</td>
 *      <td><p> Lists an organization's assets.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listAssets(ListAssetsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listAssets(FolderName parent)
 *           <li><p> listAssets(OrganizationName parent)
 *           <li><p> listAssets(ProjectName parent)
 *           <li><p> listAssets(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listAssetsPagedCallable()
 *           <li><p> listAssetsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListFindings</td>
 *      <td><p> Lists an organization or source's findings.
 * <p>  To list across all sources provide a `-` as the source id. Example: /v1p1beta1/organizations/{organization_id}/sources/-/findings</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listFindings(ListFindingsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listFindings(SourceName parent)
 *           <li><p> listFindings(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listFindingsPagedCallable()
 *           <li><p> listFindingsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListNotificationConfigs</td>
 *      <td><p> Lists notification configs.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listNotificationConfigs(ListNotificationConfigsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listNotificationConfigs(OrganizationName parent)
 *           <li><p> listNotificationConfigs(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listNotificationConfigsPagedCallable()
 *           <li><p> listNotificationConfigsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListSources</td>
 *      <td><p> Lists all sources belonging to an organization.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listSources(ListSourcesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listSources(FolderName parent)
 *           <li><p> listSources(OrganizationName parent)
 *           <li><p> listSources(ProjectName parent)
 *           <li><p> listSources(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listSourcesPagedCallable()
 *           <li><p> listSourcesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> RunAssetDiscovery</td>
 *      <td><p> Runs asset discovery. The discovery is tracked with a long-running operation.
 * <p>  This API can only be called with limited frequency for an organization. If it is called too frequently the caller will receive a TOO_MANY_REQUESTS error.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> runAssetDiscoveryAsync(RunAssetDiscoveryRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> runAssetDiscoveryAsync(OrganizationName parent)
 *           <li><p> runAssetDiscoveryAsync(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> runAssetDiscoveryOperationCallable()
 *           <li><p> runAssetDiscoveryCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> SetFindingState</td>
 *      <td><p> Updates the state of a finding.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> setFindingState(SetFindingStateRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> setFindingState(FindingName name, Finding.State state, Timestamp startTime)
 *           <li><p> setFindingState(String name, Finding.State state, Timestamp startTime)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> setFindingStateCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> SetIamPolicy</td>
 *      <td><p> Sets the access control policy on the specified Source.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> setIamPolicy(SetIamPolicyRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> setIamPolicy(ResourceName resource, Policy policy)
 *           <li><p> setIamPolicy(String resource, Policy policy)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> setIamPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> TestIamPermissions</td>
 *      <td><p> Returns the permissions that a caller has on the specified source.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> testIamPermissions(TestIamPermissionsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> testIamPermissions(ResourceName resource, List&lt;String&gt; permissions)
 *           <li><p> testIamPermissions(String resource, List&lt;String&gt; permissions)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> testIamPermissionsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateFinding</td>
 *      <td><p> Creates or updates a finding. The corresponding source must exist for a finding creation to succeed.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateFinding(UpdateFindingRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> updateFinding(Finding finding)
 *           <li><p> updateFinding(Finding finding, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateFindingCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateNotificationConfig</td>
 *      <td><p> Updates a notification config. The following update fields are allowed: description, pubsub_topic, streaming_config.filter</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateNotificationConfig(UpdateNotificationConfigRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> updateNotificationConfig(NotificationConfig notificationConfig)
 *           <li><p> updateNotificationConfig(NotificationConfig notificationConfig, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateNotificationConfigCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateOrganizationSettings</td>
 *      <td><p> Updates an organization's settings.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateOrganizationSettings(UpdateOrganizationSettingsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> updateOrganizationSettings(OrganizationSettings organizationSettings)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateOrganizationSettingsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateSource</td>
 *      <td><p> Updates a source.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateSource(UpdateSourceRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> updateSource(Source source)
 *           <li><p> updateSource(Source source, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateSourceCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateSecurityMarks</td>
 *      <td><p> Updates security marks.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateSecurityMarks(UpdateSecurityMarksRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> updateSecurityMarks(SecurityMarks securityMarks)
 *           <li><p> updateSecurityMarks(SecurityMarks securityMarks, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateSecurityMarksCallable()
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
 * <p>This class can be customized by passing in a custom instance of SecurityCenterSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * SecurityCenterSettings securityCenterSettings =
 *     SecurityCenterSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SecurityCenterClient securityCenterClient = SecurityCenterClient.create(securityCenterSettings);
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
 * SecurityCenterSettings securityCenterSettings =
 *     SecurityCenterSettings.newBuilder().setEndpoint(myEndpoint).build();
 * SecurityCenterClient securityCenterClient = SecurityCenterClient.create(securityCenterSettings);
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
 * SecurityCenterSettings securityCenterSettings =
 *     SecurityCenterSettings.newHttpJsonBuilder().build();
 * SecurityCenterClient securityCenterClient = SecurityCenterClient.create(securityCenterSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class SecurityCenterClient implements BackgroundResource {
  private final SecurityCenterSettings settings;
  private final SecurityCenterStub stub;
  private final OperationsClient httpJsonOperationsClient;
  private final com.google.longrunning.OperationsClient operationsClient;

  /** Constructs an instance of SecurityCenterClient with default settings. */
  public static final SecurityCenterClient create() throws IOException {
    return create(SecurityCenterSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SecurityCenterClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final SecurityCenterClient create(SecurityCenterSettings settings)
      throws IOException {
    return new SecurityCenterClient(settings);
  }

  /**
   * Constructs an instance of SecurityCenterClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(SecurityCenterSettings).
   */
  public static final SecurityCenterClient create(SecurityCenterStub stub) {
    return new SecurityCenterClient(stub);
  }

  /**
   * Constructs an instance of SecurityCenterClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected SecurityCenterClient(SecurityCenterSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((SecurityCenterStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  protected SecurityCenterClient(SecurityCenterStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  public final SecurityCenterSettings getSettings() {
    return settings;
  }

  public SecurityCenterStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final com.google.longrunning.OperationsClient getOperationsClient() {
    return operationsClient;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  @BetaApi
  public final OperationsClient getHttpJsonOperationsClient() {
    return httpJsonOperationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   OrganizationName parent = OrganizationName.of("[ORGANIZATION]");
   *   Source source = Source.newBuilder().build();
   *   Source response = securityCenterClient.createSource(parent, source);
   * }
   * }</pre>
   *
   * @param parent Required. Resource name of the new source's parent. Its format should be
   *     "organizations/[organization_id]".
   * @param source Required. The Source being created, only the display_name and description will be
   *     used. All other fields will be ignored.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Source createSource(OrganizationName parent, Source source) {
    CreateSourceRequest request =
        CreateSourceRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setSource(source)
            .build();
    return createSource(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String parent = OrganizationName.of("[ORGANIZATION]").toString();
   *   Source source = Source.newBuilder().build();
   *   Source response = securityCenterClient.createSource(parent, source);
   * }
   * }</pre>
   *
   * @param parent Required. Resource name of the new source's parent. Its format should be
   *     "organizations/[organization_id]".
   * @param source Required. The Source being created, only the display_name and description will be
   *     used. All other fields will be ignored.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Source createSource(String parent, Source source) {
    CreateSourceRequest request =
        CreateSourceRequest.newBuilder().setParent(parent).setSource(source).build();
    return createSource(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   CreateSourceRequest request =
   *       CreateSourceRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setSource(Source.newBuilder().build())
   *           .build();
   *   Source response = securityCenterClient.createSource(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Source createSource(CreateSourceRequest request) {
    return createSourceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   CreateSourceRequest request =
   *       CreateSourceRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setSource(Source.newBuilder().build())
   *           .build();
   *   ApiFuture<Source> future = securityCenterClient.createSourceCallable().futureCall(request);
   *   // Do something.
   *   Source response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateSourceRequest, Source> createSourceCallable() {
    return stub.createSourceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a finding. The corresponding source must exist for finding creation to succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   SourceName parent = SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]");
   *   Finding finding = Finding.newBuilder().build();
   *   String findingId = "findingId439150212";
   *   Finding response = securityCenterClient.createFinding(parent, finding, findingId);
   * }
   * }</pre>
   *
   * @param parent Required. Resource name of the new finding's parent. Its format should be
   *     "organizations/[organization_id]/sources/[source_id]".
   * @param finding Required. The Finding being created. The name and security_marks will be ignored
   *     as they are both output only fields on this resource.
   * @param findingId Required. Unique identifier provided by the client within the parent scope.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding createFinding(SourceName parent, Finding finding, String findingId) {
    CreateFindingRequest request =
        CreateFindingRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setFinding(finding)
            .setFindingId(findingId)
            .build();
    return createFinding(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a finding. The corresponding source must exist for finding creation to succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   SourceName parent = SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]");
   *   String findingId = "findingId439150212";
   *   Finding finding = Finding.newBuilder().build();
   *   Finding response = securityCenterClient.createFinding(parent, findingId, finding);
   * }
   * }</pre>
   *
   * @param parent Required. Resource name of the new finding's parent. Its format should be
   *     "organizations/[organization_id]/sources/[source_id]".
   * @param findingId Required. Unique identifier provided by the client within the parent scope.
   * @param finding Required. The Finding being created. The name and security_marks will be ignored
   *     as they are both output only fields on this resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding createFinding(SourceName parent, String findingId, Finding finding) {
    CreateFindingRequest request =
        CreateFindingRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setFindingId(findingId)
            .setFinding(finding)
            .build();
    return createFinding(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a finding. The corresponding source must exist for finding creation to succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String parent = SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString();
   *   Finding finding = Finding.newBuilder().build();
   *   String findingId = "findingId439150212";
   *   Finding response = securityCenterClient.createFinding(parent, finding, findingId);
   * }
   * }</pre>
   *
   * @param parent Required. Resource name of the new finding's parent. Its format should be
   *     "organizations/[organization_id]/sources/[source_id]".
   * @param finding Required. The Finding being created. The name and security_marks will be ignored
   *     as they are both output only fields on this resource.
   * @param findingId Required. Unique identifier provided by the client within the parent scope.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding createFinding(String parent, Finding finding, String findingId) {
    CreateFindingRequest request =
        CreateFindingRequest.newBuilder()
            .setParent(parent)
            .setFinding(finding)
            .setFindingId(findingId)
            .build();
    return createFinding(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a finding. The corresponding source must exist for finding creation to succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String parent = SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString();
   *   String findingId = "findingId439150212";
   *   Finding finding = Finding.newBuilder().build();
   *   Finding response = securityCenterClient.createFinding(parent, findingId, finding);
   * }
   * }</pre>
   *
   * @param parent Required. Resource name of the new finding's parent. Its format should be
   *     "organizations/[organization_id]/sources/[source_id]".
   * @param findingId Required. Unique identifier provided by the client within the parent scope.
   * @param finding Required. The Finding being created. The name and security_marks will be ignored
   *     as they are both output only fields on this resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding createFinding(String parent, String findingId, Finding finding) {
    CreateFindingRequest request =
        CreateFindingRequest.newBuilder()
            .setParent(parent)
            .setFindingId(findingId)
            .setFinding(finding)
            .build();
    return createFinding(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a finding. The corresponding source must exist for finding creation to succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   CreateFindingRequest request =
   *       CreateFindingRequest.newBuilder()
   *           .setParent(
   *               SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString())
   *           .setFindingId("findingId439150212")
   *           .setFinding(Finding.newBuilder().build())
   *           .build();
   *   Finding response = securityCenterClient.createFinding(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding createFinding(CreateFindingRequest request) {
    return createFindingCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a finding. The corresponding source must exist for finding creation to succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   CreateFindingRequest request =
   *       CreateFindingRequest.newBuilder()
   *           .setParent(
   *               SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString())
   *           .setFindingId("findingId439150212")
   *           .setFinding(Finding.newBuilder().build())
   *           .build();
   *   ApiFuture<Finding> future = securityCenterClient.createFindingCallable().futureCall(request);
   *   // Do something.
   *   Finding response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateFindingRequest, Finding> createFindingCallable() {
    return stub.createFindingCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a notification config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   OrganizationName parent = OrganizationName.of("[ORGANIZATION]");
   *   NotificationConfig notificationConfig = NotificationConfig.newBuilder().build();
   *   NotificationConfig response =
   *       securityCenterClient.createNotificationConfig(parent, notificationConfig);
   * }
   * }</pre>
   *
   * @param parent Required. Resource name of the new notification config's parent. Its format is
   *     "organizations/[organization_id]".
   * @param notificationConfig Required. The notification config being created. The name and the
   *     service account will be ignored as they are both output only fields on this resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NotificationConfig createNotificationConfig(
      OrganizationName parent, NotificationConfig notificationConfig) {
    CreateNotificationConfigRequest request =
        CreateNotificationConfigRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setNotificationConfig(notificationConfig)
            .build();
    return createNotificationConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a notification config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String parent = OrganizationName.of("[ORGANIZATION]").toString();
   *   NotificationConfig notificationConfig = NotificationConfig.newBuilder().build();
   *   NotificationConfig response =
   *       securityCenterClient.createNotificationConfig(parent, notificationConfig);
   * }
   * }</pre>
   *
   * @param parent Required. Resource name of the new notification config's parent. Its format is
   *     "organizations/[organization_id]".
   * @param notificationConfig Required. The notification config being created. The name and the
   *     service account will be ignored as they are both output only fields on this resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NotificationConfig createNotificationConfig(
      String parent, NotificationConfig notificationConfig) {
    CreateNotificationConfigRequest request =
        CreateNotificationConfigRequest.newBuilder()
            .setParent(parent)
            .setNotificationConfig(notificationConfig)
            .build();
    return createNotificationConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a notification config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   OrganizationName parent = OrganizationName.of("[ORGANIZATION]");
   *   String configId = "configId-580140035";
   *   NotificationConfig notificationConfig = NotificationConfig.newBuilder().build();
   *   NotificationConfig response =
   *       securityCenterClient.createNotificationConfig(parent, configId, notificationConfig);
   * }
   * }</pre>
   *
   * @param parent Required. Resource name of the new notification config's parent. Its format is
   *     "organizations/[organization_id]".
   * @param configId Required. Unique identifier provided by the client within the parent scope. It
   *     must be between 1 and 128 characters, and contains alphanumeric characters, underscores or
   *     hyphens only.
   * @param notificationConfig Required. The notification config being created. The name and the
   *     service account will be ignored as they are both output only fields on this resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NotificationConfig createNotificationConfig(
      OrganizationName parent, String configId, NotificationConfig notificationConfig) {
    CreateNotificationConfigRequest request =
        CreateNotificationConfigRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setConfigId(configId)
            .setNotificationConfig(notificationConfig)
            .build();
    return createNotificationConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a notification config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String parent = OrganizationName.of("[ORGANIZATION]").toString();
   *   String configId = "configId-580140035";
   *   NotificationConfig notificationConfig = NotificationConfig.newBuilder().build();
   *   NotificationConfig response =
   *       securityCenterClient.createNotificationConfig(parent, configId, notificationConfig);
   * }
   * }</pre>
   *
   * @param parent Required. Resource name of the new notification config's parent. Its format is
   *     "organizations/[organization_id]".
   * @param configId Required. Unique identifier provided by the client within the parent scope. It
   *     must be between 1 and 128 characters, and contains alphanumeric characters, underscores or
   *     hyphens only.
   * @param notificationConfig Required. The notification config being created. The name and the
   *     service account will be ignored as they are both output only fields on this resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NotificationConfig createNotificationConfig(
      String parent, String configId, NotificationConfig notificationConfig) {
    CreateNotificationConfigRequest request =
        CreateNotificationConfigRequest.newBuilder()
            .setParent(parent)
            .setConfigId(configId)
            .setNotificationConfig(notificationConfig)
            .build();
    return createNotificationConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a notification config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   CreateNotificationConfigRequest request =
   *       CreateNotificationConfigRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setConfigId("configId-580140035")
   *           .setNotificationConfig(NotificationConfig.newBuilder().build())
   *           .build();
   *   NotificationConfig response = securityCenterClient.createNotificationConfig(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NotificationConfig createNotificationConfig(
      CreateNotificationConfigRequest request) {
    return createNotificationConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a notification config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   CreateNotificationConfigRequest request =
   *       CreateNotificationConfigRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setConfigId("configId-580140035")
   *           .setNotificationConfig(NotificationConfig.newBuilder().build())
   *           .build();
   *   ApiFuture<NotificationConfig> future =
   *       securityCenterClient.createNotificationConfigCallable().futureCall(request);
   *   // Do something.
   *   NotificationConfig response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateNotificationConfigRequest, NotificationConfig>
      createNotificationConfigCallable() {
    return stub.createNotificationConfigCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a notification config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   NotificationConfigName name =
   *       NotificationConfigName.of("[ORGANIZATION]", "[NOTIFICATION_CONFIG]");
   *   securityCenterClient.deleteNotificationConfig(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the notification config to delete. Its format is
   *     "organizations/[organization_id]/notificationConfigs/[config_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteNotificationConfig(NotificationConfigName name) {
    DeleteNotificationConfigRequest request =
        DeleteNotificationConfigRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    deleteNotificationConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a notification config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String name = NotificationConfigName.of("[ORGANIZATION]", "[NOTIFICATION_CONFIG]").toString();
   *   securityCenterClient.deleteNotificationConfig(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the notification config to delete. Its format is
   *     "organizations/[organization_id]/notificationConfigs/[config_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteNotificationConfig(String name) {
    DeleteNotificationConfigRequest request =
        DeleteNotificationConfigRequest.newBuilder().setName(name).build();
    deleteNotificationConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a notification config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   DeleteNotificationConfigRequest request =
   *       DeleteNotificationConfigRequest.newBuilder()
   *           .setName(
   *               NotificationConfigName.of("[ORGANIZATION]", "[NOTIFICATION_CONFIG]").toString())
   *           .build();
   *   securityCenterClient.deleteNotificationConfig(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteNotificationConfig(DeleteNotificationConfigRequest request) {
    deleteNotificationConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a notification config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   DeleteNotificationConfigRequest request =
   *       DeleteNotificationConfigRequest.newBuilder()
   *           .setName(
   *               NotificationConfigName.of("[ORGANIZATION]", "[NOTIFICATION_CONFIG]").toString())
   *           .build();
   *   ApiFuture<Empty> future =
   *       securityCenterClient.deleteNotificationConfigCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteNotificationConfigRequest, Empty>
      deleteNotificationConfigCallable() {
    return stub.deleteNotificationConfigCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy on the specified Source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   ResourceName resource = SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]");
   *   Policy response = securityCenterClient.getIamPolicy(resource);
   * }
   * }</pre>
   *
   * @param resource REQUIRED: The resource for which the policy is being requested. See the
   *     operation documentation for the appropriate value for this field.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(ResourceName resource) {
    GetIamPolicyRequest request =
        GetIamPolicyRequest.newBuilder()
            .setResource(resource == null ? null : resource.toString())
            .build();
    return getIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy on the specified Source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String resource = FolderName.of("[FOLDER]").toString();
   *   Policy response = securityCenterClient.getIamPolicy(resource);
   * }
   * }</pre>
   *
   * @param resource REQUIRED: The resource for which the policy is being requested. See the
   *     operation documentation for the appropriate value for this field.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(String resource) {
    GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder().setResource(resource).build();
    return getIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy on the specified Source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   GetIamPolicyRequest request =
   *       GetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString())
   *           .setOptions(GetPolicyOptions.newBuilder().build())
   *           .build();
   *   Policy response = securityCenterClient.getIamPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(GetIamPolicyRequest request) {
    return getIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy on the specified Source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   GetIamPolicyRequest request =
   *       GetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString())
   *           .setOptions(GetPolicyOptions.newBuilder().build())
   *           .build();
   *   ApiFuture<Policy> future = securityCenterClient.getIamPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    return stub.getIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a notification config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   NotificationConfigName name =
   *       NotificationConfigName.of("[ORGANIZATION]", "[NOTIFICATION_CONFIG]");
   *   NotificationConfig response = securityCenterClient.getNotificationConfig(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the notification config to get. Its format is
   *     "organizations/[organization_id]/notificationConfigs/[config_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NotificationConfig getNotificationConfig(NotificationConfigName name) {
    GetNotificationConfigRequest request =
        GetNotificationConfigRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getNotificationConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a notification config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String name = NotificationConfigName.of("[ORGANIZATION]", "[NOTIFICATION_CONFIG]").toString();
   *   NotificationConfig response = securityCenterClient.getNotificationConfig(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the notification config to get. Its format is
   *     "organizations/[organization_id]/notificationConfigs/[config_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NotificationConfig getNotificationConfig(String name) {
    GetNotificationConfigRequest request =
        GetNotificationConfigRequest.newBuilder().setName(name).build();
    return getNotificationConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a notification config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   GetNotificationConfigRequest request =
   *       GetNotificationConfigRequest.newBuilder()
   *           .setName(
   *               NotificationConfigName.of("[ORGANIZATION]", "[NOTIFICATION_CONFIG]").toString())
   *           .build();
   *   NotificationConfig response = securityCenterClient.getNotificationConfig(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NotificationConfig getNotificationConfig(GetNotificationConfigRequest request) {
    return getNotificationConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a notification config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   GetNotificationConfigRequest request =
   *       GetNotificationConfigRequest.newBuilder()
   *           .setName(
   *               NotificationConfigName.of("[ORGANIZATION]", "[NOTIFICATION_CONFIG]").toString())
   *           .build();
   *   ApiFuture<NotificationConfig> future =
   *       securityCenterClient.getNotificationConfigCallable().futureCall(request);
   *   // Do something.
   *   NotificationConfig response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetNotificationConfigRequest, NotificationConfig>
      getNotificationConfigCallable() {
    return stub.getNotificationConfigCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the settings for an organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   OrganizationSettingsName name = OrganizationSettingsName.of("[ORGANIZATION]");
   *   OrganizationSettings response = securityCenterClient.getOrganizationSettings(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the organization to get organization settings for. Its format is
   *     "organizations/[organization_id]/organizationSettings".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OrganizationSettings getOrganizationSettings(OrganizationSettingsName name) {
    GetOrganizationSettingsRequest request =
        GetOrganizationSettingsRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getOrganizationSettings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the settings for an organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String name = OrganizationSettingsName.of("[ORGANIZATION]").toString();
   *   OrganizationSettings response = securityCenterClient.getOrganizationSettings(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the organization to get organization settings for. Its format is
   *     "organizations/[organization_id]/organizationSettings".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OrganizationSettings getOrganizationSettings(String name) {
    GetOrganizationSettingsRequest request =
        GetOrganizationSettingsRequest.newBuilder().setName(name).build();
    return getOrganizationSettings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the settings for an organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   GetOrganizationSettingsRequest request =
   *       GetOrganizationSettingsRequest.newBuilder()
   *           .setName(OrganizationSettingsName.of("[ORGANIZATION]").toString())
   *           .build();
   *   OrganizationSettings response = securityCenterClient.getOrganizationSettings(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OrganizationSettings getOrganizationSettings(
      GetOrganizationSettingsRequest request) {
    return getOrganizationSettingsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the settings for an organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   GetOrganizationSettingsRequest request =
   *       GetOrganizationSettingsRequest.newBuilder()
   *           .setName(OrganizationSettingsName.of("[ORGANIZATION]").toString())
   *           .build();
   *   ApiFuture<OrganizationSettings> future =
   *       securityCenterClient.getOrganizationSettingsCallable().futureCall(request);
   *   // Do something.
   *   OrganizationSettings response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetOrganizationSettingsRequest, OrganizationSettings>
      getOrganizationSettingsCallable() {
    return stub.getOrganizationSettingsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   SourceName name = SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]");
   *   Source response = securityCenterClient.getSource(name);
   * }
   * }</pre>
   *
   * @param name Required. Relative resource name of the source. Its format is
   *     "organizations/[organization_id]/source/[source_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Source getSource(SourceName name) {
    GetSourceRequest request =
        GetSourceRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getSource(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String name = SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString();
   *   Source response = securityCenterClient.getSource(name);
   * }
   * }</pre>
   *
   * @param name Required. Relative resource name of the source. Its format is
   *     "organizations/[organization_id]/source/[source_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Source getSource(String name) {
    GetSourceRequest request = GetSourceRequest.newBuilder().setName(name).build();
    return getSource(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   GetSourceRequest request =
   *       GetSourceRequest.newBuilder()
   *           .setName(SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString())
   *           .build();
   *   Source response = securityCenterClient.getSource(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Source getSource(GetSourceRequest request) {
    return getSourceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   GetSourceRequest request =
   *       GetSourceRequest.newBuilder()
   *           .setName(SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString())
   *           .build();
   *   ApiFuture<Source> future = securityCenterClient.getSourceCallable().futureCall(request);
   *   // Do something.
   *   Source response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetSourceRequest, Source> getSourceCallable() {
    return stub.getSourceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Filters an organization's assets and groups them by their specified properties.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   GroupAssetsRequest request =
   *       GroupAssetsRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setGroupBy("groupBy293428022")
   *           .setCompareDuration(Duration.newBuilder().build())
   *           .setReadTime(Timestamp.newBuilder().build())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   for (GroupResult element : securityCenterClient.groupAssets(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GroupAssetsPagedResponse groupAssets(GroupAssetsRequest request) {
    return groupAssetsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Filters an organization's assets and groups them by their specified properties.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   GroupAssetsRequest request =
   *       GroupAssetsRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setGroupBy("groupBy293428022")
   *           .setCompareDuration(Duration.newBuilder().build())
   *           .setReadTime(Timestamp.newBuilder().build())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   ApiFuture<GroupResult> future =
   *       securityCenterClient.groupAssetsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (GroupResult element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<GroupAssetsRequest, GroupAssetsPagedResponse>
      groupAssetsPagedCallable() {
    return stub.groupAssetsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Filters an organization's assets and groups them by their specified properties.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   GroupAssetsRequest request =
   *       GroupAssetsRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setGroupBy("groupBy293428022")
   *           .setCompareDuration(Duration.newBuilder().build())
   *           .setReadTime(Timestamp.newBuilder().build())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   while (true) {
   *     GroupAssetsResponse response = securityCenterClient.groupAssetsCallable().call(request);
   *     for (GroupResult element : response.getGroupByResultsList()) {
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
  public final UnaryCallable<GroupAssetsRequest, GroupAssetsResponse> groupAssetsCallable() {
    return stub.groupAssetsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Filters an organization or source's findings and groups them by their specified properties.
   *
   * <p>To group across all sources provide a `-` as the source id. Example:
   * /v1/organizations/{organization_id}/sources/-/findings,
   * /v1/folders/{folder_id}/sources/-/findings, /v1/projects/{project_id}/sources/-/findings
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   SourceName parent = SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]");
   *   String groupBy = "groupBy293428022";
   *   for (GroupResult element : securityCenterClient.groupFindings(parent, groupBy).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Name of the source to groupBy. Its format is
   *     "organizations/[organization_id]/sources/[source_id]",
   *     folders/[folder_id]/sources/[source_id], or projects/[project_id]/sources/[source_id]. To
   *     groupBy across all sources provide a source_id of `-`. For example:
   *     organizations/{organization_id}/sources/-, folders/{folder_id}/sources/-, or
   *     projects/{project_id}/sources/-
   * @param groupBy Required. Expression that defines what assets fields to use for grouping
   *     (including `state_change`). The string value should follow SQL syntax: comma separated list
   *     of fields. For example: "parent,resource_name".
   *     <p>The following fields are supported:
   *     <ul>
   *       <li>resource_name
   *       <li>category
   *       <li>state
   *       <li>parent
   *       <li>severity
   *     </ul>
   *     <p>The following fields are supported when compare_duration is set:
   *     <ul>
   *       <li>state_change
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GroupFindingsPagedResponse groupFindings(SourceName parent, String groupBy) {
    GroupFindingsRequest request =
        GroupFindingsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setGroupBy(groupBy)
            .build();
    return groupFindings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Filters an organization or source's findings and groups them by their specified properties.
   *
   * <p>To group across all sources provide a `-` as the source id. Example:
   * /v1/organizations/{organization_id}/sources/-/findings,
   * /v1/folders/{folder_id}/sources/-/findings, /v1/projects/{project_id}/sources/-/findings
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String parent = SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString();
   *   String groupBy = "groupBy293428022";
   *   for (GroupResult element : securityCenterClient.groupFindings(parent, groupBy).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Name of the source to groupBy. Its format is
   *     "organizations/[organization_id]/sources/[source_id]",
   *     folders/[folder_id]/sources/[source_id], or projects/[project_id]/sources/[source_id]. To
   *     groupBy across all sources provide a source_id of `-`. For example:
   *     organizations/{organization_id}/sources/-, folders/{folder_id}/sources/-, or
   *     projects/{project_id}/sources/-
   * @param groupBy Required. Expression that defines what assets fields to use for grouping
   *     (including `state_change`). The string value should follow SQL syntax: comma separated list
   *     of fields. For example: "parent,resource_name".
   *     <p>The following fields are supported:
   *     <ul>
   *       <li>resource_name
   *       <li>category
   *       <li>state
   *       <li>parent
   *       <li>severity
   *     </ul>
   *     <p>The following fields are supported when compare_duration is set:
   *     <ul>
   *       <li>state_change
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GroupFindingsPagedResponse groupFindings(String parent, String groupBy) {
    GroupFindingsRequest request =
        GroupFindingsRequest.newBuilder().setParent(parent).setGroupBy(groupBy).build();
    return groupFindings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Filters an organization or source's findings and groups them by their specified properties.
   *
   * <p>To group across all sources provide a `-` as the source id. Example:
   * /v1/organizations/{organization_id}/sources/-/findings,
   * /v1/folders/{folder_id}/sources/-/findings, /v1/projects/{project_id}/sources/-/findings
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   GroupFindingsRequest request =
   *       GroupFindingsRequest.newBuilder()
   *           .setParent(
   *               SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString())
   *           .setFilter("filter-1274492040")
   *           .setGroupBy("groupBy293428022")
   *           .setReadTime(Timestamp.newBuilder().build())
   *           .setCompareDuration(Duration.newBuilder().build())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   for (GroupResult element : securityCenterClient.groupFindings(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GroupFindingsPagedResponse groupFindings(GroupFindingsRequest request) {
    return groupFindingsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Filters an organization or source's findings and groups them by their specified properties.
   *
   * <p>To group across all sources provide a `-` as the source id. Example:
   * /v1/organizations/{organization_id}/sources/-/findings,
   * /v1/folders/{folder_id}/sources/-/findings, /v1/projects/{project_id}/sources/-/findings
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   GroupFindingsRequest request =
   *       GroupFindingsRequest.newBuilder()
   *           .setParent(
   *               SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString())
   *           .setFilter("filter-1274492040")
   *           .setGroupBy("groupBy293428022")
   *           .setReadTime(Timestamp.newBuilder().build())
   *           .setCompareDuration(Duration.newBuilder().build())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   ApiFuture<GroupResult> future =
   *       securityCenterClient.groupFindingsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (GroupResult element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<GroupFindingsRequest, GroupFindingsPagedResponse>
      groupFindingsPagedCallable() {
    return stub.groupFindingsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Filters an organization or source's findings and groups them by their specified properties.
   *
   * <p>To group across all sources provide a `-` as the source id. Example:
   * /v1/organizations/{organization_id}/sources/-/findings,
   * /v1/folders/{folder_id}/sources/-/findings, /v1/projects/{project_id}/sources/-/findings
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   GroupFindingsRequest request =
   *       GroupFindingsRequest.newBuilder()
   *           .setParent(
   *               SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString())
   *           .setFilter("filter-1274492040")
   *           .setGroupBy("groupBy293428022")
   *           .setReadTime(Timestamp.newBuilder().build())
   *           .setCompareDuration(Duration.newBuilder().build())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   while (true) {
   *     GroupFindingsResponse response = securityCenterClient.groupFindingsCallable().call(request);
   *     for (GroupResult element : response.getGroupByResultsList()) {
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
  public final UnaryCallable<GroupFindingsRequest, GroupFindingsResponse> groupFindingsCallable() {
    return stub.groupFindingsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists an organization's assets.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   FolderName parent = FolderName.of("[FOLDER]");
   *   for (ListAssetsResponse.ListAssetsResult element :
   *       securityCenterClient.listAssets(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Name of the organization assets should belong to. Its format is
   *     "organizations/[organization_id], folders/[folder_id], or projects/[project_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAssetsPagedResponse listAssets(FolderName parent) {
    ListAssetsRequest request =
        ListAssetsRequest.newBuilder().setParent(parent == null ? null : parent.toString()).build();
    return listAssets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists an organization's assets.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   OrganizationName parent = OrganizationName.of("[ORGANIZATION]");
   *   for (ListAssetsResponse.ListAssetsResult element :
   *       securityCenterClient.listAssets(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Name of the organization assets should belong to. Its format is
   *     "organizations/[organization_id], folders/[folder_id], or projects/[project_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAssetsPagedResponse listAssets(OrganizationName parent) {
    ListAssetsRequest request =
        ListAssetsRequest.newBuilder().setParent(parent == null ? null : parent.toString()).build();
    return listAssets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists an organization's assets.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   for (ListAssetsResponse.ListAssetsResult element :
   *       securityCenterClient.listAssets(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Name of the organization assets should belong to. Its format is
   *     "organizations/[organization_id], folders/[folder_id], or projects/[project_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAssetsPagedResponse listAssets(ProjectName parent) {
    ListAssetsRequest request =
        ListAssetsRequest.newBuilder().setParent(parent == null ? null : parent.toString()).build();
    return listAssets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists an organization's assets.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String parent = OrganizationName.of("[ORGANIZATION]").toString();
   *   for (ListAssetsResponse.ListAssetsResult element :
   *       securityCenterClient.listAssets(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Name of the organization assets should belong to. Its format is
   *     "organizations/[organization_id], folders/[folder_id], or projects/[project_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAssetsPagedResponse listAssets(String parent) {
    ListAssetsRequest request = ListAssetsRequest.newBuilder().setParent(parent).build();
    return listAssets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists an organization's assets.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   ListAssetsRequest request =
   *       ListAssetsRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .setReadTime(Timestamp.newBuilder().build())
   *           .setCompareDuration(Duration.newBuilder().build())
   *           .setFieldMask(FieldMask.newBuilder().build())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   for (ListAssetsResponse.ListAssetsResult element :
   *       securityCenterClient.listAssets(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAssetsPagedResponse listAssets(ListAssetsRequest request) {
    return listAssetsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists an organization's assets.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   ListAssetsRequest request =
   *       ListAssetsRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .setReadTime(Timestamp.newBuilder().build())
   *           .setCompareDuration(Duration.newBuilder().build())
   *           .setFieldMask(FieldMask.newBuilder().build())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   ApiFuture<ListAssetsResponse.ListAssetsResult> future =
   *       securityCenterClient.listAssetsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (ListAssetsResponse.ListAssetsResult element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListAssetsRequest, ListAssetsPagedResponse> listAssetsPagedCallable() {
    return stub.listAssetsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists an organization's assets.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   ListAssetsRequest request =
   *       ListAssetsRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .setReadTime(Timestamp.newBuilder().build())
   *           .setCompareDuration(Duration.newBuilder().build())
   *           .setFieldMask(FieldMask.newBuilder().build())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   while (true) {
   *     ListAssetsResponse response = securityCenterClient.listAssetsCallable().call(request);
   *     for (ListAssetsResponse.ListAssetsResult element : response.getListAssetsResultsList()) {
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
  public final UnaryCallable<ListAssetsRequest, ListAssetsResponse> listAssetsCallable() {
    return stub.listAssetsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists an organization or source's findings.
   *
   * <p>To list across all sources provide a `-` as the source id. Example:
   * /v1p1beta1/organizations/{organization_id}/sources/-/findings
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   SourceName parent = SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]");
   *   for (ListFindingsResponse.ListFindingsResult element :
   *       securityCenterClient.listFindings(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Name of the source the findings belong to. Its format is
   *     "organizations/[organization_id]/sources/[source_id],
   *     folders/[folder_id]/sources/[source_id], or projects/[project_id]/sources/[source_id]". To
   *     list across all sources provide a source_id of `-`. For example:
   *     organizations/{organization_id}/sources/-, folders/{folder_id}/sources/- or
   *     projects/{projects_id}/sources/-
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFindingsPagedResponse listFindings(SourceName parent) {
    ListFindingsRequest request =
        ListFindingsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listFindings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists an organization or source's findings.
   *
   * <p>To list across all sources provide a `-` as the source id. Example:
   * /v1p1beta1/organizations/{organization_id}/sources/-/findings
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String parent = SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString();
   *   for (ListFindingsResponse.ListFindingsResult element :
   *       securityCenterClient.listFindings(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Name of the source the findings belong to. Its format is
   *     "organizations/[organization_id]/sources/[source_id],
   *     folders/[folder_id]/sources/[source_id], or projects/[project_id]/sources/[source_id]". To
   *     list across all sources provide a source_id of `-`. For example:
   *     organizations/{organization_id}/sources/-, folders/{folder_id}/sources/- or
   *     projects/{projects_id}/sources/-
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFindingsPagedResponse listFindings(String parent) {
    ListFindingsRequest request = ListFindingsRequest.newBuilder().setParent(parent).build();
    return listFindings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists an organization or source's findings.
   *
   * <p>To list across all sources provide a `-` as the source id. Example:
   * /v1p1beta1/organizations/{organization_id}/sources/-/findings
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   ListFindingsRequest request =
   *       ListFindingsRequest.newBuilder()
   *           .setParent(
   *               SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString())
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .setReadTime(Timestamp.newBuilder().build())
   *           .setCompareDuration(Duration.newBuilder().build())
   *           .setFieldMask(FieldMask.newBuilder().build())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   for (ListFindingsResponse.ListFindingsResult element :
   *       securityCenterClient.listFindings(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFindingsPagedResponse listFindings(ListFindingsRequest request) {
    return listFindingsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists an organization or source's findings.
   *
   * <p>To list across all sources provide a `-` as the source id. Example:
   * /v1p1beta1/organizations/{organization_id}/sources/-/findings
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   ListFindingsRequest request =
   *       ListFindingsRequest.newBuilder()
   *           .setParent(
   *               SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString())
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .setReadTime(Timestamp.newBuilder().build())
   *           .setCompareDuration(Duration.newBuilder().build())
   *           .setFieldMask(FieldMask.newBuilder().build())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   ApiFuture<ListFindingsResponse.ListFindingsResult> future =
   *       securityCenterClient.listFindingsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (ListFindingsResponse.ListFindingsResult element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListFindingsRequest, ListFindingsPagedResponse>
      listFindingsPagedCallable() {
    return stub.listFindingsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists an organization or source's findings.
   *
   * <p>To list across all sources provide a `-` as the source id. Example:
   * /v1p1beta1/organizations/{organization_id}/sources/-/findings
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   ListFindingsRequest request =
   *       ListFindingsRequest.newBuilder()
   *           .setParent(
   *               SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString())
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .setReadTime(Timestamp.newBuilder().build())
   *           .setCompareDuration(Duration.newBuilder().build())
   *           .setFieldMask(FieldMask.newBuilder().build())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   while (true) {
   *     ListFindingsResponse response = securityCenterClient.listFindingsCallable().call(request);
   *     for (ListFindingsResponse.ListFindingsResult element :
   *         response.getListFindingsResultsList()) {
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
  public final UnaryCallable<ListFindingsRequest, ListFindingsResponse> listFindingsCallable() {
    return stub.listFindingsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists notification configs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   OrganizationName parent = OrganizationName.of("[ORGANIZATION]");
   *   for (NotificationConfig element :
   *       securityCenterClient.listNotificationConfigs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Name of the organization to list notification configs. Its format is
   *     "organizations/[organization_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNotificationConfigsPagedResponse listNotificationConfigs(
      OrganizationName parent) {
    ListNotificationConfigsRequest request =
        ListNotificationConfigsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listNotificationConfigs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists notification configs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String parent = OrganizationName.of("[ORGANIZATION]").toString();
   *   for (NotificationConfig element :
   *       securityCenterClient.listNotificationConfigs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Name of the organization to list notification configs. Its format is
   *     "organizations/[organization_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNotificationConfigsPagedResponse listNotificationConfigs(String parent) {
    ListNotificationConfigsRequest request =
        ListNotificationConfigsRequest.newBuilder().setParent(parent).build();
    return listNotificationConfigs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists notification configs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   ListNotificationConfigsRequest request =
   *       ListNotificationConfigsRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   for (NotificationConfig element :
   *       securityCenterClient.listNotificationConfigs(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNotificationConfigsPagedResponse listNotificationConfigs(
      ListNotificationConfigsRequest request) {
    return listNotificationConfigsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists notification configs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   ListNotificationConfigsRequest request =
   *       ListNotificationConfigsRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   ApiFuture<NotificationConfig> future =
   *       securityCenterClient.listNotificationConfigsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (NotificationConfig element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListNotificationConfigsRequest, ListNotificationConfigsPagedResponse>
      listNotificationConfigsPagedCallable() {
    return stub.listNotificationConfigsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists notification configs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   ListNotificationConfigsRequest request =
   *       ListNotificationConfigsRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   while (true) {
   *     ListNotificationConfigsResponse response =
   *         securityCenterClient.listNotificationConfigsCallable().call(request);
   *     for (NotificationConfig element : response.getNotificationConfigsList()) {
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
  public final UnaryCallable<ListNotificationConfigsRequest, ListNotificationConfigsResponse>
      listNotificationConfigsCallable() {
    return stub.listNotificationConfigsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all sources belonging to an organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   FolderName parent = FolderName.of("[FOLDER]");
   *   for (Source element : securityCenterClient.listSources(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Resource name of the parent of sources to list. Its format should be
   *     "organizations/[organization_id], folders/[folder_id], or projects/[project_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSourcesPagedResponse listSources(FolderName parent) {
    ListSourcesRequest request =
        ListSourcesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listSources(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all sources belonging to an organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   OrganizationName parent = OrganizationName.of("[ORGANIZATION]");
   *   for (Source element : securityCenterClient.listSources(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Resource name of the parent of sources to list. Its format should be
   *     "organizations/[organization_id], folders/[folder_id], or projects/[project_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSourcesPagedResponse listSources(OrganizationName parent) {
    ListSourcesRequest request =
        ListSourcesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listSources(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all sources belonging to an organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   for (Source element : securityCenterClient.listSources(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Resource name of the parent of sources to list. Its format should be
   *     "organizations/[organization_id], folders/[folder_id], or projects/[project_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSourcesPagedResponse listSources(ProjectName parent) {
    ListSourcesRequest request =
        ListSourcesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listSources(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all sources belonging to an organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String parent = OrganizationName.of("[ORGANIZATION]").toString();
   *   for (Source element : securityCenterClient.listSources(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Resource name of the parent of sources to list. Its format should be
   *     "organizations/[organization_id], folders/[folder_id], or projects/[project_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSourcesPagedResponse listSources(String parent) {
    ListSourcesRequest request = ListSourcesRequest.newBuilder().setParent(parent).build();
    return listSources(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all sources belonging to an organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   ListSourcesRequest request =
   *       ListSourcesRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   for (Source element : securityCenterClient.listSources(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSourcesPagedResponse listSources(ListSourcesRequest request) {
    return listSourcesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all sources belonging to an organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   ListSourcesRequest request =
   *       ListSourcesRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   ApiFuture<Source> future =
   *       securityCenterClient.listSourcesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Source element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListSourcesRequest, ListSourcesPagedResponse>
      listSourcesPagedCallable() {
    return stub.listSourcesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all sources belonging to an organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   ListSourcesRequest request =
   *       ListSourcesRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   while (true) {
   *     ListSourcesResponse response = securityCenterClient.listSourcesCallable().call(request);
   *     for (Source element : response.getSourcesList()) {
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
  public final UnaryCallable<ListSourcesRequest, ListSourcesResponse> listSourcesCallable() {
    return stub.listSourcesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Runs asset discovery. The discovery is tracked with a long-running operation.
   *
   * <p>This API can only be called with limited frequency for an organization. If it is called too
   * frequently the caller will receive a TOO_MANY_REQUESTS error.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   OrganizationName parent = OrganizationName.of("[ORGANIZATION]");
   *   RunAssetDiscoveryResponse response =
   *       securityCenterClient.runAssetDiscoveryAsync(parent).get();
   * }
   * }</pre>
   *
   * @param parent Required. Name of the organization to run asset discovery for. Its format is
   *     "organizations/[organization_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<RunAssetDiscoveryResponse, Empty> runAssetDiscoveryAsync(
      OrganizationName parent) {
    RunAssetDiscoveryRequest request =
        RunAssetDiscoveryRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return runAssetDiscoveryAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Runs asset discovery. The discovery is tracked with a long-running operation.
   *
   * <p>This API can only be called with limited frequency for an organization. If it is called too
   * frequently the caller will receive a TOO_MANY_REQUESTS error.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String parent = OrganizationName.of("[ORGANIZATION]").toString();
   *   RunAssetDiscoveryResponse response =
   *       securityCenterClient.runAssetDiscoveryAsync(parent).get();
   * }
   * }</pre>
   *
   * @param parent Required. Name of the organization to run asset discovery for. Its format is
   *     "organizations/[organization_id]".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<RunAssetDiscoveryResponse, Empty> runAssetDiscoveryAsync(
      String parent) {
    RunAssetDiscoveryRequest request =
        RunAssetDiscoveryRequest.newBuilder().setParent(parent).build();
    return runAssetDiscoveryAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Runs asset discovery. The discovery is tracked with a long-running operation.
   *
   * <p>This API can only be called with limited frequency for an organization. If it is called too
   * frequently the caller will receive a TOO_MANY_REQUESTS error.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   RunAssetDiscoveryRequest request =
   *       RunAssetDiscoveryRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .build();
   *   RunAssetDiscoveryResponse response =
   *       securityCenterClient.runAssetDiscoveryAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<RunAssetDiscoveryResponse, Empty> runAssetDiscoveryAsync(
      RunAssetDiscoveryRequest request) {
    return runAssetDiscoveryOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Runs asset discovery. The discovery is tracked with a long-running operation.
   *
   * <p>This API can only be called with limited frequency for an organization. If it is called too
   * frequently the caller will receive a TOO_MANY_REQUESTS error.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   RunAssetDiscoveryRequest request =
   *       RunAssetDiscoveryRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .build();
   *   OperationFuture<RunAssetDiscoveryResponse, Empty> future =
   *       securityCenterClient.runAssetDiscoveryOperationCallable().futureCall(request);
   *   // Do something.
   *   RunAssetDiscoveryResponse response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<RunAssetDiscoveryRequest, RunAssetDiscoveryResponse, Empty>
      runAssetDiscoveryOperationCallable() {
    return stub.runAssetDiscoveryOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Runs asset discovery. The discovery is tracked with a long-running operation.
   *
   * <p>This API can only be called with limited frequency for an organization. If it is called too
   * frequently the caller will receive a TOO_MANY_REQUESTS error.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   RunAssetDiscoveryRequest request =
   *       RunAssetDiscoveryRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       securityCenterClient.runAssetDiscoveryCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<RunAssetDiscoveryRequest, Operation> runAssetDiscoveryCallable() {
    return stub.runAssetDiscoveryCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the state of a finding.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   FindingName name =
   *       FindingName.ofOrganizationSourceFindingName("[ORGANIZATION]", "[SOURCE]", "[FINDING]");
   *   Finding.State state = Finding.State.forNumber(0);
   *   Timestamp startTime = Timestamp.newBuilder().build();
   *   Finding response = securityCenterClient.setFindingState(name, state, startTime);
   * }
   * }</pre>
   *
   * @param name Required. The relative resource name of the finding. See:
   *     https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   *     "organizations/{organization_id}/sources/{source_id}/finding/{finding_id}".
   * @param state Required. The desired State of the finding.
   * @param startTime Required. The time at which the updated state takes effect.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding setFindingState(FindingName name, Finding.State state, Timestamp startTime) {
    SetFindingStateRequest request =
        SetFindingStateRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setState(state)
            .setStartTime(startTime)
            .build();
    return setFindingState(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the state of a finding.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String name =
   *       FindingName.ofOrganizationSourceFindingName("[ORGANIZATION]", "[SOURCE]", "[FINDING]")
   *           .toString();
   *   Finding.State state = Finding.State.forNumber(0);
   *   Timestamp startTime = Timestamp.newBuilder().build();
   *   Finding response = securityCenterClient.setFindingState(name, state, startTime);
   * }
   * }</pre>
   *
   * @param name Required. The relative resource name of the finding. See:
   *     https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   *     "organizations/{organization_id}/sources/{source_id}/finding/{finding_id}".
   * @param state Required. The desired State of the finding.
   * @param startTime Required. The time at which the updated state takes effect.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding setFindingState(String name, Finding.State state, Timestamp startTime) {
    SetFindingStateRequest request =
        SetFindingStateRequest.newBuilder()
            .setName(name)
            .setState(state)
            .setStartTime(startTime)
            .build();
    return setFindingState(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the state of a finding.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   SetFindingStateRequest request =
   *       SetFindingStateRequest.newBuilder()
   *           .setName(
   *               FindingName.ofOrganizationSourceFindingName(
   *                       "[ORGANIZATION]", "[SOURCE]", "[FINDING]")
   *                   .toString())
   *           .setStartTime(Timestamp.newBuilder().build())
   *           .build();
   *   Finding response = securityCenterClient.setFindingState(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding setFindingState(SetFindingStateRequest request) {
    return setFindingStateCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the state of a finding.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   SetFindingStateRequest request =
   *       SetFindingStateRequest.newBuilder()
   *           .setName(
   *               FindingName.ofOrganizationSourceFindingName(
   *                       "[ORGANIZATION]", "[SOURCE]", "[FINDING]")
   *                   .toString())
   *           .setStartTime(Timestamp.newBuilder().build())
   *           .build();
   *   ApiFuture<Finding> future =
   *       securityCenterClient.setFindingStateCallable().futureCall(request);
   *   // Do something.
   *   Finding response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SetFindingStateRequest, Finding> setFindingStateCallable() {
    return stub.setFindingStateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified Source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   ResourceName resource = SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]");
   *   Policy policy = Policy.newBuilder().build();
   *   Policy response = securityCenterClient.setIamPolicy(resource, policy);
   * }
   * }</pre>
   *
   * @param resource REQUIRED: The resource for which the policy is being specified. See the
   *     operation documentation for the appropriate value for this field.
   * @param policy REQUIRED: The complete policy to be applied to the `resource`. The size of the
   *     policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud
   *     Platform services (such as Projects) might reject them.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(ResourceName resource, Policy policy) {
    SetIamPolicyRequest request =
        SetIamPolicyRequest.newBuilder()
            .setResource(resource == null ? null : resource.toString())
            .setPolicy(policy)
            .build();
    return setIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified Source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String resource = FolderName.of("[FOLDER]").toString();
   *   Policy policy = Policy.newBuilder().build();
   *   Policy response = securityCenterClient.setIamPolicy(resource, policy);
   * }
   * }</pre>
   *
   * @param resource REQUIRED: The resource for which the policy is being specified. See the
   *     operation documentation for the appropriate value for this field.
   * @param policy REQUIRED: The complete policy to be applied to the `resource`. The size of the
   *     policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud
   *     Platform services (such as Projects) might reject them.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(String resource, Policy policy) {
    SetIamPolicyRequest request =
        SetIamPolicyRequest.newBuilder().setResource(resource).setPolicy(policy).build();
    return setIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified Source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   SetIamPolicyRequest request =
   *       SetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString())
   *           .setPolicy(Policy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Policy response = securityCenterClient.setIamPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(SetIamPolicyRequest request) {
    return setIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified Source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   SetIamPolicyRequest request =
   *       SetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString())
   *           .setPolicy(Policy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Policy> future = securityCenterClient.setIamPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    return stub.setIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the permissions that a caller has on the specified source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   ResourceName resource = SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]");
   *   List<String> permissions = new ArrayList<>();
   *   TestIamPermissionsResponse response =
   *       securityCenterClient.testIamPermissions(resource, permissions);
   * }
   * }</pre>
   *
   * @param resource REQUIRED: The resource for which the policy detail is being requested. See the
   *     operation documentation for the appropriate value for this field.
   * @param permissions The set of permissions to check for the `resource`. Permissions with
   *     wildcards (such as '&#42;' or 'storage.&#42;') are not allowed. For more information see
   *     [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestIamPermissionsResponse testIamPermissions(
      ResourceName resource, List<String> permissions) {
    TestIamPermissionsRequest request =
        TestIamPermissionsRequest.newBuilder()
            .setResource(resource == null ? null : resource.toString())
            .addAllPermissions(permissions)
            .build();
    return testIamPermissions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the permissions that a caller has on the specified source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   String resource = FolderName.of("[FOLDER]").toString();
   *   List<String> permissions = new ArrayList<>();
   *   TestIamPermissionsResponse response =
   *       securityCenterClient.testIamPermissions(resource, permissions);
   * }
   * }</pre>
   *
   * @param resource REQUIRED: The resource for which the policy detail is being requested. See the
   *     operation documentation for the appropriate value for this field.
   * @param permissions The set of permissions to check for the `resource`. Permissions with
   *     wildcards (such as '&#42;' or 'storage.&#42;') are not allowed. For more information see
   *     [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestIamPermissionsResponse testIamPermissions(
      String resource, List<String> permissions) {
    TestIamPermissionsRequest request =
        TestIamPermissionsRequest.newBuilder()
            .setResource(resource)
            .addAllPermissions(permissions)
            .build();
    return testIamPermissions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the permissions that a caller has on the specified source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   TestIamPermissionsRequest request =
   *       TestIamPermissionsRequest.newBuilder()
   *           .setResource(
   *               SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString())
   *           .addAllPermissions(new ArrayList<String>())
   *           .build();
   *   TestIamPermissionsResponse response = securityCenterClient.testIamPermissions(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestIamPermissionsResponse testIamPermissions(TestIamPermissionsRequest request) {
    return testIamPermissionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the permissions that a caller has on the specified source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   TestIamPermissionsRequest request =
   *       TestIamPermissionsRequest.newBuilder()
   *           .setResource(
   *               SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString())
   *           .addAllPermissions(new ArrayList<String>())
   *           .build();
   *   ApiFuture<TestIamPermissionsResponse> future =
   *       securityCenterClient.testIamPermissionsCallable().futureCall(request);
   *   // Do something.
   *   TestIamPermissionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return stub.testIamPermissionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates a finding. The corresponding source must exist for a finding creation to
   * succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   Finding finding = Finding.newBuilder().build();
   *   Finding response = securityCenterClient.updateFinding(finding);
   * }
   * }</pre>
   *
   * @param finding Required. The finding resource to update or create if it does not already exist.
   *     parent, security_marks, and update_time will be ignored.
   *     <p>In the case of creation, the finding id portion of the name must be alphanumeric and
   *     less than or equal to 32 characters and greater than 0 characters in length.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding updateFinding(Finding finding) {
    UpdateFindingRequest request = UpdateFindingRequest.newBuilder().setFinding(finding).build();
    return updateFinding(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates a finding. The corresponding source must exist for a finding creation to
   * succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   Finding finding = Finding.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Finding response = securityCenterClient.updateFinding(finding, updateMask);
   * }
   * }</pre>
   *
   * @param finding Required. The finding resource to update or create if it does not already exist.
   *     parent, security_marks, and update_time will be ignored.
   *     <p>In the case of creation, the finding id portion of the name must be alphanumeric and
   *     less than or equal to 32 characters and greater than 0 characters in length.
   * @param updateMask The FieldMask to use when updating the finding resource. This field should
   *     not be specified when creating a finding.
   *     <p>When updating a finding, an empty mask is treated as updating all mutable fields and
   *     replacing source_properties. Individual source_properties can be added/updated by using
   *     "source_properties.&lt;property key&gt;" in the field mask.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding updateFinding(Finding finding, FieldMask updateMask) {
    UpdateFindingRequest request =
        UpdateFindingRequest.newBuilder().setFinding(finding).setUpdateMask(updateMask).build();
    return updateFinding(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates a finding. The corresponding source must exist for a finding creation to
   * succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   UpdateFindingRequest request =
   *       UpdateFindingRequest.newBuilder()
   *           .setFinding(Finding.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Finding response = securityCenterClient.updateFinding(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding updateFinding(UpdateFindingRequest request) {
    return updateFindingCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates a finding. The corresponding source must exist for a finding creation to
   * succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   UpdateFindingRequest request =
   *       UpdateFindingRequest.newBuilder()
   *           .setFinding(Finding.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Finding> future = securityCenterClient.updateFindingCallable().futureCall(request);
   *   // Do something.
   *   Finding response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateFindingRequest, Finding> updateFindingCallable() {
    return stub.updateFindingCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a notification config. The following update fields are allowed: description,
   * pubsub_topic, streaming_config.filter
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   NotificationConfig notificationConfig = NotificationConfig.newBuilder().build();
   *   NotificationConfig response =
   *       securityCenterClient.updateNotificationConfig(notificationConfig);
   * }
   * }</pre>
   *
   * @param notificationConfig Required. The notification config to update.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NotificationConfig updateNotificationConfig(NotificationConfig notificationConfig) {
    UpdateNotificationConfigRequest request =
        UpdateNotificationConfigRequest.newBuilder()
            .setNotificationConfig(notificationConfig)
            .build();
    return updateNotificationConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a notification config. The following update fields are allowed: description,
   * pubsub_topic, streaming_config.filter
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   NotificationConfig notificationConfig = NotificationConfig.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   NotificationConfig response =
   *       securityCenterClient.updateNotificationConfig(notificationConfig, updateMask);
   * }
   * }</pre>
   *
   * @param notificationConfig Required. The notification config to update.
   * @param updateMask The FieldMask to use when updating the notification config.
   *     <p>If empty all mutable fields will be updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NotificationConfig updateNotificationConfig(
      NotificationConfig notificationConfig, FieldMask updateMask) {
    UpdateNotificationConfigRequest request =
        UpdateNotificationConfigRequest.newBuilder()
            .setNotificationConfig(notificationConfig)
            .setUpdateMask(updateMask)
            .build();
    return updateNotificationConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a notification config. The following update fields are allowed: description,
   * pubsub_topic, streaming_config.filter
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   UpdateNotificationConfigRequest request =
   *       UpdateNotificationConfigRequest.newBuilder()
   *           .setNotificationConfig(NotificationConfig.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   NotificationConfig response = securityCenterClient.updateNotificationConfig(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NotificationConfig updateNotificationConfig(
      UpdateNotificationConfigRequest request) {
    return updateNotificationConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a notification config. The following update fields are allowed: description,
   * pubsub_topic, streaming_config.filter
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   UpdateNotificationConfigRequest request =
   *       UpdateNotificationConfigRequest.newBuilder()
   *           .setNotificationConfig(NotificationConfig.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<NotificationConfig> future =
   *       securityCenterClient.updateNotificationConfigCallable().futureCall(request);
   *   // Do something.
   *   NotificationConfig response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateNotificationConfigRequest, NotificationConfig>
      updateNotificationConfigCallable() {
    return stub.updateNotificationConfigCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an organization's settings.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   OrganizationSettings organizationSettings = OrganizationSettings.newBuilder().build();
   *   OrganizationSettings response =
   *       securityCenterClient.updateOrganizationSettings(organizationSettings);
   * }
   * }</pre>
   *
   * @param organizationSettings Required. The organization settings resource to update.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OrganizationSettings updateOrganizationSettings(
      OrganizationSettings organizationSettings) {
    UpdateOrganizationSettingsRequest request =
        UpdateOrganizationSettingsRequest.newBuilder()
            .setOrganizationSettings(organizationSettings)
            .build();
    return updateOrganizationSettings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an organization's settings.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   UpdateOrganizationSettingsRequest request =
   *       UpdateOrganizationSettingsRequest.newBuilder()
   *           .setOrganizationSettings(OrganizationSettings.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   OrganizationSettings response = securityCenterClient.updateOrganizationSettings(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OrganizationSettings updateOrganizationSettings(
      UpdateOrganizationSettingsRequest request) {
    return updateOrganizationSettingsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an organization's settings.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   UpdateOrganizationSettingsRequest request =
   *       UpdateOrganizationSettingsRequest.newBuilder()
   *           .setOrganizationSettings(OrganizationSettings.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<OrganizationSettings> future =
   *       securityCenterClient.updateOrganizationSettingsCallable().futureCall(request);
   *   // Do something.
   *   OrganizationSettings response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateOrganizationSettingsRequest, OrganizationSettings>
      updateOrganizationSettingsCallable() {
    return stub.updateOrganizationSettingsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   Source source = Source.newBuilder().build();
   *   Source response = securityCenterClient.updateSource(source);
   * }
   * }</pre>
   *
   * @param source Required. The source resource to update.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Source updateSource(Source source) {
    UpdateSourceRequest request = UpdateSourceRequest.newBuilder().setSource(source).build();
    return updateSource(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   Source source = Source.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Source response = securityCenterClient.updateSource(source, updateMask);
   * }
   * }</pre>
   *
   * @param source Required. The source resource to update.
   * @param updateMask The FieldMask to use when updating the source resource.
   *     <p>If empty all mutable fields will be updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Source updateSource(Source source, FieldMask updateMask) {
    UpdateSourceRequest request =
        UpdateSourceRequest.newBuilder().setSource(source).setUpdateMask(updateMask).build();
    return updateSource(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   UpdateSourceRequest request =
   *       UpdateSourceRequest.newBuilder()
   *           .setSource(Source.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Source response = securityCenterClient.updateSource(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Source updateSource(UpdateSourceRequest request) {
    return updateSourceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a source.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   UpdateSourceRequest request =
   *       UpdateSourceRequest.newBuilder()
   *           .setSource(Source.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Source> future = securityCenterClient.updateSourceCallable().futureCall(request);
   *   // Do something.
   *   Source response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateSourceRequest, Source> updateSourceCallable() {
    return stub.updateSourceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates security marks.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   SecurityMarks securityMarks = SecurityMarks.newBuilder().build();
   *   SecurityMarks response = securityCenterClient.updateSecurityMarks(securityMarks);
   * }
   * }</pre>
   *
   * @param securityMarks Required. The security marks resource to update.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SecurityMarks updateSecurityMarks(SecurityMarks securityMarks) {
    UpdateSecurityMarksRequest request =
        UpdateSecurityMarksRequest.newBuilder().setSecurityMarks(securityMarks).build();
    return updateSecurityMarks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates security marks.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   SecurityMarks securityMarks = SecurityMarks.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   SecurityMarks response = securityCenterClient.updateSecurityMarks(securityMarks, updateMask);
   * }
   * }</pre>
   *
   * @param securityMarks Required. The security marks resource to update.
   * @param updateMask The FieldMask to use when updating the security marks resource.
   *     <p>The field mask must not contain duplicate fields. If empty or set to "marks", all marks
   *     will be replaced. Individual marks can be updated using "marks.&lt;mark_key&gt;".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SecurityMarks updateSecurityMarks(
      SecurityMarks securityMarks, FieldMask updateMask) {
    UpdateSecurityMarksRequest request =
        UpdateSecurityMarksRequest.newBuilder()
            .setSecurityMarks(securityMarks)
            .setUpdateMask(updateMask)
            .build();
    return updateSecurityMarks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates security marks.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   UpdateSecurityMarksRequest request =
   *       UpdateSecurityMarksRequest.newBuilder()
   *           .setSecurityMarks(SecurityMarks.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setStartTime(Timestamp.newBuilder().build())
   *           .build();
   *   SecurityMarks response = securityCenterClient.updateSecurityMarks(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SecurityMarks updateSecurityMarks(UpdateSecurityMarksRequest request) {
    return updateSecurityMarksCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates security marks.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
   *   UpdateSecurityMarksRequest request =
   *       UpdateSecurityMarksRequest.newBuilder()
   *           .setSecurityMarks(SecurityMarks.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setStartTime(Timestamp.newBuilder().build())
   *           .build();
   *   ApiFuture<SecurityMarks> future =
   *       securityCenterClient.updateSecurityMarksCallable().futureCall(request);
   *   // Do something.
   *   SecurityMarks response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateSecurityMarksRequest, SecurityMarks>
      updateSecurityMarksCallable() {
    return stub.updateSecurityMarksCallable();
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

  public static class GroupAssetsPagedResponse
      extends AbstractPagedListResponse<
          GroupAssetsRequest,
          GroupAssetsResponse,
          GroupResult,
          GroupAssetsPage,
          GroupAssetsFixedSizeCollection> {

    public static ApiFuture<GroupAssetsPagedResponse> createAsync(
        PageContext<GroupAssetsRequest, GroupAssetsResponse, GroupResult> context,
        ApiFuture<GroupAssetsResponse> futureResponse) {
      ApiFuture<GroupAssetsPage> futurePage =
          GroupAssetsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new GroupAssetsPagedResponse(input), MoreExecutors.directExecutor());
    }

    private GroupAssetsPagedResponse(GroupAssetsPage page) {
      super(page, GroupAssetsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class GroupAssetsPage
      extends AbstractPage<GroupAssetsRequest, GroupAssetsResponse, GroupResult, GroupAssetsPage> {

    private GroupAssetsPage(
        PageContext<GroupAssetsRequest, GroupAssetsResponse, GroupResult> context,
        GroupAssetsResponse response) {
      super(context, response);
    }

    private static GroupAssetsPage createEmptyPage() {
      return new GroupAssetsPage(null, null);
    }

    @Override
    protected GroupAssetsPage createPage(
        PageContext<GroupAssetsRequest, GroupAssetsResponse, GroupResult> context,
        GroupAssetsResponse response) {
      return new GroupAssetsPage(context, response);
    }

    @Override
    public ApiFuture<GroupAssetsPage> createPageAsync(
        PageContext<GroupAssetsRequest, GroupAssetsResponse, GroupResult> context,
        ApiFuture<GroupAssetsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class GroupAssetsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          GroupAssetsRequest,
          GroupAssetsResponse,
          GroupResult,
          GroupAssetsPage,
          GroupAssetsFixedSizeCollection> {

    private GroupAssetsFixedSizeCollection(List<GroupAssetsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static GroupAssetsFixedSizeCollection createEmptyCollection() {
      return new GroupAssetsFixedSizeCollection(null, 0);
    }

    @Override
    protected GroupAssetsFixedSizeCollection createCollection(
        List<GroupAssetsPage> pages, int collectionSize) {
      return new GroupAssetsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class GroupFindingsPagedResponse
      extends AbstractPagedListResponse<
          GroupFindingsRequest,
          GroupFindingsResponse,
          GroupResult,
          GroupFindingsPage,
          GroupFindingsFixedSizeCollection> {

    public static ApiFuture<GroupFindingsPagedResponse> createAsync(
        PageContext<GroupFindingsRequest, GroupFindingsResponse, GroupResult> context,
        ApiFuture<GroupFindingsResponse> futureResponse) {
      ApiFuture<GroupFindingsPage> futurePage =
          GroupFindingsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new GroupFindingsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private GroupFindingsPagedResponse(GroupFindingsPage page) {
      super(page, GroupFindingsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class GroupFindingsPage
      extends AbstractPage<
          GroupFindingsRequest, GroupFindingsResponse, GroupResult, GroupFindingsPage> {

    private GroupFindingsPage(
        PageContext<GroupFindingsRequest, GroupFindingsResponse, GroupResult> context,
        GroupFindingsResponse response) {
      super(context, response);
    }

    private static GroupFindingsPage createEmptyPage() {
      return new GroupFindingsPage(null, null);
    }

    @Override
    protected GroupFindingsPage createPage(
        PageContext<GroupFindingsRequest, GroupFindingsResponse, GroupResult> context,
        GroupFindingsResponse response) {
      return new GroupFindingsPage(context, response);
    }

    @Override
    public ApiFuture<GroupFindingsPage> createPageAsync(
        PageContext<GroupFindingsRequest, GroupFindingsResponse, GroupResult> context,
        ApiFuture<GroupFindingsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class GroupFindingsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          GroupFindingsRequest,
          GroupFindingsResponse,
          GroupResult,
          GroupFindingsPage,
          GroupFindingsFixedSizeCollection> {

    private GroupFindingsFixedSizeCollection(List<GroupFindingsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static GroupFindingsFixedSizeCollection createEmptyCollection() {
      return new GroupFindingsFixedSizeCollection(null, 0);
    }

    @Override
    protected GroupFindingsFixedSizeCollection createCollection(
        List<GroupFindingsPage> pages, int collectionSize) {
      return new GroupFindingsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListAssetsPagedResponse
      extends AbstractPagedListResponse<
          ListAssetsRequest,
          ListAssetsResponse,
          ListAssetsResponse.ListAssetsResult,
          ListAssetsPage,
          ListAssetsFixedSizeCollection> {

    public static ApiFuture<ListAssetsPagedResponse> createAsync(
        PageContext<ListAssetsRequest, ListAssetsResponse, ListAssetsResponse.ListAssetsResult>
            context,
        ApiFuture<ListAssetsResponse> futureResponse) {
      ApiFuture<ListAssetsPage> futurePage =
          ListAssetsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new ListAssetsPagedResponse(input), MoreExecutors.directExecutor());
    }

    private ListAssetsPagedResponse(ListAssetsPage page) {
      super(page, ListAssetsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListAssetsPage
      extends AbstractPage<
          ListAssetsRequest,
          ListAssetsResponse,
          ListAssetsResponse.ListAssetsResult,
          ListAssetsPage> {

    private ListAssetsPage(
        PageContext<ListAssetsRequest, ListAssetsResponse, ListAssetsResponse.ListAssetsResult>
            context,
        ListAssetsResponse response) {
      super(context, response);
    }

    private static ListAssetsPage createEmptyPage() {
      return new ListAssetsPage(null, null);
    }

    @Override
    protected ListAssetsPage createPage(
        PageContext<ListAssetsRequest, ListAssetsResponse, ListAssetsResponse.ListAssetsResult>
            context,
        ListAssetsResponse response) {
      return new ListAssetsPage(context, response);
    }

    @Override
    public ApiFuture<ListAssetsPage> createPageAsync(
        PageContext<ListAssetsRequest, ListAssetsResponse, ListAssetsResponse.ListAssetsResult>
            context,
        ApiFuture<ListAssetsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListAssetsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListAssetsRequest,
          ListAssetsResponse,
          ListAssetsResponse.ListAssetsResult,
          ListAssetsPage,
          ListAssetsFixedSizeCollection> {

    private ListAssetsFixedSizeCollection(List<ListAssetsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListAssetsFixedSizeCollection createEmptyCollection() {
      return new ListAssetsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListAssetsFixedSizeCollection createCollection(
        List<ListAssetsPage> pages, int collectionSize) {
      return new ListAssetsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListFindingsPagedResponse
      extends AbstractPagedListResponse<
          ListFindingsRequest,
          ListFindingsResponse,
          ListFindingsResponse.ListFindingsResult,
          ListFindingsPage,
          ListFindingsFixedSizeCollection> {

    public static ApiFuture<ListFindingsPagedResponse> createAsync(
        PageContext<
                ListFindingsRequest, ListFindingsResponse, ListFindingsResponse.ListFindingsResult>
            context,
        ApiFuture<ListFindingsResponse> futureResponse) {
      ApiFuture<ListFindingsPage> futurePage =
          ListFindingsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListFindingsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListFindingsPagedResponse(ListFindingsPage page) {
      super(page, ListFindingsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListFindingsPage
      extends AbstractPage<
          ListFindingsRequest,
          ListFindingsResponse,
          ListFindingsResponse.ListFindingsResult,
          ListFindingsPage> {

    private ListFindingsPage(
        PageContext<
                ListFindingsRequest, ListFindingsResponse, ListFindingsResponse.ListFindingsResult>
            context,
        ListFindingsResponse response) {
      super(context, response);
    }

    private static ListFindingsPage createEmptyPage() {
      return new ListFindingsPage(null, null);
    }

    @Override
    protected ListFindingsPage createPage(
        PageContext<
                ListFindingsRequest, ListFindingsResponse, ListFindingsResponse.ListFindingsResult>
            context,
        ListFindingsResponse response) {
      return new ListFindingsPage(context, response);
    }

    @Override
    public ApiFuture<ListFindingsPage> createPageAsync(
        PageContext<
                ListFindingsRequest, ListFindingsResponse, ListFindingsResponse.ListFindingsResult>
            context,
        ApiFuture<ListFindingsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFindingsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListFindingsRequest,
          ListFindingsResponse,
          ListFindingsResponse.ListFindingsResult,
          ListFindingsPage,
          ListFindingsFixedSizeCollection> {

    private ListFindingsFixedSizeCollection(List<ListFindingsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFindingsFixedSizeCollection createEmptyCollection() {
      return new ListFindingsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFindingsFixedSizeCollection createCollection(
        List<ListFindingsPage> pages, int collectionSize) {
      return new ListFindingsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListNotificationConfigsPagedResponse
      extends AbstractPagedListResponse<
          ListNotificationConfigsRequest,
          ListNotificationConfigsResponse,
          NotificationConfig,
          ListNotificationConfigsPage,
          ListNotificationConfigsFixedSizeCollection> {

    public static ApiFuture<ListNotificationConfigsPagedResponse> createAsync(
        PageContext<
                ListNotificationConfigsRequest, ListNotificationConfigsResponse, NotificationConfig>
            context,
        ApiFuture<ListNotificationConfigsResponse> futureResponse) {
      ApiFuture<ListNotificationConfigsPage> futurePage =
          ListNotificationConfigsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListNotificationConfigsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListNotificationConfigsPagedResponse(ListNotificationConfigsPage page) {
      super(page, ListNotificationConfigsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListNotificationConfigsPage
      extends AbstractPage<
          ListNotificationConfigsRequest,
          ListNotificationConfigsResponse,
          NotificationConfig,
          ListNotificationConfigsPage> {

    private ListNotificationConfigsPage(
        PageContext<
                ListNotificationConfigsRequest, ListNotificationConfigsResponse, NotificationConfig>
            context,
        ListNotificationConfigsResponse response) {
      super(context, response);
    }

    private static ListNotificationConfigsPage createEmptyPage() {
      return new ListNotificationConfigsPage(null, null);
    }

    @Override
    protected ListNotificationConfigsPage createPage(
        PageContext<
                ListNotificationConfigsRequest, ListNotificationConfigsResponse, NotificationConfig>
            context,
        ListNotificationConfigsResponse response) {
      return new ListNotificationConfigsPage(context, response);
    }

    @Override
    public ApiFuture<ListNotificationConfigsPage> createPageAsync(
        PageContext<
                ListNotificationConfigsRequest, ListNotificationConfigsResponse, NotificationConfig>
            context,
        ApiFuture<ListNotificationConfigsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListNotificationConfigsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListNotificationConfigsRequest,
          ListNotificationConfigsResponse,
          NotificationConfig,
          ListNotificationConfigsPage,
          ListNotificationConfigsFixedSizeCollection> {

    private ListNotificationConfigsFixedSizeCollection(
        List<ListNotificationConfigsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListNotificationConfigsFixedSizeCollection createEmptyCollection() {
      return new ListNotificationConfigsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListNotificationConfigsFixedSizeCollection createCollection(
        List<ListNotificationConfigsPage> pages, int collectionSize) {
      return new ListNotificationConfigsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListSourcesPagedResponse
      extends AbstractPagedListResponse<
          ListSourcesRequest,
          ListSourcesResponse,
          Source,
          ListSourcesPage,
          ListSourcesFixedSizeCollection> {

    public static ApiFuture<ListSourcesPagedResponse> createAsync(
        PageContext<ListSourcesRequest, ListSourcesResponse, Source> context,
        ApiFuture<ListSourcesResponse> futureResponse) {
      ApiFuture<ListSourcesPage> futurePage =
          ListSourcesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new ListSourcesPagedResponse(input), MoreExecutors.directExecutor());
    }

    private ListSourcesPagedResponse(ListSourcesPage page) {
      super(page, ListSourcesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListSourcesPage
      extends AbstractPage<ListSourcesRequest, ListSourcesResponse, Source, ListSourcesPage> {

    private ListSourcesPage(
        PageContext<ListSourcesRequest, ListSourcesResponse, Source> context,
        ListSourcesResponse response) {
      super(context, response);
    }

    private static ListSourcesPage createEmptyPage() {
      return new ListSourcesPage(null, null);
    }

    @Override
    protected ListSourcesPage createPage(
        PageContext<ListSourcesRequest, ListSourcesResponse, Source> context,
        ListSourcesResponse response) {
      return new ListSourcesPage(context, response);
    }

    @Override
    public ApiFuture<ListSourcesPage> createPageAsync(
        PageContext<ListSourcesRequest, ListSourcesResponse, Source> context,
        ApiFuture<ListSourcesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListSourcesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListSourcesRequest,
          ListSourcesResponse,
          Source,
          ListSourcesPage,
          ListSourcesFixedSizeCollection> {

    private ListSourcesFixedSizeCollection(List<ListSourcesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListSourcesFixedSizeCollection createEmptyCollection() {
      return new ListSourcesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListSourcesFixedSizeCollection createCollection(
        List<ListSourcesPage> pages, int collectionSize) {
      return new ListSourcesFixedSizeCollection(pages, collectionSize);
    }
  }
}
